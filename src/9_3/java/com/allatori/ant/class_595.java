package com.allatori.ant;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_595 implements Serializable {
    public Map field_2384 = new HashMap();

    public String[] method_643() {
        return (String[]) this.field_2384.keySet().toArray(new String[this.field_2384.keySet().size()]);
    }

    public void method_95(class_440 class_440Var) {
        this.field_2384.remove(class_440Var.method_546());
    }

    public class_440[] method_601() {
        Collection values = this.field_2384.values();
        class_440[] class_440VarArr = new class_440[values.size()];
        values.toArray(class_440VarArr);
        return class_440VarArr;
    }

    public boolean method_424() {
        return this.field_2384.isEmpty();
    }

    public boolean method_1636(class_440 class_440Var) {
        if (!this.field_2384.containsKey(class_440Var.method_546())) {
            this.field_2384.put(class_440Var.method_546(), class_440Var);
            return true;
        }
        return false;
    }
}
