package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_54;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_85 extends class_485 {
    public ZipFile field_359;

    public class_85(ZipFile zipFile) {
        super(null);
        this.field_359 = zipFile;
    }

    public static ZipFile method_549(class_85 class_85Var) {
        return class_85Var.field_359;
    }

    @Override // p000.class_485
    public class_54 method_231(String str, String str2) {
        ZipEntry entry = this.field_359.getEntry(new StringBuilder().insert(0, str.replace('.', '/')).append(str2).toString());
        if (entry != null) {
            return new class_193(this, entry);
        }
        return null;
    }

    @Override // p000.class_485
    public URL method_228(String str) {
        if (this.field_359.getEntry(str) == null) {
            return null;
        }
        try {
            return new URL(new StringBuilder().insert(0, "jar:file:").append(this.field_359.getName()).append("!/").append(str).toString());
        } catch (MalformedURLException e) {
            return null;
        }
    }

    @Override // p000.class_485
    public InputStream method_229(String str) {
        ZipEntry entry = this.field_359.getEntry(str);
        if (entry == null) {
            return null;
        }
        try {
            return this.field_359.getInputStream(entry);
        } catch (IOException e) {
            return null;
        }
    }
}
