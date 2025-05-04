package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_224 extends class_160 {
    public int[] field_825;
    public int field_826;

    public class_224(class_224 class_224Var) {
        this(class_224Var.method_433(), class_224Var.method_47(), class_224Var.method_434(), class_224Var.method_502());
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0007 */
    public final String[] method_643() {
        String[] strArr = new String[this.field_826];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i < this.field_826) {
                i = i2 + 1;
                strArr[i2] = this.method_502().method_1845(this.field_825[i2], (byte) 7).replace('/', '.');
            } else {
                return strArr;
            }
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x000b */
    @Override // p000.class_160
    public final void method_184(DataOutputStream dataOutputStream) {
        int i = 0;
        super.method_184(dataOutputStream);
        dataOutputStream.writeShort(this.field_826);
        while (true) {
            int i2 = i;
            if (i < this.field_826) {
                i = i2 + 1;
                dataOutputStream.writeShort(this.field_825[i2]);
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0015 */
    public class_224(int i, int i2, DataInputStream dataInputStream, class_499 class_499Var) {
        this(i, i2, (int[]) null, class_499Var);
        int i3 = 0;
        this.field_826 = dataInputStream.readUnsignedShort();
        this.field_825 = new int[this.field_826];
        while (true) {
            int i4 = i3;
            if (i3 >= this.field_826) {
                return;
            }
            i3 = i4 + 1;
            this.field_825[i4] = dataInputStream.readUnsignedShort();
        }
    }

    public class_224(int i, int i2, int[] iArr, class_499 class_499Var) {
        super((byte) 3, i, i2, class_499Var);
        method_1056(iArr);
    }

    public final int[] method_434() {
        return this.field_825;
    }

    @Override // p000.class_160
    public class_160 method_187(class_499 class_499Var) {
        class_224 class_224Var = (class_224) clone();
        if (this.field_825 != null) {
            class_224Var.field_825 = new int[this.field_825.length];
            System.arraycopy(this.field_825, 0, class_224Var.field_825, 0, this.field_825.length);
        }
        class_224Var.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE = class_499Var;
        return class_224Var;
    }

    public final void method_1056(int[] iArr) {
        this.field_825 = iArr;
        this.field_826 = iArr == null ? 0 : iArr.length;
    }

    @Override // p000.class_160, p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_54(this);
    }

    public final int method_183() {
        return this.field_826;
    }
}
