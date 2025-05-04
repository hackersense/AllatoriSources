package com.allatori.ant;

import com.allatori.exception.runtime.class_168;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.ZipFile;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_543 {
    public static final int field_2020 = 8192;
    public int field_2019;
    public boolean field_2021;
    public int[] field_2022;
    public int field_2023;
    public DataInputStream field_2024;
    public int field_2025;
    public class_261[] field_2026;
    public int field_2027;
    public class_499 field_2028;
    public class_160[] field_2029;
    public boolean field_2030;
    public String field_2031;
    public String field_2032;
    public int field_2033;
    public class_557[] field_2034;

    public final void method_1911() {
        this.field_2025 = this.field_2024.readUnsignedShort();
        if ((this.field_2025 & 512) != 0) {
            this.field_2025 |= 1024;
        }
        if ((this.field_2025 & 1024) == 0 || (this.field_2025 & 16) == 0) {
            this.field_2023 = this.field_2024.readUnsignedShort();
            this.field_2027 = this.field_2024.readUnsignedShort();
            return;
        }
        throw new class_168("Class can't be both final and abstract");
    }

    public final void method_1915() {
        this.field_2019 = this.field_2024.readUnsignedShort();
        this.field_2033 = this.field_2024.readUnsignedShort();
    }

    public class_543(InputStream inputStream, String str) {
        this.field_2032 = str;
        this.field_2030 = false;
        String name = inputStream.getClass().getName();
        this.field_2021 = name.startsWith("java.util.zip.") || name.startsWith("java.util.jar.");
        if (inputStream instanceof DataInputStream) {
            this.field_2024 = (DataInputStream) inputStream;
        } else {
            this.field_2024 = new DataInputStream(new BufferedInputStream(inputStream, 8192));
        }
    }

    public final void method_1914() {
        int readUnsignedShort = this.field_2024.readUnsignedShort();
        this.field_2022 = new int[readUnsignedShort];
        int i = 0;
        int i2 = 0;
        while (i < readUnsignedShort) {
            int i3 = i2 + 1;
            this.field_2022[i2] = this.field_2024.readUnsignedShort();
            i = i3;
            i2 = i3;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v4, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public class_440 method_1909() {
        ZipFile zipFile;
        class_543 class_543Var;
        try {
            if (this.field_2030) {
                if (this.field_2021) {
                    zipFile = new ZipFile(this.field_2031);
                    try {
                        this.field_2024 = new DataInputStream(new BufferedInputStream(zipFile.getInputStream(zipFile.getEntry(this.field_2032)), 8192));
                        class_543Var = this;
                        class_543Var.method_1912();
                        method_1915();
                        method_1910();
                        method_1911();
                        method_1914();
                        method_1917();
                        method_1916();
                        method_1913();
                        if (this.field_2030) {
                            this.field_2024.close();
                            if (zipFile != null) {
                                zipFile.close();
                            }
                        }
                        return new class_440(this.field_2023, this.field_2027, this.field_2032, this.field_2033, this.field_2019, this.field_2025, this.field_2028, this.field_2022, this.field_2026, this.field_2034, this.field_2029, !this.field_2021 ? -(-3) : (byte) 2);
                    } catch (Throwable th) {
                        th = th;
                        if (this.field_2030) {
                            this.field_2024.close();
                            if (zipFile != null) {
                                zipFile.close();
                            }
                        }
                        throw th;
                    }
                }
                this.field_2024 = new DataInputStream(new BufferedInputStream(new FileInputStream(this.field_2032), 8192));
            }
            class_543Var = this;
            zipFile = null;
            class_543Var.method_1912();
            method_1915();
            method_1910();
            method_1911();
            method_1914();
            method_1917();
            method_1916();
            method_1913();
            if (this.field_2030) {
            }
            return new class_440(this.field_2023, this.field_2027, this.field_2032, this.field_2033, this.field_2019, this.field_2025, this.field_2028, this.field_2022, this.field_2026, this.field_2034, this.field_2029, !this.field_2021 ? -(-3) : (byte) 2);
        } catch (Throwable th2) {
            th = th2;
            zipFile = null;
        }
    }

    public final void method_1913() {
        int readUnsignedShort = this.field_2024.readUnsignedShort();
        this.field_2029 = new class_160[readUnsignedShort];
        int i = 0;
        int i2 = 0;
        while (i < readUnsignedShort) {
            int i3 = i2 + 1;
            this.field_2029[i2] = class_160.method_777(this.field_2024, this.field_2028);
            i = i3;
            i2 = i3;
        }
    }

    public class_543(String str) {
        this.field_2021 = false;
        this.field_2032 = str;
        this.field_2030 = true;
    }

    public class_543(String str, String str2) {
        this.field_2021 = true;
        this.field_2030 = true;
        this.field_2031 = str;
        this.field_2032 = str2;
    }

    public final void method_1916() {
        int readUnsignedShort = this.field_2024.readUnsignedShort();
        this.field_2034 = new class_557[readUnsignedShort];
        int i = 0;
        int i2 = 0;
        while (i < readUnsignedShort) {
            int i3 = i2 + 1;
            this.field_2034[i2] = new class_557(this.field_2024, this.field_2028);
            i = i3;
            i2 = i3;
        }
    }

    public final void method_1917() {
        int readUnsignedShort = this.field_2024.readUnsignedShort();
        this.field_2026 = new class_261[readUnsignedShort];
        int i = 0;
        int i2 = 0;
        while (i < readUnsignedShort) {
            int i3 = i2 + 1;
            this.field_2026[i2] = new class_261(this.field_2024, this.field_2028);
            i = i3;
            i2 = i3;
        }
    }

    public final void method_1910() {
        this.field_2028 = new class_499(this.field_2024);
    }

    public final void method_1912() {
        if (this.field_2024.readInt() == -889275714) {
        } else {
            throw new class_168(new StringBuilder().insert(0, this.field_2032).append(" is not a Java .class file").toString());
        }
    }
}
