package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInput;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_520 extends class_286 {
    public int field_1988;
    public int field_1989;

    public int method_433() {
        return this.field_1988;
    }

    public void method_407(int i) {
        this.field_1989 = i;
    }

    @Override // p000.class_286, p000.class_241
    public void method_163(class_21 class_21Var) {
    }

    public class_520(DataInput dataInput) {
        this(dataInput.readUnsignedShort(), dataInput.readUnsignedShort());
    }

    public void method_46(int i) {
        this.field_1988 = i;
    }

    @Override // p000.class_286
    public final void method_184(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE);
        dataOutputStream.writeShort(this.field_1989);
        dataOutputStream.writeShort(this.field_1988);
    }

    public class_520(class_520 class_520Var) {
        this(class_520Var.method_47(), class_520Var.method_433());
    }

    public int method_47() {
        return this.field_1989;
    }

    public class_520(int i, int i2) {
        super((byte) 18);
        this.field_1989 = i;
        this.field_1988 = i2;
    }
}
