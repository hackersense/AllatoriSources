package com.allatori.ant;

import com.allatori.commons.AllatoriLogger;
import com.allatori.exception.FinalExceptionProxy;
import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.ASMInterface;
import com.allatori.interfaces.unmapped.*;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_303 implements class_154 {
    public class_606 field_1088;

    public void method_1331(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var) {
        class_337 class_337Var;
        class_337 class_337Var2;
        class_337 class_337Var3;
        class_337 class_337Var4;
        class_337 method_415 = class_70Var.method_415();
        class_337 class_337Var5 = method_415;
        class_337 class_337Var6 = null;
        class_337 class_337Var7 = null;
        class_337 class_337Var8 = method_415;
        while (true) {
            if (class_337Var5 == null) {
                class_337Var = class_337Var7;
                class_337Var2 = class_337Var6;
                class_337Var3 = class_337Var7;
                break;
            }
            if (!(class_337Var8.method_1038() instanceof class_292) && !(class_337Var8.method_1038() instanceof class_288)) {
                class_337Var4 = class_337Var6;
                class_337Var2 = class_337Var6;
            } else if (class_337Var8.method_415() == null) {
                class_337Var4 = class_337Var6;
                class_337Var2 = class_337Var6;
            } else {
                if (class_337Var8.method_1038() instanceof class_292 class_292Var) {
                    if (class_292Var.getF940() == null) {
                        class_337Var4 = class_337Var6;
                        class_337Var2 = class_337Var6;
                    } else if (Math.abs(class_337Var8.method_47() - class_292Var.getF940().method_47()) > 32000) {
                        class_337Var4 = class_337Var6;
                        class_337Var2 = class_337Var6;
                    }
                }
                if (class_337Var7 == null) {
                    class_337Var4 = class_337Var6;
                    class_337Var2 = class_337Var6;
                    class_337Var7 = class_337Var8;
                } else {
                    class_337Var4 = class_337Var8;
                    class_337Var2 = class_337Var8;
                }
            }
            if (class_337Var4 != null) {
                class_337Var = class_337Var7;
                class_337Var3 = class_337Var7;
                break;
            } else {
                class_337 method_4152 = class_337Var8.method_415();
                class_337Var5 = method_4152;
                class_337Var6 = class_337Var2;
                class_337Var8 = method_4152;
            }
        }
        if (class_337Var == null) {
            return;
        }
        class_70Var.method_412(class_337Var3, class_93.field_461);
        class_116.field_550++;
        if (class_337Var2 != null) {
            class_70Var.method_412(class_337Var2, class_93.field_486);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void method_1342(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var, int i, int i2, int i3) {
        class_337 class_337Var;
        int i4;
        class_70 class_70Var2;
        class_70 class_70Var3;
        class_70 class_70Var4;
        class_70 class_70Var5;
        class_70 class_70Var6;
        class_337 method_412;
        class_337 method_4122;
        class_303 class_303Var;
        class_70 class_70Var7;
        class_337 method_4123;
        class_337 method_4124;
        class_303 class_303Var2;
        class_70 class_70Var8;
        class_337 method_4125;
        class_337 method_4126;
        class_303 class_303Var3;
        class_70 class_70Var9;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        class_337 method_415 = class_70Var.method_415();
        class_337 class_337Var2 = method_415;
        class_337 class_337Var3 = method_415;
        while (class_337Var2 != null && (i5 < i || i6 < i2 || i7 < i3)) {
            if (!method_1341(class_337Var3.method_1398())) {
                class_337Var = class_337Var3;
                i4 = i7;
            } else if (class_337Var3.method_1038() == class_93.field_486) {
                if (i5 >= i) {
                    class_337Var = class_337Var3;
                    i4 = i7;
                } else {
                    int method_1071 = class_231.method_1071(5);
                    if (method_1071 == 0) {
                        method_4125 = class_70Var.method_412(class_337Var3, class_93.field_455);
                        class_70Var.method_412(class_337Var3, class_93.field_407);
                        method_4126 = class_70Var.method_412(class_337Var3, class_93.field_485);
                        class_303Var3 = this;
                    } else if (method_1071 == 1) {
                        method_4125 = class_70Var.method_412(class_337Var3, class_93.field_389);
                        class_70Var.method_412(class_337Var3, class_93.field_485);
                        method_4126 = class_70Var.method_412(class_337Var3, class_93.field_448);
                        class_303Var3 = this;
                    } else if (method_1071 == 2) {
                        method_4125 = class_70Var.method_412(class_337Var3, class_93.field_389);
                        class_70Var.method_412(class_337Var3, class_93.field_448);
                        method_4126 = class_70Var.method_412(class_337Var3, class_93.field_407);
                        class_303Var3 = this;
                    } else if (method_1071 == 3) {
                        method_4125 = class_70Var.method_412(class_337Var3, class_93.field_455);
                        class_70Var.method_412(class_337Var3, class_93.field_467);
                        method_4126 = class_70Var.method_412(class_337Var3, class_93.field_448);
                        class_303Var3 = this;
                    } else {
                        method_4125 = class_70Var.method_412(class_337Var3, class_93.field_412);
                        class_70Var.method_412(class_337Var3, class_93.field_448);
                        method_4126 = class_70Var.method_412(class_337Var3, class_93.field_448);
                        class_303Var3 = this;
                    }
                    class_303Var3.method_1313(class_337Var3, method_4126);
                    try {
                        method_1330(class_337Var3, method_4125);
                        class_70Var9 = class_70Var;
                    } catch (class_151 e) {
                        class_70Var9 = class_70Var;
                    }
                    try {
                        class_70Var9.method_420(class_337Var3);
                    } catch (Exception e2) {
                    }
                    class_337Var = method_4125;
                    i4 = i7;
                    i5++;
                }
            } else if (class_337Var3.method_1038() == class_93.field_475) {
                if (i5 >= i) {
                    class_337Var = class_337Var3;
                    i4 = i7;
                } else if (class_337Var3.method_415() == null || class_337Var3.method_415().method_415() == null || class_337Var3.method_415().method_1038() != class_93.field_442 || class_337Var3.method_415().method_415().method_1038() != class_93.field_477) {
                    int method_10712 = class_231.method_1071(7);
                    if (method_10712 == 0) {
                        method_4123 = class_70Var.method_412(class_337Var3, class_93.field_455);
                        class_70Var.method_412(class_337Var3, class_93.field_407);
                        method_4124 = class_70Var.method_412(class_337Var3, class_93.field_448);
                        class_303Var2 = this;
                    } else if (method_10712 == 1) {
                        method_4123 = class_70Var.method_412(class_337Var3, class_93.field_389);
                        class_70Var.method_412(class_337Var3, class_93.field_475);
                        method_4124 = class_70Var.method_412(class_337Var3, class_93.field_448);
                        class_303Var2 = this;
                    } else if (method_10712 == 2) {
                        method_4123 = class_70Var.method_412(class_337Var3, class_93.field_389);
                        class_70Var.method_412(class_337Var3, class_93.field_485);
                        method_4124 = class_70Var.method_412(class_337Var3, class_93.field_407);
                        class_303Var2 = this;
                    } else if (method_10712 == 3) {
                        method_4123 = class_70Var.method_412(class_337Var3, class_93.field_412);
                        class_70Var.method_412(class_337Var3, class_93.field_448);
                        method_4124 = class_70Var.method_412(class_337Var3, class_93.field_485);
                        class_303Var2 = this;
                    } else if (method_10712 == 4 || method_10712 == 5) {
                        method_4123 = class_70Var.method_412(class_337Var3, class_93.field_439);
                        method_4124 = class_70Var.method_412(class_337Var3, class_93.field_483);
                        class_303Var2 = this;
                    } else {
                        method_4123 = class_70Var.method_412(class_337Var3, class_93.field_412);
                        class_70Var.method_412(class_337Var3, class_93.field_407);
                        method_4124 = class_70Var.method_412(class_337Var3, class_93.field_467);
                        class_303Var2 = this;
                    }
                    class_303Var2.method_1313(class_337Var3, method_4124);
                    try {
                        method_1330(class_337Var3, method_4123);
                        class_70Var8 = class_70Var;
                    } catch (class_151 e3) {
                        class_70Var8 = class_70Var;
                    }
                    try {
                        class_70Var8.method_420(class_337Var3);
                    } catch (Exception e4) {
                    }
                    class_337Var = method_4123;
                    i4 = i7;
                    i5++;
                } else {
                    class_337Var = class_337Var3;
                    i4 = i7;
                }
            } else if (class_337Var3.method_1038() == class_93.field_485) {
                if (i6 >= i2) {
                    class_337Var = class_337Var3;
                    i4 = i7;
                } else {
                    int method_10713 = class_231.method_1071(3);
                    if (method_10713 == 0) {
                        method_412 = class_70Var.method_412(class_337Var3, class_93.field_389);
                        class_70Var.method_412(class_337Var3, class_93.field_475);
                        method_4122 = class_70Var.method_412(class_337Var3, class_93.field_407);
                        class_303Var = this;
                    } else if (method_10713 == 1) {
                        method_412 = class_70Var.method_412(class_337Var3, class_93.field_439);
                        method_4122 = class_70Var.method_422(class_337Var3, new class_302(class_202Var.method_917(), -2));
                        class_303Var = this;
                    } else {
                        method_412 = class_70Var.method_412(class_337Var3, class_93.field_412);
                        class_70Var.method_412(class_337Var3, class_93.field_448);
                        method_4122 = class_70Var.method_412(class_337Var3, class_93.field_475);
                        class_303Var = this;
                    }
                    class_303Var.method_1313(class_337Var3, method_4122);
                    try {
                        method_1330(class_337Var3, method_412);
                        class_70Var7 = class_70Var;
                    } catch (class_151 e5) {
                        class_70Var7 = class_70Var;
                    }
                    try {
                        class_70Var7.method_420(class_337Var3);
                    } catch (Exception e6) {
                    }
                    class_337Var = method_412;
                    i4 = i7;
                    i6++;
                }
            } else if (class_337Var3.method_1038() == class_93.field_448) {
                if (i6 >= i2) {
                    class_337Var = class_337Var3;
                    i4 = i7;
                } else {
                    class_337Var = class_70Var.method_412(class_337Var3, class_93.field_439);
                    method_1313(class_337Var3, class_70Var.method_422(class_337Var3, new class_302(class_202Var.method_917(), -3)));
                    try {
                        method_1330(class_337Var3, class_337Var);
                        class_70Var6 = class_70Var;
                    } catch (class_151 e7) {
                        class_70Var6 = class_70Var;
                    }
                    try {
                        class_70Var6.method_420(class_337Var3);
                    } catch (Exception e8) {
                    }
                    i4 = i7;
                    i6++;
                }
            } else if (class_337Var3.method_1038() == class_93.field_467) {
                if (i6 >= i2) {
                    class_337Var = class_337Var3;
                    i4 = i7;
                } else {
                    class_337Var = class_70Var.method_412(class_337Var3, class_93.field_439);
                    method_1313(class_337Var3, class_70Var.method_422(class_337Var3, new class_302(class_202Var.method_917(), -4)));
                    try {
                        method_1330(class_337Var3, class_337Var);
                        class_70Var5 = class_70Var;
                    } catch (class_151 e9) {
                        class_70Var5 = class_70Var;
                    }
                    try {
                        class_70Var5.method_420(class_337Var3);
                    } catch (Exception e10) {
                    }
                    i4 = i7;
                    i6++;
                }
            } else if (class_337Var3.method_1038() == class_93.field_407) {
                if (i6 >= i2) {
                    class_337Var = class_337Var3;
                    i4 = i7;
                } else {
                    class_337Var = class_70Var.method_412(class_337Var3, class_93.field_439);
                    method_1313(class_337Var3, class_70Var.method_422(class_337Var3, new class_302(class_202Var.method_917(), -5)));
                    try {
                        method_1330(class_337Var3, class_337Var);
                        class_70Var4 = class_70Var;
                    } catch (class_151 e11) {
                        class_70Var4 = class_70Var;
                    }
                    try {
                        class_70Var4.method_420(class_337Var3);
                    } catch (Exception e12) {
                    }
                    i4 = i7;
                    i6++;
                }
            } else if (class_337Var3.method_1038() != class_93.field_483) {
                if (class_337Var3.method_1038() instanceof class_552) {
                    if (i7 >= i3) {
                        class_337Var = class_337Var3;
                        i4 = i7;
                    } else {
                        class_208 method_917 = class_202Var.method_917();
                        class_552 class_552Var = (class_552) class_337Var3.method_1038();
                        if (class_552Var.method_32(method_917) == class_212.field_795 || class_552Var.method_32(method_917) == class_212.field_801) {
                            int i8 = class_552Var.method_32(method_917) == class_212.field_801 ? 15 : 7;
                            int intValue = class_552Var.method_238().intValue();
                            int[] method_1317 = method_1317(intValue, i8);
                            int i9 = method_1317[0];
                            int i10 = method_1317[1];
                            if ((i9 & i10) != intValue) {
                                class_337Var = class_337Var3;
                                i4 = i7;
                            } else {
                                class_337Var = class_70Var.method_412(class_337Var3, class_93.field_455);
                                class_70Var.method_422(class_337Var3, new class_302(class_202Var.method_917(), i9));
                                method_1313(class_337Var3, class_70Var.method_422(class_337Var3, new class_302(class_202Var.method_917(), i10)));
                                try {
                                    method_1330(class_337Var3, class_337Var);
                                    class_70Var2 = class_70Var;
                                } catch (class_151 e13) {
                                    class_70Var2 = class_70Var;
                                }
                                try {
                                    class_70Var2.method_420(class_337Var3);
                                } catch (Exception e14) {
                                }
                                i4 = i7 + 1;
                            }
                        } else if (class_552Var.method_32(method_917) == class_212.field_806) {
                            class_337Var = class_337Var3;
                            i4 = i7;
                        } else if (class_552Var.method_32(method_917) == class_212.field_802) {
                        }
                    }
                }
                class_337Var = class_337Var3;
                i4 = i7;
            } else if (i6 >= i2) {
                class_337Var = class_337Var3;
                i4 = i7;
            } else {
                class_337Var = class_70Var.method_412(class_337Var3, class_93.field_389);
                class_70Var.method_412(class_337Var3, class_93.field_485);
                method_1313(class_337Var3, class_70Var.method_422(class_337Var3, new class_302(class_202Var.method_917(), -4)));
                try {
                    method_1330(class_337Var3, class_337Var);
                    class_70Var3 = class_70Var;
                } catch (class_151 e15) {
                    class_70Var3 = class_70Var;
                }
                try {
                    class_70Var3.method_420(class_337Var3);
                } catch (Exception e16) {
                }
                i4 = i7;
                i6++;
            }
            class_337 method_4152 = class_337Var.method_415();
            class_337Var2 = method_4152;
            i7 = i4;
            class_337Var3 = method_4152;
        }
        class_116.field_559 += i5;
        class_116.field_543 += i6;
        class_116.field_569 += i7;
    }

    public class_303(class_606 class_606Var) {
        this.field_1088 = class_606Var;
    }

    public static int[] method_1305(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < 32) {
            if ((i >> i5) % 2 == 1) {
                if (class_231.method_1073() < 0.5d) {
                    i4 |= 1 << i5;
                } else {
                    i3 |= 1 << i5;
                }
            }
            int i6 = i5 + 1;
            i2 = i6;
            i5 = i6;
        }
        return new int[]{i4, i3};
    }

    @Override // p000.class_154
    public void method_766(class_202 class_202Var) {
        class_557[] method_904 = class_202Var.method_904();
        int i = 0;
        int i2 = 0;
        while (i < method_904.length) {
            class_557 class_557Var = method_904[i2];
            if (class_557Var.method_1962() != null) {
                class_591 method_1067 = class_230.method_1067(class_557Var, class_202Var.method_198(), class_202Var.method_917(), class_202Var.method_917().method_502());
                if (class_544.method_1937().method_1681(this.field_1088, class_202Var, method_1067)) {
                    class_70 method_438 = method_1067.method_438();
                    method_438.method_411();
                    if (class_544.method_1932().method_1208()) {
                        method_1335(class_202Var, method_1067, method_438);
                    }
                    int method_771 = class_544.method_1920().method_771(this.field_1088, class_202Var, method_1067);
                    class_544.method_1920();
                    if (method_771 != 0 && !class_557Var.method_464().startsWith("Allatori")) {
                        method_1331(class_202Var, method_1067, method_438);
                    }
                    method_1334(class_202Var, method_1067, method_438);
                    method_1320(class_202Var, method_1067, method_438);
                    method_1319(class_202Var, method_1067, method_438);
                    method_1343(class_202Var, method_1067, method_438);
                    method_1306(class_202Var, method_1067, method_438);
                    method_1344(class_202Var, method_1067, method_438);
                    method_1318(class_202Var, method_1067, method_438, true);
                    method_1318(class_202Var, method_1067, method_438, false);
                    method_1338(class_202Var, method_1067, method_438);
                    method_1307(class_202Var, method_1067, method_438, false);
                    method_1339(class_202Var, method_1067, method_438);
                    method_1326(class_202Var, method_1067, method_438);
                    method_1307(class_202Var, method_1067, method_438, true);
                    method_1316(class_202Var, method_1067, method_438);
                    method_1316(class_202Var, method_1067, method_438);
                    method_1336(class_202Var, method_1067, method_438);
                    method_1322(class_202Var, method_1067, method_438);
                    method_1324(class_202Var, method_1067, method_438);
                    method_1327(class_202Var, method_1067, method_438);
                    method_1329(class_202Var, method_1067, method_438);
                    method_1309(class_202Var, method_1067, method_438);
                    method_1311(class_202Var, method_1067, method_438);
                    method_1328(class_202Var, method_1067, method_438);
                    method_1325(class_202Var, method_1067, method_438);
                    class_544.method_1920();
                    if (method_771 != 0) {
                        method_1321(class_202Var, method_1067, method_438);
                    }
                    method_1315(class_202Var, method_1067, method_438);
                    class_544.method_1920();
                    if (method_771 == 1) {
                        method_1342(class_202Var, method_1067, method_438, 10, 10, 10);
                    } else {
                        class_544.method_1920();
                        if (method_771 != 2) {
                            if (class_544.method_1937().method_1703() && class_544.method_1937().method_1706()) {
                                method_1342(class_202Var, method_1067, method_438, 8, 4, 4);
                            }
                        } else {
                            method_1342(class_202Var, method_1067, method_438, 64, 32, 32);
                        }
                    }
                    if (class_544.method_1930().method_1755(this.field_1088, class_202Var, class_557Var)) {
                        method_1310(class_202Var, method_1067, method_438);
                    }
                    method_1067.method_2056();
                    method_1067.method_2071();
                    class_202Var.method_914(class_557Var, method_1067.method_2048());
                } else if (class_544.method_1932().method_1208()) {
                    class_70 method_4382 = method_1067.method_438();
                    method_4382.method_411();
                    method_1335(class_202Var, method_1067, method_4382);
                    method_1067.method_2056();
                    method_1067.method_2071();
                    class_202Var.method_914(class_557Var, method_1067.method_2048());
                }
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
    }

    public static int[] method_1317(int i, int i2) {
        int i3 = 0;
        int i4 = i;
        int i5 = i;
        int i6 = 0;
        while (i3 < i2) {
            if ((i >> i6) % 2 == 0) {
                if (class_231.method_1073() >= 0.5d) {
                    i5 |= 1 << i6;
                } else {
                    i4 |= 1 << i6;
                }
            }
            int i7 = i6 + 1;
            i3 = i7;
            i6 = i7;
        }
        return new int[]{i4, i5};
    }

    public void method_1319(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var) {
        class_337 method_415;
        class_70 class_70Var2;
        class_337 method_4152 = class_70Var.method_415();
        class_337 class_337Var = method_4152;
        class_337 class_337Var2 = method_4152;
        while (class_337Var != null) {
            if (!(class_337Var2.method_1038() instanceof class_24)) {
                method_415 = class_337Var2;
            } else if (class_337Var2.method_415() == null) {
                method_415 = class_337Var2;
            } else if (class_337Var2.method_415().method_1038() instanceof class_226) {
                class_337 method_4153 = class_337Var2.method_415();
                if (((class_24) class_337Var2.method_1038()).method_47() != ((class_226) method_4153.method_1038()).method_47()) {
                    method_415 = class_337Var2;
                } else if (!method_1341(method_4153.method_1398())) {
                    method_415 = class_337Var2;
                } else if (method_1341(class_337Var2.method_1398())) {
                    method_415 = method_4153.method_415();
                    if (method_415 == null) {
                        method_415 = class_337Var2;
                    } else if (method_1332(class_70Var, class_337Var2, method_4153)) {
                        class_116.field_554++;
                        method_1313(method_4153, method_415);
                        method_1313(class_337Var2, method_415);
                        method_1330(method_4153, method_415);
                        method_1330(class_337Var2, method_415);
                        try {
                            class_70Var.method_420(class_337Var2);
                            class_70Var2 = class_70Var;
                        } catch (Exception e) {
                            class_70Var2 = class_70Var;
                        }
                        try {
                            class_70Var2.method_420(method_4153);
                        } catch (Exception e2) {
                        }
                    }
                } else {
                    method_415 = class_337Var2;
                }
            } else {
                method_415 = class_337Var2;
            }
            class_337 method_4154 = method_415.method_415();
            class_337Var = method_4154;
            class_337Var2 = method_4154;
        }
    }

    public void method_1324(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var) {
        class_303 class_303Var;
        class_337 class_337Var;
        class_70 class_70Var2;
        class_337 method_415 = class_70Var.method_415();
        class_337 class_337Var2 = method_415;
        class_337 class_337Var3 = method_415;
        while (class_337Var2 != null) {
            if (!(class_337Var3.method_1038() instanceof class_24)) {
                class_337Var = class_337Var3;
            } else if (class_337Var3.method_415() == null) {
                class_337Var = class_337Var3;
            } else if (class_337Var3.method_415().method_1038() instanceof class_226) {
                class_337 method_4152 = class_337Var3.method_415();
                class_24 class_24Var = (class_24) class_337Var3.method_1038();
                if (class_24Var.method_47() != ((class_226) method_4152.method_1038()).method_47()) {
                    class_337Var = class_337Var3;
                } else if (!method_1341(method_4152.method_1398())) {
                    class_337Var = class_337Var3;
                } else if (method_1341(class_337Var3.method_1398())) {
                    class_337 method_4153 = method_4152.method_415();
                    if (method_4153 == null) {
                        class_337Var = class_337Var3;
                    } else if (method_1332(class_70Var, class_337Var3, method_4152)) {
                        class_116.field_554++;
                        method_1313(method_4152, method_4153);
                        method_1313(class_337Var3, method_4153);
                        method_1330(method_4152, method_4153);
                        method_1330(class_337Var3, method_4153);
                        try {
                            class_70Var.method_420(class_337Var3);
                            class_70Var2 = class_70Var;
                        } catch (Exception e) {
                            class_70Var2 = class_70Var;
                        }
                        try {
                            class_70Var2.method_420(method_4152);
                            class_337Var = method_4153;
                        } catch (Exception e2) {
                            class_337Var = method_4153;
                        }
                    } else {
                        class_116.field_540++;
                        if ((class_24Var instanceof class_196) || (class_24Var instanceof class_564) || (class_24Var instanceof class_551)) {
                            class_70Var.method_449(class_337Var3, class_93.field_442);
                            class_303Var = this;
                        } else {
                            if ((class_24Var instanceof class_29) || (class_24Var instanceof class_126)) {
                                class_70Var.method_449(class_337Var3, class_93.field_381);
                            }
                            class_303Var = this;
                        }
                        class_303Var.method_1313(method_4152, method_4153);
                        method_1330(method_4152, class_337Var3);
                        try {
                            class_70Var.method_420(method_4152);
                            class_337Var = method_4153;
                        } catch (Exception e3) {
                            class_337Var = method_4153;
                        }
                    }
                } else {
                    class_337Var = class_337Var3;
                }
            } else {
                class_337Var = class_337Var3;
            }
            class_337 method_4154 = class_337Var.method_415();
            class_337Var2 = method_4154;
            class_337Var3 = method_4154;
        }
    }

    public static int[] method_1323() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < 32) {
            if (class_231.method_1073() >= 0.5d) {
                i3 |= 1 << i2;
            } else {
                i4 |= 1 << i2;
            }
            int i5 = i2 + 1;
            i = i5;
            i2 = i5;
        }
        return new int[]{i4, i3};
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:6:0x0011 */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f9 A[EDGE_INSN: B:89:0x00f9->B:90:0x00f9 BREAK  A[LOOP:1: B:12:0x004a->B:82:0x0185], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void method_1318(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var, boolean z) {
        Vector vector;
        class_337 class_337Var;
        int method_1387;
        class_337 method_415 = class_70Var.method_415();
        class_337 class_337Var2 = method_415;
        class_337 class_337Var3 = method_415;
        while (class_337Var2 != null) {
            if (class_337Var3.method_1038() instanceof class_519) {
                int method_47 = ((class_519) class_337Var3.method_1038()).method_47();
                if (z || method_1341(class_337Var3.method_1398())) {
                    class_208 method_917 = class_202Var.method_917();
                    int method_13872 = class_337Var3.method_1038().method_1387(method_917);
                    Vector vector2 = new Vector();
                    vector2.add(class_337Var3);
                    class_337 method_4152 = class_337Var3.method_415();
                    int i = 0;
                    while (method_4152 != null) {
                        class_539 method_1038 = method_4152.method_1038();
                        if (!(method_1038 instanceof class_385) && !(method_1038 instanceof class_561) && !(method_1038 instanceof class_247) && !(method_1038 instanceof class_552) && !(method_1038 instanceof class_119) && !(method_1038 instanceof class_508) && !(method_1038 instanceof class_521) && !(method_1038 instanceof class_235) && !(method_1038 instanceof class_343) && !(method_1038 instanceof class_413) && !(method_1038 instanceof class_109)) {
                            vector = vector2;
                            break;
                        }
                        if (!method_1341(method_4152.method_1398())) {
                            vector = vector2;
                            break;
                        }
                        if (method_13872 == 0 && (method_4152.method_1038() instanceof class_519)) {
                            if (!z) {
                                vector2.add(method_4152);
                                class_337Var = method_4152;
                                if (class_337Var.method_1038() instanceof class_196) {
                                    if (!z || ((class_196) method_4152.method_1038()).method_47() != method_47) {
                                        if (!z) {
                                            vector = vector2;
                                            break;
                                        }
                                    } else {
                                        vector = vector2;
                                        break;
                                    }
                                }
                                method_1387 = method_4152.method_1038().method_1387(method_917);
                                int method_896 = method_4152.method_1038().method_896(method_917);
                                if (method_1387 != -2) {
                                    break;
                                }
                                if (method_896 == -2) {
                                    vector = vector2;
                                    break;
                                }
                                int i2 = method_13872 - method_896;
                                if (i2 < 0) {
                                    vector = vector2;
                                    break;
                                }
                                method_13872 = i2 + method_1387;
                                method_4152 = method_4152.method_415();
                                int i3 = i + 1;
                                if (i > 777) {
                                    vector = vector2;
                                    break;
                                }
                                i = i3;
                            } else if (((class_519) method_4152.method_1038()).method_47() == method_47) {
                                vector2.add(method_4152);
                            }
                        }
                        class_337Var = method_4152;
                        if (class_337Var.method_1038() instanceof class_196) {
                        }
                        method_1387 = method_4152.method_1038().method_1387(method_917);
                        int method_8962 = method_4152.method_1038().method_896(method_917);
                        if (method_1387 != -2) {
                        }
                    }
                    vector = vector2;
                    if (vector.size() >= 2) {
                        if (vector2.size() > 1) {
                            class_116.field_571++;
                        }
                        if (vector2.size() > 2) {
                            class_116.field_565++;
                        }
                        if (z) {
                            int size = vector2.size() - 1;
                            int i4 = size;
                            int i5 = size;
                            while (i4 >= 1) {
                                method_1313((class_337) vector2.get(i5), ((class_337) vector2.get(i5)).method_415());
                                int i6 = i5 - 1;
                                class_70Var.method_52((class_337) vector2.get(i5), (class_337) vector2.get(0));
                                i4 = i6;
                                i5 = i6;
                            }
                        } else {
                            int size2 = vector2.size() - 1;
                            int i7 = size2;
                            int i8 = size2;
                            while (i7 >= 1) {
                                method_1313((class_337) vector2.get(i8), ((class_337) vector2.get(i8)).method_415());
                                int i9 = i8 - 1;
                                class_70Var.method_52((class_337) vector2.get(i8), ((class_337) vector2.get(0)).method_419());
                                i7 = i9;
                                i8 = i9;
                            }
                        }
                    }
                }
            }
            class_337 method_4153 = class_337Var3.method_415();
            class_337Var2 = method_4153;
            class_337Var3 = method_4153;
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:33:0x0095 */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r6 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        r0 = 1;
        r5 = 1;
        r6 = r2.method_415();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r0 >= r7) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (method_1341(r6.method_1398()) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
    
        r4 = r5 + 1;
        r6 = r6.method_415();
        r0 = r4;
        r5 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        if (r0 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        p000.class_116.field_566++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        if (r7 <= 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        p000.class_116.field_539++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        r0 = 1;
        r5 = 1;
        r6 = r2.method_415();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
    
        if (r0 >= r7) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
    
        method_1330(r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
    
        r13.method_420(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ae, code lost:
    
        if ((r1 instanceof p000.class_519) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b2, code lost:
    
        if ((r1 instanceof p000.class_507) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b6, code lost:
    
        if ((r1 instanceof p000.class_390) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e3, code lost:
    
        if ((r1 instanceof p000.class_391) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e7, code lost:
    
        if ((r1 instanceof p000.class_133) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e9, code lost:
    
        r0 = 1;
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00eb, code lost:
    
        if (r0 >= r7) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ed, code lost:
    
        r1 = r4 + 1;
        r13.method_412(r2, p000.class_93.field_381);
        r0 = r1;
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b8, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b9, code lost:
    
        r4 = r0;
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bb, code lost:
    
        if (r4 >= r7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bf, code lost:
    
        if ((r7 - r1) <= 2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c1, code lost:
    
        r0 = r1 + 2;
        r13.method_412(r2, p000.class_93.field_381);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ca, code lost:
    
        if ((r7 - r0) != 2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cc, code lost:
    
        r0 = r0 + 1;
        r13.method_412(r2, p000.class_93.field_490);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d5, code lost:
    
        if ((r7 - r0) != 1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d7, code lost:
    
        r0 = r0 + 1;
        r13.method_412(r2, p000.class_93.field_442);
        r4 = r0;
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f8, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00a7, code lost:
    
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void method_1326(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var) {
        class_337 method_415 = class_70Var.method_415();
        class_337 class_337Var = method_415;
        class_337 class_337Var2 = method_415;
        while (class_337Var != null) {
            if ((class_337Var2.method_1038() instanceof class_226 class_226Var) && class_337Var2.method_415() != null && (class_337Var2.method_415().method_1038() instanceof class_226)) {
                int method_47 = class_226Var.method_47();
                class_337 method_4152 = class_337Var2.method_415();
                class_337 class_337Var3 = method_4152;
                int i = 1;
                class_337 class_337Var4 = method_4152;
                while (class_337Var3 != null && (class_337Var4.method_1038() instanceof class_226) && ((class_226) class_337Var4.method_1038()).method_47() == method_47) {
                    class_337 method_4153 = class_337Var4.method_415();
                    class_337Var3 = method_4153;
                    i++;
                    class_337Var4 = method_4153;
                }
            }
            class_337 method_4154 = class_337Var2.method_415();
            class_337Var = method_4154;
            class_337Var2 = method_4154;
        }
        //        class_337 method_4155 = class_337Var2.method_415();
//        int i2 = r5 + 1;
//        int i3 = i2;
//        int i4 = i2;
    }

    public void method_1338(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var) {
        class_337 class_337Var;
        class_337 class_337Var2;
        class_337 method_415 = class_70Var.method_415();
        class_337 class_337Var3 = method_415;
        class_337 class_337Var4 = method_415;
        while (class_337Var3 != null) {
            if ((class_337Var4.method_1038() instanceof class_519) && method_1341(class_337Var4.method_1398())) {
                class_208 method_917 = class_202Var.method_917();
                int method_1387 = class_337Var4.method_1038().method_1387(method_917);
                class_337 method_4152 = class_337Var4.method_415();
                int i = 0;
                int i2 = method_1387;
                while (method_4152 != null) {
                    class_539 method_1038 = method_4152.method_1038();
                    if (!(method_1038 instanceof class_385) && !(method_1038 instanceof class_561) && !(method_1038 instanceof class_247) && !(method_1038 instanceof class_552) && !(method_1038 instanceof class_119) && !(method_1038 instanceof class_226) && !(method_1038 instanceof class_521) && !(method_1038 instanceof class_343) && !(method_1038 instanceof class_413) && !(method_1038 instanceof class_109) && !(method_1038 instanceof class_87) && !(method_1038 instanceof class_578)) {
                        class_337Var = null;
                        class_337Var2 = null;
                        break;
                    }
                    if (!method_1341(method_4152.method_1398())) {
                        class_337Var = null;
                        class_337Var2 = null;
                        break;
                    }
                    if (i2 == 0) {
                        class_539 method_10382 = method_4152.method_1038();
                        if ((method_10382 instanceof class_226) || (method_10382 instanceof class_552) || (method_10382 instanceof class_489) || (method_10382 instanceof class_274) || (method_10382 instanceof class_467)) {
                            class_337Var = method_4152;
                            class_337Var2 = method_4152;
                            break;
                        }
                    }
                    int method_13872 = method_4152.method_1038().method_1387(method_917);
                    int method_896 = method_4152.method_1038().method_896(method_917);
                    if (method_13872 == -2) {
                        break;
                    }
                    if (method_896 == -2) {
                        class_337Var = null;
                        class_337Var2 = null;
                        break;
                    }
                    int i3 = i2 - method_896;
                    if (i3 < 0) {
                        class_337Var = null;
                        class_337Var2 = null;
                        break;
                    }
                    i2 = i3 + method_13872;
                    method_4152 = method_4152.method_415();
                    int i4 = i + 1;
                    if (i > 777) {
                        class_337Var = null;
                        class_337Var2 = null;
                        break;
                    }
                    i = i4;
                }
                class_337Var = null;
                class_337Var2 = null;
                if (class_337Var != null) {
                    class_116.field_567++;
                    method_1313(class_337Var2, class_337Var2.method_415());
                    class_70Var.method_52(class_337Var2, class_337Var4.method_419());
                }
            }
            class_337 method_4153 = class_337Var4.method_415();
            class_337Var3 = method_4153;
            class_337Var4 = method_4153;
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:6:0x0012 */
    public void method_1339(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var) {
        boolean z;
        class_337 method_415 = class_70Var.method_415();
        class_337 class_337Var = method_415;
        class_337 class_337Var2 = method_415;
        while (class_337Var != null) {
            if ((class_337Var2.method_1038() instanceof class_519) && class_337Var2.method_415() != null && class_337Var2.method_415().method_415() != null && class_337Var2.method_415().method_415().method_415() != null && (class_337Var2.method_415().method_1038() instanceof class_501) && (class_337Var2.method_415().method_415().method_1038() instanceof class_519) && (class_337Var2.method_415().method_415().method_415().method_1038() instanceof class_501) && ((class_519) class_337Var2.method_1038()).method_47() == ((class_519) class_337Var2.method_415().method_415().method_1038()).method_47() && class_337Var2.method_415().method_1038().method_1387(class_202Var.method_917()) == 1) {
                int i = 1;
                int i2 = 1;
                class_337 method_4152 = class_337Var2.method_415();
                while (true) {
                    if (i >= 4) {
                        z = true;
                        break;
                    } else {
                        if (!method_1341(method_4152.method_1398())) {
                            z = false;
                            break;
                        }
                        int i3 = i2 + 1;
                        method_4152 = method_4152.method_415();
                        i = i3;
                        i2 = i3;
                    }
                }
                if (z) {
                    class_116.field_546++;
                    method_1313(class_337Var2.method_415().method_415(), class_337Var2.method_415().method_415().method_415());
                    class_70Var.method_52(class_337Var2.method_415(), class_337Var2.method_415().method_415());
                    class_70Var.method_412(class_337Var2.method_415().method_415(), class_93.field_426);
                }
            }
            class_337 method_4153 = class_337Var2.method_415();
            class_337Var = method_4153;
            class_337Var2 = method_4153;
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:6:0x0012 */
    public void method_1343(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var) {
        boolean z;
        class_303 class_303Var;
        class_337 method_415 = class_70Var.method_415();
        class_337 class_337Var = method_415;
        class_337 class_337Var2 = method_415;
        while (class_337Var != null) {
            if ((class_337Var2.method_1038() instanceof class_226) && class_337Var2.method_415() != null) {
                class_337 method_4152 = class_337Var2.method_415();
                if (method_4152.method_415() != null) {
                    class_337 method_4153 = method_4152.method_415();
                    if (method_4153.method_415() != null) {
                        class_337 method_4154 = method_4153.method_415();
                        if (method_4154.method_415() != null) {
                            class_337 method_4155 = method_4154.method_415();
                            if (method_4155.method_415() != null) {
                                class_337 method_4156 = method_4155.method_415();
                                if ((method_4152.method_1038() instanceof class_24) && (method_4153.method_1038() instanceof class_226) && (method_4154.method_1038() instanceof class_24) && (method_4155.method_1038() instanceof class_226) && (method_4156.method_1038() instanceof class_24) && ((class_226) class_337Var2.method_1038()).method_47() == ((class_24) method_4154.method_1038()).method_47() && ((class_24) method_4152.method_1038()).method_47() == ((class_226) method_4155.method_1038()).method_47() && ((class_226) method_4153.method_1038()).method_47() == ((class_24) method_4156.method_1038()).method_47()) {
                                    int i = 1;
                                    int i2 = 1;
                                    class_337 method_4157 = class_337Var2.method_415();
                                    while (true) {
                                        if (i >= 6) {
                                            z = true;
                                            break;
                                        } else {
                                            if (!method_1341(method_4157.method_1398())) {
                                                z = false;
                                                break;
                                            }
                                            int i3 = i2 + 1;
                                            method_4157 = method_4157.method_415();
                                            i = i3;
                                            i2 = i3;
                                        }
                                    }
                                    if (z) {
                                        class_116.field_564++;
                                        method_1313(method_4152, class_337Var2);
                                        method_1330(method_4152, class_337Var2);
                                        try {
                                            class_70Var.method_420(method_4152);
                                            class_303Var = this;
                                        } catch (Exception e) {
                                            class_303Var = this;
                                        }
                                        class_303Var.method_1313(method_4155, method_4156);
                                        method_1330(method_4155, method_4156);
                                        try {
                                            class_70Var.method_420(method_4155);
                                        } catch (Exception e2) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class_337 method_4158 = class_337Var2.method_415();
            class_337Var = method_4158;
            class_337Var2 = method_4158;
        }
    }

    public void method_1306(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var) {
        class_337 class_337Var;
        class_337 method_415;
        class_70 class_70Var2;
        class_337 method_4152 = class_70Var.method_415();
        class_337 class_337Var2 = method_4152;
        class_337 class_337Var3 = method_4152;
        while (class_337Var2 != null) {
            if (!(class_337Var3.method_1038() instanceof class_87) && !(class_337Var3.method_1038() instanceof class_578)) {
                method_415 = class_337Var3;
            } else if (method_1341(class_337Var3.method_1398())) {
                boolean z = class_337Var3.method_1038() instanceof class_87;
                class_208 method_917 = class_202Var.method_917();
                class_337 class_337Var4 = null;
                class_337 method_4153 = class_337Var3.method_415();
                int i = 0;
                int i2 = 0;
                while (method_4153 != null) {
                    class_539 method_1038 = method_4153.method_1038();
                    if (!(method_1038 instanceof class_385) && !(method_1038 instanceof class_561) && !(method_1038 instanceof class_247) && !(method_1038 instanceof class_552) && !(method_1038 instanceof class_119) && !(method_1038 instanceof class_508) && !(method_1038 instanceof class_521) && !(method_1038 instanceof class_235) && !(method_1038 instanceof class_343) && !(method_1038 instanceof class_413) && !(method_1038 instanceof class_109)) {
                        class_337Var = class_337Var4;
                        break;
                    }
                    if (!method_1341(method_4153.method_1398())) {
                        class_337Var = class_337Var4;
                        break;
                    }
                    int method_1387 = method_4153.method_1038().method_1387(method_917);
                    int method_896 = method_4153.method_1038().method_896(method_917);
                    if (method_1387 == -2) {
                        break;
                    }
                    if (method_896 == -2) {
                        class_337Var = class_337Var4;
                        break;
                    }
                    int i3 = i2 - method_896;
                    if (i3 < 0) {
                        class_337Var = class_337Var4;
                        break;
                    }
                    i2 = i3 + method_1387;
                    if (i2 == 0) {
                        if (z && (method_4153.method_1038() instanceof class_87)) {
                            class_337Var = method_4153;
                            break;
                        }
                        class_337Var4 = method_4153;
                    }
                    i++;
                    method_4153 = method_4153.method_415();
                    if (i > 777) {
                        class_337Var = class_337Var4;
                        break;
                    }
                }
                class_337Var = class_337Var4;
                if (i == 0) {
                    method_415 = class_337Var3;
                } else if (class_337Var == null) {
                    method_415 = class_337Var3;
                } else if (z && (class_337Var.method_1038() instanceof class_87)) {
                    class_116.field_552++;
                    class_337 method_4154 = class_337Var3.method_415();
                    method_1340(method_4154.method_419().method_1398(), method_4154.method_419(), method_4154);
                    class_70Var.method_420(method_4154.method_419());
                    class_70Var2 = class_70Var;
                    class_70Var2.method_412(class_337Var, class_93.field_477);
                    class_337 method_4155 = class_337Var.method_415();
                    method_1340(method_4155.method_419().method_1398(), method_4155.method_419(), method_4155);
                    try {
                        class_70Var.method_420(method_4155.method_419());
                        method_415 = method_4154;
                    } catch (Exception e2) {
                        method_1314((FinalExceptionProxy) e2, method_4155);
                        method_415 = method_4154;
                    }
                } else {
                    class_116.field_542++;
                    method_415 = class_337Var3.method_415();
                    class_70Var.method_52(method_415.method_419(), class_337Var);
                }
            } else {
                method_415 = class_337Var3;
            }
            class_337 method_4156 = method_415.method_415();
            class_337Var2 = method_4156;
            class_337Var3 = method_4156;
        }
    }

    public boolean method_1312(class_539 class_539Var) {
        return (class_539Var instanceof class_552) || (class_539Var instanceof class_467) || (class_539Var instanceof class_489) || (class_539Var instanceof class_274);
    }

    public void method_1328(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var) {
        boolean z;
        class_337 class_337Var;
        class_508 class_508Var;
        class_70Var.method_411();
        class_139[] method_2076 = class_591Var.method_2076();
        if (method_2076 != null) {
            int length = class_591Var.method_643().length;
            if (!class_591Var.method_1125()) {
                length++;
            }
            class_212[] method_1964 = class_591Var.method_1964();
            int length2 = method_1964.length;
            int i = 0;
            int i2 = 0;
            int i3 = length;
            while (i < length2) {
                class_212 class_212Var = method_1964[i2];
                int i4 = i2 + 1;
                i = i4;
                i2 = i4;
                i3 = (class_212Var == class_212.field_798 || class_212Var == class_212.field_810) ? i3 + 1 : i3;
            }
            int length3 = method_2076.length;
            int i5 = 0;
            int i6 = 0;
            while (i5 < length3) {
                class_139 class_139Var = method_2076[i6];
                if (class_139Var.method_669() == class_212.field_813 || class_139Var.method_669() == class_212.field_795 || class_139Var.method_669() == class_212.field_801 || class_139Var.method_669() == class_212.field_806) {
                    class_139Var.method_668(class_212.field_802);
                }
                int i7 = i6 + 1;
                i5 = i7;
                i6 = i7;
            }
            int method_928 = class_591Var.method_928();
            class_337[] class_337VarArr = new class_337[method_928];
            class_337[] class_337VarArr2 = new class_337[method_928];
            boolean[] zArr = new boolean[method_928];
            Hashtable hashtable = new Hashtable();
            class_337 method_415 = class_70Var.method_415();
            class_337 class_337Var2 = method_415;
            class_337 class_337Var3 = method_415;
            while (class_337Var2 != null) {
                if (!(class_337Var3.method_1038() instanceof class_508 class_508Var2)) {
                    if (class_337Var3.method_1038() instanceof class_398) {
                        int method_47 = ((class_398) class_337Var3.method_1038()).method_47();
                        if (class_337VarArr[method_47] == null) {
                            if (method_47 >= i3) {
                                class_337VarArr2[method_47] = class_337Var3;
                                class_337VarArr[method_47] = class_337Var3;
                            } else {
                                class_337VarArr[method_47] = class_70Var.method_415();
                                class_337VarArr2[method_47] = class_337Var3;
                            }
                        } else {
                            class_337VarArr2[method_47] = class_337Var3;
                        }
                    } else if (class_337Var3.method_1038() instanceof class_272) {
                        hashtable.put(class_337Var3.method_1038(), class_337Var3);
                    }
                } else {
                    int method_472 = class_508Var2.method_47();
                    if (class_337VarArr[method_472] != null) {
                        class_337VarArr2[method_472] = class_337Var3;
                        class_508Var = class_508Var2;
                    } else if (method_472 >= i3) {
                        class_337VarArr2[method_472] = class_337Var3;
                        class_337VarArr[method_472] = class_337Var3;
                        class_508Var = class_508Var2;
                    } else {
                        class_337VarArr[method_472] = class_70Var.method_415();
                        class_337VarArr2[method_472] = class_337Var3;
                        class_508Var = class_508Var2;
                    }
                    if ((class_508Var.method_1387(class_202Var.method_917()) == 2 || class_508Var2.method_896(class_202Var.method_917()) == 2) && method_472 + 1 < method_928) {
                        zArr[method_472] = true;
                        if (class_337VarArr[method_472 + 1] == null) {
                            if (method_472 + 1 >= i3) {
                                class_337VarArr2[method_472 + 1] = class_337Var3;
                                class_337VarArr[method_472 + 1] = class_337Var3;
                            } else {
                                class_337VarArr[method_472 + 1] = class_70Var.method_415();
                                class_337VarArr2[method_472 + 1] = class_337Var3;
                            }
                        } else {
                            class_337VarArr2[method_472 + 1] = class_337Var3;
                        }
                    }
                }
                class_337 method_4152 = class_337Var3.method_415();
                class_337Var2 = method_4152;
                class_337Var3 = method_4152;
            }
            class_337 method_4153 = class_70Var.method_415();
            class_337 class_337Var4 = method_4153;
            class_337 class_337Var5 = method_4153;
            while (class_337Var4 != null) {
                if (class_337Var5.method_415() != null && (class_337Var5.method_1038() instanceof class_519) && (class_337Var5.method_415().method_1038() instanceof class_115)) {
                    int method_473 = ((class_519) class_337Var5.method_1038()).method_47();
                    class_337VarArr[method_473] = class_70Var.method_415();
                    class_337VarArr2[method_473] = class_70Var.method_419();
                }
                class_337 method_4154 = class_337Var5.method_415();
                class_337Var4 = method_4154;
                class_337Var5 = method_4154;
            }
            int i8 = 0;
            int i9 = 0;
            while (i8 < method_928) {
                if (class_337VarArr[i9] != null) {
                    do {
                        z = false;
                        class_337 class_337Var6 = class_337VarArr[i9];
                        class_337 class_337Var7 = class_337Var6;
                        class_337 class_337Var8 = class_337Var6;
                        while (class_337Var7 != null) {
                            class_389[] method_1398 = class_337Var8.method_1398();
                            if (method_1398 != null) {
                                int length4 = method_1398.length;
                                int i10 = 0;
                                int i11 = 0;
                                while (i10 < length4) {
                                    class_389 class_389Var = method_1398[i11];
                                    if ((class_389Var instanceof class_272) && (class_337Var = (class_337) hashtable.get(class_389Var)) != null) {
                                        if (class_337Var.method_47() < class_337VarArr[i9].method_47()) {
                                            class_337VarArr[i9] = class_337Var;
                                            if (zArr[i9] && i9 + 1 < method_928) {
                                                class_337VarArr[i9 + 1] = class_337Var;
                                            }
                                            z = true;
                                        }
                                        if (class_337Var.method_47() > class_337VarArr2[i9].method_47()) {
                                            class_337VarArr2[i9] = class_337Var;
                                            if (zArr[i9] && i9 + 1 < method_928) {
                                                class_337VarArr2[i9 + 1] = class_337Var;
                                            }
                                            z = true;
                                        }
                                    }
                                    int i12 = i11 + 1;
                                    i10 = i12;
                                    i11 = i12;
                                }
                            }
                            if (class_337Var8 == class_337VarArr2[i9]) {
                                break;
                            }
                            class_337 method_4155 = class_337Var8.method_415();
                            class_337Var7 = method_4155;
                            class_337Var8 = method_4155;
                        }
                    } while (z);
                }
                int i13 = i9 + 1;
                i8 = i13;
                i9 = i13;
            }
            int[] iArr = new int[method_928];
            int i14 = 1;
            int i15 = 1;
            while (i14 < method_928) {
                if (zArr[i15] && iArr[i15] == 0 && i15 + 1 < method_928 && iArr[i15 + 1] == 0 && !zArr[i15 - 1]) {
                    int max = Math.max(i15 + 2, i3);
                    int i16 = max;
                    int i17 = max;
                    while (i16 < method_928) {
                        if (zArr[i17] && iArr[i17] == 0 && !zArr[i17 - 1] && class_337VarArr2[i15] != null && class_337VarArr[i17] != null && class_337VarArr2[i15].method_47() < class_337VarArr[i17].method_47() && class_337VarArr2[i15 + 1] != null && class_337VarArr2[i15 + 1].method_47() < class_337VarArr[i17].method_47()) {
                            class_337VarArr2[i15] = class_337VarArr2[i17];
                            class_337VarArr2[i15 + 1] = class_337VarArr2[i17];
                            iArr[i17] = i15;
                            class_116.field_551 += 2;
                        }
                        int i18 = i17 + 1;
                        i16 = i18;
                        i17 = i18;
                    }
                }
                int i19 = i15 + 1;
                i14 = i19;
                i15 = i19;
            }
            int i20 = 1;
            int i21 = 1;
            while (i20 < method_928) {
                if (!zArr[i21] && !zArr[i21 - 1] && iArr[i21] == 0) {
                    int max2 = Math.max(i21 + 1, i3);
                    int i22 = max2;
                    int i23 = max2;
                    while (i22 < method_928) {
                        if (!zArr[i23] && !zArr[i23 - 1] && iArr[i23] == 0 && ((class_337VarArr2[i21] != null && class_337VarArr[i23] != null && class_337VarArr2[i21].method_47() < class_337VarArr[i23].method_47()) || (class_337VarArr2[i21] == null && class_337VarArr[i23] != null))) {
                            class_337VarArr2[i21] = class_337VarArr2[i23];
                            iArr[i23] = i21;
                            class_116.field_551++;
                        }
                        int i24 = i23 + 1;
                        i22 = i24;
                        i23 = i24;
                    }
                }
                int i25 = i21 + 1;
                i20 = i25;
                i21 = i25;
            }
            int i26 = 1;
            int i27 = 1;
            while (i26 < method_928) {
                if ((zArr[i27] || zArr[i27 - 1]) && iArr[i27] == 0) {
                    int max3 = Math.max(i27 + 2, i3);
                    int i28 = max3;
                    int i29 = max3;
                    while (i28 < method_928) {
                        if (!zArr[i29] && !zArr[i29 - 1] && iArr[i29] == 0 && class_337VarArr2[i27] != null && class_337VarArr[i29] != null && class_337VarArr2[i27].method_47() < class_337VarArr[i29].method_47()) {
                            class_337VarArr2[i27] = class_337VarArr2[i29];
                            iArr[i29] = i27;
                            class_116.field_551++;
                        }
                        int i30 = i29 + 1;
                        i28 = i30;
                        i29 = i30;
                    }
                }
                int i31 = i27 + 1;
                i26 = i31;
                i27 = i31;
            }
            class_337 method_4156 = class_70Var.method_415();
            class_337 class_337Var9 = method_4156;
            class_337 class_337Var10 = method_4156;
            while (class_337Var9 != null) {
                if (!(class_337Var10.method_1038() instanceof class_508 class_508Var3)) {
                    if (class_337Var10.method_1038() instanceof class_398 class_398Var) {
                        if (iArr[class_398Var.method_47()] != 0) {
                            class_398Var.method_46(iArr[class_398Var.method_47()]);
                        }
                    }
                } else {
                    if (iArr[class_508Var3.method_47()] != 0) {
                        class_508Var3.method_46(iArr[class_508Var3.method_47()]);
                    }
                }
                class_337 method_4157 = class_337Var10.method_415();
                class_337Var9 = method_4157;
                class_337Var10 = method_4157;
            }
            Arrays.fill(zArr, false);
            class_337 method_4158 = class_70Var.method_415();
            class_337 class_337Var11 = method_4158;
            class_337 class_337Var12 = method_4158;
            while (class_337Var11 != null) {
                if (class_337Var12.method_1038() instanceof class_508 class_508Var4) {
                    int method_474 = class_508Var4.method_47();
                    zArr[method_474] = true;
                    if ((class_508Var4.method_1387(class_202Var.method_917()) == 2 || class_508Var4.method_896(class_202Var.method_917()) == 2) && method_474 + 1 < method_928) {
                        zArr[method_474 + 1] = true;
                    }
                } else if (class_337Var12.method_1038() instanceof class_398) {
                    zArr[((class_398) class_337Var12.method_1038()).method_47()] = true;
                }
                class_337 method_4159 = class_337Var12.method_415();
                class_337Var11 = method_4159;
                class_337Var12 = method_4159;
            }
            int i32 = i3;
            int i33 = i3;
            while (i32 < method_928) {
                int i34 = i33 + 1;
                iArr[i33] = i33;
                i32 = i34;
                i33 = i34;
            }
            int i35 = i3;
            int i36 = i3;
            while (i35 < method_928) {
                if (!zArr[i36]) {
                    int i37 = i36 + 1;
                    int i38 = i37;
                    int i39 = i37;
                    while (i38 < method_928) {
                        int i40 = i39 + 1;
                        iArr[i39] = iArr[i39] - 1;
                        i38 = i40;
                        i39 = i40;
                    }
                }
                int i41 = i36 + 1;
                i35 = i41;
                i36 = i41;
            }
            class_337 method_41510 = class_70Var.method_415();
            class_337 class_337Var13 = method_41510;
            class_337 class_337Var14 = method_41510;
            while (class_337Var13 != null) {
                if (!(class_337Var14.method_1038() instanceof class_508 class_508Var5)) {
                    if (class_337Var14.method_1038() instanceof class_398 class_398Var2) {
                        if (class_398Var2.method_47() >= i3) {
                            class_398Var2.method_46(iArr[class_398Var2.method_47()]);
                        }
                    }
                } else {
                    if (class_508Var5.method_47() >= i3) {
                        class_508Var5.method_46(iArr[class_508Var5.method_47()]);
                    }
                }
                class_337 method_41511 = class_337Var14.method_415();
                class_337Var13 = method_41511;
                class_337Var14 = method_41511;
            }
            int length5 = method_2076.length;
            int i42 = 0;
            int i43 = 0;
            while (i42 < length5) {
                class_139 class_139Var2 = method_2076[i43];
                if (class_139Var2.method_47() < i3) {
                    class_139Var2.method_435(class_70Var.method_415());
                    class_139Var2.method_51(class_70Var.method_419());
                } else {
                    class_591Var.method_2074(class_139Var2);
                }
                int i44 = i43 + 1;
                i42 = i44;
                i43 = i44;
            }
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:23:0x005d */
    public void method_1322(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var) {
        int i;
        boolean z;
        class_337 method_415 = class_70Var.method_415();
        class_337 class_337Var = method_415;
        class_337 class_337Var2 = method_415;
        while (class_337Var != null) {
            if (method_1312(class_337Var2.method_1038())) {
                class_337 method_4152 = class_337Var2.method_415();
                class_337 class_337Var3 = method_4152;
                class_337 class_337Var4 = method_4152;
                int i2 = 1;
                while (true) {
                    if (class_337Var3 == null) {
                        i = i2;
                        break;
                    }
                    if (!method_1312(class_337Var4.method_1038())) {
                        i = i2;
                        break;
                    } else {
                        if (!method_1333(class_337Var4.method_1038(), class_337Var2.method_1038(), class_202Var.method_917())) {
                            i = i2;
                            break;
                        }
                        i2++;
                        class_337 method_4153 = class_337Var4.method_415();
                        class_337Var3 = method_4153;
                        class_337Var4 = method_4153;
                    }
                }
                if (i >= 2) {
                    int i3 = 1;
                    int i4 = 1;
                    class_337 method_4154 = class_337Var2.method_415();
                    while (true) {
                        if (i3 >= i2) {
                            z = true;
                            break;
                        } else if (method_1341(method_4154.method_1398())) {
                            int i5 = i4 + 1;
                            method_4154 = method_4154.method_415();
                            i3 = i5;
                            i4 = i5;
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        class_116.field_555++;
                        int i6 = 1;
                        int i7 = 1;
                        class_337 method_4155 = class_337Var2.method_415();
                        while (i6 < i2) {
                            method_1330(method_4155, class_337Var2);
                            try {
                                class_70Var.method_420(method_4155);
                            } catch (Exception e) {
                            }
                            method_4155 = class_337Var2.method_415();
                            int i8 = i7 + 1;
                            i6 = i8;
                            i7 = i8;
                        }
                        int i9 = 1;
                        int i10 = 1;
                        while (i9 < i2) {
                            if (class_337Var2.method_1038().method_1387(class_202Var.method_917()) != 1) {
                                if (class_337Var2.method_1038().method_1387(class_202Var.method_917()) == 2) {
                                    class_70Var.method_412(class_337Var2, class_93.field_381);
                                }
                            } else {
                                class_70Var.method_412(class_337Var2, class_93.field_442);
                            }
                            int i11 = i10 + 1;
                            i9 = i11;
                            i10 = i11;
                        }
                    }
                }
            }
            class_337 method_4156 = class_337Var2.method_415();
            class_337Var = method_4156;
            class_337Var2 = method_4156;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: class_539 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: class_539 */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean method_1333(class_539 class_539Var, class_539 class_539Var2, class_208 class_208Var) {
        if (!(class_539Var instanceof class_552) || !(class_539Var2 instanceof class_552)) {
            if ((class_539Var instanceof class_467) && (class_539Var2 instanceof class_467)) {
                return true;
            }
            if ((class_539Var instanceof class_489) && (class_539Var2 instanceof class_489)) {
                return ((class_489) class_539Var).method_47() == ((class_489) class_539Var2).method_47();
            } else if ((class_539Var instanceof class_274) && (class_539Var2 instanceof class_274)) {
                return ((class_274) class_539Var).method_47() == ((class_274) class_539Var2).method_47();
            } else return (class_539Var instanceof class_562) && (class_539Var2 instanceof class_562) && ((class_562) class_539Var).method_47() == ((class_562) class_539Var2).method_47();
        } else return ((class_552) class_539Var).method_32(class_208Var) == ((class_552) class_539Var2).method_32(class_208Var) && ((class_552) class_539Var).method_238().equals(((class_552) class_539Var2).method_238());
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:24:0x0058 */
    public void method_1311(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var) {
        class_139[] method_2076 = class_591Var.method_2076();
        if (method_2076 == null || method_2076.length == 0) {
            return;
        }
        boolean[] zArr = new boolean[class_591Var.method_928()];
        int length = class_591Var.method_643().length;
        if (!class_591Var.method_1125()) {
            length++;
        }
        class_212[] method_1964 = class_591Var.method_1964();
        int length2 = method_1964.length;
        int i = 0;
        int i2 = 0;
        int i3 = length;
        while (i < length2) {
            class_212 class_212Var = method_1964[i2];
            int i4 = i2 + 1;
            i = i4;
            i2 = i4;
            i3 = (class_212Var == class_212.field_798 || class_212Var == class_212.field_810) ? i3 + 1 : i3;
        }
        class_337 method_415 = class_70Var.method_415();
        class_337 class_337Var = method_415;
        class_337 class_337Var2 = method_415;
        while (class_337Var != null) {
            if (class_337Var2.method_1038() instanceof class_226) {
                zArr[((class_226) class_337Var2.method_1038()).method_47()] = true;
            } else if (class_337Var2.method_1038() instanceof class_398) {
                zArr[((class_398) class_337Var2.method_1038()).method_47()] = true;
            }
            class_337 method_4152 = class_337Var2.method_415();
            class_337Var = method_4152;
            class_337Var2 = method_4152;
        }
        class_337 method_4153 = class_70Var.method_415();
        class_337 class_337Var3 = method_4153;
        class_337 class_337Var4 = method_4153;
        while (class_337Var3 != null) {
            if (class_337Var4.method_1038() instanceof class_24 class_24Var) {
                if (!zArr[class_24Var.method_47()] && class_24Var.method_47() >= i3) {
                    if ((class_24Var instanceof class_196) || (class_24Var instanceof class_551) || (class_24Var instanceof class_564)) {
                        class_337Var4.method_48(class_93.field_461);
                    } else if ((class_24Var instanceof class_126) || (class_24Var instanceof class_29)) {
                        class_337Var4.method_48(class_93.field_477);
                    }
                }
            } else if (class_337Var4.method_1038() instanceof class_67 class_67Var) {
                if (!zArr[class_67Var.method_47()] && class_67Var.method_47() >= i3) {
                    class_337 method_4154 = class_337Var4.method_415();
                    if (method_1341(class_337Var4.method_1398())) {
                        try {
                            class_70Var.method_420(class_337Var4);
                            class_337Var3 = method_4154;
                            class_337Var4 = method_4154;
                        } catch (Exception e) {
                            class_337Var3 = method_4154;
                            class_337Var4 = method_4154;
                        }
                    } else {
                        class_337Var4.method_48(class_93.field_456);
                        class_337Var3 = method_4154;
                        class_337Var4 = method_4154;
                    }
                }
            }
            class_337 method_4155 = class_337Var4.method_415();
            class_337Var3 = method_4155;
            class_337Var4 = method_4155;
        }
        int length3 = method_2076.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length3) {
            class_139 class_139Var = method_2076[i6];
            if (class_139Var.method_47() >= i3 && !zArr[class_139Var.method_47()]) {
                class_591Var.method_2074(class_139Var);
                class_116.field_563++;
            }
            int i7 = i6 + 1;
            i5 = i7;
            i6 = i7;
        }
    }

    public void method_1336(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var) {
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:6:0x0013 */
    public void method_1316(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var) {
        class_337 class_337Var;
        class_337 class_337Var2;
        class_337 method_415 = class_70Var.method_415();
        class_337 class_337Var3 = method_415;
        class_337 class_337Var4 = method_415;
        while (class_337Var3 != null) {
            if (method_1312(class_337Var4.method_1038()) && method_1341(class_337Var4.method_1398())) {
                class_208 method_917 = class_202Var.method_917();
                class_539 method_1038 = class_337Var4.method_1038();
                class_337 class_337Var5 = null;
                class_337 class_337Var6 = null;
                class_337 method_4152 = class_337Var4.method_415();
                int i = 0;
                int i2 = 0;
                while (method_4152 != null) {
                    class_539 method_10382 = method_4152.method_1038();
                    if (!(method_10382 instanceof class_385) && !(method_10382 instanceof class_561) && !(method_10382 instanceof class_247) && !(method_10382 instanceof class_552) && !(method_10382 instanceof class_119) && !(method_10382 instanceof class_508) && !(method_10382 instanceof class_521) && !(method_10382 instanceof class_235) && !(method_10382 instanceof class_343) && !(method_10382 instanceof class_413) && !(method_10382 instanceof class_109)) {
                        class_337Var = null;
                        break;
                    }
                    if (!method_1341(method_4152.method_1398())) {
                        class_337Var = null;
                        break;
                    }
                    if (i2 != 1) {
                        if (i2 == 2) {
                            class_539 method_10383 = method_4152.method_1038();
                            if (method_1312(method_10383) && method_1333(method_1038, method_10383, method_917)) {
                                class_337Var = method_4152;
                                class_337Var6 = method_4152;
                                break;
                            }
                        }
                    } else {
                        class_539 method_10384 = method_4152.method_1038();
                        if (method_1312(method_10384) && method_1333(method_1038, method_10384, method_917)) {
                            class_337Var5 = method_4152;
                        }
                    }
                    int method_1387 = method_4152.method_1038().method_1387(method_917);
                    int method_896 = method_4152.method_1038().method_896(method_917);
                    if (method_1387 == -2) {
                        break;
                    }
                    if (method_896 == -2) {
                        class_337Var = null;
                        break;
                    }
                    int i3 = i2 - method_896;
                    if (i3 < 0) {
                        class_337Var = null;
                        break;
                    }
                    i2 = i3 + method_1387;
                    method_4152 = method_4152.method_415();
                    int i4 = i + 1;
                    if (i > 777) {
                        class_337Var = null;
                        break;
                    }
                    i = i4;
                }
                class_337Var = null;
                class_337 class_337Var7 = class_337Var != null ? class_337Var6 : class_337Var5;
                char c = class_337Var6 != null ? (char) 2 : (char) 1;
                if (class_337Var7 != null) {
                    class_116.field_548++;
                    class_337Var4 = class_337Var4.method_415();
                    method_1313(class_337Var4.method_419(), class_337Var4);
                    method_1330(class_337Var4.method_419(), class_337Var7);
                    try {
                        class_70Var.method_420(class_337Var4.method_419());
                        class_337Var2 = class_337Var7;
                    } catch (Exception e) {
                        class_337Var2 = class_337Var7;
                    }
                    if (class_337Var2.method_1038().method_1387(method_917) == 1) {
                        if (c != 2) {
                            class_70Var.method_412(class_337Var7, class_93.field_490);
                        } else {
                            class_70Var.method_412(class_337Var7, class_93.field_431);
                        }
                    } else if (class_337Var7.method_1038().method_1387(method_917) == 2) {
                        if (c == 2) {
                            class_70Var.method_412(class_337Var7, class_93.field_383);
                        } else {
                            class_70Var.method_412(class_337Var7, class_93.field_498);
                        }
                    }
                }
            }
            class_337 method_4153 = class_337Var4.method_415();
            class_337Var3 = method_4153;
            class_337Var4 = method_4153;
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:59:0x00f2 */
    public void method_1325(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var) {
        int method_928;
        class_139[] method_2076 = class_591Var.method_2076();
        if (method_2076 != null && method_2076.length != 0 && (method_928 = class_591Var.method_928()) >= 4) {
            int length = class_591Var.method_643().length;
            if (!class_591Var.method_1125()) {
                length++;
            }
            class_212[] method_1964 = class_591Var.method_1964();
            int length2 = method_1964.length;
            int i = 0;
            int i2 = 0;
            int i3 = length;
            while (i < length2) {
                class_212 class_212Var = method_1964[i2];
                int i4 = i2 + 1;
                i = i4;
                i2 = i4;
                i3 = (class_212Var == class_212.field_798 || class_212Var == class_212.field_810) ? i3 + 1 : i3;
            }
            if (i3 < 4) {
                int[] iArr = new int[method_928];
                boolean[] zArr = new boolean[method_928];
                class_337 method_415 = class_70Var.method_415();
                class_337 class_337Var = method_415;
                class_337 class_337Var2 = method_415;
                while (class_337Var != null) {
                    if ((class_337Var2.method_1038() instanceof class_226) || (class_337Var2.method_1038() instanceof class_24)) {
                        class_508 class_508Var = (class_508) class_337Var2.method_1038();
                        int method_47 = class_508Var.method_47();
                        iArr[method_47] = iArr[method_47] + 1;
                        if ((class_508Var.method_1387(class_202Var.method_917()) == 2 || class_508Var.method_896(class_202Var.method_917()) == 2) && method_47 + 1 < method_928) {
                            zArr[method_47] = true;
                            zArr[method_47 + 1] = true;
                        }
                    }
                    class_337 method_4152 = class_337Var2.method_415();
                    class_337Var = method_4152;
                    class_337Var2 = method_4152;
                }
                int i5 = 0;
                int i6 = 0;
                while (i5 < iArr.length) {
                    int i7 = i6 + 1;
                    iArr[i6] = (iArr[i6] << 16) | i6;
                    i5 = i7;
                    i6 = i7;
                }
                Arrays.sort(iArr, 4, method_928);
                int i8 = i3;
                int i9 = i3;
                while (i8 < 4) {
                    if (!zArr[i9]) {
                        int i10 = iArr[i9] >> 16;
                        int i11 = method_928 - 1;
                        int i12 = i11;
                        int i13 = i11;
                        while (true) {
                            if (i12 >= 4) {
                                int i14 = iArr[i13] & 65535;
                                int i15 = iArr[i13] >> 16;
                                if (i14 > 3 && !zArr[i14] && i15 > i10) {
                                    class_116.field_541++;
                                    iArr[i13] = 0;
                                    class_337 method_4153 = class_70Var.method_415();
                                    class_337 class_337Var3 = method_4153;
                                    class_337 class_337Var4 = method_4153;
                                    while (class_337Var3 != null) {
                                        if (!(class_337Var4.method_1038() instanceof class_508 class_508Var2)) {
                                            if (class_337Var4.method_1038() instanceof class_398 class_398Var) {
                                                if (class_398Var.method_47() == i9) {
                                                    class_398Var.method_46(i14);
                                                } else if (class_398Var.method_47() == i14) {
                                                    class_398Var.method_46(i9);
                                                }
                                            }
                                        } else {
                                            if (class_508Var2.method_47() == i9) {
                                                class_508Var2.method_46(i14);
                                            } else if (class_508Var2.method_47() == i14) {
                                                class_508Var2.method_46(i9);
                                            }
                                        }
                                        class_337 method_4154 = class_337Var4.method_415();
                                        class_337Var3 = method_4154;
                                        class_337Var4 = method_4154;
                                    }
                                } else {
                                    int i16 = i13 - 1;
                                    i12 = i16;
                                    i13 = i16;
                                }
                            }
                        }
                    }
                    int i17 = i9 + 1;
                    i8 = i17;
                    i9 = i17;
                }
            }
        }
    }

    public void method_1309(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var) {
        class_116.field_568++;
        class_139[] method_2076 = class_591Var.method_2076();
        if (method_2076 == null || method_2076.length == 0) {
            return;
        }
        boolean[] zArr = new boolean[class_591Var.method_928()];
        int length = class_591Var.method_643().length;
        if (!class_591Var.method_1125()) {
            length++;
        }
        class_212[] method_1964 = class_591Var.method_1964();
        int length2 = method_1964.length;
        int i = 0;
        int i2 = 0;
        int i3 = length;
        while (i < length2) {
            class_212 class_212Var = method_1964[i2];
            int i4 = i2 + 1;
            i = i4;
            i2 = i4;
            i3 = (class_212Var == class_212.field_798 || class_212Var == class_212.field_810) ? i3 + 1 : i3;
        }
        int length3 = method_2076.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length3) {
            class_139 class_139Var = method_2076[i6];
            if (class_139Var.method_669() == class_212.field_813 || class_139Var.method_669() == class_212.field_795 || class_139Var.method_669() == class_212.field_801 || class_139Var.method_669() == class_212.field_806) {
                class_139Var.method_668(class_212.field_802);
            }
            int i7 = i6 + 1;
            i5 = i7;
            i6 = i7;
        }
        class_337 method_415 = class_70Var.method_415();
        class_337 class_337Var = method_415;
        class_337 class_337Var2 = method_415;
        while (class_337Var != null) {
            if (class_337Var2.method_1038() instanceof class_508) {
                zArr[((class_508) class_337Var2.method_1038()).method_47()] = true;
            }
            class_337 method_4152 = class_337Var2.method_415();
            class_337Var = method_4152;
            class_337Var2 = method_4152;
        }
        int length4 = method_2076.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length4) {
            class_139 class_139Var2 = method_2076[i9];
            if (class_139Var2.method_47() >= i3 && !zArr[class_139Var2.method_47()]) {
                class_591Var.method_2074(class_139Var2);
                class_116.field_570++;
            }
            int i10 = i9 + 1;
            i8 = i10;
            i9 = i10;
        }
        class_70Var.method_411();
        int length5 = method_2076.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length5) {
            class_139 class_139Var3 = method_2076[i12];
            if (class_139Var3.method_415() != null && class_139Var3.method_419() != null && class_139Var3.method_415().method_47() > class_139Var3.method_419().method_47()) {
                class_337 method_4153 = class_139Var3.method_415();
                class_139Var3.method_435(class_139Var3.method_419());
                class_139Var3.method_51(method_4153);
            }
            int i13 = i12 + 1;
            i11 = i13;
            i12 = i13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x00fa, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00fa A[EDGE_INSN: B:117:0x00fa->B:118:0x00fa BREAK  A[LOOP:1: B:13:0x003c->B:110:0x0198], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void method_1307(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var, boolean z) {
        class_337 class_337Var;
        class_337 class_337Var2 = null;
        class_337 class_337Var3;
        class_337 class_337Var4;

        boolean z2;
        int method_1387;
        class_337 method_415 = class_70Var.method_415();
        class_337 class_337Var5 = method_415;
        class_337 class_337Var6 = method_415;
        while (class_337Var5 != null) {
            if (!(class_337Var6.method_1038() instanceof class_226)) {
                class_337Var4 = class_337Var6;
            } else if (method_1341(class_337Var6.method_1398())) {
                class_208 method_917 = class_202Var.method_917();
                int method_47 = ((class_226) class_337Var6.method_1038()).method_47();
                class_337 class_337Var7 = null;
                class_337 class_337Var8 = null;
                class_337 method_4152 = class_337Var6.method_415();
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (method_4152 == null) {
                        class_337Var = class_337Var7;
                        break;
                    }
                    class_539 method_1038 = method_4152.method_1038();
                    if (!(method_1038 instanceof class_385) && !(method_1038 instanceof class_561) && !(method_1038 instanceof class_247) && !(method_1038 instanceof class_552) && !(method_1038 instanceof class_119) && !(method_1038 instanceof class_508) && !(method_1038 instanceof class_521) && !(method_1038 instanceof class_235) && !(method_1038 instanceof class_343) && !(method_1038 instanceof class_413) && !(method_1038 instanceof class_109)) {
                        class_337Var2 = null;
                        class_337Var = class_337Var7;
                        break;
                    }
                    if (((method_1038 instanceof class_24) || (method_1038 instanceof class_67)) && ((class_508) method_1038).method_47() == method_47) {
                        class_337Var2 = null;
                        class_337Var = class_337Var7;
                        break;
                    }
                    if (!method_1341(method_4152.method_1398())) {
                        class_337Var2 = null;
                        class_337Var = class_337Var7;
                        break;
                    }
                    if (i2 == 1) {
                        class_539 method_10382 = method_4152.method_1038();
                        if ((method_10382 instanceof class_226) && ((class_226) method_10382).method_47() == method_47) {
                            class_337Var = method_4152;
                            method_1387 = method_4152.method_1038().method_1387(method_917);
                            int method_896 = method_4152.method_1038().method_896(method_917);
                            if (method_1387 != -2) {
                                break;
                            }
                            if (method_896 == -2) {
                                class_337Var2 = null;
                                break;
                            }
                            int i3 = i2 - method_896;
                            if (i3 < 0) {
                                class_337Var2 = null;
                                break;
                            }
                            i2 = i3 + method_1387;
                            method_4152 = method_4152.method_415();
                            int i4 = i + 1;
                            if (i > 777) {
                                class_337Var2 = null;
                                break;
                            } else {
                                i = i4;
                                class_337Var7 = class_337Var;
                            }
                        }
                    } else if (i2 == 2) {
                        class_539 method_10383 = method_4152.method_1038();
                        if ((method_10383 instanceof class_226) && ((class_226) method_10383).method_47() == method_47) {
                            class_337Var2 = method_4152;
                            class_337Var8 = method_4152;
                            class_337Var = class_337Var7;
                            break;
                        }
                    }
                    class_337Var = class_337Var7;
                    method_1387 = method_4152.method_1038().method_1387(method_917);
                    int method_8962 = method_4152.method_1038().method_896(method_917);
                    if (method_1387 != -2) {
                    }
                }
                class_337 class_337Var9 = class_337Var2 != null ? class_337Var8 : class_337Var;
                char c = class_337Var8 != null ? (char) 2 : (char) 1;
                if (class_337Var9 == null) {
                    class_337Var4 = class_337Var6;
                } else {
                    if (!z) {
                        class_337 method_4153 = class_337Var6.method_415();
                        class_337 class_337Var10 = method_4153;
                        class_337 class_337Var11 = method_4153;
                        while (class_337Var10 != null && class_337Var11 != class_337Var9) {
                            if ((class_337Var11.method_1038() instanceof class_226) && ((class_226) class_337Var11.method_1038()).method_47() == method_47) {
                                class_337 method_4154 = class_337Var11.method_415();
                                class_337Var10 = method_4154;
                                class_337Var11 = method_4154;
                            } else {
                                z2 = true;
                                break;
                            }
                        }
                        z2 = false;
                        if (!z2) {
                            class_337Var4 = class_337Var6;
                        }
                    }
                    class_116.field_557++;
                    class_337 method_4155 = class_337Var6.method_415();
                    method_1313(method_4155.method_419(), method_4155);
                    method_1330(method_4155.method_419(), class_337Var9);
                    try {
                        class_70Var.method_420(method_4155.method_419());
                        class_337Var3 = class_337Var9;
                    } catch (Exception e) {
                        class_337Var3 = class_337Var9;
                    }
                    if (class_337Var3.method_1038().method_1387(method_917) != 1) {
                        if (class_337Var9.method_1038().method_1387(method_917) == 2) {
                            if (c == 2) {
                                class_70Var.method_412(class_337Var9, class_93.field_383);
                                class_337Var4 = method_4155;
                            } else {
                                class_70Var.method_412(class_337Var9, class_93.field_498);
                            }
                        }
                        class_337Var4 = method_4155;
                    } else if (c != 2) {
                        class_70Var.method_412(class_337Var9, class_93.field_490);
                        class_337Var4 = method_4155;
                    } else {
                        class_70Var.method_412(class_337Var9, class_93.field_431);
                        class_337Var4 = method_4155;
                    }
                }
            } else {
                class_337Var4 = class_337Var6;
            }
            class_337 method_4156 = class_337Var4.method_415();
            class_337Var5 = method_4156;
            class_337Var6 = method_4156;
        }
    }

    public void method_1330(class_337 class_337Var, class_337 class_337Var2) {
        if (class_337Var2 != null && class_337Var.method_1398() != null) {
            class_389[] method_1398 = class_337Var.method_1398();
            int length = method_1398.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                class_389 class_389Var = method_1398[i2];
                if (class_389Var instanceof class_139) {
                    class_389Var.method_52(class_337Var, class_337Var2);
                }
                int i3 = i2 + 1;
                i = i3;
                i2 = i3;
            }
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:4:0x000b */
    public void method_1310(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var) {
        class_337 method_415 = class_70Var.method_415();
        class_337 class_337Var = method_415;
        class_337 class_337Var2 = method_415;
        while (class_337Var != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i < class_231.method_1071(3) + 1) {
                    class_70Var.method_449(class_337Var2, new class_281((byte) (class_231.method_1071(class_555.field_2152) - 120)));
                    i = i2 + 1;
                    class_70Var.method_449(class_337Var2, class_93.field_461);
                }
            }
//            class_337 method_4152 = class_337Var2.method_415();
//            class_337Var = method_4152;
//            class_337Var2 = method_4152;
        }
    }

    public boolean method_1332(class_70 class_70Var, class_337 class_337Var, class_337 class_337Var2) {
        int method_47 = ((class_508) class_337Var.method_1038()).method_47();
        class_337 method_415 = class_70Var.method_415();
        class_337 class_337Var3 = method_415;
        class_337 class_337Var4 = method_415;
        while (class_337Var3 != null) {
            class_539 method_1038 = class_337Var4.method_1038();
            if ((method_1038 instanceof class_508) && ((class_508) method_1038).method_47() == method_47 && class_337Var4 != class_337Var && class_337Var4 != class_337Var2) {
                return false;
            }
            class_337 method_4152 = class_337Var4.method_415();
            class_337Var3 = method_4152;
            class_337Var4 = method_4152;
        }
        return true;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:6:0x0014 */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0195, code lost:
    
        r0 = null;
        r4 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void method_1334(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var) {
        class_337 class_337Var = null;
        class_337 class_337Var2 = null;
        class_337 method_415 = class_70Var.method_415();
        class_337 class_337Var3 = method_415;
        class_337 class_337Var4 = method_415;
        while (class_337Var3 != null) {
            if (class_337Var4.method_1038() instanceof class_343) {
                String method_464 = ((class_343) class_337Var4.method_1038()).method_42(class_202Var.method_917()).method_464();
                if ("java.lang.StringBuffer".equals(method_464) || "java.lang.StringBuilder".equals(method_464)) {
                    String sb = "L" + method_464.replace('.', '/') + ";";
                    if (class_337Var4.method_415() != null && (class_337Var4.method_415().method_1038() instanceof class_376) && class_337Var4.method_415().method_415() != null && (class_337Var4.method_415().method_415().method_1038() instanceof class_219 class_219Var)) {
                        class_208 method_917 = class_202Var.method_917();
                        if (method_464.equals(class_219Var.method_623(method_917)) && "<init>".equals(class_219Var.method_1086(method_917)) && "()V".equals(class_219Var.method_621(method_917))) {
                            class_337 method_4152 = class_337Var4.method_415().method_415().method_415();
                            class_337 class_337Var5 = method_4152;
                            class_337 class_337Var6 = method_4152;
                            int i = 0;
                            while (true) {
                                if (class_337Var5 == null) {
                                    break;
                                }
                                class_539 method_1038 = class_337Var6.method_1038();
                                if (!(method_1038 instanceof class_385) && !(method_1038 instanceof class_561) && !(method_1038 instanceof class_247) && !(method_1038 instanceof class_552) && !(method_1038 instanceof class_119) && !(method_1038 instanceof class_508) && !(method_1038 instanceof class_521) && !(method_1038 instanceof class_235) && !(method_1038 instanceof class_343) && !(method_1038 instanceof class_413) && !(method_1038 instanceof class_109)) {
                                    class_337Var = null;
                                    class_337Var2 = null;
                                    break;
                                }
                                if (!method_1341(class_337Var6.method_1398())) {
                                    class_337Var = null;
                                    class_337Var2 = null;
                                    break;
                                }
                                if (class_337Var6.method_1038() instanceof class_203 class_203Var) {
                                    if (method_464.equals(class_203Var.method_623(method_917)) && "append".equals(class_203Var.method_1086(method_917)) && ("(Ljava/lang/String;)" + sb).equals(class_203Var.method_621(method_917))) {
                                        if (i == 1) {
                                            class_337Var = class_337Var6;
                                            class_337Var2 = class_337Var6;
                                        }
                                    }
                                }
                                int method_1387 = class_337Var6.method_1038().method_1387(method_917);
                                int method_896 = class_337Var6.method_1038().method_896(method_917);
                                if (method_1387 == -2) {
                                    break;
                                }
                                if (method_896 == -2) {
                                    class_337Var = null;
                                    class_337Var2 = null;
                                    break;
                                }
                                int i2 = i - method_896;
                                if (i2 < 0) {
                                    class_337Var = null;
                                    class_337Var2 = null;
                                    break;
                                } else {
                                    i = i2 + method_1387;
                                    class_337 method_4153 = class_337Var6.method_415();
                                    class_337Var5 = method_4153;
                                    class_337Var6 = method_4153;
                                }
                            }
                            if (class_337Var != null) {
                                class_116.field_556++;
                                class_70Var.method_412(class_337Var4.method_415().method_415(), class_93.field_486);
                                ((class_203) class_337Var2.method_1038()).method_46(method_917.method_992(method_464, "insert", "(ILjava/lang/String;)" + sb));
                            }
                        }
                    }
                }
            }
            class_337 method_4154 = class_337Var4.method_415();
            class_337Var3 = method_4154;
            class_337Var4 = method_4154;
        }
    }

    public void method_1314(FinalExceptionProxy ExceptionVar, class_337 class_337Var) {
        class_337[] method_446 = ExceptionVar.method_446();
        int i = 0;
        int i2 = 0;
        while (i < method_446.length) {
            class_389[] method_1398 = method_446[i2].method_1398();
            if (method_1398 != null) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < method_1398.length) {
                    int i5 = i4 + 1;
                    method_1398[i4].method_52(method_446[i2], class_337Var);
                    i3 = i5;
                    i4 = i5;
                }
            }
            int i6 = i2 + 1;
            i = i6;
            i2 = i6;
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:5:0x0006 */
    public void method_1340(class_389[] class_389VarArr, class_337 class_337Var, class_337 class_337Var2) {
        if (class_389VarArr != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i >= class_389VarArr.length) {
                    return;
                }
                i = i2 + 1;
                class_389VarArr[i2].method_52(class_337Var, class_337Var2);
            }
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:14:0x003a */
    public void method_1337(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var) {
        class_337 method_419;
        class_70Var.method_411();
        class_337 method_415 = class_70Var.method_415();
        class_337 class_337Var = method_415;
        class_337 class_337Var2 = method_415;
        while (class_337Var != null) {
            if (class_337Var2.method_1038() instanceof class_559) {
                class_337 method_4192 = ((class_559) class_337Var2.method_1038()).getF940();
                boolean z = method_4192.method_47() < class_337Var2.method_47();
                boolean z2 = method_4192.method_47() > class_337Var2.method_47();
                if ((z || z2) && (method_419 = method_4192.method_419()) != null && (method_419.method_1038() instanceof class_502 class_502Var)) {
                    class_337 method_4193 = class_502Var.getF940();
                    if (z) {
                        if (method_4193.method_47() < class_337Var2.method_47()) {
                            if (method_4192.method_47() >= method_4193.method_47()) {
                            }
                            if (!(method_4193.method_1038() instanceof class_272) && !(method_4193.method_1038() instanceof class_343) && !(method_4193.method_1038() instanceof class_413) && !(method_4193.method_1038() instanceof class_18) && method_1341(method_4192.method_419().method_1398())) {
                                class_116.field_561++;
                                class_502Var.method_51(method_4193.method_415());
                                class_70Var.method_449(method_4192.method_419(), method_4193.method_1038());
                            }
                        }
                    } else {
                        if (z2 && method_4193.method_47() >= class_337Var2.method_47()) {
                        }
                        if (!(method_4193.method_1038() instanceof class_272)) {
                            class_116.field_561++;
                            class_502Var.method_51(method_4193.method_415());
                            class_70Var.method_449(method_4192.method_419(), method_4193.method_1038());
                        }
                    }
                }
            }
            class_337 method_4152 = class_337Var2.method_415();
            class_337Var = method_4152;
            class_337Var2 = method_4152;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0119, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void method_1327(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var) {
        class_337 class_337Var;
        boolean z;
        int i;
        class_337 class_337Var2;
        int i2;
        class_337 class_337Var3;
        boolean z2;
        class_337 method_415 = class_70Var.method_415();
        class_337 class_337Var4 = method_415;
        class_337 class_337Var5 = method_415;
        while (class_337Var4 != null) {
            if (!(class_337Var5.method_1038() instanceof class_67)) {
                class_337Var2 = class_337Var5;
            } else if (method_1341(class_337Var5.method_1398())) {
                class_67 class_67Var = (class_67) class_337Var5.method_1038();
                class_337 method_419 = class_337Var5.method_419();
                int i3 = 0;
//                while (true) {
                    class_337 class_337Var6 = method_419;
                    class_337Var = method_419;
                    while (class_337Var6 != null && i3 < 3) {
                        if (!method_1341(class_337Var.method_1398())) {
                            break;
                        }
                        if (class_337Var.method_1038() instanceof class_272) {
                            break;
                        } else {
                            if (
                                    (class_337Var.method_1038() instanceof class_508)
                                    && (((class_508) class_337Var.method_1038()).method_47() == class_67Var.method_47())
                                    || class_337Var.method_1038() instanceof class_561
                            ) {
                                break;
                            }
                            method_419 = class_337Var.method_419();
                            if (method_419 != null) {
                                i3++;
                                class_337Var6 = method_419;
                                class_337Var = method_419;
                            }
                        }
                    }
//                }
                z = false;
                if (i3 < 3) {
                    int i4 = 0;
                    class_337 method_4152 = class_337Var5.method_415();
                    while (true) {
                        class_337 class_337Var7 = method_4152;
                        i2 = i4;
                        class_337Var3 = method_4152;
                        while (class_337Var7 != null && i2 < 3) {
                            if (!method_1341(class_337Var3.method_1398())) {
                                z2 = false;
                                break;
                            }
                            if (!(class_337Var3.method_1038() instanceof class_272)) {
                                if (!(class_337Var3.method_1038() instanceof class_508) || ((class_508) class_337Var3.method_1038()).method_47() != class_67Var.method_47()) {
                                    if (i2 > 0 && (class_337Var3.method_1038() instanceof class_561)) {
                                        z2 = true;
                                        break;
                                    }
                                    method_4152 = class_337Var3.method_415();
                                    if (method_4152 != null) {
                                        i2++;
                                        class_337Var7 = method_4152;
                                        class_337Var3 = method_4152;
                                    }
                                } else {
                                    z2 = false;
                                    break;
                                }
                            } else {
                                z2 = false;
                                break;
                            }
                        }
                        i4 = i2;
                    }
                } else {
                    i = 0;
                }
                class_116.field_560++;
                method_1313(class_337Var5, class_337Var5.method_415());
                if (i3 > 3) {
                    i3 = 3;
                }
                if (i > 3) {
                    i = 3;
                }
                if (i3 != 3) {
                    if (i == 3) {
                        class_70Var.method_52(class_337Var5, class_337Var5.method_415().method_415().method_415());
                        class_337Var2 = class_337Var5;
                    } else if (i3 == 2) {
                        class_337Var2 = class_337Var5.method_415();
                        class_70Var.method_52(class_337Var2.method_419(), class_337Var2.method_419().method_419().method_419().method_419());
                    } else if (i == 2) {
                        class_70Var.method_52(class_337Var5, class_337Var5.method_415().method_415());
                        class_337Var2 = class_337Var5;
                    } else if (i3 == 1) {
                        class_337Var2 = class_337Var5.method_415();
                        class_70Var.method_52(class_337Var2.method_419(), class_337Var2.method_419().method_419().method_419());
                    } else {
                        if (i == 1) {
                            class_70Var.method_52(class_337Var5, class_337Var5.method_415());
                        }
                        class_337Var2 = class_337Var5;
                    }
                } else {
                    class_337Var2 = class_337Var5.method_415();
                    class_70Var.method_52(class_337Var2.method_419(), class_337Var2.method_419().method_419().method_419().method_419().method_419());
                }
            } else {
                class_337Var2 = class_337Var5;
            }
            class_337 method_4153 = class_337Var2.method_415();
            class_337Var4 = method_4153;
            class_337Var5 = method_4153;
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:68:0x0120 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:42:0x00c1 */
    public void method_1321(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var) {
        int method_928;
        int i;
        class_139[] method_2076 = class_591Var.method_2076();
        if (method_2076 != null && method_2076.length != 0 && (method_928 = class_591Var.method_928()) >= 2) {
            int[] iArr = new int[method_928];
            boolean[] zArr = new boolean[method_928];
            class_212[] class_212VarArr = new class_212[method_928];
            int i2 = 0;
            if (!class_591Var.method_1125()) {
                i2 = 1;
                class_212VarArr[0] = class_212.field_808;
            }
            int length = class_591Var.method_643().length;
            if (!class_591Var.method_1125()) {
                length++;
            }
            class_212[] method_1964 = class_591Var.method_1964();
            int length2 = method_1964.length;
            int i3 = 0;
            int i4 = i2;
            int i5 = 0;
            while (i3 < length2) {
                class_212 class_212Var = method_1964[i5];
                int i6 = i4 + 1;
                class_212VarArr[i4] = class_212Var;
                if (class_212Var == class_212.field_798 || class_212Var == class_212.field_810) {
                    zArr[i6] = true;
                    i = length + 1;
                    zArr[i6 - 1] = true;
                    class_212VarArr[i6] = class_212Var;
                    i6++;
                } else {
                    i = length;
                }
                int i7 = i5 + 1;
                i3 = i7;
                length = i;
                i4 = i6;
                i5 = i7;
            }
            class_337 method_415 = class_70Var.method_415();
            class_337 class_337Var = method_415;
            class_337 class_337Var2 = method_415;
            while (class_337Var != null) {
                if ((class_337Var2.method_1038() instanceof class_226) || (class_337Var2.method_1038() instanceof class_24)) {
                    class_508 class_508Var = (class_508) class_337Var2.method_1038();
                    int method_47 = class_508Var.method_47();
                    iArr[method_47] = iArr[method_47] + 1;
                    if (class_212VarArr[method_47] == null) {
                        class_212VarArr[method_47] = class_508Var.method_32(class_202Var.method_917());
                    }
                    if ((class_508Var.method_1387(class_202Var.method_917()) == 2 || class_508Var.method_896(class_202Var.method_917()) == 2) && method_47 + 1 < method_928) {
                        zArr[method_47] = true;
                        zArr[method_47 + 1] = true;
                    }
                }
                class_337 method_4152 = class_337Var2.method_415();
                class_337Var = method_4152;
                class_337Var2 = method_4152;
            }
            int i8 = 0;
            while (true) {
                int i9 = i8;
                if (i8 >= iArr.length) {
                    break;
                }
                i8 = i9 + 1;
                iArr[i9] = (iArr[i9] << 16) | i9;
            }
            Arrays.sort(iArr);
            boolean z = false;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length && !z) {
                if (class_212VarArr[i11] != null) {
                    int i12 = method_928 - 1;
                    int i13 = i12;
                    int i14 = i12;
                    while (true) {
                        if (i13 < 0) {
                            break;
                        }
                        int i15 = iArr[i14] & 65535;
                        if (i15 <= i11 || zArr[i11] || zArr[i15] || class_212VarArr[i15] == null) {
                            int i16 = i14 - 1;
                            i13 = i16;
                            i14 = i16;
                        } else {
                            class_116.field_553++;
                            class_337 method_4153 = class_70Var.method_415();
                            class_337 class_337Var3 = method_4153;
                            class_337 class_337Var4 = method_4153;
                            while (class_337Var3 != null) {
                                if (!(class_337Var4.method_1038() instanceof class_508 class_508Var2)) {
                                    if (class_337Var4.method_1038() instanceof class_398 class_398Var) {
                                        if (class_398Var.method_47() != i11) {
                                            if (class_398Var.method_47() == i15) {
                                                class_398Var.method_46(i11);
                                            }
                                        } else {
                                            class_398Var.method_46(i15);
                                        }
                                    }
                                } else {
                                    if (class_508Var2.method_47() != i11) {
                                        if (class_508Var2.method_47() == i15) {
                                            class_508Var2.method_46(i11);
                                        }
                                    } else {
                                        class_508Var2.method_46(i15);
                                    }
                                }
                                class_337 method_4154 = class_337Var4.method_415();
                                class_337Var3 = method_4154;
                                class_337Var4 = method_4154;
                            }
                            class_337 method_4155 = class_70Var.method_415();
                            if (i15 >= length) {
                                class_70Var.method_449(class_70Var.method_449(method_4155, class_563.method_1972(class_212VarArr[i11], i15)), class_563.method_1984(class_212VarArr[i11], i11));
                            } else {
                                class_70Var.method_449(class_70Var.method_449(class_70Var.method_449(class_70Var.method_449(method_4155, class_563.method_1972(class_212VarArr[i11], i15)), class_563.method_1972(class_212VarArr[i15], i11)), class_563.method_1984(class_212VarArr[i15], i15)), class_563.method_1984(class_212VarArr[i11], i11));
                            }
                            z = true;
                        }
                    }
                }
                int i17 = i11 + 1;
                i10 = i17;
                i11 = i17;
            }
            if (z) {
                int i18 = i11 + 1;
            }
        }
    }

    public boolean method_1341(class_389[] class_389VarArr) {
        if (class_389VarArr == null) {
            return true;
        }
        int i = 0;
        int i2 = 0;
        while (i < class_389VarArr.length) {
            class_389 class_389Var = class_389VarArr[i2];
            if (!(class_389Var instanceof class_270) && !(class_389Var instanceof class_139)) {
                return false;
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0309  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void method_1335(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var) {
        class_459 class_459Var;
        class_337 class_337Var;
        class_337 class_337Var2;
        int method_896;
        class_337 class_337Var3;
        class_337 class_337Var4;
        boolean z;
        class_337 class_337Var5;
        class_337 class_337Var6;
        class_337 method_415 = class_70Var.method_415();
        class_337 class_337Var7 = method_415;
        class_337 class_337Var8 = method_415;
        while (class_337Var7 != null) {
            if (class_337Var8.method_1038() instanceof class_459 class_459Var2) {
                if (class_544.method_1932().method_1210(this.field_1088, class_202Var, class_591Var, class_459Var2.method_623(class_202Var.method_917()), class_459Var2.method_1086(class_202Var.method_917()))) {
                    class_208 method_917 = class_202Var.method_917();
                    int method_1387 = class_459Var2.method_1387(method_917);
                    class_337 class_337Var9 = null;
                    if (method_1387 > 0) {
                        if (class_337Var8.method_415() != null && (((class_337Var8.method_415().method_1038() instanceof class_87) || (class_337Var8.method_415().method_1038() instanceof class_578)) && class_337Var8.method_415().method_1038().method_896(method_917) == method_1387)) {
                            class_337Var9 = class_337Var8.method_415();
                        }
                        if (class_337Var9 == null) {
                            if (class_212.field_802.equals(class_459Var2.method_1085(class_202Var.method_917())) || class_212.field_801.equals(class_459Var2.method_1085(class_202Var.method_917())) || class_212.field_795.equals(class_459Var2.method_1085(class_202Var.method_917())) || class_212.field_813.equals(class_459Var2.method_1085(class_202Var.method_917())) || class_212.field_806.equals(class_459Var2.method_1085(class_202Var.method_917()))) {
                                class_70Var.method_412(class_337Var8, new class_94(0));
                            } else if (!class_212.field_798.equals(class_459Var2.method_1085(class_202Var.method_917()))) {
                                if (class_212.field_812.equals(class_459Var2.method_1085(class_202Var.method_917()))) {
                                    class_70Var.method_412(class_337Var8, new class_249(0.0f));
                                } else if (class_212.field_810.equals(class_459Var2.method_1085(class_202Var.method_917()))) {
                                    class_70Var.method_412(class_337Var8, new class_114(0.0d));
                                } else if (!(class_459Var2.method_1085(class_202Var.method_917()) instanceof class_594)) {
                                    if (!(class_459Var2.method_1085(class_202Var.method_917()) instanceof class_392)) {
                                        AllatoriLogger.method_681("[remove-calls] Cannot remove call (" + class_459Var2.method_623(method_917) + "." + class_459Var2.method_1086(method_917) + ") in " + class_202Var.method_198() + "." + class_591Var.method_198() + " - return value is used");
                                    } else {
                                        class_70Var.method_412(class_337Var8, new class_467());
                                    }
                                } else {
                                    class_70Var.method_412(class_337Var8, new class_467());
                                }
                            } else {
                                class_70Var.method_412(class_337Var8, new class_60(0L));
                            }
                            AllatoriLogger.method_681("[remove-calls] return value of " + class_459Var2.method_623(method_917) + "." + class_459Var2.method_1086(method_917) + " in " + class_202Var.method_198() + "." + class_591Var.method_198() + " was replaced with null (0)");
                            class_459Var = class_459Var2;
                            class_337Var = class_337Var8;
                            class_337Var2 = class_337Var8;
                            method_896 = class_459Var.method_896(method_917);
                            class_337Var3 = class_337Var8;
                            while (class_337Var2.method_419() != null && method_896 != 0) {
                                class_337 method_419 = class_337Var3.method_419();
                                method_896 -= method_419.method_1038().method_1387(method_917) - method_419.method_1038().method_896(method_917);
                                class_337Var2 = method_419;
                                class_337Var3 = method_419;
                            }
                            if (method_896 == 0) {
                                AllatoriLogger.method_681("[remove-calls] Cannot remove call (" + class_459Var2.method_623(method_917) + "." + class_459Var2.method_1086(method_917) + ") in " + class_202Var.method_198() + "." + class_591Var.method_198() + " - parameters not found");
                            } else {
                                int i = 0;
                                class_337 class_337Var10 = class_337Var3;
                                while (true) {
                                    class_337 class_337Var11 = class_337Var10;
                                    class_337 class_337Var12 = class_337Var10;
                                    while (class_337Var11 != class_337Var && class_337Var12.method_415() != null) {
                                        class_337Var10 = class_337Var12.method_415();
                                        if (!method_1341(class_337Var10.method_1398())) {
                                            i++;
                                            class_337Var11 = class_337Var10;
                                            class_337Var12 = class_337Var10;
                                        }
                                    }
                                }
                                /*
                                if (i == 1) {
                                    boolean z2 = false;
                                    class_389[] method_1398 = class_337Var.method_1398();
                                    if (method_1398 != null) {
                                        int length = method_1398.length;
                                        int i2 = 0;
                                        int i3 = 0;
                                        while (i2 < length) {
                                            class_389 class_389Var = method_1398[i3];
                                            if (!(class_389Var instanceof class_270) && !(class_389Var instanceof class_139) && (class_389Var instanceof class_135)) {
                                                z2 = true;
                                            }
                                            int i4 = i3 + 1;
                                            i2 = i4;
                                            i3 = i4;
                                        }
                                    }
                                    if (z2 && class_337Var3 != class_337Var) {
                                        class_337Var.method_48(class_93.field_456);
                                        i = 0;
                                        class_337Var4 = class_337Var.method_419();
                                        if (i > 0) {
                                            class_337 method_4152 = class_337Var4.method_415();
                                            if (method_4152 != null) {
                                                class_389[] method_13982 = class_337Var3.method_1398();
                                                if (method_13982 != null) {
                                                    int length2 = method_13982.length;
                                                    int i5 = 0;
                                                    int i6 = 0;
                                                    while (i5 < length2) {
                                                        class_389 class_389Var2 = method_13982[i6];
                                                        if (!(class_389Var2 instanceof class_270) && !(class_389Var2 instanceof class_139)) {
                                                            class_389Var2.method_52(class_337Var3, method_4152);
                                                        }
                                                        int i7 = i6 + 1;
                                                        i5 = i7;
                                                        i6 = i7;
                                                    }
                                                }
                                                class_337 class_337Var13 = method_4152;
                                                do {
                                                    class_337Var13 = class_337Var13.method_419();
                                                    method_1313(class_337Var13, method_4152);
                                                    method_1330(class_337Var13, method_4152);
                                                    if (class_337Var13 == class_337Var3) {
                                                        break;
                                                    }
                                                } while (class_337Var13.method_419() != null);
                                                class_337 class_337Var14 = class_337Var4;
                                                class_337 class_337Var15 = class_337Var4;
                                                while (true) {
                                                    if (class_337Var14 == class_337Var3) {
                                                        z = false;
                                                        class_337Var5 = class_337Var3;
                                                        break;
                                                    } else if (class_337Var15.method_1038() instanceof class_559) {
                                                        class_337Var5 = class_337Var15.method_415();
                                                        z = true;
                                                        break;
                                                    } else {
                                                        class_337 method_4192 = class_337Var15.method_419();
                                                        class_337Var14 = method_4192;
                                                        class_337Var15 = method_4192;
                                                    }
                                                }
                                                if (!z) {
                                                    try {
                                                        class_70Var.method_450(class_337Var5, class_337Var4);
                                                        class_337Var6 = method_4152;
                                                    } catch (Exception e) {
                                                        class_337Var6 = method_4152;
                                                    }
                                                } else {
                                                    class_337 class_337Var16 = class_337Var5;
                                                    int method_8962 = class_337Var4.method_1038().method_896(method_917);
                                                    class_337 class_337Var17 = class_337Var5;
                                                    while (class_337Var16 != class_337Var4) {
                                                        int method_13872 = method_8962 - (class_337Var17.method_1038().method_1387(method_917) - class_337Var17.method_1038().method_896(method_917));
                                                        class_337 method_4153 = class_337Var17.method_415();
                                                        class_337Var16 = method_4153;
                                                        method_8962 = method_13872;
                                                        class_337Var17 = method_4153;
                                                    }
                                                    int i8 = 0;
                                                    int i9 = 0;
                                                    while (i8 < method_8962) {
                                                        int i10 = i9 + 1;
                                                        class_70Var.method_412(class_337Var4, new class_87());
                                                        i8 = i10;
                                                        i9 = i10;
                                                    }
                                                    try {
                                                        class_70Var.method_450(class_337Var5, class_337Var4);
                                                        class_337Var6 = method_4152;
                                                    } catch (Exception e2) {
                                                        class_337Var6 = method_4152;
                                                    }
                                                }
                                                class_337Var8 = class_337Var6.method_419() != null ? method_4152.method_419() : method_4152;
                                            } else {
                                                AllatoriLogger.method_681("[remove-calls] Cannot remove call (" + class_459Var2.method_623(method_917) + "." + class_459Var2.method_1086(method_917) + ") in " + class_202Var.method_198() + "." + class_591Var.method_198() + " - unexpected end of block");
                                            }
                                        } else {
                                            AllatoriLogger.method_681("[remove-calls] Cannot remove call (" + class_459Var2.method_623(method_917) + "." + class_459Var2.method_1086(method_917) + ") in " + class_202Var.method_198() + "." + class_591Var.method_198() + " - targeters inside block");
                                        }
                                    }
                                }
                                class_337Var4 = class_337Var;
                                if (i > 0) {
                                }*/
                            }
                        }
                    } else {
                        class_337Var9 = class_337Var8;
                    }
                    class_459Var = class_459Var2;
                    class_337Var = class_337Var9;
                    class_337Var2 = class_337Var8;
                    method_896 = class_459Var.method_896(method_917);
                    class_337Var3 = class_337Var8;
                    while (class_337Var2.method_419() != null) {
                        class_337 method_4193 = class_337Var3.method_419();
                        method_896 -= method_4193.method_1038().method_1387(method_917) - method_4193.method_1038().method_896(method_917);
                        class_337Var2 = method_4193;
                        class_337Var3 = method_4193;
                    }
                    if (method_896 == 0) {
                    }
                }
            }
            class_337 method_4154 = class_337Var8.method_415();
            class_337Var7 = method_4154;
            class_337Var8 = method_4154;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fa, code lost:
    
        if (r5 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0109, code lost:
    
        if (java.lang.Math.abs(r1.method_47() - r5.method_47()) > 32000) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010b, code lost:
    
        p000.class_116.field_562++;
        ((p000.class_559) r1.method_1038()).method_51(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void method_1329(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var) {
        class_337 class_337Var = null;
        class_70Var.method_411();
        class_337 method_415 = class_70Var.method_415();
        class_337 class_337Var2 = method_415;
        class_337 class_337Var3 = method_415;
        while (class_337Var2 != null) {
            if (class_337Var3.method_1038() instanceof class_502) {
                class_337 method_419 = ((class_502) class_337Var3.method_1038()).getF940();
                if (method_419 != null && method_419 != class_337Var3 && ((method_419.method_1038() instanceof class_502) || (method_419.method_1038() instanceof class_288))) {
                    if (method_419.method_1038() instanceof class_502) {
                        class_337 class_337Var4 = method_419;
                        int i = 0;
                        class_337 class_337Var5 = method_419;
                        while (class_337Var4 != null && (class_337Var5.method_1038() instanceof class_502) && i < 100) {
                            i++;
                            class_337 method_4192 = ((class_502) class_337Var5.method_1038()).getF940();
                            class_337Var4 = method_4192;
                            class_337Var5 = method_4192;
                        }
                    }
                    if (method_419 != null) {
                        if (!(method_419.method_1038() instanceof class_288)) {
                            if (Math.abs(class_337Var3.method_47() - method_419.method_47()) <= 32000) {
                                class_116.field_549++;
                                ((class_502) class_337Var3.method_1038()).method_51(method_419);
                                class_337Var = class_337Var3;
                            }
                        } else {
                            class_116.field_544++;
                            class_70Var.method_412(class_337Var3, method_419.method_1038());
                            class_337Var = class_337Var3.method_415();
                            method_1340(class_337Var.method_419().method_1398(), class_337Var.method_419(), class_337Var);
                            try {
                                class_70Var.method_420(class_337Var.method_419());
                            } catch (Exception e) {
                                method_1314((FinalExceptionProxy) e, class_337Var);
                            }
                        }
                        class_337Var3 = class_337Var;
                    }
                }
            } else {
                if (class_337Var3.method_1038() instanceof class_559) {
                    class_337 method_4193 = ((class_559) class_337Var3.method_1038()).getF940();
                    if (method_4193 != null && (method_4193.method_1038() instanceof class_502)) {
                        class_337 class_337Var6 = method_4193;
                        int i2 = 0;
                        class_337 class_337Var7 = method_4193;
                        while (class_337Var6 != null && (class_337Var7.method_1038() instanceof class_502) && i2 < 100) {
                            i2++;
                            class_337 method_4194 = ((class_502) class_337Var7.method_1038()).getF940();
                            class_337Var6 = method_4194;
                            class_337Var7 = method_4194;
                        }
                    }
                }
                class_337Var = class_337Var3;
                class_337Var3 = class_337Var;
            }
            class_337 method_4152 = class_337Var3.method_415();
            class_337Var2 = method_4152;
            class_337Var3 = method_4152;
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:6:0x0011 */
    public void method_1320(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var) {
        class_502 class_502Var;
        class_337 method_419;
        class_337 method_415 = class_70Var.method_415();
        class_337 class_337Var = method_415;
        class_337 class_337Var2 = method_415;
        while (class_337Var != null) {
            if ((class_337Var2.method_1038() instanceof class_502) && method_1341(class_337Var2.method_1398()) && (method_419 = (class_502Var = (class_502) class_337Var2.method_1038()).getF940()) != null && method_419.method_415() != null && (method_419.method_1038() instanceof class_226)) {
                class_502Var.method_51(method_419.method_415());
                class_70Var.method_437(class_502Var, method_419.method_1038().method_1038());
                class_116.field_561++;
            }
            class_337 method_4152 = class_337Var2.method_415();
            class_337Var = method_4152;
            class_337Var2 = method_4152;
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:6:0x0013 */
    public void method_1315(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var) {
        class_450 class_450Var;
        class_337[] method_446;
        class_337 method_415 = class_70Var.method_415();
        class_337 class_337Var = method_415;
        class_337 class_337Var2 = method_415;
        while (class_337Var != null) {
            if ((class_337Var2.method_1038() instanceof class_450) && (method_446 = (class_450Var = (class_450) class_337Var2.method_1038()).method_446()) != null && method_446.length != 0) {
                int length = method_446.length;
                int i = 0;
                int i2 = 0;
                class_337 class_337Var3 = null;
                class_337 class_337Var4 = null;
                while (i < length) {
                    class_337 class_337Var5 = method_446[i2];
                    if (class_337Var5 != null && class_337Var4 == null && !(class_337Var5.method_1038() instanceof class_272) && !(class_337Var5.method_1038() instanceof class_343) && class_337Var5 != class_450Var.getF940()) {
                        class_337Var4 = class_337Var5;
                    }
                    if (class_337Var5 != null && class_337Var5.method_419() != null && ((class_337Var5.method_419().method_1038() instanceof class_292) || (class_337Var5.method_419().method_1038() instanceof class_288))) {
                        class_337Var3 = class_337Var5.method_419();
                    }
                    int i3 = i2 + 1;
                    i = i3;
                    i2 = i3;
                }
                if (class_337Var4 != null && class_337Var3 != null) {
                    class_70Var.method_411();
                    if (Math.abs(class_337Var4.method_47() - class_337Var3.method_47()) > 32000) {
                        class_337Var3 = null;
                    }
                }
                if (class_337Var4 != null && class_337Var3 != null) {
                    class_116.field_558++;
                    class_272 method_1979 = class_563.method_1979(ASMInterface.field_1360, null);
                    class_70Var.method_439(class_337Var4, method_1979);
                    method_1979.method_51(class_70Var.method_439(class_337Var3, new class_292(class_70Var.method_412(class_337Var4, new class_94(0)))));
                } else if (class_337Var4 != null) {
                    class_116.field_558++;
                    class_337 method_412 = class_70Var.method_412(class_337Var4, new class_94(0));
                    class_70Var.method_439(method_412, new class_245(method_412));
                }
            }
            class_337 method_4152 = class_337Var2.method_415();
            class_337Var = method_4152;
            class_337Var2 = method_4152;
        }
    }

    public void method_1308(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var) {
    }

    public void method_1344(class_202 class_202Var, class_591 class_591Var, class_70 class_70Var) {
        class_337 class_337Var = null;
        class_70Var.method_411();
        class_337 method_415 = class_70Var.method_415();
        class_337 class_337Var2 = method_415;
        class_337 class_337Var3 = method_415;
        while (class_337Var2 != null) {
            class_337 class_337Var4 = class_337Var3.method_1038() instanceof class_559 ? class_337Var3 : class_337Var;
            if (class_337Var3.method_1038() instanceof class_292 class_292Var) {
                if (class_337Var3.method_415() != null && class_292Var.getF940() != null && class_337Var3.method_415() != class_292Var.getF940() && class_337Var3.method_415().method_415() != class_292Var.getF940() && class_337Var3.method_47() <= class_292Var.getF940().method_47()) {
                    class_559 class_559Var = null;
                    class_337 method_4152 = class_337Var3.method_415();
                    if (method_4152.method_1398() != null) {
                        class_389[] method_1398 = method_4152.method_1398();
                        int length = method_1398.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            class_389 class_389Var = method_1398[i2];
                            int i3 = i2 + 1;
                            i = i3;
                            i2 = i3;
                            class_559Var = class_389Var instanceof class_559 ? (class_559) class_389Var : class_559Var;
                        }
                        if (class_337Var4 != null && class_337Var4.method_1038() == class_559Var && class_337Var4.method_415() != null && class_337Var4.method_415().method_415() != null && class_337Var4.method_415() != class_337Var3 && class_337Var4.method_415().method_415() != class_337Var3) {
                            boolean z = true;
                            class_337 class_337Var5 = class_337Var4;
                            class_337 class_337Var6 = class_337Var4;
                            while (true) {
                                if (class_337Var5 == null) {
                                    break;
                                }
                                if (class_337Var6 == method_4152) {
                                    class_389[] method_13982 = method_4152.method_1398();
                                    int length2 = method_13982.length;
                                    int i4 = 0;
                                    int i5 = 0;
                                    while (true) {
                                        if (i4 >= length2) {
                                            break;
                                        }
                                        class_389 class_389Var2 = method_13982[i5];
                                        if ((class_389Var2 instanceof class_270) || (class_389Var2 instanceof class_139) || class_389Var2 == class_559Var) {
                                            int i6 = i5 + 1;
                                            i4 = i6;
                                            i5 = i6;
                                        } else {
                                            z = false;
                                            break;
                                        }
                                    }
                                } else if (!method_1341(class_337Var6.method_1398())) {
                                    z = false;
                                    break;
                                } else {
                                    class_337 method_4153 = class_337Var6.method_415();
                                    class_337Var5 = method_4153;
                                    class_337Var6 = method_4153;
                                }
                            }
                            if (z) {
                                class_539 method_1038 = method_4152.method_1038();
                                if ((((method_1038 instanceof class_226) && method_1038.equals(class_337Var4.method_415().method_1038())) || ((method_1312(method_1038) && method_1333(method_1038, class_337Var4.method_415().method_1038(), class_202Var.method_917())) || ((method_1038 instanceof class_343) && method_1038.equals(class_337Var4.method_415().method_1038())))) && method_1038.method_1387(class_202Var.method_917()) == 1 && class_559Var.method_896(class_202Var.method_917()) == 1) {
                                    class_116.field_545++;
                                    class_70Var.method_449(class_337Var4, method_1038.method_1038());
                                    class_70Var.method_449(class_337Var4, class_93.field_426);
                                    method_1313(class_337Var4.method_415(), class_337Var4.method_415().method_415());
                                    method_1330(class_337Var4.method_415(), class_337Var4.method_415().method_415());
                                    try {
                                        class_70Var.method_420(class_337Var4.method_415());
                                    } catch (Exception e) {
                                    }
                                    class_559Var.method_51(method_4152.method_415());
                                    method_1313(method_4152, method_4152.method_415());
                                    method_1330(method_4152, method_4152.method_415());
                                    try {
                                        class_70Var.method_420(method_4152);
                                    } catch (Exception e2) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class_337 method_4154 = class_337Var3.method_415();
            class_337Var2 = method_4154;
            class_337Var = class_337Var4;
            class_337Var3 = method_4154;
        }
    }

    public void method_1313(class_337 class_337Var, class_337 class_337Var2) {
        if (class_337Var2 == null || class_337Var.method_1398() == null) {
            return;
        }
        if (class_337Var2.method_1398() != null) {
            class_389[] method_1398 = class_337Var2.method_1398();
            int length = method_1398.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                if (method_1398[i2] instanceof class_270) {
                    return;
                }
                int i3 = i2 + 1;
                i = i3;
                i2 = i3;
            }
        }
        class_389[] method_13982 = class_337Var.method_1398();
        int length2 = method_13982.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length2) {
            class_389 class_389Var = method_13982[i5];
            if (class_389Var instanceof class_270) {
                class_389Var.method_52(class_337Var, class_337Var2);
            }
            int i6 = i5 + 1;
            i4 = i6;
            i5 = i6;
        }
    }
}
