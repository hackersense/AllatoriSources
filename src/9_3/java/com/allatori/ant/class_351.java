package com.allatori.ant;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_351 {
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:34:0x019e */
    public static String method_1428(String str, String str2) {
        String str3;
        String str4;
        if (str == null) {
            str = "";
        }
        if (str.length() <= 0) {
            str3 = str2;
            str4 = str2;
        } else {
            if (!str2.startsWith(str)) {
                return str2;
            }
            String substring = str2.substring(str.length());
            str3 = substring;
            str4 = substring;
        }
        String[] split = str3.split("/");
        String str5 = split[split.length - 1];
        String str6 = "";
        if (str5.contains(".")) {
            str6 = str5.substring(str5.indexOf(46));
            str5 = str5.substring(0, str5.indexOf(46));
        }
        int i = 0;
        int i2 = 0;
        String str7 = "";
        while (i < split.length - 1) {
            int i3 = i2 + 1;
            str7 = new StringBuilder().insert(0, str7).append(split[i2]).append('.').toString();
            i = i3;
            i2 = i3;
        }
        String sb = new StringBuilder().insert(0, str7).append(str5).toString();
        if (!class_544.method_1934().field_1932.field_1000.method_1547(sb)) {
            while (str5.contains("_")) {
                str6 = new StringBuilder().insert(0, str5.substring(str5.lastIndexOf(95))).append(str6).toString();
                str5 = str5.substring(0, str5.lastIndexOf(95));
                String sb2 = new StringBuilder().insert(0, str7).append(str5).toString();
                if (class_544.method_1934().field_1932.field_1000.method_1547(sb2)) {
                    return new StringBuilder().insert(0, str).append(class_544.method_1934().field_1932.field_1000.method_1543(sb2).replace('.', '/')).append(str6).toString();
                }
            }
            int length = split.length - 2;
            int i4 = length;
            int i5 = length;
            while (i4 >= 0) {
                int i6 = 0;
                int i7 = 0;
                String str8 = "";
                while (i6 < i5) {
                    int i8 = i7 + 1;
                    str8 = new StringBuilder().insert(0, str8).append(split[i7]).append('.').toString();
                    i6 = i8;
                    i7 = i8;
                }
                String sb3 = new StringBuilder().insert(0, str8).append(split[i5]).toString();
                if (class_544.method_1934().field_1931.method_1547(sb3) && !sb3.equals(class_544.method_1934().field_1931.method_1543(sb3))) {
                    String sb4 = new StringBuilder().insert(0, str).append(class_544.method_1934().field_1931.method_1543(sb3).replace('.', '/')).toString();
                    int i9 = i5 + 1;
                    while (true) {
                        int i10 = i9;
                        if (i9 > split.length - 1) {
                            return sb4;
                        }
                        i9 = i10 + 1;
                        sb4 = new StringBuilder().insert(0, sb4).append('/').append(split[i10]).toString();
                    }
                } else {
                    int i11 = i5 - 1;
                    i4 = i11;
                    i5 = i11;
                }
            }
            return new StringBuilder().insert(0, str).append(str4).toString();
        }
        return new StringBuilder().insert(0, str).append(class_544.method_1934().field_1932.field_1000.method_1543(sb).replace('.', '/')).append(str6).toString();
    }

    public static void method_1426(InputStream inputStream, OutputStream outputStream, String str) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, str));
        method_1427(bufferedReader, bufferedWriter);
        bufferedWriter.flush();
        outputStream.flush();
    }

    public static void method_1427(Reader reader, Writer writer) {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            int read = reader.read();
            if (read < 0) {
                method_1429(writer, stringBuffer.toString());
                return;
            }
            char c = (char) read;
            if (stringBuffer.length() != 0) {
                if (Character.isJavaIdentifierPart(c) || c == '.' || c == '-') {
                    stringBuffer.append(c);
                } else {
                    method_1429(writer, stringBuffer.toString());
                    stringBuffer.setLength(0);
                    writer.write(c);
                }
            } else if (!Character.isJavaIdentifierStart(c)) {
                writer.write(c);
            } else {
                stringBuffer.append(c);
            }
        }
    }

    public static void method_1429(Writer writer, String str) {
        String method_1543 = class_544.method_1934().field_1932.field_1000.method_1543(str);
        if (method_1543 == null) {
            writer.write(str);
        } else {
            writer.write(method_1543);
        }
    }
}
