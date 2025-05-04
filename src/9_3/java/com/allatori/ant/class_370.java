package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.interfaces.unmapped.class_291;
import com.allatori.interfaces.unmapped.class_389;
import com.allatori.interfaces.unmapped.class_93;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_370 implements class_291 {
    public class_606 field_1191;

    @Override // p000.class_291
    public void method_39() {
    }

    @Override // p000.class_291
    public void method_34(class_202 class_202Var) {
        class_70 method_1494;
        if (class_544.method_1923().method_1871() != null && class_544.method_1923().method_1874(this.field_1191, class_202Var)) {
            try {
                for (class_557 class_557Var : class_202Var.method_904()) {
                    if (class_557Var.method_1962() != null) {
                        class_591 method_1067 = class_230.method_1067(class_557Var, class_202Var.method_198(), class_202Var.method_917(), class_202Var.method_917().method_502());
                        if (class_544.method_1923().method_1872(this.field_1191, class_202Var, method_1067)) {
                            class_563 class_563Var = new class_563(class_202Var);
                            class_70 method_438 = method_1067.method_438();
                            if (class_544.method_1937().method_1699()) {
                                method_1494 = method_1493(class_202Var.method_917(), class_563Var);
                            } else {
                                method_1494 = method_1494(class_202Var.method_917(), class_563Var);
                            }
                            if ("<init>".equals(class_557Var.method_464())) {
                                class_337 method_419 = method_438.method_419();
                                class_337 method_445 = method_438.method_445(method_419, method_1494);
                                class_389[] method_1398 = method_419.method_1398();
                                int length = method_1398.length - 1;
                                int i = length;
                                int i2 = length;
                                while (i >= 0) {
                                    int i3 = i2 - 1;
                                    method_1398[i2].method_52(method_419, method_445);
                                    i = i3;
                                    i2 = i3;
                                }
                            } else {
                                method_438.method_447(method_1494);
                            }
                            method_1067.method_2056();
                            method_1067.method_2071();
                            class_202Var.method_914(class_557Var, method_1067.method_2048());
                            method_1494.method_50();
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class_70 method_1494(class_208 class_208Var, class_563 class_563Var) {
        class_70 class_70Var = new class_70();
        class_70Var.method_409(class_563Var.method_1970("java.util.Date"));
        class_70Var.method_409(class_93.field_442);
        class_70Var.method_410(new class_302(class_208Var, class_544.method_1923().method_1871().getTime()));
        class_70Var.method_409(class_563Var.method_1980("java.util.Date", "<init>", class_212.field_794, new class_212[]{class_212.field_798}, (short) 183));
        class_70Var.method_409(class_563Var.method_1970("java.util.Date"));
        class_70Var.method_409(class_93.field_442);
        class_70Var.method_409(class_563Var.method_1980("java.util.Date", "<init>", class_212.field_794, class_212.field_807, (short) 183));
        class_70Var.method_409(class_93.field_426);
        class_70Var.method_409(class_563Var.method_1980("java.util.Date", "after", class_212.field_813, new class_212[]{new class_392("java.util.Date")}, ASMInterface.field_1312));
        class_272 method_1979 = class_563.method_1979(ASMInterface.field_1398, null);
        class_70Var.method_413(method_1979);
        class_70Var.method_409(class_563Var.method_1970("java.lang.Throwable"));
        class_70Var.method_409(class_93.field_442);
        class_70Var.method_410(new class_302(class_208Var, class_544.method_1923().method_1876()));
        class_70Var.method_409(class_563Var.method_1980("java.lang.Throwable", "<init>", class_212.field_794, new class_212[]{class_212.field_799}, (short) 183));
        class_70Var.method_409(class_93.field_399);
        method_1979.method_51(class_70Var.method_409(class_93.field_456));
        return class_70Var;
    }

    public class_70 method_1493(class_208 class_208Var, class_563 class_563Var) {
        class_70 class_70Var = new class_70();
        class_70Var.method_409(class_563Var.method_1970("java.util.Date"));
        class_70Var.method_409(class_93.field_442);
        class_70Var.method_410(new class_302(class_208Var, class_544.method_1923().method_1871().getTime()));
        class_70Var.method_409(class_563Var.method_1980("java.util.Date", "<init>", class_212.field_794, new class_212[]{class_212.field_798}, (short) 183));
        class_70Var.method_409(class_563Var.method_1970("java.util.Date"));
        class_70Var.method_409(class_93.field_442);
        class_70Var.method_409(class_563Var.method_1980("java.util.Date", "<init>", class_212.field_794, class_212.field_807, (short) 183));
        class_70Var.method_409(class_93.field_460);
        class_70Var.method_409(class_93.field_383);
        class_70Var.method_409(class_93.field_477);
        class_70Var.method_409(class_563Var.method_1980("java.util.Date", "getTime", class_212.field_798, class_212.field_807, ASMInterface.field_1312));
        class_70Var.method_409(class_93.field_498);
        class_70Var.method_409(class_93.field_477);
        class_70Var.method_409(class_563Var.method_1980("java.util.Date", "getTime", class_212.field_798, class_212.field_807, ASMInterface.field_1312));
        class_70Var.method_409(class_93.field_418);
        class_70Var.method_409(class_93.field_393);
        class_272 method_1979 = class_563.method_1979(ASMInterface.field_1535, null);
        class_70Var.method_413(method_1979);
        class_70Var.method_409(class_563Var.method_1970("java.lang.Throwable"));
        class_70Var.method_409(class_93.field_442);
        class_70Var.method_410(new class_302(class_208Var, class_544.method_1923().method_1876()));
        class_70Var.method_409(class_563Var.method_1980("java.lang.Throwable", "<init>", class_212.field_794, new class_212[]{class_212.field_799}, (short) 183));
        class_70Var.method_409(class_93.field_399);
        method_1979.method_51(class_70Var.method_409(class_93.field_456));
        return class_70Var;
    }

    public class_370(class_606 class_606Var) {
        this.field_1191 = class_606Var;
    }
}
