package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_548 extends class_160 {
    public int field_2061;
    public class_420[] field_2062;

    public class_548(byte b, int i, int i2, class_420[] class_420VarArr, class_499 class_499Var) {
        super(b, i, i2, class_499Var);
        method_1943(class_420VarArr);
    }

    public final class_420[] method_1945() {
        return this.field_2062;
    }

    @Override // p000.class_160
    public final void method_184(DataOutputStream dataOutputStream) {
        super.method_184(dataOutputStream);
        method_1867(dataOutputStream);
    }

    @Override // p000.class_160, p000.class_241
    public void method_163(class_21 class_21Var) {
    }

    public class_420[] method_1944() {
        return this.field_2062;
    }

    public final int method_183() {
        return this.field_2061;
    }

    public final void method_1943(class_420[] class_420VarArr) {
        this.field_2062 = class_420VarArr;
        this.field_2061 = class_420VarArr == null ? 0 : class_420VarArr.length;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x001a */
    public class_548(byte b, int i, int i2, DataInputStream dataInputStream, class_499 class_499Var, boolean z) {
        this(b, i, i2, (class_420[]) null, class_499Var);
        this.field_2061 = dataInputStream.readUnsignedByte();
        this.field_2062 = new class_420[this.field_2061];
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i3 < this.field_2061) {
                i3 = i4 + 1;
                this.field_2062[i4] = new class_420(dataInputStream, class_499Var, z);
            } else {
                return;
            }
        }
    }

    public void method_1867(DataOutputStream dataOutputStream) {
        if (this.field_2062 == null) {
            return;
        }
        dataOutputStream.writeByte(this.field_2062.length);
        int i = 0;
        int i2 = 0;
        while (i < this.field_2062.length) {
            class_78[] method_1560 = this.field_2062[i2].method_1560();
            dataOutputStream.writeShort(method_1560.length);
            int i3 = 0;
            int i4 = 0;
            while (i3 < method_1560.length) {
                int i5 = i4 + 1;
                method_1560[i4].method_184(dataOutputStream);
                i3 = i5;
                i4 = i5;
            }
            int i6 = i2 + 1;
            i = i6;
            i2 = i6;
        }
    }
}
