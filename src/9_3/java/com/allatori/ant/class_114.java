package com.allatori.ant;

import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.unmapped.class_445;
import com.allatori.interfaces.unmapped.class_552;
import com.allatori.interfaces.unmapped.class_97;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_114 extends class_539 implements class_552, class_97 {
    public double field_538;

    public class_114() {
    }

    public class_114(double d) {
        super((short) 14, (short) 1);
        if (d == 0.0d) {
            this.IIiIIIIiii = (short) 14;
        } else {
            if (d != 1.0d) {
                throw new class_151(new StringBuilder().insert(0, "DCONST can be used only for 0.0 and 1.0: ").append(d).toString());
            }
            this.IIiIIIIiii = (short) 15;
        }
        this.field_538 = d;
    }

    @Override // p000.class_539
    public void method_0(class_445 class_445Var) {
        class_445Var.method_467(this);
        class_445Var.method_486(this);
        class_445Var.method_493(this);
        class_445Var.method_484(this);
        class_445Var.method_370(this);
    }

    @Override // p000.class_552
    public Number method_238() {
        return new Double(this.field_538);
    }

    @Override // p000.class_97
    public class_212 method_32(class_208 class_208Var) {
        return class_212.field_810;
    }
}
