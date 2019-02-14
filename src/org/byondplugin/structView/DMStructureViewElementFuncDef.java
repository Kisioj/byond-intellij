package org.byondplugin.structView;

import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import org.byondplugin.psi.nodes.FuncDef;
import org.jetbrains.annotations.NotNull;

public class DMStructureViewElementFuncDef extends DMStructureViewElement {

    public DMStructureViewElementFuncDef(FuncDef element) {
        super(element);
    }

    @NotNull
    @Override
    public ItemPresentation getPresentation() {
        return new DMPresentationFuncDef(element.getFirstChild());
    }
}