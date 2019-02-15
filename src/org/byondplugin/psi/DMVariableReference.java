package org.byondplugin.psi;

import com.intellij.psi.PsiElement;
import org.byondplugin.psi.nodes.leafs.NamePsiNode;
import org.byondplugin.psi.nodes.VarDef;
import org.jetbrains.annotations.NotNull;

public class DMVariableReference extends DMReference {
    public DMVariableReference(@NotNull NamePsiNode element) {
        super(element);
    }

    @Override
    public boolean isDefSubtree(PsiElement def) {
        return def instanceof VarDef;
    }
}
