package org.byondplugin.structView;

import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import org.antlr.intellij.adaptor.xpath.XPath;
import org.byondplugin.DMLanguage;
import org.byondplugin.psi.nodes.ClassDef;
import org.byondplugin.psi.nodes.FuncDef;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Optional;

public class DMStructureViewElementMethodDef extends DMStructureViewElement {

    public DMStructureViewElementMethodDef(FuncDef element) {
        super(element);
    }

    @NotNull
    @Override
    public ItemPresentation getPresentation() {
        return new DMPresentationMethodDef(element.getFirstChild());
    }
}