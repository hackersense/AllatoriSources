package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_555;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_136 extends class_497 {
    public int field_599;
    public final class_258 field_600;
    public final int field_601;
    public int field_602;
    public int field_603;
    public final class_258 field_604;
    public final int field_605;
    public final class_258 field_606;
    public final class_148 field_607;
    public int field_608;
    public int field_609;
    public final class_258 field_610;
    public final int field_611;
    public int field_612;
    public int field_613;
    public final class_258 field_614;
    public final class_258 field_615;

    @Override // p000.class_497
    public void method_653(String str, int i, String[] strArr) {
        this.field_610.method_1138(this.field_607.method_710(str).field_1053).method_1138(i);
        if (strArr == null) {
            this.field_610.method_1138(0);
        } else {
            this.field_610.method_1138(strArr.length);
            int length = strArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = i3 + 1;
                this.field_610.method_1138(this.field_607.method_708(strArr[i3]).field_1053);
                i2 = i4;
                i3 = i4;
            }
        }
        this.field_612++;
    }

    public class_136(class_148 class_148Var, int i, int i2, int i3) {
        super(class_555.field_2171);
        this.field_607 = class_148Var;
        this.field_605 = i;
        this.field_601 = i2;
        this.field_611 = i3;
        this.field_614 = new class_258();
        this.field_610 = new class_258();
        this.field_615 = new class_258();
        this.field_604 = new class_258();
        this.field_606 = new class_258();
        this.field_600 = new class_258();
    }

    @Override // p000.class_497
    public void method_654(String str) {
        this.field_600.method_1138(this.field_607.method_710(str).field_1053);
        this.field_613++;
    }

    @Override // p000.class_497
    public void method_657() {
    }

    @Override // p000.class_497
    public void method_652(String str) {
        this.field_604.method_1138(this.field_607.method_752(str).field_1053);
        this.field_608++;
    }

    @Override // p000.class_497
    public void method_658(String str, int i, String str2) {
        this.field_614.method_1138(this.field_607.method_708(str).field_1053).method_1138(i).method_1138(str2 == null ? 0 : this.field_607.method_720(str2));
        this.field_603++;
    }

    public int method_656() {
        this.field_607.method_720("Module");
        int i = this.field_614.field_905 + 22 + this.field_610.field_905 + this.field_615.field_905 + this.field_604.field_905 + this.field_606.field_905;
        if (this.field_613 > 0) {
            this.field_607.method_720("ModulePackages");
            i += this.field_600.field_905 + 8;
        }
        if (this.field_609 > 0) {
            int i2 = i + 8;
            this.field_607.method_720("ModuleMainClass");
            return i2;
        }
        return i;
    }

    public int method_650() {
        return (this.field_613 > 0 ? 1 : 0) + 1 + (this.field_609 > 0 ? -(-1) : 0);
    }

    public void method_648(class_258 class_258Var) {
        class_258Var.method_1138(this.field_607.method_720("Module")).method_1139(this.field_614.field_905 + 16 + this.field_610.field_905 + this.field_615.field_905 + this.field_604.field_905 + this.field_606.field_905).method_1138(this.field_605).method_1138(this.field_601).method_1138(this.field_611).method_1138(this.field_603).method_1143(this.field_614.field_904, 0, this.field_614.field_905).method_1138(this.field_612).method_1143(this.field_610.field_904, 0, this.field_610.field_905).method_1138(this.field_602).method_1143(this.field_615.field_904, 0, this.field_615.field_905).method_1138(this.field_608).method_1143(this.field_604.field_904, 0, this.field_604.field_905).method_1138(this.field_599).method_1143(this.field_606.field_904, 0, this.field_606.field_905);
        if (this.field_613 > 0) {
            class_258Var.method_1138(this.field_607.method_720("ModulePackages")).method_1139(this.field_600.field_905 + 2).method_1138(this.field_613).method_1143(this.field_600.field_904, 0, this.field_600.field_905);
        }
        if (this.field_609 <= 0) {
            return;
        }
        class_258Var.method_1138(this.field_607.method_720("ModuleMainClass")).method_1139(2).method_1138(this.field_609);
    }

    @Override // p000.class_497
    public void method_651(String str, int i, String[] strArr) {
        this.field_615.method_1138(this.field_607.method_710(str).field_1053).method_1138(i);
        if (strArr == null) {
            this.field_615.method_1138(0);
        } else {
            this.field_615.method_1138(strArr.length);
            int length = strArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = i3 + 1;
                this.field_615.method_1138(this.field_607.method_708(strArr[i3]).field_1053);
                i2 = i4;
                i3 = i4;
            }
        }
        this.field_602++;
    }

    @Override // p000.class_497
    public void method_655(String str, String[] strArr) {
        this.field_606.method_1138(this.field_607.method_752(str).field_1053);
        this.field_606.method_1138(strArr.length);
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            this.field_606.method_1138(this.field_607.method_752(strArr[i2]).field_1053);
            i = i3;
            i2 = i3;
        }
        this.field_599++;
    }

    @Override // p000.class_497
    public void method_649(String str) {
        this.field_609 = this.field_607.method_752(str).field_1053;
    }
}
