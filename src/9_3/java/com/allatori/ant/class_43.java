package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_159;
import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_43 extends class_286 implements class_159 {
    public int field_77;

    public String method_189(class_499 class_499Var) {
        return (String) method_188(class_499Var);
    }

    @Override // p000.class_159
    public Object method_188(class_499 class_499Var) {
        return ((class_371) class_499Var.method_1849(this.field_77, (byte) 1)).method_198();
    }

    public class_43(class_43 class_43Var) {
        this(class_43Var.method_47());
    }

    @Override // p000.class_286, p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_72(this);
    }

    public final int method_47() {
        return this.field_77;
    }

    public class_43(DataInputStream dataInputStream) {
        this(dataInputStream.readUnsignedShort());
    }

    public class_43(int i) {
        super((byte) 7);
        this.field_77 = i;
    }

    public final void method_46(int i) {
        this.field_77 = i;
    }

    @Override // p000.class_286
    public final void method_184(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE);
        dataOutputStream.writeShort(this.field_77);
    }
}
