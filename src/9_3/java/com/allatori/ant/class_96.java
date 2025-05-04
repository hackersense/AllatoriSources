package com.allatori.ant;

import com.allatori.exception.class_316;
import com.allatori.interfaces.ASMInterface;
import com.allatori.commons.AllatoriLogger;
import com.allatori.commons.Info;
import com.allatori.interfaces.unmapped.class_389;
import com.allatori.interfaces.unmapped.class_555;
import com.allatori.interfaces.unmapped.class_93;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_96 {
    public String field_502;
    public class_606 field_503;

    public String method_593() throws class_316 {
        try {
            return method_590(method_595(method_591()));
        } catch (Exception e) {
            throw new class_316("Cannot extract watermark.");
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:31:0x0112 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:16:0x006c */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:20:0x0093 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:24:0x00a6 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0009 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:34:0x011f */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:42:0x0153 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:46:0x01b1 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:9:0x0033 */
    public short[] method_596(String str) {
        int i;
        int i2;
        short s;
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        while (true) {
            i = length;
            if (length % 4 == 0) {
                break;
            }
            length = i + 1;
        }
        byte[] bArr = new byte[i];
        Arrays.fill(bArr, (byte) 0);
        bArr[0] = bytes[0];
        if (bytes.length > 1) {
            bArr[1] = (byte) (bArr[1] | (bytes[1] ^ bytes[0]));
        }
        int i3 = 2;
        while (true) {
            int i4 = i3;
            if (i3 >= bytes.length) {
                break;
            }
            i3 = i4 + 1;
            bArr[i4] = (byte) (bArr[i4] | ((bytes[i4] ^ bytes[i4 - 1]) ^ bytes[i4 - 2]));
        }
        int length2 = bytes.length;
        int i5 = length2;
        int i6 = length2;
        while (i5 < i) {
            int i7 = i6 + 1;
            bArr[i6] = (byte) (bArr[i6] | class_231.method_1071(256));
            i5 = i7;
            i6 = i7;
        }
        byte[] bytes2 = this.field_502.getBytes();
        int i8 = 0;
        while (true) {
            int i9 = i8;
            if (i8 >= bArr.length) {
                break;
            }
            i8 = i9 + 1;
            bArr[i9] = (byte) (bArr[i9] ^ bytes2[i9 % bytes2.length]);
        }
        int method_1073 = ((int) (i * (0.666d + (class_231.method_1073() / 3.0d)))) + class_555.field_2204;
        while (true) {
            i2 = method_1073;
            if (method_1073 % 4 == 0) {
                break;
            }
            method_1073 = i2 + 1;
        }
        short[] sArr = new short[i + i2];
        int i10 = 0;
        Arrays.fill(sArr, (short) 0);
        while (true) {
            int i11 = i10;
            if (i10 >= sArr.length) {
                break;
            }
            if (i11 >= i) {
                int i12 = i11 + 2;
                sArr[i12] = (short) (sArr[i12] | class_231.method_1071(class_408.field_1257));
                int i13 = i11 + 3;
                sArr[i13] = (short) (sArr[i13] | class_231.method_1071(class_408.field_1257));
            } else {
                int i14 = i11 + 2;
                sArr[i14] = (short) (sArr[i14] | (bArr[i11] << 8) | (bArr[i11 + 2] & ASMInterface.field_1291));
                int i15 = i11 + 3;
                sArr[i15] = (short) (sArr[i15] | (bArr[i11 + 1] << 8) | (bArr[i11 + 3] & ASMInterface.field_1291));
            }
            i10 = i11 + 4;
        }
        Hashtable hashtable = new Hashtable();
        hashtable.put(new Short((short) (this.field_502.hashCode() | 0)), "");
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int i18 = i16;
            if (i17 >= sArr.length) {
                break;
            }
            int method_1071 = class_231.method_1071(65536) - 32768;
            while (true) {
                s = (short) method_1071;
                if (!hashtable.containsKey(new Short(s))) {
                    break;
                }
                method_1071 = s + 1;
            }
            hashtable.put(new Short(s), "");
            sArr[i18] = s;
            if (i18 > 3) {
                sArr[i18 - 3] = s;
            }
            i16 = i18 + 4;
            i17 = i16;
        }
        int method_10712 = i + (class_231.method_1071(20) * 4);
        while (true) {
            int i19 = method_10712;
            if (method_10712 >= sArr.length) {
                break;
            }
            method_10712 = i19 + 4;
            sArr[i19 + 1] = sArr[class_231.method_1071(i / 4) * 4];
        }
        int hashCode = this.field_502.hashCode();
        int length3 = sArr.length - 4;
        int length4 = sArr.length - 3;
        int length5 = sArr.length - 2;
        sArr[sArr.length - 1] = 0;
        sArr[length5] = 0;
        sArr[length4] = 0;
        sArr[length3] = 0;
        int length6 = sArr.length - 4;
        sArr[length6] = (short) (sArr[length6] | hashCode);
        int length7 = sArr.length - 3;
        sArr[length7] = (short) ((hashCode >> 16) | sArr[length7]);
        int length8 = sArr.length - 2;
        sArr[length8] = (short) (sArr[length8] | sArr[0]);
        int length9 = sArr.length - 1;
        sArr[length9] = (short) (sArr[length9] | bytes.length);
        int i20 = 0;
        while (true) {
            int i21 = i20;
            if (i20 < sArr.length) {
                short s2 = sArr[i21];
                short s3 = sArr[i21 + 1];
                short s4 = sArr[i21 + 2];
                short s5 = sArr[i21 + 3];
                sArr[i21 + 3] = 0;
                sArr[i21 + 2] = 0;
                sArr[i21 + 1] = 0;
                sArr[i21] = 0;
                sArr[i21] = (short) (sArr[i21] | ((s2 ^ s3) ^ s4));
                int i22 = i21 + 1;
                sArr[i22] = (short) (sArr[i22] | ((s3 ^ s4) ^ s5));
                int i23 = i21 + 2;
                sArr[i23] = (short) (((s4 ^ s2) ^ s5) | sArr[i23]);
                int i24 = i21 + 3;
                int i25 = (s2 ^ s3) ^ s5;
                i20 = i21 + 4;
                sArr[i24] = (short) (i25 | sArr[i24]);
            } else {
                return sArr;
            }
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x000c */
    public Vector method_591() {
        Vector vector = new Vector();
        Iterator method_2108 = this.field_503.method_2108();
        while (true) {
            while (method_2108.hasNext()) {
                class_202 class_202Var = (class_202) method_2108.next();
                try {
                } catch (ClassCastException e) {
                    AllatoriLogger.method_678(new StringBuilder().insert(0, "ALLATORI INTERNAL ERROR. Class ").append(class_202Var.method_198()).toString());
                }
                if (!class_544.method_1927().method_101(this.field_503, class_202Var)) {
                    class_557[] method_904 = class_202Var.method_904();
                    int length = method_904.length - 1;
                    int i = length;
                    int i2 = length;
                    while (i >= 0) {
                        class_557 class_557Var = method_904[i2];
                        if (class_557Var.method_1962() != null) {
                            vector.add(new class_323(class_202Var, class_557Var));
                        }
                        int i3 = i2 - 1;
                        i = i3;
                        i2 = i3;
                    }
                }
            }
            return vector;
        }
    }

    public boolean method_598(class_337 class_337Var) {
        if (!(class_337Var.method_1038() instanceof class_69) || class_337Var.method_415() == null || !(class_337Var.method_415().method_1038() instanceof class_69) || class_337Var.method_415().method_415() == null || !(class_337Var.method_415().method_415().method_1038() instanceof class_69) || class_337Var.method_415().method_415().method_415() == null || !(class_337Var.method_415().method_415().method_415().method_1038() instanceof class_69) || class_337Var.method_415().method_415().method_415().method_415() == null || !(class_337Var.method_415().method_415().method_415().method_415().method_1038() instanceof class_578) || class_337Var.method_415().method_415().method_415().method_415().method_415() == null || !(class_337Var.method_415().method_415().method_415().method_415().method_415().method_1038() instanceof class_578)) {
            return false;
        }
        return true;
    }

    public boolean method_592(class_389[] class_389VarArr) {
        if (class_389VarArr == null) {
            return true;
        }
        int i = 0;
        int i2 = 0;
        while (i < class_389VarArr.length) {
            class_389 class_389Var = class_389VarArr[i2];
            if (!(class_389Var instanceof class_270) && !(class_389Var instanceof class_139)) {
                return false;
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        return true;
    }

    public class_96(class_606 class_606Var, String str) {
        this.field_503 = class_606Var;
        this.field_502 = str;
        class_557.method_861(class_82.method_548());
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:56:0x019b */
    public String method_590(short[] sArr) {
        int i;
        int i2;
        short[] sArr2;
        short[] sArr3;
        int i3 = 0;
        int i4 = 0;
        while (i3 < sArr.length) {
            short s = sArr[i4];
            short s2 = sArr[i4 + 1];
            short s3 = sArr[i4 + 2];
            short s4 = sArr[i4 + 3];
            sArr[i4 + 3] = 0;
            sArr[i4 + 2] = 0;
            sArr[i4 + 1] = 0;
            sArr[i4] = 0;
            sArr[i4] = (short) (sArr[i4] | ((s ^ s3) ^ s4));
            if (sArr[i4] % 2 != 0) {
                int i5 = i4 + 1;
                sArr[i5] = (short) (sArr[i5] | ((s2 ^ s3) ^ sArr[i4]));
                sArr2 = sArr;
            } else {
                int i6 = i4 + 1;
                sArr[i6] = (short) (sArr[i6] | ((s ^ s2) ^ s4));
                sArr2 = sArr;
            }
            if (sArr2[i4 + 1] % 4 != 0) {
                if (sArr[i4 + 1] % 4 != 1) {
                    if (sArr[i4 + 1] % 4 != 2) {
                        int i7 = i4 + 2;
                        sArr[i7] = (short) (sArr[i7] | ((s2 ^ s4) ^ sArr[i4]));
                        sArr3 = sArr;
                    } else {
                        int i8 = i4 + 2;
                        sArr[i8] = (short) (sArr[i8] | ((s3 ^ s4) ^ sArr[i4 + 1]));
                        sArr3 = sArr;
                    }
                } else {
                    int i9 = i4 + 2;
                    sArr[i9] = (short) (sArr[i9] | ((sArr[i4] ^ s) ^ sArr[i4 + 1]));
                    sArr3 = sArr;
                }
            } else {
                int i10 = i4 + 2;
                sArr[i10] = (short) (sArr[i10] | ((s ^ s2) ^ s3));
                sArr3 = sArr;
            }
            if (sArr3[i4 + 2] % 7 == 0) {
                int i11 = i4 + 3;
                sArr[i11] = (short) (sArr[i11] | ((s2 ^ s3) ^ s4));
            } else if (sArr[i4 + 2] % 7 != 1) {
                if (sArr[i4 + 2] % 7 != 2) {
                    if (sArr[i4 + 2] % 7 != 3) {
                        if (sArr[i4 + 2] % 7 == 4) {
                            int i12 = i4 + 3;
                            sArr[i12] = (short) (((s ^ s2) ^ sArr[i4]) | sArr[i12]);
                        } else if (sArr[i4 + 2] % 7 == 5) {
                            int i13 = i4 + 3;
                            sArr[i13] = (short) (((s ^ s3) ^ sArr[i4 + 1]) | sArr[i13]);
                        } else {
                            int i14 = i4 + 3;
                            sArr[i14] = (short) (((s ^ s4) ^ sArr[i4 + 2]) | sArr[i14]);
                        }
                    } else {
                        int i15 = i4 + 3;
                        sArr[i15] = (short) (sArr[i15] | ((s2 ^ sArr[i4 + 1]) ^ sArr[i4 + 2]));
                    }
                } else {
                    int i16 = i4 + 3;
                    sArr[i16] = (short) (sArr[i16] | ((sArr[i4] ^ s3) ^ sArr[i4 + 2]));
                }
            } else {
                int i17 = i4 + 3;
                sArr[i17] = (short) (sArr[i17] | ((sArr[i4] ^ s4) ^ sArr[i4 + 1]));
            }
            int i18 = i4 + 4;
            i3 = i18;
            i4 = i18;
        }
        int hashCode = this.field_502.hashCode();
        short s5 = (short) (hashCode | 0);
        short s6 = (short) ((hashCode >> 16) | 0);
        Hashtable hashtable = new Hashtable();
        int i19 = 0;
        int i20 = -1;
        int i21 = 0;
        while (i19 < sArr.length) {
            hashtable.put(new Short(sArr[i21]), new Integer(i21));
            if (sArr[i21] != s5 || sArr[i21 + 1] != s6) {
                i2 = i20;
            } else {
                if (i20 != -1) {
                    throw new Exception();
                }
                i2 = i21;
            }
            int i22 = i21 + 4;
            i19 = i22;
            i20 = i2;
            i21 = i22;
        }
        if (i20 != -1) {
            short s7 = sArr[i20 + 3];
            while (true) {
                i = s7;
                if (s7 % 4 == 0) {
                    break;
                }
                s7 = (short) (i + 1);
            }
            byte[] bArr = new byte[i];
            Arrays.fill(bArr, (byte) 0);
            int i23 = 0;
            int i24 = 0;
            int i25 = i20 + 1;
            while (i23 < bArr.length) {
                i25 = ((Number) hashtable.get(new Short(sArr[i25 + 1]))).shortValue();
                int i26 = i24 + 1;
                bArr[i24] = (byte) (bArr[i24] | (sArr[i25 + 2] >> 8));
                int i27 = i26 + 1;
                bArr[i26] = (byte) (bArr[i26] | (sArr[i25 + 3] >> 8));
                int i28 = i27 + 1;
                bArr[i27] = (byte) (bArr[i27] | sArr[i25 + 2]);
                int i29 = i28 + 1;
                bArr[i28] = (byte) (bArr[i28] | sArr[i25 + 3]);
                i23 = i29;
                i24 = i29;
            }
            byte[] bytes = this.field_502.getBytes();
            int i30 = 0;
            int i31 = 0;
            while (i30 < bArr.length) {
                int i32 = i31 + 1;
                bArr[i31] = (byte) (bArr[i31] ^ bytes[i31 % bytes.length]);
                i30 = i32;
                i31 = i32;
            }
            if (bArr.length > 1) {
                bArr[1] = (byte) (bArr[1] ^ bArr[0]);
            }
            int i33 = 2;
            int i34 = 2;
            while (i33 < bArr.length) {
                int i35 = i34 + 1;
                bArr[i34] = (byte) (bArr[i34] ^ (bArr[i34 - 1] ^ bArr[i34 - 2]));
                i33 = i35;
                i34 = i35;
            }
            return new String(bArr, 0, sArr[i20 + 3], "UTF-8");
        }
        throw new Exception();
    }

    public void method_597(Vector vector, short[] sArr) {
        class_337 class_337Var;
        class_337 class_337Var2;
        int length = sArr.length / 4;
        int size = ((length - 1) / vector.size()) + 1;
        int size2 = vector.size() - 1;
        int i = size2;
        int i2 = size2;
        int i3 = 0;
        while (i >= 0) {
            class_323 class_323Var = (class_323) vector.get(i2);
            class_70 method_438 = class_323.method_1377(class_323Var).method_438();
            class_337 method_415 = method_438.method_415();
            class_337 class_337Var3 = method_415;
            class_337 class_337Var4 = method_415;
            while (true) {
                if (class_337Var3 == null) {
                    class_337Var = class_337Var4;
                    class_337Var2 = class_337Var4;
                    break;
                } else if (!(class_337Var4.method_1038() instanceof class_94) || !method_592(class_337Var4.method_1398()) || class_337Var4.method_415() == null) {
                    class_337 method_4152 = class_337Var4.method_415();
                    class_337Var3 = method_4152;
                    class_337Var4 = method_4152;
                } else {
                    class_337 method_4153 = class_337Var4.method_415();
                    class_337Var = method_4153;
                    class_337Var2 = method_4153;
                    break;
                }
            }
            if (class_337Var == null) {
                class_337Var2 = method_438.method_415();
            }
            if (class_544.method_1937().method_1699()) {
                class_337Var2 = method_438.method_419();
            }
            int i4 = 0;
            class_337 class_337Var5 = class_337Var2;
            while (true) {
                method_438.method_449(class_337Var5, new class_69(sArr[i3]));
                int i5 = i3 + 1;
                method_438.method_449(class_337Var5, new class_69(sArr[i5]));
                int i6 = i5 + 1;
                method_438.method_449(class_337Var5, new class_69(sArr[i6]));
                int i7 = i6 + 1;
                method_438.method_449(class_337Var5, new class_69(sArr[i7]));
                i3 = i7 + 1;
                method_438.method_449(class_337Var5, class_93.field_477);
                method_438.method_449(class_337Var5, class_93.field_477);
                int i8 = i4 + 1;
                class_337Var5 = method_438.method_415();
                if (i8 < size && i2 < length - (i3 / 4)) {
                    i4 = i8;
                }
            }
            class_323.method_1377(class_323Var).method_2056();
            int i9 = i2 - 1;
            class_323.method_1376(class_323Var).method_914(class_323.method_1375(class_323Var), class_323.method_1377(class_323Var).method_2048());
            i = i9;
            i2 = i9;
        }
    }

    public short[] method_595(Vector vector) {
        Vector vector2 = new Vector();
        int size = vector.size() - 1;
        int i = size;
        int i2 = size;
        while (i >= 0) {
            class_337 method_415 = class_323.method_1377((class_323) vector.get(i2)).method_438().method_415();
            class_337 class_337Var = method_415;
            class_337 class_337Var2 = method_415;
            while (class_337Var != null) {
                if (method_598(class_337Var2)) {
                    vector2.add(((class_69) class_337Var2.method_1038()).method_238());
                    vector2.add(((class_69) class_337Var2.method_415().method_1038()).method_238());
                    vector2.add(((class_69) class_337Var2.method_415().method_415().method_1038()).method_238());
                    vector2.add(((class_69) class_337Var2.method_415().method_415().method_415().method_1038()).method_238());
                }
                class_337 method_4152 = class_337Var2.method_415();
                class_337Var = method_4152;
                class_337Var2 = method_4152;
            }
            int i3 = i2 - 1;
            i = i3;
            i2 = i3;
        }
        short[] sArr = new short[vector2.size()];
        int length = sArr.length - 1;
        int i4 = length;
        int i5 = length;
        while (i4 >= 0) {
            int i6 = i5 - 1;
            sArr[i5] = ((Number) vector2.get(i5)).shortValue();
            i4 = i6;
            i5 = i6;
        }
        return sArr;
    }

    public boolean method_599(Vector vector) {
        int size = vector.size() - 1;
        int i = size;
        int i2 = size;
        while (i >= 0) {
            class_337 method_415 = class_323.method_1377((class_323) vector.get(i2)).method_438().method_415();
            class_337 class_337Var = method_415;
            class_337 class_337Var2 = method_415;
            while (class_337Var != null) {
                if (!method_598(class_337Var2)) {
                    class_337 method_4152 = class_337Var2.method_415();
                    class_337Var = method_4152;
                    class_337Var2 = method_4152;
                } else {
                    return true;
                }
            }
            int i3 = i2 - 1;
            i = i3;
            i2 = i3;
        }
        return false;
    }

    public void method_594(String str) {
        try {
            Vector method_591 = method_591();
            if (method_599(method_591)) {
                throw new class_316("The jar file already contains watermark.");
            }
            class_231.method_1070(method_591);
            short[] method_596 = method_596(str);
            int size = method_591.size() - (method_596.length / 4);
            int i = size;
            int i2 = size;
            while (i > 0) {
                int i3 = i2 - 1;
                method_591.remove(0);
                i = i3;
                i2 = i3;
            }
            method_597(method_591, method_596);
        } catch (Exception e) {
            System.out.println(new StringBuilder().insert(0, "############### EXCEPTION (").append(Info.getVersion()).append(") ###############").toString());
            e.printStackTrace();
            System.out.println("#################################################");
            throw new class_316(new StringBuilder().insert(0, "Watermarking error: ").append(e.getMessage()).toString());
        }
    }
}
