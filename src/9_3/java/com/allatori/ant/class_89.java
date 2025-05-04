package com.allatori.ant;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Exception;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import com.allatori.commons.AllatoriLogger;
import com.allatori.exception.class_284;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_89 extends DefaultHandler {
    public static final int field_362 = -1;
    public static final int field_365 = 2;
    public static final int field_367 = 3;
    public static final int field_371 = 1;
    public boolean field_361;
    public class_145 field_363;
    public String field_364;
    public Locator field_366;
    public int field_368;
    public String field_369;
    public final class_304 field_370;
    public boolean field_372;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:190:0x06a6 */
    public void method_563(Attributes attributes) throws class_284 {
        class_89 class_89Var;
        int i;
        class_89 class_89Var2;
        int i2;
        class_89 class_89Var3;
        int i3;
        String str;
        int i4;
        String str2;
        String str3;
        int i5;
        String str4;
        String str5;
        int i6;
        String str6;
        String str7;
        int i7;
        String str8;
        class_89 class_89Var4;
        int i8;
        class_89 class_89Var5;
        int i9;
        class_89 class_89Var6;
        int i10;
        class_89 class_89Var7;
        class_89 class_89Var8;
        class_89 class_89Var9;
        int i11;
        String str9;
        int i12;
        class_89 class_89Var10;
        int i13;
        class_89 class_89Var11;
        int i14;
        class_89 class_89Var12;
        int i15;
        String method_567 = method_567(attributes, "name", true, null, true);
        String method_5672 = method_567(attributes, "value", true, null, true);
        String method_5673 = method_567(attributes, "apply2class", false, "private+ class *", true);
        String method_5674 = method_567(attributes, "apply2method", false, "private+ *(**)", true);
        if ("string-encryption".equals(method_567)) {
            class_544.method_1937();
            if ("enable".equals(method_5672)) {
                class_544.method_1937();
                class_89Var12 = this;
                i15 = 1;
            } else if ("disable".equals(method_5672)) {
                class_544.method_1937();
                class_89Var12 = this;
                i15 = 0;
            } else if ("maximum".equals(method_5672)) {
                class_544.method_1937();
                class_89Var12 = this;
                i15 = 2;
            } else if ("maximum-with-warnings".equals(method_5672)) {
                class_544.method_1937();
                class_89Var12 = this;
                i15 = 3;
            } else {
                method_582("value", "enable", "disable", "maximum");
                class_89Var12 = this;
                i15 = 1;
            }
            class_145 method_581 = class_89Var12.method_581(method_5673, null, null, null, "apply2class");
            method_581.method_694(method_573(method_5674, null, "apply2method", null));
            class_544.method_1937().method_1694(new class_169(i15, method_581));
            return;
        }
        if ("member-reorder".equals(method_567)) {
            class_544.method_1937();
            if ("enable".equals(method_5672)) {
                class_544.method_1937();
                class_89Var11 = this;
                i14 = 1;
            } else if ("disable".equals(method_5672)) {
                class_544.method_1937();
                class_89Var11 = this;
                i14 = 0;
            } else if ("random".equals(method_5672)) {
                class_544.method_1937();
                class_89Var11 = this;
                i14 = 1;
            } else if ("alphabetical".equals(method_5672)) {
                class_544.method_1937();
                class_89Var11 = this;
                i14 = 100;
            } else if ("reverse-alphabetical".equals(method_5672)) {
                class_544.method_1937();
                class_89Var11 = this;
                i14 = 101;
            } else {
                method_562("value", "enable", "disable", "random", "alphabetical", "reverse-alphabetical");
                class_89Var11 = this;
                i14 = 1;
            }
            class_544.method_1937().method_1705(new class_169(i14, class_89Var11.method_581(method_5673, null, null, null, "apply2class")));
            return;
        }
        if ("control-flow-obfuscation".equals(method_567)) {
            if ("enable".equals(method_5672)) {
                class_89Var10 = this;
                i13 = 1;
            } else if ("disable".equals(method_5672)) {
                class_89Var10 = this;
                i13 = 0;
            } else {
                method_564("value", "enable", "disable");
                class_89Var10 = this;
                i13 = 1;
            }
            class_145 method_5812 = class_89Var10.method_581(method_5673, null, null, null, "apply2class");
            method_5812.method_694(method_573(method_5674, null, "apply2method", null));
            class_544.method_1937().method_1712(new class_169(i13, method_5812));
            return;
        }
        if ("local-variables-naming".equals(method_567)) {
            class_544.method_1924().method_1484();
            if (method_5672.contains(":")) {
                class_544.method_1924().method_1484().method_785(method_5672.substring(method_5672.indexOf(58) + 1));
                str9 = method_5672.substring(0, method_5672.indexOf(58));
            } else {
                str9 = method_5672;
            }
            if ("single-name".equals(str9)) {
                class_544.method_1924().method_1484();
                i12 = 1;
            } else if ("abc".equals(str9)) {
                class_544.method_1924().method_1484();
                i12 = 2;
            } else if ("keep".equals(str9)) {
                class_544.method_1924().method_1484();
                i12 = 3;
            } else if ("remove".equals(str9)) {
                class_544.method_1924().method_1484();
                i12 = 4;
            } else if ("keep-parameters".equals(str9)) {
                class_544.method_1924().method_1484();
                i12 = 5;
            } else if ("optimize".equals(str9)) {
                class_544.method_1924().method_1484();
                i12 = 6;
            } else {
                method_577("value", "single-name", "abc", "keep", "remove", "keep-parameters", "optimize");
                i12 = 6;
            }
            if ("private+ class *".equals(method_5673) && "private+ *(**)".equals(method_5674)) {
                class_544.method_1924().method_1484().method_781(i12);
            }
            class_145 method_5813 = method_581(method_5673, null, null, null, "apply2class");
            method_5813.method_694(method_573(method_5674, null, "apply2method", null));
            class_544.method_1924().method_1484().method_780(new class_169(i12, method_5813));
            return;
        }
        if ("packages-naming".equals(method_567)) {
            if ("abc".equals(method_5672)) {
                class_287 method_1466 = class_544.method_1924().method_1466();
                class_544.method_1924().method_1466();
                method_1466.method_1287(1);
                return;
            }
            if ("ABC".equals(method_5672)) {
                class_287 method_14662 = class_544.method_1924().method_1466();
                class_544.method_1924().method_1466();
                method_14662.method_1287(8);
                return;
            }
            if ("123".equals(method_5672)) {
                class_287 method_14663 = class_544.method_1924().method_1466();
                class_544.method_1924().method_1466();
                method_14663.method_1287(6);
                return;
            } else {
                if ("keep".equals(method_5672)) {
                    class_544.method_1924().method_1462(true);
                    return;
                }
                if (!method_5672.startsWith("custom(")) {
                    method_562("value", "abc", "ABC", "123", "keep", "custom(filename.txt)");
                    return;
                }
                class_287 method_14664 = class_544.method_1924().method_1466();
                class_544.method_1924().method_1466();
                method_14664.method_1287(7);
                class_544.method_1924().method_1466().method_1275(method_557(method_5672));
                return;
            }
        }
        if ("classes-naming".equals(method_567)) {
            if ("abc".equals(method_5672)) {
                class_287 method_14665 = class_544.method_1924().method_1466();
                class_544.method_1924().method_1466();
                method_14665.method_1273(1);
                return;
            }
            if ("ABC".equals(method_5672)) {
                class_287 method_14666 = class_544.method_1924().method_1466();
                class_544.method_1924().method_1466();
                method_14666.method_1273(8);
                return;
            }
            if ("compact".equals(method_5672)) {
                class_287 method_14667 = class_544.method_1924().method_1466();
                class_544.method_1924().method_1466();
                method_14667.method_1273(2);
                return;
            }
            if ("windows".equals(method_5672)) {
                class_287 method_14668 = class_544.method_1924().method_1466();
                class_544.method_1924().method_1466();
                method_14668.method_1273(4);
                return;
            }
            if ("iii".equals(method_5672)) {
                class_287 method_14669 = class_544.method_1924().method_1466();
                class_544.method_1924().method_1466();
                method_14669.method_1273(5);
                return;
            }
            if ("123".equals(method_5672)) {
                class_287 method_146610 = class_544.method_1924().method_1466();
                class_544.method_1924().method_1466();
                method_146610.method_1273(6);
                return;
            } else {
                if (method_5672.startsWith("custom(")) {
                    class_287 method_146611 = class_544.method_1924().method_1466();
                    class_544.method_1924().method_1466();
                    method_146611.method_1273(7);
                    class_544.method_1924().method_1466().method_1277(method_557(method_5672));
                    return;
                }
                if ("unique".equals(method_5672)) {
                    class_544.method_1924().method_1466().method_1266(true);
                    return;
                } else if ("keep-$-sign".equals(method_5672)) {
                    class_544.method_1924().method_1475(true);
                    return;
                } else {
                    method_559("value", "abc", "ABC", "compact", "windows", "iii", "123", "unique", "keep-$-sign", "custom(filename.txt)");
                    return;
                }
            }
        }
        if ("fields-naming".equals(method_567)) {
            if ("abc".equals(method_5672)) {
                class_287 method_146612 = class_544.method_1924().method_1466();
                class_544.method_1924().method_1466();
                method_146612.method_1270(1);
                return;
            }
            if ("ABC".equals(method_5672)) {
                class_287 method_146613 = class_544.method_1924().method_1466();
                class_544.method_1924().method_1466();
                method_146613.method_1270(8);
                return;
            }
            if ("compact".equals(method_5672)) {
                class_287 method_146614 = class_544.method_1924().method_1466();
                class_544.method_1924().method_1466();
                method_146614.method_1270(2);
                return;
            }
            if ("keywords".equals(method_5672)) {
                class_287 method_146615 = class_544.method_1924().method_1466();
                class_544.method_1924().method_1466();
                method_146615.method_1270(3);
                return;
            }
            if ("iii".equals(method_5672)) {
                class_287 method_146616 = class_544.method_1924().method_1466();
                class_544.method_1924().method_1466();
                method_146616.method_1270(5);
                return;
            }
            if ("123".equals(method_5672)) {
                class_287 method_146617 = class_544.method_1924().method_1466();
                class_544.method_1924().method_1466();
                method_146617.method_1270(6);
                return;
            } else {
                if ("real".equals(method_5672)) {
                    class_544.method_1924().method_1466().method_1278(true);
                    return;
                }
                if ("unique".equals(method_5672)) {
                    class_544.method_1924().method_1464(true);
                    return;
                }
                if (!method_5672.startsWith("custom(")) {
                    method_559("value", "abc", "ABC", "compact", "keywords", "iii", "123", "real", "unique", "custom(filename.txt)");
                    return;
                }
                class_287 method_146618 = class_544.method_1924().method_1466();
                class_544.method_1924().method_1466();
                method_146618.method_1270(7);
                class_544.method_1924().method_1466().method_1264(method_557(method_5672));
                return;
            }
        }
        if ("methods-naming".equals(method_567)) {
            if ("abc".equals(method_5672)) {
                class_287 method_146619 = class_544.method_1924().method_1466();
                class_544.method_1924().method_1466();
                method_146619.method_1272(1);
                return;
            }
            if ("ABC".equals(method_5672)) {
                class_287 method_146620 = class_544.method_1924().method_1466();
                class_544.method_1924().method_1466();
                method_146620.method_1272(8);
                return;
            }
            if ("compact".equals(method_5672)) {
                class_287 method_146621 = class_544.method_1924().method_1466();
                class_544.method_1924().method_1466();
                method_146621.method_1272(2);
                return;
            }
            if ("keywords".equals(method_5672)) {
                class_287 method_146622 = class_544.method_1924().method_1466();
                class_544.method_1924().method_1466();
                method_146622.method_1272(3);
                return;
            }
            if ("iii".equals(method_5672)) {
                class_287 method_146623 = class_544.method_1924().method_1466();
                class_544.method_1924().method_1466();
                method_146623.method_1272(5);
                return;
            }
            if ("123".equals(method_5672)) {
                class_287 method_146624 = class_544.method_1924().method_1466();
                class_544.method_1924().method_1466();
                method_146624.method_1272(6);
                return;
            } else {
                if ("real".equals(method_5672)) {
                    class_544.method_1924().method_1466().method_1285(true);
                    return;
                }
                if ("unique".equals(method_5672)) {
                    class_544.method_1924().method_1472(true);
                    return;
                }
                if (!method_5672.startsWith("custom(")) {
                    method_559("value", "abc", "ABC", "compact", "keywords", "iii", "123", "real", "unique", "custom(filename.txt)");
                    return;
                }
                class_287 method_146625 = class_544.method_1924().method_1466();
                class_544.method_1924().method_1466();
                method_146625.method_1272(7);
                class_544.method_1924().method_1466().method_1269(method_557(method_5672));
                return;
            }
        }
        if (!"default-package".equals(method_567)) {
            if ("force-default-package".equals(method_567)) {
                if ("enable".equals(method_5672)) {
                    class_544.method_1924().method_1459(true);
                    return;
                } else if ("disable".equals(method_5672)) {
                    class_544.method_1924().method_1459(false);
                    return;
                } else {
                    method_564("value", "enable", "disable");
                    return;
                }
            }
            if ("line-numbers".equals(method_567)) {
                if ("keep".equals(method_5672)) {
                    class_38 method_1471 = class_544.method_1924().method_1471();
                    class_544.method_1924().method_1471();
                    method_1471.method_179(2);
                    return;
                } else if ("remove".equals(method_5672)) {
                    class_38 method_14712 = class_544.method_1924().method_1471();
                    class_544.method_1924().method_1471();
                    method_14712.method_179(3);
                    return;
                } else {
                    if (!"obfuscate".equals(method_5672)) {
                        method_582("value", "keep", "remove", "obfuscate");
                        return;
                    }
                    class_38 method_14713 = class_544.method_1924().method_1471();
                    class_544.method_1924().method_1471();
                    method_14713.method_179(1);
                    return;
                }
            }
            if ("log-file".equals(method_567)) {
                if (method_5672.length() == 0) {
                    method_569("value");
                }
                if (!new File(method_5672).isAbsolute()) {
                    try {
                        String parent = new File(class_304.method_1345(this.field_370)).getCanonicalFile().getParent();
                        if (parent != null) {
                            method_5672 = new File(parent + File.separator + method_5672).getCanonicalPath();
                        }
                    } catch (Exception e) {
                        String parent2 = new File(class_304.method_1345(this.field_370)).getAbsoluteFile().getParent();
                        if (parent2 != null) {
                            method_5672 = new File(parent2 + File.separator + method_5672).getAbsolutePath();
                        }
                    }
                }
                class_544.method_1922().method_1955(method_5672);
                return;
            }
            if ("random-seed".equals(method_567)) {
                class_544.method_1937().method_1711(method_5672);
                return;
            }
            if ("incremental-obfuscation".equals(method_567)) {
                if (method_5672.length() == 0) {
                    method_569("value");
                }
                if (!new File(method_5672).isAbsolute()) {
                    try {
                        String parent3 = new File(class_304.method_1345(this.field_370)).getCanonicalFile().getParent();
                        if (parent3 != null) {
                            method_5672 = new File(parent3 + File.separator + method_5672).getCanonicalPath();
                        }
                    } catch (Exception e2) {
                        String parent4 = new File(class_304.method_1345(this.field_370)).getAbsoluteFile().getParent();
                        if (parent4 != null) {
                            method_5672 = new File(parent4 + File.separator + method_5672).getAbsolutePath();
                        }
                    }
                }
                if (!new File(method_5672).exists()) {
                    throw new class_284(this.field_370, "Cannot find file '" + method_5672 + "'. " + method_561());
                }
                class_544.method_1924().method_1479(method_5672);
                return;
            }
            if ("string-encryption-type".equals(method_567)) {
                class_544.method_1937();
                if ("fast".equals(method_5672)) {
                    class_544.method_1937();
                    class_89Var9 = this;
                    i11 = 0;
                } else if ("strong".equals(method_5672)) {
                    class_544.method_1937();
                    class_89Var9 = this;
                    i11 = 1;
                } else if (method_5672.startsWith("custom(")) {
                    class_544.method_1937();
                    int lineNumber = this.field_366.getLineNumber() + class_446.field_1779;
                    try {
                        String trim = method_5672.substring(7, method_5672.indexOf(44)).trim();
                        String substring = trim.substring(0, trim.lastIndexOf(46));
                        String substring2 = trim.substring(trim.lastIndexOf(46) + 1);
                        String trim2 = method_5672.substring(method_5672.indexOf(44) + 1, method_5672.length() - 1).trim();
                        class_544.method_1937().method_1700().put(Integer.valueOf(lineNumber), new String[]{substring, substring2, trim2.substring(0, trim2.lastIndexOf(46)), trim2.substring(trim2.lastIndexOf(46) + 1)});
                        class_89Var9 = this;
                        i11 = lineNumber;
                    } catch (Exception e3) {
                        method_582("value", "fast", "strong", "custom(ClassName.methodName, ClassName2.methodName2)");
                        class_89Var9 = this;
                        i11 = lineNumber;
                    }
                } else {
                    method_582("value", "fast", "strong", "custom(ClassName.methodName, ClassName2.methodName2)");
                    class_89Var9 = this;
                    i11 = 0;
                }
                class_145 method_5814 = class_89Var9.method_581(method_5673, null, null, null, "apply2class");
                method_5814.method_694(method_573(method_5674, null, "apply2method", null));
                class_544.method_1937().method_1696(new class_169(i11, method_5814));
                return;
            }
            if ("finalize".equals(method_567)) {
                if ("enable".equals(method_5672)) {
                    class_544.method_1937().method_1675(true);
                    return;
                } else if ("disable".equals(method_5672)) {
                    class_544.method_1937().method_1675(false);
                    return;
                } else {
                    method_564("value", "enable", "disable");
                    return;
                }
            }
            if ("anti-jd".equals(method_567) || "extensive-flow-obfuscation".equals(method_567)) {
                class_544.method_1920();
                if ("disable".equals(method_5672)) {
                    class_544.method_1920();
                    class_89Var = this;
                    i = 0;
                } else if ("normal".equals(method_5672)) {
                    class_544.method_1920();
                    class_89Var = this;
                    i = 1;
                } else if ("maximum".equals(method_5672)) {
                    class_544.method_1920();
                    class_89Var = this;
                    i = 2;
                } else {
                    method_582("value", "disable", "normal", "maximum");
                    class_89Var = this;
                    i = 1;
                }
                class_145 method_5815 = class_89Var.method_581(method_5673, null, null, null, "apply2class");
                method_5815.method_694(method_573(method_5674, null, "apply2method", null));
                class_544.method_1920().method_770(new class_169(i, method_5815));
                return;
            }
            if ("unique-renaming".equals(method_567)) {
                if ("enable".equals(method_5672)) {
                    class_544.method_1924().method_1472(true);
                    class_89Var8 = this;
                } else if ("disable".equals(method_5672)) {
                    class_544.method_1924().method_1472(false);
                    class_89Var8 = this;
                } else {
                    method_564("value", "enable", "disable");
                    class_89Var8 = this;
                }
                class_145 method_5816 = class_89Var8.method_581(method_5673, null, null, null, "apply2class");
                method_5816.method_694(method_573(method_5674, null, "apply2method", null));
                class_544.method_1924().method_1467(new class_169(class_544.method_1924().method_1477() ? 1 : 0, method_5816));
                return;
            }
            if ("randomize-names".equals(method_567)) {
                if ("enable".equals(method_5672)) {
                    class_544.method_1924().method_1457(true);
                    return;
                } else if ("disable".equals(method_5672)) {
                    class_544.method_1924().method_1457(false);
                    return;
                } else {
                    method_564("value", "enable", "disable");
                    return;
                }
            }
            if ("string-encryption-seed".equals(method_567)) {
                if (method_5672.length() == 0) {
                    method_583("value");
                    return;
                } else {
                    class_544.method_1937().method_1684(method_5672.charAt(0));
                    return;
                }
            }
            if ("string-encryption-version".equals(method_567)) {
                if ("v3".equals(method_5672)) {
                    class_446 method_1937 = class_544.method_1937();
                    class_544.method_1937();
                    method_1937.method_1713(0);
                    class_89Var7 = this;
                } else if ("v4".equals(method_5672) || "v4-per-jar".equals(method_5672)) {
                    class_446 method_19372 = class_544.method_1937();
                    class_544.method_1937();
                    method_19372.method_1713(1);
                    class_544.method_1937().method_1695(false);
                    class_544.method_1937().method_1692(false);
                    class_89Var7 = this;
                } else if ("v4-global".equals(method_5672)) {
                    class_446 method_19373 = class_544.method_1937();
                    class_544.method_1937();
                    method_19373.method_1713(1);
                    class_544.method_1937().method_1695(true);
                    class_89Var7 = this;
                } else if ("v4-per-package".equals(method_5672)) {
                    class_446 method_19374 = class_544.method_1937();
                    class_544.method_1937();
                    method_19374.method_1713(1);
                    class_544.method_1937().method_1692(true);
                    class_89Var7 = this;
                } else {
                    method_564("value", "v3", "v4");
                    class_89Var7 = this;
                }
                String method_5675 = class_89Var7.method_567(attributes, "add", false, "", true);
                String method_5676 = method_567(attributes, "noadd", false, "", true);
                class_544.method_1937().method_1690(method_5675);
                class_544.method_1937().method_1697(method_5676);
                return;
            }
            if ("version-marker".equals(method_567)) {
                if (method_5672.length() == 0) {
                    method_583("value");
                    return;
                } else {
                    class_544.method_1924().method_1466().method_1276(method_5672);
                    return;
                }
            }
            if ("fields-naming-prefix".equals(method_567)) {
                class_544.method_1924().method_1466().method_1282(method_5672);
                return;
            }
            if ("methods-naming-prefix".equals(method_567)) {
                class_544.method_1924().method_1466().method_1267(method_5672);
                return;
            }
            if ("classes-naming-prefix".equals(method_567)) {
                class_544.method_1924().method_1466().method_1284(method_5672);
                return;
            }
            if ("string-encryption-ignored-strings".equals(method_567)) {
                if (method_5672.length() == 0) {
                    method_569("value");
                }
                if (!new File(method_5672).isAbsolute()) {
                    try {
                        String parent5 = new File(class_304.method_1345(this.field_370)).getCanonicalFile().getParent();
                        if (parent5 != null) {
                            method_5672 = new File(parent5 + File.separator + method_5672).getCanonicalPath();
                        }
                    } catch (Exception e4) {
                        String parent6 = new File(class_304.method_1345(this.field_370)).getAbsoluteFile().getParent();
                        if (parent6 != null) {
                            method_5672 = new File(parent6 + File.separator + method_5672).getAbsolutePath();
                        }
                    }
                }
                if (!new File(method_5672).exists()) {
                    throw new class_284(this.field_370, "Cannot find file '" + method_5672 + "'. " + method_561());
                }
                class_544.method_1937().method_1680(method_5672);
                return;
            }
            if ("output-jar-comment".equals(method_567)) {
                if ("disable".equals(method_5672) || "false".equals(method_5672)) {
                    class_544.method_1937().method_1704(false);
                    return;
                } else if ("enable".equals(method_5672) || "true".equals(method_5672)) {
                    class_544.method_1937().method_1704(true);
                    return;
                } else {
                    class_544.method_1937().method_1693(method_5672);
                    return;
                }
            }
            if ("skip-renaming".equals(method_567)) {
                if ("enable".equals(method_5672)) {
                    class_544.method_1924().method_1470(true);
                    return;
                } else if ("disable".equals(method_5672)) {
                    class_544.method_1924().method_1470(false);
                    return;
                } else {
                    method_564("value", "enable", "disable");
                    return;
                }
            }
            if ("android-detection".equals(method_567)) {
                if ("disable".equals(method_5672) || "false".equals(method_5672)) {
                    class_544.method_1937().method_1669(false);
                    return;
                }
                return;
            }
            if ("generics".equals(method_567)) {
                if ("remove".equals(method_5672)) {
                    class_89Var6 = this;
                    i10 = 1;
                } else if ("keep".equals(method_5672)) {
                    class_89Var6 = this;
                    i10 = 0;
                } else {
                    method_564("value", "remove", "keep");
                    class_89Var6 = this;
                    i10 = 0;
                }
                class_544.method_1937().method_1691(new class_169(i10, class_89Var6.method_581(method_5673, null, null, null, "apply2class")));
                return;
            }
            if ("inner-classes".equals(method_567)) {
                if ("remove".equals(method_5672)) {
                    class_89Var5 = this;
                    i9 = 1;
                } else if ("keep".equals(method_5672)) {
                    class_89Var5 = this;
                    i9 = 0;
                } else {
                    method_564("value", "remove", "keep");
                    class_89Var5 = this;
                    i9 = 0;
                }
                class_544.method_1937().method_1676(new class_169(i9, class_89Var5.method_581(method_5673, null, null, null, "apply2class")));
                return;
            }
            if ("throws-clause".equals(method_567)) {
                if ("remove".equals(method_5672)) {
                    class_89Var4 = this;
                    i8 = 1;
                } else if ("keep".equals(method_5672)) {
                    class_89Var4 = this;
                    i8 = 0;
                } else {
                    method_564("value", "remove", "keep");
                    class_89Var4 = this;
                    i8 = 0;
                }
                class_145 method_5817 = class_89Var4.method_581(method_5673, null, null, null, "apply2class");
                method_5817.method_694(method_573(method_5674, null, "apply2method", null));
                class_544.method_1937().method_1672(new class_169(i8, method_5817));
                return;
            }
            if ("synthetize-fields".equals(method_567)) {
                if ("disable".equals(method_5672) || "none".equals(method_5672)) {
                    str7 = "private+";
                    i7 = 0;
                    str8 = "private+";
                } else {
                    if ("enable".equals(method_5672) || "all".equals(method_5672)) {
                        method_5672 = "private+";
                    }
                    str7 = method_5672;
                    i7 = 1;
                    str8 = method_5672;
                }
                String sb = str7.indexOf(32) == -1 ? str8 + " *" : str8;
                class_145 method_5818 = method_581(method_5673, null, null, null, "apply2class");
                try {
                    method_5818.method_689(new class_102(sb, false));
                    class_544.method_1929().method_894(new class_169(i7, method_5818));
                    return;
                } catch (Exception e5) {
                    throw new class_284(this.field_370, "Invalid 'synthetize-fields' property. "+method_561());
                }
            }
            if ("synthetize-methods".equals(method_567)) {
                if ("disable".equals(method_5672) || "none".equals(method_5672)) {
                    str5 = "private+";
                    i6 = 0;
                    str6 = "private+";
                } else {
                    if ("enable".equals(method_5672) || "all".equals(method_5672)) {
                        method_5672 = "private+";
                    }
                    str5 = method_5672;
                    i6 = 1;
                    str6 = method_5672;
                }
                String sb2 = str5.indexOf(40) == -1 ? str6 + " *(**)" : str6;
                class_145 method_5819 = method_581(method_5673, null, null, null, "apply2class");
                try {
                    method_5819.method_694(new class_269(sb2, false));
                    class_544.method_1929().method_893(new class_169(i6, method_5819));
                    return;
                } catch (Exception e6) {
                    throw new class_284(this.field_370, "Invalid 'synthetize-methods' property. " + method_561());
                }
            }
            if ("set-fields-to-public".equals(method_567)) {
                if ("disable".equals(method_5672) || "none".equals(method_5672)) {
                    str3 = "private+";
                    i5 = 0;
                    str4 = "private+";
                } else {
                    if ("enable".equals(method_5672) || "all".equals(method_5672)) {
                        method_5672 = "private+";
                    }
                    str3 = method_5672;
                    i5 = 1;
                    str4 = method_5672;
                }
                String sb3 = str3.indexOf(32) == -1 ? str4 + " *" : str4;
                class_145 method_58110 = method_581(method_5673, null, null, null, "apply2class");
                try {
                    method_58110.method_689(new class_102(sb3, false));
                    class_544.method_1931().method_1734(new class_169(i5, method_58110));
                    return;
                } catch (Exception e7) {
                    throw new class_284(this.field_370, "Invalid 'set-fields-to-public' property. " + method_561());
                }
            }
            if ("set-methods-to-public".equals(method_567)) {
                if ("disable".equals(method_5672) || "none".equals(method_5672)) {
                    str = "private+";
                    i4 = 0;
                    str2 = "private+";
                } else {
                    if ("enable".equals(method_5672) || "all".equals(method_5672)) {
                        method_5672 = "private+";
                    }
                    str = method_5672;
                    i4 = 1;
                    str2 = method_5672;
                }
                String sb4 = str.indexOf(40) == -1 ? str2 + " *(**)" : str2;
                class_145 method_58111 = method_581(method_5673, null, null, null, "apply2class");
                try {
                    method_58111.method_694(new class_269(sb4, false));
                    class_544.method_1931().method_1736(new class_169(i4, method_58111));
                    return;
                } catch (Exception e8) {
                    throw new class_284(this.field_370, "Invalid 'set-methods-to-public' property. " + method_561());
                }
            }
            if ("remove-calls".equals(method_567)) {
                if (method_5672.length() < 3 || !method_5672.contains(".") || method_5672.startsWith(".") || method_5672.endsWith(".")) {
                    method_569("value");
                }
                String substring3 = method_5672.substring(0, method_5672.lastIndexOf(46));
                String substring4 = method_5672.substring(method_5672.lastIndexOf(46) + 1);
                class_145 method_58112 = method_581(method_5673, null, null, null, "apply2class");
                method_58112.method_694(method_573(method_5674, null, "apply2method", null));
                class_544.method_1932().method_1209(new class_169(555, method_58112), substring3, substring4);
                return;
            }
            if ("remove-annotations".equals(method_567)) {
                if (method_5672.length() < 1 || method_5672.startsWith(".") || method_5672.endsWith(".")) {
                    method_569("value");
                }
                class_544.method_1928().method_1400(new class_169(555, method_581(method_5673, null, null, null, "apply2class")), method_5672);
                return;
            }
            if ("remove-toString".equals(method_567)) {
                if ("enable".equals(method_5672)) {
                    class_89Var3 = this;
                    i3 = 1;
                } else if ("disable".equals(method_5672)) {
                    class_89Var3 = this;
                    i3 = 0;
                } else {
                    method_564("value", "enable", "disable");
                    class_89Var3 = this;
                    i3 = 0;
                }
                class_544.method_1925().method_1838(new class_169(i3, class_89Var3.method_581(method_5673, null, null, null, "apply2class")));
                return;
            }
            if ("keep-package-names".equals(method_567)) {
                if ("enable".equals(method_5672)) {
                    class_544.method_1924().method_1462(true);
                    return;
                } else if ("disable".equals(method_5672)) {
                    class_544.method_1924().method_1462(false);
                    return;
                } else {
                    method_564("value", "enable", "disable");
                    return;
                }
            }
            if ("compatible-renaming".equals(method_567)) {
                if ("enable".equals(method_5672)) {
                    class_544.method_1924().method_1465(true);
                    return;
                } else if ("disable".equals(method_5672)) {
                    class_544.method_1924().method_1465(false);
                    return;
                } else {
                    method_564("value", "enable", "disable");
                    return;
                }
            }
            if ("java6".equals(method_567)) {
                if ("enable".equals(method_5672)) {
                    class_544.method_1937().method_1701(true);
                    return;
                } else if ("disable".equals(method_5672)) {
                    class_544.method_1937().method_1701(false);
                    return;
                } else {
                    method_564("value", "enable", "disable");
                    return;
                }
            }
            if ("update-resource-names".equals(method_567)) {
                if ("enable".equals(method_5672)) {
                    class_544.method_1924().method_1480().method_1858(true);
                    return;
                } else if ("disable".equals(method_5672)) {
                    class_544.method_1924().method_1480().method_1858(false);
                    return;
                } else {
                    method_564("value", "enable", "disable");
                    return;
                }
            }
            if ("update-resource-contents".equals(method_567)) {
                String method_5677 = method_567(attributes, "apply2file", false, "*", true);
                if ("enable".equals(method_5672)) {
                    class_544.method_1924().method_1480().method_1856(method_5677, true, "UTF-8");
                    return;
                }
                if ("disable".equals(method_5672)) {
                    class_544.method_1924().method_1480().method_1856(method_5677, false, "UTF-8");
                    return;
                }
                if (!method_5672.startsWith("enable:")) {
                    method_582("value", "enable", "enable:ENCODING", "disable");
                    return;
                }
                String substring5 = method_5672.substring(7);
                try {
                    Charset.forName(substring5);
                    class_544.method_1924().method_1480().method_1856(method_5677, true, substring5);
                    return;
                } catch (Exception e9) {
                    throw new class_284(this.field_370, "Invalid encoding '" + substring5 + "'. " + method_561());
                }
            }
            if ("com-license4j-support".equals(method_567)) {
                if (method_5672 == null || method_5672.length() <= 0) {
                    method_569("value");
                    return;
                } else {
                    class_544.method_1919().method_143(method_5672);
                    return;
                }
            }
            if ("output-jar-compression-level".equals(method_567)) {
                try {
                    int intValue = Integer.valueOf(method_5672).intValue();
                    if (intValue < -1 || intValue > 9) {
                        method_569("value");
                    } else {
                        class_544.method_1922().method_1960(intValue);
                    }
                    return;
                } catch (Exception e10) {
                    method_569("value");
                    return;
                }
            }
            if ("output-jar-duplicate-name-entries".equals(method_567)) {
                if ("keep".equals(method_5672)) {
                    class_544.method_1922().method_1958(true);
                    return;
                } else if ("remove".equals(method_5672)) {
                    class_544.method_1922().method_1958(false);
                    return;
                } else {
                    method_564("value", "remove", "keep");
                    return;
                }
            }
            if (!"test".equals(method_567)) {
                if (!"test-string".equals(method_567)) {
                    throw new class_284(this.field_370, "Unknown property '" + method_567 + "'. " + method_561());
                }
                if (method_5672 == null || method_5672.length() <= 0) {
                    method_569("value");
                    return;
                } else {
                    class_544.method_1930().method_1758(method_5672);
                    return;
                }
            }
            if ("enable".equals(method_5672)) {
                class_89Var2 = this;
                i2 = 1;
            } else if ("disable".equals(method_5672)) {
                class_89Var2 = this;
                i2 = 0;
            } else {
                method_564("value", "enable", "disable");
                class_89Var2 = this;
                i2 = 0;
            }
            class_145 method_58113 = class_89Var2.method_581(method_5673, null, null, null, "apply2class");
            method_58113.method_694(method_573(method_5674, null, "apply2method", null));
            class_544.method_1930().method_1756(new class_169(i2, method_58113));
            return;
        }
        String method_5678 = method_567(attributes, "value", true, null, false);
        while (true) {
            String str10 = method_5678;
            if (!method_5678.endsWith(".")) {
                class_544.method_1924().method_1476(str10);
                return;
            }
            method_5678 = str10.substring(0, str10.length() - 1);
        }
    }

    public class_89(class_304 class_304Var) {
        this.field_370 = class_304Var;
        this.field_368 = -1;
        this.field_372 = false;
        this.field_369 = "";
        this.field_364 = "";
        this.field_366 = new class_2(this);
        this.field_361 = true;
    }

    public class_89(class_304 class_304Var, class_122 class_122Var) {
        this(class_304Var);
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:42:0x0199 */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws class_284 {
        if (!"config".equals(str3) && !"keep-names".equals(str3)) {
            if ("ignore-classes".equals(str3)) {
                this.field_372 = true;
                return;
            }
            if (!"jars".equals(str3) && !"input".equals(str3)) {
                if ("jar".equals(str3) && this.field_368 == 1) {
                    try {
                        method_565(method_567(attributes, "in", true, "", true), method_567(attributes, "out", !class_544.method_1935().method_235(), "", true));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
                if ("nested".equals(str3) && this.field_368 == 1) {
                    method_584(method_567(attributes, "in", true, "", true));
                    return;
                }
                if (!"dir".equals(str3) || this.field_368 != 1) {
                    if (!"jar".equals(str3) || this.field_368 != 2) {
                        if (!"classpath".equals(str3)) {
                            if ("class".equals(str3)) {
                                this.field_368 = 3;
                                this.field_363 = method_581(method_567(attributes, "template", false, null, true), method_567(attributes, "access", false, null, true), method_567(attributes, "ignore", false, null, true), method_567(attributes, "stop", false, null, true), "template");
                                if (!this.field_372) {
                                    class_544.method_1924().method_1468().method_1219(this.field_363);
                                    return;
                                } else {
                                    class_544.method_1927().method_102(this.field_363);
                                    return;
                                }
                            }
                            if (!"field".equals(str3)) {
                                if ("method".equals(str3)) {
                                    String method_567 = method_567(attributes, "template", false, null, true);
                                    String method_5672 = method_567(attributes, "access", false, null, true);
                                    String method_5673 = method_567(attributes, "parameters", false, null, true);
                                    class_269 method_573 = method_573(method_567, method_5672, "template", method_567(attributes, "stop", false, null, true));
                                    if (this.field_368 != 3) {
                                        class_544.method_1924().method_1468().method_1218(method_573);
                                        if ("keep".equals(method_5673)) {
                                            try {
                                                class_145 class_145Var = new class_145("class *", false, false);
                                                class_145Var.method_694(method_573);
                                                class_166 method_1484 = class_544.method_1924().method_1484();
                                                class_544.method_1924().method_1484();
                                                method_1484.method_780(new class_169(5, class_145Var));
                                                return;
                                            } catch (Exception e) {
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    if (this.field_363 != null) {
                                        this.field_363.method_694(method_573);
                                        if ("keep".equals(method_5673)) {
                                            class_145 method_690 = this.field_363.method_690();
                                            method_690.method_694(method_573);
                                            class_166 method_14842 = class_544.method_1924().method_1484();
                                            class_544.method_1924().method_1484();
                                            method_14842.method_780(new class_169(5, method_690));
                                            return;
                                        }
                                        return;
                                    }
                                    throw new class_284(this.field_370, "Error in configuration. " + method_561());
                                }
                                if (!"watermark".equals(str3)) {
                                    if (!"property".equals(str3)) {
                                        if ("trial".equals(str3)) {
                                            String method_5674 = method_567(attributes, "class", true, null, true);
                                            String method_5675 = method_567(attributes, "method", true, null, true);
                                            class_544.method_1936().method_4(method_5674);
                                            class_544.method_1936().method_7(method_5675);
                                            class_145 method_581 = method_581(method_567(attributes, "add2class", false, "private+ class *", true), null, null, null, "add2class");
                                            class_544.method_1936().method_8(new class_169(1, method_581));
                                            method_581.method_694(method_573(method_567(attributes, "add2method", false, "private+ <init>(**)", true), null, "add2method", null));
                                            String method_5676 = method_567(attributes, "passthis", false, "no", true);
                                            if ("yes".equals(method_5676) || "true".equals(method_5676)) {
                                                class_544.method_1936().method_5(true);
                                                return;
                                            } else {
                                                class_544.method_1936().method_5(false);
                                                return;
                                            }
                                        }
                                        if ("expiry".equals(str3)) {
                                            Matcher matcher = Pattern.compile("(\\d{4}).(\\d{2}).(\\d{2})").matcher(method_567(attributes, "date", true, null, true));
                                            if (!matcher.matches()) {
                                                throw new class_284(this.field_370, "Date format is yyyy-mm-dd. " + method_561());
                                            }
                                            try {
                                                Calendar calendar = Calendar.getInstance();
                                                int parseInt = Integer.parseInt(matcher.group(1));
                                                int parseInt2 = Integer.parseInt(matcher.group(2));
                                                int parseInt3 = Integer.parseInt(matcher.group(3));
                                                if (parseInt2 > 12 || parseInt3 > 31) {
                                                    throw new Exception();
                                                }
                                                calendar.set(parseInt, parseInt2 - 1, parseInt3, 0, 0, 0);
                                                Date time = calendar.getTime();
                                                class_544.method_1923().method_1873(time);
                                                AllatoriLogger.method_683("Expiry date set to " + new SimpleDateFormat("MMMMM dd, yyyy").format(time));
                                                class_544.method_1923().method_1875(method_567(attributes, "string", true, null, true));
                                                class_145 method_5812 = method_581(method_567(attributes, "add2class", false, "private+ class *", true), null, null, null, "add2class");
                                                class_544.method_1923().method_1870(new class_169(1, method_5812));
                                                String method_5677 = method_567(attributes, "add2method", false, "no input value", true);
                                                if (!"no input value".equals(method_5677)) {
                                                    method_5812.method_694(method_573(method_5677, null, "add2method", null));
                                                    return;
                                                } else {
                                                    method_5812.method_694(method_573("private+ <init>(**)", null, "add2method", null));
                                                    method_5812.method_694(method_573("public static void main(**)", null, "add2method", null));
                                                    return;
                                                }
                                            } catch (Exception e2) {
                                                throw new class_284(this.field_370, "Date format is yyyy-mm-dd. " + method_561());
                                            }
                                        }
                                        throw new class_284(this.field_370, "Unknown tag '" + str3 + "'. " + method_561());
                                    }
                                    method_563(attributes);
                                    return;
                                }
                                String method_5678 = method_567(attributes, "key", true, null, false);
                                if ("".equals(method_5678)) {
                                    method_583("key");
                                }
                                class_544.method_1935().method_237(method_5678);
                                if (!class_544.method_1935().method_235()) {
                                    String method_5679 = method_567(attributes, "value", true, null, false);
                                    if ("".equals(method_5679)) {
                                        method_583("value");
                                    }
                                    class_544.method_1935().method_232(method_5679);
                                    return;
                                }
                                return;
                            }
                            class_102 method_566 = method_566(method_567(attributes, "template", false, null, true), method_567(attributes, "access", false, null, true), method_567(attributes, "stop", false, null, true));
                            if (this.field_368 != 3) {
                                class_544.method_1924().method_1468().method_1224(method_566);
                                return;
                            } else {
                                if (this.field_363 != null) {
                                    this.field_363.method_689(method_566);
                                    return;
                                }
                                throw new class_284(this.field_370, "Error in configuration. " + method_561());
                            }
                        }
                        this.field_368 = 2;
                        this.field_364 = method_567(attributes, "basedir", false, "", true);
                        this.field_364 = method_571(this.field_364);
                        if (!"".equals(this.field_364) && !method_568(this.field_364)) {
                            throw new class_284(this.field_370, "Invalid base directory '" + this.field_364 + "'. " + method_561());
                        }
                        return;
                    }
                    String[] split = method_567(attributes, "name", true, "", true).split(File.pathSeparator);
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        if (i < split.length) {
                            i = i2 + 1;
                            method_580(split[i2]);
                        } else {
                            return;
                        }
                    }
                } else {
                    try {
                        method_576(method_567(attributes, "in", true, "", true), method_567(attributes, "out", !class_544.method_1935().method_235(), "", true));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            } else {
                this.field_368 = 1;
                this.field_369 = method_567(attributes, "basedir", false, "", true);
                this.field_369 = method_571(this.field_369);
                if ("".equals(this.field_369) || method_568(this.field_369)) {
                    String method_56710 = method_567(attributes, "single-jar", false, null, true);
                    if (method_56710 != null && !new File(method_56710).isAbsolute()) {
                        try {
                            method_56710 = new File(this.field_369 + File.separator + method_56710).getCanonicalPath();
                        } catch (Exception e3) {
                            method_56710 = new File(this.field_369 + File.separator + method_56710).getAbsolutePath();
                        }
                    }
                    class_544.method_1918().method_15(method_56710);
                    return;
                }
                throw new class_284(this.field_370, "Invalid base directory '" + this.field_369 + "'. " + method_561());
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
        if (locator == null) {
            return;
        }
        this.field_366 = locator;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        if ("jars".equals(str3) || "input".equals(str3) || "classpath".equals(str3) || "class".equals(str3)) {
            this.field_368 = -1;
        } else {
            if (!"ignore-classes".equals(str3)) {
                return;
            }
            this.field_372 = false;
        }
    }

    public String method_567(Attributes attributes, String str, boolean z, String str2, boolean z2) throws class_284 {
        String value = attributes.getValue(str);
        if (value == null && z) {
            throw new class_284(this.field_370, "Missing '" + str + "' attribute. " + method_561());
        }
        if (value == null) {
            return str2;
        }
        while (value.contains("${System.getProperty(")) {
            int indexOf = value.indexOf("${System.getProperty(");
            if (indexOf >= 0) {
                int indexOf2 = value.indexOf(")}", indexOf);
                if (indexOf2 >= indexOf) {
                    String substring = value.substring(indexOf + 21, indexOf2);
                    String property = System.getProperty(substring);
                    if (property != null) {
                        value = value.substring(0, indexOf) + property + value.substring(indexOf2 + 2);
                    } else {
                        throw new class_284(this.field_370, "Missing system property '" + substring + "'. " + method_561());
                    }
                } else {
                    throw new class_284(this.field_370, "Invalid '" + str + "' attribute. " + method_561());
                }
            }
        }
        while (value.contains("${System.getenv(")) {
            int indexOf3 = value.indexOf("${System.getenv(");
            if (indexOf3 >= 0) {
                int indexOf4 = value.indexOf(")}", indexOf3);
                if (indexOf4 < indexOf3) {
                    throw new class_284(this.field_370, "Invalid '" + str + "' attribute. " + method_561());
                }
                String substring2 = value.substring(indexOf3 + 16, indexOf4);
                String str3 = System.getenv(substring2);
                if (str3 == null) {
                    throw new class_284(this.field_370, "Missing environment variable '" + substring2 + "'. " + method_561());
                }
                value = value.substring(0, indexOf3) + str3 + value.substring(indexOf4 + 2);
            }
        }
        return z2 ? value.trim() : value;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void method_565(String str, String str2) throws IOException, class_284 {
        String str3;
        if (this.field_369.length() > 0) {
            if (str != null) {
                try {
                    if (!new File(str).isAbsolute()) {
                        str = new File(this.field_369 + File.separator + str).getCanonicalPath();
                    }
                } catch (Exception e) {
                    if (str != null && !new File(str).isAbsolute()) {
                        str = new File(this.field_369 + File.separator + str).getAbsolutePath();
                    }
                    if (str2 != null && !new File(str2).isAbsolute()) {
                        str2 = new File(this.field_369 + File.separator + str2).getAbsolutePath();
                        str3 = str;
                    }
                }
            }
            if (str2 != null && !new File(str2).isAbsolute()) {
                str2 = new File(this.field_369 + File.separator + str2).getCanonicalPath();
                str3 = str;
                if (str3 != null || str3.indexOf("*") == -1) {
                    if (new File(str3).exists()) {
                        throw new class_284(this.field_370, "Cannot find file '" + str3 + "'. " + method_561());
                    }
                    class_544.method_1918().method_17(new class_137(str3, str2));
                    return;
                }
                String str4 = ".";
                if (str3.indexOf(File.separator) >= 0 || str3.indexOf(47) >= 0) {
                    int lastIndexOf = str3.lastIndexOf(File.separator);
                    if (str3.lastIndexOf(47) > lastIndexOf) {
                        lastIndexOf = str3.lastIndexOf(47);
                    }
                    String substring = str3.substring(0, lastIndexOf);
                    str3 = str3.substring(lastIndexOf + 1);
                    str4 = substring;
                }
                File file = new File(str4);
                if (!file.isDirectory()) {
                    throw new class_284(this.field_370, "Cannot find directory '" + str4 + "'. " + method_561());
                }
                Pattern compile = Pattern.compile(str3.replaceAll("\\.", "\\\\.").replaceAll("\\*", "(.*)"));
                File[] listFiles = file.listFiles();
                int length = listFiles.length - 1;
                int i = length;
                int i2 = length;
                while (i >= 0) {
                    File file2 = listFiles[i2];
                    if (!file2.isDirectory()) {
                        Matcher matcher = compile.matcher(file2.getName());
                        if (matcher.matches()) {
                            class_544.method_1918().method_17(new class_137(file2.getAbsolutePath(), str2 != null ? str2.replaceFirst("\\*", matcher.group(1)) : null));
                        }
                    }
                    int i3 = i2 - 1;
                    i = i3;
                    i2 = i3;
                }
                return;
            }
        }
        str3 = str;
        if (str3 != null) {
        }
        if (new File(str3).exists()) {
        }
    }

    public boolean method_568(String str) {
        return str.length() > 0 && new File(str).isDirectory();
    }

    public String method_571(String str) {
        if (!"".equals(str) && new File(str).isAbsolute()) {
            return str;
        }
        try {
            String parent = new File(class_304.method_1345(this.field_370)).getCanonicalFile().getParent();
            return parent != null ? new File(parent + File.separator + str).getCanonicalPath() : str;
        } catch (Exception e) {
            String parent2 = new File(class_304.method_1345(this.field_370)).getAbsoluteFile().getParent();
            return parent2 != null ? new File(parent2 + File.separator + str).getAbsolutePath() : str;
        }
    }

    public String method_561() {
        return "[Line: " + this.field_366.getLineNumber() + "]";
    }

    public void method_564(String str, String str2, String str3) throws class_284 {
        throw new class_284(this.field_370, "Attribute '" + str + "' should have one of the following values: '" + str2 + "' or '" + str3 + "'. " + method_561());
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:7:0x003b */
    public void method_580(String str) throws class_284 {
        String str2;
        boolean z;
        String str3;
        if (this.field_364.length() > 0 && !new File(str).isAbsolute()) {
            try {
                str = new File(this.field_364 + File.separator + str).getCanonicalPath();
            } catch (Exception e) {
                str = new File(this.field_364 + File.separator + str).getAbsolutePath();
            }
        }
        while (true) {
            str2 = str;
            if (!str.endsWith(File.separator)) {
                break;
            } else {
                str = str2.substring(0, str2.length() - File.separator.length());
            }
        }
        if (str2.indexOf(42) == -1) {
            class_544.method_1938().method_1866(str2);
            return;
        }
        String str4 = ".";
        if (str2.indexOf(File.separator) >= 0 || str2.indexOf(47) >= 0) {
            int lastIndexOf = str2.lastIndexOf(File.separator);
            if (str2.lastIndexOf(47) > lastIndexOf) {
                lastIndexOf = str2.lastIndexOf(47);
            }
            String substring = str2.substring(0, lastIndexOf);
            str2 = str2.substring(lastIndexOf + 1);
            str4 = substring;
        }
        if (str4.endsWith("**")) {
            str3 = str4.substring(0, str4.length() - 2);
            z = true;
        } else {
            z = false;
            str3 = str4;
        }
        File file = new File(str3);
        if (file.isDirectory()) {
            method_578(file, str2.replaceAll("\\.", "\\\\.").replaceAll("\\*", ".*"), z);
            return;
        }
        throw new class_284(this.field_370, "Cannot find directory '" + str3 + "'. " + method_561());
    }

    public String[] method_557(String str) throws class_284 {
        String substring = str.substring(7, str.length() - 1);
        File file = new File(substring);
        if (!file.isAbsolute()) {
            try {
                String parent = new File(class_304.method_1345(this.field_370)).getCanonicalFile().getParent();
                if (parent != null) {
                    substring = new File(parent + File.separator + substring).getCanonicalPath();
                }
            } catch (Exception e) {
                String parent2 = new File(class_304.method_1345(this.field_370)).getAbsoluteFile().getParent();
                if (parent2 != null) {
                    substring = new File(parent2 + File.separator + substring).getAbsolutePath();
                }
            }
            file = new File(substring);
        }
        if (file.exists()) {
            try {
                String[] method_1403 = class_344.method_1403(file, "UTF-8", true);
                if (method_1403 != null && method_1403.length != 0) {
                    return method_1403;
                }
                throw new class_284(this.field_370, "File '" + substring + "' is empty. " + method_561());
            } catch (Exception e2) {
                throw new class_284(this.field_370, e2.getMessage() + " " + method_561());
            }
        }
        throw new class_284(this.field_370, "Cannot find file '" + substring + "'. " + method_561());
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:17:0x00af */
    public void method_560(String str, String str2) throws IOException {
        Pattern compile = Pattern.compile(str2.replaceAll("\\.", "\\\\.").replaceAll("\\*", "(.*)"));
        String sb = method_571("allatori-tmp-nested") + File.separator;
        File file = new File(sb);
        if (this.field_361) {
            this.field_361 = false;
            if (file.exists()) {
                File[] listFiles = file.listFiles();
                int length = listFiles.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    listFiles[i2].delete();
                    i = i3;
                    i2 = i3;
                }
            } else {
                new File(sb).mkdirs();
            }
        }
        JarFile jarFile = new JarFile(str);
        Enumeration<JarEntry> entries = jarFile.entries();
        while (entries.hasMoreElements()) {
            JarEntry nextElement = entries.nextElement();
            if (!nextElement.isDirectory() && compile.matcher(nextElement.getName()).matches()) {
                String name = new File(nextElement.getName()).getName();
                byte[] bArr = new byte[262144];
                FileOutputStream fileOutputStream = new FileOutputStream(sb + name);
                InputStream inputStream = jarFile.getInputStream(nextElement);
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    } else {
                        fileOutputStream.write(bArr, 0, read);
                    }
                }
                fileOutputStream.close();
                inputStream.close();
                class_544.method_1918().method_13(new class_566(sb + name, sb + name + ".obf", str, nextElement.getName()));
            }
        }
        jarFile.close();
    }

    public void method_582(String str, String str2, String str3, String str4) throws class_284 {
        throw new class_284(this.field_370, "Attribute '" + str + "' should have one of the following values: '" + str2 + "', '" + str3 + "' or '" + str4 + "'. " + method_561());
    }

    public void method_584(String str) throws class_284 {
        if (class_544.method_1918().method_14().size() == 0) {
            throw new class_284(this.field_370, "Cannot find parent jar. " + method_561());
        }
        class_137 class_137Var = (class_137) class_544.method_1918().method_14().lastElement();
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        try {
            method_560(class_137Var.field_617, str);
        } catch (Exception e) {
            throw new class_284(this.field_370, e.getMessage() + " " + method_561());
        }
    }

    public void method_578(File file, String str, boolean z) {
        File[] listFiles = file.listFiles();
        int length = listFiles.length - 1;
        int i = length;
        int i2 = length;
        while (i >= 0) {
            File file2 = listFiles[i2];
            if (!file2.isDirectory() && file2.getName().matches(str)) {
                class_544.method_1938().method_1866(file2.getAbsolutePath());
            }
            if (z && file2.isDirectory()) {
                method_578(file2, str, z);
            }
            int i3 = i2 - 1;
            i = i3;
            i2 = i3;
        }
    }

    public void method_559(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) throws class_284 {
        throw new class_284(this.field_370, "Attribute '" + str + "' should have one of the following values: '" + str2 + "', '" + str3 + "', '" + str4 + "', '" + str5 + "', '" + str6 + "', '" + str7 + "', '" + str8 + "', '" + str9 + "' or '" + str10 + "'. " + method_561());
    }

    public void method_558(String str, String str2) throws class_284 {
        if (str == null && str2 == null) {
            method_570("template", "access");
        }
    }

    public class_145 method_581(String str, String str2, String str3, String str4, String str5) throws class_284 {
        boolean z = false;
        boolean z2 = false;
        method_558(str, str2);
        try {
            if (str3 != null) {
                if ("yes".equals(str3) || "true".equals(str3)) {
                    z2 = true;
                } else if ("keep-if-members-match".equals(str3)) {
                    z = true;
                    z2 = false;
                } else if (!"no".equals(str3)) {
                    if ("false".equals(str3)) {
                        z = false;
                        z2 = false;
                    } else {
                        method_562("ignore", "true", "false", "yes", "no", "keep-if-members-match");
                    }
                }
                return new class_145(method_575(str, str2, " class *"), z2, !"yes".equals(str4) || "true".equals(str4), z);
            }
            return new class_145(method_575(str, str2, " class *"), z2, !"yes".equals(str4) || "true".equals(str4), z);
        } catch (Exception e) {
            if (str != null) {
                try {
                    method_569(str5);
                } catch (class_284 ex) {
                    e.printStackTrace();
                }
            } else {
                try {
                    method_569("access");
                } catch (class_284 ex) {
                    e.printStackTrace();
                }
            }
            return null;
        }
//        z = false;
//        z2 = false;
    }

    public void method_569(String str) throws class_284 {
        throw new class_284(this.field_370, "Invalid '" + str + "' attribute. " + method_561());
    }

    public void method_583(String str) throws class_284 {
        throw new class_284(this.field_370, "Attribute '" + str + "' cannot have zero length. " + method_561());
    }

    public void method_576(String str, String str2) throws class_284, IOException {
        if (this.field_369.length() > 0) {
            if (str != null) {
                try {
                    if (!new File(str).isAbsolute()) {
                        str = new File(this.field_369 + File.separator + str).getCanonicalPath();
                    }
                } catch (Exception e) {
                    if (str != null && !new File(str).isAbsolute()) {
                        str = new File(this.field_369 + File.separator + str).getAbsolutePath();
                    }
                    if (str2 != null && !new File(str2).isAbsolute()) {
                        str2 = new File(this.field_369 + File.separator + str2).getAbsolutePath();
                    }
                }
            }
            if (str2 != null && !new File(str2).isAbsolute()) {
                str2 = new File(this.field_369 + File.separator + str2).getCanonicalPath();
            }
        }
        if (!new File(str).exists()) {
            throw new class_284(this.field_370, "Cannot find directory '" + str + "'. " + method_561());
        }
        if (!new File(str).isDirectory()) {
            throw new class_284(this.field_370, "Cannot find directory '" + str + "'. " + method_561());
        }
        class_544.method_1918().method_11(new class_414(str, str2));
    }

    public class_102 method_566(String str, String str2, String str3) throws class_284 {
        method_558(str, str2);
        try {
            return new class_102(method_575(str, str2, " *"), "yes".equals(str3) || "true".equals(str3));
        } catch (Exception e) {
            if (str == null) {
                method_569("access");
            } else {
                method_569("template");
            }
            return null;
        }
    }

    public class_269 method_573(String str, String str2, String str3, String str4) throws class_284 {
        method_558(str, str2);
        try {
            return new class_269(method_575(str, str2, " *(**)"), "yes".equals(str4) || "true".equals(str4));
        } catch (Exception e) {
            if (str != null) {
                method_569(str3);
            } else {
                method_569("access");
            }
            return null;
        }
    }

    public void method_562(String str, String str2, String str3, String str4, String str5, String str6) throws class_284 {
        throw new class_284(this.field_370, "Attribute '" + str + "' should have one of the following values: '" + str2 + "', '" + str3 + "', '" + str4 + "', '" + str5 + "' or '" + str6 + "'. " + method_561());
    }

    public void method_572(String str, String str2, String str3, String str4, String str5) throws class_284 {
        throw new class_284(this.field_370, "Attribute '" + str + "' should have one of the following values: '" + str2 + "', '" + str3 + "', '" + str4 + "' or '" + str5 + "'. " + method_561());
    }

    public void method_577(String str, String str2, String str3, String str4, String str5, String str6, String str7) throws class_284 {
        throw new class_284(this.field_370, "Attribute '" + str + "' should have one of the following values: '" + str2 + "', '" + str3 + "', '" + str4 + "', '" + str5 + "', '" + str6 + "' or '" + str7 + "'. " + method_561());
    }

    public void method_579(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) throws class_284 {
        throw new class_284(this.field_370, "Attribute '" + str + "' should have one of the following values: '" + str2 + "', '" + str3 + "', '" + str4 + "', '" + str5 + "', '" + str6 + "', '" + str7 + "', '" + str8 + "' or '" + str9 + "'. " + method_561());
    }

    public void method_574(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) throws class_284 {
        throw new class_284(this.field_370, "Attribute '" + str + "' should have one of the following values: '" + str2 + "', '" + str3 + "', '" + str4 + "', '" + str5 + "', '" + str6 + "', '" + str7 + "' or '" + str8 + "'. " + method_561());
    }

    public void method_570(String str, String str2) throws class_284 {
        throw new class_284(this.field_370,
                "Either '" + str + "' or '" + str2 + "' attribute should be defined. " + method_561());
    }

    public String method_575(String str, String str2, String str3) throws class_284 {
        if (str != null) {
            return str;
        }
        if (!class_268.method_1197(str2)) {
            method_569("access");
        }
        return str2 + str3;
    }
}
