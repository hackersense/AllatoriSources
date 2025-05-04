package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;

import java.io.FileOutputStream;
import java.io.PrintWriter;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_597 implements ASMInterface {
    public class_110 field_2386;
    public PrintWriter field_2387;
    public class_608 field_2388;
    public String field_2389;

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:6:0x005a */
    public class_597(String str, String str2, class_557[] class_557VarArr, class_261[] class_261VarArr, class_608 class_608Var, class_110 class_110Var) {
        int i = 0;
        this.field_2389 = str2;
        this.field_2386 = class_110Var;
        this.field_2388 = class_608Var;
        this.field_2387 = new PrintWriter(new FileOutputStream(new StringBuilder().insert(0, str).append(str2).append("_methods.html").toString()));
        this.field_2387.println("<HTML><BODY BGCOLOR=\"#C0C0C0\"><TABLE BORDER=0>");
        this.field_2387.println("<TR><TH ALIGN=LEFT>Access&nbsp;flags</TH><TH ALIGN=LEFT>Type</TH><TH ALIGN=LEFT>Field&nbsp;name</TH></TR>");
        int i2 = 0;
        int i3 = 0;
        while (i2 < class_261VarArr.length) {
            int i4 = i3 + 1;
            method_926(class_261VarArr[i3]);
            i2 = i4;
            i3 = i4;
        }
        this.field_2387.println("</TABLE>");
        this.field_2387.println("<TABLE BORDER=0><TR><TH ALIGN=LEFT>Access&nbsp;flags</TH><TH ALIGN=LEFT>Return&nbsp;type</TH><TH ALIGN=LEFT>Method&nbsp;name</TH><TH ALIGN=LEFT>Arguments</TH></TR>");
        while (true) {
            int i5 = i;
            if (i >= class_557VarArr.length) {
                this.field_2387.println("</TABLE></BODY></HTML>");
                this.field_2387.close();
                return;
            } else {
                i = i5 + 1;
                method_911(class_557VarArr[i5], i5);
            }
        }
    }

    public void method_926(class_261 class_261Var) {
        String method_970 = class_204.method_970(class_261Var.method_546());
        String method_464 = class_261Var.method_464();
        this.field_2387.print(new StringBuilder().insert(0, "<TR><TD><FONT COLOR=\"#FF0000\">").append(class_204.method_960(class_204.method_932(class_261Var.method_433()), " ", "&nbsp;")).append("</FONT></TD>\n<TD>").append(class_478.method_199(method_970)).append("</TD><TD><A NAME=\"field").append(method_464).append("\">").append(method_464).append("</A></TD>").toString());
        class_160[] method_906 = class_261Var.method_906();
        int i = 0;
        int i2 = 0;
        while (i < method_906.length) {
            int i3 = i2 + 1;
            this.field_2386.method_614(method_906[i2], new StringBuilder().insert(0, method_464).append("@").append(i2).toString());
            i = i3;
            i2 = i3;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= method_906.length) {
                break;
            }
            if (method_906[i5].method_619() != 1) {
                int i6 = i5 + 1;
                i4 = i6;
                i5 = i6;
            } else {
                this.field_2387.print(new StringBuilder().insert(0, "<TD>= <A HREF=\"").append(this.field_2389).append("_attributes.html#").append(method_464).append("@").append(i5).append("\" TARGET=\"Attributes\">").append(((class_257) method_906[i5]).toString()).append("</TD>\n").toString());
                break;
            }
        }
        this.field_2387.println("</TR>");
    }

    public final void method_911(class_557 class_557Var, int i) {
        String method_546 = class_557Var.method_546();
        String[] method_969 = class_204.method_969(method_546, false);
        String method_934 = class_204.method_934(method_546, false);
        String method_464 = class_557Var.method_464();
        String method_932 = class_204.method_932(class_557Var.method_433());
        class_160[] method_906 = class_557Var.method_906();
        String method_960 = class_204.method_960(method_932, " ", "&nbsp;");
        String method_1830 = class_478.method_1830(method_464);
        this.field_2387.print(new StringBuilder().insert(0, "<TR VALIGN=TOP><TD><FONT COLOR=\"#FF0000\"><A NAME=method").append(i).append(">").append(method_960).append("</A></FONT></TD>").toString());
        this.field_2387.print(new StringBuilder().insert(0, "<TD>").append(class_478.method_199(method_934)).append("</TD><TD>").append("<A HREF=").append(this.field_2389).append("_code.html#method").append(i).append(" TARGET=Code>").append(method_1830).append("</A></TD>\n<TD>(").toString());
        int i2 = 0;
        int i3 = 0;
        while (i2 < method_969.length) {
            this.field_2387.print(class_478.method_199(method_969[i3]));
            if (i3 < method_969.length - 1) {
                this.field_2387.print(", ");
            }
            int i4 = i3 + 1;
            i2 = i4;
            i3 = i4;
        }
        this.field_2387.print(")</TD></TR>");
        int i5 = 0;
        int i6 = 0;
        while (i5 < method_906.length) {
            this.field_2386.method_616(method_906[i6], new StringBuilder().insert(0, "method").append(i).append("@").append(i6).toString(), i);
            byte method_619 = method_906[i6].method_619();
            if (method_619 == 3) {
                this.field_2387.print("<TR VALIGN=TOP><TD COLSPAN=2></TD><TH ALIGN=LEFT>throws</TH><TD>");
                int[] method_434 = ((class_224) method_906[i6]).method_434();
                int i7 = 0;
                int i8 = 0;
                while (i7 < method_434.length) {
                    this.field_2387.print(this.field_2388.method_1829(method_434[i8]));
                    if (i8 < method_434.length - 1) {
                        this.field_2387.print(", ");
                    }
                    int i9 = i8 + 1;
                    i7 = i9;
                    i8 = i9;
                }
                this.field_2387.println("</TD></TR>");
            } else if (method_619 == 2) {
                class_160[] method_9062 = ((class_576) method_906[i6]).method_906();
                int i10 = 0;
                int i11 = 0;
                while (i10 < method_9062.length) {
                    int i12 = i11 + 1;
                    this.field_2386.method_616(method_9062[i11], new StringBuilder().insert(0, "method").append(i).append("@").append(i6).append("@").append(i11).toString(), i);
                    i10 = i12;
                    i11 = i12;
                }
            }
            int i13 = i6 + 1;
            i5 = i13;
            i6 = i13;
        }
    }
}
