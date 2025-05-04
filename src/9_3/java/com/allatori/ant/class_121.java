package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_121 extends class_160 {
    public int field_573;
    public class_367[] field_574;

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x000f */
    @Override // p000.class_160
    public class_160 method_187(class_499 class_499Var) {
        class_121 class_121Var = (class_121) clone();
        class_121Var.field_574 = new class_367[this.field_573];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i < this.field_573) {
                i = i2 + 1;
                class_121Var.field_574[i2] = this.field_574[i2].method_1491();
            } else {
                class_121Var.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE = class_499Var;
                return class_121Var;
            }
        }
    }

    public class_121(int i, int i2, class_367[] class_367VarArr, class_499 class_499Var) {
        super((byte) 6, i, i2, class_499Var);
        method_627(class_367VarArr);
    }

    public final void method_627(class_367[] class_367VarArr) {
        this.field_574 = class_367VarArr;
        this.field_573 = class_367VarArr == null ? 0 : class_367VarArr.length;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0015 */
    public class_121(int i, int i2, DataInputStream dataInputStream, class_499 class_499Var) {
        this(i, i2, (class_367[]) null, class_499Var);
        this.field_573 = dataInputStream.readUnsignedShort();
        this.field_574 = new class_367[this.field_573];
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i3 >= this.field_573) {
                return;
            }
            i3 = i4 + 1;
            this.field_574[i4] = new class_367(dataInputStream);
        }
    }

    @Override // p000.class_160, p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_58(this);
    }

    public final class_367[] method_626() {
        return this.field_574;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x000b */
    @Override // p000.class_160
    public final void method_184(DataOutputStream dataOutputStream) {
        int i = 0;
        super.method_184(dataOutputStream);
        dataOutputStream.writeShort(this.field_573);
        while (true) {
            int i2 = i;
            if (i >= this.field_573) {
                return;
            }
            i = i2 + 1;
            this.field_574[i2].method_184(dataOutputStream);
        }
    }

    public class_121(class_121 class_121Var) {
        this(class_121Var.method_433(), class_121Var.method_47(), class_121Var.method_626(), class_121Var.method_502());
    }
}
