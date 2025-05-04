package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_291;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_180 implements class_291 {
    public class_606 field_733;
    public Vector field_732 = new Vector();
    public Vector field_731 = new Vector();

    public void method_865(class_202 class_202Var, int i) {
        class_544.method_1937();
        if (i == 1) {
            class_557[] method_904 = class_202Var.method_904();
            int length = method_904.length - 1;
            int i2 = length;
            int i3 = length;
            while (i2 >= 0) {
                int i4 = i3 - 1;
                class_202Var.method_907(method_904[i3]);
                i2 = i4;
                i3 = i4;
            }
            List asList = Arrays.asList(method_904);
            class_231.method_1070(asList);
            int size = asList.size() - 1;
            int i5 = size;
            int i6 = size;
            while (i5 >= 0) {
                int i7 = i6 - 1;
                class_202Var.method_899(method_904[i6]);
                i5 = i7;
                i6 = i7;
            }
            return;
        }
        class_544.method_1937();
        if (i < 100) {
            return;
        }
        class_557[] method_9042 = class_202Var.method_904();
        int length2 = method_9042.length - 1;
        int i8 = length2;
        int i9 = length2;
        while (i8 >= 0) {
            int i10 = i9 - 1;
            class_202Var.method_907(method_9042[i9]);
            i8 = i10;
            i9 = i10;
        }
        List asList2 = Arrays.asList(method_9042);
        Collections.sort(asList2, new class_103(this, i));
        int size2 = asList2.size() - 1;
        int i11 = size2;
        int i12 = size2;
        while (i11 >= 0) {
            int i13 = i12 - 1;
            class_202Var.method_899(method_9042[i12]);
            i11 = i13;
            i12 = i13;
        }
    }

    public class_180(class_606 class_606Var) {
        this.field_733 = class_606Var;
    }

    @Override // p000.class_291
    public void method_34(class_202 class_202Var) {
        int method_1685 = class_544.method_1937().method_1685(this.field_733, class_202Var);
        class_544.method_1937();
        if (method_1685 != 100) {
            class_544.method_1937();
            if (method_1685 != 101) {
                method_864(class_202Var, method_1685);
                method_865(class_202Var, method_1685);
                return;
            } else {
                this.field_731.add(class_202Var);
                return;
            }
        }
        this.field_732.add(class_202Var);
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:2:0x000b */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:6:0x002c */
    @Override // p000.class_291
    public void method_39() {
        Iterator it = this.field_732.iterator();
        while (it.hasNext()) {
            class_202 class_202Var = (class_202) it.next();
            class_544.method_1937();
            method_864(class_202Var, 100);
            class_544.method_1937();
            method_865(class_202Var, 100);
        }
        Iterator it2 = this.field_731.iterator();
        while (it2.hasNext()) {
            class_202 class_202Var2 = (class_202) it2.next();
            class_544.method_1937();
            method_864(class_202Var2, 101);
            class_544.method_1937();
            method_865(class_202Var2, 101);
        }
        this.field_732 = null;
        this.field_731 = null;
    }

    public void method_864(class_202 class_202Var, int i) {
        class_544.method_1937();
        if (i == 1) {
            class_261[] method_898 = class_202Var.method_898();
            int length = method_898.length - 1;
            int i2 = length;
            int i3 = length;
            while (i2 >= 0) {
                int i4 = i3 - 1;
                class_202Var.method_926(method_898[i3]);
                i2 = i4;
                i3 = i4;
            }
            List asList = Arrays.asList(method_898);
            class_231.method_1070(asList);
            int size = asList.size() - 1;
            int i5 = size;
            int i6 = size;
            while (i5 >= 0) {
                int i7 = i6 - 1;
                class_202Var.method_922((class_261) asList.get(i6));
                i5 = i7;
                i6 = i7;
            }
            return;
        }
        class_544.method_1937();
        if (i < 100) {
            return;
        }
        class_261[] method_8982 = class_202Var.method_898();
        int length2 = method_8982.length - 1;
        int i8 = length2;
        int i9 = length2;
        while (i8 >= 0) {
            int i10 = i9 - 1;
            class_202Var.method_926(method_8982[i9]);
            i8 = i10;
            i9 = i10;
        }
        List asList2 = Arrays.asList(method_8982);
        Collections.sort(asList2, new class_415(this, i));
        int size2 = asList2.size() - 1;
        int i11 = size2;
        int i12 = size2;
        while (i11 >= 0) {
            int i13 = i12 - 1;
            class_202Var.method_922((class_261) asList2.get(i12));
            i11 = i13;
            i12 = i13;
        }
    }
}
