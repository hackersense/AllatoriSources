package com.allatori.ant;

import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.unmapped.class_282;
import com.allatori.interfaces.unmapped.class_555;
import com.allatori.interfaces.unmapped.class_570;
import com.allatori.interfaces.unmapped.class_97;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_561 extends class_539 implements class_570, class_97 {
    public class_561() {
    }

    public class_561(short s) {
        super(s, (short) 1);
    }

    @Override // p000.class_97
    public class_212 method_32(class_208 class_208Var) {
        switch (this.IIiIIIIiii) {
            case 46:
            case class_555.field_2159 /* 79 */:
                return class_212.field_802;
            case 47:
            case class_555.field_2255 /* 80 */:
                return class_212.field_798;
            case 48:
            case class_555.field_2096 /* 81 */:
                return class_212.field_812;
            case 49:
            case class_555.field_2288 /* 82 */:
                return class_212.field_810;
            case 50:
            case 83:
                return class_212.field_808;
            case 51:
            case class_555.field_2183 /* 84 */:
                return class_212.field_795;
            case 52:
            case class_555.field_2313 /* 85 */:
                return class_212.field_806;
            case 53:
            case class_555.field_2226 /* 86 */:
                return class_212.field_801;
            default:
                throw new class_151(new StringBuilder().insert(0, "Oops: unknown case in switch").append((int) this.IIiIIIIiii).toString());
        }
    }

    @Override // p000.class_570
    public Class[] method_43() {
        return class_282.field_989;
    }
}
