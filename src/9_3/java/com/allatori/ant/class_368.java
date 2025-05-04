package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.interfaces.unmapped.class_21;
import com.allatori.interfaces.unmapped.class_241;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.Serializable;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_368 implements ASMInterface, Cloneable, class_241, Serializable {
    public int field_1185;
    public int field_1186;
    public int field_1187;
    public int field_1188;
    public class_499 field_1189;
    public int field_1190;

    public final int method_927() {
        return this.field_1188;
    }

    public final void method_46(int i) {
        this.field_1188 = i;
    }

    public class_368(class_368 class_368Var) {
        this(class_368Var.method_928(), class_368Var.method_433(), class_368Var.method_927(), class_368Var.method_183(), class_368Var.method_47(), class_368Var.method_502());
    }

    public final int method_433() {
        return this.field_1190;
    }

    public final void method_498(class_499 class_499Var) {
        this.field_1189 = class_499Var;
    }

    public final void method_184(DataOutputStream dataOutputStream) {
        dataOutputStream.writeShort(this.field_1187);
        dataOutputStream.writeShort(this.field_1190);
        dataOutputStream.writeShort(this.field_1188);
        dataOutputStream.writeShort(this.field_1186);
        dataOutputStream.writeShort(this.field_1185);
    }

    public final int method_183() {
        return this.field_1186;
    }

    public final String method_198() {
        return ((class_371) this.field_1189.method_1849(this.field_1186, (byte) 1)).method_198();
    }

    public class_368 method_1492() {
        try {
            return (class_368) clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public final void method_461(int i) {
        this.field_1186 = i;
    }

    public final class_499 method_502() {
        return this.field_1189;
    }

    public final void method_915(int i) {
        this.field_1187 = i;
    }

    public class_368(int i, int i2, int i3, int i4, int i5, class_499 class_499Var) {
        this.field_1187 = i;
        this.field_1190 = i2;
        this.field_1188 = i3;
        this.field_1186 = i4;
        this.field_1185 = i5;
        this.field_1189 = class_499Var;
    }

    public final String method_464() {
        return ((class_371) this.field_1189.method_1849(this.field_1188, (byte) 1)).method_198();
    }

    @Override // p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_79(this);
    }

    public final void method_853(int i) {
        this.field_1185 = i;
    }

    public final int method_47() {
        return this.field_1185;
    }

    public final int method_928() {
        return this.field_1187;
    }

    public final void method_407(int i) {
        this.field_1190 = i;
    }

    public class_368(DataInputStream dataInputStream, class_499 class_499Var) {
        this(dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), class_499Var);
    }
}
