package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_213 extends class_160 {
    public class_130 field_814;

    @Override // p000.class_160
    public class_160 method_187(class_499 class_499Var) {
        throw new RuntimeException("Not implemented yet!");
    }

    @Override // p000.class_160, p000.class_241
    public void method_163(class_21 class_21Var) {
    }

    public final void method_1037(class_130 class_130Var) {
        this.field_814 = class_130Var;
    }

    @Override // p000.class_160
    public void method_184(DataOutputStream dataOutputStream) {
        super.method_184(dataOutputStream);
        this.field_814.method_641(dataOutputStream);
    }

    public class_213(int i, int i2, DataInputStream dataInputStream, class_499 class_499Var) {
        this(i, i2, (class_130) null, class_499Var);
        this.field_814 = class_130.method_638(dataInputStream, class_499Var);
    }

    public final class_130 method_1036() {
        return this.field_814;
    }

    public class_213(int i, int i2, class_130 class_130Var, class_499 class_499Var) {
        super((byte) 16, i, i2, class_499Var);
        method_1037(class_130Var);
    }
}
