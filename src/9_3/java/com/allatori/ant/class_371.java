package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_371 extends class_286 {
    public String field_1192;

    public final void method_671(String str) {
        this.field_1192 = str;
    }

    public final String method_198() {
        return this.field_1192;
    }

    @Override // p000.class_286
    public final void method_184(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE);
        dataOutputStream.writeUTF(this.field_1192);
    }

    @Override // p000.class_286, p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_57(this);
    }

    public class_371(class_371 class_371Var) {
        this(class_371Var.method_198());
    }

    public class_371(DataInputStream dataInputStream) {
        super((byte) 1);
        this.field_1192 = dataInputStream.readUTF();
    }

    public class_371(String str) {
        super((byte) 1);
        if (str == null) {
            throw new IllegalArgumentException("bytes must not be null!");
        }
        this.field_1192 = str;
    }
}
