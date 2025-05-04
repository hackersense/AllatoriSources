package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_291;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_604 implements class_291 {
    public class_606 field_2395;

    public class_604(class_606 class_606Var) {
        this.field_2395 = class_606Var;
    }

    @Override // p000.class_291
    public void method_34(class_202 class_202Var) {
        if (class_544.method_1925().method_1839(this.field_2395, class_202Var)) {
            class_557[] method_904 = class_202Var.method_904();
            int length = method_904.length - 1;
            int i = length;
            int i2 = length;
            while (i >= 0) {
                class_557 class_557Var = method_904[i2];
                if (!"toString".equals(class_557Var.method_464()) || !"()Ljava/lang/String;".equals(class_557Var.method_546())) {
                    int i3 = i2 - 1;
                    i = i3;
                    i2 = i3;
                } else {
                    class_202Var.method_907(class_557Var);
                    return;
                }
            }
        }
    }

    @Override // p000.class_291
    public void method_39() {
    }
}
