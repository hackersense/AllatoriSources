package com.allatori.ant;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_130 {
    public static final int field_579 = 83;
    public static final int field_580 = 90;
    public static final int field_581 = 67;
    public static final int field_582 = 68;
    public static final int field_583 = 74;
    public static final int field_585 = 64;
    public static final int field_586 = 99;
    public static final int field_587 = 115;
    public static final int field_588 = 91;
    public static final int field_589 = 73;
    public static final int field_590 = 70;
    public static final int field_591 = 66;
    public static final int field_592 = 101;
    public class_499 field_578;
    public int field_584;

    public abstract String method_639();

    public abstract void method_641(DataOutputStream dataOutputStream);

    public int method_637() {
        return this.field_584;
    }

    public class_130(int i, class_499 class_499Var) {
        this.field_584 = i;
        this.field_578 = class_499Var;
    }

    public static class_130 method_638(DataInputStream dataInputStream, class_499 class_499Var) {
        byte readByte = dataInputStream.readByte();
        switch (readByte) {
            case 64:
                return new class_195(64, class_78.method_532(dataInputStream, class_499Var, false), class_499Var);
            case 66:
                return new class_348(66, dataInputStream.readUnsignedShort(), class_499Var);
            case 67:
                return new class_348(67, dataInputStream.readUnsignedShort(), class_499Var);
            case 68:
                return new class_348(68, dataInputStream.readUnsignedShort(), class_499Var);
            case 70:
                return new class_348(70, dataInputStream.readUnsignedShort(), class_499Var);
            case 73:
                return new class_348(73, dataInputStream.readUnsignedShort(), class_499Var);
            case 74:
                return new class_348(74, dataInputStream.readUnsignedShort(), class_499Var);
            case 83:
                return new class_348(83, dataInputStream.readUnsignedShort(), class_499Var);
            case 90:
                return new class_348(90, dataInputStream.readUnsignedShort(), class_499Var);
            case 91:
                int readUnsignedShort = dataInputStream.readUnsignedShort();
                class_130[] class_130VarArr = new class_130[readUnsignedShort];
                int i = 0;
                int i2 = 0;
                while (i < readUnsignedShort) {
                    int i3 = i2 + 1;
                    class_130VarArr[i2] = method_638(dataInputStream, class_499Var);
                    i = i3;
                    i2 = i3;
                }
                return new class_451(91, class_130VarArr, class_499Var);
            case 99:
                return new class_407(99, dataInputStream.readUnsignedShort(), class_499Var);
            case 101:
                return new class_589(101, dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), class_499Var);
            case 115:
                return new class_348(115, dataInputStream.readUnsignedShort(), class_499Var);
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "Unexpected element value kind in annotation: ").append((int) readByte).toString());
        }
    }

    public String method_640() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(method_639());
        return stringBuffer.toString();
    }
}
