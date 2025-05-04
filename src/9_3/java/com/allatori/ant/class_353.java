package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_353 implements Cloneable {
    public class_499 field_1149;
    public int field_1150;
    public class_112[] field_1151;
    public class_112[] field_1152;
    public int field_1153;
    public int field_1154;

    public class_353(int i, int i2, class_112[] class_112VarArr, int i3, class_112[] class_112VarArr2, class_499 class_499Var) {
        this.field_1153 = i;
        this.field_1150 = i2;
        this.field_1152 = class_112VarArr;
        this.field_1154 = i3;
        this.field_1151 = class_112VarArr2;
        this.field_1149 = class_499Var;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:6:0x0024 */
    public final void method_184(DataOutputStream dataOutputStream) {
        int i = 0;
        dataOutputStream.writeShort(this.field_1153);
        dataOutputStream.writeShort(this.field_1150);
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.field_1150) {
            int i4 = i3 + 1;
            this.field_1152[i3].method_184(dataOutputStream);
            i2 = i4;
            i3 = i4;
        }
        dataOutputStream.writeShort(this.field_1154);
        while (true) {
            int i5 = i;
            if (i >= this.field_1154) {
                return;
            }
            i = i5 + 1;
            this.field_1151[i5].method_184(dataOutputStream);
        }
    }

    public class_112[] method_500() {
        return this.field_1152;
    }

    public void method_499(class_112[] class_112VarArr) {
        this.field_1152 = class_112VarArr;
    }

    public class_112[] method_504() {
        return this.field_1151;
    }

    public int method_433() {
        return this.field_1153;
    }

    public void method_163(class_21 class_21Var) {
        class_21Var.method_77(this);
    }

    public void method_407(int i) {
        this.field_1150 = i;
    }

    public int method_183() {
        return this.field_1154;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:6:0x0039 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public class_353(DataInputStream dataInputStream, class_499 class_499Var) {
        this(dataInputStream.readShort(), dataInputStream.readShort(), null, -1, null, class_499Var);
        int i = 0;
        this.field_1152 = new class_112[this.field_1150];
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.field_1150) {
            int i4 = i3 + 1;
            this.field_1152[i3] = new class_112(dataInputStream, class_499Var);
            i2 = i4;
            i3 = i4;
        }
        this.field_1154 = dataInputStream.readShort();
        this.field_1151 = new class_112[this.field_1154];
        while (true) {
            int i5 = i;
            if (i < this.field_1154) {
                i = i5 + 1;
                this.field_1151[i5] = new class_112(dataInputStream, class_499Var);
            } else {
                return;
            }
        }
    }

    public void method_46(int i) {
        this.field_1153 = i;
    }

    public void method_503(class_112[] class_112VarArr) {
        this.field_1151 = class_112VarArr;
    }

    public final class_499 method_502() {
        return this.field_1149;
    }

    public int method_47() {
        return this.field_1150;
    }

    public final void method_498(class_499 class_499Var) {
        this.field_1149 = class_499Var;
    }

    public void method_461(int i) {
        this.field_1154 = i;
    }

    public class_353 method_1436() {
        try {
            return (class_353) clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
