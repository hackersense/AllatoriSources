package com.allatori.ant;

import com.allatori.exception.ExceptionProxy;

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_145 {
    public String field_642;
    public String field_643;
    public Vector field_644;
    public boolean field_645;
    public Vector field_646;
    public int field_647;
    public String field_648;
    public String[] field_649;
    public boolean field_650;
    public String field_651;
    public boolean field_652;

    public void method_696(String str) {
        Matcher matcher;
        Matcher matcher2 = Pattern.compile("(.*?(?:class|interface))\\s+(.+?)(?:\\s+extends\\s+(.+?))?(?:\\s+implements\\s+(.+?))?(?:\\s+instanceof\\s+(.+?))?").matcher(str);
        if (matcher2.matches()) {
            String group = matcher2.group(1);
            this.field_647 = class_268.method_1192(group);
            if (!class_268.method_1191(group)) {
                this.field_648 = null;
                matcher = matcher2;
            } else {
                int indexOf = group.indexOf(32);
                if (indexOf == -1) {
                    indexOf = group.length();
                }
                this.field_648 = class_268.method_1198(group.substring(1, indexOf));
                this.field_648 = 'L' + this.field_648.replaceAll("\\\\\\.", "/") + ';';
                matcher = matcher2;
            }
            this.field_643 = class_268.method_1198(matcher.group(2));
            this.field_642 = class_268.method_1198(matcher2.group(3));
            this.field_649 = class_268.method_1195(matcher2.group(4));
            this.field_651 = class_268.method_1198(matcher2.group(5));
            return;
        }
        throw new ExceptionProxy("Invalid template.");
    }

    public boolean method_684() {
        return this.field_646.size() > 0;
    }

    public boolean method_686(class_591 class_591Var) {
        int i = 0;
        int i2 = 0;
        while (i < this.field_644.size()) {
            class_269 class_269Var = (class_269) this.field_644.get(i2);
            if (class_269Var.method_1202(class_591Var)) {
                return !class_269Var.method_1204();
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        return false;
    }

    public boolean method_695() {
        return this.field_645;
    }

    public boolean method_685(class_606 class_606Var, class_202 class_202Var) {
        if (class_268.method_1188(class_202Var, this.field_647) && class_202Var.method_198().matches(this.field_643) && class_202Var.method_546().matches(this.field_642) && class_268.method_1189(class_202Var.method_643(), this.field_649) && class_268.method_1193(class_606Var, class_202Var.method_198(), this.field_651)) {
            return this.field_648 == null || class_268.method_1194(class_202Var.method_908(), this.field_648);
        }
        return false;
    }

    public class_145 method_690() {
        class_145 class_145Var = new class_145();
        class_145Var.field_652 = this.field_652;
        class_145Var.field_645 = this.field_645;
        class_145Var.field_650 = this.field_650;
        class_145Var.field_647 = this.field_647;
        class_145Var.field_643 = this.field_643;
        class_145Var.field_642 = this.field_642;
        class_145Var.field_651 = this.field_651;
        class_145Var.field_649 = this.field_649;
        class_145Var.field_648 = this.field_648;
        return class_145Var;
    }

    public boolean method_688() {
        return this.field_650;
    }

    public boolean method_693() {
        return this.field_644.size() > 0;
    }

    public void method_694(class_269 class_269Var) {
        this.field_644.add(class_269Var);
    }

    public boolean method_691(class_606 class_606Var, class_261 class_261Var) {
        int i = 0;
        int i2 = 0;
        while (i < this.field_646.size()) {
            class_102 class_102Var = (class_102) this.field_646.get(i2);
            if (class_102Var.method_604(class_606Var, class_261Var)) {
                return !class_102Var.method_603();
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        return false;
    }

    public class_145(String str, boolean z, boolean z2, boolean z3) {
        this(str, z, z2);
        this.field_650 = z3;
    }

    public class_145() {
        this.field_650 = false;
        this.field_646 = new Vector();
        this.field_644 = new Vector();
    }

    public class_145(String str, boolean z, boolean z2) {
        this.field_650 = false;
        this.field_646 = new Vector();
        this.field_644 = new Vector();
        this.field_652 = z;
        this.field_645 = z2;
        method_696(str);
    }

    public boolean method_687() {
        return this.field_652;
    }

    public void method_689(class_102 class_102Var) {
        this.field_646.add(class_102Var);
    }

    public boolean method_692(class_557 class_557Var) {
        int i = 0;
        int i2 = 0;
        while (i < this.field_644.size()) {
            class_269 class_269Var = (class_269) this.field_644.get(i2);
            if (class_269Var.method_1203(class_557Var)) {
                return !class_269Var.method_1204();
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        return false;
    }
}
