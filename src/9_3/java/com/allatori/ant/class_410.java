package com.allatori.ant;

import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_410 {
    public class_476 field_1271;
    public int field_1272;
    public class_208 field_1273;

    public final class_476 method_1567() {
        return this.field_1271;
    }

    public int method_1569() {
        return this.field_1272;
    }

    public void method_1564(int i) {
        this.field_1272 = i;
    }

    public void method_1566(DataOutputStream dataOutputStream) {
        dataOutputStream.writeShort(this.field_1272);
        this.field_1271.method_552(dataOutputStream);
    }

    public final String method_1568() {
        return ((class_371) this.field_1273.method_982(this.field_1272)).method_198();
    }

    public class_410(class_553 class_553Var, class_208 class_208Var, boolean z) {
        this.field_1273 = class_208Var;
        if (!z) {
            this.field_1272 = class_553Var.method_1952();
        } else {
            this.field_1272 = class_208Var.method_1004(class_553Var.method_1950());
        }
        this.field_1271 = class_476.method_1827(class_553Var.method_1953(), class_208Var, z);
    }

    public class_410(int i, class_476 class_476Var, class_208 class_208Var) {
        this.field_1272 = i;
        this.field_1271 = class_476Var;
        this.field_1273 = class_208Var;
    }

    public class_553 method_1565() {
        return new class_553(this.field_1272, this.field_1271.method_553(), this.field_1273.method_502());
    }

    public class_410(String str, class_476 class_476Var, class_208 class_208Var) {
        this.field_1272 = class_208Var.method_1004(str);
        this.field_1271 = class_476Var;
        this.field_1273 = class_208Var;
    }
}
