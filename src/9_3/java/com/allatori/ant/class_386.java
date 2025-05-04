package com.allatori.ant;

import java.util.Hashtable;
import java.util.Set;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_386 {
    public Hashtable field_1236 = new Hashtable();

    public Set method_1544() {
        return this.field_1236.keySet();
    }

    public String method_1543(String str) {
        return (String) this.field_1236.get(str);
    }

    public void method_1546(String str, String str2) {
        this.field_1236.put(str, str2);
    }

    public void method_1545(String str) {
        this.field_1236.remove(str);
    }

    public boolean method_1547(String str) {
        return this.field_1236.containsKey(str);
    }

    public int method_1548() {
        return this.field_1236.size();
    }
}
