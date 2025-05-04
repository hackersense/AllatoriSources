package com.allatori.ant;

import java.util.Iterator;
import java.util.Vector;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_273 {
    public final class_544 field_943;
    public boolean field_942 = false;
    public Vector field_944 = new Vector();

    public class_273(class_544 class_544Var) {
        this.field_943 = class_544Var;
    }

    public void method_1209(class_169 class_169Var, String str, String str2) {
        this.field_942 = true;
        this.field_944.add(new class_425(this, class_169Var, str.replaceAll("\\.", "\\\\.").replaceAll("\\*", ".*"), str2.replaceAll("\\.", "\\\\.").replaceAll("\\*", ".*")));
    }

    public boolean method_1210(class_606 class_606Var, class_202 class_202Var, class_591 class_591Var, String str, String str2) {
        if (class_606Var == null || str == null || str2 == null) {
            return false;
        }
        if (!str2.startsWith("AllatoriDecryptString") && !"<init>".equals(str2) && !"<clinit>".equals(str2) && this.field_944.size() != 0) {
            Iterator it = this.field_944.iterator();
            while (it.hasNext()) {
                class_425 class_425Var = (class_425) it.next();
                if (class_425Var.field_1678.field_708.method_685(class_606Var, class_202Var) && class_425Var.field_1678.field_708.method_686(class_591Var) && str.matches(class_425Var.field_1679) && str2.matches(class_425Var.field_1681)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public boolean method_1208() {
        return this.field_942;
    }
}
