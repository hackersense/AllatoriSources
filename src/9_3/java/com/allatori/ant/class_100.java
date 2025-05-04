package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_449;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_100 implements class_449 {
    @Override // p000.class_449
    public boolean method_161(Object obj, Object obj2) {
        class_261 class_261Var = (class_261) obj;
        class_261 class_261Var2 = (class_261) obj2;
        return class_261Var.method_464().equals(class_261Var2.method_464()) && class_261Var.method_546().equals(class_261Var2.method_546());
    }

    @Override // p000.class_449
    public int method_162(Object obj) {
        class_261 class_261Var = (class_261) obj;
        return class_261Var.method_546().hashCode() ^ class_261Var.method_464().hashCode();
    }
}
