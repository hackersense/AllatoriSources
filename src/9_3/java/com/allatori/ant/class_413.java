package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.interfaces.unmapped.class_445;
import com.allatori.interfaces.unmapped.class_570;
import com.allatori.interfaces.unmapped.class_601;
import com.allatori.interfaces.unmapped.class_603;

import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_413 extends class_539 implements class_603, class_570, class_601 {
    public byte field_1276;

    public class_413(byte b) {
        super(ASMInterface.field_1620, (short) 2);
        this.field_1276 = b;
    }

    @Override // p000.class_539
    public void method_0(class_445 class_445Var) {
        class_445Var.method_476(this);
        class_445Var.method_474(this);
        class_445Var.method_486(this);
        class_445Var.method_306(this);
    }

    public final byte method_619() {
        return this.field_1276;
    }

    public class_413() {
    }

    public final class_212 method_669() {
        return new class_594(class_331.method_1384(this.field_1276), 1);
    }

    @Override // p000.class_570
    public Class[] method_43() {
        return new Class[]{NegativeArraySizeException.class};
    }

    public class_413(class_331 class_331Var) {
        this(class_331Var.method_619());
    }

    @Override // p000.class_539
    public void method_200(class_346 class_346Var, boolean z) {
        this.field_1276 = class_346Var.readByte();
        this.IIiiIIIIIi = (short) 2;
    }

    @Override // p000.class_539
    public String method_406(boolean z) {
        return new StringBuilder().insert(0, super.method_406(z)).append(" ").append(ASMInterface.field_1384[this.field_1276]).toString();
    }

    @Override // p000.class_539
    public void method_184(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.IIiIIIIiii);
        dataOutputStream.writeByte(this.field_1276);
    }
}
