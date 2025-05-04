package com.allatori.ant;

import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_589 extends class_130 {
    public int field_2363;
    public int field_2364;

    public String method_1409() {
        return ((class_371) this.IiiIIIIiiI.method_1849(this.field_2364, (byte) 1)).method_198();
    }

    @Override // p000.class_130
    public void method_641(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.iIiiIiIiII);
        dataOutputStream.writeShort(this.field_2363);
        dataOutputStream.writeShort(this.field_2364);
    }

    public String method_2040() {
        return ((class_371) this.IiiIIIIiiI.method_1849(this.field_2363, (byte) 1)).method_198();
    }

    @Override // p000.class_130
    public String method_639() {
        return ((class_371) this.IiiIIIIiiI.method_1849(this.field_2364, (byte) 1)).method_198();
    }

    public int method_1416() {
        return this.field_2364;
    }

    public class_589(int i, int i2, int i3, class_499 class_499Var) {
        super(i, class_499Var);
        if (i == 101) {
            this.field_2363 = i2;
            this.field_2364 = i3;
            return;
        }
        throw new RuntimeException("Only element values of type enum can be built with this ctor");
    }

    public int method_1418() {
        return this.field_2363;
    }
}
