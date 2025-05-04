package com.allatori.ant;

import com.allatori.exception.runtime.RuntimeException_150;
import com.allatori.exception.runtime.class_168;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_131 extends class_488 {
    public class_225 field_593;
    public class_440 field_594;

    @Override // p000.class_488
    public class_275 method_644() {
        try {
            class_440 method_642 = method_642();
            if (method_642 == null || this.field_593.method_1062().equals(method_642.method_546())) {
                if (method_642 == null) {
                    return new class_275(2, "Repository.lookup() failed. FILE NOT FOUND?");
                }
                return class_275.field_946;
            }
            throw new RuntimeException_150(new StringBuilder().insert(0, "Wrong name: the internal name of the .class file '").append(method_642.method_546()).append("' does not match the file's name '").append(this.field_593.method_1062()).append("'.").toString());
        } catch (RuntimeException_150 e) {
            return new class_275(2, e.getMessage());
        } catch (class_168 e2) {
            return new class_275(2, e2.getMessage());
        } catch (RuntimeException e3) {
            return new class_275(2, "Parsing via BCEL did not succeed. " + e3.getClass().getName() + " occured:\n" + class_171.method_786(e3));
        }
    }

    @Override // p000.class_488
    public String[] method_643() {
        return super.method_643();
    }

    public class_440 method_642() {
        if (this.field_594 == null) {
            try {
                this.field_594 = class_474.method_1810(this.field_593.method_1062());
            } catch (ClassNotFoundException e) {
            }
        }
        return this.field_594;
    }

    public class_131(class_225 class_225Var) {
        this.field_593 = class_225Var;
    }
}
