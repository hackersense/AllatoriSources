package com.allatori.ant;

import com.allatori.exception.runtime.AbstractRuntimeException_56;
import com.allatori.interfaces.unmapped.class_216;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Random;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_484 extends class_488 {
    public static final boolean field_1940 = true;
    public int field_1941;
    public class_225 field_1942;

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:27:0x016b */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:44:0x01c5 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:56:0x0217 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:63:0x0258 */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b2, code lost:
    
        if (r7 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f3, code lost:
    
        r6 = (p000.class_490) r8.method_1046().method_1038();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0109, code lost:
    
        if (r13 == r16.method_1614(r6.method_415())) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0159, code lost:
    
        if (r13.method_1041(r12.method_1045(r4), r5, r19, r20) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x015b, code lost:
    
        r11.method_635(r13, (java.util.ArrayList) r5.clone());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014c, code lost:
    
        throw new p000.class_572(new java.lang.StringBuilder().insert(0, "RET '").append(r12.method_1046()).append("' info inconsistent: jump back to '").append(r13).append("' or '").append(r16.method_1614(r6.method_415())).append("'?").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
    
        throw new p000.class_572(new java.lang.StringBuilder().insert(0, "RET without a JSR before in ExecutionChain?! EC: '").append(r4).append("'.").toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void method_1832(class_429 class_429Var, class_216 class_216Var, class_277 class_277Var, class_394 class_394Var, class_65 class_65Var) {
        class_216 class_216Var2;
        new Random();
        class_127 class_127Var = new class_127(null);
        class_216Var.method_1041(class_277Var, new ArrayList(), class_394Var, class_65Var);
        class_127Var.method_635(class_216Var, new ArrayList());
        while (!class_127Var.method_634()) {
            class_216 method_631 = class_127Var.method_631(0);
            ArrayList method_633 = class_127Var.method_633(0);
            class_127Var.method_632(0);
            ArrayList arrayList = (ArrayList) method_633.clone();
            ArrayList arrayList2 = (ArrayList) method_633.clone();
            arrayList2.add(method_631);
            if (method_631.method_1046().method_1038() instanceof class_398) {
                class_216 method_1614 = class_429Var.method_1614(((class_211) method_631.method_1045(arrayList).method_1215().method_1609(((class_398) method_631.method_1046().method_1038()).method_47())).method_419());
                class_216 class_216Var3 = null;
                int i = 0;
                int size = arrayList.size() - 1;
                int i2 = size;
                int i3 = size;
                while (true) {
                    if (i2 >= 0) {
                        if (i < 0) {
                            throw new class_572("More RET than JSR in execution chain?!");
                        }
                        if (((class_216) arrayList.get(i3)).method_1046().method_1038() instanceof class_490) {
                            if (i == 0) {
                                class_216 class_216Var4 = (class_216) arrayList.get(i3);
                                class_216Var2 = class_216Var4;
                                class_216Var3 = class_216Var4;
                                break;
                            }
                            i--;
                        }
                        if (((class_216) arrayList.get(i3)).method_1046().method_1038() instanceof class_398) {
                            i++;
                        }
                        int i4 = i3 - 1;
                        i2 = i4;
                        i3 = i4;
                    } else {
                        class_216Var2 = null;
                        break;
                    }
                }
            } else {
                class_216[] method_1042 = method_631.method_1042();
                int i5 = 0;
                while (true) {
                    int i6 = i5;
                    if (i5 >= method_1042.length) {
                        break;
                    }
                    class_216 class_216Var5 = method_1042[i6];
                    if (class_216Var5.method_1041(method_631.method_1045(arrayList), arrayList2, class_394Var, class_65Var)) {
                        class_127Var.method_635(class_216Var5, (ArrayList) arrayList2.clone());
                    }
                    i5 = i6 + 1;
                }
            }
            class_491[] method_1047 = method_631.method_1047();
            int i7 = 0;
            while (true) {
                int i8 = i7;
                if (i7 < method_1047.length) {
                    class_216 method_16142 = class_429Var.method_1614(method_1047[i8].method_1835());
                    if (method_16142.method_1041(new class_277(method_631.method_1045(arrayList).method_1215(), new class_11(method_631.method_1045(arrayList).method_1214().method_25(), method_1047[i8].method_1836() == null ? class_212.field_805 : method_1047[i8].method_1836())), new ArrayList(), class_394Var, class_65Var)) {
                        class_127Var.method_635(method_16142, new ArrayList());
                    }
                    i7 = i8 + 1;
                }
            }
        }
        class_337 method_1046 = class_216Var.method_1046();
        do {
            if ((method_1046.method_1038() instanceof class_288) && !class_429Var.method_1612(method_1046)) {
                class_216 method_16143 = class_429Var.method_1614(method_1046);
                class_277 method_1045 = method_16143.method_1045(new ArrayList());
                class_426 method_1215 = method_1045.method_1215();
                int i9 = 0;
                while (true) {
                    int i10 = i9;
                    if (i9 >= method_1215.method_1607()) {
                        break;
                    }
                    if (method_1215.method_1609(i10) instanceof class_356) {
                        method_671(new StringBuilder().insert(0, "Warning: ReturnInstruction '").append(method_16143).append("' may leave method with an uninitialized object in the local variables array '").append(method_1215).append("'.").toString());
                    }
                    i9 = i10 + 1;
                }
                class_11 method_1214 = method_1045.method_1214();
                int i11 = 0;
                while (true) {
                    int i12 = i11;
                    if (i11 >= method_1214.method_30()) {
                        break;
                    }
                    if (method_1214.method_27(i12) instanceof class_356) {
                        method_671(new StringBuilder().insert(0, "Warning: ReturnInstruction '").append(method_16143).append("' may leave method with an uninitialized object on the operand stack '").append(method_1214).append("'.").toString());
                    }
                    i11 = i12 + 1;
                }
            }
            method_1046 = method_1046.method_415();
        } while (method_1046 != null);
    }

    public class_484(class_225 class_225Var, int i) {
        this.field_1942 = class_225Var;
        this.field_1941 = i;
    }

    public int method_47() {
        return this.field_1941;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:18:0x009f */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2 A[Catch: class_56 -> 0x0142, RuntimeException -> 0x0173, TryCatch #3 {class_56 -> 0x0142, RuntimeException -> 0x0173, blocks: (B:10:0x003a, B:12:0x0052, B:14:0x0058, B:16:0x0070, B:18:0x007c, B:19:0x0097, B:20:0x009f, B:22:0x00a2, B:24:0x00a8, B:26:0x00ae, B:28:0x00b4, B:30:0x00be, B:33:0x00cb, B:35:0x00da, B:38:0x00e9, B:44:0x00ba, B:46:0x012e, B:49:0x0114), top: B:9:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012e A[EDGE_INSN: B:45:0x012e->B:46:0x012e BREAK  A[LOOP:0: B:20:0x009f->B:40:0x00ef], SYNTHETIC] */
    @Override // p000.class_488
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public class_275 method_644() {
        class_591 class_591Var;
        class_212[] method_1964;
        int i;
        int i2;
        if (!this.field_1942.method_1063(this.field_1941).equals(class_275.field_946)) {
            return class_275.field_951;
        }
        try {
            class_440 method_1810 = class_474.method_1810(this.field_1942.method_1062());
            class_208 class_208Var = new class_208(method_1810.method_502());
            class_394 class_394Var = new class_394();
            class_394Var.method_298(class_208Var);
            class_65 class_65Var = new class_65();
            class_65Var.method_298(class_208Var);
            class_557[] method_904 = method_1810.method_904();
            try {
                class_591 class_591Var2 = new class_591(method_904[this.field_1941], this.field_1942.method_1062(), class_208Var);
                class_394Var.method_1552(class_591Var2);
                if (!class_591Var2.method_1103() && !class_591Var2.method_1126()) {
                    class_429 class_429Var = new class_429(class_591Var2);
                    class_277 class_277Var = new class_277(class_591Var2.method_928(), class_591Var2.method_183());
                    if (!class_591Var2.method_1125()) {
                        if (class_591Var2.method_198().equals("<init>")) {
                            class_277.field_956 = new class_356(new class_392(method_1810.method_546()));
                            class_277Var.method_1215().method_1610(0, class_277.field_956);
                            class_591Var = class_591Var2;
                            method_1964 = class_591Var.method_1964();
                            int i3 = 0;
                            i = 0;
                            while (true) {
                                i2 = i;
                                if (i < method_1964.length) {
                                    break;
                                }
                                if (method_1964[i2] == class_212.field_801 || method_1964[i2] == class_212.field_795 || method_1964[i2] == class_212.field_806 || method_1964[i2] == class_212.field_813) {
                                    method_1964[i2] = class_212.field_802;
                                }
                                class_277Var.method_1215().method_1610((class_591Var2.method_1125() ? 0 : 1) + i3 + i2, method_1964[i2]);
                                if (method_1964[i2].method_47() == 2) {
                                    i3++;
                                    class_277Var.method_1215().method_1610((class_591Var2.method_1125() ? 0 : 1) + i3 + i2, class_212.field_803);
                                }
                                i = i2 + 1;
                            }
                            method_1832(class_429Var, class_429Var.method_1614(class_591Var2.method_438().method_415()), class_277Var, class_394Var, class_65Var);
                        } else {
                            class_277.field_956 = null;
                            class_277Var.method_1215().method_1610(0, new class_392(method_1810.method_546()));
                        }
                    }
                    class_591Var = class_591Var2;
                    method_1964 = class_591Var.method_1964();
                    int i32 = 0;
                    i = 0;
                    while (true) {
                        i2 = i;
                        if (i < method_1964.length) {
                        }
                        i = i2 + 1;
                    }
                    method_1832(class_429Var, class_429Var.method_1614(class_591Var2.method_438().method_415()), class_277Var, class_394Var, class_65Var);
                }
                return class_275.field_946;
            } catch (AbstractRuntimeException_56 e) {
                e.method_221(new StringBuilder().insert(0, "Constraint violated in method '").append(method_904[this.field_1941]).append("':\n").toString(), "");
                return new class_275(2, e.getMessage());
            } catch (RuntimeException e2) {
                StringWriter stringWriter = new StringWriter();
                e2.printStackTrace(new PrintWriter(stringWriter));
                throw new class_572(new StringBuilder().insert(0, "Some RuntimeException occured while verify()ing class '").append(method_1810.method_546()).append("', method '").append(method_904[this.field_1941]).append("'. Original RuntimeException's stack trace:\n---\n").append(stringWriter).append("---\n").toString());
            }
        } catch (ClassNotFoundException e3) {
            throw new class_572(new StringBuilder().insert(0, "Missing class: ").append(e3.toString()).toString());
        }
    }
}
