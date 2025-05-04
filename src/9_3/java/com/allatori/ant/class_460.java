package com.allatori.ant;

import java.util.Vector;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_460 {
    public Vector field_1794 = new Vector();
    public int field_1795;

    public void method_1724(class_169 class_169Var) {
        this.field_1794.add(class_169Var);
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0003 */
    public int method_1725(class_606 class_606Var, class_202 class_202Var, class_557 class_557Var) {
        int i;
        while (true) {
            int i2 = i;
            if (i >= this.field_1794.size()) {
                return this.field_1795;
            }
            class_169 class_169Var = (class_169) this.field_1794.get(i2);
            i = (class_169Var.field_708.method_685(class_606Var, class_202Var) && (class_557Var == null || class_169Var.field_708.method_692(class_557Var))) ? 0 : i2 + 1;
            return class_169Var.field_709;
        }
    }

    public int method_1727() {
        return this.field_1794.size();
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0003 */
    public int method_1722(class_606 class_606Var, class_202 class_202Var, class_591 class_591Var) {
        int i;
        while (true) {
            int i2 = i;
            if (i >= this.field_1794.size()) {
                return this.field_1795;
            }
            class_169 class_169Var = (class_169) this.field_1794.get(i2);
            i = (class_169Var.field_708.method_685(class_606Var, class_202Var) && (class_591Var == null || class_169Var.field_708.method_686(class_591Var))) ? 0 : i2 + 1;
            return class_169Var.field_709;
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0003 */
    public int method_1726(class_606 class_606Var, class_202 class_202Var, class_261 class_261Var) {
        int i;
        while (true) {
            int i2 = i;
            if (i >= this.field_1794.size()) {
                return this.field_1795;
            }
            class_169 class_169Var = (class_169) this.field_1794.get(i2);
            i = (class_169Var.field_708.method_685(class_606Var, class_202Var) && (class_261Var == null || class_169Var.field_708.method_691(class_606Var, class_261Var))) ? 0 : i2 + 1;
            return class_169Var.field_709;
        }
    }

    public int method_1723(class_606 class_606Var, class_202 class_202Var) {
        return method_1722(class_606Var, class_202Var, (class_591) null);
    }

    public class_460(int i) {
        this.field_1795 = i;
    }
}
