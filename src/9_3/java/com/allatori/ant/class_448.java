package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_291;
import com.allatori.interfaces.unmapped.class_389;
import com.allatori.interfaces.unmapped.class_93;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_448 implements class_291 {
    public class_606 field_1780;

    @Override // p000.class_291
    public void method_39() {
    }

    public class_448(class_606 class_606Var) {
        this.field_1780 = class_606Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
    
        if (r4 == 2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b3, code lost:
    
        if (r4 == 2) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2 A[Catch: Exception -> 0x01d0, TryCatch #0 {Exception -> 0x01d0, blocks: (B:2:0x0000, B:4:0x0009, B:88:0x0011, B:6:0x0015, B:8:0x0035, B:10:0x0044, B:12:0x0051, B:14:0x0059, B:21:0x008d, B:24:0x0097, B:26:0x009d, B:29:0x00a5, B:32:0x00af, B:34:0x00b5, B:37:0x00bc, B:39:0x00c2, B:41:0x00ca, B:43:0x00d2, B:49:0x00da, B:46:0x01b8, B:54:0x015e, B:57:0x016b, B:60:0x017c, B:63:0x018b, B:65:0x0199, B:68:0x01a0, B:71:0x0108, B:74:0x0115, B:77:0x0126, B:79:0x0132, B:82:0x0142, B:17:0x0061, B:86:0x01c1), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b8 A[ADDED_TO_REGION, SYNTHETIC] */
    @Override // p000.class_291
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void method_34(class_202 class_202Var) {
        class_337 class_337Var;
        boolean z;
        boolean z2;
        int i;
        try {
            for (class_557 class_557Var : class_202Var.method_904()) {
                if (class_557Var.method_1962() != null) {
                    class_591 method_1067 = class_230.method_1067(class_557Var, class_202Var.method_198(), class_202Var.method_917(), class_202Var.method_917().method_502());
                    if (class_544.method_1937().method_1681(this.field_1780, class_202Var, method_1067)) {
                        int method_771 = class_544.method_1920().method_771(this.field_1780, class_202Var, method_1067);
                        class_544.method_1920();
                        if (method_771 != 0) {
                            class_70 method_438 = method_1067.method_438();
                            class_337 method_415 = method_438.method_415();
                            boolean z3 = false;
                            class_337 class_337Var2 = method_415;
                            class_337 class_337Var3 = method_415;
                            while (class_337Var2 != null) {
                                if ((class_337Var3.method_1038() instanceof class_413) || (class_337Var3.method_1038() instanceof class_18)) {
                                    method_438.method_412(method_438.method_412(method_438.method_422(class_337Var3, new class_302(class_202Var.method_917(), 1)), class_93.field_442), class_93.field_477);
                                    class_337 method_4152 = class_337Var3.method_415().method_415().method_415().method_415();
                                    class_337Var2 = method_4152;
                                    class_337Var3 = method_4152;
                                } else {
                                    if (class_337Var3.method_1038() instanceof class_343) {
                                        if (z3) {
                                            class_544.method_1920();
                                        }
                                        if (class_337Var3.method_419() == null) {
                                            class_337Var = class_337Var3;
                                            z = z3;
                                        } else if (!method_1714(class_337Var3.method_1398())) {
                                            class_337Var = class_337Var3;
                                            z = z3;
                                        } else if (!method_1714(class_337Var3.method_419().method_1398())) {
                                            class_337Var = class_337Var3;
                                            z = z3;
                                        } else if ((class_337Var3.method_419().method_1038() instanceof class_94) || (class_337Var3.method_419().method_1038() instanceof class_467)) {
                                            method_438.method_412(method_438.method_412(method_438.method_412(class_337Var3, class_337Var3.method_419().method_1038()), class_93.field_442), class_93.field_477);
                                            z3 = true;
                                        } else {
                                            class_337Var = class_337Var3;
                                            z = z3;
                                        }
                                        if (class_337Var.method_1038() instanceof class_343) {
                                            if (z) {
                                                class_544.method_1920();
                                            }
                                            if (class_337Var3.method_419() == null) {
                                                i = method_771;
                                            } else if (!method_1714(class_337Var3.method_1398())) {
                                                i = method_771;
                                            } else if (!method_1714(class_337Var3.method_419().method_1398())) {
                                                i = method_771;
                                            } else if (class_337Var3.method_419().method_1038() instanceof class_226) {
                                                class_226 class_226Var = (class_226) class_337Var3.method_419().method_1038();
                                                if (!(class_226Var instanceof class_133)) {
                                                    if (class_226Var instanceof class_391) {
                                                        i = method_771;
                                                    } else {
                                                        method_438.method_412(method_438.method_412(method_438.method_412(class_337Var3, class_226Var.method_1038()), class_93.field_442), class_93.field_477);
                                                        z2 = true;
                                                        i = method_771;
                                                        z = z2;
                                                    }
                                                }
                                            } else {
                                                i = method_771;
                                            }
                                            class_544.method_1920();
                                            if (i == 2 && ((class_337Var3.method_1038() instanceof class_281) || (class_337Var3.method_1038() instanceof class_69) || (class_337Var3.method_1038() instanceof class_94))) {
                                                method_438.method_412(method_438.method_412(method_438.method_422(class_337Var3, new class_302(class_202Var.method_917(), 1)), class_93.field_442), class_93.field_477);
                                                class_337 method_4153 = class_337Var3.method_415().method_415().method_415().method_415();
                                                class_337Var2 = method_4153;
                                                z3 = z;
                                                class_337Var3 = method_4153;
                                            } else {
                                                class_337 method_4154 = class_337Var3.method_415();
                                                class_337Var2 = method_4154;
                                                z3 = z;
                                                class_337Var3 = method_4154;
                                            }
                                        }
                                        z2 = z;
                                        i = method_771;
                                        z = z2;
                                        class_544.method_1920();
                                        if (i == 2) {
                                        }
                                        class_337 method_41542 = class_337Var3.method_415();
                                        class_337Var2 = method_41542;
                                        z3 = z;
                                        class_337Var3 = method_41542;
                                    }
                                    class_337Var = class_337Var3;
                                    z = z3;
                                    if (class_337Var.method_1038() instanceof class_343) {
                                    }
                                    z2 = z;
                                    i = method_771;
                                    z = z2;
                                    class_544.method_1920();
                                    if (i == 2) {
                                    }
                                    class_337 method_415422 = class_337Var3.method_415();
                                    class_337Var2 = method_415422;
                                    z3 = z;
                                    class_337Var3 = method_415422;
                                }
                            }
                            method_1067.method_2056();
                            method_1067.method_2071();
                            class_202Var.method_914(class_557Var, method_1067.method_2048());
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean method_1714(class_389[] class_389VarArr) {
        if (class_389VarArr == null) {
            return true;
        }
        int i = 0;
        int i2 = 0;
        while (i < class_389VarArr.length) {
            class_389 class_389Var = class_389VarArr[i2];
            if (!(class_389Var instanceof class_270) && !(class_389Var instanceof class_139)) {
                return false;
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        return true;
    }
}
