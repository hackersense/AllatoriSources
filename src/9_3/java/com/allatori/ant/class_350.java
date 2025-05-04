package com.allatori.ant;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_350 {
    public final String field_1137;
    public final int field_1138;
    public final boolean field_1139;
    public final String field_1140;
    public final String field_1141;

    public static String method_1425(String str, String str2, String str3, int i, String str4) {
        return new StringBuilder().insert(0, str).append(".").append(str2).append(str3).append(" (").append(i).append(str4).append(")").toString();
    }

    public int method_1420() {
        return this.field_1138;
    }

    public boolean method_1424() {
        return this.field_1139;
    }

    public String method_1422() {
        return this.field_1137;
    }

    public class_350(int i, String str, String str2, String str3, boolean z) {
        this.field_1138 = i;
        this.field_1141 = str;
        this.field_1137 = str2;
        this.field_1140 = str3;
        this.field_1139 = z;
    }

    @Deprecated
    public class_350(int i, String str, String str2, String str3) {
        this(i, str, str2, str3, i == 9);
    }

    public String method_1421() {
        return this.field_1141;
    }

    public int hashCode() {
        return (this.field_1139 ? 64 : 0) + this.field_1138 + (this.field_1141.hashCode() * this.field_1137.hashCode() * this.field_1140.hashCode());
    }

    public String method_1423() {
        return this.field_1140;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof class_350)) {
            return false;
        }
        class_350 class_350Var = (class_350) obj;
        return this.field_1138 == class_350Var.field_1138 && this.field_1139 == class_350Var.field_1139 && this.field_1141.equals(class_350Var.field_1141) && this.field_1137.equals(class_350Var.field_1137) && this.field_1140.equals(class_350Var.field_1140);
    }
}
