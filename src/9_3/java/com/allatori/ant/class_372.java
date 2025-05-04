package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.interfaces.unmapped.class_21;
import com.allatori.interfaces.unmapped.class_241;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.Serializable;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_372 implements Cloneable, ASMInterface, class_241, Serializable {
    public int field_1193;
    public int field_1194;
    public int field_1195;
    public int field_1196;

    public final String method_189(class_499 class_499Var) {
        return method_1495(class_499Var, true);
    }

    public final int method_183() {
        return this.field_1193;
    }

    public final int method_928() {
        return this.field_1196;
    }

    public class_372(int i, int i2, int i3, int i4) {
        this.field_1196 = i;
        this.field_1195 = i2;
        this.field_1194 = i3;
        this.field_1193 = i4;
    }

    public final void method_853(int i) {
        this.field_1194 = i;
    }

    public final int method_47() {
        return this.field_1195;
    }

    public final void method_46(int i) {
        this.field_1193 = i;
    }

    public final String method_1495(class_499 class_499Var, boolean z) {
        String sb;
        if (this.field_1193 == 0) {
            sb = "<Any exception>(0)";
        } else {
            sb = new StringBuilder().insert(0, class_204.method_945(class_499Var.method_1845(this.field_1193, (byte) 7), false)).append(z ? new StringBuilder().insert(0, "(").append(this.field_1193).append(")").toString() : "").toString();
        }
        return this.field_1196 + "\t" + this.field_1195 + "\t" + this.field_1194 + "\t" + sb;
    }

    public final void method_461(int i) {
        this.field_1196 = i;
    }

    public class_372 method_1496() {
        try {
            return (class_372) clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public class_372(class_372 class_372Var) {
        this(class_372Var.method_928(), class_372Var.method_47(), class_372Var.method_433(), class_372Var.method_183());
    }

    public final int method_433() {
        return this.field_1194;
    }

    public final void method_184(DataOutputStream dataOutputStream) {
        dataOutputStream.writeShort(this.field_1196);
        dataOutputStream.writeShort(this.field_1195);
        dataOutputStream.writeShort(this.field_1194);
        dataOutputStream.writeShort(this.field_1193);
    }

    public final void method_407(int i) {
        this.field_1195 = i;
    }

    @Override // p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_84(this);
    }

    public class_372(DataInputStream dataInputStream) {
        this(dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort());
    }
}
