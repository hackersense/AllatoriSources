package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.commons.ASMStuffs;
import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.unmapped.class_445;

import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_67 extends class_508 {
    public boolean field_248;
    public int field_249;

    public class_67(int i, int i2) {
        this.IIiIIIIiii = ASMInterface.field_1449;
        this.IIiiIIIIIi = (short) 3;
        method_46(i);
        method_407(i2);
    }

    @Override // p000.class_508, p000.class_97
    public class_212 method_32(class_208 class_208Var) {
        return class_212.field_802;
    }

    public final int method_183() {
        return this.field_249;
    }

    @Override // p000.class_508, p000.class_539
    public String method_406(boolean z) {
        return new StringBuilder().insert(0, super.method_406(z)).append(" ").append(this.field_249).toString();
    }

    public final void method_407(int i) {
        this.field_249 = i;
        method_401();
    }

    public final void method_401() {
        this.field_248 = this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE > 255 || Math.abs(this.field_249) > 127;
        if (!this.field_248) {
            this.IIiiIIIIIi = (short) 3;
        } else {
            this.IIiiIIIIIi = (short) 6;
        }
    }

    @Override // p000.class_508, p000.class_539
    public void method_200(class_346 class_346Var, boolean z) {
        this.field_248 = z;
        if (!z) {
            this.IIiiIIIIIi = (short) 3;
            this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE = class_346Var.readUnsignedByte();
            this.field_249 = class_346Var.readByte();
        } else {
            this.IIiiIIIIIi = (short) 6;
            this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE = class_346Var.readUnsignedShort();
            this.field_249 = class_346Var.readShort();
        }
    }

    @Override // p000.class_508, p000.class_494
    public final void method_46(int i) {
        if (i < 0) {
            throw new class_151(new StringBuilder().insert(0, "Negative index value: ").append(i).toString());
        }
        this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE = i;
        method_401();
    }

    public class_67() {
    }

    @Override // p000.class_539
    public void method_0(class_445 class_445Var) {
        class_445Var.method_492(this);
        class_445Var.method_315(this);
    }

    @Override // p000.class_508, p000.class_539
    public void method_184(DataOutputStream dataOutputStream) {
        if (this.field_248) {
            dataOutputStream.writeByte(ASMStuffs.field_79);
        }
        dataOutputStream.writeByte(this.IIiIIIIiii);
        if (!this.field_248) {
            dataOutputStream.writeByte(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE);
            dataOutputStream.writeByte(this.field_249);
        } else {
            dataOutputStream.writeShort(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE);
            dataOutputStream.writeShort(this.field_249);
        }
    }
}
