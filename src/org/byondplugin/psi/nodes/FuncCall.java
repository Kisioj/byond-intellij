package org.byondplugin.psi.nodes;

import com.intellij.lang.ASTNode;
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode;
import org.jetbrains.annotations.NotNull;

public class FuncCall extends ANTLRPsiNode {
    public FuncCall(@NotNull ASTNode node) {
        super(node);
    }
}
