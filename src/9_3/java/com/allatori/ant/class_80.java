package com.allatori.ant;

import com.allatori.commons.AllatoriLogger;
import com.allatori.commons.Info;
import com.allatori.exception.class_316;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.Vector;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_80 {
    public static StringBuffer method_545(StringBuffer stringBuffer, char c, int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = i3 + 1;
            stringBuffer.append(c);
            i2 = i4;
            i3 = i4;
        }
        return stringBuffer;
    }

    public static String method_541() {
        String sb = new StringBuilder().insert(0, "Obfuscation by ").append(Info.getName()).append(" ").append(Info.getVersion()).toString();
        String method_889 = Info.getWebsiteURL();
        int max = Math.max(31, Math.max(sb.length(), method_889.length())) + 4;
        StringBuffer stringBuffer = new StringBuffer("\n");
        method_545(stringBuffer, '#', max).append("\n#");
        method_545(stringBuffer, ' ', max - 2).append("#\n#");
        int i = ((max - 31) - 2) / 2;
        int i2 = ((max - i) - 31) - 2;
        method_545(stringBuffer, ' ', i).append(" ## #   #    ## ### ### ##  ###");
        method_545(stringBuffer, ' ', i2).append("#\n#");
        method_545(stringBuffer, ' ', i).append("# # #   #   # #  #  # # # #  # ");
        method_545(stringBuffer, ' ', i2).append("#\n#");
        method_545(stringBuffer, ' ', i).append("### #   #   ###  #  # # ##   # ");
        method_545(stringBuffer, ' ', i2).append("#\n#");
        method_545(stringBuffer, ' ', i).append("# # ### ### # #  #  ### # # ###");
        method_545(stringBuffer, ' ', i2).append("#\n#");
        method_545(stringBuffer, ' ', i).append("                               ");
        method_545(stringBuffer, ' ', i2).append("#\n#");
        method_545(stringBuffer, ' ', i).append("         DEMO VERSION!         ");
        method_545(stringBuffer, ' ', i2).append("#\n#");
        method_545(stringBuffer, ' ', i).append("    NOT FOR COMMERCIAL USE!    ");
        method_545(stringBuffer, ' ', i2).append("#\n#");
        method_545(stringBuffer, ' ', i).append("                               ");
        method_545(stringBuffer, ' ', i2).append("#\n#");
        method_545(stringBuffer, ' ', i).append("Demo version adds System.out's ");
        method_545(stringBuffer, ' ', i2).append("#\n#");
        method_545(stringBuffer, ' ', i).append("and gives 'ALLATORI_DEMO' name ");
        method_545(stringBuffer, ' ', i2).append("#\n#");
        method_545(stringBuffer, ' ', i).append("to some fields and methods.    ");
        method_545(stringBuffer, ' ', i2).append("#\n#");
        method_545(stringBuffer, ' ', max - 2).append("#\n#");
        method_545(stringBuffer, ' ', max - 2).append("#\n#");
        int length = ((max - sb.length()) - 2) / 2;
        int length2 = ((max - length) - sb.length()) - 2;
        method_545(stringBuffer, ' ', length).append(sb);
        method_545(stringBuffer, ' ', length2).append("#\n#");
        method_545(stringBuffer, ' ', max - 2).append("#\n#");
        int length3 = ((max - method_889.length()) - 2) / 2;
        int length4 = ((max - length3) - method_889.length()) - 2;
        method_545(stringBuffer, ' ', length3).append(method_889);
        method_545(stringBuffer, ' ', length4).append("#\n#");
        method_545(stringBuffer, ' ', max - 2).append("#\n");
        method_545(stringBuffer, '#', max).append("\n");
        return stringBuffer.toString();
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:10:0x0056 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:2:0x0016 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:6:0x0036 */
    public static class_606 method_540() throws IOException {
        class_606 class_606Var = new class_606(method_536());
        Iterator it = class_544.method_1918().method_16().iterator();
        while (it.hasNext()) {
            class_190.method_891(((class_566) it.next()).field_617, class_606Var);
        }
        Iterator it2 = class_544.method_1918().method_14().iterator();
        while (it2.hasNext()) {
            class_190.method_891(((class_137) it2.next()).field_617, class_606Var);
        }
        Iterator it3 = class_544.method_1918().method_10().iterator();
        while (it3.hasNext()) {
            class_414 class_414Var = (class_414) it3.next();
            class_360.method_1456(class_414Var.field_1277, class_606Var, class_414Var.field_1277);
        }

        return class_606Var;
    }

    public static boolean method_542(String str) {
        return method_538(str, false);
    }

    public static void method_534(class_606 class_606Var) {
        method_544(class_606Var);
        method_535(class_606Var);
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:2:0x0012 */
    public static void method_535(class_606 class_606Var) {
        class_314 class_314Var = new class_314();
        Iterator it = class_544.method_1918().method_10().iterator();
        while (it.hasNext()) {
            class_414 class_414Var = (class_414) it.next();
            class_314Var.method_1369(class_414Var.field_1277, class_414Var.field_1278, class_606Var);
        }
    }

    public static void method_537(class_606 class_606Var) {
        Iterator method_2108 = class_606Var.method_2108();
        while (method_2108.hasNext()) {
            class_202 class_202Var = (class_202) method_2108.next();
            if (class_202Var.method_920() > 50) {
                class_202Var.method_915(50);
            }
        }
    }

    public static void method_533(class_606 class_606Var) {
        new class_96(class_606Var, class_544.method_1935().method_234()).method_594(class_544.method_1935().method_236());
    }

    public static class_158 method_536() {
        Vector method_1865 = class_544.method_1938().method_1865();
        int i = 0;
        int i2 = 0;
        while (i < method_1865.size()) {
            try {
                method_1865.set(i2, new File((String) method_1865.get(i2)).toURL());
            } catch (Exception e) {
                e.printStackTrace();
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        return new class_158((URL[]) method_1865.toArray(new URL[0]));
    }

    public static boolean method_538(String str, boolean z) {
        try {
            class_544.method_1933(str, z);
            return true;
        } catch (Exception e) {
            if (e.getCause() != null) {
                AllatoriLogger.method_678(new StringBuilder().insert(0, "Error reading configuration. ").append(e.getCause().getMessage()).toString());
                return false;
            }
            AllatoriLogger.method_678(new StringBuilder().insert(0, "Configuration error. ").append(e.getMessage()).toString());
            return false;
        }
    }

    public static void method_543(String str) throws Exception {
        try {
            class_544.method_1921(str);
        } catch (Exception e) {
            if (e.getCause() == null) {
                throw new Exception(new StringBuilder().insert(0, "Configuration error. ").append(e.getMessage()).toString());
            }
            throw new Exception(new StringBuilder().insert(0, "Error reading configuration. ").append(e.getCause().getMessage()).toString(), e.getCause());
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:2:0x0012 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:6:0x0034 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:12:0x0064 */
    public static void method_544(class_606 class_606Var) throws Exception {
        class_31 class_31Var = new class_31();
        Iterator it = class_544.method_1918().method_16().iterator();
        while (it.hasNext()) {
            class_566 class_566Var = (class_566) it.next();
            class_31Var.method_159(class_566Var.field_617, class_566Var.field_616, class_606Var);
        }
        Iterator it2 = class_544.method_1918().method_14().iterator();
        while (it2.hasNext()) {
            class_137 class_137Var = (class_137) it2.next();
            class_31Var.method_159(class_137Var.field_617, class_137Var.field_616, class_606Var);
        }
        if (class_544.method_1918().method_12() != null) {
            Vector method_14 = class_544.method_1918().method_14();
            String[] strArr = new String[method_14.size()];
            int i = 0;
            while (true) {
                int i2 = i;
                if (i >= method_14.size()) {
                    break;
                }
                i = i2 + 1;
                strArr[i2] = ((class_137) method_14.get(i2)).field_616;
            }
            class_31Var.method_156(strArr, class_544.method_1918().method_12());
        }
        class_31Var.method_153();
    }

    public static String method_539(class_606 class_606Var) throws class_316 {
        return new class_96(class_606Var, class_544.method_1935().method_234()).method_593();
    }
}
