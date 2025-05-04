package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_555;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_598 extends class_463 {
    public final StringBuilder field_2390;
    public boolean field_2391;
    public boolean field_2392;
    public int field_2393;

    @Override // p000.class_463
    public class_463 method_1741(char c) {
        if ((this.field_2393 & 1) == 0) {
            this.field_2393 |= 1;
            this.field_2390.append('<');
        }
        if (c != '=') {
            this.field_2390.append(c);
        }
        return (this.field_2393 & Integer.MIN_VALUE) == 0 ? this : new class_598(this.field_2390);
    }

    @Override // p000.class_463
    public class_463 method_1745() {
        return this;
    }

    public void method_2096() {
        if (this.field_2391) {
            this.field_2391 = false;
            this.field_2390.append('>');
        }
    }

    @Override // p000.class_463
    public class_463 method_1746() {
        method_2096();
        if (!this.field_2392) {
            this.field_2390.append('(');
        }
        this.field_2390.append(')');
        return this;
    }

    @Override // p000.class_463
    public void method_1744(String str) {
        this.field_2390.append('L');
        this.field_2390.append(str);
        this.field_2393 <<= 1;
    }

    @Override // p000.class_463
    public class_463 method_1742() {
        return this;
    }

    @Override // p000.class_463
    public void method_1751() {
        method_2097();
        this.field_2390.append(';');
    }

    @Override // p000.class_463
    public class_463 method_1738() {
        method_2096();
        if (!this.field_2392) {
            this.field_2392 = true;
            this.field_2390.append('(');
        }
        return this;
    }

    public class_598() {
        this(new StringBuilder());
    }

    public class_598(StringBuilder sb) {
        super(class_555.field_2171);
        this.field_2393 = 1;
        this.field_2390 = sb;
    }

    @Override // p000.class_463
    public void method_1753(String str) {
        this.field_2390.append('T');
        this.field_2390.append(str);
        this.field_2390.append(';');
    }

    @Override // p000.class_463
    public void method_1749() {
        if ((this.field_2393 & 1) == 0) {
            this.field_2393 |= 1;
            this.field_2390.append('<');
        }
        this.field_2390.append('*');
    }

    @Override // p000.class_463
    public void method_1739(String str) {
        method_2097();
        this.field_2390.append('.');
        this.field_2390.append(str);
        this.field_2393 <<= 1;
    }

    @Override // p000.class_463
    public void method_1743(char c) {
        this.field_2390.append(c);
    }

    @Override // p000.class_463
    public void method_1740(String str) {
        if (!this.field_2391) {
            this.field_2391 = true;
            this.field_2390.append('<');
        }
        this.field_2390.append(str);
        this.field_2390.append(':');
    }

    @Override // p000.class_463
    public class_463 method_1750() {
        this.field_2390.append('^');
        return this;
    }

    @Override // p000.class_463
    public class_463 method_1737() {
        this.field_2390.append('[');
        return this;
    }

    @Override // p000.class_463
    public class_463 method_1748() {
        method_2096();
        return this;
    }

    public void method_2097() {
        if ((this.field_2393 & 1) == 1) {
            this.field_2390.append('>');
        }
        this.field_2393 >>>= 1;
    }

    @Override // p000.class_463
    public class_463 method_1752() {
        this.field_2390.append(':');
        return this;
    }
}
