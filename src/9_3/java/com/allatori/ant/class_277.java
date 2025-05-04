package com.allatori.ant;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_277 {
    public static class_356 field_956;
    public class_426 field_954;
    public class_11 field_955;

    public Object clone() {
        return new class_277(this.field_954.method_1608(), this.field_955.method_29());
    }

    public class_277 method_1216() {
        return (class_277) clone();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof class_277)) {
            return false;
        }
        class_277 class_277Var = (class_277) obj;
        return this.field_955.equals(class_277Var.field_955) && this.field_954.equals(class_277Var.field_954);
    }

    public class_426 method_1215() {
        return this.field_954;
    }

    public int hashCode() {
        return this.field_955.hashCode() ^ this.field_954.hashCode();
    }

    public class_277(int i, int i2) {
        this.field_954 = new class_426(i);
        this.field_955 = new class_11(i2);
    }

    public class_11 method_1214() {
        return this.field_955;
    }

    public class_277(class_426 class_426Var, class_11 class_11Var) {
        this.field_954 = class_426Var;
        this.field_955 = class_11Var;
    }
}
