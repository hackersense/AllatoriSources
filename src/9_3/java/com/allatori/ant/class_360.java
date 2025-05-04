package com.allatori.ant;

import com.allatori.commons.AllatoriLogger;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_360 {
    public static void method_1456(String str, class_606 class_606Var, String str2) {
        File[] listFiles = new File(str).listFiles();
        int i = 0;
        int i2 = 0;
        while (i < listFiles.length) {
            File file = listFiles[i2];
            if (file.isDirectory()) {
                method_1456(file.getPath(), class_606Var, str2);
            }
            if (file.getName().endsWith(".class")) {
                try {
                    class_606Var.method_2109(method_1455(new BufferedInputStream(new FileInputStream(file)), file.getName()), str2);
                } catch (Exception e) {
                    if (!file.getName().endsWith("module-info.class")) {
                        AllatoriLogger.method_678(new StringBuilder().insert(0, "Cannot parse class ").append(file.getName()).toString());
                    }
                }
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
    }

    public static class_202 method_1455(InputStream inputStream, String str) {
        class_202 class_202Var = new class_202(new class_543(inputStream, str).method_1909());
        inputStream.close();
        return class_202Var;
    }
}
