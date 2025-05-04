package com.allatori.ant;

import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.unmapped.class_445;
import com.allatori.interfaces.unmapped.class_552;
import com.allatori.interfaces.unmapped.class_97;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_60 extends class_539 implements class_552, class_97 {
    public long field_205;

    public class_60() {
    }

    public class_60(long j) {
        super((short) 9, (short) 1);
        if (j == 0) {
            this.IIiIIIIiii = (short) 9;
        } else {
            if (j != 1) {
                throw new class_151(new StringBuilder().insert(0, "LCONST can be used only for 0 and 1: ").append(j).toString());
            }
            this.IIiIIIIiii = (short) 10;
        }
        this.field_205 = j;
    }

    @Override // p000.class_539
    public void method_0(class_445 class_445Var) {
        class_445Var.method_467(this);
        class_445Var.method_486(this);
        class_445Var.method_493(this);
        class_445Var.method_484(this);
        class_445Var.method_266(this);
    }

    @Override // p000.class_552
    public Number method_238() {
        return new Long(this.field_205);
    }

    @Override // p000.class_97
    public class_212 method_32(class_208 class_208Var) {
        return class_212.field_798;
    }
}
