package com.allatori.ant;

import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_125 extends class_476 {
    public List field_575;

    @Override // p000.class_476
    public String method_554() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        Iterator it = this.field_575.iterator();
        while (it.hasNext()) {
            stringBuffer.append(((class_476) it.next()).method_554());
            if (it.hasNext()) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public int method_556() {
        return this.field_575.size();
    }

    public List method_628() {
        return this.field_575;
    }

    @Override // p000.class_476
    public class_130 method_553() {
        class_130[] class_130VarArr = new class_130[this.field_575.size()];
        int i = 0;
        Iterator it = this.field_575.iterator();
        Iterator it2 = it;
        while (it2.hasNext()) {
            class_130VarArr[i] = ((class_476) it.next()).method_553();
            it2 = it;
            i++;
        }
        return new class_451(this.iIiIiiiiIi, class_130VarArr, this.IIiIIIIiii.method_502());
    }

    public class_125(class_208 class_208Var) {
        super(91, class_208Var);
        this.field_575 = new ArrayList();
    }

    public void method_629(class_476 class_476Var) {
        this.field_575.add(class_476Var);
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:7:0x0019 */
    public class_125(int i, class_130[] class_130VarArr, class_208 class_208Var) {
        super(i, class_208Var);
        if (i == 91) {
            this.field_575 = new ArrayList();
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i2 >= class_130VarArr.length) {
                    return;
                }
                i2 = i3 + 1;
                this.field_575.add(class_130VarArr[i3]);
            }
        } else {
            throw new RuntimeException("Only element values of type array can be built with this ctor");
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:2:0x0015 */
    @Override // p000.class_476
    public void method_552(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.iIiIiiiiIi);
        dataOutputStream.writeShort(this.field_575.size());
        Iterator it = this.field_575.iterator();
        while (it.hasNext()) {
            ((class_476) it.next()).method_552(dataOutputStream);
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0013 */
    public class_125(class_451 class_451Var, class_208 class_208Var, boolean z) {
        super(91, class_208Var);
        this.field_575 = new ArrayList();
        class_130[] method_1716 = class_451Var.method_1716();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i >= method_1716.length) {
                return;
            }
            i = i2 + 1;
            this.field_575.add(class_476.method_1827(method_1716[i2], class_208Var, z));
        }
    }
}
