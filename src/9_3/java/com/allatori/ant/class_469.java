package com.allatori.ant;

import com.allatori.commons.ASMStuffs;
import com.allatori.exception.indexOutOfBounds.class_81;
import com.allatori.interfaces.unmapped.class_555;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_469 extends class_265 {
    public static final int field_1831 = 1;
    public static final int field_1834 = 2;
    public static final int field_1842 = 4;
    public static final int field_1845 = 3;
    public static final int[] field_1848 = {0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 0, 0, 1, 2, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, -1, -1, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -4, -3, -4, -3, -3, -3, -3, -1, -2, 1, 1, 1, 2, 2, 2, 0, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -2, -1, -2, -1, -2, 0, 1, 0, 1, -1, -1, 0, 0, 1, 1, -1, 0, -1, 0, 0, 0, -3, -1, -1, -3, -3, -1, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2, -2, -2, -2, 0, 1, 0, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0};
    public static final int field_1862 = 0;
    public static final int field_1873 = 0;
    public class_210 field_1815;
    public class_210 field_1816;
    public int field_1817;
    public class_258 field_1818;
    public final int field_1819;
    public final int field_1820;
    public int field_1821;
    public int field_1822;
    public int field_1823;
    public int field_1824;
    public class_210[] field_1825;
    public boolean field_1826;
    public final class_258 field_1827;
    public class_210[] field_1828;
    public class_210 field_1829;
    public int field_1830;
    public int field_1832;
    public class_243 field_1833;
    public class_210 field_1835;
    public final String field_1836;
    public class_187 field_1837;
    public final class_148 field_1838;
    public final int[] field_1839;
    public int[] field_1840;
    public class_210 field_1841;
    public class_258 field_1843;
    public int field_1844;
    public class_243 field_1846;
    public class_444 field_1847;
    public final int field_1849;
    public class_258 field_1850;
    public int field_1851;
    public class_258 field_1852;
    public class_210 field_1853;
    public int field_1854;
    public class_258 field_1855;
    public final int field_1856;
    public int field_1857;
    public int[] field_1858;
    public int field_1859;
    public class_243 field_1860;
    public int field_1861;
    public class_187 field_1863;
    public class_444 field_1864;
    public boolean field_1865;
    public int field_1866;
    public class_258 field_1867;
    public final String field_1868;
    public int field_1869;
    public int field_1870;
    public final int field_1871;
    public final int field_1872;

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:12:0x0041 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public class_469(class_148 class_148Var, int i, String str, String str2, String str3, String[] strArr, int i2) {
        super(class_555.field_2171);
        int i3 = 0;
        this.field_1827 = new class_258();
        this.field_1838 = class_148Var;
        this.field_1871 = "<init>".equals(str) ? 262144 | i : i;
        this.field_1820 = class_148Var.method_720(str);
        this.field_1836 = str;
        this.field_1819 = class_148Var.method_720(str2);
        this.field_1868 = str2;
        this.field_1872 = str3 == null ? 0 : class_148Var.method_720(str3);
        if (strArr == null || strArr.length <= 0) {
            this.field_1849 = 0;
            this.field_1839 = null;
        } else {
            this.field_1849 = strArr.length;
            this.field_1839 = new int[this.field_1849];
            while (true) {
                int i4 = i3;
                if (i3 >= this.field_1849) {
                    break;
                }
                i3 = i4 + 1;
                this.field_1839[i4] = class_148Var.method_752(strArr[i4]).field_1053;
            }
        }
        this.field_1856 = i2;
        if (i2 != 0) {
            int method_1230 = class_279.method_1230(str2) >> 2;
            method_1230 = (i & 8) != 0 ? method_1230 - 1 : method_1230;
            this.field_1859 = method_1230;
            this.field_1869 = method_1230;
            this.field_1833 = new class_243();
            method_1169(this.field_1833);
        }
    }

    @Override // p000.class_265
    public void method_1150(class_187 class_187Var) {
        if (!class_187Var.method_871()) {
            class_187Var.field_739 = this.field_1837;
            this.field_1837 = class_187Var;
        } else {
            class_187Var.field_739 = this.field_1863;
            this.field_1863 = class_187Var;
        }
    }

    @Override // p000.class_265
    public class_610 method_1157() {
        this.field_1855 = new class_258();
        return new class_210(this.field_1838, false, this.field_1855, null);
    }

    @Override // p000.class_265
    public class_610 method_1176(int i, String str, boolean z) {
        if (!z) {
            if (this.field_1825 == null) {
                this.field_1825 = new class_210[class_279.method_1248(this.field_1868)];
            }
            class_210[] class_210VarArr = this.field_1825;
            class_210 method_1019 = class_210.method_1019(this.field_1838, str, this.field_1825[i]);
            class_210VarArr[i] = method_1019;
            return method_1019;
        }
        if (this.field_1828 == null) {
            this.field_1828 = new class_210[class_279.method_1248(this.field_1868)];
        }
        class_210[] class_210VarArr2 = this.field_1828;
        class_210 method_10192 = class_210.method_1019(this.field_1838, str, this.field_1828[i]);
        class_210VarArr2[i] = method_10192;
        return method_10192;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    @Override // p000.class_265
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void method_1166(int i, int i2) {
        class_469 class_469Var;
        class_469 class_469Var2;
        int i3;
        int i4;
        int i5;
        class_469 class_469Var3;
        this.field_1866 = this.field_1827.field_905;
        if (i2 >= 4 || i == 169) {
            if (i2 < 256) {
                this.field_1827.method_1133(i, i2);
                class_469Var = this;
            } else {
                this.field_1827.method_1132(ASMStuffs.field_79).method_1136(i, i2);
                class_469Var = this;
            }
        } else {
            if (i >= 54) {
                i5 = ((i - 54) << 2) + 59 + i2;
                class_469Var3 = this;
            } else {
                i5 = ((i - 21) << 2) + 26 + i2;
                class_469Var3 = this;
            }
            class_469Var3.field_1827.method_1132(i5);
            class_469Var = this;
        }
        if (class_469Var.field_1846 != null) {
            if (this.field_1856 != 4 && this.field_1856 != 3) {
                if (i == 169) {
                    class_243 class_243Var = this.field_1846;
                    class_243Var.field_895 = (short) (class_243Var.field_895 | 64);
                    this.field_1846.field_881 = (short) this.field_1870;
                    method_1763();
                    class_469Var2 = this;
                } else {
                    int i6 = this.field_1870 + field_1848[i];
                    if (i6 > this.field_1857) {
                        this.field_1857 = i6;
                    }
                    this.field_1870 = i6;
                }
            } else {
                this.field_1846.field_891.method_509(i, i2, null, null);
                class_469Var2 = this;
            }
            if (class_469Var2.field_1856 != 0) {
                if (i == 22 || i == 24 || i == 55 || i == 57) {
                    int i7 = i2 + 2;
                    i3 = i7;
                    i4 = i7;
                } else {
                    int i8 = i2 + 1;
                    i3 = i8;
                    i4 = i8;
                }
                if (i3 > this.field_1859) {
                    this.field_1859 = i4;
                }
            }
            if (i >= 54 || this.field_1856 != 4 || this.field_1864 == null) {
                return;
            }
            method_1169(new class_243());
            return;
        }
        class_469Var2 = this;
        if (class_469Var2.field_1856 != 0) {
        }
        if (i >= 54) {
        }
    }

    public boolean method_1764() {
        return this.field_1865;
    }

    public boolean method_1774() {
        return this.field_1861 > 0;
    }

    @Override // p000.class_265
    public class_610 method_1151(String str, boolean z) {
        if (!z) {
            class_210 method_1019 = class_210.method_1019(this.field_1838, str, this.field_1829);
            this.field_1829 = method_1019;
            return method_1019;
        }
        class_210 method_10192 = class_210.method_1019(this.field_1838, str, this.field_1853);
        this.field_1853 = method_10192;
        return method_10192;
    }

    @Override // p000.class_265
    public void method_1163(String str, int i) {
        if (this.field_1850 == null) {
            this.field_1850 = new class_258();
        }
        this.field_1832++;
        this.field_1850.method_1138(str == null ? 0 : this.field_1838.method_720(str)).method_1138(i);
    }

    @Override // p000.class_265
    public void method_1180(int i) {
        int i2;
        this.field_1866 = this.field_1827.field_905;
        this.field_1827.method_1132(i);
        if (this.field_1846 == null) {
            return;
        }
        if (this.field_1856 == 4 || this.field_1856 == 3) {
            this.field_1846.field_891.method_509(i, 0, null, null);
            i2 = i;
        } else {
            int i3 = this.field_1870 + field_1848[i];
            if (i3 > this.field_1857) {
                this.field_1857 = i3;
            }
            this.field_1870 = i3;
            i2 = i;
        }
        if ((i2 < 172 || i > 177) && i != 191) {
            return;
        }
        method_1763();
    }

    @Override // p000.class_265
    public void method_1172(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        int i4;
        class_469 class_469Var;
        class_469 class_469Var2;
        class_469 class_469Var3;
        if (this.field_1856 != 4) {
            if (this.field_1856 != 3) {
                if (i != -1) {
                    if (this.field_1838.method_748() < 50) {
                        throw new IllegalArgumentException("Class versions V1_5 or less must use F_NEW frames.");
                    }
                    if (this.field_1843 == null) {
                        this.field_1843 = new class_258();
                        i4 = this.field_1827.field_905;
                    } else {
                        i4 = (this.field_1827.field_905 - this.field_1823) - 1;
                        if (i4 < 0) {
                            if (i != 3) {
                                throw new IllegalStateException();
                            }
                            return;
                        }
                    }
                    switch (i) {
                        case 0:
                            this.field_1869 = i2;
                            this.field_1843.method_1132(255).method_1138(i4).method_1138(i2);
                            int i5 = 0;
                            int i6 = 0;
                            while (i5 < i2) {
                                int i7 = i6 + 1;
                                method_1760(objArr[i6]);
                                i5 = i7;
                                i6 = i7;
                            }
                            this.field_1843.method_1138(i3);
                            int i8 = 0;
                            int i9 = 0;
                            while (i8 < i3) {
                                int i10 = i9 + 1;
                                method_1760(objArr2[i9]);
                                i8 = i10;
                                i9 = i10;
                            }
                            class_469Var2 = this;
                            class_469Var2.field_1823 = this.field_1827.field_905;
                            this.field_1861++;
                            class_469Var3 = this;
                            break;
                        case 1:
                            this.field_1869 += i2;
                            this.field_1843.method_1132(i2 + 251).method_1138(i4);
                            int i11 = 0;
                            int i12 = 0;
                            while (i11 < i2) {
                                int i13 = i12 + 1;
                                method_1760(objArr[i12]);
                                i11 = i13;
                                i12 = i13;
                            }
                            class_469Var2 = this;
                            class_469Var2.field_1823 = this.field_1827.field_905;
                            this.field_1861++;
                            class_469Var3 = this;
                            break;
                        case 2:
                            this.field_1869 -= i2;
                            this.field_1843.method_1132(251 - i2).method_1138(i4);
                            class_469Var2 = this;
                            class_469Var2.field_1823 = this.field_1827.field_905;
                            this.field_1861++;
                            class_469Var3 = this;
                            break;
                        case 3:
                            if (i4 < 64) {
                                this.field_1843.method_1132(i4);
                                class_469Var2 = this;
                            } else {
                                this.field_1843.method_1132(251).method_1138(i4);
                                class_469Var2 = this;
                            }
                            class_469Var2.field_1823 = this.field_1827.field_905;
                            this.field_1861++;
                            class_469Var3 = this;
                            break;
                        case 4:
                            if (i4 < 64) {
                                this.field_1843.method_1132(i4 + 64);
                                class_469Var = this;
                            } else {
                                this.field_1843.method_1132(247).method_1138(i4);
                                class_469Var = this;
                            }
                            class_469Var.method_1760(objArr2[0]);
                            class_469Var2 = this;
                            class_469Var2.field_1823 = this.field_1827.field_905;
                            this.field_1861++;
                            class_469Var3 = this;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                } else {
                    if (this.field_1840 == null) {
                        int method_1230 = class_279.method_1230(this.field_1868) >> 2;
                        class_77 class_77Var = new class_77(new class_243());
                        class_77Var.method_513(this.field_1838, this.field_1871, this.field_1868, method_1230);
                        class_77Var.method_515(this);
                    }
                    this.field_1869 = i2;
                    int method_1759 = method_1759(this.field_1827.field_905, i2, i3);
                    int i14 = 0;
                    int i15 = 0;
                    while (i14 < i2) {
                        int i16 = i15 + 1;
                        this.field_1858[method_1759] = class_77.method_517(this.field_1838, objArr[i15]);
                        i14 = i16;
                        method_1759++;
                        i15 = i16;
                    }
                    int i17 = 0;
                    int i18 = method_1759;
                    int i19 = 0;
                    while (i17 < i3) {
                        int i20 = i19 + 1;
                        this.field_1858[i18] = class_77.method_517(this.field_1838, objArr2[i19]);
                        i17 = i20;
                        i18++;
                        i19 = i20;
                    }
                    method_1762();
                    class_469Var3 = this;
                }
            } else if (this.field_1846.field_891 != null) {
                if (i == -1) {
                    this.field_1846.field_891.method_520(this.field_1838, i2, objArr, i3, objArr2);
                }
                this.field_1846.field_891.method_515(this);
                class_469Var3 = this;
            } else {
                this.field_1846.field_891 = new class_318(this.field_1846);
                this.field_1846.field_891.method_513(this.field_1838, this.field_1871, this.field_1868, i2);
                this.field_1846.field_891.method_515(this);
                class_469Var3 = this;
            }
            if (class_469Var3.field_1856 == 2) {
                this.field_1870 = i3;
                int i21 = 0;
                int i22 = 0;
                while (i21 < i3) {
                    if (objArr2[i22] == class_555.field_2308 || objArr2[i22] == class_555.field_2247) {
                        this.field_1870++;
                    }
                    int i23 = i22 + 1;
                    i21 = i23;
                    i22 = i23;
                }
                if (this.field_1870 > this.field_1857) {
                    this.field_1857 = this.field_1870;
                }
            }
            this.field_1851 = Math.max(this.field_1851, i3);
            this.field_1859 = Math.max(this.field_1859, this.field_1869);
        }
    }

    @Override // p000.class_265
    public class_610 method_1174(int i, class_91 class_91Var, String str, boolean z) {
        if (!z) {
            class_210 method_1014 = class_210.method_1014(this.field_1838, i, class_91Var, str, this.field_1841);
            this.field_1841 = method_1014;
            return method_1014;
        }
        class_210 method_10142 = class_210.method_1014(this.field_1838, i, class_91Var, str, this.field_1816);
        this.field_1816 = method_10142;
        return method_10142;
    }

    @Override // p000.class_265
    public void method_1158(int i, int i2) {
        class_469 class_469Var;
        this.field_1866 = this.field_1827.field_905;
        if (i == 17) {
            this.field_1827.method_1136(i, i2);
            class_469Var = this;
        } else {
            this.field_1827.method_1133(i, i2);
            class_469Var = this;
        }
        if (class_469Var.field_1846 != null) {
            if (this.field_1856 == 4 || this.field_1856 == 3) {
                this.field_1846.field_891.method_509(i, i2, null, null);
            } else if (i != 188) {
                int i3 = this.field_1870 + 1;
                if (i3 > this.field_1857) {
                    this.field_1857 = i3;
                }
                this.field_1870 = i3;
            }
        }
    }

    @Override // p000.class_265
    public void method_1165(int i, String str) {
        this.field_1866 = this.field_1827.field_905;
        class_296 method_752 = this.field_1838.method_752(str);
        this.field_1827.method_1136(i, method_752.field_1053);
        if (this.field_1846 != null) {
            if (this.field_1856 == 4 || this.field_1856 == 3) {
                this.field_1846.field_891.method_509(i, this.field_1866, method_752, this.field_1838);
            } else if (i == 187) {
                int i2 = this.field_1870 + 1;
                if (i2 > this.field_1857) {
                    this.field_1857 = i2;
                }
                this.field_1870 = i2;
            }
        }
    }

    @Override // p000.class_265
    public void method_1171() {
    }

    @Override // p000.class_265
    public void method_1177(int i, boolean z) {
        if (!z) {
            this.field_1854 = i;
        } else {
            this.field_1824 = i;
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x002d */
    @Override // p000.class_265
    public void method_1154(class_243 class_243Var, int[] iArr, class_243[] class_243VarArr) {
        int i = 0;
        this.field_1866 = this.field_1827.field_905;
        this.field_1827.method_1132(class_555.field_2131).method_1143(null, 0, (4 - (this.field_1827.field_905 % 4)) % 4);
        class_243Var.method_1098(this.field_1827, this.field_1866, true);
        this.field_1827.method_1139(class_243VarArr.length);
        while (true) {
            int i2 = i;
            if (i >= class_243VarArr.length) {
                method_1761(class_243Var, class_243VarArr);
                return;
            } else {
                this.field_1827.method_1139(iArr[i2]);
                i = i2 + 1;
                class_243VarArr[i2].method_1098(this.field_1827, this.field_1866, true);
            }
        }
    }

    @Override // p000.class_265
    public void method_1148(int i, class_243 class_243Var) {
        class_469 class_469Var;
        boolean z;
        class_243 class_243Var2;
        class_243 class_243Var3;
        class_243 class_243Var4;
        this.field_1866 = this.field_1827.field_905;
        int i2 = i >= 200 ? i - 33 : i;
        if ((class_243Var.field_895 & 4) == 0 || class_243Var.field_870 - this.field_1827.field_905 >= -32768) {
            if (i2 == i) {
                this.field_1827.method_1132(i2);
                class_243Var.method_1098(this.field_1827, this.field_1827.field_905 - 1, false);
                class_469Var = this;
                z = false;
            } else {
                this.field_1827.method_1132(i);
                class_243Var.method_1098(this.field_1827, this.field_1827.field_905 - 1, true);
                class_469Var = this;
                z = false;
            }
        } else {
            if (i2 == 167) {
                this.field_1827.method_1132(ASMStuffs.field_150);
                class_243Var4 = class_243Var;
                z = false;
            } else if (i2 != 168) {
                this.field_1827.method_1132(i2 >= 198 ? i2 ^ 1 : ((i2 + 1) ^ 1) - 1);
                this.field_1827.method_1138(8);
                this.field_1827.method_1132(ASMStuffs.field_130);
                this.field_1865 = true;
                class_243Var4 = class_243Var;
                z = true;
            } else {
                this.field_1827.method_1132(ASMStuffs.field_153);
                class_243Var4 = class_243Var;
                z = false;
            }
            class_243Var4.method_1098(this.field_1827, this.field_1827.field_905 - 1, true);
            class_469Var = this;
        }
        if (class_469Var.field_1846 == null) {
            return;
        }
        if (this.field_1856 == 4) {
            this.field_1846.field_891.method_509(i2, 0, null, null);
            class_243 method_1100 = class_243Var.method_1100();
            method_1100.field_895 = (short) (method_1100.field_895 | 2);
            method_1768(0, class_243Var);
            if (i2 != 167) {
                class_243 class_243Var5 = new class_243();
                class_243Var2 = class_243Var5;
                class_243Var3 = class_243Var5;
            }
            class_243Var2 = null;
            class_243Var3 = null;
        } else if (this.field_1856 == 3) {
            this.field_1846.field_891.method_509(i2, 0, null, null);
            class_243Var2 = null;
            class_243Var3 = null;
        } else if (this.field_1856 == 2) {
            this.field_1870 += field_1848[i2];
            class_243Var2 = null;
            class_243Var3 = null;
        } else if (i2 == 168) {
            if ((class_243Var.field_895 & 32) == 0) {
                class_243Var.field_895 = (short) (class_243Var.field_895 | 32);
                this.field_1826 = true;
            }
            class_243 class_243Var6 = this.field_1846;
            class_243Var6.field_895 = (short) (class_243Var6.field_895 | 16);
            method_1768(this.field_1870 + 1, class_243Var);
            class_243 class_243Var7 = new class_243();
            class_243Var2 = class_243Var7;
            class_243Var3 = class_243Var7;
        } else {
            this.field_1870 += field_1848[i2];
            method_1768(this.field_1870, class_243Var);
            class_243Var2 = null;
            class_243Var3 = null;
        }
        if (class_243Var2 != null) {
            if (z) {
                class_243Var3.field_895 = (short) (class_243Var3.field_895 | 2);
            }
            method_1169(class_243Var3);
        }
        if (i2 != 167) {
            return;
        }
        method_1763();
    }

    @Override // p000.class_265
    public void method_1152(String str, String str2, String str3, class_243 class_243Var, class_243 class_243Var2, int i) {
        if (str3 != null) {
            if (this.field_1867 == null) {
                this.field_1867 = new class_258();
            }
            this.field_1822++;
            this.field_1867.method_1138(class_243Var.field_870).method_1138(class_243Var2.field_870 - class_243Var.field_870).method_1138(this.field_1838.method_720(str)).method_1138(this.field_1838.method_720(str3)).method_1138(i);
        }
        if (this.field_1852 == null) {
            this.field_1852 = new class_258();
        }
        this.field_1830++;
        this.field_1852.method_1138(class_243Var.field_870).method_1138(class_243Var2.field_870 - class_243Var.field_870).method_1138(this.field_1838.method_720(str)).method_1138(this.field_1838.method_720(str2)).method_1138(i);
        if (this.field_1856 != 0) {
            char charAt = str2.charAt(0);
            int i2 = ((charAt == 'J' || charAt == 'D') ? 2 : 1) + i;
            if (i2 > this.field_1859) {
                this.field_1859 = i2;
            }
        }
    }

    @Override // p000.class_265
    public void method_1164(String str, String str2, class_350 class_350Var, Object[] objArr) {
        this.field_1866 = this.field_1827.field_905;
        class_296 method_741 = this.field_1838.method_741(str, str2, class_350Var, objArr);
        this.field_1827.method_1136(class_555.field_2178, method_741.field_1053);
        this.field_1827.method_1138(0);
        if (this.field_1846 == null) {
            return;
        }
        if (this.field_1856 == 4 || this.field_1856 == 3) {
            this.field_1846.field_891.method_509(class_555.field_2178, 0, method_741, this.field_1838);
            return;
        }
        int method_1294 = method_741.method_1294();
        int i = ((method_1294 & 3) - (method_1294 >> 2)) + 1 + this.field_1870;
        if (i > this.field_1857) {
            this.field_1857 = i;
        }
        this.field_1870 = i;
    }

    @Override // p000.class_265
    public void method_1170(class_243 class_243Var, class_243 class_243Var2, class_243 class_243Var3, String str) {
        int i;
        String str2;
        if (str != null) {
            i = this.field_1838.method_752(str).field_1053;
            str2 = str;
        } else {
            i = 0;
            str2 = str;
        }
        class_444 class_444Var = new class_444(class_243Var, class_243Var2, class_243Var3, i, str2);
        if (this.field_1864 == null) {
            this.field_1864 = class_444Var;
        } else {
            this.field_1847.field_1739 = class_444Var;
        }
        this.field_1847 = class_444Var;
    }

    @Override // p000.class_265
    public void method_1173(Object obj) {
        class_469 class_469Var;
        char charAt;
        this.field_1866 = this.field_1827.field_905;
        class_296 method_732 = this.field_1838.method_732(obj);
        int i = method_732.field_1053;
        boolean z = method_732.field_1044 == 5 || method_732.field_1044 == 6 || (method_732.field_1044 == 17 && ((charAt = method_732.field_1051.charAt(0)) == 'J' || charAt == 'D'));
        if (z) {
            this.field_1827.method_1136(20, i);
            class_469Var = this;
        } else if (i < 256) {
            this.field_1827.method_1133(18, i);
            class_469Var = this;
        } else {
            this.field_1827.method_1136(19, i);
            class_469Var = this;
        }
        if (class_469Var.field_1846 != null) {
            if (this.field_1856 != 4 && this.field_1856 != 3) {
                int i2 = (z ? -(-2) : 1) + this.field_1870;
                if (i2 > this.field_1857) {
                    this.field_1857 = i2;
                }
                this.field_1870 = i2;
                return;
            }
            this.field_1846.field_891.method_509(18, 0, method_732, this.field_1838);
        }
    }

    @Override // p000.class_265
    public void method_1181(String str, int i) {
        this.field_1866 = this.field_1827.field_905;
        class_296 method_752 = this.field_1838.method_752(str);
        this.field_1827.method_1136(class_555.field_2265, method_752.field_1053).method_1132(i);
        if (this.field_1846 == null) {
            return;
        }
        if (this.field_1856 == 4 || this.field_1856 == 3) {
            this.field_1846.field_891.method_509(class_555.field_2265, i, method_752, this.field_1838);
        } else {
            this.field_1870 += 1 - i;
        }
    }

    @Override // p000.class_265
    public void method_1162(int i, int i2) {
        if (this.field_1856 != 4) {
            if (this.field_1856 != 1) {
                if (this.field_1856 != 2) {
                    this.field_1851 = i;
                    this.field_1859 = i2;
                    return;
                } else {
                    this.field_1851 = this.field_1857;
                    return;
                }
            }
            method_1765();
            return;
        }
        method_1771();
    }

    @Override // p000.class_265
    public class_610 method_1155(int i, class_91 class_91Var, class_243[] class_243VarArr, class_243[] class_243VarArr2, int[] iArr, String str, boolean z) {
        class_258 class_258Var = new class_258();
        class_258Var.method_1132(i >>> 24).method_1138(class_243VarArr.length);
        int i2 = 0;
        int i3 = 0;
        while (i2 < class_243VarArr.length) {
            int i4 = i3 + 1;
            class_258Var.method_1138(class_243VarArr[i3].field_870).method_1138(class_243VarArr2[i3].field_870 - class_243VarArr[i3].field_870).method_1138(iArr[i3]);
            i2 = i4;
            i3 = i4;
        }
        class_91.method_586(class_91Var, class_258Var);
        class_258Var.method_1138(this.field_1838.method_720(str)).method_1138(0);
        if (!z) {
            class_210 class_210Var = new class_210(this.field_1838, true, class_258Var, this.field_1835);
            this.field_1835 = class_210Var;
            return class_210Var;
        }
        class_210 class_210Var2 = new class_210(this.field_1838, true, class_258Var, this.field_1815);
        this.field_1815 = class_210Var2;
        return class_210Var2;
    }

    @Override // p000.class_265
    public void method_1156(int i, String str, String str2, String str3, boolean z) {
        class_469 class_469Var;
        int i2;
        int i3;
        this.field_1866 = this.field_1827.field_905;
        class_296 method_699 = this.field_1838.method_699(str, str2, str3, z);
        if (i == 185) {
            this.field_1827.method_1136(class_555.field_2144, method_699.field_1053).method_1133(method_699.method_1294() >> 2, 0);
            class_469Var = this;
        } else {
            this.field_1827.method_1136(i, method_699.field_1053);
            class_469Var = this;
        }
        if (class_469Var.field_1846 != null) {
            if (this.field_1856 != 4 && this.field_1856 != 3) {
                int method_1294 = method_699.method_1294();
                int i4 = (method_1294 & 3) - (method_1294 >> 2);
                if (i != 184) {
                    int i5 = this.field_1870 + i4;
                    i2 = i5;
                    i3 = i5;
                } else {
                    int i6 = i4 + this.field_1870 + 1;
                    i2 = i6;
                    i3 = i6;
                }
                if (i2 > this.field_1857) {
                    this.field_1857 = i3;
                }
                this.field_1870 = i3;
                return;
            }
            this.field_1846.field_891.method_509(i, 0, method_699, this.field_1838);
        }
    }

    @Override // p000.class_265
    public void method_1153(int i, class_243 class_243Var) {
        if (this.field_1818 == null) {
            this.field_1818 = new class_258();
        }
        this.field_1821++;
        this.field_1818.method_1138(class_243Var.field_870);
        this.field_1818.method_1138(i);
    }

    @Override // p000.class_265
    public void method_1169(class_243 class_243Var) {
        this.field_1865 |= class_243Var.method_1097(this.field_1827.field_904, this.field_1843, this.field_1827.field_905);
        if ((class_243Var.field_895 & 1) == 0) {
            if (this.field_1856 == 4) {
                if (this.field_1846 != null) {
                    if (class_243Var.field_870 != this.field_1846.field_870) {
                        method_1768(0, class_243Var);
                    } else {
                        class_243 class_243Var2 = this.field_1846;
                        class_243Var2.field_895 = (short) (class_243Var2.field_895 | (class_243Var.field_895 & 2));
                        class_243Var.field_891 = this.field_1846.field_891;
                        return;
                    }
                }
                if (this.field_1860 != null) {
                    if (class_243Var.field_870 != this.field_1860.field_870) {
                        this.field_1860.field_892 = class_243Var;
                    } else {
                        class_243 class_243Var3 = this.field_1860;
                        class_243Var3.field_895 = (short) (class_243Var3.field_895 | (class_243Var.field_895 & 2));
                        class_243Var.field_891 = this.field_1860.field_891;
                        this.field_1846 = this.field_1860;
                        return;
                    }
                }
                this.field_1860 = class_243Var;
                this.field_1846 = class_243Var;
                class_243Var.field_891 = new class_77(class_243Var);
                return;
            }
            if (this.field_1856 != 3) {
                if (this.field_1856 == 1) {
                    if (this.field_1846 != null) {
                        this.field_1846.field_886 = (short) this.field_1857;
                        method_1768(this.field_1870, class_243Var);
                    }
                    this.field_1846 = class_243Var;
                    this.field_1870 = 0;
                    this.field_1857 = 0;
                    if (this.field_1860 != null) {
                        this.field_1860.field_892 = class_243Var;
                    }
                    this.field_1860 = class_243Var;
                    return;
                }
                if (this.field_1856 == 2 && this.field_1846 == null) {
                    this.field_1846 = class_243Var;
                    return;
                }
                return;
            }
            if (this.field_1846 != null) {
                this.field_1846.field_891.field_311 = class_243Var;
            } else {
                this.field_1846 = class_243Var;
            }
        }
    }

    public void method_1761(class_243 class_243Var, class_243[] class_243VarArr) {
        if (this.field_1846 != null) {
            if (this.field_1856 != 4) {
                if (this.field_1856 == 1) {
                    this.field_1870--;
                    method_1768(this.field_1870, class_243Var);
                    int length = class_243VarArr.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        int i3 = i2 + 1;
                        method_1768(this.field_1870, class_243VarArr[i2]);
                        i = i3;
                        i2 = i3;
                    }
                }
            } else {
                this.field_1846.field_891.method_509(class_555.field_2131, 0, null, null);
                method_1768(0, class_243Var);
                class_243 method_1100 = class_243Var.method_1100();
                method_1100.field_895 = (short) (method_1100.field_895 | 2);
                int length2 = class_243VarArr.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2) {
                    class_243 class_243Var2 = class_243VarArr[i5];
                    method_1768(0, class_243Var2);
                    class_243 method_11002 = class_243Var2.method_1100();
                    int i6 = i5 + 1;
                    method_11002.field_895 = (short) (method_11002.field_895 | 2);
                    i4 = i6;
                    i5 = i6;
                }
            }
            method_1763();
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:12:0x0061 */
    public void method_1771() {
        class_444 class_444Var = this.field_1864;
        class_444 class_444Var2 = class_444Var;
        class_444 class_444Var3 = class_444Var;
        while (class_444Var2 != null) {
            int method_511 = class_77.method_511(this.field_1838, class_444Var3.field_1738 == null ? "java/lang/Throwable" : class_444Var3.field_1738);
            class_243 method_1100 = class_444Var3.field_1740.method_1100();
            method_1100.field_895 = (short) (method_1100.field_895 | 2);
            class_243 method_11002 = class_444Var3.field_1737.method_1100();
            class_243 method_11003 = class_444Var3.field_1741.method_1100();
            class_243 class_243Var = method_11002;
            class_243 class_243Var2 = method_11002;
            while (class_243Var != method_11003) {
                class_243Var2.field_877 = new class_408(method_511, method_1100, class_243Var2.field_877);
                class_243 class_243Var3 = class_243Var2.field_892;
                class_243Var = class_243Var3;
                class_243Var2 = class_243Var3;
            }
            class_444 class_444Var4 = class_444Var3.field_1739;
            class_444Var2 = class_444Var4;
            class_444Var3 = class_444Var4;
        }
        class_77 class_77Var = this.field_1833.field_891;
        class_77Var.method_513(this.field_1838, this.field_1871, this.field_1868, this.field_1859);
        class_77Var.method_515(this);
        class_243 class_243Var4 = this.field_1833;
        class_243Var4.field_874 = class_243.field_882;
        int i = 0;
        while (true) {
            class_243 class_243Var5 = class_243Var4;
            if (class_243Var5 == class_243.field_882) {
                break;
            }
            class_243Var4 = class_243Var5.field_874;
            class_243Var5.field_874 = null;
            class_243Var5.field_895 = (short) (class_243Var5.field_895 | 8);
            int method_516 = class_243Var5.field_891.method_516() + class_243Var5.field_886;
            if (method_516 <= i) {
                method_516 = i;
            }
            class_408 class_408Var = class_243Var5.field_877;
            class_408 class_408Var2 = class_408Var;
            class_408 class_408Var3 = class_408Var;
            while (class_408Var2 != null) {
                class_243 method_11004 = class_408Var3.field_1258.method_1100();
                if (class_243Var5.field_891.method_529(this.field_1838, method_11004.field_891, class_408Var3.field_1261) && method_11004.field_874 == null) {
                    method_11004.field_874 = class_243Var4;
                } else {
                    method_11004 = class_243Var4;
                }
                class_408 class_408Var4 = class_408Var3.field_1260;
                class_408Var2 = class_408Var4;
                class_408Var3 = class_408Var4;
                class_243Var4 = method_11004;
            }
            i = method_516;
        }
        class_243 class_243Var6 = this.field_1833;
        class_243 class_243Var7 = class_243Var6;
        class_243 class_243Var8 = class_243Var6;
        while (class_243Var7 != null) {
            if ((class_243Var8.field_895 & 10) == 10) {
                class_243Var8.field_891.method_515(this);
            }
            if ((class_243Var8.field_895 & 8) == 0) {
                class_243 class_243Var9 = class_243Var8.field_892;
                int i2 = class_243Var8.field_870;
                int i3 = (class_243Var9 == null ? this.field_1827.field_905 : class_243Var9.field_870) - 1;
                if (i3 >= i2) {
                    int i4 = i2;
                    int i5 = i2;
                    while (i4 < i3) {
                        int i6 = i5 + 1;
                        this.field_1827.field_904[i5] = 0;
                        i4 = i6;
                        i5 = i6;
                    }
                    this.field_1827.field_904[i3] = -65;
                    this.field_1858[method_1759(i2, 0, 1)] = class_77.method_511(this.field_1838, "java/lang/Throwable");
                    method_1762();
                    this.field_1864 = class_444.method_1665(this.field_1864, class_243Var8, class_243Var9);
                    i = Math.max(i, 1);
                }
            }
            class_243 class_243Var10 = class_243Var8.field_892;
            class_243Var7 = class_243Var10;
            class_243Var8 = class_243Var10;
        }
        this.field_1851 = i;
    }

    @Override // p000.class_265
    public class_610 method_1179(int i, class_91 class_91Var, String str, boolean z) {
        if (z) {
            class_210 method_1014 = class_210.method_1014(this.field_1838, i, class_91Var, str, this.field_1815);
            this.field_1815 = method_1014;
            return method_1014;
        }
        class_210 method_10142 = class_210.method_1014(this.field_1838, i, class_91Var, str, this.field_1835);
        this.field_1835 = method_10142;
        return method_10142;
    }

    @Override // p000.class_265
    public void method_1161(int i, int i2, class_243 class_243Var, class_243[] class_243VarArr) {
        this.field_1866 = this.field_1827.field_905;
        this.field_1827.method_1132(class_555.field_2148).method_1143(null, 0, (4 - (this.field_1827.field_905 % 4)) % 4);
        class_243Var.method_1098(this.field_1827, this.field_1866, true);
        this.field_1827.method_1139(i).method_1139(i2);
        int length = class_243VarArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = i4 + 1;
            class_243VarArr[i4].method_1098(this.field_1827, this.field_1866, true);
            i3 = i5;
            i4 = i5;
        }
        method_1761(class_243Var, class_243VarArr);
    }

    @Override // p000.class_265
    public void method_1178(int i, int i2) {
        class_469 class_469Var;
        int i3;
        this.field_1866 = this.field_1827.field_905;
        if (i > 255 || i2 > 127 || i2 < -128) {
            this.field_1827.method_1132(ASMStuffs.field_79).method_1136(class_555.field_2267, i).method_1138(i2);
            class_469Var = this;
        } else {
            this.field_1827.method_1132(class_555.field_2267).method_1133(i, i2);
            class_469Var = this;
        }
        if (class_469Var.field_1846 != null && (this.field_1856 == 4 || this.field_1856 == 3)) {
            this.field_1846.field_891.method_509(class_555.field_2267, i, null, null);
        }
        if (this.field_1856 != 0 && (i3 = i + 1) > this.field_1859) {
            this.field_1859 = i3;
        }
    }

    @Override // p000.class_265
    public void method_1167(int i, String str, String str2, String str3) {
        int i2;
        int i3;
        this.field_1866 = this.field_1827.field_905;
        class_296 method_715 = this.field_1838.method_715(str, str2, str3);
        this.field_1827.method_1136(i, method_715.field_1053);
        if (this.field_1846 != null) {
            if (this.field_1856 != 4 && this.field_1856 != 3) {
                char charAt = str3.charAt(0);
                switch (i) {
                    case class_555.field_2078 /* 178 */:
                        int i4 = this.field_1870 + ((charAt == 'D' || charAt == 'J') ? 2 : 1);
                        i2 = i4;
                        i3 = i4;
                        break;
                    case class_555.field_2141 /* 179 */:
                        int i5 = this.field_1870 + ((charAt == 'D' || charAt == 'J') ? -2 : -1);
                        i2 = i5;
                        i3 = i5;
                        break;
                    case class_555.field_2211 /* 180 */:
                        int i6 = this.field_1870;
                        if (charAt != 'D' && charAt != 'J') {
                            r0 = 0;
                        }
                        int i7 = i6 + r0;
                        i2 = i7;
                        i3 = i7;
                        break;
                    default:
                        int i8 = ((charAt == 'D' || charAt == 'J') ? -3 : -2) + this.field_1870;
                        i2 = i8;
                        i3 = i8;
                        break;
                }
                if (i2 > this.field_1857) {
                    this.field_1857 = i3;
                }
                this.field_1870 = i3;
                return;
            }
            this.field_1846.field_891.method_509(i, 0, method_715, this.field_1838);
        }
    }

    public void method_1765() {
        class_444 class_444Var = this.field_1864;
        class_444 class_444Var2 = class_444Var;
        class_444 class_444Var3 = class_444Var;
        while (class_444Var2 != null) {
            class_243 class_243Var = class_444Var3.field_1740;
            class_243 class_243Var2 = class_444Var3.field_1737;
            class_243 class_243Var3 = class_444Var3.field_1741;
            class_243 class_243Var4 = class_243Var2;
            class_243 class_243Var5 = class_243Var2;
            while (class_243Var4 != class_243Var3) {
                if ((class_243Var5.field_895 & 16) != 0) {
                    class_243Var5.field_877.field_1260.field_1260 = new class_408(class_408.field_1257, class_243Var, class_243Var5.field_877.field_1260.field_1260);
                } else {
                    class_243Var5.field_877 = new class_408(class_408.field_1257, class_243Var, class_243Var5.field_877);
                }
                class_243 class_243Var6 = class_243Var5.field_892;
                class_243Var4 = class_243Var6;
                class_243Var5 = class_243Var6;
            }
            class_444 class_444Var4 = class_444Var3.field_1739;
            class_444Var2 = class_444Var4;
            class_444Var3 = class_444Var4;
        }
        if (this.field_1826) {
            this.field_1833.method_1096((short) 1);
            short s = 1;
            short s2 = 1;
            short s3 = 1;
            while (s <= s2) {
                class_243 class_243Var7 = this.field_1833;
                class_243 class_243Var8 = class_243Var7;
                class_243 class_243Var9 = class_243Var7;
                while (class_243Var8 != null) {
                    if ((class_243Var9.field_895 & 16) != 0 && class_243Var9.field_885 == s3) {
                        class_243 class_243Var10 = class_243Var9.field_877.field_1260.field_1258;
                        if (class_243Var10.field_885 == 0) {
                            s2 = (short) (s2 + 1);
                            class_243Var10.method_1096(s2);
                        }
                    }
                    class_243 class_243Var11 = class_243Var9.field_892;
                    class_243Var8 = class_243Var11;
                    class_243Var9 = class_243Var11;
                }
                short s4 = (short) (s3 + 1);
                s = s4;
                s3 = s4;
            }
            class_243 class_243Var12 = this.field_1833;
            class_243 class_243Var13 = class_243Var12;
            class_243 class_243Var14 = class_243Var12;
            while (class_243Var13 != null) {
                if ((class_243Var14.field_895 & 16) != 0) {
                    class_243Var14.field_877.field_1260.field_1258.method_1101(class_243Var14);
                }
                class_243 class_243Var15 = class_243Var14.field_892;
                class_243Var13 = class_243Var15;
                class_243Var14 = class_243Var15;
            }
        }
        class_243 class_243Var16 = this.field_1833;
        class_243Var16.field_874 = class_243.field_882;
        int i = this.field_1851;
        class_243 class_243Var17 = class_243Var16;
        while (class_243Var17 != class_243.field_882) {
            class_243 class_243Var18 = class_243Var17.field_874;
            short s5 = class_243Var17.field_893;
            int i2 = class_243Var17.field_886 + s5;
            if (i2 <= i) {
                i2 = i;
            }
            class_408 class_408Var = class_243Var17.field_877;
            if ((class_243Var17.field_895 & 16) != 0) {
                class_408Var = class_408Var.field_1260;
            }
            class_408 class_408Var2 = class_408Var;
            class_408 class_408Var3 = class_408Var;
            class_243Var17 = class_243Var18;
            while (class_408Var2 != null) {
                class_243 class_243Var19 = class_408Var3.field_1258;
                if (class_243Var19.field_874 == null) {
                    class_243Var19.field_893 = (short) (class_408Var3.field_1261 == Integer.MAX_VALUE ? 1 : class_408Var3.field_1261 + s5);
                    class_243Var19.field_874 = class_243Var17;
                    class_243Var17 = class_243Var19;
                }
                class_408 class_408Var4 = class_408Var3.field_1260;
                class_408Var2 = class_408Var4;
                class_408Var3 = class_408Var4;
            }
            i = i2;
        }
        this.field_1851 = i;
    }

    @Override // p000.class_265
    public class_610 method_1160(int i, class_91 class_91Var, String str, boolean z) {
        if (z) {
            class_210 method_1014 = class_210.method_1014(this.field_1838, ((-16776961) & i) | (this.field_1866 << 8), class_91Var, str, this.field_1815);
            this.field_1815 = method_1014;
            return method_1014;
        }
        class_210 method_10142 = class_210.method_1014(this.field_1838, ((-16776961) & i) | (this.field_1866 << 8), class_91Var, str, this.field_1835);
        this.field_1835 = method_10142;
        return method_10142;
    }

    public void method_1766(int i, int i2) {
        int i3 = i;
        int i4 = i;
        while (i3 < i2) {
            int i5 = i4 + 1;
            class_77.method_528(this.field_1838, this.field_1858[i4], this.field_1843);
            i3 = i5;
            i4 = i5;
        }
    }

    public final void method_1772(class_549 class_549Var) {
        class_549Var.method_1948(this.field_1837);
        class_549Var.method_1948(this.field_1863);
    }

    public int method_1759(int i, int i2, int i3) {
        int i4 = i2 + 3 + i3;
        if (this.field_1858 == null || this.field_1858.length < i4) {
            this.field_1858 = new int[i4];
        }
        this.field_1858[0] = i;
        this.field_1858[1] = i2;
        this.field_1858[2] = i3;
        return 3;
    }

    public boolean method_1773(class_173 class_173Var, boolean z, boolean z2, int i, int i2, int i3) {
        if (class_173Var != this.field_1838.method_709() || i != this.field_1819 || i2 != this.field_1872) {
            return false;
        }
        if (z2 != ((this.field_1871 & class_555.field_2095) != 0)) {
            return false;
        }
        if (z != ((this.field_1838.method_748() >= 49 || (this.field_1871 & 4096) == 0) ? 0 : -(-1))) {
            return false;
        }
        if (i3 == 0) {
            if (this.field_1849 != 0) {
                return false;
            }
        } else if (class_173Var.method_811(i3) == this.field_1849) {
            int i4 = 0;
            int i5 = i3 + 2;
            int i6 = 0;
            while (i4 < this.field_1849) {
                if (class_173Var.method_811(i5) != this.field_1839[i6]) {
                    return false;
                }
                i5 += 2;
                int i7 = i6 + 1;
                i4 = i7;
                i6 = i7;
            }
        }
        return true;
    }

    public void method_1763() {
        if (this.field_1856 != 4) {
            if (this.field_1856 == 1) {
                this.field_1846.field_886 = (short) this.field_1857;
                this.field_1846 = null;
                return;
            }
            return;
        }
        class_243 class_243Var = new class_243();
        class_243Var.field_891 = new class_77(class_243Var);
        class_243Var.method_1097(this.field_1827.field_904, this.field_1843, this.field_1827.field_905);
        this.field_1860.field_892 = class_243Var;
        this.field_1860 = class_243Var;
        this.field_1846 = null;
    }

    public void method_1760(Object obj) {
        if (obj instanceof Integer) {
            this.field_1843.method_1132(((Integer) obj).intValue());
        } else if (obj instanceof String) {
            this.field_1843.method_1132(7).method_1138(this.field_1838.method_752((String) obj).field_1053);
        } else {
            this.field_1843.method_1132(8);
            ((class_243) obj).method_1092(this.field_1843);
        }
    }

    public void method_1762() {
        if (this.field_1840 != null) {
            if (this.field_1843 == null) {
                this.field_1843 = new class_258();
            }
            method_1775();
            this.field_1861++;
        }
        this.field_1840 = this.field_1858;
        this.field_1858 = null;
    }

    @Override // p000.class_265
    public void method_1159() {
    }

    public int method_1767() {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.field_1817 == 0) {
            int i5 = 8;
            if (this.field_1827.field_905 > 0) {
                if (this.field_1827.field_905 <= 65535) {
                    this.field_1838.method_720("Code");
                    int method_1666 = this.field_1827.field_905 + 16 + class_444.method_1666(this.field_1864) + 8;
                    if (this.field_1843 != null) {
                        this.field_1838.method_720((this.field_1838.method_748() >= 50 ? -(-1) : 0) != 0 ? "StackMapTable" : "StackMap");
                        i4 = this.field_1843.field_905 + 8 + method_1666;
                    } else {
                        i4 = method_1666;
                    }
                    if (this.field_1818 != null) {
                        this.field_1838.method_720("LineNumberTable");
                        i4 += this.field_1818.field_905 + 8;
                    }
                    if (this.field_1852 != null) {
                        this.field_1838.method_720("LocalVariableTable");
                        i4 += this.field_1852.field_905 + 8;
                    }
                    if (this.field_1867 != null) {
                        this.field_1838.method_720("LocalVariableTypeTable");
                        i4 += this.field_1867.field_905 + 8;
                    }
                    if (this.field_1815 != null) {
                        i4 += this.field_1815.method_1025("RuntimeVisibleTypeAnnotations");
                    }
                    i5 = this.field_1835 != null ? i4 + this.field_1835.method_1025("RuntimeInvisibleTypeAnnotations") : i4;
                    if (this.field_1863 != null) {
                        i5 += this.field_1863.method_885(this.field_1838, this.field_1827.field_904, this.field_1827.field_905, this.field_1851, this.field_1859);
                    }
                } else {
                    throw new class_81(this.field_1838.method_716(), this.field_1836, this.field_1868, this.field_1827.field_905);
                }
            }
            if (this.field_1849 > 0) {
                this.field_1838.method_720("Exceptions");
                i5 += (this.field_1849 * 2) + 8;
            }
            int method_1020 = class_210.method_1020(this.field_1853, this.field_1829, this.field_1816, this.field_1841) + class_187.method_880(this.field_1838, this.field_1871, this.field_1872) + i5;
            if (this.field_1828 != null) {
                class_210[] class_210VarArr = this.field_1828;
                if (this.field_1824 == 0) {
                    i3 = this.field_1828.length;
                } else {
                    i3 = this.field_1824;
                }
                i = class_210.method_1021("RuntimeVisibleParameterAnnotations", class_210VarArr, i3) + method_1020;
            } else {
                i = method_1020;
            }
            if (this.field_1825 != null) {
                class_210[] class_210VarArr2 = this.field_1825;
                if (this.field_1854 == 0) {
                    i2 = this.field_1825.length;
                } else {
                    i2 = this.field_1854;
                }
                i += class_210.method_1021("RuntimeInvisibleParameterAnnotations", class_210VarArr2, i2);
            }
            if (this.field_1855 != null) {
                this.field_1838.method_720("AnnotationDefault");
                i += this.field_1855.field_905 + 6;
            }
            if (this.field_1850 != null) {
                this.field_1838.method_720("MethodParameters");
                i += this.field_1850.field_905 + 7;
            }
            return this.field_1837 != null ? i + this.field_1837.method_873(this.field_1838) : i;
        }
        return this.field_1844 + 6;
    }

    public void method_1768(int i, class_243 class_243Var) {
        this.field_1846.field_877 = new class_408(i, class_243Var, this.field_1846.field_877);
    }

    public void method_1769(int i, int i2) {
        this.field_1817 = i + 6;
        this.field_1844 = i2 - 6;
    }

    public void method_1776(class_258 class_258Var) {
        int i;
        class_258 class_258Var2;
        int i2;
        class_258 class_258Var3;
        int i3;
        int i4;
        int i5;
        boolean z = this.field_1838.method_748() < 49;
        class_258Var.method_1138(((z ? 4096 : 0) ^ (-1)) & this.field_1871).method_1138(this.field_1820).method_1138(this.field_1819);
        if (this.field_1817 == 0) {
            int i6 = this.field_1827.field_905 > 0 ? 1 : 0;
            if (this.field_1849 > 0) {
                i6++;
            }
            if ((this.field_1871 & 4096) != 0 && z) {
                i6++;
            }
            if (this.field_1872 != 0) {
                i6++;
            }
            if ((this.field_1871 & class_555.field_2095) != 0) {
                i6++;
            }
            if (this.field_1853 != null) {
                i6++;
            }
            if (this.field_1829 != null) {
                i6++;
            }
            if (this.field_1828 != null) {
                i6++;
            }
            if (this.field_1825 != null) {
                i6++;
            }
            if (this.field_1816 != null) {
                i6++;
            }
            if (this.field_1841 != null) {
                i6++;
            }
            if (this.field_1855 != null) {
                i6++;
            }
            if (this.field_1850 != null) {
                i6++;
            }
            if (this.field_1837 != null) {
                i6 += this.field_1837.method_875();
            }
            class_258Var.method_1138(i6);
            if (this.field_1827.field_905 > 0) {
                int method_1666 = class_444.method_1666(this.field_1864) + this.field_1827.field_905 + 10;
                if (this.field_1843 != null) {
                    method_1666 += this.field_1843.field_905 + 8;
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                if (this.field_1818 != null) {
                    i3++;
                    method_1666 += this.field_1818.field_905 + 8;
                }
                if (this.field_1852 != null) {
                    i3++;
                    method_1666 += this.field_1852.field_905 + 8;
                }
                if (this.field_1867 != null) {
                    i3++;
                    method_1666 += this.field_1867.field_905 + 8;
                }
                if (this.field_1815 != null) {
                    i3++;
                    method_1666 += this.field_1815.method_1025("RuntimeVisibleTypeAnnotations");
                }
                if (this.field_1835 != null) {
                    i4 = i3 + 1;
                    i5 = method_1666 + this.field_1835.method_1025("RuntimeInvisibleTypeAnnotations");
                } else {
                    i4 = i3;
                    i5 = method_1666;
                }
                if (this.field_1863 != null) {
                    i5 += this.field_1863.method_885(this.field_1838, this.field_1827.field_904, this.field_1827.field_905, this.field_1851, this.field_1859);
                    i4 += this.field_1863.method_875();
                }
                class_258Var.method_1138(this.field_1838.method_720("Code")).method_1139(i5).method_1138(this.field_1851).method_1138(this.field_1859).method_1139(this.field_1827.field_905).method_1143(this.field_1827.field_904, 0, this.field_1827.field_905);
                class_444.method_1668(this.field_1864, class_258Var);
                class_258Var.method_1138(i4);
                if (this.field_1843 != null) {
                    class_258Var.method_1138(this.field_1838.method_720(this.field_1838.method_748() >= 50 ? "StackMapTable" : "StackMap")).method_1139(this.field_1843.field_905 + 2).method_1138(this.field_1861).method_1143(this.field_1843.field_904, 0, this.field_1843.field_905);
                }
                if (this.field_1818 != null) {
                    class_258Var.method_1138(this.field_1838.method_720("LineNumberTable")).method_1139(this.field_1818.field_905 + 2).method_1138(this.field_1821).method_1143(this.field_1818.field_904, 0, this.field_1818.field_905);
                }
                if (this.field_1852 != null) {
                    class_258Var.method_1138(this.field_1838.method_720("LocalVariableTable")).method_1139(this.field_1852.field_905 + 2).method_1138(this.field_1830).method_1143(this.field_1852.field_904, 0, this.field_1852.field_905);
                }
                if (this.field_1867 != null) {
                    class_258Var.method_1138(this.field_1838.method_720("LocalVariableTypeTable")).method_1139(this.field_1867.field_905 + 2).method_1138(this.field_1822).method_1143(this.field_1867.field_904, 0, this.field_1867.field_905);
                }
                if (this.field_1815 != null) {
                    this.field_1815.method_1026(this.field_1838.method_720("RuntimeVisibleTypeAnnotations"), class_258Var);
                }
                if (this.field_1835 != null) {
                    this.field_1835.method_1026(this.field_1838.method_720("RuntimeInvisibleTypeAnnotations"), class_258Var);
                }
                if (this.field_1863 != null) {
                    this.field_1863.method_878(this.field_1838, this.field_1827.field_904, this.field_1827.field_905, this.field_1851, this.field_1859, class_258Var);
                }
            }
            if (this.field_1849 > 0) {
                class_258Var.method_1138(this.field_1838.method_720("Exceptions")).method_1139((this.field_1849 * 2) + 2).method_1138(this.field_1849);
                int[] iArr = this.field_1839;
                int length = iArr.length;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length) {
                    int i9 = i8 + 1;
                    class_258Var.method_1138(iArr[i8]);
                    i7 = i9;
                    i8 = i9;
                }
            }
            class_187.method_879(this.field_1838, this.field_1871, this.field_1872, class_258Var);
            class_210.method_1017(this.field_1838, this.field_1853, this.field_1829, this.field_1816, this.field_1841, class_258Var);
            if (this.field_1828 != null) {
                int method_720 = this.field_1838.method_720("RuntimeVisibleParameterAnnotations");
                class_210[] class_210VarArr = this.field_1828;
                if (this.field_1824 == 0) {
                    i2 = this.field_1828.length;
                    class_258Var3 = class_258Var;
                } else {
                    i2 = this.field_1824;
                    class_258Var3 = class_258Var;
                }
                class_210.method_1018(method_720, class_210VarArr, i2, class_258Var3);
            }
            if (this.field_1825 != null) {
                int method_7202 = this.field_1838.method_720("RuntimeInvisibleParameterAnnotations");
                class_210[] class_210VarArr2 = this.field_1825;
                if (this.field_1854 != 0) {
                    i = this.field_1854;
                    class_258Var2 = class_258Var;
                } else {
                    i = this.field_1825.length;
                    class_258Var2 = class_258Var;
                }
                class_210.method_1018(method_7202, class_210VarArr2, i, class_258Var2);
            }
            if (this.field_1855 != null) {
                class_258Var.method_1138(this.field_1838.method_720("AnnotationDefault")).method_1139(this.field_1855.field_905).method_1143(this.field_1855.field_904, 0, this.field_1855.field_905);
            }
            if (this.field_1850 != null) {
                class_258Var.method_1138(this.field_1838.method_720("MethodParameters")).method_1139(this.field_1850.field_905 + 1).method_1132(this.field_1832).method_1143(this.field_1850.field_904, 0, this.field_1850.field_905);
            }
            if (this.field_1837 != null) {
                this.field_1837.method_877(this.field_1838, class_258Var);
                return;
            }
            return;
        }
        class_258Var.method_1143(this.field_1838.method_709().field_713, this.field_1817, this.field_1844);
    }

    public void method_1770(int i, int i2) {
        this.field_1858[i] = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void method_1775() {
        int i;
        char c;
        char c2;
        char c3;
        char c4 = '@';
        int i2 = this.field_1858[1];
        int i3 = this.field_1858[2];
        if (this.field_1838.method_748() >= 50) {
            if (this.field_1861 != 0) {
                i = (this.field_1858[0] - this.field_1840[0]) - 1;
            } else {
                i = this.field_1858[0];
            }
            int i4 = this.field_1840[1];
            int i5 = i2 - i4;
            if (i3 == 0) {
                switch (i5) {
                    case -3:
                    case -2:
                    case -1:
                        c = '\u00f8';
                        c2 = '\u00f8';
                        break;
                    case 0:
                        char c5 = i < 64 ? (char) 0 : '\u00fb';
                        c = c5;
                        c2 = c5;
                        break;
                    case 1:
                    case 2:
                    case 3:
                        c = '\u00fc';
                        c2 = '\u00fc';
                        break;
                    default:
                        c4 = '\u00ff';
                        break;
                }
                if (c != '\u00ff') {
                    int i6 = 0;
                    int i7 = 0;
                    int i8 = 3;
                    while (i6 < i4 && i7 < i2) {
                        if (this.field_1858[i8] == this.field_1840[i8]) {
                            i8++;
                            int i9 = i7 + 1;
                            i6 = i9;
                            i7 = i9;
                        } else {
                            c3 = '\u00ff';
                            switch (c3) {
                                case 0:
                                    this.field_1843.method_1132(i);
                                    break;
                                case '@':
                                    this.field_1843.method_1132(i + 64);
                                    method_1766(i2 + 3, i2 + 4);
                                    break;
                                case '\u00f7':
                                    this.field_1843.method_1132(247).method_1138(i);
                                    method_1766(i2 + 3, i2 + 4);
                                    break;
                                case '\u00f8':
                                    this.field_1843.method_1132(i5 + 251).method_1138(i);
                                    break;
                                case '\u00fb':
                                    this.field_1843.method_1132(251).method_1138(i);
                                    break;
                                case '\u00fc':
                                    this.field_1843.method_1132(i5 + 251).method_1138(i);
                                    method_1766(i4 + 3, i2 + 3);
                                    break;
                                default:
                                    this.field_1843.method_1132(255).method_1138(i).method_1138(i2);
                                    method_1766(3, i2 + 3);
                                    this.field_1843.method_1138(i3);
                                    method_1766(i2 + 3, i2 + 3 + i3);
                                    break;
                            }
                        }
                    }
                }
                c3 = c2;
                switch (c3) {
                    case 0:
                        break;
                    case '@':
                        break;
                    case '\u00f7':
                        break;
                    case '\u00f8':
                        break;
                    case '\u00fb':
                        break;
                    case '\u00fc':
                        break;
                }
            }
            if (i5 != 0 || i3 != 1) {
                c4 = '\u00ff';
            } else if (i >= 63) {
                c4 = '\u00f7';
            }
            c = c4;
            c2 = c4;
            if (c != '\u00ff') {
            }
            c3 = c2;
            switch (c3) {
                case 0:
                    break;
                case '@':
                    break;
                case '\u00f7':
                    break;
                case '\u00f8':
                    break;
                case '\u00fb':
                    break;
                case '\u00fc':
                    break;
            }
        }
        this.field_1843.method_1138(this.field_1858[0]).method_1138(i2);
        method_1766(3, i2 + 3);
        this.field_1843.method_1138(i3);
        method_1766(i2 + 3, i2 + 3 + i3);
    }
}
