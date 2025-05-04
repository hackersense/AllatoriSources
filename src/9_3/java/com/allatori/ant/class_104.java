package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_560;

import java.io.ByteArrayInputStream;
import java.util.Hashtable;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_104 extends ClassLoader {
    public static final String[] field_519 = {"java.", "javax.", "sun."};
    public class_560 field_517;
    public String[] field_518;
    public Hashtable field_520;

    public class_440 method_606(class_440 class_440Var) {
        return class_440Var;
    }

    public class_440 method_607(String str) {
        try {
            class_440 method_1909 = new class_543(new ByteArrayInputStream(class_204.method_956(str.substring(str.indexOf("$$BCEL$$") + 8), true)), "foo").method_1909();
            class_499 method_502 = method_1909.method_502();
            ((class_371) method_502.method_1849(((class_43) method_502.method_1849(method_1909.method_920(), (byte) 7)).method_47(), (byte) 1)).method_671(str.replace('.', '/'));
            return method_1909;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public class_104() {
        this(field_519);
    }

    public class_104(ClassLoader classLoader) {
        super(classLoader);
        this.field_520 = new Hashtable();
        this.field_517 = class_22.method_99();
        this.field_518 = field_519;
        this.field_517 = new class_101(classLoader);
    }

    public class_104(ClassLoader classLoader, String[] strArr) {
        this(strArr);
        this.field_517 = new class_101(classLoader);
    }

    @Override // java.lang.ClassLoader
    public Class loadClass(String str, boolean z) {
        Class<?> cls;
        Class<?> cls2;
        class_440 class_440Var;
        class_440 class_440Var2;
        Class<?> cls3 = (Class) this.field_520.get(str);
        if (cls3 == null) {
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= this.field_518.length) {
                    cls = cls3;
                    cls2 = cls3;
                    break;
                }
                if (!str.startsWith(this.field_518[i2])) {
                    int i3 = i2 + 1;
                    i = i3;
                    i2 = i3;
                } else {
                    Class<?> loadClass = getParent().loadClass(str);
                    cls = loadClass;
                    cls2 = loadClass;
                    break;
                }
            }
            if (cls == null) {
                if (str.indexOf("$$BCEL$$") >= 0) {
                    class_440 method_607 = method_607(str);
                    class_440Var = method_607;
                    class_440Var2 = method_607;
                } else {
                    class_440 method_92 = this.field_517.method_92(str);
                    if (method_92 != null) {
                        class_440 method_606 = method_606(method_92);
                        class_440Var = method_606;
                        class_440Var2 = method_606;
                    } else {
                        throw new ClassNotFoundException(str);
                    }
                }
                if (class_440Var != null) {
                    byte[] method_429 = class_440Var2.method_429();
                    cls3 = defineClass(str, method_429, 0, method_429.length);
                } else {
                    cls3 = Class.forName(str);
                }
            } else {
                cls3 = cls2;
            }
            if (z) {
                resolveClass(cls3);
            }
        }
        this.field_520.put(str, cls3);
        return cls3;
    }

    public class_104(String[] strArr) {
        this.field_520 = new Hashtable();
        this.field_517 = class_22.method_99();
        this.field_518 = strArr;
    }
}
