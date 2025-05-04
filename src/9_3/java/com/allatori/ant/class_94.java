package com.allatori.ant;

import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.unmapped.class_445;
import com.allatori.interfaces.unmapped.class_552;
import com.allatori.interfaces.unmapped.class_97;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_94 extends class_539 implements class_552, class_97 {
    public int field_501;

    public class_94() {
    }

    public class_94(int i) {
        super((short) 3, (short) 1);
        if (i >= -1 && i <= 5) {
            this.IIiIIIIiii = (short) (i + 3);
            this.field_501 = i;
            return;
        }
        throw new class_151(new StringBuilder().insert(0, "ICONST can be used only for value between -1 and 5: ").append(i).toString());
    }

    @Override // p000.class_97
    public class_212 method_32(class_208 class_208Var) {
        return class_212.field_802;
    }

    @Override // p000.class_552
    public Number method_238() {
        return new Integer(this.field_501);
    }

    @Override // p000.class_539
    public void method_0(class_445 class_445Var) {
        class_445Var.method_467(this);
        class_445Var.method_486(this);
        class_445Var.method_493(this);
        class_445Var.method_484(this);
        class_445Var.method_267(this);
    }
}
