package com.allatori.ant;

import com.allatori.commons.ASMStuffs;
import com.allatori.interfaces.unmapped.class_555;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_77 {
    public static final int field_267 = 1;
    public static final int field_268 = 1048576;
    public static final int field_269 = 12582912;
    public static final int field_270 = 11;
    public static final int field_271 = 4194316;
    public static final int field_272 = 4194310;
    public static final int field_273 = 4;
    public static final int field_275 = 20;
    public static final int field_276 = 4194309;
    public static final int field_277 = 4194314;
    public static final int field_278 = -67108864;
    public static final int field_279 = 12;
    public static final int field_280 = 2;
    public static final int field_281 = 4;
    public static final int field_282 = 4194308;
    public static final int field_283 = 7;
    public static final int field_284 = 2;
    public static final int field_285 = 22;
    public static final int field_286 = 5;
    public static final int field_287 = 26;
    public static final int field_288 = 251;
    public static final int field_289 = 25165824;
    public static final int field_291 = 0;
    public static final int field_292 = 4194313;
    public static final int field_293 = 64;
    public static final int field_294 = 255;
    public static final int field_295 = 67108864;
    public static final int field_296 = 10;
    public static final int field_297 = 248;
    public static final int field_298 = 1048575;
    public static final int field_299 = 4194315;
    public static final int field_300 = 62914560;
    public static final int field_301 = 20971520;
    public static final int field_303 = -67108864;
    public static final int field_304 = 4194306;
    public static final int field_305 = 128;
    public static final int field_307 = 3;
    public static final int field_308 = 252;
    public static final int field_309 = 9;
    public static final int field_310 = 20;
    public static final int field_312 = 4194305;
    public static final int field_314 = 8;
    public static final int field_315 = 4194304;
    public static final int field_316 = 8388608;
    public static final int field_318 = 4194307;
    public static final int field_320 = 0;
    public static final int field_321 = 247;
    public static final int field_322 = 6;
    public static final int field_324 = 16777216;
    public static final int field_325 = 4194304;
    public static final int field_326 = 6;
    public int[] field_274;
    public int[] field_290;
    public short field_302;
    public int[] field_306;
    public class_243 field_311;
    public short field_313;
    public int[] field_317;
    public int[] field_319;
    public int field_323;

    public static String method_519(String str) {
        return new StringBuilder().insert(0, "[").append(str).toString();
    }

    public static String method_521(String str) {
        return new StringBuilder().insert(0, "Invalid descriptor fragment: ").append(str).toString();
    }

    public static String method_527(String str) {
        return new StringBuilder().insert(0, "Invalid descriptor: ").append(str).toString();
    }

    public int method_522() {
        if (this.field_313 <= 0) {
            short s = (short) (this.field_302 - 1);
            this.field_302 = s;
            return 25165824 | (-s);
        }
        int[] iArr = this.field_317;
        short s2 = (short) (this.field_313 - 1);
        this.field_313 = s2;
        return iArr[s2];
    }

    public final void method_510(class_77 class_77Var) {
        this.field_290 = class_77Var.field_290;
        this.field_274 = class_77Var.field_274;
        this.field_302 = (short) 0;
        this.field_306 = class_77Var.field_306;
        this.field_317 = class_77Var.field_317;
        this.field_313 = class_77Var.field_313;
        this.field_323 = class_77Var.field_323;
        this.field_319 = class_77Var.field_319;
    }

    public class_77(class_243 class_243Var) {
        this.field_311 = class_243Var;
    }

    public void method_508(class_148 class_148Var, String str) {
        int method_518 = method_518(class_148Var, str, str.charAt(0) == '(' ? class_279.method_1254(str) : 0);
        if (method_518 != 0) {
            method_506(method_518);
            if (method_518 == 4194308 || method_518 == 4194307) {
                method_506(4194304);
            }
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:13:0x0041 */
    public static int method_518(class_148 class_148Var, String str, int i) {
        int method_753;
        switch (str.charAt(i)) {
            case 'B':
            case 'C':
            case 'I':
            case 'S':
            case 'Z':
                return field_312;
            case 'D':
                return field_318;
            case 'E':
            case 'G':
            case 'H':
            case 'K':
            case ASMStuffs.field_126 /* 77 */:
            case ASMStuffs.field_111 /* 78 */:
            case class_555.field_2159 /* 79 */:
            case class_555.field_2255 /* 80 */:
            case class_555.field_2096 /* 81 */:
            case class_555.field_2288 /* 82 */:
            case class_555.field_2183 /* 84 */:
            case class_555.field_2313 /* 85 */:
            case class_555.field_2192 /* 87 */:
            case class_555.field_2274 /* 88 */:
            case class_555.field_2188 /* 89 */:
            default:
                throw new IllegalArgumentException(method_527(str.substring(i)));
            case 'F':
                return field_304;
            case 'J':
                return field_282;
            case ASMStuffs.field_86 /* 76 */:
                return 8388608 | class_148Var.method_753(str.substring(i + 1, str.length() - 1));
            case class_555.field_2226 /* 86 */:
                return 0;
            case '[':
                int i2 = i + 1;
                while (str.charAt(i2) == '[') {
                    i2++;
                }
                switch (str.charAt(i2)) {
                    case 'B':
                        method_753 = field_277;
                        break;
                    case 'C':
                        method_753 = field_299;
                        break;
                    case 'D':
                        method_753 = 4194307;
                        break;
                    case 'F':
                        method_753 = 4194306;
                        break;
                    case 'I':
                        method_753 = 4194305;
                        break;
                    case 'J':
                        method_753 = 4194308;
                        break;
                    case ASMStuffs.field_86 /* 76 */:
                        method_753 = class_148Var.method_753(str.substring(i2 + 1, str.length() - 1)) | field_316;
                        break;
                    case 'S':
                        method_753 = field_271;
                        break;
                    case 'Z':
                        method_753 = field_292;
                        break;
                    default:
                        throw new IllegalArgumentException(method_521(str.substring(i2)));
                }
                return ((i2 - i) << 26) | method_753;
        }
    }

    public static int method_511(class_148 class_148Var, String str) {
        return 8388608 | class_148Var.method_753(str);
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:10:0x002f */
    public final void method_520(class_148 class_148Var, int i, Object[] objArr, int i2, Object[] objArr2) {
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < i) {
            int i6 = i5 + 1;
            this.field_290[i5] = method_517(class_148Var, objArr[i4]);
            if (objArr[i4] == class_555.field_2308 || objArr[i4] == class_555.field_2247) {
                this.field_290[i6] = 4194304;
                i6++;
            }
            int i7 = i4 + 1;
            i3 = i7;
            i4 = i7;
            i5 = i6;
        }
        while (true) {
            int i8 = i5;
            if (i5 >= this.field_290.length) {
                break;
            }
            i5 = i8 + 1;
            this.field_290[i8] = 4194304;
        }
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < i2) {
            if (objArr2[i11] == class_555.field_2308 || objArr2[i11] == class_555.field_2247) {
                i10++;
            }
            int i12 = i11 + 1;
            i9 = i12;
            i11 = i12;
        }
        this.field_274 = new int[i10 + i2];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < i2) {
            int i16 = i14 + 1;
            this.field_274[i14] = method_517(class_148Var, objArr2[i15]);
            if (objArr2[i15] == class_555.field_2308 || objArr2[i15] == class_555.field_2247) {
                this.field_274[i16] = 4194304;
                i16++;
            }
            int i17 = i15 + 1;
            i13 = i17;
            i14 = i16;
            i15 = i17;
        }
        this.field_313 = (short) 0;
        this.field_323 = 0;
    }

    public void method_525(int i, int i2) {
        if (this.field_306 == null) {
            this.field_306 = new int[10];
        }
        int length = this.field_306.length;
        if (i >= length) {
            int[] iArr = new int[Math.max(i + 1, length * 2)];
            System.arraycopy(this.field_306, 0, iArr, 0, length);
            this.field_306 = iArr;
        }
        this.field_306[i] = i2;
    }

    public int method_512(int i) {
        if (this.field_306 != null && i < this.field_306.length) {
            int i2 = this.field_306[i];
            if (i2 != 0) {
                return i2;
            }
            int i3 = 20971520 | i;
            this.field_306[i] = i3;
            return i3;
        }
        return 20971520 | i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void method_513(class_148 class_148Var, int i, String str, int i2) {
        int i3 = 1;
        this.field_290 = new int[i2];
        this.field_274 = new int[0];
        if ((i & 8) != 0) {
            i3 = 0;
        } else if ((262144 & i) == 0) {
            this.field_290[0] = 8388608 | class_148Var.method_753(class_148Var.method_716());
        } else {
            this.field_290[0] = 4194310;
        }
        class_279[] method_1238 = class_279.method_1238(str);
        int length = method_1238.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = i3;
        while (i4 < length) {
            int method_518 = method_518(class_148Var, method_1238[i5].method_1234(), 0);
            int i7 = i6 + 1;
            this.field_290[i6] = method_518;
            if (method_518 == 4194308 || method_518 == 4194307) {
                this.field_290[i7] = 4194304;
                i7++;
            }
            int i8 = i5 + 1;
            i4 = i8;
            i5 = i8;
            i6 = i7;
        }
        int i9 = i6;
        int i10 = i6;
        while (i9 < i2) {
            int i11 = i10 + 1;
            this.field_290[i10] = 4194304;
            i9 = i11;
            i10 = i11;
        }
    }

    public void method_514(int i) {
        if (this.field_313 < i) {
            this.field_302 = (short) (this.field_302 - (i - this.field_313));
            this.field_313 = (short) 0;
        } else {
            this.field_313 = (short) (this.field_313 - i);
        }
    }

    public static int method_517(class_148 class_148Var, Object obj) {
        if (!(obj instanceof Integer)) {
            if (obj instanceof String) {
                return method_518(class_148Var, class_279.method_1240((String) obj).method_1234(), 0);
            }
            class_243 class_243Var = (class_243) obj;
            if ((class_243Var.field_895 & 4) == 0) {
                return 16777216 | class_148Var.method_744("", class_243Var);
            }
            return 12582912 | class_148Var.method_755("", class_243Var.field_870);
        }
        return 4194304 | ((Integer) obj).intValue();
    }

    public void method_506(int i) {
        if (this.field_317 == null) {
            this.field_317 = new int[10];
        }
        int length = this.field_317.length;
        if (this.field_313 >= length) {
            int[] iArr = new int[Math.max(this.field_313 + 1, length * 2)];
            System.arraycopy(this.field_317, 0, iArr, 0, length);
            this.field_317 = iArr;
        }
        int[] iArr2 = this.field_317;
        short s = this.field_313;
        this.field_313 = (short) (s + 1);
        iArr2[s] = i;
        short s2 = (short) (this.field_302 + this.field_313);
        if (s2 > this.field_311.field_886) {
            this.field_311.field_886 = s2;
        }
    }

    public final int method_516() {
        return this.field_274.length;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:10:0x001b */
    public int method_526(class_148 class_148Var, int i) {
        int i2;
        if (i == 4194310 || (i & (-4194304)) == 12582912 || (i & (-4194304)) == 16777216) {
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i3 < this.field_323) {
                    int i5 = this.field_319[i4];
                    int i6 = (-67108864) & i5;
                    int i7 = 62914560 & i5;
                    int i8 = i5 & field_298;
                    if (i7 != 20971520) {
                        if (i7 == 25165824) {
                            i5 = this.field_274[this.field_274.length - i8] + i6;
                        }
                        i2 = i;
                    } else {
                        i5 = this.field_290[i8] + i6;
                        i2 = i;
                    }
                    if (i2 == i5) {
                        if (i == 4194310) {
                            return 8388608 | class_148Var.method_753(class_148Var.method_716());
                        }
                        return 8388608 | class_148Var.method_753(class_148Var.method_704(i & field_298).field_1051);
                    }
                    i3 = i4 + 1;
                } else {
                    return i;
                }
            }
        } else {
            return i;
        }
    }

    public void method_509(int i, int i2, class_296 class_296Var, class_148 class_148Var) {
        switch (i) {
            case 0:
            case class_555.field_2230 /* 116 */:
            case class_555.field_2296 /* 117 */:
            case class_555.field_2294 /* 118 */:
            case class_555.field_2139 /* 119 */:
            case class_555.field_2098 /* 145 */:
            case class_555.field_2172 /* 146 */:
            case class_555.field_2275 /* 147 */:
            case class_555.field_2270 /* 167 */:
            case class_555.field_2150 /* 177 */:
                return;
            case 1:
                method_506(field_276);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 16:
            case 17:
            case 21:
                method_506(field_312);
                return;
            case 9:
            case 10:
            case 22:
                method_506(field_282);
                method_506(4194304);
                return;
            case 11:
            case 12:
            case class_555.field_2278 /* 13 */:
            case 23:
                method_506(field_304);
                return;
            case class_555.field_2199 /* 14 */:
            case 15:
            case class_555.field_2101 /* 24 */:
                method_506(field_318);
                method_506(4194304);
                return;
            case 18:
                switch (class_296Var.field_1044) {
                    case 3:
                        method_506(field_312);
                        return;
                    case 4:
                        method_506(field_304);
                        return;
                    case 5:
                        method_506(field_282);
                        method_506(4194304);
                        return;
                    case 6:
                        method_506(field_318);
                        method_506(4194304);
                        return;
                    case 7:
                        method_506(8388608 | class_148Var.method_753("java/lang/Class"));
                        return;
                    case 8:
                        method_506(8388608 | class_148Var.method_753("java/lang/String"));
                        return;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case class_555.field_2278 /* 13 */:
                    case class_555.field_2199 /* 14 */:
                    default:
                        throw new AssertionError();
                    case 15:
                        method_506(8388608 | class_148Var.method_753("java/lang/invoke/MethodHandle"));
                        return;
                    case 16:
                        method_506(8388608 | class_148Var.method_753("java/lang/invoke/MethodType"));
                        return;
                    case 17:
                        method_508(class_148Var, class_296Var.field_1051);
                        return;
                }
            case 19:
            case 20:
            case 26:
            case ASMStuffs.field_157 /* 27 */:
            case ASMStuffs.field_156 /* 28 */:
            case ASMStuffs.field_160 /* 29 */:
            case ASMStuffs.field_162 /* 30 */:
            case ASMStuffs.field_84 /* 31 */:
            case 32:
            case 33:
            case ASMStuffs.field_138 /* 34 */:
            case ASMStuffs.field_122 /* 35 */:
            case ASMStuffs.field_80 /* 36 */:
            case ASMStuffs.field_170 /* 37 */:
            case ASMStuffs.field_163 /* 38 */:
            case ASMStuffs.field_87 /* 39 */:
            case ASMStuffs.field_104 /* 40 */:
            case ASMStuffs.field_149 /* 41 */:
            case ASMStuffs.field_147 /* 42 */:
            case ASMStuffs.field_161 /* 43 */:
            case ASMStuffs.field_167 /* 44 */:
            case ASMStuffs.field_175 /* 45 */:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case ASMStuffs.field_86 /* 76 */:
            case ASMStuffs.field_126 /* 77 */:
            case ASMStuffs.field_111 /* 78 */:
            case ASMStuffs.field_79 /* 196 */:
            default:
                throw new IllegalArgumentException();
            case class_555.field_2318 /* 25 */:
                method_506(method_512(i2));
                return;
            case 46:
            case 51:
            case 52:
            case 53:
            case class_555.field_2194 /* 96 */:
            case 100:
            case class_555.field_2146 /* 104 */:
            case class_555.field_2250 /* 108 */:
            case class_555.field_2317 /* 112 */:
            case class_555.field_2152 /* 120 */:
            case class_555.field_2107 /* 122 */:
            case class_555.field_2195 /* 124 */:
            case class_555.field_2236 /* 126 */:
            case 128:
            case 130:
            case class_555.field_2120 /* 136 */:
            case class_555.field_2079 /* 142 */:
            case class_555.field_2220 /* 149 */:
            case class_555.field_2301 /* 150 */:
                method_514(2);
                method_506(field_312);
                return;
            case 47:
            case class_555.field_2268 /* 143 */:
                method_514(2);
                method_506(field_282);
                method_506(4194304);
                return;
            case 48:
            case class_555.field_2203 /* 98 */:
            case class_555.field_2081 /* 102 */:
            case class_555.field_2233 /* 106 */:
            case class_555.field_2151 /* 110 */:
            case class_555.field_2213 /* 114 */:
            case class_555.field_2234 /* 137 */:
            case class_555.field_2129 /* 144 */:
                method_514(2);
                method_506(field_304);
                return;
            case 49:
            case class_555.field_2286 /* 138 */:
                method_514(2);
                method_506(field_318);
                method_506(4194304);
                return;
            case 50:
                method_514(1);
                int method_522 = method_522();
                if (method_522 != 4194309) {
                    method_522 -= 67108864;
                }
                method_506(method_522);
                return;
            case 54:
            case 56:
            case 58:
                method_525(i2, method_522());
                if (i2 > 0) {
                    int method_512 = method_512(i2 - 1);
                    if (method_512 == 4194308 || method_512 == 4194307) {
                        method_525(i2 - 1, 4194304);
                        return;
                    } else {
                        if ((62914560 & method_512) == 20971520 || (62914560 & method_512) == 25165824) {
                            method_525(i2 - 1, method_512 | 1048576);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 55:
            case 57:
                method_514(1);
                method_525(i2, method_522());
                method_525(i2 + 1, 4194304);
                if (i2 > 0) {
                    int method_5122 = method_512(i2 - 1);
                    if (method_5122 != 4194308 && method_5122 != 4194307) {
                        if ((62914560 & method_5122) == 20971520 || (62914560 & method_5122) == 25165824) {
                            method_525(i2 - 1, method_5122 | 1048576);
                            return;
                        }
                        return;
                    }
                    method_525(i2 - 1, 4194304);
                    return;
                }
                return;
            case class_555.field_2159 /* 79 */:
            case class_555.field_2096 /* 81 */:
            case 83:
            case class_555.field_2183 /* 84 */:
            case class_555.field_2313 /* 85 */:
            case class_555.field_2226 /* 86 */:
                method_514(3);
                return;
            case class_555.field_2255 /* 80 */:
            case class_555.field_2288 /* 82 */:
                method_514(4);
                return;
            case class_555.field_2192 /* 87 */:
            case class_555.field_2304 /* 153 */:
            case class_555.field_2215 /* 154 */:
            case class_555.field_2244 /* 155 */:
            case class_555.field_2077 /* 156 */:
            case class_555.field_2251 /* 157 */:
            case class_555.field_2179 /* 158 */:
            case class_555.field_2148 /* 170 */:
            case class_555.field_2131 /* 171 */:
            case class_555.field_2132 /* 172 */:
            case class_555.field_2135 /* 174 */:
            case class_555.field_2161 /* 176 */:
            case class_555.field_2262 /* 191 */:
            case class_555.field_2165 /* 194 */:
            case class_555.field_2282 /* 195 */:
            case class_555.field_2182 /* 198 */:
            case class_555.field_2102 /* 199 */:
                method_514(1);
                return;
            case class_555.field_2274 /* 88 */:
            case class_555.field_2287 /* 159 */:
            case class_555.field_2273 /* 160 */:
            case class_555.field_2099 /* 161 */:
            case class_555.field_2097 /* 162 */:
            case class_555.field_2130 /* 163 */:
            case class_555.field_2227 /* 164 */:
            case class_555.field_2136 /* 165 */:
            case class_555.field_2243 /* 166 */:
            case class_555.field_2196 /* 173 */:
            case class_555.field_2221 /* 175 */:
                method_514(2);
                return;
            case class_555.field_2188 /* 89 */:
                int method_5222 = method_522();
                method_506(method_5222);
                method_506(method_5222);
                return;
            case 90:
                int method_5223 = method_522();
                int method_5224 = method_522();
                method_506(method_5223);
                method_506(method_5224);
                method_506(method_5223);
                return;
            case 91:
                int method_5225 = method_522();
                int method_5226 = method_522();
                int method_5227 = method_522();
                method_506(method_5225);
                method_506(method_5227);
                method_506(method_5226);
                method_506(method_5225);
                return;
            case class_555.field_2090 /* 92 */:
                int method_5228 = method_522();
                int method_5229 = method_522();
                method_506(method_5229);
                method_506(method_5228);
                method_506(method_5229);
                method_506(method_5228);
                return;
            case class_555.field_2280 /* 93 */:
                int method_52210 = method_522();
                int method_52211 = method_522();
                int method_52212 = method_522();
                method_506(method_52211);
                method_506(method_52210);
                method_506(method_52212);
                method_506(method_52211);
                method_506(method_52210);
                return;
            case class_555.field_2242 /* 94 */:
                int method_52213 = method_522();
                int method_52214 = method_522();
                int method_52215 = method_522();
                int method_52216 = method_522();
                method_506(method_52214);
                method_506(method_52213);
                method_506(method_52216);
                method_506(method_52215);
                method_506(method_52214);
                method_506(method_52213);
                return;
            case class_555.field_2209 /* 95 */:
                int method_52217 = method_522();
                int method_52218 = method_522();
                method_506(method_52217);
                method_506(method_52218);
                return;
            case class_555.field_2181 /* 97 */:
            case 101:
            case class_555.field_2153 /* 105 */:
            case class_555.field_2082 /* 109 */:
            case class_555.field_2204 /* 113 */:
            case 127:
            case 129:
            case 131:
                method_514(4);
                method_506(field_282);
                method_506(4194304);
                return;
            case 99:
            case class_555.field_2198 /* 103 */:
            case class_555.field_2212 /* 107 */:
            case class_555.field_2177 /* 111 */:
            case 115:
                method_514(4);
                method_506(field_318);
                method_506(4194304);
                return;
            case class_555.field_2263 /* 121 */:
            case class_555.field_2084 /* 123 */:
            case class_555.field_2126 /* 125 */:
                method_514(3);
                method_506(field_282);
                method_506(4194304);
                return;
            case class_555.field_2267 /* 132 */:
                method_525(i2, field_312);
                return;
            case class_555.field_2256 /* 133 */:
            case class_555.field_2248 /* 140 */:
                method_514(1);
                method_506(field_282);
                method_506(4194304);
                return;
            case class_555.field_2133 /* 134 */:
                method_514(1);
                method_506(field_304);
                return;
            case class_555.field_2093 /* 135 */:
            case class_555.field_2113 /* 141 */:
                method_514(1);
                method_506(field_318);
                method_506(4194304);
                return;
            case class_555.field_2201 /* 139 */:
            case class_555.field_2249 /* 190 */:
            case class_555.field_2197 /* 193 */:
                method_514(1);
                method_506(field_312);
                return;
            case class_555.field_2137 /* 148 */:
            case class_555.field_2206 /* 151 */:
            case class_555.field_2117 /* 152 */:
                method_514(4);
                method_506(field_312);
                return;
            case class_555.field_2293 /* 168 */:
            case class_555.field_2174 /* 169 */:
                throw new IllegalArgumentException("JSR/RET are not supported with computeFrames option");
            case class_555.field_2078 /* 178 */:
                method_508(class_148Var, class_296Var.field_1051);
                return;
            case class_555.field_2141 /* 179 */:
                method_523(class_296Var.field_1051);
                return;
            case class_555.field_2211 /* 180 */:
                method_514(1);
                method_508(class_148Var, class_296Var.field_1051);
                return;
            case class_555.field_2186 /* 181 */:
                method_523(class_296Var.field_1051);
                method_522();
                return;
            case class_555.field_2147 /* 182 */:
            case class_555.field_2238 /* 183 */:
            case class_555.field_2314 /* 184 */:
            case class_555.field_2144 /* 185 */:
                method_523(class_296Var.field_1051);
                if (i != 184) {
                    int method_52219 = method_522();
                    if (i == 183 && class_296Var.field_1050.charAt(0) == '<') {
                        method_505(method_52219);
                    }
                }
                method_508(class_148Var, class_296Var.field_1051);
                return;
            case class_555.field_2178 /* 186 */:
                method_523(class_296Var.field_1051);
                method_508(class_148Var, class_296Var.field_1051);
                return;
            case class_555.field_2228 /* 187 */:
                method_506(12582912 | class_148Var.method_755(class_296Var.field_1051, i2));
                return;
            case class_555.field_2316 /* 188 */:
                method_522();
                switch (i2) {
                    case 4:
                        method_506(71303177);
                        return;
                    case 5:
                        method_506(71303179);
                        return;
                    case 6:
                        method_506(71303170);
                        return;
                    case 7:
                        method_506(71303171);
                        return;
                    case 8:
                        method_506(71303178);
                        return;
                    case 9:
                        method_506(71303180);
                        return;
                    case 10:
                        method_506(71303169);
                        return;
                    case 11:
                        method_506(71303172);
                        return;
                    default:
                        throw new IllegalArgumentException();
                }
            case class_555.field_2245 /* 189 */:
                String str = class_296Var.field_1051;
                method_522();
                if (str.charAt(0) == '[') {
                    method_508(class_148Var, method_519(str));
                    return;
                } else {
                    method_506(class_148Var.method_753(str) | 75497472);
                    return;
                }
            case class_555.field_2303 /* 192 */:
                String str2 = class_296Var.field_1051;
                method_522();
                if (str2.charAt(0) != '[') {
                    method_506(class_148Var.method_753(str2) | field_316);
                    return;
                } else {
                    method_508(class_148Var, str2);
                    return;
                }
            case class_555.field_2265 /* 197 */:
                method_514(i2);
                method_508(class_148Var, class_296Var.field_1051);
                return;
        }
    }

    public void method_505(int i) {
        if (this.field_319 == null) {
            this.field_319 = new int[2];
        }
        int length = this.field_319.length;
        if (this.field_323 >= length) {
            int[] iArr = new int[Math.max(this.field_323 + 1, length * 2)];
            System.arraycopy(this.field_319, 0, iArr, 0, length);
            this.field_319 = iArr;
        }
        int[] iArr2 = this.field_319;
        int i2 = this.field_323;
        this.field_323 = i2 + 1;
        iArr2[i2] = i;
    }

    public void method_523(String str) {
        char charAt = str.charAt(0);
        if (charAt == '(') {
            method_514((class_279.method_1230(str) >> 2) - 1);
        } else if (charAt != 'J' && charAt != 'D') {
            method_514(1);
        } else {
            method_514(2);
        }
    }

    public int method_524(int i, int i2) {
        int i3 = 4194304;
        int i4 = (-67108864) & i;
        int i5 = 62914560 & i;
        if (i5 != 20971520) {
            if (i5 != 25165824) {
                return i;
            }
            int i6 = i4 + this.field_274[i2 - (i & field_298)];
            if ((i & 1048576) == 0 || (i6 != 4194308 && i6 != 4194307)) {
                i3 = i6;
            }
            return i3;
        }
        int i7 = i4 + this.field_290[i & field_298];
        if ((i & 1048576) == 0) {
            return i7;
        }
        if (i7 == 4194308 || i7 == 4194307) {
            return 4194304;
        }
        return i7;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:40:0x00a0 */
    public final boolean method_529(class_148 class_148Var, class_77 class_77Var, int i) {
        boolean z;
        int i2;
        boolean z2 = true;
        int i3 = 0;
        int length = this.field_290.length;
        int length2 = this.field_274.length;
        if (class_77Var.field_290 == null) {
            class_77Var.field_290 = new int[length];
            z = true;
        } else {
            z = false;
        }
        int i4 = 0;
        boolean z3 = z;
        int i5 = 0;
        while (i4 < length) {
            if (this.field_306 == null || i5 >= this.field_306.length) {
                i2 = this.field_290[i5];
            } else {
                int i6 = this.field_306[i5];
                if (i6 != 0) {
                    i2 = method_524(i6, length2);
                } else {
                    i2 = this.field_290[i5];
                }
            }
            if (this.field_319 != null) {
                i2 = method_526(class_148Var, i2);
            }
            int i7 = i5 + 1;
            z3 |= method_507(class_148Var, i2, class_77Var.field_290, i5);
            i4 = i7;
            i5 = i7;
        }
        if (i <= 0) {
            int length3 = this.field_274.length + this.field_302;
            if (class_77Var.field_274 == null) {
                class_77Var.field_274 = new int[this.field_313 + length3];
            } else {
                z2 = z3;
            }
            int i8 = 0;
            int i9 = 0;
            boolean z4 = z2;
            while (i8 < length3) {
                int i10 = this.field_274[i9];
                if (this.field_319 != null) {
                    i10 = method_526(class_148Var, i10);
                }
                int i11 = i9 + 1;
                z4 |= method_507(class_148Var, i10, class_77Var.field_274, i9);
                i8 = i11;
                i9 = i11;
            }
            while (true) {
                int i12 = i3;
                if (i3 >= this.field_313) {
                    return z4;
                }
                int method_524 = method_524(this.field_317[i12], length2);
                if (this.field_319 != null) {
                    method_524 = method_526(class_148Var, method_524);
                }
                i3 = i12 + 1;
                z4 |= method_507(class_148Var, method_524, class_77Var.field_274, length3 + i12);
            }
        } else {
            int i13 = 0;
            boolean z5 = z3;
            int i14 = 0;
            while (i13 < length) {
                int i15 = i14 + 1;
                z5 |= method_507(class_148Var, this.field_290[i14], class_77Var.field_290, i14);
                i13 = i15;
                i14 = i15;
            }
            if (class_77Var.field_274 == null) {
                class_77Var.field_274 = new int[1];
            } else {
                z2 = z5;
            }
            return z2 | method_507(class_148Var, i, class_77Var.field_274, 0);
        }
    }

    public static boolean method_507(class_148 class_148Var, int i, int[] iArr, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = iArr[i2];
        if (i6 == i) {
            return false;
        }
        if ((67108863 & i) != 4194309) {
            i3 = i;
        } else {
            if (i6 == 4194309) {
                return false;
            }
            i3 = 4194309;
        }
        if (i6 != 0) {
            if ((i6 & (-67108864)) == 0 && (i6 & field_300) != 8388608) {
                if (i6 != 4194309) {
                    i4 = 4194304;
                    i5 = 4194304;
                } else {
                    if ((i3 & (-67108864)) == 0 && (i3 & field_300) != 8388608) {
                        i3 = 4194304;
                    }
                    i4 = i3;
                    i5 = i3;
                }
            } else {
                if (i3 == 4194309) {
                    return false;
                }
                if (((-4194304) & i3) != ((-4194304) & i6)) {
                    if ((i3 & (-67108864)) != 0 || (i3 & field_300) == 8388608) {
                        int i7 = i3 & (-67108864);
                        if (i7 != 0 && (i3 & field_300) != 8388608) {
                            i7 = (-67108864) + i7;
                        }
                        int i8 = i6 & (-67108864);
                        if (i8 != 0 && (i6 & field_300) != 8388608) {
                            i8 -= 67108864;
                        }
                        int min = Math.min(i7, i8) | field_316 | class_148Var.method_753("java/lang/Object");
                        i4 = min;
                        i5 = min;
                    } else {
                        i4 = 4194304;
                        i5 = 4194304;
                    }
                } else if ((i6 & field_300) != 8388608) {
                    int method_753 = ((i3 & (-67108864)) - 67108864) | field_316 | class_148Var.method_753("java/lang/Object");
                    i4 = method_753;
                    i5 = method_753;
                } else {
                    int method_735 = class_148Var.method_735(i3 & field_298, 1048575 & i6) | (i3 & (-67108864)) | field_316;
                    i4 = method_735;
                    i5 = method_735;
                }
            }
            if (i4 == i6) {
                return false;
            }
            iArr[i2] = i5;
            return true;
        }
        iArr[i2] = i3;
        return true;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:14:0x0055 */
    public static void method_528(class_148 class_148Var, int i, class_258 class_258Var) {
        int i2 = ((-67108864) & i) >> 26;
        if (i2 != 0) {
            StringBuilder sb = new StringBuilder();
            while (true) {
                int i3 = i2;
                i2--;
                if (i3 <= 0) {
                    break;
                } else {
                    sb.append('[');
                }
            }
            if ((i & field_300) == 8388608) {
                sb.append('L').append(class_148Var.method_704(i & field_298).field_1051).append(';');
            } else {
                switch (i & field_298) {
                    case 1:
                        sb.append('I');
                        break;
                    case 2:
                        sb.append('F');
                        break;
                    case 3:
                        sb.append('D');
                        break;
                    case 4:
                        sb.append('J');
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    default:
                        throw new AssertionError();
                    case 9:
                        sb.append('Z');
                        break;
                    case 10:
                        sb.append('B');
                        break;
                    case 11:
                        sb.append('C');
                        break;
                    case 12:
                        sb.append('S');
                        break;
                }
            }
            class_258Var.method_1132(7).method_1138(class_148Var.method_752(sb.toString()).field_1053);
            return;
        }
        int i4 = i & field_298;
        switch (i & field_300) {
            case 4194304:
                class_258Var.method_1132(i4);
                return;
            case field_316 /* 8388608 */:
                class_258Var.method_1132(7).method_1138(class_148Var.method_752(class_148Var.method_704(i4).field_1051).field_1053);
                return;
            case field_269 /* 12582912 */:
                class_258Var.method_1132(8).method_1138((int) class_148Var.method_704(i4).field_1048);
                return;
            case field_324 /* 16777216 */:
                class_258Var.method_1132(8);
                class_148Var.method_745(i4).method_1092(class_258Var);
                return;
            default:
                throw new AssertionError();
        }
    }

    public final void method_515(class_469 class_469Var) {
        int[] iArr = this.field_290;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            i3 += (i4 == 4194308 || i4 == 4194307) ? 2 : 1;
            if (i4 == 4194304) {
                i2++;
            } else {
                i += i2 + 1;
                i2 = 0;
            }
        }
        int[] iArr2 = this.field_274;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < iArr2.length) {
            int i8 = iArr2[i7];
            int i9 = i7 + ((i8 == 4194308 || i8 == 4194307) ? 2 : 1);
            i6++;
            i5 = i9;
            i7 = i9;
        }
        int method_1759 = class_469Var.method_1759(this.field_311.field_870, i, i6);
        int i10 = i;
        int i11 = i;
        int i12 = 0;
        while (true) {
            int i13 = i11 - 1;
            if (i10 <= 0) {
                break;
            }
            int i14 = iArr[i12];
            int i15 = (i14 == 4194308 || i14 == 4194307) ? 2 : 1;
            class_469Var.method_1770(method_1759, i14);
            method_1759++;
            i10 = i13;
            i11 = i13;
            i12 = i15 + i12;
        }
        int i16 = i6;
        int i17 = i6;
        int i18 = 0;
        while (true) {
            int i19 = i17 - 1;
            if (i16 <= 0) {
                class_469Var.method_1762();
                return;
            }
            int i20 = iArr2[i18];
            i18 += (i20 == 4194308 || i20 == 4194307) ? 2 : 1;
            class_469Var.method_1770(method_1759, i20);
            i16 = i19;
            method_1759++;
            i17 = i19;
        }
    }
}
