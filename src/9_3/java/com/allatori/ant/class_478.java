package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.interfaces.unmapped.class_555;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_478 implements ASMInterface {
    public static String field_1934;
    public static class_499 field_1937;
    public static String field_1938;
    public class_440 field_1935;
    public String field_1936;

    public static String method_1829(int i) {
        return new StringBuilder().insert(0, "<A HREF=\"").append(field_1938).append("_cp.html#cp").append(i).append("\" TARGET=ConstantPool>").append(class_204.method_971(class_204.method_957(field_1937.method_1845(i, (byte) 7)), field_1934 + ".", true)).append("</A>").toString();
    }

    public static void method_1661(String[] strArr) {
        class_543 class_543Var;
        String[] strArr2 = new String[strArr.length];
        String str = null;
        char c = System.getProperty("file.separator").toCharArray()[0];
        String sb = new StringBuilder().insert(0, ".").append(c).toString();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < strArr.length) {
            try {
                if (strArr[i3].charAt(0) == '-') {
                    if (!strArr[i3].equals("-d")) {
                        if (strArr[i3].equals("-zip")) {
                            i3++;
                            str = strArr[i3];
                        } else {
                            System.out.println(new StringBuilder().insert(0, "Unknown option ").append(strArr[i3]).toString());
                        }
                    } else {
                        i3++;
                        String str2 = strArr[i3];
                        if (!str2.endsWith("" + c)) {
                            str2 = new StringBuilder().insert(0, str2).append(c).toString();
                        }
                        new File(str2).mkdirs();
                        sb = str2;
                    }
                } else {
                    int i4 = i2 + 1;
                    strArr2[i2] = strArr[i3];
                    i2 = i4;
                }
                int i5 = i3 + 1;
                i = i5;
                i3 = i5;
            } catch (Exception e) {
                System.out.println(e);
                e.printStackTrace(System.out);
                return;
            }
        }
        if (i2 != 0) {
            for (int i6 = 0; i6 < i2; i6++) {
                System.out.print(new StringBuilder().insert(0, "Processing ").append(strArr2[i6]).append("...").toString());
                if (str == null) {
                    class_543Var = new class_543(strArr2[i6]);
                } else {
                    class_543Var = new class_543(str, strArr2[i6]);
                }
                new class_478(class_543Var.method_1909(), sb);
                System.out.println("Done.");
            }
            return;
        }
        System.err.println("Class2HTML: No input files specified.");
    }

    public class_478(class_440 class_440Var, String str) throws FileNotFoundException {
        class_557[] method_904 = class_440Var.method_904();
        this.field_1935 = class_440Var;
        this.field_1936 = str;
        field_1938 = class_440Var.method_546();
        field_1937 = class_440Var.method_502();
        int lastIndexOf = field_1938.lastIndexOf(46);
        if (lastIndexOf <= -1) {
            field_1934 = "";
        } else {
            field_1934 = field_1938.substring(0, lastIndexOf);
        }
        class_608 class_608Var = new class_608(str, field_1938, field_1934, method_904, field_1937);
        class_110 class_110Var = new class_110(str, field_1938, field_1937, class_608Var);
        new class_597(str, field_1938, method_904, class_440Var.method_898(), class_608Var, class_110Var);
        method_1831(class_110Var);
        new class_579(str, field_1938, method_904, field_1937, class_608Var);
        class_110Var.method_97();
    }

    public static String method_1830(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            try {
                char charAt = str.charAt(i);
                switch (charAt) {
                    case '\n':
                        stringBuffer.append("\\n");
                        break;
                    case class_555.field_2278 /* 13 */:
                        stringBuffer.append("\\r");
                        break;
                    case '<':
                        stringBuffer.append("&lt;");
                        break;
                    case '>':
                        stringBuffer.append("&gt;");
                        break;
                    default:
                        stringBuffer.append(charAt);
                        break;
                }
            } catch (StringIndexOutOfBoundsException e) {
            }
        }
        return stringBuffer.toString();
    }

    public void method_1831(class_110 class_110Var) {
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(new StringBuilder().insert(0, this.field_1936).append(field_1938).append(".html").toString()));
        class_160[] method_906 = this.field_1935.method_906();
        printWriter.println("<HTML>\n<HEAD><TITLE>Documentation for " + field_1938 + "</TITLE></HEAD>\n<FRAMESET BORDER=1 cols=\"30%,*\">\n<FRAMESET BORDER=1 rows=\"80%,*\">\n<FRAME NAME=\"ConstantPool\" SRC=\"" + field_1938 + "_cp.html\"\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\">\n<FRAME NAME=\"Attributes\" SRC=\"" + field_1938 + "_attributes.html\"\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\">\n</FRAMESET>\n<FRAMESET BORDER=1 rows=\"80%,*\">\n<FRAME NAME=\"Code\" SRC=\"" + field_1938 + "_code.html\"\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUTO\">\n<FRAME NAME=\"Methods\" SRC=\"" + field_1938 + "_methods.html\"\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUTO\">\n</FRAMESET></FRAMESET></HTML>");
        printWriter.close();
        int i = 0;
        int i2 = 0;
        while (i < method_906.length) {
            int i3 = i2 + 1;
            class_110Var.method_614(method_906[i2], new StringBuilder().insert(0, "class").append(i2).toString());
            i = i3;
            i2 = i3;
        }
    }

    public static final String method_199(String str) {
        String method_971 = class_204.method_971(class_204.method_957(str), field_1934 + ".", true);
        int indexOf = str.indexOf(91);
        String substring = indexOf > -1 ? str.substring(0, indexOf) : str;
        return (substring.equals("int") || substring.equals("short") || substring.equals("boolean") || substring.equals("void") || substring.equals("char") || substring.equals("byte") || substring.equals("long") || substring.equals("double") || substring.equals("float")) ? new StringBuilder().insert(0, "<FONT COLOR=\"#00FF00\">").append(str).append("</FONT>").toString() : new StringBuilder().insert(0, "<A HREF=\"").append(substring).append(".html\" TARGET=_top>").append(method_971).append("</A>").toString();
    }
}
