package com.allatori.ant;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_220 {
    public Hashtable field_820 = new Hashtable();
    public class_386 field_821;
    public Vector field_822;
    public class_386 field_823;

    public void method_1052(String str, String str2) {
        method_1054(str, str2, -1, -1);
    }

    public String method_1050(String str, int i) {
        Vector vector = (Vector) this.field_820.get(str);
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            class_416 class_416Var = (class_416) it.next();
            if (i >= class_416.method_1577(class_416Var) && i <= class_416.method_1579(class_416Var)) {
                return class_416.method_1578(class_416Var);
            }
        }
        if (vector.size() > 0) {
            return class_416.method_1578((class_416) vector.get(0));
        }
        return null;
    }

    public void method_1054(String str, String str2, int i, int i2) {
        if (!this.field_820.containsKey(str)) {
            this.field_820.put(str, new Vector());
        }
        ((Vector) this.field_820.get(str)).add(new class_416(str2, i, i2, null));
    }

    public boolean method_1051(String str) {
        return this.field_820.containsKey(str);
    }

    public String method_1053(String str) {
        Vector vector = (Vector) this.field_820.get(str);
        if (vector.size() > 0) {
            return class_416.method_1578((class_416) vector.get(0));
        }
        return null;
    }
}
