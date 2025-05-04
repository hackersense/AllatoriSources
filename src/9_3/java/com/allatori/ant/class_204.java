package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.commons.ASMStuffs;
import com.allatori.exception.runtime.class_168;
import com.allatori.interfaces.unmapped.class_555;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_204 {
    public static final int field_764 = 48;
    public static final char field_767 = '$';
    public static ThreadLocal field_765 = new class_260();
    public static boolean field_766 = false;
    public static int[] field_769 = new int[48];
    public static int[] field_768 = new int[256];

    public static final boolean method_937(int i, int i2) {
        return (method_944(i2) & i) != 0;
    }

    public static final String method_966(String str) {
        return method_934(str, true);
    }

    public static final String method_945(String str, boolean z) {
        return method_971(str, "java.lang.", z);
    }

    public static final String method_976(int i) {
        return (i & 512) != 0 ? "interface" : "class";
    }

    public static void method_940(ThreadLocal threadLocal, int i) {
        threadLocal.set(new Integer(i));
    }

    public static final String method_958(byte[] bArr, class_499 class_499Var, int i, int i2, boolean z) {
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 20);
        class_346 class_346Var = new class_346(bArr);
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = i4 + 1;
            try {
                method_943(class_346Var, class_499Var, z);
                i3 = i5;
                i4 = i5;
            } catch (IOException e) {
                System.out.println(stringBuffer.toString());
                e.printStackTrace();
                throw new class_168(new StringBuilder().insert(0, "Byte code error: ").append(e).toString());
            }
        }
        int i6 = 0;
        while (class_346Var.available() > 0) {
            if (i2 < 0 || i6 < i2) {
                stringBuffer.append(method_975(class_346Var.method_1408() + ":", 6, true, ' ')).append(method_943(class_346Var, class_499Var, z)).append('\n');
            }
            i6++;
        }
        return stringBuffer.toString();
    }

    public static final String method_957(String str) {
        return method_945(str, true);
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:2:0x0008 */
    public static final String method_965(int i, boolean z) {
        int i2 = 0;
        StringBuffer stringBuffer = new StringBuffer();
        int i3 = 0;
        while (true) {
            int i4 = i2;
            if (i3 >= 16384) {
                return stringBuffer.toString().trim();
            }
            i3 = method_944(i4);
            if ((i & i3) != 0 && (!z || (i3 != 32 && i3 != 512))) {
                stringBuffer.append(ASMInterface.field_1313[i4]).append(" ");
            }
            i2 = i4 + 1;
        }
    }

    public static final String method_971(String str, String str2, boolean z) {
        int length = str2.length();
        String replace = str.replace('/', '.');
        if (!z || !replace.startsWith(str2) || replace.substring(length).indexOf(46) != -1) {
            return replace;
        }
        return replace.substring(length);
    }

    public static final String method_931(byte[] bArr, class_499 class_499Var, int i, int i2) {
        return method_958(bArr, class_499Var, i, i2, true);
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:10:0x0068 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:23:0x00cc */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String method_943(class_346 class_346Var, class_499 class_499Var, boolean z) {
        int i;
        int readInt;
        int readUnsignedByte;
        StringBuffer stringBuffer;
        short readByte;
        int readUnsignedByte2;
        StringBuffer stringBuffer2;
        int i2 = 0;
        short readUnsignedByte3 = (short) class_346Var.readUnsignedByte();
        StringBuffer stringBuffer3 = new StringBuffer(ASMInterface.field_1554[readUnsignedByte3]);
        if (readUnsignedByte3 == 170 || readUnsignedByte3 == 171) {
            int method_1408 = class_346Var.method_1408() % 4;
            i = method_1408 == 0 ? 0 : 4 - method_1408;
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                byte readByte2 = class_346Var.readByte();
                if (readByte2 != 0) {
                    System.err.println(new StringBuilder().insert(0, "Warning: Padding byte != 0 in ").append(ASMInterface.field_1554[readUnsignedByte3]).append(":").append((int) readByte2).toString());
                }
                int i5 = i4 + 1;
                i3 = i5;
                i4 = i5;
            }
            readInt = class_346Var.readInt();
        } else {
            i = 0;
            readInt = 0;
        }
        switch (readUnsignedByte3) {
            case 18:
                int readUnsignedByte4 = class_346Var.readUnsignedByte();
                stringBuffer3.append("\t\t").append(class_499Var.method_1848(readUnsignedByte4, class_499Var.method_982(readUnsignedByte4).method_619())).append(z ? new StringBuilder().insert(0, " (").append(readUnsignedByte4).append(")").toString() : "");
                break;
            case 19:
            case 20:
                int readUnsignedShort = class_346Var.readUnsignedShort();
                stringBuffer3.append("\t\t").append(class_499Var.method_1848(readUnsignedShort, class_499Var.method_982(readUnsignedShort).method_619())).append(z ? new StringBuilder().insert(0, " (").append(readUnsignedShort).append(")").toString() : "");
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
                if (field_766) {
                    int readUnsignedShort2 = class_346Var.readUnsignedShort();
                    field_766 = false;
                    stringBuffer2 = stringBuffer3;
                    readUnsignedByte2 = readUnsignedShort2;
                } else {
                    readUnsignedByte2 = class_346Var.readUnsignedByte();
                    stringBuffer2 = stringBuffer3;
                }
                stringBuffer2.append("\t\t%").append(readUnsignedByte2);
                break;
            case class_555.field_2267 /* 132 */:
                if (field_766) {
                    int readUnsignedShort3 = class_346Var.readUnsignedShort();
                    readByte = class_346Var.readShort();
                    field_766 = false;
                    stringBuffer = stringBuffer3;
                    readUnsignedByte = readUnsignedShort3;
                } else {
                    readUnsignedByte = class_346Var.readUnsignedByte();
                    stringBuffer = stringBuffer3;
                    readByte = class_346Var.readByte();
                }
                stringBuffer.append("\t\t%").append(readUnsignedByte).append("\t").append((int) readByte);
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
                stringBuffer3.append("\t\t#").append((class_346Var.method_1408() - 1) + class_346Var.readShort());
                break;
            case class_555.field_2148 /* 170 */:
                int readInt2 = class_346Var.readInt();
                int readInt3 = class_346Var.readInt();
                int method_14082 = ((class_346Var.method_1408() - 12) - i) - 1;
                stringBuffer3.append("\tdefault = ").append(readInt + method_14082).append(", low = ").append(readInt2).append(", high = ").append(readInt3).append("(");
                int[] iArr = new int[(readInt3 - readInt2) + 1];
                while (true) {
                    int i6 = i2;
                    if (i2 >= iArr.length) {
                        stringBuffer3.append(")");
                        break;
                    } else {
                        iArr[i6] = class_346Var.readInt() + method_14082;
                        stringBuffer3.append(iArr[i6]);
                        if (i6 < iArr.length - 1) {
                            stringBuffer3.append(", ");
                        }
                        i2 = i6 + 1;
                    }
                }
            case class_555.field_2131 /* 171 */:
                int readInt4 = class_346Var.readInt();
                int method_14083 = ((class_346Var.method_1408() - 8) - i) - 1;
                int[] iArr2 = new int[readInt4];
                int[] iArr3 = new int[readInt4];
                stringBuffer3.append("\tdefault = ").append(readInt + method_14083).append(", npairs = ").append(readInt4).append(" (");
                int i7 = 0;
                int i8 = 0;
                while (i7 < readInt4) {
                    iArr2[i8] = class_346Var.readInt();
                    iArr3[i8] = class_346Var.readInt() + method_14083;
                    stringBuffer3.append("(").append(iArr2[i8]).append(", ").append(iArr3[i8]).append(")");
                    if (i8 < readInt4 - 1) {
                        stringBuffer3.append(", ");
                    }
                    int i9 = i8 + 1;
                    i7 = i9;
                    i8 = i9;
                }
                stringBuffer3.append(")");
                break;
            case class_555.field_2078 /* 178 */:
            case class_555.field_2141 /* 179 */:
            case class_555.field_2211 /* 180 */:
            case class_555.field_2186 /* 181 */:
                int readUnsignedShort4 = class_346Var.readUnsignedShort();
                stringBuffer3.append("\t\t").append(class_499Var.method_1848(readUnsignedShort4, (byte) 9)).append(z ? new StringBuilder().insert(0, " (").append(readUnsignedShort4).append(")").toString() : "");
                break;
            case class_555.field_2147 /* 182 */:
            case class_555.field_2238 /* 183 */:
            case class_555.field_2314 /* 184 */:
                int readUnsignedShort5 = class_346Var.readUnsignedShort();
                stringBuffer3.append("\t").append(class_499Var.method_1848(readUnsignedShort5, (byte) 10)).append(z ? new StringBuilder().insert(0, " (").append(readUnsignedShort5).append(")").toString() : "");
                break;
            case class_555.field_2144 /* 185 */:
                int readUnsignedShort6 = class_346Var.readUnsignedShort();
                stringBuffer3.append("\t").append(class_499Var.method_1848(readUnsignedShort6, (byte) 11)).append(z ? new StringBuilder().insert(0, " (").append(readUnsignedShort6).append(")\t").toString() : "").append(class_346Var.readUnsignedByte()).append("\t").append(class_346Var.readUnsignedByte());
                break;
            case class_555.field_2178 /* 186 */:
                int readUnsignedShort7 = class_346Var.readUnsignedShort();
                class_346Var.readUnsignedShort();
                class_520 class_520Var = (class_520) class_499Var.method_1849(readUnsignedShort7, (byte) 18);
                stringBuffer3.append("\t").append("<dyn>.").append(class_499Var.method_1848(class_520Var.method_433(), (byte) 12));
                if (z) {
                    stringBuffer3.append(" (" + readUnsignedShort7 + "/" + class_520Var.method_433() + ")");
                    break;
                }
                break;
            case class_555.field_2228 /* 187 */:
            case class_555.field_2303 /* 192 */:
                stringBuffer3.append("\t");
                int readUnsignedShort8 = class_346Var.readUnsignedShort();
                stringBuffer3.append("\t<").append(class_499Var.method_1848(readUnsignedShort8, (byte) 7)).append(">").append(!z ? new StringBuilder().insert(0, " (").append(readUnsignedShort8).append(")").toString() : "");
                break;
            case class_555.field_2316 /* 188 */:
                stringBuffer3.append("\t\t<").append(ASMInterface.field_1384[class_346Var.readByte()]).append(">");
                break;
            case class_555.field_2245 /* 189 */:
                int readUnsignedShort9 = class_346Var.readUnsignedShort();
                stringBuffer3.append("\t\t<").append(method_945(class_499Var.method_1845(readUnsignedShort9, (byte) 7), false)).append(">").append(z ? new StringBuilder().insert(0, " (").append(readUnsignedShort9).append(")").toString() : "");
                break;
            case class_555.field_2197 /* 193 */:
                int readUnsignedShort82 = class_346Var.readUnsignedShort();
                stringBuffer3.append("\t<").append(class_499Var.method_1848(readUnsignedShort82, (byte) 7)).append(">").append(!z ? new StringBuilder().insert(0, " (").append(readUnsignedShort82).append(")").toString() : "");
                break;
            case ASMStuffs.field_79 /* 196 */:
                field_766 = true;
                stringBuffer3.append("\t(wide)");
                break;
            case class_555.field_2265 /* 197 */:
                int readUnsignedShort10 = class_346Var.readUnsignedShort();
                stringBuffer3.append("\t<").append(method_945(class_499Var.method_1845(readUnsignedShort10, (byte) 7), false)).append(">\t").append(class_346Var.readUnsignedByte()).append(z ? new StringBuilder().insert(0, " (").append(readUnsignedShort10).append(")").toString() : "");
                break;
            case ASMStuffs.field_150 /* 200 */:
            case ASMStuffs.field_153 /* 201 */:
                stringBuffer3.append("\t\t#").append((class_346Var.method_1408() - 1) + class_346Var.readInt());
                break;
            default:
                if (ASMInterface.field_1582[readUnsignedByte3] > 0) {
                    while (true) {
                        int i10 = i2;
                        if (i2 >= ASMInterface.field_1654[readUnsignedByte3].length) {
                            break;
                        } else {
                            stringBuffer3.append("\t\t");
                            switch (ASMInterface.field_1654[readUnsignedByte3][i10]) {
                                case 8:
                                    stringBuffer3.append((int) class_346Var.readByte());
                                    break;
                                case 9:
                                    stringBuffer3.append((int) class_346Var.readShort());
                                    break;
                                case 10:
                                    stringBuffer3.append(class_346Var.readInt());
                                    break;
                                default:
                                    System.err.println("Unreachable default case reached!");
                                    System.exit(-1);
                                    break;
                            }
                            i2 = i10 + 1;
                        }
                    }
                }
                break;
        }
        return stringBuffer3.toString();
    }

    public static final String[] method_969(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.charAt(0) == '(') {
                for (int i = 1; str.charAt(i) != ')'; i += method_935(field_765)) {
                    arrayList.add(method_962(str.substring(i), z));
                }
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            throw new class_168(new StringBuilder().insert(0, "Invalid method signature: ").append(str).toString());
        } catch (StringIndexOutOfBoundsException e) {
            throw new class_168(new StringBuilder().insert(0, "Invalid method signature: ").append(str).toString());
        }
    }

    public static final String[] method_952(String str) {
        return method_969(str, true);
    }

    public static final String method_932(int i) {
        return method_965(i, false);
    }

    public static final int method_953(int i, int i2) {
        return method_944(i2) | i;
    }

    public static int method_935(ThreadLocal threadLocal) {
        return ((Integer) threadLocal.get()).intValue();
    }

    public static final String method_961(class_346 class_346Var, class_499 class_499Var) {
        return method_943(class_346Var, class_499Var, true);
    }

    public static final int method_959(int i, int i2) {
        int method_944 = method_944(i2);
        return (i & method_944) == 0 ? i : i ^ method_944;
    }

    public static final String method_973(String str, String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer("(");
        if (strArr != null) {
            int i = 0;
            int i2 = 0;
            while (i < strArr.length) {
                String method_955 = method_955(strArr[i2]);
                if (method_955.endsWith("V")) {
                    throw new class_168(new StringBuilder().insert(0, "Invalid type: ").append(strArr[i2]).toString());
                }
                int i3 = i2 + 1;
                stringBuffer.append(method_955);
                i = i3;
                i2 = i3;
            }
        }
        stringBuffer.append(")").append(method_955(str));
        return stringBuffer.toString();
    }

    static {
        int i = 0;
        int i2 = 65;
        int i3 = 65;
        while (i2 <= 90) {
            field_769[i] = i3;
            field_768[i3] = i;
            int i4 = i3 + 1;
            i2 = i4;
            i3 = i4;
            i++;
        }
        int i5 = 103;
        int i6 = 103;
        while (i5 <= 122) {
            field_769[i] = i6;
            field_768[i6] = i;
            int i7 = i6 + 1;
            i5 = i7;
            i6 = i7;
            i++;
        }
        field_769[i] = 36;
        int i8 = i + 1;
        field_768[36] = i;
        field_769[i8] = 95;
        field_768[95] = i8;
    }

    public static final String method_941(String str, String str2, String str3) {
        return method_951(str, str2, str3, true);
    }

    public static final String method_962(String str, boolean z) {
        method_940(field_765, 1);
        try {
            switch (str.charAt(0)) {
                case 'B':
                    return "byte";
                case 'C':
                    return "char";
                case 'D':
                    return "double";
                case 'E':
                case 'G':
                case 'H':
                case 'K':
                case ASMStuffs.field_126 /* 77 */:
                case ASMStuffs.field_111 /* 78 */:
                case class_555.field_2159 /* 79 */:
                case class_555.field_2255 /* 80 */:
                case class_555.field_2096 /* 81 */:
                case class_555.field_2288 /* 82 */:
                case class_555.field_2183 /* 84 */:
                case class_555.field_2313 /* 85 */:
                case class_555.field_2192 /* 87 */:
                case class_555.field_2274 /* 88 */:
                case class_555.field_2188 /* 89 */:
                default:
                    throw new class_168(new StringBuilder().insert(0, "Invalid signature: `").append(str).append("'").toString());
                case 'F':
                    return "float";
                case 'I':
                    return "int";
                case 'J':
                    return "long";
                case ASMStuffs.field_86 /* 76 */:
                    int indexOf = str.indexOf(59);
                    if (indexOf < 0) {
                        throw new class_168(new StringBuilder().insert(0, "Invalid signature: ").append(str).toString());
                    }
                    method_940(field_765, indexOf + 1);
                    return method_945(str.substring(1, indexOf), z);
                case 'S':
                    return "short";
                case class_555.field_2226 /* 86 */:
                    return "void";
                case 'Z':
                    return "boolean";
                case '[':
                    StringBuffer stringBuffer = new StringBuffer();
                    String str2 = str;
                    int i = 0;
                    while (str2.charAt(i) == '[') {
                        i++;
                        stringBuffer.append("[]");
                        str2 = str;
                    }
                    String method_962 = method_962(str.substring(i), z);
                    method_940(field_765, i + method_935(field_765));
                    return new StringBuilder().insert(0, method_962).append(stringBuffer.toString()).toString();
            }
        } catch (StringIndexOutOfBoundsException e) {
            throw new class_168(new StringBuilder().insert(0, "Invalid signature: ").append(e).append(":").append(str).toString());
        }
    }

    public static final int method_944(int i) {
        return 1 << i;
    }

    public static final String method_960(String str, String str2, String str3) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            if (str.indexOf(str2) != -1) {
                int i = 0;
                String str4 = str;
                while (true) {
                    int indexOf = str4.indexOf(str2, i);
                    if (indexOf == -1) {
                        stringBuffer.append(str.substring(i));
                        return stringBuffer.toString();
                    }
                    stringBuffer.append(str.substring(i, indexOf));
                    stringBuffer.append(str3);
                    i = str2.length() + indexOf;
                    str4 = str;
                }
            } else {
                return str;
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println(e);
            return str;
        }
    }

    public static final String method_951(String str, String str2, String str3, boolean z) {
        return method_946(str, str2, str3, z, null);
    }

    public static final String method_946(String str, String str2, String str3, boolean z, class_40 class_40Var) {
        int i;
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2 = new StringBuffer("(");
        int i2 = str3.indexOf("static") >= 0 ? 0 : 1;
        try {
            if (str.charAt(0) != '(') {
                throw new class_168(new StringBuilder().insert(0, "Invalid method signature: ").append(str).toString());
            }
            String str4 = str;
            int i3 = 1;
            while (str4.charAt(i3) != ')') {
                String method_962 = method_962(str.substring(i3), z);
                stringBuffer2.append(method_962);
                if (class_40Var != null) {
                    class_368 method_185 = class_40Var.method_185(i2);
                    if (method_185 != null) {
                        stringBuffer2.append(" ").append(method_185.method_464());
                    }
                } else {
                    stringBuffer2.append(" arg").append(i2);
                }
                if (!"double".equals(method_962) && !"long".equals(method_962)) {
                    i = i2 + 1;
                    stringBuffer = stringBuffer2;
                } else {
                    i = i2 + 2;
                    stringBuffer = stringBuffer2;
                }
                stringBuffer.append(", ");
                i3 += method_935(field_765);
                str4 = str;
                i2 = i;
            }
            String method_9622 = method_962(str.substring(i3 + 1), z);
            if (stringBuffer2.length() > 1) {
                stringBuffer2.setLength(stringBuffer2.length() - 2);
            }
            stringBuffer2.append(")");
            return new StringBuilder().insert(0, str3).append(str3.length() > 0 ? " " : "").append(method_9622).append(" ").append(str2).append(stringBuffer2.toString()).toString();
        } catch (StringIndexOutOfBoundsException e) {
            throw new class_168(new StringBuilder().insert(0, "Invalid method signature: ").append(str).toString());
        }
    }

    public static int method_974(String str) {
        char[] charArray = str.toCharArray();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (i < charArray.length) {
            switch (charArray[i3]) {
                case '[':
                    if (z) {
                        throw new RuntimeException(new StringBuilder().insert(0, "Illegally nested brackets:").append(str).toString());
                    }
                    z = true;
                    break;
                case class_555.field_2280 /* 93 */:
                    if (!z) {
                        throw new RuntimeException(new StringBuilder().insert(0, "Illegally nested brackets:").append(str).toString());
                    }
                    i2++;
                    z = false;
                    break;
            }
            int i4 = i3 + 1;
            i = i4;
            i3 = i4;
        }
        if (z) {
            throw new RuntimeException(new StringBuilder().insert(0, "Illegally nested brackets:").append(str).toString());
        }
        return i2;
    }

    public static final String method_934(String str, boolean z) {
        try {
            return method_962(str.substring(str.lastIndexOf(41) + 1), z);
        } catch (StringIndexOutOfBoundsException e) {
            throw new class_168(new StringBuilder().insert(0, "Invalid method signature: ").append(str).toString());
        }
    }

    public static final byte method_942(String str) {
        try {
            switch (str.charAt(0)) {
                case 'B':
                    return (byte) 8;
                case 'C':
                    return (byte) 5;
                case 'D':
                    return (byte) 7;
                case 'E':
                case 'G':
                case 'H':
                case 'K':
                case ASMStuffs.field_126 /* 77 */:
                case ASMStuffs.field_111 /* 78 */:
                case class_555.field_2159 /* 79 */:
                case class_555.field_2255 /* 80 */:
                case class_555.field_2096 /* 81 */:
                case class_555.field_2288 /* 82 */:
                case class_555.field_2313 /* 85 */:
                case class_555.field_2192 /* 87 */:
                case class_555.field_2274 /* 88 */:
                case class_555.field_2188 /* 89 */:
                default:
                    throw new class_168(new StringBuilder().insert(0, "Invalid method signature: ").append(str).toString());
                case 'F':
                    return (byte) 6;
                case 'I':
                    return (byte) 10;
                case 'J':
                    return (byte) 11;
                case ASMStuffs.field_86 /* 76 */:
                case class_555.field_2183 /* 84 */:
                    return (byte) 14;
                case 'S':
                    return (byte) 9;
                case class_555.field_2226 /* 86 */:
                    return (byte) 12;
                case 'Z':
                    return (byte) 4;
                case '[':
                    return (byte) 13;
            }
        } catch (StringIndexOutOfBoundsException e) {
            throw new class_168(new StringBuilder().insert(0, "Invalid method signature: ").append(str).toString());
        }
    }

    public static final String method_970(String str) {
        return method_962(str, true);
    }

    public static String method_955(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        char[] charArray = str.toCharArray();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i >= charArray.length) {
                i2 = -1;
            } else {
                switch (charArray[i2]) {
                    case '\t':
                    case '\n':
                    case '\f':
                    case class_555.field_2278 /* 13 */:
                    case ' ':
                        if (z2) {
                            z = true;
                        } else {
                            continue;
                        }
                        int i3 = i2 + 1;
                        i = i3;
                        i2 = i3;
                    case '[':
                        if (!z2) {
                            throw new RuntimeException(new StringBuilder().insert(0, "Illegal type: ").append(str).toString());
                        }
                        break;
                    default:
                        if (!z) {
                            stringBuffer.append(charArray[i2]);
                        }
                        z2 = true;
                        continue;
                        int i32 = i2 + 1;
                        i = i32;
                        i2 = i32;
                }
            }
        }
        int method_974 = i2 > 0 ? method_974(str.substring(i2)) : 0;
        String stringBuffer2 = stringBuffer.toString();
        stringBuffer.setLength(0);
        int i4 = 0;
        int i5 = 0;
        while (i4 < method_974) {
            int i6 = i5 + 1;
            stringBuffer.append('[');
            i4 = i6;
            i5 = i6;
        }
        int i7 = 4;
        int i8 = 4;
        boolean z3 = false;
        while (i7 <= 12 && !z3) {
            if (ASMInterface.field_1384[i8].equals(stringBuffer2)) {
                stringBuffer.append(ASMInterface.field_1325[i8]);
                z3 = true;
            }
            int i9 = i8 + 1;
            i7 = i9;
            i8 = i9;
        }
        if (!z3) {
            stringBuffer.append('L').append(stringBuffer2.replace('.', '/')).append(';');
        }
        return stringBuffer.toString();
    }

    public static final byte method_939(String str) {
        try {
            if (str.charAt(0) == '(') {
                return method_942(str.substring(str.lastIndexOf(41) + 1));
            }
            throw new class_168(new StringBuilder().insert(0, "Invalid method signature: ").append(str).toString());
        } catch (StringIndexOutOfBoundsException e) {
            throw new class_168(new StringBuilder().insert(0, "Invalid method signature: ").append(str).toString());
        }
    }

    public static final short method_972(byte b) {
        return b < 0 ? (short) (b + 256) : b;
    }

    public static final void method_967(PrintWriter printWriter, Object[] objArr) {
        printWriter.println(method_964(objArr, true));
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x000c */
    public static final String method_936(String str) {
        char[] charArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i < charArray.length) {
                switch (charArray[i2]) {
                    case '\n':
                        stringBuffer.append("\\n");
                        break;
                    case class_555.field_2278 /* 13 */:
                        stringBuffer.append("\\r");
                        break;
                    case ASMStuffs.field_138 /* 34 */:
                        stringBuffer.append("\\\"");
                        break;
                    case ASMStuffs.field_87 /* 39 */:
                        stringBuffer.append("\\'");
                        break;
                    case class_555.field_2090 /* 92 */:
                        stringBuffer.append("\\\\");
                        break;
                    default:
                        stringBuffer.append(charArray[i2]);
                        break;
                }
                i = i2 + 1;
            } else {
                return stringBuffer.toString();
            }
        }
    }

    public static boolean method_978(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || ((c >= '0' && c <= '9') || c == '_');
    }

    public static class_160[] method_949(class_208 class_208Var, List[] listArr) {
        int[] iArr = new int[listArr.length];
        int[] iArr2 = new int[listArr.length];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < listArr.length) {
            try {
                List list = listArr[i3];
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((class_574) it.next()).method_2019()) {
                            i4++;
                            iArr2[i3] = iArr2[i3] + 1;
                        } else {
                            i2++;
                            iArr[i3] = iArr[i3] + 1;
                        }
                    }
                }
                int i5 = i3 + 1;
                i = i5;
                i2 = i2;
                i3 = i5;
            } catch (IOException e) {
                System.err.println("IOException whilst processing parameter annotations");
                e.printStackTrace();
                return null;
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeByte(listArr.length);
        int i6 = 0;
        int i7 = 0;
        while (i6 < listArr.length) {
            dataOutputStream.writeShort(iArr[i7]);
            if (iArr[i7] > 0) {
                for (class_574 class_574Var : listArr[i7]) {
                    if (class_574Var.method_2019()) {
                        class_574Var.method_2017(dataOutputStream);
                    }
                }
            }
            int i8 = i7 + 1;
            i6 = i8;
            i7 = i8;
        }
        dataOutputStream.close();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream2);
        dataOutputStream2.writeByte(listArr.length);
        int i9 = 0;
        int i10 = 0;
        while (i9 < listArr.length) {
            dataOutputStream2.writeShort(iArr2[i10]);
            if (iArr2[i10] > 0) {
                for (class_574 class_574Var2 : listArr[i10]) {
                    if (!class_574Var2.method_2019()) {
                        class_574Var2.method_2017(dataOutputStream2);
                    }
                }
            }
            int i11 = i10 + 1;
            i9 = i11;
            i10 = i11;
        }
        dataOutputStream2.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
        int method_1004 = i2 > 0 ? class_208Var.method_1004("RuntimeVisibleParameterAnnotations") : -1;
        int method_10042 = i4 > 0 ? class_208Var.method_1004("RuntimeInvisibleParameterAnnotations") : -1;
        ArrayList arrayList = new ArrayList();
        if (i2 > 0) {
            arrayList.add(new class_536(method_1004, byteArray.length, new DataInputStream(new ByteArrayInputStream(byteArray)), class_208Var.method_502()));
        }
        if (i4 > 0) {
            arrayList.add(new class_581(method_10042, byteArray2.length, new DataInputStream(new ByteArrayInputStream(byteArray2)), class_208Var.method_502()));
        }
        return (class_160[]) arrayList.toArray(new class_160[arrayList.size()]);
    }

    public static final String method_947(Object[] objArr) {
        return method_964(objArr, true);
    }

    public static class_160[] method_948(class_208 class_208Var, List list) {
        int i;
        if (list.size() == 0) {
            return null;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < list.size()) {
            try {
                if (((class_574) list.get(i4)).method_2019()) {
                    i = i3 + 1;
                } else {
                    i5++;
                    i = i3;
                }
                int i6 = i4 + 1;
                i2 = i6;
                i3 = i;
                i4 = i6;
            } catch (Exception e) {
                System.err.println("IOException whilst processing annotations");
                e.printStackTrace();
                return null;
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream2);
        try {
            dataOutputStream.writeShort(i3);
            dataOutputStream2.writeShort(i5);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
            return null;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < list.size()) {
            class_574 class_574Var = (class_574) list.get(i8);
            if (class_574Var.method_2019()) {
                class_574Var.method_2017(dataOutputStream);
            } else {
                class_574Var.method_2017(dataOutputStream2);
            }
            int i9 = i8 + 1;
            i7 = i9;
            i8 = i9;
        }
        dataOutputStream.close();
        dataOutputStream2.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
        int method_1004 = byteArray.length > 2 ? class_208Var.method_1004("RuntimeVisibleAnnotations") : -1;
        int method_10042 = byteArray2.length > 2 ? class_208Var.method_1004("RuntimeInvisibleAnnotations") : -1;
        ArrayList arrayList = new ArrayList();
        if (byteArray.length > 2) {
            arrayList.add(new class_512(method_1004, byteArray.length, new DataInputStream(new ByteArrayInputStream(byteArray)), class_208Var.method_502()));
        }
        if (byteArray2.length > 2) {
            arrayList.add(new class_129(method_10042, byteArray2.length, new DataInputStream(new ByteArrayInputStream(byteArray2)), class_208Var.method_502()));
        }
        return (class_160[]) arrayList.toArray(new class_160[arrayList.size()]);
    }

    public static final String method_975(String str, int i, boolean z, char c) {
        int length = i - str.length();
        if (length < 0) {
            length = 0;
        }
        char[] cArr = new char[length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < cArr.length) {
            int i4 = i3 + 1;
            cArr[i3] = c;
            i2 = i4;
            i3 = i4;
        }
        return z ? new StringBuilder().insert(0, str).append(new String(cArr)).toString() : new StringBuilder().insert(0, new String(cArr)).append(str).toString();
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0009 */
    public static short method_938(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        short s = 0;
        while (true) {
            short s2 = s;
            if (s >= ASMInterface.field_1554.length) {
                return (short) -1;
            }
            if (!ASMInterface.field_1554[s2].equals(lowerCase)) {
                s = (short) (s2 + 1);
            } else {
                return s2;
            }
        }
    }

    public static final boolean method_933(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length != bArr2.length) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        return true;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:9:0x0013 */
    public static final String method_977(Object[] objArr, boolean z, boolean z2) {
        int i;
        if (objArr != null) {
            StringBuffer stringBuffer = new StringBuffer();
            if (z) {
                stringBuffer.append('{');
            }
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i2 >= objArr.length) {
                    break;
                }
                if (objArr[i3] != null) {
                    stringBuffer.append(z2 ? "\"" : "").append(objArr[i3].toString()).append(z2 ? "\"" : "");
                    i = i3;
                } else {
                    stringBuffer.append("null");
                    i = i3;
                }
                if (i < objArr.length - 1) {
                    stringBuffer.append(", ");
                }
                i2 = i3 + 1;
            }
            if (z) {
                stringBuffer.append('}');
            }
            return stringBuffer.toString();
        }
        return null;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:5:0x0027 */
    public static String method_950(byte[] bArr, boolean z) {
        int i = 0;
        if (z) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr, 0, bArr.length);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            bArr = byteArrayOutputStream.toByteArray();
        }
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        class_141 class_141Var = new class_141(charArrayWriter);
        while (true) {
            int i2 = i;
            if (i >= bArr.length) {
                return charArrayWriter.toString();
            }
            i = i2 + 1;
            class_141Var.write(bArr[i2] & ASMInterface.field_1291);
        }
    }

    public static final void method_968(PrintStream printStream, Object[] objArr) {
        printStream.println(method_964(objArr, true));
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:2:0x0015 */
    public static byte[] method_956(String str, boolean z) {
        CharArrayReader charArrayReader = new CharArrayReader(str.toCharArray());
        class_68 class_68Var = new class_68(charArrayReader);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = class_68Var.read();
            if (read < 0) {
                break;
            }
            byteArrayOutputStream.write(read);
        }
        byteArrayOutputStream.close();
        charArrayReader.close();
        class_68Var.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (!z) {
            return byteArray;
        }
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(byteArray));
        byte[] bArr = new byte[byteArray.length * 3];
        GZIPInputStream gZIPInputStream2 = gZIPInputStream;
        int i = 0;
        while (true) {
            int read2 = gZIPInputStream2.read();
            if (read2 >= 0) {
                bArr[i] = (byte) read2;
                gZIPInputStream2 = gZIPInputStream;
                i++;
            } else {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, i);
                return bArr2;
            }
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x000a */
    public static final String method_954(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i < bArr.length) {
                short method_972 = method_972(bArr[i2]);
                String num = Integer.toString(method_972, 16);
                if (method_972 < 16) {
                    stringBuffer.append('0');
                }
                stringBuffer.append(num);
                if (i2 < bArr.length - 1) {
                    stringBuffer.append(' ');
                }
                i = i2 + 1;
            } else {
                return stringBuffer.toString();
            }
        }
    }

    public static final String method_964(Object[] objArr, boolean z) {
        return method_977(objArr, z, false);
    }

    public static final String method_963(int i, int i2, boolean z, char c) {
        return method_975(Integer.toString(i), i2, z, c);
    }
}
