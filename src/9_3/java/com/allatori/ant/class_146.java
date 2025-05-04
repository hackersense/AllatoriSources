package com.allatori.ant;

import java.io.Serializable;
import java.util.LinkedList;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_146 implements Serializable {
    public LinkedList field_653 = new LinkedList();

    public void method_95(class_440 class_440Var) {
        this.field_653.addLast(class_440Var);
    }

    public class_440 method_642() {
        return (class_440) this.field_653.removeFirst();
    }

    public boolean method_424() {
        return this.field_653.isEmpty();
    }
}
