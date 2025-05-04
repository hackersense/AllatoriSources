package com.allatori.ant;

import com.allatori.exception.runtime.RuntimeException_62;

import java.util.Hashtable;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_143 {
    public Hashtable field_639 = new Hashtable();
    public Hashtable field_640 = new Hashtable();

    public class_212 method_674(int i) {
        return (class_212) this.field_639.get(Integer.toString(i));
    }

    public String method_672(int i) {
        return (String) this.field_640.get(Integer.toString(i));
    }

    public void method_673(int i, class_212 class_212Var) {
        this.field_639.put(Integer.toString(i), class_212Var);
    }

    public void method_675(String str, int i, int i2, class_212 class_212Var) {
        int i3 = i;
        int i4 = i;
        while (i3 <= i + i2) {
            int i5 = i4 + 1;
            method_676(i4, str, class_212Var);
            i3 = i5;
            i4 = i5;
        }
    }

    public void method_676(int i, String str, class_212 class_212Var) {
        if (method_672(i) != null && !method_672(i).equals(str)) {
            throw new RuntimeException_62(new StringBuilder().insert(0, "At bytecode offset '").append(i).append("' a local variable has two different names: '").append(method_672(i)).append("' and '").append(str).append("'.").toString());
        }
        if (method_674(i) == null || method_674(i).equals(class_212Var)) {
            method_677(i, str);
            method_673(i, class_212Var);
            return;
        }
        throw new RuntimeException_62(new StringBuilder().insert(0, "At bytecode offset '").append(i).append("' a local variable has two different types: '").append(method_674(i)).append("' and '").append(class_212Var).append("'.").toString());
    }

    public void method_677(int i, String str) {
        this.field_640.put(Integer.toString(i), str);
    }
}
