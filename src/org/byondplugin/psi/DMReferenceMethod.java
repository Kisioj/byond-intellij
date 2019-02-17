package org.byondplugin.psi;

import com.intellij.psi.PsiElement;
import org.byondplugin.psi.nodes.MethodCall;
import org.byondplugin.psi.nodes.VarDef;
import org.byondplugin.psi.nodes.leafs.NamePsiNode;
import org.jetbrains.annotations.NotNull;

public class DMReferenceMethod extends DMReference {
    public DMReferenceMethod(@NotNull NamePsiNode element) {
        super(element);
    }

    @Override
    public boolean isDefSubtree(PsiElement def) {
        return def instanceof MethodCall;
    }
}
