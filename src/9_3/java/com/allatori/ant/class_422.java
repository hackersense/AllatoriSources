package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_124;

import java.util.Vector;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_422 implements class_124 {
    public boolean field_1660;
    public class_124 field_1662;
    public boolean field_1664;
    public int field_1665 = 0;
    public static Vector field_1663 = new Vector();
    public static Vector field_1661 = new Vector();

    public static void method_1581() {
        field_1663 = new Vector();
        field_1661 = new Vector();
    }

    @Override // p000.class_124
    public String method_178() {
        if (this.field_1660 && this.field_1665 < field_1663.size()) {
            Vector vector = field_1663;
            int i = this.field_1665;
            this.field_1665 = i + 1;
            return (String) vector.get(i);
        }
        if (this.field_1664 && this.field_1665 < field_1661.size()) {
            Vector vector2 = field_1661;
            int i2 = this.field_1665;
            this.field_1665 = i2 + 1;
            return (String) vector2.get(i2);
        }
        return this.field_1662.method_178();
    }

    public static void method_1582(String str) {
        if (!field_1663.contains(str)) {
            field_1663.add(str);
        }
    }

    @Override // p000.class_124
    public void method_177() {
        this.field_1665 = 0;
        this.field_1662.method_177();
    }

    public class_422(class_124 class_124Var, boolean z, boolean z2) {
        this.field_1662 = class_124Var;
        this.field_1660 = z;
        this.field_1664 = z2;
    }

    public static void method_1580(String str) {
        if (str.charAt(0) == '<' || "main".equals(str) || field_1661.contains(str)) {
            return;
        }
        field_1661.add(str);
    }
}
