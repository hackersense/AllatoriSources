package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.interfaces.unmapped.*;

import java.io.DataOutputStream;
import java.util.StringTokenizer;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_336 extends class_503 implements class_570, class_194, class_601 {
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

    public class_336() {
    }

    public String method_620(class_208 class_208Var) {
        return method_621(class_208Var);
    }

    public class_212[] method_1388(class_208 class_208Var) {
        return class_212.method_1030(method_623(class_208Var));
    }

    public class_520 method_1390(class_208 class_208Var) {
        return (class_520) class_208Var.method_502().method_982(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE);
    }

    @Override // p000.class_418, p000.class_97
    public class_212 method_32(class_208 class_208Var) {
        return method_1085(class_208Var);
    }

    @Override // p000.class_503
    public class_538 method_1389(class_208 class_208Var) {
        return (class_538) class_208Var.method_502().method_982(method_1390(class_208Var).method_433());
    }

    @Override // p000.class_539, p000.class_194
    public int method_896(class_208 class_208Var) {
        return class_212.method_1005(method_623(class_208Var));
    }

    @Override // p000.class_418, p000.class_539
    public void method_200(class_346 class_346Var, boolean z) {
        super.method_200(class_346Var, z);
        this.IIiiIIIIIi = (short) 5;
        class_346Var.readUnsignedShort();
    }

    @Override // p000.class_539, p000.class_601
    public int method_1387(class_208 class_208Var) {
        return class_212.method_1010(method_623(class_208Var));
    }

    public class_336(short s, int i) {
        super(s, i);
    }

    @Override // p000.class_539
    public void method_0(class_445 class_445Var) {
        class_445Var.method_474(this);
        class_445Var.method_493(this);
        class_445Var.method_472(this);
        class_445Var.method_486(this);
        class_445Var.method_494(this);
    }

    @Override // p000.class_418, p000.class_539
    public void method_184(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.IIiIIIIiii);
        dataOutputStream.writeShort(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
    }

    @Override // p000.class_418, p000.class_539
    public String method_189(class_499 class_499Var) {
        StringTokenizer stringTokenizer = new StringTokenizer(class_499Var.method_1847(class_499Var.method_982(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE)));
        return new StringBuilder().insert(0, ASMInterface.field_1554[this.IIiIIIIiii]).append(" ").append(stringTokenizer.nextToken().replace('.', '/')).append(stringTokenizer.nextToken()).toString();
    }

    public class_212 method_1085(class_208 class_208Var) {
        return class_212.method_1033(method_623(class_208Var));
    }
}
