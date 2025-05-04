package com.allatori.ant;

import java.util.Iterator;
import java.util.Vector;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_341 {
    public boolean field_1124 = false;
    public Vector field_1125 = new Vector();
    public final class_544 field_1126;

    public boolean method_1402() {
        return this.field_1124;
    }

    public class_341(class_544 class_544Var) {
        this.field_1126 = class_544Var;
    }

    public void method_1400(class_169 class_169Var, String str) {
        this.field_1124 = true;
        this.field_1125.add(new class_388(this, class_169Var, str.replaceAll("\\.", "\\\\.").replaceAll("\\*", ".*")));
    }

    public boolean method_1401(class_606 class_606Var, class_202 class_202Var, String str) {
        if (class_606Var == null || class_202Var == null || str == null) {
            return false;
        }
        if (this.field_1125.size() == 0) {
            return false;
        }
        Iterator it = this.field_1125.iterator();
        while (it.hasNext()) {
            class_388 class_388Var = (class_388) it.next();
            if (class_388Var.field_1239.field_708.method_685(class_606Var, class_202Var) && str.matches(class_388Var.field_1240)) {
                return true;
            }
        }
        return false;
    }
}
