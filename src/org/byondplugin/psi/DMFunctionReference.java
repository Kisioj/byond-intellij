package org.byondplugin.psi;

import com.intellij.psi.PsiElement;
import org.byondplugin.psi.nodes.FuncDef;
import org.byondplugin.psi.nodes.leafs.NamePsiNode;
import org.jetbrains.annotations.NotNull;

/** A reference object associated with (referring to) a IdentifierPSINode
 *  underneath a call_expr rule subtree root.
 */
public class DMFunctionReference extends DMReference {
    public DMFunctionReference(@NotNull NamePsiNode element) {
        super(element);
    }

    @Override
    public boolean isDefSubtree(PsiElement def) {
        return def instanceof FuncDef;
    }
}
