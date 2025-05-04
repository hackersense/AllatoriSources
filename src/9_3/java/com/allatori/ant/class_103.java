package com.allatori.ant;

import java.util.Comparator;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_103 implements Comparator {
    public final class_180 field_515;
    public final int field_516;

    public int method_605(class_557 class_557Var, class_557 class_557Var2) {
        int i = this.field_516;
        class_544.method_1937();
        if (i != 100) {
            return class_557Var.method_464().compareTo(class_557Var2.method_464());
        }
        return class_557Var2.method_464().compareTo(class_557Var.method_464());
    }

    public class_103(class_180 class_180Var, int i) {
        this.field_515 = class_180Var;
        this.field_516 = i;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return method_605((class_557) obj, (class_557) obj2);
    }
}
