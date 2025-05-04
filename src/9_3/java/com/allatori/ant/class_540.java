package com.allatori.ant;


import com.allatori.commons.AllatoriLogger;
import com.allatori.interfaces.unmapped.class_291;

import java.util.Iterator;
import java.util.Vector;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_540 {
    public class_606 field_2016;
    public boolean field_2017 = false;

    public void method_1905() {
        class_381 class_381Var = new class_381(this.field_2016);
        Iterator method_2108 = this.field_2016.method_2108();
        while (method_2108.hasNext()) {
            class_202 class_202Var = (class_202) method_2108.next();
            if (!class_544.method_1927().method_101(this.field_2016, class_202Var)) {
                class_381Var.method_1505(class_202Var);
            }
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:23:0x00c9 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:27:0x00f5 */
    public void method_1908() {
        if (class_544.method_1919().method_142()) {
            new class_441(this.field_2016).method_34(null);
        }
        Vector vector = new Vector();
        vector.add(new class_207());
        vector.add(new class_217(this.field_2016));
        vector.add(new class_604(this.field_2016));
        if (class_544.method_1936().method_2() != null && class_544.method_1936().method_1() != null) {
            vector.add(new class_529(this.field_2016));
        }
        if (class_544.method_1923().method_1871() != null) {
            vector.add(new class_370(this.field_2016));
        }
        int method_1682 = class_544.method_1937().method_1682();
        class_544.method_1937();
        if (method_1682 != 1) {
            vector.add(new class_15(this.field_2016));
        } else {
            class_138 class_138Var = new class_138(this.field_2016);
            if (!class_138Var.method_665()) {
                vector.add(new class_15(this.field_2016));
            } else {
                vector.add(class_138Var);
                this.field_2017 = true;
            }
        }
        vector.add(new class_403(this.field_2016));
        vector.add(new class_448(this.field_2016));
        vector.add(new class_326(this.field_2016));
        Iterator method_2108 = this.field_2016.method_2108();
        while (method_2108.hasNext()) {
            class_202 class_202Var = (class_202) method_2108.next();
            if (!class_544.method_1927().method_101(this.field_2016, class_202Var)) {
                Iterator it = vector.iterator();
                while (it.hasNext()) {
                    ((class_291) it.next()).method_34(class_202Var);
                }
            }
        }
        Iterator it2 = vector.iterator();
        while (it2.hasNext()) {
            ((class_291) it2.next()).method_39();
        }
    }

    public void method_1906() throws Exception {
        try {
            new class_25(this.field_2016).method_118();
        } catch (Exception e) {
            AllatoriLogger.method_681("Rerunning obfuscation due to un-renamed packages.");
            new class_25(this.field_2016).method_118();
        }
    }

    public class_540(class_606 class_606Var) {
        this.field_2016 = class_606Var;
        class_557.method_861(class_82.method_548());
        class_433.method_1620(Integer.toBinaryString(class_606Var.method_2107()).length());
    }

    public void method_1907() throws Exception {
        class_540 class_540Var;
        class_291 class_406Var;
        class_540 class_540Var2;
        Iterator method_2108 = this.field_2016.method_2108();
        while (true) {
            if (!method_2108.hasNext()) {
                class_540Var = this;
                break;
            }
            class_202 class_202Var = (class_202) method_2108.next();
            if (!class_202Var.method_546().startsWith("javax.microedition.")) {
                if (class_202Var.method_546().startsWith("android.")) {
                    class_544.method_1937().method_1687(true);
                    class_540Var = this;
                    break;
                }
            } else {
                class_544.method_1937().method_1688(true);
                class_540Var = this;
                break;
            }
        }
        class_540Var.method_1908();
        class_180 class_180Var = new class_180(this.field_2016);
        Iterator method_21082 = this.field_2016.method_2108();
        while (method_21082.hasNext()) {
            class_202 class_202Var2 = (class_202) method_21082.next();
            if (!class_544.method_1927().method_101(this.field_2016, class_202Var2)) {
                class_180Var.method_34(class_202Var2);
            }
        }
        method_1906();
        class_180Var.method_39();
        if (!this.field_2017) {
            class_406Var = new class_406(this.field_2016);
            class_540Var2 = this;
        } else {
            class_406Var = new class_567(this.field_2016);
            class_540Var2 = this;
        }
        Iterator method_21083 = class_540Var2.field_2016.method_2108();
        while (method_21083.hasNext()) {
            class_202 class_202Var3 = (class_202) method_21083.next();
            if (!class_544.method_1927().method_101(this.field_2016, class_202Var3)) {
                class_406Var.method_34(class_202Var3);
            }
        }
        class_406Var.method_39();
        method_1905();
        new class_362(this.field_2016).method_34(null);
    }
}
