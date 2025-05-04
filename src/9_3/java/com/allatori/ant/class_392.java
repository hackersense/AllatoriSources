package com.allatori.ant;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_392 extends class_592 {
    public String field_1242;

    public String method_464() {
        return this.field_1242;
    }

    public boolean method_1549(class_392 class_392Var) {
        if (!method_1126() && !class_392Var.method_1126()) {
            return class_474.method_1807(this.field_1242, class_392Var.field_1242);
        }
        return false;
    }

    public boolean method_1129() {
        return !class_474.method_1810(this.field_1242).method_1641();
    }

    public boolean method_1550(class_392 class_392Var) {
        class_440 method_1810 = class_474.method_1810(this.field_1242);
        if (!method_1810.method_1124()) {
            return class_474.method_1810(class_392Var.field_1242).method_1626().equals(method_1810.method_1626());
        }
        return true;
    }

    public boolean method_1130() {
        try {
            return class_474.method_1810(this.field_1242).method_1641();
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    public class_392(String str) {
        super((byte) 14, new StringBuilder().insert(0, "L").append(str.replace('.', '/')).append(";").toString());
        this.field_1242 = str.replace('/', '.');
    }

    @Override // p000.class_212
    public int hashCode() {
        return this.field_1242.hashCode();
    }

    public boolean method_424() {
        return class_474.method_1810(this.field_1242).method_1641();
    }

    public boolean method_1126() {
        try {
            return !class_474.method_1810(this.field_1242).method_1641();
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    @Override // p000.class_212
    public boolean equals(Object obj) {
        if (obj instanceof class_392) {
            return ((class_392) obj).field_1242.equals(this.field_1242);
        }
        return false;
    }
}
