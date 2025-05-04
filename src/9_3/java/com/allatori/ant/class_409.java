package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_241;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_409 extends class_250 implements Cloneable, class_241 {
    public class_160[] field_1262;
    public boolean field_1263;
    public int field_1264;
    public String field_1265;
    public class_78[] field_1266;
    public class_499 field_1267;
    public int field_1268;
    public boolean field_1269;
    public int field_1270;

    public final void method_1563(class_160[] class_160VarArr) {
        this.field_1262 = class_160VarArr;
        this.field_1264 = class_160VarArr == null ? 0 : class_160VarArr.length;
    }

    public final int method_928() {
        return this.field_1270;
    }

    public void method_1561(class_78 class_78Var) {
        method_97();
        int length = this.field_1266.length;
        class_78[] class_78VarArr = new class_78[length + 1];
        System.arraycopy(this.field_1266, 0, class_78VarArr, 0, length);
        class_78VarArr[length] = class_78Var;
        this.field_1266 = class_78VarArr;
    }

    public class_409() {
        this.field_1265 = null;
        this.field_1263 = false;
        this.field_1269 = true;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0017 */
    public final void method_184(DataOutputStream dataOutputStream) {
        int i = 0;
        dataOutputStream.writeShort(this.field_1264);
        dataOutputStream.writeShort(this.field_1268);
        dataOutputStream.writeShort(this.field_1270);
        dataOutputStream.writeShort(this.field_1264);
        while (true) {
            int i2 = i;
            if (i < this.field_1264) {
                i = i2 + 1;
                this.field_1262[i2].method_184(dataOutputStream);
            } else {
                return;
            }
        }
    }

    public final void method_498(class_499 class_499Var) {
        this.field_1267 = class_499Var;
    }

    public void method_97() {
        if (this.field_1269) {
            class_160[] method_906 = method_906();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            int i2 = 0;
            while (i < method_906.length) {
                class_160 class_160Var = method_906[i2];
                if (class_160Var instanceof class_515) {
                    class_515 class_515Var = (class_515) class_160Var;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < class_515Var.method_1560().length) {
                        int i5 = i4 + 1;
                        arrayList.add(class_515Var.method_1560()[i4]);
                        i3 = i5;
                        i4 = i5;
                    }
                }
                int i6 = i2 + 1;
                i = i6;
                i2 = i6;
            }
            this.field_1266 = (class_78[]) arrayList.toArray(new class_78[arrayList.size()]);
            this.field_1269 = false;
        }
    }

    public final class_499 method_502() {
        return this.field_1267;
    }

    public class_78[] method_1560() {
        method_97();
        return this.field_1266;
    }

    public final class_160[] method_906() {
        return this.field_1262;
    }

    public final void method_461(int i) {
        this.field_1270 = i;
    }

    public final String method_198() {
        boolean z;
        if (!this.field_1263) {
            boolean z2 = false;
            boolean z3 = false;
            int i = 0;
            while (!z2 && i < this.field_1264) {
                if (this.field_1262[i] instanceof class_72) {
                    this.field_1265 = ((class_72) this.field_1262[i]).method_464();
                    z = true;
                } else {
                    z = z3;
                }
                i++;
                z2 = z;
                z3 = z;
            }
            this.field_1263 = true;
        }
        return this.field_1265;
    }

    public class_409(int i, int i2, int i3, class_160[] class_160VarArr, class_499 class_499Var) {
        this.field_1265 = null;
        this.field_1263 = false;
        this.field_1269 = true;
        this.field_1264 = i;
        this.field_1268 = i2;
        this.field_1270 = i3;
        this.field_1267 = class_499Var;
        method_1563(class_160VarArr);
    }

    public final String method_546() {
        return ((class_371) this.field_1267.method_1849(this.field_1270, (byte) 1)).method_198();
    }

    public class_409(class_409 class_409Var) {
        this(class_409Var.method_433(), class_409Var.method_183(), class_409Var.method_928(), class_409Var.method_906(), class_409Var.method_502());
    }

    public final String method_464() {
        return ((class_371) this.field_1267.method_1849(this.field_1268, (byte) 1)).method_198();
    }

    public final int method_183() {
        return this.field_1268;
    }

    public final void method_853(int i) {
        this.field_1268 = i;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0021 */
    public class_409(DataInputStream dataInputStream, class_499 class_499Var) {
        this(dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), null, class_499Var);
        this.field_1264 = dataInputStream.readUnsignedShort();
        this.field_1262 = new class_160[this.field_1264];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i >= this.field_1264) {
                return;
            }
            i = i2 + 1;
            this.field_1262[i2] = class_160.method_777(dataInputStream, class_499Var);
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:5:0x0016 */
    public class_409 method_1562(class_499 class_499Var) {
        class_409 class_409Var;
        class_409 class_409Var2;
        try {
            class_409 class_409Var3 = (class_409) clone();
            class_409Var = class_409Var3;
            class_409Var2 = class_409Var3;
        } catch (CloneNotSupportedException e) {
            class_409Var = null;
            class_409Var2 = null;
        }
        class_409Var.field_1267 = this.field_1267;
        class_409Var2.field_1262 = new class_160[this.field_1264];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i < this.field_1264) {
                i = i2 + 1;
                class_409Var2.field_1262[i2] = this.field_1262[i2].method_187(this.field_1267);
            } else {
                return class_409Var2;
            }
        }
    }
}
