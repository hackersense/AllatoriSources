package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_159;
import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_340 extends class_286 implements class_159 {
    public float field_1123;

    @Override // p000.class_159
    public Object method_188(class_499 class_499Var) {
        return new Float(this.field_1123);
    }

    public class_340(float f) {
        super((byte) 4);
        this.field_1123 = f;
    }

    @Override // p000.class_286, p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_78(this);
    }

    public class_340(DataInputStream dataInputStream) {
        this(dataInputStream.readFloat());
    }

    public final float method_1399() {
        return this.field_1123;
    }

    public class_340(class_340 class_340Var) {
        this(class_340Var.method_1399());
    }

    public final void method_857(float f) {
        this.field_1123 = f;
    }

    @Override // p000.class_286
    public final void method_184(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE);
        dataOutputStream.writeFloat(this.field_1123);
    }
}
