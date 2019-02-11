package org.byondplugin;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.*;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.ex.util.LexerEditorHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;

import com.intellij.psi.tree.IElementType;
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory;

import org.antlr.intellij.adaptor.lexer.TokenIElementType;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class DMSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];


    public static final TextAttributesKey NAME =
            createTextAttributesKey("DM_NAME", DefaultLanguageHighlighterColors.IDENTIFIER);

    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("DM_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);

    public static final TextAttributesKey BRACKET =
            createTextAttributesKey("DM_BRACKET", DefaultLanguageHighlighterColors.BRACKETS);

    public static final TextAttributesKey PARENTHESIS =
            createTextAttributesKey("DM_PARENTHESIS", DefaultLanguageHighlighterColors.PARENTHESES);

    public static final TextAttributesKey OPERATOR =
            createTextAttributesKey("DM_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);

    public static final TextAttributesKey DOT =
            createTextAttributesKey("DM_DOT", DefaultLanguageHighlighterColors.DOT);

    public static final TextAttributesKey COMMA =
            createTextAttributesKey("DM_COMMA", DefaultLanguageHighlighterColors.COMMA);

    public static final TextAttributesKey STRING =
            createTextAttributesKey("DM_STRING", DefaultLanguageHighlighterColors.STRING);

    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("DM_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);

    public static final TextAttributesKey NUMBER =
            createTextAttributesKey("DM_NUMBER", DefaultLanguageHighlighterColors.NUMBER);

    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("DM_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    /*
    static {
        PSIElementTypeFactory.defineLanguageIElementTypes(
                DMLanguage.INSTANCE,
                DMParser.tokenNames,
                DMParser.ruleNames
        );
    }
    */


    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        DMHighlightingLexer lexer = new DMHighlightingLexer(null);
        return new ANTLRLexerAdaptor(DMLanguage.INSTANCE, lexer);
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType originalTokenType) {
        if (!(originalTokenType instanceof TokenIElementType)) {
            return EMPTY_KEYS;
        }
        TokenIElementType myType = (TokenIElementType) originalTokenType;
        int tokenType = myType.getANTLRTokenType();
        TextAttributesKey attrKey;

        switch (tokenType) {
            case DMHighlightingLexer.SWITCH:
            case DMHighlightingLexer.IF:
            case DMHighlightingLexer.ELSE:
            case DMHighlightingLexer.FOR:
            case DMHighlightingLexer.WHILE:
            case DMHighlightingLexer.DO:
            case DMHighlightingLexer.BREAK:
            case DMHighlightingLexer.CONTINUE:
            case DMHighlightingLexer.IN:
            case DMHighlightingLexer.VAR:
            case DMHighlightingLexer.CONST:
            case DMHighlightingLexer.DEL:
            case DMHighlightingLexer.RETURN:
            case DMHighlightingLexer.SET:
            case DMHighlightingLexer.TO:
            case DMHighlightingLexer.AS:
            case DMHighlightingLexer.GOTO:
            case DMHighlightingLexer.NEW:
            case DMHighlightingLexer.SPAWN:
            case DMHighlightingLexer.TRY:
            case DMHighlightingLexer.CATCH:

                // BYOND not reserved keywords (but for us they will be reserved)
            case DMHighlightingLexer.VERB:
            case DMHighlightingLexer.PROC:
            case DMHighlightingLexer.GLOBAL:
            case DMHighlightingLexer.STATIC:
            case DMHighlightingLexer.ARG:
            case DMHighlightingLexer.TMP:
                attrKey = KEYWORD;
                break;

            case DMHighlightingLexer.OPEN_BRACK:
            case DMHighlightingLexer.CLOSE_BRACK:
                attrKey = BRACKET;
                break;

            case DMHighlightingLexer.OPEN_PAREN:
            case DMHighlightingLexer.CLOSE_PAREN:
                attrKey = PARENTHESIS;
                break;

            case DMHighlightingLexer.DOT:
                attrKey = DOT;
                break;
            case DMHighlightingLexer.COMMA:
                attrKey = COMMA;
                break;

            case DMHighlightingLexer.DOUBLE_DOT:
            case DMHighlightingLexer.STAR:
            case DMHighlightingLexer.PERCENT:
            case DMHighlightingLexer.SLASH:
            case DMHighlightingLexer.COLON:
            case DMHighlightingLexer.QUESTION_MARK:
            case DMHighlightingLexer.NOT_OP:
            case DMHighlightingLexer.NEG_OP:
            case DMHighlightingLexer.MINUS:
            case DMHighlightingLexer.PLUS:
            case DMHighlightingLexer.INCREMENT:
            case DMHighlightingLexer.DECREMENT:
            case DMHighlightingLexer.POWER:
            case DMHighlightingLexer.LESS_THAN:
            case DMHighlightingLexer.GREATER_THAN:
            case DMHighlightingLexer.LESS_THAN_OR_EQUAL:
            case DMHighlightingLexer.GREATER_THAN_OR_EQUAL:
            case DMHighlightingLexer.SHIFT_LEFT:
            case DMHighlightingLexer.SHIFT_RIGHT:
            case DMHighlightingLexer.EQUAL:
            case DMHighlightingLexer.NOT_EQUAL:
            case DMHighlightingLexer.NOT_EQUAL_2:
            case DMHighlightingLexer.BIT_AND:
            case DMHighlightingLexer.BIT_OR:
            case DMHighlightingLexer.BIT_XOR:
            case DMHighlightingLexer.LOG_AND:
            case DMHighlightingLexer.LOG_OR:
            case DMHighlightingLexer.ASSIGN:
            case DMHighlightingLexer.ADD_ASSIGN:
            case DMHighlightingLexer.SUB_ASSIGN:
            case DMHighlightingLexer.MULT_ASSIGN:
            case DMHighlightingLexer.DIV_ASSIGN:
            case DMHighlightingLexer.MOD_ASSIGN:
            case DMHighlightingLexer.BIT_AND_ASSIGN:
            case DMHighlightingLexer.BIT_OR_ASSIGN:
            case DMHighlightingLexer.XOR_ASSIGN:
            case DMHighlightingLexer.LEFT_SHIFT_ASSIGN:
            case DMHighlightingLexer.RIGHT_SHIFT_ASSIGN:
                attrKey = OPERATOR;
                break;

            case DMHighlightingLexer.NAME:
                attrKey = NAME;
                break;

            case DMHighlightingLexer.STRING_LITERAL:
            case DMHighlightingLexer.ICON_PATH:
                attrKey = STRING;
                break;

            case DMHighlightingLexer.NUMBER:
                attrKey = NUMBER;
                break;

            case DMHighlightingLexer.COMMENT:
                attrKey = COMMENT;
                break;

            default:
                return EMPTY_KEYS;

        }
        return new TextAttributesKey[]{attrKey};
    }
}