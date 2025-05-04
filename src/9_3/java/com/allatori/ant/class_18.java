package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.interfaces.unmapped.*;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_18 extends class_418 implements class_263, class_603, class_570, class_194, class_601 {
    public class_18() {
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

    public class_18(int i) {
        super(ASMInterface.field_1353, i);
    }

    @Override // p000.class_539
    public void method_0(class_445 class_445Var) {
        class_445Var.method_490(this);
        class_445Var.method_476(this);
        class_445Var.method_474(this);
        class_445Var.method_486(this);
        class_445Var.method_493(this);
        class_445Var.method_494(this);
        class_445Var.method_349(this);
    }

    @Override // p000.class_570
    public Class[] method_43() {
        Class[] clsArr = new Class[class_282.field_990.length + 1];
        System.arraycopy(class_282.field_990, 0, clsArr, 0, class_282.field_990.length);
        clsArr[class_282.field_990.length] = NegativeArraySizeException.class;
        return clsArr;
    }
}
