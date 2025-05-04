package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.interfaces.unmapped.class_445;

import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_432 extends class_502 {
    @Override // p000.class_272, p000.class_539
    public void method_184(DataOutputStream dataOutputStream) {
        this.IIiiIIIIIi = method_183();
        dataOutputStream.writeByte(this.IIiIIIIiii);
        dataOutputStream.writeInt(this.IIiiIIIIIi);
    }

    public class_432() {
    }

    @Override // p000.class_539
    public void method_0(class_445 class_445Var) {
        class_445Var.method_495(this);
        class_445Var.method_479(this);
        class_445Var.method_487(this);
        class_445Var.method_359(this);
    }

    public class_432(class_337 class_337Var) {
        super(ASMInterface.field_1648, class_337Var);
        this.IIiiIIIIIi = (short) 5;
    }

    @Override // p000.class_272, p000.class_539
    public void method_200(class_346 class_346Var, boolean z) {
        this.IIiiIIIIIi = class_346Var.readInt();
        this.IIiiIIIIIi = (short) 5;
    }
}
