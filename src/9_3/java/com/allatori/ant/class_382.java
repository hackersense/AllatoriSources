package com.allatori.ant;

import com.allatori.exception.runtime.RuntimeException_236;
import com.allatori.interfaces.unmapped.class_216;
import com.allatori.interfaces.unmapped.class_421;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_382 implements class_216 {
    public class_337 field_1207;
    public int field_1208;
    public Map field_1209;
    public ArrayList field_1210 = null;
    public Map field_1211;
    public final class_429 field_1212;

    public class_382 method_1523() {
        int i = 0;
        int size = this.field_1210.size() - 1;
        int i2 = size;
        int i3 = size;
        while (i2 >= 0) {
            class_382 class_382Var = (class_382) this.field_1210.get(i3);
            class_539 method_1038 = class_382Var.method_1046().method_1038();
            if (method_1038 instanceof class_398) {
                i++;
            }
            if (!(method_1038 instanceof class_490) || i - 1 != -1) {
                int i4 = i3 - 1;
                i2 = i4;
                i3 = i4;
            } else {
                return class_382Var;
            }
        }
        return null;
    }

    public String method_1521() {
        String class_382Var = toString();
        int size = this.field_1210.size() - 1;
        int i = size;
        int i2 = size;
        while (i >= 0) {
            int i3 = i2 - 1;
            class_382Var = this.field_1210.get(i2) + "\n" + class_382Var;
            i = i3;
            i2 = i3;
        }
        return class_382Var;
    }

    @Override // p000.class_216
    public void method_1044(int i) {
        this.field_1208 = i;
    }

    @Override // p000.class_216
    public int method_1043() {
        return this.field_1208;
    }

    @Override // p000.class_216
    public boolean method_1041(class_277 class_277Var, ArrayList arrayList, class_394 class_394Var, class_65 class_65Var) {
        this.field_1210 = (ArrayList) arrayList.clone();
        if (method_1523() == null && class_429.method_1615(this.field_1212).method_1863(method_1046()) != class_429.method_1615(this.field_1212).method_1862()) {
            throw new class_572(new StringBuilder().insert(0, "Huh?! Am I '").append(this).append("' part of a subroutine or not?").toString());
        }
        if (method_1523() == null || class_429.method_1615(this.field_1212).method_1863(method_1046()) != class_429.method_1615(this.field_1212).method_1862()) {
            class_277 class_277Var2 = (class_277) this.field_1211.get(method_1523());
            if (class_277Var2 == null) {
                this.field_1211.put(method_1523(), class_277Var);
            } else {
                if (!class_277Var2.equals(class_277Var) && method_1520(class_277Var)) {
                    class_277Var = class_277Var2;
                }
                return false;
            }
            class_277 method_1216 = class_277Var.method_1216();
            try {
                class_394Var.method_351(method_1216);
                method_1046().method_0(class_394Var);
                class_65Var.method_351(method_1216);
                method_1046().method_0(class_65Var);
                this.field_1209.put(method_1523(), method_1216);
                return true;
            } catch (RuntimeException_236 e) {
                e.method_221("", new StringBuilder().insert(0, "\nInstructionHandle: ").append(method_1046()).append("\n").toString());
                e.method_221("", new StringBuilder().insert(0, "\nExecution Frame:\n").append(method_1216).toString());
                method_1522(e);
                throw e;
            }
        }
        throw new class_572(new StringBuilder().insert(0, "Huh?! Am I '").append(this).append("' part of a subroutine or not?").toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public class_337[] method_1524() {
        class_337[] class_337VarArr = new class_337[0];
        class_337[] class_337VarArr2 = new class_337[1];
        class_337[] class_337VarArr3 = new class_337[2];
        class_539 method_1038 = method_1046().method_1038();
        if (method_1038 instanceof class_398) {
            class_421 method_1863 = class_429.method_1615(this.field_1212).method_1863(method_1046());
            if (method_1863 == null) {
                throw new class_572("Asking for successors of a RET in dead code?!");
            }
            class_337[] method_212 = method_1863.method_212();
            class_337[] class_337VarArr4 = new class_337[method_212.length];
            int i = 0;
            int i2 = 0;
            while (i < method_212.length) {
                int i3 = i2 + 1;
                class_337VarArr4[i2] = method_212[i2].method_415();
                i = i3;
                i2 = i3;
            }
            return class_337VarArr4;
        }
        if (!(method_1038 instanceof class_288) && !(method_1038 instanceof class_115)) {
            if (method_1038 instanceof class_490) {
                class_337VarArr2[0] = ((class_490) method_1038).getF940();
                return class_337VarArr2;
            }
            if (method_1038 instanceof class_502) {
                class_337VarArr2[0] = ((class_502) method_1038).getF940();
                return class_337VarArr2;
            }
            if (!(method_1038 instanceof class_272)) {
                class_337VarArr2[0] = method_1046().method_415();
                return class_337VarArr2;
            }
            if (!(method_1038 instanceof class_450)) {
                class_337VarArr3[0] = method_1046().method_415();
                class_337VarArr3[1] = ((class_272) method_1038).getF940();
                return class_337VarArr3;
            }
            class_337[] method_446 = ((class_450) method_1038).method_446();
            class_337[] class_337VarArr5 = new class_337[method_446.length + 1];
            class_337VarArr5[0] = ((class_450) method_1038).getF940();
            System.arraycopy(method_446, 0, class_337VarArr5, 1, method_446.length);
            return class_337VarArr5;
        }
        return class_337VarArr;
    }

    @Override // p000.class_216
    public class_277 method_1045(ArrayList arrayList) {
        this.field_1210 = arrayList;
        class_277 class_277Var = (class_277) this.field_1209.get(method_1523());
        if (class_277Var != null) {
            return class_277Var.method_1216();
        }
        throw new class_572(new StringBuilder().insert(0, "outFrame not set! This:\n").append(this).append("\nExecutionChain: ").append(method_1521()).append("\nOutFrames: '").append(this.field_1209).append("'.").toString());
    }

    public boolean method_1520(class_277 class_277Var) {
        class_277 class_277Var2 = (class_277) this.field_1211.get(method_1523());
        class_11 method_29 = class_277Var2.method_1214().method_29();
        class_426 method_1608 = class_277Var2.method_1215().method_1608();
        try {
            class_277Var2.method_1214().method_28(class_277Var.method_1214());
            class_277Var2.method_1215().method_1605(class_277Var.method_1215());
            if (method_29.equals(class_277Var2.method_1214()) && method_1608.equals(class_277Var2.method_1215())) {
                return false;
            }
            return true;
        } catch (RuntimeException_236 e) {
            method_1522(e);
            throw e;
        }
    }

    @Override // p000.class_216
    public class_277 method_1048() {
        class_277 class_277Var = (class_277) this.field_1211.get(method_1523());
        if (class_277Var == null) {
            throw new class_572(new StringBuilder().insert(0, "inFrame not set! This:\n").append(this).append("\nInFrames: '").append(this.field_1211).append("'.").toString());
        }
        return class_277Var.method_1216();
    }

    public class_382(class_429 class_429Var, class_337 class_337Var) {
        this.field_1212 = class_429Var;
        if (class_337Var != null) {
            this.field_1207 = class_337Var;
            this.field_1211 = new HashMap();
            this.field_1209 = new HashMap();
            return;
        }
        throw new class_572("Cannot instantiate InstructionContextImpl from NULL.");
    }

    public void method_1522(RuntimeException_236 class_236Var) {
        class_236Var.method_221("", new StringBuilder().insert(0, "Execution flow:\n").append(method_1521()).toString());
    }

    @Override // p000.class_216
    public class_491[] method_1047() {
        return class_429.method_1611(this.field_1212).method_1066(method_1046());
    }

    @Override // p000.class_216
    public class_337 method_1046() {
        return this.field_1207;
    }

    @Override // p000.class_216
    public class_216[] method_1042() {
        return this.field_1212.method_1613(method_1524());
    }
}
