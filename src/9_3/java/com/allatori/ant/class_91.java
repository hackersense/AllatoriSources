package com.allatori.ant;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_91 {
    public static final int field_374 = 1;
    public static final int field_375 = 0;
    public static final int field_376 = 2;
    public static final int field_378 = 3;
    public final byte[] field_373;
    public final int field_377;

    public static void method_586(class_91 class_91Var, class_258 class_258Var) {
        if (class_91Var == null) {
            class_258Var.method_1132(0);
        } else {
            class_258Var.method_1143(class_91Var.field_373, class_91Var.field_377, (class_91Var.field_373[class_91Var.field_377] * 2) + 1);
        }
    }

    public static class_91 method_587(String str) {
        class_258 class_258Var;
        if (str == null || str.length() == 0) {
            return null;
        }
        int length = str.length();
        class_258 class_258Var2 = new class_258(length);
        class_258Var2.method_1132(0);
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            i++;
            if (charAt == '[') {
                class_258Var2.method_1133(0, 0);
            } else if (charAt == '.') {
                class_258Var2.method_1133(1, 0);
            } else if (charAt == '*') {
                class_258Var2.method_1133(2, 0);
            } else {
                if (charAt < '0' || charAt > '9') {
                    throw new IllegalArgumentException();
                }
                int i2 = charAt - '0';
                int i3 = i;
                int i4 = i;
                while (i3 < length) {
                    char charAt2 = str.charAt(i4);
                    i = i4 + 1;
                    if (charAt2 < '0' || charAt2 > '9') {
                        if (charAt2 == ';') {
                            class_258Var = class_258Var2;
                            class_258Var.method_1133(3, i2);
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else {
                        i2 = (charAt2 + (i2 * 10)) - 48;
                        i3 = i;
                        i4 = i;
                    }
                }
                class_258Var = class_258Var2;
                i = i4;
                class_258Var.method_1133(3, i2);
            }
        }
        class_258Var2.field_904[0] = (byte) (class_258Var2.field_905 / 2);
        return new class_91(class_258Var2.field_904, 0);
    }

    public int method_585(int i) {
        return this.field_373[this.field_377 + (i * 2) + 2];
    }

    public int method_588() {
        return this.field_373[this.field_377];
    }

    public int method_589(int i) {
        return this.field_373[this.field_377 + (i * 2) + 1];
    }

    public class_91(byte[] bArr, int i) {
        this.field_373 = bArr;
        this.field_377 = i;
    }
}
