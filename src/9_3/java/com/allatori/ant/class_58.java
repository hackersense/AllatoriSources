package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_54;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.zip.ZipFile;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_58 implements Serializable {
    public static final class_58 field_200 = new class_58();
    public class_485[] field_198;
    public String field_199;

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:12:0x007a */
    public static final String method_198() {
        String property = System.getProperty("java.class.path");
        String property2 = System.getProperty("sun.boot.class.path");
        String property3 = System.getProperty("java.ext.dirs");
        ArrayList arrayList = new ArrayList();
        method_225(property, arrayList);
        method_225(property2, arrayList);
        ArrayList arrayList2 = new ArrayList();
        method_225(property3, arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            File file = new File((String) it.next());
            String[] list = file.list(new class_271());
            if (list != null) {
                int i = 0;
                int i2 = 0;
                while (i < list.length) {
                    int i3 = i2 + 1;
                    arrayList.add(new StringBuilder().insert(0, file.getPath()).append(File.separatorChar).append(list[i2]).toString());
                    i = i3;
                    i2 = i3;
                }
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it2 = arrayList.iterator();
        while (true) {
            while (it2.hasNext()) {
                stringBuffer.append((String) it2.next());
                if (it2.hasNext()) {
                    stringBuffer.append(File.pathSeparatorChar);
                }
            }
            return stringBuffer.toString().intern();
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0003 */
    public InputStream method_229(String str) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i < this.field_198.length) {
                InputStream method_229 = this.field_198[i2].method_229(str);
                if (method_229 == null) {
                    i = i2 + 1;
                } else {
                    return method_229;
                }
            } else {
                return null;
            }
        }
    }

    public byte[] method_224(String str) {
        return method_227(str, ".class");
    }

    public class_54 method_231(String str, String str2) {
        int i = 0;
        int i2 = 0;
        while (i < this.field_198.length) {
            class_54 method_231 = this.field_198[i2].method_231(str, str2);
            if (method_231 != null) {
                return method_231;
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        throw new IOException(new StringBuilder().insert(0, "Couldn't find: ").append(str).append(str2).toString());
    }

    public class_58() {
        this(method_198());
    }

    public String method_226(String str, String str2) {
        return method_231(str, str2).method_217();
    }

    public InputStream method_223(String str) {
        return method_230(str.replace('.', '/'), ".class");
    }

    public int hashCode() {
        return this.field_199.hashCode();
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0003 */
    public URL method_228(String str) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i < this.field_198.length) {
                URL method_228 = this.field_198[i2].method_228(str);
                if (method_228 != null) {
                    return method_228;
                }
                i = i2 + 1;
            } else {
                return null;
            }
        }
    }

    public class_54 method_222(String str) {
        return method_231(str, ".class");
    }

    public class_58(String str) {
        this.field_199 = str;
        ArrayList arrayList = new ArrayList();
        StringTokenizer stringTokenizer = new StringTokenizer(str, System.getProperty("path.separator"));
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (!nextToken.equals("")) {
                File file = new File(nextToken);
                try {
                    if (file.exists()) {
                        if (file.isDirectory()) {
                            arrayList.add(new class_182(nextToken));
                        } else {
                            arrayList.add(new class_85(new ZipFile(file)));
                        }
                    }
                } catch (IOException e) {
                    System.err.println(new StringBuilder().insert(0, "CLASSPATH component ").append(file).append(": ").append(e).toString());
                }
            }
        }
        this.field_198 = new class_485[arrayList.size()];
        arrayList.toArray(this.field_198);
    }

    public static final void method_225(String str, List list) {
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, File.pathSeparator);
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                if (new File(nextToken).exists()) {
                    list.add(nextToken);
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof class_58) {
            return this.field_199.equals(((class_58) obj).field_199);
        }
        return false;
    }

    public String method_199(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        String str2 = "";
        if (lastIndexOf > 0) {
            str2 = str.substring(lastIndexOf);
            str = str.substring(0, lastIndexOf);
        }
        return method_226(str, str2);
    }

    public InputStream method_230(String str, String str2) {
        InputStream inputStream;
        InputStream inputStream2;
        try {
            InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream(new StringBuilder().insert(0, str).append(str2).toString());
            inputStream = resourceAsStream;
            inputStream2 = resourceAsStream;
        } catch (Exception e) {
            inputStream = null;
            inputStream2 = null;
        }
        if (inputStream == null) {
            return method_231(str, str2).method_218();
        }
        return inputStream2;
    }

    public byte[] method_227(String str, String str2) {
        DataInputStream dataInputStream = null;
        try {
            InputStream method_230 = method_230(str, str2);
            if (method_230 != null) {
                DataInputStream dataInputStream2 = new DataInputStream(method_230);
                try {
                    byte[] bArr = new byte[method_230.available()];
                    dataInputStream2.readFully(bArr);
                    if (dataInputStream2 != null) {
                        dataInputStream2.close();
                    }
                    return bArr;
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        dataInputStream.close();
                    }
                    throw th;
                }
            }
            throw new IOException(new StringBuilder().insert(0, "Couldn't find: ").append(str).append(str2).toString());
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
