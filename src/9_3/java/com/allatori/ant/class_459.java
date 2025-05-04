package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.interfaces.unmapped.class_194;
import com.allatori.interfaces.unmapped.class_570;
import com.allatori.interfaces.unmapped.class_601;
import com.allatori.interfaces.unmapped.class_97;

import java.util.StringTokenizer;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_459 extends class_119 implements class_570, class_97, class_194, class_601 {
    public String method_1086(class_208 class_208Var) {
        return method_620(class_208Var);
    }

    public class_212[] method_1388(class_208 class_208Var) {
        return class_212.method_1030(method_621(class_208Var));
    }

    @Override // p000.class_418, p000.class_97
    public class_212 method_32(class_208 class_208Var) {
        return method_1085(class_208Var);
    }

    public class_459() {
    }

    @Override // p000.class_539, p000.class_601
    public int method_1387(class_208 class_208Var) {
        return method_1085(class_208Var).method_47();
    }

    @Override // p000.class_539, p000.class_194
    public int method_896(class_208 class_208Var) {
        int i;
        class_212[] class_212VarArr;
        class_212[] method_1030 = class_212.method_1030(method_621(class_208Var));
        if (this.IIiIIIIiii == 184) {
            class_212VarArr = method_1030;
            i = 0;
        } else {
            i = 1;
            class_212VarArr = method_1030;
        }
        int length = class_212VarArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            i += method_1030[i3].method_47();
            i2 = i4;
            i3 = i4;
        }
        return i;
    }

    @Override // p000.class_418, p000.class_539
    public String method_189(class_499 class_499Var) {
        StringTokenizer stringTokenizer = new StringTokenizer(class_499Var.method_1847(class_499Var.method_982(this.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE)));
        return new StringBuilder().insert(0, ASMInterface.field_1554[this.IIiIIIIiii]).append(" ").append(stringTokenizer.nextToken().replace('.', '/')).append(stringTokenizer.nextToken()).toString();
    }

    public class_212 method_1085(class_208 class_208Var) {
        return class_212.method_1033(method_621(class_208Var));
    }

    public class_459(short s, int i) {
        super(s, i);
    }
}
