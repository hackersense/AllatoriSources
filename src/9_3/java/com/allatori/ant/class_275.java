package com.allatori.ant;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_275 {
    public static final int field_949 = 1;
    public static final int field_950 = 2;
    public static final int field_952 = 0;
    public int field_945;
    public String field_947;
    public static final String field_953 = "Not yet verified.";
    public static final String field_948 = "Passed verification.";
    public static final class_275 field_951 = new class_275(0, "Not yet verified.");
    public static final class_275 field_946 = new class_275(1, "Passed verification.");

    public int hashCode() {
        return this.field_945 ^ this.field_947.hashCode();
    }

    public int method_1212() {
        return this.field_945;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof class_275)) {
            return false;
        }
        class_275 class_275Var = (class_275) obj;
        return class_275Var.field_945 == this.field_945 && class_275Var.field_947.equals(this.field_947);
    }

    public String method_1213() {
        return this.field_947;
    }

    public class_275(int i, String str) {
        this.field_945 = i;
        this.field_947 = str;
    }
}
