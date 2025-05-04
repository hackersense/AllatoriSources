package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_518 extends class_160 {
    public int field_1986;
    public int field_1987;

    public final int method_183() {
        return this.field_1986;
    }

    public class_518(int i, int i2, int i3, int i4, class_499 class_499Var) {
        super((byte) 18, i, i2, class_499Var);
        this.field_1987 = i3;
        this.field_1986 = i4;
    }

    public final class_538 method_1869() {
        if (this.field_1986 == 0) {
            return null;
        }
        return (class_538) this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE.method_1849(this.field_1986, (byte) 12);
    }

    public final void method_461(int i) {
        this.field_1986 = i;
    }

    @Override // p000.class_160
    public class_160 method_187(class_499 class_499Var) {
        throw new RuntimeException("Not implemented yet!");
    }

    public final class_43 method_979() {
        return (class_43) this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE.method_1849(this.field_1987, (byte) 7);
    }

    public final int method_928() {
        return this.field_1987;
    }

    public final void method_853(int i) {
        this.field_1987 = i;
    }

    @Override // p000.class_160
    public final void method_184(DataOutputStream dataOutputStream) {
        super.method_184(dataOutputStream);
        dataOutputStream.writeShort(this.field_1987);
        dataOutputStream.writeShort(this.field_1986);
    }

    @Override // p000.class_160, p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_60(this);
    }

    public class_518(int i, int i2, DataInputStream dataInputStream, class_499 class_499Var) {
        this(i, i2, dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), class_499Var);
    }
}
