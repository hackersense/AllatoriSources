package com.allatori.ant;

import com.allatori.commons.ASMStuffs;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_265 {
    public static final String field_911 = "This feature requires ASM5";
    public class_265 field_909;
    public final int field_910;

    public static String method_1175(int i) {
        return new StringBuilder().insert(0, "Unsupported api ").append(i).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void method_1166(int i, int i2) {
        if (this.field_909 != null) {
            this.field_909.method_1166(i, i2);
        }
    }

    public class_610 method_1157() {
        if (this.field_909 == null) {
            return null;
        }
        return this.field_909.method_1157();
    }

    public void method_1167(int i, String str, String str2, String str3) {
        if (this.field_909 == null) {
            return;
        }
        this.field_909.method_1167(i, str, str2, str3);
    }

    public void method_1158(int i, int i2) {
        if (this.field_909 != null) {
            this.field_909.method_1158(i, i2);
        }
    }

    public void method_1178(int i, int i2) {
        if (this.field_909 != null) {
            this.field_909.method_1178(i, i2);
        }
    }

    @Deprecated
    public void method_1168(int i, String str, String str2, String str3) {
        method_1156(i | (this.field_910 < 327680 ? 256 : 0), str, str2, str3, i == 185);
    }

    public void method_1164(String str, String str2, class_350 class_350Var, Object[] objArr) {
        if (this.field_910 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        if (this.field_909 == null) {
            return;
        }
        this.field_909.method_1164(str, str2, class_350Var, objArr);
    }

    public void method_1148(int i, class_243 class_243Var) {
        if (this.field_909 != null) {
            this.field_909.method_1148(i, class_243Var);
        }
    }

    public void method_1172(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        if (this.field_909 == null) {
            return;
        }
        this.field_909.method_1172(i, i2, objArr, i3, objArr2);
    }

    public void method_1161(int i, int i2, class_243 class_243Var, class_243[] class_243VarArr) {
        if (this.field_909 != null) {
            this.field_909.method_1161(i, i2, class_243Var, class_243VarArr);
        }
    }

    public void method_1177(int i, boolean z) {
        if (this.field_909 != null) {
            this.field_909.method_1177(i, z);
        }
    }

    public class_265 method_1149() {
        return this.field_909;
    }

    public void method_1180(int i) {
        if (this.field_909 == null) {
            return;
        }
        this.field_909.method_1180(i);
    }

    public void method_1169(class_243 class_243Var) {
        if (this.field_909 == null) {
            return;
        }
        this.field_909.method_1169(class_243Var);
    }

    public void method_1156(int i, String str, String str2, String str3, boolean z) {
        if (this.field_910 >= 327680 || (i & 256) != 0) {
            if (this.field_909 != null) {
                this.field_909.method_1156(i & (-257), str, str2, str3, z);
            }
        } else {
            if (z != (i == 185)) {
                throw new UnsupportedOperationException("INVOKESPECIAL/STATIC on interfaces requires ASM5");
            }
            method_1168(i, str, str2, str3);
        }
    }

    public void method_1165(int i, String str) {
        if (this.field_909 == null) {
            return;
        }
        this.field_909.method_1165(i, str);
    }

    public void method_1173(Object obj) {
        if (this.field_910 >= 327680 || (!(obj instanceof class_350) && (!(obj instanceof class_279) || ((class_279) obj).method_1255() != 11))) {
            if (this.field_910 >= 458752 || !(obj instanceof class_470)) {
                if (this.field_909 == null) {
                    return;
                }
                this.field_909.method_1173(obj);
                return;
            }
            throw new UnsupportedOperationException("This feature requires ASM7");
        }
        throw new UnsupportedOperationException("This feature requires ASM5");
    }

    public class_610 method_1151(String str, boolean z) {
        if (this.field_909 == null) {
            return null;
        }
        return this.field_909.method_1151(str, z);
    }

    public class_265(int i, class_265 class_265Var) {
        if (i == 589824 || i == 524288 || i == 458752 || i == 393216 || i == 327680 || i == 262144 || i == 17432576) {
            if (i == 17432576) {
                ASMStuffs.method_194(this);
            }
            this.field_910 = i;
            this.field_909 = class_265Var;
            return;
        }
        throw new IllegalArgumentException(method_1175(i));
    }

    public class_610 method_1174(int i, class_91 class_91Var, String str, boolean z) {
        if (this.field_910 >= 327680) {
            if (this.field_909 == null) {
                return null;
            }
            return this.field_909.method_1174(i, class_91Var, str, z);
        }
        throw new UnsupportedOperationException("This feature requires ASM5");
    }

    public class_610 method_1176(int i, String str, boolean z) {
        if (this.field_909 != null) {
            return this.field_909.method_1176(i, str, z);
        }
        return null;
    }

    public void method_1171() {
        if (this.field_909 == null) {
            return;
        }
        this.field_909.method_1171();
    }

    public void method_1150(class_187 class_187Var) {
        if (this.field_909 == null) {
            return;
        }
        this.field_909.method_1150(class_187Var);
    }

    public class_265(int i) {
        this(i, null);
    }

    public void method_1163(String str, int i) {
        if (this.field_910 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        if (this.field_909 == null) {
            return;
        }
        this.field_909.method_1163(str, i);
    }

    public class_610 method_1160(int i, class_91 class_91Var, String str, boolean z) {
        if (this.field_910 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        if (this.field_909 == null) {
            return null;
        }
        return this.field_909.method_1160(i, class_91Var, str, z);
    }

    public void method_1154(class_243 class_243Var, int[] iArr, class_243[] class_243VarArr) {
        if (this.field_909 != null) {
            this.field_909.method_1154(class_243Var, iArr, class_243VarArr);
        }
    }

    public class_610 method_1179(int i, class_91 class_91Var, String str, boolean z) {
        if (this.field_910 >= 327680) {
            if (this.field_909 == null) {
                return null;
            }
            return this.field_909.method_1179(i, class_91Var, str, z);
        }
        throw new UnsupportedOperationException("This feature requires ASM5");
    }

    public void method_1181(String str, int i) {
        if (this.field_909 != null) {
            this.field_909.method_1181(str, i);
        }
    }

    public class_610 method_1155(int i, class_91 class_91Var, class_243[] class_243VarArr, class_243[] class_243VarArr2, int[] iArr, String str, boolean z) {
        if (this.field_910 >= 327680) {
            if (this.field_909 == null) {
                return null;
            }
            return this.field_909.method_1155(i, class_91Var, class_243VarArr, class_243VarArr2, iArr, str, z);
        }
        throw new UnsupportedOperationException("This feature requires ASM5");
    }

    public void method_1153(int i, class_243 class_243Var) {
        if (this.field_909 != null) {
            this.field_909.method_1153(i, class_243Var);
        }
    }

    public void method_1162(int i, int i2) {
        if (this.field_909 != null) {
            this.field_909.method_1162(i, i2);
        }
    }

    public void method_1152(String str, String str2, String str3, class_243 class_243Var, class_243 class_243Var2, int i) {
        if (this.field_909 == null) {
            return;
        }
        this.field_909.method_1152(str, str2, str3, class_243Var, class_243Var2, i);
    }

    public void method_1159() {
        if (this.field_909 == null) {
            return;
        }
        this.field_909.method_1159();
    }

    public void method_1170(class_243 class_243Var, class_243 class_243Var2, class_243 class_243Var3, String str) {
        if (this.field_909 != null) {
            this.field_909.method_1170(class_243Var, class_243Var2, class_243Var3, str);
        }
    }
}
