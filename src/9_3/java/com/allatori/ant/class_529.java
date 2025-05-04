package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.interfaces.unmapped.class_291;
import com.allatori.interfaces.unmapped.class_389;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_529 implements class_291 {
    public class_606 field_2001;

    public class_529(class_606 class_606Var) {
        this.field_2001 = class_606Var;
    }

    @Override // p000.class_291
    public void method_39() {
    }

    @Override // p000.class_291
    public void method_34(class_202 class_202Var) {
        class_337 class_337Var;
        class_337 class_337Var2;
        String method_2 = class_544.method_1936().method_2();
        String method_1 = class_544.method_1936().method_1();
        if (method_2 == null || method_1 == null || !class_544.method_1936().method_9(this.field_2001, class_202Var)) {
            return;
        }
        try {
            for (class_557 class_557Var : class_202Var.method_904()) {
                if (class_557Var.method_1962() != null) {
                    class_591 method_1067 = class_230.method_1067(class_557Var, class_202Var.method_198(), class_202Var.method_917(), class_202Var.method_917().method_502());
                    if (class_544.method_1936().method_6(this.field_2001, class_202Var, method_1067)) {
                        class_563 class_563Var = new class_563(class_202Var);
                        class_70 method_438 = method_1067.method_438();
                        class_337 method_419 = method_438.method_419();
                        if (!class_544.method_1936().method_3()) {
                            class_337 method_449 = method_438.method_449(method_419, class_563Var.method_1980(method_2, method_1, class_212.field_794, class_212.field_807, ASMInterface.field_1301));
                            class_337Var = method_419;
                            class_337Var2 = method_449;
                        } else {
                            class_337 method_4492 = method_438.method_449(method_438.method_449(method_419, class_563Var.method_1980(method_2, method_1, class_212.field_794, new class_212[]{class_212.field_808}, ASMInterface.field_1301)), class_563.method_1038());
                            class_337Var = method_419;
                            class_337Var2 = method_4492;
                        }
                        class_389[] method_1398 = class_337Var.method_1398();
                        int length = method_1398.length - 1;
                        int i = length;
                        int i2 = length;
                        while (i >= 0) {
                            int i3 = i2 - 1;
                            method_1398[i2].method_52(method_419, class_337Var2);
                            i = i3;
                            i2 = i3;
                        }
                        method_1067.method_2056();
                        class_202Var.method_914(class_557Var, method_1067.method_2048());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
