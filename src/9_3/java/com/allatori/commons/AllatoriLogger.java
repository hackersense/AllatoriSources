package com.allatori.commons;

import com.allatori.ant.class_568;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class AllatoriLogger {
    public static boolean field_641 = false;

    public static boolean method_680() {
        return field_641;
    }

    public static void method_681(String str) {
        if (field_641) {
            return;
        }
        class_568.field_2335.append(new StringBuilder().insert(0, "[WARNING] ").append(str).append("\n").toString());
        System.out.println(new StringBuilder().insert(0, "[WARNING] ").append(str).toString());
    }

    public static void method_679(boolean z) {
        field_641 = z;
    }

    public static void method_683(String str) {
        if (field_641) {
            return;
        }
        System.out.println(new StringBuilder().insert(0, "[INFO] ").append(str).toString());
    }

    public static void method_678(String str) {
        class_568.field_2335.append(new StringBuilder().insert(0, "[ERROR] ").append(str).append("\n").toString());
        System.out.println(new StringBuilder().insert(0, "[ERROR] ").append(str).toString());
    }

    public static void method_682(String str) {
        if (field_641) {
            return;
        }
        System.out.println(new StringBuilder().insert(0, "[DEBUG] ").append(str).toString());
    }
}
