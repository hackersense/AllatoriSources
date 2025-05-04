package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.interfaces.unmapped.class_21;
import com.allatori.interfaces.unmapped.class_241;

import java.io.DataInputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_420 implements class_241, ASMInterface {
    public int field_1658;
    public class_78[] field_1659;

    public final int method_47() {
        return this.field_1658;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0012 */
    public class_420(DataInputStream dataInputStream, class_499 class_499Var, boolean z) {
        this.field_1658 = dataInputStream.readUnsignedShort();
        this.field_1659 = new class_78[this.field_1658];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i >= this.field_1658) {
                return;
            }
            i = i2 + 1;
            this.field_1659[i2] = class_78.method_532(dataInputStream, class_499Var, z);
        }
    }

    public class_78[] method_1560() {
        return this.field_1659;
    }

    @Override // p000.class_241
    public void method_163(class_21 class_21Var) {
    }
}
