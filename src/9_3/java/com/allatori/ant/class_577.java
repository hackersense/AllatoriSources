package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;
import com.allatori.interfaces.unmapped.class_241;

import java.io.DataInput;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_577 implements Cloneable, class_241 {
    public int field_2351;
    public int field_2352;

    public class_577 method_2024() {
        try {
            return (class_577) clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public class_577() {
    }

    public String method_189(class_499 class_499Var) {
        if (this.field_2351 != 0) {
            return class_499Var.method_1845(this.field_2351, (byte) 1);
        }
        return null;
    }

    public void method_46(int i) {
        this.field_2352 = i;
    }

    public boolean method_424() {
        return (this.field_2352 & 4096) != 0;
    }

    public void method_407(int i) {
        this.field_2351 = i;
    }

    public class_577(DataInput dataInput) {
        this.field_2351 = dataInput.readUnsignedShort();
        this.field_2352 = dataInput.readUnsignedShort();
    }

    public int method_47() {
        return this.field_2352;
    }

    public boolean method_1130() {
        return (this.field_2352 & (-32768)) != 0;
    }

    public final void method_184(DataOutputStream dataOutputStream) {
        dataOutputStream.writeShort(this.field_2351);
        dataOutputStream.writeShort(this.field_2352);
    }

    public boolean method_1129() {
        return (this.field_2352 & 16) != 0;
    }

    @Override // p000.class_241
    public void method_163(class_21 class_21Var) {
    }

    public int method_433() {
        return this.field_2351;
    }
}
