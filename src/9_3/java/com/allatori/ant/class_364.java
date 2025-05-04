package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_54;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_364 implements class_54 {
    public final File field_1178;
    public final class_182 field_1179;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // p000.class_54
    public InputStream method_218() {
        return new FileInputStream(this.field_1178);
    }

    @Override // p000.class_54
    public String method_219() {
        return class_182.method_867(this.field_1179);
    }

    public class_364(class_182 class_182Var, File file) {
        this.field_1179 = class_182Var;
        this.field_1178 = file;
    }

    @Override // p000.class_54
    public long method_216() {
        return this.field_1178.length();
    }

    @Override // p000.class_54
    public long method_220() {
        return this.field_1178.lastModified();
    }

    @Override // p000.class_54
    public String method_217() {
        try {
            return this.field_1178.getCanonicalPath();
        } catch (IOException e) {
            return null;
        }
    }
}
