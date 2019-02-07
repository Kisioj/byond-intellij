package org.byondplugin;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.*;
import com.intellij.openapi.editor.colors.TextAttributesKey;
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
        DMLexer lexer = new DMLexer(null);
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
            case DMLexer.SWITCH:
            case DMLexer.IF:
            case DMLexer.ELSE:
            case DMLexer.FOR:
            case DMLexer.WHILE:
            case DMLexer.DO:
            case DMLexer.BREAK:
            case DMLexer.CONTINUE:
            case DMLexer.IN:
            case DMLexer.VAR:
            case DMLexer.CONST:
            case DMLexer.DEL:
            case DMLexer.RETURN:
            case DMLexer.SET:
            case DMLexer.TO:
            case DMLexer.AS:
            case DMLexer.GOTO:
            case DMLexer.NEW:
            case DMLexer.SPAWN:
            case DMLexer.TRY:
            case DMLexer.CATCH:

                // BYOND not reserved keywords (but for us they will be reserved)
            case DMLexer.VERB:
            case DMLexer.PROC:
            case DMLexer.GLOBAL:
            case DMLexer.STATIC:
            case DMLexer.ARG:
            case DMLexer.TMP:
                attrKey = KEYWORD;
                break;

            case DMLexer.OPEN_BRACK:
            case DMLexer.CLOSE_BRACK:
                attrKey = BRACKET;
                break;

            case DMLexer.OPEN_PAREN:
            case DMLexer.CLOSE_PAREN:
                attrKey = PARENTHESIS;
                break;

            case DMLexer.DOT:
                attrKey = DOT;
                break;
            case DMLexer.COMMA:
                attrKey = COMMA;
                break;

            case DMLexer.DOUBLE_DOT:
            case DMLexer.STAR:
            case DMLexer.PERCENT:
            case DMLexer.SLASH:
            case DMLexer.COLON:
            case DMLexer.QUESTION_MARK:
            case DMLexer.NOT_OP:
            case DMLexer.NEG_OP:
            case DMLexer.MINUS:
            case DMLexer.PLUS:
            case DMLexer.INCREMENT:
            case DMLexer.DECREMENT:
            case DMLexer.POWER:
            case DMLexer.LESS_THAN:
            case DMLexer.GREATER_THAN:
            case DMLexer.LESS_THAN_OR_EQUAL:
            case DMLexer.GREATER_THAN_OR_EQUAL:
            case DMLexer.SHIFT_LEFT:
            case DMLexer.SHIFT_RIGHT:
            case DMLexer.EQUAL:
            case DMLexer.NOT_EQUAL:
            case DMLexer.NOT_EQUAL_2:
            case DMLexer.BIT_AND:
            case DMLexer.BIT_OR:
            case DMLexer.BIT_XOR:
            case DMLexer.LOG_AND:
            case DMLexer.LOG_OR:
            case DMLexer.ASSIGN:
            case DMLexer.ADD_ASSIGN:
            case DMLexer.SUB_ASSIGN:
            case DMLexer.MULT_ASSIGN:
            case DMLexer.DIV_ASSIGN:
            case DMLexer.MOD_ASSIGN:
            case DMLexer.BIT_AND_ASSIGN:
            case DMLexer.BIT_OR_ASSIGN:
            case DMLexer.XOR_ASSIGN:
            case DMLexer.LEFT_SHIFT_ASSIGN:
            case DMLexer.RIGHT_SHIFT_ASSIGN:
                attrKey = OPERATOR;
                break;

            case DMLexer.NAME:
                attrKey = NAME;
                break;

            case DMLexer.STRING_LITERAL:
            case DMLexer.ICON_PATH:
                attrKey = STRING;
                break;

            case DMLexer.NUMBER:
                attrKey = NUMBER;
                break;

            case DMLexer.COMMENT:
                attrKey = COMMENT;
                break;

            default:
                return EMPTY_KEYS;
        }
        return new TextAttributesKey[]{attrKey};
    }
}