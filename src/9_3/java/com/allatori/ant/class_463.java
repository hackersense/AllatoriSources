package com.allatori.ant;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_463 {
    public static final char field_1805 = '+';
    public static final char field_1806 = '-';
    public static final char field_1808 = '=';
    public final int field_1807;

    public static String method_1747(int i) {
        return new StringBuilder().insert(0, "Unsupported api ").append(i).toString();
    }

    public void method_1753(String str) {
    }

    public class_463 method_1746() {
        return this;
    }

    public class_463 method_1745() {
        return this;
    }

    public class_463 method_1748() {
        return this;
    }

    public class_463 method_1737() {
        return this;
    }

    public class_463(int i) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException(method_1747(i));
        }
        this.field_1807 = i;
    }

    public void method_1749() {
    }

    public void method_1739(String str) {
    }

    public class_463 method_1738() {
        return this;
    }

    public class_463 method_1742() {
        return this;
    }

    public void method_1744(String str) {
    }

    public void method_1743(char c) {
    }

    public void method_1751() {
    }

    public class_463 method_1750() {
        return this;
    }

    public class_463 method_1752() {
        return this;
    }

    public class_463 method_1741(char c) {
        return this;
    }

    public void method_1740(String str) {
    }
}
