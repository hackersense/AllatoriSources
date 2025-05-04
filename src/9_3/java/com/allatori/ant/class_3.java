package com.allatori.ant;

import java.util.Vector;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_3 extends DefaultHandler {
    public String field_11;
    public String field_12;
    public class_220 field_8;
    public String field_1 = "old";
    public String field_2 = "new";
    public String field_13 = "class";
    public String field_10 = "method";
    public String field_9 = "source";
    public String field_4 = "line";
    public String field_3 = "l";
    public String field_5 = "<init>";
    public String field_14 = "<clinit>";
    public String field_6 = "s";
    public String field_7 = "e";

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        if (this.field_13.equals(str3)) {
            String value = attributes.getValue(this.field_1);
            String value2 = attributes.getValue(this.field_2);
            this.field_8.field_823.method_1546(value2, value);
            this.field_11 = value + ".";
            this.field_12 = new StringBuilder().insert(0, value2).append(".").toString();
            this.field_8.method_1052(new StringBuilder().insert(0, this.field_12).append(this.field_5).toString(), new StringBuilder().insert(0, this.field_11).append(this.field_5).toString());
            this.field_8.method_1052(new StringBuilder().insert(0, this.field_12).append(this.field_14).toString(), new StringBuilder().insert(0, this.field_11).append(this.field_14).toString());
            return;
        }
        if (!this.field_10.equals(str3)) {
            if (this.field_9.equals(str3)) {
                this.field_8.field_821.method_1546(attributes.getValue(this.field_2), attributes.getValue(this.field_1));
                return;
            } else {
                if (this.field_4.equals(str3)) {
                    this.field_8.field_822.add(Integer.valueOf(attributes.getValue(this.field_3)));
                    return;
                }
                return;
            }
        }
        String value3 = attributes.getValue(this.field_1);
        String value4 = attributes.getValue(this.field_2);
        String substring = value3.substring(0, value3.indexOf(40));
        if (attributes.getValue(this.field_6) != null && attributes.getValue(this.field_7) != null) {
            this.field_8.method_1054(new StringBuilder().insert(0, this.field_12).append(value4).toString(), new StringBuilder().insert(0, this.field_11).append(substring).toString(), Integer.valueOf(attributes.getValue(this.field_6)).intValue(), Integer.valueOf(attributes.getValue(this.field_7)).intValue());
            return;
        }
        this.field_8.method_1052(new StringBuilder().insert(0, this.field_12).append(value4).toString(), new StringBuilder().insert(0, this.field_11).append(substring).toString());
    }

    public class_3(class_220 class_220Var) {
        this.field_8 = class_220Var;
        class_220Var.field_823 = new class_386();
        class_220Var.field_821 = new class_386();
        class_220Var.field_822 = new Vector();
    }
}
