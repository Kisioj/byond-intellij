package org.byondplugin.psi.nodes;

import com.intellij.lang.ASTNode;
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode;
import org.jetbrains.annotations.NotNull;

public class FuncDefs extends ANTLRPsiNode {
    public FuncDefs(@NotNull ASTNode node) {
        super(node);
    }
}
