package com.allatori.ant;

import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.unmapped.class_555;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_594 extends class_592 {
    public int field_2382;
    public class_212 field_2383;

    public class_212 method_669() {
        return this.field_2383;
    }

    public class_212 method_2057() {
        return this.field_2382 == 1 ? this.field_2383 : new class_594(this.field_2383, this.field_2382 - 1);
    }

    @Override // p000.class_212
    public boolean equals(Object obj) {
        if (!(obj instanceof class_594)) {
            return false;
        }
        class_594 class_594Var = (class_594) obj;
        return class_594Var.field_2382 == this.field_2382 && class_594Var.field_2383.equals(this.field_2383);
    }

    public class_594(String str, int i) {
        this(new class_392(str), i);
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:9:0x003a */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public class_594(class_212 class_212Var, int i) {
        super((byte) 13, "<dummy>");
        int i2 = 0;
        if (i >= 1 && i <= 255) {
            switch (class_212Var.method_619()) {
                case 12:
                    throw new class_151("Invalid type: void[]");
                case class_555.field_2278 /* 13 */:
                    class_594 class_594Var = (class_594) class_212Var;
                    this.field_2382 = class_594Var.field_2382 + i;
                    this.field_2383 = class_594Var.field_2383;
                    break;
                default:
                    this.field_2382 = i;
                    this.field_2383 = class_212Var;
                    break;
            }
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                int i3 = i2;
                if (i2 >= this.field_2382) {
                    stringBuffer.append(this.field_2383.method_198());
                    this.field_811 = stringBuffer.toString();
                    return;
                } else {
                    i2 = i3 + 1;
                    stringBuffer.append('[');
                }
            }
        } else {
            throw new class_151(new StringBuilder().insert(0, "Invalid number of dimensions: ").append(i).toString());
        }
    }

    @Override // p000.class_212
    public int hashCode() {
        return this.field_2383.hashCode() ^ this.field_2382;
    }

    public int method_433() {
        return this.field_2382;
    }

    public class_594(byte b, int i) {
        this(class_331.method_1384(b), i);
    }
}
