package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;
import com.allatori.interfaces.unmapped.class_241;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_157 extends class_160 implements class_241 {
    public int field_688;
    public class_353[] field_689;

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x000f */
    @Override // p000.class_160
    public class_160 method_187(class_499 class_499Var) {
        class_157 class_157Var = (class_157) clone();
        class_157Var.field_689 = new class_353[this.field_688];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i >= this.field_688) {
                class_157Var.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE = class_499Var;
                return class_157Var;
            }
            i = i2 + 1;
            class_157Var.field_689[i2] = this.field_689[i2].method_1436();
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0015 */
    public class_157(int i, int i2, DataInputStream dataInputStream, class_499 class_499Var) {
        this(i, i2, (class_353[]) null, class_499Var);
        this.field_688 = dataInputStream.readUnsignedShort();
        this.field_689 = new class_353[this.field_688];
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i3 >= this.field_688) {
                return;
            }
            i3 = i4 + 1;
            this.field_689[i4] = new class_353(dataInputStream, class_499Var);
        }
    }

    public final int method_183() {
        return this.field_688;
    }

    @Override // p000.class_160, p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_70(this);
    }

    public final class_353[] method_772() {
        return this.field_689;
    }

    public class_157(int i, int i2, class_353[] class_353VarArr, class_499 class_499Var) {
        super((byte) 11, i, i2, class_499Var);
        method_773(class_353VarArr);
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x000b */
    @Override // p000.class_160
    public final void method_184(DataOutputStream dataOutputStream) {
        int i = 0;
        super.method_184(dataOutputStream);
        dataOutputStream.writeShort(this.field_688);
        while (true) {
            int i2 = i;
            if (i >= this.field_688) {
                return;
            }
            i = i2 + 1;
            this.field_689[i2].method_184(dataOutputStream);
        }
    }

    public final void method_773(class_353[] class_353VarArr) {
        this.field_689 = class_353VarArr;
        this.field_688 = class_353VarArr == null ? 0 : class_353VarArr.length;
    }
}
