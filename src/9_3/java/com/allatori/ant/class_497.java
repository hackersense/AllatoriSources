package com.allatori.ant;

import com.allatori.commons.ASMStuffs;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_497 {
    public final int field_1951;
    public class_497 field_1952;

    public static String method_1841(int i) {
        return new StringBuilder().insert(0, "Unsupported api ").append(i).toString();
    }

    public void method_653(String str, int i, String[] strArr) {
        if (this.field_1952 == null) {
            return;
        }
        this.field_1952.method_653(str, i, strArr);
    }

    public void method_652(String str) {
        if (this.field_1952 != null) {
            this.field_1952.method_652(str);
        }
    }

    public class_497(int i) {
        this(i, null);
    }

    public void method_649(String str) {
        if (this.field_1952 == null) {
            return;
        }
        this.field_1952.method_649(str);
    }

    public void method_658(String str, int i, String str2) {
        if (this.field_1952 != null) {
            this.field_1952.method_658(str, i, str2);
        }
    }

    public void method_655(String str, String[] strArr) {
        if (this.field_1952 != null) {
            this.field_1952.method_655(str, strArr);
        }
    }

    public class_497(int i, class_497 class_497Var) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException(method_1841(i));
        }
        if (i == 17432576) {
            ASMStuffs.method_194(this);
        }
        this.field_1951 = i;
        this.field_1952 = class_497Var;
    }

    public void method_654(String str) {
        if (this.field_1952 == null) {
            return;
        }
        this.field_1952.method_654(str);
    }

    public void method_657() {
        if (this.field_1952 == null) {
            return;
        }
        this.field_1952.method_657();
    }

    public void method_651(String str, int i, String[] strArr) {
        if (this.field_1952 == null) {
            return;
        }
        this.field_1952.method_651(str, i, strArr);
    }

    public class_497 method_1840() {
        return this.field_1952;
    }
}
