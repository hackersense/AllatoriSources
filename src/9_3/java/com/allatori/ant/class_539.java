package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.commons.ASMStuffs;
import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.unmapped.class_290;
import com.allatori.interfaces.unmapped.class_445;
import com.allatori.interfaces.unmapped.class_555;
import com.allatori.interfaces.unmapped.class_93;

import java.io.DataOutputStream;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_539 implements Cloneable, Serializable {
    public static class_290 field_2015 = class_290.field_1032;
    public short field_2013;
    public short field_2014;

    public abstract void method_0(class_445 class_445Var);

    public class_539(short s, short s2) {
        this.field_2013 = (short) 1;
        this.field_2014 = (short) -1;
        this.field_2013 = s2;
        this.field_2014 = s;
    }

    public class_539() {
        this.field_2013 = (short) 1;
        this.field_2014 = (short) -1;
    }

    public String method_406(boolean z) {
        return z ? new StringBuilder().insert(0, method_198()).append("[").append((int) this.field_2014).append("](").append((int) this.field_2013).append(")").toString() : method_198();
    }

    public void method_200(class_346 class_346Var, boolean z) {
    }

    public void method_184(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.field_2014);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final class_539 method_1903(class_346 class_346Var) {
        boolean z;
        class_539 class_333Var;
        short readUnsignedByte = (short) class_346Var.readUnsignedByte();
        if (readUnsignedByte == 196) {
            z = true;
            readUnsignedByte = (short) class_346Var.readUnsignedByte();
        } else {
            z = false;
        }
        if (class_93.field_465[readUnsignedByte] != null) {
            return class_93.field_465[readUnsignedByte];
        }
        try {
            switch (readUnsignedByte) {
                case 0:
                    class_333Var = new class_109();
                    break;
                case 1:
                    class_333Var = new class_467();
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    class_333Var = new class_94();
                    break;
                case 9:
                case 10:
                    class_333Var = new class_60();
                    break;
                case 11:
                case 12:
                case class_555.field_2278 /* 13 */:
                    class_333Var = new class_249();
                    break;
                case class_555.field_2199 /* 14 */:
                case 15:
                    class_333Var = new class_114();
                    break;
                case 16:
                    class_333Var = new class_281();
                    break;
                case 17:
                    class_333Var = new class_69();
                    break;
                case 18:
                    class_333Var = new class_489();
                    break;
                case 19:
                    class_333Var = new class_49();
                    break;
                case 20:
                    class_333Var = new class_274();
                    break;
                case 21:
                    class_333Var = new class_390();
                    break;
                case 22:
                    class_333Var = new class_133();
                    break;
                case 23:
                    class_333Var = new class_507();
                    break;
                case class_555.field_2101 /* 24 */:
                    class_333Var = new class_391();
                    break;
                case class_555.field_2318 /* 25 */:
                    class_333Var = new class_519();
                    break;
                case 26:
                case ASMStuffs.field_157 /* 27 */:
                case ASMStuffs.field_156 /* 28 */:
                case ASMStuffs.field_160 /* 29 */:
                    class_333Var = new class_390();
                    break;
                case ASMStuffs.field_162 /* 30 */:
                case ASMStuffs.field_84 /* 31 */:
                case 32:
                case 33:
                    class_333Var = new class_133();
                    break;
                case ASMStuffs.field_138 /* 34 */:
                case ASMStuffs.field_122 /* 35 */:
                case ASMStuffs.field_80 /* 36 */:
                case ASMStuffs.field_170 /* 37 */:
                    class_333Var = new class_507();
                    break;
                case ASMStuffs.field_163 /* 38 */:
                case ASMStuffs.field_87 /* 39 */:
                case ASMStuffs.field_104 /* 40 */:
                case ASMStuffs.field_149 /* 41 */:
                    class_333Var = new class_391();
                    break;
                case ASMStuffs.field_147 /* 42 */:
                case ASMStuffs.field_161 /* 43 */:
                case ASMStuffs.field_167 /* 44 */:
                case ASMStuffs.field_175 /* 45 */:
                    class_333Var = new class_519();
                    break;
                case 46:
                    class_333Var = new class_13();
                    break;
                case 47:
                    class_333Var = new class_357();
                    break;
                case 48:
                    class_333Var = new class_10();
                    break;
                case 49:
                    class_333Var = new class_185();
                    break;
                case 50:
                    class_333Var = new class_86();
                    break;
                case 51:
                    class_333Var = new class_504();
                    break;
                case 52:
                    class_333Var = new class_361();
                    break;
                case 53:
                    class_333Var = new class_16();
                    break;
                case 54:
                    class_333Var = new class_551();
                    break;
                case 55:
                    class_333Var = new class_126();
                    break;
                case 56:
                    class_333Var = new class_564();
                    break;
                case 57:
                    class_333Var = new class_29();
                    break;
                case 58:
                    class_333Var = new class_196();
                    break;
                case 59:
                case 60:
                case 61:
                case 62:
                    class_333Var = new class_551();
                    break;
                case 63:
                case 64:
                case 65:
                case 66:
                    class_333Var = new class_126();
                    break;
                case 67:
                case 68:
                case 69:
                case 70:
                    class_333Var = new class_564();
                    break;
                case 71:
                case 72:
                case 73:
                case 74:
                    class_333Var = new class_29();
                    break;
                case 75:
                case ASMStuffs.field_86 /* 76 */:
                case ASMStuffs.field_126 /* 77 */:
                case ASMStuffs.field_111 /* 78 */:
                    class_333Var = new class_196();
                    break;
                case class_555.field_2159 /* 79 */:
                    class_333Var = new class_399();
                    break;
                case class_555.field_2255 /* 80 */:
                    class_333Var = new class_1();
                    break;
                case class_555.field_2096 /* 81 */:
                    class_333Var = new class_575();
                    break;
                case class_555.field_2288 /* 82 */:
                    class_333Var = new class_55();
                    break;
                case 83:
                    class_333Var = new class_328();
                    break;
                case class_555.field_2183 /* 84 */:
                    class_333Var = new class_435();
                    break;
                case class_555.field_2313 /* 85 */:
                    class_333Var = new class_64();
                    break;
                case class_555.field_2226 /* 86 */:
                    class_333Var = new class_197();
                    break;
                case class_555.field_2192 /* 87 */:
                    class_333Var = new class_87();
                    break;
                case class_555.field_2274 /* 88 */:
                    class_333Var = new class_578();
                    break;
                case class_555.field_2188 /* 89 */:
                    class_333Var = new class_376();
                    break;
                case 90:
                    class_333Var = new class_209();
                    break;
                case 91:
                    class_333Var = new class_464();
                    break;
                case class_555.field_2090 /* 92 */:
                    class_333Var = new class_218();
                    break;
                case class_555.field_2280 /* 93 */:
                    class_333Var = new class_132();
                    break;
                case class_555.field_2242 /* 94 */:
                    class_333Var = new class_39();
                    break;
                case class_555.field_2209 /* 95 */:
                    class_333Var = new class_200();
                    break;
                case class_555.field_2194 /* 96 */:
                    class_333Var = new class_404();
                    break;
                case class_555.field_2181 /* 97 */:
                    class_333Var = new class_593();
                    break;
                case class_555.field_2203 /* 98 */:
                    class_333Var = new class_379();
                    break;
                case 99:
                    class_333Var = new class_244();
                    break;
                case 100:
                    class_333Var = new class_586();
                    break;
                case 101:
                    class_333Var = new class_76();
                    break;
                case class_555.field_2081 /* 102 */:
                    class_333Var = new class_517();
                    break;
                case class_555.field_2198 /* 103 */:
                    class_333Var = new class_369();
                    break;
                case class_555.field_2146 /* 104 */:
                    class_333Var = new class_590();
                    break;
                case class_555.field_2153 /* 105 */:
                    class_333Var = new class_50();
                    break;
                case class_555.field_2233 /* 106 */:
                    class_333Var = new class_222();
                    break;
                case class_555.field_2212 /* 107 */:
                    class_333Var = new class_535();
                    break;
                case class_555.field_2250 /* 108 */:
                    class_333Var = new class_165();
                    break;
                case class_555.field_2082 /* 109 */:
                    class_333Var = new class_322();
                    break;
                case class_555.field_2151 /* 110 */:
                    class_333Var = new class_550();
                    break;
                case class_555.field_2177 /* 111 */:
                    class_333Var = new class_223();
                    break;
                case class_555.field_2317 /* 112 */:
                    class_333Var = new class_44();
                    break;
                case class_555.field_2204 /* 113 */:
                    class_333Var = new class_134();
                    break;
                case class_555.field_2213 /* 114 */:
                    class_333Var = new class_582();
                    break;
                case 115:
                    class_333Var = new class_199();
                    break;
                case class_555.field_2230 /* 116 */:
                    class_333Var = new class_516();
                    break;
                case class_555.field_2296 /* 117 */:
                    class_333Var = new class_339();
                    break;
                case class_555.field_2294 /* 118 */:
                    class_333Var = new class_482();
                    break;
                case class_555.field_2139 /* 119 */:
                    class_333Var = new class_402();
                    break;
                case class_555.field_2152 /* 120 */:
                    class_333Var = new class_90();
                    break;
                case class_555.field_2263 /* 121 */:
                    class_333Var = new class_480();
                    break;
                case class_555.field_2107 /* 122 */:
                    class_333Var = new class_105();
                    break;
                case class_555.field_2084 /* 123 */:
                    class_333Var = new class_63();
                    break;
                case class_555.field_2195 /* 124 */:
                    class_333Var = new class_79();
                    break;
                case class_555.field_2126 /* 125 */:
                    class_333Var = new class_107();
                    break;
                case class_555.field_2236 /* 126 */:
                    class_333Var = new class_528();
                    break;
                case 127:
                    class_333Var = new class_183();
                    break;
                case 128:
                    class_333Var = new class_486();
                    break;
                case 129:
                    class_333Var = new class_556();
                    break;
                case 130:
                    class_333Var = new class_246();
                    break;
                case 131:
                    class_333Var = new class_5();
                    break;
                case class_555.field_2267 /* 132 */:
                    class_333Var = new class_67();
                    break;
                case class_555.field_2256 /* 133 */:
                    class_333Var = new class_251();
                    break;
                case class_555.field_2133 /* 134 */:
                    class_333Var = new class_345();
                    break;
                case class_555.field_2093 /* 135 */:
                    class_333Var = new class_266();
                    break;
                case class_555.field_2120 /* 136 */:
                    class_333Var = new class_7();
                    break;
                case class_555.field_2234 /* 137 */:
                    class_333Var = new class_95();
                    break;
                case class_555.field_2286 /* 138 */:
                    class_333Var = new class_496();
                    break;
                case class_555.field_2201 /* 139 */:
                    class_333Var = new class_227();
                    break;
                case class_555.field_2248 /* 140 */:
                    class_333Var = new class_32();
                    break;
                case class_555.field_2113 /* 141 */:
                    class_333Var = new class_384();
                    break;
                case class_555.field_2079 /* 142 */:
                    class_333Var = new class_397();
                    break;
                case class_555.field_2268 /* 143 */:
                    class_333Var = new class_523();
                    break;
                case class_555.field_2129 /* 144 */:
                    class_333Var = new class_479();
                    break;
                case class_555.field_2098 /* 145 */:
                    class_333Var = new class_254();
                    break;
                case class_555.field_2172 /* 146 */:
                    class_333Var = new class_167();
                    break;
                case class_555.field_2275 /* 147 */:
                    class_333Var = new class_20();
                    break;
                case class_555.field_2137 /* 148 */:
                    class_333Var = new class_329();
                    break;
                case class_555.field_2220 /* 149 */:
                    class_333Var = new class_12();
                    break;
                case class_555.field_2301 /* 150 */:
                    class_333Var = new class_256();
                    break;
                case class_555.field_2206 /* 151 */:
                    class_333Var = new class_41();
                    break;
                case class_555.field_2117 /* 152 */:
                    class_333Var = new class_259();
                    break;
                case class_555.field_2304 /* 153 */:
                    class_333Var = new class_471();
                    break;
                case class_555.field_2215 /* 154 */:
                    class_333Var = new class_245();
                    break;
                case class_555.field_2244 /* 155 */:
                    class_333Var = new class_106();
                    break;
                case class_555.field_2077 /* 156 */:
                    class_333Var = new class_481();
                    break;
                case class_555.field_2251 /* 157 */:
                    class_333Var = new class_335();
                    break;
                case class_555.field_2179 /* 158 */:
                    class_333Var = new class_342();
                    break;
                case class_555.field_2287 /* 159 */:
                    class_333Var = new class_294();
                    break;
                case class_555.field_2273 /* 160 */:
                    class_333Var = new class_178();
                    break;
                case class_555.field_2099 /* 161 */:
                    class_333Var = new class_192();
                    break;
                case class_555.field_2097 /* 162 */:
                    class_333Var = new class_174();
                    break;
                case class_555.field_2130 /* 163 */:
                    class_333Var = new class_201();
                    break;
                case class_555.field_2227 /* 164 */:
                    class_333Var = new class_466();
                    break;
                case class_555.field_2136 /* 165 */:
                    class_333Var = new class_9();
                    break;
                case class_555.field_2243 /* 166 */:
                    class_333Var = new class_152();
                    break;
                case class_555.field_2270 /* 167 */:
                    class_333Var = new class_292();
                    break;
                case class_555.field_2293 /* 168 */:
                    class_333Var = new class_375();
                    break;
                case class_555.field_2174 /* 169 */:
                    class_333Var = new class_398();
                    break;
                case class_555.field_2148 /* 170 */:
                    class_333Var = new class_117();
                    break;
                case class_555.field_2131 /* 171 */:
                    class_333Var = new class_427();
                    break;
                case class_555.field_2132 /* 172 */:
                    class_333Var = new class_602();
                    break;
                case class_555.field_2196 /* 173 */:
                    class_333Var = new class_0();
                    break;
                case class_555.field_2135 /* 174 */:
                    class_333Var = new class_51();
                    break;
                case class_555.field_2221 /* 175 */:
                    class_333Var = new class_295();
                    break;
                case class_555.field_2161 /* 176 */:
                    class_333Var = new class_264();
                    break;
                case class_555.field_2150 /* 177 */:
                    class_333Var = new class_537();
                    break;
                case class_555.field_2078 /* 178 */:
                    class_333Var = new class_562();
                    break;
                case class_555.field_2141 /* 179 */:
                    class_333Var = new class_289();
                    break;
                case class_555.field_2211 /* 180 */:
                    class_333Var = new class_501();
                    break;
                case class_555.field_2186 /* 181 */:
                    class_333Var = new class_428();
                    break;
                case class_555.field_2147 /* 182 */:
                    class_333Var = new class_203();
                    break;
                case class_555.field_2238 /* 183 */:
                    class_333Var = new class_219();
                    break;
                case class_555.field_2314 /* 184 */:
                    class_333Var = new class_161();
                    break;
                case class_555.field_2144 /* 185 */:
                    class_333Var = new class_483();
                    break;
                case class_555.field_2178 /* 186 */:
                    class_333Var = new class_336();
                    break;
                case class_555.field_2228 /* 187 */:
                    class_333Var = new class_343();
                    break;
                case class_555.field_2316 /* 188 */:
                    class_333Var = new class_413();
                    break;
                case class_555.field_2245 /* 189 */:
                    class_333Var = new class_18();
                    break;
                case class_555.field_2249 /* 190 */:
                    class_333Var = new class_541();
                    break;
                case class_555.field_2262 /* 191 */:
                    class_333Var = new class_115();
                    break;
                case class_555.field_2303 /* 192 */:
                    class_333Var = new class_605();
                    break;
                case class_555.field_2197 /* 193 */:
                    class_333Var = new class_447();
                    break;
                case class_555.field_2165 /* 194 */:
                    class_333Var = new class_140();
                    break;
                case class_555.field_2282 /* 195 */:
                    class_333Var = new class_28();
                    break;
                case ASMStuffs.field_79 /* 196 */:
                default:
                    throw new class_151("Illegal opcode detected");
                case class_555.field_2265 /* 197 */:
                    class_333Var = new class_300();
                    break;
                case class_555.field_2182 /* 198 */:
                    class_333Var = new class_147();
                    break;
                case class_555.field_2102 /* 199 */:
                    class_333Var = new class_355();
                    break;
                case ASMStuffs.field_150 /* 200 */:
                    class_333Var = new class_432();
                    break;
                case ASMStuffs.field_153 /* 201 */:
                    class_333Var = new class_333();
                    break;
            }
            if (z && !(class_333Var instanceof class_508) && !(class_333Var instanceof class_67) && !(class_333Var instanceof class_398)) {
                throw new class_151(new StringBuilder().insert(0, "Illegal opcode after wide: ").append((int) readUnsignedByte).toString());
            }
            class_333Var.method_858(readUnsignedByte);
            class_333Var.method_200(class_346Var, z);
            return class_333Var;
        } catch (class_151 e) {
            throw e;
        } catch (Exception e2) {
            throw new class_151(e2.toString());
        }
    }

    public String method_189(class_499 class_499Var) {
        return method_406(false);
    }

    public class_539 method_1038() {
        if (class_93.field_465[method_1904()] == null) {
            try {
                return (class_539) clone();
            } catch (CloneNotSupportedException e) {
                System.err.println(e);
                return null;
            }
        }
        return this;
    }

    public String method_198() {
        return ASMInterface.field_1554[this.field_2014];
    }

    public static class_290 method_1902() {
        return field_2015;
    }

    public static void method_1900(class_290 class_290Var) {
        field_2015 = class_290Var;
    }

    public short method_1904() {
        return this.field_2014;
    }

    public void method_858(short s) {
        this.field_2014 = s;
    }

    public void method_97() {
    }

    public int method_433() {
        return this.field_2013;
    }

    public static final String method_1901(short s) {
        String upperCase = ASMInterface.field_1554[s].toUpperCase(Locale.ENGLISH);
        try {
            int length = upperCase.length();
            char charAt = upperCase.charAt(length - 2);
            char charAt2 = upperCase.charAt(length - 1);
            if (charAt == '_' && charAt2 >= '0' && charAt2 <= '5') {
                upperCase = upperCase.substring(0, length - 2);
            }
            if (upperCase.equals("ICONST_M1")) {
                upperCase = "ICONST";
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println(e);
        }
        return new StringBuilder().insert(0, "org.apache.bcel.generic.").append(upperCase).toString();
    }

    public int method_1387(class_208 class_208Var) {
        return ASMInterface.field_1478[this.field_2014];
    }

    public boolean equals(Object obj) {
        if (obj instanceof class_539) {
            return field_2015.method_1289(this, (class_539) obj);
        }
        return false;
    }

    public int method_896(class_208 class_208Var) {
        return ASMInterface.field_1287[this.field_2014];
    }
}
