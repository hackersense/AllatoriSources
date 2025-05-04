package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_592 extends class_212 {
    public class_592(byte b, String str) {
        super(b, str);
    }

    public class_592 method_2082(class_592 class_592Var) {
        if (equals(class_212.field_796)) {
            return class_592Var;
        }
        if (!class_592Var.equals(class_212.field_796) && !equals(class_592Var)) {
            if ((this instanceof class_594) && (class_592Var instanceof class_594)) {
                class_594 class_594Var = (class_594) this;
                class_594 class_594Var2 = (class_594) class_592Var;
                if (class_594Var.method_433() == class_594Var2.method_433() && (class_594Var.method_669() instanceof class_392) && (class_594Var2.method_669() instanceof class_392)) {
                    return new class_594(((class_392) class_594Var.method_669()).method_2082((class_392) class_594Var2.method_669()), class_594Var.method_433());
                }
            }
            if (!(this instanceof class_594) && !(class_592Var instanceof class_594)) {
                if (((this instanceof class_392) && ((class_392) this).method_1126()) || ((class_592Var instanceof class_392) && ((class_392) class_592Var).method_1126())) {
                    return class_212.field_808;
                }
                class_392 class_392Var = (class_392) this;
                class_392 class_392Var2 = (class_392) class_592Var;
                class_440[] method_1812 = class_474.method_1812(class_392Var.method_464());
                class_440[] method_18122 = class_474.method_1812(class_392Var2.method_464());
                if (method_1812 == null || method_18122 == null) {
                    return null;
                }
                class_440[] class_440VarArr = new class_440[method_1812.length + 1];
                class_440[] class_440VarArr2 = new class_440[method_18122.length + 1];
                System.arraycopy(method_1812, 0, class_440VarArr, 1, method_1812.length);
                System.arraycopy(method_18122, 0, class_440VarArr2, 1, method_18122.length);
                class_440VarArr[0] = class_474.method_1810(class_392Var.method_464());
                class_440VarArr2[0] = class_474.method_1810(class_392Var2.method_464());
                int i = 0;
                int i2 = 0;
                while (i < class_440VarArr2.length) {
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < class_440VarArr.length) {
                        if (class_440VarArr[i4].equals(class_440VarArr2[i2])) {
                            return new class_392(class_440VarArr[i4].method_546());
                        }
                        int i5 = i4 + 1;
                        i3 = i5;
                        i4 = i5;
                    }
                    int i6 = i2 + 1;
                    i = i6;
                    i2 = i6;
                }
                return null;
            }
            return class_212.field_808;
        }
        return this;
    }

    public boolean method_1987(class_212 class_212Var) {
        if (!(class_212Var instanceof class_592)) {
            return false;
        }
        class_592 class_592Var = (class_592) class_212Var;
        if (equals(class_212.field_796)) {
            return true;
        }
        if ((this instanceof class_392) && ((class_392) this).method_424()) {
            if (!(class_592Var instanceof class_392) || !((class_392) class_592Var).method_424() || (!equals(class_592Var) && !class_474.method_1807(((class_392) this).method_464(), ((class_392) class_592Var).method_464()))) {
                if ((class_592Var instanceof class_392) && ((class_392) class_592Var).method_1129() && class_474.method_1805(((class_392) this).method_464(), ((class_392) class_592Var).method_464())) {
                    return true;
                }
            }
            return true;
        }
        if ((this instanceof class_392) && ((class_392) this).method_1129()) {
            if ((class_592Var instanceof class_392) && ((class_392) class_592Var).method_424() && class_592Var.equals(class_212.field_808)) {
                return true;
            }
            if (class_592Var instanceof class_392) {
                if (((class_392) class_592Var).method_1129()) {
                    if (equals(class_592Var)) {
                        return true;
                    }
                    if (class_474.method_1805(((class_392) this).method_464(), ((class_392) class_592Var).method_464())) {
                        return true;
                    }
                }
            }
        }
        if (!(this instanceof class_594)) {
            return false;
        }
        if ((class_592Var instanceof class_392) && ((class_392) class_592Var).method_424() && class_592Var.equals(class_212.field_808)) {
            return true;
        }
        if (class_592Var instanceof class_594) {
            class_212 method_2057 = ((class_594) this).method_2057();
            class_212 method_20572 = ((class_594) class_592Var).method_2057();
            if ((method_2057 instanceof class_331) && (method_20572 instanceof class_331) && method_2057.equals(method_20572)) {
                return true;
            }
            if ((method_20572 instanceof class_592) && (method_2057 instanceof class_592) && ((class_592) method_2057).method_1987(method_20572)) {
                return true;
            }
        }
        if (!(class_592Var instanceof class_392) || !((class_392) class_592Var).method_1129()) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        while (i < ASMInterface.field_1552.length) {
            if (class_592Var.equals(new class_392(ASMInterface.field_1552[i2]))) {
                return true;
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        return false;
    }

    public class_592 method_2084(class_592 class_592Var) {
        if (equals(class_212.field_796)) {
            return class_592Var;
        }
        if (!class_592Var.equals(class_212.field_796) && !equals(class_592Var)) {
            if ((this instanceof class_594) || (class_592Var instanceof class_594)) {
                return class_212.field_808;
            }
            if ((!(this instanceof class_392) || !((class_392) this).method_1126()) && (!(class_592Var instanceof class_392) || !((class_392) class_592Var).method_1126())) {
                class_392 class_392Var = (class_392) this;
                class_392 class_392Var2 = (class_392) class_592Var;
                class_440[] method_1812 = class_474.method_1812(class_392Var.method_464());
                class_440[] method_18122 = class_474.method_1812(class_392Var2.method_464());
                if (method_1812 == null || method_18122 == null) {
                    return null;
                }
                class_440[] class_440VarArr = new class_440[method_1812.length + 1];
                class_440[] class_440VarArr2 = new class_440[method_18122.length + 1];
                System.arraycopy(method_1812, 0, class_440VarArr, 1, method_1812.length);
                System.arraycopy(method_18122, 0, class_440VarArr2, 1, method_18122.length);
                class_440VarArr[0] = class_474.method_1810(class_392Var.method_464());
                class_440VarArr2[0] = class_474.method_1810(class_392Var2.method_464());
                int i = 0;
                int i2 = 0;
                while (i < class_440VarArr2.length) {
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < class_440VarArr.length) {
                        if (!class_440VarArr[i4].equals(class_440VarArr2[i2])) {
                            int i5 = i4 + 1;
                            i3 = i5;
                            i4 = i5;
                        } else {
                            return new class_392(class_440VarArr[i4].method_546());
                        }
                    }
                    int i6 = i2 + 1;
                    i = i6;
                    i2 = i6;
                }
                return null;
            }
            return class_212.field_808;
        }
        return this;
    }

    public class_592() {
        super((byte) 14, "<null object>");
    }

    public boolean method_2083(class_212 class_212Var) {
        if (!equals(class_212.field_796)) {
            return method_1987(class_212Var);
        }
        return true;
    }
}
