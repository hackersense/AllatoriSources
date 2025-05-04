package com.allatori.ant;

import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.unmapped.class_194;
import com.allatori.interfaces.unmapped.class_555;
import com.allatori.interfaces.unmapped.class_570;
import com.allatori.interfaces.unmapped.class_97;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_288 extends class_539 implements class_570, class_97, class_194 {
    public class_212 method_669() {
        switch (this.IIiIIIIiii) {
            case class_555.field_2132 /* 172 */:
                return class_212.field_802;
            case class_555.field_2196 /* 173 */:
                return class_212.field_798;
            case class_555.field_2135 /* 174 */:
                return class_212.field_812;
            case class_555.field_2221 /* 175 */:
                return class_212.field_810;
            case class_555.field_2161 /* 176 */:
                return class_212.field_808;
            case class_555.field_2150 /* 177 */:
                return class_212.field_794;
            default:
                throw new class_151(new StringBuilder().insert(0, "Unknown type ").append((int) this.IIiIIIIiii).toString());
        }
    }

    @Override // p000.class_97
    public class_212 method_32(class_208 class_208Var) {
        return method_669();
    }

    public class_288() {
    }

    @Override // p000.class_570
    public Class[] method_43() {
        return new Class[]{IllegalMonitorStateException.class};
    }

    public class_288(short s) {
        super(s, (short) 1);
    }
}
