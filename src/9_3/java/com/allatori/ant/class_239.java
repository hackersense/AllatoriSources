package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.interfaces.unmapped.class_97;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_239 extends class_119 implements class_97 {
    @Override // p000.class_418, p000.class_97
    public class_212 method_32(class_208 class_208Var) {
        return method_1085(class_208Var);
    }

    public int method_1084(class_208 class_208Var) {
        return method_32(class_208Var).method_47();
    }

    public class_239(short s, int i) {
        super(s, i);
    }

    @Override // p000.class_418, p000.class_539
    public String method_189(class_499 class_499Var) {
        return new StringBuilder().insert(0, ASMInterface.field_1554[this.IIiIIIIiii]).append(" ").append(class_499Var.method_1848(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE, (byte) 9)).toString();
    }

    public String method_1086(class_208 class_208Var) {
        return method_620(class_208Var);
    }

    public class_239() {
    }

    public class_212 method_1085(class_208 class_208Var) {
        return class_212.method_1034(method_621(class_208Var));
    }
}
