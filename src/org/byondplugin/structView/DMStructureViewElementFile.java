package org.byondplugin.structView;

import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.antlr.intellij.adaptor.xpath.XPath;
import org.byondplugin.DMLanguage;
import org.byondplugin.psi.DMFile;
import org.byondplugin.psi.nodes.ClassDef;
import org.byondplugin.psi.nodes.FuncDef;
import org.byondplugin.psi.nodes.VarDef;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;

public class DMStructureViewElementFile extends DMStructureViewElement {
    public DMStructureViewElementFile(PsiFile element) {
        super(element);
    }

    @NotNull
    @Override
    public ItemPresentation getPresentation() {
        return new DMPresentationFile((PsiFile)element);
    }

    @NotNull
    @Override
    public StructureViewTreeElement[] getChildren() {
        if ( element instanceof DMFile) {
            List<StructureViewTreeElement> treeElements = new SmartList<>();

            Collection<? extends PsiElement> funcs = XPath.findAll(DMLanguage.INSTANCE, element, "/start/funcdefs/funcdef");
            for (PsiElement element : funcs) {
                treeElements.add(new DMStructureViewElementFuncDef((FuncDef) element));
            }

            Collection<? extends PsiElement> classes = XPath.findAll(DMLanguage.INSTANCE, element, "/start/classdef");
            for (PsiElement element : classes) {
                treeElements.add(new DMStructureViewElementClassDef((ClassDef) element));
            }



            List<PsiElement> varPaths = new SmartList<>();
            varPaths.addAll(XPath.findAll(DMLanguage.INSTANCE, element, "/start/var_stmt/var_path"));

            while (!varPaths.isEmpty()) {
                PsiElement varPath = varPaths.remove(0);
                varPaths.addAll(0, XPath.findAll(DMLanguage.INSTANCE, varPath, "/var_path/var_path"));

                Collection<? extends PsiElement> varDefs = XPath.findAll(DMLanguage.INSTANCE, varPath, "/var_path/vardef");
                for (PsiElement element : varDefs) {
                    treeElements.add(new DMStructureViewElementVarDef((VarDef) element));
                }
            }


            return treeElements.toArray(StructureViewTreeElement.EMPTY_ARRAY);
        }
        return new StructureViewTreeElement[0];
    }

}
