package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_243 {
    public static final int field_866 = 8;
    public static final int field_869 = 4;
    public static final int field_871 = 6;
    public static final int field_872 = 1;
    public static final int field_873 = 64;
    public static final int field_875 = 805306368;
    public static final int field_878 = 536870912;
    public static final int field_879 = 4;
    public static final int field_880 = 268435455;
    public static final class_243 field_882 = new class_243();
    public static final int field_883 = -268435456;
    public static final int field_884 = 128;
    public static final int field_887 = 268435456;
    public static final int field_888 = 16;
    public static final int field_890 = 2;
    public static final int field_894 = 32;
    public short field_867;
    public int[] field_868;
    public int field_870;
    public class_243 field_874;
    public Object field_876;
    public class_408 field_877;
    public short field_881;
    public short field_885;
    public short field_886;
    public int[] field_889;
    public class_77 field_891;
    public class_243 field_892;
    public short field_893;
    public short field_895;

    public static String method_1099(int i) {
        return new StringBuilder().insert(0, "L").append(i).toString();
    }

    public final void method_1098(class_258 class_258Var, int i, boolean z) {
        if ((this.field_895 & 4) == 0) {
            if (z) {
                method_1102(i, field_878, class_258Var.field_905);
                class_258Var.method_1139(-1);
                return;
            } else {
                method_1102(i, field_887, class_258Var.field_905);
                class_258Var.method_1138(-1);
                return;
            }
        }
        if (!z) {
            class_258Var.method_1138(this.field_870 - i);
        } else {
            class_258Var.method_1139(this.field_870 - i);
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:2:0x0008 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:11:0x0035 */
    public final void method_1101(class_243 class_243Var) {
        class_243 class_243Var2 = field_882;
        this.field_874 = field_882;
        class_243 class_243Var3 = this;
        while (true) {
            class_243 class_243Var4 = this;
            if (class_243Var3 == field_882) {
                break;
            }
            class_243 class_243Var5 = class_243Var4.field_874;
            class_243Var4.field_874 = class_243Var2;
            if ((class_243Var4.field_895 & 64) != 0 && class_243Var4.field_885 != class_243Var.field_885) {
                class_243Var4.field_877 = new class_408(class_243Var4.field_881, class_243Var.field_877.field_1258, class_243Var4.field_877);
            }
            this = class_243Var4.method_1094(class_243Var5);
            class_243Var3 = this;
            class_243Var2 = class_243Var4;
        }
        while (true) {
            class_243 class_243Var6 = class_243Var2;
            if (class_243Var2 != field_882) {
                class_243Var2 = class_243Var6.field_874;
                class_243Var6.field_874 = null;
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void method_1092(class_258 class_258Var) {
        if ((this.field_895 & 4) == 0) {
            method_1102(0, field_875, class_258Var.field_905);
        }
        class_258Var.method_1138(this.field_870);
    }

    public final class_243 method_1100() {
        return this.field_891 == null ? this : this.field_891.field_311;
    }

    public int method_1091() {
        if ((this.field_895 & 4) != 0) {
            return this.field_870;
        }
        throw new IllegalStateException("Label offset position has not been resolved yet");
    }

    public final void method_1096(short s) {
        this.field_874 = field_882;
        while (this != field_882) {
            class_243 class_243Var = this.field_874;
            this.field_874 = null;
            if (this.field_885 == 0) {
                this.field_885 = s;
                this = this.method_1094(class_243Var);
            } else {
                this = class_243Var;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:8:0x001b */
    public final void method_1093(class_265 class_265Var, boolean z) {
        class_265Var.method_1169(this);
        if (!z || (this.field_895 & 128) == 0) {
            return;
        }
        class_265Var.method_1153(this.field_867 & ASMInterface.field_1306, this);
        if (this.field_889 == null) {
            return;
        }
        int i = 1;
        while (true) {
            int i2 = i;
            if (i > this.field_889[0]) {
                return;
            }
            i = i2 + 1;
            class_265Var.method_1153(this.field_889[i2], this);
        }
    }

    public final void method_1095(int i) {
        if ((this.field_895 & 128) != 0) {
            if (this.field_889 == null) {
                this.field_889 = new int[4];
            }
            int[] iArr = this.field_889;
            int i2 = iArr[0] + 1;
            iArr[0] = i2;
            if (i2 >= this.field_889.length) {
                int[] iArr2 = new int[this.field_889.length + 4];
                System.arraycopy(this.field_889, 0, iArr2, 0, this.field_889.length);
                this.field_889 = iArr2;
            }
            this.field_889[i2] = i;
            return;
        }
        this.field_895 = (short) (this.field_895 | 128);
        this.field_867 = (short) i;
    }

    public void method_1102(int i, int i2, int i3) {
        if (this.field_868 == null) {
            this.field_868 = new int[6];
        }
        int i4 = this.field_868[0];
        if (i4 + 2 >= this.field_868.length) {
            int[] iArr = new int[this.field_868.length + 6];
            System.arraycopy(this.field_868, 0, iArr, 0, this.field_868.length);
            this.field_868 = iArr;
        }
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        this.field_868[i5] = i;
        this.field_868[i6] = i2 | i3;
        this.field_868[0] = i6;
    }

    public final boolean method_1097(byte[] bArr, class_258 class_258Var, int i) {
        boolean z = false;
        this.field_895 = (short) (this.field_895 | 4);
        this.field_870 = i;
        if (this.field_868 != null) {
            int i2 = this.field_868[0];
            int i3 = i2;
            int i4 = i2;
            while (i3 > 0) {
                int i5 = this.field_868[i4 - 1];
                int i6 = this.field_868[i4];
                int i7 = i - i5;
                int i8 = 268435455 & i6;
                if ((i6 & field_883) != 268435456) {
                    if ((i6 & field_883) == 536870912) {
                        int i9 = i8 + 1;
                        bArr[i8] = (byte) (i7 >>> 24);
                        int i10 = i9 + 1;
                        bArr[i9] = (byte) (i7 >>> 16);
                        bArr[i10] = (byte) (i7 >>> 8);
                        bArr[i10 + 1] = (byte) i7;
                    } else {
                        class_258Var.field_904[i8] = (byte) (i >>> 8);
                        class_258Var.field_904[i8 + 1] = (byte) i;
                    }
                } else {
                    if (i7 < -32768 || i7 > 32767) {
                        int i11 = bArr[i5] & ASMInterface.field_1291;
                        if (i11 < 198) {
                            bArr[i5] = (byte) (i11 + 49);
                        } else {
                            bArr[i5] = (byte) (i11 + 20);
                        }
                        z = true;
                    }
                    bArr[i8] = (byte) (i7 >>> 8);
                    bArr[i8 + 1] = (byte) i7;
                }
                int i12 = i4 - 2;
                i3 = i12;
                i4 = i12;
            }
        }
        return z;
    }

    public class_243 method_1094(class_243 class_243Var) {
        class_408 class_408Var = this.field_877;
        class_408 class_408Var2 = class_408Var;
        class_243 class_243Var2 = class_243Var;
        class_408 class_408Var3 = class_408Var;
        while (class_408Var2 != null) {
            if ((((this.field_895 & 16) == 0 || class_408Var3 != this.field_877.field_1260) ? 0 : -(-1)) == 0 && class_408Var3.field_1258.field_874 == null) {
                class_408Var3.field_1258.field_874 = class_243Var2;
                class_243Var2 = class_408Var3.field_1258;
            }
            class_408 class_408Var4 = class_408Var3.field_1260;
            class_408Var2 = class_408Var4;
            class_408Var3 = class_408Var4;
        }
        return class_243Var2;
    }
}
