package com.allatori.ant;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_383 {
    public static final int field_1213 = 66;
    public static final int field_1214 = 23;
    public static final int field_1215 = 74;
    public static final int field_1216 = 68;
    public static final int field_1217 = 75;
    public static final int field_1218 = 67;
    public static final int field_1219 = 22;
    public static final int field_1220 = 64;
    public static final int field_1221 = 0;
    public static final int field_1222 = 16;
    public static final int field_1223 = 17;
    public static final int field_1224 = 71;
    public static final int field_1226 = 18;
    public static final int field_1227 = 20;
    public static final int field_1228 = 1;
    public static final int field_1229 = 73;
    public static final int field_1230 = 65;
    public static final int field_1231 = 19;
    public static final int field_1232 = 72;
    public static final int field_1233 = 21;
    public static final int field_1234 = 69;
    public static final int field_1235 = 70;
    public final int field_1225;

    public static class_383 method_1537(int i) {
        return new class_383(369098752 | (i << 16));
    }

    public int method_1529() {
        return (this.field_1225 & 16776960) >> 8;
    }

    public static class_383 method_1539(int i) {
        return new class_383(385875968 | (i << 8));
    }

    public int method_1526() {
        return (this.field_1225 & 16711680) >> 16;
    }

    public static void method_1541(int i, class_258 class_258Var) {
        switch (i >>> 24) {
            case 0:
            case 1:
            case 22:
                class_258Var.method_1138(i >>> 16);
                return;
            case 16:
            case 17:
            case 18:
            case 23:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
                class_258Var.method_1136(i >>> 24, (16776960 & i) >> 8);
                return;
            case 19:
            case 20:
            case 21:
                class_258Var.method_1132(i >>> 24);
                return;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                class_258Var.method_1139(i);
                return;
            default:
                throw new IllegalArgumentException();
        }
    }

    public int method_1542() {
        return (this.field_1225 & 65280) >> 8;
    }

    public class_383(int i) {
        this.field_1225 = i;
    }

    public static class_383 method_1535(int i) {
        return new class_383(i << 24);
    }

    public static class_383 method_1531(int i, int i2) {
        return new class_383((i << 24) | (i2 << 16));
    }

    public static class_383 method_1533(int i, int i2) {
        return new class_383((i << 24) | i2);
    }

    public int method_1540() {
        return this.field_1225;
    }

    public static class_383 method_1534(int i) {
        return new class_383(1107296256 | (i << 8));
    }

    public int method_1532() {
        return this.field_1225 >>> 24;
    }

    public int method_1525() {
        return (this.field_1225 & 16711680) >> 16;
    }

    public static class_383 method_1530(int i, int i2, int i3) {
        return new class_383((i << 24) | (i2 << 16) | (i3 << 8));
    }

    public int method_1538() {
        return this.field_1225 & 255;
    }

    public int method_1536() {
        return (this.field_1225 & 16776960) >> 8;
    }

    public static class_383 method_1527(int i) {
        return new class_383(268435456 | ((65535 & i) << 8));
    }

    public int method_1528() {
        return (short) ((this.field_1225 & 16776960) >> 8);
    }
}
