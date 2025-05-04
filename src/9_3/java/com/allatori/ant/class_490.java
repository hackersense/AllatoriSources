package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_438;
import com.allatori.interfaces.unmapped.class_601;
import com.allatori.interfaces.unmapped.class_97;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_490 extends class_272 implements class_438, class_97, class_601 {
    @Override // p000.class_97
    public class_212 method_32(class_208 class_208Var) {
        return new class_211(method_415());
    }

    public class_490(short s, class_337 class_337Var) {
        super(s, class_337Var);
    }

    public class_490() {
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0004 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:6:0x0013 */
    public class_337 method_415() {
        class_337 class_337Var;
        class_337 class_337Var2;
        class_337 class_337Var3 = this.IIiIIIIiii;
        while (true) {
            class_337Var = class_337Var3;
            if (class_337Var3.method_419() == null) {
                break;
            }
            class_337Var3 = class_337Var.method_419();
        }
        while (true) {
            class_337Var2 = class_337Var;
            if (class_337Var.method_1038() == this) {
                break;
            }
            class_337Var = class_337Var2.method_415();
        }
        class_337 class_337Var4 = class_337Var2;
        while (class_337Var4 != null) {
            class_337Var4 = class_337Var4.method_415();
            if (class_337Var4 != null && class_337Var4.method_1038() == this) {
                throw new RuntimeException("physicalSuccessor() called on a shared JsrInstruction.");
            }
        }
        return class_337Var2.method_415();
    }
}
