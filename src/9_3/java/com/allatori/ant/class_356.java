package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_356 extends class_592 implements ASMInterface {
    public class_392 field_1157;

    public class_392 method_646() {
        return this.field_1157;
    }

    @Override // p000.class_212
    public int hashCode() {
        return this.field_1157.hashCode();
    }

    public class_356(class_392 class_392Var) {
        super((byte) 15, new StringBuilder().insert(0, "<UNINITIALIZED OBJECT OF TYPE '").append(class_392Var.method_464()).append("'>").toString());
        this.field_1157 = class_392Var;
    }

    @Override // p000.class_212
    public boolean equals(Object obj) {
        if (obj instanceof class_356) {
            return this.field_1157.equals(((class_356) obj).field_1157);
        }
        return false;
    }
}
