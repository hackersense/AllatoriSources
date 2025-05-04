package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_159;
import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_232 extends class_286 implements class_159 {
    public long field_838;

    public final void method_856(long j) {
        this.field_838 = j;
    }

    @Override // p000.class_159
    public Object method_188(class_499 class_499Var) {
        return new Long(this.field_838);
    }

    @Override // p000.class_286, p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_64(this);
    }

    public class_232(long j) {
        super((byte) 5);
        this.field_838 = j;
    }

    @Override // p000.class_286
    public final void method_184(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE);
        dataOutputStream.writeLong(this.field_838);
    }

    public class_232(class_232 class_232Var) {
        this(class_232Var.method_1074());
    }

    public class_232(DataInputStream dataInputStream) {
        this(dataInputStream.readLong());
    }

    public final long method_1074() {
        return this.field_838;
    }
}
