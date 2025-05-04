package com.allatori.ant;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_211 extends class_212 {
    public static final class_211 field_793 = new class_211();
    public class_337 field_792;

    public class_211(class_337 class_337Var) {
        super((byte) 16, new StringBuilder().insert(0, "<return address targeting ").append(class_337Var).append(">").toString());
        this.field_792 = class_337Var;
    }

    public class_337 method_419() {
        return this.field_792;
    }

    @Override // p000.class_212
    public boolean equals(Object obj) {
        if (!(obj instanceof class_211)) {
            return false;
        }
        class_211 class_211Var = (class_211) obj;
        if (this.field_792 == null || class_211Var.field_792 == null) {
            return class_211Var.field_792 == this.field_792;
        }
        return class_211Var.field_792.equals(this.field_792);
    }

    @Override // p000.class_212
    public int hashCode() {
        if (this.field_792 != null) {
            return this.field_792.hashCode();
        }
        return 0;
    }

    public class_211() {
        super((byte) 16, "<return address>");
    }
}
