package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_291;

import java.util.Iterator;
import java.util.Vector;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_362 implements class_291 {
    public class_606 field_1160;

    @Override // p000.class_291
    public void method_39() {
    }

    @Override // p000.class_291
    public void method_34(class_202 class_202Var) {
        class_202 method_2102;
        String method_1757 = class_544.method_1930().method_1757();
        if (method_1757 != null && (method_2102 = this.field_1160.method_2102(method_1757)) != null) {
            Vector vector = new Vector();
            Iterator method_2108 = this.field_1160.method_2108();
            String sb = new StringBuilder().insert(0, method_1757).append("$").toString();
            while (method_2108.hasNext()) {
                class_202 class_202Var2 = (class_202) method_2108.next();
                if (class_202Var2.method_198().startsWith(sb)) {
                    vector.add(new class_367(method_2102.method_917().method_1007(class_202Var2.method_198()), 0, 0, 0));
                }
            }
            method_2102.method_921(new class_121(method_2102.method_917().method_1004("InnerClasses"), (vector.size() * 8) + 2, (class_367[]) vector.toArray(new class_367[0]), method_2102.method_917().method_502()));
        }
    }

    public class_362(class_606 class_606Var) {
        this.field_1160 = class_606Var;
    }
}
