package com.allatori.ant;

import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_505 {
    public final class_363 field_1968;
    public boolean field_1967 = false;
    public Vector field_1966 = new Vector();

    public void method_1856(String str, boolean z, String str2) {
        this.field_1966.add(new class_423(this, str.replaceAll("\\.", "\\\\.").replaceAll("\\*", ".*"), z, str2));
    }

    public void method_1858(boolean z) {
        this.field_1967 = z;
    }

    public String method_1857(String str) {
        str.toLowerCase(Locale.ENGLISH);
        Iterator it = this.field_1966.iterator();
        while (it.hasNext()) {
            class_423 class_423Var = (class_423) it.next();
            if (str.matches(class_423.method_1585(class_423Var))) {
                return class_423.method_1584(class_423Var);
            }
        }
        return "UTF-8";
    }

    public boolean method_1855(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        if (lowerCase.endsWith(".jar") || lowerCase.endsWith(".class") || lowerCase.endsWith(".jks") || lowerCase.endsWith(".ttf") || lowerCase.endsWith(".png") || lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".bmp") || lowerCase.endsWith(".svg") || lowerCase.endsWith(".ico")) {
            return false;
        }
        Iterator it = this.field_1966.iterator();
        while (it.hasNext()) {
            class_423 class_423Var = (class_423) it.next();
            if (str.matches(class_423.method_1585(class_423Var))) {
                return class_423.method_1583(class_423Var);
            }
        }
        return false;
    }

    public boolean method_1854() {
        return this.field_1967;
    }

    public class_505(class_363 class_363Var) {
        this.field_1968 = class_363Var;
    }
}
