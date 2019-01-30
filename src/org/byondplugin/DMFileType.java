package org.byondplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.*;

import javax.swing.*;

public class DMFileType extends LanguageFileType {
    public static final DMFileType INSTANCE = new DMFileType();

    private DMFileType() {
        super(DMLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return DMLanguage.INSTANCE.getDisplayName() + " file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return DMLanguage.INSTANCE.getDisplayName() + " language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "dm";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return BYONDIcons.DM_FILE;
    }
}