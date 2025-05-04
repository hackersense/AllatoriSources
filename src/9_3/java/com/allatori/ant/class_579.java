package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.commons.ASMStuffs;
import com.allatori.interfaces.unmapped.class_555;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.BitSet;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_579 implements ASMInterface {
    public static boolean field_2359 = false;
    public class_499 field_2353;
    public class_557[] field_2354;
    public PrintWriter field_2355;
    public BitSet field_2356;
    public String field_2357;
    public class_608 field_2358;

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:15:0x006e */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:10:0x0052 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:28:0x00c0 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:57:0x0358 */
    public final String method_2026(class_346 class_346Var, int i) {
        int i2;
        int readInt;
        int readUnsignedByte;
        StringBuffer stringBuffer;
        short readByte;
        StringBuffer stringBuffer2;
        int method_433;
        int i3;
        int readUnsignedByte2;
        StringBuffer stringBuffer3;
        int i4 = 0;
        short readUnsignedByte3 = (short) class_346Var.readUnsignedByte();
        StringBuffer stringBuffer4 = new StringBuffer(256);
        stringBuffer4.append("<TT>").append(iiIIiiIiiI[readUnsignedByte3]).append("</TT></TD><TD>");
        if (readUnsignedByte3 == 170 || readUnsignedByte3 == 171) {
            int method_1408 = class_346Var.method_1408() % 4;
            i2 = method_1408 == 0 ? 0 : 4 - method_1408;
            int i5 = 0;
            int i6 = 0;
            while (i5 < i2) {
                int i7 = i6 + 1;
                class_346Var.readByte();
                i5 = i7;
                i6 = i7;
            }
            readInt = class_346Var.readInt();
        } else {
            i2 = 0;
            readInt = 0;
        }
        switch (readUnsignedByte3) {
            case 18:
                int readUnsignedByte4 = class_346Var.readUnsignedByte();
                stringBuffer4.append("<A HREF=\"").append(this.field_2357).append("_cp.html#cp").append(readUnsignedByte4).append("\" TARGET=\"ConstantPool\">").append(class_478.method_1830(this.field_2353.method_1848(readUnsignedByte4, this.field_2353.method_982(readUnsignedByte4).method_619()))).append("</a>");
                stringBuffer2 = stringBuffer4;
                break;
            case 19:
            case 20:
                short readShort = class_346Var.readShort();
                stringBuffer4.append("<A HREF=\"").append(this.field_2357).append("_cp.html#cp").append((int) readShort).append("\" TARGET=\"ConstantPool\">").append(class_478.method_1830(this.field_2353.method_1848(readShort, this.field_2353.method_982(readShort).method_619()))).append("</a>");
                stringBuffer2 = stringBuffer4;
                break;
            case 21:
            case 22:
            case 23:
            case class_555.field_2101 /* 24 */:
            case class_555.field_2318 /* 25 */:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case class_555.field_2174 /* 169 */:
                if (!field_2359) {
                    readUnsignedByte2 = class_346Var.readUnsignedByte();
                    stringBuffer3 = stringBuffer4;
                } else {
                    short readShort2 = class_346Var.readShort();
                    field_2359 = false;
                    stringBuffer3 = stringBuffer4;
                    readUnsignedByte2 = readShort2;
                }
                stringBuffer3.append("%").append(readUnsignedByte2);
                stringBuffer2 = stringBuffer4;
                break;
            case class_555.field_2267 /* 132 */:
                if (!field_2359) {
                    readUnsignedByte = class_346Var.readUnsignedByte();
                    stringBuffer = stringBuffer4;
                    readByte = class_346Var.readByte();
                } else {
                    short readShort3 = class_346Var.readShort();
                    readByte = class_346Var.readShort();
                    field_2359 = false;
                    stringBuffer = stringBuffer4;
                    readUnsignedByte = readShort3;
                }
                stringBuffer.append("%").append(readUnsignedByte).append(" ").append((int) readByte);
                stringBuffer2 = stringBuffer4;
                break;
            case class_555.field_2304 /* 153 */:
            case class_555.field_2215 /* 154 */:
            case class_555.field_2244 /* 155 */:
            case class_555.field_2077 /* 156 */:
            case class_555.field_2251 /* 157 */:
            case class_555.field_2179 /* 158 */:
            case class_555.field_2287 /* 159 */:
            case class_555.field_2273 /* 160 */:
            case class_555.field_2099 /* 161 */:
            case class_555.field_2097 /* 162 */:
            case class_555.field_2130 /* 163 */:
            case class_555.field_2227 /* 164 */:
            case class_555.field_2136 /* 165 */:
            case class_555.field_2243 /* 166 */:
            case class_555.field_2270 /* 167 */:
            case class_555.field_2293 /* 168 */:
            case class_555.field_2182 /* 198 */:
            case class_555.field_2102 /* 199 */:
                int method_14082 = (class_346Var.method_1408() + class_346Var.readShort()) - 1;
                stringBuffer4.append("<A HREF=\"#code").append(i).append("@").append(method_14082).append("\">").append(method_14082).append("</A>");
                stringBuffer2 = stringBuffer4;
                break;
            case class_555.field_2148 /* 170 */:
                int readInt2 = class_346Var.readInt();
                int readInt3 = class_346Var.readInt();
                int method_14083 = ((class_346Var.method_1408() - 12) - i2) - 1;
                int i8 = readInt + method_14083;
                stringBuffer4.append("<TABLE BORDER=1><TR>");
                int[] iArr = new int[(readInt3 - readInt2) + 1];
                int i9 = 0;
                int i10 = 0;
                while (i9 < iArr.length) {
                    iArr[i10] = class_346Var.readInt() + method_14083;
                    int i11 = i10 + 1;
                    stringBuffer4.append("<TH>").append(readInt2 + i10).append("</TH>");
                    i9 = i11;
                    i10 = i11;
                }
                stringBuffer4.append("<TH>default</TH></TR>\n<TR>");
                while (true) {
                    int i12 = i4;
                    if (i4 < iArr.length) {
                        i4 = i12 + 1;
                        stringBuffer4.append("<TD><A HREF=\"#code").append(i).append("@").append(iArr[i12]).append("\">").append(iArr[i12]).append("</A></TD>");
                    } else {
                        stringBuffer4.append("<TD><A HREF=\"#code").append(i).append("@").append(i8).append("\">").append(i8).append("</A></TD></TR>\n</TABLE>\n");
                        stringBuffer2 = stringBuffer4;
                        break;
                    }
                }
            case class_555.field_2131 /* 171 */:
                int readInt4 = class_346Var.readInt();
                int method_14084 = ((class_346Var.method_1408() - 8) - i2) - 1;
                int[] iArr2 = new int[readInt4];
                int i13 = readInt + method_14084;
                stringBuffer4.append("<TABLE BORDER=1><TR>");
                int i14 = 0;
                int i15 = 0;
                while (i14 < readInt4) {
                    int readInt5 = class_346Var.readInt();
                    iArr2[i15] = class_346Var.readInt() + method_14084;
                    int i16 = i15 + 1;
                    stringBuffer4.append("<TH>").append(readInt5).append("</TH>");
                    i14 = i16;
                    i15 = i16;
                }
                stringBuffer4.append("<TH>default</TH></TR>\n<TR>");
                int i17 = 0;
                int i18 = 0;
                while (i17 < readInt4) {
                    int i19 = i18 + 1;
                    stringBuffer4.append("<TD><A HREF=\"#code").append(i).append("@").append(iArr2[i18]).append("\">").append(iArr2[i18]).append("</A></TD>");
                    i17 = i19;
                    i18 = i19;
                }
                stringBuffer4.append("<TD><A HREF=\"#code").append(i).append("@").append(i13).append("\">").append(i13).append("</A></TD></TR>\n</TABLE>\n");
                stringBuffer2 = stringBuffer4;
                break;
            case class_555.field_2078 /* 178 */:
            case class_555.field_2141 /* 179 */:
            case class_555.field_2211 /* 180 */:
            case class_555.field_2186 /* 181 */:
                class_530 class_530Var = (class_530) this.field_2353.method_1849(class_346Var.readShort(), (byte) 9);
                int method_47 = class_530Var.method_47();
                String method_945 = class_204.method_945(this.field_2353.method_1845(method_47, (byte) 7), false);
                String method_1848 = this.field_2353.method_1848(class_530Var.method_433(), (byte) 12);
                if (method_945.equals(this.field_2357)) {
                    stringBuffer4.append("<A HREF=\"").append(this.field_2357).append("_methods.html#field").append(method_1848).append("\" TARGET=Methods>").append(method_1848).append("</A>\n");
                    stringBuffer2 = stringBuffer4;
                    break;
                } else {
                    stringBuffer4.append(this.field_2358.method_1829(method_47)).append(".").append(method_1848);
                    stringBuffer2 = stringBuffer4;
                    break;
                }
            case class_555.field_2147 /* 182 */:
            case class_555.field_2238 /* 183 */:
            case class_555.field_2314 /* 184 */:
            case class_555.field_2144 /* 185 */:
                short readShort4 = class_346Var.readShort();
                if (readUnsignedByte3 == 185) {
                    class_346Var.readUnsignedByte();
                    class_346Var.readUnsignedByte();
                    class_401 class_401Var = (class_401) this.field_2353.method_1849(readShort4, (byte) 11);
                    int method_472 = class_401Var.method_47();
                    this.field_2353.method_1847(class_401Var);
                    method_433 = class_401Var.method_433();
                    i3 = method_472;
                } else {
                    class_35 class_35Var = (class_35) this.field_2353.method_1849(readShort4, (byte) 10);
                    int method_473 = class_35Var.method_47();
                    this.field_2353.method_1847(class_35Var);
                    method_433 = class_35Var.method_433();
                    i3 = method_473;
                }
                String method_1829 = class_478.method_1829(i3);
                String method_1830 = class_478.method_1830(this.field_2353.method_1847(this.field_2353.method_1849(method_433, (byte) 12)));
                String method_18482 = this.field_2353.method_1848(((class_538) this.field_2353.method_1849(method_433, (byte) 12)).method_433(), (byte) 1);
                String[] method_969 = class_204.method_969(method_18482, false);
                String method_934 = class_204.method_934(method_18482, false);
                stringBuffer4.append(method_1829).append(".<A HREF=\"").append(this.field_2357).append("_cp.html#cp").append((int) readShort4).append("\" TARGET=ConstantPool>").append(method_1830).append("</A>").append("(");
                while (true) {
                    int i20 = i4;
                    if (i4 >= method_969.length) {
                        stringBuffer4.append("):").append(class_478.method_199(method_934));
                        stringBuffer2 = stringBuffer4;
                        break;
                    } else {
                        stringBuffer4.append(class_478.method_199(method_969[i20]));
                        if (i20 < method_969.length - 1) {
                            stringBuffer4.append(", ");
                        }
                        i4 = i20 + 1;
                    }
                }
            case class_555.field_2228 /* 187 */:
            case class_555.field_2303 /* 192 */:
            case class_555.field_2197 /* 193 */:
                stringBuffer4.append(this.field_2358.method_1829(class_346Var.readShort()));
                stringBuffer2 = stringBuffer4;
                break;
            case class_555.field_2316 /* 188 */:
                stringBuffer4.append("<FONT COLOR=\"#00FF00\">").append(IIIiIIiiii[class_346Var.readByte()]).append("</FONT>");
                stringBuffer2 = stringBuffer4;
                break;
            case class_555.field_2245 /* 189 */:
                stringBuffer4.append(this.field_2358.method_1829(class_346Var.readShort()));
                stringBuffer2 = stringBuffer4;
                break;
            case ASMStuffs.field_79 /* 196 */:
                field_2359 = true;
                stringBuffer4.append("(wide)");
                stringBuffer2 = stringBuffer4;
                break;
            case class_555.field_2265 /* 197 */:
                stringBuffer4.append(this.field_2358.method_1829(class_346Var.readShort())).append(":").append((int) class_346Var.readByte()).append("-dimensional");
                stringBuffer2 = stringBuffer4;
                break;
            case ASMStuffs.field_150 /* 200 */:
            case ASMStuffs.field_153 /* 201 */:
                int method_14085 = (class_346Var.method_1408() + class_346Var.readInt()) - 1;
                stringBuffer4.append("<A HREF=\"#code").append(i).append("@").append(method_14085).append("\">").append(method_14085).append("</A>");
                stringBuffer2 = stringBuffer4;
                break;
            default:
                if (iiIIIiIIii[readUnsignedByte3] > 0) {
                    while (true) {
                        int i21 = i4;
                        if (i4 < iIIiiIiiIi[readUnsignedByte3].length) {
                            switch (iIIiiIiiIi[readUnsignedByte3][i21]) {
                                case 8:
                                    stringBuffer4.append(class_346Var.readUnsignedByte());
                                    break;
                                case 9:
                                    stringBuffer4.append((int) class_346Var.readShort());
                                    break;
                                case 10:
                                    stringBuffer4.append(class_346Var.readInt());
                                    break;
                                default:
                                    System.err.println("Unreachable default case reached!");
                                    System.exit(-1);
                                    break;
                            }
                            i4 = i21 + 1;
                            stringBuffer4.append("&nbsp;");
                        }
                    }
                }
                stringBuffer2 = stringBuffer4;
                break;
        }
        stringBuffer2.append("</TD>");
        return stringBuffer4.toString();
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0038 */
    public class_579(String str, String str2, class_557[] class_557VarArr, class_499 class_499Var, class_608 class_608Var) {
        int i = 0;
        this.field_2357 = str2;
        this.field_2354 = class_557VarArr;
        this.field_2353 = class_499Var;
        this.field_2358 = class_608Var;
        this.field_2355 = new PrintWriter(new FileOutputStream(new StringBuilder().insert(0, str).append(str2).append("_code.html").toString()));
        this.field_2355.println("<HTML><BODY BGCOLOR=\"#C0C0C0\">");
        while (true) {
            int i2 = i;
            if (i >= class_557VarArr.length) {
                this.field_2355.println("</BODY></HTML>");
                this.field_2355.close();
                return;
            } else {
                i = i2 + 1;
                method_911(class_557VarArr[i2], i2);
            }
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:37:0x024c */
    public void method_911(class_557 class_557Var, int i) {
        byte[] bArr;
        class_576 class_576Var;
        String str;
        String sb;
        byte[] bArr2;
        String method_546 = class_557Var.method_546();
        String[] method_969 = class_204.method_969(method_546, false);
        String method_934 = class_204.method_934(method_546, false);
        String method_1830 = class_478.method_1830(class_557Var.method_464());
        String method_960 = class_204.method_960(class_204.method_932(class_557Var.method_433()), " ", "&nbsp;");
        class_160[] method_906 = class_557Var.method_906();
        this.field_2355.print(new StringBuilder().insert(0, "<P><B><FONT COLOR=\"#FF0000\">").append(method_960).append("</FONT>&nbsp;").append("<A NAME=method").append(i).append(">").append(class_478.method_199(method_934)).append("</A>&nbsp<A HREF=\"").append(this.field_2357).append("_methods.html#method").append(i).append("\" TARGET=Methods>").append(method_1830).append("</A>(").toString());
        int i2 = 0;
        int i3 = 0;
        while (i2 < method_969.length) {
            this.field_2355.print(class_478.method_199(method_969[i3]));
            if (i3 < method_969.length - 1) {
                this.field_2355.print(",&nbsp;");
            }
            int i4 = i3 + 1;
            i2 = i4;
            i3 = i4;
        }
        this.field_2355.println(")</B></P>");
        if (method_906.length > 0) {
            this.field_2355.print("<H4>Attributes</H4><UL>\n");
            int i5 = 0;
            byte[] bArr3 = null;
            class_576 class_576Var2 = null;
            int i6 = 0;
            while (i5 < method_906.length) {
                byte method_619 = method_906[i6].method_619();
                if (method_619 == -1) {
                    this.field_2355.print(new StringBuilder().insert(0, "<LI>").append(method_906[i6]).append("</LI>").toString());
                } else {
                    this.field_2355.print(new StringBuilder().insert(0, "<LI><A HREF=\"").append(this.field_2357).append("_attributes.html#method").append(i).append("@").append(i6).append("\" TARGET=Attributes>").append(IIIIiiiiIi[method_619]).append("</A></LI>\n").toString());
                }
                if (method_619 == 2) {
                    class_576 class_576Var3 = (class_576) method_906[i6];
                    class_160[] method_9062 = class_576Var3.method_906();
                    byte[] method_429 = class_576Var3.method_429();
                    this.field_2355.print("<UL>");
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < method_9062.length) {
                        int i9 = i8 + 1;
                        this.field_2355.print(new StringBuilder().insert(0, "<LI><A HREF=\"").append(this.field_2357).append("_attributes.html#").append("method").append(i).append("@").append(i6).append("@").append(i8).append("\" TARGET=Attributes>").append(IIIIiiiiIi[method_9062[i8].method_619()]).append("</A></LI>\n").toString());
                        i7 = i9;
                        i8 = i9;
                    }
                    this.field_2355.print("</UL>");
                    bArr2 = method_429;
                    class_576Var2 = class_576Var3;
                } else {
                    bArr2 = bArr3;
                }
                int i10 = i6 + 1;
                i5 = i10;
                bArr3 = bArr2;
                i6 = i10;
            }
            this.field_2355.println("</UL>");
            bArr = bArr3;
            class_576Var = class_576Var2;
        } else {
            bArr = null;
            class_576Var = null;
        }
        if (bArr == null) {
            return;
        }
        class_346 class_346Var = new class_346(bArr);
        class_346Var.mark(class_346Var.available());
        method_2025(class_346Var, class_557Var, class_576Var);
        class_346Var.reset();
        this.field_2355.println("<TABLE BORDER=0><TR><TH ALIGN=LEFT>Byte<BR>offset</TH><TH ALIGN=LEFT>Instruction</TH><TH ALIGN=LEFT>Argument</TH>");
        class_346 class_346Var2 = class_346Var;
        int i11 = 0;
        while (class_346Var2.available() > 0) {
            int method_1408 = class_346Var.method_1408();
            String method_2026 = method_2026(class_346Var, i);
            if (this.field_2356.get(method_1408)) {
                str = new StringBuilder().insert(0, "<A NAME=code").append(i).append("@").append(method_1408).append("></A>").toString();
            } else {
                str = "";
            }
            if (class_346Var.method_1408() != bArr.length) {
                sb = new StringBuilder().insert(0, "").append(method_1408).toString();
            } else {
                sb = new StringBuilder().insert(0, "<A NAME=code").append(i).append("@").append(bArr.length).append(">").append(method_1408).append("</A>").toString();
            }
            this.field_2355.println(new StringBuilder().insert(0, "<TR VALIGN=TOP><TD>").append(sb).append("</TD><TD>").append(str).append(method_2026).append("</TR>").toString());
            class_346Var2 = class_346Var;
            i11++;
        }
        this.field_2355.println("<TR><TD> </A></TD></TR>");
        this.field_2355.println("</TABLE>");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void method_2025(class_346 class_346Var, class_557 class_557Var, class_576 class_576Var) {
        this.field_2356 = new BitSet(class_346Var.available());
        if (class_576Var != null) {
            class_372[] method_2023 = class_576Var.method_2023();
            int length = method_2023.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                this.field_2356.set(method_2023[i2].method_928());
                this.field_2356.set(method_2023[i2].method_47());
                int i3 = i2 + 1;
                this.field_2356.set(method_2023[i2].method_433());
                i = i3;
                i2 = i3;
            }
            class_160[] method_906 = class_576Var.method_906();
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i4 >= method_906.length) {
                    break;
                }
                if (method_906[i5].method_619() == 5) {
                    class_368[] method_181 = ((class_40) method_906[i5]).method_181();
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < method_181.length) {
                        int method_928 = method_181[i7].method_928();
                        int method_433 = method_928 + method_181[i7].method_433();
                        this.field_2356.set(method_928);
                        int i8 = i7 + 1;
                        this.field_2356.set(method_433);
                        i6 = i8;
                        i7 = i8;
                    }
                } else {
                    int i9 = i5 + 1;
                    i4 = i9;
                    i5 = i9;
                }
            }
        }
        class_346 class_346Var2 = class_346Var;
        int i10 = 0;
        while (class_346Var2.available() > 0) {
            int readUnsignedByte = class_346Var.readUnsignedByte();
            switch (readUnsignedByte) {
                case class_555.field_2304 /* 153 */:
                case class_555.field_2215 /* 154 */:
                case class_555.field_2244 /* 155 */:
                case class_555.field_2077 /* 156 */:
                case class_555.field_2251 /* 157 */:
                case class_555.field_2179 /* 158 */:
                case class_555.field_2287 /* 159 */:
                case class_555.field_2273 /* 160 */:
                case class_555.field_2099 /* 161 */:
                case class_555.field_2097 /* 162 */:
                case class_555.field_2130 /* 163 */:
                case class_555.field_2227 /* 164 */:
                case class_555.field_2136 /* 165 */:
                case class_555.field_2243 /* 166 */:
                case class_555.field_2270 /* 167 */:
                case class_555.field_2293 /* 168 */:
                case class_555.field_2182 /* 198 */:
                case class_555.field_2102 /* 199 */:
                    this.field_2356.set((class_346Var.method_1408() + class_346Var.readShort()) - 1);
                    break;
                case class_555.field_2174 /* 169 */:
                case class_555.field_2132 /* 172 */:
                case class_555.field_2196 /* 173 */:
                case class_555.field_2135 /* 174 */:
                case class_555.field_2221 /* 175 */:
                case class_555.field_2161 /* 176 */:
                case class_555.field_2150 /* 177 */:
                case class_555.field_2078 /* 178 */:
                case class_555.field_2141 /* 179 */:
                case class_555.field_2211 /* 180 */:
                case class_555.field_2186 /* 181 */:
                case class_555.field_2147 /* 182 */:
                case class_555.field_2238 /* 183 */:
                case class_555.field_2314 /* 184 */:
                case class_555.field_2144 /* 185 */:
                case class_555.field_2178 /* 186 */:
                case class_555.field_2228 /* 187 */:
                case class_555.field_2316 /* 188 */:
                case class_555.field_2245 /* 189 */:
                case class_555.field_2249 /* 190 */:
                case class_555.field_2262 /* 191 */:
                case class_555.field_2303 /* 192 */:
                case class_555.field_2197 /* 193 */:
                case class_555.field_2165 /* 194 */:
                case class_555.field_2282 /* 195 */:
                case ASMStuffs.field_79 /* 196 */:
                case class_555.field_2265 /* 197 */:
                default:
                    class_346Var.method_1407();
                    method_2026(class_346Var, 0);
                    break;
                case class_555.field_2148 /* 170 */:
                case class_555.field_2131 /* 171 */:
                    int method_1408 = class_346Var.method_1408() % 4;
                    int i11 = method_1408 == 0 ? 0 : 4 - method_1408;
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 < i11) {
                        int i14 = i13 + 1;
                        class_346Var.readByte();
                        i12 = i14;
                        i13 = i14;
                    }
                    int readInt = class_346Var.readInt();
                    if (readUnsignedByte != 170) {
                        int readInt2 = class_346Var.readInt();
                        int method_14082 = ((class_346Var.method_1408() - 8) - i11) - 1;
                        this.field_2356.set(readInt + method_14082);
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < readInt2) {
                            class_346Var.readInt();
                            int i17 = i16 + 1;
                            this.field_2356.set(class_346Var.readInt() + method_14082);
                            i15 = i17;
                            i16 = i17;
                        }
                        break;
                    } else {
                        int readInt3 = class_346Var.readInt();
                        int readInt4 = class_346Var.readInt();
                        int method_14083 = ((class_346Var.method_1408() - 12) - i11) - 1;
                        this.field_2356.set(readInt + method_14083);
                        int i18 = 0;
                        int i19 = 0;
                        while (i18 < (readInt4 - readInt3) + 1) {
                            int i20 = i19 + 1;
                            this.field_2356.set(class_346Var.readInt() + method_14083);
                            i18 = i20;
                            i19 = i20;
                        }
                        break;
                    }
                case ASMStuffs.field_150 /* 200 */:
                case ASMStuffs.field_153 /* 201 */:
                    this.field_2356.set((class_346Var.method_1408() + class_346Var.readInt()) - 1);
                    break;
            }
            i10++;
            class_346Var2 = class_346Var;
        }
    }
}
