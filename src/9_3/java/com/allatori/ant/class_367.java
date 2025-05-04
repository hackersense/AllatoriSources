package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;
import com.allatori.interfaces.unmapped.class_241;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.Serializable;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_367 implements Cloneable, class_241, Serializable {
    public int field_1181;
    public int field_1182;
    public int field_1183;
    public int field_1184;

    public class_367(int i, int i2, int i3, int i4) {
        this.field_1183 = i;
        this.field_1181 = i2;
        this.field_1184 = i3;
        this.field_1182 = i4;
    }

    public class_367(class_367 class_367Var) {
        this(class_367Var.method_183(), class_367Var.method_47(), class_367Var.method_433(), class_367Var.method_928());
    }

    public final int method_183() {
        return this.field_1183;
    }

    public final void method_461(int i) {
        this.field_1182 = i;
    }

    public class_367(DataInputStream dataInputStream) {
        this(dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort());
    }

    public final void method_46(int i) {
        this.field_1181 = i;
    }

    public final int method_433() {
        return this.field_1184;
    }

    public final void method_853(int i) {
        this.field_1183 = i;
    }

    public final String method_189(class_499 class_499Var) {
        String str;
        class_367 class_367Var;
        String str2;
        String method_957 = class_204.method_957(class_499Var.method_1845(this.field_1183, (byte) 7));
        if (this.field_1181 != 0) {
            str = class_204.method_957(class_499Var.method_1845(this.field_1181, (byte) 7));
            class_367Var = this;
        } else {
            str = "<not a member>";
            class_367Var = this;
        }
        if (class_367Var.field_1184 == 0) {
            str2 = "<anonymous>";
        } else {
            str2 = ((class_371) class_499Var.method_1849(this.field_1184, (byte) 1)).method_198();
        }
        String method_965 = class_204.method_965(this.field_1182, true);
        return new StringBuilder().insert(0, "InnerClass:").append(method_965.equals("") ? "" : new StringBuilder().insert(0, method_965).append(" ").toString()).append(method_957).append("(\"").append(str).append("\", \"").append(str2).append("\")").toString();
    }

    public final int method_928() {
        return this.field_1182;
    }

    @Override // p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_59(this);
    }

    public final void method_184(DataOutputStream dataOutputStream) {
        dataOutputStream.writeShort(this.field_1183);
        dataOutputStream.writeShort(this.field_1181);
        dataOutputStream.writeShort(this.field_1184);
        dataOutputStream.writeShort(this.field_1182);
    }

    public class_367 method_1491() {
        try {
            return (class_367) clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public final int method_47() {
        return this.field_1181;
    }

    public final void method_407(int i) {
        this.field_1184 = i;
    }
}
