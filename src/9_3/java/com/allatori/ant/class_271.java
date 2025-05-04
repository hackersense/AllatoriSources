package com.allatori.ant;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Locale;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_271 implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        return lowerCase.endsWith(".zip") || lowerCase.endsWith(".jar");
    }
}
