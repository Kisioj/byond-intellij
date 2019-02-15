package org.byondplugin.psi.nodes;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.tree.IElementType;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.antlr.intellij.adaptor.SymtabUtils;
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode;
import org.antlr.intellij.adaptor.psi.IdentifierDefSubtree;
import org.antlr.intellij.adaptor.psi.ScopeNode;
import org.antlr.intellij.adaptor.xpath.XPath;
import org.byondplugin.DMLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.List;

public class ClassDef extends IdentifierDefSubtree implements ScopeNode {
    public ClassDef(@NotNull ASTNode node, @NotNull IElementType idElementType) {

        super(node, idElementType);
    }

    @Nullable
    @Override
    public PsiElement resolve(PsiNamedElement element) {
        return null;
//
//        if ( element.getParent() instanceof FuncCall) {
//            return SymtabUtils.resolve(
//                    this,
//                    DMLanguage.INSTANCE,
//                    element,
//                    "/classdef/class_body/funcdefs/funcdef/NAME"
//            );
//        }
//
//
//        List<PsiElement> varPaths = new SmartList<>();
//        varPaths.addAll(XPath.findAll(DMLanguage.INSTANCE, element, "/classdef/class_body/var_stmt/var_path"));
//
//        while (!varPaths.isEmpty()) {
//            PsiElement varPath = varPaths.remove(0);
//            varPaths.addAll(0, XPath.findAll(DMLanguage.INSTANCE, varPath, "/var_path/var_path"));
//
//            PsiElement result = SymtabUtils.resolve(
//                    (ScopeNode) varPath,
//                    DMLanguage.INSTANCE,
//                    element,
//                    "/var_path/vardef"
//            );
//
//            if (result != null) {
//                return result;
//            }
//            /*
//            Collection<? extends PsiElement> varDefs = XPath.findAll(DMLanguage.INSTANCE, varPath, "/var_path/vardef");
//            for (PsiElement element : varDefs) {
//                treeElements.add(new DMStructureViewElementVarDef((VarDef) element));
//            }
//            */
//        }
//
//        return null;
    }
}
