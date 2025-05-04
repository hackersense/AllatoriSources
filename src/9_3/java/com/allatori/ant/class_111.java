package com.allatori.ant;

import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_111 extends class_476 {
    public int field_534;

    @Override // p000.class_476
    public void method_552(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.iIiIiiiiIi);
        dataOutputStream.writeShort(this.field_534);
    }

    public class_111(class_392 class_392Var, class_208 class_208Var) {
        super(99, class_208Var);
        this.field_534 = class_208Var.method_1004(class_392Var.method_198());
    }

    @Override // p000.class_476
    public String method_554() {
        return method_550();
    }

    public class_111(int i, class_208 class_208Var) {
        super(99, class_208Var);
        this.field_534 = i;
    }

    public int method_556() {
        return this.field_534;
    }

    @Override // p000.class_476
    public class_130 method_553() {
        return new class_407(this.iIiIiiiiIi, this.field_534, this.IIiIIIIiii.method_502());
    }

    public String method_550() {
        return ((class_371) method_1825().method_982(this.field_534)).method_198();
    }

    public class_111(class_407 class_407Var, class_208 class_208Var, boolean z) {
        super(99, class_208Var);
        if (z) {
            this.field_534 = class_208Var.method_1004(class_407Var.method_1409());
        } else {
            this.field_534 = class_407Var.method_1418();
        }
    }

    public void method_551(int i) {
        this.field_534 = i;
    }
}
