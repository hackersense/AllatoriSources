package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_124;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_347 implements class_124 {
    public int field_1128 = 0;
    public String field_1129;
    public class_124 field_1130;

    @Override // p000.class_124
    public void method_177() {
        this.field_1128 = 0;
        this.field_1130.method_177();
    }

    public class_347(String str, class_124 class_124Var) {
        this.field_1129 = str;
        this.field_1130 = class_124Var;
    }

    @Override // p000.class_124
    public String method_178() {
        int i = this.field_1128;
        this.field_1128 = i + 1;
        return i == 0 ? this.field_1129 : this.field_1130.method_178();
    }
}
