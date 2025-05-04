package com.allatori.ant;

import java.util.Comparator;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_510 implements Comparator {
    public final class_424 field_1978;

    public class_510(class_424 class_424Var) {
        this.field_1978 = class_424Var;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        boolean method_1108 = ((class_202) obj).method_1108();
        if (method_1108 == ((class_202) obj2).method_1108()) {
            return 0;
        }
        return method_1108 ? -1 : 1;
    }
}
