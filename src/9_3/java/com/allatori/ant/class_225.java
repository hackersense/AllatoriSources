package com.allatori.ant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_225 {
    public class_131 field_828;
    public class_524 field_829;
    public final String field_831;
    public Map field_830 = new HashMap();
    public Map field_827 = new HashMap();

    public class_275 method_1063(int i) {
        String num = Integer.toString(i);
        class_184 class_184Var = (class_184) this.field_830.get(num);
        if (this.field_830.get(num) == null) {
            class_184Var = new class_184(this, i);
            this.field_830.put(num, class_184Var);
        }
        return class_184Var.method_1833();
    }

    public final String method_1062() {
        return this.field_831;
    }

    public class_225(String str) {
        this.field_831 = str;
        method_1061();
    }

    public void method_1061() {
        this.field_828 = null;
        this.field_829 = null;
        this.field_830.clear();
        this.field_827.clear();
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:28:0x0126 */
    public String[] method_1064() {
        int i = 0;
        ArrayList arrayList = new ArrayList();
        if (this.field_828 != null) {
            String[] method_643 = this.field_828.method_643();
            int i2 = 0;
            int i3 = 0;
            while (i2 < method_643.length) {
                int i4 = i3 + 1;
                arrayList.add("Pass 1: " + method_643[i3]);
                i2 = i4;
                i3 = i4;
            }
        }
        if (this.field_829 != null) {
            String[] method_6432 = this.field_829.method_643();
            int i5 = 0;
            int i6 = 0;
            while (i5 < method_6432.length) {
                int i7 = i6 + 1;
                arrayList.add(new StringBuilder().insert(0, "Pass 2: ").append(method_6432[i6]).toString());
                i5 = i7;
                i6 = i7;
            }
        }
        for (class_184 class_184Var : this.field_830.values()) {

            if(class_184Var instanceof  class_184){
                class_184Var = (class_184) class_184Var;
                String[] method_6433 = class_184Var.method_643();
                int method_47 = class_184Var.method_47();
                int i8 = 0;
                int i9 = 0;
                while (i8 < method_6433.length) {
                    int i10 = i9 + 1;
                    arrayList.add(new StringBuilder().insert(0, "Pass 3a, method ").append(method_47).append(" ('").append(class_474.method_1810(this.field_831).method_904()[method_47]).append("'): ").append(method_6433[i9]).toString());
                    i8 = i10;
                    i9 = i10;
                }
            }


        }
        for (class_484 class_484Var : this.field_827.values()) {



            String[] method_6434 = class_484Var.method_643();
            int method_472 = class_484Var.method_47();
            int i11 = 0;
            int i12 = 0;
            while (i11 < method_6434.length) {
                int i13 = i12 + 1;
                arrayList.add(new StringBuilder().insert(0, "Pass 3b, method ").append(method_472).append(" ('").append(class_474.method_1810(this.field_831).method_904()[method_472]).append("'): ").append(method_6434[i12]).toString());
                i11 = i13;
                i12 = i13;
            }
        }
        String[] strArr = new String[arrayList.size()];
        while (true) {
            int i14 = i;
            if (i < arrayList.size()) {
                i = i14 + 1;
                strArr[i14] = (String) arrayList.get(i14);
            } else {
                return strArr;
            }
        }
    }

    public class_275 method_1057() {
        if (this.field_828 == null) {
            this.field_828 = new class_131(this);
        }
        return this.field_828.method_1833();
    }

    public static void method_1060(String[] strArr) {
        int lastIndexOf;
        System.out.println("JustIce by Enver Haase, (C) 2001-2002.\n<http://bcel.sourceforge.net>\n<http://jakarta.apache.org/bcel>\n");
        int i = 0;
        int i2 = 0;
        while (i < strArr.length) {
            try {
                if (strArr[i2].endsWith(".class") && (lastIndexOf = strArr[i2].lastIndexOf(".class")) != -1) {
                    strArr[i2] = strArr[i2].substring(0, lastIndexOf);
                }
                strArr[i2] = strArr[i2].replace('/', '.');
                System.out.println(new StringBuilder().insert(0, "Now verifying: ").append(strArr[i2]).append("\n").toString());
                class_225 method_1574 = class_412.method_1574(strArr[i2]);
                System.out.println(new StringBuilder().insert(0, "Pass 1:\n").append(method_1574.method_1057()).toString());
                class_275 method_1059 = method_1574.method_1059();
                System.out.println(new StringBuilder().insert(0, "Pass 2:\n").append(method_1059).toString());
                if (method_1059 == class_275.field_946) {
                    class_440 method_1810 = class_474.method_1810(strArr[i2]);
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < method_1810.method_904().length) {
                        System.out.println(new StringBuilder().insert(0, "Pass 3a, method number ").append(i4).append(" ['").append(method_1810.method_904()[i4]).append("']:\n").append(method_1574.method_1063(i4)).toString());
                        int i5 = i4 + 1;
                        System.out.println(new StringBuilder().insert(0, "Pass 3b, method number ").append(i4).append(" ['").append(method_1810.method_904()[i4]).append("']:\n").append(method_1574.method_1058(i4)).toString());
                        i3 = i5;
                        i4 = i5;
                    }
                }
                System.out.println("Warnings:");
                String[] method_1064 = method_1574.method_1064();
                if (method_1064.length == 0) {
                    System.out.println("<none>");
                }
                int i6 = 0;
                int i7 = 0;
                while (i6 < method_1064.length) {
                    int i8 = i7 + 1;
                    System.out.println(method_1064[i7]);
                    i6 = i8;
                    i7 = i8;
                }
                System.out.println("\n");
                method_1574.method_1061();
                class_474.method_1809();
                System.gc();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            int i9 = i2 + 1;
            i = i9;
            i2 = i9;
        }
    }

    public class_275 method_1058(int i) {
        String num = Integer.toString(i);
        class_484 class_484Var = (class_484) this.field_827.get(num);
        if (this.field_827.get(num) == null) {
            class_484Var = new class_484(this, i);
            this.field_827.put(num, class_484Var);
        }
        return class_484Var.method_1833();
    }

    public class_275 method_1059() {
        if (this.field_829 == null) {
            this.field_829 = new class_524(this);
        }
        return this.field_829.method_1833();
    }
}
