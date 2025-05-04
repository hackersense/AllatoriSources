package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_124;

import java.util.Vector;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_47 implements class_124 {
    public boolean field_179;
    public class_124 field_182;
    public int field_184;
    public Vector field_180 = new Vector();
    public int field_181 = 0;
    public Vector field_183 = new Vector();

    @Override // p000.class_124
    public void method_177() {
        this.field_181 = 0;
    }

    public class_47(class_124 class_124Var) {
        this.field_184 = 26;
        this.field_179 = false;
        this.field_182 = class_124Var;
        if (class_124Var instanceof class_433) {
            this.field_179 = true;
            this.field_184 = 1024;
        }
    }

    @Override // p000.class_124
    public String method_178() {
        if (this.field_181 < this.field_180.size()) {
            Vector vector = this.field_180;
            int i = this.field_181;
            this.field_181 = i + 1;
            return (String) vector.get(i);
        }
        if (!this.field_179 && this.field_180.size() == 104) {
            this.field_184 = 299;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.field_184) {
            int i4 = i3 + 1;
            this.field_183.add(this.field_182.method_178());
            i2 = i4;
            i3 = i4;
        }
        if (class_544.method_1924().method_1478()) {
            class_231.method_1070(this.field_183);
        }
        this.field_180.addAll(this.field_183);
        this.field_183.clear();
        if (this.field_179) {
            class_433.method_1582((String) this.field_180.get(0));
        }
        Vector vector2 = this.field_180;
        int i5 = this.field_181;
        this.field_181 = i5 + 1;
        return (String) vector2.get(i5);
    }
}
