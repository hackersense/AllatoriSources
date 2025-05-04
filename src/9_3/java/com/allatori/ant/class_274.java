package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_445;
import com.allatori.interfaces.unmapped.class_521;
import com.allatori.interfaces.unmapped.class_97;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_274 extends class_418 implements class_521, class_97 {
    @Override // p000.class_539
    public void method_0(class_445 class_445Var) {
        class_445Var.method_486(this);
        class_445Var.method_467(this);
        class_445Var.method_493(this);
        class_445Var.method_494(this);
        class_445Var.method_264(this);
    }

    public class_274(int i) {
        super((short) 20, i);
    }

    public class_274() {
    }

    @Override // p000.class_418, p000.class_97
    public class_212 method_32(class_208 class_208Var) {
        switch (class_208Var.method_502().method_982(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE).method_619()) {
            case 5:
                return class_212.field_798;
            case 6:
                return class_212.field_810;
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "Unknown constant type ").append((int) this.IIiIIIIiii).toString());
        }
    }

    public Number method_1211(class_208 class_208Var) {
        class_286 method_982 = class_208Var.method_502().method_982(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE);
        switch (method_982.method_619()) {
            case 5:
                return new Long(((class_232) method_982).method_1074());
            case 6:
                return new Double(((class_573) method_982).method_794());
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "Unknown or invalid constant type at ").append(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE).toString());
        }
    }
}
