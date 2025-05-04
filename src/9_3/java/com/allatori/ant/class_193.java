package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_54;

import java.io.InputStream;
import java.util.zip.ZipEntry;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_193 implements class_54 {
    public final ZipEntry field_746;
    public final class_85 field_747;

    public class_193(class_85 class_85Var, ZipEntry zipEntry) {
        this.field_747 = class_85Var;
        this.field_746 = zipEntry;
    }

    @Override // p000.class_54
    public long method_220() {
        return this.field_746.getTime();
    }

    @Override // p000.class_54
    public String method_217() {
        return this.field_746.toString();
    }

    @Override // p000.class_54
    public InputStream method_218() {
        return class_85.method_549(this.field_747).getInputStream(this.field_746);
    }

    @Override // p000.class_54
    public String method_219() {
        return class_85.method_549(this.field_747).getName();
    }

    @Override // p000.class_54
    public long method_216() {
        return this.field_746.getSize();
    }
}
