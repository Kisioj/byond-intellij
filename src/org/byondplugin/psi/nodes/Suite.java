package org.byondplugin.psi.nodes;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import org.antlr.intellij.adaptor.SymtabUtils;
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode;
import org.antlr.intellij.adaptor.psi.ScopeNode;
import org.byondplugin.DMLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Suite extends ANTLRPsiNode implements ScopeNode {
    public Suite(@NotNull ASTNode node) {
        super(node);
    }

    @Nullable
    @Override
    public PsiElement resolve(PsiNamedElement element) {
//		System.out.println(getClass().getSimpleName()+
//		                   ".resolve("+element.getName()+
//		                   " at "+Integer.toHexString(element.hashCode())+")");

        return SymtabUtils.resolve(
                this,
                DMLanguage.INSTANCE,
                element,
                "/suite/stmt/compound_stmt/var_stmt/var_path/vardef/NAME"
        );
    }
}
