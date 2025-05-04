package com.allatori.ant;

import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.unmapped.class_373;
import com.allatori.interfaces.unmapped.class_601;

import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_450 extends class_272 implements class_373, class_601 {
    public class_337[] field_1781;
    public int[] field_1782;
    public int field_1783;
    public int field_1784;
    public int field_1785;
    public int[] field_1786;

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:4:0x000e */
    @Override // p000.class_272, p000.class_539
    public String method_406(boolean z) {
        StringBuffer stringBuffer = new StringBuffer(super.method_406(z));
        if (!z) {
            stringBuffer.append(" ...");
        } else {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i >= this.field_1785) {
                    break;
                }
                String str = "null";
                if (this.field_1781[i2] != null) {
                    str = this.field_1781[i2].method_1038().toString();
                }
                i = i2 + 1;
                stringBuffer.append("(").append(this.field_1782[i2]).append(", ").append(str).append(" = {").append(this.field_1786[i2]).append("})");
            }
        }
        return stringBuffer.toString();
    }

    public Object clone() {
        class_450 class_450Var = (class_450) super.clone();
        class_450Var.field_1782 = (int[]) this.field_1782.clone();
        class_450Var.field_1786 = (int[]) this.field_1786.clone();
        class_450Var.field_1781 = (class_337[]) this.field_1781.clone();
        return class_450Var;
    }

    @Override // p000.class_272
    public int method_49(int i, int i2) {
        this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE += i;
        short s = this.IIiiIIIIIi;
        this.field_1784 = (4 - ((this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE + 1) % 4)) % 4;
        this.IIiiIIIIIi = (short) (this.field_1783 + this.field_1784);
        return this.IIiiIIIIIi - s;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x000f */
    @Override // p000.class_272, p000.class_539
    public void method_200(class_346 class_346Var, boolean z) {
        int i = 0;
        this.field_1784 = (4 - (class_346Var.method_1408() % 4)) % 4;
        while (true) {
            int i2 = i;
            if (i < this.field_1784) {
                i = i2 + 1;
                class_346Var.readByte();
            } else {
                this.IIiiIIIIIi = class_346Var.readInt();
                return;
            }
        }
    }

    @Override // p000.class_272, p000.class_539
    public void method_184(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.IIiIIIIiii);
        int i = 0;
        int i2 = 0;
        while (i < this.field_1784) {
            int i3 = i2 + 1;
            dataOutputStream.writeByte(0);
            i = i3;
            i2 = i3;
        }
        this.IIiiIIIIIi = method_183();
        dataOutputStream.writeInt(this.IIiiIIIIIi);
    }

    public class_450() {
        this.field_1784 = 0;
    }

    public void method_1039(int i, class_337 class_337Var) {
        method_1207(this.field_1781[i], class_337Var, this);
        this.field_1781[i] = class_337Var;
    }

    public int[] method_434() {
        return this.field_1782;
    }

    @Override // p000.class_272, p000.class_389
    public boolean method_423(class_337 class_337Var) {
        if (this.IIiIIIIiii == class_337Var) {
            return true;
        }
        int i = 0;
        int i2 = 0;
        while (i < this.field_1781.length) {
            if (this.field_1781[i2] == class_337Var) {
                return true;
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        return false;
    }

    @Override // p000.class_272, p000.class_389
    public void method_52(class_337 class_337Var, class_337 class_337Var2) {
        boolean z;
        if (this.IIiIIIIiii == class_337Var) {
            method_51(class_337Var2);
            z = true;
        } else {
            z = false;
        }
        int i = 0;
        int i2 = 0;
        while (i < this.field_1781.length) {
            if (this.field_1781[i2] == class_337Var) {
                method_1039(i2, class_337Var2);
                z = true;
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        if (!z) {
            throw new class_151(new StringBuilder().insert(0, "Not targeting ").append(class_337Var).toString());
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0006 */
    @Override // p000.class_272, p000.class_539
    public void method_97() {
        int i = 0;
        super.method_97();
        while (true) {
            int i2 = i;
            if (i >= this.field_1781.length) {
                return;
            }
            i = i2 + 1;
            this.field_1781[i2].method_1392(this);
        }
    }

    public int[] method_1715() {
        return this.field_1786;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x000a */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public class_450(short s, int[] iArr, class_337[] class_337VarArr, class_337 class_337Var) {
        super(s, class_337Var);
        int i = 0;
        this.field_1784 = 0;
        this.field_1781 = class_337VarArr;
        while (true) {
            int i2 = i;
            if (i >= class_337VarArr.length) {
                break;
            }
            i = i2 + 1;
            method_1207(null, class_337VarArr[i2], this);
        }
        this.field_1782 = iArr;
        int length = iArr.length;
        this.field_1785 = length;
        if (length != class_337VarArr.length) {
            throw new class_151("Match and target array have not the same length");
        }
        this.field_1786 = new int[this.field_1785];
    }

    public class_337[] method_446() {
        return this.field_1781;
    }
}
