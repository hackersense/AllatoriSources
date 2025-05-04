package com.allatori.ant;

import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.unmapped.class_389;

import java.io.Serializable;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_270 implements class_389, Cloneable, Serializable {
    public int field_937;
    public class_337 field_938;

    public void method_51(class_337 class_337Var) {
        class_272.method_1207(this.field_938, class_337Var, this);
        this.field_938 = class_337Var;
    }

    public int method_47() {
        return this.field_937;
    }

    public class_270(class_337 class_337Var, int i) {
        method_51(class_337Var);
        method_46(i);
    }

    public class_387 method_1205() {
        return new class_387(this.field_938.method_47(), this.field_937);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println(e);
            return null;
        }
    }

    public class_337 method_419() {
        return this.field_938;
    }

    @Override // p000.class_389
    public boolean method_423(class_337 class_337Var) {
        return this.field_938 == class_337Var;
    }

    public void method_46(int i) {
        this.field_937 = i;
    }

    @Override // p000.class_389
    public void method_52(class_337 class_337Var, class_337 class_337Var2) {
        if (class_337Var == this.field_938) {
            method_51(class_337Var2);
            return;
        }
        throw new class_151(new StringBuilder().insert(0, "Not targeting ").append(class_337Var).append(", but ").append(this.field_938).append("}").toString());
    }
}
