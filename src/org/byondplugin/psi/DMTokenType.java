package org.byondplugin.psi;

import com.intellij.psi.tree.IElementType;
import org.byondplugin.DMLanguage;
import org.jetbrains.annotations.*;

public class DMTokenType extends IElementType {
    public DMTokenType(@NotNull @NonNls String debugName) {
        super(debugName, DMLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "DMTokenType." + super.toString();
    }
}
