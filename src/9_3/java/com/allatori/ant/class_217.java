package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_291;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_217 implements class_291 {
    public class_606 field_819;

    public void method_40(class_202 class_202Var) {
        class_160[] method_906 = class_202Var != null ? class_202Var.method_906() : null;
        if (method_906 == null) {
            return;
        }
        int length = method_906.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            if ((method_906[i2] instanceof class_121) || (method_906[i2] instanceof class_518)) {
                class_202Var.method_902(method_906[i2]);
            }
            int i3 = i2 - 1;
            i = i3;
            i2 = i3;
        }
    }

    @Override // p000.class_291
    public void method_34(class_202 class_202Var) {
        class_160[] method_906;
        class_160[] method_9062;
        if (class_544.method_1937().method_1689(this.field_819, class_202Var)) {
            method_1049(class_202Var, null, null);
            class_557[] method_904 = class_202Var.method_904();
            int length = method_904.length - 1;
            int i = length;
            int i2 = length;
            while (i >= 0) {
                class_557 class_557Var = method_904[i2];
                class_160[] method_9063 = class_557Var.method_906();
                if (method_9063 != null) {
                    int length2 = method_9063.length - 1;
                    int i3 = length2;
                    int i4 = length2;
                    while (i3 >= 0) {
                        if (method_9063[i4] instanceof class_72) {
                            class_591 method_1067 = class_230.method_1067(class_557Var, class_202Var.method_198(), class_202Var.method_917(), class_202Var.method_917().method_502());
                            method_1049(null, method_1067, null);
                            class_202Var.method_914(class_557Var, method_1067.method_2048());
                        }
                        int i5 = i4 - 1;
                        i3 = i5;
                        i4 = i5;
                    }
                }
                int i6 = i2 - 1;
                i = i6;
                i2 = i6;
            }
            class_261[] method_898 = class_202Var.method_898();
            int length3 = method_898.length - 1;
            int i7 = length3;
            int i8 = length3;
            while (i7 >= 0) {
                class_261 class_261Var = method_898[i8];
                class_160[] method_9064 = class_261Var.method_906();
                if (method_9064 != null) {
                    int length4 = method_9064.length - 1;
                    int i9 = length4;
                    int i10 = length4;
                    while (i9 >= 0) {
                        if (method_9064[i10] instanceof class_72) {
                            class_176 class_176Var = new class_176(class_261Var, class_202Var.method_917());
                            method_1049(null, null, class_176Var);
                            class_202Var.method_905(class_261Var, class_176Var.method_854());
                        }
                        int i11 = i10 - 1;
                        i9 = i11;
                        i10 = i11;
                    }
                }
                int i12 = i8 - 1;
                i7 = i12;
                i8 = i12;
            }
        }
        if (class_544.method_1937().method_1698(this.field_819, class_202Var)) {
            method_40(class_202Var);
        }
        class_557[] method_9042 = class_202Var.method_904();
        int length5 = method_9042.length - 1;
        int i13 = length5;
        int i14 = length5;
        while (i13 >= 0) {
            class_557 class_557Var2 = method_9042[i14];
            if (class_544.method_1937().method_1708(this.field_819, class_202Var, class_557Var2) && (method_9062 = class_557Var2.method_906()) != null) {
                int length6 = method_9062.length - 1;
                int i15 = length6;
                int i16 = length6;
                while (true) {
                    if (i15 < 0) {
                        break;
                    }
                    if (method_9062[i16] instanceof class_224) {
                        class_591 method_10672 = class_230.method_1067(class_557Var2, class_202Var.method_198(), class_202Var.method_917(), class_202Var.method_917().method_502());
                        method_10672.method_2060();
                        class_202Var.method_914(class_557Var2, method_10672.method_2048());
                        break;
                    } else {
                        int i17 = i16 - 1;
                        i15 = i17;
                        i16 = i17;
                    }
                }
            }
            int i18 = i14 - 1;
            i13 = i18;
            i14 = i18;
        }
        class_557[] method_9043 = class_202Var.method_904();
        int length7 = method_9043.length - 1;
        int i19 = length7;
        int i20 = length7;
        while (i19 >= 0) {
            class_557 class_557Var3 = method_9043[i20];
            int method_784 = class_544.method_1924().method_1484().method_784(this.field_819, class_202Var, class_557Var3);
            class_544.method_1924().method_1484();
            if (method_784 != 3) {
                class_544.method_1924().method_1484();
                if (method_784 != 5 && (method_906 = class_557Var3.method_906()) != null) {
                    boolean z = false;
                    int length8 = method_906.length - 1;
                    int i21 = length8;
                    int i22 = length8;
                    while (true) {
                        if (i21 < 0) {
                            break;
                        }
                        if (method_906[i22] instanceof class_536) {
                            z = true;
                            break;
                        } else {
                            int i23 = i22 - 1;
                            i21 = i23;
                            i22 = i23;
                        }
                    }
                    if (!z) {
                        int length9 = method_906.length - 1;
                        int i24 = length9;
                        int i25 = length9;
                        while (true) {
                            if (i24 < 0) {
                                break;
                            }
                            if (method_906[i25] instanceof class_46) {
                                class_591 method_10673 = class_230.method_1067(class_557Var3, class_202Var.method_198(), class_202Var.method_917(), class_202Var.method_917().method_502());
                                method_10673.method_921(method_906[i25]);
                                class_202Var.method_914(class_557Var3, method_10673.method_2048());
                                break;
                            } else {
                                int i26 = i25 - 1;
                                i24 = i26;
                                i25 = i26;
                            }
                        }
                    }
                }
            }
            int i27 = i20 - 1;
            i19 = i27;
            i20 = i27;
        }
    }

    @Override // p000.class_291
    public void method_39() {
    }

    public void method_1049(class_202 class_202Var, class_591 class_591Var, class_176 class_176Var) {
        class_160[] class_160VarArr = null;
        if (class_202Var != null && class_591Var == null && class_176Var == null) {
            class_160VarArr = class_202Var.method_906();
        }
        if (class_591Var != null) {
            class_160VarArr = class_591Var.method_906();
        }
        class_160[] method_906 = class_176Var != null ? class_176Var.method_906() : class_160VarArr;
        if (method_906 == null) {
            return;
        }
        int length = method_906.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            if (method_906[i2] instanceof class_72) {
                if (class_591Var != null) {
                    class_591Var.method_921(method_906[i2]);
                } else if (class_176Var != null) {
                    class_176Var.method_921(method_906[i2]);
                } else {
                    class_202Var.method_902(method_906[i2]);
                }
            }
            int i3 = i2 - 1;
            i = i3;
            i2 = i3;
        }
    }

    public class_217(class_606 class_606Var) {
        this.field_819 = class_606Var;
    }
}
