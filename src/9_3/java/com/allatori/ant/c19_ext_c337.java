package com.allatori.ant;

import com.allatori.exception.runtime.class_151;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class c19_ext_c337 extends class_337 {
    public static c19_ext_c337 c19f = null;
    public class_272 field_35;

    @Override // p000.class_337
    public int method_49(int i, int i2) {
        int method_49 = this.field_35.method_49(i, i2);
        this.field_1122 = this.field_35.field_941;
        return method_49;
    }

    public class_337 method_45() {
        return this.field_35.getF940();
    }

    public static final c19_ext_c337 method_44(class_272 class_272Var) {
        if (c19f == null) {
            return new c19_ext_c337(class_272Var);
        }
        c19_ext_c337 c_19Extc337Var = c19f;
        c19f = (c19_ext_c337) c_19Extc337Var.c337;
        c_19Extc337Var.method_48(class_272Var);
        return c_19Extc337Var;
    }

    public void method_52(class_337 class_337Var, class_337 class_337Var2) {
        this.field_35.method_52(class_337Var, class_337Var2);
    }

    @Override // p000.class_337
    public int method_47() {
        return this.field_35.field_941;
    }

    public void method_51(class_337 class_337Var) {
        this.field_35.method_51(class_337Var);
    }

    @Override // p000.class_337
    public void method_46(int i) {
        this.field_35.field_941 = i;
        this.field_1122 = i;
    }

    @Override // p000.class_337
    public void method_48(class_539 class_539Var) {
        super.method_48(class_539Var);
        if (!(class_539Var instanceof class_272)) {
            throw new class_151(new StringBuilder().insert(0, "Assigning ").append(class_539Var).append(" to branch handle which is not a branch instruction").toString());
        }
        this.field_35 = (class_272) class_539Var;
    }

    public c19_ext_c337(class_272 class_272Var) {
        super(class_272Var);
        this.field_35 = class_272Var;
    }

    @Override // p000.class_337
    public void method_50() {
        this.c337 = c19f;
        c19f = this;
    }
}
