package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_285 extends class_160 {
    public int field_1004;
    public class_368[] field_1005;

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x000b */
    @Override // p000.class_160
    public final void method_184(DataOutputStream dataOutputStream) {
        int i = 0;
        super.method_184(dataOutputStream);
        dataOutputStream.writeShort(this.field_1004);
        while (true) {
            int i2 = i;
            if (i >= this.field_1004) {
                return;
            }
            i = i2 + 1;
            this.field_1005[i2].method_184(dataOutputStream);
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x000f */
    @Override // p000.class_160
    public class_160 method_187(class_499 class_499Var) {
        class_285 class_285Var = (class_285) clone();
        class_285Var.field_1005 = new class_368[this.field_1004];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i < this.field_1004) {
                i = i2 + 1;
                class_285Var.field_1005[i2] = this.field_1005[i2].method_1492();
            } else {
                class_285Var.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE = class_499Var;
                return class_285Var;
            }
        }
    }

    public final int method_183() {
        return this.field_1004;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0015 */
    public class_285(int i, int i2, DataInputStream dataInputStream, class_499 class_499Var) {
        this(i, i2, (class_368[]) null, class_499Var);
        this.field_1004 = dataInputStream.readUnsignedShort();
        this.field_1005 = new class_368[this.field_1004];
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i3 >= this.field_1004) {
                return;
            }
            i3 = i4 + 1;
            this.field_1005[i4] = new class_368(dataInputStream, class_499Var);
        }
    }

    public final void method_182(class_368[] class_368VarArr) {
        this.field_1005 = class_368VarArr;
        this.field_1004 = class_368VarArr == null ? 0 : class_368VarArr.length;
    }

    @Override // p000.class_160, p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_82(this);
    }

    public final class_368[] method_181() {
        return this.field_1005;
    }

    public class_285(class_285 class_285Var) {
        this(class_285Var.method_433(), class_285Var.method_47(), class_285Var.method_181(), class_285Var.method_502());
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0003 */
    public final class_368 method_185(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i2 >= this.field_1004) {
                return null;
            }
            if (this.field_1005[i3].method_47() == i) {
                return this.field_1005[i3];
            }
            i2 = i3 + 1;
        }
    }

    public class_285(int i, int i2, class_368[] class_368VarArr, class_499 class_499Var) {
        super(ASMInterface.field_1346, i, i2, class_499Var);
        method_182(class_368VarArr);
    }
}
