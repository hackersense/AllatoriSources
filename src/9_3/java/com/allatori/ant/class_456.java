package com.allatori.ant;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_456 extends class_286 {
    public int field_1790;
    public int field_1791;

    public class_456(class_456 class_456Var) {
        this(class_456Var.method_619(), class_456Var.method_47(), class_456Var.method_433());
    }

    public class_456(byte b, int i, int i2) {
        super(b);
        this.field_1790 = i;
        this.field_1791 = i2;
    }

    public class_456(byte b, DataInputStream dataInputStream) {
        this(b, dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort());
    }

    public final void method_46(int i) {
        this.field_1790 = i;
    }

    public final void method_407(int i) {
        this.field_1791 = i;
    }

    @Override // p000.class_286
    public final void method_184(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE);
        dataOutputStream.writeShort(this.field_1790);
        dataOutputStream.writeShort(this.field_1791);
    }

    public String method_189(class_499 class_499Var) {
        return class_499Var.method_1848(this.field_1790, (byte) 7);
    }

    public final int method_47() {
        return this.field_1790;
    }

    public final int method_433() {
        return this.field_1791;
    }
}
