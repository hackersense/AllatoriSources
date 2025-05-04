package com.allatori.ant;

import java.io.FilterReader;
import java.io.Reader;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_68 extends FilterReader {
    @Override // java.io.FilterReader, java.io.Reader
    public int read() {
        int read = this.in.read();
        if (read == 36) {
            int read2 = this.in.read();
            if (read2 < 0) {
                return -1;
            }
            if ((read2 < 48 || read2 > 57) && (read2 < 97 || read2 > 102)) {
                return class_204.field_768[read2];
            }
            int read3 = this.in.read();
            if (read3 < 0) {
                return -1;
            }
            return Integer.parseInt(new String(new char[]{(char) read2, (char) read3}), 16);
        }
        return read;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i4 + 1;
            cArr[i + i4] = (char) read();
            i3 = i5;
            i4 = i5;
        }
        return i2;
    }

    public class_68(Reader reader) {
        super(reader);
    }
}
