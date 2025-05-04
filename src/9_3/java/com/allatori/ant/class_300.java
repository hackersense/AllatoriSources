package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.unmapped.*;

import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_300 extends class_418 implements class_263, class_603, class_570 {
    public short field_1086;

    public final short method_1304() {
        return this.field_1086;
    }

    @Override // p000.class_539
    public void method_0(class_445 class_445Var) {
        class_445Var.method_490(this);
        class_445Var.method_476(this);
        class_445Var.method_474(this);
        class_445Var.method_493(this);
        class_445Var.method_494(this);
        class_445Var.method_280(this);
    }

    public class_300(int i, short s) {
        super(ASMInterface.field_1390, i);
        if (s < 1) {
            throw new class_151(new StringBuilder().insert(0, "Invalid dimensions value: ").append((int) s).toString());
        }
        this.field_1086 = s;
        this.IIiiIIIIIi = (short) 4;
    }

    @Override // p000.class_418, p000.class_539
    public String method_406(boolean z) {
        return new StringBuilder().insert(0, super.method_406(z)).append(" ").append(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE).append(" ").append((int) this.field_1086).toString();
    }

    @Override // p000.class_418, p000.class_539
    public String method_189(class_499 class_499Var) {
        return new StringBuilder().insert(0, super.method_189(class_499Var)).append(" ").append((int) this.field_1086).toString();
    }

    public class_300() {
    }

    @Override // p000.class_570
    public Class[] method_43() {
        Class[] clsArr = new Class[class_282.field_990.length + 2];
        System.arraycopy(class_282.field_990, 0, clsArr, 0, class_282.field_990.length);
        clsArr[class_282.field_990.length + 1] = NegativeArraySizeException.class;
        clsArr[class_282.field_990.length] = IllegalAccessError.class;
        return clsArr;
    }

    @Override // p000.class_539, p000.class_194
    public int method_896(class_208 class_208Var) {
        return this.field_1086;
    }

    @Override // p000.class_418, p000.class_539
    public void method_200(class_346 class_346Var, boolean z) {
        super.method_200(class_346Var, z);
        this.field_1086 = class_346Var.readByte();
        this.IIiiIIIIIi = (short) 4;
    }

    @Override // p000.class_418, p000.class_539
    public void method_184(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.IIiIIIIiii);
        dataOutputStream.writeShort(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE);
        dataOutputStream.writeByte(this.field_1086);
    }

    @Override // p000.class_263
    public class_392 method_42(class_208 class_208Var) {
        class_212 method_32 = method_32(class_208Var);
        if (method_32 instanceof class_594) {
            method_32 = ((class_594) method_32).method_669();
        }
        if (method_32 instanceof class_392) {
            return (class_392) method_32;
        }
        return null;
    }
}
