package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_291;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_406 implements class_291 {
    public class_381 field_1254 = new class_381(null);
    public class_606 field_1255;

    public class_406(class_606 class_606Var) {
        this.field_1255 = class_606Var;
    }

    @Override // p000.class_291
    public void method_34(class_202 class_202Var) {
        if (!class_15.field_33.contains(class_202Var)) {
            return;
        }
        try {
            method_40(class_202Var);
        } catch (Exception e) {
            this.field_1254.method_1505(class_202Var);
            method_40(class_202Var);
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:18:0x00a2 */
    public void method_40(class_202 class_202Var) {
        class_557[] method_904 = class_202Var.method_904();
        int i = 0;
        int i2 = 0;
        while (i < method_904.length) {
            class_557 class_557Var = method_904[i2];
            if (class_557Var.method_1962() != null) {
                class_591 method_1067 = class_230.method_1067(class_557Var, class_202Var.method_198(), class_202Var.method_917(), class_202Var.method_917().method_502());
                class_337 method_415 = method_1067.method_438().method_415();
                class_337 class_337Var = method_415;
                class_337 class_337Var2 = method_415;
                while (class_337Var != null) {
                    if (class_337Var2.method_1038() instanceof class_489) {
                        class_489 class_489Var = (class_489) class_337Var2.method_1038();
                        class_286 method_982 = class_202Var.method_917().method_982(class_489Var.method_47());
                        if (method_982 instanceof class_118) {
                            String method_198 = ((class_371) class_202Var.method_917().method_982(((class_118) method_982).method_47())).method_198();
                            if (method_198 != null && method_198.startsWith("allatori-12321-32123:")) {
                                class_489Var.method_46(class_202Var.method_917().method_1010(class_15.method_41(method_198.substring(21), new StringBuilder().insert(0, class_202Var.method_198()).append(method_1067.method_198()).toString())));
                            } else if (method_198 != null && method_198.startsWith("allatori-custom-12321-32123:")) {
                                class_489Var.method_46(class_202Var.method_917().method_1010(class_240.method_1087(method_198, this.field_1255.method_2103(), class_202Var.method_198(), method_1067.method_198())));
                            }
                        }
                    }
                    class_337 method_4152 = class_337Var2.method_415();
                    class_337Var = method_4152;
                    class_337Var2 = method_4152;
                }
                method_1067.method_2056();
                class_202Var.method_914(class_557Var, method_1067.method_2048());
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
    }

    @Override // p000.class_291
    public void method_39() {
        class_15.field_33 = null;
    }
}
