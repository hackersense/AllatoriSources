package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_555;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_148 {
    public class_53[] field_654;
    public class_319[] field_655;
    public String field_656;
    public int field_657;
    public int field_658;
    public int field_659;
    public class_258 field_660;
    public int field_661;
    public int field_662;
    public class_319[] field_663;
    public int field_664;
    public final class_173 field_665;
    public class_258 field_666;
    public final class_473 field_667;
    public class_53[] field_668;

    public static String method_736(Object obj) {
        return new StringBuilder().insert(0, "value ").append(obj).toString();
    }

    public class_173 method_709() {
        return this.field_665;
    }

    public class_148(class_473 class_473Var) {
        this.field_667 = class_473Var;
        this.field_665 = null;
        this.field_655 = new class_319[256];
        this.field_658 = 1;
        this.field_660 = new class_258();
    }

    public int method_749(int i, String str) {
        this.field_664 = i;
        this.field_656 = str;
        return method_752(str).field_1053;
    }

    public void method_727(class_258 class_258Var) {
        if (this.field_666 == null) {
            return;
        }
        class_258Var.method_1138(method_720("BootstrapMethods")).method_1139(this.field_666.field_905 + 2).method_1138(this.field_659).method_1143(this.field_666.field_904, 0, this.field_666.field_905);
    }

    public int method_748() {
        return this.field_664;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public class_296 method_732(Object obj) {
        if (obj instanceof Integer) {
            return method_717(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return method_717(((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return method_717(((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return method_717(((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return method_717(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return method_701(((Float) obj).floatValue());
        }
        if (obj instanceof Long) {
            return method_724(((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return method_721(((Double) obj).doubleValue());
        }
        if (obj instanceof String) {
            return method_719((String) obj);
        }
        if (obj instanceof class_279) {
            class_279 class_279Var = (class_279) obj;
            int method_1255 = class_279Var.method_1255();
            return method_1255 == 10 ? method_752(class_279Var.method_1250()) : method_1255 == 11 ? method_743(class_279Var.method_1234()) : method_752(class_279Var.method_1234());
        }
        if (obj instanceof class_350) {
            class_350 class_350Var = (class_350) obj;
            return method_713(class_350Var.method_1420(), class_350Var.method_1421(), class_350Var.method_1422(), class_350Var.method_1423(), class_350Var.method_1424());
        }
        if (!(obj instanceof class_470)) {
            throw new IllegalArgumentException(method_736(obj));
        }
        class_470 class_470Var = (class_470) obj;
        return method_726(class_470Var.method_1783(), class_470Var.method_1780(), class_470Var.method_1781(), class_470Var.method_1784());
    }

    public int method_723() {
        if (this.field_666 == null) {
            return 0;
        }
        method_720("BootstrapMethods");
        return this.field_666.field_905 + 8;
    }

    public class_319 method_707(int i, String str, String str2, String str3) {
        int method_739 = method_739(i, str, str2, str3);
        class_319 method_740 = method_740(method_739);
        class_319 class_319Var = method_740;
        class_319 class_319Var2 = method_740;
        while (class_319Var != null) {
            if (class_319Var2.IiiIIiiIii != i || class_319Var2.field_1099 != method_739 || !class_319Var2.IIIIiiiIIi.equals(str) || !class_319Var2.IiIiIiIIii.equals(str2) || !class_319Var2.IIiIIiIIii.equals(str3)) {
                class_319 class_319Var3 = class_319Var2.field_1100;
                class_319Var = class_319Var3;
                class_319Var2 = class_319Var3;
            } else {
                return class_319Var2;
            }
        }
        this.field_660.method_1141(i, method_752(str).field_1053, method_754(str2, str3));
        int i2 = this.field_658;
        this.field_658 = i2 + 1;
        return method_705(new class_319(i2, i, str, str2, str3, 0L, method_739));
    }

    public int method_714() {
        return this.field_660.field_905;
    }

    public int method_702() {
        return this.field_658;
    }

    /* JADX DEBUG: Move duplicate insns, count: 3 to block B:12:0x0060 */
    public void method_742(class_173 class_173Var, char[] cArr) {
        class_148 class_148Var;
        int i;
        byte[] bArr = class_173Var.field_713;
        int method_812 = class_173Var.method_812();
        int method_811 = class_173Var.method_811(method_812 - 2);
        int i2 = method_811;
        int i3 = method_811;
        while (true) {
            if (i2 <= 0) {
                class_148Var = this;
                break;
            }
            if (!"BootstrapMethods".equals(class_173Var.method_844(method_812, cArr))) {
                int i4 = i3 - 1;
                method_812 += class_173Var.method_836(method_812 + 2) + 6;
                i2 = i4;
                i3 = i4;
            } else {
                this.field_659 = class_173Var.method_811(method_812 + 6);
                class_148Var = this;
                break;
            }
        }
        if (class_148Var.field_659 <= 0) {
            return;
        }
        int i5 = method_812 + 8;
        int method_836 = class_173Var.method_836(method_812 + 2) - 2;
        this.field_666 = new class_258(method_836);
        this.field_666.method_1143(bArr, i5, method_836);
        int i6 = 0;
        int i7 = i5;
        int i8 = 0;
        while (i6 < this.field_659) {
            int i9 = i7 - i5;
            int i10 = i7 + 2;
            int method_8112 = class_173Var.method_811(i7);
            int method_8113 = class_173Var.method_811(i10);
            int i11 = i10 + 2;
            int hashCode = class_173Var.method_825(method_8112, cArr).hashCode();
            while (true) {
                int i12 = method_8113;
                i = hashCode;
                method_8113--;
                if (i12 > 0) {
                    int method_8114 = class_173Var.method_811(i11);
                    i11 += 2;
                    hashCode = i ^ class_173Var.method_825(method_8114, cArr).hashCode();
                }
            }
            int i13 = i8 + 1;
            method_725(new class_319(i8, 64, i9, i & class_408.field_1257));
            i6 = i13;
            i7 = i11;
            i8 = i13;
        }
    }

    public class_296 method_699(String str, String str2, String str3, boolean z) {
        return method_707(z ? 11 : 10, str, str2, str3);
    }

    public void method_725(class_319 class_319Var) {
        this.field_662++;
        int length = class_319Var.field_1099 % this.field_655.length;
        class_319Var.field_1100 = this.field_655[length];
        this.field_655[length] = class_319Var;
    }

    public class_319 method_705(class_319 class_319Var) {
        if (this.field_662 > (this.field_655.length * 3) / 4) {
            int length = this.field_655.length;
            int i = (length * 2) + 1;
            class_319[] class_319VarArr = new class_319[i];
            int i2 = length - 1;
            int i3 = i2;
            int i4 = i2;
            while (i3 >= 0) {
                class_319 class_319Var2 = this.field_655[i4];
                class_319 class_319Var3 = class_319Var2;
                class_319 class_319Var4 = class_319Var2;
                while (class_319Var3 != null) {
                    int i5 = class_319Var4.field_1099 % i;
                    class_319 class_319Var5 = class_319Var4.field_1100;
                    class_319Var4.field_1100 = class_319VarArr[i5];
                    class_319VarArr[i5] = class_319Var4;
                    class_319Var3 = class_319Var5;
                    class_319Var4 = class_319Var5;
                }
                int i6 = i4 - 1;
                i3 = i6;
                i4 = i6;
            }
            this.field_655 = class_319VarArr;
        }
        this.field_662++;
        int length2 = class_319Var.field_1099 % this.field_655.length;
        class_319Var.field_1100 = this.field_655[length2];
        this.field_655[length2] = class_319Var;
        return class_319Var;
    }

    public String method_716() {
        return this.field_656;
    }

    public class_296 method_752(String str) {
        return method_731(7, str);
    }

    public class_296 method_715(String str, String str2, String str3) {
        return method_707(9, str, str2, str3);
    }

    public void method_703(class_258 class_258Var) {
        class_258Var.method_1138(this.field_658).method_1143(this.field_660.field_904, 0, this.field_660.field_905);
    }

    /* JADX DEBUG: Move duplicate insns, count: 3 to block B:2:0x0038 */
    /* JADX DEBUG: Multi-variable search result rejected for r9v2, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    public class_148(class_473 class_473Var, class_173 class_173Var) {
        this.field_667 = class_473Var;
        this.field_665 = class_173Var;
        byte[] bArr = class_173Var.field_713;
        int method_839 = class_173Var.method_839(1) - 1;
        int i = class_173Var.field_715 - method_839;
        this.field_658 = class_173Var.method_814();
        this.field_660 = new class_258(i);
        this.field_660.method_1143(bArr, method_839, i);
        this.field_655 = new class_319[this.field_658 * 2];
        char[] cArr = new char[class_173Var.method_810()];
        boolean z = false;
        int i2 = 1;
        while (true) {
            boolean z2 = z;
            int i3 = i2;
            if (i2 < this.field_658) {
                int method_8392 = class_173Var.method_839(i3);
                byte b = bArr[method_8392 - 1];
                switch (b) {
                    case 1:
                        method_751(i3, class_173Var.method_830(i3, cArr));
                        z = z2;
                        break;
                    case 2:
                    case class_555.field_2278 /* 13 */:
                    case class_555.field_2199 /* 14 */:
                    default:
                        throw new IllegalArgumentException();
                    case 3:
                    case 4:
                        method_698(i3, b, class_173Var.method_836(method_8392));
                        z = z2;
                        break;
                    case 5:
                    case 6:
                        method_730(i3, b, class_173Var.method_829(method_8392));
                        z = z2;
                        break;
                    case 7:
                    case 8:
                    case 16:
                    case 19:
                    case 20:
                        method_738(i3, b, class_173Var.method_844(method_8392, cArr));
                        z = z2;
                        break;
                    case 9:
                    case 10:
                    case 11:
                        int method_8393 = class_173Var.method_839(class_173Var.method_811(method_8392 + 2));
                        method_757(i3, b, class_173Var.method_840(method_8392, cArr), class_173Var.method_844(method_8393, cArr), class_173Var.method_844(method_8393 + 2, cArr));
                        z = z2;
                        break;
                    case 12:
                        method_746(i3, class_173Var.method_844(method_8392, cArr), class_173Var.method_844(method_8392 + 2, cArr));
                        z = z2;
                        break;
                    case 15:
                        int method_8394 = class_173Var.method_839(class_173Var.method_811(method_8392 + 1));
                        int method_8395 = class_173Var.method_839(class_173Var.method_811(method_8394 + 2));
                        method_712(i3, class_173Var.method_823(method_8392), class_173Var.method_840(method_8394, cArr), class_173Var.method_844(method_8395, cArr), class_173Var.method_844(method_8395 + 2, cArr), class_173Var.method_823(method_8394 + (-1)) == 11 ? -(-1) : false);
                        z = z2;
                        break;
                    case 17:
                    case 18:
                        int method_8396 = class_173Var.method_839(class_173Var.method_811(method_8392 + 2));
                        method_711(b, i3, class_173Var.method_844(method_8396, cArr), class_173Var.method_844(method_8396 + 2, cArr), class_173Var.method_811(method_8392));
                        z = true;
                        break;
                }
                i2 = i3 + ((b == 5 || b == 6) ? 2 : 1);
            } else {
                if (!z2) {
                    return;
                }
                method_742(class_173Var, cArr);
                return;
            }
        }
    }

    public class_319 method_740(int i) {
        return this.field_655[i % this.field_655.length];
    }

    public class_296 method_700(int i, String str, String str2, int i2) {
        int method_758 = method_758(i, str, str2, i2);
        class_319 method_740 = method_740(method_758);
        class_319 class_319Var = method_740;
        class_319 class_319Var2 = method_740;
        while (class_319Var != null) {
            if (class_319Var2.IiiIIiiIii != i || class_319Var2.field_1099 != method_758 || class_319Var2.IIiiiIIIiI != i2 || !class_319Var2.IiIiIiIIii.equals(str) || !class_319Var2.IIiIIiIIii.equals(str2)) {
                class_319 class_319Var3 = class_319Var2.field_1100;
                class_319Var = class_319Var3;
                class_319Var2 = class_319Var3;
            } else {
                return class_319Var2;
            }
        }
        this.field_660.method_1141(i, i2, method_754(str, str2));
        int i3 = this.field_658;
        this.field_658 = i3 + 1;
        return method_705(new class_319(i3, i, null, str, str2, i2, method_758));
    }

    public class_296 method_701(float f) {
        return method_718(4, Float.floatToRawIntBits(f));
    }

    public void method_730(int i, int i2, long j) {
        method_725(new class_319(i, i2, j, method_729(i2, j)));
    }

    public void method_712(int i, int i2, String str, String str2, String str3, boolean z) {
        int method_697 = method_697(i2, z);
        method_725(new class_319(i, 15, str, str2, str3, method_697, method_747(15, str, str2, str3, method_697)));
    }

    public class_296 method_717(int i) {
        return method_718(3, i);
    }

    public int method_754(String str, String str2) {
        int method_756 = method_756(12, str, str2);
        class_319 method_740 = method_740(method_756);
        class_319 class_319Var = method_740;
        class_319 class_319Var2 = method_740;
        while (class_319Var != null) {
            if (class_319Var2.IiiIIiiIii == 12 && class_319Var2.field_1099 == method_756 && class_319Var2.IiIiIiIIii.equals(str) && class_319Var2.IIiIIiIIii.equals(str2)) {
                return class_319Var2.IiiIiiiiII;
            }
            class_319 class_319Var3 = class_319Var2.field_1100;
            class_319Var = class_319Var3;
            class_319Var2 = class_319Var3;
        }
        this.field_660.method_1141(12, method_720(str), method_720(str2));
        int i = this.field_658;
        this.field_658 = i + 1;
        return method_705(new class_319(i, 12, str, str2, method_756)).IiiIiiiiII;
    }

    public class_296 method_719(String str) {
        return method_731(8, str);
    }

    public int method_720(String str) {
        int method_750 = method_750(1, str);
        class_319 method_740 = method_740(method_750);
        class_319 class_319Var = method_740;
        class_319 class_319Var2 = method_740;
        while (class_319Var != null) {
            if (class_319Var2.IiiIIiiIii != 1 || class_319Var2.field_1099 != method_750 || !class_319Var2.IIiIIiIIii.equals(str)) {
                class_319 class_319Var3 = class_319Var2.field_1100;
                class_319Var = class_319Var3;
                class_319Var2 = class_319Var3;
            } else {
                return class_319Var2.IiiIiiiiII;
            }
        }
        this.field_660.method_1132(1).method_1134(str);
        int i = this.field_658;
        this.field_658 = i + 1;
        return method_705(new class_319(i, 1, str, method_750)).IiiIiiiiII;
    }

    public class_296 method_726(String str, String str2, class_350 class_350Var, Object[] objArr) {
        return method_700(17, str, str2, method_737(class_350Var, objArr).field_1053);
    }

    public void method_746(int i, String str, String str2) {
        method_725(new class_319(i, 12, str, str2, method_756(12, str, str2)));
    }

    public class_296 method_721(double d) {
        return method_722(6, Double.doubleToRawLongBits(d));
    }

    public void method_751(int i, String str) {
        method_725(new class_319(i, 1, str, method_750(1, str)));
    }

    public class_296 method_743(String str) {
        return method_731(16, str);
    }

    public void method_698(int i, int i2, int i3) {
        method_725(new class_319(i, i2, i3, method_728(i2, i3)));
    }

    public void method_757(int i, int i2, String str, String str2, String str3) {
        method_725(new class_319(i, i2, str, str2, str3, 0L, method_739(i2, str, str2, str3)));
    }

    public class_296 method_718(int i, int i2) {
        int method_728 = method_728(i, i2);
        class_319 method_740 = method_740(method_728);
        class_319 class_319Var = method_740;
        class_319 class_319Var2 = method_740;
        while (class_319Var != null) {
            if (class_319Var2.IiiIIiiIii != i || class_319Var2.field_1099 != method_728 || class_319Var2.IIiiiIIIiI != i2) {
                class_319 class_319Var3 = class_319Var2.field_1100;
                class_319Var = class_319Var3;
                class_319Var2 = class_319Var3;
            } else {
                return class_319Var2;
            }
        }
        this.field_660.method_1132(i).method_1139(i2);
        int i3 = this.field_658;
        this.field_658 = i3 + 1;
        return method_705(new class_319(i3, i, i2, method_728));
    }

    public class_296 method_722(int i, long j) {
        int method_729 = method_729(i, j);
        class_319 method_740 = method_740(method_729);
        class_319 class_319Var = method_740;
        class_319 class_319Var2 = method_740;
        while (class_319Var != null) {
            if (class_319Var2.IiiIIiiIii != i || class_319Var2.field_1099 != method_729 || class_319Var2.IIiiiIIIiI != j) {
                class_319 class_319Var3 = class_319Var2.field_1100;
                class_319Var = class_319Var3;
                class_319Var2 = class_319Var3;
            } else {
                return class_319Var2;
            }
        }
        int i2 = this.field_658;
        this.field_660.method_1132(i).method_1144(j);
        this.field_658 += 2;
        return method_705(new class_319(i2, i, j, method_729));
    }

    public class_296 method_724(long j) {
        return method_722(5, j);
    }

    public class_296 method_713(int i, String str, String str2, String str3, boolean z) {
        class_148 class_148Var;
        int method_697 = method_697(i, z);
        int method_747 = method_747(15, str, str2, str3, method_697);
        class_319 method_740 = method_740(method_747);
        class_319 class_319Var = method_740;
        class_319 class_319Var2 = method_740;
        while (class_319Var != null) {
            if (class_319Var2.IiiIIiiIii == 15 && class_319Var2.field_1099 == method_747 && class_319Var2.IIiiiIIIiI == method_697 && class_319Var2.IIIIiiiIIi.equals(str) && class_319Var2.IiIiIiIIii.equals(str2) && class_319Var2.IIiIIiIIii.equals(str3)) {
                return class_319Var2;
            }
            class_319 class_319Var3 = class_319Var2.field_1100;
            class_319Var = class_319Var3;
            class_319Var2 = class_319Var3;
        }
        if (i > 4) {
            this.field_660.method_1140(15, i, method_699(str, str2, str3, z).field_1053);
            class_148Var = this;
        } else {
            this.field_660.method_1140(15, i, method_715(str, str2, str3).field_1053);
            class_148Var = this;
        }
        int i2 = this.field_658;
        this.field_658 = i2 + 1;
        return class_148Var.method_705(new class_319(i2, 15, str, str2, str3, method_697, method_747));
    }

    public static int method_697(int i, boolean z) {
        if (i > 4 && z) {
            return i << 8;
        }
        return i;
    }

    public class_296 method_741(String str, String str2, class_350 class_350Var, Object[] objArr) {
        return method_700(18, str, str2, method_737(class_350Var, objArr).field_1053);
    }

    public static int method_750(int i, String str) {
        return Integer.MAX_VALUE & (str.hashCode() + i);
    }

    public int method_735(int i, int i2) {
        long j;
        if (i < i2) {
            j = (i2 << 32) | i;
        } else {
            j = (i << 32) | i2;
        }
        int method_728 = method_728(131, i + i2);
        class_319 method_740 = method_740(method_728);
        class_319 class_319Var = method_740;
        class_319 class_319Var2 = method_740;
        while (class_319Var != null) {
            if (class_319Var2.IiiIIiiIii == 131 && class_319Var2.field_1099 == method_728 && class_319Var2.IIiiiIIIiI == j) {
                return class_319Var2.iIiiiiIiII;
            }
            class_319 class_319Var3 = class_319Var2.field_1100;
            class_319Var = class_319Var3;
            class_319Var2 = class_319Var3;
        }
        int method_753 = method_753(this.field_667.method_160(this.field_663[i].IIiIIiIIii, this.field_663[i2].IIiIIiIIii));
        method_705(new class_319(this.field_657, 131, j, method_728)).iIiiiiIiII = method_753;
        return method_753;
    }

    public class_296 method_704(int i) {
        return this.field_663[i];
    }

    public static int method_758(int i, String str, String str2, int i2) {
        return Integer.MAX_VALUE & ((str.hashCode() * str2.hashCode() * (i2 + 1)) + i);
    }

    public class_296 method_737(class_350 class_350Var, Object[] objArr) {
        class_258 class_258Var;
        class_258 class_258Var2 = this.field_666;
        if (class_258Var2 == null) {
            class_258 class_258Var3 = new class_258();
            this.field_666 = class_258Var3;
            class_258Var = class_258Var3;
        } else {
            class_258Var = class_258Var2;
        }
        int length = objArr.length;
        int[] iArr = new int[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            iArr[i2] = method_732(objArr[i2]).field_1053;
            i = i3;
            i2 = i3;
        }
        int i4 = class_258Var.field_905;
        class_258Var.method_1138(method_713(class_350Var.method_1420(), class_350Var.method_1421(), class_350Var.method_1422(), class_350Var.method_1423(), class_350Var.method_1424()).field_1053);
        class_258Var.method_1138(length);
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int i7 = i6 + 1;
            class_258Var.method_1138(iArr[i6]);
            i5 = i7;
            i6 = i7;
        }
        int i8 = class_258Var.field_905 - i4;
        int hashCode = class_350Var.hashCode();
        int length2 = objArr.length;
        int i9 = 0;
        int i10 = 0;
        int i11 = hashCode;
        while (i9 < length2) {
            int i12 = i10 + 1;
            i11 ^= objArr[i10].hashCode();
            i9 = i12;
            i10 = i12;
        }
        return method_734(i4, i8, Integer.MAX_VALUE & i11);
    }

    public static int method_759(int i, String str, int i2) {
        return Integer.MAX_VALUE & (str.hashCode() + i + i2);
    }

    public int method_753(String str) {
        int method_750 = method_750(128, str);
        class_319 method_740 = method_740(method_750);
        class_319 class_319Var = method_740;
        class_319 class_319Var2 = method_740;
        while (class_319Var != null) {
            if (class_319Var2.IiiIIiiIii != 128 || class_319Var2.field_1099 != method_750 || !class_319Var2.IIiIIiIIii.equals(str)) {
                class_319 class_319Var3 = class_319Var2.field_1100;
                class_319Var = class_319Var3;
                class_319Var2 = class_319Var3;
            } else {
                return class_319Var2.IiiIiiiiII;
            }
        }
        return method_733(new class_319(this.field_657, 128, str, method_750));
    }

    public static int method_728(int i, int i2) {
        return Integer.MAX_VALUE & (i + i2);
    }

    public static int method_747(int i, String str, String str2, String str3, int i2) {
        return Integer.MAX_VALUE & ((str.hashCode() * str2.hashCode() * str3.hashCode() * i2) + i);
    }

    public class_296 method_734(int i, int i2, int i3) {
        byte[] bArr = this.field_666.field_904;
        class_319 method_740 = method_740(i3);
        class_319 class_319Var = method_740;
        class_319 class_319Var2 = method_740;
        while (class_319Var != null) {
            if (class_319Var2.IiiIIiiIii == 64 && class_319Var2.field_1099 == i3) {
                int i4 = (int) class_319Var2.IIiiiIIIiI;
                boolean z = true;
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    if (i5 >= i2) {
                        break;
                    }
                    if (bArr[i + i6] != bArr[i4 + i6]) {
                        z = false;
                        break;
                    }
                    int i7 = i6 + 1;
                    i5 = i7;
                    i6 = i7;
                }
                if (z) {
                    this.field_666.field_905 = i;
                    return class_319Var2;
                }
            }
            class_319 class_319Var3 = class_319Var2.field_1100;
            class_319Var = class_319Var3;
            class_319Var2 = class_319Var3;
        }
        int i8 = this.field_659;
        this.field_659 = i8 + 1;
        return method_705(new class_319(i8, 64, i, i3));
    }

    public static int method_729(int i, long j) {
        return Integer.MAX_VALUE & (((int) j) + i + ((int) (j >>> 32)));
    }

    public static int method_756(int i, String str, String str2) {
        return Integer.MAX_VALUE & ((str.hashCode() * str2.hashCode()) + i);
    }

    public class_243 method_745(int i) {
        return this.field_668[(int) this.field_663[i].IIiiiIIIiI].field_194;
    }

    public void method_738(int i, int i2, String str) {
        method_725(new class_319(i, i2, str, method_750(i2, str)));
    }

    public static int method_739(int i, String str, String str2, String str3) {
        return Integer.MAX_VALUE & ((str.hashCode() * str2.hashCode() * str3.hashCode()) + i);
    }

    public class_53 method_706(class_243 class_243Var) {
        if (this.field_654 == null) {
            this.field_654 = new class_53[16];
            this.field_668 = new class_53[16];
        }
        int identityHashCode = System.identityHashCode(class_243Var);
        class_53 class_53Var = this.field_654[identityHashCode % this.field_654.length];
        class_53 class_53Var2 = class_53Var;
        class_53 class_53Var3 = class_53Var;
        while (class_53Var2 != null && class_53Var3.field_194 != class_243Var) {
            class_53 class_53Var4 = class_53Var3.field_196;
            class_53Var2 = class_53Var4;
            class_53Var3 = class_53Var4;
        }
        if (class_53Var3 == null) {
            if (this.field_661 > (this.field_654.length * 3) / 4) {
                int length = this.field_654.length;
                int i = (length * 2) + 1;
                class_53[] class_53VarArr = new class_53[i];
                int i2 = length - 1;
                int i3 = i2;
                int i4 = i2;
                while (i3 >= 0) {
                    class_53 class_53Var5 = this.field_654[i4];
                    class_53 class_53Var6 = class_53Var5;
                    class_53 class_53Var7 = class_53Var5;
                    while (class_53Var6 != null) {
                        int identityHashCode2 = System.identityHashCode(class_53Var7.field_194) % i;
                        class_53 class_53Var8 = class_53Var7.field_196;
                        class_53Var7.field_196 = class_53VarArr[identityHashCode2];
                        class_53VarArr[identityHashCode2] = class_53Var7;
                        class_53Var6 = class_53Var8;
                        class_53Var7 = class_53Var8;
                    }
                    int i5 = i4 - 1;
                    i3 = i5;
                    i4 = i5;
                }
                this.field_654 = class_53VarArr;
            }
            if (this.field_661 == this.field_668.length) {
                class_53[] class_53VarArr2 = new class_53[this.field_668.length * 2];
                System.arraycopy(this.field_668, 0, class_53VarArr2, 0, this.field_668.length);
                this.field_668 = class_53VarArr2;
            }
            class_53 class_53Var9 = new class_53(this.field_661, class_243Var);
            int length2 = identityHashCode % this.field_654.length;
            class_53Var9.field_196 = this.field_654[length2];
            this.field_654[length2] = class_53Var9;
            class_53[] class_53VarArr3 = this.field_668;
            int i6 = this.field_661;
            this.field_661 = i6 + 1;
            class_53VarArr3[i6] = class_53Var9;
            return class_53Var9;
        }
        return class_53Var3;
    }

    public class_296 method_710(String str) {
        return method_731(20, str);
    }

    public int method_733(class_319 class_319Var) {
        if (this.field_663 == null) {
            this.field_663 = new class_319[16];
        }
        if (this.field_657 == this.field_663.length) {
            class_319[] class_319VarArr = new class_319[this.field_663.length * 2];
            System.arraycopy(this.field_663, 0, class_319VarArr, 0, this.field_663.length);
            this.field_663 = class_319VarArr;
        }
        class_319[] class_319VarArr2 = this.field_663;
        int i = this.field_657;
        this.field_657 = i + 1;
        class_319VarArr2[i] = class_319Var;
        return method_705(class_319Var).IiiIiiiiII;
    }

    public class_296 method_731(int i, String str) {
        int method_750 = method_750(i, str);
        class_319 method_740 = method_740(method_750);
        class_319 class_319Var = method_740;
        class_319 class_319Var2 = method_740;
        while (class_319Var != null) {
            if (class_319Var2.IiiIIiiIii == i && class_319Var2.field_1099 == method_750 && class_319Var2.IIiIIiIIii.equals(str)) {
                return class_319Var2;
            }
            class_319 class_319Var3 = class_319Var2.field_1100;
            class_319Var = class_319Var3;
            class_319Var2 = class_319Var3;
        }
        this.field_660.method_1136(i, method_720(str));
        int i2 = this.field_658;
        this.field_658 = i2 + 1;
        return method_705(new class_319(i2, i, str, method_750));
    }

    public void method_711(int i, int i2, String str, String str2, int i3) {
        method_725(new class_319(i2, i, null, str, str2, i3, method_758(i, str, str2, i3)));
    }

    public int method_744(String str, class_243 class_243Var) {
        int i = method_706(class_243Var).field_195;
        int method_759 = method_759(130, str, i);
        class_319 method_740 = method_740(method_759);
        class_319 class_319Var = method_740;
        class_319 class_319Var2 = method_740;
        while (class_319Var != null) {
            if (class_319Var2.IiiIIiiIii == 130 && class_319Var2.field_1099 == method_759 && class_319Var2.IIiiiIIIiI == i && class_319Var2.IIiIIiIIii.equals(str)) {
                return class_319Var2.IiiIiiiiII;
            }
            class_319 class_319Var3 = class_319Var2.field_1100;
            class_319Var = class_319Var3;
            class_319Var2 = class_319Var3;
        }
        return method_733(new class_319(this.field_657, 130, str, i, method_759));
    }

    public class_296 method_708(String str) {
        return method_731(19, str);
    }

    public int method_755(String str, int i) {
        int method_759 = method_759(129, str, i);
        class_319 method_740 = method_740(method_759);
        class_319 class_319Var = method_740;
        class_319 class_319Var2 = method_740;
        while (class_319Var != null) {
            if (class_319Var2.IiiIIiiIii != 129 || class_319Var2.field_1099 != method_759 || class_319Var2.IIiiiIIIiI != i || !class_319Var2.IIiIIiIIii.equals(str)) {
                class_319 class_319Var3 = class_319Var2.field_1100;
                class_319Var = class_319Var3;
                class_319Var2 = class_319Var3;
            } else {
                return class_319Var2.IiiIiiiiII;
            }
        }
        return method_733(new class_319(this.field_657, 129, str, i, method_759));
    }
}
