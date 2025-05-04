package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_216;

import java.util.HashMap;
import java.util.Map;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_429 {
    public final class_506 field_1683;
    public final class_229 field_1684;
    public Map field_1685 = new HashMap();

    public boolean method_1612(class_337 class_337Var) {
        return this.field_1683.method_1863(class_337Var) == null;
    }

    public class_216[] method_1616() {
        return (class_216[]) this.field_1685.values().toArray(new class_216[this.field_1685.values().size()]);
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0023 */
    public class_429(class_591 class_591Var) {
        this.field_1683 = new class_506(class_591Var);
        this.field_1684 = new class_229(class_591Var);
        class_337[] method_446 = class_591Var.method_438().method_446();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i < method_446.length) {
                i = i2 + 1;
                this.field_1685.put(method_446[i2], new class_382(this, method_446[i2]));
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public class_216 method_1614(class_337 class_337Var) {
        class_216 class_216Var = (class_216) this.field_1685.get(class_337Var);
        if (class_216Var == null) {
            throw new class_572("InstructionContext requested for an InstructionHandle that's not known!");
        }
        return class_216Var;
    }

    public static class_229 method_1611(class_429 class_429Var) {
        return class_429Var.field_1684;
    }

    public static class_506 method_1615(class_429 class_429Var) {
        return class_429Var.field_1683;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0006 */
    public class_216[] method_1613(class_337[] class_337VarArr) {
        class_216[] class_216VarArr = new class_216[class_337VarArr.length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i < class_337VarArr.length) {
                i = i2 + 1;
                class_216VarArr[i2] = method_1614(class_337VarArr[i2]);
            } else {
                return class_216VarArr;
            }
        }
    }
}
