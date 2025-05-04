package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_170;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_412 {
    public static Map field_1274 = new HashMap();
    public static List field_1275 = new Vector();

    public static void method_1573(class_170 class_170Var) {
        field_1275.remove(class_170Var);
    }

    public static void method_1572(class_170 class_170Var) {
        field_1275.add(class_170Var);
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:2:0x0007 */
    public static void method_1571(String str) {
        Iterator it = field_1275.iterator();
        while (it.hasNext()) {
            ((class_170) it.next()).method_146(str);
        }
    }

    public static class_225[] method_1575() {
        return (class_225[]) field_1274.values().toArray(new class_225[field_1274.values().size()]);
    }

    public static class_225 method_1574(String str) {
        class_225 class_225Var = (class_225) field_1274.get(str);
        if (class_225Var != null) {
            return class_225Var;
        }
        class_225 class_225Var2 = new class_225(str);
        field_1274.put(str, class_225Var2);
        method_1571(str);
        return class_225Var2;
    }
}
