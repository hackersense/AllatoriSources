package com.allatori.ant;

import com.allatori.commons.AllatoriLogger;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_33 extends class_473 {
    public final ClassLoader field_59;
    public final class_31 field_60;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public class_33(class_31 class_31Var, int i, ClassLoader classLoader) {
        super(i);
        this.field_60 = class_31Var;
        this.field_59 = classLoader;
    }

    @Override // p000.class_473
    public String method_160(String str, String str2) {
        try {
            Class<?> cls = Class.forName(str.replace('/', '.'), false, this.field_59);
            Class<?> cls2 = Class.forName(str2.replace('/', '.'), false, this.field_59);
            if (cls.isAssignableFrom(cls2)) {
                return str;
            }
            if (cls2.isAssignableFrom(cls)) {
                return str2;
            }
            if (cls.isInterface() || cls2.isInterface()) {
                return "java/lang/Object";
            }
            do {
                cls = cls.getSuperclass();
            } while (!cls.isAssignableFrom(cls2));
            return cls.getName().replace('.', '/');
        } catch (ClassNotFoundException e) {
            if (!class_31.method_152(this.field_60).contains(e.getMessage())) {
                class_31.method_152(this.field_60).add(e.getMessage());
                AllatoriLogger.method_678(new StringBuilder().insert(0, "CLASS NOT FOUND: ").append(e.getMessage()).toString());
                AllatoriLogger.method_678("  ADD NEEDED JAR TO THE 'classpath' ELEMENT OF THE CONFIGURATION FILE.");
            }
            return "java/lang/Object";
        } catch (Exception e2) {
            throw new RuntimeException(e2.toString());
        } catch (NoClassDefFoundError e3) {
            if (!class_31.method_152(this.field_60).contains(e3.getMessage())) {
                class_31.method_152(this.field_60).add(e3.getMessage());
                AllatoriLogger.method_678(new StringBuilder().insert(0, "CLASS NOT FOUND: ").append(e3.getMessage()).toString());
                AllatoriLogger.method_678("  ADD NEEDED JAR TO THE 'classpath' ELEMENT OF THE CONFIGURATION FILE.");
            }
            return "java/lang/Object";
        } catch (UnsupportedClassVersionError e4) {
            if (!class_31.method_151(this.field_60)) {
                class_31.method_155(this.field_60, true);
                AllatoriLogger.method_678(new StringBuilder().insert(0, "SOME CLASS(ES) CANNOT BE READ DUE TO JVM VERSION INCOMPATIBILITY: ").append(e4.toString()).toString());
                AllatoriLogger.method_678("  USE NEWER JVM VERSION TO RUN ALLATORI.");
            }
            return "java/lang/Object";
        } catch (Error e5) {
            return "java/lang/Object";
        }
    }
}
