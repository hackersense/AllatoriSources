package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInput;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_248 extends class_286 {
    public int field_896;
    public int field_897;

    public void method_407(int i) {
        this.field_896 = i;
    }

    @Override // p000.class_286, p000.class_241
    public void method_163(class_21 class_21Var) {
    }

    public class_248(int i, int i2) {
        super((byte) 15);
        this.field_897 = i;
        this.field_896 = i2;
    }

    public class_248(DataInput dataInput) {
        this(dataInput.readUnsignedByte(), dataInput.readUnsignedShort());
    }

    @Override // p000.class_286
    public final void method_184(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE);
        dataOutputStream.writeByte(this.field_897);
        dataOutputStream.writeShort(this.field_896);
    }

    public void method_46(int i) {
        this.field_897 = i;
    }

    public int method_47() {
        return this.field_896;
    }

    public class_248(class_248 class_248Var) {
        this(class_248Var.method_433(), class_248Var.method_47());
    }

    public int method_433() {
        return this.field_897;
    }
}
