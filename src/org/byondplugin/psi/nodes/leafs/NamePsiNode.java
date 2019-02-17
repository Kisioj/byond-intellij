package org.byondplugin.psi.nodes.leafs;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.IncorrectOperationException;
import org.antlr.intellij.adaptor.lexer.RuleIElementType;
import org.antlr.intellij.adaptor.psi.ANTLRPsiLeafNode;
import org.antlr.intellij.adaptor.psi.Trees;

import org.byondplugin.DMLanguage;
import org.byondplugin.DMParserDefinition;
import org.byondplugin.psi.*;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import static org.byondplugin.DMParser.*;

/** From doc: "Every element which can be renamed or referenced
 *             needs to implement com.intellij.psi.PsiNamedElement interface."
 *
 *  So, all leaf nodes that represent variables, functions, classes, or
 *  whatever in your plugin language must be instances of this not just
 *  LeafPsiElement.  Your ASTFactory should create this kind of object for
 *  NAME tokens. This node is for references *and* definitions because you can
 *  highlight a function and say "jump to definition". Also we want defs
 *  to be included in "find usages." Besides, there is no context information
 *  in the AST factory with which you could decide whether this node
 *  is a definition or a reference.
 *
 *  PsiNameIdentifierOwner (vs PsiNamedElement) implementations are the
 *  corresponding subtree roots that define symbols.
 *
 *  You can click on an NAME in the editor and ask for a rename for any node
 *  of this type.
 */
public class NamePsiNode extends ANTLRPsiLeafNode implements PsiNamedElement {
    public NamePsiNode(IElementType type, CharSequence text) {
        super(type, text);
    }

    @Override
    public String getName() {
        return getText();
    }

    /** Alter this node to have text specified by the argument. Do this by
     *  creating a new node through parsing of an NAME and then doing a
     *  replace.
     */
    @Override
    public PsiElement setName(@NonNls @NotNull String name) throws IncorrectOperationException {
        if ( getParent()==null ) return this; // weird but it happened once
		/*
		IElementType elType = getParent().getNode().getElementType();
		String kind = "??? ";
		if ( elType instanceof RuleIElementType ) {
			int ruleIndex = ((RuleIElementType) elType).getRuleIndex();
			if ( ruleIndex == RULE_call_expr ) {
				kind = "call ";
			}
			else if ( ruleIndex == RULE_statement ) {
				kind = "assign ";
			}
			else if ( ruleIndex == RULE_function ) {
				kind = "func def ";
			}
		}
		System.out.println("NamePsiNode.setName("+name+") on "+
			                   kind+this+" at "+Integer.toHexString(this.hashCode()));
		*/
        PsiElement newID = Trees.createLeafFromText(
                getProject(),
                DMLanguage.INSTANCE,
                getContext(),
                name,
                DMParserDefinition.NAME
        );

        if ( newID!=null ) {
            return this.replace(newID); // use replace on leaves but replaceChild on NAME nodes that are part of defs/decls.
        }
        return this;
    }

    /** Create and return a PsiReference object associated with this NAME
     *  node. The reference object will be asked to resolve this ref
     *  by using the text of this node to identify the appropriate definition
     *  site. The definition site is typically a subtree for a function
     *  or variable definition whereas this reference is just to this NAME
     *  leaf node.
     *
     *  As the AST factory has no context and cannot create different kinds
     *  of PsiNamedElement nodes according to context, every NAME node
     *  in the tree will be of this type. So, we distinguish references
     *  from definitions or other uses by looking at context in this method
     *  as we have parent (context) information.
     */
    @Override
    public PsiReference getReference() {
        PsiElement parent = getParent();
        IElementType elType = parent.getNode().getElementType();
        // do not return a reference for the NAME nodes in a definition
        if ( elType instanceof RuleIElementType ) {
            switch ( ((RuleIElementType) elType).getRuleIndex() ) {

                case RULE_var_path:
                    return new DMReferenceClass(this);

                case RULE_func_call:
                    return new DMReferenceFunction(this);

                case RULE_attribute:
                    return new DMReferenceAttribute(this);

                case RULE_method_call:
                    return new DMReferenceMethod(this);

                case RULE_value:
                    return new DMReferenceVariable(this);
            }
        }
        return null;
    }
}
