package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.unmapped.class_282;
import com.allatori.interfaces.unmapped.class_445;

import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_483 extends class_459 {
    public int field_1939;

    @Override // p000.class_418, p000.class_539
    public void method_200(class_346 class_346Var, boolean z) {
        super.method_200(class_346Var, z);
        this.IIiiIIIIIi = (short) 5;
        this.field_1939 = class_346Var.readUnsignedByte();
        class_346Var.readByte();
    }

    public class_483(int i, int i2) {
        super(ASMInterface.field_1526, i);
        this.IIiiIIIIIi = (short) 5;
        if (i2 < 1) {
            throw new class_151(new StringBuilder().insert(0, "Number of arguments must be > 0 ").append(i2).toString());
        }
        this.field_1939 = i2;
    }

    @Override // p000.class_570
    public Class[] method_43() {
        Class[] clsArr = new Class[class_282.field_988.length + 4];
        System.arraycopy(class_282.field_988, 0, clsArr, 0, class_282.field_988.length);
        clsArr[class_282.field_988.length + 3] = IncompatibleClassChangeError.class;
        clsArr[class_282.field_988.length + 2] = IllegalAccessError.class;
        clsArr[class_282.field_988.length + 1] = AbstractMethodError.class;
        clsArr[class_282.field_988.length] = UnsatisfiedLinkError.class;
        return clsArr;
    }

    @Override // p000.class_459, p000.class_539, p000.class_194
    public int method_896(class_208 class_208Var) {
        return this.field_1939;
    }

    public int method_183() {
        return this.field_1939;
    }

    public class_483() {
    }

    @Override // p000.class_459, p000.class_418, p000.class_539
    public String method_189(class_499 class_499Var) {
        return new StringBuilder().insert(0, super.method_189(class_499Var)).append(" ").append(this.field_1939).toString();
    }

    @Override // p000.class_418, p000.class_539
    public void method_184(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.IIiIIIIiii);
        dataOutputStream.writeShort(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE);
        dataOutputStream.writeByte(this.field_1939);
        dataOutputStream.writeByte(0);
    }

    @Override // p000.class_539
    public void method_0(class_445 class_445Var) {
        class_445Var.method_474(this);
        class_445Var.method_493(this);
        class_445Var.method_472(this);
        class_445Var.method_486(this);
        class_445Var.method_490(this);
        class_445Var.method_494(this);
        class_445Var.method_477(this);
        class_445Var.method_497(this);
        class_445Var.method_330(this);
    }
}
