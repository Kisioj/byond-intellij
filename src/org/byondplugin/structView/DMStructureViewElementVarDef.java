package org.byondplugin.structView;

import com.intellij.navigation.ItemPresentation;
import org.byondplugin.psi.nodes.FuncDef;
import org.byondplugin.psi.nodes.VarDef;
import org.jetbrains.annotations.NotNull;

public class DMStructureViewElementVarDef extends DMStructureViewElement {

    public DMStructureViewElementVarDef(VarDef element) {
        super(element);
    }

    @NotNull
    @Override
    public ItemPresentation getPresentation() {
        return new DMPresentationVarDef(element.getFirstChild());
    }
}