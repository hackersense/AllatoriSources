package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_238 extends class_160 {
    public int[] field_848;
    public int field_849;

    public final void method_1056(int[] iArr) {
        this.field_848 = iArr;
        this.field_849 = iArr == null ? 0 : iArr.length;
    }

    public final int[] method_434() {
        return this.field_848;
    }

    @Override // p000.class_160
    public class_160 method_187(class_499 class_499Var) {
        class_238 class_238Var = (class_238) clone();
        if (this.field_848 != null) {
            class_238Var.field_848 = new int[this.field_848.length];
            System.arraycopy(this.field_848, 0, class_238Var.field_848, 0, this.field_848.length);
        }
        class_238Var.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE = class_499Var;
        return class_238Var;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x000b */
    @Override // p000.class_160
    public final void method_184(DataOutputStream dataOutputStream) {
        int i = 0;
        super.method_184(dataOutputStream);
        dataOutputStream.writeShort(this.field_849);
        while (true) {
            int i2 = i;
            if (i >= this.field_849) {
                return;
            }
            i = i2 + 1;
            dataOutputStream.writeShort(this.field_848[i2]);
        }
    }

    public final int method_183() {
        return this.field_849;
    }

    public class_238(class_238 class_238Var) {
        this(class_238Var.method_433(), class_238Var.method_47(), class_238Var.method_434(), class_238Var.method_502());
    }

    public class_238(int i, int i2, int[] iArr, class_499 class_499Var) {
        super(ASMInterface.field_1497, i, i2, class_499Var);
        method_1056(this.field_848);
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0015 */
    public class_238(int i, int i2, DataInputStream dataInputStream, class_499 class_499Var) {
        this(i, i2, (int[]) null, class_499Var);
        int i3 = 0;
        this.field_849 = dataInputStream.readUnsignedShort();
        this.field_848 = new int[this.field_849];
        while (true) {
            int i4 = i3;
            if (i3 < this.field_849) {
                i3 = i4 + 1;
                this.field_848[i4] = dataInputStream.readUnsignedShort();
            } else {
                return;
            }
        }
    }

    @Override // p000.class_160, p000.class_241
    public void method_163(class_21 class_21Var) {
    }
}
