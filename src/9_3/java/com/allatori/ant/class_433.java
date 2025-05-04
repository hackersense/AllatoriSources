package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_124;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_433 implements class_124 {
    public long field_1687 = 0;
    public static int field_1689 = 10;
    public static String field_1688 = "IiiIiIiiII";

    public static void method_1620(int i) {
        if (i > field_1689) {
            field_1689 = i;
        }
    }

    public static String method_1619() {
        return field_1688;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0014 */
    @Override // p000.class_124
    public String method_178() {
        String str;
        long j = this.field_1687;
        this.field_1687 = 1 + j;
        String binaryString = Long.toBinaryString(j);
        while (true) {
            str = binaryString;
            if (binaryString.length() >= field_1689) {
                break;
            }
            binaryString = '0' + str;
        }
        StringBuffer stringBuffer = new StringBuffer(str.length());
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            if (i2 % 2 == 0) {
                stringBuffer.append(str.charAt(i2) == '0' ? 'i' : 'I');
            } else {
                stringBuffer.insert(0, str.charAt(i2) == '0' ? 'i' : 'I');
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        return stringBuffer.toString();
    }

    @Override // p000.class_124
    public void method_177() {
        this.field_1687 = 0L;
    }

    public static void method_1582(String str) {
        field_1688 = str;
    }
}
