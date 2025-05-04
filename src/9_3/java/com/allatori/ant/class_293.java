package com.allatori.ant;

import java.util.Hashtable;
import java.util.Stack;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_293 {
    public Stack field_1033 = new Stack();
    public Hashtable field_1034 = new Hashtable();

    public class_98 method_1290() {
        if (this.field_1033.empty()) {
            return null;
        }
        return (class_98) this.field_1033.pop();
    }

    public final class_98 method_1291(class_337 class_337Var, int i) {
        class_98 class_98Var = new class_98(class_337Var, i);
        this.field_1034.put(class_337Var, class_98Var);
        return class_98Var;
    }

    public void method_1293(class_337 class_337Var, int i) {
        if (!method_1292(class_337Var)) {
            this.field_1033.push(method_1291(class_337Var, i));
        }
    }

    public final boolean method_1292(class_337 class_337Var) {
        return this.field_1034.get(class_337Var) != null;
    }
}
