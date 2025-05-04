package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_555;

import java.io.Serializable;
import java.util.Date;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_532 extends class_492 implements Serializable {
    public double field_2002;
    public double field_2003;
    public int field_2004;
    public double[] field_2005;
    public int field_2006;
    public double[] field_2007;
    public double field_2008;

    public class_532() {
        method_46(54217137);
    }

    @Override // p000.class_172
    public final double method_794() {
        double d = this.field_2005[this.field_2006] - this.field_2005[this.field_2004];
        if (d < 0.0d) {
            d += 1.0d;
        }
        this.field_2005[this.field_2006] = d;
        int i = this.field_2006 - 1;
        this.field_2006 = i;
        if (i < 0) {
            this.field_2006 = 96;
        }
        int i2 = this.field_2004 - 1;
        this.field_2004 = i2;
        if (i2 < 0) {
            this.field_2004 = 96;
        }
        this.field_2003 -= this.field_2008;
        if (this.field_2003 < 0.0d) {
            this.field_2003 += this.field_2002;
        }
        double d2 = d - this.field_2003;
        return d2 < 0.0d ? d2 + 1.0d : d2;
    }

    public void method_46(int i) {
        this.field_2005 = new double[97];
        this.field_2007 = new double[97];
        int i2 = i / 30082;
        int i3 = i - (i2 * 30082);
        int i4 = ((i2 / class_555.field_2150) % class_555.field_2150) + 2;
        int i5 = (i2 % class_555.field_2150) + 2;
        int i6 = ((i3 / class_555.field_2174) % class_555.field_2078) + 1;
        int i7 = 0;
        int i8 = i3 % class_555.field_2174;
        int i9 = 0;
        while (i7 < 97) {
            double d = 0.0d;
            double d2 = 0.5d;
            int i10 = 0;
            int i11 = 0;
            while (i10 < 24) {
                int i12 = (((i4 * i5) % class_555.field_2141) * i6) % class_555.field_2141;
                i8 = ((i8 * 53) + 1) % class_555.field_2174;
                if ((i8 * i12) % 64 >= 32) {
                    d += d2;
                }
                int i13 = i11 + 1;
                d2 *= 0.5d;
                i10 = i13;
                i4 = i5;
                i11 = i13;
                i5 = i6;
                i6 = i12;
            }
            int i14 = i9 + 1;
            this.field_2005[i9] = d;
            i7 = i14;
            i9 = i14;
        }
        this.field_2003 = 0.021602869033813477d;
        this.field_2008 = 0.45623308420181274d;
        this.field_2002 = 0.9999998211860657d;
        this.field_2006 = 96;
        this.field_2004 = 32;
    }

    @Override // p000.class_172
    public final void method_795(double[] dArr, int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            double d = this.field_2005[this.field_2006] - this.field_2005[this.field_2004];
            if (d < 0.0d) {
                d += 1.0d;
            }
            this.field_2005[this.field_2006] = d;
            int i4 = this.field_2006 - 1;
            this.field_2006 = i4;
            if (i4 < 0) {
                this.field_2006 = 96;
            }
            int i5 = this.field_2004 - 1;
            this.field_2004 = i5;
            if (i5 < 0) {
                this.field_2004 = 96;
            }
            this.field_2003 -= this.field_2008;
            if (this.field_2003 < 0.0d) {
                this.field_2003 += this.field_2002;
            }
            double d2 = d - this.field_2003;
            if (d2 < 0.0d) {
                d2 += 1.0d;
            }
            int i6 = i3 + 1;
            dArr[i3] = d2;
            i2 = i6;
            i3 = i6;
        }
    }

    public class_532(Date date) {
        method_46(((int) method_1837(date)) % 899999963);
    }

    public class_532(long j) {
        method_46((int) Math.abs(j % 899999963));
    }

    public class_532(int i) {
        method_46(Math.abs(i % 899999963));
    }
}
