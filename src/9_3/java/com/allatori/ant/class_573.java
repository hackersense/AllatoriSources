package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_159;
import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_573 extends class_286 implements class_159 {
    public double field_2338;

    public final void method_851(double d) {
        this.field_2338 = d;
    }

    @Override // p000.class_159
    public Object method_188(class_499 class_499Var) {
        return new Double(this.field_2338);
    }

    @Override // p000.class_286, p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_83(this);
    }

    public class_573(double d) {
        super((byte) 6);
        this.field_2338 = d;
    }

    @Override // p000.class_286
    public final void method_184(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE);
        dataOutputStream.writeDouble(this.field_2338);
    }

    public class_573(class_573 class_573Var) {
        this(class_573Var.method_794());
    }

    public class_573(DataInputStream dataInputStream) {
        this(dataInputStream.readDouble());
    }

    public final double method_794() {
        return this.field_2338;
    }
}
