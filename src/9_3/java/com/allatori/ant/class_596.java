package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.commons.AllatoriLogger;
import com.allatori.interfaces.unmapped.class_389;
import com.allatori.interfaces.unmapped.class_93;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collection;
import java.util.Vector;
import java.util.regex.Pattern;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_596 {
    public static Vector field_2385 = new Vector();

    public static void method_2094() {
        String replaceAll;
        field_2385 = new Vector();
        if (class_544.method_1937().method_1674() == null) {
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(class_544.method_1937().method_1674()));
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                if (readLine.length() > 0) {
                    if (!readLine.startsWith("regex:")) {
                        replaceAll = readLine.replaceAll("\\.", "\\\\.").replaceAll("\\*", ".*");
                    } else {
                        replaceAll = readLine.substring(6);
                    }
                    field_2385.add(Pattern.compile(replaceAll, 32));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean method_2091(String str) {
        int size = field_2385.size() - 1;
        int i = size;
        int i2 = size;
        while (i >= 0) {
            if (((Pattern) field_2385.get(i2)).matcher(str).matches()) {
                return true;
            }
            int i3 = i2 - 1;
            i = i3;
            i2 = i3;
        }
        return false;
    }

    public static int method_2086(class_337 class_337Var) {
        class_389[] method_1398 = class_337Var.method_1398();
        if (method_1398 == null) {
            return -1;
        }
        int length = method_1398.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            if (method_1398[i2] instanceof class_270) {
                return ((class_270) method_1398[i2]).method_47();
            }
            int i3 = i2 - 1;
            i = i3;
            i2 = i3;
        }
        return -1;
    }

    public static String method_2093(class_202 class_202Var) {
        class_160[] method_906 = class_202Var.method_906();
        if (method_906 == null) {
            return "Unknown Source";
        }
        int length = method_906.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            if (!(method_906[i2] instanceof class_599)) {
                int i3 = i2 - 1;
                i = i3;
                i2 = i3;
            } else {
                return ((class_599) method_906[i2]).method_464();
            }
        }
        return "Unknown Source";
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:11:0x0046 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:46:0x0140 */
    public static void method_2089(class_202 class_202Var) {
        int method_2086;
        int method_20862;
        class_557[] method_904 = class_202Var.method_904();
        int length = method_904.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            class_557 class_557Var = method_904[i2];
            if (class_557Var.method_1962() != null) {
                class_70 method_438 = class_230.method_1067(class_557Var, class_202Var.method_198(), class_202Var.method_917(), class_202Var.method_917().method_502()).method_438();
                class_337 method_415 = method_438.method_415();
                class_337 class_337Var = method_415;
                class_337 class_337Var2 = method_415;
                while (class_337Var != null) {
                    if (class_337Var2.method_1038() instanceof class_489) {
                        class_489 class_489Var = (class_489) class_337Var2.method_1038();
                        if (class_202Var.method_917().method_982(class_489Var.method_47()) instanceof class_118) {
                            class_208 method_917 = class_202Var.method_917();
                            int method_1387 = class_489Var.method_1387(method_917);
                            class_337 method_4152 = class_337Var2.method_415();
                            int i3 = 0;
                            int i4 = method_1387;
                            while (true) {
                                if (method_4152 != null) {
                                    int method_13872 = method_4152.method_1038().method_1387(method_917);
                                    int method_896 = method_4152.method_1038().method_896(method_917);
                                    if (method_13872 != -2 && method_896 != -2) {
                                        int i5 = i4 - method_896;
                                        if (i5 <= 0) {
                                            class_539 method_1038 = method_4152.method_1038();
                                            if ((method_1038 instanceof class_9) || (method_1038 instanceof class_152)) {
                                                do {
                                                    method_20862 = method_2086(method_4152);
                                                    method_4152 = method_4152.method_419();
                                                    if (method_4152 == null) {
                                                        break;
                                                    }
                                                } while (method_20862 == -1);
                                                String sb = new StringBuilder().insert(0, class_202Var.method_198()).append(".").append(class_557Var.method_464()).append("(").append(method_2093(class_202Var)).toString();
                                                if (method_20862 != -1) {
                                                    sb = new StringBuilder().insert(0, sb).append(":").append(method_20862).toString();
                                                }
                                                AllatoriLogger.method_681(new StringBuilder().insert(0, "Comparing strings using '==' operator at ").append(new StringBuilder().insert(0, sb).append(")").toString()).toString());
                                            }
                                        } else {
                                            i4 = i5 + method_13872;
                                            method_4152 = method_4152.method_415();
                                            int i6 = i3 + 1;
                                            if (i3 > 33) {
                                                break;
                                            } else {
                                                i3 = i6;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    class_337 method_4153 = class_337Var2.method_415();
                    class_337Var = method_4153;
                    class_337Var2 = method_4153;
                }
                class_337 method_4154 = method_438.method_415();
                class_337 class_337Var3 = method_4154;
                class_337 class_337Var4 = method_4154;
                while (class_337Var3 != null) {
                    if ((class_337Var4.method_1038() instanceof class_562) || (class_337Var4.method_1038() instanceof class_501)) {
                        class_239 class_239Var = (class_239) class_337Var4.method_1038();
                        class_208 method_9172 = class_202Var.method_917();
                        if ("Ljava/lang/String;".equals(class_239Var.method_621(method_9172))) {
                            int method_13873 = class_239Var.method_1387(method_9172);
                            class_337 method_4155 = class_337Var4.method_415();
                            int i7 = 0;
                            int i8 = method_13873;
                            while (true) {
                                if (method_4155 != null) {
                                    int method_13874 = method_4155.method_1038().method_1387(method_9172);
                                    int method_8962 = method_4155.method_1038().method_896(method_9172);
                                    if (method_13874 != -2 && method_8962 != -2) {
                                        int i9 = i8 - method_8962;
                                        if (i9 > 0) {
                                            i8 = i9 + method_13874;
                                            method_4155 = method_4155.method_415();
                                            int i10 = i7 + 1;
                                            if (i7 > 33) {
                                                break;
                                            } else {
                                                i7 = i10;
                                            }
                                        } else {
                                            class_539 method_10382 = method_4155.method_1038();
                                            if ((method_10382 instanceof class_9) || (method_10382 instanceof class_152)) {
                                                do {
                                                    method_2086 = method_2086(method_4155);
                                                    method_4155 = method_4155.method_419();
                                                    if (method_4155 == null) {
                                                        break;
                                                    }
                                                } while (method_2086 == -1);
                                                String sb2 = new StringBuilder().insert(0, class_202Var.method_198()).append(".").append(class_557Var.method_464()).append("(").append(method_2093(class_202Var)).toString();
                                                if (method_2086 != -1) {
                                                    sb2 = new StringBuilder().insert(0, sb2).append(":").append(method_2086).toString();
                                                }
                                                AllatoriLogger.method_681(new StringBuilder().insert(0, "Comparing strings using '==' operator at ").append(new StringBuilder().insert(0, sb2).append(")").toString()).toString());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    class_337 method_4156 = class_337Var4.method_415();
                    class_337Var3 = method_4156;
                    class_337Var4 = method_4156;
                }
            }
            int i11 = i2 - 1;
            i = i11;
            i2 = i11;
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0010 */
    public static Vector method_2090(int i) {
        String str;
        Vector vector = new Vector();
        String binaryString = Integer.toBinaryString(i);
        while (true) {
            str = binaryString;
            if (binaryString.length() >= 7) {
                break;
            }
            binaryString = new StringBuilder().insert(0, "0").append(str).toString();
        }
        if (str.startsWith("0")) {
            boolean method_2088 = method_2088(vector, str.substring(1, 4));
            if (method_2088) {
                vector.add(class_93.field_448);
                vector.add(class_93.field_419);
            }
            if (method_2088(vector, str.substring(4, 7)) && method_2088) {
                vector.add(class_93.field_412);
            }
            return vector;
        }
        if (!str.endsWith("0")) {
            if (str.charAt(3) != '0') {
                method_2088(vector, str.substring(0, 3));
                vector.add(class_93.field_467);
                vector.add(class_93.field_419);
                boolean method_2095 = method_2095(vector, str.substring(3, 5));
                if (method_2095) {
                    vector.add(class_93.field_485);
                    vector.add(class_93.field_419);
                }
                if (method_2095(vector, str.substring(5, 7))) {
                    vector.add(class_93.field_412);
                }
                if (method_2095) {
                    vector.add(class_93.field_412);
                }
                return vector;
            }
            boolean method_20882 = method_2088(vector, str.substring(0, 3));
            if (method_20882) {
                vector.add(class_93.field_467);
                vector.add(class_93.field_419);
            }
            if (method_2088(vector, str.substring(4, 7)) && method_20882) {
                vector.add(class_93.field_412);
            }
            return vector;
        }
        boolean method_20883 = method_2088(vector, str.substring(0, 3));
        if (method_20883) {
            vector.add(class_93.field_467);
            vector.add(class_93.field_419);
        }
        if (method_2088(vector, str.substring(3, 6)) && method_20883) {
            vector.add(class_93.field_475);
            vector.add(class_93.field_419);
            vector.add(class_93.field_412);
        }
        return vector;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:21:0x0090 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:35:0x00e3 */
    public static void method_2092(class_202 class_202Var, Collection collection) {
        class_261[] method_898 = class_202Var.method_898();
        int length = method_898.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            class_257 method_1146 = method_898[i2].method_1146();
            if (method_1146 != null) {
                class_286 method_982 = class_202Var.method_917().method_982(method_1146.method_183());
                if (method_982 instanceof class_118) {
                    collection.add(((class_371) class_202Var.method_917().method_982(((class_118) method_982).method_47())).method_198());
                }
            }
            int i3 = i2 - 1;
            i = i3;
            i2 = i3;
        }
        class_557[] method_904 = class_202Var.method_904();
        int length2 = method_904.length - 1;
        int i4 = length2;
        int i5 = length2;
        while (i4 >= 0) {
            class_557 class_557Var = method_904[i5];
            if (class_557Var.method_1962() != null) {
                class_70 method_438 = class_230.method_1067(class_557Var, class_202Var.method_198(), class_202Var.method_917(), class_202Var.method_917().method_502()).method_438();
                class_337 method_415 = method_438.method_415();
                class_337 class_337Var = method_415;
                class_337 class_337Var2 = method_415;
                while (class_337Var != null) {
                    if (((class_337Var2.method_1038() instanceof class_289) || (class_337Var2.method_1038() instanceof class_428)) && class_337Var2.method_419() != null) {
                        class_337 method_419 = class_337Var2.method_419();
                        if (method_419.method_1038() instanceof class_489) {
                            class_286 method_9822 = class_202Var.method_917().method_982(((class_489) method_419.method_1038()).method_47());
                            if (method_9822 instanceof class_118) {
                                collection.add(((class_371) class_202Var.method_917().method_982(((class_118) method_9822).method_47())).method_198());
                            }
                        }
                    }
                    class_337 method_4152 = class_337Var2.method_415();
                    class_337Var = method_4152;
                    class_337Var2 = method_4152;
                }
                class_337 method_4153 = method_438.method_415();
                class_337 class_337Var3 = method_4153;
                class_337 class_337Var4 = method_4153;
                while (class_337Var3 != null) {
                    if (class_337Var4.method_1038() instanceof class_489) {
                        class_489 class_489Var = (class_489) class_337Var4.method_1038();
                        class_286 method_9823 = class_202Var.method_917().method_982(class_489Var.method_47());
                        if (method_9823 instanceof class_118) {
                            class_208 method_917 = class_202Var.method_917();
                            int method_1387 = class_489Var.method_1387(method_917);
                            int i6 = 0;
                            class_337 method_4154 = class_337Var4.method_415();
                            while (true) {
                                if (method_4154 != null) {
                                    int method_13872 = method_4154.method_1038().method_1387(method_917);
                                    int method_896 = method_4154.method_1038().method_896(method_917);
                                    if (method_13872 != -2 && method_896 != -2) {
                                        int i7 = method_1387 - method_896;
                                        if (i7 > 0) {
                                            method_1387 = i7 + method_13872;
                                            method_4154 = method_4154.method_415();
                                            int i8 = i6 + 1;
                                            if (i6 > 33) {
                                                break;
                                            } else {
                                                i6 = i8;
                                            }
                                        } else {
                                            class_539 method_1038 = method_4154.method_1038();
                                            if ((method_1038 instanceof class_9) || (method_1038 instanceof class_152)) {
                                                collection.add(((class_371) class_202Var.method_917().method_982(((class_118) method_9823).method_47())).method_198());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    class_337 method_4155 = class_337Var4.method_415();
                    class_337Var3 = method_4155;
                    class_337Var4 = method_4155;
                }
            }
            int i9 = i5 - 1;
            i4 = i9;
            i5 = i9;
        }
    }

    public static boolean method_2095(Vector vector, String str) {
        if (!"00".equals(str)) {
            if (!"01".equals(str)) {
                if (!"10".equals(str)) {
                    if ("11".equals(str)) {
                        vector.add(class_93.field_448);
                    }
                } else {
                    vector.add(class_93.field_485);
                }
            } else {
                vector.add(class_93.field_475);
            }
            return true;
        }
        return false;
    }

    public static void method_2087(class_202 class_202Var) {
        class_557 class_557Var;
        class_202 class_202Var2;
        class_591 class_591Var;
        class_261[] method_898 = class_202Var.method_898();
        int length = method_898.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            class_261 class_261Var = method_898[i2];
            class_257 method_1146 = class_261Var.method_1146();
            if (method_1146 != null) {
                class_286 method_982 = class_202Var.method_917().method_982(method_1146.method_183());
                if ((method_982 instanceof class_118) && class_261Var.method_1117()) {
                    if (!class_261Var.method_1125()) {
                        class_176 class_176Var = new class_176(class_261Var, class_202Var.method_917());
                        class_176Var.method_50();
                        class_202Var.method_905(class_261Var, class_176Var.method_854());
                    } else {
                        class_557[] method_904 = class_202Var.method_904();
                        int length2 = method_904.length - 1;
                        int i3 = length2;
                        int i4 = length2;
                        while (true) {
                            if (i3 >= 0) {
                                class_557 class_557Var2 = method_904[i4];
                                if ("<clinit>".equals(class_557Var2.method_464())) {
                                    class_557Var = class_557Var2;
                                    break;
                                } else {
                                    int i5 = i4 - 1;
                                    i3 = i5;
                                    i4 = i5;
                                }
                            } else {
                                class_557Var = null;
                                break;
                            }
                        }
                        class_70 class_70Var = new class_70();
                        class_70Var.method_444(class_563.method_1978(class_212.field_794));
                        if (class_557Var != null) {
                            class_591 method_1067 = class_230.method_1067(class_557Var, class_202Var.method_198(), class_202Var.method_917(), class_202Var.method_917().method_502());
                            class_70Var = method_1067.method_438();
                            class_202Var2 = class_202Var;
                            class_591Var = method_1067;
                        } else {
                            class_202Var2 = class_202Var;
                            class_591Var = new class_591(8, class_212.field_794, class_212.field_807, new String[0], "<clinit>", class_202Var.method_198(), class_70Var, class_202Var.method_917());
                        }
                        String method_198 = ((class_371) class_202Var2.method_917().method_982(((class_118) method_982).method_47())).method_198();
                        class_70Var.method_444(new class_563(class_202Var).method_1991(class_202Var.method_198(), class_261Var.method_464(), class_212.field_799, ASMInterface.field_1461));
                        class_70Var.method_453(new class_302(class_202Var.method_917(), method_198));
                        class_591Var.method_2056();
                        class_591Var.method_2071();
                        if (class_557Var == null) {
                            class_202Var.method_899(class_591Var.method_2048());
                        } else {
                            class_202Var.method_914(class_557Var, class_591Var.method_2048());
                        }
                        class_70Var.method_50();
                        class_176 class_176Var2 = new class_176(class_261Var, class_202Var.method_917());
                        class_176Var2.method_50();
                        class_202Var.method_905(class_261Var, class_176Var2.method_854());
                    }
                }
            }
            int i6 = i2 - 1;
            i = i6;
            i2 = i6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void method_2085(class_202 class_202Var, String str, char c) {
        class_563 class_563Var = new class_563(class_202Var);
        class_208 method_917 = class_202Var.method_917();
        class_70 class_70Var = new class_70();
        class_591 class_591Var = new class_591(9, class_212.field_799, new class_212[]{class_212.field_799}, new String[]{"s"}, str, class_202Var.method_198(), class_70Var, method_917);
        int method_1007 = method_917.method_1007("java.lang.String");
        int method_10072 = method_917.method_1007("[C");
        int method_1004 = method_917.method_1004("StackMap");
        class_499 method_502 = method_917.method_502();
        class_591Var.method_2059(new class_157(method_1004, 30, new class_353[]{new class_353(27, 4, new class_112[]{new class_112((byte) 7, method_1007, method_502), new class_112((byte) 7, method_10072, method_502), new class_112((byte) 1, 0, method_502), new class_112((byte) 1, 0, method_502)}, 0, new class_112[0], method_502), new class_353(58, 4, new class_112[]{new class_112((byte) 7, method_1007, method_502), new class_112((byte) 7, method_10072, method_502), new class_112((byte) 1, 0, method_502), new class_112((byte) 1, 0, method_502)}, 0, new class_112[0], method_502)}, method_502));
        class_70Var.method_409(class_563.method_1984(class_212.field_808, 0));
        class_70Var.method_409(class_563Var.method_1980("java.lang.String", "length", class_212.field_802, class_212.field_807, ASMInterface.field_1312));
        class_70Var.method_409(class_563Var.method_1969(class_212.field_806, (short) 1));
        class_70Var.method_410(new class_302(method_917, 1));
        class_70Var.method_409(class_93.field_442);
        class_70Var.method_409(class_93.field_477);
        class_70Var.method_409(class_563.method_1972(class_212.field_808, 1));
        class_70Var.method_410(new class_302(method_917, (int) c));
        class_70Var.method_410(new class_302(method_917, 1));
        class_70Var.method_409(class_93.field_442);
        class_70Var.method_409(class_93.field_477);
        class_70Var.method_409(class_563.method_1972(class_212.field_802, 2));
        class_70Var.method_409(class_563.method_1984(class_212.field_808, 1));
        class_70Var.method_409(class_93.field_450);
        class_70Var.method_410(new class_302(method_917, 1));
        class_70Var.method_410(new class_302(method_917, 1));
        class_70Var.method_409(class_93.field_442);
        class_70Var.method_409(class_93.field_477);
        class_70Var.method_409(class_93.field_469);
        class_70Var.method_409(class_563.method_1972(class_212.field_802, 3));
        class_272 method_1979 = class_563.method_1979(ASMInterface.field_1492, null);
        class_70Var.method_413(method_1979);
        class_337 method_409 = class_70Var.method_409(class_563.method_1984(class_212.field_808, 1));
        class_70Var.method_409(class_563.method_1984(class_212.field_802, 3));
        class_70Var.method_409(class_563.method_1984(class_212.field_808, 0));
        class_70Var.method_409(class_563.method_1984(class_212.field_802, 3));
        class_70Var.method_409(class_563Var.method_1980("java.lang.String", "charAt", class_212.field_806, new class_212[]{class_212.field_802}, ASMInterface.field_1312));
        class_70Var.method_409(class_563.method_1984(class_212.field_802, 2));
        class_70Var.method_409(class_93.field_412);
        class_70Var.method_409(class_93.field_428);
        class_70Var.method_410(new class_302(method_917, 1));
        class_70Var.method_409(class_93.field_442);
        class_70Var.method_409(class_93.field_477);
        class_70Var.method_409(class_93.field_401);
        class_70Var.method_409(class_563.method_1984(class_212.field_802, 2));
        class_70Var.method_409(class_563.method_1984(class_212.field_802, 3));
        class_70Var.method_409(class_93.field_412);
        class_70Var.method_409(class_93.field_428);
        class_70Var.method_409(class_563.method_1972(class_212.field_802, 2));
        class_70Var.method_409(class_563.method_1984(class_212.field_802, 2));
        class_70Var.method_410(new class_302(method_917, 63));
        class_70Var.method_410(new class_302(method_917, 1));
        class_70Var.method_409(class_93.field_442);
        class_70Var.method_409(class_93.field_477);
        class_70Var.method_409(class_93.field_455);
        class_70Var.method_409(class_93.field_428);
        class_70Var.method_409(class_563.method_1972(class_212.field_802, 2));
        class_70Var.method_409(new class_67(3, -1));
        class_337 method_4092 = class_70Var.method_409(class_563.method_1984(class_212.field_802, 3));
        class_70Var.method_413(class_563.method_1979(ASMInterface.field_1535, method_409));
        class_70Var.method_409(class_563Var.method_1970("java.lang.String"));
        class_70Var.method_409(class_93.field_442);
        class_70Var.method_409(class_563.method_1984(class_212.field_808, 1));
        class_70Var.method_409(class_563Var.method_1980("java.lang.String", "<init>", class_212.field_794, new class_212[]{new class_594(class_212.field_806, 1)}, (short) 183));
        class_70Var.method_409(class_563.method_1978(class_212.field_808));
        method_1979.method_51(method_4092);
        class_591Var.method_2056();
        class_591Var.method_2071();
        class_202Var.method_899(class_591Var.method_2048());
        class_70Var.method_50();
    }

    public static boolean method_2088(Vector vector, String str) {
        if (!"000".equals(str)) {
            if ("001".equals(str)) {
                vector.add(class_93.field_475);
            } else if ("010".equals(str)) {
                vector.add(class_93.field_485);
            } else if (!"011".equals(str)) {
                if (!"100".equals(str)) {
                    if ("101".equals(str)) {
                        vector.add(class_93.field_407);
                    } else if (!"110".equals(str)) {
                        if ("111".equals(str)) {
                            vector.add(class_93.field_485);
                            vector.add(class_93.field_407);
                            vector.add(class_93.field_412);
                        }
                    } else {
                        vector.add(class_93.field_448);
                        vector.add(class_93.field_407);
                        vector.add(class_93.field_412);
                    }
                } else {
                    vector.add(class_93.field_467);
                }
            } else {
                vector.add(class_93.field_448);
            }
            return true;
        }
        return false;
    }
}
