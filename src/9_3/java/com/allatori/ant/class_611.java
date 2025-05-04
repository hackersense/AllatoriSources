package com.allatori.ant;

import com.allatori.Obfuscate;
import com.allatori.commons.AllatoriLogger;
import com.sun.kvem.environment.Obfuscator;
import java.io.File;
import java.io.IOException;
import java.util.StringTokenizer;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_611 implements Obfuscator {
    public String field_2412 = "allatori.xml";

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:2:0x004f */
    public String method_2116(File file, String str, String str2, String str3, String str4, String str5, String str6) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<config>\n");
        stringBuffer.append("    <jars>\n");
        stringBuffer.append("        <jar in=\"" + str3 + "\" out=\"" + file.getPath() + "\"/>\n");
        stringBuffer.append("    </jars>\n\n");
        stringBuffer.append("    <classpath>\n");
        StringTokenizer stringTokenizer = new StringTokenizer(str5, System.getProperty("path.separator"));
        while (stringTokenizer.hasMoreTokens()) {
            stringBuffer.append(new StringBuilder().insert(0, "        <jar name=\"").append(stringTokenizer.nextToken()).append("\"/>\n").toString());
        }
        stringBuffer.append("    </classpath>\n\n");
        stringBuffer.append("    <keep-names>\n");
        stringBuffer.append("        <class template=\"class * extends javax.microedition.midlet.MIDlet\"/>\n");
        stringBuffer.append("    </keep-names>\n\n");
        stringBuffer.append("    <property name=\"line-numbers\" value=\"remove\"/>\n");
        stringBuffer.append("    <property name=\"string-encryption\" value=\"disable\"/>\n");
        stringBuffer.append("    <property name=\"member-reorder\" value=\"enable\"/>\n");
        stringBuffer.append("    <property name=\"control-flow-obfuscation\" value=\"enable\"/>\n");
        stringBuffer.append("    <property name=\"local-variables-naming\" value=\"remove\"/>\n");
        stringBuffer.append("</config>\n");
        return stringBuffer.toString();
    }

    public void method_2114(File file, File file2) {
    }

    public void method_2115(File file, String str, String str2, String str3, String str4, String str5, String str6) {
        String sb;
        File file2;
        if (str4.endsWith("/") || str4.endsWith("\\")) {
            sb = new StringBuilder().insert(0, str4).append(this.field_2412).toString();
        } else {
            sb = new StringBuilder().insert(0, str4).append("/").append(this.field_2412).toString();
        }
        File file3 = new File(sb);
        if (file3.exists() && !file3.canWrite()) {
            AllatoriLogger.method_683("Using the existing configuration file.");
            file2 = file3;
        } else {
            try {
                class_344.method_1404(file3, "UTF-8", method_2116(file, str, str2, str3, str4, str5, str6));
                file2 = file3;
            } catch (Exception e) {
                e.printStackTrace();
                throw new IOException();
            }
        }
        try {
            class_544.method_1921(file2.getPath());
            Obfuscate.method_1347();
            class_544.clearF2053();
        } catch (Exception e2) {
            e2.printStackTrace();
            throw new IOException();
        }
    }
}
