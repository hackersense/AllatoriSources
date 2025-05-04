package com.allatori.ant;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_587 {
    public static void method_2039(class_250 class_250Var) {
        class_250Var.method_1114(false);
        class_250Var.method_1105(false);
        class_250Var.method_1119(true);
    }

    public static String method_2030(String str) {
        return method_2033(str);
    }

    public static void method_2032(class_250 class_250Var) {
        method_2039(class_250Var);
    }

    public static String method_2034(String str) {
        return method_2038(str);
    }

    public static class_212 method_2036(class_212 class_212Var, class_386 class_386Var) {
        return method_2035(class_212Var, class_386Var);
    }

    public static boolean method_2037(class_250 class_250Var) {
        return method_2031(class_250Var);
    }

    public static String method_2038(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? "" : str.substring(0, lastIndexOf);
    }

    public static class_212 method_2035(class_212 class_212Var, class_386 class_386Var) {
        String method_464;
        String method_1543;
        if (!(class_212Var instanceof class_392)) {
            if (class_212Var instanceof class_594) {
                class_594 class_594Var = (class_594) class_212Var;
                class_212 method_669 = class_594Var.method_669();
                if ((method_669 instanceof class_392) && (method_1543 = class_386Var.method_1543((method_464 = ((class_392) method_669).method_464()))) != null && !method_1543.equals(method_464)) {
                    return new class_594(method_1543, class_594Var.method_433());
                }
            }
        } else {
            String method_4642 = ((class_392) class_212Var).method_464();
            String method_15432 = class_386Var.method_1543(method_4642);
            if (method_15432 != null && !method_15432.equals(method_4642)) {
                return new class_392(method_15432);
            }
        }
        return null;
    }

    public static String method_2033(String str) {
        return (class_544.method_1924().method_1469() || class_544.method_1924().method_1477()) ? str.substring(0, str.lastIndexOf(41)) : str;
    }

    public static boolean method_2031(class_250 class_250Var) {
        if (class_250Var.method_1124() || class_250Var.method_1129() || class_250Var.method_424()) {
            return false;
        }
        return true;
    }
}
