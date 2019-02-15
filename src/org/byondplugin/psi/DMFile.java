package org.byondplugin.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import org.antlr.intellij.adaptor.SymtabUtils;
import org.antlr.intellij.adaptor.psi.ScopeNode;
import org.byondplugin.DMFileType;
import org.byondplugin.DMLanguage;
import org.byondplugin.psi.nodes.FuncCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


import javax.swing.*;


public class DMFile extends PsiFileBase implements ScopeNode {
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

    /** Return null since a file scope has no enclosing scope. It is
     *  not itself in a scope.
     */
    @Override
    public ScopeNode getContext() {
        return null;
    }

    @Nullable
    @Override
    public PsiElement resolve(PsiNamedElement element) {
//		System.out.println(getClass().getSimpleName()+
//		                   ".resolve("+element.getName()+
//		                   " at "+Integer.toHexString(element.hashCode())+")");


        if ( element.getParent() instanceof FuncCall) {
            return SymtabUtils.resolve(
                    this,
                    DMLanguage.INSTANCE,
                    element,
                    "/start/funcdefs/funcdef/NAME"
            );
        }


        return null;

        /*
        return SymtabUtils.resolve(
                this,
                DMLanguage.INSTANCE,
                element,
                "/start/var_stmt/var_path/vardef"
        );
        */
    }
}
