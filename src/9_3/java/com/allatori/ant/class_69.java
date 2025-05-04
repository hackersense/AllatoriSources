package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_445;
import com.allatori.interfaces.unmapped.class_552;

import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_69 extends class_539 implements class_552 {
    public short field_250;

    @Override // p000.class_552
    public Number method_238() {
        return new Integer(this.field_250);
    }

    @Override // p000.class_539
    public void method_0(class_445 class_445Var) {
        class_445Var.method_467(this);
        class_445Var.method_486(this);
        class_445Var.method_493(this);
        class_445Var.method_484(this);
        class_445Var.method_332(this);
    }

    @Override // p000.class_539
    public void method_184(DataOutputStream dataOutputStream) {
        super.method_184(dataOutputStream);
        dataOutputStream.writeShort(this.field_250);
    }

    @Override // p000.class_97
    public class_212 method_32(class_208 class_208Var) {
        return class_212.field_801;
    }

    @Override // p000.class_539
    public String method_406(boolean z) {
        return new StringBuilder().insert(0, super.method_406(z)).append(" ").append((int) this.field_250).toString();
    }

    public class_69() {
    }

    public class_69(short s) {
        super((short) 17, (short) 3);
        this.field_250 = s;
    }

    @Override // p000.class_539
    public void method_200(class_346 class_346Var, boolean z) {
        this.IIiiIIIIIi = (short) 3;
        this.field_250 = class_346Var.readShort();
    }
}
