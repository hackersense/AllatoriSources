package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_233 extends class_160 {
    public int field_839;
    public int field_840;

    public final void method_853(int i) {
        this.field_840 = i;
    }

    public class_233(int i, int i2, DataInputStream dataInputStream, class_499 class_499Var) {
        this(i, i2, dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), class_499Var);
    }

    public final String method_546() {
        return ((class_371) this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE.method_1849(this.field_840, (byte) 1)).method_198();
    }

    public final int method_183() {
        return this.field_840;
    }

    public class_233(int i, int i2, int i3, int i4, class_499 class_499Var) {
        super((byte) 9, i, i2, class_499Var);
        this.field_840 = i3;
        this.field_839 = i4;
    }

    @Override // p000.class_160
    public class_160 method_187(class_499 class_499Var) {
        return (class_233) clone();
    }

    public final String method_464() {
        return ((class_371) this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE.method_1849(this.field_839, (byte) 1)).method_198();
    }

    public final int method_928() {
        return this.field_839;
    }

    public class_233(class_233 class_233Var) {
        this(class_233Var.method_433(), class_233Var.method_47(), class_233Var.method_183(), class_233Var.method_928(), class_233Var.method_502());
    }

    @Override // p000.class_160, p000.class_241
    public void method_163(class_21 class_21Var) {
        System.err.println("Visiting non-standard PMGClass object");
    }

    @Override // p000.class_160
    public final void method_184(DataOutputStream dataOutputStream) {
        super.method_184(dataOutputStream);
        dataOutputStream.writeShort(this.field_840);
        dataOutputStream.writeShort(this.field_839);
    }

    public final void method_461(int i) {
        this.field_839 = i;
    }
}
