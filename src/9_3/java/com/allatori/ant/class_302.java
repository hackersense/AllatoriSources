package com.allatori.ant;

import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.unmapped.class_373;
import com.allatori.interfaces.unmapped.class_417;
import com.allatori.interfaces.unmapped.class_93;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_302 implements class_417, class_373, class_93 {
    public class_539 field_1087;

    public class_302(class_208 class_208Var, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            this.field_1087 = new class_302(class_208Var, number.intValue()).field_1087;
            return;
        }
        if (number instanceof Double) {
            this.field_1087 = new class_302(class_208Var, number.doubleValue()).field_1087;
        } else if (number instanceof Float) {
            this.field_1087 = new class_302(class_208Var, number.floatValue()).field_1087;
        } else {
            if (number instanceof Long) {
                this.field_1087 = new class_302(class_208Var, number.longValue()).field_1087;
                return;
            }
            throw new class_151(new StringBuilder().insert(0, "What's this: ").append(number).toString());
        }
    }

    public class_302(class_208 class_208Var, double d) {
        if (d == 0.0d) {
            this.field_1087 = IiiIIiIIIi;
        } else if (d == 1.0d) {
            this.field_1087 = iiIIIIIiII;
        } else {
            this.field_1087 = new class_274(class_208Var.method_995(d));
        }
    }

    public class_302(class_208 class_208Var, boolean z) {
        this.field_1087 = iIIiIIIiii[(z ? -(-1) : 0) + 3];
    }

    @Override // p000.class_417
    public final class_70 method_438() {
        return new class_70(this.field_1087);
    }

    public class_302(class_208 class_208Var, Character ch) {
        this(class_208Var, (int) ch.charValue());
    }

    public class_302(class_208 class_208Var, int i) {
        if (i >= -1 && i <= 5) {
            this.field_1087 = iIIiIIIiii[i + 3];
            return;
        }
        if (i >= -128 && i <= 127) {
            this.field_1087 = new class_281((byte) i);
        } else if (i < -32768 || i > 32767) {
            this.field_1087 = new class_489(class_208Var.method_994(i));
        } else {
            this.field_1087 = new class_69((short) i);
        }
    }

    public class_302(class_208 class_208Var, String str) {
        if (str == null) {
            this.field_1087 = iiiIiiIIii;
        } else {
            this.field_1087 = new class_489(class_208Var.method_1010(str));
        }
    }

    public final class_539 method_1038() {
        return this.field_1087;
    }

    public class_302(class_208 class_208Var, Boolean bool) {
        this(class_208Var, bool.booleanValue());
    }

    public class_302(class_208 class_208Var, float f) {
        if (f == 0.0d) {
            this.field_1087 = IiiIIIiIiI;
            return;
        }
        if (f == 1.0d) {
            this.field_1087 = iIiiIiIiII;
        } else if (f != 2.0d) {
            this.field_1087 = new class_489(class_208Var.method_1001(f));
        } else {
            this.field_1087 = IIIIIiiiiI;
        }
    }

    public class_302(class_208 class_208Var, long j) {
        if (j == 0) {
            this.field_1087 = iIiiIiiIII;
        } else if (j != 1) {
            this.field_1087 = new class_274(class_208Var.method_990(j));
        } else {
            this.field_1087 = IiIiIIIIiI;
        }
    }
}
