package com.allatori.ant;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_444 {
    public final int field_1736;
    public final class_243 field_1737;
    public final String field_1738;
    public class_444 field_1739;
    public final class_243 field_1740;
    public final class_243 field_1741;

    public class_444(class_444 class_444Var, class_243 class_243Var, class_243 class_243Var2) {
        this(class_243Var, class_243Var2, class_444Var.field_1740, class_444Var.field_1736, class_444Var.field_1738);
        this.field_1739 = class_444Var.field_1739;
    }

    public static void method_1668(class_444 class_444Var, class_258 class_258Var) {
        class_258Var.method_1138(method_1667(class_444Var));
        class_444 class_444Var2 = class_444Var;
        class_444 class_444Var3 = class_444Var;
        while (class_444Var2 != null) {
            class_258Var.method_1138(class_444Var3.field_1737.field_870).method_1138(class_444Var3.field_1741.field_870).method_1138(class_444Var3.field_1740.field_870).method_1138(class_444Var3.field_1736);
            class_444 class_444Var4 = class_444Var3.field_1739;
            class_444Var2 = class_444Var4;
            class_444Var3 = class_444Var4;
        }
    }

    public static class_444 method_1665(class_444 class_444Var, class_243 class_243Var, class_243 class_243Var2) {
        if (class_444Var == null) {
            return null;
        }
        class_444Var.field_1739 = method_1665(class_444Var.field_1739, class_243Var, class_243Var2);
        int i = class_444Var.field_1737.field_870;
        int i2 = class_444Var.field_1741.field_870;
        int i3 = class_243Var.field_870;
        int i4 = class_243Var2 == null ? class_408.field_1257 : class_243Var2.field_870;
        if (i3 < i2 && i4 > i) {
            if (i3 > i) {
                if (i4 < i2) {
                    class_444Var.field_1739 = new class_444(class_444Var, class_243Var2, class_444Var.field_1741);
                    return new class_444(class_444Var, class_444Var.field_1737, class_243Var);
                }
                return new class_444(class_444Var, class_444Var.field_1737, class_243Var);
            }
            if (i4 < i2) {
                return new class_444(class_444Var, class_243Var2, class_444Var.field_1741);
            }
            return class_444Var.field_1739;
        }
        return class_444Var;
    }

    public class_444(class_243 class_243Var, class_243 class_243Var2, class_243 class_243Var3, int i, String str) {
        this.field_1737 = class_243Var;
        this.field_1741 = class_243Var2;
        this.field_1740 = class_243Var3;
        this.field_1736 = i;
        this.field_1738 = str;
    }

    public static int method_1667(class_444 class_444Var) {
        int i = 0;
        class_444 class_444Var2 = class_444Var;
        class_444 class_444Var3 = class_444Var;
        while (class_444Var2 != null) {
            class_444 class_444Var4 = class_444Var3.field_1739;
            i++;
            class_444Var2 = class_444Var4;
            class_444Var3 = class_444Var4;
        }
        return i;
    }

    public static int method_1666(class_444 class_444Var) {
        return (method_1667(class_444Var) * 8) + 2;
    }
}
