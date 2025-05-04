package com.allatori.ant;

import com.allatori.exception.runtime.RuntimeException_236;
import com.allatori.interfaces.unmapped.class_194;
import com.allatori.interfaces.unmapped.class_263;
import com.allatori.interfaces.unmapped.class_445;
import com.allatori.interfaces.unmapped.class_601;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_394 extends class_73 implements class_445 {
    public static class_392 field_1244 = new class_392("com.allatori.iiIIIiIiIi");
    public class_277 field_1247 = null;
    public class_208 field_1246 = null;
    public class_591 field_1245 = null;

    @Override // p000.class_73, p000.class_445
    public void method_471(class_71 class_71Var) {
        method_1553(class_71Var);
    }

    public void method_1552(class_591 class_591Var) {
        this.field_1245 = class_591Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: class_601 */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.class_73, p000.class_445
    public void method_486(class_601 class_601Var) {
        method_1553((class_539) class_601Var);
    }

    public void method_351(class_277 class_277Var) {
        this.field_1247 = class_277Var;
    }

    @Override // p000.class_73, p000.class_445
    public void method_305(class_467 class_467Var) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: class_194 */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.class_73, p000.class_445
    public void method_472(class_194 class_194Var) {
        method_1553((class_539) class_194Var);
    }

    public void method_1553(class_539 class_539Var) {
        int method_896 = class_539Var.method_896(this.field_1246);
        if (method_896 > method_386().method_22()) {
            method_1555(class_539Var, "Cannot consume " + method_896 + " stack slots: only " + method_386().method_22() + " slot(s) left on stack!\nStack:\n" + method_386());
        }
        int method_1387 = class_539Var.method_1387(this.field_1246) - class_539Var.method_896(this.field_1246);
        if (method_386().method_22() + method_1387 > method_386().method_25()) {
            method_1555(class_539Var, new StringBuilder().insert(0, "Cannot produce ").append(method_1387).append(" stack slots: only ").append(method_386().method_25() - method_386().method_22()).append(" free stack slot(s) left.\nStack:\n").append(method_386()).toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_353(class_328 class_328Var) {
        try {
            class_212 method_27 = method_386().method_27(2);
            class_212 method_272 = method_386().method_27(1);
            class_212 method_273 = method_386().method_27(0);
            method_1554(class_328Var, method_272);
            if (!(method_273 instanceof class_592)) {
                method_1555(class_328Var, "The 'value' is not of a ReferenceType but of type " + method_273 + ".");
            }
            if (method_1557(class_328Var, method_27)) {
                if (!(((class_594) method_27).method_2057() instanceof class_592)) {
                    method_1555(class_328Var, new StringBuilder().insert(0, "The 'arrayref' does not refer to an array with elements of a ReferenceType but to an array of ").append(((class_594) method_27).method_2057()).append(".").toString());
                }
                if (!((class_592) method_273).method_1987((class_592) ((class_594) method_27).method_2057())) {
                    method_1555(class_328Var, new StringBuilder().insert(0, "The type of 'value' ('").append(method_273).append("') is not assignment compatible to the components of the array 'arrayref' refers to. ('").append(((class_594) method_27).method_2057()).append("')").toString());
                }
            }
        } catch (ClassNotFoundException e) {
            throw new class_572(new StringBuilder().insert(0, "Missing class: ").append(e.toString()).toString());
        }
    }

    public void method_1555(class_539 class_539Var, String str) {
        String name = class_539Var.getClass().getName();
        throw new RuntimeException_236(new StringBuilder().insert(0, "Instruction ").append(name.substring(name.lastIndexOf(46) + 1)).append(" constraint violated: ").append(str).toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_469(class_288 class_288Var) {
        class_288 class_288Var2;
        class_212 method_669 = this.field_1245.method_669();
        if (method_669 == class_212.field_813 || method_669 == class_212.field_795 || method_669 == class_212.field_801 || method_669 == class_212.field_806) {
            method_669 = class_212.field_802;
        }
        if (!(class_288Var instanceof class_537)) {
            class_288Var2 = class_288Var;
        } else if (method_669 != class_212.field_794) {
            method_1555(class_288Var, "RETURN instruction in non-void method.");
            class_288Var2 = class_288Var;
        } else {
            return;
        }
        if (class_288Var2 instanceof class_264) {
            if (method_386().method_20() != class_212.field_796) {
                if (!(method_386().method_20() instanceof class_592)) {
                    method_1555(class_288Var, "Reference type expected on top of stack, but is: '" + method_386().method_20() + "'.");
                }
                method_1556(class_288Var, (class_592) method_386().method_20());
                return;
            }
            return;
        }
        if (!method_669.equals(method_386().method_20())) {
            method_1555(class_288Var, new StringBuilder().insert(0, "Current method has return type of '").append(this.field_1245.method_669()).append("' expecting a '").append(method_669).append("' on top of the stack. But stack top is a '").append(method_386().method_20()).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_496(class_239 class_239Var) {
        class_286 method_982 = this.field_1246.method_982(class_239Var.method_47());
        if (!(method_982 instanceof class_530)) {
            method_1555(class_239Var, "Index '" + class_239Var.method_47() + "' should refer to a CONSTANT_Fieldref_info structure, but refers to '" + method_982 + "'.");
        }
        class_212 method_32 = class_239Var.method_32(this.field_1246);
        if (method_32 instanceof class_392) {
            String method_464 = ((class_392) method_32).method_464();
            class_275 method_1059 = class_412.method_1574(method_464).method_1059();
            if (method_1059.method_1212() != 1) {
                method_1555(class_239Var, new StringBuilder().insert(0, "Class '").append(method_464).append("' is referenced, but cannot be loaded and resolved: '").append(method_1059).append("'.").toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // p000.class_73, p000.class_445
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void method_483(class_226 class_226Var) {
        class_394 class_394Var;
        if (method_374().method_1609(class_226Var.method_47()) == class_212.field_803) {
            method_1555(class_226Var, "Read-Access on local variable " + class_226Var.method_47() + " with unknown content.");
        }
        if (class_226Var.method_32(this.field_1246).method_47() == 2 && method_374().method_1609(class_226Var.method_47() + 1) != class_212.field_803) {
            method_1555(class_226Var, new StringBuilder().insert(0, "Reading a two-locals value from local variables ").append(class_226Var.method_47()).append(" and ").append(class_226Var.method_47() + 1).append(" where the latter one is destroyed.").toString());
        }
        if (!(class_226Var instanceof class_519)) {
            if (method_374().method_1609(class_226Var.method_47()) != class_226Var.method_32(this.field_1246)) {
                method_1555(class_226Var, new StringBuilder().insert(0, "Local Variable type and LOADing Instruction type mismatch: Local Variable: '").append(method_374().method_1609(class_226Var.method_47())).append("'; Instruction type: '").append(class_226Var.method_32(this.field_1246)).append("'.").toString());
                class_394Var = this;
                if (class_394Var.method_386().method_25() - method_386().method_22() < class_226Var.method_32(this.field_1246).method_47()) {
                    return;
                }
                method_1555(class_226Var, new StringBuilder().insert(0, "Not enough free stack slots to load a '").append(class_226Var.method_32(this.field_1246)).append("' onto the OperandStack.").toString());
                return;
            }
        } else if (!(method_374().method_1609(class_226Var.method_47()) instanceof class_592)) {
            method_1555(class_226Var, new StringBuilder().insert(0, "Local Variable type and LOADing Instruction type mismatch: Local Variable: '").append(method_374().method_1609(class_226Var.method_47())).append("'; Instruction expects a ReferenceType.").toString());
        }
        class_394Var = this;
        if (class_394Var.method_386().method_25() - method_386().method_22() < class_226Var.method_32(this.field_1246).method_47()) {
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_285(class_541 class_541Var) {
        method_1557(class_541Var, method_386().method_27(0));
    }

    public void method_1554(class_539 class_539Var, class_212 class_212Var) {
        if (!class_212Var.equals(class_212.field_802)) {
            method_1555(class_539Var, "The 'index' is not of type int but of type " + class_212Var + ".");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_282(class_504 class_504Var) {
        class_212 method_27 = method_386().method_27(1);
        method_1554(class_504Var, method_386().method_27(0));
        if (method_1557(class_504Var, method_27) && !((class_594) method_27).method_2057().equals(class_212.field_813) && !((class_594) method_27).method_2057().equals(class_212.field_795)) {
            method_1555(class_504Var, "The 'arrayref' does not refer to an array with elements of a Type.BYTE or Type.BOOLEAN but to an array of '" + ((class_594) method_27).method_2057() + "'.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_349(class_18 class_18Var) {
        if (!method_386().method_20().equals(class_212.field_802)) {
            method_1555(class_18Var, "The 'count' at the stack top is not of type '" + class_212.field_802 + "' but of type '" + method_386().method_20() + "'.");
        }
    }

    public class_426 method_374() {
        return this.field_1247.method_1215();
    }

    @Override // p000.class_73, p000.class_445
    public void method_356(class_435 class_435Var) {
        class_212 method_27 = method_386().method_27(2);
        class_212 method_272 = method_386().method_27(1);
        class_212 method_273 = method_386().method_27(0);
        method_1554(class_435Var, method_272);
        method_1551(class_435Var, method_273);
        if (method_1557(class_435Var, method_27) && !((class_594) method_27).method_2057().equals(class_212.field_813) && !((class_594) method_27).method_2057().equals(class_212.field_795)) {
            method_1555(class_435Var, "The 'arrayref' does not refer to an array with elements of a Type.BYTE or Type.BOOLEAN but to an array of '" + ((class_594) method_27).method_2057() + "'.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_492(class_508 class_508Var) {
        if (method_374().method_1607() > (class_508Var.method_32(this.field_1246).method_47() == 1 ? class_508Var.method_47() : class_508Var.method_47() + 1)) {
            return;
        }
        method_1555(class_508Var, "The 'index' is not a valid index into the local variable array.");
    }

    public void method_298(class_208 class_208Var) {
        this.field_1246 = class_208Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: class_263 */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.class_73, p000.class_445
    public void method_490(class_263 class_263Var) {
        class_392 method_42 = class_263Var.method_42(this.field_1246);
        if (method_42 != null) {
            class_275 method_1059 = class_412.method_1574(method_42.method_464()).method_1059();
            if (method_1059.method_1212() != 1) {
                method_1555((class_539) class_263Var, new StringBuilder().insert(0, "Class '").append(class_263Var.method_42(this.field_1246).method_464()).append("' is referenced, but cannot be loaded and resolved: '").append(method_1059).append("'.").toString());
            }
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_250(class_519 class_519Var) {
    }

    public void method_1551(class_539 class_539Var, class_212 class_212Var) {
        if (!class_212Var.equals(class_212.field_802)) {
            method_1555(class_539Var, "The 'value' is not of type int but of type " + class_212Var + ".");
        }
    }

    public void method_1556(class_539 class_539Var, class_592 class_592Var) {
        if (!(class_592Var instanceof class_356)) {
            return;
        }
        method_1555(class_539Var, "Working on an uninitialized object '" + class_592Var + "'.");
    }

    @Override // p000.class_73, p000.class_445
    public void method_497(class_459 class_459Var) {
    }

    @Override // p000.class_73, p000.class_445
    public void method_340(class_264 class_264Var) {
        if (!(method_386().method_20() instanceof class_592)) {
            method_1555(class_264Var, "The 'objectref' at the stack top is not of a ReferenceType but of type '" + method_386().method_20() + "'.");
        }
        method_1556(class_264Var, (class_592) method_386().method_20());
    }

    @Override // p000.class_73, p000.class_445
    public void method_252(class_196 class_196Var) {
        if (!(method_386().method_20() instanceof class_592) && !(method_386().method_20() instanceof class_211)) {
            method_1555(class_196Var, "The 'objectref' is not of a ReferenceType or of ReturnaddressType but of " + method_386().method_20() + ".");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_480(class_24 class_24Var) {
        if (method_386().method_24()) {
            method_1555(class_24Var, "Cannot STORE: Stack to read from is empty.");
        }
        if (class_24Var instanceof class_196) {
            class_212 method_20 = method_386().method_20();
            if (!(method_20 instanceof class_592) && !(method_20 instanceof class_211)) {
                method_1555(class_24Var, new StringBuilder().insert(0, "Stack top type and STOREing Instruction type mismatch: Stack top: '").append(method_386().method_20()).append("'; Instruction expects a ReferenceType or a ReturnadressType.").toString());
                return;
            }
            return;
        }
        if (method_386().method_20() != class_24Var.method_32(this.field_1246)) {
            method_1555(class_24Var, "Stack top type and STOREing Instruction type mismatch: Stack top: '" + method_386().method_20() + "'; Instruction type: '" + class_24Var.method_32(this.field_1246) + "'.");
        }
    }

    public boolean method_1557(class_539 class_539Var, class_212 class_212Var) {
        if (!(class_212Var instanceof class_594) && !class_212Var.equals(class_212.field_796)) {
            method_1555(class_539Var, "The 'arrayref' does not refer to an array but is of type " + class_212Var + ".");
        }
        return class_212Var instanceof class_594;
    }

    @Override // p000.class_73, p000.class_445
    public void method_494(class_418 class_418Var) {
        int method_47 = class_418Var.method_47();
        if (method_47 >= 0 && method_47 < this.field_1246.method_47()) {
        } else {
            throw new class_572(new StringBuilder().insert(0, "Huh?! Constant pool index of instruction '").append(class_418Var).append("' illegal? Pass 3a should have checked this!").toString());
        }
    }

    public class_11 method_386() {
        return this.field_1247.method_1214();
    }

    @Override // p000.class_73, p000.class_445
    public void method_367(class_115 class_115Var) {
        try {
            if (!(method_386().method_20() instanceof class_392) && !method_386().method_20().equals(class_212.field_796)) {
                method_1555(class_115Var, "The 'objectref' is not of an (initialized) ObjectType but of type " + method_386().method_20() + ".");
            }
            if (!method_386().method_20().equals(class_212.field_796)) {
                class_392 class_392Var = (class_392) method_386().method_20();
                class_392 class_392Var2 = (class_392) class_212.method_1034("Ljava/lang/Throwable;");
                if (!class_392Var.method_1549(class_392Var2) && !class_392Var.equals(class_392Var2)) {
                    method_1555(class_115Var, new StringBuilder().insert(0, "The 'objectref' is not of class Throwable or of a subclass of Throwable, but of '").append(method_386().method_20()).append("'.").toString());
                }
            }
        } catch (ClassNotFoundException e) {
            throw new class_572(new StringBuilder().insert(0, "Missing class: ").append(e.toString()).toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_334(class_86 class_86Var) {
        class_212 method_27 = method_386().method_27(1);
        method_1554(class_86Var, method_386().method_27(0));
        if (!method_1557(class_86Var, method_27) || (((class_594) method_27).method_2057() instanceof class_592)) {
            return;
        }
        method_1555(class_86Var, "The 'arrayref' does not refer to an array with elements of a ReferenceType but to an array of " + ((class_594) method_27).method_2057() + ".");
    }

    @Override // p000.class_73, p000.class_445
    public void method_288(class_29 class_29Var) {
    }

    @Override // p000.class_73, p000.class_445
    public void method_322(class_295 class_295Var) {
        if (method_386().method_20() != class_212.field_810) {
            method_1555(class_295Var, "The value at the stack top is not of type 'double', but of type '" + method_386().method_20() + "'.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_346(class_259 class_259Var) {
        if (method_386().method_20() != class_212.field_810) {
            method_1555(class_259Var, "The value at the stack top is not of type 'double', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) == class_212.field_810) {
            return;
        }
        method_1555(class_259Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'double', but of type '").append(method_386().method_27(1)).append("'.").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_329(class_209 class_209Var) {
        if (method_386().method_20().method_47() != 1) {
            method_1555(class_209Var, "Type on stack top '" + method_386().method_20() + "' should occupy exactly one slot, not '" + method_386().method_20().method_47() + "'.");
        }
        if (method_386().method_27(1).method_47() != 1) {
            method_1555(class_209Var, new StringBuilder().insert(0, "Type on stack next-to-top '").append(method_386().method_27(1)).append("' should occupy exactly one slot, not '").append(method_386().method_27(1).method_47()).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_251(class_55 class_55Var) {
        if (method_386().method_20() != class_212.field_810) {
            method_1555(class_55Var, "The value at the stack top is not of type 'double', but of type '" + method_386().method_20() + "'.");
        }
        method_1554(class_55Var, method_386().method_27(1));
        if (method_386().method_27(2) == class_212.field_796) {
            return;
        }
        if (!(method_386().method_27(2) instanceof class_594)) {
            method_1555(class_55Var, new StringBuilder().insert(0, "Stack next-to-next-to-top must be of type double[] but is '").append(method_386().method_27(2)).append("'.").toString());
        }
        if (((class_594) method_386().method_27(2)).method_669() == class_212.field_810) {
            return;
        }
        method_1555(class_55Var, new StringBuilder().insert(0, "Stack next-to-next-to-top must be of type double[] but is '").append(method_386().method_27(2)).append("'.").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_363(class_535 class_535Var) {
        if (method_386().method_20() != class_212.field_810) {
            method_1555(class_535Var, "The value at the stack top is not of type 'double', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_810) {
            method_1555(class_535Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'double', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_347(class_227 class_227Var) {
        if (method_386().method_20() != class_212.field_812) {
            method_1555(class_227Var, "The value at the stack top is not of type 'float', but of type '" + method_386().method_20() + "'.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_265(class_479 class_479Var) {
        if (method_386().method_20() != class_212.field_810) {
            method_1555(class_479Var, "The value at the stack top is not of type 'double', but of type '" + method_386().method_20() + "'.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_379(class_185 class_185Var) {
        method_1554(class_185Var, method_386().method_20());
        if (method_386().method_27(1) == class_212.field_796) {
            return;
        }
        if (!(method_386().method_27(1) instanceof class_594)) {
            method_1555(class_185Var, "Stack next-to-top must be of type double[] but is '" + method_386().method_27(1) + "'.");
        }
        if (((class_594) method_386().method_27(1)).method_669() != class_212.field_810) {
            method_1555(class_185Var, new StringBuilder().insert(0, "Stack next-to-top must be of type double[] but is '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_310(class_605 class_605Var) {
        class_212 method_27 = method_386().method_27(0);
        if (!(method_27 instanceof class_592)) {
            method_1555(class_605Var, "The 'objectref' is not of a ReferenceType but of type " + method_27 + ".");
        }
        class_286 method_982 = this.field_1246.method_982(class_605Var.method_47());
        if (!(method_982 instanceof class_43)) {
            method_1555(class_605Var, new StringBuilder().insert(0, "The Constant at 'index' is not a ConstantClass, but '").append(method_982).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_324(class_41 class_41Var) {
        if (method_386().method_20() != class_212.field_810) {
            method_1555(class_41Var, "The value at the stack top is not of type 'double', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_810) {
            method_1555(class_41Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'double', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_309(class_464 class_464Var) {
        if (method_386().method_20().method_47() != 1) {
            method_1555(class_464Var, "Stack top type must be of size 1, but is '" + method_386().method_20() + "' of size '" + method_386().method_20().method_47() + "'.");
        }
        if (method_386().method_27(1).method_47() != 2 && method_386().method_27(2).method_47() != 1) {
            method_1555(class_464Var, new StringBuilder().insert(0, "If stack top's size is 1 and stack next-to-top's size is 1, stack next-to-next-to-top's size must also be 1, but is: '").append(method_386().method_27(2)).append("' of size '").append(method_386().method_27(2).method_47()).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_278(class_281 class_281Var) {
    }

    @Override // p000.class_73, p000.class_445
    public void method_318(class_376 class_376Var) {
        if (method_386().method_20().method_47() != 1) {
            method_1555(class_376Var, "Won't DUP type on stack top '" + method_386().method_20() + "' because it must occupy exactly one slot, not '" + method_386().method_20().method_47() + "'.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_345(class_218 class_218Var) {
        if (method_386().method_20().method_47() != 2 && method_386().method_27(1).method_47() != 1) {
            method_1555(class_218Var, "If stack top's size is 1, then stack next-to-top's size must also be 1. But it is '" + method_386().method_27(1) + "' of size '" + method_386().method_27(1).method_47() + "'.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_331(class_244 class_244Var) {
        if (method_386().method_20() != class_212.field_810) {
            method_1555(class_244Var, "The value at the stack top is not of type 'double', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) == class_212.field_810) {
            return;
        }
        method_1555(class_244Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'double', but of type '").append(method_386().method_27(1)).append("'.").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_373(class_361 class_361Var) {
        class_212 method_27 = method_386().method_27(1);
        method_1554(class_361Var, method_386().method_27(0));
        method_1557(class_361Var, method_27);
    }

    @Override // p000.class_73, p000.class_445
    public void method_325(class_391 class_391Var) {
    }

    @Override // p000.class_73, p000.class_445
    public void method_304(class_132 class_132Var) {
        if (method_386().method_20().method_47() == 2) {
            if (method_386().method_27(1).method_47() == 1) {
                return;
            }
            method_1555(class_132Var, "If stack top's size is 2, then stack next-to-top's size must be 1. But it is '" + method_386().method_27(1) + "' of size '" + method_386().method_27(1).method_47() + "'.");
        } else {
            if (method_386().method_27(1).method_47() != 1) {
                method_1555(class_132Var, new StringBuilder().insert(0, "If stack top's size is 1, then stack next-to-top's size must also be 1. But it is '").append(method_386().method_27(1)).append("' of size '").append(method_386().method_27(1).method_47()).append("'.").toString());
            }
            if (method_386().method_27(2).method_47() != 1) {
                method_1555(class_132Var, new StringBuilder().insert(0, "If stack top's size is 1, then stack next-to-next-to-top's size must also be 1. But it is '").append(method_386().method_27(2)).append("' of size '").append(method_386().method_27(2).method_47()).append("'.").toString());
            }
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_395(class_397 class_397Var) {
        if (method_386().method_20() == class_212.field_810) {
            return;
        }
        method_1555(class_397Var, "The value at the stack top is not of type 'double', but of type '" + method_386().method_20() + "'.");
    }

    @Override // p000.class_73, p000.class_445
    public void method_311(class_223 class_223Var) {
        if (method_386().method_20() != class_212.field_810) {
            method_1555(class_223Var, "The value at the stack top is not of type 'double', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_810) {
            method_1555(class_223Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'double', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_287(class_523 class_523Var) {
        if (method_386().method_20() == class_212.field_810) {
            return;
        }
        method_1555(class_523Var, "The value at the stack top is not of type 'double', but of type '" + method_386().method_20() + "'.");
    }

    @Override // p000.class_73, p000.class_445
    public void method_348(class_384 class_384Var) {
        if (method_386().method_20() != class_212.field_812) {
            method_1555(class_384Var, "The value at the stack top is not of type 'float', but of type '" + method_386().method_20() + "'.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_339(class_402 class_402Var) {
        if (method_386().method_20() == class_212.field_810) {
            return;
        }
        method_1555(class_402Var, "The value at the stack top is not of type 'double', but of type '" + method_386().method_20() + "'.");
    }

    @Override // p000.class_73, p000.class_445
    public void method_255(class_199 class_199Var) {
        if (method_386().method_20() != class_212.field_810) {
            method_1555(class_199Var, "The value at the stack top is not of type 'double', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_810) {
            method_1555(class_199Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'double', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_396(class_39 class_39Var) {
        if (method_386().method_27(0).method_47() != 2) {
            if (method_386().method_27(1).method_47() == 1 && (method_386().method_27(2).method_47() == 2 || method_386().method_27(3).method_47() == 1)) {
                return;
            }
        } else if (method_386().method_27(1).method_47() != 2 && method_386().method_27(2).method_47() != 1) {
            method_1555(class_39Var, "If stack top's size is 2 and stack-next-to-top's size is 1, then stack next-to-next-to-top's size must also be 1. But it is '" + method_386().method_27(2) + "' of size '" + method_386().method_27(2).method_47() + "'.");
        } else {
            return;
        }
        method_1555(class_39Var, "The operand sizes on the stack do not match any of the four forms of usage of this instruction.");
    }

    @Override // p000.class_73, p000.class_445
    public void method_489(class_487 class_487Var) {
        throw new class_572("In this JustIce verification pass there should not occur an illegal instruction such as BREAKPOINT.");
    }

    @Override // p000.class_73, p000.class_445
    public void method_320(class_369 class_369Var) {
        if (method_386().method_20() != class_212.field_810) {
            method_1555(class_369Var, "The value at the stack top is not of type 'double', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_810) {
            method_1555(class_369Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'double', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_370(class_114 class_114Var) {
    }

    @Override // p000.class_73, p000.class_445
    public void method_390(class_64 class_64Var) {
        class_212 method_27 = method_386().method_27(2);
        class_212 method_272 = method_386().method_27(1);
        class_212 method_273 = method_386().method_27(0);
        method_1554(class_64Var, method_272);
        method_1551(class_64Var, method_273);
        if (method_1557(class_64Var, method_27) && !((class_594) method_27).method_2057().equals(class_212.field_806)) {
            method_1555(class_64Var, "The 'arrayref' does not refer to an array with elements of type char but to an array of type " + ((class_594) method_27).method_2057() + ".");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_327(class_399 class_399Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_399Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
        method_1554(class_399Var, method_386().method_27(1));
        if (method_386().method_27(2) != class_212.field_796) {
            if (!(method_386().method_27(2) instanceof class_594)) {
                method_1555(class_399Var, new StringBuilder().insert(0, "Stack next-to-next-to-top must be of type int[] but is '").append(method_386().method_27(2)).append("'.").toString());
            }
            if (((class_594) method_386().method_27(2)).method_669() != class_212.field_802) {
                method_1555(class_399Var, new StringBuilder().insert(0, "Stack next-to-next-to-top must be of type int[] but is '").append(method_386().method_27(2)).append("'.").toString());
            }
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_263(class_335 class_335Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_335Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_343(class_245 class_245Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_245Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_336(class_12 class_12Var) {
        if (method_386().method_20() != class_212.field_812) {
            method_1555(class_12Var, "The value at the stack top is not of type 'float', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) == class_212.field_812) {
            return;
        }
        method_1555(class_12Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'float', but of type '").append(method_386().method_27(1)).append("'.").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_297(class_174 class_174Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_174Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) == class_212.field_802) {
            return;
        }
        method_1555(class_174Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'int', but of type '").append(method_386().method_27(1)).append("'.").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_354(class_222 class_222Var) {
        if (method_386().method_20() != class_212.field_812) {
            method_1555(class_222Var, "The value at the stack top is not of type 'float', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_812) {
            method_1555(class_222Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'float', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_283(class_292 class_292Var) {
    }

    @Override // p000.class_73, p000.class_445
    public void method_341(class_501 class_501Var) {
        class_261 class_261Var;
        class_261 class_261Var2;
        class_261 class_261Var3;
        class_261 class_261Var4;
        try {
            class_212 method_20 = method_386().method_20();
            if (!(method_20 instanceof class_392) && method_20 != class_212.field_796) {
                method_1555(class_501Var, "Stack top should be an object reference that's not an array reference, but is '" + method_20 + "'.");
            }
            String method_1086 = class_501Var.method_1086(this.field_1246);
            class_440 method_1810 = class_474.method_1810(class_501Var.method_622(this.field_1246).method_464());
            class_261[] method_898 = method_1810.method_898();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= method_898.length) {
                    class_261Var = null;
                    class_261Var2 = null;
                    break;
                } else if (!method_898[i2].method_464().equals(method_1086) || !class_212.method_1034(method_898[i2].method_546()).equals(class_501Var.method_32(this.field_1246))) {
                    int i3 = i2 + 1;
                    i = i3;
                    i2 = i3;
                } else {
                    class_261 class_261Var5 = method_898[i2];
                    class_261Var = class_261Var5;
                    class_261Var2 = class_261Var5;
                    break;
                }
            }
            if (class_261Var == null) {
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
                        if (method_8982[i7].method_464().equals(method_1086) && class_212.method_1034(method_8982[i7].method_546()).equals(class_501Var.method_32(this.field_1246))) {
                            class_261Var2 = method_8982[i7];
                            if ((class_261Var2.method_433() & 5) == 0) {
                                class_261Var4 = null;
                                class_261Var3 = null;
                            }
                        } else {
                            int i8 = i7 + 1;
                            i6 = i8;
                            i7 = i8;
                        }
                    }
                    int i9 = i5 + 1;
                    i4 = i9;
                    i5 = i9;
                }
                class_261Var4 = class_261Var2;
                class_261Var3 = class_261Var2;
                if (class_261Var4 == null) {
                    throw new class_572(new StringBuilder().insert(0, "Field '").append(method_1086).append("' not found?!?").toString());
                }
            } else {
                class_261Var3 = class_261Var2;
            }
            if (class_261Var3.method_1129()) {
                class_392 method_622 = class_501Var.method_622(this.field_1246);
                class_392 class_392Var = new class_392(this.field_1245.method_546());
                if (method_622.equals(class_392Var) || class_392Var.method_1549(method_622)) {
                    class_212 method_202 = method_386().method_20();
                    if (method_202 != class_212.field_796) {
                        if (!(method_202 instanceof class_392)) {
                            method_1555(class_501Var, new StringBuilder().insert(0, "The 'objectref' must refer to an object that's not an array. Found instead: '").append(method_202).append("'.").toString());
                        }
                        class_392 class_392Var2 = (class_392) method_202;
                        if (class_392Var2.equals(class_392Var) || !class_392Var2.method_1549(class_392Var)) {
                        }
                    } else {
                        return;
                    }
                }
            }
            if (class_261Var3.method_1125()) {
                method_1555(class_501Var, new StringBuilder().insert(0, "Referenced field '").append(class_261Var3).append("' is static which it shouldn't be.").toString());
            }
        } catch (ClassNotFoundException e) {
            throw new class_572(new StringBuilder().insert(0, "Missing class: ").append(e.toString()).toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_308(class_13 class_13Var) {
        method_1554(class_13Var, method_386().method_20());
        if (method_386().method_27(1) == class_212.field_796) {
            return;
        }
        if (!(method_386().method_27(1) instanceof class_594)) {
            method_1555(class_13Var, "Stack next-to-top must be of type int[] but is '" + method_386().method_27(1) + "'.");
        }
        if (((class_594) method_386().method_27(1)).method_669() == class_212.field_802) {
            return;
        }
        method_1555(class_13Var, new StringBuilder().insert(0, "Stack next-to-top must be of type int[] but is '").append(method_386().method_27(1)).append("'.").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_369(class_517 class_517Var) {
        if (method_386().method_20() != class_212.field_812) {
            method_1555(class_517Var, "The value at the stack top is not of type 'float', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_812) {
            method_1555(class_517Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'float', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_326(class_10 class_10Var) {
        method_1554(class_10Var, method_386().method_20());
        if (method_386().method_27(1) != class_212.field_796) {
            if (!(method_386().method_27(1) instanceof class_594)) {
                method_1555(class_10Var, "Stack next-to-top must be of type float[] but is '" + method_386().method_27(1) + "'.");
            }
            if (((class_594) method_386().method_27(1)).method_669() != class_212.field_812) {
                method_1555(class_10Var, new StringBuilder().insert(0, "Stack next-to-top must be of type float[] but is '").append(method_386().method_27(1)).append("'.").toString());
            }
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_357(class_582 class_582Var) {
        if (method_386().method_20() != class_212.field_812) {
            method_1555(class_582Var, "The value at the stack top is not of type 'float', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_812) {
            method_1555(class_582Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'float', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_284(class_167 class_167Var) {
        if (method_386().method_20() == class_212.field_802) {
            return;
        }
        method_1555(class_167Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
    }

    @Override // p000.class_73, p000.class_445
    public void method_286(class_165 class_165Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_165Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_802) {
            method_1555(class_165Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'int', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_253(class_178 class_178Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_178Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_802) {
            method_1555(class_178Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'int', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_392(class_342 class_342Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_342Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_333(class_379 class_379Var) {
        if (method_386().method_20() != class_212.field_812) {
            method_1555(class_379Var, "The value at the stack top is not of type 'float', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) == class_212.field_812) {
            return;
        }
        method_1555(class_379Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'float', but of type '").append(method_386().method_27(1)).append("'.").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_330(class_483 class_483Var) {
        int i = 1;
        int method_183 = class_483Var.method_183();
        if (method_183 == 0) {
            method_1555(class_483Var, "The 'count' argument must not be 0.");
        }
        class_212 method_32 = class_483Var.method_32(this.field_1246);
        if (method_32 instanceof class_392) {
            String method_464 = ((class_392) method_32).method_464();
            class_275 method_1059 = class_412.method_1574(method_464).method_1059();
            if (method_1059.method_1212() != 1) {
                method_1555(class_483Var, "Class '" + method_464 + "' is referenced, but cannot be loaded and resolved: '" + method_1059 + "'.");
            }
        }
        class_212[] method_1388 = class_483Var.method_1388(this.field_1246);
        int length = method_1388.length;
        int i2 = length - 1;
        int i3 = i2;
        int i4 = i2;
        while (i3 >= 0) {
            class_212 method_27 = method_386().method_27((length - 1) - i4);
            class_212 class_212Var = method_1388[i4];
            if (class_212Var == class_212.field_813 || class_212Var == class_212.field_795 || class_212Var == class_212.field_806 || class_212Var == class_212.field_801) {
                class_212Var = class_212.field_802;
            }
            if (!method_27.equals(class_212Var)) {
                if (!(method_27 instanceof class_592) || !(class_212Var instanceof class_592)) {
                    method_1555(class_483Var, new StringBuilder().insert(0, "Expecting a '").append(class_212Var).append("' but found a '").append(method_27).append("' on the stack.").toString());
                } else {
                    method_1556(class_483Var, (class_592) method_27);
                }
            }
            int i5 = i4 - 1;
            i3 = i5;
            i4 = i5;
        }
        class_212 method_272 = method_386().method_27(length);
        if (method_272 != class_212.field_796) {
            if (!(method_272 instanceof class_592)) {
                method_1555(class_483Var, new StringBuilder().insert(0, "Expecting a reference type as 'objectref' on the stack, not a '").append(method_272).append("'.").toString());
            }
            method_1556(class_483Var, (class_592) method_272);
            if (!(method_272 instanceof class_392)) {
                if (!(method_272 instanceof class_594)) {
                    method_1555(class_483Var, new StringBuilder().insert(0, "Expecting an ObjectType as 'objectref' on the stack, not a '").append(method_272).append("'.").toString());
                } else {
                    class_392 class_392Var = field_1244;
                }
            }
            int i6 = 0;
            int i7 = 0;
            while (i6 < length) {
                int i8 = i7 + 1;
                i += method_1388[i7].method_47();
                i6 = i8;
                i7 = i8;
            }
            if (method_183 != i) {
                method_1555(class_483Var, new StringBuilder().insert(0, "The 'count' argument should probably read '").append(i).append("' but is '").append(method_183).append("'.").toString());
            }
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_294(class_152 class_152Var) {
        if (!(method_386().method_20() instanceof class_592)) {
            method_1555(class_152Var, "The value at the stack top is not of a ReferenceType, but of type '" + method_386().method_20() + "'.");
        }
        if (!(method_386().method_27(1) instanceof class_592)) {
            method_1555(class_152Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of a ReferenceType, but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_337(class_201 class_201Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_201Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_802) {
            method_1555(class_201Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'int', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_344(class_345 class_345Var) {
        if (method_386().method_20() == class_212.field_802) {
            return;
        }
        method_1555(class_345Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
    }

    @Override // p000.class_73, p000.class_445
    public void method_375(class_266 class_266Var) {
        if (method_386().method_20() == class_212.field_802) {
            return;
        }
        method_1555(class_266Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
    }

    @Override // p000.class_73, p000.class_445
    public void method_267(class_94 class_94Var) {
    }

    @Override // p000.class_73, p000.class_445
    public void method_245(class_294 class_294Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_294Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) == class_212.field_802) {
            return;
        }
        method_1555(class_294Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'int', but of type '").append(method_386().method_27(1)).append("'.").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_338(class_575 class_575Var) {
        if (method_386().method_20() != class_212.field_812) {
            method_1555(class_575Var, "The value at the stack top is not of type 'float', but of type '" + method_386().method_20() + "'.");
        }
        method_1554(class_575Var, method_386().method_27(1));
        if (method_386().method_27(2) == class_212.field_796) {
            return;
        }
        if (!(method_386().method_27(2) instanceof class_594)) {
            method_1555(class_575Var, new StringBuilder().insert(0, "Stack next-to-next-to-top must be of type float[] but is '").append(method_386().method_27(2)).append("'.").toString());
        }
        if (((class_594) method_386().method_27(2)).method_669() == class_212.field_812) {
            return;
        }
        method_1555(class_575Var, new StringBuilder().insert(0, "Stack next-to-next-to-top must be of type float[] but is '").append(method_386().method_27(2)).append("'.").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_268(class_355 class_355Var) {
        if (!(method_386().method_20() instanceof class_592)) {
            method_1555(class_355Var, "The value at the stack top is not of a ReferenceType, but of type '" + method_386().method_20() + "'.");
        }
        method_1556(class_355Var, (class_592) method_386().method_20());
    }

    @Override // p000.class_73, p000.class_445
    public void method_366(class_447 class_447Var) {
        class_212 method_27 = method_386().method_27(0);
        if (!(method_27 instanceof class_592)) {
            method_1555(class_447Var, "The 'objectref' is not of a ReferenceType but of type " + method_27 + ".");
        }
        class_286 method_982 = this.field_1246.method_982(class_447Var.method_47());
        if (!(method_982 instanceof class_43)) {
            method_1555(class_447Var, new StringBuilder().insert(0, "The Constant at 'index' is not a ConstantClass, but '").append(method_982).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_491(class_198 class_198Var) {
        throw new class_572("In this JustIce verification pass there should not occur an illegal instruction such as IMPDEP1.");
    }

    @Override // p000.class_73, p000.class_445
    public void method_248(class_516 class_516Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_516Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_295(class_481 class_481Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_481Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_315(class_67 class_67Var) {
        if (method_374().method_1607() <= (class_67Var.method_32(this.field_1246).method_47() == 1 ? class_67Var.method_47() : class_67Var.method_47() + 1)) {
            method_1555(class_67Var, "The 'index' is not a valid index into the local variable array.");
        }
        method_1554(class_67Var, method_374().method_1609(class_67Var.method_47()));
    }

    @Override // p000.class_73, p000.class_445
    public void method_247(class_471 class_471Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_471Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_359(class_432 class_432Var) {
    }

    @Override // p000.class_73, p000.class_445
    public void method_273(class_254 class_254Var) {
        if (method_386().method_20() == class_212.field_802) {
            return;
        }
        method_1555(class_254Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
    }

    @Override // p000.class_73, p000.class_445
    public void method_361(class_466 class_466Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_466Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_802) {
            method_1555(class_466Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'int', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_292(class_20 class_20Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_20Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_279(class_482 class_482Var) {
        if (method_386().method_20() == class_212.field_812) {
            return;
        }
        method_1555(class_482Var, "The value at the stack top is not of type 'float', but of type '" + method_386().method_20() + "'.");
    }

    @Override // p000.class_73, p000.class_445
    public void method_378(class_251 class_251Var) {
        if (method_386().method_20() == class_212.field_802) {
            return;
        }
        method_1555(class_251Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
    }

    @Override // p000.class_73, p000.class_445
    public void method_256(class_106 class_106Var) {
        if (method_386().method_20() == class_212.field_802) {
            return;
        }
        method_1555(class_106Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
    }

    @Override // p000.class_73, p000.class_445
    public void method_261(class_9 class_9Var) {
        if (!(method_386().method_20() instanceof class_592)) {
            method_1555(class_9Var, "The value at the stack top is not of a ReferenceType, but of type '" + method_386().method_20() + "'.");
        }
        if (!(method_386().method_27(1) instanceof class_592)) {
            method_1555(class_9Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of a ReferenceType, but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_313(class_249 class_249Var) {
    }

    @Override // p000.class_73, p000.class_445
    public void method_383(class_147 class_147Var) {
        if (!(method_386().method_20() instanceof class_592)) {
            method_1555(class_147Var, "The value at the stack top is not of a ReferenceType, but of type '" + method_386().method_20() + "'.");
        }
        method_1556(class_147Var, (class_592) method_386().method_20());
    }

    @Override // p000.class_73, p000.class_445
    public void method_368(class_404 class_404Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_404Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) == class_212.field_802) {
            return;
        }
        method_1555(class_404Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'int', but of type '").append(method_386().method_27(1)).append("'.").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_328(class_51 class_51Var) {
        if (method_386().method_20() != class_212.field_812) {
            method_1555(class_51Var, "The value at the stack top is not of type 'float', but of type '" + method_386().method_20() + "'.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_257(class_550 class_550Var) {
        if (method_386().method_20() != class_212.field_812) {
            method_1555(class_550Var, "The value at the stack top is not of type 'float', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) == class_212.field_812) {
            return;
        }
        method_1555(class_550Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'float', but of type '").append(method_386().method_27(1)).append("'.").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_488(class_571 class_571Var) {
        throw new class_572("In this JustIce verification pass there should not occur an illegal instruction such as IMPDEP2.");
    }

    @Override // p000.class_73, p000.class_445
    public void method_355(class_192 class_192Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_192Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_802) {
            method_1555(class_192Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'int', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_258(class_564 class_564Var) {
    }

    @Override // p000.class_73, p000.class_445
    public void method_277(class_562 class_562Var) {
    }

    @Override // p000.class_73, p000.class_445
    public void method_276(class_256 class_256Var) {
        if (method_386().method_20() != class_212.field_812) {
            method_1555(class_256Var, "The value at the stack top is not of type 'float', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_812) {
            method_1555(class_256Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'float', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_381(class_528 class_528Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_528Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_802) {
            method_1555(class_528Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'int', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_397(class_390 class_390Var) {
    }

    @Override // p000.class_73, p000.class_445
    public void method_321(class_32 class_32Var) {
        if (method_386().method_20() == class_212.field_812) {
            return;
        }
        method_1555(class_32Var, "The value at the stack top is not of type 'float', but of type '" + method_386().method_20() + "'.");
    }

    @Override // p000.class_73, p000.class_445
    public void method_303(class_590 class_590Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_590Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_802) {
            method_1555(class_590Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'int', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_360(class_507 class_507Var) {
    }

    @Override // p000.class_73, p000.class_445
    public void method_380(class_50 class_50Var) {
        if (method_386().method_20() != class_212.field_798) {
            method_1555(class_50Var, "The value at the stack top is not of type 'long', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_798) {
            method_1555(class_50Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'long', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_264(class_274 class_274Var) {
        class_286 method_982 = this.field_1246.method_982(class_274Var.method_47());
        if (!(method_982 instanceof class_232) && !(method_982 instanceof class_573)) {
            method_1555(class_274Var, "Referenced constant should be a CONSTANT_Integer, a CONSTANT_Float or a CONSTANT_String, but is '" + method_982 + "'.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_289(class_63 class_63Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_63Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) == class_212.field_798) {
            return;
        }
        method_1555(class_63Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'long', but of type '").append(method_386().method_27(1)).append("'.").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_314(class_219 class_219Var) {
        String method_464;
        class_219 class_219Var2;
        class_212 class_212Var;
        class_212 class_212Var2;
        try {
            if (class_219Var.method_1086(this.field_1246).equals("<init>") && !(method_386().method_27(class_219Var.method_1388(this.field_1246).length) instanceof class_356)) {
                method_1555(class_219Var, "Possibly initializing object twice. A valid instruction sequence must not have an uninitialized object on the operand stack or in a local variable during a backwards branch, or in a local variable in code protected by an exception handler. Please see The Java Virtual Machine Specification, Second Edition, 4.9.4 (pages 147 and 148) for details.");
            }
            class_212 method_32 = class_219Var.method_32(this.field_1246);
            if (method_32 instanceof class_392) {
                String method_4642 = ((class_392) method_32).method_464();
                class_275 method_1059 = class_412.method_1574(method_4642).method_1059();
                if (method_1059.method_1212() != 1) {
                    method_1555(class_219Var, "Class '" + method_4642 + "' is referenced, but cannot be loaded and resolved: '" + method_1059 + "'.");
                }
            }
            class_212[] method_1388 = class_219Var.method_1388(this.field_1246);
            int length = method_1388.length;
            int i = length - 1;
            int i2 = i;
            int i3 = i;
            while (i2 >= 0) {
                class_212 method_27 = method_386().method_27((length - 1) - i3);
                class_212 class_212Var3 = method_1388[i3];
                if (class_212Var3 == class_212.field_813 || class_212Var3 == class_212.field_795 || class_212Var3 == class_212.field_806 || class_212Var3 == class_212.field_801) {
                    class_212Var3 = class_212.field_802;
                }
                if (!method_27.equals(class_212Var3)) {
                    if (!(method_27 instanceof class_592) || !(class_212Var3 instanceof class_592)) {
                        method_1555(class_219Var, new StringBuilder().insert(0, "Expecting a '").append(class_212Var3).append("' but found a '").append(method_27).append("' on the stack.").toString());
                    } else {
                        class_592 class_592Var = (class_592) method_27;
                        if (!class_592Var.method_1987((class_592) class_212Var3)) {
                            method_1555(class_219Var, new StringBuilder().insert(0, "Expecting a '").append(class_212Var3).append("' but found a '").append(method_27).append("' on the stack (which is not assignment compatible).").toString());
                        }
                        method_1556(class_219Var, class_592Var);
                    }
                }
                int i4 = i3 - 1;
                i2 = i4;
                i3 = i4;
            }
            class_212 method_272 = method_386().method_27(length);
            if (method_272 != class_212.field_796) {
                if (!(method_272 instanceof class_592)) {
                    method_1555(class_219Var, new StringBuilder().insert(0, "Expecting a reference type as 'objectref' on the stack, not a '").append(method_272).append("'.").toString());
                }
                if (!class_219Var.method_1086(this.field_1246).equals("<init>")) {
                    method_1556(class_219Var, (class_592) method_272);
                    if (!(method_272 instanceof class_392)) {
                        if (method_272 instanceof class_594) {
                            method_272 = field_1244;
                        } else {
                            method_1555(class_219Var, new StringBuilder().insert(0, "Expecting an ObjectType as 'objectref' on the stack, not a '").append(method_272).append("'.").toString());
                            class_212Var2 = method_272;
                            class_212Var = method_272;
                            String method_4643 = ((class_392) class_212Var2).method_464();
                            class_219Var2 = class_219Var;
                            method_464 = method_4643;
                        }
                    }
                    class_212Var2 = method_272;
                    class_212Var = method_272;
                    String method_46432 = ((class_392) class_212Var2).method_464();
                    class_219Var2 = class_219Var;
                    method_464 = method_46432;
                } else {
                    if (!(method_272 instanceof class_356)) {
                        method_1555(class_219Var, new StringBuilder().insert(0, "Expecting an UninitializedObjectType as 'objectref' on the stack, not a '").append(method_272).append("'. Otherwise, you couldn't invoke a method since an array has no methods (not to speak of a return address).").toString());
                    }
                    method_464 = ((class_356) method_272).method_646().method_464();
                    class_219Var2 = class_219Var;
                    class_212Var = method_272;
                }
                String method_623 = class_219Var2.method_623(this.field_1246);
                if (!class_474.method_1807(method_464, method_623)) {
                    method_1555(class_219Var, new StringBuilder().insert(0, "The 'objref' item '").append(class_212Var).append("' does not implement '").append(method_623).append("' as expected.").toString());
                }
            }
        } catch (ClassNotFoundException e) {
            throw new class_572(new StringBuilder().insert(0, "Missing class: ").append(e.toString()).toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_365(class_28 class_28Var) {
        if (!(method_386().method_20() instanceof class_592)) {
            method_1555(class_28Var, "The stack top should be of a ReferenceType, but is '" + method_386().method_20() + "'.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_372(class_140 class_140Var) {
        if (method_386().method_20() instanceof class_592) {
            return;
        }
        method_1555(class_140Var, "The stack top should be of a ReferenceType, but is '" + method_386().method_20() + "'.");
    }

    @Override // p000.class_73, p000.class_445
    public void method_385(class_289 class_289Var) {
        class_261 class_261Var;
        class_261 class_261Var2;
        class_592 class_592Var = null;
        try {
            String method_1086 = class_289Var.method_1086(this.field_1246);
            class_261[] method_898 = class_474.method_1810(class_289Var.method_622(this.field_1246).method_464()).method_898();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= method_898.length) {
                    class_261Var = null;
                    class_261Var2 = null;
                    break;
                } else if (!method_898[i2].method_464().equals(method_1086) || !class_212.method_1034(method_898[i2].method_546()).equals(class_289Var.method_32(this.field_1246))) {
                    int i3 = i2 + 1;
                    i = i3;
                    i2 = i3;
                } else {
                    class_261 class_261Var3 = method_898[i2];
                    class_261Var = class_261Var3;
                    class_261Var2 = class_261Var3;
                    break;
                }
            }
            if (class_261Var != null) {
                class_212 method_20 = method_386().method_20();
                class_212 method_1034 = class_212.method_1034(class_261Var2.method_546());
                class_212 class_212Var = (method_1034 == class_212.field_813 || method_1034 == class_212.field_795 || method_1034 == class_212.field_806 || method_1034 == class_212.field_801) ? class_212.field_802 : method_1034;
                if (method_1034 instanceof class_592) {
                    if (method_20 instanceof class_592) {
                        class_592Var = (class_592) method_20;
                        method_1556(class_289Var, class_592Var);
                    } else {
                        method_1555(class_289Var, "The stack top type '" + method_20 + "' is not of a reference type as expected.");
                    }
                    if (class_592Var.method_1987(class_212Var)) {
                        return;
                    }
                    method_1555(class_289Var, new StringBuilder().insert(0, "The stack top type '").append(method_20).append("' is not assignment compatible with '").append(class_212Var).append("'.").toString());
                    return;
                }
                if (class_212Var == method_20) {
                    return;
                }
                method_1555(class_289Var, new StringBuilder().insert(0, "The stack top type '").append(method_20).append("' is not of type '").append(class_212Var).append("' as expected.").toString());
                return;
            }
            throw new class_572("Field not found?!?");
        } catch (ClassNotFoundException e) {
            throw new class_572(new StringBuilder().insert(0, "Missing class: ").append(e.toString()).toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_280(class_300 class_300Var) {
        short method_1304 = class_300Var.method_1304();
        int i = 0;
        int i2 = 0;
        while (i < method_1304) {
            if (method_386().method_27(i2) != class_212.field_802) {
                method_1555(class_300Var, "The '" + ((int) method_1304) + "' upper stack types should be 'int' but aren't.");
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_254(class_183 class_183Var) {
        if (method_386().method_20() != class_212.field_798) {
            method_1555(class_183Var, "The value at the stack top is not of type 'long', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_798) {
            method_1555(class_183Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'long', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_274(class_480 class_480Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_480Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_798) {
            method_1555(class_480Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'long', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    public void method_312(class_49 class_49Var) {
        class_286 method_982 = this.field_1246.method_982(class_49Var.method_47());
        if (!(method_982 instanceof class_400) && !(method_982 instanceof class_340) && !(method_982 instanceof class_118)) {
            method_1555(class_49Var, "Referenced constant should be a CONSTANT_Integer, a CONSTANT_Float or a CONSTANT_String, but is '" + method_982 + "'.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_262(class_90 class_90Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_90Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_802) {
            method_1555(class_90Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'int', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0171 A[Catch: ClassNotFoundException -> 0x00e5, TryCatch #0 {ClassNotFoundException -> 0x00e5, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0020, B:8:0x0046, B:10:0x0053, B:12:0x0064, B:14:0x0068, B:16:0x006c, B:18:0x0072, B:20:0x0078, B:22:0x007c, B:24:0x0080, B:26:0x008e, B:27:0x00b5, B:30:0x00bd, B:29:0x00b8, B:33:0x0070, B:35:0x0103, B:39:0x0110, B:41:0x0114, B:42:0x0131, B:44:0x013c, B:46:0x0140, B:47:0x015f, B:49:0x0171, B:53:0x019a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // p000.class_73, p000.class_445
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void method_394(class_203 class_203Var) {
        class_212 class_212Var;
        class_212 class_212Var2;
        String method_464;
        String method_623;
        try {
            class_212 method_32 = class_203Var.method_32(this.field_1246);
            if (method_32 instanceof class_392) {
                String method_4642 = ((class_392) method_32).method_464();
                class_275 method_1059 = class_412.method_1574(method_4642).method_1059();
                if (method_1059.method_1212() != 1) {
                    method_1555(class_203Var, "Class '" + method_4642 + "' is referenced, but cannot be loaded and resolved: '" + method_1059 + "'.");
                }
            }
            class_212[] method_1388 = class_203Var.method_1388(this.field_1246);
            int length = method_1388.length;
            int i = length - 1;
            int i2 = i;
            int i3 = i;
            while (i2 >= 0) {
                class_212 method_27 = method_386().method_27((length - 1) - i3);
                class_212 class_212Var3 = method_1388[i3];
                if (class_212Var3 == class_212.field_813 || class_212Var3 == class_212.field_795 || class_212Var3 == class_212.field_806 || class_212Var3 == class_212.field_801) {
                    class_212Var3 = class_212.field_802;
                }
                if (!method_27.equals(class_212Var3)) {
                    if (!(method_27 instanceof class_592) || !(class_212Var3 instanceof class_592)) {
                        method_1555(class_203Var, new StringBuilder().insert(0, "Expecting a '").append(class_212Var3).append("' but found a '").append(method_27).append("' on the stack.").toString());
                    } else {
                        class_592 class_592Var = (class_592) method_27;
                        if (!class_592Var.method_1987((class_592) class_212Var3)) {
                            method_1555(class_203Var, new StringBuilder().insert(0, "Expecting a '").append(class_212Var3).append("' but found a '").append(method_27).append("' on the stack (which is not assignment compatible).").toString());
                        }
                        method_1556(class_203Var, class_592Var);
                    }
                }
                int i4 = i3 - 1;
                i2 = i4;
                i3 = i4;
            }
            class_212 method_272 = method_386().method_27(length);
            if (method_272 == class_212.field_796) {
                return;
            }
            if (!(method_272 instanceof class_592)) {
                method_1555(class_203Var, new StringBuilder().insert(0, "Expecting a reference type as 'objectref' on the stack, not a '").append(method_272).append("'.").toString());
            }
            method_1556(class_203Var, (class_592) method_272);
            if (!(method_272 instanceof class_392)) {
                if (!(method_272 instanceof class_594)) {
                    method_1555(class_203Var, new StringBuilder().insert(0, "Expecting an ObjectType as 'objectref' on the stack, not a '").append(method_272).append("'.").toString());
                    class_212Var = method_272;
                    class_212Var2 = method_272;
                    method_464 = ((class_392) class_212Var).method_464();
                    method_623 = class_203Var.method_623(this.field_1246);
                    if (!class_474.method_1807(method_464, method_623)) {
                        return;
                    }
                    method_1555(class_203Var, new StringBuilder().insert(0, "The 'objref' item '").append(class_212Var2).append("' does not implement '").append(method_623).append("' as expected.").toString());
                    return;
                }
                method_272 = field_1244;
            }
            class_212Var = method_272;
            class_212Var2 = method_272;
            method_464 = ((class_392) class_212Var).method_464();
            method_623 = class_203Var.method_623(this.field_1246);
            if (!class_474.method_1807(method_464, method_623)) {
            }
        } catch (ClassNotFoundException e) {
            throw new class_572(new StringBuilder().insert(0, "Missing class: ").append(e.toString()).toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_384(class_76 class_76Var) {
        if (method_386().method_20() != class_212.field_798) {
            method_1555(class_76Var, "The value at the stack top is not of type 'long', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) == class_212.field_798) {
            return;
        }
        method_1555(class_76Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'long', but of type '").append(method_386().method_27(1)).append("'.").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_358(class_333 class_333Var) {
    }

    @Override // p000.class_73, p000.class_445
    public void method_249(class_134 class_134Var) {
        if (method_386().method_20() != class_212.field_798) {
            method_1555(class_134Var, "The value at the stack top is not of type 'long', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_798) {
            method_1555(class_134Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'long', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_382(class_489 class_489Var) {
        class_286 method_982 = this.field_1246.method_982(class_489Var.method_47());
        if (!(method_982 instanceof class_400) && !(method_982 instanceof class_340) && !(method_982 instanceof class_118)) {
            method_1555(class_489Var, "Referenced constant should be a CONSTANT_Integer, a CONSTANT_Float or a CONSTANT_String, but is '" + method_982 + "'.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_301(class_586 class_586Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_586Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) == class_212.field_802) {
            return;
        }
        method_1555(class_586Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'int', but of type '").append(method_386().method_27(1)).append("'.").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_270(class_486 class_486Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_486Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_802) {
            method_1555(class_486Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'int', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_389(class_357 class_357Var) {
        method_1554(class_357Var, method_386().method_20());
        if (method_386().method_27(1) != class_212.field_796) {
            if (!(method_386().method_27(1) instanceof class_594)) {
                method_1555(class_357Var, "Stack next-to-top must be of type long[] but is '" + method_386().method_27(1) + "'.");
            }
            if (((class_594) method_386().method_27(1)).method_669() != class_212.field_798) {
                method_1555(class_357Var, new StringBuilder().insert(0, "Stack next-to-top must be of type long[] but is '").append(method_386().method_27(1)).append("'.").toString());
            }
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_259(class_551 class_551Var) {
    }

    @Override // p000.class_73, p000.class_445
    public void method_352(class_339 class_339Var) {
        if (method_386().method_20() != class_212.field_798) {
            method_1555(class_339Var, "The value at the stack top is not of type 'long', but of type '" + method_386().method_20() + "'.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_302(class_87 class_87Var) {
        if (method_386().method_20().method_47() != 1) {
            method_1555(class_87Var, "Stack top size should be 1 but stack top is '" + method_386().method_20() + "' of size '" + method_386().method_20().method_47() + "'.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_269(class_593 class_593Var) {
        if (method_386().method_20() != class_212.field_798) {
            method_1555(class_593Var, "The value at the stack top is not of type 'long', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_798) {
            method_1555(class_593Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'long', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_296(class_79 class_79Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_79Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_802) {
            method_1555(class_79Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'int', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_307(class_578 class_578Var) {
        if (method_386().method_20().method_47() == 2) {
            return;
        }
        method_1555(class_578Var, "Stack top size should be 2 but stack top is '" + method_386().method_20() + "' of size '" + method_386().method_20().method_47() + "'.");
    }

    @Override // p000.class_73, p000.class_445
    public void method_306(class_413 class_413Var) {
        if (method_386().method_20() == class_212.field_802) {
            return;
        }
        method_1555(class_413Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
    }

    @Override // p000.class_73, p000.class_445
    public void method_398(class_1 class_1Var) {
        if (method_386().method_20() != class_212.field_798) {
            method_1555(class_1Var, "The value at the stack top is not of type 'long', but of type '" + method_386().method_20() + "'.");
        }
        method_1554(class_1Var, method_386().method_27(1));
        if (method_386().method_27(2) == class_212.field_796) {
            return;
        }
        if (!(method_386().method_27(2) instanceof class_594)) {
            method_1555(class_1Var, new StringBuilder().insert(0, "Stack next-to-next-to-top must be of type long[] but is '").append(method_386().method_27(2)).append("'.").toString());
        }
        if (((class_594) method_386().method_27(2)).method_669() == class_212.field_798) {
            return;
        }
        method_1555(class_1Var, new StringBuilder().insert(0, "Stack next-to-next-to-top must be of type long[] but is '").append(method_386().method_27(2)).append("'.").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_350(class_133 class_133Var) {
    }

    @Override // p000.class_73, p000.class_445
    public void method_271(class_7 class_7Var) {
        if (method_386().method_20() != class_212.field_798) {
            method_1555(class_7Var, "The value at the stack top is not of type 'long', but of type '" + method_386().method_20() + "'.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_290(class_105 class_105Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_105Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_802) {
            method_1555(class_105Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'int', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_335(class_107 class_107Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_107Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) == class_212.field_798) {
            return;
        }
        method_1555(class_107Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'long', but of type '").append(method_386().method_27(1)).append("'.").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_272(class_161 class_161Var) {
        try {
            class_212 method_32 = class_161Var.method_32(this.field_1246);
            if (method_32 instanceof class_392) {
                String method_464 = ((class_392) method_32).method_464();
                class_275 method_1059 = class_412.method_1574(method_464).method_1059();
                if (method_1059.method_1212() != 1) {
                    method_1555(class_161Var, "Class '" + method_464 + "' is referenced, but cannot be loaded and resolved: '" + method_1059 + "'.");
                }
            }
            class_212[] method_1388 = class_161Var.method_1388(this.field_1246);
            int length = method_1388.length;
            for (int i = length - 1; i >= 0; i--) {
                class_212 method_27 = method_386().method_27((length - 1) - i);
                class_212 class_212Var = method_1388[i];
                if (class_212Var == class_212.field_813 || class_212Var == class_212.field_795 || class_212Var == class_212.field_806 || class_212Var == class_212.field_801) {
                    class_212Var = class_212.field_802;
                }
                if (!method_27.equals(class_212Var)) {
                    if ((method_27 instanceof class_592) && (class_212Var instanceof class_592)) {
                        class_592 class_592Var = (class_592) method_27;
                        if (!class_592Var.method_1987((class_592) class_212Var)) {
                            method_1555(class_161Var, new StringBuilder().insert(0, "Expecting a '").append(class_212Var).append("' but found a '").append(method_27).append("' on the stack (which is not assignment compatible).").toString());
                        }
                        method_1556(class_161Var, class_592Var);
                    } else {
                        method_1555(class_161Var, new StringBuilder().insert(0, "Expecting a '").append(class_212Var).append("' but found a '").append(method_27).append("' on the stack.").toString());
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            throw new class_572(new StringBuilder().insert(0, "Missing class: ").append(e.toString()).toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_376(class_5 class_5Var) {
        if (method_386().method_20() != class_212.field_798) {
            method_1555(class_5Var, "The value at the stack top is not of type 'long', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_798) {
            method_1555(class_5Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'long', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_293(class_329 class_329Var) {
        if (method_386().method_20() != class_212.field_798) {
            method_1555(class_329Var, "The value at the stack top is not of type 'long', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_798) {
            method_1555(class_329Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'long', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_364(class_126 class_126Var) {
    }

    @Override // p000.class_73, p000.class_445
    public void method_393(class_427 class_427Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_427Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_316(class_602 class_602Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_602Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_260(class_375 class_375Var) {
    }

    @Override // p000.class_73, p000.class_445
    public void method_266(class_60 class_60Var) {
    }

    @Override // p000.class_73, p000.class_445
    public void method_299(class_95 class_95Var) {
        if (method_386().method_20() == class_212.field_798) {
            return;
        }
        method_1555(class_95Var, "The value at the stack top is not of type 'long', but of type '" + method_386().method_20() + "'.");
    }

    @Override // p000.class_73, p000.class_445
    public void method_300(class_109 class_109Var) {
    }

    @Override // p000.class_73, p000.class_445
    public void method_387(class_322 class_322Var) {
        if (method_386().method_20() != class_212.field_798) {
            method_1555(class_322Var, "The value at the stack top is not of type 'long', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_798) {
            method_1555(class_322Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'long', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_319(class_246 class_246Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_246Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) == class_212.field_802) {
            return;
        }
        method_1555(class_246Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'int', but of type '").append(method_386().method_27(1)).append("'.").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_371(class_0 class_0Var) {
        if (method_386().method_20() == class_212.field_798) {
            return;
        }
        method_1555(class_0Var, "The value at the stack top is not of type 'long', but of type '" + method_386().method_20() + "'.");
    }

    @Override // p000.class_73, p000.class_445
    public void method_342(class_343 class_343Var) {
        class_212 method_32 = class_343Var.method_32(this.field_1246);
        if (!(method_32 instanceof class_592)) {
            throw new class_572("NEW.getType() returning a non-reference type?!");
        }
        if (!(method_32 instanceof class_392)) {
            method_1555(class_343Var, "Expecting a class type (ObjectType) to work on. Found: '" + method_32 + "'.");
        }
        class_392 class_392Var = (class_392) method_32;
        if (!class_392Var.method_1130()) {
            method_1555(class_343Var, new StringBuilder().insert(0, "Expecting a class type (ObjectType) to work on. Found: '").append(class_392Var).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_275(class_428 class_428Var) {
        class_261 class_261Var;
        class_261 class_261Var2;
        class_592 class_592Var = null;
        try {
            class_212 method_27 = method_386().method_27(1);
            if (!(method_27 instanceof class_392) && method_27 != class_212.field_796) {
                method_1555(class_428Var, "Stack next-to-top should be an object reference that's not an array reference, but is '" + method_27 + "'.");
            }
            String method_1086 = class_428Var.method_1086(this.field_1246);
            class_261[] method_898 = class_474.method_1810(class_428Var.method_622(this.field_1246).method_464()).method_898();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= method_898.length) {
                    class_261Var = null;
                    class_261Var2 = null;
                    break;
                } else if (!method_898[i2].method_464().equals(method_1086) || !class_212.method_1034(method_898[i2].method_546()).equals(class_428Var.method_32(this.field_1246))) {
                    int i3 = i2 + 1;
                    i = i3;
                    i2 = i3;
                } else {
                    class_261 class_261Var3 = method_898[i2];
                    class_261Var = class_261Var3;
                    class_261Var2 = class_261Var3;
                    break;
                }
            }
            if (class_261Var == null) {
                throw new class_572("Field not found?!?");
            }
            class_212 method_20 = method_386().method_20();
            class_212 method_1034 = class_212.method_1034(class_261Var2.method_546());
            class_212 class_212Var = (method_1034 == class_212.field_813 || method_1034 == class_212.field_795 || method_1034 == class_212.field_806 || method_1034 == class_212.field_801) ? class_212.field_802 : method_1034;
            if (!(method_1034 instanceof class_592)) {
                if (class_212Var != method_20) {
                    method_1555(class_428Var, new StringBuilder().insert(0, "The stack top type '").append(method_20).append("' is not of type '").append(class_212Var).append("' as expected.").toString());
                }
            } else {
                if (method_20 instanceof class_592) {
                    class_592Var = (class_592) method_20;
                    method_1556(class_428Var, class_592Var);
                } else {
                    method_1555(class_428Var, new StringBuilder().insert(0, "The stack top type '").append(method_20).append("' is not of a reference type as expected.").toString());
                }
                if (!class_592Var.method_1987(class_212Var)) {
                    method_1555(class_428Var, new StringBuilder().insert(0, "The stack top type '").append(method_20).append("' is not assignment compatible with '").append(class_212Var).append("'.").toString());
                }
            }
            if (class_261Var2.method_1129()) {
                class_392 method_622 = class_428Var.method_622(this.field_1246);
                class_392 class_392Var = new class_392(this.field_1245.method_546());
                if (method_622.equals(class_392Var) || class_392Var.method_1549(method_622)) {
                    class_212 method_272 = method_386().method_27(1);
                    if (method_272 != class_212.field_796) {
                        if (!(method_272 instanceof class_392)) {
                            method_1555(class_428Var, new StringBuilder().insert(0, "The 'objectref' must refer to an object that's not an array. Found instead: '").append(method_272).append("'.").toString());
                        }
                        class_392 class_392Var2 = (class_392) method_272;
                        if (!class_392Var2.equals(class_392Var) && !class_392Var2.method_1549(class_392Var)) {
                            method_1555(class_428Var, new StringBuilder().insert(0, "The referenced field has the ACC_PROTECTED modifier, and it's a member of the current class or a superclass of the current class. However, the referenced object type '").append(method_386().method_20()).append("' is not the current class or a subclass of the current class.").toString());
                        }
                    } else {
                        return;
                    }
                }
            }
            if (!class_261Var2.method_1125()) {
                return;
            }
            method_1555(class_428Var, new StringBuilder().insert(0, "Referenced field '").append(class_261Var2).append("' is static which it shouldn't be.").toString());
        } catch (ClassNotFoundException e) {
            throw new class_572(new StringBuilder().insert(0, "Missing class: ").append(e.toString()).toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_281(class_44 class_44Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_44Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) == class_212.field_802) {
            return;
        }
        method_1555(class_44Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'int', but of type '").append(method_386().method_27(1)).append("'.").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_377(class_496 class_496Var) {
        if (method_386().method_20() == class_212.field_798) {
            return;
        }
        method_1555(class_496Var, "The value at the stack top is not of type 'long', but of type '" + method_386().method_20() + "'.");
    }

    @Override // p000.class_73, p000.class_445
    public void method_323(class_556 class_556Var) {
        if (method_386().method_20() != class_212.field_798) {
            method_1555(class_556Var, "The value at the stack top is not of type 'long', but of type '" + method_386().method_20() + "'.");
        }
        if (method_386().method_27(1) != class_212.field_798) {
            method_1555(class_556Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of type 'long', but of type '").append(method_386().method_27(1)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_388(class_117 class_117Var) {
        method_1554(class_117Var, method_386().method_20());
    }

    @Override // p000.class_73, p000.class_445
    public void method_317(class_537 class_537Var) {
        if (this.field_1245.method_198().equals("<init>") && class_277.field_956 != null && !this.field_1245.method_546().equals(class_212.field_808.method_464())) {
            method_1555(class_537Var, "Leaving a constructor that itself did not call a constructor.");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_332(class_69 class_69Var) {
    }

    @Override // p000.class_73, p000.class_445
    public void method_391(class_197 class_197Var) {
        if (method_386().method_20() != class_212.field_802) {
            method_1555(class_197Var, "The value at the stack top is not of type 'int', but of type '" + method_386().method_20() + "'.");
        }
        method_1554(class_197Var, method_386().method_27(1));
        if (method_386().method_27(2) != class_212.field_796) {
            if (!(method_386().method_27(2) instanceof class_594)) {
                method_1555(class_197Var, new StringBuilder().insert(0, "Stack next-to-next-to-top must be of type short[] but is '").append(method_386().method_27(2)).append("'.").toString());
            }
            if (((class_594) method_386().method_27(2)).method_669() == class_212.field_801) {
                return;
            }
            method_1555(class_197Var, new StringBuilder().insert(0, "Stack next-to-next-to-top must be of type short[] but is '").append(method_386().method_27(2)).append("'.").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_246(class_16 class_16Var) {
        method_1554(class_16Var, method_386().method_20());
        if (method_386().method_27(1) != class_212.field_796) {
            if (!(method_386().method_27(1) instanceof class_594)) {
                method_1555(class_16Var, "Stack next-to-top must be of type short[] but is '" + method_386().method_27(1) + "'.");
            }
            if (((class_594) method_386().method_27(1)).method_669() != class_212.field_801) {
                method_1555(class_16Var, new StringBuilder().insert(0, "Stack next-to-top must be of type short[] but is '").append(method_386().method_27(1)).append("'.").toString());
            }
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_362(class_398 class_398Var) {
        if (!(method_374().method_1609(class_398Var.method_47()) instanceof class_211)) {
            method_1555(class_398Var, "Expecting a ReturnaddressType in local variable " + class_398Var.method_47() + ".");
        }
        if (method_374().method_1609(class_398Var.method_47()) != class_211.field_793) {
        } else {
            throw new class_572("Oops: RET expecting a target!");
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_291(class_200 class_200Var) {
        if (method_386().method_20().method_47() != 1) {
            method_1555(class_200Var, "The value at the stack top is not of size '1', but of size '" + method_386().method_20().method_47() + "'.");
        }
        if (method_386().method_27(1).method_47() == 1) {
            return;
        }
        method_1555(class_200Var, new StringBuilder().insert(0, "The value at the stack next-to-top is not of size '1', but of size '").append(method_386().method_27(1).method_47()).append("'.").toString());
    }
}
