package com.allatori.ant;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_606 {
    public ClassLoader field_2397;
    public Hashtable field_2396 = new Hashtable();
    public Hashtable field_2400 = new Hashtable();
    public HashSet field_2401 = new HashSet();
    public Vector field_2399 = new Vector();
    public Hashtable field_2398 = new Hashtable();
    public Hashtable field_2402 = new Hashtable();

    public int method_2107() {
        return this.field_2396.size();
    }

    public ClassLoader method_2103() {
        return this.field_2397;
    }

    public void method_2104(class_202 class_202Var) {
        this.field_2396.put(class_202Var.method_198(), class_202Var);
        this.field_2399.add(class_202Var);
    }

    public void method_2109(class_202 class_202Var, String str) {
        if ("java.lang.Object".equals(class_202Var.method_198())) {
            return;
        }
        if (this.field_2396.containsKey(class_202Var.method_198())) {
            this.field_2401.add(class_202Var);
        } else {
            this.field_2396.put(class_202Var.method_198(), class_202Var);
            this.field_2400.put(class_202Var.method_198(), str);
        }
    }

    public boolean method_2111(class_202 class_202Var) {
        return this.field_2401.contains(class_202Var);
    }

    public String method_2110(String str) {
        return (String) this.field_2398.get(str);
    }

    public Iterator method_2108() {
        return this.field_2396.values().iterator();
    }

    public class_606(class_158 class_158Var) {
        this.field_2397 = class_158Var;
        class_158Var.method_774(this);
    }

    public String method_2106(String str) {
        return (String) this.field_2402.get(str);
    }

    public class_202 method_2102(String str) {
        return (class_202) this.field_2396.get(str);
    }

    public void method_2105(class_202 class_202Var, String str, String str2) {
        method_2109(class_202Var, str);
        this.field_2398.put(new StringBuilder().insert(0, str).append('#').append(str2).toString(), class_202Var.method_198());
        String sb = new StringBuilder().insert(0, class_202Var.method_198().replace('.', '/')).append(".class").toString();
        if (!str2.endsWith(sb)) {
            return;
        }
        this.field_2402.put(new StringBuilder().insert(0, str).append('#').append(class_202Var.method_198()).toString(), str2.substring(0, str2.length() - sb.length()));
    }

    public String method_2100(class_202 class_202Var) {
        return (String) this.field_2400.get(class_202Var.method_198());
    }

    public Vector method_2101() {
        return this.field_2399;
    }
}
