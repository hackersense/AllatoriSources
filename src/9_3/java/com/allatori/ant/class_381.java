package com.allatori.ant;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_381 {
    public class_606 field_1203;
    public class_202 field_1204;
    public int[] field_1205;
    public TreeSet field_1206 = new TreeSet();

    public void method_1514(class_476 class_476Var, class_208 class_208Var) {
        if (class_476Var instanceof class_511) {
            method_1507(((class_511) class_476Var).method_1864(), class_208Var);
            return;
        }
        if (class_476Var instanceof class_125) {
            List method_628 = ((class_125) class_476Var).method_628();
            int size = method_628.size() - 1;
            int i = size;
            int i2 = size;
            while (i >= 0) {
                int i3 = i2 - 1;
                method_1514((class_476) method_628.get(i2), class_208Var);
                i = i3;
                i2 = i3;
            }
            return;
        }
        if (class_476Var instanceof class_111) {
            method_1512(((class_111) class_476Var).method_556(), class_208Var);
            return;
        }
        if (class_476Var instanceof class_558) {
            method_1512(((class_558) class_476Var).method_556(), class_208Var);
            method_1512(((class_558) class_476Var).method_555(), class_208Var);
        } else if (class_476Var instanceof class_88) {
            method_1512(((class_88) class_476Var).method_555(), class_208Var);
        }
    }

    public void method_1502(class_574 class_574Var) {
        class_574Var.method_2011(this.field_1205[class_574Var.method_2009()]);
        List method_2015 = class_574Var.method_2015();
        int size = method_2015.size() - 1;
        int i = size;
        int i2 = size;
        while (i >= 0) {
            class_410 class_410Var = (class_410) method_2015.get(i2);
            int i3 = i2 - 1;
            class_410Var.method_1564(this.field_1205[class_410Var.method_1569()]);
            method_1501(class_410Var.method_1567());
            i = i3;
            i2 = i3;
        }
    }

    public void method_1517(class_160[] class_160VarArr, class_208 class_208Var, boolean z, boolean z2) {
        int length = class_160VarArr.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            class_160 class_160Var = class_160VarArr[i2];
            class_160Var.method_498(class_208Var.method_502());
            if (!(class_160Var instanceof class_228) && !(class_160Var instanceof class_129) && ((!z || !(class_160Var instanceof class_72)) && (!z2 || (!(class_160Var instanceof class_121) && !(class_160Var instanceof class_518))))) {
                method_1512(class_160Var.method_433(), class_208Var);
            }
            if (class_160Var instanceof class_576) {
                class_576 class_576Var = (class_576) class_160Var;
                method_1517(class_576Var.method_906(), class_208Var, z, z2);
                class_372[] method_2023 = class_576Var.method_2023();
                int length2 = method_2023.length - 1;
                int i3 = length2;
                int i4 = length2;
                while (i3 >= 0) {
                    int i5 = i4 - 1;
                    method_1512(method_2023[i4].method_183(), class_208Var);
                    i3 = i5;
                    i4 = i5;
                }
            } else if (!(class_160Var instanceof class_257)) {
                if (!(class_160Var instanceof class_221)) {
                    if (class_160Var instanceof class_224) {
                        int[] method_434 = ((class_224) class_160Var).method_434();
                        int length3 = method_434.length - 1;
                        int i6 = length3;
                        int i7 = length3;
                        while (i6 >= 0) {
                            int i8 = i7 - 1;
                            method_1512(method_434[i7], class_208Var);
                            i6 = i8;
                            i7 = i8;
                        }
                    } else if (class_160Var instanceof class_121) {
                        if (!z2) {
                            class_367[] method_626 = ((class_121) class_160Var).method_626();
                            int length4 = method_626.length - 1;
                            int i9 = length4;
                            int i10 = length4;
                            while (i9 >= 0) {
                                method_1512(method_626[i10].method_433(), class_208Var);
                                method_1512(method_626[i10].method_183(), class_208Var);
                                int i11 = i10 - 1;
                                method_1512(method_626[i10].method_47(), class_208Var);
                                i9 = i11;
                                i10 = i11;
                            }
                        }
                    } else if (!(class_160Var instanceof class_332)) {
                        if (class_160Var instanceof class_40) {
                            class_368[] method_181 = ((class_40) class_160Var).method_181();
                            int length5 = method_181.length - 1;
                            int i12 = length5;
                            int i13 = length5;
                            while (i12 >= 0) {
                                method_1512(method_181[i13].method_927(), class_208Var);
                                int i14 = i13 - 1;
                                method_1512(method_181[i13].method_183(), class_208Var);
                                i12 = i14;
                                i13 = i14;
                            }
                        } else if (class_160Var instanceof class_233) {
                            class_233 class_233Var = (class_233) class_160Var;
                            method_1512(class_233Var.method_928(), class_208Var);
                            method_1512(class_233Var.method_183(), class_208Var);
                        } else if (!(class_160Var instanceof class_72)) {
                            if (class_160Var instanceof class_599) {
                                method_1512(((class_599) class_160Var).method_183(), class_208Var);
                            } else if (class_160Var instanceof class_157) {
                                class_353[] method_772 = ((class_157) class_160Var).method_772();
                                int length6 = method_772.length - 1;
                                int i15 = length6;
                                int i16 = length6;
                                while (i15 >= 0) {
                                    class_353 class_353Var = method_772[i16];
                                    class_112[] method_500 = class_353Var.method_500();
                                    int length7 = method_500.length - 1;
                                    int i17 = length7;
                                    int i18 = length7;
                                    while (i17 >= 0) {
                                        class_112 class_112Var = method_500[i18];
                                        if (class_112Var.method_619() == 7) {
                                            method_1512(class_112Var.method_47(), class_208Var);
                                        }
                                        int i19 = i18 - 1;
                                        i17 = i19;
                                        i18 = i19;
                                    }
                                    class_112[] method_504 = class_353Var.method_504();
                                    int length8 = method_504.length - 1;
                                    int i20 = length8;
                                    int i21 = length8;
                                    while (i20 >= 0) {
                                        class_112 class_112Var2 = method_504[i21];
                                        if (class_112Var2.method_619() == 7) {
                                            method_1512(class_112Var2.method_47(), class_208Var);
                                        }
                                        int i22 = i21 - 1;
                                        i20 = i22;
                                        i21 = i22;
                                    }
                                    int i23 = i16 - 1;
                                    i15 = i23;
                                    i16 = i23;
                                }
                            } else if (!(class_160Var instanceof class_569)) {
                                if (class_160Var instanceof class_518) {
                                    if (!z2) {
                                        class_518 class_518Var = (class_518) class_160Var;
                                        method_1512(class_518Var.method_928(), class_208Var);
                                        if (class_518Var.method_183() != 0) {
                                            method_1512(class_518Var.method_183(), class_208Var);
                                        }
                                    }
                                } else if (!(class_160Var instanceof class_213)) {
                                    if (class_160Var instanceof class_452) {
                                        class_262[] method_1717 = ((class_452) class_160Var).method_1717();
                                        int length9 = method_1717.length;
                                        int i24 = 0;
                                        int i25 = 0;
                                        while (i24 < length9) {
                                            class_262 class_262Var = method_1717[i25];
                                            method_1512(class_262Var.method_47(), class_208Var);
                                            int[] method_4342 = class_262Var.method_434();
                                            int length10 = method_4342.length;
                                            int i26 = 0;
                                            int i27 = 0;
                                            while (i26 < length10) {
                                                int i28 = i27 + 1;
                                                method_1512(method_4342[i27], class_208Var);
                                                i26 = i28;
                                                i27 = i28;
                                            }
                                            int i29 = i25 + 1;
                                            i24 = i29;
                                            i25 = i29;
                                        }
                                    } else if (class_160Var instanceof class_580) {
                                        class_75[] method_2028 = ((class_580) class_160Var).method_2028();
                                        int length11 = method_2028.length;
                                        int i30 = 0;
                                        int i31 = 0;
                                        while (i30 < length11) {
                                            class_75 class_75Var = method_2028[i31];
                                            if (class_75Var.method_500() != null) {
                                                class_112[] method_5002 = class_75Var.method_500();
                                                int length12 = method_5002.length;
                                                int i32 = 0;
                                                int i33 = 0;
                                                while (i32 < length12) {
                                                    class_112 class_112Var3 = method_5002[i33];
                                                    if (class_112Var3.method_619() == 7) {
                                                        method_1512(class_112Var3.method_47(), class_208Var);
                                                    }
                                                    int i34 = i33 + 1;
                                                    i32 = i34;
                                                    i33 = i34;
                                                }
                                            }
                                            if (class_75Var.method_504() != null) {
                                                class_112[] method_5042 = class_75Var.method_504();
                                                int length13 = method_5042.length;
                                                int i35 = 0;
                                                int i36 = 0;
                                                while (i35 < length13) {
                                                    class_112 class_112Var4 = method_5042[i36];
                                                    if (class_112Var4.method_619() == 7) {
                                                        method_1512(class_112Var4.method_47(), class_208Var);
                                                    }
                                                    int i37 = i36 + 1;
                                                    i35 = i37;
                                                    i36 = i37;
                                                }
                                            }
                                            int i38 = i31 + 1;
                                            i30 = i38;
                                            i31 = i38;
                                        }
                                    } else if (class_160Var instanceof class_205) {
                                        method_1512(((class_205) class_160Var).method_183(), class_208Var);
                                    } else if (class_160Var instanceof class_238) {
                                        int[] method_4343 = ((class_238) class_160Var).method_434();
                                        int length14 = method_4343.length - 1;
                                        int i39 = length14;
                                        int i40 = length14;
                                        while (i39 >= 0) {
                                            int i41 = i40 - 1;
                                            method_1512(method_4343[i40], class_208Var);
                                            i39 = i41;
                                            i40 = i41;
                                        }
                                    } else if (class_160Var instanceof class_46) {
                                        class_577[] method_196 = ((class_46) class_160Var).method_196();
                                        int length15 = method_196.length;
                                        int i42 = 0;
                                        int i43 = 0;
                                        while (i42 < length15) {
                                            int i44 = i43 + 1;
                                            method_1512(method_196[i43].method_433(), class_208Var);
                                            i42 = i44;
                                            i43 = i44;
                                        }
                                    } else if (class_160Var instanceof class_228) {
                                    }
                                } else {
                                    method_1514(class_476.method_1827(((class_213) class_160Var).method_1036(), class_208Var, false), class_208Var);
                                }
                            }
                        } else if (!z) {
                            method_1512(((class_72) class_160Var).method_183(), class_208Var);
                        }
                    }
                }
            } else {
                method_1512(((class_257) class_160Var).method_183(), class_208Var);
            }
            int i45 = i2 - 1;
            i = i45;
            i2 = i45;
        }
    }

    public void method_1512(int i, class_208 class_208Var) {
        if (i != -1) {
            this.field_1205[i] = 1;
            class_286 method_982 = class_208Var.method_982(i);
            if (method_982 != null) {
                int method_47 = class_208Var.method_47();
                int i2 = i + 1;
                int i3 = i2;
                int i4 = i2;
                while (i3 < method_47 && class_208Var.method_982(i4) == null) {
                    int i5 = i4 + 1;
                    this.field_1205[i4] = 1;
                    i3 = i5;
                    i4 = i5;
                }
            }
            if (method_982 instanceof class_43) {
                method_1512(((class_43) method_982).method_47(), class_208Var);
                return;
            }
            if (method_982 instanceof class_456) {
                class_456 class_456Var = (class_456) method_982;
                method_1512(class_456Var.method_47(), class_208Var);
                method_1512(class_456Var.method_433(), class_208Var);
                return;
            }
            if (method_982 instanceof class_538) {
                class_538 class_538Var = (class_538) method_982;
                method_1512(class_538Var.method_47(), class_208Var);
                method_1512(class_538Var.method_433(), class_208Var);
            } else {
                if (method_982 instanceof class_118) {
                    method_1512(((class_118) method_982).method_47(), class_208Var);
                    return;
                }
                if (method_982 instanceof class_520) {
                    method_1512(((class_520) method_982).method_433(), class_208Var);
                } else {
                    if (!(method_982 instanceof class_248)) {
                        if (method_982 instanceof class_252) {
                            method_1512(((class_252) method_982).method_47(), class_208Var);
                            return;
                        }
                        return;
                    }
                    method_1512(((class_248) method_982).method_47(), class_208Var);
                }
            }
        }
    }

    public void method_1515(class_202 class_202Var) {
        class_208 method_917 = class_202Var.method_917();
        this.field_1205 = new int[method_917.method_47()];
        Arrays.fill(this.field_1205, 0);
        method_1512(0, method_917);
        method_1512(class_202Var.method_928(), method_917);
        method_1512(class_202Var.method_927(), method_917);
        int[] method_434 = class_202Var.method_434();
        int length = method_434.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            int i3 = i2 - 1;
            method_1512(method_434[i2], method_917);
            i = i3;
            i2 = i3;
        }
        method_1517(class_202Var.method_906(), method_917, false, false);
        method_1519(class_202Var.method_908(), method_917);
        class_557[] method_904 = class_202Var.method_904();
        int length2 = method_904.length - 1;
        int i4 = length2;
        int i5 = length2;
        while (i4 >= 0) {
            class_557 class_557Var = method_904[i5];
            method_1512(class_557Var.method_183(), method_917);
            method_1512(class_557Var.method_928(), method_917);
            method_1517(class_557Var.method_906(), method_917, false, false);
            class_591 method_1067 = class_230.method_1067(class_557Var, class_202Var.method_198(), method_917, method_917.method_502());
            method_1516(method_1067, method_917);
            method_1519(method_1067.method_908(), method_917);
            int length3 = method_1067.method_1964().length - 1;
            int i6 = length3;
            int i7 = length3;
            while (i6 >= 0) {
                int i8 = i7 - 1;
                method_1511(method_1067.method_2043(i7), method_917);
                i6 = i8;
                i7 = i8;
            }
            int i9 = i5 - 1;
            i4 = i9;
            i5 = i9;
        }
        class_261[] method_898 = class_202Var.method_898();
        int length4 = method_898.length - 1;
        int i10 = length4;
        int i11 = length4;
        while (i10 >= 0) {
            class_261 class_261Var = method_898[i11];
            method_1512(class_261Var.method_183(), method_917);
            method_1512(class_261Var.method_928(), method_917);
            method_1517(class_261Var.method_906(), method_917, false, false);
            int i12 = i11 - 1;
            method_1519(new class_176(class_261Var, method_917).method_908(), method_917);
            i10 = i12;
            i11 = i12;
        }
        int method_47 = method_917.method_47() - 1;
        int i13 = method_47;
        int i14 = method_47;
        while (i13 >= 0) {
            class_286 method_982 = method_917.method_982(i14);
            if ((method_982 instanceof class_371) && "".equals(((class_371) method_982).method_198())) {
                method_1512(i14, method_917);
            }
            int i15 = i14 - 1;
            i13 = i15;
            i14 = i15;
        }
    }

    public class_381(class_606 class_606Var) {
        this.field_1203 = class_606Var;
    }

    public void method_1509(List list) {
        if (list == null) {
            return;
        }
        int size = list.size() - 1;
        int i = size;
        int i2 = size;
        while (i >= 0) {
            int i3 = i2 - 1;
            method_1502((class_574) list.get(i2));
            i = i3;
            i2 = i3;
        }
    }

    public void method_1513(class_591 class_591Var) {
        class_70 method_438 = class_591Var.method_438();
        if (method_438 == null) {
            return;
        }
        class_337[] method_446 = method_438.method_446();
        int length = method_446.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            class_539 method_1038 = method_446[i2].method_1038();
            if (method_1038 instanceof class_418) {
                class_418 class_418Var = (class_418) method_1038;
                class_418Var.method_46(this.field_1205[class_418Var.method_47()]);
            }
            int i3 = i2 - 1;
            i = i3;
            i2 = i3;
        }
    }

    public void method_1504(class_202 class_202Var, class_591 class_591Var, class_176 class_176Var) {
        class_160[] method_906 = class_202Var != null ? class_202Var.method_906() : null;
        if (class_591Var != null) {
            method_906 = class_591Var.method_906();
        }
        class_160[] method_9062 = class_176Var != null ? class_176Var.method_906() : method_906;
        if (class_591Var != null) {
            class_160[] method_2041 = class_591Var.method_2041();
            int length = method_2041.length - 1;
            int i = length;
            int i2 = length;
            while (i >= 0) {
                if (method_2041[i2] instanceof class_228) {
                    class_591Var.method_2079(method_2041[i2]);
                }
                int i3 = i2 - 1;
                i = i3;
                i2 = i3;
            }
        }
        if (method_9062 != null) {
            int length2 = method_9062.length - 1;
            int i4 = length2;
            int i5 = length2;
            while (i4 >= 0) {
                if (method_9062[i5] instanceof class_228) {
                    if (class_202Var != null) {
                        class_202Var.method_902(method_9062[i5]);
                    }
                    if (class_591Var != null) {
                        class_591Var.method_921(method_9062[i5]);
                    }
                    if (class_176Var != null) {
                        class_176Var.method_921(method_9062[i5]);
                    }
                }
                int i6 = i5 - 1;
                i4 = i6;
                i5 = i6;
            }
        }
    }

    public void method_1501(class_476 class_476Var) {
        if (!(class_476Var instanceof class_511)) {
            if (class_476Var instanceof class_125) {
                List method_628 = ((class_125) class_476Var).method_628();
                int size = method_628.size() - 1;
                int i = size;
                int i2 = size;
                while (i >= 0) {
                    int i3 = i2 - 1;
                    method_1501((class_476) method_628.get(i2));
                    i = i3;
                    i2 = i3;
                }
                return;
            }
            if (!(class_476Var instanceof class_111)) {
                if (class_476Var instanceof class_558) {
                    class_558 class_558Var = (class_558) class_476Var;
                    class_558Var.method_1967(this.field_1205[class_558Var.method_556()]);
                    class_558Var.method_551(this.field_1205[class_558Var.method_555()]);
                    return;
                } else {
                    if (class_476Var instanceof class_88) {
                        class_88 class_88Var = (class_88) class_476Var;
                        class_88Var.method_551(this.field_1205[class_88Var.method_555()]);
                        return;
                    }
                    return;
                }
            }
            class_111 class_111Var = (class_111) class_476Var;
            class_111Var.method_551(this.field_1205[class_111Var.method_556()]);
            return;
        }
        method_1502(((class_511) class_476Var).method_1864());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void method_1508(class_202 class_202Var) {
        int i;
        class_208 method_917 = class_202Var.method_917();
        int method_47 = method_917.method_47();
        int length = this.field_1205.length - 1;
        int i2 = length;
        int i3 = length;
        int i4 = 0;
        while (i2 >= 0) {
            int i5 = i3 - 1;
            int i6 = i4 + this.field_1205[i3];
            i2 = i5;
            i3 = i5;
            i4 = i6;
        }
        class_286[] class_286VarArr = new class_286[i4];
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < method_47) {
            class_286 method_982 = method_917.method_982(i8);
            if (this.field_1205[i8] == 1) {
                if (method_982 != null) {
                    method_982 = method_982.method_1263();
                }
                class_286VarArr[i9] = method_982;
                this.field_1205[i8] = i9;
                i = i9 + 1;
            } else {
                i = i9;
            }
            int i10 = i8 + 1;
            i7 = i10;
            i8 = i10;
            i9 = i;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < i4) {
            class_286 class_286Var = class_286VarArr[i12];
            if (class_286Var instanceof class_43) {
                class_43 class_43Var = (class_43) class_286Var;
                class_43Var.method_46(this.field_1205[class_43Var.method_47()]);
            } else if (class_286Var instanceof class_456) {
                class_456 class_456Var = (class_456) class_286Var;
                class_456Var.method_46(this.field_1205[class_456Var.method_47()]);
                class_456Var.method_407(this.field_1205[class_456Var.method_433()]);
            } else if (class_286Var instanceof class_538) {
                class_538 class_538Var = (class_538) class_286Var;
                class_538Var.method_407(this.field_1205[class_538Var.method_47()]);
                class_538Var.method_46(this.field_1205[class_538Var.method_433()]);
            } else if (class_286Var instanceof class_118) {
                class_118 class_118Var = (class_118) class_286Var;
                class_118Var.method_46(this.field_1205[class_118Var.method_47()]);
            } else if (class_286Var instanceof class_520) {
                class_520 class_520Var = (class_520) class_286Var;
                class_520Var.method_46(this.field_1205[class_520Var.method_433()]);
            } else if (class_286Var instanceof class_248) {
                class_248 class_248Var = (class_248) class_286Var;
                class_248Var.method_407(this.field_1205[class_248Var.method_47()]);
            } else if (class_286Var instanceof class_252) {
                class_252 class_252Var = (class_252) class_286Var;
                class_252Var.method_46(this.field_1205[class_252Var.method_47()]);
            }
            int i13 = i12 + 1;
            i11 = i13;
            i12 = i13;
        }
        class_208 class_208Var = new class_208(class_286VarArr);
        class_499 method_502 = class_208Var.method_502();
        class_202Var.method_919(class_208Var);
        class_202Var.method_853(this.field_1205[class_202Var.method_928()]);
        class_202Var.method_910(this.field_1205[class_202Var.method_927()]);
        class_160[] method_906 = class_202Var.method_906();
        int length2 = method_906.length;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length2) {
            int i16 = i15 + 1;
            class_202Var.method_902(method_906[i15]);
            i14 = i16;
            i15 = i16;
        }
        method_1506(method_906, method_502);
        int i17 = 0;
        int i18 = 0;
        while (i17 < length2) {
            int i19 = i18 + 1;
            class_202Var.method_921(method_906[i18]);
            i17 = i19;
            i18 = i19;
        }
        method_1504(class_202Var, null, null);
        method_1518(class_202Var, null);
        method_1503(class_202Var.method_908());
        class_557[] method_904 = class_202Var.method_904();
        int length3 = method_904.length - 1;
        int i20 = length3;
        int i21 = length3;
        while (i20 >= 0) {
            class_557 class_557Var = method_904[i21];
            boolean z = class_557Var.method_1965() == null;
            class_591 method_1067 = class_230.method_1067(class_557Var, class_202Var.method_198(), class_208Var, method_917.method_502());
            method_1513(method_1067);
            method_1506(method_1067.method_906(), method_502);
            method_1506(new class_160[]{method_1067.method_2068(class_208Var)}, method_502);
            method_1506(method_1067.method_2041(), method_502);
            method_1504(null, method_1067, null);
            method_1518(null, method_1067);
            method_1503(method_1067.method_908());
            int length4 = method_1067.method_1964().length - 1;
            int i22 = length4;
            int i23 = length4;
            while (i22 >= 0) {
                int i24 = i23 - 1;
                method_1509(method_1067.method_2043(i23));
                i22 = i24;
                i23 = i24;
            }
            if (!z) {
                int method_782 = class_544.method_1924().method_1484().method_782(this.field_1203, class_202Var, method_1067);
                class_544.method_1924().method_1484();
                if (method_782 != 4) {
                    class_557 method_2048 = method_1067.method_2048();
                    method_2048.method_853(this.field_1205[class_557Var.method_183()]);
                    method_2048.method_461(this.field_1205[class_557Var.method_928()]);
                    int i25 = i21 - 1;
                    class_202Var.method_911(method_2048, i21);
                    i20 = i25;
                    i21 = i25;
                }
            }
            method_1067.method_2065();
            class_557 method_20482 = method_1067.method_2048();
            method_20482.method_853(this.field_1205[class_557Var.method_183()]);
            method_20482.method_461(this.field_1205[class_557Var.method_928()]);
            int i252 = i21 - 1;
            class_202Var.method_911(method_20482, i21);
            i20 = i252;
            i21 = i252;
        }
        class_261[] method_898 = class_202Var.method_898();
        int length5 = method_898.length - 1;
        int i26 = length5;
        int i27 = length5;
        while (i26 >= 0) {
            class_261 class_261Var = method_898[i27];
            class_176 class_176Var = new class_176(class_261Var, method_917);
            class_176Var.method_919(class_208Var);
            method_1506(class_176Var.method_906(), method_502);
            method_1504(null, null, class_176Var);
            method_1518(null, class_176Var);
            method_1503(class_176Var.method_908());
            class_261 method_854 = class_176Var.method_854();
            method_854.method_853(this.field_1205[class_261Var.method_183()]);
            int i28 = i27 - 1;
            method_854.method_461(this.field_1205[class_261Var.method_928()]);
            class_202Var.method_905(class_261Var, method_854);
            i26 = i28;
            i27 = i28;
        }
    }

    public void method_1511(List list, class_208 class_208Var) {
        if (list == null) {
            return;
        }
        int size = list.size() - 1;
        int i = size;
        int i2 = size;
        while (i >= 0) {
            int i3 = i2 - 1;
            method_1507((class_574) list.get(i2), class_208Var);
            i = i3;
            i2 = i3;
        }
    }

    public void method_1516(class_591 class_591Var, class_208 class_208Var) {
        class_70 method_438 = class_591Var.method_438();
        if (method_438 != null) {
            class_337[] method_446 = method_438.method_446();
            int length = method_446.length - 1;
            int i = length;
            int i2 = length;
            while (i >= 0) {
                class_539 method_1038 = method_446[i2].method_1038();
                if (method_1038 instanceof class_418) {
                    method_1512(((class_418) method_1038).method_47(), class_208Var);
                }
                int i3 = i2 - 1;
                i = i3;
                i2 = i3;
            }
        }
    }

    public void method_1503(class_574[] class_574VarArr) {
        if (class_574VarArr != null) {
            int length = class_574VarArr.length - 1;
            int i = length;
            int i2 = length;
            while (i >= 0) {
                int i3 = i2 - 1;
                method_1502(class_574VarArr[i2]);
                i = i3;
                i2 = i3;
            }
        }
    }

    public void method_1505(class_202 class_202Var) {
        this.field_1204 = class_202Var;
        this.field_1206.clear();
        method_1515(class_202Var);
        method_1508(class_202Var);
    }

    public void method_1507(class_574 class_574Var, class_208 class_208Var) {
        if (method_1510(class_574Var)) {
            return;
        }
        method_1512(class_574Var.method_2009(), class_208Var);
        List method_2015 = class_574Var.method_2015();
        int size = method_2015.size() - 1;
        int i = size;
        int i2 = size;
        while (i >= 0) {
            class_410 class_410Var = (class_410) method_2015.get(i2);
            method_1512(class_410Var.method_1569(), class_208Var);
            int i3 = i2 - 1;
            method_1514(class_410Var.method_1567(), class_208Var);
            i = i3;
            i2 = i3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void method_1506(class_160[] class_160VarArr, class_499 class_499Var) {
        int length = class_160VarArr.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            class_160 class_160Var = class_160VarArr[i2];
            class_160Var.method_498(class_499Var);
            if (!(class_160Var instanceof class_40)) {
                class_160Var.method_407(this.field_1205[class_160Var.method_433()]);
            }
            if (class_160Var instanceof class_576) {
                class_576 class_576Var = (class_576) class_160Var;
                method_1506(class_576Var.method_906(), class_499Var);
                class_372[] method_2023 = class_576Var.method_2023();
                int length2 = method_2023.length - 1;
                int i3 = length2;
                int i4 = length2;
                while (i3 >= 0) {
                    int method_183 = method_2023[i4].method_183();
                    if (method_183 != 0) {
                        method_2023[i4].method_46(this.field_1205[method_183]);
                    }
                    int i5 = i4 - 1;
                    i3 = i5;
                    i4 = i5;
                }
            } else if (class_160Var instanceof class_257) {
                class_257 class_257Var = (class_257) class_160Var;
                class_257Var.method_461(this.field_1205[class_257Var.method_183()]);
            } else if (!(class_160Var instanceof class_221)) {
                if (class_160Var instanceof class_224) {
                    class_224 class_224Var = (class_224) class_160Var;
                    int[] method_434 = class_224Var.method_434();
                    int length3 = method_434.length - 1;
                    int i6 = length3;
                    int i7 = length3;
                    while (i6 >= 0) {
                        int i8 = i7 - 1;
                        method_434[i7] = this.field_1205[method_434[i7]];
                        i6 = i8;
                        i7 = i8;
                    }
                    class_224Var.method_1056(method_434);
                } else if (class_160Var instanceof class_121) {
                    class_367[] method_626 = ((class_121) class_160Var).method_626();
                    int length4 = method_626.length - 1;
                    int i9 = length4;
                    int i10 = length4;
                    while (i9 >= 0) {
                        method_626[i10].method_407(this.field_1205[method_626[i10].method_433()]);
                        method_626[i10].method_853(this.field_1205[method_626[i10].method_183()]);
                        int i11 = i10 - 1;
                        method_626[i10].method_46(this.field_1205[method_626[i10].method_47()]);
                        i9 = i11;
                        i10 = i11;
                    }
                } else if (!(class_160Var instanceof class_332)) {
                    if (class_160Var instanceof class_40) {
                        try {
                            class_368[] method_181 = ((class_40) class_160Var).method_181();
                            int length5 = method_181.length - 1;
                            while (length5 >= 0) {
                                method_181[length5].method_46(this.field_1205[method_181[length5].method_927()]);
                                class_368 class_368Var = method_181[length5];
                                int[] iArr = this.field_1205;
                                int method_1832 = method_181[length5].method_183();
                                length5--;
                                class_368Var.method_461(iArr[method_1832]);
                            }
                        } catch (ArrayIndexOutOfBoundsException e) {
                        }
                    } else if (class_160Var instanceof class_233) {
                        class_233 class_233Var = (class_233) class_160Var;
                        class_233Var.method_461(this.field_1205[class_233Var.method_928()]);
                        class_233Var.method_853(this.field_1205[class_233Var.method_183()]);
                    } else if (class_160Var instanceof class_72) {
                        class_72 class_72Var = (class_72) class_160Var;
                        class_72Var.method_461(this.field_1205[class_72Var.method_183()]);
                    } else if (class_160Var instanceof class_599) {
                        class_599 class_599Var = (class_599) class_160Var;
                        class_599Var.method_461(this.field_1205[class_599Var.method_183()]);
                    } else if (class_160Var instanceof class_157) {
                        class_353[] method_772 = ((class_157) class_160Var).method_772();
                        int length6 = method_772.length - 1;
                        int i12 = length6;
                        int i13 = length6;
                        while (i12 >= 0) {
                            class_353 class_353Var = method_772[i13];
                            class_112[] method_500 = class_353Var.method_500();
                            int length7 = method_500.length - 1;
                            int i14 = length7;
                            int i15 = length7;
                            while (i14 >= 0) {
                                class_112 class_112Var = method_500[i15];
                                if (class_112Var.method_619() == 7) {
                                    class_112Var.method_46(this.field_1205[class_112Var.method_47()]);
                                }
                                int i16 = i15 - 1;
                                i14 = i16;
                                i15 = i16;
                            }
                            class_112[] method_504 = class_353Var.method_504();
                            int length8 = method_504.length - 1;
                            int i17 = length8;
                            int i18 = length8;
                            while (i17 >= 0) {
                                class_112 class_112Var2 = method_504[i18];
                                if (class_112Var2.method_619() == 7) {
                                    class_112Var2.method_46(this.field_1205[class_112Var2.method_47()]);
                                }
                                int i19 = i18 - 1;
                                i17 = i19;
                                i18 = i19;
                            }
                            int i20 = i13 - 1;
                            i12 = i20;
                            i13 = i20;
                        }
                    } else if (!(class_160Var instanceof class_569)) {
                        if (class_160Var instanceof class_518) {
                            class_518 class_518Var = (class_518) class_160Var;
                            class_518Var.method_853(this.field_1205[class_518Var.method_928()]);
                            if (class_518Var.method_183() != 0) {
                                class_518Var.method_461(this.field_1205[class_518Var.method_183()]);
                            }
                        } else if (class_160Var instanceof class_213) {
                            class_213 class_213Var = (class_213) class_160Var;
                            class_476 method_1827 = class_476.method_1827(class_213Var.method_1036(), new class_208(class_499Var), false);
                            method_1501(method_1827);
                            class_213Var.method_1037(method_1827.method_553());
                        } else if (class_160Var instanceof class_452) {
                            class_262[] method_1717 = ((class_452) class_160Var).method_1717();
                            int length9 = method_1717.length;
                            int i21 = 0;
                            int i22 = 0;
                            while (i21 < length9) {
                                class_262 class_262Var = method_1717[i22];
                                class_262Var.method_46(this.field_1205[class_262Var.method_47()]);
                                int[] iArr2 = new int[class_262Var.method_434().length];
                                int length10 = iArr2.length - 1;
                                int i23 = length10;
                                int i24 = length10;
                                while (i23 >= 0) {
                                    int i25 = i24 - 1;
                                    iArr2[i24] = this.field_1205[class_262Var.method_434()[i24]];
                                    i23 = i25;
                                    i24 = i25;
                                }
                                int i26 = i22 + 1;
                                class_262Var.method_1056(iArr2);
                                i21 = i26;
                                i22 = i26;
                            }
                        } else if (class_160Var instanceof class_580) {
                            class_75[] method_2028 = ((class_580) class_160Var).method_2028();
                            int length11 = method_2028.length;
                            int i27 = 0;
                            int i28 = 0;
                            while (i27 < length11) {
                                class_75 class_75Var = method_2028[i28];
                                if (class_75Var.method_500() != null) {
                                    class_112[] method_5002 = class_75Var.method_500();
                                    int length12 = method_5002.length;
                                    int i29 = 0;
                                    int i30 = 0;
                                    while (i29 < length12) {
                                        class_112 class_112Var3 = method_5002[i30];
                                        if (class_112Var3.method_619() == 7) {
                                            class_112Var3.method_46(this.field_1205[class_112Var3.method_47()]);
                                        }
                                        int i31 = i30 + 1;
                                        i29 = i31;
                                        i30 = i31;
                                    }
                                }
                                if (class_75Var.method_504() != null) {
                                    class_112[] method_5042 = class_75Var.method_504();
                                    int length13 = method_5042.length;
                                    int i32 = 0;
                                    int i33 = 0;
                                    while (i32 < length13) {
                                        class_112 class_112Var4 = method_5042[i33];
                                        if (class_112Var4.method_619() == 7) {
                                            class_112Var4.method_46(this.field_1205[class_112Var4.method_47()]);
                                        }
                                        int i34 = i33 + 1;
                                        i32 = i34;
                                        i33 = i34;
                                    }
                                }
                                int i35 = i28 + 1;
                                i27 = i35;
                                i28 = i35;
                            }
                        } else if (class_160Var instanceof class_205) {
                            class_205 class_205Var = (class_205) class_160Var;
                            class_205Var.method_461(this.field_1205[class_205Var.method_183()]);
                        } else if (class_160Var instanceof class_238) {
                            int[] method_4342 = ((class_238) class_160Var).method_434();
                            int length14 = method_4342.length - 1;
                            int i36 = length14;
                            int i37 = length14;
                            while (i36 >= 0) {
                                int i38 = i37 - 1;
                                method_4342[i37] = this.field_1205[method_4342[i37]];
                                i36 = i38;
                                i37 = i38;
                            }
                        } else if (class_160Var instanceof class_46) {
                            class_577[] method_196 = ((class_46) class_160Var).method_196();
                            int length15 = method_196.length;
                            int i39 = 0;
                            int i40 = 0;
                            while (i39 < length15) {
                                class_577 class_577Var = method_196[i40];
                                int i41 = i40 + 1;
                                class_577Var.method_407(this.field_1205[class_577Var.method_433()]);
                                i39 = i41;
                                i40 = i41;
                            }
                        } else if (class_160Var instanceof class_228) {
                        }
                    }
                }
            }
            int i42 = i2 - 1;
            i = i42;
            i2 = i42;
        }
    }

    public void method_1519(class_574[] class_574VarArr, class_208 class_208Var) {
        if (class_574VarArr == null) {
            return;
        }
        int length = class_574VarArr.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            int i3 = i2 - 1;
            method_1507(class_574VarArr[i2], class_208Var);
            i = i3;
            i2 = i3;
        }
    }

    public boolean method_1510(class_574 class_574Var) {
        if (!class_574Var.method_2016().startsWith("Lcom/allatori/annotations/")) {
            if (class_544.method_1928().method_1402()) {
                String method_2016 = class_574Var.method_2016();
                if (method_2016.length() > 2 && method_2016.charAt(0) == 'L' && method_2016.charAt(method_2016.length() - 1) == ';') {
                    String replace = method_2016.substring(1, method_2016.length() - 1).replace('/', '.');
                    if (class_544.method_1928().method_1401(this.field_1203, this.field_1204, replace)) {
                        this.field_1206.add(Integer.valueOf(class_574Var.method_2009()));
                        return true;
                    }
                    if (class_544.method_1928().method_1401(this.field_1203, this.field_1204, class_544.method_1934().field_1933.method_1543(replace))) {
                        this.field_1206.add(Integer.valueOf(class_574Var.method_2009()));
                        return true;
                    }
                }
            }
            return false;
        }
        this.field_1206.add(Integer.valueOf(class_574Var.method_2009()));
        return true;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:7:0x0010 */
    public void method_1518(class_202 class_202Var, class_565 class_565Var) {
        class_574[] method_908 = class_202Var != null ? class_202Var.method_908() : null;
        if (class_565Var != null) {
            method_908 = class_565Var.method_908();
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i >= method_908.length) {
                return;
            }
            class_574 class_574Var = method_908[i2];
            if (this.field_1206.contains(Integer.valueOf(class_574Var.method_2009()))) {
                if (class_202Var != null) {
                    class_202Var.method_903(class_574Var);
                }
                if (class_565Var != null) {
                    class_565Var.method_903(class_574Var);
                }
            }
            i = i2 + 1;
        }
    }
}
