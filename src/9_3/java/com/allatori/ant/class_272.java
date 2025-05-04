package com.allatori.ant;

import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.unmapped.class_389;

import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_272 extends class_539 implements class_389 {
    public int field_939;
    public class_337 field_940;
    public int field_941;

    public int method_1206(class_337 class_337Var) {
        if (class_337Var != null) {
            int method_47 = class_337Var.method_47();
            if (method_47 < 0) {
                throw new class_151(new StringBuilder().insert(0, "Invalid branch target position offset for ").append(super.method_406(true)).append(":").append(method_47).append(":").append(class_337Var).toString());
            }
            return method_47 - this.field_941;
        }
        throw new class_151(new StringBuilder().insert(0, "Target of ").append(super.method_406(true)).append(" is invalid null handle").toString());
    }

    @Override // p000.class_539
    public String method_406(boolean z) {
        String method_406 = super.method_406(z);
        String str = "null";
        if (z) {
            if (this.field_940 != null) {
                str = this.field_940.method_1038() == this ? "<points to itself>" : this.field_940.method_1038() == null ? "<null instruction!!!?>" : this.field_940.method_1038().method_406(false);
            }
        } else if (this.field_940 != null) {
            this.field_939 = method_183();
            str = new StringBuilder().insert(0, "").append(this.field_939 + this.field_941).toString();
        }
        return new StringBuilder().insert(0, method_406).append(" -> ").append(str).toString();
    }

    public int method_49(int i, int i2) {
        this.field_941 += i;
        return 0;
    }

    public final int method_47() {
        return this.field_939;
    }

    @Override // p000.class_389
    public void method_52(class_337 class_337Var, class_337 class_337Var2) {
        if (this.field_940 == class_337Var) {
            method_51(class_337Var2);
            return;
        }
        throw new class_151(new StringBuilder().insert(0, "Not targeting ").append(class_337Var).append(", but ").append(this.field_940).toString());
    }

    @Override // p000.class_389
    public boolean method_423(class_337 class_337Var) {
        return this.field_940 == class_337Var;
    }

    public void method_51(class_337 class_337Var) {
        method_1207(this.field_940, class_337Var, this);
        this.field_940 = class_337Var;
    }

    @Override // p000.class_539
    public void method_200(class_346 class_346Var, boolean z) {
        this.IIiiIIIIIi = (short) 3;
        this.field_939 = class_346Var.readShort();
    }

    public class_337 getF940() {
        return this.field_940;
    }

    public class_272(short s, class_337 class_337Var) {
        super(s, (short) 3);
        method_51(class_337Var);
    }

    @Override // p000.class_539
    public void method_97() {
        method_51(null);
        this.field_939 = -1;
        this.field_941 = -1;
    }

    public int method_183() {
        return method_1206(this.field_940);
    }

    @Override // p000.class_539
    public void method_184(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.IIiIIIIiii);
        this.field_939 = method_183();
        if (Math.abs(this.field_939) < 32767) {
            dataOutputStream.writeShort(this.field_939);
            return;
        }
        throw new class_151("Branch target offset too large for short");
    }

    public class_272() {
    }

    public static final void method_1207(class_337 class_337Var, class_337 class_337Var2, class_389 class_389Var) {
        if (class_337Var != null) {
            class_337Var.method_1392(class_389Var);
        }
        if (class_337Var2 == null) {
            return;
        }
        class_337Var2.method_1397(class_389Var);
    }
}
