package com.allatori.ant;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_574 {
    public int field_2339;
    public class_208 field_2340;
    public List field_2341;
    public boolean field_2342;

    public int method_2009() {
        return this.field_2339;
    }

    public void method_2011(int i) {
        this.field_2339 = i;
    }

    public final String method_2010() {
        return method_2016();
    }

    public void method_2014(boolean z) {
        this.field_2342 = z;
    }

    public final String method_2016() {
        return ((class_371) this.field_2340.method_982(this.field_2339)).method_198();
    }

    public void method_2020(class_410 class_410Var) {
        if (this.field_2341 == null) {
            this.field_2341 = new ArrayList();
        }
        this.field_2341.add(class_410Var);
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0011 */
    public void method_2017(DataOutputStream dataOutputStream) {
        int i = 0;
        dataOutputStream.writeShort(this.field_2339);
        dataOutputStream.writeShort(this.field_2341.size());
        while (true) {
            int i2 = i;
            if (i < this.field_2341.size()) {
                i = i2 + 1;
                ((class_410) this.field_2341.get(i2)).method_1566(dataOutputStream);
            } else {
                return;
            }
        }
    }

    public class_574(class_78 class_78Var, class_208 class_208Var, boolean z) {
        class_574 class_574Var;
        this.field_2342 = false;
        this.field_2340 = class_208Var;
        if (!z) {
            this.field_2339 = class_78Var.method_47();
            class_574Var = this;
        } else {
            this.field_2339 = class_208Var.method_1004(class_78Var.method_198());
            class_574Var = this;
        }
        class_574Var.field_2342 = class_78Var.method_424();
        this.field_2341 = method_2012(class_78Var.method_530(), class_208Var, z);
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0028 */
    public String method_2013() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("@" + method_2010() + "(");
        int i = 0;
        while (true) {
            int i2 = i;
            if (i < this.field_2341.size()) {
                stringBuffer.append(this.field_2341.get(i2));
                if (i2 + 1 < this.field_2341.size()) {
                    stringBuffer.append(",");
                }
                i = i2 + 1;
            } else {
                stringBuffer.append(")");
                return stringBuffer.toString();
            }
        }
    }

    public static class_574 method_2021(DataInputStream dataInputStream, class_208 class_208Var, boolean z) {
        class_574 class_574Var = new class_574(class_208Var);
        class_574Var.field_2339 = dataInputStream.readUnsignedShort();
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        int i = 0;
        int i2 = 0;
        while (i < readUnsignedShort) {
            int i3 = i2 + 1;
            class_574Var.method_2020(new class_410(dataInputStream.readUnsignedShort(), class_476.method_1828(dataInputStream, class_208Var), class_208Var));
            i = i3;
            i2 = i3;
        }
        class_574Var.method_2014(z);
        return class_574Var;
    }

    public class_574(class_392 class_392Var, List list, boolean z, class_208 class_208Var) {
        this.field_2342 = false;
        this.field_2340 = class_208Var;
        this.field_2339 = class_208Var.method_1004(class_392Var.method_198());
        this.field_2341 = list;
        this.field_2342 = z;
    }

    public List method_2012(class_553[] class_553VarArr, class_208 class_208Var, boolean z) {
        ArrayList arrayList = new ArrayList();
        int length = class_553VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            arrayList.add(new class_410(class_553VarArr[i2], class_208Var, z));
            i = i3;
            i2 = i3;
        }
        return arrayList;
    }

    public List method_2015() {
        return this.field_2341;
    }

    public class_574(class_208 class_208Var) {
        this.field_2342 = false;
        this.field_2340 = class_208Var;
    }

    public boolean method_2019() {
        return this.field_2342;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:2:0x0016 */
    public class_78 method_2018() {
        class_78 class_78Var = new class_78(this.field_2339, this.field_2340.method_502(), this.field_2342);
        Iterator it = this.field_2341.iterator();
        while (it.hasNext()) {
            class_78Var.method_531(((class_410) it.next()).method_1565());
        }
        return class_78Var;
    }
}
