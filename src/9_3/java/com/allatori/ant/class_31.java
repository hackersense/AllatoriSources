package com.allatori.ant;

import com.allatori.commons.AllatoriLogger;
import com.allatori.commons.Info;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import java.util.zip.ZipException;
import java.util.zip.ZipOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_31 {
    public class_606 field_53;
    public Hashtable field_55;
    public final String field_56 = ".tmp";
    public Vector field_57 = new Vector();
    public HashSet field_58 = new HashSet();
    public boolean field_54 = false;

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:14:0x0080 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:8:0x004e */
    public void method_156(String[] strArr, String str) {
        byte[] bArr = new byte[262144];
        JarOutputStream jarOutputStream = new JarOutputStream(new FileOutputStream(new StringBuilder().insert(0, str).append(".tmp").toString()));
        if (class_544.method_1922().method_1957() != -1) {
            jarOutputStream.setLevel(class_544.method_1922().method_1957());
        }
        Hashtable hashtable = new Hashtable();
        int i = 0;
        int i2 = 0;
        while (i < strArr.length) {
            JarFile jarFile = new JarFile(strArr[i2]);
            Enumeration<JarEntry> entries = jarFile.entries();
            while (entries.hasMoreElements()) {
                JarEntry nextElement = entries.nextElement();
                if (!hashtable.containsKey(nextElement.getName())) {
                    hashtable.put(nextElement.getName(), "");
                    InputStream inputStream = jarFile.getInputStream(nextElement);
                    jarOutputStream.putNextEntry(new JarEntry(nextElement.getName()));
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        } else {
                            jarOutputStream.write(bArr, 0, read);
                        }
                    }
                    jarOutputStream.closeEntry();
                }
            }
            int i3 = i2 + 1;
            jarFile.close();
            i = i3;
            i2 = i3;
        }
        if (class_544.method_1937().method_1678() && !class_544.method_1937().method_1699()) {
            writeAdvertisement(jarOutputStream);
        }
        jarOutputStream.finish();
        jarOutputStream.close();
        method_148(str + ".tmp", str);
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:3:0x0007 */
    public void method_157(String str, JarOutputStream jarOutputStream) {
        String str2 = "";
        while (true) {
            while (true) {
                String str3 = str;
                if (str.indexOf(47) <= 0) {
                    return;
                }
                str2 = new StringBuilder().insert(0, str2).append(str3.substring(0, str3.indexOf(47) + 1)).toString();
                str = str3.substring(str3.indexOf(47) + 1);
                if (!this.field_55.containsKey(str2)) {
                    this.field_55.put(str2, ".tmp");
                    jarOutputStream.putNextEntry(new JarEntry(str2));
                    jarOutputStream.closeEntry();
                }
            }
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:65:0x0245 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:97:0x0320 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:99:0x0326 */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02ce, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02d9, code lost:
    
        if (r5.getMessage().contains("duplicate") == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02db, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0220, code lost:
    
        if (r4.getMethod() != 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0222, code lost:
    
        r16.setMethod(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0228, code lost:
    
        r12 = new java.io.File(r5.IIiIIIIiii);
        r16.setSize(r12.length());
        r9 = new java.io.FileInputStream(r12);
        r17 = new java.util.zip.CRC32();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0245, code lost:
    
        r5 = r9.read(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0249, code lost:
    
        if (r5 <= 0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x024b, code lost:
    
        r17.update(r13, 0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0260, code lost:
    
        r16.setCrc(r17.getValue());
        r9.close();
        r9 = new java.io.FileInputStream(r12);
        method_157(r16.getName(), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x027c, code lost:
    
        r10.putNextEntry(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0289, code lost:
    
        if (p000.class_544.method_1922().method_1959() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x028b, code lost:
    
        r6.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x028e, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x028f, code lost:
    
        r5 = r5.read(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0293, code lost:
    
        if (r5 <= 0) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0295, code lost:
    
        r10.write(r13, 0, r5);
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x029b, code lost:
    
        r9.close();
        r10.closeEntry();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02a1, code lost:
    
        r5 = true;
        r12 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void method_159(String str, String str2, class_606 class_606Var) {
        HashSet hashSet;
        Field declaredField;
        Vector vector;
        Enumeration<JarEntry> entries;
        Enumeration<JarEntry> enumeration;
        String str3;
        boolean z;
        boolean z2;
        class_202 method_2102;
        String method_2110;
        this.field_53 = class_606Var;
        this.field_55 = new Hashtable();
        byte[] bArr = new byte[262144];
        JarFile jarFile = new JarFile(str);
        JarOutputStream jarOutputStream = new JarOutputStream(new FileOutputStream(new StringBuilder().insert(0, str2).append(".tmp").toString()));
        HashSet hashSet2 = new HashSet();
        if (class_544.method_1922().method_1959()) {
            try {
                declaredField = ZipOutputStream.class.getDeclaredField("names");
            } catch (RuntimeException e) {
                if (e.getClass().getName().endsWith("InaccessibleObjectException")) {
                    AllatoriLogger.method_681("Use '--add-opens java.base/java.util.zip=ALL-UNNAMED' Java launcher option to keep output jar duplicate entries https://allatori.com/doc.html#property-output-jar-duplicate-name-entries");
                    hashSet = hashSet2;
                }
            } catch (Exception e2) {
            }
            if (declaredField != null) {
                declaredField.setAccessible(true);
                hashSet = (HashSet) declaredField.get(jarOutputStream);
                if (class_544.method_1922().method_1957() != -1) {
                    jarOutputStream.setLevel(class_544.method_1922().method_1957());
                }
                vector = new Vector();
                entries = jarFile.entries();
                String str4 = "";
                while (true) {
                    enumeration = entries;
                    while (enumeration.hasMoreElements()) {
                        JarEntry nextElement = entries.nextElement();
                        if (nextElement.isDirectory()) {
                            enumeration = entries;
                        } else {
                            if (nextElement.getName().endsWith(".class") && (method_2110 = class_606Var.method_2110(new StringBuilder().insert(0, str).append('#').append(nextElement.getName()).toString())) != null) {
                                str4 = class_606Var.method_2106(new StringBuilder().insert(0, str).append('#').append(method_2110).toString());
                                class_202 method_21022 = class_606Var.method_2102(method_2110);
                                if (method_21022 != null && !class_544.method_1927().method_101(class_606Var, method_21022)) {
                                    vector.add(method_21022);
                                    enumeration = entries;
                                }
                            }
                            if (!nextElement.getName().equals("META-INF/INDEX.LIST")) {
                                InputStream inputStream = jarFile.getInputStream(nextElement);
                                String name = nextElement.getName();
                                if (class_544.method_1924().method_1480().method_1854()) {
                                    if (str4 == null && str.endsWith(".war")) {
                                        str4 = "WEB-INF/classes/";
                                    }
                                    if (nextElement.getName().startsWith("BOOT-INF/classes/")) {
                                        str4 = "BOOT-INF/classes/";
                                    }
                                    if (nextElement.getName().startsWith("WEB-INF/classes/")) {
                                        str4 = "WEB-INF/classes/";
                                    }
                                    name = class_351.method_1428(str4, nextElement.getName());
                                    str3 = str4;
                                } else {
                                    str3 = str4;
                                }
                                if (class_544.method_1919().method_142() && "com/license4j/resources/d.bfi".equals(nextElement.getName()) && (method_2102 = class_606Var.method_2102("com.license4j.HardwareID")) != null) {
                                    String method_198 = method_2102.method_198();
                                    if (method_198.indexOf(46) <= 0) {
                                        name = class_544.method_1919().method_144();
                                    } else {
                                        name = new StringBuilder().insert(0, method_198.substring(0, method_198.lastIndexOf(46) + 1).replace('.', '/')).append(class_544.method_1919().method_144()).toString();
                                    }
                                }
                                JarEntry jarEntry = new JarEntry(name);
                                if (name.endsWith(".jar")) {
                                    Iterator it = class_544.method_1918().method_16().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z = false;
                                            z2 = false;
                                            break;
                                        } else {
                                            class_566 class_566Var = (class_566) it.next();
                                            if (class_566Var.field_2331.equals(str) && class_566Var.field_2332.equals(nextElement.getName())) {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z && nextElement.getMethod() == 0) {
                                        jarEntry.setMethod(0);
                                        jarEntry.setSize(nextElement.getSize());
                                        jarEntry.setCrc(nextElement.getCrc());
                                    }
                                    if (z2) {
                                        enumeration = entries;
                                        str4 = str3;
                                    }
                                }
                                method_157(jarEntry.getName(), jarOutputStream);
                                try {
                                    jarOutputStream.putNextEntry(jarEntry);
                                    if (class_544.method_1922().method_1959()) {
                                        hashSet.clear();
                                    }
                                    if (!class_544.method_1924().method_1480().method_1855(nextElement.getName())) {
                                        while (true) {
                                            int read = inputStream.read(bArr);
                                            if (read <= 0) {
                                                break;
                                            } else {
                                                jarOutputStream.write(bArr, 0, read);
                                            }
                                        }
                                    } else {
                                        class_351.method_1426(inputStream, jarOutputStream, class_544.method_1924().method_1480().method_1857(nextElement.getName()));
                                    }
                                    jarOutputStream.closeEntry();
                                    str4 = str3;
                                } catch (ZipException e3) {
                                    if (!e3.getMessage().contains("duplicate")) {
                                        throw e3;
                                    }
                                    str4 = str3;
                                }
                            } else {
                                this.field_57.add(str2);
                                enumeration = entries;
                            }
                        }
                    }
                    method_150(vector, jarOutputStream, class_606Var, str);
                    method_150(class_606Var.method_2101(), jarOutputStream, class_606Var, str);
                    jarFile.close();
                    if (class_544.method_1937().method_1678() && !class_544.method_1937().method_1699()) {
                        writeAdvertisement(jarOutputStream);
                    }
                    jarOutputStream.finish();
                    jarOutputStream.close();
                    method_148(new StringBuilder().insert(0, str2).append(".tmp").toString(), str2);
                    return;
                }
            }
        }
        hashSet = hashSet2;
        if (class_544.method_1922().method_1957() != -1) {
        }
        vector = new Vector();
        entries = jarFile.entries();
        String str42 = "";
        while (true) {
            enumeration = entries;
            while (enumeration.hasMoreElements()) {
            }
            method_150(vector, jarOutputStream, class_606Var, str);
            method_150(class_606Var.method_2101(), jarOutputStream, class_606Var, str);
            jarFile.close();
            if (class_544.method_1937().method_1678()) {
                writeAdvertisement(jarOutputStream);
            }
            jarOutputStream.finish();
            jarOutputStream.close();
            method_148(new StringBuilder().insert(0, str2).append(".tmp").toString(), str2);
            return;
        }
    }

    public static boolean method_151(class_31 class_31Var) {
        return class_31Var.field_54;
    }

    public static HashSet method_152(class_31 class_31Var) {
        return class_31Var.field_58;
    }

    public static boolean method_155(class_31 class_31Var, boolean z) {
        class_31Var.field_54 = z;
        return z;
    }

    public void method_150(Vector vector, JarOutputStream jarOutputStream, class_606 class_606Var, String str) {
        int size = vector.size() - 1;
        int i = size;
        int i2 = size;
        while (i >= 0) {
            int i3 = i2 - 1;
            method_158((class_202) vector.get(i2), jarOutputStream, class_606Var, str);
            i = i3;
            i2 = i3;
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0003 */
    public void method_153() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i >= this.field_57.size()) {
                return;
            }
            i = i2 + 1;
            method_149((String) this.field_57.get(i2));
        }
    }

    public void method_148(String str, String str2) {
        File file = new File(str);
        File file2 = new File(str2);
        if (file2.exists() && !file2.delete()) {
            AllatoriLogger.method_681(new StringBuilder().insert(0, "Cannot delete '").append(file2.getPath()).append("'").toString());
        }
        if (file.renameTo(file2)) {
            return;
        }
        AllatoriLogger.method_681(new StringBuilder().insert(0, "Cannot rename '").append(file.getPath()).append("' to '").append(file2.getPath()).append("'").toString());
        AllatoriLogger.method_681(new StringBuilder().insert(0, "Resulting file is '").append(file.getPath()).append("'").toString());
    }

    public String method_154(JarFile jarFile, JarEntry jarEntry) {
        try {
            InputStream inputStream = jarFile.getInputStream(jarEntry);
            class_202 class_202Var = new class_202(new class_543(inputStream, jarEntry.getName()).method_1909());
            inputStream.close();
            return jarEntry.getName().substring(0, (jarEntry.getName().length() - class_202Var.method_198().length()) - 6);
        } catch (Exception e) {
            return "";
        }
    }

    public void method_149(String str) {
        try {
            File file = new File(str);
            Runtime.getRuntime().exec(new StringBuilder().insert(0, "jar -i ").append(file.getName()).toString(), (String[]) null, file.getParentFile());
        } catch (Exception e) {
        }
    }

    // Advertisement Method
    public void writeAdvertisement(JarOutputStream jarOutputStream) {
        if (class_544.method_1937().method_1677() != null) {
            jarOutputStream.setComment(class_544.method_1937().method_1677());
        } else {
            jarOutputStream.setComment("Obfuscation by " + Info.getName() + " " + Info.getWebsiteURL());
        }
    }

    public void method_158(class_202 class_202Var, JarOutputStream jarOutputStream, class_606 class_606Var, String str) {
        String method_198 = class_202Var.method_198();
        String method_2106 = class_606Var.method_2106(new StringBuilder().insert(0, str).append('#').append(class_544.method_1934().field_1933 != null ? class_544.method_1934().field_1933.method_1543(method_198) : method_198).toString());
        if (method_2106 == null) {
            method_2106 = "";
        }
        String sb = new StringBuilder().insert(0, method_2106).append(method_198.replace('.', '/')).append(".class").toString();
        JarEntry jarEntry = new JarEntry(sb);
        method_157(sb, jarOutputStream);
        try {
            jarOutputStream.putNextEntry(jarEntry);
            if (class_202Var.method_920() <= 50) {
                jarOutputStream.write(class_202Var.method_642().method_429());
            } else {
                class_547 class_547Var = new class_547(class_606Var, class_544.method_1934().field_1933);
                class_173 class_173Var = new class_173(class_202Var.method_642().method_429());
                class_33 class_33Var = new class_33(this, 2, class_547Var);
                class_173Var.method_841(class_33Var, 4);
                jarOutputStream.write(class_33Var.method_1789());
            }
            jarOutputStream.closeEntry();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
