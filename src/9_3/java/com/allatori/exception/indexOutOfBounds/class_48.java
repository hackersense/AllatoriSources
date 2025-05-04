package com.allatori.exception.indexOutOfBounds;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_48 extends IndexOutOfBoundsException {
    public static final long field_187 = 160715609518896765L;
    public final int field_185;
    public final String field_186;

    public static String method_199(String str) {
        return new StringBuilder().insert(0, "Class too large: ").append(str).toString();
    }

    public class_48(String str, int i) {
        super(method_199(str));
        this.field_186 = str;
        this.field_185 = i;
    }

    public int method_47() {
        return this.field_185;
    }

    public String method_198() {
        return this.field_186;
    }
}
