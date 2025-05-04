package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_124;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_533 implements class_124 {
    public long field_2009 = 0;
    public String field_2010;

    @Override // p000.class_124
    public String method_178() {
        StringBuilder insert = new StringBuilder().insert(0, this.field_2010);
        long j = this.field_2009;
        this.field_2009 = 1 + j;
        return insert.append(j).toString();
    }

    public class_533(String str) {
        this.field_2010 = str;
    }

    @Override // p000.class_124
    public void method_177() {
        this.field_2009 = 0L;
    }
}
