package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_560;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_22 implements class_560 {
    public static final String field_36 = class_58.method_198();
    public static Map field_38 = new HashMap();
    public Map field_37 = new HashMap();
    public class_58 field_39;

    @Override // p000.class_560
    public class_440 method_91(Class cls) {
        String name = cls.getName();
        class_440 method_93 = method_93(name);
        if (method_93 != null) {
            return method_93;
        }
        int lastIndexOf = name.lastIndexOf(46);
        return method_98(cls.getResourceAsStream((lastIndexOf > 0 ? name.substring(lastIndexOf + 1) : name) + ".class"), name);
    }

    @Override // p000.class_560
    public void method_94(class_440 class_440Var) {
        this.field_37.put(class_440Var.method_546(), new SoftReference(class_440Var));
        class_440Var.method_1627(this);
    }

    public class_440 method_98(InputStream inputStream, String str) {
        if (inputStream == null) {
            throw new ClassNotFoundException(new StringBuilder().insert(0, "SyntheticRepository could not load ").append(str).toString());
        }
        try {
            class_440 method_1909 = new class_543(inputStream, str).method_1909();
            method_94(method_1909);
            return method_1909;
        } catch (IOException e) {
            throw new ClassNotFoundException(new StringBuilder().insert(0, "Exception while looking for class ").append(str).append(": ").append(e.toString()).toString());
        }
    }

    public static class_22 method_100(class_58 class_58Var) {
        class_22 class_22Var = (class_22) field_38.get(class_58Var);
        if (class_22Var == null) {
            class_22 class_22Var2 = new class_22(class_58Var);
            field_38.put(class_58Var, class_22Var2);
            return class_22Var2;
        }
        return class_22Var;
    }

    @Override // p000.class_560
    public void method_95(class_440 class_440Var) {
        this.field_37.remove(class_440Var.method_546());
    }

    @Override // p000.class_560
    public class_440 method_93(String str) {
        SoftReference softReference = (SoftReference) this.field_37.get(str);
        if (softReference == null) {
            return null;
        }
        return (class_440) softReference.get();
    }

    public class_22(class_58 class_58Var) {
        this.field_39 = null;
        this.field_39 = class_58Var;
    }

    @Override // p000.class_560
    public class_440 method_92(String str) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, "Invalid class name ").append(str).toString());
        }
        String replace = str.replace('/', '.');
        class_440 method_93 = method_93(replace);
        if (method_93 == null) {
            try {
                return method_98(this.field_39.method_223(replace), replace);
            } catch (IOException e) {
                throw new ClassNotFoundException(new StringBuilder().insert(0, "Exception while looking for class ").append(replace).append(": ").append(e.toString()).toString());
            }
        }
        return method_93;
    }

    @Override // p000.class_560
    public void method_97() {
        this.field_37.clear();
    }

    @Override // p000.class_560
    public class_58 method_96() {
        return this.field_39;
    }

    public static class_22 method_99() {
        return method_100(class_58.field_200);
    }
}
