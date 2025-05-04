package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_142;

import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_565 extends class_250 implements class_142, Cloneable {
    public class_212 field_2326;
    public String field_2328;
    public class_208 field_2329;
    public List field_2330 = new ArrayList();
    public ArrayList field_2327 = new ArrayList();

    public abstract String method_464();

    public class_160[] method_906() {
        class_160[] class_160VarArr = new class_160[this.field_2330.size()];
        this.field_2330.toArray(class_160VarArr);
        return class_160VarArr;
    }

    @Override // p000.class_142
    public void method_668(class_212 class_212Var) {
        if (class_212Var.method_619() == 16) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, "Type can not be ").append(class_212Var).toString());
        }
        this.field_2326 = class_212Var;
    }

    public void method_97() {
        this.field_2330.clear();
    }

    public class_574[] method_908() {
        class_574[] class_574VarArr = new class_574[this.field_2327.size()];
        this.field_2327.toArray(class_574VarArr);
        return class_574VarArr;
    }

    public void method_919(class_208 class_208Var) {
        this.field_2329 = class_208Var;
    }

    public void method_921(class_160 class_160Var) {
        this.field_2330.remove(class_160Var);
    }

    public void method_902(class_160 class_160Var) {
        this.field_2330.add(class_160Var);
    }

    public void method_401() {
        this.field_2327.clear();
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println(e);
            return null;
        }
    }

    @Override // p000.class_142
    public class_212 method_669() {
        return this.field_2326;
    }

    public void method_903(class_574 class_574Var) {
        this.field_2327.remove(class_574Var);
    }

    @Override // p000.class_142
    public void method_671(String str) {
        this.field_2328 = str;
    }

    public void method_923(class_574 class_574Var) {
        this.field_2327.add(class_574Var);
    }

    public class_208 method_917() {
        return this.field_2329;
    }

    @Override // p000.class_142
    public String method_198() {
        return this.field_2328;
    }
}
