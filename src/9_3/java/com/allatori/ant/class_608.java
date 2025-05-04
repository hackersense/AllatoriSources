package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;

import java.io.FileOutputStream;
import java.io.PrintWriter;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_608 implements ASMInterface {
    public String[] field_2403;
    public class_499 field_2404;
    public String field_2405;
    public class_286[] field_2406;
    public class_557[] field_2407;
    public PrintWriter field_2408;
    public String field_2409;

    public String method_1829(int i) {
        return this.field_2403[i];
    }

    public void method_46(int i) {
        StringBuilder sb;
        String sb2;
        class_608 class_608Var;
        int method_47;
        int method_433;
        class_608 class_608Var2;
        StringBuilder sb3;
        String sb4;
        class_608 class_608Var3;
        byte method_619 = this.field_2406[i].method_619();
        this.field_2408.println(new StringBuilder().insert(0, "<H4> <A NAME=cp").append(i).append(">").append(i).append("</A> ").append(IIiiIiiIIi[method_619]).append("</H4>").toString());
        switch (method_619) {
            case 7:
                int method_472 = ((class_43) this.field_2404.method_1849(i, (byte) 7)).method_47();
                String method_1848 = this.field_2404.method_1848(i, method_619);
                String method_971 = class_204.method_971(class_204.method_957(method_1848), new StringBuilder().insert(0, this.field_2409).append(".").toString(), true);
                String sb5 = new StringBuilder().insert(0, "<A HREF=\"").append(method_1848).append(".html\" TARGET=_top>").append(method_971).append("</A>").toString();
                this.field_2403[i] = new StringBuilder().insert(0, "<A HREF=\"").append(this.field_2405).append("_cp.html#cp").append(i).append("\" TARGET=ConstantPool>").append(method_971).append("</A>").toString();
                this.field_2408.println(new StringBuilder().insert(0, "<P><TT>").append(sb5).append("</TT><UL>").append("<LI><A HREF=\"#cp").append(method_472).append("\">Name index(").append(method_472).append(")</A></UL>\n").toString());
                break;
            case 8:
                int method_473 = ((class_118) this.field_2404.method_1849(i, (byte) 8)).method_47();
                this.field_2408.println(new StringBuilder().insert(0, "<P><TT>").append(class_478.method_1830(this.field_2404.method_1848(i, method_619))).append("</TT><UL>").append("<LI><A HREF=\"#cp").append(method_473).append("\">Name index(").append(method_473).append(")</A></UL>\n").toString());
                break;
            case 9:
                class_530 class_530Var = (class_530) this.field_2404.method_1849(i, (byte) 9);
                int method_474 = class_530Var.method_47();
                int method_4332 = class_530Var.method_433();
                String method_18482 = this.field_2404.method_1848(method_474, (byte) 7);
                String method_9712 = class_204.method_971(class_204.method_957(method_18482), new StringBuilder().insert(0, this.field_2409).append(".").toString(), true);
                String method_18483 = this.field_2404.method_1848(method_4332, (byte) 12);
                if (!method_18482.equals(this.field_2405)) {
                    sb = new StringBuilder();
                    sb2 = sb.insert(0, "<A HREF=\"").append(method_18482).append(".html\" TARGET=_top>").append(method_9712).append("</A>.").append(method_18483).append("\n").toString();
                    class_608Var = this;
                } else {
                    sb = new StringBuilder();
                    sb2 = sb.insert(0, "<A HREF=\"").append(method_18482).append("_methods.html#field").append(method_18483).append("\" TARGET=Methods>").append(method_18483).append("</A>").toString();
                    class_608Var = this;
                }
                class_608Var.field_2403[i] = new StringBuilder().insert(0, "<A HREF=\"").append(this.field_2405).append("_cp.html#cp").append(method_474).append("\" TARGET=Constants>").append(method_9712).append("</A>.<A HREF=\"").append(this.field_2405).append("_cp.html#cp").append(i).append("\" TARGET=ConstantPool>").append(method_18483).append("</A>").toString();
                this.field_2408.println(new StringBuilder().insert(0, "<P><TT>").append(sb2).append("</TT><BR>\n").append("<UL>").append("<LI><A HREF=\"#cp").append(method_474).append("\">Class(").append(method_474).append(")</A><BR>\n").append("<LI><A HREF=\"#cp").append(method_4332).append("\">NameAndType(").append(method_4332).append(")</A></UL>").toString());
                break;
            case 10:
            case 11:
                if (method_619 == 10) {
                    class_35 class_35Var = (class_35) this.field_2404.method_1849(i, (byte) 10);
                    method_47 = class_35Var.method_47();
                    method_433 = class_35Var.method_433();
                    class_608Var2 = this;
                } else {
                    class_401 class_401Var = (class_401) this.field_2404.method_1849(i, (byte) 11);
                    method_47 = class_401Var.method_47();
                    method_433 = class_401Var.method_433();
                    class_608Var2 = this;
                }
                String method_18484 = class_608Var2.field_2404.method_1848(method_433, (byte) 12);
                String method_1830 = class_478.method_1830(method_18484);
                String method_18485 = this.field_2404.method_1848(method_47, (byte) 7);
                class_204.method_957(method_18485);
                String method_9713 = class_204.method_971(class_204.method_957(method_18485), this.field_2409 + ".", true);
                String method_18486 = this.field_2404.method_1848(((class_538) this.field_2404.method_1849(method_433, (byte) 12)).method_433(), (byte) 1);
                String[] method_969 = class_204.method_969(method_18486, false);
                String method_199 = class_478.method_199(class_204.method_934(method_18486, false));
                StringBuffer stringBuffer = new StringBuffer("(");
                int i2 = 0;
                int i3 = 0;
                while (i2 < method_969.length) {
                    stringBuffer.append(class_478.method_199(method_969[i3]));
                    if (i3 < method_969.length - 1) {
                        stringBuffer.append(",&nbsp;");
                    }
                    int i4 = i3 + 1;
                    i2 = i4;
                    i3 = i4;
                }
                stringBuffer.append(")");
                String stringBuffer2 = stringBuffer.toString();
                if (!method_18485.equals(this.field_2405)) {
                    sb3 = new StringBuilder();
                    sb4 = sb3.insert(0, "<A HREF=\"").append(method_18485).append(".html").append("\" TARGET=_top>").append(method_9713).append("</A>.").append(method_1830).toString();
                    class_608Var3 = this;
                } else {
                    sb3 = new StringBuilder();
                    sb4 = sb3.insert(0, "<A HREF=\"").append(this.field_2405).append("_code.html#method").append(method_1010(new StringBuilder().insert(0, method_18484).append(method_18486).toString())).append("\" TARGET=Code>").append(method_1830).append("</A>").toString();
                    class_608Var3 = this;
                }
                class_608Var3.field_2403[i] = new StringBuilder().insert(0, method_199).append("&nbsp;<A HREF=\"").append(this.field_2405).append("_cp.html#cp").append(method_47).append("\" TARGET=Constants>").append(method_9713).append("</A>.<A HREF=\"").append(this.field_2405).append("_cp.html#cp").append(i).append("\" TARGET=ConstantPool>").append(method_1830).append("</A>&nbsp;").append(stringBuffer2).toString();
                this.field_2408.println(new StringBuilder().insert(0, "<P><TT>").append(method_199).append("&nbsp;").append(sb4).append(stringBuffer2).append("&nbsp;</TT>\n<UL>").append("<LI><A HREF=\"#cp").append(method_47).append("\">Class index(").append(method_47).append(")</A>\n").append("<LI><A HREF=\"#cp").append(method_433).append("\">NameAndType index(").append(method_433).append(")</A></UL>").toString());
                break;
            case 12:
                class_538 class_538Var = (class_538) this.field_2404.method_1849(i, (byte) 12);
                int method_475 = class_538Var.method_47();
                int method_4333 = class_538Var.method_433();
                this.field_2408.println(new StringBuilder().insert(0, "<P><TT>").append(class_478.method_1830(this.field_2404.method_1848(i, method_619))).append("</TT><UL>").append("<LI><A HREF=\"#cp").append(method_475).append("\">Name index(").append(method_475).append(")</A>\n").append("<LI><A HREF=\"#cp").append(method_4333).append("\">Signature index(").append(method_4333).append(")</A></UL>\n").toString());
                break;
            default:
                this.field_2408.println(new StringBuilder().insert(0, "<P><TT>").append(class_478.method_1830(this.field_2404.method_1848(i, method_619))).append("</TT>\n").toString());
                break;
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x004c */
    public class_608(String str, String str2, String str3, class_557[] class_557VarArr, class_499 class_499Var) {
        class_608 class_608Var;
        this.field_2405 = str2;
        this.field_2409 = str3;
        this.field_2404 = class_499Var;
        this.field_2407 = class_557VarArr;
        this.field_2406 = class_499Var.method_1846();
        this.field_2408 = new PrintWriter(new FileOutputStream(new StringBuilder().insert(0, str).append(str2).append("_cp.html").toString()));
        this.field_2403 = new String[this.field_2406.length];
        int i = 1;
        this.field_2403[0] = "&lt;unknown&gt;";
        this.field_2408.println("<HTML><BODY BGCOLOR=\"#C0C0C0\"><TABLE BORDER=0>");
        while (true) {
            int i2 = i;
            if (i < this.field_2406.length) {
                if (i2 % 2 != 0) {
                    this.field_2408.print("<TR BGCOLOR=\"#A0A0A0\"><TD>");
                    class_608Var = this;
                } else {
                    this.field_2408.print("<TR BGCOLOR=\"#C0C0C0\"><TD>");
                    class_608Var = this;
                }
                if (class_608Var.field_2406[i2] != null) {
                    method_46(i2);
                }
                i = i2 + 1;
                this.field_2408.print("</TD></TR>\n");
            } else {
                this.field_2408.println("</TABLE></BODY></HTML>");
                this.field_2408.close();
                return;
            }
        }
    }

    public final int method_1010(String str) {
        int i = 0;
        int i2 = 0;
        while (i < this.field_2407.length) {
            if (new StringBuilder().insert(0, this.field_2407[i2].method_464()).append(this.field_2407[i2].method_546()).toString().equals(str)) {
                return i2;
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        return -1;
    }
}
