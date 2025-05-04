package com.allatori.ant;

import com.allatori.exception.runtime.RuntimeException_276;
import com.allatori.exception.runtime.RuntimeException_57;
import com.allatori.exception.runtime.RuntimeException_6;
import com.allatori.exception.runtime.class_188;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_184 extends class_488 {
    public class_225 field_735;
    public int field_736;
    public class_576 field_737;
    public class_70 field_738;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean method_870(int[] iArr, int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < iArr.length) {
            if (iArr[i3] == i) {
                return true;
            }
            int i4 = i3 + 1;
            i2 = i4;
            i3 = i4;
        }
        return false;
    }

    public void method_50() {
        if (this.field_737.method_429().length < 65536) {
            class_337 method_415 = this.field_738.method_415();
            class_337 class_337Var = method_415;
            class_337 class_337Var2 = method_415;
            while (class_337Var != null) {
                class_539 method_1038 = class_337Var2.method_1038();
                if (!(method_1038 instanceof class_198)) {
                    if (!(method_1038 instanceof class_571)) {
                        if (!(method_1038 instanceof class_487)) {
                            class_337 method_4152 = class_337Var2.method_415();
                            class_337Var = method_4152;
                            class_337Var2 = method_4152;
                        } else {
                            throw new RuntimeException_6("BREAKPOINT must not be in the code, it is an illegal instruction for _internal_ JVM use!");
                        }
                    } else {
                        throw new RuntimeException_6("IMPDEP2 must not be in the code, it is an illegal instruction for _internal_ JVM use!");
                    }
                } else {
                    throw new RuntimeException_6("IMPDEP1 must not be in the code, it is an illegal instruction for _internal_ JVM use!");
                }
            }
            class_539 method_10382 = this.field_738.method_419().method_1038();
            if (!(method_10382 instanceof class_288) && !(method_10382 instanceof class_398) && !(method_10382 instanceof class_502) && !(method_10382 instanceof class_115)) {
                throw new RuntimeException_6("Execution must not fall off the bottom of the code array. This constraint is enforced statically as some existing verifiers do - so it may be a false alarm if the last instruction is not reachable.");
            }
            return;
        }
        throw new RuntimeException_6("Code array in code attribute '" + this.field_737 + "' too big: must be smaller than 65536 bytes.");
    }

    public class_184(class_225 class_225Var, int i) {
        this.field_735 = class_225Var;
        this.field_736 = i;
    }

    public static class_225 method_868(class_184 class_184Var) {
        return class_184Var.field_735;
    }

    public static int method_869(class_184 class_184Var) {
        return class_184Var.field_736;
    }

    @Override // p000.class_488
    public class_275 method_644() throws ClassNotFoundException {
            if (!this.field_735.method_1059().equals(class_275.field_946)) {
                return class_275.field_951;
            }
            class_557[] method_904 = class_474.method_1810(this.field_735.method_1062()).method_904();
            if (this.field_736 >= method_904.length) {
                throw new class_188("METHOD DOES NOT EXIST!");
            }
            class_557 class_557Var = method_904[this.field_736];
            this.field_737 = class_557Var.method_1962();
            if (class_557Var.method_1103() || class_557Var.method_1126()) {
                return class_275.field_946;
            }
            try {
                this.field_738 = new class_70(class_557Var.method_1962().method_429());
                this.field_738.method_421(true);
                class_275 class_275Var = class_275.field_946;
                try {
                    method_97();
                    try {
                        method_50();
                        method_401();
                        return class_275Var;
                    } catch (RuntimeException e) {
                        return e instanceof ClassCastException ? new class_275(2, "Class Cast Exception: " + e.getMessage()) : new class_275(2, e.getMessage());
                    }
                } catch (RuntimeException_57 e3) {
                    return new class_275(2, e3.getMessage());
                }
            } catch (Exception e4) {

                if(e4 instanceof ClassNotFoundException){
                    throw new ClassNotFoundException("Missing class: " + e4.toString());
                }

                return new class_275(2, "Bad bytecode in the code array of the Code attribute of method '" + class_557Var + "'.");
            }

    }

    public int method_47() {
        return this.field_736;
    }

    public void method_97() {
        class_40 class_40Var;
        int[] method_434 = this.field_738.method_434();
        int length = this.field_737.method_429().length;
        class_332 method_1966 = this.field_737.method_1966();
        if (method_1966 != null) {
            class_387[] method_1385 = method_1966.method_1385();
            class_431 class_431Var = new class_431();
            int i = 0;
            int i2 = 0;
            while (i < method_1385.length) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < method_434.length) {
                    int method_433 = method_1385[i2].method_433();
                    if (method_434[i4] == method_433) {
                        if (!class_431Var.method_1618(method_433)) {
                            class_431Var.method_1617(method_433);
                        } else {
                            method_671("LineNumberTable attribute '" + this.field_737.method_1966() + "' refers to the same code offset ('" + method_433 + "') more than once which is violating the semantics [but is sometimes produced by IBM's 'jikes' compiler].");
                        }
                        int i5 = i2 + 1;
                        i = i5;
                        i2 = i5;
                    } else {
                        int i6 = i4 + 1;
                        i3 = i6;
                        i4 = i6;
                    }
                }
                throw new RuntimeException_57("Code attribute '" + this.field_737 +
                        "' has a LineNumberTable attribute '" + this.field_737.method_1966() + "' referring to a code offset ('" + method_1385[i2].method_433() + "') that does not exist.")
                        ;
            }
        }
        class_160[] method_906 = this.field_737.method_906();
        int i7 = 0;
        int i8 = 0;
        while (i7 < method_906.length) {
            if ((method_906[i8] instanceof class_40) && (class_40Var = (class_40) method_906[i8]) != null) {
                class_368[] method_181 = class_40Var.method_181();
                int i9 = 0;
                int i10 = 0;
                while (i9 < method_181.length) {
                    int method_928 = method_181[i10].method_928();
                    int method_4332 = method_181[i10].method_433();
                    if (method_870(method_434, method_928)) {
                        if (!method_870(method_434, method_928 + method_4332) && method_928 + method_4332 != length) {
                            throw new RuntimeException_57("Code attribute '"+ this.field_737+
                            "' has a LocalVariableTable attribute '" + this.field_737.method_1965()+
                            "' referring to a code offset start_pc+length ('" +method_928 + method_4332+
                            "') that does not exist.");
                        }
                        int i11 = i10 + 1;
                        i9 = i11;
                        i10 = i11;
                    } else {
                        throw new RuntimeException_57("Code attribute '" +this.field_737+
                        "' has a LocalVariableTable attribute '" +this.field_737.method_1965()+
                        "' referring to a code offset ('" +method_928+ "') that does not exist.");
                    }
                }
            }
            int i12 = i8 + 1;
            i7 = i12;
            i8 = i12;
        }
        class_372[] method_2023 = this.field_737.method_2023();
        int i13 = 0;
        int i14 = 0;
        while (i13 < method_2023.length) {
            int method_9282 = method_2023[i14].method_928();
            int method_47 = method_2023[i14].method_47();
            int method_4333 = method_2023[i14].method_433();
            if (method_9282 >= method_47) {
                throw new RuntimeException_57("Code attribute '"+ this.field_737 +"' has an exception_table entry '"+
                method_2023[i14] +"' that has its start_pc ('" +method_9282+ "') not smaller than its end_pc ('"+ method_47+
                "').");
            }
            if (!method_870(method_434, method_9282)) {
                throw new RuntimeException_57("Code attribute '" +this.field_737 +"' has an exception_table entry '"+
                method_2023[i14]+ "' that has a non-existant bytecode offset as its start_pc ('"+ method_9282+ "').");
            }
            if (!method_870(method_434, method_47) && method_47 != length) {
                throw new RuntimeException_57("Code attribute '" +this.field_737 + "' has an exception_table entry '"+
                method_2023[i14]+ "' that has a non-existant bytecode offset as its end_pc ('"+ method_9282+
                "') [that is also not equal to code_length ('" +length+ "')].");
            }
            if (method_870(method_434, method_4333)) {
                int i15 = i14 + 1;
                i13 = i15;
                i14 = i15;
            } else {
                throw new RuntimeException_57("Code attribute '" +this.field_737+ "' has an exception_table entry '"+
                method_2023[i14] +"' that has a non-existant bytecode offset as its handler_pc ('" +method_4333 +"').");
            }
        }
    }

    public void method_401() {
//        try {
            class_498 class_498Var = new class_498(this, new class_208(class_474.method_1810(this.field_735.method_1062()).method_502()));
            for (class_337 method_415 = this.field_738.method_415(); method_415 != null; method_415 = method_415.method_415()) {
                class_539 method_1038 = method_415.method_1038();
                if (method_1038 instanceof class_490) {
                    class_337 method_419 = ((class_490) method_1038).getF940();
                    if (method_419 == this.field_738.method_415()) {
                        throw new RuntimeException_276("Due to JustIce's clear definition of subroutines, no JSR or JSR_W may have a top-level instruction (such as the very first instruction, which is targeted by instruction '"+method_415+"' as its target.");
                    }
                    if (!(method_419.method_1038() instanceof class_196)) {
                        throw new RuntimeException_276("Due to JustIce's clear definition of subroutines, no JSR or JSR_W may target anything else than an ASTORE instruction. Instruction '"+method_415+"' targets '"+method_419+"'.");
                    }
                }
                method_415.method_0(class_498Var);
            }
//        } catch (ClassNotFoundException e) {
//            throw new class_572("Missing class: "+e.toString());
//        }
    }
}
