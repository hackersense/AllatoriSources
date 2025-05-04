package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_124;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_37 implements class_124 {
    public String[] field_67;
    public class_149 field_69 = new class_149();
    public int field_68 = 0;

    @Override // p000.class_124
    public String method_178() {
        if (this.field_68 >= this.field_67.length) {
            return this.field_69.method_178();
        }
        String[] strArr = this.field_67;
        int i = this.field_68;
        this.field_68 = i + 1;
        return strArr[i];
    }

    public class_37(String[] strArr) {
        this.field_67 = strArr;
    }

    @Override // p000.class_124
    public void method_177() {
        this.field_68 = 0;
        this.field_69.method_177();
    }
}
