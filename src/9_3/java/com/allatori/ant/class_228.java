package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_228 extends class_160 {
    public static Map field_832 = new HashMap();
    public byte[] field_833;
    public String field_834;

    public class_228(int i, int i2, byte[] bArr, class_499 class_499Var) {
        super((byte) -1, i, i2, class_499Var);
        this.field_833 = bArr;
        this.field_834 = ((class_371) class_499Var.method_1849(i, (byte) 1)).method_198();
        field_832.put(this.field_834, this);
    }

    @Override // p000.class_160, p000.class_241
    public void method_163(class_21 class_21Var) {
        class_21Var.method_73(this);
    }

    @Override // p000.class_160
    public final void method_184(DataOutputStream dataOutputStream) {
        super.method_184(dataOutputStream);
        if (this.IIiIIIIiii > 0) {
            dataOutputStream.write(this.field_833, 0, this.IIiIIIIiii);
        }
    }

    @Override // p000.class_160
    public final String method_198() {
        return this.field_834;
    }

    public final byte[] method_429() {
        return this.field_833;
    }

    public class_228(class_228 class_228Var) {
        this(class_228Var.method_433(), class_228Var.method_47(), class_228Var.method_429(), class_228Var.method_502());
    }

    @Override // p000.class_160
    public class_160 method_187(class_499 class_499Var) {
        class_228 class_228Var = (class_228) clone();
        if (this.field_833 != null) {
            class_228Var.field_833 = new byte[this.field_833.length];
            System.arraycopy(this.field_833, 0, class_228Var.field_833, 0, this.field_833.length);
        }
        class_228Var.THIS_IS_DEMO_VERSION_NOT_FOR_COMMERCIAL_USE = class_499Var;
        return class_228Var;
    }

    public final void method_1055(byte[] bArr) {
        this.field_833 = bArr;
    }

    public class_228(int i, int i2, DataInputStream dataInputStream, class_499 class_499Var) {
        this(i, i2, (byte[]) null, class_499Var);
        if (i2 > 0) {
            this.field_833 = new byte[i2];
            dataInputStream.readFully(this.field_833);
        }
    }

    public static class_228[] method_1065() {
        class_228[] class_228VarArr = new class_228[field_832.size()];
        Iterator it = field_832.values().iterator();
        int i = 0;
        Iterator it2 = it;
        while (it2.hasNext()) {
            class_228VarArr[i] = (class_228) it.next();
            it2 = it;
            i++;
        }
        field_832.clear();
        return class_228VarArr;
    }
}
