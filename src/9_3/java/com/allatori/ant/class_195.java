package com.allatori.ant;

import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_195 extends class_130 {
    public class_78 field_748;

    public class_78 method_897() {
        return this.field_748;
    }

    @Override // p000.class_130
    public String method_639() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.field_748.toString());
        return stringBuffer.toString();
    }

    @Override // p000.class_130
    public void method_641(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.iIiiIiIiII);
        this.field_748.method_184(dataOutputStream);
    }

    public class_195(int i, class_78 class_78Var, class_499 class_499Var) {
        super(i, class_499Var);
        if (i == 64) {
            this.field_748 = class_78Var;
            return;
        }
        throw new RuntimeException("Only element values of type annotation can be built with this ctor");
    }
}
