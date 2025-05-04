package com.allatori.ant;

import java.util.Vector;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_278 {
    public Vector field_957;
    public class_145 field_958;
    public final class_363 field_959;

    public void method_1224(class_102 class_102Var) {
        this.field_958.method_689(class_102Var);
    }

    public void method_1218(class_269 class_269Var) {
        this.field_958.method_694(class_269Var);
    }

    public class_278(class_363 class_363Var, class_280 class_280Var) {
        this(class_363Var);
    }

    public boolean method_1223(class_606 class_606Var, class_202 class_202Var, class_261 class_261Var) {
        if (method_1220(class_606Var, class_202Var, class_261Var)) {
            return true;
        }
        if (class_363.method_1487(this.field_959)) {
            return false;
        }
        class_78[] method_1560 = class_261Var.method_1560();
        int i = 0;
        int i2 = 0;
        while (i < method_1560.length) {
            class_78 class_78Var = method_1560[i2];
            if ("Lcom/allatori/annotations/Rename;".equals(class_78Var.method_198())) {
                return true;
            }
            if ("Lcom/allatori/annotations/DoNotRename;".equals(class_78Var.method_198())) {
                return false;
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.field_957.size()) {
            class_145 class_145Var = (class_145) this.field_957.get(i5);
            if (class_145Var.method_684() && class_145Var.method_685(class_606Var, class_202Var) && class_145Var.method_691(class_606Var, class_261Var)) {
                return false;
            }
            if (class_145Var.method_695() && class_145Var.method_685(class_606Var, class_202Var)) {
                return true;
            }
            int i6 = i5 + 1;
            i4 = i6;
            i5 = i6;
        }
        return (this.field_958.method_684() && this.field_958.method_691(class_606Var, class_261Var)) ? false : true;
    }

    public class_278(class_363 class_363Var) {
        this.field_959 = class_363Var;
        this.field_957 = new Vector();
        try {
            this.field_958 = new class_145("class *", true, false);
            class_145 class_145Var = new class_145("class * extends java.lang.Enum", true, false);
            class_145Var.method_694(new class_269("values(**)", false));
            class_145Var.method_694(new class_269("valueOf(**)", false));
            method_1219(class_145Var);
            method_1219(new class_145("interface *.package-info", false, false));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public boolean method_1225(class_606 class_606Var, class_202 class_202Var, class_557 class_557Var) {
        if (method_1217(class_606Var, class_202Var, class_557Var)) {
            return true;
        }
        if (class_363.method_1487(this.field_959)) {
            return false;
        }
        class_78[] method_1560 = class_557Var.method_1560();
        int i = 0;
        int i2 = 0;
        while (i < method_1560.length) {
            class_78 class_78Var = method_1560[i2];
            if ("Lcom/allatori/annotations/Rename;".equals(class_78Var.method_198())) {
                return true;
            }
            if ("Lcom/allatori/annotations/DoNotRename;".equals(class_78Var.method_198())) {
                return false;
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.field_957.size()) {
            class_145 class_145Var = (class_145) this.field_957.get(i5);
            if (class_145Var.method_693() && class_145Var.method_685(class_606Var, class_202Var) && class_145Var.method_692(class_557Var)) {
                return false;
            }
            if (class_145Var.method_695() && class_145Var.method_685(class_606Var, class_202Var)) {
                return true;
            }
            int i6 = i5 + 1;
            i4 = i6;
            i5 = i6;
        }
        return (this.field_958.method_693() && this.field_958.method_692(class_557Var)) ? false : true;
    }

    public boolean method_1220(class_606 class_606Var, class_202 class_202Var, class_261 class_261Var) {
        return method_1221(class_606Var, class_202Var);
    }

    public boolean method_1221(class_606 class_606Var, class_202 class_202Var) {
        return class_606Var.method_2101().contains(class_202Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean method_1222(class_606 class_606Var, class_202 class_202Var) {
        if (method_1221(class_606Var, class_202Var)) {
            return true;
        }
        if (class_363.method_1487(this.field_959)) {
            return false;
        }
        class_574[] method_908 = class_202Var.method_908();
        int i = 0;
        int i2 = 0;
        while (i < method_908.length) {
            class_574 class_574Var = method_908[i2];
            if ("Lcom/allatori/annotations/Rename;".equals(class_574Var.method_2016())) {
                return true;
            }
            if ("Lcom/allatori/annotations/DoNotRename;".equals(class_574Var.method_2016())) {
                return false;
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.field_957.size()) {
            class_145 class_145Var = (class_145) this.field_957.get(i5);
            if ((!class_145Var.method_687() || class_145Var.method_695()) && class_145Var.method_685(class_606Var, class_202Var)) {
                if (class_145Var.method_695()) {
                    return true;
                }
                if (!class_145Var.method_688()) {
                    return false;
                }
                class_261[] method_898 = class_202Var.method_898();
                int length = method_898.length - 1;
                int i6 = length;
                int i7 = length;
                while (i6 >= 0) {
                    if (!class_544.method_1924().method_1468().method_1223(class_606Var, class_202Var, method_898[i7])) {
                        return false;
                    }
                    int i8 = i7 - 1;
                    i6 = i8;
                    i7 = i8;
                }
                class_557[] method_904 = class_202Var.method_904();
                int length2 = method_904.length - 1;
                int i9 = length2;
                int i10 = length2;
                while (i9 >= 0) {
                    if (!class_544.method_1924().method_1468().method_1225(class_606Var, class_202Var, method_904[i10])) {
                        return false;
                    }
                    int i11 = i10 - 1;
                    i9 = i11;
                    i10 = i11;
                }
            }
            int i12 = i5 + 1;
            i4 = i12;
            i5 = i12;
        }
        return true;
    }

    public void method_1219(class_145 class_145Var) {
        this.field_957.add(class_145Var);
    }

    public boolean method_1217(class_606 class_606Var, class_202 class_202Var, class_557 class_557Var) {
        return class_557Var.method_464().startsWith("Allatori") || method_1221(class_606Var, class_202Var);
    }
}
