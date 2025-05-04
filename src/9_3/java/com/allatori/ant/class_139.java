package com.allatori.ant;

import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.unmapped.class_142;
import com.allatori.interfaces.unmapped.class_389;

import java.io.Serializable;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_139 implements class_389, class_142, Cloneable, Serializable {
    public class_337 field_634;
    public class_212 field_635;
    public class_337 field_636;
    public String field_637;
    public int field_638;

    public class_337 method_419() {
        return this.field_634;
    }

    @Override // p000.class_389
    public boolean method_423(class_337 class_337Var) {
        return this.field_636 == class_337Var || this.field_634 == class_337Var;
    }

    public class_368 method_670(class_208 class_208Var) {
        int method_47 = this.field_636.method_47();
        int method_472 = this.field_634.method_47() - method_47;
        if (method_472 > 0) {
            method_472 += this.field_634.method_1038().method_433();
        }
        return new class_368(method_47, method_472, class_208Var.method_1004(this.field_637), class_208Var.method_1004(this.field_635.method_198()), this.field_638, class_208Var.method_502());
    }

    @Override // p000.class_389
    public void method_52(class_337 class_337Var, class_337 class_337Var2) {
        boolean z;
        boolean z2 = true;
        if (this.field_636 == class_337Var) {
            method_435(class_337Var2);
            z = true;
        } else {
            z = false;
        }
        if (this.field_634 == class_337Var) {
            method_51(class_337Var2);
        } else {
            z2 = z;
        }
        if (z2) {
        } else {
            throw new class_151(new StringBuilder().insert(0, "Not targeting ").append(class_337Var).append(", but {").append(this.field_636).append(", ").append(this.field_634).append("}").toString());
        }
    }

    public void method_51(class_337 class_337Var) {
        class_272.method_1207(this.field_634, class_337Var, this);
        this.field_634 = class_337Var;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof class_139)) {
            return false;
        }
        class_139 class_139Var = (class_139) obj;
        return class_139Var.field_638 == this.field_638 && class_139Var.field_636 == this.field_636 && class_139Var.field_634 == this.field_634;
    }

    public int method_47() {
        return this.field_638;
    }

    @Override // p000.class_142
    public class_212 method_669() {
        return this.field_635;
    }

    public int hashCode() {
        return (this.field_638 ^ this.field_637.hashCode()) ^ this.field_635.hashCode();
    }

    public class_337 method_415() {
        return this.field_636;
    }

    @Override // p000.class_142
    public String method_198() {
        return this.field_637;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println(e);
            return null;
        }
    }

    public void method_435(class_337 class_337Var) {
        class_272.method_1207(this.field_636, class_337Var, this);
        this.field_636 = class_337Var;
    }

    @Override // p000.class_142
    public void method_668(class_212 class_212Var) {
        this.field_635 = class_212Var;
    }

    public void method_46(int i) {
        this.field_638 = i;
    }

    public class_139(int i, String str, class_212 class_212Var, class_337 class_337Var, class_337 class_337Var2) {
        if (i >= 0 && i <= 65535) {
            this.field_637 = str;
            this.field_635 = class_212Var;
            this.field_638 = i;
            method_435(class_337Var);
            method_51(class_337Var2);
            return;
        }
        throw new class_151(new StringBuilder().insert(0, "Invalid index index: ").append(i).toString());
    }

    @Override // p000.class_142
    public void method_671(String str) {
        this.field_637 = str;
    }
}
