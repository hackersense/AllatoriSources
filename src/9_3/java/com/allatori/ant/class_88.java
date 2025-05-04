package com.allatori.ant;

import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_88 extends class_476 {
    public int field_360;

    public class_88(int i, class_208 class_208Var, short s) {
        super(i, class_208Var);
        this.field_360 = class_208Var.method_994(s);
    }

    public String method_550() {
        if (this.iIiIiiiiIi != 115) {
            throw new RuntimeException("Dont call getValueString() on a non STRING ElementValue");
        }
        return ((class_371) this.IIiIIIIiii.method_982(this.field_360)).method_198();
    }

    public class_88(int i, class_208 class_208Var, byte b) {
        super(i, class_208Var);
        this.field_360 = class_208Var.method_994(b);
    }

    public class_88(int i, class_208 class_208Var, double d) {
        super(i, class_208Var);
        this.field_360 = class_208Var.method_995(d);
    }

    public void method_551(int i) {
        this.field_360 = i;
    }

    public class_88(int i, class_208 class_208Var, boolean z) {
        super(i, class_208Var);
        if (!z) {
            this.field_360 = class_208Var.method_994(0);
        } else {
            this.field_360 = class_208Var.method_994(1);
        }
    }

    public class_88(class_348 class_348Var, class_208 class_208Var, boolean z) {
        super(class_348Var.method_637(), class_208Var);
        if (z) {
            switch (class_348Var.method_637()) {
                case 66:
                    this.field_360 = class_208Var.method_994(class_348Var.method_1415());
                    return;
                case 67:
                    this.field_360 = class_208Var.method_994(class_348Var.method_1419());
                    return;
                case 68:
                    this.field_360 = class_208Var.method_995(class_348Var.method_1412());
                    return;
                case 70:
                    this.field_360 = class_208Var.method_1001(class_348Var.method_1414());
                    return;
                case 73:
                    this.field_360 = class_208Var.method_994(class_348Var.method_1416());
                    return;
                case 74:
                    this.field_360 = class_208Var.method_990(class_348Var.method_1411());
                    return;
                case 83:
                    this.field_360 = class_208Var.method_994(class_348Var.method_1410());
                    return;
                case 90:
                    if (class_348Var.method_1413()) {
                        this.field_360 = class_208Var.method_994(1);
                        return;
                    } else {
                        this.field_360 = class_208Var.method_994(0);
                        return;
                    }
                case 115:
                    this.field_360 = class_208Var.method_1004(class_348Var.method_1409());
                    return;
                default:
                    throw new RuntimeException(new StringBuilder().insert(0, "SimpleElementValueGen class does not know how to copy this type ").append(this.iIiIiiiiIi).toString());
            }
        }
        this.field_360 = class_348Var.method_1418();
    }

    public class_88(int i, class_208 class_208Var, char c) {
        super(i, class_208Var);
        this.field_360 = class_208Var.method_994(c);
    }

    public int method_555() {
        return this.field_360;
    }

    public class_88(int i, class_208 class_208Var, int i2) {
        super(i, class_208Var);
        this.field_360 = class_208Var.method_994(i2);
    }

    @Override // p000.class_476
    public void method_552(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.iIiIiiiiIi);
        switch (this.iIiIiiiiIi) {
            case 66:
            case 67:
            case 68:
            case 70:
            case 73:
            case 74:
            case 83:
            case 90:
            case 115:
                dataOutputStream.writeShort(this.field_360);
                return;
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "SimpleElementValueGen doesnt know how to write out type ").append(this.iIiIiiiiIi).toString());
        }
    }

    @Override // p000.class_476
    public String method_554() {
        switch (this.iIiIiiiiIi) {
            case 66:
                return Integer.toString(((class_400) this.IIiIIIIiii.method_982(this.field_360)).method_47());
            case 67:
                return Integer.toString(((class_400) this.IIiIIIIiii.method_982(this.field_360)).method_47());
            case 68:
                return Double.toString(((class_573) this.IIiIIIIiii.method_982(this.field_360)).method_794());
            case 70:
                return Float.toString(((class_340) this.IIiIIIIiii.method_982(this.field_360)).method_1399());
            case 73:
                return Integer.toString(((class_400) this.IIiIIIIiii.method_982(this.field_360)).method_47());
            case 74:
                return Long.toString(((class_232) this.IIiIIIIiii.method_982(this.field_360)).method_1074());
            case 83:
                return Integer.toString(((class_400) this.IIiIIIIiii.method_982(this.field_360)).method_47());
            case 90:
                class_400 class_400Var = (class_400) this.IIiIIIIiii.method_982(this.field_360);
                if (class_400Var.method_47() == 0) {
                    return "false";
                }
                if (class_400Var.method_47() != 0) {
                    return "true";
                }
                break;
            case 115:
                break;
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "SimpleElementValueGen class does not know how to stringify type ").append(this.iIiIiiiiIi).toString());
        }
        return ((class_371) this.IIiIIIIiii.method_982(this.field_360)).method_198();
    }

    public class_88(int i, class_208 class_208Var, long j) {
        super(i, class_208Var);
        this.field_360 = class_208Var.method_990(j);
    }

    public class_88(int i, class_208 class_208Var, String str) {
        super(i, class_208Var);
        this.field_360 = class_208Var.method_1004(str);
    }

    public class_88(int i, class_208 class_208Var, float f) {
        super(i, class_208Var);
        this.field_360 = class_208Var.method_1001(f);
    }

    public int method_556() {
        if (this.iIiIiiiiIi == 73) {
            return ((class_400) this.IIiIIIIiii.method_982(this.field_360)).method_47();
        }
        throw new RuntimeException("Dont call getValueString() on a non STRING ElementValue");
    }

    public class_88(int i, int i2, class_208 class_208Var) {
        super(i, class_208Var);
        this.field_360 = i2;
    }

    @Override // p000.class_476
    public class_130 method_553() {
        return new class_348(this.iIiIiiiiIi, this.field_360, this.IIiIIIIiii.method_502());
    }
}
