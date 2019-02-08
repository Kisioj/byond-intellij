package org.byondplugin;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.ex.util.LexerEditorHighlighter;
import com.intellij.openapi.editor.ex.util.SegmentArrayWithData;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.intellij.adaptor.lexer.RuleIElementType;
import org.antlr.intellij.adaptor.lexer.TokenIElementType;
import org.antlr.intellij.adaptor.parser.ANTLRParserAdaptor;
import org.antlr.intellij.adaptor.psi.ANTLRPsiLeafNode;
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.byondplugin.psi.DMFile;
import org.byondplugin.psi.nodes.*;
import org.jetbrains.annotations.NotNull;

public class DMParserDefinition implements ParserDefinition {
    public static final IFileElementType FILE = new IFileElementType(DMLanguage.INSTANCE);

    static {
        PSIElementTypeFactory.defineLanguageIElementTypes(
                DMLanguage.INSTANCE,
                DMParser.tokenNames,
                DMParser.ruleNames
        );
    }

    public static final TokenSet COMMENTS =
            PSIElementTypeFactory.createTokenSet(
                    DMLanguage.INSTANCE,
                    DMLexer.COMMENT
            );

    public static final TokenSet WHITE_SPACES =
            PSIElementTypeFactory.createTokenSet(
                    DMLanguage.INSTANCE,
                    DMLexer.SPACES
            );

    public static final TokenSet STRING_LITERALS =
            PSIElementTypeFactory.createTokenSet(
                    DMLanguage.INSTANCE,
                    DMLexer.STRING_LITERAL,
                    DMLexer.ICON_PATH
            );

    @NotNull
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    public TokenSet getStringLiteralElements() {
        return STRING_LITERALS;
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    public PsiFile createFile(FileViewProvider viewProvider) {
        return new DMFile(viewProvider);
    }

    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }


    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        DMLexer lexer = new DMLexer(null);
        return new ANTLRLexerAdaptor(DMLanguage.INSTANCE, lexer);
    }

    @NotNull
    public PsiParser createParser(final Project project) {
        DMParser parser = new DMParser(null);
        return new ANTLRParserAdaptor(DMLanguage.INSTANCE, parser) {
            @Override
            protected ParseTree parse(Parser parser, IElementType iElementType) {
                return ((DMParser) parser).start();
            }
        };
    }

    @NotNull
    public PsiElement createElement(ASTNode node) {

        IElementType elType = node.getElementType();
        if ( elType instanceof TokenIElementType) {
            return new ANTLRPsiLeafNode(elType,node.getText());
        }

        if ( !(elType instanceof RuleIElementType) ) {
            return new ANTLRPsiNode(node);
        }

        //return new ANTLRPsiNode(node);

        RuleIElementType ruleElType = (RuleIElementType) elType;
        switch ( ruleElType.getRuleIndex() ) {
            case DMParser.RULE_var_stmt:
                return new VarStmt(node);
            case DMParser.RULE_var_path:
                return new VarPath(node);
            case DMParser.RULE_vardef:
                return new VarDef(node);
            case DMParser.RULE_inline_var_stmt:
                return new InlineVarStmt(node);
            case DMParser.RULE_inline_var_path:
                return new InlineVarPath(node);
            case DMParser.RULE_classdef:
                return new ClassDef(node);
            case DMParser.RULE_class_body:
                return new ClassBody(node);
            case DMParser.RULE_funcdefs:
                return new FuncDefs(node);
            case DMParser.RULE_func_type:
                return new FuncType(node);
            case DMParser.RULE_funcdef:
                return new FuncDef(node);
            case DMParser.RULE_parameters:
                return new Parameters(node);
            case DMParser.RULE_parameter:
                return new Parameter(node);
            case DMParser.RULE_suite:
                return new Suite(node);
            case DMParser.RULE_stmt:
                return new Stmt(node);
            case DMParser.RULE_simple_stmt:
                return new SimpleStmt(node);
            case DMParser.RULE_small_stmt:
                return new SmallStmt(node);
            case DMParser.RULE_set_stmt:
                return new SetStmt(node);
            case DMParser.RULE_del_stmt:
                return new DelStmt(node);
            case DMParser.RULE_flow_stmt:
                return new FlowStmt(node);
            case DMParser.RULE_compound_stmt:
                return new CompoundStmt(node);
            case DMParser.RULE_if_stmt:
                return new IfStmt(node);
            case DMParser.RULE_dowhile_stmt:
                return new DoWhileStmt(node);
            case DMParser.RULE_while_stmt:
                return new WhileStmt(node);
            case DMParser.RULE_spawn_stmt:
                return new SpawnStmt(node);
            case DMParser.RULE_for_stmt:
                return new ForStmt(node);
            case DMParser.RULE_foreach_stmt:
                return new ForeachStmt(node);
            case DMParser.RULE_break_stmt:
                return new BreakStmt(node);
            case DMParser.RULE_continue_stmt:
                return new ContinueStmt(node);
            case DMParser.RULE_return_stmt:
                return new ReturnStmt(node);
            case DMParser.RULE_expr:
                return new Expr(node);
            case DMParser.RULE_trailer:
                return new Trailer(node);
            case DMParser.RULE_arglist:
                return new ArgList(node);
            case DMParser.RULE_value:
                return new Value(node);
            case DMParser.RULE_new_stmt:
                return new NewStmt(node);
            case DMParser.RULE_path:
                return new Path(node);
            case DMParser.RULE_name:
                return new Name(node);
            default:
                return new ANTLRPsiNode(node);
        }

    }
}