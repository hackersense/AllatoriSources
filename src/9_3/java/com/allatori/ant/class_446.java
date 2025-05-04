package com.allatori.ant;

import java.util.Hashtable;
import java.util.List;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_446 {
    public static final int field_1743 = 1;
    public static final int field_1744 = 1;
    public static final int field_1750 = 2;
    public static final int field_1752 = 0;
    public static final int field_1753 = 0;
    public static final int field_1760 = 100;
    public static final int field_1762 = 1;
    public static final int field_1763 = 0;
    public static final int field_1766 = 101;
    public static final int field_1769 = 3;
    public static final int field_1776 = 0;
    public static final int field_1778 = 1;
    public static final int field_1779 = 1000;
    public String field_1757;
    public final class_544 field_1764;
    public Hashtable field_1745 = new Hashtable();
    public class_460 field_1755 = new class_460(1);
    public class_460 field_1749 = new class_460(0);
    public class_460 field_1759 = new class_460(1);
    public class_460 field_1767 = new class_460(1);
    public class_460 field_1751 = new class_460(0);
    public class_460 field_1774 = new class_460(0);
    public class_460 field_1748 = new class_460(0);
    public String field_1747 = null;
    public boolean field_1765 = false;
    public boolean field_1777 = false;
    public boolean field_1761 = false;
    public boolean field_1742 = true;
    public boolean field_1770 = true;
    public String field_1754 = null;
    public char field_1758 = '\uffff';
    public int field_1772 = 1;
    public boolean field_1773 = false;
    public boolean field_1768 = false;
    public String field_1756 = "";
    public String field_1771 = "";
    public boolean field_1746 = false;
    public String field_1775 = "org.springframework.boot.";

    public int method_1686(class_606 class_606Var, class_202 class_202Var) {
        List method_2015;
        if (!this.field_1768 && class_202Var.method_198().startsWith(this.field_1775)) {
            return 0;
        }
        class_574[] method_908 = class_202Var.method_908();
        int length = method_908.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            class_574 class_574Var = method_908[i2];
            if ("Lcom/allatori/annotations/StringEncryption;".equals(class_574Var.method_2016()) && (method_2015 = class_574Var.method_2015()) != null && method_2015.size() > 0 && ((class_410) method_2015.get(0)).method_1567() != null) {
                if ("enable".equals(((class_410) method_2015.get(0)).method_1567().method_554())) {
                    return 1;
                }
                if ("disable".equals(((class_410) method_2015.get(0)).method_1567().method_554())) {
                    return 0;
                }
                if ("maximum".equals(((class_410) method_2015.get(0)).method_1567().method_554())) {
                    return 2;
                }
                if ("maximum-with-warnings".equals(((class_410) method_2015.get(0)).method_1567().method_554())) {
                    return 3;
                }
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        return this.field_1755.method_1723(class_606Var, class_202Var);
    }

    public class_446(class_544 class_544Var) {
        this.field_1764 = class_544Var;
    }

    public void method_1672(class_169 class_169Var) {
        this.field_1748.method_1724(class_169Var);
    }

    public void method_1697(String str) {
        this.field_1771 = str;
    }

    public void method_1696(class_169 class_169Var) {
        this.field_1749.method_1724(class_169Var);
    }

    public void method_1690(String str) {
        this.field_1756 = str;
    }

    public String method_1679() {
        return this.field_1747;
    }

    public void method_1713(int i) {
        this.field_1772 = i;
    }

    public boolean method_1698(class_606 class_606Var, class_202 class_202Var) {
        return class_606Var != null && this.field_1774.method_1723(class_606Var, class_202Var) > 0;
    }

    public void method_1675(boolean z) {
        this.field_1765 = z;
    }

    public boolean method_1702() {
        return this.field_1765;
    }

    public boolean method_1678() {
        return this.field_1770;
    }

    public int method_1673(class_606 class_606Var, class_202 class_202Var, class_591 class_591Var) {
        List method_2015;
        if (this.field_1777) {
            return 0;
        }
        class_574[] method_908 = class_202Var.method_908();
        int length = method_908.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            class_574 class_574Var = method_908[i2];
            if ("Lcom/allatori/annotations/StringEncryptionType;".equals(class_574Var.method_2016()) && (method_2015 = class_574Var.method_2015()) != null && method_2015.size() > 0 && ((class_410) method_2015.get(0)).method_1567() != null) {
                if ("fast".equals(((class_410) method_2015.get(0)).method_1567().method_554())) {
                    return 0;
                }
                if ("strong".equals(((class_410) method_2015.get(0)).method_1567().method_554())) {
                    return 1;
                }
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        return this.field_1749.method_1722(class_606Var, class_202Var, class_591Var);
    }

    public void method_1711(String str) {
        this.field_1747 = str;
    }

    public String method_1710() {
        return this.field_1756;
    }

    public void method_1688(boolean z) {
        this.field_1777 = z;
    }

    public void method_1692(boolean z) {
        this.field_1768 = z;
    }

    public String method_1677() {
        return this.field_1754;
    }

    public boolean method_1681(class_606 class_606Var, class_202 class_202Var, class_591 class_591Var) {
        List method_2015;
        List method_20152;
        if (class_591Var.method_198().startsWith("Allatori")) {
            return !class_544.method_1937().method_1699();
        }
        class_574[] method_908 = class_591Var.method_908();
        int length = method_908.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            class_574 class_574Var = method_908[i2];
            if ("Lcom/allatori/annotations/ControlFlowObfuscation;".equals(class_574Var.method_2016()) && (method_20152 = class_574Var.method_2015()) != null && method_20152.size() > 0 && ((class_410) method_20152.get(0)).method_1567() != null) {
                if ("enable".equals(((class_410) method_20152.get(0)).method_1567().method_554())) {
                    return true;
                }
                if ("disable".equals(((class_410) method_20152.get(0)).method_1567().method_554())) {
                    return false;
                }
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        class_574[] method_9082 = class_202Var.method_908();
        int length2 = method_9082.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length2) {
            class_574 class_574Var2 = method_9082[i5];
            if ("Lcom/allatori/annotations/ControlFlowObfuscation;".equals(class_574Var2.method_2016()) && (method_2015 = class_574Var2.method_2015()) != null && method_2015.size() > 0 && ((class_410) method_2015.get(0)).method_1567() != null) {
                if ("enable".equals(((class_410) method_2015.get(0)).method_1567().method_554())) {
                    return true;
                }
                if ("disable".equals(((class_410) method_2015.get(0)).method_1567().method_554())) {
                    return false;
                }
            }
            int i6 = i5 + 1;
            i4 = i6;
            i5 = i6;
        }
        return this.field_1767.method_1722(class_606Var, class_202Var, class_591Var) > 0;
    }

    public void method_1684(char c) {
        this.field_1758 = c;
    }

    public boolean method_1706() {
        return this.field_1742;
    }

    public void method_1693(String str) {
        this.field_1754 = str;
    }

    public boolean method_1699() {
        return this.field_1777;
    }

    public void method_1669(boolean z) {
        this.field_1742 = z;
    }

    public boolean method_1703() {
        return this.field_1761;
    }

    public boolean method_1671() {
        return this.field_1768;
    }

    public void method_1687(boolean z) {
        this.field_1761 = z;
    }

    public void method_1694(class_169 class_169Var) {
        this.field_1755.method_1724(class_169Var);
    }

    public void method_1704(boolean z) {
        this.field_1770 = z;
    }

    public char method_1707() {
        return this.field_1758;
    }

    public void method_1705(class_169 class_169Var) {
        this.field_1759.method_1724(class_169Var);
    }

    public boolean method_1709() {
        return this.field_1746;
    }

    public void method_1701(boolean z) {
        this.field_1746 = z;
    }

    public void method_1676(class_169 class_169Var) {
        this.field_1774.method_1724(class_169Var);
    }

    public String method_1683() {
        return this.field_1771;
    }

    public void method_1712(class_169 class_169Var) {
        this.field_1767.method_1724(class_169Var);
    }

    public String method_1674() {
        return this.field_1757;
    }

    public void method_1691(class_169 class_169Var) {
        this.field_1751.method_1724(class_169Var);
    }

    public Hashtable method_1700() {
        return this.field_1745;
    }

    public int method_1682() {
        return this.field_1772;
    }

    public void method_1680(String str) {
        this.field_1757 = str;
    }

    public boolean method_1670() {
        return this.field_1773;
    }

    public void method_1695(boolean z) {
        this.field_1773 = z;
    }

    public int method_1685(class_606 class_606Var, class_202 class_202Var) {
        return this.field_1759.method_1723(class_606Var, class_202Var);
    }

    public boolean method_1689(class_606 class_606Var, class_202 class_202Var) {
        return class_606Var != null && this.field_1751.method_1723(class_606Var, class_202Var) > 0;
    }

    public boolean method_1708(class_606 class_606Var, class_202 class_202Var, class_557 class_557Var) {
        return class_606Var != null && this.field_1748.method_1725(class_606Var, class_202Var, class_557Var) > 0;
    }
}
