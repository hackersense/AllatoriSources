package com.allatori.ant;

import java.util.ArrayList;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_11 {
    public int field_25;
    public ArrayList field_26 = new ArrayList();

    public class_212 method_27(int i) {
        return (class_212) this.field_26.get((method_30() - i) - 1);
    }

    public int method_30() {
        return this.field_26.size();
    }

    public Object clone() {
        class_11 class_11Var = new class_11(this.field_25);
        class_11Var.field_26 = (ArrayList) this.field_26.clone();
        return class_11Var;
    }

    public class_11(int i) {
        this.field_25 = i;
    }

    public boolean method_24() {
        return this.field_26.isEmpty();
    }

    public void method_28(class_11 class_11Var) {
        try {
            if (method_22() != class_11Var.method_22() || method_30() != class_11Var.method_30()) {
                throw new RuntimeException(new StringBuilder().insert(0, "Cannot merge stacks of different size:\nOperandStack A:\n").append(this).append("\nOperandStack B:\n").append(class_11Var).toString());
            }
            for (int i = 0; i < method_30(); i++) {
                if ((this.field_26.get(i) instanceof class_356) || !(class_11Var.field_26.get(i) instanceof class_356)) {
                    if (!this.field_26.get(i).equals(class_11Var.field_26.get(i)) && (this.field_26.get(i) instanceof class_356) && !(class_11Var.field_26.get(i) instanceof class_356)) {
                        throw new RuntimeException("Backwards branch with an uninitialized object on the stack detected.");
                    }
                    if ((this.field_26.get(i) instanceof class_356) && !(class_11Var.field_26.get(i) instanceof class_356)) {
                        this.field_26.set(i, ((class_356) this.field_26.get(i)).method_646());
                    }
                    if (!this.field_26.get(i).equals(class_11Var.field_26.get(i))) {
                        if ((this.field_26.get(i) instanceof class_592) && (class_11Var.field_26.get(i) instanceof class_592)) {
                            this.field_26.set(i, ((class_592) this.field_26.get(i)).method_2082((class_592) class_11Var.field_26.get(i)));
                        } else {
                            throw new RuntimeException(new StringBuilder().insert(0, "Cannot merge stacks of different types:\nStack A:\n").append(this).append("\nStack B:\n").append(class_11Var).toString());
                        }
                    }
                } else {
                    throw new RuntimeException("Backwards branch with an uninitialized object on the stack detected.");
                }
            }
        } catch (ClassNotFoundException e) {
            throw new class_572(new StringBuilder().insert(0, "Missing class: ").append(e.toString()).toString());
        }
    }

    public class_212 method_19() {
        return (class_212) this.field_26.remove(method_30() - 1);
    }

    public class_212 method_20() {
        return method_27(0);
    }

    public void method_21() {
        this.field_26 = new ArrayList();
    }

    public int hashCode() {
        return this.field_26.hashCode();
    }

    public int method_22() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < this.field_26.size()) {
            int i4 = i2 + 1;
            i3 += method_27(i2).method_47();
            i = i4;
            i2 = i4;
        }
        return i3;
    }

    public class_11(int i, class_392 class_392Var) {
        this.field_25 = i;
        method_31(class_392Var);
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0003 */
    public void method_26(class_356 class_356Var) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i >= this.field_26.size()) {
                return;
            }
            if (this.field_26.get(i2) == class_356Var) {
                this.field_26.set(i2, class_356Var.method_646());
            }
            i = i2 + 1;
        }
    }

    public void method_31(class_212 class_212Var) {
        if (class_212Var != null) {
            if (class_212Var != class_212.field_813 && class_212Var != class_212.field_806 && class_212Var != class_212.field_795 && class_212Var != class_212.field_801) {
                if (method_22() >= this.field_25) {
                    throw new class_572(new StringBuilder().insert(0, "OperandStack too small, should have thrown proper Exception elsewhere. Stack: ").append(this).toString());
                }
                this.field_26.add(class_212Var);
                return;
            }
            throw new class_572(new StringBuilder().insert(0, "The OperandStack does not know about '").append(class_212Var).append("'; use Type.INT instead.").toString());
        }
        throw new class_572("Cannot push NULL onto OperandStack.");
    }

    public int method_25() {
        return this.field_25;
    }

    public class_11 method_29() {
        return (class_11) clone();
    }

    public class_212 method_23(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = i3 + 1;
            method_19();
            i2 = i4;
            i3 = i4;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof class_11) {
            return this.field_26.equals(((class_11) obj).field_26);
        }
        return false;
    }
}
