package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.interfaces.unmapped.*;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_343 extends class_418 implements class_263, class_603, class_570, class_601 {
    public class_343() {
    }

    @Override // p000.class_539
    public void method_0(class_445 class_445Var) {
        class_445Var.method_490(this);
        class_445Var.method_476(this);
        class_445Var.method_474(this);
        class_445Var.method_486(this);
        class_445Var.method_493(this);
        class_445Var.method_494(this);
        class_445Var.method_342(this);
    }

    public class_343(int i) {
        super(ASMInterface.field_1615, i);
    }

    @Override // p000.class_263
    public class_392 method_42(class_208 class_208Var) {
        return (class_392) method_32(class_208Var);
    }

    @Override // p000.class_570
    public Class[] method_43() {
        Class[] clsArr = new Class[class_282.field_990.length + 2];
        System.arraycopy(class_282.field_990, 0, clsArr, 0, class_282.field_990.length);
        clsArr[class_282.field_990.length + 1] = InstantiationError.class;
        clsArr[class_282.field_990.length] = IllegalAccessError.class;
        return clsArr;
    }
}
