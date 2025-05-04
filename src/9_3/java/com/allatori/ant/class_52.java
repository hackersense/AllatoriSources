package com.allatori.ant;

import com.allatori.exception.runtime.RuntimeException_236;
import com.allatori.interfaces.unmapped.class_421;
import com.allatori.interfaces.unmapped.class_494;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_52 implements class_421 {
    public static final int field_188 = -1;
    public class_337 field_190;
    public final class_506 field_193;
    public int field_189 = -1;
    public Set field_192 = new HashSet();
    public Set field_191 = new HashSet();

    public class_52(class_506 class_506Var) {
        this.field_193 = class_506Var;
    }

    @Override // p000.class_421
    public class_337[] method_212() {
        if (this == this.field_193.field_1970) {
            throw new class_572("getLeavingRET() called on top level pseudo-subroutine.");
        }
        return (class_337[]) this.field_191.toArray(new class_337[this.field_191.size()]);
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:25:0x0087 */
    @Override // p000.class_421
    public int[] method_202() {
        HashSet hashSet = new HashSet();
        if (this.field_190 == null && this != this.field_193.field_1970) {
            throw new class_572("This subroutine object must be built up completely before calculating accessed locals.");
        }
        for (class_337 class_337Var : this.field_192) {
            if ((class_337Var.method_1038() instanceof class_508) || (class_337Var.method_1038() instanceof class_398)) {
                int method_47 = ((class_494) class_337Var.method_1038()).method_47();
                hashSet.add(new Integer(method_47));
                try {
                    if ((class_337Var.method_1038() instanceof class_508) && ((class_508) class_337Var.method_1038()).method_32(null).method_47() == 2) {
                        hashSet.add(new Integer(method_47 + 1));
                    }
                } catch (RuntimeException e) {
                    throw new class_572("Oops. BCEL did not like NULL as a ConstantPoolGen object.");
                }
            }
        }
        int[] iArr = new int[hashSet.size()];
        Iterator it = hashSet.iterator();
        int i = -1;
        while (it.hasNext()) {
            i++;
            iArr[i] = ((Integer) it.next()).intValue();
        }
        return iArr;
    }

    @Override // p000.class_421
    public class_337[] method_209() {
        return (class_337[]) this.field_192.toArray(new class_337[this.field_192.size()]);
    }

    @Override // p000.class_421
    public class_421[] method_215() {
        HashSet hashSet = new HashSet();
        Iterator it = this.field_192.iterator();
        while (it.hasNext()) {
            class_539 method_1038 = ((class_337) it.next()).method_1038();
            if (method_1038 instanceof class_490) {
                hashSet.add(this.field_193.method_1861(((class_490) method_1038).getF940()));
            }
        }
        return (class_421[]) hashSet.toArray(new class_421[hashSet.size()]);
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:6:0x0031 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x000c */
    @Override // p000.class_421
    public int[] method_206() {
        HashSet hashSet = new HashSet();
        int[] method_202 = method_202();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i >= method_202.length) {
                break;
            }
            i = i2 + 1;
            hashSet.add(new Integer(method_202[i2]));
        }
        method_211(hashSet, method_215());
        int[] iArr = new int[hashSet.size()];
        Iterator it = hashSet.iterator();
        int i3 = -1;
        while (it.hasNext()) {
            i3++;
            iArr[i3] = ((Integer) it.next()).intValue();
        }
        return iArr;
    }

    public void method_203(class_337 class_337Var) {
        if (this.field_190 == null) {
            this.field_192.add(class_337Var);
            return;
        }
        throw new class_572("All instructions must have been added before invoking setLeavingRET().");
    }

    public void method_211(Set set, class_421[] class_421VarArr) {
        int i = 0;
        int i2 = 0;
        while (i < class_421VarArr.length) {
            int[] method_202 = class_421VarArr[i2].method_202();
            int i3 = 0;
            int i4 = 0;
            while (i3 < method_202.length) {
                int i5 = i4 + 1;
                set.add(new Integer(method_202[i4]));
                i3 = i5;
                i4 = i5;
            }
            if (class_421VarArr[i2].method_215().length != 0) {
                method_211(set, class_421VarArr[i2].method_215());
            }
            int i6 = i2 + 1;
            i = i6;
            i2 = i6;
        }
    }

    public void method_207(class_337 class_337Var) {
        if (class_337Var != null && (class_337Var.method_1038() instanceof class_490)) {
            if (this.field_189 == -1) {
                throw new class_572("Set the localVariable first!");
            }
            if (this.field_189 == ((class_196) ((class_490) class_337Var.method_1038()).getF940().method_1038()).method_47()) {
                this.field_191.add(class_337Var);
                return;
            }
            throw new class_572("Setting a wrong JsrInstruction.");
        }
        throw new class_572("Expecting JsrInstruction InstructionHandle.");
    }

    public void method_205() {
        if (this.field_189 == -1) {
            throw new class_572("setLeavingRET() called for top-level 'subroutine' or forgot to set local variable first.");
        }
        class_337 class_337Var = null;
        for (class_337 class_337Var2 : this.field_192) {
            if (class_337Var2.method_1038() instanceof class_398) {
                if (class_337Var != null) {
                    throw new RuntimeException_236(new StringBuilder().insert(0, "Subroutine with more then one RET detected: '").append(class_337Var).append("' and '").append(class_337Var2).append("'.").toString());
                }
                class_337Var = class_337Var2;
            }
        }
        if (class_337Var != null) {
            if (((class_398) class_337Var.method_1038()).method_47() != this.field_189) {
                throw new RuntimeException_236(new StringBuilder().insert(0, "Subroutine uses '").append(class_337Var).append("' which does not match the correct local variable '").append(this.field_189).append("'.").toString());
            }
            this.field_190 = class_337Var;
            return;
        }
        throw new RuntimeException_236("Subroutine without a RET detected.");
    }

    public void method_214(int i) {
        if (this.field_189 != -1) {
            throw new class_572("localVariable set twice.");
        }
        this.field_189 = i;
    }

    @Override // p000.class_421
    public class_337 method_204() {
        if (this != this.field_193.field_1970) {
            return this.field_190;
        }
        throw new class_572("getLeavingRET() called on top level pseudo-subroutine.");
    }

    @Override // p000.class_421
    public boolean method_210(class_337 class_337Var) {
        return this.field_192.contains(class_337Var);
    }

    public static class_337 method_201(class_52 class_52Var) {
        return class_52Var.field_190;
    }

    public static int method_208(class_52 class_52Var) {
        return class_52Var.field_189;
    }

    public static Set method_213(class_52 class_52Var) {
        return class_52Var.field_191;
    }
}
