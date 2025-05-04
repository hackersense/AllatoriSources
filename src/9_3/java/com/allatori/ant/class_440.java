package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;
import com.allatori.interfaces.unmapped.class_241;
import com.allatori.interfaces.unmapped.class_449;
import com.allatori.interfaces.unmapped.class_560;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeSet;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_440 extends class_250 implements Cloneable, class_241, Comparable {
    public static final byte field_1697 = 1;
    public static boolean field_1703 = false;
    public static class_449 field_1711 = new class_545();
    public static final byte field_1715 = 2;
    public static char field_1718 = 0;
    public static final byte field_1719 = 3;
    public boolean field_1696;
    public boolean field_1698;
    public boolean field_1699;
    public class_78[] field_1700;
    public int field_1701;
    public class_560 field_1702;
    public int field_1704;
    public String field_1705;
    public int field_1706;
    public String field_1707;
    public byte field_1708;
    public boolean field_1709;
    public String field_1710;
    public class_160[] field_1712;
    public String field_1713;
    public class_499 field_1714;
    public String[] field_1716;
    public class_557[] field_1717;
    public int field_1720;
    public String field_1721;
    public class_261[] field_1722;
    public int[] field_1723;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int method_183() {
        return this.field_1704;
    }

    public void method_461(int i) {
        this.field_1701 = i;
    }

    public class_160[] method_906() {
        return this.field_1712;
    }

    public class_78[] method_1560() {
        if (this.field_1698) {
            class_160[] method_906 = method_906();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            int i2 = 0;
            while (i < method_906.length) {
                class_160 class_160Var = method_906[i2];
                if (class_160Var instanceof class_515) {
                    class_515 class_515Var = (class_515) class_160Var;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < class_515Var.method_1560().length) {
                        int i5 = i4 + 1;
                        arrayList.add(class_515Var.method_1560()[i4]);
                        i3 = i5;
                        i4 = i5;
                    }
                }
                int i6 = i2 + 1;
                i = i6;
                i2 = i6;
            }
            this.field_1700 = (class_78[]) arrayList.toArray(new class_78[arrayList.size()]);
            this.field_1698 = false;
        }
        return this.field_1700;
    }

    public class_440(int i, int i2, String str, int i3, int i4, int i5, class_499 class_499Var, int[] iArr, class_261[] class_261VarArr, class_557[] class_557VarArr, class_160[] class_160VarArr) {
        this(i, i2, str, i3, i4, i5, class_499Var, iArr, class_261VarArr, class_557VarArr, class_160VarArr, (byte) 1);
    }

    public String[] method_643() {
        return this.field_1716;
    }

    public void method_1056(int[] iArr) {
        this.field_1723 = iArr;
    }

    public class_261[] method_898() {
        return this.field_1722;
    }

    public static final void method_1625(String str) {
        if (field_1703) {
            System.out.println(str);
        }
    }

    public void method_900(String str) {
        this.field_1707 = str;
    }

    public class_499 method_502() {
        return this.field_1714;
    }

    public int method_927() {
        return this.field_1706;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:11:0x0057 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:22:0x00a7 */
    public class_440(int i, int i2, String str, int i3, int i4, int i5, class_499 class_499Var, int[] iArr, class_261[] class_261VarArr, class_557[] class_557VarArr, class_160[] class_160VarArr, byte b) {
        class_440 class_440Var;
        int i6;
        class_440 class_440Var2;
        this.field_1707 = "<Unknown>";
        this.field_1708 = (byte) 1;
        this.field_1709 = false;
        this.field_1696 = false;
        this.field_1699 = false;
        this.field_1698 = true;
        this.field_1702 = class_22.method_99();
        iArr = iArr == null ? new int[0] : iArr;
        class_160VarArr = class_160VarArr == null ? new class_160[0] : class_160VarArr;
        class_261VarArr = class_261VarArr == null ? new class_261[0] : class_261VarArr;
        class_557VarArr = class_557VarArr == null ? new class_557[0] : class_557VarArr;
        this.field_1701 = i;
        this.field_1706 = i2;
        this.field_1705 = str;
        this.field_1704 = i3;
        this.field_1720 = i4;
        this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE = i5;
        this.field_1714 = class_499Var;
        this.field_1723 = iArr;
        this.field_1722 = class_261VarArr;
        this.field_1717 = class_557VarArr;
        this.field_1712 = class_160VarArr;
        this.field_1698 = true;
        this.field_1708 = b;
        int i7 = 0;
        while (true) {
            int i8 = i7;
            if (i7 >= class_160VarArr.length) {
                class_440Var = this;
                break;
            } else if (!(class_160VarArr[i8] instanceof class_599)) {
                i7 = i8 + 1;
            } else {
                this.field_1707 = ((class_599) class_160VarArr[i8]).method_464();
                class_440Var = this;
                break;
            }
        }
        class_440Var.field_1713 = class_499Var.method_1845(i, (byte) 7);
        this.field_1713 = class_204.method_945(this.field_1713, false);
        int lastIndexOf = this.field_1713.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.field_1710 = this.field_1713.substring(0, lastIndexOf);
            i6 = i2;
        } else {
            this.field_1710 = "";
            i6 = i2;
        }
        if (i6 <= 0) {
            this.field_1721 = "java.lang.Object";
            class_440Var2 = this;
        } else {
            this.field_1721 = class_499Var.method_1845(i2, (byte) 7);
            this.field_1721 = class_204.method_945(this.field_1721, false);
            class_440Var2 = this;
        }
        class_440Var2.field_1716 = new String[iArr.length];
        int i9 = 0;
        while (true) {
            int i10 = i9;
            if (i9 < iArr.length) {
                i9 = i10 + 1;
                this.field_1716[i10] = class_204.method_945(class_499Var.method_1845(iArr[i10], (byte) 7), false);
            } else {
                return;
            }
        }
    }

    public void method_1639(String[] strArr) {
        this.field_1716 = strArr;
    }

    @Override // p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_85(this);
    }

    public int method_928() {
        return this.field_1720;
    }

    public void method_1635(OutputStream outputStream) {
        method_184(new DataOutputStream(outputStream));
    }

    public void method_498(class_499 class_499Var) {
        this.field_1714 = class_499Var;
    }

    public void method_671(String str) {
        this.field_1713 = str;
    }

    public void method_915(int i) {
        this.field_1704 = i;
    }

    public String method_1626() {
        return this.field_1710;
    }

    public void method_901(class_557[] class_557VarArr) {
        this.field_1717 = class_557VarArr;
    }

    public String method_464() {
        return this.field_1705;
    }

    public String method_546() {
        return this.field_1713;
    }

    public String method_1631() {
        return this.field_1721;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:16:0x007c */
    public void method_184(DataOutputStream dataOutputStream) {
        int i = 0;
        dataOutputStream.writeInt(-889275714);
        dataOutputStream.writeShort(this.field_1720);
        dataOutputStream.writeShort(this.field_1704);
        this.field_1714.method_184(dataOutputStream);
        dataOutputStream.writeShort(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE);
        dataOutputStream.writeShort(this.field_1701);
        dataOutputStream.writeShort(this.field_1706);
        dataOutputStream.writeShort(this.field_1723.length);
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.field_1723.length) {
            int i4 = i3 + 1;
            dataOutputStream.writeShort(this.field_1723[i3]);
            i2 = i4;
            i3 = i4;
        }
        dataOutputStream.writeShort(this.field_1722.length);
        int i5 = 0;
        int i6 = 0;
        while (i5 < this.field_1722.length) {
            int i7 = i6 + 1;
            this.field_1722[i6].method_184(dataOutputStream);
            i5 = i7;
            i6 = i7;
        }
        dataOutputStream.writeShort(this.field_1717.length);
        int i8 = 0;
        int i9 = 0;
        while (i8 < this.field_1717.length) {
            int i10 = i9 + 1;
            this.field_1717[i9].method_184(dataOutputStream);
            i8 = i10;
            i9 = i10;
        }
        if (this.field_1712 != null) {
            dataOutputStream.writeShort(this.field_1712.length);
            while (true) {
                int i11 = i;
                if (i >= this.field_1712.length) {
                    break;
                }
                i = i11 + 1;
                this.field_1712[i11].method_184(dataOutputStream);
            }
        } else {
            dataOutputStream.writeShort(0);
        }
        dataOutputStream.flush();
    }

    public class_557[] method_904() {
        return this.field_1717;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0003 */
    public class_557 method_1633(Method method) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i >= this.field_1717.length) {
                return null;
            }
            class_557 class_557Var = this.field_1717[i2];
            if (method.getName().equals(class_557Var.method_464()) && method.getModifiers() == class_557Var.method_47() && class_212.method_1031(method).equals(class_557Var.method_546())) {
                return class_557Var;
            }
            i = i2 + 1;
        }
    }

    public void method_1628(String str) {
        this.field_1705 = str;
    }

    public void method_1563(class_160[] class_160VarArr) {
        this.field_1712 = class_160VarArr;
    }

    public void method_910(int i) {
        this.field_1720 = i;
    }

    public int[] method_434() {
        return this.field_1723;
    }

    public byte[] method_429() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            try {
                method_184(dataOutputStream);
            } finally {
                try {
                    dataOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            try {
                dataOutputStream.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public void method_1622(File file) {
        DataOutputStream dataOutputStream;
        String parent = file.getParent();
        if (parent != null) {
            new File(parent).mkdirs();
        }
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                method_184(dataOutputStream);
                if (dataOutputStream == null) {
                    return;
                }
                dataOutputStream.close();
            } catch (Throwable th) {
                th = th;
                if (dataOutputStream != null) {
                    dataOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream = null;
        }
    }

    public void method_1637(class_261[] class_261VarArr) {
        this.field_1722 = class_261VarArr;
    }

    public int method_920() {
        return this.field_1701;
    }

    public void method_850(String str) {
        method_1622(new File(str));
    }

    public String method_198() {
        return this.field_1707;
    }

    static {
        field_1703 = false;
        field_1718 = '/';
        field_1703 = Boolean.getBoolean("JavaClass.debug");
        String property = System.getProperty("file.separator");
        if (property == null) {
            return;
        }
        try {
            field_1718 = property.charAt(0);
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    public void method_912(String str) {
        this.field_1721 = str;
    }

    public class_440 method_642() {
        if ("java.lang.Object".equals(method_546())) {
            return null;
        }
        return this.field_1702.method_92(method_1631());
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:2:0x0011 */
    public static final String method_1640(Object obj) {
        StringTokenizer stringTokenizer = new StringTokenizer(obj.toString(), "\n");
        StringBuffer stringBuffer = new StringBuffer();
        while (stringTokenizer.hasMoreTokens()) {
            stringBuffer.append("\t").append(stringTokenizer.nextToken()).append("\n");
        }
        return stringBuffer.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return method_546().compareTo(((class_440) obj).method_546());
    }

    public final void method_97() {
        if (!this.field_1699) {
            int i = 0;
            int i2 = 0;
            while (i < this.field_1712.length) {
                if (this.field_1712[i2] instanceof class_121) {
                    class_367[] method_626 = ((class_121) this.field_1712[i2]).method_626();
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < method_626.length) {
                        if (class_204.method_957(this.field_1714.method_1845(method_626[i4].method_183(), (byte) 7)).equals(method_546())) {
                            this.field_1696 = true;
                            if (method_626[i4].method_433() == 0) {
                                this.field_1709 = true;
                            }
                        }
                        int i5 = i4 + 1;
                        i3 = i5;
                        i4 = i5;
                    }
                }
                int i6 = i2 + 1;
                i = i6;
                i2 = i6;
            }
            this.field_1699 = true;
        }
    }

    public class_560 method_1634() {
        return this.field_1702;
    }

    public final boolean method_1641() {
        return (this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE & 512) == 0;
    }

    public final byte method_619() {
        return this.field_1708;
    }

    public final boolean method_1623() {
        method_97();
        return this.field_1709;
    }

    public static class_449 method_859() {
        return field_1711;
    }

    public void method_853(int i) {
        this.field_1706 = i;
    }

    public final boolean method_1624() {
        return (this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE & 32) != 0;
    }

    public int hashCode() {
        return field_1711.method_162(this);
    }

    public final boolean method_1636(class_440 class_440Var) {
        if (equals(class_440Var)) {
            return true;
        }
        class_440[] method_601 = method_601();
        int i = 0;
        int i2 = 0;
        while (i < method_601.length) {
            if (method_601[i2].equals(class_440Var)) {
                return true;
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        if (class_440Var.method_1108()) {
            return method_1632(class_440Var);
        }
        return false;
    }

    public static void method_861(class_449 class_449Var) {
        field_1711 = class_449Var;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x000a */
    public class_440[] method_1630() {
        String[] method_643 = method_643();
        class_440[] class_440VarArr = new class_440[method_643.length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i >= method_643.length) {
                return class_440VarArr;
            }
            i = i2 + 1;
            class_440VarArr[i2] = this.field_1702.method_92(method_643[i2]);
        }
    }

    public boolean equals(Object obj) {
        return field_1711.method_161(this, obj);
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:8:0x002b */
    public class_440[] method_1638() {
        class_146 class_146Var = new class_146();
        TreeSet treeSet = new TreeSet();
        class_146Var.method_95(this);
        while (!class_146Var.method_424()) {
            class_440 method_642 = class_146Var.method_642();
            class_440 method_6422 = method_642.method_642();
            class_440[] method_1630 = method_642.method_1630();
            if (!method_642.method_1108()) {
                if (method_6422 != null) {
                    class_146Var.method_95(method_6422);
                }
            } else {
                treeSet.add(method_642);
            }
            int i = 0;
            while (true) {
                int i2 = i;
                if (i < method_1630.length) {
                    i = i2 + 1;
                    class_146Var.method_95(method_1630[i2]);
                }
            }
        }
        return (class_440[]) treeSet.toArray(new class_440[treeSet.size()]);
    }

    public boolean method_1632(class_440 class_440Var) {
        if (class_440Var.method_1108()) {
            if (equals(class_440Var)) {
                return true;
            }
            class_440[] method_1638 = method_1638();
            int i = 0;
            int i2 = 0;
            while (i < method_1638.length) {
                if (method_1638[i2].equals(class_440Var)) {
                    return true;
                }
                int i3 = i2 + 1;
                i = i3;
                i2 = i3;
            }
            return false;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, class_440Var.method_546()).append(" is no interface").toString());
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:12:0x0072 */
    public class_440 method_863() {
        int i = 0;
        try {
            class_440 class_440Var = (class_440) clone();
            try {
                class_440Var.field_1714 = this.field_1714.method_502();
                class_440Var.field_1723 = (int[]) this.field_1723.clone();
                class_440Var.field_1716 = (String[]) this.field_1716.clone();
                class_440Var.field_1722 = new class_261[this.field_1722.length];
                int i2 = 0;
                int i3 = 0;
                while (i2 < this.field_1722.length) {
                    int i4 = i3 + 1;
                    class_440Var.field_1722[i3] = this.field_1722[i3].method_1145(class_440Var.field_1714);
                    i2 = i4;
                    i3 = i4;
                }
                class_440Var.field_1717 = new class_557[this.field_1717.length];
                int i5 = 0;
                int i6 = 0;
                while (i5 < this.field_1717.length) {
                    int i7 = i6 + 1;
                    class_440Var.field_1717[i6] = this.field_1717[i6].method_1961(class_440Var.field_1714);
                    i5 = i7;
                    i6 = i7;
                }
                class_440Var.field_1712 = new class_160[this.field_1712.length];
                while (true) {
                    int i8 = i;
                    if (i8 >= this.field_1712.length) {
                        return class_440Var;
                    }
                    i = i8 + 1;
                    class_440Var.field_1712[i8] = this.field_1712[i8].method_187(class_440Var.field_1714);
                }
            } catch (CloneNotSupportedException e) {
                return class_440Var;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    public final boolean method_1629() {
        method_97();
        return this.field_1696;
    }

    public void method_1627(class_560 class_560Var) {
        this.field_1702 = class_560Var;
    }

    public class_440[] method_601() {
        ArrayList arrayList = new ArrayList();
        class_440 method_642 = method_642();
        class_440 class_440Var = method_642;
        class_440 class_440Var2 = method_642;
        while (class_440Var != null) {
            arrayList.add(class_440Var2);
            class_440 method_6422 = class_440Var2.method_642();
            class_440Var = method_6422;
            class_440Var2 = method_6422;
        }
        return (class_440[]) arrayList.toArray(new class_440[arrayList.size()]);
    }
}
