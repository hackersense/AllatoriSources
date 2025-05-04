package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_332 extends class_160 {
    public class_387[] field_1112;
    public int field_1113;

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x000f */
    @Override // p000.class_160
    public class_160 method_187(class_499 class_499Var) {
        class_332 class_332Var = (class_332) clone();
        class_332Var.field_1112 = new class_387[this.field_1113];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i < this.field_1113) {
                i = i2 + 1;
                class_332Var.field_1112[i2] = this.field_1112[i2].method_1205();
            } else {
                class_332Var.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE = class_499Var;
                return class_332Var;
            }
        }
    }

    public class_332(int i, int i2, class_387[] class_387VarArr, class_499 class_499Var) {
        super((byte) 4, i, i2, class_499Var);
        method_1386(class_387VarArr);
    }

    @Override // p000.class_160, p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_53(this);
    }

    public final void method_1386(class_387[] class_387VarArr) {
        this.field_1112 = class_387VarArr;
        this.field_1113 = class_387VarArr == null ? 0 : class_387VarArr.length;
    }

    public final int method_183() {
        return this.field_1113;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x000b */
    @Override // p000.class_160
    public final void method_184(DataOutputStream dataOutputStream) {
        int i = 0;
        super.method_184(dataOutputStream);
        dataOutputStream.writeShort(this.field_1113);
        while (true) {
            int i2 = i;
            if (i >= this.field_1113) {
                return;
            }
            i = i2 + 1;
            this.field_1112[i2].method_184(dataOutputStream);
        }
    }

    public final class_387[] method_1385() {
        return this.field_1112;
    }

    public int method_790(int i) {
        int i2;
        int i3 = 0;
        int i4 = this.field_1113 - 1;
        if (i4 < 0) {
            return -1;
        }
        int i5 = -1;
        int i6 = -1;
        do {
            int i7 = (i3 + i4) / 2;
            int method_433 = this.field_1112[i7].method_433();
            if (method_433 == i) {
                return this.field_1112[i7].method_47();
            }
            if (i >= method_433) {
                i3 = i7 + 1;
                i2 = method_433;
            } else {
                i4 = i7 - 1;
                i2 = method_433;
            }
            if (i2 < i && method_433 > i5) {
                i5 = method_433;
                i6 = i7;
            }
        } while (i3 <= i4);
        if (i6 >= 0) {
            return this.field_1112[i6].method_47();
        }
        return -1;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0015 */
    public class_332(int i, int i2, DataInputStream dataInputStream, class_499 class_499Var) {
        this(i, i2, (class_387[]) null, class_499Var);
        this.field_1113 = dataInputStream.readUnsignedShort();
        this.field_1112 = new class_387[this.field_1113];
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i3 < this.field_1113) {
                i3 = i4 + 1;
                this.field_1112[i4] = new class_387(dataInputStream);
            } else {
                return;
            }
        }
    }

    public class_332(class_332 class_332Var) {
        this(class_332Var.method_433(), class_332Var.method_47(), class_332Var.method_1385(), class_332Var.method_502());
    }
}
