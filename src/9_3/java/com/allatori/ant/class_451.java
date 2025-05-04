package com.allatori.ant;

import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_451 extends class_130 {
    public class_130[] field_1787;

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x000d */
    @Override // p000.class_130
    public String method_639() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        int i = 0;
        while (true) {
            int i2 = i;
            if (i < this.field_1787.length) {
                stringBuffer.append(this.field_1787[i2].method_639());
                if (i2 + 1 < this.field_1787.length) {
                    stringBuffer.append(",");
                }
                i = i2 + 1;
            } else {
                stringBuffer.append("]");
                return stringBuffer.toString();
            }
        }
    }

    public class_451(int i, class_130[] class_130VarArr, class_499 class_499Var) {
        super(i, class_499Var);
        if (i != 91) {
            throw new RuntimeException("Only element values of type array can be built with this ctor");
        }
        this.field_1787 = class_130VarArr;
    }

    public int method_1418() {
        return this.field_1787.length;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x000e */
    @Override // p000.class_130
    public void method_641(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.iIiiIiIiII);
        dataOutputStream.writeShort(this.field_1787.length);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i >= this.field_1787.length) {
                return;
            }
            i = i2 + 1;
            this.field_1787[i2].method_641(dataOutputStream);
        }
    }

    public class_130[] method_1716() {
        return this.field_1787;
    }
}
