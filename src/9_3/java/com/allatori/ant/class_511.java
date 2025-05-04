package com.allatori.ant;

import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_511 extends class_476 {
    public class_574 field_1979;

    public class_574 method_1864() {
        return this.field_1979;
    }

    @Override // p000.class_476
    public String method_554() {
        throw new RuntimeException("Not implemented yet");
    }

    public class_511(class_574 class_574Var, class_208 class_208Var) {
        super(64, class_208Var);
        this.field_1979 = class_574Var;
    }

    public class_511(class_195 class_195Var, class_208 class_208Var, boolean z) {
        super(64, class_208Var);
        this.field_1979 = new class_574(class_195Var.method_897(), class_208Var, z);
    }

    public class_511(int i, class_574 class_574Var, class_208 class_208Var) {
        super(i, class_208Var);
        if (i != 64) {
            throw new RuntimeException("Only element values of type annotation can be built with this ctor");
        }
        this.field_1979 = class_574Var;
    }

    @Override // p000.class_476
    public class_130 method_553() {
        return new class_195(this.iIiIiiiiIi, this.field_1979.method_2018(), this.IIiIIIIiii.method_502());
    }

    @Override // p000.class_476
    public void method_552(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.iIiIiiiiIi);
        this.field_1979.method_2017(dataOutputStream);
    }
}
