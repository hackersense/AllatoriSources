package com.allatori.ant;

import com.allatori.exception.runtime.RuntimeException_236;
import com.allatori.interfaces.unmapped.class_421;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_506 {
    public final class_421 field_1970;
    public Map field_1971 = new HashMap();
    public static final Integer field_1969 = new Integer(0);
    public static final Integer field_1973 = new Integer(1);
    public static final Integer field_1972 = new Integer(2);

    public class_421 method_1863(class_337 class_337Var) {
        for (class_421 class_421Var : this.field_1971.values()) {
            if (class_421Var.method_210(class_337Var)) {
                return class_421Var;
            }
        }
        System.err.println(new StringBuilder().insert(0, "DEBUG: Please verify '").append(class_337Var).append("' lies in dead code.").toString());
        return null;
    }

    public class_421 method_1861(class_337 class_337Var) {
        class_421 class_421Var = (class_421) this.field_1971.get(class_337Var);
        if (class_421Var != null) {
            if (class_421Var != this.field_1970) {
                return class_421Var;
            }
            throw new class_572("TOPLEVEL special subroutine requested; use getTopLevel().");
        }
        throw new class_572("Subroutine requested for an InstructionHandle that is not a leader of a subroutine.");
    }

    public static class_337[] method_1859(class_337 class_337Var) {
        class_337[] class_337VarArr = new class_337[0];
        class_337[] class_337VarArr2 = new class_337[1];
        class_337[] class_337VarArr3 = new class_337[2];
        class_539 method_1038 = class_337Var.method_1038();
        if (!(method_1038 instanceof class_398) && !(method_1038 instanceof class_288) && !(method_1038 instanceof class_115)) {
            if (method_1038 instanceof class_490) {
                class_337VarArr2[0] = class_337Var.method_415();
                return class_337VarArr2;
            }
            if (method_1038 instanceof class_502) {
                class_337VarArr2[0] = ((class_502) method_1038).getF940();
                return class_337VarArr2;
            }
            if (method_1038 instanceof class_272) {
                if (method_1038 instanceof class_450) {
                    class_337[] method_446 = ((class_450) method_1038).method_446();
                    class_337[] class_337VarArr4 = new class_337[method_446.length + 1];
                    class_337VarArr4[0] = ((class_450) method_1038).getF940();
                    System.arraycopy(method_446, 0, class_337VarArr4, 1, method_446.length);
                    return class_337VarArr4;
                }
                class_337VarArr3[0] = class_337Var.method_415();
                class_337VarArr3[1] = ((class_272) method_1038).getF940();
                return class_337VarArr3;
            }
            class_337VarArr2[0] = class_337Var.method_415();
            return class_337VarArr2;
        }
        return class_337VarArr;
    }

    public void method_1860(class_421 class_421Var, Set set) {
        class_421[] method_215 = class_421Var.method_215();
        int i = 0;
        int i2 = 0;
        while (i < method_215.length) {
            int method_47 = ((class_398) method_215[i2].method_204().method_1038()).method_47();
            if (!set.add(new Integer(method_47))) {
                class_52 class_52Var = (class_52) method_215[i2];
                throw new RuntimeException_236(new StringBuilder().insert(0, "Subroutine with local variable '").append(class_52.method_208(class_52Var)).append("', JSRs '").append(class_52.method_213(class_52Var)).append("', RET '").append(class_52.method_201(class_52Var)).append("' is called by a subroutine which uses the same local variable index as itself; maybe even a recursive call? JustIce's clean definition of a subroutine forbids both.").toString());
            }
            method_1860(method_215[i2], set);
            int i3 = i2 + 1;
            set.remove(new Integer(method_47));
            i = i3;
            i2 = i3;
        }
    }

    public class_421 method_1862() {
        return this.field_1970;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:33:0x00ff */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:9:0x0045 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:66:0x01aa */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x020e, code lost:
    
        r1 = r4 + 1;
        r0 = r1;
        r4 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public class_506(class_591 class_591Var) {
        class_337[] method_446 = class_591Var.method_438().method_446();
        class_135[] method_2069 = class_591Var.method_2069();
        this.field_1970 = new class_52(this);
        HashSet<class_337> hashSet = new HashSet();
        int i = 0;
        int i2 = 0;
        while (i < method_446.length) {
            class_539 method_1038 = method_446[i2].method_1038();
            if (method_1038 instanceof class_490) {
                hashSet.add(((class_490) method_1038).getF940());
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            class_52 class_52Var = new class_52(this);
            class_337 class_337Var = (class_337) it.next();
            class_52Var.method_214(((class_196) class_337Var.method_1038()).method_47());
            this.field_1971.put(class_337Var, class_52Var);
        }
        this.field_1971.put(method_446[0], this.field_1970);
        hashSet.add(method_446[0]);
        int i4 = 0;
        int i5 = 0;
        while (i4 < method_446.length) {
            class_539 method_10382 = method_446[i5].method_1038();
            if (method_10382 instanceof class_490) {
                ((class_52) method_1861(((class_490) method_10382).getF940())).method_207(method_446[i5]);
            }
            int i6 = i5 + 1;
            i4 = i6;
            i5 = i6;
        }
        HashSet hashSet2 = new HashSet();
        HashMap hashMap = new HashMap();
        for (class_337 class_337Var2 : hashSet) {
            int i7 = 0;
            int i8 = 0;
            while (i7 < method_446.length) {
                int i9 = i8 + 1;
                hashMap.put(method_446[i8], field_1969);
                i7 = i9;
                i8 = i9;
            }
            hashMap.put(class_337Var2, field_1973);
            ArrayList arrayList = new ArrayList();
            arrayList.add(class_337Var2);
            if (class_337Var2 == method_446[0]) {
                int i10 = 0;
                int i11 = 0;
                while (i10 < method_2069.length) {
                    hashMap.put(method_2069[i11].method_45(), field_1973);
                    int i12 = i11 + 1;
                    arrayList.add(method_2069[i11].method_45());
                    i10 = i12;
                    i11 = i12;
                }
            }
            while (arrayList.size() != 0) {
                class_337 class_337Var3 = (class_337) arrayList.remove(0);
                class_337[] method_1859 = method_1859(class_337Var3);
                int i13 = 0;
                int i14 = 0;
                while (i13 < method_1859.length) {
                    if (((Integer) hashMap.get(method_1859[i14])) == field_1969) {
                        hashMap.put(method_1859[i14], field_1973);
                        arrayList.add(method_1859[i14]);
                    }
                    int i15 = i14 + 1;
                    i13 = i15;
                    i14 = i15;
                }
                hashMap.put(class_337Var3, field_1972);
            }
            int i16 = 0;
            int i17 = 0;
            while (i16 < method_446.length) {
                if (hashMap.get(method_446[i17]) == field_1972) {
                    ((class_52) (class_337Var2 == method_446[0] ? method_1862() : method_1861(class_337Var2))).method_203(method_446[i17]);
                    if (!hashSet2.contains(method_446[i17])) {
                        hashSet2.add(method_446[i17]);
                    } else {
                        throw new RuntimeException_236(new StringBuilder().insert(0, "Instruction '").append(method_446[i17]).append("' is part of more than one subroutine (or of the top level and a subroutine).").toString());
                    }
                }
                int i18 = i17 + 1;
                i16 = i18;
                i17 = i18;
            }
            if (class_337Var2 != method_446[0]) {
                ((class_52) method_1861(class_337Var2)).method_205();
            }
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < method_2069.length) {
            class_337 method_415 = method_2069[i20].method_415();
            while (true) {
                class_337 class_337Var4 = method_415;
                if (method_415 != method_2069[i20].method_419().method_415()) {
                    for (class_421 class_421Var : this.field_1971.values()) {
                        if (class_421Var != this.field_1971.get(method_446[0]) && class_421Var.method_210(class_337Var4)) {
                            throw new RuntimeException_236(new StringBuilder().insert(0, "Subroutine instruction '").append(class_337Var4).append("' is protected by an exception handler, '").append(method_2069[i20]).append("'. This is forbidden by the JustIce verifier due to its clear definition of subroutines.").toString());
                        }
                    }
                    method_415 = class_337Var4.method_415();
                }
            }
        }
        method_1860(method_1862(), new HashSet());
    }
}
