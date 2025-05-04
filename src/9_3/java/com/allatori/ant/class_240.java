package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.commons.AllatoriLogger;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_240 {
    public static String method_1087(String str, ClassLoader classLoader, String str2, String str3) {
        String str4;
        String[] strArr;
        String str5;
        try {
            try {
                int parseInt = Integer.parseInt(str.substring(str.indexOf(91) + 1, str.indexOf(93)));
                str = str.substring(str.indexOf(93) + 1);
                strArr = (String[]) class_544.method_1937().method_1700().get(Integer.valueOf(parseInt));
                try {
                    String str6 = (String) Class.forName(strArr[0], true, classLoader).getDeclaredMethod(strArr[1], String.class, String.class, String.class).invoke(null, str, str2, str3);
                    if (str6 == null) {
                        AllatoriLogger.method_678(new StringBuilder().insert(0, "Custom string encryption error: null value is returned by ").append(strArr[0]).append(".").append(strArr[1]).append("()").toString());
                        throw new NullPointerException();
                    }
                    return str6;
                } catch (ClassNotFoundException e) {
                    str5 = str;
                    AllatoriLogger.method_678(new StringBuilder().insert(0, "Cannot load custom string encryption class (class not found): ").append(strArr[0]).toString());
                    return str5;
                } catch (NoSuchMethodException e2) {
                    str4 = str;
                    AllatoriLogger.method_678(new StringBuilder().insert(0, "Cannot find custom string encryption method: ").append(strArr[0]).append(".").append(strArr[1]).append("()").toString());
                    return str4;
                }
            } catch (ClassNotFoundException e3) {
                str5 = str;
                strArr = null;
            } catch (NoSuchMethodException e4) {
                str4 = str;
                strArr = null;
            }
        } catch (Exception e5) {
            String str7 = str;
            AllatoriLogger.method_678(new StringBuilder().insert(0, "Custom string encryption error: ").append(e5.getMessage()).toString());
            return str7;
        }
    }

    public static String method_1088(String str, int i, ClassLoader classLoader) {
        String[] strArr = (String[]) class_544.method_1937().method_1700().get(Integer.valueOf(i));
        try {
            try {
                Class<?> cls = Class.forName(strArr[0], true, classLoader);
                try {
                    Method declaredMethod = cls.getDeclaredMethod(strArr[1], String.class);
                    if (!Modifier.isStatic(declaredMethod.getModifiers()) || !Modifier.isPublic(declaredMethod.getModifiers())) {
                        AllatoriLogger.method_678(new StringBuilder().insert(0, "Custom string encryption method is not static and public: ").append(strArr[0]).append(".").append(strArr[1]).append("()").toString());
                    }
                    String str2 = (String) declaredMethod.invoke(null, str);
                    if (str2 != null) {
                        return str2;
                    }
                    AllatoriLogger.method_678(new StringBuilder().insert(0, "Custom string encryption error: null value is returned by ").append(strArr[0]).append(".").append(strArr[1]).append("()").toString());
                    throw new NullPointerException();
                } catch (NoSuchMethodException e) {
                    Method declaredMethod2 = cls.getDeclaredMethod(strArr[1], String.class, String.class, String.class);
                    if (!Modifier.isStatic(declaredMethod2.getModifiers()) || !Modifier.isPublic(declaredMethod2.getModifiers())) {
                        AllatoriLogger.method_678(new StringBuilder().insert(0, "Custom string encryption method is not static and public: ").append(strArr[0]).append(".").append(strArr[1]).append("()").toString());
                    }
                    return new StringBuilder().insert(0, "allatori-custom-12321-32123:").append('[').append(i).append(']').append(str).toString();
                }
            } catch (ClassNotFoundException e2) {
                AllatoriLogger.method_678(new StringBuilder().insert(0, "Cannot load custom string encryption class (class not found): ").append(strArr[0]).toString());
                return str;
            } catch (Exception e3) {
                AllatoriLogger.method_678(new StringBuilder().insert(0, "Custom string encryption error: ").append(e3.getMessage()).toString());
                return str;
            }
        } catch (NoSuchMethodException e4) {
            AllatoriLogger.method_678(new StringBuilder().insert(0, "Cannot find custom string encryption method: ").append(strArr[0]).append(".").append(strArr[1]).append("()").toString());
            return str;
        }
    }

    public static class_459 method_1089(class_563 class_563Var, int i) {
        String[] strArr = (String[]) class_544.method_1937().method_1700().get(Integer.valueOf(i));
        return class_563Var.method_1980(strArr[2], strArr[3], class_212.field_799, new class_212[]{class_212.field_799}, ASMInterface.field_1301);
    }
}
