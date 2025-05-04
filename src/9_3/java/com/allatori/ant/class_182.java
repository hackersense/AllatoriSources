package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_54;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_182 extends class_485 {
    public String field_734;

    @Override // p000.class_485
    public URL method_228(String str) {
        File file = new File(new StringBuilder().insert(0, this.field_734).append(File.separatorChar).append(str.replace('/', File.separatorChar)).toString());
        try {
            if (file.exists()) {
                return file.toURL();
            }
            return null;
        } catch (MalformedURLException e) {
            return null;
        }
    }

    public class_182(String str) {
        super(null);
        this.field_734 = str;
    }

    @Override // p000.class_485
    public InputStream method_229(String str) {
        File file = new File(new StringBuilder().insert(0, this.field_734).append(File.separatorChar).append(str.replace('/', File.separatorChar)).toString());
        try {
            if (file.exists()) {
                return new FileInputStream(file);
            }
            return null;
        } catch (IOException e) {
            return null;
        }
    }

    public static String method_867(class_182 class_182Var) {
        return class_182Var.field_734;
    }

    @Override // p000.class_485
    public class_54 method_231(String str, String str2) {
        File file = new File(new StringBuilder().insert(0, this.field_734).append(File.separatorChar).append(str.replace('.', File.separatorChar)).append(str2).toString());
        if (file.exists()) {
            return new class_364(this, file);
        }
        return null;
    }
}
