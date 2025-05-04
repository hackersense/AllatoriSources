package com.allatori.ant;

import com.allatori.exception.runtime.RuntimeException_236;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_426 {
    public class_212[] field_1682;

    public int method_1607() {
        return this.field_1682.length;
    }

    public void method_1604(class_426 class_426Var, int i) {
        try {
            if (!(this.field_1682[i] instanceof class_356) && (class_426Var.field_1682[i] instanceof class_356)) {
                throw new RuntimeException_236("Backwards branch with an uninitialized object in the local variables detected.");
            }
            if (this.field_1682[i].equals(class_426Var.field_1682[i]) || !(this.field_1682[i] instanceof class_356) || !(class_426Var.field_1682[i] instanceof class_356)) {
                if ((this.field_1682[i] instanceof class_356) && !(class_426Var.field_1682[i] instanceof class_356)) {
                    this.field_1682[i] = ((class_356) this.field_1682[i]).method_646();
                }
                if (!(this.field_1682[i] instanceof class_592) || !(class_426Var.field_1682[i] instanceof class_592)) {
                    if (this.field_1682[i].equals(class_426Var.field_1682[i])) {
                        return;
                    }
                    this.field_1682[i] = class_212.field_803;
                    return;
                } else {
                    if (!this.field_1682[i].equals(class_426Var.field_1682[i])) {
                        class_592 method_2082 = ((class_592) this.field_1682[i]).method_2082((class_592) class_426Var.field_1682[i]);
                        if (method_2082 == null) {
                            throw new class_572(new StringBuilder().insert(0, "Could not load all the super classes of '").append(this.field_1682[i]).append("' and '").append(class_426Var.field_1682[i]).append("'.").toString());
                        }
                        this.field_1682[i] = method_2082;
                        return;
                    }
                    return;
                }
            }
            throw new RuntimeException_236("Backwards branch with an uninitialized object in the local variables detected.");
        } catch (ClassNotFoundException e) {
            throw new class_572(new StringBuilder().insert(0, "Missing class: ").append(e.toString()).toString());
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0003 */
    public void method_1606(class_356 class_356Var) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i < this.field_1682.length) {
                if (this.field_1682[i2] == class_356Var) {
                    this.field_1682[i2] = class_356Var.method_646();
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof class_426)) {
            return false;
        }
        class_426 class_426Var = (class_426) obj;
        if (this.field_1682.length != class_426Var.field_1682.length) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        while (i < this.field_1682.length) {
            if (!this.field_1682[i2].equals(class_426Var.field_1682[i2])) {
                return false;
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        return true;
    }

    public class_212 method_1609(int i) {
        return this.field_1682[i];
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x000b */
    public Object clone() {
        class_426 class_426Var = new class_426(this.field_1682.length);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i >= this.field_1682.length) {
                return class_426Var;
            }
            i = i2 + 1;
            class_426Var.field_1682[i2] = this.field_1682[i2];
        }
    }

    public class_426(int i) {
        this.field_1682 = new class_212[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = i3 + 1;
            this.field_1682[i3] = class_212.field_803;
            i2 = i4;
            i3 = i4;
        }
    }

    public int hashCode() {
        return this.field_1682.length;
    }

    public void method_1610(int i, class_212 class_212Var) {
        if (class_212Var != class_212.field_795 && class_212Var != class_212.field_801 && class_212Var != class_212.field_813 && class_212Var != class_212.field_806) {
            this.field_1682[i] = class_212Var;
            return;
        }
        throw new class_572(new StringBuilder().insert(0, "LocalVariables do not know about '").append(class_212Var).append("'. Use Type.INT instead.").toString());
    }

    public class_426 method_1608() {
        return (class_426) clone();
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:7:0x0013 */
    public void method_1605(class_426 class_426Var) {
        if (this.field_1682.length == class_426Var.field_1682.length) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i >= this.field_1682.length) {
                    return;
                }
                i = i2 + 1;
                method_1604(class_426Var, i2);
            }
        } else {
            throw new class_572("Merging LocalVariables of different size?!? From different methods or what?!?");
        }
    }
}
