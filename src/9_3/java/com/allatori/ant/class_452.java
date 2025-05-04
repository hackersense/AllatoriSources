package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_452 extends class_160 {
    public class_262[] field_1788;

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0010 */
    public class_452 method_1718(class_499 class_499Var) {
        class_452 class_452Var = (class_452) clone();
        class_452Var.field_1788 = new class_262[this.field_1788.length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i >= this.field_1788.length) {
                class_452Var.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE = class_499Var;
                return class_452Var;
            }
            i = i2 + 1;
            class_452Var.field_1788[i2] = this.field_1788[i2].method_1147();
        }
    }

    @Override // p000.class_160
    public final void method_184(DataOutputStream dataOutputStream) {
        super.method_184(dataOutputStream);
        dataOutputStream.writeShort(this.field_1788.length);
        class_262[] class_262VarArr = this.field_1788;
        int length = class_262VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            class_262VarArr[i2].method_184(dataOutputStream);
            i = i3;
            i2 = i3;
        }
    }

    @Override // p000.class_160
    public class_160 method_187(class_499 class_499Var) {
        return method_1718(class_499Var);
    }

    public final void method_1719(class_262[] class_262VarArr) {
        this.field_1788 = class_262VarArr;
    }

    public class_452(int i, int i2, DataInputStream dataInputStream, class_499 class_499Var) {
        this(i, i2, (class_262[]) null, class_499Var);
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        this.field_1788 = new class_262[readUnsignedShort];
        int i3 = 0;
        int i4 = 0;
        while (i3 < readUnsignedShort) {
            int i5 = i4 + 1;
            this.field_1788[i4] = new class_262(dataInputStream);
            i3 = i5;
            i4 = i5;
        }
    }

    public class_452(int i, int i2, class_262[] class_262VarArr, class_499 class_499Var) {
        super(ASMInterface.field_1469, i, i2, class_499Var);
        this.field_1788 = class_262VarArr;
    }

    public final class_262[] method_1717() {
        return this.field_1788;
    }

    @Override // p000.class_160, p000.class_241
    public void method_163(class_21 class_21Var) {
    }
}
