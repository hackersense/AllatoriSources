package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_555;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_258 {
    public byte[] field_904;
    public int field_905;

    public final class_258 method_1136(int i, int i2) {
        int i3 = this.field_905;
        if (i3 + 3 > this.field_904.length) {
            method_1142(3);
        }
        byte[] bArr = this.field_904;
        int i4 = i3 + 1;
        bArr[i3] = (byte) i;
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i2 >>> 8);
        bArr[i5] = (byte) i2;
        this.field_905 = i5 + 1;
        return this;
    }

    public final class_258 method_1141(int i, int i2, int i3) {
        int i4 = this.field_905;
        if (i4 + 5 > this.field_904.length) {
            method_1142(5);
        }
        byte[] bArr = this.field_904;
        int i5 = i4 + 1;
        bArr[i4] = (byte) i;
        int i6 = i5 + 1;
        bArr[i5] = (byte) (i2 >>> 8);
        int i7 = i6 + 1;
        bArr[i6] = (byte) i2;
        int i8 = i7 + 1;
        bArr[i7] = (byte) (i3 >>> 8);
        bArr[i8] = (byte) i3;
        this.field_905 = i8 + 1;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void method_1142(int i) {
        if (this.field_905 > this.field_904.length) {
            throw new AssertionError("Internal error");
        }
        int length = this.field_904.length * 2;
        int i2 = this.field_905 + i;
        if (length <= i2) {
            length = i2;
        }
        byte[] bArr = new byte[length];
        System.arraycopy(this.field_904, 0, bArr, 0, this.field_905);
        this.field_904 = bArr;
    }

    public class_258 method_1143(byte[] bArr, int i, int i2) {
        if (this.field_905 + i2 > this.field_904.length) {
            method_1142(i2);
        }
        if (bArr != null) {
            System.arraycopy(bArr, i, this.field_904, this.field_905, i2);
        }
        this.field_905 += i2;
        return this;
    }

    public class_258 method_1134(String str) {
        int length = str.length();
        if (length > 65535) {
            throw new IllegalArgumentException("UTF8 string too large");
        }
        int i = this.field_905;
        if (i + 2 + length > this.field_904.length) {
            method_1142(length + 2);
        }
        byte[] bArr = this.field_904;
        int i2 = i + 1;
        bArr[i] = (byte) (length >>> 8);
        int i3 = i2 + 1;
        bArr[i2] = (byte) length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            char charAt = str.charAt(i5);
            if (charAt >= 1 && charAt <= '\u007f') {
                bArr[i3] = (byte) charAt;
                int i6 = i5 + 1;
                i4 = i6;
                i5 = i6;
                i3++;
            } else {
                this.field_905 = i3;
                return method_1135(str, i5, 65535);
            }
        }
        this.field_905 = i3;
        return this;
    }

    public final class_258 method_1135(String str, int i, int i2) {
        int i3;
        int length = str.length();
        int i4 = i;
        int i5 = i;
        int i6 = i;
        while (i4 < length) {
            char charAt = str.charAt(i5);
            if (charAt < 1 || charAt > '\u007f') {
                if (charAt > '\u07ff') {
                    i6 += 3;
                } else {
                    i6 += 2;
                }
            } else {
                i6++;
            }
            int i7 = i5 + 1;
            i4 = i7;
            i5 = i7;
        }
        if (i6 <= i2) {
            int i8 = (this.field_905 - i) - 2;
            if (i8 >= 0) {
                this.field_904[i8] = (byte) (i6 >>> 8);
                this.field_904[i8 + 1] = (byte) i6;
            }
            if ((this.field_905 + i6) - i > this.field_904.length) {
                method_1142(i6 - i);
            }
            int i9 = i;
            int i10 = i;
            int i11 = this.field_905;
            while (i9 < length) {
                char charAt2 = str.charAt(i10);
                if (charAt2 >= 1 && charAt2 <= '\u007f') {
                    i3 = i11 + 1;
                    this.field_904[i11] = (byte) charAt2;
                } else if (charAt2 <= '\u07ff') {
                    int i12 = i11 + 1;
                    this.field_904[i11] = (byte) (((charAt2 >> 6) & 31) | class_555.field_2303);
                    i3 = i12 + 1;
                    this.field_904[i12] = (byte) ((charAt2 & '?') | 128);
                } else {
                    int i13 = i11 + 1;
                    this.field_904[i11] = (byte) (((charAt2 >> '\f') & 15) | 224);
                    int i14 = i13 + 1;
                    this.field_904[i13] = (byte) (((charAt2 >> 6) & 63) | 128);
                    i3 = i14 + 1;
                    this.field_904[i14] = (byte) ((charAt2 & '?') | 128);
                }
                int i15 = i10 + 1;
                i9 = i15;
                i10 = i15;
                i11 = i3;
            }
            this.field_905 = i11;
            return this;
        }
        throw new IllegalArgumentException("UTF8 string too large");
    }

    public int method_1137() {
        return this.field_905;
    }

    public class_258 method_1144(long j) {
        int i = this.field_905;
        if (i + 8 > this.field_904.length) {
            method_1142(8);
        }
        byte[] bArr = this.field_904;
        int i2 = (int) (j >>> 32);
        int i3 = i + 1;
        bArr[i] = (byte) (i2 >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i2 >>> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i2 >>> 8);
        byte b = (byte) i2;
        int i6 = i5 + 1;
        bArr[i5] = b;
        int i7 = (int) j;
        int i8 = i6 + 1;
        bArr[i6] = (byte) (i7 >>> 24);
        int i9 = i8 + 1;
        bArr[i8] = (byte) (i7 >>> 16);
        int i10 = i9 + 1;
        bArr[i9] = (byte) (i7 >>> 8);
        bArr[i10] = (byte) i7;
        this.field_905 = i10 + 1;
        return this;
    }

    public class_258(int i) {
        this.field_904 = new byte[i];
    }

    public class_258 method_1132(int i) {
        int i2 = this.field_905;
        if (i2 + 1 > this.field_904.length) {
            method_1142(1);
        }
        this.field_904[i2] = (byte) i;
        this.field_905 = i2 + 1;
        return this;
    }

    public class_258(byte[] bArr) {
        this.field_904 = bArr;
        this.field_905 = bArr.length;
    }

    public class_258 method_1139(int i) {
        int i2 = this.field_905;
        if (i2 + 4 > this.field_904.length) {
            method_1142(4);
        }
        byte[] bArr = this.field_904;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i5] = (byte) i;
        this.field_905 = i5 + 1;
        return this;
    }

    public final class_258 method_1140(int i, int i2, int i3) {
        int i4 = this.field_905;
        if (i4 + 4 > this.field_904.length) {
            method_1142(4);
        }
        byte[] bArr = this.field_904;
        int i5 = i4 + 1;
        bArr[i4] = (byte) i;
        int i6 = i5 + 1;
        bArr[i5] = (byte) i2;
        int i7 = i6 + 1;
        bArr[i6] = (byte) (i3 >>> 8);
        bArr[i7] = (byte) i3;
        this.field_905 = i7 + 1;
        return this;
    }

    public final class_258 method_1133(int i, int i2) {
        int i3 = this.field_905;
        if (i3 + 2 > this.field_904.length) {
            method_1142(2);
        }
        byte[] bArr = this.field_904;
        int i4 = i3 + 1;
        bArr[i3] = (byte) i;
        bArr[i4] = (byte) i2;
        this.field_905 = i4 + 1;
        return this;
    }

    public class_258() {
        this.field_904 = new byte[64];
    }

    public class_258 method_1138(int i) {
        int i2 = this.field_905;
        if (i2 + 2 > this.field_904.length) {
            method_1142(2);
        }
        byte[] bArr = this.field_904;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 8);
        bArr[i3] = (byte) i;
        this.field_905 = i3 + 1;
        return this;
    }
}
