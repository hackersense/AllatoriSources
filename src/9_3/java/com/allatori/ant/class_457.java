package com.allatori.ant;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_457 {
    public class_143[] field_1792;

    public class_143 method_1720(int i) {
        if (i < 0 || i >= this.field_1792.length) {
            throw new class_572("Slot number for local variable information out of range.");
        }
        return this.field_1792[i];
    }

    public class_457(int i) {
        this.field_1792 = new class_143[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = i3 + 1;
            this.field_1792[i3] = new class_143();
            i2 = i4;
            i3 = i4;
        }
    }

    public void method_1721(int i, String str, int i2, int i3, class_212 class_212Var) {
        if (i < 0 || i >= this.field_1792.length) {
            throw new class_572("Slot number for local variable information out of range.");
        }
        this.field_1792[i].method_675(str, i2, i3, class_212Var);
        if (class_212Var == class_212.field_798) {
            this.field_1792[i + 1].method_675(str, i2, i3, class_321.method_1374());
        }
        if (class_212Var != class_212.field_810) {
            return;
        }
        this.field_1792[i + 1].method_675(str, i2, i3, class_177.method_862());
    }
}
