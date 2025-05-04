package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.commons.ASMStuffs;
import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.unmapped.class_555;
import com.allatori.interfaces.unmapped.class_93;

import java.io.Serializable;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_563 implements class_93, Serializable {
    public class_202 field_2322;
    public class_208 field_2325;
    public static final String[] field_2324 = {"C", "F", "D", "B", "S", "I", "L"};
    public static class_349[] field_2323 = {new class_349("java.lang.StringBuffer", "append", class_212.field_797, new class_212[]{class_212.field_799}, 1), new class_349("java.lang.StringBuffer", "append", class_212.field_797, new class_212[]{class_212.field_808}, 1), null, null, new class_349("java.lang.StringBuffer", "append", class_212.field_797, new class_212[]{class_212.field_813}, 1), new class_349("java.lang.StringBuffer", "append", class_212.field_797, new class_212[]{class_212.field_806}, 1), new class_349("java.lang.StringBuffer", "append", class_212.field_797, new class_212[]{class_212.field_812}, 1), new class_349("java.lang.StringBuffer", "append", class_212.field_797, new class_212[]{class_212.field_810}, 1), new class_349("java.lang.StringBuffer", "append", class_212.field_797, new class_212[]{class_212.field_802}, 1), new class_349("java.lang.StringBuffer", "append", class_212.field_797, new class_212[]{class_212.field_802}, 1), new class_349("java.lang.StringBuffer", "append", class_212.field_797, new class_212[]{class_212.field_802}, 1), new class_349("java.lang.StringBuffer", "append", class_212.field_797, new class_212[]{class_212.field_798}, 1)};

    public class_289 method_1995(String str, String str2, class_212 class_212Var) {
        return new class_289(this.field_2325.method_1009(str, str2, class_212Var.method_198()));
    }

    public static class_561 method_1977(class_212 class_212Var) {
        switch (class_212Var.method_619()) {
            case 4:
            case 8:
                return IiIiIIiiii;
            case 5:
                return IIiiIIiIii;
            case 6:
                return IIIIiIIIii;
            case 7:
                return iIiIIiiiiI;
            case 9:
                return IiiiIIiIiI;
            case 10:
                return iiiIIiIiIi;
            case 11:
                return iIiIiIIIII;
            case 12:
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "Invalid type ").append(class_212Var).toString());
            case class_555.field_2278 /* 13 */:
            case class_555.field_2199 /* 14 */:
                return iIIiIiiiii;
        }
    }

    public class_539 method_1986(class_212 class_212Var, class_212 class_212Var2) {
        if ((class_212Var instanceof class_331) && (class_212Var2 instanceof class_331)) {
            byte method_619 = class_212Var2.method_619();
            byte method_6192 = class_212Var.method_619();
            if (method_619 == 11 && (method_6192 == 5 || method_6192 == 8 || method_6192 == 9)) {
                method_6192 = 10;
            }
            String sb = new StringBuilder().insert(0, "org.apache.bcel.generic.").append(field_2324[method_6192 - 5]).append("2").append(field_2324[method_619 - 5]).toString();
            try {
                return (class_539) Class.forName(sb).newInstance();
            } catch (Exception e) {
                throw new RuntimeException(new StringBuilder().insert(0, "Could not find instruction: ").append(sb).toString());
            }
        }
        if ((class_212Var instanceof class_592) && (class_212Var2 instanceof class_592)) {
            if (!(class_212Var2 instanceof class_594)) {
                return new class_605(this.field_2325.method_1007(((class_392) class_212Var2).method_464()));
            }
            return new class_605(this.field_2325.method_1000((class_594) class_212Var2));
        }
        throw new RuntimeException(new StringBuilder().insert(0, "Can not cast ").append(class_212Var).append(" to ").append(class_212Var2).toString());
    }

    public class_563(class_202 class_202Var) {
        this(class_202Var, class_202Var.method_917());
    }

    public static class_508 method_1984(class_212 class_212Var, int i) {
        switch (class_212Var.method_619()) {
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
                return new class_390(i);
            case 6:
                return new class_507(i);
            case 7:
                return new class_391(i);
            case 11:
                return new class_133(i);
            case 12:
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "Invalid type ").append(class_212Var).toString());
            case class_555.field_2278 /* 13 */:
            case class_555.field_2199 /* 14 */:
                return new class_519(i);
        }
    }

    public static class_288 method_1978(class_212 class_212Var) {
        switch (class_212Var.method_619()) {
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
                return IiIIIIIIII;
            case 6:
                return IIIIIiiiIi;
            case 7:
                return IiiIIiiIii;
            case 11:
                return iIIIIIiIiI;
            case 12:
                return IIiiiiiIii;
            case class_555.field_2278 /* 13 */:
            case class_555.field_2199 /* 14 */:
                return iiIiIIiIii;
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "Invalid type: ").append(class_212Var).toString());
        }
    }

    public static class_508 method_1972(class_212 class_212Var, int i) {
        switch (class_212Var.method_619()) {
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
                return new class_551(i);
            case 6:
                return new class_564(i);
            case 7:
                return new class_29(i);
            case 11:
                return new class_126(i);
            case 12:
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "Invalid type ").append(class_212Var).toString());
            case class_555.field_2278 /* 13 */:
            case class_555.field_2199 /* 14 */:
                return new class_196(i);
        }
    }

    public static final boolean method_1987(class_212 class_212Var) {
        return (class_212Var instanceof class_392) && ((class_392) class_212Var).method_464().equals("java.lang.String");
    }

    public class_563(class_208 class_208Var) {
        this(null, class_208Var);
    }

    public class_70 method_1990(String str) {
        class_70 class_70Var = new class_70();
        int method_1009 = this.field_2325.method_1009("java.lang.System", "out", "Ljava/io/PrintStream;");
        int method_992 = this.field_2325.method_992("java.io.PrintStream", "println", "(Ljava/lang/String;)V");
        class_70Var.method_409(new class_562(method_1009));
        class_70Var.method_410(new class_302(this.field_2325, str));
        class_70Var.method_409(new class_203(method_992));
        return class_70Var;
    }

    public class_563(class_202 class_202Var, class_208 class_208Var) {
        this.field_2322 = class_202Var;
        this.field_2325 = class_208Var;
    }

    public static class_71 method_1975(int i) {
        return i == 2 ? IIiiIIIIIi : IiiIiiiiII;
    }

    public class_562 method_1993(String str, String str2, class_212 class_212Var) {
        return new class_562(this.field_2325.method_1009(str, str2, class_212Var.method_198()));
    }

    public static class_71 method_1971(int i) {
        return i == 2 ? iiiIiiIIIi : iIiiiIIIii;
    }

    public static class_71 method_1992(int i) {
        return i == 2 ? iiIIiIIiIi : IIIiiiIiii;
    }

    public class_459 method_1980(String str, String str2, class_212 class_212Var, class_212[] class_212VarArr, short s) {
        int method_992;
        short s2;
        String method_1032 = class_212.method_1032(class_212Var, class_212VarArr);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < class_212VarArr.length) {
            int i4 = i2 + 1;
            i3 += class_212VarArr[i2].method_47();
            i = i4;
            i2 = i4;
        }
        if (s != 185) {
            method_992 = this.field_2325.method_992(str, str2, method_1032);
            s2 = s;
        } else {
            method_992 = this.field_2325.method_999(str, str2, method_1032);
            s2 = s;
        }
        switch (s2) {
            case class_555.field_2147 /* 182 */:
                return new class_203(method_992);
            case class_555.field_2238 /* 183 */:
                return new class_219(method_992);
            case class_555.field_2314 /* 184 */:
                return new class_161(method_992);
            case class_555.field_2144 /* 185 */:
                return new class_483(method_992, i3 + 1);
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "Oops: Unknown invoke kind:").append((int) s).toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static class_561 method_1973(class_212 class_212Var) {
        switch (class_212Var.method_619()) {
            case 4:
            case 8:
                return IiIIIiiIII;
            case 5:
                return THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE;
            case 6:
                return iIiiIiiIii;
            case 7:
                return IIiIIIIiii;
            case 9:
                return iiIIIiIIii;
            case 10:
                return IIiiiIIiii;
            case 11:
                return IIiiIIiIII;
            case 12:
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "Invalid type ").append(class_212Var).toString());
            case class_555.field_2278 /* 13 */:
            case class_555.field_2199 /* 14 */:
                return iIiIiiiiIi;
        }
    }

    public static class_71 method_2002(int i) {
        return i == 2 ? iIiiIiIIIi : iiIiIiIIiI;
    }

    public static class_385 method_1996(String str, class_212 class_212Var) {
        char c = str.toCharArray()[0];
        switch (class_212Var.method_619()) {
            case 5:
            case 8:
            case 9:
            case 10:
                return method_1988(c, str);
            case 6:
                return method_1989(c);
            case 7:
                return method_2003(c);
            case 11:
                return method_1985(c, str);
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "Invalid type ").append(class_212Var).toString());
        }
    }

    public class_459 method_1994(class_349 class_349Var, short s) {
        return method_1980(class_349Var.field_1135, class_349Var.field_1133, class_349Var.field_1136, class_349Var.field_1132, s);
    }

    public static final class_385 method_1988(char c, String str) {
        switch (c) {
            case ASMStuffs.field_170 /* 37 */:
                return iiIiiIIIii;
            case ASMStuffs.field_163 /* 38 */:
                return iIiIIIiIII;
            case ASMStuffs.field_147 /* 42 */:
                return iIIiIiIiIi;
            case ASMStuffs.field_161 /* 43 */:
                return iIiIiIIiII;
            case ASMStuffs.field_175 /* 45 */:
                return iIIIiIIIiI;
            case '/':
                return iiiIIIiIiI;
            case '<':
                return iiiiIIIIII;
            case '>':
                return str.equals(">>>") ? IiIiiIiiIi : IiiIiIiiII;
            case class_555.field_2242 /* 94 */:
                return IiiiiIIiIi;
            case class_555.field_2195 /* 124 */:
                return IIIiiIIIII;
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "Invalid operand ").append(str).toString());
        }
    }

    public static class_539 method_1038() {
        return new class_519(0);
    }

    public class_539 method_1999(class_212 class_212Var) {
        byte method_619 = class_212Var.method_619();
        if (!method_1987(class_212Var)) {
            switch (method_619) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    return method_1994(field_2323[method_619], ASMInterface.field_1312);
                case 12:
                default:
                    throw new RuntimeException(new StringBuilder().insert(0, "Oops: No append for this type? ").append(class_212Var).toString());
                case class_555.field_2278 /* 13 */:
                case class_555.field_2199 /* 14 */:
                    return method_1994(field_2323[1], ASMInterface.field_1312);
            }
        }
        return method_1994(field_2323[0], ASMInterface.field_1312);
    }

    public static final class_385 method_1985(char c, String str) {
        switch (c) {
            case ASMStuffs.field_170 /* 37 */:
                return iiiiIiiiiI;
            case ASMStuffs.field_163 /* 38 */:
                return iiIiiiiIII;
            case ASMStuffs.field_147 /* 42 */:
                return iiiiiiiIII;
            case ASMStuffs.field_161 /* 43 */:
                return iIIiiIiiIi;
            case ASMStuffs.field_175 /* 45 */:
                return iIIiiiIiIi;
            case '/':
                return IIIIiiiIIi;
            case '<':
                return iIiIIIiIii;
            case '>':
                return str.equals(">>>") ? IIiiiIIiII : IiIIiIIIIi;
            case class_555.field_2242 /* 94 */:
                return IiiIIiIIII;
            case class_555.field_2195 /* 124 */:
                return IIiIIiIIii;
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "Invalid operand ").append(str).toString());
        }
    }

    public class_501 method_1982(String str, String str2, class_212 class_212Var) {
        return new class_501(this.field_2325.method_1009(str, str2, class_212Var.method_198()));
    }

    public class_605 method_1976(class_592 class_592Var) {
        return class_592Var instanceof class_594 ? new class_605(this.field_2325.method_1000((class_594) class_592Var)) : new class_605(this.field_2325.method_987((class_392) class_592Var));
    }

    public class_428 method_2000(String str, String str2, class_212 class_212Var) {
        return new class_428(this.field_2325.method_1009(str, str2, class_212Var.method_198()));
    }

    public class_239 method_1991(String str, String str2, class_212 class_212Var, short s) {
        int method_1009 = this.field_2325.method_1009(str, str2, class_212Var.method_198());
        switch (s) {
            case class_555.field_2078 /* 178 */:
                return new class_562(method_1009);
            case class_555.field_2141 /* 179 */:
                return new class_289(method_1009);
            case class_555.field_2211 /* 180 */:
                return new class_501(method_1009);
            case class_555.field_2186 /* 181 */:
                return new class_428(method_1009);
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "Oops: Unknown getfield kind:").append((int) s).toString());
        }
    }

    public static final class_385 method_2003(char c) {
        switch (c) {
            case ASMStuffs.field_147 /* 42 */:
                return iIIiiiiIIi;
            case ASMStuffs.field_161 /* 43 */:
                return iIIiIiiIII;
            case ASMStuffs.field_167 /* 44 */:
            case '.':
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "Invalid operand ").append(c).toString());
            case ASMStuffs.field_175 /* 45 */:
                return IIIiIIiIIi;
            case '/':
                return IIiIiIiIIi;
        }
    }

    public class_539 method_1997(Object obj) {
        class_302 class_302Var;
        if (!(obj instanceof Number)) {
            if (!(obj instanceof String)) {
                if (obj instanceof Boolean) {
                    class_302Var = new class_302(this.field_2325, (Boolean) obj);
                } else {
                    if (!(obj instanceof Character)) {
                        throw new class_151(new StringBuilder().insert(0, "Illegal type: ").append(obj.getClass()).toString());
                    }
                    class_302Var = new class_302(this.field_2325, (Character) obj);
                }
            } else {
                class_302Var = new class_302(this.field_2325, (String) obj);
            }
        } else {
            class_302Var = new class_302(this.field_2325, (Number) obj);
        }
        return class_302Var.method_1038();
    }

    public static final class_385 method_1989(char c) {
        switch (c) {
            case ASMStuffs.field_147 /* 42 */:
                return IiiiiIiIii;
            case ASMStuffs.field_161 /* 43 */:
                return iiiIIiiiIi;
            case ASMStuffs.field_167 /* 44 */:
            case '.':
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "Invalid operand ").append(c).toString());
            case ASMStuffs.field_175 /* 45 */:
                return iiiiIiIIII;
            case '/':
                return iiiIiIIiII;
        }
    }

    public void method_919(class_208 class_208Var) {
        this.field_2325 = class_208Var;
    }

    public class_208 method_917() {
        return this.field_2325;
    }

    public static class_539 method_2001(class_212 class_212Var) {
        switch (class_212Var.method_619()) {
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
                return IiiIIIIiiI;
            case 6:
                return IiiIIIiIiI;
            case 7:
                return IiiIIiIIIi;
            case 11:
                return iIiiIiiIII;
            case 12:
                return iIiiIIIiii;
            case class_555.field_2278 /* 13 */:
            case class_555.field_2199 /* 14 */:
                return iiiIiiIIii;
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "Invalid type: ").append(class_212Var).toString());
        }
    }

    public class_343 method_1970(String str) {
        return method_1974(new class_392(str));
    }

    public void method_1983(class_202 class_202Var) {
        this.field_2322 = class_202Var;
    }

    public static class_272 method_1979(short s, class_337 class_337Var) {
        switch (s) {
            case class_555.field_2304 /* 153 */:
                return new class_471(class_337Var);
            case class_555.field_2215 /* 154 */:
                return new class_245(class_337Var);
            case class_555.field_2244 /* 155 */:
                return new class_106(class_337Var);
            case class_555.field_2077 /* 156 */:
                return new class_481(class_337Var);
            case class_555.field_2251 /* 157 */:
                return new class_335(class_337Var);
            case class_555.field_2179 /* 158 */:
                return new class_342(class_337Var);
            case class_555.field_2287 /* 159 */:
                return new class_294(class_337Var);
            case class_555.field_2273 /* 160 */:
                return new class_178(class_337Var);
            case class_555.field_2099 /* 161 */:
                return new class_192(class_337Var);
            case class_555.field_2097 /* 162 */:
                return new class_174(class_337Var);
            case class_555.field_2130 /* 163 */:
                return new class_201(class_337Var);
            case class_555.field_2227 /* 164 */:
                return new class_466(class_337Var);
            case class_555.field_2136 /* 165 */:
                return new class_9(class_337Var);
            case class_555.field_2243 /* 166 */:
                return new class_152(class_337Var);
            case class_555.field_2270 /* 167 */:
                return new class_292(class_337Var);
            case class_555.field_2293 /* 168 */:
                return new class_375(class_337Var);
            case class_555.field_2174 /* 169 */:
            case class_555.field_2148 /* 170 */:
            case class_555.field_2131 /* 171 */:
            case class_555.field_2132 /* 172 */:
            case class_555.field_2196 /* 173 */:
            case class_555.field_2135 /* 174 */:
            case class_555.field_2221 /* 175 */:
            case class_555.field_2161 /* 176 */:
            case class_555.field_2150 /* 177 */:
            case class_555.field_2078 /* 178 */:
            case class_555.field_2141 /* 179 */:
            case class_555.field_2211 /* 180 */:
            case class_555.field_2186 /* 181 */:
            case class_555.field_2147 /* 182 */:
            case class_555.field_2238 /* 183 */:
            case class_555.field_2314 /* 184 */:
            case class_555.field_2144 /* 185 */:
            case class_555.field_2178 /* 186 */:
            case class_555.field_2228 /* 187 */:
            case class_555.field_2316 /* 188 */:
            case class_555.field_2245 /* 189 */:
            case class_555.field_2249 /* 190 */:
            case class_555.field_2262 /* 191 */:
            case class_555.field_2303 /* 192 */:
            case class_555.field_2197 /* 193 */:
            case class_555.field_2165 /* 194 */:
            case class_555.field_2282 /* 195 */:
            case ASMStuffs.field_79 /* 196 */:
            case class_555.field_2265 /* 197 */:
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "Invalid opcode: ").append((int) s).toString());
            case class_555.field_2182 /* 198 */:
                return new class_147(class_337Var);
            case class_555.field_2102 /* 199 */:
                return new class_355(class_337Var);
            case ASMStuffs.field_150 /* 200 */:
                return new class_432(class_337Var);
            case ASMStuffs.field_153 /* 201 */:
                return new class_333(class_337Var);
        }
    }

    public class_539 method_1969(class_212 class_212Var, short s) {
        class_594 class_594Var;
        if (s == 1) {
            if (class_212Var instanceof class_392) {
                return new class_18(this.field_2325.method_987((class_392) class_212Var));
            }
            if (!(class_212Var instanceof class_594)) {
                return new class_413(((class_331) class_212Var).method_619());
            }
            return new class_18(this.field_2325.method_1000((class_594) class_212Var));
        }
        if (!(class_212Var instanceof class_594)) {
            class_594Var = new class_594(class_212Var, s);
        } else {
            class_594Var = (class_594) class_212Var;
        }
        return new class_300(this.field_2325.method_1000(class_594Var), s);
    }

    public class_447 method_1998(class_592 class_592Var) {
        return class_592Var instanceof class_594 ? new class_447(this.field_2325.method_1000((class_594) class_592Var)) : new class_447(this.field_2325.method_987((class_392) class_592Var));
    }

    public class_202 method_1981() {
        return this.field_2322;
    }

    public class_343 method_1974(class_392 class_392Var) {
        return new class_343(this.field_2325.method_987(class_392Var));
    }
}
