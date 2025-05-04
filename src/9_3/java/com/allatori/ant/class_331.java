package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.exception.runtime.class_151;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_331 extends class_212 {
    public static class_331 method_1384(byte b) {
        switch (b) {
            case 4:
                return THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE;
            case 5:
                return iIIiIiiIII;
            case 6:
                return IIiIIIIiii;
            case 7:
                return iIIiiIiiIi;
            case 8:
                return iiIiIIiIii;
            case 9:
                return IIiIIiIIii;
            case 10:
                return IiiIIIiIiI;
            case 11:
                return IIiiiIIIiI;
            case 12:
                return IiiIIiiIii;
            default:
                throw new class_151("Invalid type: " + (int) b);
        }
    }

    @Override // p000.class_212
    public boolean equals(Object obj) {
        return (obj instanceof class_331) && ((class_331) obj).iIiIiIIIII == this.iIiIiIIIII;
    }

    public class_331(byte b) {
        super(b, ASMInterface.field_1325[b]);
        if (b >= 4 && b <= 12) {
        } else {
            throw new class_151("Invalid type: " + b);
        }
    }

    @Override // p000.class_212
    public int hashCode() {
        return this.iIiIiIIIII;
    }
}
