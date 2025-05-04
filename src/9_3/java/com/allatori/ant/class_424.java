package com.allatori.ant;

import com.allatori.commons.AllatoriLogger;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_424 {
    public Vector field_1670;
    public class_606 field_1673;
    public static final String field_1677 = "-=404=-";
    public static final Vector field_1676 = new Vector();
    public static final Set field_1675 = new class_214();
    public Hashtable field_1672 = new Hashtable();
    public Set field_1674 = new TreeSet();
    public Hashtable field_1671 = new Hashtable();

    public Vector method_1587() {
        return this.field_1670;
    }

    public void method_1588(class_202 class_202Var) {
        method_1595(class_202Var.method_546(), class_202Var);
        String[] method_643 = class_202Var.method_643();
        int length = method_643.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            int i3 = i2 - 1;
            method_1595(method_643[i2], class_202Var);
            i = i3;
            i2 = i3;
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:2:0x0015 */
    public void method_1598(class_202 class_202Var) {
        Set method_1603 = method_1603(class_202Var);
        Set method_1601 = method_1601(class_202Var);
        Set method_1593 = method_1593(method_1601);
        Iterator it = method_1597(method_1603, method_1593).iterator();
        while (it.hasNext()) {
            this.field_1674.add(new StringBuilder().insert(0, class_202Var.method_198()).append("&").append(it.next()).toString());
        }
        method_1594(method_1601, method_1593);
    }

    public boolean method_1599(String str, String str2, String str3) {
        return this.field_1674.contains(new StringBuilder().insert(0, str).append("&").append(str2).append("&").append(str3).toString());
    }

    public Set method_1593(Set set) {
        if (set.contains("-=404=-")) {
            return field_1675;
        }
        TreeSet treeSet = new TreeSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (this.field_1673.method_2102(str) == null) {
                try {
                    Method[] declaredMethods = Class.forName(str, false, this.field_1673.method_2103()).getDeclaredMethods();
                    for (int length = declaredMethods.length - 1; length >= 0; length--) {
                        Method method = declaredMethods[length];
                        if (method_1586(method)) {
                            treeSet.add(method.getName() + "&" + class_212.method_1031(method));
                        }
                    }
                } catch (ClassNotFoundException e) {
                } catch (NoClassDefFoundError e2) {
                    String message = e2.getMessage();
                    if (message.length() > 0) {
                        String replace = message.replace('/', '.');
                        if (!this.field_1671.containsKey(replace)) {
                            this.field_1671.put(replace, "");
                            AllatoriLogger.method_681(new StringBuilder().insert(0, "Class '").append(replace).append("' cannot be found.").toString());
                        }
                    }
                } catch (VerifyError e3) {
                    AllatoriLogger.method_681(new StringBuilder().insert(0, "Cannot read class. Possible JVM compile and runtime versions mismatch: ").append(e3.getMessage()).toString());
                }
            } else if (class_544.method_1927().method_101(this.field_1673, this.field_1673.method_2102(str))) {
                class_557[] method_904 = this.field_1673.method_2102(str).method_904();
                int length2 = method_904.length - 1;
                int i = length2;
                int i2 = length2;
                while (i >= 0) {
                    class_557 class_557Var = method_904[i2];
                    if (!class_557Var.method_424() && !class_557Var.method_1125()) {
                        treeSet.add(new StringBuilder().insert(0, class_557Var.method_464()).append("&").append(class_557Var.method_546()).toString());
                    }
                    int i3 = i2 - 1;
                    i = i3;
                    i2 = i3;
                }
            }
        }
        return treeSet;
    }

    public boolean method_1590(class_557 class_557Var) {
        return (class_557Var.method_424() || class_557Var.method_1125()) ? false : true;
    }

    public void method_1592() {
        Hashtable hashtable = new Hashtable();
        int i = 0;
        int i2 = 0;
        while (i < this.field_1670.size()) {
            class_202 class_202Var = (class_202) this.field_1670.get(i2);
            hashtable.put(class_202Var, "");
            Vector method_1589 = method_1589(class_202Var.method_198());
            int i3 = 0;
            int i4 = 0;
            while (i3 < method_1589.size()) {
                if (hashtable.containsKey((class_202) method_1589.get(i4))) {
                    AllatoriLogger.method_678("Incorrect classes order");
                }
                int i5 = i4 + 1;
                i3 = i5;
                i4 = i5;
            }
            int i6 = i2 + 1;
            i = i6;
            i2 = i6;
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:13:0x0036 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0005 */
    public void method_1594(Set set, Set set2) {
        Iterator it = set.iterator();
        while (true) {
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!"-=404=-".equals(str)) {
                    class_202 method_2102 = this.field_1673.method_2102(str);
                    if (method_2102 != null && method_2102.method_1108()) {
                        Iterator it2 = method_1597(method_1603(method_2102), set2).iterator();
                        while (it2.hasNext()) {
                            this.field_1674.add(new StringBuilder().insert(0, method_2102.method_198()).append("&").append(it2.next()).toString());
                        }
                    }
                }
            }
            return;
        }
    }

    public boolean method_1586(Method method) {
        if (!Modifier.isPrivate(method.getModifiers()) && !Modifier.isStatic(method.getModifiers())) {
            return true;
        }
        return false;
    }

    public Set method_1597(Set set, Set set2) {
        TreeSet treeSet = new TreeSet();
        Set set3 = set.size() < set2.size() ? set : set2;
        if (set.size() >= set2.size()) {
            set2 = set;
        }
        for (Object obj : set3) {
            if (set2.contains(obj)) {
                treeSet.add(obj);
            }
        }
        return treeSet;
    }

    public class_424(class_606 class_606Var) {
        this.field_1673 = class_606Var;
    }

    public void method_1602(class_202 class_202Var) {
        this.field_1670.remove(class_202Var);
        this.field_1670.add(0, class_202Var);
        class_202 method_2102 = this.field_1673.method_2102(class_202Var.method_546());
        if (method_2102 != null) {
            method_1602(method_2102);
        }
        String[] method_643 = class_202Var.method_643();
        int length = method_643.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            class_202 method_21022 = this.field_1673.method_2102(method_643[i2]);
            if (method_21022 != null) {
                method_1602(method_21022);
            }
            int i3 = i2 - 1;
            i = i3;
            i2 = i3;
        }
    }

    public Set method_1601(class_202 class_202Var) {
        TreeSet treeSet = new TreeSet();
        method_1600(treeSet, class_202Var.method_198());
        return treeSet;
    }

    public void method_1600(Set set, String str) {
        set.add(str);
        class_202 method_2102 = this.field_1673.method_2102(str);
        if (method_2102 != null) {
            method_1600(set, method_2102.method_546());
            String[] method_643 = method_2102.method_643();
            int length = method_643.length - 1;
            int i = length;
            int i2 = length;
            while (i >= 0) {
                int i3 = i2 - 1;
                method_1600(set, method_643[i2]);
                i = i3;
                i2 = i3;
            }
            return;
        }
        try {
            Class<?> cls = Class.forName(str, false, this.field_1673.method_2103());
            if (cls.getSuperclass() != null) {
                method_1600(set, cls.getSuperclass().getName());
            }
            Class<?>[] interfaces = cls.getInterfaces();
            int length2 = interfaces.length - 1;
            while (length2 >= 0) {
                int i4 = length2 - 1;
                method_1600(set, interfaces[length2].getName());
                length2 = i4;
            }
        } catch (Exception e) {
            set.add("-=404=-");
            if (this.field_1671.containsKey(str)) {
                return;
            }
            this.field_1671.put(str, "");
            AllatoriLogger.method_681(new StringBuilder().insert(0, "Class '").append(str).append("' cannot be found.").toString());
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:2:0x0007 */
    public void method_1596() {
        Iterator method_2108 = this.field_1673.method_2108();
        while (method_2108.hasNext()) {
            class_202 class_202Var = (class_202) method_2108.next();
            method_1588(class_202Var);
            method_1598(class_202Var);
        }
        if (this.field_1671.size() > 0) {
            AllatoriLogger.method_681("Some classes weren't found. It may result in weaker obfuscation. Add needed jars to the 'classpath' element of the configuration file.");
        }
        method_1591();
    }

    public Vector method_1589(String str) {
        Vector vector = (Vector) this.field_1672.get(str);
        return vector != null ? vector : field_1676;
    }

    public Set method_1603(class_202 class_202Var) {
        TreeSet treeSet = new TreeSet();
        class_557[] method_904 = class_202Var.method_904();
        int length = method_904.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            class_557 class_557Var = method_904[i2];
            if (method_1590(class_557Var)) {
                treeSet.add(class_557Var.method_464() + "&" + class_557Var.method_546());
            }
            int i3 = i2 - 1;
            i = i3;
            i2 = i3;
        }
        return treeSet;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:2:0x000c */
    public void method_1591() {
        Vector vector = new Vector();
        Iterator method_2108 = this.field_1673.method_2108();
        while (method_2108.hasNext()) {
            vector.add(method_2108.next());
        }
        Collections.sort(vector, new class_514(this));
        this.field_1670 = new Vector();
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            class_202 class_202Var = (class_202) it.next();
            if (method_1589(class_202Var.method_198()).size() == 0) {
                method_1602(class_202Var);
            }
        }
        Collections.sort(this.field_1670, new class_510(this));
        method_1592();
    }

    public void method_1595(String str, class_202 class_202Var) {
        if (this.field_1673.method_2102(str) == null) {
            return;
        }
        Vector vector = (Vector) this.field_1672.get(str);
        if (vector == null) {
            vector = new Vector();
        }
        vector.add(class_202Var);
        this.field_1672.put(str, vector);
    }
}
