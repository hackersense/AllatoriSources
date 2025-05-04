package com.allatori.ant;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_187 {
    public class_187 field_739;
    public final String field_740;
    public class_258 field_741;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void method_878(class_148 class_148Var, byte[] bArr, int i, int i2, int i3, class_258 class_258Var) {
        class_473 class_473Var = class_148Var.field_667;
        class_187 class_187Var = this;
        class_187 class_187Var2 = this;
        while (class_187Var != null) {
            class_258 method_881 = class_187Var2.method_881(class_473Var, bArr, i, i2, i3);
            class_258Var.method_1138(class_148Var.method_720(class_187Var2.field_740)).method_1139(method_881.field_905);
            class_258Var.method_1143(method_881.field_904, 0, method_881.field_905);
            class_187 class_187Var3 = class_187Var2.field_739;
            class_187Var = class_187Var3;
            class_187Var2 = class_187Var3;
        }
    }

    public static void method_879(class_148 class_148Var, int i, int i2, class_258 class_258Var) {
        if ((i & 4096) != 0 && class_148Var.method_748() < 49) {
            class_258Var.method_1138(class_148Var.method_720("Synthetic")).method_1139(0);
        }
        if (i2 != 0) {
            class_258Var.method_1138(class_148Var.method_720("Signature")).method_1139(2).method_1138(i2);
        }
        if ((131072 & i) == 0) {
            return;
        }
        class_258Var.method_1138(class_148Var.method_720("Deprecated")).method_1139(0);
    }

    public class_187(String str) {
        this.field_740 = str;
    }

    public class_258 method_876(class_473 class_473Var, byte[] bArr, int i, int i2, int i3) {
        return this.field_741;
    }

    public boolean method_874() {
        return true;
    }

    public class_187 method_882(class_173 class_173Var, int i, int i2, char[] cArr, int i3, class_243[] class_243VarArr) {
        class_187 class_187Var = new class_187(this.field_740);
        class_187Var.field_741 = new class_258(class_173Var.method_835(i, i2));
        return class_187Var;
    }

    public final void method_877(class_148 class_148Var, class_258 class_258Var) {
        method_878(class_148Var, null, 0, -1, -1, class_258Var);
    }

    public final int method_873(class_148 class_148Var) {
        return method_885(class_148Var, null, 0, -1, -1);
    }

    public static byte[] method_884(class_187 class_187Var, class_473 class_473Var, byte[] bArr, int i, int i2, int i3) {
        class_258 method_881 = class_187Var.method_881(class_473Var, bArr, i, i2, i3);
        byte[] bArr2 = new byte[method_881.field_905];
        System.arraycopy(method_881.field_904, 0, bArr2, 0, method_881.field_905);
        return bArr2;
    }

    public class_258 method_881(class_473 class_473Var, byte[] bArr, int i, int i2, int i3) {
        if (this.field_741 == null) {
            this.field_741 = method_876(class_473Var, bArr, i, i2, i3);
        }
        return this.field_741;
    }

    @Deprecated
    public class_243[] method_886() {
        return new class_243[0];
    }

    public final int method_875() {
        int i = 0;
        class_187 class_187Var = this;
        class_187 class_187Var2 = this;
        while (class_187Var != null) {
            class_187 class_187Var3 = class_187Var2.field_739;
            i++;
            class_187Var = class_187Var3;
            class_187Var2 = class_187Var3;
        }
        return i;
    }

    public static class_187 method_872(class_187 class_187Var, class_173 class_173Var, int i, int i2, char[] cArr, int i3, class_243[] class_243VarArr) {
        return class_187Var.method_882(class_173Var, i, i2, cArr, i3, class_243VarArr);
    }

    public boolean method_871() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int method_880(class_148 class_148Var, int i, int i2) {
        int i3 = 0;
        if ((i & 4096) != 0 && class_148Var.method_748() < 49) {
            i3 = 6;
            class_148Var.method_720("Synthetic");
        }
        if (i2 != 0) {
            i3 += 8;
            class_148Var.method_720("Signature");
        }
        if ((131072 & i) == 0) {
            return i3;
        }
        int i4 = i3 + 6;
        class_148Var.method_720("Deprecated");
        return i4;
    }

    public static class_243 method_883(class_173 class_173Var, int i, class_243[] class_243VarArr) {
        return class_173Var.method_803(i, class_243VarArr);
    }

    public final int method_885(class_148 class_148Var, byte[] bArr, int i, int i2, int i3) {
        class_473 class_473Var = class_148Var.field_667;
        class_187 class_187Var = this;
        int i4 = 0;
        class_187 class_187Var2 = this;
        while (class_187Var != null) {
            class_148Var.method_720(class_187Var2.field_740);
            int i5 = i4 + class_187Var2.method_881(class_473Var, bArr, i, i2, i3).field_905 + 6;
            class_187 class_187Var3 = class_187Var2.field_739;
            class_187Var = class_187Var3;
            i4 = i5;
            class_187Var2 = class_187Var3;
        }
        return i4;
    }
}
