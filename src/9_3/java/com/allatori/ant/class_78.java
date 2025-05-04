package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.interfaces.unmapped.class_21;
import com.allatori.interfaces.unmapped.class_241;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_78 implements class_241, ASMInterface {
    public boolean field_327;
    public int field_328;
    public class_499 field_329;
    public int field_330;
    public List field_331 = new ArrayList();

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0012 */
    public static class_78 method_532(DataInputStream dataInputStream, class_499 class_499Var, boolean z) {
        class_78 class_78Var = new class_78(dataInputStream.readUnsignedShort(), class_499Var, z);
        int i = 0;
        class_78Var.field_330 = dataInputStream.readUnsignedShort();
        while (true) {
            int i2 = i;
            if (i >= class_78Var.field_330) {
                return class_78Var;
            }
            i = i2 + 1;
            class_78Var.field_331.add(new class_553(dataInputStream.readUnsignedShort(), class_130.method_638(dataInputStream, class_499Var), class_499Var));
        }
    }

    public boolean method_424() {
        return this.field_327;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:4:0x0020 */
    public String method_464() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("@");
        stringBuffer.append(method_198());
        if (method_530().length > 0) {
            stringBuffer.append("(");
            int i = 0;
            while (true) {
                int i2 = i;
                if (i >= method_530().length) {
                    break;
                }
                i = i2 + 1;
                stringBuffer.append(method_530()[i2].method_1951());
            }
            stringBuffer.append(")");
        }
        return stringBuffer.toString();
    }

    public class_78(int i, class_499 class_499Var, boolean z) {
        this.field_328 = i;
        this.field_329 = class_499Var;
        this.field_327 = z;
    }

    @Override // p000.class_241
    public void method_163(class_21 class_21Var) {
    }

    public final int method_433() {
        return this.field_330;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0011 */
    public void method_184(DataOutputStream dataOutputStream) {
        int i = 0;
        dataOutputStream.writeShort(this.field_328);
        dataOutputStream.writeShort(this.field_331.size());
        while (true) {
            int i2 = i;
            if (i < this.field_331.size()) {
                i = i2 + 1;
                ((class_553) this.field_331.get(i2)).method_1954(dataOutputStream);
            } else {
                return;
            }
        }
    }

    public class_553[] method_530() {
        return (class_553[]) this.field_331.toArray(new class_553[this.field_331.size()]);
    }

    public void method_531(class_553 class_553Var) {
        if (this.field_331 == null) {
            this.field_331 = new ArrayList();
        }
        this.field_331.add(class_553Var);
    }

    public String method_198() {
        return ((class_371) this.field_329.method_1849(this.field_328, (byte) 1)).method_198();
    }

    public int method_47() {
        return this.field_328;
    }
}
