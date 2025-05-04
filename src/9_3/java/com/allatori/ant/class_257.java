package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_257 extends class_160 {
    public int field_903;

    @Override // p000.class_160, p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_86(this);
    }

    public class_257(int i, int i2, int i3, class_499 class_499Var) {
        super((byte) 1, i, i2, class_499Var);
        this.field_903 = i3;
    }

    public class_257(int i, int i2, DataInputStream dataInputStream, class_499 class_499Var) throws IOException {
        this(i, i2, dataInputStream.readUnsignedShort(), class_499Var);
    }

    public final int method_183() {
        return this.field_903;
    }

    public final void method_461(int i) {
        this.field_903 = i;
    }

    @Override // p000.class_160
    public class_160 method_187(class_499 class_499Var) {
        return (class_257) clone();
    }

    @Override // p000.class_160
    public final void method_184(DataOutputStream dataOutputStream) {
        super.method_184(dataOutputStream);
        try {
            dataOutputStream.writeShort(this.field_903);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public class_257(class_257 class_257Var) {
        this(class_257Var.method_433(), class_257Var.method_47(), class_257Var.method_183(), class_257Var.method_502());
    }
}
