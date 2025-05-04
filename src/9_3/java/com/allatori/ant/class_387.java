package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;
import com.allatori.interfaces.unmapped.class_241;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.Serializable;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_387 implements Cloneable, class_241, Serializable {
    public int field_1237;
    public int field_1238;

    public class_387 method_1205() {
        try {
            return (class_387) clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override // p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_55(this);
    }

    public final void method_407(int i) {
        this.field_1238 = i;
    }

    public final int method_47() {
        return this.field_1238;
    }

    public class_387(DataInputStream dataInputStream) {
        this(dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort());
    }

    public class_387(class_387 class_387Var) {
        this(class_387Var.method_433(), class_387Var.method_47());
    }

    public final int method_433() {
        return this.field_1237;
    }

    public final void method_184(DataOutputStream dataOutputStream) {
        dataOutputStream.writeShort(this.field_1237);
        dataOutputStream.writeShort(this.field_1238);
    }

    public final void method_46(int i) {
        this.field_1237 = i;
    }

    public class_387(int i, int i2) {
        this.field_1237 = i;
        this.field_1238 = i2;
    }
}
