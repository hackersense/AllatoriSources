package com.allatori.ant;

import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_231 {
    public static boolean field_836 = false;
    public static class_172 field_837;

    public static double method_1073() {
        if (!field_836) {
            method_1069();
        }
        return field_837.method_794();
    }

    public static int method_1071(int i) {
        if (!field_836) {
            method_1069();
        }
        int method_49 = field_837.method_49(0, i);
        return method_49 < i ? method_49 : method_49 - 1;
    }

    public static void method_1072(Object[] objArr, int i, int i2) {
        Object obj = objArr[i];
        objArr[i] = objArr[i2];
        objArr[i2] = obj;
    }

    public static void method_1069() {
        String method_1679 = class_544.method_1937().method_1679();
        if (method_1679 != null && method_1679.length() != 0) {
            field_837 = new class_532(method_1679.hashCode());
        } else {
            field_837 = new class_532(System.currentTimeMillis());
        }
        field_836 = true;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:12:0x0042 */
    public static void method_1070(List list) {
        if (!field_836) {
            method_1069();
        }
        int size = list.size();
        if (size < 5 || (list instanceof RandomAccess)) {
            int i = size;
            int i2 = size;
            while (i > 1) {
                int i3 = i2 - 1;
                method_1068(list, i2 - 1, method_1071(i2));
                i = i3;
                i2 = i3;
            }
            return;
        }
        Object[] array = list.toArray();
        int i4 = size;
        int i5 = size;
        while (i4 > 1) {
            int i6 = i5 - 1;
            method_1072(array, i5 - 1, method_1071(i5));
            i4 = i6;
            i5 = i6;
        }
        ListIterator listIterator = list.listIterator();
        int i7 = 0;
        while (true) {
            int i8 = i7;
            if (i7 < array.length) {
                listIterator.next();
                i7 = i8 + 1;
                listIterator.set(array[i8]);
            } else {
                return;
            }
        }
    }

    public static void method_1068(List list, int i, int i2) {
        list.set(i, list.set(i2, list.get(i)));
    }
}
