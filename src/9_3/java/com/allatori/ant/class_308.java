package com.allatori.ant;

import com.allatori.commons.AllatoriLogger;
import com.allatori.commons.Info;
import com.allatori.Obfuscate;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_308 extends class_80 {
    public static void method_1348(String[] strArr) {
        boolean z = false;
        System.out.println(method_541());
        if (strArr.length != 2) {
            method_1350();
            System.exit(0);
        }
        if (!"-add".equals(strArr[0])) {
            if ("-extract".equals(strArr[0])) {
                z = true;
            } else {
                method_1350();
                System.exit(0);
            }
        }
        if (!method_538(strArr[1], z)) {
            System.exit(-1);
        }
        try {
            class_606 method_540 = Obfuscate.method_540();
            if (!class_544.method_1935().method_235()) {
                if (class_544.method_1935().method_234() == null) {
                    AllatoriLogger.method_678("Configuration error. Watermark key is not set.");
                    System.exit(0);
                }
                if (class_544.method_1935().method_236() == null) {
                    AllatoriLogger.method_678("Configuration error. Watermark value is not set.");
                    System.exit(0);
                }
                method_533(method_540);
                method_534(method_540);
            } else {
                if (class_544.method_1935().method_234() == null) {
                    AllatoriLogger.method_678("Configuration error. Watermark key is not set.");
                    System.exit(0);
                }
                System.out.println(new StringBuilder().insert(0, "Extracted watermark: \"").append(method_539(method_540)).append("\"").toString());
            }
        } catch (Exception e) {
            AllatoriLogger.method_678(e.getMessage());
        }
        class_544.clearF2053();
    }

    public static void method_1350() {
        System.out.println(new StringBuilder().insert(0, Info.getName()).append(" ").append(Info.getVersion()).toString());
        System.out.println("Usage:");
        System.out.println("com.allatori.Watermark -add <config file>");
        System.out.println("or");
        System.out.println("com.allatori.Watermark -extract <config file>");
    }
}
