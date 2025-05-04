package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_449;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_34 implements class_449 {
    @Override // p000.class_449
    public boolean method_161(Object obj, Object obj2) {
        class_591 class_591Var = (class_591) obj;
        class_591 class_591Var2 = (class_591) obj2;
        return class_591Var.method_198().equals(class_591Var2.method_198()) && class_591Var.method_464().equals(class_591Var2.method_464());
    }

    @Override // p000.class_449
    public int method_162(Object obj) {
        class_591 class_591Var = (class_591) obj;
        return class_591Var.method_464().hashCode() ^ class_591Var.method_198().hashCode();
    }
}
