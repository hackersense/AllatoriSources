package com.allatori.ant;

import com.allatori.commons.ASMStuffs;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_153 {
    public class_153 field_670;
    public final int field_671;

    public static String method_762(int i) {
        return new StringBuilder().insert(0, "Unsupported api ").append(i).toString();
    }

    public void method_763(class_187 class_187Var) {
        if (this.field_670 != null) {
            this.field_670.method_763(class_187Var);
        }
    }

    public class_153 method_761() {
        return this.field_670;
    }

    public void method_765() {
        if (this.field_670 != null) {
            this.field_670.method_765();
        }
    }

    public class_153(int i, class_153 class_153Var) {
        if (i == 589824 || i == 524288 || i == 458752 || i == 393216 || i == 327680 || i == 262144 || i == 17432576) {
            if (i == 17432576) {
                ASMStuffs.method_194(this);
            }
            this.field_671 = i;
            this.field_670 = class_153Var;
            return;
        }
        throw new IllegalArgumentException(method_762(i));
    }

    public class_610 method_760(String str, boolean z) {
        if (this.field_670 != null) {
            return this.field_670.method_760(str, z);
        }
        return null;
    }

    public class_153(int i) {
        this(i, null);
    }

    public class_610 method_764(int i, class_91 class_91Var, String str, boolean z) {
        if (this.field_671 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        if (this.field_670 == null) {
            return null;
        }
        return this.field_670.method_764(i, class_91Var, str, z);
    }
}
