package com.allatori.ant;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.channels.FileChannel;
import java.util.Vector;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_344 {
    public static void method_1404(File file, String str, String str2) {
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2;
        if (str != null) {
            BufferedWriter bufferedWriter3 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), str));
            bufferedWriter = bufferedWriter3;
            bufferedWriter2 = bufferedWriter3;
        } else {
            BufferedWriter bufferedWriter4 = new BufferedWriter(new FileWriter(file));
            bufferedWriter = bufferedWriter4;
            bufferedWriter2 = bufferedWriter4;
        }
        bufferedWriter.write(str2);
        bufferedWriter2.close();
    }

    public static void method_1405(File file, File file2) {
        Throwable th;
        FileChannel fileChannel;
        FileChannel fileChannel2;
        FileChannel channel;
        FileChannel channel2;
        try {
            channel = new FileInputStream(file).getChannel();
            try {
                channel2 = new FileOutputStream(file2).getChannel();
            } catch (Throwable th2) {
                th = th2;
                fileChannel = null;
                fileChannel2 = channel;
            }
        } catch (Throwable th3) {
            th = th3;
            fileChannel = null;
            fileChannel2 = null;
        }
        try {
            channel2.write(channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size()));
            if (channel != null) {
                channel.close();
            }
            if (channel2 != null) {
                channel2.close();
            }
        } catch (Throwable th4) {
            th = th4;
            fileChannel = channel2;
            fileChannel2 = channel;
            if (fileChannel2 != null) {
                fileChannel2.close();
            }
            if (fileChannel != null) {
                fileChannel.close();
                throw th;
            }
            throw th;
        }
    }

    public static String method_1406(File file, String str) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        StringBuffer stringBuffer = new StringBuffer((int) file.length());
        if (str != null) {
            BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(new FileInputStream(file), str));
            bufferedReader = bufferedReader3;
            bufferedReader2 = bufferedReader3;
        } else {
            BufferedReader bufferedReader4 = new BufferedReader(new FileReader(file));
            bufferedReader = bufferedReader4;
            bufferedReader2 = bufferedReader4;
        }
        while (true) {
            int read = bufferedReader.read();
            if (read == -1) {
                bufferedReader2.close();
                return stringBuffer.toString();
            }
            stringBuffer.append((char) read);
            bufferedReader = bufferedReader2;
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:5:0x0017 */
    public static String[] method_1403(File file, String str, boolean z) {
        BufferedReader bufferedReader;
        if (str != null) {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), str));
        } else {
            bufferedReader = new BufferedReader(new FileReader(file));
        }
        Vector vector = new Vector();
        while (true) {
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    if (!z) {
                        vector.add(readLine);
                    } else if (readLine.length() > 0) {
                        vector.add(readLine);
                    }
                } else {
                    bufferedReader.close();
                    return (String[]) vector.toArray(new String[vector.size()]);
                }
            }
        }
    }
}
