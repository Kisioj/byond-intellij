package org.byondplugin.psi.nodes;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode;
import org.antlr.intellij.adaptor.psi.ScopeNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class VarPath extends ANTLRPsiNode implements ScopeNode {
    public VarPath(@NotNull ASTNode node) {
        super(node);
    }

    @Nullable
    @Override
    public PsiElement resolve(PsiNamedElement psiNamedElement) {
        return null;
    }
}
