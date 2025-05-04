package com.allatori.ant;

import java.io.DataInputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Vector;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_158 extends URLClassLoader {
    public class_606 field_690;

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE] complete} */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:3:0x0019 */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        r0 = method_776(r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        return defineClass(r6, r0, 0, r0.length);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        p000.class_144.method_678(new java.lang.StringBuilder().insert(0, "IncompatibleClassChangeError for class ").append(r6).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Class method_775(String str) {
        int i = 0;
        try {
            String concat = str.replace('.', '/').concat(".class");
            Vector method_14 = class_544.method_1918().method_14();
            while (true) {
                int i2 = i;
                if (i >= method_14.size()) {
                    throw new Exception();
                }
                JarFile jarFile = new JarFile(((class_137) method_14.get(i2)).field_617);
                try {
                    ZipEntry entry = jarFile.getEntry(concat);
                    if (entry != null) {
                        break;
                    }
                    if (jarFile != null) {
                        jarFile.close();
                    }
                    i = i2 + 1;
                } finally {
                    if (jarFile != null) {
                        jarFile.close();
                    }
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void method_774(class_606 class_606Var) {
        this.field_690 = class_606Var;
    }

    @Override // java.net.URLClassLoader, java.lang.ClassLoader
    public Class findClass(String str) {
        try {
            try {
                if (this.field_690.method_2102(str) != null) {
                    return method_775(str);
                }
            } catch (ClassNotFoundException e) {
                try {
                    return method_775(str);
                } catch (Exception e2) {
                    throw e;
                }
            }
        } catch (Exception e3) {
        }
        return super.findClass(str);
    }

    public byte[] method_776(JarFile jarFile, ZipEntry zipEntry) {
        byte[] bArr = new byte[(int) zipEntry.getSize()];
        DataInputStream dataInputStream = new DataInputStream(jarFile.getInputStream(zipEntry));
        dataInputStream.readFully(bArr, 0, bArr.length);
        dataInputStream.close();
        return bArr;
    }

    public class_158(URL[] urlArr) {
        super(urlArr, class_158.class.getClassLoader());
    }
}
