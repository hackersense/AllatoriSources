package com.allatori;

import com.allatori.ant.*;
import com.allatori.commons.AllatoriLogger;
import com.allatori.commons.Info;

import java.io.File;

/* renamed from: class_305 */
/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class Obfuscate extends class_80 {
    public static void method_544(class_606 class_606Var) throws Exception {
        new class_540(class_606Var).method_1907();
    }

    public static void main(String[] strArr) {
        String[] strArr2;
        if (strArr.length <= 1 || !"-silent".equals(strArr[1])) {
            System.out.println(method_541());
        } else {
            AllatoriLogger.method_679(true);
        }
        strArr2 = strArr;
        if (strArr2.length != 1 && !AllatoriLogger.method_680()) {
            printUsage();
            System.exit(0);
        }
        if (!method_542(strArr[0])) {
            System.exit(-1);
        }
        try {
            method_1347();
        } catch (Exception e) {
            AllatoriLogger.method_678(e.getMessage());
            System.out.println("############### EXCEPTION (" + Info.getVersion() + ") ###############");
            e.printStackTrace();
            System.out.println("#################################################");
            System.exit(-1);
        }
        class_544.clearF2053();
    }

    public static void method_1347() throws Exception {
        class_606 method_540 = method_540();
        method_544(method_540);
        if (class_544.method_1935().method_234() != null && class_544.method_1935().method_236() != null) {
            method_533(method_540);
        }
        if (class_544.method_1937().method_1709()) {
            method_537(method_540);
        }
        method_534(method_540);
        AllatoriLogger.method_683("Obfuscation completed. Writing log file...");
        class_568.method_2004();
    }

    public static void printUsage() {
        System.out.println(new StringBuilder().insert(0, Info.getName()).append(" ").append(Info.getVersion()).toString());
        System.out.println("Usage:");
        System.out.println("com.allatori.Obfuscate <config file>");
    }

    public static void method_1349(File file) throws Exception {
        method_543(file.getPath());
        method_1347();
        class_544.clearF2053();
    }
}
