package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_205 extends class_160 {
    public int field_770;

    public final void method_461(int i) {
        this.field_770 = i;
    }

    @Override // p000.class_160, p000.class_241
    public void method_163(class_21 class_21Var) {
    }

    @Override // p000.class_160
    public class_160 method_187(class_499 class_499Var) {
        return (class_205) clone();
    }

    public class_205(class_205 class_205Var) {
        this(class_205Var.method_433(), class_205Var.method_47(), class_205Var.method_183(), class_205Var.method_502());
    }

    public class_205(int i, int i2, int i3, class_499 class_499Var) {
        super(ASMInterface.field_1511, i, i2, class_499Var);
        this.field_770 = i3;
    }

    public class_205(int i, int i2, DataInputStream dataInputStream, class_499 class_499Var) throws IOException {
        this(i, i2, dataInputStream.readUnsignedShort(), class_499Var);
    }

    @Override // p000.class_160
    public final void method_184(DataOutputStream dataOutputStream) throws IOException {
        super.method_184(dataOutputStream);
        dataOutputStream.writeShort(this.field_770);
    }

    public final class_43 method_979() {
        return (class_43) this.field_695.method_1849(this.field_770, (byte) 7);
    }

    public final int method_183() {
        return this.field_770;
    }
}
