package com.allatori.ant;

import com.allatori.commons.ASMStuffs;
import com.allatori.interfaces.unmapped.class_555;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_526 {
    public final String field_1999;

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:11:0x003a */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:20:0x005c */
    public void method_1895(class_463 class_463Var) {
        String str;
        char charAt;
        int i = 0;
        String str2 = this.field_1999;
        int length = str2.length();
        if (str2.charAt(0) == '<') {
            i = 2;
            do {
                int indexOf = str2.indexOf(58, i);
                class_463Var.method_1740(str2.substring(i - 1, indexOf));
                int i2 = indexOf + 1;
                char charAt2 = str2.charAt(i2);
                if (charAt2 == 'L' || charAt2 == '[' || charAt2 == 'T') {
                    i2 = method_1893(str2, i2, class_463Var.method_1742());
                }
                while (true) {
                    charAt = str2.charAt(i2);
                    i = i2 + 1;
                    if (charAt != ':') {
                        break;
                    } else {
                        i2 = method_1893(str2, i, class_463Var.method_1752());
                    }
                }
            } while (charAt != '>');
            str = str2;
        } else {
            str = str2;
        }
        if (str.charAt(i) == '(') {
            int i3 = i + 1;
            while (str2.charAt(i3) != ')') {
                i3 = method_1893(str2, i3, class_463Var.method_1738());
            }
            int method_1893 = method_1893(str2, i3 + 1, class_463Var.method_1746());
            int i4 = method_1893;
            int i5 = method_1893;
            while (i4 < length) {
                int method_18932 = method_1893(str2, i5 + 1, class_463Var.method_1750());
                i4 = method_18932;
                i5 = method_18932;
            }
            return;
        }
        int method_18933 = method_1893(str2, i, class_463Var.method_1748());
        int i6 = method_18933;
        int i7 = method_18933;
        while (i6 < length) {
            int method_18934 = method_1893(str2, i7, class_463Var.method_1745());
            i6 = method_18934;
            i7 = method_18934;
        }
    }

    public class_526(String str) {
        this.field_1999 = str;
    }

    public void method_1894(class_463 class_463Var) {
        method_1893(this.field_1999, 0, class_463Var);
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:11:0x0032 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:21:0x006e */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0058 A[LOOP:1: B:14:0x0033->B:51:0x0058, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int method_1893(String str, int i, class_463 class_463Var) {
        char c;
        char charAt = str.charAt(i);
        int i2 = i + 1;
        switch (charAt) {
            case 'B':
            case 'C':
            case 'D':
            case 'F':
            case 'I':
            case 'J':
            case 'S':
            case class_555.field_2226 /* 86 */:
            case 'Z':
                class_463Var.method_1743(charAt);
                return i2;
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
                throw new IllegalArgumentException();
            case ASMStuffs.field_86 /* 76 */:
                boolean z = false;
                boolean z2 = false;
                int i3 = i2;
                while (true) {
                    int i4 = i2;
                    String str2 = str;
                    while (true) {
                        char charAt2 = str2.charAt(i4);
                        i2 = i4 + 1;
                        if (charAt2 == '.' || charAt2 == ';') {
                            if (!z2) {
                                String substring = str.substring(i3, i2 - 1);
                                if (z) {
                                    class_463Var.method_1739(substring);
                                    c = charAt2;
                                    if (c != ';') {
                                        class_463Var.method_1751();
                                        return i2;
                                    }
                                    str2 = str;
                                    z = true;
                                    z2 = false;
                                    i3 = i2;
                                    i4 = i2;
                                } else {
                                    class_463Var.method_1744(substring);
                                }
                            }
                            c = charAt2;
                            if (c != ';') {
                            }
                        } else if (charAt2 == '<') {
                            String substring2 = str.substring(i3, i2 - 1);
                            if (!z) {
                                class_463Var.method_1744(substring2);
                            } else {
                                class_463Var.method_1739(substring2);
                            }
                            while (true) {
                                char charAt3 = str.charAt(i2);
                                if (charAt3 != '>') {
                                    switch (charAt3) {
                                        case ASMStuffs.field_147 /* 42 */:
                                            i2++;
                                            class_463Var.method_1749();
                                            break;
                                        case ASMStuffs.field_161 /* 43 */:
                                        case ASMStuffs.field_175 /* 45 */:
                                            i2 = method_1893(str, i2 + 1, class_463Var.method_1741(charAt3));
                                            break;
                                        case ASMStuffs.field_167 /* 44 */:
                                        default:
                                            i2 = method_1893(str, i2, class_463Var.method_1741(class_463.field_1808));
                                            break;
                                    }
                                } else {
                                    z2 = true;
                                }
                            }
                        }
                    }
                }
            case class_555.field_2183 /* 84 */:
                int indexOf = str.indexOf(59, i2);
                class_463Var.method_1753(str.substring(i2, indexOf));
                return indexOf + 1;
            case '[':
                return method_1893(str, i2, class_463Var.method_1737());
        }
    }
}
