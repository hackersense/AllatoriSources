package com.allatori.ant;

import java.util.Comparator;

public class class_415 implements Comparator {
    public final int field_1279;
    public final class_180 field_1280;

    public class_415(class_180 class_180Var, int i) {
        this.field_1280 = class_180Var;
        this.field_1279 = i;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return method_1576((class_261) obj, (class_261) obj2);
    }

    public int method_1576(class_261 class_261Var, class_261 class_261Var2) {
        int i = this.field_1279;
        class_544.method_1937();
        if (i != 100) {
            return class_261Var.method_464().compareTo(class_261Var2.method_464());
        }
        return class_261Var2.method_464().compareTo(class_261Var.method_464());
    }
}
