package com.allatori.ant;

import java.util.Iterator;
import java.util.Vector;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_23 {
    public final class_544 field_42;
    public Vector field_41 = new Vector();
    public boolean field_40 = false;

    public boolean method_101(class_606 class_606Var, class_202 class_202Var) {
        if (!this.field_40) {
            return false;
        }
        Iterator it = this.field_41.iterator();
        while (it.hasNext()) {
            class_145 class_145Var = (class_145) it.next();
            if (class_145Var.method_685(class_606Var, class_202Var)) {
                return !class_145Var.method_695();
            }
        }
        return false;
    }

    public void method_102(class_145 class_145Var) {
        this.field_41.add(class_145Var);
        this.field_40 = true;
    }

    public class_23(class_544 class_544Var) {
        this.field_42 = class_544Var;
    }
}
