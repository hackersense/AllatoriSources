package com.allatori.ant;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Platform;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_311 extends PropertyTester {
    public static final String field_1092 = "isEnabled";

    public boolean method_1361(Object obj, String str, Object[] objArr, Object obj2) {
        IProject iProject;
        if (!"isEnabled".equals(str) || (iProject = (IProject) Platform.getAdapterManager().getAdapter(obj, IProject.class)) == null) {
            return false;
        }
        return class_312.method_1364(iProject);
    }
}
