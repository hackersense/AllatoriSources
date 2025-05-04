package com.allatori.ant;

import com.allatori.exception.ExceptionProxy;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_436 {
    public static Object[][] field_1691 = {new Object[]{"string-encryption", class_123.class}, new Object[]{"", ""}, new Object[]{"", ""}};
    public static String field_1690 = "enable";
    public static String field_1693 = "disable";
    public static String field_1692 = "maximum";

    public static class_120 method_1621(String str) {
        int length = field_1691.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            if (str.equals(field_1691[i2][0])) {
                try {
                    return (class_120) ((Class) field_1691[i2][1]).newInstance();
                } catch (Exception e) {
                    throw new ExceptionProxy("Cannot instantiate property class");
                }
            }
            int i3 = i2 - 1;
            i = i3;
            i2 = i3;
        }
        throw new ExceptionProxy("Unknown property");
    }
}
