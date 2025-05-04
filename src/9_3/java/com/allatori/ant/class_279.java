package com.allatori.ant;

import com.allatori.commons.ASMStuffs;
import com.allatori.interfaces.unmapped.class_555;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_279 {
    public static final int field_961 = 0;
    public static final int field_965 = 5;
    public static final int field_967 = 7;
    public static final int field_968 = 4;
    public static final int field_969 = 12;
    public static final int field_971 = 8;
    public static final int field_972 = 2;
    public static final int field_973 = 1;
    public static final int field_975 = 9;
    public static final int field_977 = 10;
    public static final int field_983 = 3;
    public static final int field_985 = 11;
    public static final int field_986 = 6;
    public final int field_960;
    public final int field_963;
    public final int field_974;
    public final String field_976;
    public static final String field_964 = "VZCBSIFJD";
    public static final class_279 field_981 = new class_279(0, "VZCBSIFJD", 0, 1);
    public static final class_279 field_970 = new class_279(1, "VZCBSIFJD", 1, 2);
    public static final class_279 field_966 = new class_279(2, "VZCBSIFJD", 2, 3);
    public static final class_279 field_978 = new class_279(3, "VZCBSIFJD", 3, 4);
    public static final class_279 field_979 = new class_279(4, "VZCBSIFJD", 4, 5);
    public static final class_279 field_962 = new class_279(5, "VZCBSIFJD", 5, 6);
    public static final class_279 field_980 = new class_279(6, "VZCBSIFJD", 6, 7);
    public static final class_279 field_984 = new class_279(7, "VZCBSIFJD", 7, 8);
    public static final class_279 field_982 = new class_279(8, "VZCBSIFJD", 8, 9);

    public static String method_1245(String str) {
        return new StringBuilder().insert(0, "Invalid descriptor: ").append(str).toString();
    }

    public static String method_1247(String str) {
        return new StringBuilder().insert(0, "L").append(str).append(";").toString();
    }

    public static class_279 method_1244(String str) {
        return new class_279(11, str, 0, str.length());
    }

    public String method_1234() {
        if (this.field_974 == 10) {
            return this.field_976.substring(this.field_963 - 1, this.field_960 + 1);
        }
        if (this.field_974 == 12) {
            return method_1247(this.field_976.substring(this.field_963, this.field_960));
        }
        return this.field_976.substring(this.field_963, this.field_960);
    }

    public static class_279 method_1240(String str) {
        int i;
        String str2;
        if (str.charAt(0) == '[') {
            i = 9;
            str2 = str;
        } else {
            i = 12;
            str2 = str;
        }
        return new class_279(i, str2, 0, str.length());
    }

    public static class_279 method_1260(Class cls) {
        if (cls.isPrimitive()) {
            if (cls != Integer.TYPE) {
                if (cls != Void.TYPE) {
                    if (cls != Boolean.TYPE) {
                        if (cls == Byte.TYPE) {
                            return field_978;
                        }
                        if (cls != Character.TYPE) {
                            if (cls != Short.TYPE) {
                                if (cls != Double.TYPE) {
                                    if (cls != Float.TYPE) {
                                        if (cls != Long.TYPE) {
                                            throw new AssertionError();
                                        }
                                        return field_984;
                                    }
                                    return field_980;
                                }
                                return field_982;
                            }
                            return field_979;
                        }
                        return field_966;
                    }
                    return field_970;
                }
                return field_981;
            }
            return field_962;
        }
        return method_1229(method_1232(cls));
    }

    public static class_279 method_1231(Method method) {
        return method_1229(method_1249(method));
    }

    public class_279 method_1261() {
        return method_1227(method_1234());
    }

    public String method_1233() {
        switch (this.field_974) {
            case 0:
                return "void";
            case 1:
                return "boolean";
            case 2:
                return "char";
            case 3:
                return "byte";
            case 4:
                return "short";
            case 5:
                return "int";
            case 6:
                return "float";
            case 7:
                return "long";
            case 8:
                return "double";
            case 9:
                StringBuilder sb = new StringBuilder(method_1246().method_1233());
                int method_1253 = method_1253();
                int i = method_1253;
                int i2 = method_1253;
                while (i > 0) {
                    int i3 = i2 - 1;
                    sb.append("[]");
                    i = i3;
                    i2 = i3;
                }
                return sb.toString();
            case 10:
            case 12:
                return this.field_976.substring(this.field_963, this.field_960).replace('/', '.');
            case 11:
            default:
                throw new AssertionError();
        }
    }

    public static class_279 method_1227(String str) {
        return method_1259(str, method_1254(str), str.length());
    }

    public static String method_1226(Class cls) {
        return cls.getName().replace('.', '/');
    }

    public static class_279 method_1259(String str, int i, int i2) {
        switch (str.charAt(i)) {
            case ASMStuffs.field_104 /* 40 */:
                return new class_279(11, str, i, i2);
            case 'B':
                return field_978;
            case 'C':
                return field_966;
            case 'D':
                return field_982;
            case 'F':
                return field_980;
            case 'I':
                return field_962;
            case 'J':
                return field_984;
            case ASMStuffs.field_86 /* 76 */:
                return new class_279(10, str, i + 1, i2 - 1);
            case 'S':
                return field_979;
            case class_555.field_2226 /* 86 */:
                return field_981;
            case 'Z':
                return field_970;
            case '[':
                return new class_279(9, str, i, i2);
            default:
                throw new IllegalArgumentException(method_1245(str));
        }
    }

    public static class_279 method_1229(String str) {
        return method_1259(str, 0, str.length());
    }

    public static class_279 method_1258(class_279 class_279Var, class_279[] class_279VarArr) {
        return method_1229(method_1236(class_279Var, class_279VarArr));
    }

    public static class_279 method_1256(Method method) {
        return method_1260(method.getReturnType());
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0002 */
    public static void method_1237(Class cls, StringBuilder sb) {
        Class cls2;
        char c;
        while (true) {
            cls2 = cls;
            if (!cls.isArray()) {
                break;
            }
            sb.append('[');
            cls = cls2.getComponentType();
        }
        if (cls2.isPrimitive()) {
            if (cls2 == Integer.TYPE) {
                c = 'I';
            } else if (cls2 == Void.TYPE) {
                c = 'V';
            } else if (cls2 == Boolean.TYPE) {
                c = 'Z';
            } else if (cls2 == Byte.TYPE) {
                c = 'B';
            } else if (cls2 != Character.TYPE) {
                if (cls2 == Short.TYPE) {
                    c = 'S';
                } else if (cls2 != Double.TYPE) {
                    if (cls2 == Float.TYPE) {
                        c = 'F';
                    } else {
                        if (cls2 != Long.TYPE) {
                            throw new AssertionError();
                        }
                        c = 'J';
                    }
                } else {
                    c = 'D';
                }
            } else {
                c = 'C';
            }
            sb.append(c);
            return;
        }
        sb.append('L').append(method_1226(cls2)).append(';');
    }

    public static String method_1249(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            method_1237(parameterTypes[i2], sb);
            i = i3;
            i2 = i3;
        }
        sb.append(')');
        method_1237(method.getReturnType(), sb);
        return sb.toString();
    }

    public static class_279 method_1252(Constructor constructor) {
        return method_1229(method_1257(constructor));
    }

    public class_279(int i, String str, int i2, int i3) {
        this.field_974 = i;
        this.field_976 = str;
        this.field_963 = i2;
        this.field_960 = i3;
    }

    public class_279[] method_1251() {
        return method_1238(method_1234());
    }

    public class_279 method_1246() {
        return method_1259(this.field_976, method_1253() + this.field_963, this.field_960);
    }

    public static class_279[] method_1238(String str) {
        class_279[] class_279VarArr = new class_279[method_1248(str)];
        int i = 0;
        String str2 = str;
        int i2 = 1;
        while (str2.charAt(i2) != ')') {
            String str3 = str;
            int i3 = i2;
            while (str3.charAt(i3) == '[') {
                i3++;
                str3 = str;
            }
            int i4 = i3 + 1;
            if (str.charAt(i3) == 'L') {
                i4 = Math.max(i4, str.indexOf(59, i4) + 1);
            }
            class_279VarArr[i] = method_1259(str, i2, i4);
            str2 = str;
            i++;
            i2 = i4;
        }
        return class_279VarArr;
    }

    public void method_1228(StringBuilder sb) {
        if (this.field_974 != 10) {
            if (this.field_974 != 12) {
                sb.append((CharSequence) this.field_976, this.field_963, this.field_960);
                return;
            } else {
                sb.append('L').append((CharSequence) this.field_976, this.field_963, this.field_960).append(';');
                return;
            }
        }
        sb.append((CharSequence) this.field_976, this.field_963 - 1, this.field_960 + 1);
    }

    public static class_279[] method_1239(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        class_279[] class_279VarArr = new class_279[parameterTypes.length];
        int length = parameterTypes.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            int i3 = i2 - 1;
            class_279VarArr[i2] = method_1260(parameterTypes[i2]);
            i = i3;
            i2 = i3;
        }
        return class_279VarArr;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0002 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:6:0x000b */
    public static int method_1254(String str) {
        int i = 1;
        while (true) {
            while (str.charAt(i) != ')') {
                while (str.charAt(i) == '[') {
                    i++;
                }
                char charAt = str.charAt(i);
                i++;
                if (charAt == 'L') {
                    i = Math.max(i, str.indexOf(59, i) + 1);
                }
            }
            return i + 1;
        }
    }

    public static String method_1257(Constructor constructor) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            method_1237(parameterTypes[i2], sb);
            i = i3;
            i2 = i3;
        }
        return sb.append(")V").toString();
    }

    public String method_1250() {
        return this.field_976.substring(this.field_963, this.field_960);
    }

    public static String method_1236(class_279 class_279Var, class_279[] class_279VarArr) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        int length = class_279VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            class_279VarArr[i2].method_1228(sb);
            i = i3;
            i2 = i3;
        }
        sb.append(')');
        class_279Var.method_1228(sb);
        return sb.toString();
    }

    public static String method_1232(Class cls) {
        StringBuilder sb = new StringBuilder();
        method_1237(cls, sb);
        return sb.toString();
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:2:0x0003 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:5:0x000c */
    public static int method_1248(String str) {
        int i = 0;
        int i2 = 1;
        while (str.charAt(i2) != ')') {
            while (str.charAt(i2) == '[') {
                i2++;
            }
            char charAt = str.charAt(i2);
            i2++;
            if (charAt == 'L') {
                i2 = Math.max(i2, str.indexOf(59, i2) + 1);
            }
            i++;
        }
        return i;
    }

    public int method_1242() {
        return method_1248(method_1234());
    }

    public int method_1235() {
        switch (this.field_974) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 12:
                return 1;
            case 7:
            case 8:
                return 2;
            case 11:
            default:
                throw new AssertionError();
        }
    }

    public int method_1243() {
        return method_1230(method_1234());
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:7:0x0025 */
    public static int method_1230(String str) {
        int i;
        String str2;
        int i2;
        char charAt = str.charAt(1);
        char c = charAt;
        int i3 = 1;
        char c2 = charAt;
        int i4 = 1;
        while (c != ')') {
            if (c2 != 'J' && c2 != 'D') {
                while (str.charAt(i4) == '[') {
                    i4++;
                }
                int i5 = i4 + 1;
                if (str.charAt(i4) == 'L') {
                    i5 = Math.max(i5, str.indexOf(59, i5) + 1);
                }
                i2 = i3 + 1;
                str2 = str;
                i = i5;
            } else {
                i = i4 + 1;
                str2 = str;
                i2 = i3 + 2;
            }
            char charAt2 = str2.charAt(i);
            c = charAt2;
            i3 = i2;
            c2 = charAt2;
            i4 = i;
        }
        char charAt3 = str.charAt(i4 + 1);
        if (charAt3 != 'V') {
            return ((charAt3 == 'J' || charAt3 == 'D') ? 2 : 1) | (i3 << 2);
        }
        return i3 << 2;
    }

    public int hashCode() {
        int i = (this.field_974 == 12 ? 10 : this.field_974) * 13;
        if (this.field_974 >= 9) {
            int i2 = this.field_963;
            int i3 = this.field_960;
            int i4 = i2;
            int i5 = i2;
            while (i4 < i3) {
                int i6 = i5 + 1;
                i = (i + this.field_976.charAt(i5)) * 17;
                i4 = i6;
                i5 = i6;
            }
        }
        return i;
    }

    public int method_1255() {
        if (this.field_974 == 12) {
            return 10;
        }
        return this.field_974;
    }

    public boolean equals(Object obj) {
        int i;
        class_279 class_279Var;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof class_279)) {
            return false;
        }
        class_279 class_279Var2 = (class_279) obj;
        if (this.field_974 == 12) {
            class_279Var = class_279Var2;
            i = 10;
        } else {
            i = this.field_974;
            class_279Var = class_279Var2;
        }
        if (i != (class_279Var.field_974 != 12 ? class_279Var2.field_974 : 10)) {
            return false;
        }
        int i2 = this.field_963;
        int i3 = this.field_960;
        int i4 = class_279Var2.field_963;
        if (i3 - i2 != class_279Var2.field_960 - i4) {
            return false;
        }
        int i5 = i2;
        int i6 = i2;
        while (i5 < i3) {
            if (this.field_976.charAt(i6) != class_279Var2.field_976.charAt(i4)) {
                return false;
            }
            int i7 = i6 + 1;
            i4++;
            i5 = i7;
            i6 = i7;
        }
        return true;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:2:0x0002 */
    public int method_1253() {
        int i = 1;
        while (this.field_976.charAt(this.field_963 + i) == '[') {
            i++;
        }
        return i;
    }

    public int method_1241(int i) {
        if (i != 46 && i != 79) {
            switch (this.field_974) {
                case 0:
                    if (i != 172) {
                        throw new UnsupportedOperationException();
                    }
                    return class_555.field_2150;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    return i;
                case 6:
                    return i + 2;
                case 7:
                    return i + 1;
                case 8:
                    return i + 3;
                case 9:
                case 10:
                case 12:
                    if (i == 21 || i == 54 || i == 172) {
                        return i + 4;
                    }
                    throw new UnsupportedOperationException();
                case 11:
                    throw new UnsupportedOperationException();
                default:
                    throw new AssertionError();
            }
        }
        switch (this.field_974) {
            case 0:
            case 11:
                throw new UnsupportedOperationException();
            case 1:
            case 3:
                return i + 5;
            case 2:
                return i + 6;
            case 4:
                return i + 7;
            case 5:
                return i;
            case 6:
                return i + 2;
            case 7:
                return i + 1;
            case 8:
                return i + 3;
            case 9:
            case 10:
            case 12:
                return i + 4;
            default:
                throw new AssertionError();
        }
    }
}
