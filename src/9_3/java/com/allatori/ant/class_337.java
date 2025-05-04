package com.allatori.ant;

import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.unmapped.class_389;
import com.allatori.interfaces.unmapped.class_445;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_337 implements Serializable {
    public static class_337 field_1121 = null;
    public class_337 c337;
    public class_337 field_1117;
    public Set field_1118;
    public Map field_1119;
    public class_539 field_1120;
    public int field_1122 = -1;

    public final class_539 method_1038() {
        return this.field_1120;
    }

    public void method_46(int i) {
        this.field_1122 = i;
    }

    public Object method_1396(Object obj) {
        if (this.field_1119 == null) {
            return null;
        }
        return this.field_1119.get(obj);
    }

    public void method_1391(Object obj) {
        if (this.field_1119 == null) {
            return;
        }
        this.field_1119.remove(obj);
    }

    public class_389[] method_1398() {
        if (!method_424()) {
            return null;
        }
        class_389[] class_389VarArr = new class_389[this.field_1118.size()];
        this.field_1118.toArray(class_389VarArr);
        return class_389VarArr;
    }

    public void method_1392(class_389 class_389Var) {
        if (this.field_1118 == null) {
            return;
        }
        this.field_1118.remove(class_389Var);
    }

    public int method_49(int i, int i2) {
        this.field_1122 += i;
        return 0;
    }

    public void method_401() {
        this.c337 = null;
        this.field_1117 = null;
        this.field_1120.method_97();
        this.field_1120 = null;
        this.field_1122 = -1;
        this.field_1119 = null;
        method_97();
        method_50();
    }

    public class_337(class_539 class_539Var) {
        method_48(class_539Var);
    }

    public void method_97() {
        if (this.field_1118 == null) {
            return;
        }
        this.field_1118.clear();
    }

    public void method_48(class_539 class_539Var) {
        if (class_539Var != null) {
            if (getClass() == c19_ext_c337.class || !(class_539Var instanceof class_272)) {
                if (this.field_1120 != null) {
                    this.field_1120.method_97();
                }
                this.field_1120 = class_539Var;
                return;
            }
            throw new class_151(new StringBuilder().insert(0, "Assigning branch instruction ").append(class_539Var).append(" to plain handle").toString());
        }
        throw new class_151("Assigning null to handle");
    }

    public static final class_337 method_444(class_539 class_539Var) {
        if (field_1121 != null) {
            class_337 class_337Var = field_1121;
            field_1121 = class_337Var.field_1117;
            class_337Var.method_48(class_539Var);
            return class_337Var;
        }
        return new class_337(class_539Var);
    }

    public void method_1394(Object obj, Object obj2) {
        if (this.field_1119 == null) {
            this.field_1119 = new HashMap(3);
        }
        this.field_1119.put(obj, obj2);
    }

    public boolean method_424() {
        return this.field_1118 != null && this.field_1118.size() > 0;
    }

    public final class_337 method_419() {
        return this.c337;
    }

    public final class_337 method_415() {
        return this.field_1117;
    }

    public Collection method_1395() {
        if (this.field_1119 == null) {
            this.field_1119 = new HashMap(3);
        }
        return this.field_1119.values();
    }

    public int method_47() {
        return this.field_1122;
    }

    public String method_406(boolean z) {
        return new StringBuilder().insert(0, class_204.method_963(this.field_1122, 4, false, ' ')).append(": ").append(this.field_1120.method_406(z)).toString();
    }

    public void method_1397(class_389 class_389Var) {
        if (this.field_1118 == null) {
            this.field_1118 = new HashSet();
        }
        this.field_1118.add(class_389Var);
    }

    public void method_50() {
        this.field_1117 = field_1121;
        field_1121 = this;
    }

    public class_539 method_1393(class_539 class_539Var) {
        class_539 class_539Var2 = this.field_1120;
        this.field_1120 = class_539Var;
        return class_539Var2;
    }

    public void method_0(class_445 class_445Var) {
        this.field_1120.method_0(class_445Var);
    }
}
