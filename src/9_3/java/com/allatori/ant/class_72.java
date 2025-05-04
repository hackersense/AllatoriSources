package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_72 extends class_160 {
    public int field_256;

    @Override // p000.class_160, p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_61(this);
    }

    public class_72(int i, int i2, DataInputStream dataInputStream, class_499 class_499Var) {
        this(i, i2, dataInputStream.readUnsignedShort(), class_499Var);
    }

    public final int method_183() {
        return this.field_256;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:9:0x003b */
    public static final void method_463(class_600 class_600Var, StringBuffer stringBuffer) {
        int i;
        int read = class_600Var.read();
        if (read == -1) {
            throw new RuntimeException(new StringBuilder().insert(0, "Illegal signature: ").append(class_600Var.method_2099()).append(" no ident, reaching EOF").toString());
        }
        if (!method_462(read)) {
            StringBuffer stringBuffer2 = new StringBuffer();
            int i2 = 1;
            while (true) {
                i = read;
                if (!Character.isJavaIdentifierPart((char) read)) {
                    break;
                }
                i2++;
                stringBuffer2.append((char) i);
                read = class_600Var.read();
            }
            if (i == 58) {
                class_600Var.skip(17L);
                stringBuffer.append(stringBuffer2);
                class_600Var.read();
                class_600Var.method_1407();
                return;
            }
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int i5 = i4 + 1;
                class_600Var.method_1407();
                i3 = i5;
                i4 = i5;
            }
            return;
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        int read2 = class_600Var.read();
        while (true) {
            stringBuffer3.append((char) read2);
            read2 = class_600Var.read();
            if (read2 == -1 || (!Character.isJavaIdentifierPart((char) read2) && read2 != 47)) {
                break;
            }
        }
        stringBuffer.append(stringBuffer3.toString().replace('/', '.'));
        if (read2 != -1) {
            class_600Var.method_1407();
        }
    }

    public final String method_464() {
        return ((class_371) this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE.method_1849(this.field_256, (byte) 1)).method_198();
    }

    public final void method_461(int i) {
        this.field_256 = i;
    }

    @Override // p000.class_160
    public class_160 method_187(class_499 class_499Var) {
        return (class_72) clone();
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:18:0x001a */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        r6.append((char) r0);
        r0 = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void method_465(class_600 class_600Var, StringBuffer stringBuffer) {
        class_600 class_600Var2;
        method_463(class_600Var, stringBuffer);
        int read = class_600Var.read();
        if (read != 60 && read != 40) {
            class_600Var.method_1407();
            class_600Var2 = class_600Var;
        } else {
            stringBuffer.append((char) read);
            method_465(class_600Var, stringBuffer);
            while (true) {
                int read2 = class_600Var.read();
                if (read2 == 62 || read2 == 41) {
                    break;
                }
                if (read2 == -1) {
                    throw new RuntimeException(new StringBuilder().insert(0, "Illegal signature: ").append(class_600Var.method_2099()).append(" reaching EOF").toString());
                }
                stringBuffer.append(", ");
                class_600Var.method_1407();
                method_465(class_600Var, stringBuffer);
            }
        }
        int read3 = class_600Var2.read();
        if (!method_462(read3)) {
            if (read3 == 41) {
                class_600Var.method_1407();
                return;
            } else if (read3 == 59) {
                return;
            } else {
                throw new RuntimeException(new StringBuilder().insert(0, "Illegal signature: ").append(class_600Var.method_2099()).append(" read ").append((char) read3).toString());
            }
        }
        class_600Var.method_1407();
        method_465(class_600Var, stringBuffer);
    }

    public class_72(int i, int i2, int i3, class_499 class_499Var) {
        super((byte) 10, i, i2, class_499Var);
        this.field_256 = i3;
    }

    @Override // p000.class_160
    public final void method_184(DataOutputStream dataOutputStream) {
        super.method_184(dataOutputStream);
        dataOutputStream.writeShort(this.field_256);
    }

    public static final boolean method_460(String str) {
        return str.startsWith("L") && str.endsWith(">;");
    }

    public class_72(class_72 class_72Var) {
        this(class_72Var.method_433(), class_72Var.method_47(), class_72Var.method_183(), class_72Var.method_502());
    }

    public static boolean method_462(int i) {
        return i == 84 || i == 76;
    }

    public static String method_199(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        method_465(new class_600(str), stringBuffer);
        return stringBuffer.toString();
    }

    public static final boolean method_466(String str) {
        return str.startsWith("<") && str.indexOf(58) > 0;
    }
}
