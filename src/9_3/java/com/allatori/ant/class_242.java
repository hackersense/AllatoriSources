package com.allatori.ant;

import com.allatori.EmptyClass;
import com.allatori.exception.runtime.RuntimeException_57;
import com.allatori.exception.runtime.RuntimeException_62;
import com.allatori.exception.runtime.class_168;
import com.allatori.interfaces.unmapped.class_21;
import com.allatori.interfaces.unmapped.class_241;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_242 extends class_164 implements class_21 {
    public class_299 field_850;
    public final class_499 field_851;
    public Set field_852;
    public final class_524 field_853;
    public final class_440 field_854;
    public final int field_855;
    public Class field_856;
    public Class field_857;
    public Class field_858;
    public Class field_859;
    public Class field_860;
    public Class field_861;
    public Class field_862;
    public Set field_863;
    public Class field_864;
    public Set field_865;

    @Override // p000.class_164, p000.class_21
    public void method_72(class_43 class_43Var) {
        if (class_43Var.method_619() == 7) {
            method_1090(class_43Var, class_43Var.method_47(), this.field_860);
            return;
        }
        throw new RuntimeException_57(new StringBuilder().insert(0, "Wrong constant tag in '").append(class_524.method_1892(class_43Var)).append("'.").toString());
    }

    @Override // p000.class_164, p000.class_21
    public void method_64(class_232 class_232Var) {
        if (class_232Var.method_619() != 5) {
            throw new RuntimeException_57(new StringBuilder().insert(0, "Wrong constant tag in '").append(class_524.method_1892(class_232Var)).append("'.").toString());
        }
    }

    @Override // p000.class_164, p000.class_21
    public void method_78(class_340 class_340Var) {
        if (class_340Var.method_619() != 4) {
            throw new RuntimeException_57(new StringBuilder().insert(0, "Wrong constant tag in '").append(class_524.method_1892(class_340Var)).append("'.").toString());
        }
    }

    @Override // p000.class_164, p000.class_21
    public void method_74(class_35 class_35Var) {
        if (class_35Var.method_619() != 10) {
            throw new RuntimeException_57(new StringBuilder().insert(0, "Wrong constant tag in '").append(class_524.method_1892(class_35Var)).append("'.").toString());
        }
        method_1090(class_35Var, class_35Var.method_47(), this.field_857);
        method_1090(class_35Var, class_35Var.method_433(), this.field_862);
    }

    @Override // p000.class_164, p000.class_21
    public void method_66(class_538 class_538Var) {
        if (class_538Var.method_619() != 12) {
            throw new RuntimeException_57(new StringBuilder().insert(0, "Wrong constant tag in '").append(class_524.method_1892(class_538Var)).append("'.").toString());
        }
        method_1090(class_538Var, class_538Var.method_47(), this.field_860);
        method_1090(class_538Var, class_538Var.method_433(), this.field_860);
    }

    public class_242(class_524 class_524Var, class_440 class_440Var) {
        this.field_853 = class_524Var;
        this.field_852 = new HashSet();
        this.field_863 = new HashSet();
        this.field_865 = new HashSet();
        this.field_854 = class_440Var;
        this.field_851 = class_440Var.method_502();
        this.field_855 = this.field_851.method_47();
        this.field_857 = class_43.class;
        this.field_856 = class_118.class;
        this.field_861 = class_400.class;
        this.field_858 = class_340.class;
        this.field_859 = class_232.class;
        this.field_864 = class_573.class;
        this.field_862 = class_538.class;
        this.field_860 = class_371.class;
        this.field_850 = new class_299(class_440Var, this);
        this.field_850.method_1078();
    }

    @Override // p000.class_164, p000.class_21
    public void method_89(class_118 class_118Var) {
        if (class_118Var.method_619() == 8) {
            method_1090(class_118Var, class_118Var.method_47(), this.field_860);
            return;
        }
        throw new RuntimeException_57(new StringBuilder().insert(0, "Wrong constant tag in '").append(class_524.method_1892(class_118Var)).append("'.").toString());
    }

    @Override // p000.class_164, p000.class_21
    public void method_63(class_400 class_400Var) {
        if (class_400Var.method_619() != 3) {
            throw new RuntimeException_57(new StringBuilder().insert(0, "Wrong constant tag in '").append(class_524.method_1892(class_400Var)).append("'.").toString());
        }
    }

    @Override // p000.class_164, p000.class_21
    public void method_88(class_401 class_401Var) {
        if (class_401Var.method_619() == 11) {
            method_1090(class_401Var, class_401Var.method_47(), this.field_857);
            method_1090(class_401Var, class_401Var.method_433(), this.field_862);
            return;
        }
        throw new RuntimeException_57(new StringBuilder().insert(0, "Wrong constant tag in '").append(class_524.method_1892(class_401Var)).append("'.").toString());
    }

    @Override // p000.class_164, p000.class_21
    public void method_57(class_371 class_371Var) {
        if (class_371Var.method_619() == 1) {
        } else {
            throw new RuntimeException_57(new StringBuilder().insert(0, "Wrong constant tag in '").append(class_524.method_1892(class_371Var)).append("'.").toString());
        }
    }

    @Override // p000.class_164, p000.class_21
    public void method_81(class_530 class_530Var) {
        if (class_530Var.method_619() != 9) {
            throw new RuntimeException_57(new StringBuilder().insert(0, "Wrong constant tag in '").append(class_524.method_1892(class_530Var)).append("'.").toString());
        }
        method_1090(class_530Var, class_530Var.method_47(), this.field_857);
        method_1090(class_530Var, class_530Var.method_433(), this.field_862);
    }

    @Override // p000.class_164, p000.class_21
    public void method_71(class_261 class_261Var) {
        if (this.field_854.method_1641()) {
            int i = class_261Var.method_424() ? 1 : 0;
            if (class_261Var.method_1129()) {
                i++;
            }
            if (class_261Var.method_1124()) {
                i++;
            }
            if (i > 1) {
                throw new RuntimeException_57(new StringBuilder().insert(0, "Field '").append(class_524.method_1892(class_261Var)).append("' must only have at most one of its ACC_PRIVATE, ACC_PROTECTED, ACC_PUBLIC modifiers set.").toString());
            }
            if (class_261Var.method_1117() && class_261Var.method_1122()) {
                throw new RuntimeException_57(new StringBuilder().insert(0, "Field '").append(class_524.method_1892(class_261Var)).append("' must only have at most one of its ACC_FINAL, ACC_VOLATILE modifiers set.").toString());
            }
        } else if (class_261Var.method_1124()) {
            if (!class_261Var.method_1125()) {
                throw new RuntimeException_57(new StringBuilder().insert(0, "Interface field '").append(class_524.method_1892(class_261Var)).append("' must have the ACC_STATIC modifier set but hasn't!").toString());
            }
            if (!class_261Var.method_1117()) {
                throw new RuntimeException_57(new StringBuilder().insert(0, "Interface field '").append(class_524.method_1892(class_261Var)).append("' must have the ACC_FINAL modifier set but hasn't!").toString());
            }
        } else {
            throw new RuntimeException_57(new StringBuilder().insert(0, "Interface field '").append(class_524.method_1892(class_261Var)).append("' must have the ACC_PUBLIC modifier set but hasn't!").toString());
        }
        if ((class_261Var.method_433() & (-224)) > 0) {
            this.field_853.method_671(new StringBuilder().insert(0, "Field '").append(class_524.method_1892(class_261Var)).append("' has access flag(s) other than ACC_PUBLIC, ACC_PRIVATE, ACC_PROTECTED, ACC_STATIC, ACC_FINAL, ACC_VOLATILE, ACC_TRANSIENT set (ignored).").toString());
        }
        method_1090(class_261Var, class_261Var.method_183(), this.field_860);
        String method_464 = class_261Var.method_464();
        if (!class_524.method_466(method_464)) {
            throw new RuntimeException_57(new StringBuilder().insert(0, "Field '").append(class_524.method_1892(class_261Var)).append("' has illegal name '").append(class_261Var.method_464()).append("'.").toString());
        }
        method_1090(class_261Var, class_261Var.method_928(), this.field_860);
        String method_198 = ((class_371) this.field_851.method_982(class_261Var.method_928())).method_198();
        try {
            class_212.method_1034(method_198);
            String sb = new StringBuilder().insert(0, method_464).append(method_198).toString();
            if (this.field_863.contains(sb)) {
                throw new RuntimeException_57(new StringBuilder().insert(0, "No two fields (like '").append(class_524.method_1892(class_261Var)).append("') are allowed have same names and descriptors!").toString());
            }
            if (this.field_852.contains(method_464)) {
                this.field_853.method_671(new StringBuilder().insert(0, "More than one field of name '").append(method_464).append("' detected (but with different type descriptors). This is very unusual.").toString());
            }
            this.field_863.add(sb);
            this.field_852.add(method_464);
            class_160[] method_906 = class_261Var.method_906();
            int i2 = 0;
            int i3 = 0;
            while (i2 < method_906.length) {
                if (!(method_906[i3] instanceof class_257) && !(method_906[i3] instanceof class_569) && !(method_906[i3] instanceof class_221)) {
                    this.field_853.method_671(new StringBuilder().insert(0, "Attribute '").append(class_524.method_1892(method_906[i3])).append("' as an attribute of Field '").append(class_524.method_1892(class_261Var)).append("' is unknown and will therefore be ignored.").toString());
                }
                if (!(method_906[i3] instanceof class_257)) {
                    this.field_853.method_671(new StringBuilder().insert(0, "Attribute '").append(class_524.method_1892(method_906[i3])).append("' as an attribute of Field '").append(class_524.method_1892(class_261Var)).append("' is not a ConstantValue and is therefore only of use for debuggers and such.").toString());
                }
                int i4 = i3 + 1;
                i2 = i4;
                i3 = i4;
            }
        } catch (class_168 e) {
            throw new RuntimeException_57(new StringBuilder().insert(0, "Illegal descriptor (==signature) '").append(method_198).append("' used by '").append(class_524.method_1892(class_261Var)).append("'.").toString());
        }
    }

    @Override // p000.class_164, p000.class_21
    public void method_85(class_440 class_440Var) {
        class_160[] class_160VarArr;
        boolean z;
        boolean z2;
        class_160[] method_906 = class_440Var.method_906();
        boolean method_1754 = new class_465(this.field_854).method_1754();
        int i = 0;
        boolean z3 = false;
        boolean z4 = false;
        int i2 = 0;
        while (i < method_906.length) {
            if (!(method_906[i2] instanceof class_599) && !(method_906[i2] instanceof class_221) && !(method_906[i2] instanceof class_121) && !(method_906[i2] instanceof class_569)) {
                this.field_853.method_671(new StringBuilder().insert(0, "Attribute '").append(class_524.method_1892(method_906[i2])).append("' as an attribute of the ClassFile structure '").append(class_524.method_1892(class_440Var)).append("' is unknown and will therefore be ignored.").toString());
            }
            if (!(method_906[i2] instanceof class_599)) {
                class_160VarArr = method_906;
            } else {
                if (z3) {
                    throw new RuntimeException_57(new StringBuilder().insert(0, "A ClassFile structure (like '").append(class_524.method_1892(class_440Var)).append("') may have no more than one SourceFile attribute.").toString());
                }
                class_160VarArr = method_906;
                z3 = true;
            }
            if (class_160VarArr[i2] instanceof class_121) {
                if (!z4) {
                    z2 = method_1754;
                    z = true;
                } else {
                    if (method_1754) {
                        throw new RuntimeException_57(new StringBuilder().insert(0, "A Classfile structure (like '").append(class_524.method_1892(class_440Var)).append("') must have exactly one InnerClasses attribute if at least one Inner Class is referenced (which is the case). More than one InnerClasses attribute was found.").toString());
                    }
                    z2 = method_1754;
                    z = z4;
                }
                if (!z2) {
                    this.field_853.method_671(new StringBuilder().insert(0, "No referenced Inner Class found, but InnerClasses attribute '").append(class_524.method_1892(method_906[i2])).append("' found. Strongly suggest removal of that attribute.").toString());
                }
            } else {
                z = z4;
            }
            int i3 = i2 + 1;
            i = i3;
            z4 = z;
            i2 = i3;
        }
        if (method_1754 && !z4) {
            this.field_853.method_671(new StringBuilder().insert(0, "A Classfile structure (like '").append(class_524.method_1892(class_440Var)).append("') must have exactly one InnerClasses attribute if at least one Inner Class is referenced (which is the case). No InnerClasses attribute was found.").toString());
        }
    }

    public void method_1090(class_241 class_241Var, int i, Class cls) {
        if (i >= 0 && i < this.field_855) {
            class_286 method_982 = this.field_851.method_982(i);
            if (cls.isInstance(method_982)) {
                return;
            } else {
                throw new ClassCastException(new StringBuilder().insert(0, "Illegal constant '").append(class_524.method_1892(method_982)).append("' at index '").append(i).append("'. '").append(class_524.method_1892(class_241Var)).append("' expects a '").append(cls).append("'.").toString());
            }
        }
        throw new RuntimeException_57(new StringBuilder().insert(0, "Invalid index '").append(i).append("' used by '").append(class_524.method_1892(class_241Var)).append("'.").toString());
    }

    @Override // p000.class_164, p000.class_21
    public void method_62(class_557 class_557Var) {
        class_275 method_1057;
        class_275 method_10572;
        method_1090(class_557Var, class_557Var.method_183(), this.field_860);
        String method_464 = class_557Var.method_464();
        if (!class_524.method_1882(method_464, true)) {
            throw new RuntimeException_57(new StringBuilder().insert(0, "Method '").append(class_524.method_1892(class_557Var)).append("' has illegal name '").append(method_464).append("'.").toString());
        }
        method_1090(class_557Var, class_557Var.method_928(), this.field_860);
        String method_198 = ((class_371) this.field_851.method_982(class_557Var.method_928())).method_198();
        try {
            class_212 method_1033 = class_212.method_1033(method_198);
            class_212[] method_1030 = class_212.method_1030(method_198);
            if (method_1033 instanceof class_594) {
                method_1033 = ((class_594) method_1033).method_669();
            }
            if ((method_1033 instanceof class_392) && (method_10572 = class_412.method_1574(((class_392) method_1033).method_464()).method_1057()) != class_275.field_946) {
                throw new RuntimeException_57(new StringBuilder().insert(0, "Method '").append(class_524.method_1892(class_557Var)).append("' has a return type that does not pass verification pass 1: '").append(method_10572).append("'.").toString());
            }
            int i = 0;
            int i2 = 0;
            while (i < method_1030.length) {
                class_212 class_212Var = method_1030[i2];
                if (class_212Var instanceof class_594) {
                    class_212Var = ((class_594) class_212Var).method_669();
                }
                if (!(class_212Var instanceof class_392) || (method_1057 = class_412.method_1574(((class_392) class_212Var).method_464()).method_1057()) == class_275.field_946) {
                    int i3 = i2 + 1;
                    i = i3;
                    i2 = i3;
                } else {
                    throw new RuntimeException_57(new StringBuilder().insert(0, "Method '").append(class_524.method_1892(class_557Var)).append("' has an argument type that does not pass verification pass 1: '").append(method_1057).append("'.").toString());
                }
            }
            if (!method_464.equals("<clinit>") || method_1030.length == 0) {
                if (this.field_854.method_1641()) {
                    int i4 = class_557Var.method_424() ? 1 : 0;
                    if (class_557Var.method_1129()) {
                        i4++;
                    }
                    if (class_557Var.method_1124()) {
                        i4++;
                    }
                    if (i4 <= 1) {
                        if (class_557Var.method_1103()) {
                            if (class_557Var.method_1117()) {
                                throw new RuntimeException_57(new StringBuilder().insert(0, "Abstract method '").append(class_524.method_1892(class_557Var)).append("' must not have the ACC_FINAL modifier set.").toString());
                            }
                            if (class_557Var.method_1126()) {
                                throw new RuntimeException_57(new StringBuilder().insert(0, "Abstract method '").append(class_524.method_1892(class_557Var)).append("' must not have the ACC_NATIVE modifier set.").toString());
                            }
                            if (!class_557Var.method_424()) {
                                if (!class_557Var.method_1125()) {
                                    if (!class_557Var.method_1113()) {
                                        if (class_557Var.method_1121()) {
                                            throw new RuntimeException_57(new StringBuilder().insert(0, "Abstract method '").append(class_524.method_1892(class_557Var)).append("' must not have the ACC_SYNCHRONIZED modifier set.").toString());
                                        }
                                    } else {
                                        throw new RuntimeException_57(new StringBuilder().insert(0, "Abstract method '").append(class_524.method_1892(class_557Var)).append("' must not have the ACC_STRICT modifier set.").toString());
                                    }
                                } else {
                                    throw new RuntimeException_57(new StringBuilder().insert(0, "Abstract method '").append(class_524.method_1892(class_557Var)).append("' must not have the ACC_STATIC modifier set.").toString());
                                }
                            } else {
                                throw new RuntimeException_57(new StringBuilder().insert(0, "Abstract method '").append(class_524.method_1892(class_557Var)).append("' must not have the ACC_PRIVATE modifier set.").toString());
                            }
                        }
                    } else {
                        throw new RuntimeException_57(new StringBuilder().insert(0, "Method '").append(class_524.method_1892(class_557Var)).append("' must only have at most one of its ACC_PRIVATE, ACC_PROTECTED, ACC_PUBLIC modifiers set.").toString());
                    }
                } else if (!method_464.equals("<clinit>")) {
                    if (!class_557Var.method_1124()) {
                        throw new RuntimeException_57(new StringBuilder().insert(0, "Interface method '").append(class_524.method_1892(class_557Var)).append("' must have the ACC_PUBLIC modifier set but hasn't!").toString());
                    }
                    if (!class_557Var.method_1103()) {
                        throw new RuntimeException_57(new StringBuilder().insert(0, "Interface method '").append(class_524.method_1892(class_557Var)).append("' must have the ACC_STATIC modifier set but hasn't!").toString());
                    }
                    if (class_557Var.method_424() || class_557Var.method_1129() || class_557Var.method_1125() || class_557Var.method_1117() || class_557Var.method_1121() || class_557Var.method_1126() || class_557Var.method_1113()) {
                        throw new RuntimeException_57(new StringBuilder().insert(0, "Interface method '").append(class_524.method_1892(class_557Var)).append("' must not have any of the ACC_PRIVATE, ACC_PROTECTED, ACC_STATIC, ACC_FINAL, ACC_SYNCHRONIZED, ACC_NATIVE, ACC_ABSTRACT, ACC_STRICT modifiers set.").toString());
                    }
                }
                if (!method_464.equals("<init>") || (!class_557Var.method_1125() && !class_557Var.method_1117() && !class_557Var.method_1121() && !class_557Var.method_1126() && !class_557Var.method_1103())) {
                    if (method_464.equals("<clinit>")) {
                        if ((class_557Var.method_433() & (-2049)) > 0) {
                            this.field_853.method_671(new StringBuilder().insert(0, "Class or interface initialization method '").append(class_524.method_1892(class_557Var)).append("' has superfluous access modifier(s) set: everything but ACC_STRICT is ignored.").toString());
                        }
                        if (class_557Var.method_1103()) {
                            throw new RuntimeException_57(new StringBuilder().insert(0, "Class or interface initialization method '").append(class_524.method_1892(class_557Var)).append("' must not be abstract. This contradicts the Java Language Specification, Second Edition (which omits this constraint) but is common practice of existing verifiers.").toString());
                        }
                    }
                    if ((class_557Var.method_433() & (-3392)) > 0) {
                        this.field_853.method_671(new StringBuilder().insert(0, "Method '").append(class_524.method_1892(class_557Var)).append("' has access flag(s) other than ACC_PUBLIC, ACC_PRIVATE, ACC_PROTECTED, ACC_STATIC, ACC_FINAL, ACC_SYNCHRONIZED, ACC_NATIVE, ACC_ABSTRACT, ACC_STRICT set (ignored).").toString());
                    }
                    String sb = new StringBuilder().insert(0, method_464).append(method_198).toString();
                    if (!this.field_865.contains(sb)) {
                        this.field_865.add(sb);
                        class_160[] method_906 = class_557Var.method_906();
                        int i5 = 0;
                        int i6 = 0;
                        int i7 = 0;
                        while (i5 < method_906.length) {
                            if (!(method_906[i7] instanceof class_576) && !(method_906[i7] instanceof class_224) && !(method_906[i7] instanceof class_569) && !(method_906[i7] instanceof class_221)) {
                                this.field_853.method_671(new StringBuilder().insert(0, "Attribute '").append(class_524.method_1892(method_906[i7])).append("' as an attribute of Method '").append(class_524.method_1892(class_557Var)).append("' is unknown and will therefore be ignored.").toString());
                            }
                            if (!(method_906[i7] instanceof class_576) && !(method_906[i7] instanceof class_224)) {
                                this.field_853.method_671(new StringBuilder().insert(0, "Attribute '").append(class_524.method_1892(method_906[i7])).append("' as an attribute of Method '").append(class_524.method_1892(class_557Var)).append("' is neither Code nor Exceptions and is therefore only of use for debuggers and such.").toString());
                            }
                            if (!(method_906[i7] instanceof class_576) || (!class_557Var.method_1126() && !class_557Var.method_1103())) {
                                if (method_906[i7] instanceof class_576) {
                                    i6++;
                                }
                                int i8 = i7 + 1;
                                i5 = i8;
                                i7 = i8;
                            } else {
                                throw new RuntimeException_57(new StringBuilder().insert(0, "Native or abstract methods like '").append(class_524.method_1892(class_557Var)).append("' must not have a Code attribute like '").append(class_524.method_1892(method_906[i7])).append("'.").toString());
                            }
                        }
                        if (!class_557Var.method_1126() && !class_557Var.method_1103() && i6 != 1) {
                            throw new RuntimeException_57(new StringBuilder().insert(0, "Non-native, non-abstract methods like '").append(class_524.method_1892(class_557Var)).append("' must have exactly one Code attribute (found: ").append(i6).append(").").toString());
                        }
                        return;
                    }
                    throw new RuntimeException_57(new StringBuilder().insert(0, "No two methods (like '").append(class_524.method_1892(class_557Var)).append("') are allowed have same names and desciptors!").toString());
                }
                throw new RuntimeException_57(new StringBuilder().insert(0, "Instance initialization method '").append(class_524.method_1892(class_557Var)).append("' must not have any of the ACC_STATIC, ACC_FINAL, ACC_SYNCHRONIZED, ACC_NATIVE, ACC_ABSTRACT modifiers set.").toString());
            }
            throw new RuntimeException_57(new StringBuilder().insert(0, "Method '").append(class_524.method_1892(class_557Var)).append("' has illegal name '").append(method_464).append("'. It's name resembles the class or interface initialization method which it isn't because of its arguments (==descriptor).").toString());
        } catch (class_168 e) {
            throw new RuntimeException_57(new StringBuilder().insert(0, "Illegal descriptor (==signature) '").append(method_198).append("' used by Method '").append(class_524.method_1892(class_557Var)).append("'.").toString());
        }
    }

    @Override // p000.class_164, p000.class_21
    public void method_83(class_573 class_573Var) {
        if (class_573Var.method_619() == 6) {
        } else {
            throw new RuntimeException_57(new StringBuilder().insert(0, "Wrong constant tag in '").append(class_524.method_1892(class_573Var)).append("'.").toString());
        }
    }

    public class_242(class_524 class_524Var, class_440 class_440Var, EmptyClass class_455Var) {
        this(class_524Var, class_440Var);
    }

    @Override // p000.class_164, p000.class_21
    public void method_80(class_569 class_569Var) {
        method_1090(class_569Var, class_569Var.method_433(), this.field_860);
        String method_198 = ((class_371) this.field_851.method_982(class_569Var.method_433())).method_198();
        if (method_198.equals("Synthetic")) {
        } else {
            throw new RuntimeException_57(new StringBuilder().insert(0, "The Synthetic attribute '").append(class_524.method_1892(class_569Var)).append("' is not correctly named 'Synthetic' but '").append(method_198).append("'.").toString());
        }
    }

    @Override // p000.class_164, p000.class_21
    public void method_86(class_257 class_257Var) {
        method_1090(class_257Var, class_257Var.method_433(), this.field_860);
        String method_198 = ((class_371) this.field_851.method_982(class_257Var.method_433())).method_198();
        if (!method_198.equals("ConstantValue")) {
            throw new RuntimeException_57(new StringBuilder().insert(0, "The ConstantValue attribute '").append(class_524.method_1892(class_257Var)).append("' is not correctly named 'ConstantValue' but '").append(method_198).append("'.").toString());
        }
        Object method_1301 = this.field_850.method_1301();
        if (method_1301 instanceof class_261) {
            class_261 class_261Var = (class_261) method_1301;
            class_212 method_1034 = class_212.method_1034(((class_371) this.field_851.method_982(class_261Var.method_928())).method_198());
            int method_183 = class_257Var.method_183();
            if (method_183 >= 0 && method_183 < this.field_855) {
                class_286 method_982 = this.field_851.method_982(method_183);
                if (this.field_859.isInstance(method_982) && method_1034.equals(class_212.field_798)) {
                    return;
                }
                if (!this.field_858.isInstance(method_982) || !method_1034.equals(class_212.field_812)) {
                    if (this.field_864.isInstance(method_982) && method_1034.equals(class_212.field_810)) {
                        return;
                    }
                    if (this.field_861.isInstance(method_982) && (method_1034.equals(class_212.field_802) || method_1034.equals(class_212.field_801) || method_1034.equals(class_212.field_806) || method_1034.equals(class_212.field_795) || method_1034.equals(class_212.field_813))) {
                        return;
                    }
                    if (!this.field_856.isInstance(method_982) || !method_1034.equals(class_212.field_799)) {
                        throw new RuntimeException_57(new StringBuilder().insert(0, "Illegal type of ConstantValue '").append(class_257Var).append("' embedding Constant '").append(method_982).append("'. It is referenced by field '").append(class_524.method_1892(class_261Var)).append("' expecting a different type: '").append(method_1034).append("'.").toString());
                    }
                    return;
                }
                return;
            }
            throw new RuntimeException_57(new StringBuilder().insert(0, "Invalid index '").append(method_183).append("' used by '").append(class_524.method_1892(class_257Var)).append("'.").toString());
        }
    }

    @Override // p000.class_164, p000.class_21
    public void method_58(class_121 class_121Var) {
        method_1090(class_121Var, class_121Var.method_433(), this.field_860);
        String method_198 = ((class_371) this.field_851.method_982(class_121Var.method_433())).method_198();
        if (method_198.equals("InnerClasses")) {
            class_367[] method_626 = class_121Var.method_626();
            int i = 0;
            int i2 = 0;
            while (i < method_626.length) {
                method_1090(class_121Var, method_626[i2].method_183(), this.field_857);
                int method_47 = method_626[i2].method_47();
                if (method_47 != 0) {
                    method_1090(class_121Var, method_47, this.field_857);
                }
                int method_433 = method_626[i2].method_433();
                if (method_433 != 0) {
                    method_1090(class_121Var, method_433, this.field_860);
                }
                if ((method_626[i2].method_928() & (-1568)) != 0) {
                    this.field_853.method_671(new StringBuilder().insert(0, "Unknown access flag for inner class '").append(class_524.method_1892(method_626[i2])).append("' set (InnerClasses attribute '").append(class_524.method_1892(class_121Var)).append("').").toString());
                }
                int i3 = i2 + 1;
                i = i3;
                i2 = i3;
            }
            return;
        }
        throw new RuntimeException_57(new StringBuilder().insert(0, "The InnerClasses attribute '").append(class_524.method_1892(class_121Var)).append("' is not correctly named 'InnerClasses' but '").append(method_198).append("'.").toString());
    }

    @Override // p000.class_164, p000.class_21
    public void method_75(class_221 class_221Var) {
        method_1090(class_221Var, class_221Var.method_433(), this.field_860);
        String method_198 = ((class_371) this.field_851.method_982(class_221Var.method_433())).method_198();
        if (method_198.equals("Deprecated")) {
        } else {
            throw new RuntimeException_57(new StringBuilder().insert(0, "The Deprecated attribute '").append(class_524.method_1892(class_221Var)).append("' is not correctly named 'Deprecated' but '").append(method_198).append("'.").toString());
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:59:0x03b3 */
    @Override // p000.class_164, p000.class_21
    public void method_68(class_576 class_576Var) {
        int i;
        int i2;
        class_160[] class_160VarArr;
        int i3;
        int i4;
        class_576 class_576Var2;
        try {
            method_1090(class_576Var, class_576Var.method_433(), this.field_860);
            String method_198 = ((class_371) this.field_851.method_982(class_576Var.method_433())).method_198();
            if (method_198.equals("Code")) {
                if (this.field_850.method_1301() instanceof class_557) {
                    class_557 class_557Var = (class_557) this.field_850.method_1301();
                    if (class_576Var.method_429().length == 0) {
                        throw new RuntimeException_57(new StringBuilder().insert(0, "Code array of Code attribute '").append(class_524.method_1892(class_576Var)).append("' (method '").append(class_557Var).append("') must not be empty.").toString());
                    }
                    class_372[] method_2023 = class_576Var.method_2023();
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < method_2023.length) {
                        int method_183 = method_2023[i6].method_183();
                        if (method_183 != 0) {
                            method_1090(class_576Var, method_183, this.field_857);
                            class_43 class_43Var = (class_43) this.field_851.method_982(method_183);
                            method_1090(class_43Var, class_43Var.method_47(), this.field_860);
                            String replace = ((class_371) this.field_851.method_982(class_43Var.method_47())).method_198().replace('/', '.');
                            class_275 method_1057 = class_412.method_1574(replace).method_1057();
                            if (method_1057 != class_275.field_946) {
                                throw new RuntimeException_57(new StringBuilder().insert(0, "Code attribute '").append(class_524.method_1892(class_576Var)).append("' (method '").append(class_557Var).append("') has an exception_table entry '").append(class_524.method_1892(method_2023[i6])).append("' that references '").append(replace).append("' as an Exception but it does not pass verification pass 1: ").append(method_1057).toString());
                            }
                            class_440 method_1810 = class_474.method_1810(replace);
                            class_440 method_18102 = class_474.method_1810(class_212.field_805.method_464());
                            class_440 method_18103 = class_474.method_1810(class_212.field_808.method_464());
                            class_440 class_440Var = method_1810;
                            class_440 class_440Var2 = method_1810;
                            while (class_440Var != method_18103 && class_440Var2 != method_18102) {
                                class_275 method_10572 = class_412.method_1574(class_440Var2.method_1631()).method_1057();
                                if (method_10572 != class_275.field_946) {
                                    throw new RuntimeException_57(new StringBuilder().insert(0, "Code attribute '").append(class_524.method_1892(class_576Var)).append("' (method '").append(class_557Var).append("') has an exception_table entry '").append(class_524.method_1892(method_2023[i6])).append("' that references '").append(replace).append("' as an Exception but '").append(class_440Var2.method_1631()).append("' in the ancestor hierachy does not pass verification pass 1: ").append(method_10572).toString());
                                }
                                class_440 method_18104 = class_474.method_1810(class_440Var2.method_1631());
                                class_440Var = method_18104;
                                class_440Var2 = method_18104;
                            }
                            if (class_440Var2 != method_18102) {
                                throw new RuntimeException_57(new StringBuilder().insert(0, "Code attribute '").append(class_524.method_1892(class_576Var)).append("' (method '").append(class_557Var).append("') has an exception_table entry '").append(class_524.method_1892(method_2023[i6])).append("' that references '").append(replace).append("' as an Exception but it is not a subclass of '").append(method_18102.method_546()).append("'.").toString());
                            }
                        }
                        int i7 = i6 + 1;
                        i5 = i7;
                        i6 = i7;
                    }
                    class_557[] method_904 = class_474.method_1810(class_524.method_1887(this.field_853).method_1062()).method_904();
                    int i8 = 0;
                    int i9 = 0;
                    while (true) {
                        if (i8 >= method_904.length) {
                            i = -1;
                            i2 = -1;
                            break;
                        } else if (class_557Var == method_904[i9]) {
                            i = i9;
                            i2 = i9;
                            break;
                        } else {
                            int i10 = i9 + 1;
                            i8 = i10;
                            i9 = i10;
                        }
                    }
                    if (i >= 0) {
                        class_524.method_1889(this.field_853)[i2] = new class_457(class_576Var.method_183());
                        int i11 = 0;
                        class_160[] method_906 = class_576Var.method_906();
                        int i12 = 0;
                        while (i12 < method_906.length) {
                            if ((method_906[i12] instanceof class_332) || (method_906[i12] instanceof class_40)) {
                                this.field_853.method_671(new StringBuilder().insert(0, "Attribute '").append(class_524.method_1892(method_906[i12])).append("' as an attribute of Code attribute '").append(class_524.method_1892(class_576Var)).append("' (method '").append(class_557Var).append("') will effectively be ignored and is only useful for debuggers and such.").toString());
                                class_160VarArr = method_906;
                            } else {
                                this.field_853.method_671(new StringBuilder().insert(0, "Attribute '").append(class_524.method_1892(method_906[i12])).append("' as an attribute of Code attribute '").append(class_524.method_1892(class_576Var)).append("' (method '").append(class_557Var).append("') is unknown and will therefore be ignored.").toString());
                                class_160VarArr = method_906;
                            }
                            if (class_160VarArr[i12] instanceof class_40) {
                                class_40 class_40Var = (class_40) method_906[i12];
                                method_1090(class_40Var, class_40Var.method_433(), this.field_860);
                                String method_1982 = ((class_371) this.field_851.method_982(class_40Var.method_433())).method_198();
                                if (method_1982.equals("LocalVariableTable")) {
                                    class_368[] method_181 = class_40Var.method_181();
                                    int i13 = 0;
                                    while (true) {
                                        int i14 = i13;
                                        if (i13 >= method_181.length) {
                                            i3 = i11 + 1;
                                            if (i3 > class_576Var.method_183()) {
                                                throw new RuntimeException_57(new StringBuilder().insert(0, "Number of LocalVariableTable attributes of Code attribute '").append(class_524.method_1892(class_576Var)).append("' (method '").append(class_524.method_1892(class_557Var)).append("') exceeds number of local variable slots '").append(class_576Var.method_183()).append("' ('There may be no more than one LocalVariableTable attribute per local variable in the Code attribute.').").toString());
                                            }
                                        } else {
                                            method_1090(class_40Var, method_181[i14].method_927(), this.field_860);
                                            String method_1983 = ((class_371) this.field_851.method_982(method_181[i14].method_927())).method_198();
                                            if (!class_524.method_1881(method_1983)) {
                                                throw new RuntimeException_57(new StringBuilder().insert(0, "LocalVariableTable '").append(class_524.method_1892(class_40Var)).append("' references a local variable by the name '").append(method_1983).append("' which is not a legal Java simple name.").toString());
                                            }
                                            method_1090(class_40Var, method_181[i14].method_183(), this.field_860);
                                            String method_1984 = ((class_371) this.field_851.method_982(method_181[i14].method_183())).method_198();
                                            try {
                                                class_212 method_1034 = class_212.method_1034(method_1984);
                                                int method_47 = method_181[i14].method_47();
                                                if (method_1034 == class_212.field_798 || method_1034 == class_212.field_810) {
                                                    i4 = method_47 + 1;
                                                    class_576Var2 = class_576Var;
                                                } else {
                                                    class_576Var2 = class_576Var;
                                                    i4 = method_47;
                                                }
                                                if (i4 < class_576Var2.method_183()) {
                                                    try {
                                                        class_524.method_1889(this.field_853)[i2].method_1721(method_47, method_1983, method_181[i14].method_928(), method_181[i14].method_433(), method_1034);
                                                        i13 = i14 + 1;
                                                    } catch (RuntimeException_62 e) {
                                                        throw new RuntimeException_57(new StringBuilder().insert(0, "Conflicting information in LocalVariableTable '").append(class_524.method_1892(class_40Var)).append("' found in Code attribute '").append(class_524.method_1892(class_576Var)).append("' (method '").append(class_524.method_1892(class_557Var)).append("'). ").append(e.getMessage()).toString());
                                                    }
                                                } else {
                                                    throw new RuntimeException_57(new StringBuilder().insert(0, "LocalVariableTable attribute '").append(class_524.method_1892(class_40Var)).append("' references a LocalVariable '").append(class_524.method_1892(method_181[i14])).append("' with an index that exceeds the surrounding Code attribute's max_locals value of '").append(class_576Var.method_183()).append("'.").toString());
                                                }
                                            } catch (class_168 e2) {
                                                throw new RuntimeException_57(new StringBuilder().insert(0, "Illegal descriptor (==signature) '").append(method_1984).append("' used by LocalVariable '").append(class_524.method_1892(method_181[i14])).append("' referenced by '").append(class_524.method_1892(class_40Var)).append("'.").toString());
                                            }
                                        }
                                    }
                                } else {
                                    throw new RuntimeException_57(new StringBuilder().insert(0, "The LocalVariableTable attribute '").append(class_524.method_1892(class_40Var)).append("' is not correctly named 'LocalVariableTable' but '").append(method_1982).append("'.").toString());
                                }
                            } else {
                                i3 = i11;
                            }
                            i12++;
                            i11 = i3;
                        }
                        return;
                    }
                    throw new class_572("Could not find a known BCEL Method object in the corresponding BCEL JavaClass object.");
                }
                this.field_853.method_671(new StringBuilder().insert(0, "Code attribute '").append(class_524.method_1892(class_576Var)).append("' is not declared in a method_info structure but in '").append(this.field_850.method_1301()).append("'. Ignored.").toString());
                return;
            }
            throw new RuntimeException_57(new StringBuilder().insert(0, "The Code attribute '").append(class_524.method_1892(class_576Var)).append("' is not correctly named 'Code' but '").append(method_198).append("'.").toString());
        } catch (ClassNotFoundException e3) {
            throw new class_572(new StringBuilder().insert(0, "Missing class: ").append(e3.toString()).toString());
        }
    }

    @Override // p000.class_164, p000.class_21
    public void method_90(class_599 class_599Var) {
        method_1090(class_599Var, class_599Var.method_433(), this.field_860);
        String method_198 = ((class_371) this.field_851.method_982(class_599Var.method_433())).method_198();
        if (method_198.equals("SourceFile")) {
            method_1090(class_599Var, class_599Var.method_183(), this.field_860);
            String method_1982 = ((class_371) this.field_851.method_982(class_599Var.method_183())).method_198();
            String lowerCase = method_1982.toLowerCase(Locale.ENGLISH);
            if (method_1982.indexOf(47) == -1 && method_1982.indexOf(92) == -1 && method_1982.indexOf(58) == -1 && lowerCase.lastIndexOf(".java") != -1) {
                return;
            }
            this.field_853.method_671(new StringBuilder().insert(0, "SourceFile attribute '").append(class_524.method_1892(class_599Var)).append("' has a funny name: remember not to confuse certain parsers working on javap's output. Also, this name ('").append(method_1982).append("') is considered an unqualified (simple) file name only.").toString());
            return;
        }
        throw new RuntimeException_57(new StringBuilder().insert(0, "The SourceFile attribute '").append(class_524.method_1892(class_599Var)).append("' is not correctly named 'SourceFile' but '").append(method_198).append("'.").toString());
    }

    @Override // p000.class_164, p000.class_21
    public void method_53(class_332 class_332Var) {
        method_1090(class_332Var, class_332Var.method_433(), this.field_860);
        String method_198 = ((class_371) this.field_851.method_982(class_332Var.method_433())).method_198();
        if (!method_198.equals("LineNumberTable")) {
            throw new RuntimeException_57(new StringBuilder().insert(0, "The LineNumberTable attribute '").append(class_524.method_1892(class_332Var)).append("' is not correctly named 'LineNumberTable' but '").append(method_198).append("'.").toString());
        }
    }

    @Override // p000.class_164, p000.class_21
    public void method_84(class_372 class_372Var) {
    }

    @Override // p000.class_164, p000.class_21
    public void method_54(class_224 class_224Var) {
        try {
            method_1090(class_224Var, class_224Var.method_433(), this.field_860);
            String method_198 = ((class_371) this.field_851.method_982(class_224Var.method_433())).method_198();
            if (!method_198.equals("Exceptions")) {
                throw new RuntimeException_57(new StringBuilder().insert(0, "The Exceptions attribute '").append(class_524.method_1892(class_224Var)).append("' is not correctly named 'Exceptions' but '").append(method_198).append("'.").toString());
            }
            int[] method_434 = class_224Var.method_434();
            for (int i = 0; i < method_434.length; i++) {
                method_1090(class_224Var, method_434[i], this.field_857);
                class_43 class_43Var = (class_43) this.field_851.method_982(method_434[i]);
                method_1090(class_43Var, class_43Var.method_47(), this.field_860);
                String replace = ((class_371) this.field_851.method_982(class_43Var.method_47())).method_198().replace('/', '.');
                class_275 method_1057 = class_412.method_1574(replace).method_1057();
                if (method_1057 == class_275.field_946) {
                    class_440 method_1810 = class_474.method_1810(replace);
                    class_440 method_18102 = class_474.method_1810(class_212.field_805.method_464());
                    class_440 method_18103 = class_474.method_1810(class_212.field_808.method_464());
                    class_440 class_440Var = method_1810;
                    class_440 class_440Var2 = method_1810;
                    while (class_440Var != method_18103 && class_440Var2 != method_18102) {
                        class_275 method_10572 = class_412.method_1574(class_440Var2.method_1631()).method_1057();
                        if (method_10572 == class_275.field_946) {
                            class_440 method_18104 = class_474.method_1810(class_440Var2.method_1631());
                            class_440Var = method_18104;
                            class_440Var2 = method_18104;
                        } else {
                            throw new RuntimeException_57(new StringBuilder().insert(0, "Exceptions attribute '").append(class_524.method_1892(class_224Var)).append("' references '").append(replace).append("' as an Exception but '").append(class_440Var2.method_1631()).append("' in the ancestor hierachy does not pass verification pass 1: ").append(method_10572).toString());
                        }
                    }
                    if (class_440Var2 != method_18102) {
                        throw new RuntimeException_57(new StringBuilder().insert(0, "Exceptions attribute '").append(class_524.method_1892(class_224Var)).append("' references '").append(replace).append("' as an Exception but it is not a subclass of '").append(method_18102.method_546()).append("'.").toString());
                    }
                } else {
                    throw new RuntimeException_57(new StringBuilder().insert(0, "Exceptions attribute '").append(class_524.method_1892(class_224Var)).append("' references '").append(replace).append("' as an Exception but it does not pass verification pass 1: ").append(method_1057).toString());
                }
            }
        } catch (ClassNotFoundException e) {
            throw new class_572(new StringBuilder().insert(0, "Missing class: ").append(e.toString()).toString());
        }
    }

    @Override // p000.class_164, p000.class_21
    public void method_69(class_499 class_499Var) {
    }

    @Override // p000.class_164, p000.class_21
    public void method_59(class_367 class_367Var) {
    }

    @Override // p000.class_164, p000.class_21
    public void method_79(class_368 class_368Var) {
    }

    @Override // p000.class_164, p000.class_21
    public void method_73(class_228 class_228Var) {
        method_1090(class_228Var, class_228Var.method_433(), this.field_860);
        this.field_853.method_671(new StringBuilder().insert(0, "Unknown attribute '").append(class_524.method_1892(class_228Var)).append("'. This attribute is not known in any context!").toString());
    }

    @Override // p000.class_164, p000.class_21
    public void method_65(class_40 class_40Var) {
    }

    @Override // p000.class_164, p000.class_21
    public void method_55(class_387 class_387Var) {
    }
}
