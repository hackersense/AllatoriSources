package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_569 extends class_160 {
    public byte[] field_2336;

    @Override // p000.class_160
    public class_160 method_187(class_499 class_499Var) {
        class_569 class_569Var = (class_569) clone();
        if (this.field_2336 != null) {
            class_569Var.field_2336 = new byte[this.field_2336.length];
            System.arraycopy(this.field_2336, 0, class_569Var.field_2336, 0, this.field_2336.length);
        }
        class_569Var.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE = class_499Var;
        return class_569Var;
    }

    public class_569(class_569 class_569Var) {
        this(class_569Var.method_433(), class_569Var.method_47(), class_569Var.method_429(), class_569Var.method_502());
    }

    public class_569(int i, int i2, DataInputStream dataInputStream, class_499 class_499Var) {
        this(i, i2, (byte[]) null, class_499Var);
        if (i2 <= 0) {
            return;
        }
        this.field_2336 = new byte[i2];
        dataInputStream.readFully(this.field_2336);
        System.err.println("Synthetic attribute with length > 0");
    }

    public final byte[] method_429() {
        return this.field_2336;
    }

    @Override // p000.class_160
    public final void method_184(DataOutputStream dataOutputStream) {
        super.method_184(dataOutputStream);
        if (this.IIiIIIIiii > 0) {
            dataOutputStream.write(this.field_2336, 0, this.IIiIIIIiii);
        }
    }

    @Override // p000.class_160, p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_80(this);
    }

    public class_569(int i, int i2, byte[] bArr, class_499 class_499Var) {
        super((byte) 7, i, i2, class_499Var);
        this.field_2336 = bArr;
    }

    public final void method_1055(byte[] bArr) {
        this.field_2336 = bArr;
    }
}
