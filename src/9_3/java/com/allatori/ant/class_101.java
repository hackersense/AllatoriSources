package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_560;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_101 implements class_560 {
    public ClassLoader field_507;
    public Map field_508 = new HashMap();

    @Override // p000.class_560
    public class_440 method_91(Class cls) {
        return method_92(cls.getName());
    }

    @Override // p000.class_560
    public void method_94(class_440 class_440Var) {
        this.field_508.put(class_440Var.method_546(), class_440Var);
        class_440Var.method_1627(this);
    }

    @Override // p000.class_560
    public void method_95(class_440 class_440Var) {
        this.field_508.remove(class_440Var.method_546());
    }

    @Override // p000.class_560
    public void method_97() {
        this.field_508.clear();
    }

    @Override // p000.class_560
    public class_440 method_92(String str) {
        String replace = str.replace('.', '/');
        class_440 method_93 = method_93(str);
        if (method_93 == null) {
            try {
                InputStream resourceAsStream = this.field_507.getResourceAsStream(new StringBuilder().insert(0, replace).append(".class").toString());
                if (resourceAsStream != null) {
                    class_440 method_1909 = new class_543(resourceAsStream, str).method_1909();
                    method_94(method_1909);
                    return method_1909;
                }
                throw new ClassNotFoundException(new StringBuilder().insert(0, str).append(" not found.").toString());
            } catch (IOException e) {
                throw new ClassNotFoundException(e.toString());
            }
        }
        return method_93;
    }

    public class_101(ClassLoader classLoader) {
        this.field_507 = classLoader;
    }

    @Override // p000.class_560
    public class_58 method_96() {
        return null;
    }

    @Override // p000.class_560
    public class_440 method_93(String str) {
        if (!this.field_508.containsKey(str)) {
            return null;
        }
        return (class_440) this.field_508.get(str);
    }
}
