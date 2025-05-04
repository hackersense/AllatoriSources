package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_216;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_127 {
    public List field_576;
    public List field_577;

    public void method_635(class_216 class_216Var, ArrayList arrayList) {
        this.field_576.add(class_216Var);
        this.field_577.add(arrayList);
    }

    public void method_632(int i) {
        this.field_576.remove(i);
        this.field_577.remove(i);
    }

    public class_127() {
        this.field_576 = new Vector();
        this.field_577 = new Vector();
    }

    public class_127(class_327 class_327Var) {
        this();
    }

    public ArrayList method_633(int i) {
        return (ArrayList) this.field_577.get(i);
    }

    public class_216 method_631(int i) {
        return (class_216) this.field_576.get(i);
    }

    public int method_636() {
        return this.field_576.size();
    }

    public boolean method_634() {
        return this.field_576.isEmpty();
    }

    public void method_630() {
        method_632(0);
    }
}
