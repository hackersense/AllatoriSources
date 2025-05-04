package com.allatori.ant;

import com.allatori.EmptyClass;
import com.allatori.exception.runtime.RuntimeException_57;
import com.allatori.exception.runtime.class_168;
import com.allatori.interfaces.unmapped.class_21;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_206 extends class_164 implements class_21 {
    public final class_524 field_771;
    public final class_499 field_772;

    public class_206(class_524 class_524Var, class_440 class_440Var) {
        this.field_771 = class_524Var;
        this.field_772 = class_440Var.method_502();
    }

    @Override // p000.class_164, p000.class_21
    public void method_88(class_401 class_401Var) {
        if (class_401Var.method_619() == 11) {
            class_538 class_538Var = (class_538) this.field_772.method_982(class_401Var.method_433());
            String method_198 = ((class_371) this.field_772.method_982(class_538Var.method_47())).method_198();
            if (!class_524.method_1878(method_198)) {
                throw new RuntimeException_57(new StringBuilder().insert(0, "Invalid (interface) method name '").append(method_198).append("' referenced by '").append(class_524.method_1892(class_401Var)).append("'.").toString());
            }
            String method_1982 = ((class_371) this.field_772.method_982(((class_43) this.field_772.method_982(class_401Var.method_47())).method_47())).method_198();
            if (!class_524.method_1879(method_1982)) {
                throw new RuntimeException_57(new StringBuilder().insert(0, "Illegal class name '").append(method_1982).append("' used by '").append(class_524.method_1892(class_401Var)).append("'.").toString());
            }
            String method_1983 = ((class_371) this.field_772.method_982(class_538Var.method_433())).method_198();
            try {
                class_212 method_1033 = class_212.method_1033(method_1983);
                if (method_198.equals("<clinit>") && method_1033 != class_212.field_794) {
                    this.field_771.method_671(new StringBuilder().insert(0, "Class or interface initialization method '<clinit>' usually has VOID return type instead of '").append(method_1033).append("'. Note this is really not a requirement of The Java Virtual Machine Specification, Second Edition.").toString());
                    return;
                }
                return;
            } catch (class_168 e) {
                throw new RuntimeException_57(new StringBuilder().insert(0, "Illegal descriptor (==signature) '").append(method_1983).append("' used by '").append(class_524.method_1892(class_401Var)).append("'.").toString());
            }
        }
        throw new RuntimeException_57(new StringBuilder().insert(0, "ConstantInterfaceMethodref '").append(class_524.method_1892(class_401Var)).append("' has wrong tag!").toString());
    }

    public class_206(class_524 class_524Var, class_440 class_440Var, EmptyClass class_455Var) {
        this(class_524Var, class_440Var);
    }

    @Override // p000.class_164, p000.class_21
    public void method_81(class_530 class_530Var) {
        if (class_530Var.method_619() != 9) {
            throw new RuntimeException_57(new StringBuilder().insert(0, "ConstantFieldref '").append(class_524.method_1892(class_530Var)).append("' has wrong tag!").toString());
        }
        class_538 class_538Var = (class_538) this.field_772.method_982(class_530Var.method_433());
        String method_198 = ((class_371) this.field_772.method_982(class_538Var.method_47())).method_198();
        if (!class_524.method_466(method_198)) {
            throw new RuntimeException_57(new StringBuilder().insert(0, "Invalid field name '").append(method_198).append("' referenced by '").append(class_524.method_1892(class_530Var)).append("'.").toString());
        }
        String method_1982 = ((class_371) this.field_772.method_982(((class_43) this.field_772.method_982(class_530Var.method_47())).method_47())).method_198();
        if (!class_524.method_1879(method_1982)) {
            throw new RuntimeException_57(new StringBuilder().insert(0, "Illegal class name '").append(method_1982).append("' used by '").append(class_524.method_1892(class_530Var)).append("'.").toString());
        }
        String method_1983 = ((class_371) this.field_772.method_982(class_538Var.method_433())).method_198();
        try {
            class_212.method_1034(method_1983);
        } catch (class_168 e) {
            throw new RuntimeException_57(new StringBuilder().insert(0, "Illegal descriptor (==signature) '").append(method_1983).append("' used by '").append(class_524.method_1892(class_530Var)).append("'.").toString());
        }
    }

    @Override // p000.class_164, p000.class_21
    public void method_74(class_35 class_35Var) {
        if (class_35Var.method_619() != 10) {
            throw new RuntimeException_57(new StringBuilder().insert(0, "ConstantMethodref '").append(class_524.method_1892(class_35Var)).append("' has wrong tag!").toString());
        }
        class_538 class_538Var = (class_538) this.field_772.method_982(class_35Var.method_433());
        String method_198 = ((class_371) this.field_772.method_982(class_538Var.method_47())).method_198();
        if (!class_524.method_1886(method_198)) {
            throw new RuntimeException_57(new StringBuilder().insert(0, "Invalid (non-interface) method name '").append(method_198).append("' referenced by '").append(class_524.method_1892(class_35Var)).append("'.").toString());
        }
        String method_1982 = ((class_371) this.field_772.method_982(((class_43) this.field_772.method_982(class_35Var.method_47())).method_47())).method_198();
        if (class_524.method_1879(method_1982)) {
            String method_1983 = ((class_371) this.field_772.method_982(class_538Var.method_433())).method_198();
            try {
                class_212 method_1033 = class_212.method_1033(method_1983);
                if (method_198.equals("<init>") && method_1033 != class_212.field_794) {
                    throw new RuntimeException_57("Instance initialization method must have VOID return type.");
                }
                return;
            } catch (class_168 e) {
                throw new RuntimeException_57(new StringBuilder().insert(0, "Illegal descriptor (==signature) '").append(method_1983).append("' used by '").append(class_524.method_1892(class_35Var)).append("'.").toString());
            }
        }
        throw new RuntimeException_57(new StringBuilder().insert(0, "Illegal class name '").append(method_1982).append("' used by '").append(class_524.method_1892(class_35Var)).append("'.").toString());
    }
}
