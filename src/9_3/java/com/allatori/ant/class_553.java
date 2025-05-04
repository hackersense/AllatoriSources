package com.allatori.ant;

import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_553 {
    public class_499 field_2066;
    public class_130 field_2067;
    public int field_2068;

    public String method_1950() {
        return ((class_371) this.field_2066.method_1849(this.field_2068, (byte) 1)).method_198();
    }

    public String method_1951() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(method_1950()).append("=").append(method_1953().method_640());
        return stringBuffer.toString();
    }

    public class_553(int i, class_130 class_130Var, class_499 class_499Var) {
        this.field_2067 = class_130Var;
        this.field_2068 = i;
        this.field_2066 = class_499Var;
    }

    public final class_130 method_1953() {
        return this.field_2067;
    }

    public void method_1954(DataOutputStream dataOutputStream) {
        dataOutputStream.writeShort(this.field_2068);
        this.field_2067.method_641(dataOutputStream);
    }

    public int method_1952() {
        return this.field_2068;
    }
}
