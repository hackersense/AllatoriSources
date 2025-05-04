package com.allatori.ant;

import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.unmapped.class_175;
import com.allatori.interfaces.unmapped.class_449;
import com.allatori.interfaces.unmapped.class_93;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_202 extends class_250 implements Cloneable {
    public static class_449 field_756 = new class_583();
    public ArrayList field_749;
    public int field_750;
    public int field_751;
    public List field_752;
    public int field_753;
    public List field_754;
    public List field_755;
    public String field_757;
    public class_208 field_758;
    public String field_759;
    public List field_760;
    public List field_761;
    public int field_762;
    public String field_763;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String method_464() {
        return this.field_759;
    }

    public void method_919(class_208 class_208Var) {
        this.field_758 = class_208Var;
    }

    public void method_922(class_261 class_261Var) {
        this.field_754.add(class_261Var);
    }

    public int method_183() {
        return this.field_762;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:21:0x00c6 */
    public class_202(class_440 class_440Var) {
        int i = 0;
        this.field_753 = -1;
        this.field_750 = -1;
        this.field_751 = 45;
        this.field_762 = 3;
        this.field_754 = new ArrayList();
        this.field_755 = new ArrayList();
        this.field_761 = new ArrayList();
        this.field_752 = new ArrayList();
        this.field_760 = new ArrayList();
        this.field_753 = class_440Var.method_920();
        this.field_750 = class_440Var.method_927();
        this.field_763 = class_440Var.method_546();
        this.field_757 = class_440Var.method_1631();
        this.field_759 = class_440Var.method_198();
        this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE = class_440Var.method_433();
        this.field_758 = new class_208(class_440Var.method_502());
        this.field_751 = class_440Var.method_183();
        this.field_762 = class_440Var.method_928();
        class_160[] method_906 = class_440Var.method_906();
        class_574[] method_929 = method_929(method_906);
        class_557[] method_904 = class_440Var.method_904();
        class_261[] method_898 = class_440Var.method_898();
        String[] method_643 = class_440Var.method_643();
        int i2 = 0;
        int i3 = 0;
        while (i2 < method_643.length) {
            int i4 = i3 + 1;
            method_850(method_643[i3]);
            i2 = i4;
            i3 = i4;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < method_906.length) {
            if (!(method_906[i6] instanceof class_515)) {
                method_921(method_906[i6]);
            }
            int i7 = i6 + 1;
            i5 = i7;
            i6 = i7;
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < method_929.length) {
            int i10 = i9 + 1;
            method_923(method_929[i9]);
            i8 = i10;
            i9 = i10;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < method_904.length) {
            int i13 = i12 + 1;
            method_899(method_904[i12]);
            i11 = i13;
            i12 = i13;
        }
        while (true) {
            int i14 = i;
            if (i < method_898.length) {
                i = i14 + 1;
                method_922(method_898[i14]);
            } else {
                return;
            }
        }
    }

    public class_557 method_918(int i) {
        return (class_557) this.field_755.get(i);
    }

    public void method_911(class_557 class_557Var, int i) {
        this.field_755.set(i, class_557Var);
    }

    public void method_915(int i) {
        this.field_751 = i;
    }

    public void method_905(class_261 class_261Var, class_261 class_261Var2) {
        if (class_261Var2 == null) {
            throw new class_151("Replacement method must not be null");
        }
        int indexOf = this.field_754.indexOf(class_261Var);
        if (indexOf < 0) {
            this.field_754.add(class_261Var2);
        } else {
            this.field_754.set(indexOf, class_261Var2);
        }
    }

    public class_574[] method_908() {
        return (class_574[]) this.field_760.toArray(new class_574[this.field_760.size()]);
    }

    public void method_850(String str) {
        this.field_752.add(str);
    }

    public void method_461(int i) {
        class_70 class_70Var = new class_70();
        class_70Var.method_409(class_93.field_403);
        class_70Var.method_409(new class_219(this.field_758.method_992(this.field_757, "<init>", "()V")));
        class_70Var.method_409(class_93.field_422);
        class_591 class_591Var = new class_591(i, class_212.field_794, class_212.field_807, null, "<init>", this.field_763, class_70Var, this.field_758);
        class_591Var.method_853(1);
        method_899(class_591Var.method_2048());
    }

    public int method_920() {
        return this.field_751;
    }

    public class_202(String str, String str2, String str3, int i, String[] strArr) {
        this(str, str2, str3, i, strArr, new class_208());
    }

    public void method_916(class_175 class_175Var) {
        if (this.field_749 == null) {
            this.field_749 = new ArrayList();
        }
        this.field_749.add(class_175Var);
    }

    public void method_914(class_557 class_557Var, class_557 class_557Var2) {
        if (class_557Var2 != null) {
            int indexOf = this.field_755.indexOf(class_557Var);
            if (indexOf < 0) {
                this.field_755.add(class_557Var2);
                return;
            } else {
                this.field_755.set(indexOf, class_557Var2);
                return;
            }
        }
        throw new class_151("Replacement method must not be null");
    }

    public void method_899(class_557 class_557Var) {
        this.field_755.add(class_557Var);
    }

    public static class_449 method_859() {
        return field_756;
    }

    public class_574[] method_929(class_160[] class_160VarArr) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < class_160VarArr.length) {
            class_160 class_160Var = class_160VarArr[i2];
            if (class_160Var instanceof class_512) {
                class_78[] method_1560 = ((class_512) class_160Var).method_1560();
                int i3 = 0;
                int i4 = 0;
                while (i3 < method_1560.length) {
                    int i5 = i4 + 1;
                    arrayList.add(new class_574(method_1560[i4], method_917(), false));
                    i3 = i5;
                    i4 = i5;
                }
            } else if (class_160Var instanceof class_129) {
                class_78[] method_15602 = ((class_129) class_160Var).method_1560();
                int i6 = 0;
                int i7 = 0;
                while (i6 < method_15602.length) {
                    int i8 = i7 + 1;
                    arrayList.add(new class_574(method_15602[i7], method_917(), false));
                    i6 = i8;
                    i7 = i8;
                }
            }
            int i9 = i2 + 1;
            i = i9;
            i2 = i9;
        }
        return (class_574[]) arrayList.toArray(new class_574[arrayList.size()]);
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0008 */
    public void method_901(class_557[] class_557VarArr) {
        int i = 0;
        this.field_755.clear();
        while (true) {
            int i2 = i;
            if (i < class_557VarArr.length) {
                i = i2 + 1;
                method_899(class_557VarArr[i2]);
            } else {
                return;
            }
        }
    }

    public int method_927() {
        return this.field_750;
    }

    public void method_926(class_261 class_261Var) {
        this.field_754.remove(class_261Var);
    }

    public void method_910(int i) {
        this.field_750 = i;
        this.field_757 = this.field_758.method_502().method_1845(i, (byte) 7).replace('/', '.');
    }

    public class_208 method_917() {
        return this.field_758;
    }

    public void method_900(String str) {
        this.field_763 = str.replace('/', '.');
        this.field_753 = this.field_758.method_1007(str);
    }

    public int[] method_434() {
        int size = this.field_752.size();
        int[] iArr = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            int i3 = i2 + 1;
            iArr[i2] = this.field_758.method_1007((String) this.field_752.get(i2));
            i = i3;
            i2 = i3;
        }
        return iArr;
    }

    public boolean equals(Object obj) {
        return field_756.method_161(this, obj);
    }

    public class_440 method_642() {
        class_160[] class_160VarArr;
        class_202 class_202Var;
        int[] method_434 = method_434();
        class_261[] method_898 = method_898();
        class_557[] method_904 = method_904();
        if (this.field_760.size() == 0) {
            class_160VarArr = method_906();
            class_202Var = this;
        } else {
            class_160[] method_948 = class_204.method_948(this.field_758, this.field_760);
            class_160VarArr = new class_160[this.field_761.size() + method_948.length];
            this.field_761.toArray(class_160VarArr);
            System.arraycopy(method_948, 0, class_160VarArr, this.field_761.size(), method_948.length);
            class_202Var = this;
        }
        return new class_440(this.field_753, this.field_750, this.field_759, this.field_751, this.field_762, this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE, class_202Var.field_758.method_986(), method_434, method_898, method_904, class_160VarArr);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println(e);
            return null;
        }
    }

    public int method_928() {
        return this.field_753;
    }

    public String method_198() {
        return this.field_763;
    }

    public void method_921(class_160 class_160Var) {
        this.field_761.add(class_160Var);
    }

    public class_557[] method_904() {
        return (class_557[]) this.field_755.toArray(new class_557[this.field_755.size()]);
    }

    public static void method_861(class_449 class_449Var) {
        field_756 = class_449Var;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:4:0x000b */
    public void method_97() {
        if (this.field_749 != null) {
            Iterator it = this.field_749.iterator();
            while (it.hasNext()) {
                ((class_175) it.next()).method_845(this);
            }
        }
    }

    public void method_903(class_574 class_574Var) {
        this.field_760.remove(class_574Var);
    }

    public void method_853(int i) {
        this.field_753 = i;
        this.field_763 = this.field_758.method_502().method_1845(i, (byte) 7).replace('/', '.');
    }

    public void method_930(class_175 class_175Var) {
        if (this.field_749 != null) {
            this.field_749.remove(class_175Var);
        }
    }

    public class_261[] method_898() {
        return (class_261[]) this.field_754.toArray(new class_261[this.field_754.size()]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void method_907(class_557 class_557Var) {
        this.field_755.remove(class_557Var);
    }

    public class_261 method_924(String str) {
        for (class_261 class_261Var : this.field_754) {
            if (class_261Var.method_464().equals(str)) {
                return class_261Var;
            }
        }
        return null;
    }

    public void method_923(class_574 class_574Var) {
        this.field_760.add(class_574Var);
    }

    public void method_902(class_160 class_160Var) {
        this.field_761.remove(class_160Var);
    }

    public void method_912(String str) {
        this.field_752.remove(str);
    }

    public String method_546() {
        return this.field_757;
    }

    public void method_909(int i) {
        this.field_762 = i;
    }

    public String[] method_643() {
        String[] strArr = new String[this.field_752.size()];
        this.field_752.toArray(strArr);
        return strArr;
    }

    public class_160[] method_906() {
        return (class_160[]) this.field_761.toArray(new class_160[this.field_761.size()]);
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:7:0x0066 */
    public class_202(String str, String str2, String str3, int i, String[] strArr, class_208 class_208Var) {
        this.field_753 = -1;
        this.field_750 = -1;
        this.field_751 = 45;
        this.field_762 = 3;
        this.field_754 = new ArrayList();
        this.field_755 = new ArrayList();
        this.field_761 = new ArrayList();
        this.field_752 = new ArrayList();
        this.field_760 = new ArrayList();
        this.field_763 = str;
        this.field_757 = str2;
        this.field_759 = str3;
        this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE = i;
        this.field_758 = class_208Var;
        if (str3 != null) {
            method_921(new class_599(class_208Var.method_1004("SourceFile"), 2, class_208Var.method_1004(str3), class_208Var.method_502()));
        }
        this.field_753 = class_208Var.method_1007(str);
        this.field_750 = class_208Var.method_1007(str2);
        if (strArr == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i2 >= strArr.length) {
                return;
            }
            i2 = i3 + 1;
            method_850(strArr[i3]);
        }
    }

    public boolean method_925(class_261 class_261Var) {
        return this.field_754.contains(class_261Var);
    }

    public void method_671(String str) {
        this.field_757 = str.replace('/', '.');
        this.field_750 = this.field_758.method_1007(str);
    }

    public class_557 method_913(String str, String str2) {
        for (class_557 class_557Var : this.field_755) {
            if (class_557Var.method_464().equals(str) && class_557Var.method_546().equals(str2)) {
                return class_557Var;
            }
        }
        return null;
    }

    public int hashCode() {
        return field_756.method_162(this);
    }
}
