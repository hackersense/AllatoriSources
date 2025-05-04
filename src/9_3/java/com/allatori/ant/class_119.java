package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_263;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_119 extends class_418 implements class_263 {
    public String method_623(class_208 class_208Var) {
        class_499 method_502 = class_208Var.method_502();
        String method_1845 = method_502.method_1845(((class_456) method_502.method_982(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE)).method_47(), (byte) 7);
        if (!method_1845.startsWith("[")) {
            return method_1845.replace('/', '.');
        }
        return "java.lang.Object";
    }

    @Override // p000.class_263
    public class_392 method_42(class_208 class_208Var) {
        return method_622(class_208Var);
    }

    public class_392 method_622(class_208 class_208Var) {
        return new class_392(method_623(class_208Var));
    }

    public class_592 method_624(class_208 class_208Var) {
        class_499 method_502 = class_208Var.method_502();
        String method_1845 = method_502.method_1845(((class_456) method_502.method_982(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE)).method_47(), (byte) 7);
        if (method_1845.startsWith("[")) {
            return (class_594) class_212.method_1034(method_1845);
        }
        return new class_392(method_1845.replace('/', '.'));
    }

    public class_119() {
    }

    public String method_621(class_208 class_208Var) {
        class_499 method_502 = class_208Var.method_502();
        return ((class_371) method_502.method_982(((class_538) method_502.method_982(((class_456) method_502.method_982(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE)).method_433())).method_433())).method_198();
    }

    public String method_620(class_208 class_208Var) {
        class_499 method_502 = class_208Var.method_502();
        return ((class_371) method_502.method_982(((class_538) method_502.method_982(((class_456) method_502.method_982(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE)).method_433())).method_47())).method_198();
    }

    public class_119(short s, int i) {
        super(s, i);
    }
}
