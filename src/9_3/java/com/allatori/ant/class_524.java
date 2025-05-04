package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.exception.runtime.RuntimeException_57;
import com.allatori.interfaces.unmapped.class_241;

import java.util.HashMap;
import java.util.HashSet;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_524 extends class_488 implements ASMInterface {
    public class_225 field_1994;
    public class_457[] field_1995;

    @Override // p000.class_488
    public class_275 method_644() {
        try {
            if (!this.field_1994.method_1057().equals(class_275.field_946)) {
                return class_275.field_951;
            }
            this.field_1995 = new class_457[class_474.method_1810(this.field_1994.method_1062()).method_904().length];
            class_275 class_275Var = class_275.field_946;
            try {
                method_50();
                method_411();
                method_401();
                method_97();
                return class_275Var;
            } catch (RuntimeException_57 e) {
                return new class_275(2, e.getMessage());
            }
        } catch (ClassNotFoundException e2) {
            throw new class_572(new StringBuilder().insert(0, "Missing class: ").append(e2.toString()).toString());
        }
    }

    public class_457 method_1891(int i) {
        if (method_1833() != class_275.field_946) {
            return null;
        }
        if (i < 0 || i >= this.field_1995.length) {
            throw new class_572("Method number out of range.");
        }
        return this.field_1995[i];
    }

    public void method_50() {
        try {
            new class_242(this, class_474.method_1810(this.field_1994.method_1062()), null);
        } catch (ClassNotFoundException e) {
            throw new class_572(new StringBuilder().insert(0, "Missing class: ").append(e.toString()).toString());
        }
    }

    public void method_97() {
        try {
            HashMap hashMap = new HashMap();
            class_440 method_1810 = class_474.method_1810(this.field_1994.method_1062());
            int i = -1;
            while (i != 0) {
                i = method_1810.method_927();
                class_557[] method_904 = method_1810.method_904();
                int i2 = 0;
                int i3 = 0;
                while (i2 < method_904.length) {
                    String sb = new StringBuilder().insert(0, method_904[i3].method_464()).append(method_904[i3].method_546()).toString();
                    if (hashMap.containsKey(sb)) {
                        if (!method_904[i3].method_1117()) {
                            if (!method_904[i3].method_1125()) {
                                hashMap.put(sb, method_1810.method_546());
                            }
                        } else {
                            if (!method_904[i3].method_424()) {
                                throw new RuntimeException_57(new StringBuilder().insert(0, "Method '").append(sb).append("' in class '").append(hashMap.get(sb)).append("' overrides the final (not-overridable) definition in class '").append(method_1810.method_546()).append("'.").toString());
                            }
                            method_671(new StringBuilder().insert(0, "Method '").append(sb).append("' in class '").append(hashMap.get(sb)).append("' overrides the final (not-overridable) definition in class '").append(method_1810.method_546()).append("'. This is okay, as the original definition was private; however this constraint leverage was introduced by JLS 8.4.6 (not vmspec2) and the behaviour of the Sun verifiers.").toString());
                        }
                    } else if (!method_904[i3].method_1125()) {
                        hashMap.put(sb, method_1810.method_546());
                    }
                    int i4 = i3 + 1;
                    i2 = i4;
                    i3 = i4;
                }
                method_1810 = class_474.method_1810(method_1810.method_1631());
            }
        } catch (ClassNotFoundException e) {
            throw new class_572(new StringBuilder().insert(0, "Missing class: ").append(e.toString()).toString());
        }
    }

    public void method_401() {
        try {
            HashSet hashSet = new HashSet();
            class_440 method_1810 = class_474.method_1810(this.field_1994.method_1062());
            int i = -1;
            while (i != 0) {
                i = method_1810.method_927();
                if (i != 0) {
                    String method_1631 = method_1810.method_1631();
                    if (hashSet.add(method_1631)) {
                        if (class_412.method_1574(method_1631).method_1057() != class_275.field_946) {
                            throw new RuntimeException_57(new StringBuilder().insert(0, "Could not load in ancestor class '").append(method_1631).append("'.").toString());
                        }
                        method_1810 = class_474.method_1810(method_1631);
                        if (method_1810.method_1117()) {
                            throw new RuntimeException_57(new StringBuilder().insert(0, "Ancestor class '").append(method_1631).append("' has the FINAL access modifier and must therefore not be subclassed.").toString());
                        }
                    } else {
                        throw new RuntimeException_57("Circular superclass hierarchy detected.");
                    }
                } else if (method_1810 != class_474.method_1810(class_212.field_808.method_464())) {
                    throw new RuntimeException_57(new StringBuilder().insert(0, "Superclass of '").append(method_1810.method_546()).append("' missing but not ").append(class_212.field_808.method_464()).append(" itself!").toString());
                }
            }
        } catch (ClassNotFoundException e) {
            throw new class_572(new StringBuilder().insert(0, "Missing class: ").append(e.toString()).toString());
        }
    }

    public static boolean method_1878(String str) {
        return method_460(str);
    }

    public static boolean method_1879(String str) {
        return method_1885(str);
    }

    public static boolean method_1881(String str) {
        return method_1888(str);
    }

    public static boolean method_1882(String str, boolean z) {
        return method_1884(str, z);
    }

    public static boolean method_1886(String str) {
        return method_1877(str);
    }

    public static class_225 method_1887(class_524 class_524Var) {
        return class_524Var.field_1994;
    }

    public static class_457[] method_1889(class_524 class_524Var) {
        return class_524Var.field_1995;
    }

    public static String method_1892(class_241 class_241Var) {
        return method_1890(class_241Var);
    }

    public static boolean method_466(String str) {
        return method_1880(str);
    }

    public class_524(class_225 class_225Var) {
        this.field_1994 = class_225Var;
    }

    public static boolean method_1888(String str) {
        if (str.length() != 0 && Character.isJavaIdentifierStart(str.charAt(0))) {
            int i = 1;
            int i2 = 1;
            while (i < str.length()) {
                if (!Character.isJavaIdentifierPart(str.charAt(i2))) {
                    return false;
                }
                int i3 = i2 + 1;
                i = i3;
                i2 = i3;
            }
            return true;
        }
        return false;
    }

    public static String method_1890(class_241 class_241Var) {
        return new class_358(class_241Var).toString();
    }

    public static boolean method_1883(String str) {
        if (!Character.isJavaIdentifierStart(str.charAt(0))) {
            return false;
        }
        int i = 1;
        int i2 = 1;
        while (i < str.length()) {
            if (!Character.isJavaIdentifierPart(str.charAt(i2))) {
                return false;
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        return true;
    }

    public static boolean method_1877(String str) {
        return method_1884(str, false);
    }

    public static boolean method_1880(String str) {
        return method_1888(str);
    }

    public static final boolean method_1885(String str) {
        return true;
    }

    public void method_411() {
        try {
            class_440 method_1810 = class_474.method_1810(this.field_1994.method_1062());
            new class_299(method_1810, new class_206(this, method_1810, null)).method_1078();
        } catch (ClassNotFoundException e) {
            throw new class_572(new StringBuilder().insert(0, "Missing class: ").append(e.toString()).toString());
        }
    }

    public static boolean method_460(String str) {
        if (str.startsWith("<")) {
            return false;
        }
        return method_1883(str);
    }

    public static boolean method_1884(String str, boolean z) {
        if (method_1883(str)) {
            return true;
        }
        if (z) {
            return str.equals("<init>") || str.equals("<clinit>");
        }
        return str.equals("<init>");
    }
}
