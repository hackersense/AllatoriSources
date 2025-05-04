package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_555;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_210 extends class_610 {
    public int field_785;
    public final boolean field_786;
    public final class_258 field_787;
    public final class_210 field_788;
    public class_210 field_789;
    public final class_148 field_790;
    public final int field_791;

    @Override // p000.class_610
    public void method_1015(String str, String str2, String str3) {
        this.field_785++;
        if (this.field_786) {
            this.field_787.method_1138(this.field_790.method_720(str));
        }
        this.field_787.method_1136(101, this.field_790.method_720(str2)).method_1138(this.field_790.method_720(str3));
    }

    public class_210(class_148 class_148Var, boolean z, class_258 class_258Var, class_210 class_210Var) {
        super(class_555.field_2171);
        this.field_790 = class_148Var;
        this.field_786 = z;
        this.field_787 = class_258Var;
        this.field_791 = class_258Var.field_905 == 0 ? -1 : class_258Var.field_905 - 2;
        this.field_788 = class_210Var;
        if (class_210Var != null) {
            class_210Var.field_789 = this;
        }
    }

    public static void method_1018(int i, class_210[] class_210VarArr, int i2, class_258 class_258Var) {
        int i3 = 0;
        int i4 = 0;
        int i5 = (i2 * 2) + 1;
        while (i3 < i2) {
            i5 += class_210VarArr[i4] == null ? 0 : r0.method_1025(null) - 8;
            int i6 = i4 + 1;
            i3 = i6;
            i4 = i6;
        }
        class_258Var.method_1138(i);
        class_258Var.method_1139(i5);
        class_258Var.method_1132(i2);
        int i7 = 0;
        int i8 = 0;
        while (i7 < i2) {
            class_210 class_210Var = class_210VarArr[i8];
            class_210 class_210Var2 = class_210Var;
            int i9 = 0;
            class_210 class_210Var3 = null;
            class_210 class_210Var4 = class_210Var;
            while (class_210Var2 != null) {
                i9++;
                class_210Var4.method_1022();
                class_210 class_210Var5 = class_210Var4.field_788;
                class_210Var2 = class_210Var5;
                class_210Var3 = class_210Var4;
                class_210Var4 = class_210Var5;
            }
            class_258Var.method_1138(i9);
            class_210 class_210Var6 = class_210Var3;
            class_210 class_210Var7 = class_210Var3;
            while (class_210Var6 != null) {
                class_258Var.method_1143(class_210Var7.field_787.field_904, 0, class_210Var7.field_787.field_905);
                class_210 class_210Var8 = class_210Var7.field_789;
                class_210Var6 = class_210Var8;
                class_210Var7 = class_210Var8;
            }
            int i10 = i8 + 1;
            i7 = i10;
            i8 = i10;
        }
    }

    public static int method_1020(class_210 class_210Var, class_210 class_210Var2, class_210 class_210Var3, class_210 class_210Var4) {
        int method_1025 = class_210Var != null ? 0 + class_210Var.method_1025("RuntimeVisibleAnnotations") : 0;
        if (class_210Var2 != null) {
            method_1025 += class_210Var2.method_1025("RuntimeInvisibleAnnotations");
        }
        if (class_210Var3 != null) {
            method_1025 += class_210Var3.method_1025("RuntimeVisibleTypeAnnotations");
        }
        if (class_210Var4 == null) {
            return method_1025;
        }
        return method_1025 + class_210Var4.method_1025("RuntimeInvisibleTypeAnnotations");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static int method_1021(String str, class_210[] class_210VarArr, int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = (i * 2) + 7;
        while (i2 < i) {
            i4 += class_210VarArr[i3] == null ? 0 : r0.method_1025(str) - 8;
            int i5 = i3 + 1;
            i2 = i5;
            i3 = i5;
        }
        return i4;
    }

    @Override // p000.class_610
    public class_610 method_1023(String str) {
        this.field_785++;
        if (this.field_786) {
            this.field_787.method_1138(this.field_790.method_720(str));
        }
        this.field_787.method_1136(91, 0);
        return new class_210(this.field_790, false, this.field_787, null);
    }

    @Override // p000.class_610
    public void method_1024(String str, Object obj) {
        this.field_785++;
        if (this.field_786) {
            this.field_787.method_1138(this.field_790.method_720(str));
        }
        if (obj instanceof String) {
            this.field_787.method_1136(115, this.field_790.method_720((String) obj));
            return;
        }
        if (obj instanceof Byte) {
            this.field_787.method_1136(66, this.field_790.method_717(((Byte) obj).byteValue()).field_1053);
            return;
        }
        if (!(obj instanceof Boolean)) {
            if (!(obj instanceof Character)) {
                if (!(obj instanceof Short)) {
                    if (!(obj instanceof class_279)) {
                        if (obj instanceof byte[]) {
                            byte[] bArr = (byte[]) obj;
                            this.field_787.method_1136(91, bArr.length);
                            int length = bArr.length;
                            int i = 0;
                            int i2 = 0;
                            while (i < length) {
                                int i3 = i2 + 1;
                                this.field_787.method_1136(66, this.field_790.method_717(bArr[i2]).field_1053);
                                i = i3;
                                i2 = i3;
                            }
                            return;
                        }
                        if (obj instanceof boolean[]) {
                            boolean[] zArr = (boolean[]) obj;
                            this.field_787.method_1136(91, zArr.length);
                            int length2 = zArr.length;
                            int i4 = 0;
                            int i5 = 0;
                            while (i4 < length2) {
                                boolean z = zArr[i5];
                                int i6 = i5 + 1;
                                this.field_787.method_1136(90, this.field_790.method_717(z ? 1 : 0).field_1053);
                                i4 = i6;
                                i5 = i6;
                            }
                            return;
                        }
                        if (obj instanceof short[]) {
                            short[] sArr = (short[]) obj;
                            this.field_787.method_1136(91, sArr.length);
                            int length3 = sArr.length;
                            int i7 = 0;
                            int i8 = 0;
                            while (i7 < length3) {
                                int i9 = i8 + 1;
                                this.field_787.method_1136(83, this.field_790.method_717(sArr[i8]).field_1053);
                                i7 = i9;
                                i8 = i9;
                            }
                            return;
                        }
                        if (obj instanceof char[]) {
                            char[] cArr = (char[]) obj;
                            this.field_787.method_1136(91, cArr.length);
                            int length4 = cArr.length;
                            int i10 = 0;
                            int i11 = 0;
                            while (i10 < length4) {
                                int i12 = i11 + 1;
                                this.field_787.method_1136(67, this.field_790.method_717(cArr[i11]).field_1053);
                                i10 = i12;
                                i11 = i12;
                            }
                            return;
                        }
                        if (obj instanceof int[]) {
                            int[] iArr = (int[]) obj;
                            this.field_787.method_1136(91, iArr.length);
                            int length5 = iArr.length;
                            int i13 = 0;
                            int i14 = 0;
                            while (i13 < length5) {
                                int i15 = i14 + 1;
                                this.field_787.method_1136(73, this.field_790.method_717(iArr[i14]).field_1053);
                                i13 = i15;
                                i14 = i15;
                            }
                            return;
                        }
                        if (obj instanceof long[]) {
                            long[] jArr = (long[]) obj;
                            this.field_787.method_1136(91, jArr.length);
                            int length6 = jArr.length;
                            int i16 = 0;
                            int i17 = 0;
                            while (i16 < length6) {
                                int i18 = i17 + 1;
                                this.field_787.method_1136(74, this.field_790.method_724(jArr[i17]).field_1053);
                                i16 = i18;
                                i17 = i18;
                            }
                            return;
                        }
                        if (obj instanceof float[]) {
                            float[] fArr = (float[]) obj;
                            this.field_787.method_1136(91, fArr.length);
                            int length7 = fArr.length;
                            int i19 = 0;
                            int i20 = 0;
                            while (i19 < length7) {
                                int i21 = i20 + 1;
                                this.field_787.method_1136(70, this.field_790.method_701(fArr[i20]).field_1053);
                                i19 = i21;
                                i20 = i21;
                            }
                            return;
                        }
                        if (!(obj instanceof double[])) {
                            class_296 method_732 = this.field_790.method_732(obj);
                            this.field_787.method_1136(".s.IFJDCS".charAt(method_732.field_1044), method_732.field_1053);
                            return;
                        }
                        double[] dArr = (double[]) obj;
                        this.field_787.method_1136(91, dArr.length);
                        int length8 = dArr.length;
                        int i22 = 0;
                        int i23 = 0;
                        while (i22 < length8) {
                            int i24 = i23 + 1;
                            this.field_787.method_1136(68, this.field_790.method_721(dArr[i23]).field_1053);
                            i22 = i24;
                            i23 = i24;
                        }
                        return;
                    }
                    this.field_787.method_1136(99, this.field_790.method_720(((class_279) obj).method_1234()));
                    return;
                }
                this.field_787.method_1136(83, this.field_790.method_717(((Short) obj).shortValue()).field_1053);
                return;
            }
            this.field_787.method_1136(67, this.field_790.method_717(((Character) obj).charValue()).field_1053);
            return;
        }
        this.field_787.method_1136(90, this.field_790.method_717(((Boolean) obj).booleanValue() ? 1 : 0).field_1053);
    }

    public static void method_1017(class_148 class_148Var, class_210 class_210Var, class_210 class_210Var2, class_210 class_210Var3, class_210 class_210Var4, class_258 class_258Var) {
        if (class_210Var != null) {
            class_210Var.method_1026(class_148Var.method_720("RuntimeVisibleAnnotations"), class_258Var);
        }
        if (class_210Var2 != null) {
            class_210Var2.method_1026(class_148Var.method_720("RuntimeInvisibleAnnotations"), class_258Var);
        }
        if (class_210Var3 != null) {
            class_210Var3.method_1026(class_148Var.method_720("RuntimeVisibleTypeAnnotations"), class_258Var);
        }
        if (class_210Var4 != null) {
            class_210Var4.method_1026(class_148Var.method_720("RuntimeInvisibleTypeAnnotations"), class_258Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void method_1026(int i, class_258 class_258Var) {
        int i2 = 2;
        class_210 class_210Var = null;
        class_210 class_210Var2 = this;
        int i3 = 0;
        class_210 class_210Var3 = this;
        while (class_210Var2 != null) {
            class_210Var3.method_1022();
            i3++;
            i2 += class_210Var3.field_787.field_905;
            class_210 class_210Var4 = class_210Var3.field_788;
            class_210Var2 = class_210Var4;
            class_210Var = class_210Var3;
            class_210Var3 = class_210Var4;
        }
        class_258Var.method_1138(i);
        class_258Var.method_1139(i2);
        class_258Var.method_1138(i3);
        class_210 class_210Var5 = class_210Var;
        class_210 class_210Var6 = class_210Var;
        while (class_210Var5 != null) {
            class_258Var.method_1143(class_210Var6.field_787.field_904, 0, class_210Var6.field_787.field_905);
            class_210 class_210Var7 = class_210Var6.field_789;
            class_210Var5 = class_210Var7;
            class_210Var6 = class_210Var7;
        }
    }

    @Override // p000.class_610
    public void method_1022() {
        if (this.field_791 != -1) {
            byte[] bArr = this.field_787.field_904;
            bArr[this.field_791] = (byte) (this.field_785 >>> 8);
            bArr[this.field_791 + 1] = (byte) this.field_785;
        }
    }

    public static class_210 method_1019(class_148 class_148Var, String str, class_210 class_210Var) {
        class_258 class_258Var = new class_258();
        class_258Var.method_1138(class_148Var.method_720(str)).method_1138(0);
        return new class_210(class_148Var, true, class_258Var, class_210Var);
    }

    public static class_210 method_1014(class_148 class_148Var, int i, class_91 class_91Var, String str, class_210 class_210Var) {
        class_258 class_258Var = new class_258();
        class_383.method_1541(i, class_258Var);
        class_91.method_586(class_91Var, class_258Var);
        class_258Var.method_1138(class_148Var.method_720(str)).method_1138(0);
        return new class_210(class_148Var, true, class_258Var, class_210Var);
    }

    public int method_1025(String str) {
        if (str != null) {
            this.field_790.method_720(str);
        }
        int i = 8;
        class_210 class_210Var = this;
        class_210 class_210Var2 = this;
        while (class_210Var != null) {
            i += class_210Var2.field_787.field_905;
            class_210 class_210Var3 = class_210Var2.field_788;
            class_210Var = class_210Var3;
            class_210Var2 = class_210Var3;
        }
        return i;
    }

    @Override // p000.class_610
    public class_610 method_1016(String str, String str2) {
        this.field_785++;
        if (this.field_786) {
            this.field_787.method_1138(this.field_790.method_720(str));
        }
        this.field_787.method_1136(64, this.field_790.method_720(str2)).method_1138(0);
        return new class_210(this.field_790, true, this.field_787, null);
    }
}
