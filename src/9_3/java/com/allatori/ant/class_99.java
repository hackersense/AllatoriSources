package com.allatori.ant;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_99 implements Serializable {
    public List field_506 = new ArrayList();

    public void method_46(int i) {
        this.field_506.remove(i);
    }

    public void method_95(class_440 class_440Var) {
        this.field_506.add(class_440Var);
    }

    public class_440[] method_601() {
        class_440[] class_440VarArr = new class_440[this.field_506.size()];
        this.field_506.toArray(class_440VarArr);
        return class_440VarArr;
    }

    public class_440 method_600(int i) {
        return (class_440) this.field_506.get(i);
    }
}
