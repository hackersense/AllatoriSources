package com.allatori.ant;

import com.allatori.exception.runtime.RuntimeException_276;
import com.allatori.interfaces.unmapped.class_263;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_498 extends class_73 {
    public final class_184 field_1953;
    public class_208 field_1954;

    public void method_1555(class_539 class_539Var, String str) {
        throw new RuntimeException_276(new StringBuilder().insert(0, "Instruction ").append(class_539Var).append(" constraint violated: ").append(str).toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_264(class_274 class_274Var) {
        method_1843(class_274Var, class_274Var.method_47());
        class_286 method_982 = this.field_1954.method_982(class_274Var.method_47());
        if (!(method_982 instanceof class_232) && !(method_982 instanceof class_573)) {
            method_1555(class_274Var, "Operand of LDC2_W must be CONSTANT_Long or CONSTANT_Double, but is '" + method_982 + "'.");
        }
        try {
            method_1843(class_274Var, class_274Var.method_47() + 1);
        } catch (RuntimeException_276 e) {
            throw new class_572("OOPS: Does not BCEL handle that? LDC2_W operand has a problem.");
        }
    }

    public int method_1844() {
        try {
            return class_474.method_1810(class_184.method_868(this.field_1953).method_1062()).method_904()[class_184.method_869(this.field_1953)].method_1962().method_183();
        } catch (ClassNotFoundException e) {
            throw new class_572(new StringBuilder().insert(0, "Missing class: ").append(e.toString()).toString());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: class_263 */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.class_73, p000.class_445
    public void method_490(class_263 class_263Var) {
        class_392 method_42 = class_263Var.method_42(this.field_1954);
        if (method_42 == null) {
            return;
        }
        class_275 method_1057 = class_412.method_1574(method_42.method_464()).method_1057();
        if (method_1057.method_1212() == 1) {
            return;
        }
        method_1555((class_539) class_263Var, new StringBuilder().insert(0, "Class '").append(class_263Var.method_42(this.field_1954).method_464()).append("' is referenced, but cannot be loaded: '").append(method_1057).append("'.").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_382(class_489 class_489Var) {
        method_1843(class_489Var, class_489Var.method_47());
        class_286 method_982 = this.field_1954.method_982(class_489Var.method_47());
        if (method_982 instanceof class_43) {
            this.field_1953.method_671(new StringBuilder().insert(0, "Operand of LDC or LDC_W is CONSTANT_Class '").append(method_982).append("' - this is only supported in JDK 1.5 and higher.").toString());
        } else if (!(method_982 instanceof class_400) && !(method_982 instanceof class_340) && !(method_982 instanceof class_118)) {
            method_1555(class_489Var, "Operand of LDC or LDC_W must be one of CONSTANT_Integer, CONSTANT_Float or CONSTANT_String, but is '" + method_982 + "'.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_496(class_239 class_239Var) {
        class_261 class_261Var;
        class_261 class_261Var2;
        try {
            method_1843(class_239Var, class_239Var.method_47());
            class_286 method_982 = this.field_1954.method_982(class_239Var.method_47());
            if (!(method_982 instanceof class_530)) {
                method_1555(class_239Var, "Indexing a constant that's not a CONSTANT_Fieldref but a '" + method_982 + "'.");
            }
            String method_1086 = class_239Var.method_1086(this.field_1954);
            class_440 method_1810 = class_474.method_1810(class_239Var.method_622(this.field_1954).method_464());
            class_261[] method_898 = method_1810.method_898();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= method_898.length) {
                    class_261Var = null;
                    class_261Var2 = null;
                    break;
                } else if (method_898[i2].method_464().equals(method_1086) && class_212.method_1034(method_898[i2].method_546()).equals(class_239Var.method_32(this.field_1954))) {
                    class_261 class_261Var3 = method_898[i2];
                    class_261Var = class_261Var3;
                    class_261Var2 = class_261Var3;
                    break;
                } else {
                    int i3 = i2 + 1;
                    i = i3;
                    i2 = i3;
                }
            }
            if (class_261Var != null) {
                class_212.method_1034(class_261Var2.method_546());
                class_239Var.method_32(this.field_1954);
                return;
            }
            class_440[] method_601 = method_1810.method_601();
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i4 >= method_601.length) {
                    break;
                }
                class_261[] method_8982 = method_601[i5].method_898();
                int i6 = 0;
                int i7 = 0;
                while (i6 < method_8982.length) {
                    if (!method_8982[i7].method_464().equals(method_1086) || !class_212.method_1034(method_8982[i7].method_546()).equals(class_239Var.method_32(this.field_1954))) {
                        int i8 = i7 + 1;
                        i6 = i8;
                        i7 = i8;
                    } else {
                        class_261Var2 = method_8982[i7];
                        if ((class_261Var2.method_433() & 5) == 0) {
                            class_261Var2 = null;
                        }
                    }
                }
                int i9 = i5 + 1;
                i4 = i9;
                i5 = i9;
            }
            if (class_261Var2 == null) {
                method_1555(class_239Var, new StringBuilder().insert(0, "Referenced field '").append(method_1086).append("' does not exist in class '").append(method_1810.method_546()).append("'.").toString());
            }
        } catch (ClassNotFoundException e) {
            throw new class_572(new StringBuilder().insert(0, "Missing class: ").append(e.toString()).toString());
        }
    }

    public void method_1843(class_539 class_539Var, int i) {
        if (i >= 0 && i < this.field_1954.method_47()) {
            return;
        }
        method_1555(class_539Var, "Illegal constant pool index '" + i + "'.");
    }

    public class_498(class_184 class_184Var, class_208 class_208Var) {
        this.field_1953 = class_184Var;
        this.field_1954 = class_208Var;
    }

    @Override // p000.class_73, p000.class_445
    public void method_252(class_196 class_196Var) {
        int method_47 = class_196Var.method_47();
        if (method_47 < 0) {
            method_1555(class_196Var, "Index '" + method_47 + "' must be non-negative.");
            return;
        }
        int method_1844 = method_1844() - 1;
        if (method_47 > method_1844) {
            method_1555(class_196Var, new StringBuilder().insert(0, "Index '").append(method_47).append("' must not be greater than max_locals-1 '").append(method_1844).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_350(class_133 class_133Var) {
        int method_47 = class_133Var.method_47();
        if (method_47 < 0) {
            method_1555(class_133Var, "Index '" + method_47 + "' must be non-negative. [Constraint by JustIce as an analogon to the single-slot xLOAD/xSTORE instructions; may not happen anyway.]");
            return;
        }
        int method_1844 = method_1844() - 2;
        if (method_47 > method_1844) {
            method_1555(class_133Var, new StringBuilder().insert(0, "Index '").append(method_47).append("' must not be greater than max_locals-2 '").append(method_1844).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_497(class_459 class_459Var) {
        method_1843(class_459Var, class_459Var.method_47());
        if ((class_459Var instanceof class_203) || (class_459Var instanceof class_219) || (class_459Var instanceof class_161)) {
            class_286 method_982 = this.field_1954.method_982(class_459Var.method_47());
            if (!(method_982 instanceof class_35)) {
                method_1555(class_459Var, "Indexing a constant that's not a CONSTANT_Methodref but a '" + method_982 + "'.");
            } else {
                class_371 class_371Var = (class_371) this.field_1954.method_982(((class_538) this.field_1954.method_982(((class_35) method_982).method_433())).method_47());
                if (class_371Var.method_198().equals("<init>") && !(class_459Var instanceof class_219)) {
                    method_1555(class_459Var, "Only INVOKESPECIAL is allowed to invoke instance initialization methods.");
                }
                if (!class_371Var.method_198().equals("<init>") && class_371Var.method_198().startsWith("<")) {
                    method_1555(class_459Var, "No method with a name beginning with '<' other than the instance initialization methods may be called by the method invocation instructions.");
                }
            }
        } else {
            class_286 method_9822 = this.field_1954.method_982(class_459Var.method_47());
            if (!(method_9822 instanceof class_401)) {
                method_1555(class_459Var, new StringBuilder().insert(0, "Indexing a constant that's not a CONSTANT_InterfaceMethodref but a '").append(method_9822).append("'.").toString());
            }
            String method_198 = ((class_371) this.field_1954.method_982(((class_538) this.field_1954.method_982(((class_401) method_9822).method_433())).method_47())).method_198();
            if (method_198.equals("<init>")) {
                method_1555(class_459Var, "Method to invoke must not be '<init>'.");
            }
            if (method_198.equals("<clinit>")) {
                method_1555(class_459Var, "Method to invoke must not be '<clinit>'.");
            }
        }
        class_212 method_1085 = class_459Var.method_1085(this.field_1954);
        if (method_1085 instanceof class_594) {
            method_1085 = ((class_594) method_1085).method_669();
        }
        if (method_1085 instanceof class_392) {
            class_275 method_1059 = class_412.method_1574(((class_392) method_1085).method_464()).method_1059();
            if (method_1059.method_1212() != 1) {
                method_1555(class_459Var, new StringBuilder().insert(0, "Return type class/interface could not be verified successfully: '").append(method_1059.method_1213()).append("'.").toString());
            }
        }
        class_212[] method_1388 = class_459Var.method_1388(this.field_1954);
        int i = 0;
        int i2 = 0;
        while (i < method_1388.length) {
            class_212 class_212Var = method_1388[i2];
            if (class_212Var instanceof class_594) {
                class_212Var = ((class_594) class_212Var).method_669();
            }
            if (class_212Var instanceof class_392) {
                class_275 method_10592 = class_412.method_1574(((class_392) class_212Var).method_464()).method_1059();
                if (method_10592.method_1212() != 1) {
                    method_1555(class_459Var, new StringBuilder().insert(0, "Argument type class/interface could not be verified successfully: '").append(method_10592.method_1213()).append("'.").toString());
                }
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_258(class_564 class_564Var) {
        int method_47 = class_564Var.method_47();
        if (method_47 >= 0) {
            int method_1844 = method_1844() - 1;
            if (method_47 > method_1844) {
                method_1555(class_564Var, new StringBuilder().insert(0, "Index '").append(method_47).append("' must not be greater than max_locals-1 '").append(method_1844).append("'.").toString());
                return;
            }
            return;
        }
        method_1555(class_564Var, "Index '" + method_47 + "' must be non-negative.");
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0009 */
    @Override // p000.class_73, p000.class_445
    public void method_393(class_427 class_427Var) {
        int[] method_434 = class_427Var.method_434();
        int i = Integer.MIN_VALUE;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i2 < method_434.length) {
                if (method_434[i3] == i && i3 != 0) {
                    method_1555(class_427Var, "Match '" + method_434[i3] + "' occurs more than once.");
                }
                if (method_434[i3] >= i) {
                    i = method_434[i3];
                } else {
                    method_1555(class_427Var, "Lookup table must be sorted but isn't.");
                }
                i2 = i3 + 1;
            } else {
                return;
            }
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_397(class_390 class_390Var) {
        int method_47 = class_390Var.method_47();
        if (method_47 >= 0) {
            int method_1844 = method_1844() - 1;
            if (method_47 <= method_1844) {
                return;
            }
            method_1555(class_390Var, new StringBuilder().insert(0, "Index '").append(method_47).append("' must not be greater than max_locals-1 '").append(method_1844).append("'.").toString());
            return;
        }
        method_1555(class_390Var, "Index '" + method_47 + "' must be non-negative.");
    }

    @Override // p000.class_73, p000.class_445
    public void method_315(class_67 class_67Var) {
        int method_47 = class_67Var.method_47();
        if (method_47 < 0) {
            method_1555(class_67Var, "Index '" + method_47 + "' must be non-negative.");
            return;
        }
        int method_1844 = method_1844() - 1;
        if (method_47 <= method_1844) {
            return;
        }
        method_1555(class_67Var, new StringBuilder().insert(0, "Index '").append(method_47).append("' must not be greater than max_locals-1 '").append(method_1844).append("'.").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_362(class_398 class_398Var) {
        int method_47 = class_398Var.method_47();
        if (method_47 < 0) {
            method_1555(class_398Var, "Index '" + method_47 + "' must be non-negative.");
            return;
        }
        int method_1844 = method_1844() - 1;
        if (method_47 > method_1844) {
            method_1555(class_398Var, new StringBuilder().insert(0, "Index '").append(method_47).append("' must not be greater than max_locals-1 '").append(method_1844).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_306(class_413 class_413Var) {
        byte method_619 = class_413Var.method_619();
        if (method_619 != 4 && method_619 != 5 && method_619 != 6 && method_619 != 7 && method_619 != 8 && method_619 != 9 && method_619 != 10 && method_619 != 11) {
            method_1555(class_413Var, "Illegal type code '+t+' for 'atype' operand.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_388(class_117 class_117Var) {
    }

    @Override // p000.class_73, p000.class_445
    public void method_385(class_289 class_289Var) {
        class_261 class_261Var;
        class_261 class_261Var2;
        try {
            String method_1086 = class_289Var.method_1086(this.field_1954);
            class_440 method_1810 = class_474.method_1810(class_289Var.method_622(this.field_1954).method_464());
            class_261[] method_898 = method_1810.method_898();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= method_898.length) {
                    class_261Var = null;
                    class_261Var2 = null;
                    break;
                } else if (method_898[i2].method_464().equals(method_1086)) {
                    class_261 class_261Var3 = method_898[i2];
                    class_261Var = class_261Var3;
                    class_261Var2 = class_261Var3;
                    break;
                } else {
                    int i3 = i2 + 1;
                    i = i3;
                    i2 = i3;
                }
            }
            if (class_261Var == null) {
                throw new class_572("Field not found?!?");
            }
            if (class_261Var2.method_1117() && !class_184.method_868(this.field_1953).method_1062().equals(class_289Var.method_622(this.field_1954).method_464())) {
                method_1555(class_289Var, "Referenced field '" + class_261Var2 + "' is final and must therefore be declared in the current class '" + class_184.method_868(this.field_1953).method_1062() + "' which is not the case: it is declared in '" + class_289Var.method_622(this.field_1954).method_464() + "'.");
            }
            if (!class_261Var2.method_1125()) {
                method_1555(class_289Var, new StringBuilder().insert(0, "Referenced field '").append(class_261Var2).append("' is not static which it should be.").toString());
            }
            String method_464 = class_474.method_1810(class_184.method_868(this.field_1953).method_1062()).method_904()[class_184.method_869(this.field_1953)].method_464();
            if (!method_1810.method_1641() && !method_464.equals("<clinit>")) {
                method_1555(class_289Var, new StringBuilder().insert(0, "Interface field '").append(class_261Var2).append("' must be set in a '").append("<clinit>").append("' method.").toString());
            }
        } catch (ClassNotFoundException e) {
            throw new class_572(new StringBuilder().insert(0, "Missing class: ").append(e.toString()).toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_366(class_447 class_447Var) {
        method_1843(class_447Var, class_447Var.method_47());
        class_286 method_982 = this.field_1954.method_982(class_447Var.method_47());
        if (method_982 instanceof class_43) {
            return;
        }
        method_1555(class_447Var, "Expecting a CONSTANT_Class operand, but found a '" + method_982 + "'.");
    }

    @Override // p000.class_73, p000.class_445
    public void method_342(class_343 class_343Var) {
        method_1843(class_343Var, class_343Var.method_47());
        class_286 method_982 = this.field_1954.method_982(class_343Var.method_47());
        if (method_982 instanceof class_43) {
            if (!(class_212.method_1034(new StringBuilder().insert(0, "L").append(((class_371) this.field_1954.method_982(((class_43) method_982).method_47())).method_198()).append(";").toString()) instanceof class_594)) {
                return;
            }
            method_1555(class_343Var, "NEW must not be used to create an array.");
            return;
        }
        method_1555(class_343Var, "Expecting a CONSTANT_Class operand, but found a '" + method_982 + "'.");
    }

    @Override // p000.class_73, p000.class_445
    public void method_259(class_551 class_551Var) {
        int method_47 = class_551Var.method_47();
        if (method_47 < 0) {
            method_1555(class_551Var, "Index '" + method_47 + "' must be non-negative.");
            return;
        }
        int method_1844 = method_1844() - 1;
        if (method_47 <= method_1844) {
            return;
        }
        method_1555(class_551Var, new StringBuilder().insert(0, "Index '").append(method_47).append("' must not be greater than max_locals-1 '").append(method_1844).append("'.").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_250(class_519 class_519Var) {
        int method_47 = class_519Var.method_47();
        if (method_47 >= 0) {
            int method_1844 = method_1844() - 1;
            if (method_47 <= method_1844) {
                return;
            }
            method_1555(class_519Var, new StringBuilder().insert(0, "Index '").append(method_47).append("' must not be greater than max_locals-1 '").append(method_1844).append("'.").toString());
            return;
        }
        method_1555(class_519Var, "Index '" + method_47 + "' must be non-negative.");
    }

    @Override // p000.class_73, p000.class_445
    public void method_349(class_18 class_18Var) {
        method_1843(class_18Var, class_18Var.method_47());
        class_286 method_982 = this.field_1954.method_982(class_18Var.method_47());
        if (!(method_982 instanceof class_43)) {
            method_1555(class_18Var, "Expecting a CONSTANT_Class operand, but found a '" + method_982 + "'.");
        }
        class_212 method_32 = class_18Var.method_32(this.field_1954);
        if ((method_32 instanceof class_594) && ((class_594) method_32).method_433() >= 255) {
            method_1555(class_18Var, "Not allowed to create an array with more than 255 dimensions.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_310(class_605 class_605Var) {
        method_1843(class_605Var, class_605Var.method_47());
        class_286 method_982 = this.field_1954.method_982(class_605Var.method_47());
        if (!(method_982 instanceof class_43)) {
            method_1555(class_605Var, "Expecting a CONSTANT_Class operand, but found a '" + method_982 + "'.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_360(class_507 class_507Var) {
        int method_47 = class_507Var.method_47();
        if (method_47 < 0) {
            method_1555(class_507Var, "Index '" + method_47 + "' must be non-negative.");
            return;
        }
        int method_1844 = method_1844() - 1;
        if (method_47 <= method_1844) {
            return;
        }
        method_1555(class_507Var, new StringBuilder().insert(0, "Index '").append(method_47).append("' must not be greater than max_locals-1 '").append(method_1844).append("'.").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_280(class_300 class_300Var) {
        method_1843(class_300Var, class_300Var.method_47());
        class_286 method_982 = this.field_1954.method_982(class_300Var.method_47());
        if (!(method_982 instanceof class_43)) {
            method_1555(class_300Var, "Expecting a CONSTANT_Class operand, but found a '" + method_982 + "'.");
        }
        short method_1304 = class_300Var.method_1304();
        if (method_1304 < 1) {
            method_1555(class_300Var, "Number of dimensions to create must be greater than zero.");
        }
        class_212 method_32 = class_300Var.method_32(this.field_1954);
        if (!(method_32 instanceof class_594)) {
            method_1555(class_300Var, "Expecting a CONSTANT_Class referencing an array type. [Constraint not found in The Java Virtual Machine Specification, Second Edition, 4.8.1]");
        } else {
            if (((class_594) method_32).method_433() >= method_1304) {
                return;
            }
            method_1555(class_300Var, new StringBuilder().insert(0, "Not allowed to create array with more dimensions ('+dimensions2create+') than the one referenced by the CONSTANT_Class '").append(method_32).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_325(class_391 class_391Var) {
        int method_47 = class_391Var.method_47();
        if (method_47 >= 0) {
            int method_1844 = method_1844() - 2;
            if (method_47 <= method_1844) {
                return;
            }
            method_1555(class_391Var, new StringBuilder().insert(0, "Index '").append(method_47).append("' must not be greater than max_locals-2 '").append(method_1844).append("'.").toString());
            return;
        }
        method_1555(class_391Var, "Index '" + method_47 + "' must be non-negative. [Constraint by JustIce as an analogon to the single-slot xLOAD/xSTORE instructions; may not happen anyway.]");
    }

    @Override // p000.class_73, p000.class_445
    public void method_288(class_29 class_29Var) {
        int method_47 = class_29Var.method_47();
        if (method_47 >= 0) {
            int method_1844 = method_1844() - 2;
            if (method_47 <= method_1844) {
                return;
            }
            method_1555(class_29Var, new StringBuilder().insert(0, "Index '").append(method_47).append("' must not be greater than max_locals-2 '").append(method_1844).append("'.").toString());
            return;
        }
        method_1555(class_29Var, "Index '" + method_47 + "' must be non-negative. [Constraint by JustIce as an analogon to the single-slot xLOAD/xSTORE instructions; may not happen anyway.]");
    }

    @Override // p000.class_73, p000.class_445
    public void method_364(class_126 class_126Var) {
        int method_47 = class_126Var.method_47();
        if (method_47 >= 0) {
            int method_1844 = method_1844() - 2;
            if (method_47 <= method_1844) {
                return;
            }
            method_1555(class_126Var, new StringBuilder().insert(0, "Index '").append(method_47).append("' must not be greater than max_locals-2 '").append(method_1844).append("'.").toString());
            return;
        }
        method_1555(class_126Var, "Index '" + method_47 + "' must be non-negative. [Constraint by JustIce as an analogon to the single-slot xLOAD/xSTORE instructions; may not happen anyway.]");
    }

    public boolean method_1842(Object[] objArr, Object[] objArr2) {
        if (objArr.length != objArr2.length) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        while (i < objArr.length) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        return true;
    }

    @Override // p000.class_73, p000.class_445
    public void method_394(class_203 class_203Var) {
        class_557 class_557Var;
        try {
            class_440 method_1810 = class_474.method_1810(class_203Var.method_623(this.field_1954));
            class_557[] method_904 = method_1810.method_904();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i < method_904.length) {
                    if (method_904[i2].method_464().equals(class_203Var.method_1086(this.field_1954)) && class_212.method_1033(method_904[i2].method_546()).equals(class_203Var.method_1085(this.field_1954)) && method_1842(class_212.method_1030(method_904[i2].method_546()), class_203Var.method_1388(this.field_1954))) {
                        class_557Var = method_904[i2];
                        break;
                    } else {
                        int i3 = i2 + 1;
                        i = i3;
                        i2 = i3;
                    }
                } else {
                    class_557Var = null;
                    break;
                }
            }
            if (class_557Var == null) {
                method_1555(class_203Var, "Referenced method '" + class_203Var.method_1086(this.field_1954) + "' with expected signature '" + class_203Var.method_621(this.field_1954) + "' not found in class '" + method_1810.method_546() + "'. The native verifier does allow the method to be declared in some superclass or implemented interface, which the Java Virtual Machine Specification, Second Edition does not.");
            }
            if (!method_1810.method_1641()) {
                method_1555(class_203Var, new StringBuilder().insert(0, "Referenced class '").append(method_1810.method_546()).append("' is an interface, but not a class as expected.").toString());
            }
        } catch (ClassNotFoundException e) {
            throw new class_572(new StringBuilder().insert(0, "Missing class: ").append(e.toString()).toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_272(class_161 class_161Var) {
        class_557 class_557Var;
        class_557 class_557Var2;
        try {
            class_440 method_1810 = class_474.method_1810(class_161Var.method_623(this.field_1954));
            class_557[] method_904 = method_1810.method_904();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= method_904.length) {
                    class_557Var = null;
                    class_557Var2 = null;
                    break;
                } else if (method_904[i2].method_464().equals(class_161Var.method_1086(this.field_1954)) && class_212.method_1033(method_904[i2].method_546()).equals(class_161Var.method_1085(this.field_1954)) && method_1842(class_212.method_1030(method_904[i2].method_546()), class_161Var.method_1388(this.field_1954))) {
                    class_557 class_557Var3 = method_904[i2];
                    class_557Var = class_557Var3;
                    class_557Var2 = class_557Var3;
                    break;
                } else {
                    int i3 = i2 + 1;
                    i = i3;
                    i2 = i3;
                }
            }
            if (class_557Var == null) {
                method_1555(class_161Var, "Referenced method '" + class_161Var.method_1086(this.field_1954) + "' with expected signature '" + class_161Var.method_621(this.field_1954) + "' not found in class '" + method_1810.method_546() + "'. The native verifier possibly allows the method to be declared in some superclass or implemented interface, which the Java Virtual Machine Specification, Second Edition does not.");
            } else if (!class_557Var2.method_1125()) {
                method_1555(class_161Var, new StringBuilder().insert(0, "Referenced method '").append(class_161Var.method_1086(this.field_1954)).append("' has ACC_STATIC unset.").toString());
            }
        } catch (ClassNotFoundException e) {
            throw new class_572(new StringBuilder().insert(0, "Missing class: ").append(e.toString()).toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_314(class_219 class_219Var) {
        class_557 class_557Var;
        class_557 class_557Var2;
        class_557 class_557Var3;
        class_557 class_557Var4 = null;
        try {
            class_440 method_1810 = class_474.method_1810(class_219Var.method_623(this.field_1954));
            class_557[] method_904 = method_1810.method_904();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= method_904.length) {
                    class_557Var = null;
                    break;
                }
                if (!method_904[i2].method_464().equals(class_219Var.method_1086(this.field_1954)) || !class_212.method_1033(method_904[i2].method_546()).equals(class_219Var.method_1085(this.field_1954)) || !method_1842(class_212.method_1030(method_904[i2].method_546()), class_219Var.method_1388(this.field_1954))) {
                    int i3 = i2 + 1;
                    i = i3;
                    i2 = i3;
                } else {
                    class_557Var = method_904[i2];
                    break;
                }
            }
            if (class_557Var == null) {
                method_1555(class_219Var, "Referenced method '" + class_219Var.method_1086(this.field_1954) + "' with expected signature '" + class_219Var.method_621(this.field_1954) + "' not found in class '" + method_1810.method_546() + "'. The native verifier does allow the method to be declared in some superclass or implemented interface, which the Java Virtual Machine Specification, Second Edition does not.");
            }
            class_440 method_18102 = class_474.method_1810(class_184.method_868(this.field_1953).method_1062());
            if (!method_18102.method_1624() || !class_474.method_1816(method_18102, method_1810) || method_18102.equals(method_1810) || class_219Var.method_1086(this.field_1954).equals("<init>")) {
                return;
            }
            int i4 = -1;
            while (true) {
                if (i4 == 0) {
                    class_557Var2 = class_557Var4;
                    break;
                }
                int method_927 = method_18102.method_927();
                class_440 method_18103 = class_474.method_1810(method_18102.method_1631());
                class_557[] method_9042 = method_18103.method_904();
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    if (i5 >= method_9042.length) {
                        class_557Var3 = class_557Var4;
                        class_557Var2 = class_557Var4;
                        break;
                    } else if (!method_9042[i6].method_464().equals(class_219Var.method_1086(this.field_1954)) || !class_212.method_1033(method_9042[i6].method_546()).equals(class_219Var.method_1085(this.field_1954)) || !method_1842(class_212.method_1030(method_9042[i6].method_546()), class_219Var.method_1388(this.field_1954))) {
                        int i7 = i6 + 1;
                        i5 = i7;
                        i6 = i7;
                    } else {
                        class_557 class_557Var5 = method_9042[i6];
                        class_557Var3 = class_557Var5;
                        class_557Var2 = class_557Var5;
                        break;
                    }
                }
                if (class_557Var3 != null) {
                    break;
                }
                i4 = method_927;
                class_557Var4 = class_557Var2;
                method_18102 = method_18103;
            }
            if (class_557Var2 == null) {
                method_1555(class_219Var, new StringBuilder().insert(0, "ACC_SUPER special lookup procedure not successful: method '").append(class_219Var.method_1086(this.field_1954)).append("' with proper signature not declared in superclass hierarchy.").toString());
            }
        } catch (ClassNotFoundException e) {
            throw new class_572(new StringBuilder().insert(0, "Missing class: ").append(e.toString()).toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_330(class_483 class_483Var) {
        class_557 class_557Var;
        try {
            class_440 method_1810 = class_474.method_1810(class_483Var.method_623(this.field_1954));
            class_557[] method_904 = method_1810.method_904();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i < method_904.length) {
                    if (method_904[i2].method_464().equals(class_483Var.method_1086(this.field_1954)) && class_212.method_1033(method_904[i2].method_546()).equals(class_483Var.method_1085(this.field_1954)) && method_1842(class_212.method_1030(method_904[i2].method_546()), class_483Var.method_1388(this.field_1954))) {
                        class_557Var = method_904[i2];
                        break;
                    } else {
                        int i3 = i2 + 1;
                        i = i3;
                        i2 = i3;
                    }
                } else {
                    class_557Var = null;
                    break;
                }
            }
            if (class_557Var == null) {
                method_1555(class_483Var, "Referenced method '" + class_483Var.method_1086(this.field_1954) + "' with expected signature '" + class_483Var.method_621(this.field_1954) + "' not found in class '" + method_1810.method_546() + "'. The native verifier does allow the method to be declared in some superinterface, which the Java Virtual Machine Specification, Second Edition does not.");
            }
            if (method_1810.method_1641()) {
                method_1555(class_483Var, new StringBuilder().insert(0, "Referenced class '").append(method_1810.method_546()).append("' is a class, but not an interface as expected.").toString());
            }
        } catch (ClassNotFoundException e) {
            throw new class_572(new StringBuilder().insert(0, "Missing class: ").append(e.toString()).toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_277(class_562 class_562Var) {
        class_261 class_261Var;
        class_261 class_261Var2;
        try {
            String method_1086 = class_562Var.method_1086(this.field_1954);
            class_261[] method_898 = class_474.method_1810(class_562Var.method_622(this.field_1954).method_464()).method_898();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= method_898.length) {
                    class_261Var = null;
                    class_261Var2 = null;
                    break;
                } else if (method_898[i2].method_464().equals(method_1086)) {
                    class_261 class_261Var3 = method_898[i2];
                    class_261Var = class_261Var3;
                    class_261Var2 = class_261Var3;
                    break;
                } else {
                    int i3 = i2 + 1;
                    i = i3;
                    i2 = i3;
                }
            }
            if (class_261Var == null) {
                throw new class_572("Field not found?!?");
            }
            if (!class_261Var2.method_1125()) {
                method_1555(class_562Var, "Referenced field '" + class_261Var2 + "' is not static which it should be.");
            }
        } catch (ClassNotFoundException e) {
            throw new class_572(new StringBuilder().insert(0, "Missing class: ").append(e.toString()).toString());
        }
    }
}
