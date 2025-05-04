package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.interfaces.unmapped.class_445;

import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_117 extends class_450 {
    public class_117(int[] iArr, class_337[] class_337VarArr, class_337 class_337Var) {
        super(ASMInterface.field_1482, iArr, class_337VarArr, class_337Var);
        this.IIiiIIIIIi = (short) ((this.IIiIIIIiii * 4) + 13);
        this.iIiIiIIIII = this.IIiiIIIIIi;
    }

    public class_117() {
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:5:0x0046 */
    @Override // p000.class_450, p000.class_272, p000.class_539
    public void method_200(class_346 class_346Var, boolean z) {
        super.method_200(class_346Var, z);
        int readInt = class_346Var.readInt();
        int readInt2 = class_346Var.readInt();
        this.IIiIIIIiii = (readInt2 - readInt) + 1;
        this.iIiIiIIIII = (short) ((this.IIiIIIIiii * 4) + 13);
        this.IIiiIIIIIi = (short) (this.iIiIiIIIII + this.iIIiiIiiIi);
        this.iIiIiiiiIi = new int[this.IIiIIIIiii];
        this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE = new int[this.IIiIIIIiii];
        this.iIIIIiiiiI = new class_337[this.IIiIIIIiii];
        int i = readInt;
        int i2 = readInt;
        while (i <= readInt2) {
            int i3 = i2 + 1;
            this.iIiIiiiiIi[i2 - readInt] = i2;
            i = i3;
            i2 = i3;
        }
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i4 >= this.IIiIIIIiii) {
                return;
            }
            i4 = i5 + 1;
            this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE[i5] = class_346Var.readInt();
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:8:0x0020 */
    @Override // p000.class_450, p000.class_272, p000.class_539
    public void method_184(DataOutputStream dataOutputStream) {
        int i = 0;
        super.method_184(dataOutputStream);
        dataOutputStream.writeInt(this.IIiIIIIiii > 0 ? this.iIiIiiiiIi[0] : 0);
        dataOutputStream.writeInt(this.IIiIIIIiii > 0 ? this.iIiIiiiiIi[this.IIiIIIIiii - 1] : 0);
        while (true) {
            int i2 = i;
            if (i >= this.IIiIIIIiii) {
                return;
            }
            int[] iArr = this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE;
            int method_1206 = method_1206(this.iIIIIiiiiI[i2]);
            i = i2 + 1;
            iArr[i2] = method_1206;
            dataOutputStream.writeInt(method_1206);
        }
    }

    @Override // p000.class_539
    public void method_0(class_445 class_445Var) {
        class_445Var.method_481(this);
        class_445Var.method_486(this);
        class_445Var.method_479(this);
        class_445Var.method_473(this);
        class_445Var.method_388(this);
    }
}
