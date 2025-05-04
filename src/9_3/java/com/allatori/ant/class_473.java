package com.allatori.ant;

import com.allatori.exception.indexOutOfBounds.class_48;
import com.allatori.interfaces.unmapped.class_555;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_473 extends class_354 {
    public static final int field_1881 = 2;
    public static final int field_1903 = 1;
    public int field_1878;
    public int[] field_1879;
    public class_258 field_1880;
    public int field_1882;
    public int field_1883;
    public class_210 field_1884;
    public class_469 field_1885;
    public final class_148 field_1886;
    public int field_1887;
    public class_258 field_1888;
    public int field_1889;
    public int field_1890;
    public class_210 field_1891;
    public class_155 field_1892;
    public class_210 field_1893;
    public int field_1894;
    public int field_1895;
    public class_187 field_1896;
    public class_258 field_1897;
    public class_258 field_1898;
    public int field_1899;
    public int field_1900;
    public class_500 field_1901;
    public class_500 field_1902;
    public int field_1904;
    public class_136 field_1905;
    public final int field_1906;
    public class_469 field_1907;
    public int field_1908;
    public class_210 field_1909;
    public class_155 field_1910;
    public int field_1911;
    public int field_1912;

    public class_473(class_173 class_173Var, int i) {
        super(class_555.field_2171);
        this.field_1906 = i;
        this.field_1886 = class_173Var == null ? new class_148(this) : new class_148(this, class_173Var);
        method_1786(i);
    }

    @Override // p000.class_354
    public final void method_1446(String str) {
        this.field_1887 = this.field_1886.method_752(str).field_1053;
    }

    @Override // p000.class_354
    public final void method_1437(String str) {
        if (this.field_1888 == null) {
            this.field_1888 = new class_258();
        }
        this.field_1895++;
        this.field_1888.method_1138(this.field_1886.method_752(str).field_1053);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public byte[] method_1789() {
        int i;
        int i2;
        int i3;
        int i4 = (this.field_1899 * 2) + 24;
        class_155 class_155Var = this.field_1892;
        class_155 class_155Var2 = class_155Var;
        int i5 = 0;
        class_155 class_155Var3 = class_155Var;
        while (class_155Var2 != null) {
            i4 += class_155Var3.method_768();
            class_155 class_155Var4 = (class_155) class_155Var3.IIiIIIIiii;
            class_155Var2 = class_155Var4;
            i5++;
            class_155Var3 = class_155Var4;
        }
        class_469 class_469Var = this.field_1907;
        class_469 class_469Var2 = class_469Var;
        class_469 class_469Var3 = class_469Var;
        int i6 = 0;
        while (class_469Var2 != null) {
            i4 += class_469Var3.method_1767();
            class_469 class_469Var4 = (class_469) class_469Var3.IIiiIIIIIi;
            class_469Var2 = class_469Var4;
            class_469Var3 = class_469Var4;
            i6++;
        }
        if (this.field_1898 != null) {
            i = 1;
            i4 += this.field_1898.field_905 + 8;
            this.field_1886.method_720("InnerClasses");
        } else {
            i = 0;
        }
        if (this.field_1894 != 0) {
            i4 += 10;
            i++;
            this.field_1886.method_720("EnclosingMethod");
        }
        if ((this.field_1882 & 4096) != 0 && (this.field_1908 & 65535) < 49) {
            i4 += 6;
            i++;
            this.field_1886.method_720("Synthetic");
        }
        if (this.field_1912 != 0) {
            i4 += 8;
            i++;
            this.field_1886.method_720("Signature");
        }
        if (this.field_1911 != 0) {
            i4 += 8;
            i++;
            this.field_1886.method_720("SourceFile");
        }
        if (this.field_1880 != null) {
            i++;
            i4 += this.field_1880.field_905 + 6;
            this.field_1886.method_720("SourceDebugExtension");
        }
        if ((this.field_1882 & class_555.field_2095) != 0) {
            i4 += 6;
            i++;
            this.field_1886.method_720("Deprecated");
        }
        if (this.field_1884 != null) {
            i++;
            i4 += this.field_1884.method_1025("RuntimeVisibleAnnotations");
        }
        if (this.field_1909 != null) {
            i++;
            i4 += this.field_1909.method_1025("RuntimeInvisibleAnnotations");
        }
        if (this.field_1893 != null) {
            i++;
            i4 += this.field_1893.method_1025("RuntimeVisibleTypeAnnotations");
        }
        if (this.field_1891 != null) {
            i++;
            i4 += this.field_1891.method_1025("RuntimeInvisibleTypeAnnotations");
        }
        if (this.field_1886.method_723() > 0) {
            i++;
            i4 += this.field_1886.method_723();
        }
        if (this.field_1905 != null) {
            i += this.field_1905.method_650();
            i4 += this.field_1905.method_656();
        }
        if (this.field_1887 != 0) {
            i4 += 8;
            i++;
            this.field_1886.method_720("NestHost");
        }
        if (this.field_1897 != null) {
            i++;
            i4 += this.field_1897.field_905 + 8;
            this.field_1886.method_720("NestMembers");
        }
        if (this.field_1888 != null) {
            i++;
            i4 += this.field_1888.field_905 + 8;
            this.field_1886.method_720("PermittedSubclasses");
        }
        int i7 = i;
        if ((this.field_1882 & 65536) == 0 && this.field_1901 == null) {
            i2 = 0;
            i3 = 0;
        } else {
            class_500 class_500Var = this.field_1901;
            class_500 class_500Var2 = class_500Var;
            int i8 = 0;
            int i9 = 0;
            class_500 class_500Var3 = class_500Var;
            while (class_500Var2 != null) {
                i9++;
                i8 += class_500Var3.method_1852();
                class_500 class_500Var4 = (class_500) class_500Var3.IIiIIIIiii;
                class_500Var2 = class_500Var4;
                class_500Var3 = class_500Var4;
            }
            i7++;
            i4 += i8 + 8;
            this.field_1886.method_720("Record");
            i2 = i8;
            i3 = i9;
        }
        if (this.field_1896 != null) {
            i7 += this.field_1896.method_875();
            i4 += this.field_1896.method_873(this.field_1886);
        }
        int method_714 = this.field_1886.method_714() + i4;
        int method_702 = this.field_1886.method_702();
        if (method_702 > 65535) {
            throw new class_48(this.field_1886.method_716(), method_702);
        }
        class_258 class_258Var = new class_258(method_714);
        class_258Var.method_1139(-889275714).method_1139(this.field_1908);
        this.field_1886.method_703(class_258Var);
        class_258Var.method_1138((((this.field_1908 & 65535) < 49 ? 4096 : 0) ^ (-1)) & this.field_1882).method_1138(this.field_1878).method_1138(this.field_1883);
        class_258Var.method_1138(this.field_1899);
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.field_1899) {
            int i12 = i11 + 1;
            class_258Var.method_1138(this.field_1879[i11]);
            i10 = i12;
            i11 = i12;
        }
        class_258Var.method_1138(i5);
        class_155 class_155Var5 = this.field_1892;
        class_155 class_155Var6 = class_155Var5;
        class_155 class_155Var7 = class_155Var5;
        while (class_155Var6 != null) {
            class_155Var7.method_769(class_258Var);
            class_155 class_155Var8 = (class_155) class_155Var7.IIiIIIIiii;
            class_155Var6 = class_155Var8;
            class_155Var7 = class_155Var8;
        }
        class_258Var.method_1138(i6);
        class_469 class_469Var5 = this.field_1907;
        class_469 class_469Var6 = class_469Var5;
        boolean z = false;
        class_469 class_469Var7 = class_469Var5;
        boolean z2 = false;
        while (class_469Var6 != null) {
            z2 |= class_469Var7.method_1774();
            boolean method_1764 = z | class_469Var7.method_1764();
            class_469Var7.method_1776(class_258Var);
            class_469 class_469Var8 = (class_469) class_469Var7.IIiiIIIIIi;
            class_469Var6 = class_469Var8;
            z = method_1764;
            class_469Var7 = class_469Var8;
        }
        class_258Var.method_1138(i7);
        if (this.field_1898 != null) {
            class_258Var.method_1138(this.field_1886.method_720("InnerClasses")).method_1139(this.field_1898.field_905 + 2).method_1138(this.field_1904).method_1143(this.field_1898.field_904, 0, this.field_1898.field_905);
        }
        if (this.field_1894 != 0) {
            class_258Var.method_1138(this.field_1886.method_720("EnclosingMethod")).method_1139(4).method_1138(this.field_1894).method_1138(this.field_1890);
        }
        if ((this.field_1882 & 4096) != 0 && (this.field_1908 & 65535) < 49) {
            class_258Var.method_1138(this.field_1886.method_720("Synthetic")).method_1139(0);
        }
        if (this.field_1912 != 0) {
            class_258Var.method_1138(this.field_1886.method_720("Signature")).method_1139(2).method_1138(this.field_1912);
        }
        if (this.field_1911 != 0) {
            class_258Var.method_1138(this.field_1886.method_720("SourceFile")).method_1139(2).method_1138(this.field_1911);
        }
        if (this.field_1880 != null) {
            int i13 = this.field_1880.field_905;
            class_258Var.method_1138(this.field_1886.method_720("SourceDebugExtension")).method_1139(i13).method_1143(this.field_1880.field_904, 0, i13);
        }
        if ((this.field_1882 & class_555.field_2095) != 0) {
            class_258Var.method_1138(this.field_1886.method_720("Deprecated")).method_1139(0);
        }
        class_210.method_1017(this.field_1886, this.field_1884, this.field_1909, this.field_1893, this.field_1891, class_258Var);
        this.field_1886.method_727(class_258Var);
        if (this.field_1905 != null) {
            this.field_1905.method_648(class_258Var);
        }
        if (this.field_1887 != 0) {
            class_258Var.method_1138(this.field_1886.method_720("NestHost")).method_1139(2).method_1138(this.field_1887);
        }
        if (this.field_1897 != null) {
            class_258Var.method_1138(this.field_1886.method_720("NestMembers")).method_1139(this.field_1897.field_905 + 2).method_1138(this.field_1900).method_1143(this.field_1897.field_904, 0, this.field_1897.field_905);
        }
        if (this.field_1888 != null) {
            class_258Var.method_1138(this.field_1886.method_720("PermittedSubclasses")).method_1139(this.field_1888.field_905 + 2).method_1138(this.field_1895).method_1143(this.field_1888.field_904, 0, this.field_1888.field_905);
        }
        if ((this.field_1882 & 65536) != 0 || this.field_1901 != null) {
            class_258Var.method_1138(this.field_1886.method_720("Record")).method_1139(i2 + 2).method_1138(i3);
            class_500 class_500Var5 = this.field_1901;
            class_500 class_500Var6 = class_500Var5;
            class_500 class_500Var7 = class_500Var5;
            while (class_500Var6 != null) {
                class_500Var7.method_1851(class_258Var);
                class_500 class_500Var8 = (class_500) class_500Var7.IIiIIIIiii;
                class_500Var6 = class_500Var8;
                class_500Var7 = class_500Var8;
            }
        }
        if (this.field_1896 != null) {
            this.field_1896.method_877(this.field_1886, class_258Var);
        }
        return z ? method_1798(class_258Var.field_904, z2) : class_258Var.field_904;
    }

    @Override // p000.class_354
    public final void method_1450(class_187 class_187Var) {
        class_187Var.field_739 = this.field_1896;
        this.field_1896 = class_187Var;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:11:0x0031 */
    @Override // p000.class_354
    public final void method_1444(int i, int i2, String str, String str2, String str3, String[] strArr) {
        int i3 = 0;
        this.field_1908 = i;
        this.field_1882 = i2;
        this.field_1878 = this.field_1886.method_749(i & 65535, str);
        if (str2 != null) {
            this.field_1912 = this.field_1886.method_720(str2);
        }
        this.field_1883 = str3 == null ? 0 : this.field_1886.method_752(str3).field_1053;
        if (strArr != null && strArr.length > 0) {
            this.field_1899 = strArr.length;
            this.field_1879 = new int[this.field_1899];
            while (true) {
                int i4 = i3;
                if (i3 >= this.field_1899) {
                    break;
                }
                i3 = i4 + 1;
                this.field_1879[i4] = this.field_1886.method_752(strArr[i4]).field_1053;
            }
        }
        if (this.field_1889 != 1 || (i & 65535) < 51) {
            return;
        }
        this.field_1889 = 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // p000.class_354
    public final class_610 method_1448(int i, class_91 class_91Var, String str, boolean z) {
        if (z) {
            class_210 method_1014 = class_210.method_1014(this.field_1886, i, class_91Var, str, this.field_1893);
            this.field_1893 = method_1014;
            return method_1014;
        }
        class_210 method_10142 = class_210.method_1014(this.field_1886, i, class_91Var, str, this.field_1891);
        this.field_1891 = method_10142;
        return method_10142;
    }

    @Override // p000.class_354
    public final class_265 method_1447(int i, String str, String str2, String str3, String[] strArr) {
        class_469 class_469Var = new class_469(this.field_1886, i, str, str2, str3, strArr, this.field_1889);
        if (this.field_1907 != null) {
            this.field_1885.IIiiIIIIIi = class_469Var;
        } else {
            this.field_1907 = class_469Var;
        }
        this.field_1885 = class_469Var;
        return class_469Var;
    }

    public boolean method_1793(int i) {
        return (this.field_1906 & i) == i;
    }

    @Override // p000.class_354
    public final class_61 method_1452(String str, String str2, String str3) {
        class_500 class_500Var = new class_500(this.field_1886, str, str2, str3);
        if (this.field_1901 == null) {
            this.field_1901 = class_500Var;
        } else {
            this.field_1902.IIiIIIIiii = class_500Var;
        }
        this.field_1902 = class_500Var;
        return class_500Var;
    }

    @Override // p000.class_354
    public final void method_1439(String str, String str2) {
        if (str != null) {
            this.field_1911 = this.field_1886.method_720(str);
        }
        if (str2 != null) {
            this.field_1880 = new class_258().method_1135(str2, 0, class_408.field_1257);
        }
    }

    @Override // p000.class_354
    public final class_610 method_1453(String str, boolean z) {
        if (!z) {
            class_210 method_1019 = class_210.method_1019(this.field_1886, str, this.field_1909);
            this.field_1909 = method_1019;
            return method_1019;
        }
        class_210 method_10192 = class_210.method_1019(this.field_1886, str, this.field_1884);
        this.field_1884 = method_10192;
        return method_10192;
    }

    @Override // p000.class_354
    public final void method_1442(String str, String str2, String str3) {
        this.field_1894 = this.field_1886.method_752(str).field_1053;
        if (str2 != null && str3 != null) {
            this.field_1890 = this.field_1886.method_754(str2, str3);
        }
    }

    @Override // p000.class_354
    public final void method_1438(String str, String str2, String str3, int i) {
        if (this.field_1898 == null) {
            this.field_1898 = new class_258();
        }
        class_296 method_752 = this.field_1886.method_752(str);
        if (method_752.field_1054 != 0) {
            return;
        }
        this.field_1904++;
        this.field_1898.method_1138(method_752.field_1053);
        this.field_1898.method_1138(str2 == null ? 0 : this.field_1886.method_752(str2).field_1053);
        this.field_1898.method_1138(str3 != null ? this.field_1886.method_720(str3) : 0);
        this.field_1898.method_1138(i);
        method_752.field_1054 = this.field_1904;
    }

    @Override // p000.class_354
    public final class_497 method_1440(String str, int i, String str2) {
        class_136 class_136Var = new class_136(this.field_1886, this.field_1886.method_708(str).field_1053, i, str2 == null ? 0 : this.field_1886.method_720(str2));
        this.field_1905 = class_136Var;
        return class_136Var;
    }

    public class_473(int i) {
        this(null, i);
    }

    @Override // p000.class_354
    public final void method_1451() {
    }

    @Override // p000.class_354
    public final class_153 method_1445(int i, String str, String str2, String str3, Object obj) {
        class_155 class_155Var = new class_155(this.field_1886, i, str, str2, str3, obj);
        if (this.field_1892 != null) {
            this.field_1910.IIiIIIIiii = class_155Var;
        } else {
            this.field_1892 = class_155Var;
        }
        this.field_1910 = class_155Var;
        return class_155Var;
    }

    @Override // p000.class_354
    public final void method_1443(String str) {
        if (this.field_1897 == null) {
            this.field_1897 = new class_258();
        }
        this.field_1900++;
        this.field_1897.method_1138(this.field_1886.method_752(str).field_1053);
    }

    public byte[] method_1798(byte[] bArr, boolean z) {
        class_187[] method_1799 = method_1799();
        this.field_1892 = null;
        this.field_1910 = null;
        this.field_1907 = null;
        this.field_1885 = null;
        this.field_1884 = null;
        this.field_1909 = null;
        this.field_1893 = null;
        this.field_1891 = null;
        this.field_1905 = null;
        this.field_1887 = 0;
        this.field_1900 = 0;
        this.field_1897 = null;
        this.field_1895 = 0;
        this.field_1888 = null;
        this.field_1901 = null;
        this.field_1902 = null;
        this.field_1896 = null;
        this.field_1889 = z ? -(-3) : 0;
        new class_173(bArr, 0, false).method_805(this, method_1799, (z ? 8 : 0) | 256);
        return method_1789();
    }

    public int method_1800(String str) {
        return this.field_1886.method_710(str).field_1053;
    }

    public class_187[] method_1799() {
        class_549 class_549Var = new class_549();
        class_549Var.method_1948(this.field_1896);
        class_155 class_155Var = this.field_1892;
        class_155 class_155Var2 = class_155Var;
        class_155 class_155Var3 = class_155Var;
        while (class_155Var2 != null) {
            class_155Var3.method_767(class_549Var);
            class_155 class_155Var4 = (class_155) class_155Var3.IIiIIIIiii;
            class_155Var2 = class_155Var4;
            class_155Var3 = class_155Var4;
        }
        class_469 class_469Var = this.field_1907;
        class_469 class_469Var2 = class_469Var;
        class_469 class_469Var3 = class_469Var;
        while (class_469Var2 != null) {
            class_469Var3.method_1772(class_549Var);
            class_469 class_469Var4 = (class_469) class_469Var3.IIiiIIIIIi;
            class_469Var2 = class_469Var4;
            class_469Var3 = class_469Var4;
        }
        class_500 class_500Var = this.field_1901;
        class_500 class_500Var2 = class_500Var;
        class_500 class_500Var3 = class_500Var;
        while (class_500Var2 != null) {
            class_500Var3.method_1853(class_549Var);
            class_500 class_500Var4 = (class_500) class_500Var3.IIiIIIIiii;
            class_500Var2 = class_500Var4;
            class_500Var3 = class_500Var4;
        }
        return class_549Var.method_1949();
    }

    public int method_1791(String str, String str2, class_350 class_350Var, Object[] objArr) {
        return this.field_1886.method_726(str, str2, class_350Var, objArr).field_1053;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public int method_1792(int i, String str, String str2, String str3) {
        return method_1801(i, str, str2, str3, i == 9 ? -(-1) : false);
    }

    public int method_1795(String str) {
        return this.field_1886.method_743(str).field_1053;
    }

    public int method_1802(String str, String str2, String str3) {
        return this.field_1886.method_715(str, str2, str3).field_1053;
    }

    public int method_1794(String str) {
        return this.field_1886.method_708(str).field_1053;
    }

    public int method_1785(String str, String str2, class_350 class_350Var, Object[] objArr) {
        return this.field_1886.method_741(str, str2, class_350Var, objArr).field_1053;
    }

    public int method_1787(Object obj) {
        return this.field_1886.method_732(obj).field_1053;
    }

    public int method_1797(String str) {
        return this.field_1886.method_752(str).field_1053;
    }

    public int method_1790(String str) {
        return this.field_1886.method_720(str);
    }

    public int method_1801(int i, String str, String str2, String str3, boolean z) {
        return this.field_1886.method_713(i, str, str2, str3, z).field_1053;
    }

    public String method_160(String str, String str2) {
        ClassLoader method_1788 = method_1788();
        try {
            Class<?> cls = Class.forName(str.replace('/', '.'), false, method_1788);
            try {
                Class<?> cls2 = Class.forName(str2.replace('/', '.'), false, method_1788);
                if (!cls.isAssignableFrom(cls2)) {
                    if (cls2.isAssignableFrom(cls)) {
                        return str2;
                    }
                    if (!cls.isInterface() && !cls2.isInterface()) {
                        do {
                            cls = cls.getSuperclass();
                        } while (!cls.isAssignableFrom(cls2));
                        return cls.getName().replace('.', '/');
                    }
                    return "java/lang/Object";
                }
                return str;
            } catch (ClassNotFoundException e) {
                throw new TypeNotPresentException(str2, e);
            }
        } catch (ClassNotFoundException e2) {
            throw new TypeNotPresentException(str, e2);
        }
    }

    public int method_1803(String str, String str2, String str3, boolean z) {
        return this.field_1886.method_699(str, str2, str3, z).field_1053;
    }

    public final void method_1786(int i) {
        if ((i & 2) == 0) {
            if ((i & 1) == 0) {
                this.field_1889 = 0;
                return;
            } else {
                this.field_1889 = 1;
                return;
            }
        }
        this.field_1889 = 4;
    }

    public int method_1796(String str, String str2) {
        return this.field_1886.method_754(str, str2);
    }

    public ClassLoader method_1788() {
        return getClass().getClassLoader();
    }
}
