package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.commons.ASMStuffs;
import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.unmapped.class_445;
import com.allatori.interfaces.unmapped.class_494;
import com.allatori.interfaces.unmapped.class_97;

import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_398 extends class_539 implements class_494, class_97 {
    public boolean field_1248;
    public int field_1249;

    @Override // p000.class_539
    public void method_200(class_346 class_346Var, boolean z) {
        this.field_1248 = z;
        if (!z) {
            this.field_1249 = class_346Var.readUnsignedByte();
            this.IIiiIIIIIi = (short) 2;
        } else {
            this.field_1249 = class_346Var.readUnsignedShort();
            this.IIiiIIIIIi = (short) 4;
        }
    }

    public final void method_401() {
        this.field_1248 = this.field_1249 > 255;
        if (!this.field_1248) {
            this.IIiiIIIIIi = (short) 2;
        } else {
            this.IIiiIIIIIi = (short) 4;
        }
    }

    public class_398(int i) {
        super(ASMInterface.field_1609, (short) 2);
        method_46(i);
    }

    @Override // p000.class_97
    public class_212 method_32(class_208 class_208Var) {
        return class_211.field_793;
    }

    @Override // p000.class_539
    public void method_0(class_445 class_445Var) {
        class_445Var.method_362(this);
    }

    @Override // p000.class_494
    public final int method_47() {
        return this.field_1249;
    }

    @Override // p000.class_539
    public void method_184(DataOutputStream dataOutputStream) {
        if (this.field_1248) {
            dataOutputStream.writeByte(ASMStuffs.field_79);
        }
        dataOutputStream.writeByte(this.IIiIIIIiii);
        if (!this.field_1248) {
            dataOutputStream.writeByte(this.field_1249);
        } else {
            dataOutputStream.writeShort(this.field_1249);
        }
    }

    @Override // p000.class_539
    public String method_406(boolean z) {
        return new StringBuilder().insert(0, super.method_406(z)).append(" ").append(this.field_1249).toString();
    }

    public class_398() {
    }

    @Override // p000.class_494
    public final void method_46(int i) {
        if (i < 0) {
            throw new class_151(new StringBuilder().insert(0, "Negative index value: ").append(i).toString());
        }
        this.field_1249 = i;
        method_401();
    }
}
