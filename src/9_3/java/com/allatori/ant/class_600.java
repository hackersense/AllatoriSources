package com.allatori.ant;

import java.io.ByteArrayInputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_600 extends ByteArrayInputStream {
    public final String method_2099() {
        return new String(this.buf);
    }

    public final int method_1408() {
        return this.pos;
    }

    public class_600(String str) {
        super(str.getBytes());
    }

    public final void method_1407() {
        if (this.pos > 0) {
            this.pos--;
        }
    }

    public final void method_2098(int i) {
        this.pos = i;
    }
}
