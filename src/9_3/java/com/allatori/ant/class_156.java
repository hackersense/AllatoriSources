package com.allatori.ant;

import java.util.List;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_156 {
    public static final int field_683 = 1;
    public static final int field_684 = 2;
    public static final int field_687 = 0;
    public class_460 field_685 = new class_460(1);
    public final class_544 field_686;

    public class_156(class_544 class_544Var) {
        this.field_686 = class_544Var;
    }

    public int method_771(class_606 class_606Var, class_202 class_202Var, class_591 class_591Var) {
        List method_2015;
        if (!class_544.method_1937().method_1699() && class_591Var.method_198().startsWith("Allatori")) {
            return 1;
        }
        class_574[] method_908 = class_591Var.method_908();
        boolean z = true;
        while (true) {
            int length = method_908.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                class_574 class_574Var = method_908[i2];
                if ("Lcom/allatori/annotations/ExtensiveFlowObfuscation;".equals(class_574Var.method_2016()) && (method_2015 = class_574Var.method_2015()) != null && method_2015.size() > 0 && ((class_410) method_2015.get(0)).method_1567() != null) {
                    if (!"maximum".equals(((class_410) method_2015.get(0)).method_1567().method_554())) {
                        if ("normal".equals(((class_410) method_2015.get(0)).method_1567().method_554())) {
                            return 1;
                        }
                        if ("disable".equals(((class_410) method_2015.get(0)).method_1567().method_554())) {
                            return 0;
                        }
                    } else {
                        return 2;
                    }
                }
                int i3 = i2 + 1;
                i = i3;
                i2 = i3;
            }
            if (z) {
                method_908 = class_202Var.method_908();
                z = false;
            } else {
                if (class_544.method_1937().method_1703() && class_544.method_1937().method_1706()) {
                    return 0;
                }
                return this.field_685.method_1722(class_606Var, class_202Var, class_591Var);
            }
        }
    }

    public void method_770(class_169 class_169Var) {
        this.field_685.method_1724(class_169Var);
    }
}
