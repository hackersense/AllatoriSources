package com.allatori.ant;

import java.io.Serializable;
import java.util.Stack;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_179 implements Serializable {
    public Stack field_730 = new Stack();

    public boolean method_424() {
        return this.field_730.empty();
    }

    public void method_95(class_440 class_440Var) {
        this.field_730.push(class_440Var);
    }

    public class_440 method_642() {
        return (class_440) this.field_730.pop();
    }

    public class_440 method_863() {
        return (class_440) this.field_730.peek();
    }
}
