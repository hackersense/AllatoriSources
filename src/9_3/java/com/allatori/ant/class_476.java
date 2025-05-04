package com.allatori.ant;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_476 {
    public static final int field_1915 = 73;
    public static final int field_1916 = 64;
    public static final int field_1917 = 115;
    public static final int field_1918 = 90;
    public static final int field_1919 = 99;
    public static final int field_1920 = 74;
    public static final int field_1921 = 83;
    public static final int field_1922 = 68;
    public static final int field_1923 = 67;
    public static final int field_1925 = 91;
    public static final int field_1926 = 101;
    public static final int field_1927 = 70;
    public static final int field_1929 = 66;
    public int field_1924;
    public class_208 field_1928;

    public abstract void method_552(DataOutputStream dataOutputStream);

    public abstract class_130 method_553();

    public abstract String method_554();

    public static class_476 method_1827(class_130 class_130Var, class_208 class_208Var, boolean z) {
        switch (class_130Var.method_637()) {
            case 64:
                return new class_511((class_195) class_130Var, class_208Var, z);
            case 66:
            case 67:
            case 68:
            case 70:
            case 73:
            case 74:
            case 83:
            case 90:
            case 115:
                return new class_88((class_348) class_130Var, class_208Var, z);
            case 91:
                return new class_125((class_451) class_130Var, class_208Var, z);
            case 99:
                return new class_111((class_407) class_130Var, class_208Var, z);
            case 101:
                return new class_558((class_589) class_130Var, class_208Var, z);
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "Not implemented yet! (").append(class_130Var.method_637()).append(")").toString());
        }
    }

    public class_208 method_1825() {
        return this.field_1928;
    }

    public int method_1826() {
        return this.field_1924;
    }

    public class_476(int i, class_208 class_208Var) {
        this.field_1924 = i;
        this.field_1928 = class_208Var;
    }

    public static class_476 method_1828(DataInputStream dataInputStream, class_208 class_208Var) {
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        switch (readUnsignedByte) {
            case 64:
                return new class_511(64, new class_574(class_78.method_532(dataInputStream, class_208Var.method_502(), true), class_208Var, false), class_208Var);
            case 66:
                return new class_88(66, dataInputStream.readUnsignedShort(), class_208Var);
            case 67:
                return new class_88(67, dataInputStream.readUnsignedShort(), class_208Var);
            case 68:
                return new class_88(68, dataInputStream.readUnsignedShort(), class_208Var);
            case 70:
                return new class_88(70, dataInputStream.readUnsignedShort(), class_208Var);
            case 73:
                return new class_88(73, dataInputStream.readUnsignedShort(), class_208Var);
            case 74:
                return new class_88(74, dataInputStream.readUnsignedShort(), class_208Var);
            case 83:
                return new class_88(83, dataInputStream.readUnsignedShort(), class_208Var);
            case 90:
                return new class_88(90, dataInputStream.readUnsignedShort(), class_208Var);
            case 91:
                int readUnsignedShort = dataInputStream.readUnsignedShort();
                class_130[] class_130VarArr = new class_130[readUnsignedShort];
                int i = 0;
                int i2 = 0;
                while (i < readUnsignedShort) {
                    int i3 = i2 + 1;
                    class_130VarArr[i2] = class_130.method_638(dataInputStream, class_208Var.method_502());
                    i = i3;
                    i2 = i3;
                }
                return new class_125(91, class_130VarArr, class_208Var);
            case 99:
                return new class_111(dataInputStream.readUnsignedShort(), class_208Var);
            case 101:
                return new class_558(dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), class_208Var);
            case 115:
                return new class_88(115, dataInputStream.readUnsignedShort(), class_208Var);
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "Unexpected element value kind in annotation: ").append(readUnsignedByte).toString());
        }
    }
}
