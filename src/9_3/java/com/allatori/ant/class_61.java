package com.allatori.ant;

import com.allatori.commons.ASMStuffs;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_61 {
    public class_61 field_206;
    public final int field_207;

    public static String method_244(int i) {
        return new StringBuilder().insert(0, "Unsupported api ").append(i).toString();
    }

    public void method_242(class_187 class_187Var) {
        if (this.field_206 == null) {
            return;
        }
        this.field_206.method_242(class_187Var);
    }

    public class_61(int i) {
        this(i, null);
    }

    public class_610 method_243(int i, class_91 class_91Var, String str, boolean z) {
        if (this.field_206 != null) {
            return this.field_206.method_243(i, class_91Var, str, z);
        }
        return null;
    }

    public class_610 method_239(String str, boolean z) {
        if (this.field_206 != null) {
            return this.field_206.method_239(str, z);
        }
        return null;
    }

    public void method_241() {
        if (this.field_206 != null) {
            this.field_206.method_241();
        }
    }

    public class_61(int i, class_61 class_61Var) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException(method_244(i));
        }
        if (i == 17432576) {
            ASMStuffs.method_194(this);
        }
        this.field_207 = i;
        this.field_206 = class_61Var;
    }

    public class_61 method_240() {
        return this.field_206;
    }
}
