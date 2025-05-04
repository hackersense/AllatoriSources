package com.allatori.ant;

import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.unmapped.class_445;
import com.allatori.interfaces.unmapped.class_552;
import com.allatori.interfaces.unmapped.class_97;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_249 extends class_539 implements class_552, class_97 {
    public float field_898;

    @Override // p000.class_539
    public void method_0(class_445 class_445Var) {
        class_445Var.method_467(this);
        class_445Var.method_486(this);
        class_445Var.method_493(this);
        class_445Var.method_484(this);
        class_445Var.method_313(this);
    }

    @Override // p000.class_552
    public Number method_238() {
        return new Float(this.field_898);
    }

    public class_249() {
    }

    public class_249(float f) {
        super((short) 11, (short) 1);
        if (f == 0.0d) {
            this.IIiIIIIiii = (short) 11;
        } else if (f == 1.0d) {
            this.IIiIIIIiii = (short) 12;
        } else if (f == 2.0d) {
            this.IIiIIIIiii = (short) 13;
        } else {
            throw new class_151(new StringBuilder().insert(0, "FCONST can be used only for 0.0, 1.0 and 2.0: ").append(f).toString());
        }
        this.field_898 = f;
    }

    @Override // p000.class_97
    public class_212 method_32(class_208 class_208Var) {
        return class_212.field_812;
    }
}
