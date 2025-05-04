package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_159;
import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_400 extends class_286 implements class_159 {
    public int field_1250;

    public final void method_46(int i) {
        this.field_1250 = i;
    }

    @Override // p000.class_159
    public Object method_188(class_499 class_499Var) {
        return new Integer(this.field_1250);
    }

    @Override // p000.class_286, p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_63(this);
    }

    public class_400(int i) {
        super((byte) 3);
        this.field_1250 = i;
    }

    @Override // p000.class_286
    public final void method_184(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE);
        dataOutputStream.writeInt(this.field_1250);
    }

    public class_400(class_400 class_400Var) {
        this(class_400Var.method_47());
    }

    public class_400(DataInputStream dataInputStream) {
        this(dataInputStream.readInt());
    }

    public final int method_47() {
        return this.field_1250;
    }
}
