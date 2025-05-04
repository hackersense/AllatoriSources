package com.allatori.ant;

import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.unmapped.class_159;
import com.allatori.interfaces.unmapped.class_411;
import com.allatori.interfaces.unmapped.class_449;
import com.allatori.interfaces.unmapped.class_555;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_176 extends class_565 {
    public static class_449 field_727 = new class_588();
    public Object field_726;
    public List field_728;

    public void method_849(class_212 class_212Var) {
        if (this.method_917() != null) {
            if (this.method_917().equals(class_212Var)) {
                return;
            } else {
                throw new class_151(new StringBuilder().insert(0, "Types are not compatible: ").append(this.field_899).append(" vs. ").append(class_212Var).toString());
            }
        }
        throw new class_151("You haven't defined the type of the field yet");
    }

    public static class_449 method_859() {
        return field_727;
    }

    public class_261 method_854() {
        String method_464 = method_464();
        int method_1004 = this.method_917().method_1004(this.field_2328);
        int method_10042 = this.method_917().method_1004(method_464);
        if (this.field_726 != null) {
            method_849(this.method_669());
            method_902(new class_257(this.method_917().method_1004("ConstantValue"), 2, method_183(), this.method_917().method_502()));
        }
        method_846(this.field_2329);
        return new class_261(this.method_47(), method_1004, method_10042, method_906(), this.method_917().method_502());
    }

    @Override // p000.class_565
    public String method_464() {
        return this.field_2326.method_198();
    }

    public void method_856(long j) {
        method_849(class_212.field_798);
        if (j != 0) {
            this.field_726 = new Long(j);
        }
    }

    public void method_461(int i) {
        method_849(class_212.field_802);
        if (i == 0) {
            return;
        }
        this.field_726 = new Integer(i);
    }

    public class_176(int i, class_212 class_212Var, String str, class_208 class_208Var) {
        this.field_726 = null;
        method_407(i);
        method_668(class_212Var);
        method_671(str);
        method_919(class_208Var);
    }

    public void method_853(int i) {
        class_499 method_502 = this.method_917().method_502();
        this.field_726 = ((class_159) method_502.method_982(i)).method_188(method_502);
    }

    public void method_860(char c) {
        method_849(class_212.field_806);
        if (c != 0) {
            this.field_726 = new Integer(c);
        }
    }

    public void method_50() {
        this.field_726 = null;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:4:0x000b */
    public void method_846(class_208 class_208Var) {
        class_160[] method_948 = class_204.method_948(class_208Var, this.field_728);
        if (method_948 != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i < method_948.length) {
                    i = i2 + 1;
                    method_902(method_948[i2]);
                } else {
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:4:0x000b */
    public void method_411() {
        if (this.field_728 != null) {
            Iterator it = this.field_728.iterator();
            while (it.hasNext()) {
                ((class_411) it.next()).method_1570(this);
            }
        }
    }

    public void method_851(double d) {
        method_849(class_212.field_810);
        if (d == 0.0d) {
            return;
        }
        this.field_726 = new Double(d);
    }

    public void method_617(byte b) {
        method_849(class_212.field_795);
        if (b == 0) {
            return;
        }
        this.field_726 = new Integer(b);
    }

    public void method_855(boolean z) {
        method_849(class_212.field_813);
        if (z) {
            this.field_726 = new Integer(1);
        }
    }

    public class_176(class_261 class_261Var, class_208 class_208Var) {
        this(class_261Var.method_433(), class_212.method_1034(class_261Var.method_546()), class_261Var.method_464(), class_208Var);
        class_160[] method_906 = class_261Var.method_906();
        int i = 0;
        int i2 = 0;
        while (i < method_906.length) {
            if (!(method_906[i2] instanceof class_257)) {
                if (method_906[i2] instanceof class_515) {
                    class_78[] method_1560 = ((class_515) method_906[i2]).method_1560();
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < method_1560.length) {
                        int i5 = i4 + 1;
                        method_923(new class_574(method_1560[i4], class_208Var, false));
                        i3 = i5;
                        i4 = i5;
                    }
                } else {
                    method_902(method_906[i2]);
                }
            } else {
                method_853(((class_257) method_906[i2]).method_183());
            }
            int i6 = i2 + 1;
            i = i6;
            i2 = i6;
        }
    }

    public String method_546() {
        if (this.field_726 == null) {
            return null;
        }
        return this.field_726.toString();
    }

    public int hashCode() {
        return field_727.method_162(this);
    }

    public int method_183() {
        switch (this.iIiIiIIIII.method_619()) {
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
                return this.IIiIIIIiii.method_994(((Integer) this.field_726).intValue());
            case 6:
                return this.IIiIIIIiii.method_1001(((Float) this.field_726).floatValue());
            case 7:
                return this.IIiIIIIiii.method_995(((Double) this.field_726).doubleValue());
            case 11:
                return this.IIiIIIIiii.method_990(((Long) this.field_726).longValue());
            case 12:
            case class_555.field_2278 /* 13 */:
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "Oops: Unhandled : ").append((int) this.iIiIiIIIII.method_619()).toString());
            case class_555.field_2199 /* 14 */:
                return this.IIiIIIIiii.method_1010((String) this.field_726);
        }
    }

    public void method_858(short s) {
        method_849(class_212.field_801);
        if (s != 0) {
            this.field_726 = new Integer(s);
        }
    }

    public void method_857(float f) {
        method_849(class_212.field_812);
        if (f != 0.0d) {
            this.field_726 = new Float(f);
        }
    }

    public boolean equals(Object obj) {
        return field_727.method_161(this, obj);
    }

    public class_176 method_852(class_208 class_208Var) {
        class_176 class_176Var = (class_176) clone();
        class_176Var.method_919(class_208Var);
        return class_176Var;
    }

    public void method_847(class_411 class_411Var) {
        if (this.field_728 == null) {
            return;
        }
        this.field_728.remove(class_411Var);
    }

    public void method_850(String str) {
        method_849(new class_392("java.lang.String"));
        if (str != null) {
            this.field_726 = str;
        }
    }

    public static void method_861(class_449 class_449Var) {
        field_727 = class_449Var;
    }

    public void method_848(class_411 class_411Var) {
        if (this.field_728 == null) {
            this.field_728 = new ArrayList();
        }
        this.field_728.add(class_411Var);
    }
}
