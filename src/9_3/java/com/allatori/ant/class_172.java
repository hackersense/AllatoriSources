package com.allatori.ant;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_172 implements Cloneable {
    public Double field_710;

    public abstract double method_794();

    public void method_787(double[] dArr) {
        method_795(dArr, dArr.length);
    }

    public void method_795(double[] dArr, int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = i3 + 1;
            dArr[i3] = method_794();
            i2 = i4;
            i3 = i4;
        }
    }

    public double method_793() {
        double method_789;
        double method_7892;
        double d;
        if (this.field_710 == null) {
            do {
                method_789 = method_789(-1.0d, 1.0d);
                method_7892 = method_789(-1.0d, 1.0d);
                d = (method_789 * method_789) + (method_7892 * method_7892);
            } while (d >= 1.0d);
            double sqrt = Math.sqrt(((-2.0d) * Math.log(d)) / d);
            this.field_710 = new Double(method_789 * sqrt);
            return method_7892 * sqrt;
        }
        double doubleValue = this.field_710.doubleValue();
        this.field_710 = null;
        return doubleValue;
    }

    public double method_789(double d, double d2) {
        return ((d2 - d) * method_794()) + d;
    }

    public int method_49(int i, int i2) {
        int method_794 = ((int) ((i2 - i) * method_794())) + i;
        return method_794 > i2 ? i2 : method_794;
    }

    public boolean method_424() {
        return method_794() <= 0.5d;
    }

    public double method_788(double d) {
        return method_793() * d;
    }

    public boolean method_791(double d) {
        return method_794() <= d;
    }

    public Object clone() {
        return super.clone();
    }

    public int method_790(int i) {
        return method_49(1, i);
    }

    public double method_792(double d, double d2) {
        return Math.pow(method_794(), 1.0d / (d + 1.0d)) * d2;
    }
}
