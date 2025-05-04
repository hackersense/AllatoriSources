package com.allatori.ant;

import com.allatori.exception.runtime.class_168;
import com.allatori.interfaces.unmapped.class_21;
import com.allatori.interfaces.unmapped.class_241;
import com.allatori.interfaces.unmapped.class_449;
import com.allatori.interfaces.unmapped.class_555;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.Serializable;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_286 implements Cloneable, class_241, Serializable {
    public static class_449 field_1006 = new class_607();
    public byte field_1007;

    public abstract void method_163(class_21 class_21Var);

    public abstract void method_184(DataOutputStream dataOutputStream);

    public static void method_861(class_449 class_449Var) {
        field_1006 = class_449Var;
    }

    public static final class_286 method_1262(DataInputStream dataInputStream) {
        byte readByte = dataInputStream.readByte();
        switch (readByte) {
            case 1:
                return new class_371(dataInputStream);
            case 2:
            case class_555.field_2278 /* 13 */:
            case class_555.field_2199 /* 14 */:
            case 17:
            default:
                throw new class_168(new StringBuilder().insert(0, "Invalid byte tag in constant pool: ").append((int) readByte).toString());
            case 3:
                return new class_400(dataInputStream);
            case 4:
                return new class_340(dataInputStream);
            case 5:
                return new class_232(dataInputStream);
            case 6:
                return new class_573(dataInputStream);
            case 7:
                return new class_43(dataInputStream);
            case 8:
                return new class_118(dataInputStream);
            case 9:
                return new class_530(dataInputStream);
            case 10:
                return new class_35(dataInputStream);
            case 11:
                return new class_401(dataInputStream);
            case 12:
                return new class_538(dataInputStream);
            case 15:
                return new class_248(dataInputStream);
            case 16:
                return new class_252(dataInputStream);
            case 18:
                return new class_520(dataInputStream);
        }
    }

    public final byte method_619() {
        return this.field_1007;
    }

    public boolean equals(Object obj) {
        return field_1006.method_161(this, obj);
    }

    public static class_449 method_859() {
        return field_1006;
    }

    public Object clone() {
        return super.clone();
    }

    public class_286 method_1263() {
        try {
            return (class_286) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public int hashCode() {
        return field_1006.method_162(this);
    }

    public class_286(byte b) {
        this.field_1007 = b;
    }
}
