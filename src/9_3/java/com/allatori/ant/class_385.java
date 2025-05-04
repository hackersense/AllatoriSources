package com.allatori.ant;

import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.unmapped.class_194;
import com.allatori.interfaces.unmapped.class_555;
import com.allatori.interfaces.unmapped.class_601;
import com.allatori.interfaces.unmapped.class_97;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_385 extends class_539 implements class_97, class_601, class_194 {
    @Override // p000.class_97
    public class_212 method_32(class_208 class_208Var) {
        switch (this.IIiIIIIiii) {
            case class_555.field_2194 /* 96 */:
            case 100:
            case class_555.field_2146 /* 104 */:
            case class_555.field_2250 /* 108 */:
            case class_555.field_2317 /* 112 */:
            case class_555.field_2230 /* 116 */:
            case class_555.field_2152 /* 120 */:
            case class_555.field_2107 /* 122 */:
            case class_555.field_2195 /* 124 */:
            case class_555.field_2236 /* 126 */:
            case 128:
            case 130:
                return class_212.field_802;
            case class_555.field_2181 /* 97 */:
            case 101:
            case class_555.field_2153 /* 105 */:
            case class_555.field_2082 /* 109 */:
            case class_555.field_2204 /* 113 */:
            case class_555.field_2296 /* 117 */:
            case class_555.field_2263 /* 121 */:
            case class_555.field_2084 /* 123 */:
            case class_555.field_2126 /* 125 */:
            case 127:
            case 129:
            case 131:
                return class_212.field_798;
            case class_555.field_2203 /* 98 */:
            case class_555.field_2081 /* 102 */:
            case class_555.field_2233 /* 106 */:
            case class_555.field_2151 /* 110 */:
            case class_555.field_2213 /* 114 */:
            case class_555.field_2294 /* 118 */:
                return class_212.field_812;
            case 99:
            case class_555.field_2198 /* 103 */:
            case class_555.field_2212 /* 107 */:
            case class_555.field_2177 /* 111 */:
            case 115:
            case class_555.field_2139 /* 119 */:
                return class_212.field_810;
            default:
                throw new class_151(new StringBuilder().insert(0, "Unknown type ").append((int) this.IIiIIIIiii).toString());
        }
    }

    public class_385(short s) {
        super(s, (short) 1);
    }

    public class_385() {
    }
}
