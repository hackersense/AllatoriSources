package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_282;
import com.allatori.interfaces.unmapped.class_445;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_219 extends class_459 {
    @Override // p000.class_570
    public Class[] method_43() {
        Class[] clsArr = new Class[class_282.field_994.length + 4];
        System.arraycopy(class_282.field_994, 0, clsArr, 0, class_282.field_994.length);
        clsArr[class_282.field_994.length + 3] = UnsatisfiedLinkError.class;
        clsArr[class_282.field_994.length + 2] = AbstractMethodError.class;
        clsArr[class_282.field_994.length + 1] = IncompatibleClassChangeError.class;
        clsArr[class_282.field_994.length] = NullPointerException.class;
        return clsArr;
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
        class_445Var.method_314(this);
    }

    public class_219(int i) {
        super((short) 183, i);
    }

    public class_219() {
    }
}
