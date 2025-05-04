package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_555;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_500 extends class_61 {
    public class_210 field_1957;
    public class_187 field_1958;
    public final class_148 field_1959;
    public final int field_1960;
    public class_210 field_1961;
    public class_210 field_1962;
    public int field_1963;
    public final int field_1964;
    public class_210 field_1965;

    @Override // p000.class_61
    public class_610 method_243(int i, class_91 class_91Var, String str, boolean z) {
        if (z) {
            class_210 method_1014 = class_210.method_1014(this.field_1959, i, class_91Var, str, this.field_1961);
            this.field_1961 = method_1014;
            return method_1014;
        }
        class_210 method_10142 = class_210.method_1014(this.field_1959, i, class_91Var, str, this.field_1965);
        this.field_1965 = method_10142;
        return method_10142;
    }

    @Override // p000.class_61
    public void method_241() {
    }

    @Override // p000.class_61
    public void method_242(class_187 class_187Var) {
        class_187Var.field_739 = this.field_1958;
        this.field_1958 = class_187Var;
    }

    public class_500(class_148 class_148Var, String str, String str2, String str3) {
        super(class_555.field_2171);
        this.field_1959 = class_148Var;
        this.field_1960 = class_148Var.method_720(str);
        this.field_1964 = class_148Var.method_720(str2);
        if (str3 != null) {
            this.field_1963 = class_148Var.method_720(str3);
        }
    }

    public void method_1851(class_258 class_258Var) {
        class_258Var.method_1138(this.field_1960).method_1138(this.field_1964);
        int i = this.field_1963 != 0 ? 1 : 0;
        if (this.field_1957 != null) {
            i++;
        }
        if (this.field_1962 != null) {
            i++;
        }
        if (this.field_1961 != null) {
            i++;
        }
        if (this.field_1965 != null) {
            i++;
        }
        if (this.field_1958 != null) {
            i += this.field_1958.method_875();
        }
        class_258Var.method_1138(i);
        class_187.method_879(this.field_1959, 0, this.field_1963, class_258Var);
        class_210.method_1017(this.field_1959, this.field_1957, this.field_1962, this.field_1961, this.field_1965, class_258Var);
        if (this.field_1958 == null) {
            return;
        }
        this.field_1958.method_877(this.field_1959, class_258Var);
    }

    @Override // p000.class_61
    public class_610 method_239(String str, boolean z) {
        if (!z) {
            class_210 method_1019 = class_210.method_1019(this.field_1959, str, this.field_1962);
            this.field_1962 = method_1019;
            return method_1019;
        }
        class_210 method_10192 = class_210.method_1019(this.field_1959, str, this.field_1957);
        this.field_1957 = method_10192;
        return method_10192;
    }

    public int method_1852() {
        int method_880 = class_187.method_880(this.field_1959, 0, this.field_1963) + 6 + class_210.method_1020(this.field_1957, this.field_1962, this.field_1961, this.field_1965);
        if (this.field_1958 != null) {
            return method_880 + this.field_1958.method_873(this.field_1959);
        }
        return method_880;
    }

    public final void method_1853(class_549 class_549Var) {
        class_549Var.method_1948(this.field_1958);
    }
}
