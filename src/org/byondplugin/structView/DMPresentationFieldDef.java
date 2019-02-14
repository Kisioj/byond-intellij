package org.byondplugin.structView;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.util.PlatformIcons;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class DMPresentationFieldDef implements ItemPresentation {
    protected final PsiElement element;

    protected DMPresentationFieldDef(PsiElement element) {
        this.element = element;
    }

    @Nullable
    @Override
    public Icon getIcon(boolean unused) {
        return PlatformIcons.FILE_ICON;
    }

    @Nullable
    @Override
    public String getPresentableText() {
        ASTNode node = element.getNode();
        return node.getText();
    }

    @Nullable
    @Override
    public String getLocationString() {
        return null;
    }
}
