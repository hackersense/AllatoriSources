package com.allatori.ant;

import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_558 extends class_476 {
    public int field_2320;
    public int field_2321;

    public class_558(int i, int i2, class_208 class_208Var) {
        super(101, class_208Var);
        if (this.iIiIiiiiIi != 101) {
            throw new RuntimeException("Only element values of type enum can be built with this ctor");
        }
        this.field_2320 = i;
        this.field_2321 = i2;
    }

    public int method_555() {
        return this.field_2321;
    }

    public void method_1967(int i) {
        this.field_2320 = i;
    }

    public String method_550() {
        return ((class_371) method_1825().method_982(this.field_2321)).method_198();
    }

    @Override // p000.class_476
    public String method_554() {
        return ((class_371) method_1825().method_982(this.field_2321)).method_198();
    }

    public void method_551(int i) {
        this.field_2321 = i;
    }

    @Override // p000.class_476
    public void method_552(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.iIiIiiiiIi);
        dataOutputStream.writeShort(this.field_2320);
        dataOutputStream.writeShort(this.field_2321);
    }

    @Override // p000.class_476
    public class_130 method_553() {
        return new class_589(this.iIiIiiiiIi, this.field_2320, this.field_2321, this.IIiIIIIiii.method_502());
    }

    public String method_1968() {
        return ((class_371) method_1825().method_982(this.field_2320)).method_198();
    }

    public class_558(class_589 class_589Var, class_208 class_208Var, boolean z) {
        super(101, class_208Var);
        if (z) {
            this.field_2320 = class_208Var.method_1004(class_589Var.method_2040());
            this.field_2321 = class_208Var.method_1004(class_589Var.method_1409());
        } else {
            this.field_2320 = class_589Var.method_1418();
            this.field_2321 = class_589Var.method_1416();
        }
    }

    public class_558(class_392 class_392Var, String str, class_208 class_208Var) {
        super(101, class_208Var);
        this.field_2320 = class_208Var.method_1004(class_392Var.method_198());
        this.field_2321 = class_208Var.method_1004(str);
    }

    public int method_556() {
        return this.field_2320;
    }
}
