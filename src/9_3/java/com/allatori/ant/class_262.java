package com.allatori.ant;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.Serializable;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_262 implements Serializable, Cloneable {
    public int field_907;
    public int[] field_908;

    public int[] method_434() {
        return this.field_908;
    }

    public void method_46(int i) {
        this.field_907 = i;
    }

    public void method_1056(int[] iArr) {
        this.field_908 = iArr;
    }

    public class_262(DataInputStream dataInputStream) {
        this.field_907 = dataInputStream.readUnsignedShort();
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        this.field_908 = new int[readUnsignedShort];
        int i = 0;
        int i2 = 0;
        while (i < readUnsignedShort) {
            int i3 = i2 + 1;
            this.field_908[i2] = dataInputStream.readUnsignedShort();
            i = i3;
            i2 = i3;
        }
    }

    public class_262 method_1147() {
        try {
            return (class_262) clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public final void method_184(DataOutputStream dataOutputStream) {
        dataOutputStream.writeShort(this.field_907);
        dataOutputStream.writeShort(this.field_908.length);
        int[] iArr = this.field_908;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            dataOutputStream.writeShort(iArr[i2]);
            i = i3;
            i2 = i3;
        }
    }

    public class_262() {
    }

    public int method_47() {
        return this.field_907;
    }
}
