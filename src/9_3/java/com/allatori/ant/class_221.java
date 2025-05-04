package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_221 extends class_160 {
    public byte[] field_824;

    public class_221(int i, int i2, DataInputStream dataInputStream, class_499 class_499Var) {
        this(i, i2, (byte[]) null, class_499Var);
        if (i2 <= 0) {
            return;
        }
        this.field_824 = new byte[i2];
        dataInputStream.readFully(this.field_824);
        System.err.println("Deprecated attribute with length > 0");
    }

    @Override // p000.class_160
    public class_160 method_187(class_499 class_499Var) {
        class_221 class_221Var = (class_221) clone();
        if (this.field_824 != null) {
            class_221Var.field_824 = new byte[this.field_824.length];
            System.arraycopy(this.field_824, 0, class_221Var.field_824, 0, this.field_824.length);
        }
        // THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE
        class_221Var.field_695 = class_499Var;
        return class_221Var;
    }

    @Override // p000.class_160
    public final void method_184(DataOutputStream dataOutputStream) {
        super.method_184(dataOutputStream);
        if (this.IIiIIIIiii > 0) {
            dataOutputStream.write(this.field_824, 0, this.IIiIIIIiii);
        }
    }

    public final byte[] method_429() {
        return this.field_824;
    }

    public final void method_1055(byte[] bArr) {
        this.field_824 = bArr;
    }

    public class_221(int i, int i2, byte[] bArr, class_499 class_499Var) {
        super((byte) 8, i, i2, class_499Var);
        this.field_824 = bArr;
    }

    public class_221(class_221 class_221Var) {
        this(class_221Var.method_433(), class_221Var.method_47(), class_221Var.method_429(), class_221Var.method_502());
    }

    @Override // p000.class_160, p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_75(this);
    }
}
