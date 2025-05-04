package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_599 extends class_160 {
    public int field_2394;

    public class_599(int i, int i2, DataInputStream dataInputStream, class_499 class_499Var) {
        this(i, i2, dataInputStream.readUnsignedShort(), class_499Var);
    }

    public class_599(class_599 class_599Var) {
        this(class_599Var.method_433(), class_599Var.method_47(), class_599Var.method_183(), class_599Var.method_502());
    }

    public class_599(int i, int i2, int i3, class_499 class_499Var) {
        super((byte) 0, i, i2, class_499Var);
        this.field_2394 = i3;
    }

    @Override // p000.class_160, p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_90(this);
    }

    public final void method_461(int i) {
        this.field_2394 = i;
    }

    public final String method_464() {
        return ((class_371) this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE.method_1849(this.field_2394, (byte) 1)).method_198();
    }

    @Override // p000.class_160
    public final void method_184(DataOutputStream dataOutputStream) {
        super.method_184(dataOutputStream);
        dataOutputStream.writeShort(this.field_2394);
    }

    @Override // p000.class_160
    public class_160 method_187(class_499 class_499Var) {
        return (class_599) clone();
    }

    public final int method_183() {
        return this.field_2394;
    }
}
