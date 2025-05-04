package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInput;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_46 extends class_160 {
    public static final class_577[] field_177 = new class_577[0];
    public class_577[] field_178;

    public class_46(int i, int i2, DataInput dataInput, class_499 class_499Var) {
        super(ASMInterface.field_1362, i, i2, class_499Var);
        this.field_178 = field_177;
        int readUnsignedByte = dataInput.readUnsignedByte();
        this.field_178 = new class_577[readUnsignedByte];
        int i3 = 0;
        int i4 = 0;
        while (i3 < readUnsignedByte) {
            int i5 = i4 + 1;
            this.field_178[i4] = new class_577(dataInput);
            i3 = i5;
            i4 = i5;
        }
    }

    @Override // p000.class_160
    public void method_184(DataOutputStream dataOutputStream) {
        super.method_184(dataOutputStream);
        dataOutputStream.writeByte(this.field_178.length);
        class_577[] class_577VarArr = this.field_178;
        int length = class_577VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            class_577VarArr[i2].method_184(dataOutputStream);
            i = i3;
            i2 = i3;
        }
    }

    @Override // p000.class_160, p000.class_241
    public void method_163(class_21 class_21Var) {
    }

    public class_577[] method_196() {
        return this.field_178;
    }

    public void method_197(class_577[] class_577VarArr) {
        if (class_577VarArr == null) {
            class_577VarArr = field_177;
        }
        this.field_178 = class_577VarArr;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0010 */
    @Override // p000.class_160
    public class_160 method_187(class_499 class_499Var) {
        class_46 class_46Var = (class_46) clone();
        class_46Var.field_178 = new class_577[this.field_178.length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i >= this.field_178.length) {
                class_46Var.method_498(class_499Var);
                return class_46Var;
            }
            i = i2 + 1;
            class_46Var.field_178[i2] = this.field_178[i2].method_2024();
        }
    }
}
