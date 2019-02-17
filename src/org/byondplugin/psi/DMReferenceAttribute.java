package org.byondplugin.psi;

import com.intellij.psi.PsiElement;
import org.byondplugin.psi.nodes.Attribute;
import org.byondplugin.psi.nodes.VarDef;
import org.byondplugin.psi.nodes.leafs.NamePsiNode;
import org.jetbrains.annotations.NotNull;

public class DMReferenceAttribute extends DMReference {
    public DMReferenceAttribute(@NotNull NamePsiNode element) {
        super(element);
    }

    @Override
    public boolean isDefSubtree(PsiElement def) {
        return def instanceof Attribute;
    }
}
