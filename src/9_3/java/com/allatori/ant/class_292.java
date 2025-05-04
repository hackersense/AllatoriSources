package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.interfaces.unmapped.class_373;
import com.allatori.interfaces.unmapped.class_445;

import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_292 extends class_502 implements class_373 {
    @Override // p000.class_272, p000.class_539
    public void method_184(DataOutputStream dataOutputStream) {
        this.IIiiIIIIIi = method_183();
        if (this.IIiIIIIiii == 167) {
            super.method_184(dataOutputStream);
            return;
        }
        this.IIiiIIIIIi = method_183();
        dataOutputStream.writeByte(this.IIiIIIIiii);
        dataOutputStream.writeInt(this.IIiiIIIIIi);
    }

    public class_292() {
    }

    @Override // p000.class_272
    public int method_49(int i, int i2) {
        int method_183 = method_183();
        this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE += i;
        if (Math.abs(method_183) >= 32767 - i2) {
            this.IIiIIIIiii = ASMInterface.field_1648;
            this.IIiiIIIIIi = (short) 5;
            return 2;
        }
        return 0;
    }

    @Override // p000.class_539
    public void method_0(class_445 class_445Var) {
        class_445Var.method_481(this);
        class_445Var.method_495(this);
        class_445Var.method_479(this);
        class_445Var.method_487(this);
        class_445Var.method_283(this);
    }

    public class_292(class_337 class_337Var) {
        super(ASMInterface.field_1492, class_337Var);
    }
}
