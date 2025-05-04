package com.allatori.ant;

import com.allatori.exception.Exception;
import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.unmapped.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_591 extends class_565 {
    public static class_449 field_2374 = new class_34();
    public int field_2365;
    public List field_2366;
    public boolean field_2367;
    public List field_2368;
    public List[] field_2369;
    public List field_2370;
    public class_70 field_2371;
    public String[] field_2372;
    public String field_2373;
    public class_212[] field_2375;
    public int field_2376;
    public List field_2377;
    public boolean field_2378;
    public List field_2379;
    public List field_2380;
    public boolean field_2381;

    public void method_2079(class_160 class_160Var) {
        this.field_2370.remove(class_160Var);
    }

    public void method_2060() {
        this.field_2377.clear();
    }

    public void method_2080(class_135 class_135Var) {
        this.field_2368.remove(class_135Var);
    }

    public void method_2074(class_139 class_139Var) {
        this.field_2366.remove(class_139Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public class_139[] method_2076() {
        int size = this.field_2366.size();
        class_139[] class_139VarArr = new class_139[size];
        this.field_2366.toArray(class_139VarArr);
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (class_139VarArr[i2].method_415() == null) {
                class_139VarArr[i2].method_435(this.field_2371.method_415());
            }
            if (class_139VarArr[i2].method_419() == null) {
                class_139VarArr[i2].method_51(this.field_2371.method_419());
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        if (size > 1) {
            method_2042(class_139VarArr, 0, size - 1);
        }
        return class_139VarArr;
    }

    public class_40 method_2068(class_208 class_208Var) {
        class_139[] method_2076 = method_2076();
        int length = method_2076.length;
        class_368[] class_368VarArr = new class_368[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            class_368VarArr[i2] = method_2076[i2].method_670(class_208Var);
            i = i3;
            i2 = i3;
        }
        return new class_40(class_208Var.method_1004("LocalVariableTable"), (class_368VarArr.length * 10) + 2, class_368VarArr, class_208Var.method_502());
    }

    public void method_2061() {
        this.field_2368.clear();
    }

    public class_270[] method_2049() {
        class_270[] class_270VarArr = new class_270[this.field_2379.size()];
        this.field_2379.toArray(class_270VarArr);
        return class_270VarArr;
    }

    public void method_850(String str) {
        this.field_2377.remove(str);
    }

    public class_591(int i, class_212 class_212Var, class_212[] class_212VarArr, String[] strArr, String str, String str2, class_70 class_70Var, class_208 class_208Var) {
        class_337 class_337Var;
        class_337 class_337Var2;
        this.field_2366 = new ArrayList();
        this.field_2379 = new ArrayList();
        this.field_2368 = new ArrayList();
        this.field_2377 = new ArrayList();
        this.field_2370 = new ArrayList();
        this.field_2378 = false;
        this.field_2367 = false;
        method_407(i);
        method_668(class_212Var);
        method_2078(class_212VarArr);
        method_1639(strArr);
        method_671(str);
        method_912(str2);
        method_2058(class_70Var);
        method_919(class_208Var);
        boolean z = method_1103() || method_1126();
        if (z) {
            class_337Var = null;
            class_337Var2 = null;
        } else {
            class_337 method_415 = class_70Var.method_415();
            class_337 method_419 = class_70Var.method_419();
            if (!method_1125() && str2 != null) {
                method_2072("this", new class_392(str2), method_415, method_419);
            }
            class_337Var = method_419;
            class_337Var2 = method_415;
        }
        if (class_212VarArr != null) {
            int length = class_212VarArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                if (class_212.field_794 == class_212VarArr[i3]) {
                    throw new class_151("'void' is an illegal argument type for a method");
                }
                int i4 = i3 + 1;
                i2 = i4;
                i3 = i4;
            }
            if (strArr == null) {
                strArr = new String[length];
                int i5 = 0;
                int i6 = 0;
                while (i5 < length) {
                    int i7 = i6 + 1;
                    strArr[i6] = new StringBuilder().insert(0, "arg").append(i6).toString();
                    i5 = i7;
                    i6 = i7;
                }
                method_1639(strArr);
            } else if (length != strArr.length) {
                throw new class_151(new StringBuilder().insert(0, "Mismatch in argument array lengths: ").append(length).append(" vs. ").append(strArr.length).toString());
            }
            if (z) {
                return;
            }
            int i8 = 0;
            int i9 = 0;
            while (i8 < length) {
                int i10 = i9 + 1;
                method_2072(strArr[i9], class_212VarArr[i9], class_337Var2, class_337Var);
                i8 = i10;
                i9 = i10;
            }
        }
    }

    public void method_50() {
        this.field_2379.clear();
    }

    public class_332 method_2046(class_208 class_208Var) {
        int size = this.field_2379.size();
        class_387[] class_387VarArr = new class_387[size];
        int i = 0;
        while (i < size) {
            try {
                int i2 = i + 1;
                class_387VarArr[i] = ((class_270) this.field_2379.get(i)).method_1205();
                i = i2;
            } catch (ArrayIndexOutOfBoundsException e) {
            }
        }
        return new class_332(class_208Var.method_1004("LineNumberTable"), (class_387VarArr.length * 4) + 2, class_387VarArr, class_208Var.method_502());
    }

    public String[] method_2064() {
        String[] strArr = new String[this.field_2377.size()];
        this.field_2377.toArray(strArr);
        return strArr;
    }

    public void method_900(String str) {
        this.field_2377.add(str);
    }

    public void method_2075(class_270 class_270Var) {
        this.field_2379.remove(class_270Var);
    }

    public class_372[] method_2023() {
        int size = this.field_2368.size();
        class_372[] class_372VarArr = new class_372[size];
        int i = 0;
        while (i < size) {
            try {
                int i2 = i + 1;
                class_372VarArr[i] = ((class_135) this.field_2368.get(i)).method_647(this.method_917());
                i = i2;
            } catch (ArrayIndexOutOfBoundsException e) {
            }
        }
        return class_372VarArr;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:20:0x0090 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:24:0x00c3 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:29:0x00d5 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:52:0x015f */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:58:0x0179 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:5:0x003d */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public class_591(class_557 class_557Var, String str, class_208 class_208Var) {
//        this(class_557Var, str, class_208Var, null, r6, str, r8, r9);
        class_70 class_70Var;
        class_208 class_208Var2;
        class_392 class_392Var;
        class_337 method_419;
        int method_433 = class_557Var.method_433();
        class_212 method_1033 = class_212.method_1033(class_557Var.method_546());
        class_212[] method_1030 = class_212.method_1030(class_557Var.method_546());
        String method_464 = class_557Var.method_464();
        if ((class_557Var.method_433() & 1280) == 0) {
            class_70Var = new class_70(class_557Var.method_1962().method_429());
            class_208Var2 = class_208Var;
        } else {
            class_70Var = null;
            class_208Var2 = class_208Var;
        }
        class_160[] method_906 = class_557Var.method_906();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i < method_906.length) {
                class_160 class_160Var = method_906[i2];
                if (class_160Var instanceof class_576) {
                    class_576 class_576Var = (class_576) class_160Var;
                    method_853(class_576Var.method_920());
                    method_461(class_576Var.method_183());
                    class_372[] method_2023 = class_576Var.method_2023();
                    if (method_2023 != null) {
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < method_2023.length) {
                            class_372 class_372Var = method_2023[i4];
                            int method_183 = class_372Var.method_183();
                            if (method_183 > 0) {
                                class_392Var = new class_392(class_557Var.method_502().method_1845(method_183, (byte) 7));
                            } else {
                                class_392Var = null;
                            }
                            int method_47 = class_372Var.method_47();
                            if (class_557Var.method_1962().method_429().length == method_47) {
                                method_419 = this.field_2371.method_419();
                            } else {
                                method_419 = this.field_2371.method_417(method_47).method_419();
                            }
                            class_337 method_417 = this.field_2371.method_417(class_372Var.method_928());
                            class_70 class_70Var2 = this.field_2371;
                            int method_4332 = class_372Var.method_433();
                            int i5 = i4 + 1;
                            method_2077(method_417, method_419, class_70Var2.method_417(method_4332), class_392Var);
                            i3 = i5;
                            i4 = i5;
                        }
                    }
                    class_160[] method_9062 = class_576Var.method_906();
                    int i6 = 0;
                    while (true) {
                        int i7 = i6;
                        if (i6 < method_9062.length) {
                            class_160 class_160Var2 = method_9062[i7];
                            if (class_160Var2 instanceof class_332) {
                                class_387[] method_1385 = ((class_332) class_160Var2).method_1385();
                                int i8 = 0;
                                while (true) {
                                    int i9 = i8;
                                    if (i8 < method_1385.length) {
                                        class_387 class_387Var = method_1385[i9];
                                        class_337 method_4172 = this.field_2371.method_417(class_387Var.method_433());
                                        if (method_4172 != null) {
                                            method_2047(method_4172, class_387Var.method_47());
                                        }
                                        i8 = i9 + 1;
                                    }
                                }
                            } else if (class_160Var2 instanceof class_40) {
                                class_368[] method_181 = ((class_40) class_160Var2).method_181();
                                method_2065();
                                int i10 = 0;
                                int i11 = 0;
                                while (i10 < method_181.length) {
                                    class_368 class_368Var = method_181[i11];
                                    class_337 method_4173 = this.field_2371.method_417(class_368Var.method_928());
                                    class_337 method_4174 = this.field_2371.method_417(class_368Var.method_928() + class_368Var.method_433());
                                    method_4173 = method_4173 == null ? this.field_2371.method_415() : method_4173;
                                    if (method_4174 == null) {
                                        method_4174 = this.field_2371.method_419();
                                    }
                                    int i12 = i11 + 1;
                                    method_2067(class_368Var.method_464(), class_212.method_1034(class_368Var.method_198()), class_368Var.method_47(), method_4173, method_4174);
                                    i10 = i12;
                                    i11 = i12;
                                }
                            } else {
                                method_2059(class_160Var2);
                            }
                            i6 = i7 + 1;
                        }
                    }
                } else if (class_160Var instanceof class_224) {
                    String[] method_643 = ((class_224) class_160Var).method_643();
                    int i13 = 0;
                    while (true) {
                        int i14 = i13;
                        if (i13 < method_643.length) {
                            i13 = i14 + 1;
                            method_900(method_643[i14]);
                        }
                    }
                } else if (class_160Var instanceof class_515) {
                    class_78[] method_1560 = ((class_515) class_160Var).method_1560();
                    int i15 = 0;
                    while (true) {
                        int i16 = i15;
                        if (i15 < method_1560.length) {
                            i15 = i16 + 1;
                            method_923(new class_574(method_1560[i16], class_208Var, false));
                        }
                    }
                } else {
                    method_902(class_160Var);
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    public class_135 method_2077(class_337 class_337Var, class_337 class_337Var2, class_337 class_337Var3, class_392 class_392Var) {
        if (class_337Var != null && class_337Var2 != null && class_337Var3 != null) {
            class_135 class_135Var = new class_135(class_337Var, class_337Var2, class_337Var3, class_392Var);
            this.field_2368.add(class_135Var);
            return class_135Var;
        }
        throw new class_151("Exception handler target is null instruction");
    }

    public class_139 method_2072(String str, class_212 class_212Var, class_337 class_337Var, class_337 class_337Var2) {
        return method_2067(str, class_212Var, this.field_2365, class_337Var, class_337Var2);
    }

    public class_139 method_2067(String str, class_212 class_212Var, int i, class_337 class_337Var, class_337 class_337Var2) {
        if (class_212Var.method_619() == 16) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, "Can not use ").append(class_212Var).append(" as type for local variable").toString());
        }
        int method_47 = class_212Var.method_47();
        if (i + method_47 > this.field_2365) {
            this.field_2365 = method_47 + i;
        }
        class_139 class_139Var = new class_139(i, str, class_212Var, class_337Var, class_337Var2);
        int indexOf = this.field_2366.indexOf(class_139Var);
        if (indexOf >= 0) {
            this.field_2366.set(indexOf, class_139Var);
        } else {
            this.field_2366.add(class_139Var);
        }
        return class_139Var;
    }

    public class_135[] method_2069() {
        class_135[] class_135VarArr = new class_135[this.field_2368.size()];
        this.field_2368.toArray(class_135VarArr);
        return class_135VarArr;
    }

    public void method_2059(class_160 class_160Var) {
        this.field_2370.add(class_160Var);
    }

    public void method_2065() {
        this.field_2366.clear();
    }

    public class_270 method_2047(class_337 class_337Var, int i) {
        class_270 class_270Var = new class_270(class_337Var, i);
        this.field_2379.add(class_270Var);
        return class_270Var;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x000d */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:7:0x001a */
    public static final void method_2042(class_139[] class_139VarArr, int i, int i2) {
        int method_47 = class_139VarArr[(i + i2) / 2].method_47();
        int i3 = i;
        int i4 = i2;
        do {
            while (class_139VarArr[i3].method_47() < method_47) {
                i3++;
            }
            while (method_47 < class_139VarArr[i4].method_47()) {
                i4--;
            }
            if (i3 <= i4) {
                class_139 class_139Var = class_139VarArr[i3];
                class_139VarArr[i3] = class_139VarArr[i4];
                i3++;
                class_139VarArr[i4] = class_139Var;
                i4--;
            }
        } while (i3 <= i4);
        if (i < i4) {
            method_2042(class_139VarArr, i, i4);
        }
        if (i3 < i2) {
            method_2042(class_139VarArr, i3, i2);
        }
    }

    public class_224 method_2066(class_208 class_208Var) {
        int size = this.field_2377.size();
        int[] iArr = new int[size];
        int i = 0;
        while (i < size) {
            try {
                int i2 = i + 1;
                iArr[i] = class_208Var.method_1007((String) this.field_2377.get(i));
                i = i2;
            } catch (ArrayIndexOutOfBoundsException e) {
            }
        }
        return new class_224(class_208Var.method_1004("Exceptions"), (size * 2) + 2, iArr, class_208Var.method_502());
    }

    public String method_1829(int i) {
        return this.field_2372[i];
    }

    @Override // p000.class_565
    public String method_464() {
        return class_212.method_1032(this.method_669(), this.field_2375);
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:4:0x000b */
    public void method_2053(class_208 class_208Var) {
        class_160[] method_948 = class_204.method_948(class_208Var, this.field_2366);
        if (method_948 == null) {
            return;
        }
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

    public void method_2044(int i, String str) {
        this.field_2372[i] = str;
    }

    public void method_849(class_212 class_212Var) {
        method_668(class_212Var);
    }

    public void method_411() {
        this.field_2370.clear();
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:8:0x0010 */
    public void method_846(class_208 class_208Var) {
        class_160[] method_949;
        if (this.field_2378 && (method_949 = class_204.method_949(class_208Var, this.field_2369)) != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i >= method_949.length) {
                    return;
                }
                i = i2 + 1;
                method_902(method_949[i2]);
            }
        }
    }

    public int method_928() {
        return this.field_2365;
    }

    public class_160[] method_2041() {
        class_160[] class_160VarArr = new class_160[this.field_2370.size()];
        this.field_2370.toArray(class_160VarArr);
        return class_160VarArr;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:11:0x0021 */
    public void method_2055() {
        if (this.field_2371 != null) {
            class_337 method_415 = this.field_2371.method_415();
            class_337 class_337Var = method_415;
            class_337 class_337Var2 = method_415;
            while (class_337Var != null) {
                class_337 class_337Var3 = class_337Var2.field_1117;
                if (class_337Var3 != null && (class_337Var2.method_1038() instanceof class_109)) {
                    try {
                        this.field_2371.method_420(class_337Var2);
                    } catch (Exception e) {
                        class_337[] method_446 = e.method_446();
                        int i = 0;
                        int i2 = 0;
                        while (i < method_446.length) {
                            class_389[] method_1398 = method_446[i2].method_1398();
                            int i3 = 0;
                            int i4 = 0;
                            while (i3 < method_1398.length) {
                                int i5 = i4 + 1;
                                method_1398[i4].method_52(method_446[i2], class_337Var3);
                                i3 = i5;
                                i4 = i5;
                            }
                            int i6 = i2 + 1;
                            i = i6;
                            i2 = i6;
                        }
                    }
                }
                class_337Var = class_337Var3;
                class_337Var2 = class_337Var3;
            }
        }
    }

    public void method_2058(class_70 class_70Var) {
        this.field_2371 = class_70Var;
    }

    public static int method_2063(class_208 class_208Var, class_70 class_70Var, class_135[] class_135VarArr) {
        class_337 class_337Var;
        class_337 class_337Var2;
        class_98 method_1290;
        class_337 class_337Var3;
        class_293 class_293Var;
        class_293 class_293Var2 = new class_293();
        int i = 0;
        int i2 = 0;
        while (i < class_135VarArr.length) {
            class_337 method_45 = class_135VarArr[i2].method_45();
            if (method_45 != null) {
                class_293Var2.method_1293(method_45, 1);
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        class_337 method_415 = class_70Var.method_415();
        int i4 = 0;
        int i5 = 0;
        while (method_415 != null) {
            class_539 method_1038 = method_415.method_1038();
            short method_1904 = method_1038.method_1904();
            i5 += method_1038.method_1387(class_208Var) - method_1038.method_896(class_208Var);
            int i6 = i5 > i4 ? i5 : i4;
            if (method_1038 instanceof class_272) {
                class_272 class_272Var = (class_272) method_1038;
                if (method_1038 instanceof class_450) {
                    class_337[] method_446 = ((class_450) class_272Var).method_446();
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < method_446.length) {
                        int i9 = i8 + 1;
                        class_293Var2.method_1293(method_446[i8], i5);
                        i7 = i9;
                        i8 = i9;
                    }
                    class_293Var = class_293Var2;
                    class_337Var3 = null;
                } else {
                    if (class_272Var instanceof class_559) {
                        class_337Var3 = method_415;
                    } else {
                        if (method_1904 == 168 || method_1904 == 201) {
                            class_293Var2.method_1293(method_415.method_415(), i5 - 1);
                        }
                        class_337Var3 = null;
                    }
                    class_293Var = class_293Var2;
                }
                class_293Var.method_1293(class_272Var.getF940(), i5);
                class_337Var = class_337Var3;
                class_337Var2 = class_337Var3;
            } else {
                if (method_1904 == 191 || method_1904 == 169 || (method_1904 >= 172 && method_1904 <= 177)) {
                    method_415 = null;
                }
                class_337Var = method_415;
                class_337Var2 = method_415;
            }
            method_415 = class_337Var != null ? class_337Var2.method_415() : class_337Var2;
            if (method_415 != null || (method_1290 = class_293Var2.method_1290()) == null) {
                i4 = i6;
            } else {
                method_415 = method_1290.field_504;
                i5 = method_1290.field_505;
                i4 = i6;
            }
        }
        return i4;
    }

    public class_212 method_2052(int i) {
        return this.field_2375[i];
    }

    public class_212[] method_1964() {
        return (class_212[]) this.field_2375.clone();
    }

    public void method_2078(class_212[] class_212VarArr) {
        this.field_2375 = class_212VarArr;
    }

    public void method_853(int i) {
        this.field_2376 = i;
    }

    public void method_1639(String[] strArr) {
        this.field_2372 = strArr;
    }

    public void method_912(String str) {
        this.field_2373 = str;
    }

    public class_212 method_2057() {
        return method_669();
    }

    public class_70 method_438() {
        return this.field_2371;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:25:0x007f */
    public class_557 method_2048() {
        class_40 class_40Var;
        class_332 class_332Var;
        class_576 class_576Var;
        int i = 0;
        class_224 class_224Var = null;
        String method_464 = method_464();
        int method_1004 = this.IIiIIIIiii.method_1004(this.IIiiIIIIIi);
        int method_10042 = this.IIiIIIIiii.method_1004(method_464);
        byte[] method_429 = this.field_2371 != null ? this.field_2371.method_429() : null;
        if (this.field_2366.size() <= 0 || this.field_2381) {
            class_40Var = null;
        } else {
            class_40 method_2068 = method_2068(this.IIiIIIIiii);
            method_2059(method_2068);
            class_40Var = method_2068;
        }
        if (this.field_2379.size() <= 0 || this.field_2381) {
            class_332Var = null;
        } else {
            class_332 method_2046 = method_2046(this.IIiIIIIiii);
            method_2059(method_2046);
            class_332Var = method_2046;
        }
        class_160[] method_2041 = method_2041();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < method_2041.length) {
            int i5 = i3 + 1;
            i4 += method_2041[i3].method_47() + 6;
            i2 = i5;
            i3 = i5;
        }
        class_372[] method_2023 = method_2023();
        int length = method_2023.length * 8;
        if (this.field_2371 == null || method_1103() || method_1126()) {
            class_576Var = null;
        } else {
            class_160[] method_906 = method_906();
            while (true) {
                int i6 = i;
                if (i >= method_906.length) {
                    break;
                }
                class_160 class_160Var = method_906[i6];
                if (class_160Var instanceof class_576) {
                    method_921(class_160Var);
                }
                i = i6 + 1;
            }
            class_576 class_576Var2 = new class_576(this.IIiIIIIiii.method_1004("Code"), method_429.length + 8 + 2 + length + 2 + i4, this.field_2376, this.field_2365, method_429, method_2023, method_2041, this.IIiIIIIiii.method_502());
            method_902(class_576Var2);
            class_576Var = class_576Var2;
        }
        method_2053(this.IIiIIIIiii);
        method_846(this.IIiIIIIiii);
        if (this.field_2377.size() > 0) {
            class_224Var = method_2066(this.IIiIIIIiii);
            method_902(class_224Var);
        }
        class_557 class_557Var = new class_557(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE, method_1004, method_10042, method_906(), this.IIiIIIIiii.method_502());
        if (class_40Var != null) {
            method_2079(class_40Var);
        }
        if (class_332Var != null) {
            method_2079(class_332Var);
        }
        if (class_576Var != null) {
            method_921(class_576Var);
        }
        if (class_224Var != null) {
            method_921(class_224Var);
        }
        return class_557Var;
    }

    public void method_2050(int i, class_212 class_212Var) {
        this.field_2375[i] = class_212Var;
    }

    public String method_546() {
        return this.field_2373;
    }

    public String[] method_643() {
        return (String[]) this.field_2372.clone();
    }

    public void method_2056() {
        if (this.field_2371 != null) {
            this.field_2376 = method_2063(this.IIiIIIIiii, this.field_2371, method_2069());
            if (this.field_2376 != 0 || this.field_2368 == null || this.field_2368.size() <= 0) {
                return;
            }
            this.field_2376 = 1;
            return;
        }
        this.field_2376 = 0;
    }

    public int method_183() {
        return this.field_2376;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:9:0x0012 */
    public void method_2071() {
        int method_47;
        int i = 0;
        if (this.field_2371 != null) {
            int i2 = method_1125() ? 0 : 1;
            if (this.field_2375 != null) {
                while (true) {
                    int i3 = i;
                    if (i >= this.field_2375.length) {
                        break;
                    }
                    i = i3 + 1;
                    i2 += this.field_2375[i3].method_47();
                }
            }
            class_337 method_415 = this.field_2371.method_415();
            class_337 class_337Var = method_415;
            class_337 class_337Var2 = method_415;
            int i4 = i2;
            while (class_337Var != null) {
                Cloneable method_1038 = class_337Var2.method_1038();
                if ((!(method_1038 instanceof class_508) && !(method_1038 instanceof class_398) && !(method_1038 instanceof class_67)) || (method_47 = ((class_494) method_1038).method_47() + ((class_97) method_1038).method_32(this.IIiIIIIiii).method_47()) <= i4) {
                    method_47 = i4;
                }
                class_337 method_4152 = class_337Var2.method_415();
                class_337Var = method_4152;
                class_337Var2 = method_4152;
                i4 = method_47;
            }
            this.field_2365 = i4;
            return;
        }
        this.field_2365 = 0;
    }

    public void method_461(int i) {
        this.field_2365 = i;
    }

    public void method_855(boolean z) {
        this.field_2381 = z;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:4:0x000b */
    public void method_2051() {
        if (this.field_2380 != null) {
            Iterator it = this.field_2380.iterator();
            while (it.hasNext()) {
                ((class_395) it.next()).method_1558(this);
            }
        }
    }

    public void method_2070(class_395 class_395Var) {
        if (this.field_2380 == null) {
            return;
        }
        this.field_2380.remove(class_395Var);
    }

    public void method_2062(int i, class_574 class_574Var) {
        method_2081();
        if (!this.field_2378) {
            this.field_2369 = new List[this.field_2375.length];
            this.field_2378 = true;
        }
        List list = this.field_2369[i];
        if (list != null) {
            list.add(class_574Var);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(class_574Var);
        this.field_2369[i] = arrayList;
    }

    public static void method_861(class_449 class_449Var) {
        field_2374 = class_449Var;
    }

    public void method_2081() {
        if (this.field_2367) {
            return;
        }
        class_160[] method_906 = method_906();
        int i = 0;
        class_548 class_548Var = null;
        int i2 = 0;
        class_548 class_548Var2 = null;
        while (i < method_906.length) {
            class_160 class_160Var = method_906[i2];
            if (class_160Var instanceof class_548) {
                if (!this.field_2378) {
                    this.field_2369 = new List[this.field_2375.length];
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < this.field_2375.length) {
                        int i5 = i4 + 1;
                        this.field_2369[i4] = new ArrayList();
                        i3 = i5;
                        i4 = i5;
                    }
                }
                this.field_2378 = true;
                class_548 class_548Var3 = (class_548) class_160Var;
                if (class_548Var3 instanceof class_536) {
                    class_548Var = class_548Var3;
                } else {
                    class_548Var2 = class_548Var3;
                }
                int i6 = 0;
                int i7 = 0;
                while (i6 < this.field_2375.length) {
                    try {
                        this.field_2369[i7].addAll(method_2054(class_548Var3.method_1944()[i7].method_1560()));
                    } catch (Exception e) {
                    }
                    int i8 = i7 + 1;
                    i6 = i8;
                    i7 = i8;
                }
            }
            int i9 = i2 + 1;
            i = i9;
            i2 = i9;
        }
        if (class_548Var != null) {
            method_921(class_548Var);
        }
        if (class_548Var2 != null) {
            method_921(class_548Var2);
        }
        this.field_2367 = true;
    }

    public boolean equals(Object obj) {
        return field_2374.method_161(this, obj);
    }

    public List method_2054(class_78[] class_78VarArr) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < class_78VarArr.length) {
            int i3 = i2 + 1;
            arrayList.add(new class_574(class_78VarArr[i2], method_917(), false));
            i = i3;
            i2 = i3;
        }
        return arrayList;
    }

    public List method_2043(int i) {
        method_2081();
        if (!this.field_2378 || i > this.field_2375.length) {
            return null;
        }
        return this.field_2369[i];
    }

    public void method_2073(class_395 class_395Var) {
        if (this.field_2380 == null) {
            this.field_2380 = new ArrayList();
        }
        this.field_2380.add(class_395Var);
    }

    public static class_449 method_859() {
        return field_2374;
    }

    public class_591 method_2045(String str, class_208 class_208Var) {
        class_591 class_591Var = new class_591(((class_591) clone()).method_2048(), str, this.IIiIIIIiii);
        if (this.IIiIIIIiii != class_208Var) {
            class_591Var.method_919(class_208Var);
            class_591Var.method_438().method_440(this.IIiIIIIiii, class_208Var);
        }
        return class_591Var;
    }

    public int hashCode() {
        return field_2374.method_162(this);
    }
}
