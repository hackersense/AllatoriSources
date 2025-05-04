package com.allatori.ant;


import com.allatori.commons.AllatoriLogger;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Vector;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_25 {
    public class_606 field_45;
    public class_424 field_48;
    public static final String field_44 = "&";
    public static boolean field_49 = false;
    public static class_386 field_46 = new class_386();
    public class_461 field_43 = new class_461(this, null);
    public class_108 field_47 = new class_108();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String method_140(class_202 class_202Var, String str, String str2) {
        String method_1543 = class_352.method_1430(class_461.method_1731(this.field_43)).method_1543(new StringBuilder().insert(0, class_202Var.method_198()).append("&").append(str).append("&").append(str2).toString());
        if (method_1543 != null) {
            return method_1543;
        }
        Vector method_1589 = this.field_48.method_1589(class_202Var.method_198());
        int size = method_1589.size() - 1;
        int i = size;
        int i2 = size;
        while (i >= 0) {
            String method_140 = method_140((class_202) method_1589.get(i2), str, str2);
            if (method_140 != null) {
                return method_140;
            }
            int i3 = i2 - 1;
            i = i3;
            i2 = i3;
        }
        return null;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:24:0x00ca */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:44:0x01a4 */
    public void method_117(class_202 class_202Var) {
        String method_1543;
        String method_15432;
        if (!method_136(class_202Var) && class_544.method_1924().method_1468().method_1222(this.field_45, class_202Var)) {
            return;
        }
        String method_198 = class_202Var.method_198();
        if (!(class_267.method_1185(class_461.method_1732(this.field_43)).method_1547(method_198) && !method_198.equals(class_267.method_1185(class_461.method_1732(this.field_43)).method_1543(method_198)))) {
            class_267.method_1185(class_461.method_1732(this.field_43)).method_1546(method_198, method_198);
            class_267.method_1183(class_461.method_1732(this.field_43)).method_1546(method_198, method_198);
            String method_2034 = class_587.method_2034(method_198);
            if (class_544.method_1924().method_1483() && (method_15432 = class_374.method_1498(class_461.method_1729(this.field_43)).method_1543(method_2034)) != null && !method_15432.equals(method_2034)) {
                if (field_46.method_1543(method_15432) == null) {
                    AllatoriLogger.method_681(new StringBuilder().insert(0, "Package '").append(method_15432).append("' should be un-renamed.").toString());
                }
                field_46.method_1546(method_15432, method_2034);
            }
            class_374.method_1498(class_461.method_1729(this.field_43)).method_1546(method_2034, method_2034);
            class_374.method_1499(class_461.method_1729(this.field_43)).method_1546(method_2034, "&");
            while (true) {
                String str = method_2034;
                if (method_2034.lastIndexOf(46) > 0) {
                    method_2034 = str.substring(0, str.lastIndexOf(46));
                    if (class_544.method_1924().method_1483() && (method_1543 = class_374.method_1498(class_461.method_1729(this.field_43)).method_1543(method_2034)) != null && !method_1543.equals(method_2034)) {
                        if (field_46.method_1543(method_1543) == null) {
                            AllatoriLogger.method_681(new StringBuilder().insert(0, "Package '").append(method_1543).append("' should be un-renamed.").toString());
                        }
                        field_46.method_1546(method_1543, method_2034);
                    }
                    class_374.method_1498(class_461.method_1729(this.field_43)).method_1546(method_2034, method_2034);
                    class_374.method_1499(class_461.method_1729(this.field_43)).method_1546(method_2034, "&");
                } else {
                    return;
                }
            }
        } else {
            String method_20342 = class_587.method_2034(method_198);
            String method_20343 = class_587.method_2034(class_267.method_1185(class_461.method_1732(this.field_43)).method_1543(method_198));
            if ((!class_544.method_1924().method_1486() || !method_20343.equals(class_544.method_1924().method_1481())) && new StringTokenizer(method_20342, ".").countTokens() == new StringTokenizer(method_20343, ".").countTokens()) {
                class_374.method_1498(class_461.method_1729(this.field_43)).method_1546(method_20342, method_20343);
                class_374.method_1499(class_461.method_1729(this.field_43)).method_1546(method_20343, "&");
                while (true) {
                    String str2 = method_20342;
                    if (method_20342.lastIndexOf(46) > 0) {
                        method_20342 = str2.substring(0, str2.lastIndexOf(46));
                        method_20343 = method_20343.substring(0, method_20343.lastIndexOf(46));
                        class_374.method_1498(class_461.method_1729(this.field_43)).method_1546(method_20342, method_20343);
                        class_374.method_1499(class_461.method_1729(this.field_43)).method_1546(method_20343, "&");
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:19:0x0122 */
    public void method_104(class_202 class_202Var, String str, String str2, String str3, boolean z, boolean z2) {
        if (z) {
            class_202 class_202Var2 = class_202Var;
            do {
                class_202Var2 = this.field_45.method_2102(class_202Var2.method_546());
                if (class_202Var2 != null) {
                    class_352.method_1430(class_461.method_1731(this.field_43)).method_1546(new StringBuilder().insert(0, class_202Var2.method_198()).append("&").append(str).append("&").append(str3).toString(), str2);
                    if (class_202Var2.method_1109()) {
                        class_352.method_1434(class_461.method_1731(this.field_43)).method_1546(new StringBuilder().insert(0, class_202Var2.method_198()).append("&").append(str).toString(), str2);
                    }
                    class_352.method_1431(class_461.method_1731(this.field_43)).method_1546(new StringBuilder().insert(0, class_202Var2.method_198()).append("&").append(str2).append("&").append(class_587.method_2030(str3)).toString(), "&");
                }
            } while (class_202Var2 != null);
        }
        Vector method_1589 = this.field_48.method_1589(class_202Var.method_198());
        int size = method_1589.size() - 1;
        int i = size;
        int i2 = size;
        while (i >= 0) {
            class_202 class_202Var3 = (class_202) method_1589.get(i2);
            if (z2 && class_544.method_1924().method_1486() && !class_587.method_2034(class_202Var.method_198()).equals(class_587.method_2034(class_202Var3.method_198()))) {
                class_352.method_1431(class_461.method_1731(this.field_43)).method_1546(new StringBuilder().insert(0, class_202Var3.method_198()).append("&").append(str2).append("&").append(class_587.method_2030(str3)).toString(), "&");
            } else {
                class_352.method_1430(class_461.method_1731(this.field_43)).method_1546(new StringBuilder().insert(0, class_202Var3.method_198()).append("&").append(str).append("&").append(str3).toString(), str2);
                if (class_202Var3.method_1109()) {
                    class_352.method_1434(class_461.method_1731(this.field_43)).method_1546(new StringBuilder().insert(0, class_202Var3.method_198()).append("&").append(str).toString(), str2);
                }
                class_352.method_1431(class_461.method_1731(this.field_43)).method_1546(new StringBuilder().insert(0, class_202Var3.method_198()).append("&").append(str2).append("&").append(class_587.method_2030(str3)).toString(), "&");
            }
            int i3 = i2 - 1;
            method_104(class_202Var3, str, str2, str3, z, z2);
            i = i3;
            i2 = i3;
        }
    }

    public void method_134(class_202 class_202Var) {
        String method_198 = class_202Var.method_198();
        class_261[] method_898 = class_202Var.method_898();
        int length = method_898.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            class_261 class_261Var = method_898[i2];
            if (!class_544.method_1924().method_1468().method_1223(this.field_45, class_202Var, class_261Var)) {
                String method_464 = class_261Var.method_464();
                String method_546 = class_261Var.method_546();
                if (class_544.method_1924().method_1466().method_1283()) {
                    class_422.method_1582(method_464);
                }
                if (!class_546.method_1942(class_461.method_1730(this.field_43)).method_1547(new StringBuilder().insert(0, method_198).append("&").append(method_464).append("&").append(method_546).toString())) {
                    class_546.method_1942(class_461.method_1730(this.field_43)).method_1546(new StringBuilder().insert(0, method_198).append("&").append(method_464).append("&").append(method_546).toString(), method_464);
                    class_546.method_1940(class_461.method_1730(this.field_43)).method_1546(new StringBuilder().insert(0, method_198).append("&").append(method_464).append("&").append(method_546).toString(), "&");
                    if (!class_261Var.method_424()) {
                        method_113(class_202Var, method_464, method_464, method_546);
                    }
                } else if (!class_261Var.method_424()) {
                    method_113(class_202Var, method_464, class_546.method_1942(class_461.method_1730(this.field_43)).method_1543(new StringBuilder().insert(0, method_198).append("&").append(method_464).append("&").append(method_546).toString()), method_546);
                }
            }
            int i3 = i2 - 1;
            i = i3;
            i2 = i3;
        }
        class_202 class_202Var2 = class_202Var;
        do {
            String method_5462 = class_202Var2.method_546();
            class_202Var2 = this.field_45.method_2102(method_5462);
            if (class_202Var2 != null) {
                class_261[] method_8982 = class_202Var2.method_898();
                int length2 = method_8982.length - 1;
                int i4 = length2;
                int i5 = length2;
                while (i4 >= 0) {
                    class_261 class_261Var2 = method_8982[i5];
                    if (!class_544.method_1924().method_1468().method_1223(this.field_45, class_202Var, class_261Var2)) {
                        String method_4642 = class_261Var2.method_464();
                        String method_5463 = class_261Var2.method_546();
                        if (class_544.method_1924().method_1466().method_1283()) {
                            class_422.method_1582(method_4642);
                        }
                        if (class_546.method_1942(class_461.method_1730(this.field_43)).method_1547(new StringBuilder().insert(0, method_5462).append("&").append(method_4642).append("&").append(method_5463).toString())) {
                            if (!class_261Var2.method_424()) {
                                method_113(class_202Var2, method_4642, class_546.method_1942(class_461.method_1730(this.field_43)).method_1543(new StringBuilder().insert(0, method_5462).append("&").append(method_4642).append("&").append(method_5463).toString()), method_5463);
                            }
                        } else {
                            class_546.method_1942(class_461.method_1730(this.field_43)).method_1546(new StringBuilder().insert(0, method_5462).append("&").append(method_4642).append("&").append(method_5463).toString(), method_4642);
                            class_546.method_1940(class_461.method_1730(this.field_43)).method_1546(new StringBuilder().insert(0, method_5462).append("&").append(method_4642).append("&").append(method_5463).toString(), "&");
                            if (!class_261Var2.method_424()) {
                                method_113(class_202Var2, method_4642, method_4642, method_5463);
                            }
                        }
                    }
                    int i6 = i5 - 1;
                    i4 = i6;
                    i5 = i6;
                }
            }
        } while (class_202Var2 != null);
    }

    public void method_113(class_202 class_202Var, String str, String str2, String str3) {
        Vector method_1589 = this.field_48.method_1589(class_202Var.method_198());
        int size = method_1589.size() - 1;
        int i = size;
        int i2 = size;
        while (i >= 0) {
            class_202 class_202Var2 = (class_202) method_1589.get(i2);
            class_546.method_1942(class_461.method_1730(this.field_43)).method_1546(new StringBuilder().insert(0, class_202Var2.method_198()).append("&").append(str).append("&").append(str3).toString(), str2);
            class_546.method_1940(class_461.method_1730(this.field_43)).method_1546(new StringBuilder().insert(0, class_202Var2.method_198()).append("&").append(str2).append("&").append(str3).toString(), "&");
            int i3 = i2 - 1;
            method_113(class_202Var2, str, str2, str3);
            i = i3;
            i2 = i3;
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:2:0x000b */
    public void method_132() {
        Iterator it = this.field_48.method_1587().iterator();
        while (it.hasNext()) {
            class_202 class_202Var = (class_202) it.next();
            if (!class_544.method_1927().method_101(this.field_45, class_202Var)) {
                method_115(class_202Var);
                method_130(class_202Var);
            }
        }
    }

    public boolean method_137(String str, class_557 class_557Var) {
        if (class_557Var.method_1126() || this.field_48.method_1599(str, class_557Var.method_464(), class_557Var.method_546()) || "<init>".equals(class_557Var.method_464()) || "<clinit>".equals(class_557Var.method_464())) {
            return true;
        }
        return "main".equals(class_557Var.method_464()) && "([Ljava/lang/String;)V".equals(class_557Var.method_546());
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:2:0x000e */
    public void method_106() throws Exception {
        class_422.method_1581();
        Iterator it = this.field_48.method_1587().iterator();
        while (it.hasNext()) {
            class_202 class_202Var = (class_202) it.next();
            if (!class_544.method_1927().method_101(this.field_45, class_202Var)) {
                method_117(class_202Var);
                method_124(class_202Var);
                method_134(class_202Var);
            }
        }
        if (field_49 || field_46.method_1548() <= 0) {
            return;
        }
        field_49 = true;
        throw new Exception();
    }

    public void method_135(class_202 class_202Var) {
        String method_1543;
        String method_178;
        String method_2030;
        class_202 class_202Var2;
        boolean z;
        String method_198 = class_202Var.method_198();
        class_557[] method_904 = class_202Var.method_904();
        int length = method_904.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            class_557 class_557Var = method_904[i2];
            String method_464 = class_557Var.method_464();
            String method_546 = class_557Var.method_546();
            if (class_557Var.method_424()) {
                method_1543 = class_352.method_1430(class_461.method_1731(this.field_43)).method_1543(new StringBuilder().insert(0, method_198).append("&").append(method_464).append("&").append(method_546).toString());
            } else {
                method_1543 = method_140(class_202Var, method_464, method_546);
            }
            String method_15432 = (method_1543 == null && class_544.method_1924().method_1482(this.field_45, class_202Var)) ? class_352.method_1435(class_461.method_1731(this.field_43)).method_1543(new StringBuilder().insert(0, method_464).append("&").append(class_587.method_2030(method_546)).toString()) : method_1543;
            if (method_15432 == null) {
                if (!class_544.method_1924().method_1477() && !class_202Var.method_1109()) {
                    class_352.method_1432(class_461.method_1731(this.field_43)).method_177();
                }
                do {
                    method_178 = class_352.method_1432(class_461.method_1731(this.field_43)).method_178();
                    method_2030 = class_587.method_2030(method_546);
                    if (class_557Var.method_424()) {
                        class_202Var2 = class_202Var;
                        z = false;
                    } else {
                        z = true;
                        class_202Var2 = class_202Var;
                    }
                } while (method_133(class_202Var, method_178, method_2030, z, class_202Var2.method_1108()));
                method_15432 = method_178;
            }
            class_352.method_1430(class_461.method_1731(this.field_43)).method_1546(new StringBuilder().insert(0, method_198).append("&").append(method_464).append("&").append(method_546).toString(), method_15432);
            if (class_202Var.method_1109()) {
                class_352.method_1434(class_461.method_1731(this.field_43)).method_1546(new StringBuilder().insert(0, method_198).append("&").append(method_464).toString(), method_15432);
            }
            class_352.method_1431(class_461.method_1731(this.field_43)).method_1546(new StringBuilder().insert(0, method_198).append("&").append(method_15432).append("&").append(class_587.method_2030(method_546)).toString(), "&");
            if (!class_557Var.method_424()) {
                method_104(class_202Var, method_464, method_15432, method_546, class_202Var.method_1108(), class_587.method_2037(class_557Var));
            }
            if (class_544.method_1924().method_1477() && !method_15432.equals(method_464)) {
                class_352.method_1435(class_461.method_1731(this.field_43)).method_1546(new StringBuilder().insert(0, method_464).append("&").append(class_587.method_2030(method_546)).toString(), method_15432);
            }
            int i3 = i2 - 1;
            i = i3;
            i2 = i3;
        }
    }

    public String method_109(String str) {
        if (!str.contains("$")) {
            return class_267.method_1185(class_461.method_1732(this.field_43)).method_1543(str);
        }
        String method_1543 = class_267.method_1185(class_461.method_1732(this.field_43)).method_1543(str);
        if (method_1543 == null) {
            return method_109(str.substring(0, str.lastIndexOf(36)));
        }
        int lastIndexOf = method_1543.lastIndexOf(46);
        if (lastIndexOf != -1) {
            method_1543 = method_1543.substring(lastIndexOf + 1);
        }
        int lastIndexOf2 = method_1543.lastIndexOf(36);
        if (lastIndexOf2 != -1) {
            method_1543 = method_1543.substring(lastIndexOf2 + 1);
        }
        if (method_1543.charAt(0) >= '0' && method_1543.charAt(0) <= '9') {
            return new StringBuilder().insert(0, method_109(str.substring(0, str.lastIndexOf(36)))).append(class_204.field_767).append('0').append(method_1543).toString();
        }
        return new StringBuilder().insert(0, method_109(str.substring(0, str.lastIndexOf(36)))).append(class_204.field_767).append(method_1543).toString();
    }

    public class_25(class_606 class_606Var) {
        this.field_45 = class_606Var;
        if (class_544.method_1924().method_1483()) {
            try {
                class_298.method_1298(new class_298(this, null));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        this.field_48 = new class_424(class_606Var);
    }

    public boolean method_133(class_202 class_202Var, String str, String str2, boolean z, boolean z2) {
        if (z2) {
            class_202 class_202Var2 = class_202Var;
            do {
                class_202Var2 = this.field_45.method_2102(class_202Var2.method_546());
                if (class_202Var2 != null && class_352.method_1431(class_461.method_1731(this.field_43)).method_1547(new StringBuilder().insert(0, class_202Var2.method_198()).append("&").append(str).append("&").append(str2).toString())) {
                    return true;
                }
            } while (class_202Var2 != null);
        }
        if (class_352.method_1431(class_461.method_1731(this.field_43)).method_1547(new StringBuilder().insert(0, class_202Var.method_198()).append("&").append(str).append("&").append(str2).toString())) {
            return true;
        }
        if (!z) {
            return false;
        }
        Vector method_1589 = this.field_48.method_1589(class_202Var.method_198());
        int size = method_1589.size() - 1;
        int i = size;
        int i2 = size;
        while (i >= 0) {
            if (method_133((class_202) method_1589.get(i2), str, str2, z, z2)) {
                return true;
            }
            int i3 = i2 - 1;
            i = i3;
            i2 = i3;
        }
        return false;
    }

    public void method_131(class_202 class_202Var) {
        String method_198 = class_202Var.method_198();
        if (class_267.method_1185(class_461.method_1732(this.field_43)).method_1547(method_198)) {
            return;
        }
        String method_2034 = class_587.method_2034(method_198);
        String method_110 = method_110(method_2034);
        if (class_544.method_1924().method_1486() && (!method_2034.equals(method_110) || class_544.method_1924().method_1474())) {
            method_110 = class_544.method_1924().method_1481();
            class_267.method_1182(class_461.method_1732(this.field_43)).method_1546(method_198, "&");
        }
        if (method_110.length() > 0) {
            method_110 = new StringBuilder().insert(0, method_110).append(".").toString();
        }
        if (!class_544.method_1924().method_1466().method_1279()) {
            class_267.method_1184(class_461.method_1732(this.field_43)).method_177();
        }
        while (true) {
            String sb = new StringBuilder().insert(0, method_110).append(class_267.method_1184(class_461.method_1732(this.field_43)).method_178()).toString();
            if (!class_267.method_1183(class_461.method_1732(this.field_43)).method_1547(sb) && this.field_45.method_2102(sb) == null) {
                class_267.method_1185(class_461.method_1732(this.field_43)).method_1546(method_198, sb);
                class_267.method_1183(class_461.method_1732(this.field_43)).method_1546(sb, method_198);
                return;
            }
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:9:0x0071 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v20, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    public void method_129(class_202 class_202Var) {
        String method_198 = class_202Var.method_198();
        class_261[] method_898 = class_202Var.method_898();
        if (!class_544.method_1924().method_1473()) {
            class_546.method_1941(class_461.method_1730(this.field_43)).method_177();
        }
        int length = method_898.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            class_261 class_261Var = method_898[i2];
            String method_464 = class_261Var.method_464();
            String method_546 = class_261Var.method_546();
            String method_1543 = class_546.method_1942(class_461.method_1730(this.field_43)).method_1543(new StringBuilder().insert(0, method_198).append("&").append(method_464).append("&").append(method_546).toString());
            if (method_1543 == null) {
                method_1543 = class_546.method_1941(class_461.method_1730(this.field_43)).method_178();
                while (true) {
                    if (!method_107(class_202Var, method_1543, method_546, !class_261Var.method_424() ? true : false)) {
                        break;
                    } else {
                        method_1543 = class_546.method_1941(class_461.method_1730(this.field_43)).method_178();
                    }
                }
                class_546.method_1942(class_461.method_1730(this.field_43)).method_1546(new StringBuilder().insert(0, method_198).append("&").append(method_464).append("&").append(method_546).toString(), method_1543);
                class_546.method_1940(class_461.method_1730(this.field_43)).method_1546(new StringBuilder().insert(0, method_198).append("&").append(method_1543).append("&").append(method_546).toString(), "&");
            }
            if (!class_261Var.method_424()) {
                method_113(class_202Var, method_464, method_1543, method_546);
            }
            int i3 = i2 - 1;
            i = i3;
            i2 = i3;
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:2:0x000b */
    public void method_116() {
        Iterator it = this.field_48.method_1587().iterator();
        while (it.hasNext()) {
            class_202 class_202Var = (class_202) it.next();
            if (!class_544.method_1927().method_101(this.field_45, class_202Var)) {
                method_108(class_202Var);
            }
        }
    }

    public boolean method_120(class_202 class_202Var, String str, String str2, boolean z) {
        if (class_352.method_1431(class_461.method_1731(this.field_43)).method_1547(new StringBuilder().insert(0, class_202Var.method_198()).append("&").append(str).append("&").append(str2).toString())) {
            return true;
        }
        if (!z) {
            return false;
        }
        Vector method_1589 = this.field_48.method_1589(class_202Var.method_198());
        int size = method_1589.size() - 1;
        int i = size;
        int i2 = size;
        while (i >= 0) {
            if (method_120((class_202) method_1589.get(i2), str, str2, z)) {
                return true;
            }
            int i3 = i2 - 1;
            i = i3;
            i2 = i3;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public boolean method_107(class_202 class_202Var, String str, String str2, boolean z) {
        if (class_546.method_1940(class_461.method_1730(this.field_43)).method_1547(new StringBuilder().insert(0, class_202Var.method_198()).append("&").append(str).append("&").append(str2).toString())) {
            return true;
        }
        if (!z) {
            return false;
        }
        Vector method_1589 = this.field_48.method_1589(class_202Var.method_198());
        int size = method_1589.size() - 1;
        int i = size;
        int i2 = size;
        while (i >= 0) {
            if (method_107((class_202) method_1589.get(i2), str, str2, z)) {
                return true;
            }
            int i3 = i2 - 1;
            i = i3;
            i2 = i3;
        }
        return false;
    }

    public boolean method_136(class_202 class_202Var) {
        class_557[] method_904 = class_202Var.method_904();
        int length = method_904.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            if (!method_904[i2].method_1126()) {
                int i3 = i2 - 1;
                i = i3;
                i2 = i3;
            } else {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:2:0x001a */
    public void method_121() {
        class_374.method_1498(class_461.method_1729(this.field_43)).method_1546("", "");
        Iterator it = this.field_48.method_1587().iterator();
        while (it.hasNext()) {
            class_202 class_202Var = (class_202) it.next();
            if (!class_544.method_1927().method_101(this.field_45, class_202Var)) {
                method_131(class_202Var);
                method_135(class_202Var);
                method_129(class_202Var);
            }
        }
        if (!class_544.method_1924().method_1485()) {
            return;
        }
        method_111();
    }

    public void method_111() {
        for (Object str : class_267.method_1185(class_461.method_1732(this.field_43)).method_1544()) {
            if(!(str instanceof String)){
                continue;
            }
            String method_1543 = class_267.method_1185(class_461.method_1732(this.field_43)).method_1543((String) str);
            String method_109 = method_109((String) str);
            if (!method_1543.equals(method_109)) {
                class_267.method_1185(class_461.method_1732(this.field_43)).method_1546((String) str, method_109);
                class_267.method_1183(class_461.method_1732(this.field_43)).method_1545(method_1543);
                class_267.method_1183(class_461.method_1732(this.field_43)).method_1546(method_109, (String) str);
            }
        }
    }

    public static class_108 method_105(class_25 class_25Var) {
        return class_25Var.field_47;
    }

    public static class_606 method_122(class_25 class_25Var) {
        return class_25Var.field_45;
    }

    public static class_461 method_125(class_25 class_25Var) {
        return class_25Var.field_43;
    }

    public static boolean method_127() {
        return field_49;
    }

    public static class_386 method_138() {
        return field_46;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:14:0x0073 */
    public String method_110(String str) {
        String sb;
        String method_1543 = class_374.method_1498(class_461.method_1729(this.field_43)).method_1543(str);
        if (method_1543 != null) {
            return method_1543;
        }
        if (class_544.method_1924().method_1460()) {
            class_374.method_1498(class_461.method_1729(this.field_43)).method_1546(str, str);
            class_374.method_1499(class_461.method_1729(this.field_43)).method_1546(str, "&");
            String str2 = str;
            String str3 = str;
            while (str2.lastIndexOf(46) > 0) {
                String substring = str3.substring(0, str3.lastIndexOf(46));
                class_374.method_1498(class_461.method_1729(this.field_43)).method_1546(substring, substring);
                class_374.method_1499(class_461.method_1729(this.field_43)).method_1546(substring, "&");
                str2 = substring;
                str3 = substring;
            }
        } else {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            String str4 = "";
            loop1: while (true) {
                while (stringTokenizer.hasMoreTokens()) {
                    if (str4.length() > 0) {
                        str4 = new StringBuilder().insert(0, str4).append(".").toString();
                    }
                    str4 = new StringBuilder().insert(0, str4).append(stringTokenizer.nextToken()).toString();
                    if (!class_374.method_1498(class_461.method_1729(this.field_43)).method_1547(str4)) {
                        class_374.method_1497(class_461.method_1729(this.field_43)).method_177();
                        String method_15432 = class_374.method_1498(class_461.method_1729(this.field_43)).method_1543(class_587.method_2034(str4));
                        if (method_15432.length() > 0) {
                            method_15432 = new StringBuilder().insert(0, method_15432).append(".").toString();
                        }
                        do {
                            sb = new StringBuilder().insert(0, method_15432).append(class_374.method_1497(class_461.method_1729(this.field_43)).method_178()).toString();
                        } while (class_374.method_1499(class_461.method_1729(this.field_43)).method_1547(sb));
                        class_374.method_1498(class_461.method_1729(this.field_43)).method_1546(str4, sb);
                        class_374.method_1499(class_461.method_1729(this.field_43)).method_1546(sb, "&");
                    }
                }
            }
        }
        return class_374.method_1498(class_461.method_1729(this.field_43)).method_1543(str);
    }

    public void method_118() throws Exception {
        this.field_48.method_1596();
        method_106();
        method_121();
        method_132();
        method_141();
        method_116();
        class_544.method_1934().field_1932 = new class_283(class_267.method_1185(class_461.method_1732(this.field_43)), class_352.method_1430(class_461.method_1731(this.field_43)), class_546.method_1942(class_461.method_1730(this.field_43)), this.field_47.method_609(), this.field_47.method_608(), this.field_47.method_610(), class_352.method_1434(class_461.method_1731(this.field_43)));
        class_544.method_1934().field_1933 = class_267.method_1183(class_461.method_1732(this.field_43));
        class_544.method_1934().field_1931 = class_374.method_1498(class_461.method_1729(this.field_43));
    }

    public void method_124(class_202 class_202Var) {
        String method_198 = class_202Var.method_198();
        class_557[] method_904 = class_202Var.method_904();
        int length = method_904.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            class_557 class_557Var = method_904[i2];
            if (method_137(method_198, class_557Var) || !class_544.method_1924().method_1468().method_1225(this.field_45, class_202Var, class_557Var)) {
                String method_464 = class_557Var.method_464();
                String method_546 = class_557Var.method_546();
                if (class_544.method_1924().method_1466().method_1280()) {
                    class_422.method_1580(method_464);
                }
                if (!class_352.method_1430(class_461.method_1731(this.field_43)).method_1547(new StringBuilder().insert(0, method_198).append("&").append(method_464).append("&").append(method_546).toString())) {
                    class_352.method_1430(class_461.method_1731(this.field_43)).method_1546(new StringBuilder().insert(0, method_198).append("&").append(method_464).append("&").append(method_546).toString(), method_464);
                    class_352.method_1431(class_461.method_1731(this.field_43)).method_1546(new StringBuilder().insert(0, method_198).append("&").append(method_464).append("&").append(class_587.method_2030(method_546)).toString(), "&");
                    if (!class_557Var.method_424()) {
                        method_104(class_202Var, method_464, method_464, method_546, class_202Var.method_1108(), class_587.method_2037(class_557Var));
                    }
                } else if (!class_557Var.method_424()) {
                    method_104(class_202Var, method_464, class_352.method_1430(class_461.method_1731(this.field_43)).method_1543(new StringBuilder().insert(0, method_198).append("&").append(method_464).append("&").append(method_546).toString()), method_546, class_202Var.method_1108(), class_587.method_2037(class_557Var));
                }
            }
            int i3 = i2 - 1;
            i = i3;
            i2 = i3;
        }
        class_202 class_202Var2 = class_202Var;
        do {
            String method_5462 = class_202Var2.method_546();
            class_202Var2 = this.field_45.method_2102(method_5462);
            if (class_202Var2 != null) {
                class_557[] method_9042 = class_202Var2.method_904();
                int length2 = method_9042.length - 1;
                int i4 = length2;
                int i5 = length2;
                while (i4 >= 0) {
                    class_557 class_557Var2 = method_9042[i5];
                    if (!method_137(method_5462, class_557Var2) && !class_544.method_1924().method_1468().method_1225(this.field_45, class_202Var, class_557Var2)) {
                        String method_4642 = class_557Var2.method_464();
                        String method_5463 = class_557Var2.method_546();
                        if (class_544.method_1924().method_1466().method_1280()) {
                            class_422.method_1580(method_4642);
                        }
                        if (class_352.method_1430(class_461.method_1731(this.field_43)).method_1547(new StringBuilder().insert(0, method_5462).append("&").append(method_4642).append("&").append(method_5463).toString())) {
                            if (!class_557Var2.method_424()) {
                                method_104(class_202Var2, method_4642, class_352.method_1430(class_461.method_1731(this.field_43)).method_1543(new StringBuilder().insert(0, method_5462).append("&").append(method_4642).append("&").append(method_5463).toString()), method_5463, class_202Var2.method_1108(), class_587.method_2037(class_557Var2));
                            }
                        } else {
                            class_352.method_1430(class_461.method_1731(this.field_43)).method_1546(new StringBuilder().insert(0, method_5462).append("&").append(method_4642).append("&").append(method_5463).toString(), method_4642);
                            class_352.method_1431(class_461.method_1731(this.field_43)).method_1546(new StringBuilder().insert(0, method_5462).append("&").append(method_4642).append("&").append(class_587.method_2030(method_5463)).toString(), "&");
                            if (!class_557Var2.method_424()) {
                                method_104(class_202Var2, method_4642, method_4642, method_5463, class_202Var2.method_1108(), class_587.method_2037(class_557Var2));
                            }
                        }
                    }
                    int i6 = i5 - 1;
                    i4 = i6;
                    i5 = i6;
                }
            }
        } while (class_202Var2 != null);
    }

    public void method_108(class_202 class_202Var) {
        if (class_267.method_1182(class_461.method_1732(this.field_43)).method_1547(class_202Var.method_198()) || class_544.method_1924().method_1474()) {
            class_587.method_2032(class_202Var);
        }
        if (class_544.method_1937().method_1702() && !class_202Var.method_1103() && !class_202Var.method_1108() && !class_202Var.method_1109() && !class_202Var.method_1106() && this.field_48.method_1589(class_202Var.method_198()).isEmpty()) {
            class_202Var.method_1118(true);
        }
        String method_1543 = class_267.method_1185(class_461.method_1732(this.field_43)).method_1543(class_202Var.method_198());
        if (!class_202Var.method_198().equals(method_1543)) {
            class_202Var.method_900(method_1543);
            class_525.field_1997++;
        }
        this.field_47.method_612(class_202Var);
        String[] method_643 = class_202Var.method_643();
        int length = method_643.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = method_643[i2];
            String method_15432 = class_267.method_1185(class_461.method_1732(this.field_43)).method_1543(str);
            if (method_15432 != null) {
                class_202Var.method_912(str);
                class_202Var.method_850(method_15432);
                class_202Var.method_917().method_1007(method_15432);
            } else {
                class_202Var.method_912(str);
                class_202Var.method_850(str);
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        method_119(class_202Var.method_908(), class_202Var.method_917());
    }

    public void method_130(class_202 class_202Var) {
        class_557[] method_904 = class_202Var.method_904();
        int length = method_904.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            class_557 class_557Var = method_904[i2];
            class_591 method_1067 = class_230.method_1067(class_557Var, class_202Var.method_198(), class_202Var.method_917(), class_202Var.method_917().method_502());
            method_139(class_202Var, method_1067);
            this.field_47.method_611(class_202Var.method_198(), method_1067);
            String method_1543 = class_352.method_1430(class_461.method_1731(this.field_43)).method_1543(new StringBuilder().insert(0, class_202Var.method_198()).append("&").append(class_557Var.method_464()).append("&").append(class_557Var.method_546()).toString());
            if (!method_1067.method_198().equals(method_1543)) {
                method_1067.method_671(method_1543);
                class_525.field_1996++;
            }
            class_212[] method_1964 = method_1067.method_1964();
            int length2 = method_1964.length - 1;
            int i3 = length2;
            int i4 = length2;
            boolean z = false;
            while (i3 >= 0) {
                class_212 method_2036 = class_587.method_2036(method_1964[i4], class_267.method_1185(class_461.method_1732(this.field_43)));
                if (method_2036 != null) {
                    method_1067.method_2050(i4, method_2036);
                    z = true;
                }
                int i5 = i4 - 1;
                i3 = i5;
                i4 = i5;
            }
            class_212 method_20362 = class_587.method_2036(method_1067.method_2057(), class_267.method_1185(class_461.method_1732(this.field_43)));
            if (method_20362 != null) {
                method_1067.method_849(method_20362);
                z = true;
            }
            if (z) {
                class_352.method_1433(class_461.method_1731(this.field_43)).method_1546(class_557Var.method_546(), method_1067.method_464());
            }
            if (class_544.method_1931().method_1735(this.field_45, class_202Var, class_557Var) || (!class_557Var.method_424() && (class_267.method_1182(class_461.method_1732(this.field_43)).method_1547(class_202Var.method_198()) || class_544.method_1924().method_1474()))) {
                class_587.method_2032(method_1067);
            }
            method_119(method_1067.method_908(), class_202Var.method_917());
            int length3 = method_1067.method_1964().length - 1;
            int i6 = length3;
            int i7 = length3;
            while (i6 >= 0) {
                int i8 = i7 - 1;
                method_112(method_1067.method_2043(i7), class_202Var.method_917());
                i6 = i8;
                i7 = i8;
            }
            int i9 = i2 - 1;
            class_202Var.method_914(class_557Var, method_1067.method_2048());
            i = i9;
            i2 = i9;
        }
    }

    public void method_115(class_202 class_202Var) {
        class_261[] method_898 = class_202Var.method_898();
        int length = method_898.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            class_261 class_261Var = method_898[i2];
            String method_1543 = class_546.method_1942(class_461.method_1730(this.field_43)).method_1543(new StringBuilder().insert(0, class_202Var.method_198()).append("&").append(class_261Var.method_464()).append("&").append(class_261Var.method_546()).toString());
            class_212 method_2036 = class_587.method_2036(class_261Var.method_669(), class_267.method_1185(class_461.method_1732(this.field_43)));
            boolean method_1733 = class_544.method_1931().method_1733(this.field_45, class_202Var, class_261Var);
            if (!method_1733 && !class_261Var.method_424() && (class_267.method_1182(class_461.method_1732(this.field_43)).method_1547(class_202Var.method_198()) || class_544.method_1924().method_1474())) {
                method_1733 = true;
            }
            if (!method_1543.equals(class_261Var.method_464()) || method_2036 != null || method_1733 || class_261Var.method_1560().length > 0) {
                class_176 class_176Var = new class_176(class_261Var, class_202Var.method_917());
                if (!method_1543.equals(class_261Var.method_464())) {
                    class_176Var.method_671(method_1543);
                    class_525.field_1998++;
                }
                if (method_2036 != null) {
                    class_176Var.method_668(method_2036);
                    class_546.method_1939(class_461.method_1730(this.field_43)).method_1546(class_261Var.method_546(), class_176Var.method_464());
                }
                if (method_1733) {
                    class_587.method_2032(class_176Var);
                }
                method_119(class_176Var.method_908(), class_202Var.method_917());
                class_202Var.method_905(class_261Var, class_176Var.method_854());
            }
            int i3 = i2 - 1;
            i = i3;
            i2 = i3;
        }
    }

    public void method_139(class_202 class_202Var, class_591 class_591Var) {
        int method_782 = class_544.method_1924().method_1484().method_782(this.field_45, class_202Var, class_591Var);
        class_544.method_1924().method_1484();
        if (method_782 == 4) {
            class_591Var.method_2065();
            return;
        }
        class_544.method_1924().method_1484();
        int i = method_782 == 3 ? -(-1) : 0;
        class_139[] method_2076 = class_591Var.method_2076();
        int length = class_591Var.method_643().length;
        if (!class_591Var.method_1125()) {
            length++;
        }
        class_212[] method_1964 = class_591Var.method_1964();
        int length2 = method_1964.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length2) {
            class_212 class_212Var = method_1964[i3];
            int i4 = i3 + 1;
            i2 = i4;
            length = (class_212Var == class_212.field_798 || class_212Var == class_212.field_810) ? length + 1 : length;
            i3 = i4;
        }
        class_14.method_33(class_461.method_1728(this.field_43)).method_177();
        class_405 class_405Var = class_544.method_1937().method_1703() ? new class_405() : null;
        int length3 = method_2076.length - 1;
        int i5 = length3;
        int i6 = length3;
        while (i5 >= 0) {
            class_139 class_139Var = method_2076[i6];
            class_212 method_2036 = class_587.method_2036(class_139Var.method_669(), class_267.method_1185(class_461.method_1732(this.field_43)));
            if (method_2036 != null) {
                class_139Var.method_668(method_2036);
            }
            if (class_591Var.method_2043(class_139Var.method_47()) != null) {
                int i7 = i6 - 1;
                i5 = i7;
                i6 = i7;
            }
            class_544.method_1924().method_1484();
            if (method_782 == 5) {
                if (class_139Var.method_47() >= length) {
                    class_139Var.method_671(class_544.method_1937().method_1703() ? class_405Var.method_178() : class_544.method_1924().method_1466().method_1286());
                }
            } else {
                class_544.method_1924().method_1484();
                if (method_782 == 6) {
                    if (class_139Var.method_47() >= length) {
                        class_139Var.method_671(class_544.method_1937().method_1703() ? class_405Var.method_178() : class_544.method_1924().method_1466().method_1286());
                    } else {
                        class_139Var.method_671(class_544.method_1937().method_1703() ? class_405Var.method_178() : class_544.method_1924().method_1466().method_1286());
                    }
                } else {
                    class_544.method_1924().method_1484();
                    if (method_782 != 1) {
                        if (i == 0) {
                            class_139Var.method_671(class_14.method_33(class_461.method_1728(this.field_43)).method_178());
                        }
                    } else {
                        class_139Var.method_671(class_544.method_1924().method_1466().method_1286());
                    }
                }
            }
            int i72 = i6 - 1;
            i5 = i72;
            i6 = i72;
        }
    }

    public void method_128(class_160[] class_160VarArr, class_208 class_208Var) {
        int length = class_160VarArr.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            class_160 class_160Var = class_160VarArr[i2];
            if (class_160Var instanceof class_576) {
                method_128(((class_576) class_160Var).method_906(), class_208Var);
            } else if (!(class_160Var instanceof class_257) && !(class_160Var instanceof class_221) && !(class_160Var instanceof class_224)) {
                if (class_160Var instanceof class_121) {
                    class_367[] method_626 = ((class_121) class_160Var).method_626();
                    if (method_626.length > 0) {
                        class_499 method_502 = class_208Var.method_502();
                        int length2 = method_626.length - 1;
                        int i3 = length2;
                        int i4 = length2;
                        while (i3 >= 0) {
                            class_367 class_367Var = method_626[i4];
                            if (!method_502.method_1845(class_367Var.method_183(), (byte) 7).contains("$")) {
                                class_367Var.method_407(0);
                            }
                            int i5 = i4 - 1;
                            i3 = i5;
                            i4 = i5;
                        }
                    }
                } else if (!(class_160Var instanceof class_332) && !(class_160Var instanceof class_40) && !(class_160Var instanceof class_233)) {
                    if (class_160Var instanceof class_72) {
                        class_72 class_72Var = (class_72) class_160Var;
                        class_72Var.method_461(class_208Var.method_1004(method_126(class_72Var.method_464())));
                    } else if (!(class_160Var instanceof class_599) && !(class_160Var instanceof class_157) && !(class_160Var instanceof class_569)) {
                        if (class_160Var instanceof class_518) {
                            class_518 class_518Var = (class_518) class_160Var;
                            if (class_518Var.method_183() != 0) {
                                class_499 method_5022 = class_208Var.method_502();
                                String replace = class_518Var.method_979().method_189(method_5022).replace('/', '.');
                                String method_1543 = class_267.method_1183(class_461.method_1732(this.field_43)).method_1543(replace);
                                if (method_1543 == null) {
                                    method_1543 = replace;
                                }
                                class_538 method_1869 = class_518Var.method_1869();
                                if (method_1869 != null) {
                                    String method_189 = method_1869.method_189(method_5022);
                                    String method_1899 = method_1869.method_1899(method_5022);
                                    String method_15432 = class_352.method_1430(class_461.method_1731(this.field_43)).method_1543(new StringBuilder().insert(0, method_1543).append("&").append(method_189).append("&").append(method_1899).toString());
                                    String method_15433 = class_352.method_1433(class_461.method_1731(this.field_43)).method_1543(method_1899);
                                    if ((method_15432 != null && !method_15432.equals(method_189)) || method_15433 != null) {
                                        if (method_15432 != null) {
                                            method_189 = method_15432;
                                        }
                                        if (method_15433 == null) {
                                            method_15433 = method_1899;
                                        }
                                        class_518Var.method_461(class_208Var.method_984(method_189, method_15433));
                                    }
                                }
                            }
                        } else if (!(class_160Var instanceof class_205) && !(class_160Var instanceof class_238) && !(class_160Var instanceof class_228)) {
                        }
                    }
                }
            }
            int i6 = i2 - 1;
            i = i6;
            i2 = i6;
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:103:0x0303 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:116:0x0372 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:50:0x0188 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:70:0x0235 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:86:0x029f */
    public void method_123(class_202 class_202Var) {
        int i;
        String str;
        int i2;
        boolean z;
        String str2;
        String str3;
        String method_1543;
        String str4;
        int[] method_434;
        String str5;
        String str6;
        String str7;
        class_208 method_917 = class_202Var.method_917();
        int method_47 = method_917.method_47() - 1;
        int i3 = method_47;
        int i4 = method_47;
        while (i3 >= 0) {
            class_286 method_982 = method_917.method_982(i4);
            if (!(method_982 instanceof class_43)) {
                if (!(method_982 instanceof class_456)) {
                    if (!(method_982 instanceof class_371) && !(method_982 instanceof class_252) && (method_982 instanceof class_520)) {
                        class_520 class_520Var = (class_520) method_982;
                        class_499 method_502 = method_917.method_502();
                        class_538 class_538Var = (class_538) method_917.method_982(class_520Var.method_433());
                        String method_1899 = class_538Var.method_1899(method_502);
                        String method_189 = class_538Var.method_189(method_502);
                        if (method_1899.contains(")L")) {
                            String replace = method_1899.substring(method_1899.lastIndexOf(")L") + 2, method_1899.length() - 1).replace('/', '.');
                            if (class_267.method_1185(class_461.method_1732(this.field_43)).method_1543(replace) != null) {
                                String str8 = null;
                                if (class_202Var.method_906() != null) {
                                    class_160[] method_906 = class_202Var.method_906();
                                    int length = method_906.length;
                                    int i5 = 0;
                                    int i6 = 0;
                                    while (i5 < length) {
                                        class_160 class_160Var = method_906[i6];
                                        if ((class_160Var instanceof class_452) && (method_434 = ((class_452) class_160Var).method_1717()[class_520Var.method_47()].method_434()) != null) {
                                            int length2 = method_434.length;
                                            int i7 = 0;
                                            while (true) {
                                                int i8 = i7;
                                                if (i7 >= length2) {
                                                    break;
                                                }
                                                int i9 = method_434[i8];
                                                if (!(method_917.method_982(i9) instanceof class_252)) {
                                                    i7 = i8 + 1;
                                                } else {
                                                    str4 = ((class_371) method_917.method_982(((class_252) method_917.method_982(i9)).method_47())).method_198();
                                                    break;
                                                }
                                            }
                                        }
                                        str4 = str8;
                                        int i10 = i6 + 1;
                                        i5 = i10;
                                        i6 = i10;
                                        str8 = str4;
                                    }
                                }
                                if (str8 != null && (method_1543 = class_352.method_1430(class_461.method_1731(this.field_43)).method_1543(new StringBuilder().insert(0, replace).append("&").append(method_189).append("&").append(str8).toString())) != null) {
                                    class_538Var.method_407(method_917.method_1004(method_1543));
                                }
                            }
                        }
                        String method_18992 = class_538Var.method_1899(method_502);
                        String method_126 = method_126(method_18992);
                        if (!method_18992.equals(method_126)) {
                            class_538Var.method_46(method_917.method_1004(method_126));
                        }
                    }
                } else {
                    class_499 method_5022 = method_917.method_502();
                    class_456 class_456Var = (class_456) method_982;
                    String method_1892 = class_456Var.method_189(method_5022);
                    String method_15432 = class_267.method_1183(class_461.method_1732(this.field_43)).method_1543(method_1892);
                    if (method_15432 != null) {
                        method_1892 = method_15432;
                    }
                    class_538 class_538Var2 = (class_538) method_917.method_982(class_456Var.method_433());
                    String method_1893 = class_538Var2.method_189(method_5022);
                    String method_18993 = class_538Var2.method_1899(method_5022);
                    String str9 = null;
                    if ((class_456Var instanceof class_35) || (class_456Var instanceof class_401)) {
                        String method_15433 = class_352.method_1430(class_461.method_1731(this.field_43)).method_1543(new StringBuilder().insert(0, method_1892).append("&").append(method_1893).append("&").append(method_18993).toString());
                        str9 = class_352.method_1433(class_461.method_1731(this.field_43)).method_1543(method_18993);
                        str5 = method_15433;
                        str6 = method_15433;
                    } else {
                        if (!(class_456Var instanceof class_530)) {
                            str7 = null;
                        } else {
                            str7 = class_546.method_1942(class_461.method_1730(this.field_43)).method_1543(new StringBuilder().insert(0, method_1892).append("&").append(method_1893).append("&").append(method_18993).toString());
                            str9 = class_546.method_1939(class_461.method_1730(this.field_43)).method_1543(method_18993);
                        }
                        str5 = str7;
                        str6 = str7;
                    }
                    if ((str5 != null && !str6.equals(method_1893)) || str9 != null) {
                        String str10 = str6 == null ? method_1893 : str6;
                        if (str9 == null) {
                            str9 = method_18993;
                        }
                        class_456Var.method_407(method_917.method_984(str10, str9));
                    }
                }
            }
            int i11 = i4 - 1;
            i3 = i11;
            i4 = i11;
        }
        int method_472 = method_917.method_47() - 1;
        int i12 = method_472;
        int i13 = method_472;
        while (i12 >= 0) {
            class_286 method_9822 = method_917.method_982(i13);
            if (!(method_9822 instanceof class_43)) {
                if (!(method_9822 instanceof class_456)) {
                    if (method_9822 instanceof class_371) {
                        class_371 class_371Var = (class_371) method_9822;
                        String method_198 = class_371Var.method_198();
                        String method_15434 = class_267.method_1185(class_461.method_1732(this.field_43)).method_1543(method_198);
                        if (method_15434 != null) {
                            class_371Var.method_671(method_15434);
                        } else {
                            int i14 = 0;
                            while (true) {
                                i = i14;
                                if (i14 >= method_198.length() || method_198.charAt(i) != '[') {
                                    break;
                                } else {
                                    i14 = i + 1;
                                }
                            }
                            if (i > 0 && method_198.endsWith(";") && method_198.charAt(i) == 'L') {
                                str = method_198.substring(i + 1, method_198.length() - 1).replace('/', '.');
                                String method_15435 = class_267.method_1185(class_461.method_1732(this.field_43)).method_1543(str);
                                if (method_15435 != null) {
                                    String sb = new StringBuilder().insert(0, "[L").append(method_15435.replace('.', '/')).append(";").toString();
                                    while (true) {
                                        int i15 = i;
                                        if (i <= 1) {
                                            break;
                                        }
                                        i = i15 - 1;
                                        sb = new StringBuilder().insert(0, "[").append(sb).toString();
                                    }
                                    class_371Var.method_671(sb);
                                }
                            } else {
                                str = method_198;
                            }
                            if (str.startsWith("L") && str.endsWith(";")) {
                                String method_15436 = class_267.method_1185(class_461.method_1732(this.field_43)).method_1543(str.substring(1, str.length() - 1).replace('/', '.'));
                                if (method_15436 != null) {
                                    class_371Var.method_671(new StringBuilder().insert(0, "L").append(method_15436.replace('.', '/')).append(";").toString());
                                }
                            }
                        }
                    } else if (method_9822 instanceof class_252) {
                        class_371 class_371Var2 = (class_371) method_917.method_982(((class_252) method_9822).method_47());
                        class_371Var2.method_671(method_126(class_371Var2.method_198()));
                    }
                }
            } else {
                class_43 class_43Var = (class_43) method_9822;
                String replace2 = ((String) class_43Var.method_188(method_917.method_502())).replace('/', '.');
                int i16 = 0;
                while (true) {
                    i2 = i16;
                    if (i16 >= replace2.length() || replace2.charAt(i2) != '[') {
                        break;
                    } else {
                        i16 = i2 + 1;
                    }
                }
                if (i2 <= 0 || !replace2.endsWith(";") || replace2.charAt(i2) != 'L') {
                    z = false;
                    str2 = replace2;
                } else {
                    str2 = replace2.substring(i2 + 1, replace2.length() - 1);
                    z = true;
                }
                String method_15437 = class_267.method_1185(class_461.method_1732(this.field_43)).method_1543(str2);
                if (method_15437 != null) {
                    String replace3 = method_15437.replace('.', '/');
                    if (z) {
                        str3 = new StringBuilder().insert(0, "[L").append(replace3).append(";").toString();
                        while (true) {
                            int i17 = i2;
                            if (i2 <= 1) {
                                break;
                            }
                            i2 = i17 - 1;
                            str3 = new StringBuilder().insert(0, "[").append(str3).toString();
                        }
                    } else {
                        str3 = replace3;
                    }
                    class_43Var.method_46(method_917.method_1004(str3));
                    Map map = method_917.field_779;
                    Object obj = map.get(str2.replace('.', '/'));
                    if (obj != null) {
                        map.put(str3, obj);
                    }
                }
            }
            int i18 = i13 - 1;
            i12 = i18;
            i13 = i18;
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x000b */
    public void method_141() {
        Iterator it = this.field_48.method_1587().iterator();
        while (true) {
            while (it.hasNext()) {
                class_202 class_202Var = (class_202) it.next();
                if (!class_544.method_1927().method_101(this.field_45, class_202Var)) {
                    method_123(class_202Var);
                    class_208 method_917 = class_202Var.method_917();
                    method_128(class_202Var.method_906(), method_917);
                    class_557[] method_904 = class_202Var.method_904();
                    int length = method_904.length - 1;
                    int i = length;
                    int i2 = length;
                    while (i >= 0) {
                        int i3 = i2 - 1;
                        method_128(method_904[i2].method_906(), method_917);
                        i = i3;
                        i2 = i3;
                    }
                    class_261[] method_898 = class_202Var.method_898();
                    int length2 = method_898.length - 1;
                    int i4 = length2;
                    int i5 = length2;
                    while (i4 >= 0) {
                        int i6 = i5 - 1;
                        method_128(method_898[i5].method_906(), method_917);
                        i4 = i6;
                        i5 = i6;
                    }
                }
            }
            return;
        }
    }

    public void method_119(class_574[] class_574VarArr, class_208 class_208Var) {
        if (class_574VarArr == null) {
            return;
        }
        int length = class_574VarArr.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            int i3 = i2 - 1;
            method_103(class_574VarArr[i2], class_208Var);
            i = i3;
            i2 = i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void method_103(class_574 class_574Var, class_208 class_208Var) {
        String str;
        int i;
        String method_2016 = class_574Var.method_2016();
        String str2 = null;
        if (method_2016.startsWith("L") && method_2016.endsWith(";")) {
            String replace = method_2016.substring(1, method_2016.length() - 1).replace('/', '.');
            String method_1543 = class_267.method_1185(class_461.method_1732(this.field_43)).method_1543(replace);
            if (method_1543 != null) {
                class_574Var.method_2011(class_208Var.method_1004(new StringBuilder().insert(0, "L").append(method_1543.replace('.', '/')).append(";").toString()));
                str = replace;
                List method_2015 = class_574Var.method_2015();
                int size = method_2015.size() - 1;
                i = size;
                int i2 = size;
                while (i >= 0) {
                    class_410 class_410Var = (class_410) method_2015.get(i2);
                    if (str != null) {
                        String sb = new StringBuilder().insert(0, str).append("&").append(class_410Var.method_1568()).toString();
                        if (class_352.method_1434(class_461.method_1731(this.field_43)).method_1547(sb)) {
                            class_410Var.method_1564(class_208Var.method_1004(class_352.method_1434(class_461.method_1731(this.field_43)).method_1543(sb)));
                        }
                    }
                    int i3 = i2 - 1;
                    method_114(class_410Var.method_1567(), class_208Var);
                    i = i3;
                    i2 = i3;
                }
            }
            str2 = class_267.method_1183(class_461.method_1732(this.field_43)).method_1543(replace);
        }
        str = str2;
        List method_20152 = class_574Var.method_2015();
        int size2 = method_20152.size() - 1;
        i = size2;
        int i22 = size2;
        while (i >= 0) {
        }
    }

    public void method_114(class_476 class_476Var, class_208 class_208Var) {
        String method_1543;
        if (!(class_476Var instanceof class_511)) {
            if (class_476Var instanceof class_125) {
                List method_628 = ((class_125) class_476Var).method_628();
                int size = method_628.size() - 1;
                int i = size;
                int i2 = size;
                while (i >= 0) {
                    int i3 = i2 - 1;
                    method_114((class_476) method_628.get(i2), class_208Var);
                    i = i3;
                    i2 = i3;
                }
                return;
            }
            if (!(class_476Var instanceof class_111)) {
                if (class_476Var instanceof class_558) {
                    class_558 class_558Var = (class_558) class_476Var;
                    String method_1968 = class_558Var.method_1968();
                    String str = null;
                    if (method_1968.startsWith("L") && method_1968.endsWith(";") && (method_1543 = class_267.method_1185(class_461.method_1732(this.field_43)).method_1543((str = method_1968.substring(1, method_1968.length() - 1).replace('/', '.')))) != null) {
                        class_558Var.method_1967(class_208Var.method_1004(new StringBuilder().insert(0, "L").append(method_1543.replace('.', '/')).append(";").toString()));
                    }
                    if (str != null) {
                        String sb = new StringBuilder().insert(0, str).append("&").append(class_558Var.method_550()).append("&").append(method_1968).toString();
                        if (class_546.method_1942(class_461.method_1730(this.field_43)).method_1547(sb)) {
                            class_558Var.method_551(class_208Var.method_1004(class_546.method_1942(class_461.method_1730(this.field_43)).method_1543(sb)));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (class_476Var instanceof class_88) {
                }
                return;
            }
            return;
        }
        method_103(((class_511) class_476Var).method_1864(), class_208Var);
    }

    public void method_112(List list, class_208 class_208Var) {
        if (list == null) {
            return;
        }
        int size = list.size() - 1;
        int i = size;
        int i2 = size;
        while (i >= 0) {
            int i3 = i2 - 1;
            method_103((class_574) list.get(i2), class_208Var);
            i = i3;
            i2 = i3;
        }
    }

    public String method_126(String str) {
        String str2;
        String replace;
        String method_1543;
        String str3;
        if (str.contains(">.")) {
            int i = 0;
            int i2 = 0;
            str2 = str;
            while (i < str2.length()) {
                if (str2.charAt(i2) == 'L') {
                    int i3 = i2 + 1;
                    int i4 = i3;
                    int i5 = i3;
                    int i6 = 0;
                    while (true) {
                        if (i4 >= str2.length()) {
                            str3 = str2;
                            i5 = i3;
                            break;
                        }
                        if (str2.charAt(i5) == '<') {
                            i6++;
                        }
                        if (str2.charAt(i5) == '>') {
                            i6--;
                        }
                        if (str2.charAt(i5) == ';' && i6 == 0) {
                            str3 = str2;
                            break;
                        }
                        int i7 = i5 + 1;
                        i4 = i7;
                        i5 = i7;
                    }
                    String substring = str3.substring(i3, i5);
                    if (substring.indexOf(46) > 0) {
                        String str4 = substring;
                        String str5 = substring;
                        while (str4.contains(">")) {
                            int indexOf = str5.indexOf(62);
                            String sb = new StringBuilder().insert(0, str5.substring(0, str5.lastIndexOf(60, indexOf))).append(str5.substring(indexOf + 1)).toString();
                            str4 = sb;
                            str5 = sb;
                        }
                        String replace2 = str5.replace('.', class_204.field_767).replace('/', '.');
                        String method_15432 = class_267.method_1185(class_461.method_1732(this.field_43)).method_1543(replace2);
                        if (method_15432 != null && !method_15432.equals(replace2)) {
                            str2 = new StringBuilder().insert(0, str2.substring(0, i3)).append(method_15432.replace('.', '/')).append(str2.substring(i3 + substring.length())).toString();
                        }
                    }
                }
                int i8 = i2 + 1;
                i = i8;
                i2 = i8;
            }
        } else {
            str2 = str;
        }
        int length = str2.length() - 1;
        int i9 = length;
        int i10 = length;
        String str6 = str2;
        while (i9 >= 0) {
            if (str6.charAt(i10) == 'L') {
                int indexOf2 = str6.indexOf(59, i10);
                int indexOf3 = str6.indexOf(60, i10);
                if (indexOf2 == -1) {
                    indexOf2 = indexOf3;
                }
                if (indexOf3 == -1 || indexOf3 >= indexOf2) {
                    indexOf3 = indexOf2;
                }
                if (indexOf3 > i10 && (method_1543 = class_267.method_1185(class_461.method_1732(this.field_43)).method_1543((replace = str6.substring(i10 + 1, indexOf3).replace('/', '.')))) != null && !method_1543.equals(replace)) {
                    str6 = new StringBuilder().insert(0, str6.substring(0, i10 + 1)).append(method_1543.replace('.', '/')).append(str6.substring(replace.length() + i10 + 1)).toString();
                }
            }
            int i11 = i10 - 1;
            i9 = i11;
            i10 = i11;
        }
        return str6;
    }
}
