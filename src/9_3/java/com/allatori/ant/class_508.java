package com.allatori.ant;

import com.allatori.commons.ASMStuffs;
import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.unmapped.class_494;
import com.allatori.interfaces.unmapped.class_555;
import com.allatori.interfaces.unmapped.class_97;

import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_508 extends class_539 implements class_97, class_494 {
    public short field_1974;
    public short field_1975;
    public int field_1976;

    public class_508(short s, short s2, int i) {
        super(s, (short) 2);
        this.field_1976 = -1;
        this.field_1975 = (short) -1;
        this.field_1974 = (short) -1;
        this.field_1975 = s2;
        this.field_1974 = s;
        method_46(i);
    }

    public short method_1304() {
        return this.field_1974;
    }

    @Override // p000.class_539
    public void method_184(DataOutputStream dataOutputStream) {
        if (method_424()) {
            dataOutputStream.writeByte(ASMStuffs.field_79);
        }
        dataOutputStream.writeByte(this.IIiIIIIiii);
        if (this.IIiiIIIIIi > 1) {
            if (!method_424()) {
                dataOutputStream.writeByte(this.field_1976);
            } else {
                dataOutputStream.writeShort(this.field_1976);
            }
        }
    }

    @Override // p000.class_494
    public void method_46(int i) {
        if (i < 0 || i > 65535) {
            throw new class_151(new StringBuilder().insert(0, "Illegal value: ").append(i).toString());
        }
        this.field_1976 = i;
        if (i < 0 || i > 3) {
            this.IIiIIIIiii = this.field_1974;
            if (!method_424()) {
                this.IIiiIIIIIi = (short) 2;
                return;
            } else {
                this.IIiiIIIIIi = (short) 4;
                return;
            }
        }
        this.IIiIIIIiii = (short) (this.field_1975 + i);
        this.IIiiIIIIIi = (short) 1;
    }

    public class_508(short s, short s2) {
        this.field_1976 = -1;
        this.field_1975 = (short) -1;
        this.field_1974 = (short) -1;
        this.field_1974 = s;
        this.field_1975 = s2;
    }

    public class_508() {
        this.field_1976 = -1;
        this.field_1975 = (short) -1;
        this.field_1974 = (short) -1;
    }

    @Override // p000.class_539
    public String method_406(boolean z) {
        return ((this.IIiIIIIiii < 26 || this.IIiIIIIiii > 45) && (this.IIiIIIIiii < 59 || this.IIiIIIIiii > 78)) ? new StringBuilder().insert(0, super.method_406(z)).append(" ").append(this.field_1976).toString() : super.method_406(z);
    }

    @Override // p000.class_97
    public class_212 method_32(class_208 class_208Var) {
        switch (this.field_1974) {
            case 21:
            case 54:
                return class_212.field_802;
            case 22:
            case 55:
                return class_212.field_798;
            case 23:
            case 56:
                return class_212.field_812;
            case class_555.field_2101 /* 24 */:
            case 57:
                return class_212.field_810;
            case class_555.field_2318 /* 25 */:
            case 58:
                return class_212.field_808;
            default:
                throw new class_151(new StringBuilder().insert(0, "Oops: unknown case in switch").append((int) this.field_1974).toString());
        }
    }

    @Override // p000.class_494
    public final int method_47() {
        return this.field_1976;
    }

    public final boolean method_424() {
        return this.field_1976 > 255;
    }

    @Override // p000.class_539
    public void method_200(class_346 class_346Var, boolean z) {
        if (z) {
            this.field_1976 = class_346Var.readUnsignedShort();
            this.IIiiIIIIIi = (short) 4;
            return;
        }
        if ((this.IIiIIIIiii < 21 || this.IIiIIIIiii > 25) && (this.IIiIIIIiii < 54 || this.IIiIIIIiii > 58)) {
            if (this.IIiIIIIiii > 45) {
                this.field_1976 = (this.IIiIIIIiii - 59) % 4;
                this.IIiiIIIIIi = (short) 1;
                return;
            } else {
                this.field_1976 = (this.IIiIIIIiii - 26) % 4;
                this.IIiiIIIIIi = (short) 1;
                return;
            }
        }
        this.field_1976 = class_346Var.readUnsignedByte();
        this.IIiiIIIIIi = (short) 2;
    }
}
