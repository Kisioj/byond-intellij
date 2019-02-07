package org.byondplugin.ide;

import com.intellij.lang.Language;
import com.intellij.psi.codeStyle.CommonCodeStyleSettings;
import com.intellij.psi.codeStyle.LanguageCodeStyleSettingsProvider;
import org.byondplugin.DMLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DMCodeStyleSettingsProvider extends LanguageCodeStyleSettingsProvider {
    @NotNull
    @Override
    public Language getLanguage() {
        return DMLanguage.INSTANCE;
    }

    @Nullable
    @Override
    public String getCodeSample(@NotNull SettingsType settingsType) {
        return "";
    }

    @Override
    public CommonCodeStyleSettings getDefaultCommonSettings() {
        CommonCodeStyleSettings defaultSettings = new CommonCodeStyleSettings( getLanguage() );
        CommonCodeStyleSettings.IndentOptions indentOptions = defaultSettings.initIndentOptions();
        indentOptions.INDENT_SIZE = 4;
        indentOptions.CONTINUATION_INDENT_SIZE = 8;
        indentOptions.TAB_SIZE = 4;
        indentOptions.USE_TAB_CHARACTER = true;

        defaultSettings.LINE_COMMENT_AT_FIRST_COLUMN = false;
        defaultSettings.KEEP_FIRST_COLUMN_COMMENT = false;

        return defaultSettings;
    }
}
