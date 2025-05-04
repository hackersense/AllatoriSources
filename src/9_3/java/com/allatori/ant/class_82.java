package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_449;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_82 implements class_449 {
    public static class_82 field_337 = new class_82();

    public static class_82 method_548() {
        return field_337;
    }

    @Override // p000.class_449
    public boolean method_161(Object obj, Object obj2) {
        class_557 class_557Var = (class_557) obj;
        class_557 class_557Var2 = (class_557) obj2;
        return class_557Var.method_464().equals(class_557Var2.method_464()) && class_557Var.method_546().equals(class_557Var2.method_546());
    }

    @Override // p000.class_449
    public int method_162(Object obj) {
        class_557 class_557Var = (class_557) obj;
        return class_557Var.method_546().hashCode() ^ class_557Var.method_464().hashCode();
    }
}
