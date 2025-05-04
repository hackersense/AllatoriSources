package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_515 extends class_160 {
    public class_78[] field_1983;
    public int field_1984;
    public boolean field_1985;

    public class_515(byte b, int i, int i2, class_78[] class_78VarArr, class_499 class_499Var, boolean z) {
        super(b, i, i2, class_499Var);
        method_1868(class_78VarArr);
        this.field_1985 = z;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x001b */
    public class_515(byte b, int i, int i2, DataInputStream dataInputStream, class_499 class_499Var, boolean z) {
        this(b, i, i2, (class_78[]) null, class_499Var, z);
        this.field_1984 = dataInputStream.readUnsignedShort();
        this.field_1983 = new class_78[this.field_1984];
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i3 < this.field_1984) {
                i3 = i4 + 1;
                this.field_1983[i4] = class_78.method_532(dataInputStream, class_499Var, z);
            } else {
                return;
            }
        }
    }

    public boolean method_424() {
        return this.field_1985;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0008 */
    public void method_1867(DataOutputStream dataOutputStream) {
        int i = 0;
        dataOutputStream.writeShort(this.field_1984);
        while (true) {
            int i2 = i;
            if (i >= this.field_1984) {
                return;
            }
            i = i2 + 1;
            this.field_1983[i2].method_184(dataOutputStream);
        }
    }

    @Override // p000.class_160, p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_56(this);
    }

    public class_78[] method_1560() {
        return this.field_1983;
    }

    public final int method_183() {
        return this.field_1984;
    }

    public final void method_1868(class_78[] class_78VarArr) {
        this.field_1983 = class_78VarArr;
        this.field_1984 = class_78VarArr == null ? 0 : class_78VarArr.length;
    }
}
