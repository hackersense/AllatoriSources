package com.allatori.ant;

import com.allatori.commons.AllatoriLogger;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_268 {
    public static final int field_917 = 2;
    public static final int field_918 = 1;
    public static final int field_919 = 8;
    public static final int field_920 = 512;
    public static final int field_921 = 2048;
    public static final int field_922 = 32;
    public static final int field_923 = 1024;
    public static final int field_924 = 8192;
    public static final int field_925 = 128;
    public static final int field_926 = 4096;
    public static final int field_927 = 16;
    public static final int field_928 = 4;
    public static final int field_929 = 256;
    public static final int field_930 = 64;

    public static String method_1200(String str) {
        return str.startsWith("regex:") ? str.substring(6) : str.replaceAll("\\.", "\\\\.").replaceAll("\\*", ".*");
    }

    public static boolean method_1189(String[] strArr, String[] strArr2) {
        boolean z;
        int length = strArr2.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            int length2 = strArr.length - 1;
            int i3 = length2;
            int i4 = length2;
            while (true) {
                if (i3 < 0) {
                    z = false;
                    break;
                }
                if (strArr[i4].matches(strArr2[i2])) {
                    z = true;
                    break;
                }
                int i5 = i4 - 1;
                i3 = i5;
                i4 = i5;
            }
            if (!z) {
                return false;
            }
            int i6 = i2 - 1;
            i = i6;
            i2 = i6;
        }
        return true;
    }

    public static boolean method_1188(class_250 class_250Var, int i) {
        if (class_250Var.method_1124()) {
            if ((i & 1) == 0) {
                return false;
            }
        } else if (!class_250Var.method_1129()) {
            if (!class_250Var.method_424()) {
                if ((i & 4) == 0) {
                    return false;
                }
            } else if ((i & 8) == 0) {
                return false;
            }
        } else if ((i & 2) == 0) {
            return false;
        }
        if ((i & 16) > 0 && !class_250Var.method_1125()) {
            return false;
        }
        if ((i & 32) > 0 && !class_250Var.method_1117()) {
            return false;
        }
        if ((i & 64) > 0 && !class_250Var.method_1121()) {
            return false;
        }
        if ((i & 128) > 0 && !class_250Var.method_1122()) {
            return false;
        }
        if ((i & 256) > 0 && !class_250Var.method_1130()) {
            return false;
        }
        if ((i & 512) > 0 && !class_250Var.method_1126()) {
            return false;
        }
        if ((i & 1024) > 0 && !class_250Var.method_1108()) {
            return false;
        }
        if ((i & 2048) > 0 && !class_250Var.method_1103()) {
            return false;
        }
        if ((i & 4096) <= 0 || class_250Var.method_1113()) {
            return (i & 8192) <= 0 || class_250Var.method_1106();
        }
        return false;
    }

    public static boolean method_1199(class_212[] class_212VarArr, String str) {
        StringBuffer stringBuffer = new StringBuffer("");
        int length = class_212VarArr.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            int i3 = i2 - 1;
            stringBuffer.insert(0, class_212VarArr[i2].toString() + ",");
            i = i3;
            i2 = i3;
        }
        if (stringBuffer.length() > 0) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString().matches(str);
    }

    public static String method_1196(String str) {
        return method_1198(str);
    }

    public static boolean method_1191(String str) {
        return str.charAt(0) == '@';
    }

    public static boolean method_1194(class_574[] class_574VarArr, String str) {
        if (str == null) {
            return true;
        }
        int length = class_574VarArr.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            try {
                if (class_574VarArr[i2].method_2016().matches(str)) {
                    return true;
                }
                int i3 = i2 - 1;
                i = i3;
                i2 = i3;
            } catch (ClassCastException e) {
                throw e;
            }
        }
        return false;
    }

    public static String method_1198(String str) {
        return str == null ? ".*" : method_1200(str.trim().replaceAll("\\$", "\\\\\\$"));
    }

    public static String[] method_1195(String str) {
        if (str == null) {
            return new String[0];
        }
        String[] split = str.split("\\s*,\\s*");
        if (split == null) {
            return new String[0];
        }
        int length = split.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            split[i2] = split[i2].replaceAll("\\$", "\\\\\\$");
            int i3 = i2 - 1;
            split[i2] = method_1200(split[i2]);
            i = i3;
            i2 = i3;
        }
        return split;
    }

    public static boolean method_1193(class_606 class_606Var, String str, String str2) {
        if (str == null) {
            return false;
        }
        if (str.matches(str2)) {
            return true;
        }
        class_202 method_2102 = class_606Var.method_2102(str);
        if (method_2102 != null) {
            String[] method_643 = method_2102.method_643();
            int length = method_643.length - 1;
            int i = length;
            int i2 = length;
            while (i >= 0) {
                if (method_1193(class_606Var, method_643[i2], str2)) {
                    return true;
                }
                int i3 = i2 - 1;
                i = i3;
                i2 = i3;
            }
            return method_1193(class_606Var, method_2102.method_546(), str2);
        }
        try {
            Class<?> cls = Class.forName(str, false, class_606Var.method_2103());
            Class<?>[] interfaces = cls.getInterfaces();
            int length2 = interfaces.length - 1;
            int i4 = length2;
            int i5 = length2;
            while (i4 >= 0) {
                if (method_1193(class_606Var, interfaces[i5].getName(), str2)) {
                    return true;
                }
                int i6 = i5 - 1;
                i4 = i6;
                i5 = i6;
            }
            if (cls.getSuperclass() != null) {
                return method_1193(class_606Var, cls.getSuperclass().getName(), str2);
            }
            return false;
        } catch (ClassNotFoundException e) {
            return true;
        } catch (SecurityException e2) {
            AllatoriLogger.method_678(new StringBuilder().insert(0, "Cannot read class: ").append(str).toString());
            throw e2;
        }
    }

    public static boolean method_1187(String str) {
        return str.indexOf("public") >= 0 || str.indexOf("protected") >= 0 || str.indexOf("package") >= 0 || str.indexOf("private") >= 0 || str.indexOf("static") >= 0 || str.indexOf("final") >= 0 || str.indexOf("synchronized") >= 0 || str.indexOf("volatile") >= 0 || str.indexOf("transient") >= 0 || str.indexOf("native") >= 0 || str.indexOf("interface") >= 0 || str.indexOf("abstract") >= 0 || str.indexOf("strictfp") >= 0 || str.indexOf("enum") >= 0;
    }

    public static int method_1192(String str) {
        String trim = str.trim();
        int i = 0;
        if (trim.indexOf("public") >= 0) {
            i = 1;
        }
        if (trim.indexOf("protected") >= 0) {
            i |= 2;
        }
        if (trim.indexOf("package") >= 0) {
            i |= 4;
        }
        if (trim.indexOf("private") >= 0) {
            i |= 8;
        }
        if (trim.indexOf("protected+") >= 0) {
            i |= 3;
        }
        if (trim.indexOf("package+") >= 0) {
            i |= 7;
        }
        if (trim.indexOf("private+") >= 0) {
            i |= 15;
        }
        if (i == 0) {
            i = 15;
        }
        if (trim.indexOf("static") >= 0) {
            i |= 16;
        }
        if (trim.indexOf("final") >= 0) {
            i |= 32;
        }
        if (trim.indexOf("synchronized") >= 0) {
            i |= 64;
        }
        if (trim.indexOf("volatile") >= 0) {
            i |= 128;
        }
        if (trim.indexOf("transient") >= 0) {
            i |= 256;
        }
        if (trim.indexOf("native") >= 0) {
            i |= 512;
        }
        if (trim.indexOf("interface") >= 0) {
            i |= 1024;
        }
        if (trim.indexOf("abstract") >= 0) {
            i |= 2048;
        }
        if (trim.indexOf("strictfp") >= 0) {
            i |= 4096;
        }
        if (trim.indexOf("enum") >= 0) {
            return i | 8192;
        }
        return i;
    }

    public static boolean method_1197(String str) {
        return str.equals("public") || str.equals("protected") || str.equals("package") || str.equals("private") || str.equals("protected+") || str.equals("package+") || str.equals("private+");
    }

    public static boolean method_1186(class_78[] class_78VarArr, String str) {
        if (str == null) {
            return true;
        }
        int length = class_78VarArr.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            if (class_78VarArr[i2].method_198().matches(str)) {
                return true;
            }
            int i3 = i2 - 1;
            i = i3;
            i2 = i3;
        }
        return false;
    }

    public static String method_1190(String str) {
        return str.replaceAll("\\s+", "").replaceAll("\\[", "\\\\[").replaceAll("]", "\\\\]").replaceAll("\\.", "\\\\.").replaceAll("\\*\\*", "%@#").replaceAll("\\*", "[^,]*").replaceAll("\\%\\@\\#", ".*");
    }
}
