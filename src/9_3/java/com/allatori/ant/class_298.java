package com.allatori.ant;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_298 extends DefaultHandler {
    public String field_1066;
    public String field_1067;
    public String field_1068;
    public String field_1069;
    public String field_1070;
    public final class_25 field_1071;
    public String field_1072;
    public String field_1073;
    public String field_1074;
    public String field_1075;
    public String field_1076;
    public String field_1077;
    public String field_1078;
    public class_386 field_1079;
    public String field_1080;
    public String field_1081;
    public String field_1082;

    public String method_1300(String str, class_386 class_386Var) {
        String str2 = "";
        while (str.length() > 0) {
            int indexOf = str.indexOf(76);
            int indexOf2 = str.indexOf(59);
            if (indexOf == -1 || indexOf2 == -1 || indexOf >= indexOf2) {
                str2 = new StringBuilder().insert(0, str2).append(str).toString();
                str = "";
            } else {
                String replace = str.substring(indexOf + 1, indexOf2).replace('/', '.');
                if (class_386Var.method_1543(replace) != null) {
                    replace = class_386Var.method_1543(replace);
                }
                str2 = new StringBuilder().insert(0, str2).append(str.substring(0, indexOf + 1)).append(replace.replace('.', '/')).append(";").toString();
                str = str.substring(indexOf2 + 1);
            }
        }
        return str2;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        if (this.field_1073.equals(str3)) {
            this.field_1072 = attributes.getValue(this.field_1081);
            this.field_1067 = attributes.getValue(this.field_1082);
            if (class_25.method_127()) {
                String method_2034 = class_587.method_2034(this.field_1067);
                if (class_25.method_138().method_1547(method_2034)) {
                    this.field_1067 = class_25.method_138().method_1543(method_2034) + this.field_1067.substring(method_2034.length());
                }
            }
            class_267.method_1185(class_461.method_1732(class_25.method_125(this.field_1071))).method_1546(this.field_1072, this.field_1067);
            class_267.method_1183(class_461.method_1732(class_25.method_125(this.field_1071))).method_1546(this.field_1067, this.field_1072);
            method_1296();
            return;
        }
        if (this.field_1070.equals(str3)) {
            String value = attributes.getValue(this.field_1081);
            String value2 = attributes.getValue(this.field_1082);
            String substring = value.substring(0, value.indexOf("("));
            String substring2 = value.substring(value.indexOf("("));
            class_352.method_1430(class_461.method_1731(class_25.method_125(this.field_1071))).method_1546(new StringBuilder().insert(0, this.field_1072).append("&").append(substring).append("&").append(substring2).toString(), value2);
            String sb = new StringBuilder().insert(0, this.field_1072).append("&").append(value2).append("&").append(class_587.method_2030(substring2)).toString();
            if (class_352.method_1431(class_461.method_1731(class_25.method_125(this.field_1071))).method_1547(sb)) {
                this.field_1079.method_1546(sb, this.field_1072);
            }
            class_352.method_1431(class_461.method_1731(class_25.method_125(this.field_1071))).method_1546(sb, "&");
            if (class_544.method_1924().method_1477() && !value2.equals(substring)) {
                class_352.method_1435(class_461.method_1731(class_25.method_125(this.field_1071))).method_1546(new StringBuilder().insert(0, substring).append("&").append(class_587.method_2030(substring2)).toString(), value2);
                return;
            }
            return;
        }
        if (this.field_1068.equals(str3)) {
            String value3 = attributes.getValue(this.field_1081);
            String value4 = attributes.getValue(this.field_1082);
            String substring3 = value3.substring(0, value3.indexOf(this.field_1080));
            String substring4 = value3.substring(value3.indexOf(this.field_1080) + 1);
            class_546.method_1942(class_461.method_1730(class_25.method_125(this.field_1071))).method_1546(new StringBuilder().insert(0, this.field_1072).append("&").append(substring3).append("&").append(substring4).toString(), value4);
            class_546.method_1940(class_461.method_1730(class_25.method_125(this.field_1071))).method_1546(new StringBuilder().insert(0, this.field_1072).append("&").append(value4).append("&").append(substring4).toString(), "&");
            return;
        }
        if (!this.field_1069.equals(str3)) {
            if (!this.field_1077.equals(str3)) {
                if (this.field_1074.equals(str3)) {
                    String value5 = attributes.getValue(this.field_1076);
                    class_352.method_1434(class_461.method_1731(class_25.method_125(this.field_1071))).method_1546(new StringBuilder().insert(0, value5).append("&").append(attributes.getValue(this.field_1066)).toString(), attributes.getValue(this.field_1075));
                    return;
                }
                return;
            }
            class_25.method_105(this.field_1071).method_608().add(Integer.valueOf(attributes.getValue(this.field_1078)));
            return;
        }
        class_25.method_105(this.field_1071).method_613(attributes.getValue(this.field_1081), attributes.getValue(this.field_1082));
    }

    public void method_1299() {
        XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
        xMLReader.setContentHandler(this);
        xMLReader.parse(new InputSource(new InputStreamReader(new FileInputStream(class_544.method_1924().method_1463()), "UTF-8")));
        method_1297();
        method_1295();
    }

    public void method_1295() {
        try {
            Vector vector = new Vector(this.field_1079.method_1544());
            int i = 0;
            int i2 = 0;
            while (i < vector.size()) {
                String str = (String) vector.get(i2);
                class_202 method_2102 = class_25.method_122(this.field_1071).method_2102(this.field_1079.method_1543(str));
                if (method_2102 != null) {
                    String[] method_643 = method_2102.method_643();
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < method_643.length) {
                        String str2 = method_643[i4];
                        int i5 = i4 + 1;
                        this.field_1079.method_1546(new StringBuilder().insert(0, str2).append(str.substring(str.indexOf("&"))).toString(), str2);
                        i3 = i5;
                        i4 = i5;
                    }
                }
                int i6 = i2 + 1;
                i = i6;
                i2 = i6;
            }
            Set<String> method_1544 = this.field_1079.method_1544();
            Vector vector2 = new Vector(class_352.method_1430(class_461.method_1731(class_25.method_125(this.field_1071))).method_1544());
            for (String str3 : method_1544) {
                String method_1543 = this.field_1079.method_1543(str3);
                Iterator it = vector2.iterator();
                while (it.hasNext()) {
                    String str4 = (String) it.next();
                    if (str4.startsWith(method_1543)) {
                        if (str3.substring(str3.indexOf("&") + 1, str3.lastIndexOf("&")).equals(class_352.method_1430(class_461.method_1731(class_25.method_125(this.field_1071))).method_1543(str4)) && str3.substring(str3.lastIndexOf("&") + 1).equals(class_587.method_2030(str4.substring(str4.lastIndexOf("&") + 1)))) {
                            class_352.method_1430(class_461.method_1731(class_25.method_125(this.field_1071))).method_1545(str4);
                            class_352.method_1431(class_461.method_1731(class_25.method_125(this.field_1071))).method_1545(str3);
                        }
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    public void method_1297() {
        for (String str : class_546.method_1942(class_461.method_1730(class_25.method_125(this.field_1071))).method_1544()) {
            String substring = str.substring(str.lastIndexOf("&") + 1);
            String method_1300 = method_1300(substring, class_267.method_1185(class_461.method_1732(class_25.method_125(this.field_1071))));
            if (!substring.equals(method_1300)) {
                class_546.method_1939(class_461.method_1730(class_25.method_125(this.field_1071))).method_1546(substring, method_1300);
            }
        }
        for (String str2 : class_352.method_1430(class_461.method_1731(class_25.method_125(this.field_1071))).method_1544()) {
            String substring2 = str2.substring(str2.lastIndexOf("&") + 1);
            String method_13002 = method_1300(substring2, class_267.method_1185(class_461.method_1732(class_25.method_125(this.field_1071))));
            if (!substring2.equals(method_13002)) {
                class_352.method_1433(class_461.method_1731(class_25.method_125(this.field_1071))).method_1546(substring2, method_13002);
            }
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:21:0x007f */
    public void method_1296() {
        String method_2034 = class_587.method_2034(this.field_1072);
        String method_20342 = class_587.method_2034(this.field_1067);
        if (class_544.method_1924().method_1486() && class_544.method_1924().method_1481().equals(method_20342)) {
            return;
        }
        int length = method_2034.length() - 1;
        int i = length;
        int i2 = 0;
        int i3 = length;
        while (i > 0) {
            if (method_2034.charAt(i3) == '.') {
                i2++;
            }
            int i4 = i3 - 1;
            i = i4;
            i3 = i4;
        }
        int length2 = method_20342.length() - 1;
        int i5 = length2;
        int i6 = length2;
        while (i5 > 0) {
            if (method_20342.charAt(i6) == '.') {
                i2--;
            }
            int i7 = i6 - 1;
            i5 = i7;
            i6 = i7;
        }
        if (i2 == 0) {
            class_374.method_1498(class_461.method_1729(class_25.method_125(this.field_1071))).method_1546(method_2034, method_20342);
            class_374.method_1499(class_461.method_1729(class_25.method_125(this.field_1071))).method_1546(method_20342, "&");
            while (true) {
                String str = method_2034;
                if (method_2034.lastIndexOf(46) <= 0) {
                    return;
                }
                method_2034 = str.substring(0, str.lastIndexOf(46));
                method_20342 = method_20342.substring(0, method_20342.lastIndexOf(46));
                class_374.method_1498(class_461.method_1729(class_25.method_125(this.field_1071))).method_1546(method_2034, method_20342);
                class_374.method_1499(class_461.method_1729(class_25.method_125(this.field_1071))).method_1546(method_20342, "&");
            }
        }
    }

    public class_298(class_25 class_25Var) {
        this.field_1071 = class_25Var;
        this.field_1079 = new class_386();
        this.field_1081 = "old";
        this.field_1082 = "new";
        this.field_1073 = "class";
        this.field_1070 = "method";
        this.field_1068 = "field";
        this.field_1069 = "source";
        this.field_1077 = "line";
        this.field_1078 = "l";
        this.field_1074 = "annotation";
        this.field_1076 = "oldClassName";
        this.field_1066 = "oldMethodName";
        this.field_1075 = "newMethodName";
        this.field_1080 = " ";
    }

    public class_298(class_25 class_25Var, class_113 class_113Var) {
        this(class_25Var);
    }

    public static void method_1298(class_298 class_298Var) {
        class_298Var.method_1299();
    }
}
