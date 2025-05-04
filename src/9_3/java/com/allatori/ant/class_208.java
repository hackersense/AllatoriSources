package com.allatori.ant;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_208 implements Serializable {
    public Map field_774;
    public class_286[] field_776;
    public Map field_779;
    public Map field_780;
    public int field_781;
    public Map field_782;
    public Map field_783;
    public int field_784;
    public static final String field_778 = ":";
    public static final String field_775 = "#";
    public static final String field_773 = "&";
    public static final String field_777 = "%";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0007 */
    public int method_1011(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        int i = 1;
        while (true) {
            int i2 = i;
            if (i >= this.field_784) {
                return -1;
            }
            if ((this.field_776[i2] instanceof class_573) && Double.doubleToLongBits(((class_573) this.field_776[i2]).method_794()) == doubleToLongBits) {
                return i2;
            }
            i = i2 + 1;
        }
    }

    public int method_988(class_591 class_591Var) {
        return method_992(class_591Var.method_546(), class_591Var.method_198(), class_591Var.method_464());
    }

    public int method_997(String str, String str2, String str3) {
        class_378 class_378Var = (class_378) this.field_783.get(new StringBuilder().insert(0, str).append("#").append(str2).append("#").append(str3).toString());
        if (class_378Var != null) {
            return class_378Var.field_1201;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public class_208() {
        this.field_781 = 1024;
        this.field_776 = new class_286[this.field_781];
        this.field_784 = 1;
        this.field_774 = new HashMap();
        this.field_779 = new HashMap();
        this.field_780 = new HashMap();
        this.field_782 = new HashMap();
        this.field_783 = new HashMap();
    }

    public class_208(class_499 class_499Var) {
        this(class_499Var.method_1846());
    }

    public int method_989(String str) {
        class_378 class_378Var = (class_378) this.field_779.get(str.replace('.', '/'));
        if (class_378Var != null) {
            return class_378Var.field_1201;
        }
        return -1;
    }

    public int method_992(String str, String str2, String str3) {
        int method_985 = method_985(str, str2, str3);
        if (method_985 == -1) {
            method_97();
            int method_984 = method_984(str2, str3);
            int method_1007 = method_1007(str);
            method_985 = this.field_784;
            class_286[] class_286VarArr = this.field_776;
            int i = this.field_784;
            this.field_784 = i + 1;
            class_286VarArr[i] = new class_35(method_1007, method_984);
            String sb = new StringBuilder().insert(0, str).append(":").append(str2).append(":").append(str3).toString();
            if (!this.field_783.containsKey(sb)) {
                this.field_783.put(sb, new class_378(method_985));
            }
        }
        return method_985;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:8:0x0050 */
    public class_208(class_286[] class_286VarArr) {
        int i = 1;
        this.field_781 = 1024;
        this.field_776 = new class_286[this.field_781];
        this.field_784 = 1;
        this.field_774 = new HashMap();
        this.field_779 = new HashMap();
        this.field_780 = new HashMap();
        this.field_782 = new HashMap();
        this.field_783 = new HashMap();
        if (class_286VarArr.length > this.field_781) {
            this.field_781 = class_286VarArr.length;
            this.field_776 = new class_286[this.field_781];
        }
        System.arraycopy(class_286VarArr, 0, this.field_776, 0, class_286VarArr.length);
        if (class_286VarArr.length > 0) {
            this.field_784 = class_286VarArr.length;
        }
        while (true) {
            int i2 = i;
            if (i >= this.field_784) {
                return;
            }
            class_286 class_286Var = this.field_776[i2];
            if (class_286Var instanceof class_118) {
                String method_198 = ((class_371) this.field_776[((class_118) class_286Var).method_47()]).method_198();
                if (!this.field_774.containsKey(method_198)) {
                    this.field_774.put(method_198, new class_378(i2));
                }
            } else if (class_286Var instanceof class_43) {
                String method_1982 = ((class_371) this.field_776[((class_43) class_286Var).method_47()]).method_198();
                if (!this.field_779.containsKey(method_1982)) {
                    this.field_779.put(method_1982, new class_378(i2));
                }
            } else if (class_286Var instanceof class_538) {
                class_538 class_538Var = (class_538) class_286Var;
                String sb = new StringBuilder().insert(0, ((class_371) this.field_776[class_538Var.method_47()]).method_198()).append("%").append(((class_371) this.field_776[class_538Var.method_433()]).method_198()).toString();
                if (!this.field_782.containsKey(sb)) {
                    this.field_782.put(sb, new class_378(i2));
                }
            } else if (class_286Var instanceof class_371) {
                String method_1983 = ((class_371) class_286Var).method_198();
                if (!this.field_780.containsKey(method_1983)) {
                    this.field_780.put(method_1983, new class_378(i2));
                }
            } else if (class_286Var instanceof class_456) {
                class_456 class_456Var = (class_456) class_286Var;
                class_43 class_43Var = (class_43) this.field_776[class_456Var.method_47()];
                class_538 class_538Var2 = (class_538) this.field_776[class_456Var.method_433()];
                String replace = ((class_371) this.field_776[class_43Var.method_47()]).method_198().replace('/', '.');
                String method_1984 = ((class_371) this.field_776[class_538Var2.method_47()]).method_198();
                String method_1985 = ((class_371) this.field_776[class_538Var2.method_433()]).method_198();
                String str = class_286Var instanceof class_401 ? "#" : class_286Var instanceof class_530 ? "&" : ":";
                String sb2 = new StringBuilder().insert(0, replace).append(str).append(method_1984).append(str).append(method_1985).toString();
                if (!this.field_783.containsKey(sb2)) {
                    this.field_783.put(sb2, new class_378(i2));
                }
            }
            i = i2 + 1;
        }
    }

    public int method_984(String str, String str2) {
        int method_1008 = method_1008(str, str2);
        if (method_1008 == -1) {
            method_97();
            int method_1004 = method_1004(str);
            int method_10042 = method_1004(str2);
            method_1008 = this.field_784;
            class_286[] class_286VarArr = this.field_776;
            int i = this.field_784;
            this.field_784 = i + 1;
            class_286VarArr[i] = new class_538(method_1004, method_10042);
            String sb = new StringBuilder().insert(0, str).append("%").append(str2).toString();
            if (!this.field_782.containsKey(sb)) {
                this.field_782.put(sb, new class_378(method_1008));
            }
        }
        return method_1008;
    }

    public int method_1010(String str) {
        int method_1005 = method_1005(str);
        if (method_1005 == -1) {
            int method_1004 = method_1004(str);
            method_97();
            class_118 class_118Var = new class_118(method_1004);
            method_1005 = this.field_784;
            class_286[] class_286VarArr = this.field_776;
            int i = this.field_784;
            this.field_784 = i + 1;
            class_286VarArr[i] = class_118Var;
            if (!this.field_774.containsKey(str)) {
                this.field_774.put(str, new class_378(method_1005));
            }
        }
        return method_1005;
    }

    public int method_987(class_392 class_392Var) {
        return method_1007(class_392Var.method_464());
    }

    public int method_1005(String str) {
        class_378 class_378Var = (class_378) this.field_774.get(str);
        if (class_378Var != null) {
            return class_378Var.field_1201;
        }
        return -1;
    }

    public int method_995(double d) {
        int method_1011 = method_1011(d);
        if (method_1011 == -1) {
            method_97();
            int i = this.field_784;
            this.field_776[this.field_784] = new class_573(d);
            this.field_784 += 2;
            return i;
        }
        return method_1011;
    }

    public int method_1013(class_591 class_591Var) {
        return method_999(class_591Var.method_546(), class_591Var.method_198(), class_591Var.method_464());
    }

    public int method_998(class_591 class_591Var) {
        return method_985(class_591Var.method_546(), class_591Var.method_198(), class_591Var.method_464());
    }

    public int method_994(int i) {
        int method_790 = method_790(i);
        if (method_790 != -1) {
            return method_790;
        }
        method_97();
        int i2 = this.field_784;
        class_286[] class_286VarArr = this.field_776;
        int i3 = this.field_784;
        this.field_784 = i3 + 1;
        class_286VarArr[i3] = new class_400(i);
        return i2;
    }

    public int method_991(String str) {
        int method_989 = method_989(str);
        if (method_989 == -1) {
            method_97();
            class_43 class_43Var = new class_43(method_1004(str));
            method_989 = this.field_784;
            class_286[] class_286VarArr = this.field_776;
            int i = this.field_784;
            this.field_784 = i + 1;
            class_286VarArr[i] = class_43Var;
            if (!this.field_779.containsKey(str)) {
                this.field_779.put(str, new class_378(method_989));
            }
        }
        return method_989;
    }

    public int method_983(String str) {
        class_378 class_378Var = (class_378) this.field_780.get(str);
        if (class_378Var != null) {
            return class_378Var.field_1201;
        }
        return -1;
    }

    public int method_990(long j) {
        int method_1002 = method_1002(j);
        if (method_1002 == -1) {
            method_97();
            int i = this.field_784;
            this.field_776[this.field_784] = new class_232(j);
            this.field_784 += 2;
            return i;
        }
        return method_1002;
    }

    public void method_97() {
        if (this.field_784 + 3 >= this.field_781) {
            class_286[] class_286VarArr = this.field_776;
            this.field_781 *= 2;
            this.field_776 = new class_286[this.field_781];
            System.arraycopy(class_286VarArr, 0, this.field_776, 0, this.field_784);
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0003 */
    public int method_790(int i) {
        int i2 = 1;
        while (true) {
            int i3 = i2;
            if (i2 >= this.field_784) {
                return -1;
            }
            if (!(this.field_776[i3] instanceof class_400) || ((class_400) this.field_776[i3]).method_47() != i) {
                i2 = i3 + 1;
            } else {
                return i3;
            }
        }
    }

    public int method_1003(class_591 class_591Var) {
        return method_997(class_591Var.method_546(), class_591Var.method_198(), class_591Var.method_464());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int method_1004(String str) {
        int method_983 = method_983(str);
        if (method_983 == -1) {
            method_97();
            method_983 = this.field_784;
            class_286[] class_286VarArr = this.field_776;
            int i = this.field_784;
            this.field_784 = i + 1;
            class_286VarArr[i] = new class_371(str);
            if (!this.field_780.containsKey(str)) {
                this.field_780.put(str, new class_378(method_983));
            }
        }
        return method_983;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0003 */
    public int method_1002(long j) {
        int i = 1;
        while (true) {
            int i2 = i;
            if (i >= this.field_784) {
                return -1;
            }
            if ((this.field_776[i2] instanceof class_232) && ((class_232) this.field_776[i2]).method_1074() == j) {
                return i2;
            }
            i = i2 + 1;
        }
    }

    public int method_1000(class_594 class_594Var) {
        return method_991(class_594Var.method_198());
    }

    public int method_985(String str, String str2, String str3) {
        class_378 class_378Var = (class_378) this.field_783.get(new StringBuilder().insert(0, str).append(":").append(str2).append(":").append(str3).toString());
        if (class_378Var != null) {
            return class_378Var.field_1201;
        }
        return -1;
    }

    public int method_999(String str, String str2, String str3) {
        int method_997 = method_997(str, str2, str3);
        if (method_997 == -1) {
            method_97();
            int method_1007 = method_1007(str);
            int method_984 = method_984(str2, str3);
            method_997 = this.field_784;
            class_286[] class_286VarArr = this.field_776;
            int i = this.field_784;
            this.field_784 = i + 1;
            class_286VarArr[i] = new class_401(method_1007, method_984);
            String sb = new StringBuilder().insert(0, str).append("#").append(str2).append("#").append(str3).toString();
            if (!this.field_783.containsKey(sb)) {
                this.field_783.put(sb, new class_378(method_997));
            }
        }
        return method_997;
    }

    public int method_1001(float f) {
        int method_996 = method_996(f);
        if (method_996 != -1) {
            return method_996;
        }
        method_97();
        int i = this.field_784;
        class_286[] class_286VarArr = this.field_776;
        int i2 = this.field_784;
        this.field_784 = i2 + 1;
        class_286VarArr[i2] = new class_340(f);
        return i;
    }

    public int method_1007(String str) {
        return method_991(str.replace('.', '/'));
    }

    public int method_1008(String str, String str2) {
        class_378 class_378Var = (class_378) this.field_782.get(new StringBuilder().insert(0, str).append("%").append(str2).toString());
        if (class_378Var != null) {
            return class_378Var.field_1201;
        }
        return -1;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0007 */
    public int method_996(float f) {
        int floatToIntBits = Float.floatToIntBits(f);
        int i = 1;
        while (true) {
            int i2 = i;
            if (i >= this.field_784) {
                return -1;
            }
            if (!(this.field_776[i2] instanceof class_340) || Float.floatToIntBits(((class_340) this.field_776[i2]).method_1399()) != floatToIntBits) {
                i = i2 + 1;
            } else {
                return i2;
            }
        }
    }

    public class_286 method_982(int i) {
        return this.field_776[i];
    }

    public int method_1006(class_286 class_286Var, class_208 class_208Var) {
        class_286[] method_1846 = class_208Var.method_502().method_1846();
        switch (class_286Var.method_619()) {
            case 1:
                return method_1004(((class_371) class_286Var).method_198());
            case 2:
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "Unknown constant type ").append(class_286Var).toString());
            case 3:
                return method_994(((class_400) class_286Var).method_47());
            case 4:
                return method_1001(((class_340) class_286Var).method_1399());
            case 5:
                return method_990(((class_232) class_286Var).method_1074());
            case 6:
                return method_995(((class_573) class_286Var).method_794());
            case 7:
                return method_1007(((class_371) method_1846[((class_43) class_286Var).method_47()]).method_198());
            case 8:
                return method_1010(((class_371) method_1846[((class_118) class_286Var).method_47()]).method_198());
            case 9:
            case 10:
            case 11:
                class_456 class_456Var = (class_456) class_286Var;
                class_43 class_43Var = (class_43) method_1846[class_456Var.method_47()];
                class_538 class_538Var = (class_538) method_1846[class_456Var.method_433()];
                String replace = ((class_371) method_1846[class_43Var.method_47()]).method_198().replace('/', '.');
                String method_198 = ((class_371) method_1846[class_538Var.method_47()]).method_198();
                String method_1982 = ((class_371) method_1846[class_538Var.method_433()]).method_198();
                switch (class_286Var.method_619()) {
                    case 9:
                        return method_1009(replace, method_198, method_1982);
                    case 10:
                        return method_992(replace, method_198, method_1982);
                    case 11:
                        return method_999(replace, method_198, method_1982);
                    default:
                        throw new RuntimeException(new StringBuilder().insert(0, "Unknown constant type ").append(class_286Var).toString());
                }
            case 12:
                class_538 class_538Var2 = (class_538) class_286Var;
                return method_984(((class_371) method_1846[class_538Var2.method_47()]).method_198(), ((class_371) method_1846[class_538Var2.method_433()]).method_198());
        }
    }

    public class_499 method_986() {
        class_286[] class_286VarArr = new class_286[this.field_784];
        System.arraycopy(this.field_776, 0, class_286VarArr, 0, this.field_784);
        return new class_499(class_286VarArr);
    }

    public int method_993(String str, String str2, String str3) {
        class_378 class_378Var = (class_378) this.field_783.get(new StringBuilder().insert(0, str).append("&").append(str2).append("&").append(str3).toString());
        if (class_378Var != null) {
            return class_378Var.field_1201;
        }
        return -1;
    }

    public void method_1012(int i, class_286 class_286Var) {
        this.field_776[i] = class_286Var;
    }

    public int method_47() {
        return this.field_784;
    }

    public class_499 method_502() {
        return new class_499(this.field_776);
    }

    public int method_1009(String str, String str2, String str3) {
        int method_993 = method_993(str, str2, str3);
        if (method_993 == -1) {
            method_97();
            int method_1007 = method_1007(str);
            int method_984 = method_984(str2, str3);
            method_993 = this.field_784;
            class_286[] class_286VarArr = this.field_776;
            int i = this.field_784;
            this.field_784 = i + 1;
            class_286VarArr[i] = new class_530(method_1007, method_984);
            String sb = new StringBuilder().insert(0, str).append("&").append(str2).append("&").append(str3).toString();
            if (!this.field_783.containsKey(sb)) {
                this.field_783.put(sb, new class_378(method_993));
            }
        }
        return method_993;
    }
}
