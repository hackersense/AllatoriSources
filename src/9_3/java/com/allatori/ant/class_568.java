package com.allatori.ant;

import com.allatori.commons.AllatoriLogger;
import com.allatori.commons.Info;
import com.allatori.interfaces.unmapped.class_555;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Collections;
import java.util.Vector;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_568 {
    public static StringBuilder field_2335 = new StringBuilder(4096);

    public static void method_2005(PrintWriter printWriter) {
        printWriter.println("</allatori>");
    }

    public static void method_2006(PrintWriter printWriter) {
        printWriter.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        printWriter.println("<!--\n   " + Info.getName() + " " + Info.getVersion() + "\n   Web: " + Info.getWebsiteURL() + "\n\n   Log created: " + Calendar.getInstance().getTime() + "\n-->\n");
        if (field_2335.length() > 0) {
            printWriter.println(new StringBuilder().insert(0, "<!--\n").append((Object) field_2335).append("-->\n").toString());
        }
        printWriter.println(new StringBuilder().insert(0, "<!--\n").append(class_525.field_1997).append(" classes renamed\n").append(class_525.field_1996).append(" methods renamed\n").append(class_525.field_1998).append(" fields renamed\n\n").append(class_116.field_570 + class_116.field_551 + class_116.field_563 + class_116.field_541).append(" local variables optimized:\n").append("   ").append(class_116.field_551).append(" merged and removed\n").append("   ").append(class_116.field_570).append(" removed (unused)\n").append("   ").append(class_116.field_563).append(" removed (assigned a value but never used)\n").append("   ").append(class_116.field_541).append(" usage optimized\n").append("-->\n").toString());
        printWriter.println("<allatori>");
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [384=4, 524=5, 462=5] */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:23:0x00cf */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x0086 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:37:0x00b4 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:39:0x00b7 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:48:0x0088 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:8:0x001d */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.io.PrintWriter] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.PrintWriter] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v16, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.PrintWriter] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.PrintWriter] */
    public static void method_2004() {
        PrintWriter r1;
        String method_1956 = class_544.method_1922().method_1956();
        if (method_1956 == null) {
            AllatoriLogger.method_681("Log file is not set.");
            field_2335.delete(0, field_2335.length());
            return;
        }
        int r2 = 0;
        r2 = 0;
        try {
        } catch (Throwable th) {
            th = th;
//            r2 = r1;
        }
        try {
            try {
                r1 = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(method_1956), "UTF-8"), class_555.field_2163));
            } catch (FileNotFoundException e) {
                r1 = null;
            } catch (Exception e2) {
//                e = e2;
                r1 = null;
            }
            try {
                method_2006(r1);
                method_2008(r1, class_544.method_1934().field_1932);
                method_2005(r1);
                r1.flush();
                StringBuilder r0 = field_2335;
                r2 = field_2335.length();
                r0.delete(0, r2);
                try {
                    r1.close();
                } catch (Exception e3) {
                }
            } catch (FileNotFoundException e4) {
                AllatoriLogger.method_678(new StringBuilder().insert(0, "Cannot write log to '").append(method_1956).append("' file.").toString());
                field_2335.delete(0, field_2335.length());
                try {
                    r1.close();
                } catch (Exception e5) {
                }
            } catch (Exception e6) {
                AllatoriLogger.method_678("Writing log file failed with exception: ");
                e6.printStackTrace();
            }
        } catch (Throwable th2) {
//            th = th2;
            field_2335.delete(0, field_2335.length());
            try {
//                r2.close();
            } catch (Exception e8) {
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:15:0x010e */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:19:0x014b */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:4:0x0081 */
    public static void method_2008(PrintWriter printWriter, class_283 class_283Var) {
        printWriter.println(" <mapping>");
        Vector vector = new Vector(class_283Var.field_1000.method_1544());
        Vector vector2 = new Vector(class_283Var.field_997.method_1544());
        Vector vector3 = new Vector(class_283Var.field_999.method_1544());
        Collections.sort(vector2);
        Collections.sort(vector3);
        int size = vector.size() - 1;
        int i = size;
        int i2 = size;
        while (i >= 0) {
            String str = (String) vector.get(i2);
            printWriter.println("  <class old=\"" + str + "\" new=\"" + class_283Var.field_1000.method_1543(str) + "\">");
            String sb = new StringBuilder().insert(0, str).append("&").toString();
            int method_2007 = method_2007(vector2, sb);
            while (method_2007 < vector2.size()) {
                String str2 = (String) vector2.get(method_2007);
                if (!str2.startsWith(sb)) {
                    break;
                }
                String substring = str2.substring(str2.indexOf("&") + 1, str2.lastIndexOf("&"));
                if (!"<init>".equals(substring) && !"<clinit>".equals(substring)) {
                    String substring2 = str2.substring(str2.lastIndexOf("&") + 1);
                    if (class_283Var.field_1001.method_1547(str2)) {
                        printWriter.println(new StringBuilder().insert(0, "   <method old=\"").append(substring).append(substring2).append("\" new=\"").append(class_283Var.field_997.method_1543(str2)).append(class_283Var.field_1001.method_1543(str2)).append("\"/>").toString());
                        class_283Var.field_1001.method_1545(str2);
                    } else {
                        printWriter.println(new StringBuilder().insert(0, "   <method old=\"").append(substring).append(substring2).append("\" new=\"").append(class_283Var.field_997.method_1543(str2)).append("\"/>").toString());
                    }
                    vector2.remove(method_2007);
                } else {
                    vector2.remove(method_2007);
                }
            }
            int method_20072 = method_2007(vector3, sb);
            while (method_20072 < vector3.size()) {
                String str3 = (String) vector3.get(method_20072);
                if (str3.startsWith(sb)) {
                    printWriter.println(new StringBuilder().insert(0, "   <field old=\"").append(str3.substring(str3.indexOf("&") + 1, str3.lastIndexOf("&"))).append(" ").append(str3.substring(str3.lastIndexOf("&") + 1)).append("\" new=\"").append(class_283Var.field_999.method_1543(str3)).append("\"/>").toString());
                    vector3.remove(method_20072);
                }
            }
            int i3 = i2 - 1;
            printWriter.println("  </class>");
            i = i3;
            i2 = i3;
        }
        Vector vector4 = new Vector(class_283Var.field_998.method_1544());
        if (vector4.size() > 0) {
            printWriter.println("  <annotations>");
            int size2 = vector4.size() - 1;
            int i4 = size2;
            int i5 = size2;
            while (i4 >= 0) {
                String str4 = (String) vector4.get(i5);
                String method_1543 = class_283Var.field_998.method_1543(str4);
                String substring3 = str4.substring(str4.indexOf("&") + 1);
                String substring4 = str4.substring(0, str4.indexOf("&"));
                if (!"<init>".equals(substring3) && !"<clinit>".equals(substring3)) {
                    printWriter.println(new StringBuilder().insert(0, "   <annotation oldClassName=\"").append(substring4).append("\" oldMethodName=\"").append(substring3).append("\" newMethodName=\"").append(method_1543).append("\"/>").toString());
                }
                int i6 = i5 - 1;
                i4 = i6;
                i5 = i6;
            }
            printWriter.println("  </annotations>");
        }
        printWriter.println("  <sources>");
        int size3 = class_283Var.field_1002.size() - 1;
        int i7 = size3;
        int i8 = size3;
        while (i7 >= 0) {
            class_83 class_83Var = (class_83) class_283Var.field_1002.get(i8);
            int i9 = i8 - 1;
            printWriter.println(new StringBuilder().insert(0, "   <source old=\"").append(class_83Var.field_339).append("\" new=\"").append(class_83Var.field_338).append("\"/>").toString());
            i7 = i9;
            i8 = i9;
        }
        printWriter.println("  </sources>");
        printWriter.println("  <lines>");
        int i10 = 0;
        int i11 = 0;
        while (i10 < class_283Var.field_996.size()) {
            int i12 = i11 + 1;
            printWriter.println(new StringBuilder().insert(0, "   <line l=\"").append(class_283Var.field_996.get(i11)).append("\"/>").toString());
            i10 = i12;
            i11 = i12;
        }
        printWriter.println("  </lines>");
        printWriter.println(" </mapping>");
    }

    public static int method_2007(Vector vector, String str) {
        int i = 0;
        int size = vector.size() - 1;
        while (i <= size) {
            int i2 = (i + size) >> 1;
            int compareTo = ((Comparable) vector.get(i2)).compareTo(str);
            if (compareTo >= 0) {
                if (compareTo <= 0) {
                    return i2;
                }
                size = i2 - 1;
            } else {
                i = i2 + 1;
            }
        }
        return i;
    }
}
