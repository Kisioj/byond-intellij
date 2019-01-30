package org.byondplugin.psi;

import com.intellij.psi.tree.IElementType;
import org.byondplugin.DMLanguage;
import org.jetbrains.annotations.*;

public class DMElementType extends IElementType {
    public DMElementType(@NotNull @NonNls String debugName) {
        super(debugName, DMLanguage.INSTANCE);
    }
}
