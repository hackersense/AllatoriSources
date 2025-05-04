package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.commons.ASMStuffs;
import com.allatori.exception.runtime.class_168;
import com.allatori.interfaces.unmapped.class_21;
import com.allatori.interfaces.unmapped.class_241;
import com.allatori.interfaces.unmapped.class_555;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_499 implements Cloneable, class_241, Serializable {
    public int field_1955;
    public class_286[] field_1956;

    public class_499 method_502() {
        try {
            class_499 class_499Var = (class_499) clone();
            class_499Var.field_1956 = new class_286[this.field_1955];
            for (int i = 1; i < this.field_1955; i++) {
                if (this.field_1956[i] != null) {
                    class_499Var.field_1956[i] = this.field_1956[i].method_1263();
                }
            }
            return class_499Var;
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    public class_286[] method_1846() {
        return this.field_1956;
    }

    public static final String method_199(String str) {
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length + 5);
        char[] charArray = str.toCharArray();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            switch (charArray[i2]) {
                case '\b':
                    stringBuffer.append("\\b");
                    break;
                case '\t':
                    stringBuffer.append("\\t");
                    break;
                case '\n':
                    stringBuffer.append("\\n");
                    break;
                case class_555.field_2278 /* 13 */:
                    stringBuffer.append("\\r");
                    break;
                case ASMStuffs.field_138 /* 34 */:
                    stringBuffer.append("\\\"");
                    break;
                default:
                    stringBuffer.append(charArray[i2]);
                    break;
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        return stringBuffer.toString();
    }

    public class_286 method_1849(int i, byte b) {
        class_286 method_982 = method_982(i);
        if (method_982 == null) {
            throw new class_168(new StringBuilder().insert(0, "Constant pool at index ").append(i).append(" is null.").toString());
        }
        if (method_982.method_619() == b) {
            return method_982;
        }
        throw new class_168(new StringBuilder().insert(0, "Expected class `").append(ASMInterface.field_1351[b]).append("' at index ").append(i).append(" and got ").append(method_982).toString());
    }

    public class_499(class_286[] class_286VarArr) {
        method_1850(class_286VarArr);
    }

    public String method_1847(class_286 class_286Var) {
        byte method_619 = class_286Var.method_619();
        switch (method_619) {
            case 1:
                return ((class_371) class_286Var).method_198();
            case 2:
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "Unknown constant type ").append((int) method_619).toString());
            case 3:
                return new StringBuilder().insert(0, "").append(((class_400) class_286Var).method_47()).toString();
            case 4:
                return new StringBuilder().insert(0, "").append(((class_340) class_286Var).method_1399()).toString();
            case 5:
                return new StringBuilder().insert(0, "").append(((class_232) class_286Var).method_1074()).toString();
            case 6:
                return new StringBuilder().insert(0, "").append(((class_573) class_286Var).method_794()).toString();
            case 7:
                return class_204.method_945(((class_371) method_1849(((class_43) class_286Var).method_47(), (byte) 1)).method_198(), false);
            case 8:
                return new StringBuilder().insert(0, "\"").append(method_199(((class_371) method_1849(((class_118) class_286Var).method_47(), (byte) 1)).method_198())).append("\"").toString();
            case 9:
            case 10:
            case 11:
                return method_1848(((class_456) class_286Var).method_47(), (byte) 7) + "." + method_1848(((class_456) class_286Var).method_433(), (byte) 12);
            case 12:
                return method_1848(((class_538) class_286Var).method_47(), (byte) 1) + " " + method_1848(((class_538) class_286Var).method_433(), (byte) 1);
        }
    }

    public String method_1845(int i, byte b) {
        int method_47;
        class_286 method_1849 = method_1849(i, b);
        switch (b) {
            case 7:
                method_47 = ((class_43) method_1849).method_47();
                break;
            case 8:
                method_47 = ((class_118) method_1849).method_47();
                break;
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "getConstantString called with illegal tag ").append((int) b).toString());
        }
        return ((class_371) method_1849(method_47, (byte) 1)).method_198();
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0012 */
    public class_499(DataInputStream dataInputStream) throws IOException {
        this.field_1955 = dataInputStream.readUnsignedShort();
        this.field_1956 = new class_286[this.field_1955];
        int i = 1;
        while (true) {
            int i2 = i;
            if (i >= this.field_1955) {
                return;
            }
            this.field_1956[i2] = class_286.method_1262(dataInputStream);
            byte method_619 = this.field_1956[i2].method_619();
            if (method_619 == 6 || method_619 == 5) {
                i2++;
            }
            i = i2 + 1;
        }
    }

    public class_286 method_982(int i) {
        if (i >= this.field_1956.length || i < 0) {
            throw new class_168(new StringBuilder().insert(0, "Invalid constant pool reference: ").append(i).append(". Constant pool size is: ").append(this.field_1956.length).toString());
        }
        return this.field_1956[i];
    }

    public String method_1848(int i, byte b) {
        return method_1847(method_1849(i, b));
    }

    public void method_1850(class_286[] class_286VarArr) {
        this.field_1956 = class_286VarArr;
        this.field_1955 = class_286VarArr == null ? 0 : class_286VarArr.length;
    }

    public void method_1012(int i, class_286 class_286Var) {
        this.field_1956[i] = class_286Var;
    }

    public int method_47() {
        return this.field_1955;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0008 */
    public void method_184(DataOutputStream dataOutputStream) throws IOException {
        int i = 1;
        dataOutputStream.writeShort(this.field_1955);
        while (true) {
            int i2 = i;
            if (i < this.field_1955) {
                if (this.field_1956[i2] != null) {
                    this.field_1956[i2].method_184(dataOutputStream);
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    @Override // p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_69(this);
    }
}
