package com.allatori.ant;

import com.allatori.commons.AllatoriLogger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_190 {
    public static void method_891(String str, class_606 class_606Var) throws IOException {
        JarFile jarFile = new JarFile(str);
        Enumeration<JarEntry> entries = jarFile.entries();
        while (entries.hasMoreElements()) {
            JarEntry nextElement = entries.nextElement();
            if (!nextElement.isDirectory() && nextElement.getName().endsWith(".class")) {
                try {
                    class_606Var.method_2105(method_890(jarFile.getInputStream(nextElement), nextElement.getName()), str, nextElement.getName());
                } catch (Exception e) {
                    if (!nextElement.getName().endsWith("module-info.class")) {
                        AllatoriLogger.method_678(new StringBuilder().insert(0, "Cannot parse class ").append(nextElement.getName()).toString());
                    }
                }
            }
        }
        jarFile.close();
    }

    public static class_202 method_890(InputStream inputStream, String str) {
        class_202 class_202Var = new class_202(new class_543(inputStream, str).method_1909());
        inputStream.close();
        return class_202Var;
    }
}
