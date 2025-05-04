package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInput;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_252 extends class_286 {
    public int field_900;

    @Override // p000.class_286
    public final void method_184(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE);
        dataOutputStream.writeShort(this.field_900);
    }

    public class_252(int i) {
        super((byte) 16);
        this.field_900 = i;
    }

    public class_252(class_252 class_252Var) {
        this(class_252Var.method_47());
    }

    public int method_47() {
        return this.field_900;
    }

    public void method_46(int i) {
        this.field_900 = i;
    }

    public class_252(DataInput dataInput) {
        this(dataInput.readUnsignedShort());
    }

    @Override // p000.class_286, p000.class_241
    public void method_163(class_21 class_21Var) {
    }
}
