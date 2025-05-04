package com.allatori.ant;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_534 {
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:2:0x0007 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fe A[LOOP:1: B:5:0x0016->B:87:0x01fe, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void method_1898(BufferedReader bufferedReader, class_220 class_220Var, PrintWriter printWriter) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        String str;
        StringBuilder sb;
        int indexOf;
        class_220 class_220Var2;
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                int i11 = 0;
                int length = readLine.length();
                sb2.setLength(0);
                while (true) {
                    int i12 = i11;
                    int i13 = i11;
                    while (i12 < length && !Character.isJavaIdentifierStart(readLine.charAt(i13))) {
                        int i14 = i13 + 1;
                        i12 = i14;
                        i13 = i14;
                    }
                    int i15 = i13;
                    int i16 = i13;
                    while (i15 < length && (Character.isJavaIdentifierPart(readLine.charAt(i16)) || readLine.charAt(i16) == '.' || readLine.charAt(i16) == '-' || readLine.charAt(i16) == '<' || readLine.charAt(i16) == '>')) {
                        int i17 = i16 + 1;
                        i15 = i17;
                        i16 = i17;
                    }
                    int i18 = i16;
                    int i19 = i16;
                    while (i18 < length && readLine.charAt(i19) == ' ') {
                        int i20 = i19 + 1;
                        i18 = i20;
                        i19 = i20;
                    }
                    if (i19 >= length || readLine.charAt(i19) != '(') {
                        if (i19 < length && readLine.charAt(i19) == ':') {
                            i2 = i19 + 1;
                            int i21 = i2;
                            int i22 = i2;
                            while (i21 < length && Character.isDigit(readLine.charAt(i22))) {
                                int i23 = i22 + 1;
                                i21 = i23;
                                i22 = i23;
                            }
                            i = i22;
                            i3 = -1;
                            i4 = -1;
                            i5 = i22;
                        } else {
                            i = -1;
                            i2 = -1;
                            i3 = -1;
                            i4 = -1;
                            i5 = i19;
                        }
                    } else {
                        i4 = i19 + 1;
                        int i24 = i4;
                        i8 = i4;
                        while (i24 < length && Character.isLetter(readLine.charAt(i8))) {
                            int i25 = i8 + 1;
                            i24 = i25;
                            i8 = i25;
                        }
                        if (i8 < length && readLine.charAt(i8) == ':') {
                            i2 = i8 + 1;
                            int i26 = i2;
                            int i27 = i2;
                            while (i26 < length && Character.isDigit(readLine.charAt(i27))) {
                                int i28 = i27 + 1;
                                i26 = i28;
                                i27 = i28;
                            }
                            i6 = i16;
                            i7 = i27;
                            i9 = i27;
                            if (i6 > i13) {
                                sb2.append(readLine.substring(i11, i9));
                            } else {
                                String substring = readLine.substring(i13, i16);
                                if (class_220Var.method_1051(substring)) {
                                    sb2.append(readLine.substring(i11, i13));
                                    if (i7 <= i2) {
                                        sb2.append(class_220Var.method_1053(substring));
                                        i10 = i8;
                                    } else {
                                        int i29 = -1;
                                        try {
                                            i29 = class_220Var.field_822.indexOf(Integer.valueOf(readLine.substring(i2, i7)));
                                            class_220Var2 = class_220Var;
                                        } catch (NumberFormatException e) {
                                            class_220Var2 = class_220Var;
                                        }
                                        String method_1050 = class_220Var2.method_1050(substring, i29);
                                        if (method_1050 == null) {
                                            method_1050 = class_220Var.method_1053(substring);
                                        }
                                        sb2.append(method_1050);
                                        i10 = i8;
                                    }
                                    if (i10 > i4) {
                                        String substring2 = readLine.substring(i4, i8);
                                        sb2.append(readLine.substring(i16, i4));
                                        if (class_220Var.field_821.method_1547(substring2)) {
                                            substring2 = class_220Var.field_821.method_1543(substring2);
                                        }
                                        sb2.append(substring2);
                                        if (i7 <= i2) {
                                            sb2.append(readLine.substring(i8, i9));
                                        }
                                    }
                                    if (i7 > i2) {
                                        String substring3 = readLine.substring(i2, i7);
                                        try {
                                            indexOf = class_220Var.field_822.indexOf(Integer.valueOf(substring3));
                                        } catch (NumberFormatException e2) {
                                        }
                                        if (indexOf >= 0) {
                                            str = new StringBuilder().insert(0, "").append(indexOf).toString();
                                            if (i8 <= i4) {
                                                sb2.append(readLine.substring(i8, i2));
                                                sb = sb2;
                                            } else {
                                                sb2.append(readLine.substring(i16, i2));
                                                sb = sb2;
                                            }
                                            sb.append(str);
                                            sb2.append(readLine.substring(i7, i9));
                                        }
                                        str = substring3;
                                        if (i8 <= i4) {
                                        }
                                        sb.append(str);
                                        sb2.append(readLine.substring(i7, i9));
                                    }
                                    if (i8 <= i4 && i7 <= i2) {
                                        sb2.append(readLine.substring(i16, i9));
                                    }
                                } else if ((substring.indexOf(46) > 0 || substring.length() > 3) && class_220Var.field_823.method_1547(substring)) {
                                    sb2.append(readLine.substring(i11, i13));
                                    sb2.append(class_220Var.field_823.method_1543(substring));
                                    sb2.append(readLine.substring(i16, i9));
                                } else {
                                    sb2.append(readLine.substring(i11, i9));
                                }
                            }
                            if (i9 < length) {
                                break;
                            } else {
                                i11 = i9;
                            }
                        } else {
                            i = -1;
                            i2 = -1;
                            i3 = i8;
                            i5 = i8;
                        }
                    }
                    i6 = i16;
                    i7 = i;
                    i8 = i3;
                    i9 = i5;
                    if (i6 > i13) {
                    }
                    if (i9 < length) {
                    }
                }
                printWriter.println(method_1896(sb2.toString(), class_220Var));
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:25:0x0101 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void method_1897(BufferedReader bufferedReader, class_220 class_220Var, PrintWriter printWriter) {
        boolean z;
        String sb;
        PrintWriter printWriter2;
        String str;
        class_220 class_220Var2;
        Pattern compile = Pattern.compile("(.*(?:at|Frame)\\s+)(.*)\\((.*)\\)(.*)");
        Pattern compile2 = Pattern.compile("(.*syslog:\\s+)(.*?)\\((.*)\\)(.*)");
        Pattern compile3 = Pattern.compile("(\\s*)(.*?)\\((.*)\\)(.*)");
        Pattern compile4 = Pattern.compile("(.*?\\s+)((?:\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*\\.)+\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*):(\\d+)(\\s+.*)");
        Pattern compile5 = Pattern.compile("(.*lock.*a\\s+)(.*?)(\\).*)");
        String str2 = null;
        String str3 = null;
        String str4 = null;
        BufferedReader bufferedReader2 = bufferedReader;
        String str5 = null;
        while (true) {
            String readLine = bufferedReader2.readLine();
            if (readLine != null) {
                boolean z2 = false;
                Matcher matcher = compile.matcher(readLine);
                if (matcher.matches()) {
                    z2 = true;
                    str2 = matcher.group(1);
                    String group = matcher.group(2);
                    if (group.indexOf(40) > 0) {
                        group = group.substring(0, group.indexOf(40));
                    }
                    str4 = matcher.group(3);
                    str5 = matcher.group(4);
                    str3 = group;
                }
                if (!z2) {
                    Matcher matcher2 = compile2.matcher(readLine);
                    if (matcher2.matches()) {
                        z = true;
                        str2 = matcher2.group(1);
                        str3 = matcher2.group(2);
                        str4 = matcher2.group(3);
                        str5 = matcher2.group(4);
                        if (!z) {
                            Matcher matcher3 = compile3.matcher(readLine);
                            if (matcher3.matches()) {
                                z = true;
                                str2 = matcher3.group(1);
                                str3 = matcher3.group(2);
                                str4 = matcher3.group(3);
                                str5 = matcher3.group(4);
                            }
                        }
                        if (z) {
                            Matcher matcher4 = compile4.matcher(readLine);
                            if (matcher4.matches()) {
                                str2 = matcher4.group(1);
                                String group2 = matcher4.group(2);
                                str4 = matcher4.group(3);
                                str5 = matcher4.group(4);
                                if (class_220Var.field_823.method_1547(group2)) {
                                    try {
                                        readLine = new StringBuilder().insert(0, str2).append(class_220Var.field_823.method_1543(group2)).append(":").append(class_220Var.field_822.indexOf(Integer.valueOf(str4))).append(str5).toString();
                                    } catch (Exception e) {
                                    }
                                    printWriter.println(readLine);
                                    bufferedReader2 = bufferedReader;
                                }
                            }
                        }
                        if (!z) {
                            if (class_220Var.method_1051(str3)) {
                                boolean z3 = false;
                                if (str4.startsWith("(Compiled Method)")) {
                                    z3 = true;
                                    str = str4.substring(17);
                                } else {
                                    str = str4;
                                }
                                int i = -1;
                                if (str.indexOf(58) < 0) {
                                    if (class_220Var.field_821.method_1547(str)) {
                                        str = class_220Var.field_821.method_1543(str);
                                    }
                                    class_220Var2 = class_220Var;
                                } else {
                                    String substring = str.substring(0, str.indexOf(58));
                                    String substring2 = str.substring(str.indexOf(58) + 1);
                                    if (class_220Var.field_821.method_1547(substring)) {
                                        substring = class_220Var.field_821.method_1543(substring);
                                    }
                                    try {
                                        i = class_220Var.field_822.indexOf(Integer.valueOf(substring2));
                                        if (i >= 0) {
                                            substring2 = new StringBuilder().insert(0, "").append(i).toString();
                                        }
                                    } catch (NumberFormatException e2) {
                                    }
                                    str = new StringBuilder().insert(0, substring).append(":").append(substring2).toString();
                                    class_220Var2 = class_220Var;
                                }
                                String method_1050 = class_220Var2.method_1050(str3, i);
                                if (method_1050 == null) {
                                    method_1050 = class_220Var.method_1053(str3);
                                }
                                sb = new StringBuilder().insert(0, str2).append(method_1050).append(z3 ? "(Compiled Method)" : "").append("(").append(str).append(")").append(str5).toString();
                                printWriter2 = printWriter;
                                printWriter2.println(sb);
                                bufferedReader2 = bufferedReader;
                                str4 = str;
                            }
                        } else {
                            Matcher matcher5 = compile5.matcher(readLine);
                            if (matcher5.matches() && class_220Var.field_823.method_1547(matcher5.group(2))) {
                                sb = new StringBuilder().insert(0, matcher5.group(1)).append(class_220Var.field_823.method_1543(matcher5.group(2))).append(matcher5.group(3)).toString();
                                printWriter2 = printWriter;
                                str = str4;
                                printWriter2.println(sb);
                                bufferedReader2 = bufferedReader;
                                str4 = str;
                            }
                        }
                        sb = readLine;
                        printWriter2 = printWriter;
                        str = str4;
                        printWriter2.println(sb);
                        bufferedReader2 = bufferedReader;
                        str4 = str;
                    }
                }
                z = z2;
                if (!z) {
                }
                if (z) {
                }
                if (!z) {
                }
                sb = readLine;
                printWriter2 = printWriter;
                str = str4;
                printWriter2.println(sb);
                bufferedReader2 = bufferedReader;
                str4 = str;
            } else {
                return;
            }
        }
    }

    public static String method_1896(String str, class_220 class_220Var) {
        Matcher matcher = Pattern.compile("L(.*?);").matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            String replace = group.replace('/', '.');
            if (class_220Var.field_823.method_1547(replace)) {
                str = str.replace(group, class_220Var.field_823.method_1543(replace).replace('.', '/'));
            }
        }
        return str;
    }
}
