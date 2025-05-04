package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;
import com.allatori.interfaces.unmapped.class_449;

import java.io.DataInputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_261 extends class_409 {
    public static class_449 field_906 = new class_100();

    public class_261(int i, int i2, int i3, class_160[] class_160VarArr, class_499 class_499Var) {
        super(i, i2, i3, class_160VarArr, class_499Var);
    }

    public final class_261 method_1145(class_499 class_499Var) {
        return (class_261) method_1562(class_499Var);
    }

    public class_261(class_261 class_261Var) {
        super(class_261Var);
    }

    public boolean equals(Object obj) {
        return field_906.method_161(this, obj);
    }

    public class_212 method_669() {
        return class_212.method_1033(method_546());
    }

    public static void method_861(class_449 class_449Var) {
        field_906 = class_449Var;
    }

    public int hashCode() {
        return field_906.method_162(this);
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0003 */
    public final class_257 method_1146() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i >= this.iIIiIiiIII) {
                return null;
            }
            if (this.iIiiiiIiII[i2].method_619() != 1) {
                i = i2 + 1;
            } else {
                return (class_257) this.iIiiiiIiII[i2];
            }
        }
    }

    public class_261(DataInputStream dataInputStream, class_499 class_499Var) {
        super(dataInputStream, class_499Var);
    }

    public static class_449 method_859() {
        return field_906;
    }

    @Override // p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_71(this);
    }
}
