package com.allatori.ant;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_549 {
    public static final int field_2063 = 6;
    public int field_2064;
    public class_187[] field_2065 = new class_187[6];

    public boolean method_1946(class_187 class_187Var) {
        int i = 0;
        int i2 = 0;
        while (i < this.field_2064) {
            if (!this.field_2065[i2].field_740.equals(class_187Var.field_740)) {
                int i3 = i2 + 1;
                i = i3;
                i2 = i3;
            } else {
                return true;
            }
        }
        return false;
    }

    public void method_1948(class_187 class_187Var) {
        class_187 class_187Var2 = class_187Var;
        class_187 class_187Var3 = class_187Var;
        while (class_187Var2 != null) {
            if (!method_1946(class_187Var3)) {
                method_1947(class_187Var3);
            }
            class_187 class_187Var4 = class_187Var3.field_739;
            class_187Var2 = class_187Var4;
            class_187Var3 = class_187Var4;
        }
    }

    public class_187[] method_1949() {
        class_187[] class_187VarArr = new class_187[this.field_2064];
        System.arraycopy(this.field_2065, 0, class_187VarArr, 0, this.field_2064);
        return class_187VarArr;
    }

    public void method_1947(class_187 class_187Var) {
        if (this.field_2064 >= this.field_2065.length) {
            class_187[] class_187VarArr = new class_187[this.field_2065.length + 6];
            System.arraycopy(this.field_2065, 0, class_187VarArr, 0, this.field_2064);
            this.field_2065 = class_187VarArr;
        }
        class_187[] class_187VarArr2 = this.field_2065;
        int i = this.field_2064;
        this.field_2064 = i + 1;
        class_187VarArr2[i] = class_187Var;
    }
}
