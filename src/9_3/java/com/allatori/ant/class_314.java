package com.allatori.ant;

import com.allatori.commons.AllatoriLogger;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashSet;
import java.util.Vector;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_314 {
    public String field_1093;
    public class_606 field_1094;
    public HashSet field_1095 = new HashSet();
    public boolean field_1096 = false;

    public void method_1369(String str, String str2, class_606 class_606Var) {
        this.field_1094 = class_606Var;
        this.field_1093 = str2;
        if (str.equals(str2)) {
            method_1372(new File(str), class_606Var, "");
        } else {
            method_1366(new File(str), new File(str2), class_606Var, "");
        }
    }

    public void method_1368(class_202 class_202Var, File file) {
        file.getParentFile().mkdirs();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        if (class_202Var.method_920() <= 50) {
            bufferedOutputStream.write(class_202Var.method_642().method_429());
        } else {
            class_547 class_547Var = new class_547(this.field_1094, class_544.method_1934().field_1933);
            class_173 class_173Var = new class_173(class_202Var.method_642().method_429());
            class_297 class_297Var = new class_297(this, 2, class_547Var);
            class_173Var.method_841(class_297Var, 4);
            bufferedOutputStream.write(class_297Var.method_1789());
        }
        bufferedOutputStream.close();
    }

    public static boolean method_1367(class_314 class_314Var) {
        return class_314Var.field_1096;
    }

    public static boolean method_1370(class_314 class_314Var, boolean z) {
        class_314Var.field_1096 = z;
        return z;
    }

    public static HashSet method_1371(class_314 class_314Var) {
        return class_314Var.field_1095;
    }

    public void method_1366(File file, File file2, class_606 class_606Var, String str) {
        File[] listFiles = file.listFiles();
        int i = 0;
        int i2 = 0;
        while (i < listFiles.length) {
            File file3 = listFiles[i2];
            if (!file3.isDirectory()) {
                if (!file3.getName().endsWith(".class")) {
                    String sb = new StringBuilder().insert(0, file2.getPath()).append("/").append(file3.getName()).toString();
                    if (!class_544.method_1924().method_1480().method_1854()) {
                        new File(file2.getPath()).mkdirs();
                    } else {
                        sb = new StringBuilder().insert(0, this.field_1093).append("/").append(class_351.method_1428("", new StringBuilder().insert(0, str.replace('.', '/')).append('/').append(file3.getName()).toString())).toString();
                        if (sb.contains("/")) {
                            new File(sb.substring(0, sb.lastIndexOf(47))).mkdirs();
                        }
                    }
                    if (!class_544.method_1924().method_1480().method_1855(file3.getName())) {
                        class_344.method_1405(file3, new File(sb));
                    } else {
                        FileInputStream fileInputStream = new FileInputStream(file3);
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(sb));
                        class_351.method_1426(fileInputStream, fileOutputStream, class_544.method_1924().method_1480().method_1857(file3.getName()));
                        fileInputStream.close();
                        fileOutputStream.close();
                    }
                } else {
                    String substring = file3.getName().substring(0, r0.length() - 6);
                    if (str.length() > 0) {
                        substring = new StringBuilder().insert(0, str).append(".").append(substring).toString();
                    }
                    class_202 method_2102 = class_606Var.method_2102(substring);
                    if (method_2102 != null && !class_544.method_1927().method_101(class_606Var, method_2102)) {
                        method_1368(method_2102, new File(new StringBuilder().insert(0, this.field_1093).append("/").append(new StringBuilder().insert(0, method_2102.method_198().replace('.', '/')).append(".class").toString()).toString()));
                    } else {
                        if (method_2102 == null) {
                            AllatoriLogger.method_681(new StringBuilder().insert(0, "File ").append(file3.getPath()).append(" is copied with no modifications, as it is not in its package.").toString());
                        }
                        new File(file2.getPath()).mkdirs();
                        class_344.method_1405(file3, new File(new StringBuilder().insert(0, file2.getPath()).append("/").append(file3.getName()).toString()));
                    }
                }
            } else {
                String sb2 = new StringBuilder().insert(0, str).append(".").append(file3.getName()).toString();
                if (sb2.startsWith(".")) {
                    sb2 = sb2.substring(1);
                }
                method_1366(file3, new File(new StringBuilder().insert(0, file2.getPath()).append("/").append(file3.getName()).toString()), class_606Var, sb2);
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        Vector method_2101 = class_606Var.method_2101();
        int i4 = 0;
        int i5 = 0;
        while (i4 < method_2101.size()) {
            class_202 class_202Var = (class_202) method_2101.get(i5);
            int i6 = i5 + 1;
            method_1368(class_202Var, new File(new StringBuilder().insert(0, this.field_1093).append("/").append(new StringBuilder().insert(0, class_202Var.method_198().replace('.', '/')).append(".class").toString()).toString()));
            i4 = i6;
            i5 = i6;
        }
    }

    public void method_1372(File file, class_606 class_606Var, String str) {
        File[] listFiles = file.listFiles();
        int i = 0;
        int i2 = 0;
        while (i < listFiles.length) {
            File file2 = listFiles[i2];
            if (file2.isDirectory()) {
                String sb = new StringBuilder().insert(0, str).append(".").append(file2.getName()).toString();
                if (sb.startsWith(".")) {
                    sb = sb.substring(1);
                }
                method_1372(file2, class_606Var, sb);
            } else if (file2.getName().endsWith(".class")) {
                String substring = file2.getName().substring(0, r0.length() - 6);
                if (str.length() > 0) {
                    substring = new StringBuilder().insert(0, str).append(".").append(substring).toString();
                }
                class_202 method_2102 = class_606Var.method_2102(substring);
                if (method_2102 != null && !class_544.method_1927().method_101(class_606Var, method_2102)) {
                    file2.delete();
                    method_1368(method_2102, new File(new StringBuilder().insert(0, this.field_1093).append("/").append(new StringBuilder().insert(0, method_2102.method_198().replace('.', '/')).append(".class").toString()).toString()));
                }
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        Vector method_2101 = class_606Var.method_2101();
        int i4 = 0;
        int i5 = 0;
        while (i4 < method_2101.size()) {
            class_202 class_202Var = (class_202) method_2101.get(i5);
            int i6 = i5 + 1;
            method_1368(class_202Var, new File(new StringBuilder().insert(0, this.field_1093).append("/").append(new StringBuilder().insert(0, class_202Var.method_198().replace('.', '/')).append(".class").toString()).toString()));
            i4 = i6;
            i5 = i6;
        }
    }
}
