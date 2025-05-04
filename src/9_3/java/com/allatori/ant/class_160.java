package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.interfaces.unmapped.class_21;
import com.allatori.interfaces.unmapped.class_241;
import com.allatori.interfaces.unmapped.class_325;
import com.allatori.interfaces.unmapped.class_555;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_160 implements Cloneable, class_241, Serializable {
    public static Map field_691 = new HashMap();
    public byte field_692;
    public int field_693;
    public int field_694;
    public class_499 field_695;

    public abstract void method_163(class_21 class_21Var);

    public abstract class_160 method_187(class_499 class_499Var);

    public final int method_47() {
        return this.field_694;
    }

    public static void method_778(String str, class_325 class_325Var) {
        field_691.put(str, class_325Var);
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0017 */
    public static final class_160 method_777(DataInputStream dataInputStream, class_499 class_499Var) throws IOException {
        byte b;
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        String method_198 = ((class_371) class_499Var.method_1849(readUnsignedShort, (byte) 1)).method_198();
        int readInt = dataInputStream.readInt();
        byte b2 = 0;
        while (true) {
            b = b2;
            if (b2 < 24) {
                if (method_198.equals(ASMInterface.field_1594[b])) {
                    break;
                }
                b2 = (byte) (b + 1);
            } else {
                b = -1;
                break;
            }
        }
        switch (b) {
            case -1:
                class_325 class_325Var = (class_325) field_691.get(method_198);
                if (class_325Var != null) {
                    return class_325Var.method_1383(readUnsignedShort, readInt, dataInputStream, class_499Var);
                }
                return new class_228(readUnsignedShort, readInt, dataInputStream, class_499Var);
            case 0:
                return new class_599(readUnsignedShort, readInt, dataInputStream, class_499Var);
            case 1:
                return new class_257(readUnsignedShort, readInt, dataInputStream, class_499Var);
            case 2:
                return new class_576(readUnsignedShort, readInt, dataInputStream, class_499Var);
            case 3:
                return new class_224(readUnsignedShort, readInt, dataInputStream, class_499Var);
            case 4:
                return new class_332(readUnsignedShort, readInt, dataInputStream, class_499Var);
            case 5:
                return new class_40(readUnsignedShort, readInt, dataInputStream, class_499Var);
            case 6:
                return new class_121(readUnsignedShort, readInt, dataInputStream, class_499Var);
            case 7:
                return new class_569(readUnsignedShort, readInt, dataInputStream, class_499Var);
            case 8:
                return new class_221(readUnsignedShort, readInt, dataInputStream, class_499Var);
            case 9:
                return new class_233(readUnsignedShort, readInt, dataInputStream, class_499Var);
            case 10:
                return new class_72(readUnsignedShort, readInt, dataInputStream, class_499Var);
            case 11:
                return new class_157(readUnsignedShort, readInt, dataInputStream, class_499Var);
            case 12:
                return new class_512(readUnsignedShort, readInt, dataInputStream, class_499Var);
            case class_555.field_2278 /* 13 */:
                return new class_129(readUnsignedShort, readInt, dataInputStream, class_499Var);
            case class_555.field_2199 /* 14 */:
                return new class_536(readUnsignedShort, readInt, dataInputStream, class_499Var);
            case 15:
                return new class_581(readUnsignedShort, readInt, dataInputStream, class_499Var);
            case 16:
                return new class_213(readUnsignedShort, readInt, dataInputStream, class_499Var);
            case 17:
                return new class_228(readUnsignedShort, readInt, dataInputStream, class_499Var);
            case 18:
                return new class_518(readUnsignedShort, readInt, dataInputStream, class_499Var);
            case 19:
                return new class_228(readUnsignedShort, readInt, dataInputStream, class_499Var);
            case 20:
                return new class_452(readUnsignedShort, readInt, dataInputStream, class_499Var);
            case 21:
                return new class_46(readUnsignedShort, readInt, dataInputStream, class_499Var);
            case 22:
                return new class_205(readUnsignedShort, readInt, dataInputStream, class_499Var);
            case 23:
                return new class_238(readUnsignedShort, readInt, dataInputStream, class_499Var);
            default:
                throw new IllegalStateException("Ooops! default case reached.");
        }
    }

    public static void method_671(String str) {
        field_691.remove(str);
    }

    public final void method_407(int i) {
        this.field_693 = i;
    }

    public final class_499 method_502() {
        return this.field_695;
    }

    public final int method_433() {
        return this.field_693;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void method_184(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.field_693);
        dataOutputStream.writeInt(this.field_694);
    }

    public final void method_498(class_499 class_499Var) {
        this.field_695 = class_499Var;
    }

    public final void method_46(int i) {
        this.field_694 = i;
    }

    public class_160(byte b, int i, int i2, class_499 class_499Var) {
        this.field_692 = b;
        this.field_693 = i;
        this.field_694 = i2;
        this.field_695 = class_499Var;
    }

    public final byte method_619() {
        return this.field_692;
    }

    public String method_198() {
        return ((class_371) this.field_695.method_1849(this.field_693, (byte) 1)).method_198();
    }
}
