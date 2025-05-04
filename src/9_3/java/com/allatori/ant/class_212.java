package com.allatori.ant;

import com.allatori.exception.runtime.class_168;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_212 implements Serializable {
    public byte field_809;
    public String field_811;
    public static final class_331 field_794 = new class_331((byte) 12);
    public static final class_331 field_813 = new class_331((byte) 4);
    public static final class_331 field_802 = new class_331((byte) 10);
    public static final class_331 field_801 = new class_331((byte) 9);
    public static final class_331 field_795 = new class_331((byte) 8);
    public static final class_331 field_798 = new class_331((byte) 11);
    public static final class_331 field_810 = new class_331((byte) 7);
    public static final class_331 field_812 = new class_331((byte) 6);
    public static final class_331 field_806 = new class_331((byte) 5);
    public static final class_392 field_808 = new class_392("java.lang.Object");
    public static final class_392 field_804 = new class_392("java.lang.Class");
    public static final class_392 field_799 = new class_392("java.lang.String");
    public static final class_392 field_797 = new class_392("java.lang.StringBuffer");
    public static final class_392 field_805 = new class_392("java.lang.Throwable");
    public static final class_212[] field_807 = new class_212[0];
    public static final class_592 field_796 = new class_162();
    public static final class_212 field_803 = new class_128((byte) 15, "<unknown object>");
    public static ThreadLocal field_800 = new class_454();

    public int hashCode() {
        return this.field_809 ^ this.field_811.hashCode();
    }

    public static final class_212 method_1034(String str) {
        int i = 0;
        byte method_942 = class_204.method_942(str);
        if (method_942 <= 12) {
            method_1029(field_800, 1);
            return class_331.method_1384(method_942);
        }
        if (method_942 != 13) {
            int indexOf = str.indexOf(59);
            if (indexOf < 0) {
                throw new class_168(new StringBuilder().insert(0, "Invalid signature: ").append(str).toString());
            }
            method_1029(field_800, indexOf + 1);
            return new class_392(str.substring(1, indexOf).replace('/', '.'));
        }
        do {
            i++;
        } while (str.charAt(i) == '[');
        class_212 method_1034 = method_1034(str.substring(i));
        method_1029(field_800, method_1035(field_800) + i);
        return new class_594(method_1034, i);
    }

    public static int method_1007(String str) {
        int i = 0;
        byte method_942 = class_204.method_942(str);
        if (method_942 <= 12) {
            return method_49(class_331.method_1384(method_942).method_47(), 1);
        }
        if (method_942 == 13) {
            do {
                i++;
            } while (str.charAt(i) == '[');
            return method_49(1, i + method_994(method_1007(str.substring(i))));
        }
        int indexOf = str.indexOf(59);
        if (indexOf < 0) {
            throw new class_168(new StringBuilder().insert(0, "Invalid signature: ").append(str).toString());
        }
        return method_49(1, indexOf + 1);
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0006 */
    public static class_212[] method_1027(Class[] clsArr) {
        class_212[] class_212VarArr = new class_212[clsArr.length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i < class_212VarArr.length) {
                i = i2 + 1;
                class_212VarArr[i2] = method_1028(clsArr[i2]);
            } else {
                return class_212VarArr;
            }
        }
    }

    public static int method_49(int i, int i2) {
        return (i2 << 2) | i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof class_212)) {
            return false;
        }
        class_212 class_212Var = (class_212) obj;
        return this.field_809 == class_212Var.field_809 && this.field_811.equals(class_212Var.field_811);
    }

    public String method_198() {
        return this.field_811;
    }

    public byte method_619() {
        return this.field_809;
    }

    public String toString() {
        return (equals(field_796) || this.field_809 >= 15) ? this.field_811 : class_204.method_962(this.field_811, false);
    }

    public static String method_1032(class_212 class_212Var, class_212[] class_212VarArr) {
        StringBuffer stringBuffer = new StringBuffer("(");
        int length = class_212VarArr == null ? 0 : class_212VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            stringBuffer.append(class_212VarArr[i2].method_198());
            i = i3;
            i2 = i3;
        }
        stringBuffer.append(')');
        stringBuffer.append(class_212Var.method_198());
        return stringBuffer.toString();
    }

    public static int method_1010(String str) {
        return method_790(method_1007(str.substring(str.lastIndexOf(41) + 1)));
    }

    public static int method_1005(String str) {
        try {
            if (str.charAt(0) == '(') {
                int i = 1;
                int i2 = 0;
                while (str.charAt(i) != ')') {
                    int method_1007 = method_1007(str.substring(i));
                    i2 += method_790(method_1007);
                    i += method_994(method_1007);
                }
                return i2;
            }
            throw new class_168(new StringBuilder().insert(0, "Invalid method signature: ").append(str).toString());
        } catch (StringIndexOutOfBoundsException e) {
            throw new class_168(new StringBuilder().insert(0, "Invalid method signature: ").append(str).toString(), e);
        }
    }

    public class_212(byte b, String str) {
        this.field_809 = b;
        this.field_811 = str;
    }

    public static class_212 method_1028(Class cls) {
        if (cls != null) {
            if (cls.isArray()) {
                return method_1034(cls.getName());
            }
            if (cls.isPrimitive()) {
                if (cls != Integer.TYPE) {
                    if (cls != Void.TYPE) {
                        if (cls == Double.TYPE) {
                            return field_810;
                        }
                        if (cls == Float.TYPE) {
                            return field_812;
                        }
                        if (cls == Boolean.TYPE) {
                            return field_813;
                        }
                        if (cls == Byte.TYPE) {
                            return field_795;
                        }
                        if (cls != Short.TYPE) {
                            if (cls != Byte.TYPE) {
                                if (cls != Long.TYPE) {
                                    if (cls == Character.TYPE) {
                                        return field_806;
                                    }
                                    throw new IllegalStateException(new StringBuilder().insert(0, "Ooops, what primitive type is ").append(cls).toString());
                                }
                                return field_798;
                            }
                            return field_795;
                        }
                        return field_801;
                    }
                    return field_794;
                }
                return field_802;
            }
            return new class_392(cls.getName());
        }
        throw new IllegalArgumentException("Class must not be null");
    }

    public int method_47() {
        switch (this.field_809) {
            case 7:
            case 11:
                return 2;
            case 8:
            case 9:
            case 10:
            default:
                return 1;
            case 12:
                return 0;
        }
    }

    public static class_212[] method_1030(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.charAt(0) != '(') {
                throw new class_168(new StringBuilder().insert(0, "Invalid method signature: ").append(str).toString());
            }
            for (int i = 1; str.charAt(i) != ')'; i += method_1035(field_800)) {
                arrayList.add(method_1034(str.substring(i)));
            }
            class_212[] class_212VarArr = new class_212[arrayList.size()];
            arrayList.toArray(class_212VarArr);
            return class_212VarArr;
        } catch (StringIndexOutOfBoundsException e) {
            throw new class_168(new StringBuilder().insert(0, "Invalid method signature: ").append(str).toString());
        }
    }

    public static class_212 method_1033(String str) {
        try {
            return method_1034(str.substring(str.lastIndexOf(41) + 1));
        } catch (StringIndexOutOfBoundsException e) {
            throw new class_168(new StringBuilder().insert(0, "Invalid method signature: ").append(str).toString());
        }
    }

    public static int method_790(int i) {
        return i & 3;
    }

    public static void method_1029(ThreadLocal threadLocal, int i) {
        threadLocal.set(new Integer(i));
    }

    public static int method_1035(ThreadLocal threadLocal) {
        return ((Integer) threadLocal.get()).intValue();
    }

    public static int method_994(int i) {
        return i >> 2;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x000e */
    public static String method_1031(Method method) {
        StringBuffer stringBuffer = new StringBuffer("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i < parameterTypes.length) {
                i = i2 + 1;
                stringBuffer.append(method_1028(parameterTypes[i2]).method_198());
            } else {
                stringBuffer.append(")");
                stringBuffer.append(method_1028(method.getReturnType()).method_198());
                return stringBuffer.toString();
            }
        }
    }
}
