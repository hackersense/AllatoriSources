package com.allatori.ant;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_365 {
    public ClassLoader field_1180;

    public static ClassLoader method_1490() {
        String property = System.getProperty("bcel.classloader");
        if (property == null || "".equals(property)) {
            property = "com.allatori.IIiIiiIIIi";
        }
        try {
            return (ClassLoader) Class.forName(property).newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e.toString());
        }
    }

    public class_365(ClassLoader classLoader) {
        this.field_1180 = classLoader;
    }

    public static void method_1489(String[] strArr) {
        if (strArr.length == 0) {
            System.out.println("Missing class name.");
            return;
        }
        String str = strArr[0];
        String[] strArr2 = new String[strArr.length - 1];
        System.arraycopy(strArr, 1, strArr2, 0, strArr2.length);
        new class_365().method_1488(str, strArr2);
    }

    public class_365() {
        this(method_1490());
    }

    public void method_1488(String str, String[] strArr) {
        try {
            Method method = this.field_1180.loadClass(str).getMethod("main", strArr.getClass());
            int modifiers = method.getModifiers();
            Class<?> returnType = method.getReturnType();
            if (!Modifier.isPublic(modifiers) || !Modifier.isStatic(modifiers) || Modifier.isAbstract(modifiers) || returnType != Void.TYPE) {
                throw new NoSuchMethodException();
            }
            try {
                method.invoke(null, strArr);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e2) {
            System.out.println(new StringBuilder().insert(0, "In class ").append(str).append(": public static void main(String[] argv) is not defined").toString());
        }
    }
}
