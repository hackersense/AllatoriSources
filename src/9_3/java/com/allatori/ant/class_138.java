package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.commons.AllatoriLogger;
import com.allatori.interfaces.unmapped.class_291;
import com.allatori.interfaces.unmapped.class_555;
import com.allatori.interfaces.unmapped.class_93;

import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Vector;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_138 implements class_291 {
    public static Vector field_623;
    public class_606 field_625;
    public static char field_628 = 'U';
    public static Hashtable field_619 = new Hashtable();
    public static class_212 field_618 = class_212.field_799;
    public Collection field_629 = new TreeSet();
    public boolean field_632 = true;
    public Hashtable field_624 = new Hashtable();
    public Hashtable field_630 = new Hashtable();
    public Hashtable field_622 = new Hashtable();
    public Hashtable field_621 = new Hashtable();
    public Hashtable field_633 = new Hashtable();
    public Hashtable field_627 = new Hashtable();
    public Hashtable field_620 = new Hashtable();
    public String field_631 = ".R";
    public String field_626 = "org.springframework.boot.";

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0009 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:50:0x00f0 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:76:0x01a2 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:80:0x01cd */
    public void method_35() {
        boolean z;
        Vector vector;
        boolean z2;
        Iterator method_2108 = this.field_625.method_2108();
        loop0: while (true) {
            while (method_2108.hasNext()) {
                class_202 class_202Var = (class_202) method_2108.next();
                if (!class_544.method_1927().method_101(this.field_625, class_202Var)) {
                    int method_1686 = class_544.method_1937().method_1686(this.field_625, class_202Var);
                    class_544.method_1937();
                    if (method_1686 != 1) {
                        class_544.method_1937();
                        if (method_1686 != 2) {
                            class_544.method_1937();
                            if (method_1686 == 3) {
                                class_596.method_2087(class_202Var);
                                class_596.method_2089(class_202Var);
                            }
                        } else {
                            class_596.method_2087(class_202Var);
                        }
                    } else {
                        class_596.method_2092(class_202Var, this.field_629);
                    }
                    if (method_664(class_202Var)) {
                        Vector vector2 = (Vector) this.field_624.get(method_661(class_202Var));
                        if (vector2 == null) {
                            vector = new Vector();
                            this.field_624.put(method_661(class_202Var), vector);
                            if (this.field_630.get(method_661(class_202Var)) == null) {
                                Vector vector3 = new Vector();
                                if (!this.field_625.method_2111(class_202Var) || class_202Var.method_1109() || class_202Var.method_1108()) {
                                    z2 = false;
                                } else {
                                    vector3.add(class_202Var);
                                    z2 = true;
                                }
                                this.field_630.put(method_661(class_202Var), vector3);
                                z = z2;
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                            vector = vector2;
                        }
                        if (!this.field_625.method_2111(class_202Var) || (!class_202Var.method_1109() && !class_202Var.method_1108())) {
                            vector.add(class_202Var);
                        }
                    } else {
                        z = false;
                    }
                    if (!z && method_663(class_202Var)) {
                        Vector vector4 = (Vector) this.field_630.get(method_661(class_202Var));
                        if (vector4 == null) {
                            vector4 = new Vector();
                            this.field_630.put(method_661(class_202Var), vector4);
                        }
                        vector4.add(class_202Var);
                    }
                }
            }
            break loop0;
        }
        Iterator it = this.field_630.values().iterator();
        while (it.hasNext()) {
            method_667((Vector) it.next());
        }
        Vector vector5 = new Vector();
        Vector vector6 = vector5;
        for (Object vector7 : this.field_630.values()) {
            Vector l = (Vector) vector7;
            if (l.size() > vector6.size()) {
                vector6 = l;
            }
        }
        if (!vector6.isEmpty()) {
            String method_661 = method_661((class_202) vector6.get(0));
            HashSet<String> hashSet = new HashSet();
            hashSet.addAll(this.field_630.keySet());
            for (String str : hashSet) {
                if (((Vector) this.field_630.get(str)).size() == 0) {
                    if (method_666((Boolean) this.field_633.get(str))) {
                        this.field_633.put(method_661, true);
                    }
                    if (method_666((Boolean) this.field_627.get(str))) {
                        this.field_627.put(method_661, true);
                    }
                }
            }
            Iterator it2 = this.field_630.values().iterator();
            while (it2.hasNext()) {
                method_659((Vector) it2.next());
            }
            hashSet.clear();
            hashSet.addAll(this.field_622.keySet());
            hashSet.addAll(this.field_621.keySet());
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                String str2 = (String) it3.next();
                method_662((Vector) this.field_622.get(str2), (Vector) this.field_621.get(str2));
            }
            hashSet.clear();
            hashSet.addAll(this.field_630.keySet());
            for (String str3 : hashSet) {
                if (((Vector) this.field_630.get(str3)).size() == 0) {
                    this.field_630.put(str3, vector6);
                    this.field_622.put(str3, this.field_622.get(method_661));
                    this.field_621.put(str3, this.field_621.get(method_661));
                }
            }
            return;
        }
        this.field_632 = false;
    }

    public String method_41(String str, String str2) {
        char[] cArr = new char[str.length()];
        char c = (char) ((int[]) this.field_620.get(str2))[0];
        char c2 = (char) ((int[]) this.field_620.get(str2))[1];
        int length = cArr.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            int i3 = i2 - 1;
            cArr[i2] = (char) (str.charAt(i2) ^ c);
            if (i3 < 0) {
                break;
            }
            int i4 = i3 - 1;
            cArr[i3] = (char) (str.charAt(i3) ^ c2);
            i = i4;
            i2 = i4;
        }
        return new String(cArr);
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:14:0x0037 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:18:0x006f */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:8:0x001d */
    public void method_662(Vector vector, Vector vector2) {
        if (vector == null) {
            vector = new Vector();
        }
        if (vector2 == null) {
            vector2 = new Vector();
        }
        if (class_544.method_1937().method_1699()) {
            Iterator it = vector.iterator();
            while (it.hasNext()) {
                class_596.method_2085((class_202) it.next(), "AllatoriDecryptString", field_628);
            }
            return;
        }
        Iterator it2 = vector.iterator();
        while (it2.hasNext()) {
            class_202 class_202Var = (class_202) it2.next();
            this.field_620.put(class_202Var.method_198(), new int[]{class_231.method_1071(class_555.field_2126) + 1, class_231.method_1071(class_555.field_2126) + 1});
            method_40(class_202Var);
        }
        Iterator it3 = vector2.iterator();
        while (it3.hasNext()) {
            class_202 class_202Var2 = (class_202) it3.next();
            field_619.put(class_202Var2.method_198(), new int[]{class_231.method_1071(class_555.field_2126) + 1, class_231.method_1071(class_555.field_2126) + 1, class_231.method_1073() <= 0.5d ? 0 : 1});
            method_37(class_202Var2);
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:21:0x00db */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0224  */
    @Override // p000.class_291
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void method_34(class_202 class_202Var) {
        boolean z;
        int i = 0;
        int i2;
        class_337 class_337Var;
        int i3;
        int i4;
        Iterator it = this.field_624.values().iterator();
        while (true) {
            if (it.hasNext()) {
                if (((Vector) it.next()).contains(class_202Var)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            return;
        }
        class_563 class_563Var = new class_563(class_202Var);
        String[] strArr = new String[2];
        if (((Vector) this.field_622.get(method_661(class_202Var))).size() > 0) {
            int i5 = 0;
            int i6 = 0;
            while (i5 < 2) {
                int i7 = i6 + 1;
                strArr[i6] = ((class_202) ((Vector) this.field_622.get(method_661(class_202Var))).get(class_231.method_1071(((Vector) this.field_622.get(method_661(class_202Var))).size()))).method_198();
                i5 = i7;
                i6 = i7;
            }
        }
        int i8 = 0;
        String[] strArr2 = new String[2];
        if (((Vector) this.field_621.get(method_661(class_202Var))).size() > 0) {
            int i9 = 0;
            int i10 = 0;
            while (i9 < 2) {
                int i11 = i10 + 1;
                strArr2[i10] = ((class_202) ((Vector) this.field_621.get(method_661(class_202Var))).get(class_231.method_1071(((Vector) this.field_621.get(method_661(class_202Var))).size()))).method_198();
                i9 = i11;
                i10 = i11;
            }
        }
        int i12 = 0;
        class_557[] method_904 = class_202Var.method_904();
        int length = method_904.length;
        int i13 = 0;
        while (true) {
            int i14 = i13;
            if (i13 >= length) {
                return;
            }
            class_557 class_557Var = method_904[i14];
            if (class_557Var.method_1962() != null) {
                class_591 method_1067 = class_230.method_1067(class_557Var, class_202Var.method_198(), class_202Var.method_917(), class_202Var.method_917().method_502());
                class_70 method_438 = method_1067.method_438();
                class_337 method_415 = method_438.method_415();
                class_337 class_337Var2 = method_415;
                class_337 class_337Var3 = method_415;
                while (class_337Var2 != null) {
                    if (class_337Var3.method_1038() instanceof class_489) {
                        class_489 class_489Var = (class_489) class_337Var3.method_1038();
                        class_286 method_982 = class_202Var.method_917().method_982(class_489Var.method_47());
                        if (method_982 instanceof class_118) {
                            String method_198 = ((class_371) class_202Var.method_917().method_982(((class_118) method_982).method_47())).method_198();
                            if (this.field_625.method_2102(method_198) == null && !this.field_629.contains(method_198) && !class_596.method_2091(method_198)) {
                                int method_1673 = class_544.method_1937().method_1673(this.field_625, class_202Var, method_1067);
                                String method_1982 = class_202Var.method_198();
                                if (!method_1982.startsWith("com.allatori")) {
                                    if (method_1982.startsWith("org.apache.bcel")) {
                                        class_544.method_1937();
                                        method_1673 = 0;
                                    }
                                } else {
                                    if (method_1982.startsWith("com.allatori.obfuscate.opt")) {
                                        class_544.method_1937();
                                        method_1673 = 0;
                                    }
                                    if (method_1982.startsWith("com.allatori.obfuscate.ren")) {
                                        class_544.method_1937();
                                        method_1673 = 0;
                                    }
                                    if (method_1982.startsWith("com.allatori.io.re")) {
                                        class_544.method_1937();
                                        i3 = 0;
                                        i4 = 0;
                                        class_544.method_1937();
                                        if (i3 == 1) {
                                            class_544.method_1937();
                                            if (i4 >= 1000) {
                                                String method_1088 = class_240.method_1088(method_198, i4, this.field_625.method_2103());
                                                if (method_1088.startsWith("allatori-custom-12321-32123:") && !field_623.contains(class_202Var)) {
                                                    field_623.add(class_202Var);
                                                }
                                                class_489Var.method_46(class_202Var.method_917().method_1010(method_1088));
                                                method_438.method_412(class_337Var3, class_240.method_1089(class_563Var, i4));
                                                class_337Var = class_337Var3;
                                                class_337 method_4152 = class_337Var.method_415();
                                                class_337Var2 = method_4152;
                                                class_337Var3 = method_4152;
                                            } else {
                                                String str = strArr[i8];
                                                class_489Var.method_46(class_202Var.method_917().method_1010(method_41(method_198, str)));
                                                i8++;
                                                method_438.method_412(class_337Var3, class_563Var.method_1980(str, "AllatoriDecryptString", class_212.field_799, new class_212[]{field_618}, ASMInterface.field_1301));
                                                if (i8 >= 2) {
                                                    i2 = 0;
                                                    i = i12;
                                                }
                                            }
                                        } else {
                                            String str2 = strArr2[i12];
                                            class_489Var.method_46(class_202Var.method_917().method_1010(new StringBuilder().insert(0, "allatori-12321-32123:").append(str2).append("allatori-12321-32123:").append(method_198).toString()));
                                            int i15 = i12 + 1;
                                            method_438.method_412(class_337Var3, class_563Var.method_1980(str2, "AllatoriDecryptString2", class_212.field_799, new class_212[]{field_618}, ASMInterface.field_1301));
                                            i = i15 >= 2 ? 0 : i15;
                                            if (field_623.contains(class_202Var)) {
                                                i2 = i8;
                                            } else {
                                                field_623.add(class_202Var);
                                                i2 = i8;
                                            }
                                        }
                                        class_337Var = class_337Var3;
                                        i12 = i;
                                        i8 = i2;
                                        class_337 method_41522 = class_337Var.method_415();
                                        class_337Var2 = method_41522;
                                        class_337Var3 = method_41522;
                                    }
                                }
                                i3 = method_1673;
                                i4 = method_1673;
                                class_544.method_1937();
                                if (i3 == 1) {
                                }
                                class_337Var = class_337Var3;
                                i12 = i;
                                i8 = i2;
                                class_337 method_415222 = class_337Var.method_415();
                                class_337Var2 = method_415222;
                                class_337Var3 = method_415222;
                            } else {
                                class_337 method_4153 = class_337Var3.method_415();
                                class_337Var2 = method_4153;
                                class_337Var3 = method_4153;
                            }
                        }
                    }
                    i = i12;
                    i2 = i8;
                    class_337Var = class_337Var3;
                    i12 = i;
                    i8 = i2;
                    class_337 method_4152222 = class_337Var.method_415();
                    class_337Var2 = method_4152222;
                    class_337Var3 = method_4152222;
                }
                method_1067.method_2056();
                try {
                    class_202Var.method_914(class_557Var, method_1067.method_2048());
                } catch (Exception e) {
                    AllatoriLogger.method_678(new StringBuilder().insert(0, "Error processing ").append(class_202Var.method_198()).append(".").append(method_1067.method_198()).append(" ").append(e.getMessage()).toString());
                }
            }
            i13 = i14 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void method_667(Vector vector) {
        Vector vector2;
        class_138 class_138Var;
        Object method_2102;
        Object method_21022;
        boolean z;
        boolean z2;
        if (vector.size() != 0) {
            String method_1710 = class_544.method_1937().method_1710();
            if (method_1710.length() > 0) {
                String[] split = method_1710.split(";");
                int size = vector.size() - 1;
                int i = size;
                int i2 = size;
                while (i >= 0) {
                    class_202 class_202Var = (class_202) vector.get(i2);
                    int length = split.length - 1;
                    int i3 = length;
                    int i4 = length;
                    while (i3 >= 0) {
                        if (split[i4].length() > 0 && !class_202Var.method_198().startsWith(split[i4])) {
                            vector.removeElement(class_202Var);
                        }
                        int i5 = i4 - 1;
                        i3 = i5;
                        i4 = i5;
                    }
                    int i6 = i2 - 1;
                    i = i6;
                    i2 = i6;
                }
            }
            String method_1683 = class_544.method_1937().method_1683();
            if (method_1683.length() > 0) {
                String[] split2 = method_1683.split(";");
                int size2 = vector.size() - 1;
                int i7 = size2;
                int i8 = size2;
                while (i7 >= 0) {
                    class_202 class_202Var2 = (class_202) vector.get(i8);
                    int length2 = split2.length - 1;
                    int i9 = length2;
                    int i10 = length2;
                    while (i9 >= 0) {
                        if (split2[i10].length() > 0 && class_202Var2.method_198().startsWith(split2[i10])) {
                            vector.removeElement(class_202Var2);
                        }
                        int i11 = i10 - 1;
                        i9 = i11;
                        i10 = i11;
                    }
                    int i12 = i8 - 1;
                    i7 = i12;
                    i8 = i12;
                }
            }
            int size3 = vector.size() - 1;
            int i13 = size3;
            int i14 = size3;
            class_202 class_202Var3 = null;
            class_202 class_202Var4 = null;
            class_202 class_202Var5 = null;
            while (true) {
                if (i13 < 0) {
                    vector2 = vector;
                    break;
                }
                if (vector.size() == 1) {
                    vector2 = vector;
                    break;
                }
                class_202 class_202Var6 = (class_202) vector.get(i14);
                boolean z3 = class_202Var6.method_913("<clinit>", "()V") == null;
                if (class_202Var6.method_546().startsWith("java.")) {
                    String[] method_643 = class_202Var6.method_643();
                    int length3 = method_643.length;
                    int i15 = 0;
                    int i16 = 0;
                    while (true) {
                        if (i15 >= length3) {
                            z = z3;
                            z2 = true;
                            break;
                        } else if (!method_643[i16].startsWith("java.")) {
                            z = z3;
                            z2 = false;
                            break;
                        } else {
                            int i17 = i16 + 1;
                            i15 = i17;
                            i16 = i17;
                        }
                    }
                } else {
                    z = z3;
                    z2 = false;
                }
                if (z && class_202Var4 == null) {
                    class_202Var4 = class_202Var6;
                }
                if (z2 && class_202Var3 == null) {
                    class_202Var3 = class_202Var6;
                }
                class_202 class_202Var7 = (z3 && z2 && class_202Var5 == null) ? class_202Var6 : class_202Var5;
                if (!z3 || !z2) {
                    vector.remove(class_202Var6);
                }
                int i18 = i14 - 1;
                i13 = i18;
                i14 = i18;
                class_202Var5 = class_202Var7;
            }
            if (vector2.size() == 1) {
                if (class_202Var5 != null) {
                    vector.clear();
                    vector.add(class_202Var5);
                    class_138Var = this;
                } else if (class_202Var3 != null) {
                    vector.clear();
                    vector.add(class_202Var3);
                    class_138Var = this;
                } else if (class_202Var4 != null) {
                    vector.clear();
                    vector.add(class_202Var4);
                }
                method_2102 = class_138Var.field_625.method_2102("com.allatori.ant.ObfuscatorTask");
                if (method_2102 != null) {
                    vector.removeElement(method_2102);
                }
                method_21022 = this.field_625.method_2102("com.allatori.wtk.WTKObfuscator");
                if (method_21022 == null) {
                    vector.removeElement(method_21022);
                    return;
                }
                return;
            }
            class_138Var = this;
            method_2102 = class_138Var.field_625.method_2102("com.allatori.ant.ObfuscatorTask");
            if (method_2102 != null) {
            }
            method_21022 = this.field_625.method_2102("com.allatori.wtk.WTKObfuscator");
            if (method_21022 == null) {
            }
        }
    }

    public boolean method_666(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:7:0x007a */
    public void method_40(class_202 class_202Var) {
        Vector vector;
        Vector vector2;
        class_563 class_563Var = new class_563(class_202Var);
        class_208 method_917 = class_202Var.method_917();
        class_70 class_70Var = new class_70();
        class_591 class_591Var = new class_591(9, class_212.field_799, new class_212[]{field_618}, new String[]{"s"}, "AllatoriDecryptString", class_202Var.method_198(), class_70Var, method_917);
        boolean z = class_231.method_1073() <= 0.5d;
        if (z) {
            Vector method_2090 = class_596.method_2090(((int[]) this.field_620.get(class_202Var.method_198()))[0]);
            method_2090.addAll(class_596.method_2090(class_231.method_1071(class_555.field_2126) + 1));
            vector = method_2090;
            vector2 = method_2090;
        } else {
            Vector method_20902 = class_596.method_2090(class_231.method_1071(class_555.field_2126) + 1);
            method_20902.addAll(class_596.method_2090(((int[]) this.field_620.get(class_202Var.method_198()))[0]));
            vector = method_20902;
            vector2 = method_20902;
        }
        vector.addAll(class_596.method_2090(((int[]) this.field_620.get(class_202Var.method_198()))[1]));
        Iterator it = vector2.iterator();
        while (it.hasNext()) {
            class_70Var.method_409((class_539) it.next());
        }
        class_70Var.method_409(class_563.method_1984(class_212.field_808, 0));
        class_70Var.method_409(class_563Var.method_1976(class_212.field_799));
        class_70Var.method_409(class_93.field_442);
        class_70Var.method_409(class_563.method_1972(class_212.field_808, 0));
        class_70Var.method_409(class_563Var.method_1980("java.lang.String", "length", class_212.field_802, class_212.field_807, ASMInterface.field_1312));
        class_70Var.method_409(class_93.field_442);
        class_70Var.method_409(class_563Var.method_1969(class_212.field_806, (short) 1));
        class_70Var.method_409(class_93.field_426);
        class_70Var.method_410(new class_302(method_917, 1));
        class_70Var.method_409(class_93.field_469);
        class_70Var.method_409(class_93.field_431);
        class_70Var.method_409(class_563.method_1972(class_212.field_802, 3));
        class_70Var.method_409(class_563.method_1972(class_212.field_808, 1));
        class_70Var.method_409(class_563.method_1972(class_212.field_802, 4));
        class_70Var.method_409(class_93.field_431);
        if (z) {
            class_70Var.method_409(class_563.iIiiIiIIIi);
            class_70Var.method_409(class_563.method_1972(class_212.field_802, 2));
        } else {
            class_70Var.method_409(class_563.iiIiIiIIiI);
            class_70Var.method_409(class_563.method_1972(class_212.field_802, 2));
            class_70Var.method_409(class_563.iiIiIiIIiI);
        }
        class_272 method_1979 = class_563.method_1979(ASMInterface.field_1316, null);
        c19_ext_c337 method_413 = class_70Var.method_413(method_1979);
        class_70Var.method_409(class_563.method_1984(class_212.field_808, 1));
        class_70Var.method_409(class_563.method_1984(class_212.field_808, 0));
        class_70Var.method_409(class_563.method_1984(class_212.field_802, 3));
        class_70Var.method_409(class_93.field_490);
        class_70Var.method_409(class_563Var.method_1980("java.lang.String", "charAt", class_212.field_806, new class_212[]{class_212.field_802}, ASMInterface.field_1312));
        class_70Var.method_409(class_563.method_1984(class_212.field_802, 2));
        class_70Var.method_409(class_93.field_412);
        class_70Var.method_409(class_93.field_428);
        class_70Var.method_409(new class_67(3, -1));
        class_70Var.method_409(class_93.field_401);
        class_70Var.method_409(class_563.method_1984(class_212.field_802, 3));
        class_272 method_19792 = class_563.method_1979(ASMInterface.field_1316, null);
        class_70Var.method_413(method_19792);
        class_70Var.method_409(class_563.method_1984(class_212.field_808, 1));
        class_70Var.method_409(class_563.method_1984(class_212.field_808, 0));
        class_70Var.method_409(class_563.method_1984(class_212.field_802, 3));
        class_70Var.method_409(class_93.field_490);
        class_70Var.method_409(class_563Var.method_1980("java.lang.String", "charAt", class_212.field_806, new class_212[]{class_212.field_802}, ASMInterface.field_1312));
        class_70Var.method_409(class_563.method_1984(class_212.field_802, 4));
        class_70Var.method_409(new class_67(3, -1));
        class_70Var.method_409(class_93.field_412);
        class_70Var.method_409(class_93.field_428);
        class_70Var.method_409(class_93.field_401);
        class_70Var.method_409(class_563.method_1984(class_212.field_802, 3));
        class_70Var.method_413(class_563.method_1979(ASMInterface.field_1492, method_413));
        class_337 method_409 = class_70Var.method_409(class_563Var.method_1970("java.lang.String"));
        class_70Var.method_409(class_93.field_442);
        class_70Var.method_409(class_563.method_1984(class_212.field_808, 1));
        class_70Var.method_409(class_563Var.method_1980("java.lang.String", "<init>", class_212.field_794, new class_212[]{new class_594(class_212.field_806, 1)}, (short) 183));
        class_70Var.method_409(class_563.method_1978(class_212.field_808));
        method_1979.method_51(method_409);
        method_19792.method_51(method_409);
        class_591Var.method_2056();
        class_591Var.method_2071();
        class_202Var.method_899(class_591Var.method_2048());
        class_70Var.method_50();
    }

    public boolean method_665() {
        return this.field_632;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String method_661(class_202 class_202Var) {
        if (class_544.method_1937().method_1671()) {
            String method_198 = class_202Var.method_198();
            return method_198.indexOf(46) > 0 ? method_198.substring(0, method_198.lastIndexOf(46)) : "";
        }
        if (class_544.method_1937().method_1670()) {
            return "GLOBAL";
        }
        if (!this.field_625.method_2111(class_202Var)) {
            return this.field_625.method_2100(class_202Var);
        }
        String method_1982 = class_202Var.method_198();
        return method_1982.indexOf(36) > 0 ? method_1982.substring(0, method_1982.indexOf(36)) : method_1982;
    }

    public static String method_660(String str, String str2, String str3, String str4) {
        String sb = (((int[]) field_619.get(str4))[2] == 0 ? -(-1) : 0) != 0 ? new StringBuilder().insert(0, str2).append(str3).toString() : new StringBuilder().insert(0, str3).append(str2).toString();
        int length = sb.length() - 1;
        int length2 = sb.length() - 1;
        char[] cArr = new char[str.length()];
        char c = (char) ((int[]) field_619.get(str4))[0];
        char c2 = (char) ((int[]) field_619.get(str4))[1];
        int length3 = cArr.length - 1;
        int i = length3;
        int i2 = length3;
        int i3 = length2;
        while (i >= 0) {
            int i4 = i2 - 1;
            cArr[i2] = (char) ((str.charAt(i2) ^ c) ^ sb.charAt(i3));
            if (i4 < 0) {
                break;
            }
            int i5 = i3 - 1;
            cArr[i4] = (char) ((str.charAt(i4) ^ c2) ^ sb.charAt(i3));
            if (i5 < 0) {
                i5 = length;
            }
            int i6 = i4 - 1;
            i = i6;
            i2 = i6;
            i3 = i5;
        }
        return new String(cArr);
    }

    @Override // p000.class_291
    public void method_39() {
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:77:0x01ed */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:66:0x0199 */
    public void method_659(Vector vector) {
        int i;
        class_138 class_138Var;
        int i2 = 0;
        if (vector.size() != 0) {
            String method_661 = method_661((class_202) vector.get(0));
            int size = this.field_624.get(method_661) == null ? 0 : ((Vector) this.field_624.get(method_661)).size() / 8;
            if (size == 0) {
                size = 1;
            }
            int size2 = vector.size() / size;
            int i3 = size2 == 0 ? 1 : size2;
            Vector vector2 = new Vector();
            Vector vector3 = new Vector();
            if (vector.size() >= i3 + 1) {
                while (true) {
                    int i4 = i2;
                    if (i2 >= vector.size()) {
                        break;
                    }
                    if (method_666((Boolean) this.field_633.get(method_661))) {
                        vector2.add(vector.get(i4));
                        i = i4;
                    } else {
                        if (method_666((Boolean) this.field_627.get(method_661))) {
                            vector3.add(vector.get(i4));
                        }
                        i = i4;
                    }
                    int i5 = i + i3;
                    if (i5 >= vector.size()) {
                        class_138Var = this;
                        break;
                    }
                    if (method_666((Boolean) this.field_627.get(method_661))) {
                        vector3.add(vector.get(i5));
                    } else if (method_666((Boolean) this.field_633.get(method_661))) {
                        vector2.add(vector.get(i5));
                    }
                    i2 = i5 + i3;
                }
                class_138Var = this;
            } else if (vector.size() != 1) {
                if (vector.size() != 2) {
                    if (vector.size() != 3) {
                        if (method_666((Boolean) this.field_633.get(method_661))) {
                            vector2.add(vector.get(0));
                        }
                        if (method_666((Boolean) this.field_627.get(method_661))) {
                            vector3.add(vector.get(1));
                        }
                        if (method_666((Boolean) this.field_633.get(method_661))) {
                            vector2.add(vector.get(2));
                        }
                        if (method_666((Boolean) this.field_627.get(method_661))) {
                            vector3.add(vector.get(3));
                            class_138Var = this;
                        }
                        class_138Var = this;
                    } else {
                        if (method_666((Boolean) this.field_633.get(method_661))) {
                            vector2.add(vector.get(0));
                        }
                        if (method_666((Boolean) this.field_627.get(method_661))) {
                            vector3.add(vector.get(0));
                        }
                        if (method_666((Boolean) this.field_633.get(method_661))) {
                            vector2.add(vector.get(1));
                        }
                        if (method_666((Boolean) this.field_627.get(method_661))) {
                            vector3.add(vector.get(2));
                            class_138Var = this;
                        }
                        class_138Var = this;
                    }
                } else {
                    if (method_666((Boolean) this.field_633.get(method_661))) {
                        vector2.add(vector.get(0));
                    }
                    if (method_666((Boolean) this.field_627.get(method_661))) {
                        vector3.add(vector.get(0));
                    }
                    if (method_666((Boolean) this.field_633.get(method_661))) {
                        vector2.add(vector.get(1));
                    }
                    if (method_666((Boolean) this.field_627.get(method_661))) {
                        vector3.add(vector.get(1));
                        class_138Var = this;
                    }
                    class_138Var = this;
                }
            } else {
                if (method_666((Boolean) this.field_633.get(method_661))) {
                    vector2.add(vector.get(0));
                }
                if (method_666((Boolean) this.field_627.get(method_661))) {
                    vector3.add(vector.get(0));
                    class_138Var = this;
                }
                class_138Var = this;
            }
            class_138Var.field_622.put(method_661, vector2);
            this.field_621.put(method_661, vector3);
        }
    }

    public boolean method_664(class_202 class_202Var) {
        boolean z;
        int method_1686 = class_544.method_1937().method_1686(this.field_625, class_202Var);
        class_544.method_1937();
        if (method_1686 == 0) {
            return false;
        }
        String method_661 = method_661(class_202Var);
        class_557[] method_904 = class_202Var.method_904();
        int length = method_904.length;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        while (i < length) {
            class_557 class_557Var = method_904[i2];
            if (class_557Var.method_1962() != null) {
                class_591 method_1067 = class_230.method_1067(class_557Var, class_202Var.method_198(), class_202Var.method_917(), class_202Var.method_917().method_502());
                class_337 method_415 = method_1067.method_438().method_415();
                class_337 class_337Var = method_415;
                class_337 class_337Var2 = method_415;
                while (class_337Var != null) {
                    if (class_337Var2.method_1038() instanceof class_489) {
                        class_286 method_982 = class_202Var.method_917().method_982(((class_489) class_337Var2.method_1038()).method_47());
                        if (method_982 instanceof class_118) {
                            String method_198 = ((class_371) class_202Var.method_917().method_982(((class_118) method_982).method_47())).method_198();
                            if (this.field_625.method_2102(method_198) != null || this.field_629.contains(method_198) || class_596.method_2091(method_198)) {
                                class_337 method_4152 = class_337Var2.method_415();
                                class_337Var = method_4152;
                                class_337Var2 = method_4152;
                            } else {
                                int method_1673 = class_544.method_1937().method_1673(this.field_625, class_202Var, method_1067);
                                String method_1982 = class_202Var.method_198();
                                if (!method_1982.startsWith("com.allatori")) {
                                    if (method_1982.startsWith("org.apache.bcel")) {
                                        class_544.method_1937();
                                        method_1673 = 0;
                                    }
                                } else {
                                    if (method_1982.startsWith("com.allatori.obfuscate.opt")) {
                                        class_544.method_1937();
                                        method_1673 = 0;
                                    }
                                    if (method_1982.startsWith("com.allatori.obfuscate.ren")) {
                                        class_544.method_1937();
                                        method_1673 = 0;
                                    }
                                    if (method_1982.startsWith("com.allatori.io.re")) {
                                        class_544.method_1937();
                                        method_1673 = 0;
                                    }
                                }
                                class_544.method_1937();
                                if (method_1673 == 1) {
                                    this.field_627.put(method_661, true);
                                    if (method_666((Boolean) this.field_633.get(method_661))) {
                                        return true;
                                    }
                                } else {
                                    this.field_633.put(method_661, true);
                                    if (method_666((Boolean) this.field_627.get(method_661))) {
                                        return true;
                                    }
                                }
                                z = true;
                                class_337 method_4153 = class_337Var2.method_415();
                                class_337Var = method_4153;
                                z2 = z;
                                class_337Var2 = method_4153;
                            }
                        }
                    }
                    z = z2;
                    class_337 method_41532 = class_337Var2.method_415();
                    class_337Var = method_41532;
                    z2 = z;
                    class_337Var2 = method_41532;
                }
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        return z2;
    }

    public class_138(class_606 class_606Var) {
        this.field_625 = class_606Var;
        field_628 = class_544.method_1937().method_1707();
        field_623 = new Vector();
        field_619 = new Hashtable();
        class_596.method_2094();
        this.field_629.add("");
        method_35();
    }

    public boolean method_663(class_202 class_202Var) {
        return class_544.method_1937().method_1671() ? (class_202Var.method_424() || class_202Var.method_1109() || class_202Var.method_1106() || class_202Var.method_1108() || class_202Var.method_1112() || class_202Var.method_198().contains("$") || class_202Var.method_198().endsWith(this.field_631)) ? false : true : (!class_202Var.method_1124() || class_202Var.method_1109() || class_202Var.method_1106() || class_202Var.method_1108() || class_202Var.method_1112() || class_202Var.method_198().contains("$") || class_202Var.method_198().endsWith(this.field_631) || class_202Var.method_198().startsWith(this.field_626)) ? false : true;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:24:0x01a2 */
    public void method_37(class_202 class_202Var) {
        class_70 class_70Var;
        class_70 class_70Var2;
        Vector vector;
        Vector vector2;
        class_70 class_70Var3;
        class_563 class_563Var = new class_563(class_202Var);
        class_208 method_917 = class_202Var.method_917();
        class_70 class_70Var4 = new class_70();
        class_591 class_591Var = new class_591(9, class_212.field_799, new class_212[]{field_618}, new String[]{"arg0"}, "AllatoriDecryptString2", class_202Var.method_198(), class_70Var4, method_917);
        class_70Var4.method_409(class_563Var.method_1970("java.lang.StringBuffer"));
        class_70Var4.method_409(class_93.field_442);
        class_70Var4.method_409(class_563Var.method_1970("java.lang.RuntimeException"));
        class_70Var4.method_409(class_93.field_442);
        class_70Var4.method_409(class_563Var.method_1980("java.lang.RuntimeException", "<init>", class_212.field_794, class_212.field_807, (short) 183));
        class_70Var4.method_409(class_563Var.method_1980("java.lang.RuntimeException", "getStackTrace", new class_594(new class_392("java.lang.StackTraceElement"), 1), class_212.field_807, ASMInterface.field_1312));
        class_70Var4.method_410(new class_302(method_917, 1));
        class_70Var4.method_409(class_93.field_495);
        class_70Var4.method_409(class_93.field_431);
        boolean z = ((int[]) field_619.get(class_202Var.method_198()))[2] == 0;
        boolean z2 = class_231.method_1073() > 0.5d;
        if (!z2) {
            class_70Var4.method_409(class_563Var.method_1980("java.lang.StackTraceElement", z ? "getMethodName" : "getClassName", class_212.field_799, class_212.field_807, ASMInterface.field_1312));
            class_70Var = class_70Var4;
        } else {
            class_70Var4.method_409(class_563Var.method_1980("java.lang.StackTraceElement", z ? "getClassName" : "getMethodName", class_212.field_799, class_212.field_807, ASMInterface.field_1312));
            class_70Var = class_70Var4;
        }
        class_70Var.method_409(class_563Var.method_1980("java.lang.StringBuffer", "<init>", class_212.field_794, new class_212[]{class_212.field_799}, (short) 183));
        class_70Var4.method_409(class_93.field_426);
        if (z2) {
            class_70Var4.method_409(class_563Var.method_1980("java.lang.StackTraceElement", z ? "getMethodName" : "getClassName", class_212.field_799, class_212.field_807, ASMInterface.field_1312));
            class_70Var4.method_409(class_563Var.method_1980("java.lang.StringBuffer", "append", class_212.field_797, new class_212[]{class_212.field_799}, ASMInterface.field_1312));
            class_70Var2 = class_70Var4;
        } else {
            class_70Var4.method_409(class_563Var.method_1980("java.lang.StackTraceElement", z ? "getClassName" : "getMethodName", class_212.field_799, class_212.field_807, ASMInterface.field_1312));
            class_70Var4.method_409(class_93.field_486);
            class_70Var4.method_409(class_93.field_426);
            class_70Var4.method_409(class_563Var.method_1980("java.lang.StringBuffer", "insert", class_212.field_797, new class_212[]{class_212.field_802, class_212.field_799}, ASMInterface.field_1312));
            class_70Var2 = class_70Var4;
        }
        class_70Var2.method_409(class_563Var.method_1980("java.lang.StringBuffer", "toString", class_212.field_799, class_212.field_807, ASMInterface.field_1312));
        class_70Var4.method_409(class_93.field_442);
        class_70Var4.method_409(class_563Var.method_1980("java.lang.String", "length", class_212.field_802, class_212.field_807, ASMInterface.field_1312));
        class_70Var4.method_410(new class_302(method_917, 1));
        class_70Var4.method_409(class_93.field_469);
        boolean z3 = class_231.method_1073() <= 0.5d;
        if (z3) {
            Vector method_2090 = class_596.method_2090(((int[]) field_619.get(class_202Var.method_198()))[0]);
            method_2090.addAll(class_596.method_2090(class_231.method_1071(class_555.field_2126) + 1));
            vector = method_2090;
            vector2 = method_2090;
        } else {
            Vector method_20902 = class_596.method_2090(class_231.method_1071(class_555.field_2126) + 1);
            method_20902.addAll(class_596.method_2090(((int[]) field_619.get(class_202Var.method_198()))[0]));
            vector = method_20902;
            vector2 = method_20902;
        }
        vector.addAll(class_596.method_2090(((int[]) field_619.get(class_202Var.method_198()))[1]));
        class_70Var4.method_409(class_93.field_443);
        class_70Var4.method_409(class_93.field_492);
        class_70Var4.method_409(class_93.field_461);
        Iterator it = vector2.iterator();
        while (it.hasNext()) {
            class_70Var4.method_409((class_539) it.next());
        }
        class_70Var4.method_409(class_563.method_1984(class_212.field_808, 0));
        class_70Var4.method_409(class_563Var.method_1976(class_212.field_799));
        class_70Var4.method_409(class_93.field_442);
        class_70Var4.method_409(class_563.method_1972(class_212.field_808, 0));
        class_70Var4.method_409(class_563Var.method_1980("java.lang.String", "length", class_212.field_802, class_212.field_807, ASMInterface.field_1312));
        class_70Var4.method_409(class_93.field_442);
        class_70Var4.method_409(class_563Var.method_1969(class_212.field_806, (short) 1));
        class_70Var4.method_409(class_93.field_426);
        class_70Var4.method_410(new class_302(method_917, 1));
        class_70Var4.method_409(class_93.field_469);
        class_70Var4.method_409(class_93.field_431);
        class_70Var4.method_409(class_563.method_1972(class_212.field_802, 1));
        class_70Var4.method_409(class_563.method_1972(class_212.field_808, 3));
        class_70Var4.method_409(class_563.method_1972(class_212.field_802, 7));
        if (!z3) {
            class_70Var4.method_409(class_93.field_431);
            class_70Var4.method_409(class_93.field_461);
            class_70Var4.method_409(class_563.method_1972(class_212.field_802, 4));
            class_70Var4.method_409(class_93.field_461);
            class_70Var3 = class_70Var4;
        } else {
            class_70Var4.method_409(class_93.field_431);
            class_70Var4.method_409(class_93.field_477);
            class_70Var4.method_409(class_563.method_1972(class_212.field_802, 4));
            class_70Var3 = class_70Var4;
        }
        class_70Var3.method_409(class_93.field_426);
        class_70Var4.method_409(class_93.field_461);
        class_70Var4.method_409(class_93.field_426);
        class_70Var4.method_409(class_93.field_442);
        class_70Var4.method_409(class_563.method_1972(class_212.field_802, 2));
        class_70Var4.method_409(class_563.method_1972(class_212.field_802, 5));
        class_70Var4.method_409(class_93.field_426);
        class_70Var4.method_409(class_563.method_1972(class_212.field_808, 6));
        class_272 method_1979 = class_563.method_1979(ASMInterface.field_1492, null);
        class_70Var4.method_413(method_1979);
        class_337 method_409 = class_70Var4.method_409(class_563.method_1984(class_212.field_808, 3));
        class_70Var4.method_409(class_563.method_1984(class_212.field_802, 4));
        class_70Var4.method_409(class_563.method_1984(class_212.field_808, 0));
        class_70Var4.method_409(class_563.method_1984(class_212.field_802, 1));
        class_70Var4.method_409(class_93.field_431);
        class_70Var4.method_409(class_563Var.method_1980("java.lang.String", "charAt", class_212.field_806, new class_212[]{class_212.field_802}, ASMInterface.field_1312));
        class_70Var4.method_409(class_563.method_1984(class_212.field_808, 6));
        class_70Var4.method_409(new class_67(1, -1));
        class_70Var4.method_409(class_563.method_1984(class_212.field_802, 2));
        class_70Var4.method_409(class_563Var.method_1980("java.lang.String", "charAt", class_212.field_806, new class_212[]{class_212.field_802}, ASMInterface.field_1312));
        class_70Var4.method_409(class_93.field_412);
        class_70Var4.method_409(class_93.field_412);
        class_70Var4.method_409(class_93.field_428);
        class_70Var4.method_409(class_93.field_401);
        class_70Var4.method_409(class_563.method_1984(class_212.field_802, 1));
        class_272 method_19792 = class_563.method_1979(ASMInterface.field_1535, null);
        class_70Var4.method_413(method_19792);
        class_272 method_19793 = class_563.method_1979(ASMInterface.field_1492, null);
        class_70Var4.method_413(method_19793);
        class_337 method_4092 = class_70Var4.method_409(class_563.method_1984(class_212.field_808, 3));
        class_70Var4.method_409(class_563.method_1984(class_212.field_802, 7));
        class_70Var4.method_409(class_563.method_1984(class_212.field_808, 0));
        class_70Var4.method_409(class_563.method_1984(class_212.field_802, 1));
        class_70Var4.method_409(class_93.field_431);
        class_70Var4.method_409(class_563Var.method_1980("java.lang.String", "charAt", class_212.field_806, new class_212[]{class_212.field_802}, ASMInterface.field_1312));
        class_70Var4.method_409(class_563.method_1984(class_212.field_808, 6));
        class_70Var4.method_409(class_563.method_1984(class_212.field_802, 2));
        class_70Var4.method_409(class_563Var.method_1980("java.lang.String", "charAt", class_212.field_806, new class_212[]{class_212.field_802}, ASMInterface.field_1312));
        class_70Var4.method_409(class_93.field_412);
        class_70Var4.method_409(new class_67(2, -1));
        class_70Var4.method_409(class_93.field_412);
        class_70Var4.method_409(class_93.field_428);
        class_70Var4.method_409(new class_67(1, -1));
        class_70Var4.method_409(class_93.field_401);
        class_70Var4.method_409(class_563.method_1984(class_212.field_802, 2));
        class_272 method_19794 = class_563.method_1979(ASMInterface.field_1535, null);
        class_70Var4.method_413(method_19794);
        class_70Var4.method_409(class_563.method_1984(class_212.field_802, 5));
        class_70Var4.method_409(class_563.method_1972(class_212.field_802, 2));
        class_337 method_4093 = class_70Var4.method_409(class_563.method_1984(class_212.field_802, 1));
        c19_ext_c337 method_413 = class_70Var4.method_413(class_563.method_1979(ASMInterface.field_1535, method_409));
        class_337 method_4094 = class_70Var4.method_409(class_563Var.method_1970("java.lang.String"));
        class_70Var4.method_409(class_93.field_442);
        class_70Var4.method_409(class_563.method_1984(class_212.field_808, 3));
        class_70Var4.method_409(class_563Var.method_1980("java.lang.String", "<init>", class_212.field_794, new class_212[]{new class_594(class_212.field_806, 1)}, (short) 183));
        class_70Var4.method_409(class_563.method_1978(class_212.field_808));
        method_1979.method_51(method_413);
        method_19792.method_51(method_4092);
        method_19793.method_51(method_4094);
        method_19794.method_51(method_4093);
        class_591Var.method_2056();
        class_591Var.method_2071();
        class_202Var.method_899(class_591Var.method_2048());
        class_70Var4.method_50();
    }
}
