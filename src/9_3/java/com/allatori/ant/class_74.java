package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_124;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_74 implements class_124 {
    public long field_257 = 0;
    public String[] field_258;
    public int field_259;

    @Override // p000.class_124
    public void method_177() {
        this.field_257 = 0L;
    }

    public class_74(String[] strArr) {
        this.field_258 = strArr;
        this.field_259 = strArr.length;
    }

    /* JADX DEBUG: Move duplicate insns, count: 3 to block B:2:0x000c */
    @Override // p000.class_124
    public String method_178() {
        int i;
        long j;
        long j2 = this.field_257;
        int i2 = 1;
        long j3 = this.field_259;
        while (true) {
            i = i2;
            j = j2;
            if (j2 < j3) {
                break;
            }
            i2 = i + 1;
            j2 = j - j3;
            j3 *= this.field_259;
        }
        int i3 = 0;
        int i4 = 0;
        String str = "";
        while (i3 < i) {
            str = new StringBuilder().insert(0, str).append(this.field_258[(int) (j % this.field_259)]).toString();
            int i5 = i4 + 1;
            j /= this.field_259;
            i3 = i5;
            i4 = i5;
        }
        this.field_257++;
        return str;
    }
}
