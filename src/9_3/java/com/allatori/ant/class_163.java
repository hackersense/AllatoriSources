package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_124;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_163 implements class_124 {
    public class_124 field_696;
    public String field_697;

    @Override // p000.class_124
    public String method_178() {
        return new StringBuilder().insert(0, this.field_697).append(this.field_696.method_178()).toString();
    }

    public class_163(String str, class_124 class_124Var) {
        this.field_696 = class_124Var;
        this.field_697 = str;
    }

    @Override // p000.class_124
    public void method_177() {
        this.field_696.method_177();
    }
}
