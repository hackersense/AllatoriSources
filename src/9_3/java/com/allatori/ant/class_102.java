package com.allatori.ant;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_102 {
    public String field_509;
    public int field_510;
    public boolean field_511;
    public String field_512;
    public String field_513;
    public String field_514;

    public void method_602(String str) {
        class_102 class_102Var;
        class_102 class_102Var2;
        String[] split = str.split("\\s+");
        if (split != null && split.length != 0) {
            int length = split.length;
            if (length >= 3 && "instanceof".equals(split[length - 2])) {
                int i = length - 1;
                length -= 2;
                this.field_512 = class_268.method_1198(split[i]);
                class_102Var = this;
            } else {
                this.field_512 = null;
                class_102Var = this;
            }
            class_102Var.field_509 = class_268.method_1196(split[length - 1]);
            if (length <= 1 || class_268.method_1187(split[length - 2]) || class_268.method_1191(split[length - 2])) {
                this.field_513 = ".*";
                class_102Var2 = this;
            } else {
                this.field_513 = class_268.method_1198(split[length - 2]);
                class_102Var2 = this;
            }
            class_102Var2.field_510 = class_268.method_1192(str);
            if (!class_268.method_1191(split[0])) {
                this.field_514 = null;
                return;
            } else {
                this.field_514 = class_268.method_1198(split[0].substring(1));
                this.field_514 = 'L' + this.field_514.replaceAll("\\\\\\.", "/") + ';';
                return;
            }
        }
        throw new Exception("Invalid template.");
    }

    public boolean method_604(class_606 class_606Var, class_261 class_261Var) {
        if (!class_268.method_1188(class_261Var, this.field_510) || !class_261Var.method_464().matches(this.field_509) || !class_261Var.method_669().toString().matches(this.field_513)) {
            return false;
        }
        if (this.field_514 != null && !class_268.method_1186(class_261Var.method_1560(), this.field_514)) {
            return false;
        }
        if (this.field_512 != null) {
            String method_546 = class_261Var.method_546();
            if (method_546.charAt(0) != 'L' || method_546.charAt(method_546.length() - 1) != ';' || !class_268.method_1193(class_606Var, method_546.substring(1, method_546.length() - 1).replace('/', '.'), this.field_512)) {
                return false;
            }
        }
        return true;
    }

    public class_102(String str, boolean z) {
        method_602(str);
        this.field_511 = z;
    }

    public boolean method_603() {
        return this.field_511;
    }
}
