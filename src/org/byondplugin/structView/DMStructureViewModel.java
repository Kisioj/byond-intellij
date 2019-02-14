package org.byondplugin.structView;

import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.StructureViewModelBase;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.Sorter;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiFile;
import org.byondplugin.psi.DMFile;
import org.byondplugin.psi.nodes.ClassDef;
import org.byondplugin.psi.nodes.FuncDef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DMStructureViewModel
        extends StructureViewModelBase
        implements StructureViewModel.ElementInfoProvider, StructureViewModel.ExpandInfoProvider

{

    public DMStructureViewModel(@NotNull PsiFile psiFile, @Nullable Editor editor) {
        this(psiFile, editor, new DMStructureViewElementFile(psiFile));
        withSorters(Sorter.ALPHA_SORTER);
        withSuitableClasses(ClassDef.class, FuncDef.class);
    }

    public DMStructureViewModel(@NotNull PsiFile file, @Nullable Editor editor, @NotNull StructureViewTreeElement element) {
        super(file, editor, element);
    }

    @NotNull
    public Sorter[] getSorters() {
        return new Sorter[] {Sorter.ALPHA_SORTER};
    }

    @Override
    public boolean isAlwaysLeaf(StructureViewTreeElement element) {
        return !isAlwaysShowsPlus(element);
    }

    @Override
    public boolean isAlwaysShowsPlus(StructureViewTreeElement element) {
        Object value = element.getValue();
        return value instanceof DMFile || value instanceof ClassDef;
    }

    @Override
    public boolean shouldEnterElement(Object element) {
        return element instanceof ClassDef;
    }


    @Override
    public boolean isAutoExpand(@NotNull StructureViewTreeElement element) {
        return false;
    }

    @Override
    public boolean isSmartExpand() {
        return false;
    }
}
