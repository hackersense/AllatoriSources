package com.allatori.ant;

import com.allatori.interfaces.unmapped.*;

import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_489 extends class_418 implements class_521, class_570, class_97 {
    @Override // p000.class_570
    public Class[] method_43() {
        return class_282.field_992;
    }

    public final void method_401() {
        if (this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE <= 255) {
            this.IIiIIIIiii = (short) 18;
            this.IIiiIIIIIi = (short) 2;
        } else {
            this.IIiIIIIiii = (short) 19;
            this.IIiiIIIIIi = (short) 3;
        }
    }

    @Override // p000.class_539
    public void method_0(class_445 class_445Var) {
        class_445Var.method_486(this);
        class_445Var.method_467(this);
        class_445Var.method_474(this);
        class_445Var.method_493(this);
        class_445Var.method_494(this);
        class_445Var.method_382(this);
    }

    @Override // p000.class_418, p000.class_539
    public void method_184(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.IIiIIIIiii);
        if (this.IIiiIIIIIi != 2) {
            dataOutputStream.writeShort(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE);
        } else {
            dataOutputStream.writeByte(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE);
        }
    }

    @Override // p000.class_418, p000.class_494
    public final void method_46(int i) {
        super.method_46(i);
        method_401();
    }

    @Override // p000.class_418, p000.class_539
    public void method_200(class_346 class_346Var, boolean z) {
        this.IIiiIIIIIi = (short) 2;
        this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE = class_346Var.readUnsignedByte();
    }

    @Override // p000.class_418, p000.class_97
    public class_212 method_32(class_208 class_208Var) {
        switch (class_208Var.method_502().method_982(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE).method_619()) {
            case 3:
                return class_212.field_802;
            case 4:
                return class_212.field_812;
            case 5:
            case 6:
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "Unknown or invalid constant type at ").append(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE).toString());
            case 7:
                return class_212.field_804;
            case 8:
                return class_212.field_799;
        }
    }

    public Object method_1834(class_208 class_208Var) {
        class_286 method_982 = class_208Var.method_502().method_982(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE);
        switch (method_982.method_619()) {
            case 3:
                return new Integer(((class_400) method_982).method_47());
            case 4:
                return new Float(((class_340) method_982).method_1399());
            case 5:
            case 6:
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "Unknown or invalid constant type at ").append(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE).toString());
            case 7:
                return method_982;
            case 8:
                return ((class_371) class_208Var.method_502().method_982(((class_118) method_982).method_47())).method_198();
        }
    }

    public class_489() {
    }

    public class_489(int i) {
        super((short) 19, i);
        method_401();
    }
}
