package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_124;

import java.util.Locale;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_287 {
    public static final int field_1012 = 8;
    public static final int field_1017 = 3;
    public static final int field_1018 = 2;
    public static final int field_1019 = 7;
    public static final int field_1021 = 4;
    public static final int field_1023 = 5;
    public static final int field_1027 = 6;
    public static final int field_1031 = 1;
    public String field_1008;
    public int field_1009;
    public int field_1010;
    public String[] field_1011;
    public String[] field_1013;
    public boolean field_1014;
    public int field_1015;
    public String field_1016;
    public String field_1020;
    public int field_1022;
    public String[] field_1024;
    public String field_1025;
    public boolean field_1026;
    public final class_363 field_1028;
    public String[] field_1029;
    public boolean field_1030;

    public void method_1270(int i) {
        this.field_1015 = i;
    }

    public class_287(class_363 class_363Var, class_280 class_280Var) {
        this(class_363Var);
    }

    public void method_1273(int i) {
        this.field_1010 = i;
    }

    public class_287(class_363 class_363Var) {
        this.field_1028 = class_363Var;
        this.field_1022 = 1;
        this.field_1010 = 2;
        this.field_1014 = false;
        this.field_1015 = 2;
        this.field_1009 = 2;
        this.field_1026 = false;
        this.field_1030 = false;
        this.field_1025 = null;
        this.field_1008 = null;
        this.field_1016 = null;
        this.field_1020 = null;
        this.field_1011 = null;
        this.field_1029 = null;
        this.field_1024 = null;
        this.field_1013 = null;
        int i = 0;
        int i2 = 0;
        while (i < 8) {
            this.field_1025 = this.field_1025 == null ? new StringBuilder().insert(0, "").append((char) (class_287.class.getName().charAt(i2 + 4) - ' ')).toString() : new StringBuilder().insert(0, this.field_1025).append((char) (class_287.class.getName().charAt(i2 + 4) - ' ')).toString();
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        int i4 = 2;
        int i5 = 2;
        while (i4 < 7) {
            if (i5 != 2) {
                if (i5 > 4) {
                    this.field_1025 += ((char) (this.field_1025.charAt(0) + (i5 << 1) + 2));
                } else {
                    this.field_1025 += ((char) (this.field_1025.charAt(0) + i5));
                }
            } else {
                this.field_1025 += ((char) ((this.field_1025.charAt(0) + (i5 << 5)) - 9));
            }
            int i6 = i5 + 1;
            i4 = i6;
            i5 = i6;
        }
    }

    public void method_1272(int i) {
        this.field_1009 = i;
    }

    public void method_1287(int i) {
        this.field_1022 = i;
    }

    public void method_1285(boolean z) {
        this.field_1030 = z;
    }

    public void method_1269(String[] strArr) {
        this.field_1029 = strArr;
    }

    public void method_1276(String str) {
        if (this.field_1025 != null) {
            this.field_1025 = new StringBuilder().insert(0, this.field_1025).append(this.field_1025.substring(8, 9)).append(str).toString();
        } else {
            this.field_1025 = str;
        }
    }

    public class_124 method_1281() {
        class_124 class_149Var;
        class_287 class_287Var;
        if (this.field_1009 != 1) {
            if (this.field_1009 != 8) {
                if (this.field_1009 != 3) {
                    if (this.field_1009 == 5) {
                        class_149Var = new class_433();
                        class_287Var = this;
                    } else if (this.field_1009 != 6) {
                        if (this.field_1009 != 7) {
                            class_149Var = new class_149();
                            class_287Var = this;
                        } else {
                            class_149Var = new class_74(this.field_1029);
                            class_287Var = this;
                        }
                    } else {
                        class_149Var = new class_495();
                        class_287Var = this;
                    }
                } else {
                    class_149Var = new class_458();
                    class_287Var = this;
                }
            } else {
                class_149Var = new class_253();
                class_287Var = this;
            }
        } else {
            class_149Var = new class_405();
            class_287Var = this;
        }
        if (class_287Var.field_1030) {
            class_149Var = new class_422(class_149Var, false, true);
        }
        class_47 class_47Var = new class_47(class_149Var);
        class_124 class_347Var = this.field_1025 != null ? new class_347(this.field_1025, class_47Var) : class_47Var;
        if (this.field_1016 == null) {
            return class_347Var;
        }
        return new class_163(this.field_1016, class_347Var);
    }

    public class_124 method_1288() {
        class_124 class_405Var;
        if (this.field_1022 != 6) {
            if (this.field_1022 == 7) {
                class_405Var = new class_74(this.field_1013);
            } else if (this.field_1022 != 8) {
                class_405Var = new class_405();
            } else {
                class_405Var = new class_253();
            }
        } else {
            class_405Var = new class_495();
        }
        return new class_47(class_405Var);
    }

    public String method_1286() {
        return this.field_1009 == 5 ? class_433.method_1619() : class_363.method_1458(this.field_1028).method_779();
    }

    public void method_1275(String[] strArr) {
        this.field_1013 = strArr;
    }

    public class_124 method_1274() {
        class_124 class_149Var;
        class_287 class_287Var;
        if (this.field_1015 != 1) {
            if (this.field_1015 == 8) {
                class_149Var = new class_253();
                class_287Var = this;
            } else if (this.field_1015 != 3) {
                if (this.field_1015 != 5) {
                    if (this.field_1015 == 6) {
                        class_149Var = new class_495();
                        class_287Var = this;
                    } else if (this.field_1015 == 7) {
                        class_149Var = new class_74(this.field_1011);
                        class_287Var = this;
                    } else {
                        class_149Var = new class_149();
                        class_287Var = this;
                    }
                } else {
                    class_149Var = new class_433();
                    class_287Var = this;
                }
            } else {
                class_149Var = new class_458();
                class_287Var = this;
            }
        } else {
            class_149Var = new class_405();
            class_287Var = this;
        }
        if (class_287Var.field_1026) {
            class_149Var = new class_422(class_149Var, true, false);
        }
        class_47 class_47Var = new class_47(class_149Var);
        class_124 class_347Var = this.field_1025 != null ? new class_347(this.field_1025, class_47Var) : class_47Var;
        if (this.field_1008 != null) {
            return new class_163(this.field_1008, class_347Var);
        }
        return class_347Var;
    }

    public boolean method_1279() {
        return this.field_1014;
    }

    public class_124 method_1271() {
        return new class_47(new class_405());
    }

    public boolean method_1283() {
        return this.field_1026;
    }

    public class_124 method_1265() {
        class_124 class_149Var;
        class_287 class_287Var;
        String lowerCase;
        if (this.field_1010 != 1) {
            if (this.field_1010 == 8) {
                class_149Var = new class_253();
                class_287Var = this;
            } else if (this.field_1010 != 4) {
                if (this.field_1010 == 5) {
                    class_149Var = new class_433();
                    class_287Var = this;
                } else if (this.field_1010 != 6) {
                    if (this.field_1010 != 7) {
                        class_149Var = new class_149();
                        class_287Var = this;
                    } else {
                        class_149Var = new class_74(this.field_1024);
                        class_287Var = this;
                    }
                } else {
                    class_149Var = new class_495();
                    class_287Var = this;
                }
            } else {
                class_149Var = new class_315();
                class_287Var = this;
            }
        } else {
            class_149Var = new class_405();
            class_287Var = this;
        }
        if (class_287Var.field_1010 != 1 && this.field_1010 != 8 && this.field_1010 != 7 && class_544.method_1918().method_10().size() > 0 && ((lowerCase = System.getProperty("os.name").toLowerCase(Locale.ENGLISH)) == null || lowerCase.indexOf("win") >= 0 || lowerCase.indexOf("mac") >= 0)) {
            class_149Var = new class_405();
        }
        if (class_544.method_1937().method_1703()) {
            class_149Var = new class_527(class_149Var);
        }
        class_47 class_47Var = new class_47(class_149Var);
        return this.field_1020 != null ? new class_163(this.field_1020, class_47Var) : class_47Var;
    }

    public void method_1277(String[] strArr) {
        this.field_1024 = strArr;
    }

    public void method_1267(String str) {
        this.field_1016 = str;
    }

    public void method_1278(boolean z) {
        this.field_1026 = z;
    }

    public class_124 method_1268() {
        if (class_363.method_1458(this.field_1028).method_783() != 2) {
            if (class_363.method_1458(this.field_1028).method_783() != 1) {
                return new class_405();
            }
            return new class_542(class_363.method_1458(this.field_1028).method_779());
        }
        return new class_405();
    }

    public boolean method_1280() {
        return this.field_1030;
    }

    public void method_1264(String[] strArr) {
        this.field_1011 = strArr;
    }

    public void method_1282(String str) {
        this.field_1008 = str;
    }

    public void method_1284(String str) {
        this.field_1020 = str;
    }

    public void method_1266(boolean z) {
        this.field_1014 = z;
    }
}
