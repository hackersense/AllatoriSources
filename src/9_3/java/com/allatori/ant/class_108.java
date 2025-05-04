package com.allatori.ant;

import com.allatori.commons.ASMStuffs;
import com.allatori.interfaces.unmapped.class_124;

import java.util.HashSet;
import java.util.Vector;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_108 {
    public class_124 field_524 = class_544.method_1924().method_1466().method_1271();
    public Vector field_523 = new Vector();
    public class_386 field_522 = new class_386();
    public HashSet field_528 = new HashSet();
    public Vector field_527 = new Vector();
    public class_386 field_526 = new class_386();
    public String field_521 = "\" s=\"";
    public String field_525 = "\" e=\"";

    public void method_613(String str, String str2) {
        this.field_523.add(new class_83(str, str2));
        this.field_522.method_1546(str, str2);
        this.field_528.add(str2);
    }

    public class_386 method_610() {
        return this.field_526;
    }

    public void method_611(String str, class_591 class_591Var) {
        int method_180 = class_544.method_1924().method_1471().method_180();
        class_544.method_1924().method_1471();
        if (method_180 != 2) {
            int method_1802 = class_544.method_1924().method_1471().method_180();
            class_544.method_1924().method_1471();
            if (method_1802 != 3) {
                int method_1803 = class_544.method_1924().method_1471().method_180();
                class_544.method_1924().method_1471();
                if (method_1803 != 1) {
                    return;
                }
                class_270[] method_2049 = class_591Var.method_2049();
                int i = class_408.field_1257;
                int i2 = Integer.MIN_VALUE;
                int length = method_2049.length - 1;
                int i3 = length;
                int i4 = length;
                while (i3 >= 0) {
                    class_270 class_270Var = method_2049[i4];
                    int method_47 = class_270Var.method_47();
                    if (method_47 < i) {
                        i = method_47;
                    }
                    if (method_47 > i2) {
                        i2 = method_47;
                    }
                    if (method_47 > this.field_527.size() - 1) {
                        int size = this.field_527.size();
                        int i5 = (method_47 - size) + ASMStuffs.field_150;
                        Vector vector = new Vector(i5);
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < i5) {
                            int i8 = i7 + 1;
                            vector.add(new Integer(i7 + size));
                            i6 = i8;
                            i7 = i8;
                        }
                        class_231.method_1070(vector);
                        this.field_527.addAll(vector);
                    }
                    int i9 = i4 - 1;
                    class_270Var.method_46(((Integer) this.field_527.get(method_47)).intValue());
                    i3 = i9;
                    i4 = i9;
                }
                if (i >= Integer.MAX_VALUE) {
                    return;
                }
                this.field_526.method_1546(new StringBuilder().insert(0, str).append("&").append(class_591Var.method_198()).append("&").append(class_591Var.method_464()).toString(), new StringBuilder().insert(0, this.field_521).append(i).append(this.field_525).append(i2).toString());
                return;
            }
            class_591Var.method_50();
        }
    }

    public Vector method_608() {
        return this.field_527;
    }

    public void method_612(class_202 class_202Var) {
        int method_180 = class_544.method_1924().method_1471().method_180();
        class_544.method_1924().method_1471();
        if (method_180 != 2) {
            int method_1802 = class_544.method_1924().method_1471().method_180();
            class_544.method_1924().method_1471();
            if (method_1802 == 3) {
                class_160[] method_906 = class_202Var.method_906();
                int length = method_906.length - 1;
                int i = length;
                int i2 = length;
                while (i >= 0) {
                    class_160 class_160Var = method_906[i2];
                    if (!(class_160Var instanceof class_599)) {
                        int i3 = i2 - 1;
                        i = i3;
                        i2 = i3;
                    } else {
                        class_202Var.method_902(class_160Var);
                        return;
                    }
                }
                return;
            }
            int method_1803 = class_544.method_1924().method_1471().method_180();
            class_544.method_1924().method_1471();
            if (method_1803 == 1) {
                class_160[] method_9062 = class_202Var.method_906();
                int length2 = method_9062.length - 1;
                int i4 = length2;
                int i5 = length2;
                while (i4 >= 0) {
                    class_160 class_160Var2 = method_9062[i5];
                    if (class_160Var2 instanceof class_599) {
                        class_599 class_599Var = (class_599) class_160Var2;
                        String method_464 = class_599Var.method_464();
                        String method_1543 = this.field_522.method_1543(method_464);
                        if (method_1543 == null) {
                            do {
                                method_1543 = this.field_524.method_178();
                            } while (this.field_528.contains(method_1543));
                            this.field_523.add(new class_83(method_464, method_1543));
                            this.field_522.method_1546(method_464, method_1543);
                            this.field_528.add(method_1543);
                        }
                        class_599Var.method_461(class_202Var.method_917().method_1004(method_1543));
                        return;
                    }
                    int i6 = i5 - 1;
                    i4 = i6;
                    i5 = i6;
                }
            }
        }
    }

    public Vector method_609() {
        return this.field_523;
    }
}
