package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_580 extends class_160 {
    public int field_2360;
    public class_75[] field_2361;

    @Override // p000.class_160, p000.class_241
    public void method_163(class_21 class_21Var) {
    }

    public final int method_183() {
        return this.field_2360;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x000f */
    @Override // p000.class_160
    public class_160 method_187(class_499 class_499Var) {
        class_580 class_580Var = (class_580) clone();
        class_580Var.field_2361 = new class_75[this.field_2360];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i < this.field_2360) {
                i = i2 + 1;
                class_580Var.field_2361[i2] = this.field_2361[i2].method_501();
            } else {
                class_580Var.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE = class_499Var;
                return class_580Var;
            }
        }
    }

    public final void method_2027(class_75[] class_75VarArr) {
        this.field_2361 = class_75VarArr;
        this.field_2360 = class_75VarArr == null ? 0 : class_75VarArr.length;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0015 */
    public class_580(int i, int i2, DataInputStream dataInputStream, class_499 class_499Var) {
        this(i, i2, (class_75[]) null, class_499Var);
        this.field_2360 = dataInputStream.readUnsignedShort();
        this.field_2361 = new class_75[this.field_2360];
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i3 >= this.field_2360) {
                return;
            }
            i3 = i4 + 1;
            this.field_2361[i4] = new class_75(dataInputStream, class_499Var);
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x000b */
    @Override // p000.class_160
    public final void method_184(DataOutputStream dataOutputStream) {
        int i = 0;
        super.method_184(dataOutputStream);
        dataOutputStream.writeShort(this.field_2360);
        while (true) {
            int i2 = i;
            if (i >= this.field_2360) {
                return;
            }
            i = i2 + 1;
            this.field_2361[i2].method_184(dataOutputStream);
        }
    }

    public final class_75[] method_2028() {
        return this.field_2361;
    }

    public class_580(int i, int i2, class_75[] class_75VarArr, class_499 class_499Var) {
        super(ASMInterface.field_1420, i, i2, class_499Var);
        method_2027(class_75VarArr);
    }
}
