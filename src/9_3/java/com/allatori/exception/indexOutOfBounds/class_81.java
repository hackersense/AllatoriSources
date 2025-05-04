package com.allatori.exception.indexOutOfBounds;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_81 extends IndexOutOfBoundsException {
    public static final long field_336 = 6807380416709738314L;
    public final String field_332;
    public final int field_333;
    public final String field_334;
    public final String field_335;

    public static String method_547(String str, String str2, String str3) {
        return new StringBuilder().insert(0, "Method too large: ").append(str).append(".").append(str2).append(" ").append(str3).toString();
    }

    public String method_546() {
        return this.field_332;
    }

    public class_81(String str, String str2, String str3, int i) {
        super(method_547(str, str2, str3));
        this.field_334 = str;
        this.field_332 = str2;
        this.field_335 = str3;
        this.field_333 = i;
    }

    public int method_47() {
        return this.field_333;
    }

    public String method_464() {
        return this.field_334;
    }

    public String method_198() {
        return this.field_335;
    }
}
