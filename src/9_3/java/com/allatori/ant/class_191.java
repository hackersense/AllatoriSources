package com.allatori.ant;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_191 {
    public final class_544 field_744;
    public class_460 field_745 = new class_460(0);
    public class_460 field_743 = new class_460(0);

    public class_191(class_544 class_544Var) {
        this.field_744 = class_544Var;
    }

    public boolean method_895(class_606 class_606Var, class_202 class_202Var, class_261 class_261Var) {
        if (class_606Var == null) {
            return true;
        }
        return this.field_745.method_1727() != 0 && this.field_745.method_1726(class_606Var, class_202Var, class_261Var) > 0;
    }

    public void method_893(class_169 class_169Var) {
        this.field_743.method_1724(class_169Var);
    }

    public boolean method_892(class_606 class_606Var, class_202 class_202Var, class_557 class_557Var) {
        if (class_606Var == null) {
            return true;
        }
        return this.field_743.method_1727() == 0 ? class_557Var.method_424() : this.field_743.method_1725(class_606Var, class_202Var, class_557Var) > 0;
    }

    public void method_894(class_169 class_169Var) {
        this.field_745.method_1724(class_169Var);
    }
}
