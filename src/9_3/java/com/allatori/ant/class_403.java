package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_291;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_403 implements class_291 {
    public class_606 field_1251;

    public class_403(class_606 class_606Var) {
        this.field_1251 = class_606Var;
    }

    @Override // p000.class_291
    public void method_34(class_202 class_202Var) {
        try {
            class_261[] method_898 = class_202Var.method_898();
            int length = method_898.length - 1;
            int i = length;
            int i2 = length;
            while (i >= 0) {
                class_261 class_261Var = method_898[i2];
                if (class_544.method_1929().method_895(this.field_1251, class_202Var, class_261Var)) {
                    class_261Var.method_1123(true);
                }
                int i3 = i2 - 1;
                i = i3;
                i2 = i3;
            }
            class_557[] method_904 = class_202Var.method_904();
            for (int length2 = method_904.length - 1; length2 >= 0; length2--) {
                class_557 class_557Var = method_904[length2];
                if (class_544.method_1929().method_892(this.field_1251, class_202Var, class_557Var)) {
                    class_557Var.method_1123(true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // p000.class_291
    public void method_39() {
    }
}
