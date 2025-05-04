package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_159;
import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_118 extends class_286 implements class_159 {
    public int field_572;

    public final void method_46(int i) {
        this.field_572 = i;
    }

    @Override // p000.class_159
    public Object method_188(class_499 class_499Var) {
        return ((class_371) class_499Var.method_1849(this.field_572, (byte) 1)).method_198();
    }

    @Override // p000.class_286, p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_89(this);
    }

    public String method_189(class_499 class_499Var) {
        return (String) method_188(class_499Var);
    }

    public class_118(class_118 class_118Var) {
        this(class_118Var.method_47());
    }

    @Override // p000.class_286
    public final void method_184(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE);
        dataOutputStream.writeShort(this.field_572);
    }

    public class_118(DataInputStream dataInputStream) {
        this(dataInputStream.readUnsignedShort());
    }

    public final int method_47() {
        return this.field_572;
    }

    public class_118(int i) {
        super((byte) 8);
        this.field_572 = i;
    }
}
