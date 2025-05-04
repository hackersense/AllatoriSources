package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.unmapped.class_494;
import com.allatori.interfaces.unmapped.class_97;

import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_418 extends class_539 implements class_97, class_494 {
    public int field_1284;

    @Override // p000.class_539
    public String method_406(boolean z) {
        return new StringBuilder().insert(0, super.method_406(z)).append(" ").append(this.field_1284).toString();
    }

    public class_418() {
    }

    @Override // p000.class_539
    public void method_184(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.IIiIIIIiii);
        dataOutputStream.writeShort(this.field_1284);
    }

    @Override // p000.class_494
    public void method_46(int i) {
        if (i >= 0) {
            this.field_1284 = i;
            return;
        }
        throw new class_151(new StringBuilder().insert(0, "Negative index value: ").append(i).toString());
    }

    @Override // p000.class_494
    public final int method_47() {
        return this.field_1284;
    }

    @Override // p000.class_539
    public String method_189(class_499 class_499Var) {
        class_286 method_982 = class_499Var.method_982(this.field_1284);
        String method_1847 = class_499Var.method_1847(method_982);
        if (method_982 instanceof class_43) {
            method_1847 = method_1847.replace('.', '/');
        }
        return new StringBuilder().insert(0, ASMInterface.field_1554[this.IIiIIIIiii]).append(" ").append(method_1847).toString();
    }

    public class_212 method_32(class_208 class_208Var) {
        String method_1845 = class_208Var.method_502().method_1845(this.field_1284, (byte) 7);
        if (!method_1845.startsWith("[")) {
            method_1845 = new StringBuilder().insert(0, "L").append(method_1845).append(";").toString();
        }
        return class_212.method_1034(method_1845);
    }

    public class_418(short s, int i) {
        super(s, (short) 3);
        method_46(i);
    }

    @Override // p000.class_539
    public void method_200(class_346 class_346Var, boolean z) {
        method_46(class_346Var.readUnsignedShort());
        this.IIiiIIIIIi = (short) 3;
    }
}
