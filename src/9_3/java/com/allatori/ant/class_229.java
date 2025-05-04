package com.allatori.ant;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_229 {
    public Map field_835 = new HashMap();

    public class_491[] method_1066(class_337 class_337Var) {
        Set set = (Set) this.field_835.get(class_337Var);
        if (set == null) {
            return new class_491[0];
        }
        return (class_491[]) set.toArray(new class_491[set.size()]);
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0011 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:5:0x002d */
    public class_229(class_591 class_591Var) {
        class_135[] method_2069 = class_591Var.method_2069();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i < method_2069.length) {
                class_491 class_491Var = new class_491(method_2069[i2].method_646(), method_2069[i2].method_45());
                class_337 method_415 = method_2069[i2].method_415();
                while (true) {
                    class_337 class_337Var = method_415;
                    if (method_415 != method_2069[i2].method_419().method_415()) {
                        Set set = (Set) this.field_835.get(class_337Var);
                        if (set == null) {
                            set = new HashSet();
                            this.field_835.put(class_337Var, set);
                        }
                        set.add(class_491Var);
                        method_415 = class_337Var.method_415();
                    }
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }
}
