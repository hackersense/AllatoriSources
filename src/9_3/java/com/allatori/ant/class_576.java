package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_576 extends class_160 {
    public class_160[] field_2343;
    public byte[] field_2344;
    public int field_2345;
    public class_372[] field_2346;
    public int field_2347;
    public int field_2348;
    public int field_2349;
    public int field_2350;

    public final int method_927() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < this.field_2348) {
            int i4 = i2 + 1;
            i3 += this.field_2343[i2].field_694 + 6;
            i = i4;
            i2 = i4;
        }
        return method_928() + i3;
    }

    public final byte[] method_429() {
        return this.field_2344;
    }

    public class_576(int i, int i2, int i3, int i4, byte[] bArr, class_372[] class_372VarArr, class_160[] class_160VarArr, class_499 class_499Var) {
        super((byte) 2, i, i2, class_499Var);
        this.field_2347 = i3;
        this.field_2350 = i4;
        method_1055(bArr);
        method_2022(class_372VarArr);
        method_1563(class_160VarArr);
    }

    @Override // p000.class_160, p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_68(this);
    }

    public final class_160[] method_906() {
        return this.field_2343;
    }

    public final int method_183() {
        return this.field_2350;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0003 */
    public class_332 method_1966() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i >= this.field_2348) {
                return null;
            }
            if (!(this.field_2343[i2] instanceof class_332)) {
                i = i2 + 1;
            } else {
                return (class_332) this.field_2343[i2];
            }
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:6:0x0059 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public class_576(int i, int i2, DataInputStream dataInputStream, class_499 class_499Var) {
        this(i, i2, dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), (byte[]) null, (class_372[]) null, (class_160[]) null, class_499Var);
        int i3 = 0;
        this.field_2345 = dataInputStream.readInt();
        this.field_2344 = new byte[this.field_2345];
        dataInputStream.readFully(this.field_2344);
        this.field_2349 = dataInputStream.readUnsignedShort();
        this.field_2346 = new class_372[this.field_2349];
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.field_2349) {
            int i6 = i5 + 1;
            this.field_2346[i5] = new class_372(dataInputStream);
            i4 = i6;
            i5 = i6;
        }
        this.field_2348 = dataInputStream.readUnsignedShort();
        this.field_2343 = new class_160[this.field_2348];
        while (true) {
            int i7 = i3;
            if (i3 < this.field_2348) {
                i3 = i7 + 1;
                this.field_2343[i7] = class_160.method_777(dataInputStream, class_499Var);
            } else {
                this.IIiIIIIiii = i2;
                return;
            }
        }
    }

    public final int method_928() {
        return this.field_2345 + 8 + 2 + (this.field_2349 * 8) + 2;
    }

    public final class_372[] method_2023() {
        return this.field_2346;
    }

    public final void method_1055(byte[] bArr) {
        this.field_2344 = bArr;
        this.field_2345 = bArr == null ? 0 : bArr.length;
    }

    public final void method_2022(class_372[] class_372VarArr) {
        this.field_2346 = class_372VarArr;
        this.field_2349 = class_372VarArr == null ? 0 : class_372VarArr.length;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:9:0x0043 */
    @Override // p000.class_160
    public class_160 method_187(class_499 class_499Var) {
        int i = 0;
        class_576 class_576Var = (class_576) clone();
        if (this.field_2344 != null) {
            class_576Var.field_2344 = new byte[this.field_2344.length];
            System.arraycopy(this.field_2344, 0, class_576Var.field_2344, 0, this.field_2344.length);
        }
        class_576Var.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE = class_499Var;
        class_576Var.field_2346 = new class_372[this.field_2349];
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.field_2349) {
            int i4 = i3 + 1;
            class_576Var.field_2346[i3] = this.field_2346[i3].method_1496();
            i2 = i4;
            i3 = i4;
        }
        class_576Var.field_2343 = new class_160[this.field_2348];
        while (true) {
            int i5 = i;
            if (i >= this.field_2348) {
                return class_576Var;
            }
            i = i5 + 1;
            class_576Var.field_2343[i5] = this.field_2343[i5].method_187(class_499Var);
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:10:0x0076 */
    public final String method_406(boolean z) {
        int i = 0;
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append("Code(max_stack = ").append(this.field_2347).append(", max_locals = ").append(this.field_2350).append(", code_length = ").append(this.field_2345).append(")\n").append(class_204.method_958(this.field_2344, this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE, 0, -1, z));
        if (this.field_2349 > 0) {
            stringBuffer.append("\nException handler(s) = \n").append("From\tTo\tHandler\tType\n");
            int i2 = 0;
            int i3 = 0;
            while (i2 < this.field_2349) {
                int i4 = i3 + 1;
                stringBuffer.append(this.field_2346[i3].method_1495(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE, z)).append("\n");
                i2 = i4;
                i3 = i4;
            }
        }
        if (this.field_2348 > 0) {
            stringBuffer.append("\nAttribute(s) = \n");
            while (true) {
                int i5 = i;
                if (i >= this.field_2348) {
                    break;
                }
                i = i5 + 1;
                stringBuffer.append(this.field_2343[i5].toString()).append("\n");
            }
        }
        return stringBuffer.toString();
    }

    public final void method_461(int i) {
        this.field_2350 = i;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:6:0x0038 */
    @Override // p000.class_160
    public final void method_184(DataOutputStream dataOutputStream) {
        int i = 0;
        super.method_184(dataOutputStream);
        dataOutputStream.writeShort(this.field_2347);
        dataOutputStream.writeShort(this.field_2350);
        dataOutputStream.writeInt(this.field_2345);
        dataOutputStream.write(this.field_2344, 0, this.field_2345);
        dataOutputStream.writeShort(this.field_2349);
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.field_2349) {
            int i4 = i3 + 1;
            this.field_2346[i3].method_184(dataOutputStream);
            i2 = i4;
            i3 = i4;
        }
        dataOutputStream.writeShort(this.field_2348);
        while (true) {
            int i5 = i;
            if (i >= this.field_2348) {
                return;
            }
            i = i5 + 1;
            this.field_2343[i5].method_184(dataOutputStream);
        }
    }

    public final void method_853(int i) {
        this.field_2347 = i;
    }

    public final void method_1563(class_160[] class_160VarArr) {
        this.field_2343 = class_160VarArr;
        this.field_2348 = class_160VarArr == null ? 0 : class_160VarArr.length;
        this.IIiIIIIiii = method_927();
    }

    public final int method_920() {
        return this.field_2347;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0003 */
    public class_40 method_1965() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i >= this.field_2348) {
                return null;
            }
            if (this.field_2343[i2] instanceof class_40) {
                return (class_40) this.field_2343[i2];
            }
            i = i2 + 1;
        }
    }

    public class_576(class_576 class_576Var) {
        this(class_576Var.method_433(), class_576Var.method_47(), class_576Var.method_920(), class_576Var.method_183(), class_576Var.method_429(), class_576Var.method_2023(), class_576Var.method_906(), class_576Var.method_502());
    }
}
