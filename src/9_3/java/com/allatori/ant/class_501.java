package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.interfaces.unmapped.*;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_501 extends class_239 implements class_570, class_194, class_601 {
    @Override // p000.class_539, p000.class_601
    public int method_1387(class_208 class_208Var) {
        return method_1084(class_208Var);
    }

    public class_501() {
    }

    @Override // p000.class_570
    public Class[] method_43() {
        Class[] clsArr = new Class[class_282.field_994.length + 2];
        System.arraycopy(class_282.field_994, 0, clsArr, 0, class_282.field_994.length);
        clsArr[class_282.field_994.length + 1] = IncompatibleClassChangeError.class;
        clsArr[class_282.field_994.length] = NullPointerException.class;
        return clsArr;
    }

    public class_501(int i) {
        super(ASMInterface.field_1467, i);
    }

    @Override // p000.class_539
    public void method_0(class_445 class_445Var) {
        class_445Var.method_474(this);
        class_445Var.method_472(this);
        class_445Var.method_486(this);
        class_445Var.method_493(this);
        class_445Var.method_490(this);
        class_445Var.method_494(this);
        class_445Var.method_477(this);
        class_445Var.method_496(this);
        class_445Var.method_341(this);
    }
}
