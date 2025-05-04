package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_54;
import com.allatori.interfaces.unmapped.class_560;

import java.io.IOException;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_474 {
    public static class_560 field_1913 = class_22.method_99();

    public static class_440[] method_1812(String str) {
        return method_1824(method_1810(str));
    }

    public static boolean method_1811(String str, class_440 class_440Var) {
        return method_1818(method_1810(str), class_440Var);
    }

    public static void method_1804(class_560 class_560Var) {
        field_1913 = class_560Var;
    }

    public static boolean method_1816(class_440 class_440Var, class_440 class_440Var2) {
        return class_440Var.method_1636(class_440Var2);
    }

    public static boolean method_1807(String str, String str2) {
        return method_1816(method_1810(str), method_1810(str2));
    }

    public static class_440[] method_1824(class_440 class_440Var) {
        return class_440Var.method_601();
    }

    public static void method_1814(class_440 class_440Var) {
        field_1913.method_95(class_440Var);
    }

    public static boolean method_1806(String str, class_440 class_440Var) {
        return method_1816(method_1810(str), class_440Var);
    }

    public static class_440[] method_1815(String str) {
        return method_1823(method_1810(str));
    }

    public static class_440 method_1813(Class cls) {
        return field_1913.method_91(cls);
    }

    public static boolean method_1817(class_440 class_440Var, String str) {
        return method_1818(class_440Var, method_1810(str));
    }

    public static boolean method_1805(String str, String str2) {
        return method_1818(method_1810(str), method_1810(str2));
    }

    public static class_54 method_1821(String str) {
        try {
            class_58 method_96 = field_1913.method_96();
            if (method_96 == null) {
                return null;
            }
            return method_96.method_222(str);
        } catch (IOException e) {
            return null;
        }
    }

    public static boolean method_1818(class_440 class_440Var, class_440 class_440Var2) {
        return class_440Var.method_1632(class_440Var2);
    }

    public static void method_1809() {
        field_1913.method_97();
    }

    public static class_440[] method_1823(class_440 class_440Var) {
        return class_440Var.method_1638();
    }

    public static class_440 method_1822(class_440 class_440Var) {
        class_440 method_93 = field_1913.method_93(class_440Var.method_546());
        field_1913.method_94(class_440Var);
        return method_93;
    }

    public static class_440 method_1810(String str) {
        return field_1913.method_92(str);
    }

    public static class_560 method_1819() {
        return field_1913;
    }

    public static boolean method_1808(class_440 class_440Var, String str) {
        return method_1816(class_440Var, method_1810(str));
    }

    public static void method_1820(String str) {
        field_1913.method_95(field_1913.method_93(str));
    }
}
