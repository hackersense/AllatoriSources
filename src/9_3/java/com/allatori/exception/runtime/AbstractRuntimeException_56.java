package com.allatori.exception.runtime;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class AbstractRuntimeException_56 extends RuntimeException {
    public String field_197;

    public void method_221(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (this.field_197 == null) {
            this.field_197 = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        this.field_197 = new StringBuilder().insert(0, str).append(this.field_197).append(str2).toString();
    }

    public AbstractRuntimeException_56(String str) {
        super(str);
        this.field_197 = str;
    }

    public AbstractRuntimeException_56() {
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.field_197;
    }
}
