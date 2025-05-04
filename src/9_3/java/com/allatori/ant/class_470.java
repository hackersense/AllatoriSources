package com.allatori.ant;

import java.util.Arrays;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_470 {
    public final String field_1874;
    public final String field_1875;
    public final class_350 field_1876;
    public final Object[] field_1877;

    public static String method_1782(String str, String str2, class_350 class_350Var, String str3) {
        return new StringBuilder().insert(0, str).append(" : ").append(str2).append(" ").append(class_350Var).append(" ").append(str3).toString();
    }

    public String method_1783() {
        return this.field_1875;
    }

    public int method_1779() {
        char charAt = this.field_1874.charAt(0);
        return (charAt == 'J' || charAt == 'D') ? 2 : 1;
    }

    public Object[] method_1784() {
        return this.field_1877;
    }

    public class_350 method_1781() {
        return this.field_1876;
    }

    public class_470(String str, String str2, class_350 class_350Var, Object[] objArr) {
        this.field_1875 = str;
        this.field_1874 = str2;
        this.field_1876 = class_350Var;
        this.field_1877 = objArr;
    }

    public String method_1780() {
        return this.field_1874;
    }

    public Object method_1778(int i) {
        return this.field_1877[i];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof class_470)) {
            return false;
        }
        class_470 class_470Var = (class_470) obj;
        return this.field_1875.equals(class_470Var.field_1875) && this.field_1874.equals(class_470Var.field_1874) && this.field_1876.equals(class_470Var.field_1876) && Arrays.equals(this.field_1877, class_470Var.field_1877);
    }

    public int hashCode() {
        return ((this.field_1875.hashCode() ^ Integer.rotateLeft(this.field_1874.hashCode(), 8)) ^ Integer.rotateLeft(this.field_1876.hashCode(), 16)) ^ Integer.rotateLeft(Arrays.hashCode(this.field_1877), 24);
    }

    public int method_1777() {
        return this.field_1877.length;
    }
}
