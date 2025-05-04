package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;
import com.allatori.interfaces.unmapped.class_449;

import java.io.DataInputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_557 extends class_409 {
    public static class_449 field_2319 = new class_186();

    public int hashCode() {
        return field_2319.method_162(this);
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0003 */
    public final class_224 method_1963() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i >= this.field_899) {
                return null;
            }
            if (this.field_1262[i2] instanceof class_224) {
                return (class_224) this.iIiiiiIiII[i2];
            }
            i = i2 + 1;
        }
    }

    public class_557(DataInputStream dataInputStream, class_499 class_499Var) {
        super(dataInputStream, class_499Var);
    }

    public final class_40 method_1965() {
        class_576 method_1962 = method_1962();
        if (method_1962 != null) {
            return method_1962.method_1965();
        }
        return null;
    }

    public class_557(class_557 class_557Var) {
        super(class_557Var);
    }

    @Override // p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_62(this);
    }

    public class_557() {
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0003 */
    public final class_576 method_1962() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i >= this.iIIiIiiIII) {
                return null;
            }
            if (!(this.iIiiiiIiII[i2] instanceof class_576)) {
                i = i2 + 1;
            } else {
                return (class_576) this.iIiiiiIiII[i2];
            }
        }
    }

    public class_212[] method_1964() {
        return class_212.method_1030(method_546());
    }

    public final class_332 method_1966() {
        class_576 method_1962 = method_1962();
        if (method_1962 == null) {
            return null;
        }
        return method_1962.method_1966();
    }

    public class_557(int i, int i2, int i3, class_160[] class_160VarArr, class_499 class_499Var) {
        super(i, i2, i3, class_160VarArr, class_499Var);
    }

    public static void method_861(class_449 class_449Var) {
        field_2319 = class_449Var;
    }

    public static class_449 method_859() {
        return field_2319;
    }

    public boolean equals(Object obj) {
        return field_2319.method_161(this, obj);
    }

    public final class_557 method_1961(class_499 class_499Var) {
        return (class_557) method_1562(class_499Var);
    }

    public class_212 method_669() {
        return class_212.method_1033(method_546());
    }
}
