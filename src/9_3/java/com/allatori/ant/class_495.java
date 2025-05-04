package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_124;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_495 implements class_124 {
    public static final int field_1950 = 10;
    public long field_1949 = 0;

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x000c */
    @Override // p000.class_124
    public String method_178() {
        int i;
        long j;
        long j2 = this.field_1949;
        int i2 = 1;
        long j3 = j2;
        long j4 = 10;
        while (true) {
            i = i2;
            j = j2;
            if (j3 < j4) {
                break;
            }
            i2 = i + 1;
            j2 = j - j4;
            j4 *= 10;
            j3 = j2;
        }
        int i3 = 0;
        int i4 = 0;
        String str = "";
        while (i3 < i) {
            str = new StringBuilder().insert(0, str).append("0123456789".charAt((int) (j % 10))).toString();
            int i5 = i4 + 1;
            j /= 10;
            i3 = i5;
            i4 = i5;
        }
        this.field_1949++;
        return str;
    }

    @Override // p000.class_124
    public void method_177() {
        this.field_1949 = 0L;
    }
}
