package com.allatori.ant;

import com.allatori.exception.ExceptionProxy;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_269 {
    public String field_931;
    public String field_932;
    public String field_933;
    public boolean field_934;
    public String field_935;
    public int field_936;

    public boolean method_1203(class_557 class_557Var) {
        if (class_268.method_1188(class_557Var, this.field_936) && class_557Var.method_464().matches(this.field_935) && class_557Var.method_669().toString().matches(this.field_931) && class_268.method_1199(class_557Var.method_1964(), this.field_932)) {
            return this.field_933 == null || class_268.method_1186(class_557Var.method_1560(), this.field_933);
        }
        return false;
    }

    public void method_1201(String str) {
        String[] strArr;
        String[] strArr2;
        class_269 class_269Var;
        String[] split = str.split("\\(|\\)");
        if (split.length == 2) {
            strArr = split;
            strArr2 = split;
        } else if (split.length == 1 && str.endsWith("()")) {
            strArr = split;
            strArr2 = split;
        } else {
            if (split.length <= 2 || !str.contains("regex:")) {
                throw new ExceptionProxy("Invalid template.");
            }
            String[] strArr3 = {str.substring(0, str.lastIndexOf(40)), str.substring(str.lastIndexOf(40) + 1, str.lastIndexOf(41))};
            strArr = strArr3;
            strArr2 = strArr3;
        }
        if (strArr.length == 1) {
            this.field_932 = "";
        } else {
            this.field_932 = class_268.method_1190(strArr2[1]);
        }
        String str2 = strArr2[0];
        String[] split2 = str2.split("\\s+");
        if (split2 != null && split2.length != 0) {
            this.field_935 = class_268.method_1196(split2[split2.length - 1]);
            if (split2.length > 1 && !class_268.method_1187(split2[split2.length - 2]) && !class_268.method_1191(split2[split2.length - 2])) {
                this.field_931 = class_268.method_1198(split2[split2.length - 2]);
                class_269Var = this;
            } else {
                this.field_931 = ".*";
                class_269Var = this;
            }
            class_269Var.field_936 = class_268.method_1192(str2);
            if (class_268.method_1191(split2[0])) {
                this.field_933 = class_268.method_1198(split2[0].substring(1));
                this.field_933 = 'L' + this.field_933.replaceAll("\\\\\\.", "/") + ';';
                return;
            } else {
                this.field_933 = null;
                return;
            }
        }
        throw new ExceptionProxy("Invalid template.");
    }

    public boolean method_1202(class_591 class_591Var) {
        if (class_268.method_1188(class_591Var, this.field_936) && class_591Var.method_198().matches(this.field_935) && class_591Var.method_2057().toString().matches(this.field_931) && class_268.method_1199(class_591Var.method_1964(), this.field_932)) {
            return this.field_933 == null || class_268.method_1194(class_591Var.method_908(), this.field_933);
        }
        return false;
    }

    public boolean method_1204() {
        return this.field_934;
    }

    public class_269(String str, boolean z) {
        method_1201(str);
        this.field_934 = z;
    }
}
