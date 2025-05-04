package com.allatori.ant;

import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.unmapped.class_389;

import java.io.Serializable;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_135 implements class_389, Cloneable, Serializable {
    public class_337 field_595;
    public class_337 field_596;
    public class_337 field_597;
    public class_392 field_598;

    public void method_435(class_337 class_337Var) {
        class_272.method_1207(this.field_596, class_337Var, this);
        this.field_596 = class_337Var;
    }

    @Override // p000.class_389
    public boolean method_423(class_337 class_337Var) {
        return this.field_596 == class_337Var || this.field_595 == class_337Var || this.field_597 == class_337Var;
    }

    public class_337 method_419() {
        return this.field_595;
    }

    public void method_420(class_337 class_337Var) {
        class_272.method_1207(this.field_597, class_337Var, this);
        this.field_597 = class_337Var;
    }

    public class_135(class_337 class_337Var, class_337 class_337Var2, class_337 class_337Var3, class_392 class_392Var) {
        method_435(class_337Var);
        method_51(class_337Var2);
        method_420(class_337Var3);
        this.field_598 = class_392Var;
    }

    @Override // p000.class_389
    public void method_52(class_337 class_337Var, class_337 class_337Var2) {
        boolean z;
        boolean z2 = true;
        if (this.field_596 == class_337Var) {
            method_435(class_337Var2);
            z = true;
        } else {
            z = false;
        }
        if (this.field_595 == class_337Var) {
            method_51(class_337Var2);
            z = true;
        }
        if (this.field_597 == class_337Var) {
            method_420(class_337Var2);
        } else {
            z2 = z;
        }
        if (!z2) {
            throw new class_151(new StringBuilder().insert(0, "Not targeting ").append(class_337Var).append(", but {").append(this.field_596).append(", ").append(this.field_595).append(", ").append(this.field_597).append("}").toString());
        }
    }

    public class_392 method_646() {
        return this.field_598;
    }

    public class_337 method_45() {
        return this.field_597;
    }

    public void method_645(class_392 class_392Var) {
        this.field_598 = class_392Var;
    }

    public class_337 method_415() {
        return this.field_596;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println(e);
            return null;
        }
    }

    public class_372 method_647(class_208 class_208Var) {
        return new class_372(this.field_596.method_47(), this.field_595.method_1038().method_433() + this.field_595.method_47(), this.field_597.method_47(), this.field_598 == null ? 0 : class_208Var.method_987(this.field_598));
    }

    public void method_51(class_337 class_337Var) {
        class_272.method_1207(this.field_595, class_337Var, this);
        this.field_595 = class_337Var;
    }
}
