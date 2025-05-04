package com.allatori.ant;

import java.net.URL;
import java.net.URLClassLoader;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_547 extends URLClassLoader {
    public class_606 field_2059;
    public class_386 field_2060;

    public class_547(class_606 class_606Var, class_386 class_386Var) {
        super(new URL[0], class_606Var.method_2103());
        this.field_2059 = class_606Var;
        this.field_2060 = class_386Var;
    }

    @Override // java.net.URLClassLoader, java.lang.ClassLoader
    public Class findClass(String str) {
        String str2;
        try {
            str2 = this.field_2060.method_1547(str) ? this.field_2060.method_1543(str) : str;
            try {
                if (this.field_2059.method_2102(str2) != null) {
                    return method_775(str2);
                }
            } catch (Exception e) {
            }
        } catch (Exception e2) {
            str2 = str;
        }
        return super.findClass(str2);
    }

    public Class method_775(String str) {
        class_202 method_2102 = this.field_2059.method_2102(str);
        byte[] method_429 = method_2102.method_642().method_429();
        return defineClass(method_2102.method_198(), method_429, 0, method_429.length);
    }
}
