package org.byondplugin.structView;

import com.intellij.navigation.ItemPresentation;
import org.byondplugin.psi.nodes.FuncDef;
import org.byondplugin.psi.nodes.VarDef;
import org.jetbrains.annotations.NotNull;

public class DMStructureViewElementFieldDef extends DMStructureViewElement {

    public DMStructureViewElementFieldDef(VarDef element) {
        super(element);
    }

    @NotNull
    @Override
    public ItemPresentation getPresentation() {
        return new DMPresentationFieldDef(element.getFirstChild());
    }
}