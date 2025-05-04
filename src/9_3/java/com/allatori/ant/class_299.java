package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;

import java.util.Stack;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_299 implements class_21 {
    public class_21 field_1083;
    public class_440 field_1084;
    public Stack field_1085 = new Stack();

    @Override // p000.class_21
    public void method_57(class_371 class_371Var) {
        this.field_1085.push(class_371Var);
        class_371Var.method_163(this.field_1083);
        this.field_1085.pop();
    }

    @Override // p000.class_21
    public void method_67(class_78 class_78Var) {
        this.field_1085.push(class_78Var);
        class_78Var.method_163(this.field_1083);
        this.field_1085.pop();
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0011 */
    @Override // p000.class_21
    public void method_58(class_121 class_121Var) {
        this.field_1085.push(class_121Var);
        class_121Var.method_163(this.field_1083);
        class_367[] method_626 = class_121Var.method_626();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i >= method_626.length) {
                this.field_1085.pop();
                return;
            } else {
                i = i2 + 1;
                method_626[i2].method_163(this);
            }
        }
    }

    @Override // p000.class_21
    public void method_79(class_368 class_368Var) {
        this.field_1085.push(class_368Var);
        class_368Var.method_163(this.field_1083);
        this.field_1085.pop();
    }

    @Override // p000.class_21
    public void method_73(class_228 class_228Var) {
        this.field_1085.push(class_228Var);
        class_228Var.method_163(this.field_1083);
        this.field_1085.pop();
    }

    @Override // p000.class_21
    public void method_59(class_367 class_367Var) {
        this.field_1085.push(class_367Var);
        class_367Var.method_163(this.field_1083);
        this.field_1085.pop();
    }

    @Override // p000.class_21
    public void method_77(class_353 class_353Var) {
        this.field_1085.push(class_353Var);
        class_353Var.method_163(this.field_1083);
        this.field_1085.pop();
    }

    @Override // p000.class_21
    public void method_84(class_372 class_372Var) {
        this.field_1085.push(class_372Var);
        class_372Var.method_163(this.field_1083);
        this.field_1085.pop();
    }

    @Override // p000.class_21
    public void method_88(class_401 class_401Var) {
        this.field_1085.push(class_401Var);
        class_401Var.method_163(this.field_1083);
        this.field_1085.pop();
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0011 */
    @Override // p000.class_21
    public void method_71(class_261 class_261Var) {
        this.field_1085.push(class_261Var);
        class_261Var.method_163(this.field_1083);
        class_160[] method_906 = class_261Var.method_906();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i >= method_906.length) {
                this.field_1085.pop();
                return;
            } else {
                i = i2 + 1;
                method_906[i2].method_163(this);
            }
        }
    }

    @Override // p000.class_21
    public void method_78(class_340 class_340Var) {
        this.field_1085.push(class_340Var);
        class_340Var.method_163(this.field_1083);
        this.field_1085.pop();
    }

    @Override // p000.class_21
    public void method_80(class_569 class_569Var) {
        this.field_1085.push(class_569Var);
        class_569Var.method_163(this.field_1083);
        this.field_1085.pop();
    }

    @Override // p000.class_21
    public void method_63(class_400 class_400Var) {
        this.field_1085.push(class_400Var);
        class_400Var.method_163(this.field_1083);
        this.field_1085.pop();
    }

    public class_299(class_440 class_440Var, class_21 class_21Var) {
        this.field_1084 = class_440Var;
        this.field_1083 = class_21Var;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0011 */
    @Override // p000.class_21
    public void method_56(class_515 class_515Var) {
        this.field_1085.push(class_515Var);
        class_515Var.method_163(this.field_1083);
        class_78[] method_1560 = class_515Var.method_1560();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i < method_1560.length) {
                i = i2 + 1;
                method_1560[i2].method_163(this);
            } else {
                this.field_1085.pop();
                return;
            }
        }
    }

    @Override // p000.class_21
    public void method_86(class_257 class_257Var) {
        this.field_1085.push(class_257Var);
        class_257Var.method_163(this.field_1083);
        this.field_1085.pop();
    }

    @Override // p000.class_21
    public void method_90(class_599 class_599Var) {
        this.field_1085.push(class_599Var);
        class_599Var.method_163(this.field_1083);
        this.field_1085.pop();
    }

    @Override // p000.class_21
    public void method_61(class_72 class_72Var) {
        this.field_1085.push(class_72Var);
        class_72Var.method_163(this.field_1083);
        this.field_1085.pop();
    }

    public Object method_1301() {
        return method_1303(0);
    }

    @Override // p000.class_21
    public void method_76(class_548 class_548Var) {
        this.field_1085.push(class_548Var);
        class_548Var.method_163(this.field_1083);
        this.field_1085.pop();
    }

    public Object method_1302() {
        return this.field_1085.peek();
    }

    @Override // p000.class_21
    public void method_72(class_43 class_43Var) {
        this.field_1085.push(class_43Var);
        class_43Var.method_163(this.field_1083);
        this.field_1085.pop();
    }

    @Override // p000.class_21
    public void method_81(class_530 class_530Var) {
        this.field_1085.push(class_530Var);
        class_530Var.method_163(this.field_1083);
        this.field_1085.pop();
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:6:0x0024 */
    @Override // p000.class_21
    public void method_68(class_576 class_576Var) {
        int i = 0;
        this.field_1085.push(class_576Var);
        class_576Var.method_163(this.field_1083);
        class_372[] method_2023 = class_576Var.method_2023();
        int i2 = 0;
        int i3 = 0;
        while (i2 < method_2023.length) {
            int i4 = i3 + 1;
            method_2023[i3].method_163(this);
            i2 = i4;
            i3 = i4;
        }
        class_160[] method_906 = class_576Var.method_906();
        while (true) {
            int i5 = i;
            if (i < method_906.length) {
                i = i5 + 1;
                method_906[i5].method_163(this);
            } else {
                this.field_1085.pop();
                return;
            }
        }
    }

    @Override // p000.class_21
    public void method_74(class_35 class_35Var) {
        this.field_1085.push(class_35Var);
        class_35Var.method_163(this.field_1083);
        this.field_1085.pop();
    }

    @Override // p000.class_21
    public void method_64(class_232 class_232Var) {
        this.field_1085.push(class_232Var);
        class_232Var.method_163(this.field_1083);
        this.field_1085.pop();
    }

    @Override // p000.class_21
    public void method_54(class_224 class_224Var) {
        this.field_1085.push(class_224Var);
        class_224Var.method_163(this.field_1083);
        this.field_1085.pop();
    }

    @Override // p000.class_21
    public void method_82(class_285 class_285Var) {
        this.field_1085.push(class_285Var);
        class_285Var.method_163(this.field_1083);
        this.field_1085.pop();
    }

    @Override // p000.class_21
    public void method_60(class_518 class_518Var) {
        this.field_1085.push(class_518Var);
        class_518Var.method_163(this.field_1083);
        this.field_1085.pop();
    }

    public void method_1078() {
        this.field_1084.method_163(this);
    }

    @Override // p000.class_21
    public void method_83(class_573 class_573Var) {
        this.field_1085.push(class_573Var);
        class_573Var.method_163(this.field_1083);
        this.field_1085.pop();
    }

    public Object method_1303(int i) {
        int size = this.field_1085.size();
        if (size >= 2 && i >= 0) {
            return this.field_1085.elementAt(size - (i + 2));
        }
        return null;
    }

    @Override // p000.class_21
    public void method_55(class_387 class_387Var) {
        this.field_1085.push(class_387Var);
        class_387Var.method_163(this.field_1083);
        this.field_1085.pop();
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:10:0x0037 */
    @Override // p000.class_21
    public void method_85(class_440 class_440Var) {
        int i = 0;
        this.field_1085.push(class_440Var);
        class_440Var.method_163(this.field_1083);
        class_261[] method_898 = class_440Var.method_898();
        int i2 = 0;
        int i3 = 0;
        while (i2 < method_898.length) {
            int i4 = i3 + 1;
            method_898[i3].method_163(this);
            i2 = i4;
            i3 = i4;
        }
        class_557[] method_904 = class_440Var.method_904();
        int i5 = 0;
        int i6 = 0;
        while (i5 < method_904.length) {
            int i7 = i6 + 1;
            method_904[i6].method_163(this);
            i5 = i7;
            i6 = i7;
        }
        class_160[] method_906 = class_440Var.method_906();
        while (true) {
            int i8 = i;
            if (i >= method_906.length) {
                class_440Var.method_502().method_163(this);
                this.field_1085.pop();
                return;
            } else {
                i = i8 + 1;
                method_906[i8].method_163(this);
            }
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0011 */
    @Override // p000.class_21
    public void method_65(class_40 class_40Var) {
        this.field_1085.push(class_40Var);
        class_40Var.method_163(this.field_1083);
        class_368[] method_181 = class_40Var.method_181();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i < method_181.length) {
                i = i2 + 1;
                method_181[i2].method_163(this);
            } else {
                this.field_1085.pop();
                return;
            }
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0011 */
    @Override // p000.class_21
    public void method_70(class_157 class_157Var) {
        this.field_1085.push(class_157Var);
        class_157Var.method_163(this.field_1083);
        class_353[] method_772 = class_157Var.method_772();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i < method_772.length) {
                i = i2 + 1;
                method_772[i2].method_163(this);
            } else {
                this.field_1085.pop();
                return;
            }
        }
    }

    @Override // p000.class_21
    public void method_75(class_221 class_221Var) {
        this.field_1085.push(class_221Var);
        class_221Var.method_163(this.field_1083);
        this.field_1085.pop();
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0011 */
    @Override // p000.class_21
    public void method_53(class_332 class_332Var) {
        this.field_1085.push(class_332Var);
        class_332Var.method_163(this.field_1083);
        class_387[] method_1385 = class_332Var.method_1385();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i >= method_1385.length) {
                this.field_1085.pop();
                return;
            } else {
                i = i2 + 1;
                method_1385[i2].method_163(this);
            }
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0011 */
    @Override // p000.class_21
    public void method_62(class_557 class_557Var) {
        this.field_1085.push(class_557Var);
        class_557Var.method_163(this.field_1083);
        class_160[] method_906 = class_557Var.method_906();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i < method_906.length) {
                i = i2 + 1;
                method_906[i2].method_163(this);
            } else {
                this.field_1085.pop();
                return;
            }
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0011 */
    @Override // p000.class_21
    public void method_69(class_499 class_499Var) {
        this.field_1085.push(class_499Var);
        class_499Var.method_163(this.field_1083);
        class_286[] method_1846 = class_499Var.method_1846();
        int i = 1;
        while (true) {
            int i2 = i;
            if (i >= method_1846.length) {
                this.field_1085.pop();
                return;
            } else {
                if (method_1846[i2] != null) {
                    method_1846[i2].method_163(this);
                }
                i = i2 + 1;
            }
        }
    }

    @Override // p000.class_21
    public void method_89(class_118 class_118Var) {
        this.field_1085.push(class_118Var);
        class_118Var.method_163(this.field_1083);
        this.field_1085.pop();
    }

    @Override // p000.class_21
    public void method_66(class_538 class_538Var) {
        this.field_1085.push(class_538Var);
        class_538Var.method_163(this.field_1083);
        this.field_1085.pop();
    }

    @Override // p000.class_21
    public void method_87(class_213 class_213Var) {
        this.field_1085.push(class_213Var);
        class_213Var.method_163(this.field_1083);
        this.field_1085.pop();
    }
}
