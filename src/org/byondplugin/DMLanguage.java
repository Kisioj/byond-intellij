package org.byondplugin;

public class DMLanguage extends com.intellij.lang.Language {
    public static final DMLanguage INSTANCE = new DMLanguage();

    private DMLanguage() {
        super("DM");
    }
}