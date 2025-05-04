package com.allatori.ant;

import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_407 extends class_130 {
    public int field_1256;

    public String method_1409() {
        return ((class_371) this.IiiIIIIiiI.method_1849(this.field_1256, (byte) 1)).method_198();
    }

    public int method_1418() {
        return this.field_1256;
    }

    @Override // p000.class_130
    public void method_641(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.iIiiIiIiII);
        dataOutputStream.writeShort(this.field_1256);
    }

    @Override // p000.class_130
    public String method_639() {
        return ((class_371) this.IiiIIIIiiI.method_1849(this.field_1256, (byte) 1)).method_198();
    }

    public class_407(int i, int i2, class_499 class_499Var) {
        super(i, class_499Var);
        this.field_1256 = i2;
    }
}
