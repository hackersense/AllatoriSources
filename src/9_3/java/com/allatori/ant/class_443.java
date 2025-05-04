package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_290;
import com.allatori.interfaces.unmapped.class_494;
import com.allatori.interfaces.unmapped.class_552;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_443 implements class_290 {
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: class_539 */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: class_539 */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.class_290
    public boolean method_1289(class_539 class_539Var, class_539 class_539Var2) {
        if (class_539Var.field_2014 != class_539Var2.field_2014) {
            return false;
        }
        if (!(class_539Var instanceof class_450)) {
            if (class_539Var instanceof class_272) {
                return ((class_272) class_539Var).field_940 == ((class_272) class_539Var2).field_940;
            }
            if (class_539Var instanceof class_552) {
                return ((class_552) class_539Var).method_238().equals(((class_552) class_539Var2).method_238());
            }
            return class_539Var instanceof class_494 ? ((class_494) class_539Var).method_47() == ((class_494) class_539Var2).method_47() : !(class_539Var instanceof class_413) || ((class_413) class_539Var).method_619() == ((class_413) class_539Var2).method_619();
        }
        class_337[] method_446 = ((class_450) class_539Var).method_446();
        class_337[] method_4462 = ((class_450) class_539Var2).method_446();
        if (method_446.length != method_4462.length) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        while (i < method_446.length) {
            if (method_446[i2] != method_4462[i2]) {
                return false;
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        return true;
    }
}
