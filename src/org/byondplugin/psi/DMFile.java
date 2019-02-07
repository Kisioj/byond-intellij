package org.byondplugin.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.byondplugin.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class DMFile extends PsiFileBase {
    public DMFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, DMLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return DMFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "DM File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}