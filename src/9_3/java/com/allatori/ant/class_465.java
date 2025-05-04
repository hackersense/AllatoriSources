package com.allatori.ant;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_465 extends class_164 {
    public boolean field_1809 = false;
    public class_499 field_1810;
    public class_440 field_1811;

    public class_465(class_440 class_440Var) {
        this.field_1811 = class_440Var;
        this.field_1810 = this.field_1811.method_502();
        new class_299(this.field_1811, this).method_1078();
    }

    @Override // p000.class_164, p000.class_21
    public void method_72(class_43 class_43Var) {
        class_286 method_982 = this.field_1810.method_982(class_43Var.method_47());
        if (!(method_982 instanceof class_371) || !((class_371) method_982).method_198().startsWith(this.field_1811.method_546().replace('.', '/') + "$")) {
            return;
        }
        this.field_1809 = true;
    }

    public boolean method_1754() {
        return this.field_1809;
    }
}
