package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.interfaces.unmapped.class_445;

import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_427 extends class_450 {
    @Override // p000.class_539
    public void method_0(class_445 class_445Var) {
        class_445Var.method_481(this);
        class_445Var.method_486(this);
        class_445Var.method_479(this);
        class_445Var.method_473(this);
        class_445Var.method_393(this);
    }

    public class_427() {
    }

    public class_427(int[] iArr, class_337[] class_337VarArr, class_337 class_337Var) {
        super(ASMInterface.field_1438, iArr, class_337VarArr, class_337Var);
        this.IIiiIIIIIi = (short) ((this.IIiIIIIiii * 8) + 9);
        this.iIiIiIIIII = this.IIiiIIIIIi;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x002f */
    @Override // p000.class_450, p000.class_272, p000.class_539
    public void method_200(class_346 class_346Var, boolean z) {
        super.method_200(class_346Var, z);
        this.IIiIIIIiii = class_346Var.readInt();
        this.iIiIiIIIII = (short) ((this.IIiIIIIiii * 8) + 9);
        this.IIiiIIIIIi = (short) (this.iIiIiIIIII + this.iIIiiIiiIi);
        this.iIiIiiiiIi = new int[this.IIiIIIIiii];
        this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE = new int[this.IIiIIIIiii];
        this.iIIIIiiiiI = new class_337[this.IIiIIIIiii];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i >= this.IIiIIIIiii) {
                return;
            }
            this.iIiIiiiiIi[i2] = class_346Var.readInt();
            i = i2 + 1;
            this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE[i2] = class_346Var.readInt();
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x000b */
    @Override // p000.class_450, p000.class_272, p000.class_539
    public void method_184(DataOutputStream dataOutputStream) {
        int i = 0;
        super.method_184(dataOutputStream);
        dataOutputStream.writeInt(this.IIiIIIIiii);
        while (true) {
            int i2 = i;
            if (i < this.IIiIIIIiii) {
                dataOutputStream.writeInt(this.iIiIiiiiIi[i2]);
                int[] iArr = this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE;
                int method_1206 = method_1206(this.iIIIIiiiiI[i2]);
                i = i2 + 1;
                iArr[i2] = method_1206;
                dataOutputStream.writeInt(method_1206);
            } else {
                return;
            }
        }
    }
}
