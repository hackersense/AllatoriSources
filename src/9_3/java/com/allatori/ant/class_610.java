package com.allatori.ant;

import com.allatori.commons.ASMStuffs;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_610 {
    public class_610 field_2410;
    public final int field_2411;

    public static String method_2112(int i) {
        return new StringBuilder().insert(0, "Unsupported api ").append(i).toString();
    }

    public void method_1022() {
        if (this.field_2410 != null) {
            this.field_2410.method_1022();
        }
    }

    public class_610 method_1016(String str, String str2) {
        if (this.field_2410 == null) {
            return null;
        }
        return this.field_2410.method_1016(str, str2);
    }

    public void method_1024(String str, Object obj) {
        if (this.field_2410 != null) {
            this.field_2410.method_1024(str, obj);
        }
    }

    public class_610(int i, class_610 class_610Var) {
        if (i == 589824 || i == 524288 || i == 458752 || i == 393216 || i == 327680 || i == 262144 || i == 17432576) {
            if (i == 17432576) {
                ASMStuffs.method_194(this);
            }
            this.field_2411 = i;
            this.field_2410 = class_610Var;
            return;
        }
        throw new IllegalArgumentException(method_2112(i));
    }

    public void method_1015(String str, String str2, String str3) {
        if (this.field_2410 == null) {
            return;
        }
        this.field_2410.method_1015(str, str2, str3);
    }

    public class_610(int i) {
        this(i, null);
    }

    public class_610 method_1023(String str) {
        if (this.field_2410 == null) {
            return null;
        }
        return this.field_2410.method_1023(str);
    }

    public class_610 method_2113() {
        return this.field_2410;
    }
}
