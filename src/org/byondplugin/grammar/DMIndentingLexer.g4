lexer grammar DMIndentingLexer;
import CommonLexerRules;


@lexer::members {
    private java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();
    private boolean reachedEOF = false;
    private int indent = 0;
    private int opened = 0;

    @Override
    public void reset() {
        super.reset();

        tokens.clear();
        reachedEOF = false;
        indent = 0;
        opened = 0;
    }

    @Override
    public void emit(Token token) {
        super.setToken(token);
        tokens.offer(token);
    }

    @Override
    public Token nextToken() {

        if (this.reachedEOF) {
            return tokens.poll();
        }

        if (_input.LA(1) == DMParser.EOF && this.indent > 0) {

            this.reachedEOF = true;

            CommonToken ct = commonToken(NEWLINE);
            ct.setText("<NEWLINE - EOF>");
            this.emit(ct);

            while (this.indent > 0) {
                ct = commonToken(DMParser.DEDENT);
                ct.setText("<DEDENT - EOF>");
                this.emit(ct);
                this.indent--;
            }

            this.emit(commonToken(DMParser.EOF));
        }

        Token next = super.nextToken();
        return tokens.isEmpty() ? next : tokens.poll();
    }

    private void emitHiddenToken(String text) {
        int start =  this.getCharIndex();
        int stop = start + text.length() - 1;
        CommonToken token =  new CommonToken(this._tokenFactorySourcePair, NEWLINE, HIDDEN, start, stop);
        emit(token);
    }

    private CommonToken commonToken(int type, String text, int start) {
        int stop = start + text.length() - 1;
        return new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
    }

    private CommonToken commonToken(int type) {
        int start =  this.getCharIndex();
        int stop = start - 1;
        CommonToken token = new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
        return token;
    }

    boolean atStartOfInput() {
        return super.getCharPositionInLine() == 0 && super.getLine() == 1;
    }
}


tokens { INDENT, DEDENT }

OPEN_BRACK : '[' {opened++;};
CLOSE_BRACK : ']' {opened--;};
OPEN_PAREN : '(' {opened++;};
CLOSE_PAREN : ')' {opened--;};

NEWLINE
 : ( {atStartOfInput()}?   SPACES
   | ( '\r'? '\n' | '\r' | '\f' ) SPACES?
   )
    {
        String newLine = getText().replaceAll("[^\r\n\f]+", "");
        String spaces = getText().replaceAll("[\r\n\f]+", "");
        CommonToken ct;

        int next = _input.LA(1);
        if (opened > 0 || next == '\r' || next == '\n' || next == '\f' || next == DMParser.EOF) {
            ct = commonToken(SPACES, getText(), this._tokenStartCharIndex);
            ct.setLine(this._tokenStartLine);
            ct.setCharPositionInLine(this._tokenStartCharPositionInLine);
            ct.setChannel(HIDDEN);
            ct.setText("<SPACESx>");
            emit(ct);

        } else if (next == '/' ) {
            next = _input.LA(2);
            if (next == '/' || next == '*') {
                ct = commonToken(SPACES, getText(), this._tokenStartCharIndex);
                ct.setLine(this._tokenStartLine);
                ct.setCharPositionInLine(this._tokenStartCharPositionInLine);
                ct.setChannel(HIDDEN);
                emit(ct);
            }
        }
        else {
            int startIndex = this._tokenStartCharIndex;
            int startIndexSpaces = startIndex + newLine.length();

            ct = commonToken(NEWLINE, newLine, startIndex);
            ct.setLine(this._tokenStartLine);
            ct.setCharPositionInLine(this._tokenStartCharPositionInLine);
            ct.setText("<NEWLINEz>");
            emit(ct);


            int ws_count = spaces.length();

            if (ws_count == this.indent) {
                ct = commonToken(SPACES, spaces, startIndexSpaces);
                ct.setText("<SPACES>");
                ct.setCharPositionInLine(0);
                ct.setChannel(HIDDEN);
                emit(ct);

            } else if (ws_count > this.indent) {
                for(int i=0; i < (ws_count-this.indent); ++i) {
                    ct = commonToken(DMParser.INDENT, spaces, startIndexSpaces + i);
                    ct.setText("<INDENT>");
                    ct.setCharPositionInLine(0);
                    emit(ct);
                }
                this.indent = ws_count;

            } else {
                for(int i=0; i < (this.indent-ws_count); ++i) {
                    ct = commonToken(DMParser.DEDENT, spaces, startIndexSpaces);
                    ct.setText("<DEDENT>");
                    ct.setCharPositionInLine(0);
                    emit(ct);
                }
                this.indent = ws_count;

            }

        }

    }
 ;


