package com.allatori.ant;

import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.unmapped.class_194;
import com.allatori.interfaces.unmapped.class_555;
import com.allatori.interfaces.unmapped.class_601;
import com.allatori.interfaces.unmapped.class_97;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_247 extends class_539 implements class_97, class_601, class_194 {
    @Override // p000.class_97
    public class_212 method_32(class_208 class_208Var) {
        switch (this.IIiIIIIiii) {
            case class_555.field_2256 /* 133 */:
            case class_555.field_2248 /* 140 */:
            case class_555.field_2268 /* 143 */:
                return class_212.field_798;
            case class_555.field_2133 /* 134 */:
            case class_555.field_2234 /* 137 */:
            case class_555.field_2129 /* 144 */:
                return class_212.field_812;
            case class_555.field_2093 /* 135 */:
            case class_555.field_2286 /* 138 */:
            case class_555.field_2113 /* 141 */:
                return class_212.field_810;
            case class_555.field_2120 /* 136 */:
            case class_555.field_2201 /* 139 */:
            case class_555.field_2079 /* 142 */:
                return class_212.field_802;
            case class_555.field_2098 /* 145 */:
                return class_212.field_795;
            case class_555.field_2172 /* 146 */:
                return class_212.field_806;
            case class_555.field_2275 /* 147 */:
                return class_212.field_801;
            default:
                throw new class_151(new StringBuilder().insert(0, "Unknown type ").append((int) this.IIiIIIIiii).toString());
        }
    }

    public class_247(short s) {
        super(s, (short) 1);
    }

    public class_247() {
    }
}
