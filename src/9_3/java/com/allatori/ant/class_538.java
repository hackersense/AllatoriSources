package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_538 extends class_286 {
    public int field_2011;
    public int field_2012;

    public class_538(int i, int i2) {
        super((byte) 12);
        this.field_2011 = i;
        this.field_2012 = i2;
    }

    public class_538(class_538 class_538Var) {
        this(class_538Var.method_47(), class_538Var.method_433());
    }

    public final String method_189(class_499 class_499Var) {
        return class_499Var.method_1848(method_47(), (byte) 1);
    }

    public final void method_407(int i) {
        this.field_2011 = i;
    }

    public final void method_46(int i) {
        this.field_2012 = i;
    }

    @Override // p000.class_286
    public final void method_184(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE);
        dataOutputStream.writeShort(this.field_2011);
        dataOutputStream.writeShort(this.field_2012);
    }

    public final String method_1899(class_499 class_499Var) {
        return class_499Var.method_1848(method_433(), (byte) 1);
    }

    @Override // p000.class_286, p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_66(this);
    }

    public final int method_433() {
        return this.field_2012;
    }

    public final int method_47() {
        return this.field_2011;
    }

    public class_538(DataInputStream dataInputStream) {
        this(dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort());
    }
}
