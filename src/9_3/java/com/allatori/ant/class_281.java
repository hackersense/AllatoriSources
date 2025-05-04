package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_445;
import com.allatori.interfaces.unmapped.class_552;

import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_281 extends class_539 implements class_552 {
    public byte field_987;

    @Override // p000.class_552
    public Number method_238() {
        return new Integer(this.field_987);
    }

    public class_281(byte b) {
        super((short) 16, (short) 2);
        this.field_987 = b;
    }

    @Override // p000.class_539
    public String method_406(boolean z) {
        return new StringBuilder().insert(0, super.method_406(z)).append(" ").append((int) this.field_987).toString();
    }

    @Override // p000.class_539
    public void method_184(DataOutputStream dataOutputStream) {
        super.method_184(dataOutputStream);
        dataOutputStream.writeByte(this.field_987);
    }

    @Override // p000.class_539
    public void method_200(class_346 class_346Var, boolean z) {
        this.IIiiIIIIIi = (short) 2;
        this.field_987 = class_346Var.readByte();
    }

    public class_281() {
    }

    @Override // p000.class_539
    public void method_0(class_445 class_445Var) {
        class_445Var.method_467(this);
        class_445Var.method_486(this);
        class_445Var.method_493(this);
        class_445Var.method_484(this);
        class_445Var.method_278(this);
    }

    @Override // p000.class_97
    public class_212 method_32(class_208 class_208Var) {
        return class_212.field_795;
    }
}
