package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_170;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_30 implements class_170 {
    public int field_52 = 0;

    @Override // p000.class_170
    public void method_146(String str) {
        System.gc();
        int i = 0;
        int i2 = 0;
        while (i < this.field_52) {
            int i3 = i2 + 1;
            System.out.print(" ");
            i = i3;
            i2 = i3;
        }
        System.out.println(str);
        this.field_52++;
        class_225 method_1574 = class_412.method_1574(str);
        class_275 method_1057 = method_1574.method_1057();
        if (method_1057 != class_275.field_946) {
            System.out.println(new StringBuilder().insert(0, "Pass 1:\n").append(method_1057).toString());
        }
        class_275 method_1059 = method_1574.method_1059();
        if (method_1059 != class_275.field_946) {
            System.out.println(new StringBuilder().insert(0, "Pass 2:\n").append(method_1059).toString());
        }
        if (method_1059 == class_275.field_946) {
            try {
                class_440 method_1810 = class_474.method_1810(method_1574.method_1062());
                for (int i4 = 0; i4 < method_1810.method_904().length; i4++) {
                    class_275 method_1063 = method_1574.method_1063(i4);
                    if (method_1063 != class_275.field_946) {
                        System.out.println(new StringBuilder().insert(0, method_1574.method_1062()).append(", Pass 3a, method ").append(i4).append(" ['").append(method_1810.method_904()[i4]).append("']:\n").append(method_1063).toString());
                    }
                    class_275 method_1058 = method_1574.method_1058(i4);
                    if (method_1058 != class_275.field_946) {
                        System.out.println(new StringBuilder().insert(0, method_1574.method_1062()).append(", Pass 3b, method ").append(i4).append(" ['").append(method_1810.method_904()[i4]).append("']:\n").append(method_1058).toString());
                    }
                }
            } catch (ClassNotFoundException e) {
                System.err.println(new StringBuilder().insert(0, "Could not find class ").append(method_1574.method_1062()).append(" in Repository").toString());
            }
        }
        this.field_52--;
    }

    public static void method_145(String[] strArr) {
        if (strArr.length != 1) {
            System.out.println("Need exactly one argument: The root class to verify.");
            System.exit(1);
        }
        int lastIndexOf = strArr[0].lastIndexOf(".class");
        if (lastIndexOf != -1) {
            strArr[0] = strArr[0].substring(0, lastIndexOf);
        }
        strArr[0] = strArr[0].replace('/', '.');
        class_30 class_30Var = new class_30();
        class_412.method_1572(class_30Var);
        class_412.method_1574(strArr[0]);
        class_412.method_1573(class_30Var);
    }
}
