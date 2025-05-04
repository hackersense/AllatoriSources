package com.allatori.ant;

import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_488 {
    public List field_1944 = new ArrayList();
    public class_275 field_1943 = null;

    public abstract class_275 method_644() throws ClassNotFoundException;

    public String[] method_643() {
        method_1833();
        return (String[]) this.field_1944.toArray(new String[this.field_1944.size()]);
    }

    public class_275 method_1833() {
        if (this.field_1943 == null) {
            this.field_1943 = method_644();
        }
        return this.field_1943;
    }

    public void method_671(String str) {
        this.field_1944.add(str);
    }
}
