package com.allatori.ant;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_112 implements Cloneable {
    public int field_535;
    public class_499 field_536;
    public byte field_537;

    public void method_46(int i) {
        this.field_535 = i;
    }

    public class_112(DataInputStream dataInputStream, class_499 class_499Var) {
        this(dataInputStream.readByte(), -1, class_499Var);
        if (method_424()) {
            method_46(dataInputStream.readShort());
        }
        method_498(class_499Var);
    }

    public void method_617(byte b) {
        if (b >= 0 && b <= 8) {
            this.field_537 = b;
            return;
        }
        throw new RuntimeException(new StringBuilder().insert(0, "Illegal type for StackMapType: ").append((int) b).toString());
    }

    public final class_499 method_502() {
        return this.field_536;
    }

    public class_112(byte b, int i, class_499 class_499Var) {
        this.field_535 = -1;
        method_617(b);
        method_46(i);
        method_498(class_499Var);
    }

    public byte method_619() {
        return this.field_537;
    }

    public String method_198() {
        if (this.field_537 == 7) {
            if (this.field_535 >= 0) {
                return new StringBuilder().insert(0, ", class=").append(this.field_536.method_1848(this.field_535, (byte) 7)).toString();
            }
            return ", class=<unknown>";
        }
        if (this.field_537 == 8) {
            return new StringBuilder().insert(0, ", offset=").append(this.field_535).toString();
        }
        return "";
    }

    public final void method_498(class_499 class_499Var) {
        this.field_536 = class_499Var;
    }

    public int method_47() {
        return this.field_535;
    }

    public class_112 method_618() {
        try {
            return (class_112) clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public final void method_184(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.field_537);
        if (method_424()) {
            dataOutputStream.writeShort(method_47());
        }
    }

    public final boolean method_424() {
        return this.field_537 == 7 || this.field_537 == 8;
    }
}
