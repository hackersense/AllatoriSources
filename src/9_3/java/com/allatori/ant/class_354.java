package com.allatori.ant;

import com.allatori.commons.ASMStuffs;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_354 {
    public final int field_1155;
    public class_354 field_1156;

    public static String method_1449(int i) {
        return new StringBuilder().insert(0, "Unsupported api ").append(i).toString();
    }

    public void method_1443(String str) {
        if (this.field_1155 >= 458752) {
            if (this.field_1156 != null) {
                this.field_1156.method_1443(str);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("NestMember requires ASM7");
    }

    public class_354(int i, class_354 class_354Var) {
        if (i == 589824 || i == 524288 || i == 458752 || i == 393216 || i == 327680 || i == 262144 || i == 17432576) {
            if (i == 17432576) {
                ASMStuffs.method_194(this);
            }
            this.field_1155 = i;
            this.field_1156 = class_354Var;
            return;
        }
        throw new IllegalArgumentException(method_1449(i));
    }

    public class_354(int i) {
        this(i, null);
    }

    public class_497 method_1440(String str, int i, String str2) {
        if (this.field_1155 < 393216) {
            throw new UnsupportedOperationException("Module requires ASM6");
        }
        if (this.field_1156 != null) {
            return this.field_1156.method_1440(str, i, str2);
        }
        return null;
    }

    public void method_1451() {
        if (this.field_1156 != null) {
            this.field_1156.method_1451();
        }
    }

    public class_61 method_1452(String str, String str2, String str3) {
        if (this.field_1155 < 524288) {
            throw new UnsupportedOperationException("Record requires ASM8");
        }
        if (this.field_1156 == null) {
            return null;
        }
        return this.field_1156.method_1452(str, str2, str3);
    }

    public class_610 method_1453(String str, boolean z) {
        if (this.field_1156 == null) {
            return null;
        }
        return this.field_1156.method_1453(str, z);
    }

    public void method_1438(String str, String str2, String str3, int i) {
        if (this.field_1156 != null) {
            this.field_1156.method_1438(str, str2, str3, i);
        }
    }

    public class_153 method_1445(int i, String str, String str2, String str3, Object obj) {
        if (this.field_1156 == null) {
            return null;
        }
        return this.field_1156.method_1445(i, str, str2, str3, obj);
    }

    public void method_1439(String str, String str2) {
        if (this.field_1156 == null) {
            return;
        }
        this.field_1156.method_1439(str, str2);
    }

    public void method_1446(String str) {
        if (this.field_1155 < 458752) {
            throw new UnsupportedOperationException("NestHost requires ASM7");
        }
        if (this.field_1156 != null) {
            this.field_1156.method_1446(str);
        }
    }

    public class_265 method_1447(int i, String str, String str2, String str3, String[] strArr) {
        if (this.field_1156 != null) {
            return this.field_1156.method_1447(i, str, str2, str3, strArr);
        }
        return null;
    }

    public void method_1442(String str, String str2, String str3) {
        if (this.field_1156 != null) {
            this.field_1156.method_1442(str, str2, str3);
        }
    }

    public void method_1437(String str) {
        if (this.field_1155 >= 589824) {
            if (this.field_1156 != null) {
                this.field_1156.method_1437(str);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("PermittedSubclasses requires ASM9");
    }

    public class_610 method_1448(int i, class_91 class_91Var, String str, boolean z) {
        if (this.field_1155 >= 327680) {
            if (this.field_1156 != null) {
                return this.field_1156.method_1448(i, class_91Var, str, z);
            }
            return null;
        }
        throw new UnsupportedOperationException("TypeAnnotation requires ASM5");
    }

    public class_354 method_1441() {
        return this.field_1156;
    }

    public void method_1444(int i, int i2, String str, String str2, String str3, String[] strArr) {
        if (this.field_1155 < 524288 && (65536 & i2) != 0) {
            throw new UnsupportedOperationException("Records requires ASM8");
        }
        if (this.field_1156 != null) {
            this.field_1156.method_1444(i, i2, str, str2, str3, strArr);
        }
    }

    public void method_1450(class_187 class_187Var) {
        if (this.field_1156 == null) {
            return;
        }
        this.field_1156.method_1450(class_187Var);
    }
}
