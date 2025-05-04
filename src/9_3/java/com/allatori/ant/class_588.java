package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_449;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_588 implements class_449 {
    @Override // p000.class_449
    public int method_162(Object obj) {
        class_176 class_176Var = (class_176) obj;
        return class_176Var.method_464().hashCode() ^ class_176Var.method_198().hashCode();
    }

    @Override // p000.class_449
    public boolean method_161(Object obj, Object obj2) {
        class_176 class_176Var = (class_176) obj;
        class_176 class_176Var2 = (class_176) obj2;
        return class_176Var.method_198().equals(class_176Var2.method_198()) && class_176Var.method_464().equals(class_176Var2.method_464());
    }
}
