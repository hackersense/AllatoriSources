package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_555;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_155 extends class_153 {
    public class_210 field_672;
    public final int field_673;
    public final class_148 field_674;
    public class_210 field_675;
    public class_187 field_676;
    public class_210 field_677;
    public int field_678;
    public class_210 field_679;
    public int field_680;
    public final int field_681;
    public final int field_682;

    public void method_769(class_258 class_258Var) {
        boolean z = this.field_674.method_748() < 49;
        class_258Var.method_1138(((z ? 4096 : 0) ^ (-1)) & this.field_673).method_1138(this.field_681).method_1138(this.field_682);
        int i = this.field_678 != 0 ? 1 : 0;
        if ((this.field_673 & 4096) != 0 && z) {
            i++;
        }
        if (this.field_680 != 0) {
            i++;
        }
        if ((this.field_673 & class_555.field_2095) != 0) {
            i++;
        }
        if (this.field_675 != null) {
            i++;
        }
        if (this.field_672 != null) {
            i++;
        }
        if (this.field_677 != null) {
            i++;
        }
        if (this.field_679 != null) {
            i++;
        }
        if (this.field_676 != null) {
            i += this.field_676.method_875();
        }
        class_258Var.method_1138(i);
        if (this.field_678 != 0) {
            class_258Var.method_1138(this.field_674.method_720("ConstantValue")).method_1139(2).method_1138(this.field_678);
        }
        class_187.method_879(this.field_674, this.field_673, this.field_680, class_258Var);
        class_210.method_1017(this.field_674, this.field_675, this.field_672, this.field_677, this.field_679, class_258Var);
        if (this.field_676 == null) {
            return;
        }
        this.field_676.method_877(this.field_674, class_258Var);
    }

    public class_155(class_148 class_148Var, int i, String str, String str2, String str3, Object obj) {
        super(class_555.field_2171);
        this.field_674 = class_148Var;
        this.field_673 = i;
        this.field_681 = class_148Var.method_720(str);
        this.field_682 = class_148Var.method_720(str2);
        if (str3 != null) {
            this.field_680 = class_148Var.method_720(str3);
        }
        if (obj == null) {
            return;
        }
        this.field_678 = class_148Var.method_732(obj).field_1053;
    }

    @Override // p000.class_153
    public void method_763(class_187 class_187Var) {
        class_187Var.field_739 = this.field_676;
        this.field_676 = class_187Var;
    }

    public int method_768() {
        int i = 8;
        if (this.field_678 != 0) {
            i = 16;
            this.field_674.method_720("ConstantValue");
        }
        int method_880 = i + class_187.method_880(this.field_674, this.field_673, this.field_680) + class_210.method_1020(this.field_675, this.field_672, this.field_677, this.field_679);
        if (this.field_676 != null) {
            return method_880 + this.field_676.method_873(this.field_674);
        }
        return method_880;
    }

    public final void method_767(class_549 class_549Var) {
        class_549Var.method_1948(this.field_676);
    }

    @Override // p000.class_153
    public class_610 method_760(String str, boolean z) {
        if (z) {
            class_210 method_1019 = class_210.method_1019(this.field_674, str, this.field_675);
            this.field_675 = method_1019;
            return method_1019;
        }
        class_210 method_10192 = class_210.method_1019(this.field_674, str, this.field_672);
        this.field_672 = method_10192;
        return method_10192;
    }

    @Override // p000.class_153
    public class_610 method_764(int i, class_91 class_91Var, String str, boolean z) {
        if (!z) {
            class_210 method_1014 = class_210.method_1014(this.field_674, i, class_91Var, str, this.field_679);
            this.field_679 = method_1014;
            return method_1014;
        }
        class_210 method_10142 = class_210.method_1014(this.field_674, i, class_91Var, str, this.field_677);
        this.field_677 = method_10142;
        return method_10142;
    }

    @Override // p000.class_153
    public void method_765() {
    }
}
