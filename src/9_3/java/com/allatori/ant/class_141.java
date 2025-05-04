package com.allatori.ant;

import java.io.FilterWriter;
import java.io.Writer;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_141 extends FilterWriter {
    @Override // java.io.FilterWriter, java.io.Writer
    public void write(int i) {
        if (class_204.method_978((char) i) && i != 36) {
            this.out.write(i);
            return;
        }
        this.out.write(36);
        if (i >= 0 && i < 48) {
            this.out.write(class_204.field_769[i]);
            return;
        }
        char[] charArray = Integer.toHexString(i).toCharArray();
        if (charArray.length == 1) {
            this.out.write(48);
            this.out.write(charArray[0]);
        } else {
            this.out.write(charArray[0]);
            this.out.write(charArray[1]);
        }
    }

    public class_141(Writer writer) {
        super(writer);
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i4 + 1;
            write(cArr[i + i4]);
            i3 = i5;
            i4 = i5;
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(String str, int i, int i2) {
        write(str.toCharArray(), i, i2);
    }
}
