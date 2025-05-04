package com.allatori.ant;

import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_431 {
    public List field_1686 = new ArrayList();

    public boolean method_1618(int i) {
        Integer[] numArr = new Integer[this.field_1686.size()];
        this.field_1686.toArray(numArr);
        int i2 = 0;
        int i3 = 0;
        while (i2 < numArr.length) {
            if (i == numArr[i3].intValue()) {
                return true;
            }
            int i4 = i3 + 1;
            i2 = i4;
            i3 = i4;
        }
        return false;
    }

    public void method_1617(int i) {
        this.field_1686.add(new Integer(i));
    }
}
