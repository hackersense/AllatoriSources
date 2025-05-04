package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_291;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_441 implements class_291 {
    public class_606 field_1724;

    public class_441(class_606 class_606Var) {
        this.field_1724 = class_606Var;
    }

    @Override // p000.class_291
    public void method_34(class_202 class_202Var) {
        int method_983;
        try {
            class_202 method_2102 = this.field_1724.method_2102("com.license4j.HardwareID");
            if (method_2102 != null && (method_983 = method_2102.method_917().method_983("resources/d.bfi")) != -1) {
                ((class_371) method_2102.method_917().method_982(method_983)).method_671(class_544.method_1919().method_144());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // p000.class_291
    public void method_39() {
    }
}
