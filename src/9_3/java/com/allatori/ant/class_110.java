package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_110 implements ASMInterface {
    public PrintWriter field_529;
    public int field_530 = 0;
    public String field_531;
    public class_499 field_532;
    public class_608 field_533;

    public final void method_614(class_160 class_160Var, String str) {
        method_616(class_160Var, str, 0);
    }

    public final String method_615(int i, int i2) {
        return "<A HREF=\""+this.field_531+"_code.html#code"+i2+"@"+i+"\" TARGET=Code>"+i+"</A>";
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:20:0x0101 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:48:0x03a1 */
    public final void method_616(class_160 class_160Var, String str, int i) {
        class_110 class_110Var;
        class_110 class_110Var2;
        String str2;
        byte method_619 = class_160Var.method_619();
        if (method_619 != -1) {
            this.field_530++;
            if (this.field_530 % 2 == 0) {
                this.field_529.print("<TR BGCOLOR=\"#C0C0C0\"><TD>");
                class_110Var = this;
            } else {
                this.field_529.print("<TR BGCOLOR=\"#A0A0A0\"><TD>");
                class_110Var = this;
            }
            class_110Var.field_529.println("<H4><A NAME=\""+str+"\">"+this.field_530+" "+IIIIiiiiIi[method_619]+"</A></H4>");
            switch (method_619) {
                case 0:
                    int method_183 = ((class_599) class_160Var).method_183();
                    this.field_529.print("<UL><LI><A HREF=\""+this.field_531+"_cp.html#cp"+method_183+"\" TARGET=\"ConstantPool\">Source file index("+method_183+")</A></UL>\n");
                    class_110Var2 = this;
                    break;
                case 1:
                    int method_1832 = ((class_257) class_160Var).method_183();
                    this.field_529.print("<UL><LI><A HREF=\""+this.field_531+"_cp.html#cp"+method_1832+"\" TARGET=\"ConstantPool\">Constant value index("+method_1832+")</A></UL>\n");
                    class_110Var2 = this;
                    break;
                case 2:
                    class_576 class_576Var = (class_576) class_160Var;
                    this.field_529.print("<UL><LI>Maximum stack size = "+class_576Var.method_920()+"</LI>\n<LI>Number of local variables = "+class_576Var.method_183()+"</LI>\n<LI><A HREF=\""+this.field_531+"_code.html#method"+i+"\" TARGET=Code>Byte code</A></LI></UL>\n");
                    class_372[] method_2023 = class_576Var.method_2023();
                    int length = method_2023.length;
                    if (length > 0) {
                        this.field_529.print("<P><B>Exceptions handled</B><UL>");
                        int i2 = 0;
                        int i3 = 0;
                        while (i2 < length) {
                            int method_1833 = method_2023[i3].method_183();
                            this.field_529.print("<LI>");
                            if (method_1833 != 0) {
                                this.field_529.print(this.field_533.method_1829(method_1833));
                            } else {
                                this.field_529.print("Any Exception");
                            }
                            int i4 = i3 + 1;
                            this.field_529.print("<BR>(Ranging from lines "+method_615(method_2023[i3].method_928(), i)+" to "+method_615(method_2023[i3].method_47(), i)+", handled at line "+method_615(method_2023[i3].method_433(), i)+")</LI>");
                            i2 = i4;
                            i3 = i4;
                        }
                        this.field_529.print("</UL>");
                        class_110Var2 = this;
                        break;
                    }
                    class_110Var2 = this;
                    break;
                case 3:
                    int[] method_434 = ((class_224) class_160Var).method_434();
                    this.field_529.print("<UL>");
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < method_434.length) {
                        int i7 = i6 + 1;
                        this.field_529.print("<LI><A HREF=\""+this.field_531+"_cp.html#cp"+method_434[i6]+"\" TARGET=\"ConstantPool\">Exception class index("+method_434[i6]+")</A>\n");
                        i5 = i7;
                        i6 = i7;
                    }
                    this.field_529.print("</UL>\n");
                    class_110Var2 = this;
                    break;
                case 4:
                    class_387[] method_1385 = ((class_332) class_160Var).method_1385();
                    this.field_529.print("<P>");
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < method_1385.length) {
                        this.field_529.print("("+method_1385[i9].method_433()+",&nbsp;"+method_1385[i9].method_47()+")");
                        if (i9 < method_1385.length - 1) {
                            this.field_529.print(", ");
                        }
                        int i10 = i9 + 1;
                        i8 = i10;
                        i9 = i10;
                    }
                    class_110Var2 = this;
                    break;
                case 5:
                    class_368[] method_181 = ((class_40) class_160Var).method_181();
                    this.field_529.print("<UL>");
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < method_181.length) {
                        String method_962 = class_204.method_962(((class_371) this.field_532.method_1849(method_181[i12].method_183(), (byte) 1)).method_198(), false);
                        int method_928 = method_181[i12].method_928();
                        int method_433 = method_181[i12].method_433() + method_928;
                        PrintWriter printWriter = this.field_529;
                        StringBuilder append = new StringBuilder("<LI>"+class_478.method_199(method_962)+"&nbsp;<B>"+method_181[i12].method_464()+"</B> in slot %"+method_181[i12].method_47()+"<BR>Valid from lines "+"<A HREF=\""+this.field_531+"_code.html#code"+i+"@"+method_928+"\" TARGET=Code>"+method_928+"</A> to "+"<A HREF=\""+this.field_531+"_code.html#code"+i+"@"+method_433+"\" TARGET=Code>"+method_433);
                        int i13 = i12 + 1;
                        printWriter.println(append.append("</A></LI>"));
                        i11 = i13;
                        i12 = i13;
                    }
                    this.field_529.print("</UL>\n");
                    class_110Var2 = this;
                    break;
                case 6:
                    class_367[] method_626 = ((class_121) class_160Var).method_626();
                    this.field_529.print("<UL>");
                    int i14 = 0;
                    int i15 = 0;
                    while (i14 < method_626.length) {
                        int method_4332 = method_626[i15].method_433();
                        if (method_4332 <= 0) {
                            str2 = "&lt;anonymous&gt;";
                        } else {
                            str2 = ((class_371) this.field_532.method_1849(method_4332, (byte) 1)).method_198();
                        }
                        String method_932 = class_204.method_932(method_626[i15].method_928());
                        PrintWriter printWriter2 = this.field_529;
                        StringBuilder append2 = new StringBuilder("<LI><FONT COLOR=\"#FF0000\">"+method_932+"</FONT> "+this.field_533.method_1829(method_626[i15].method_183())+" in&nbsp;class "+this.field_533.method_1829(method_626[i15].method_47())+" named "+str2);
                        int i16 = i15 + 1;
                        printWriter2.print(append2.append("</LI>\n"));
                        i14 = i16;
                        i15 = i16;
                    }
                    this.field_529.print("</UL>\n");
                    class_110Var2 = this;
                    break;
                default:
                    this.field_529.print("<P>"+class_160Var.toString());
                    class_110Var2 = this;
                    break;
            }
            class_110Var2.field_529.println("</TD></TR>");
            this.field_529.flush();
        }
    }

    public class_110(String str, String str2, class_499 class_499Var, class_608 class_608Var) throws FileNotFoundException {
        this.field_531 = str2;
        this.field_532 = class_499Var;
        this.field_533 = class_608Var;
        this.field_529 = new PrintWriter(new FileOutputStream(str+str2+"_attributes.html"));
        this.field_529.println("<HTML><BODY BGCOLOR=\"#C0C0C0\"><TABLE BORDER=0>");
    }

    public final void method_97() {
        this.field_529.println("</TABLE></BODY></HTML>");
        this.field_529.close();
    }
}
