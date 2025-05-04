package com.allatori.ant;

import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_348 extends class_130 {
    public int field_1131;

    public String method_1409() {
        if (this.iIiiIiIiII != 115) {
            throw new RuntimeException("Dont call getValueString() on a non STRING ElementValue");
        }
        return ((class_371) this.IiiIIIIiiI.method_1849(method_1418(), (byte) 1)).method_198();
    }

    public int method_1416() {
        if (this.iIiiIiIiII != 73) {
            throw new RuntimeException("Dont call getValueString() on a non STRING ElementValue");
        }
        return ((class_400) this.IiiIIIIiiI.method_1849(method_1418(), (byte) 3)).method_47();
    }

    public boolean method_1413() {
        if (this.iIiiIiIiII != 90) {
            throw new RuntimeException("Dont call getValueBoolean() on a non BOOLEAN ElementValue");
        }
        return ((class_400) this.IiiIIIIiiI.method_982(method_1418())).method_47() != 0;
    }

    public short method_1410() {
        if (this.iIiiIiIiII == 83) {
            return (short) ((class_400) this.IiiIIIIiiI.method_982(method_1418())).method_47();
        }
        throw new RuntimeException("Dont call getValueShort() on a non SHORT ElementValue");
    }

    @Override // p000.class_130
    public String method_639() {
        switch (this.iIiiIiIiII) {
            case 66:
                return Integer.toString(((class_400) this.IiiIIIIiiI.method_1849(method_1418(), (byte) 3)).method_47());
            case 67:
                return String.valueOf((char) ((class_400) this.IiiIIIIiiI.method_1849(method_1418(), (byte) 3)).method_47());
            case 68:
                return Double.toString(((class_573) this.IiiIIIIiiI.method_1849(method_1418(), (byte) 6)).method_794());
            case 70:
                return Float.toString(((class_340) this.IiiIIIIiiI.method_1849(method_1418(), (byte) 4)).method_1399());
            case 73:
                return Integer.toString(((class_400) this.IiiIIIIiiI.method_1849(method_1418(), (byte) 3)).method_47());
            case 74:
                return Long.toString(((class_232) this.IiiIIIIiiI.method_1849(method_1418(), (byte) 5)).method_1074());
            case 83:
                return Integer.toString(((class_400) this.IiiIIIIiiI.method_1849(method_1418(), (byte) 3)).method_47());
            case 90:
                class_400 class_400Var = (class_400) this.IiiIIIIiiI.method_1849(method_1418(), (byte) 3);
                if (class_400Var.method_47() != 0) {
                    if (class_400Var.method_47() != 0) {
                        return "true";
                    }
                } else {
                    return "false";
                }
                break;
            case 115:
                break;
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "SimpleElementValue class does not know how to stringify type ").append(this.iIiiIiIiII).toString());
        }
        return ((class_371) this.IiiIIIIiiI.method_1849(method_1418(), (byte) 1)).method_198();
    }

    public double method_1412() {
        if (this.iIiiIiIiII == 68) {
            return ((class_573) this.IiiIIIIiiI.method_982(method_1418())).method_794();
        }
        throw new RuntimeException("Dont call getValueDouble() on a non DOUBLE ElementValue");
    }

    public float method_1414() {
        if (this.iIiiIiIiII != 70) {
            throw new RuntimeException("Dont call getValueFloat() on a non FLOAT ElementValue");
        }
        return ((class_340) this.IiiIIIIiiI.method_982(method_1418())).method_1399();
    }

    public class_348(int i, int i2, class_499 class_499Var) {
        super(i, class_499Var);
        this.field_1131 = i2;
    }

    public char method_1419() {
        if (this.iIiiIiIiII != 67) {
            throw new RuntimeException("Dont call getValueChar() on a non CHAR ElementValue");
        }
        return (char) ((class_400) this.IiiIIIIiiI.method_1849(method_1418(), (byte) 3)).method_47();
    }

    public byte method_1415() {
        if (this.iIiiIiIiII != 66) {
            throw new RuntimeException("Dont call getValueByte() on a non BYTE ElementValue");
        }
        return (byte) ((class_400) this.IiiIIIIiiI.method_1849(method_1418(), (byte) 3)).method_47();
    }

    @Override // p000.class_130
    public void method_641(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.iIiiIiIiII);
        switch (this.iIiiIiIiII) {
            case 66:
            case 67:
            case 68:
            case 70:
            case 73:
            case 74:
            case 83:
            case 90:
            case 115:
                dataOutputStream.writeShort(method_1418());
                return;
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "SimpleElementValue doesnt know how to write out type ").append(this.iIiiIiIiII).toString());
        }
    }

    public long method_1411() {
        if (this.iIiiIiIiII != 74) {
            throw new RuntimeException("Dont call getValueLong() on a non LONG ElementValue");
        }
        return ((class_232) this.IiiIIIIiiI.method_982(method_1418())).method_1074();
    }

    public int method_1418() {
        return this.field_1131;
    }

    public void method_1417(int i) {
        this.field_1131 = i;
    }
}
