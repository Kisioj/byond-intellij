package org.byondplugin;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.*;
import org.jetbrains.annotations.*;

import javax.swing.*;
import java.util.Map;

public class DMColorSettingsPage implements ColorSettingsPage {

    /*
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Key", DMSyntaxHighlighter.NAME),
            new AttributesDescriptor("Separator", DMSyntaxHighlighter.OPERATOR),
            new AttributesDescriptor("Value", DMSyntaxHighlighter.NUMBER),
    };
    */

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Identifier", DMSyntaxHighlighter.NAME),
            new AttributesDescriptor("Keyword", DMSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("Number", DMSyntaxHighlighter.NUMBER),
            new AttributesDescriptor("String", DMSyntaxHighlighter.STRING),
            new AttributesDescriptor("Line comment", DMSyntaxHighlighter.INLINE_COMMENT),
            new AttributesDescriptor("Block comment", DMSyntaxHighlighter.MULTILINE_COMMENT),
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return BYONDIcons.DM_FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new DMSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "/*\n" +
                "BYOND Test Code!\n" +
                "*/\n" +
                "mob\n" +
                "\tvar\n" +
                "\t\tage\n" +
                "\t\tname\n" +
                "\n" +
                "\tLogin()\n" +
                "\t\t..()\n" +
                "\t\tsrc.age = 25\n" +
                "\t\tsrc.name = \"Johny Bravo\" // very cool name\n" +
                "\t\tworld << \"Hello [src.name]\"\n" +
                "\n" +
                "\tLogout()\n" +
                "\t\t..()\n" +
                "\t\tdel(M)\n" +
                "\n" +
                "\tproc\n" +
                "\t\tGetName()\n" +
                "\t\t\treturn src.name\n";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "DM";
    }
}