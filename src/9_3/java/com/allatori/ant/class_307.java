package com.allatori.ant;

import com.allatori.commons.AllatoriLogger;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_307 {
    public static void method_1354() {
        System.out.println("Restore Stack Trace Utility");
        System.out.println("Usage:");
        System.out.println("com.allatori.StackTrace2 <log file> <input file> <output file>");
    }

    public static String method_1356(File file, String str) {
        class_220 method_2029 = class_584.method_2029(new InputStreamReader(new FileInputStream(file), "UTF-8"));
        BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        class_534.method_1898(bufferedReader, method_2029, printWriter);
        bufferedReader.close();
        printWriter.close();
        return stringWriter.toString();
    }

    public static void method_1355(String[] strArr) {
        String[] strArr2;
        class_220 class_220Var;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        PrintWriter printWriter = null;
        System.out.println(class_80.method_541());
        try {
            if (strArr.length != 3) {
                method_1354();
                System.exit(0);
            }
            try {
                strArr2 = strArr;
                class_220Var = class_584.method_2029(new InputStreamReader(new FileInputStream(strArr[0]), "UTF-8"));
            } catch (FileNotFoundException e) {
                AllatoriLogger.method_678(new StringBuilder().insert(0, "Log file not found: ").append(e.getMessage()).toString());
                System.exit(0);
                strArr2 = strArr;
                class_220Var = null;
            } catch (Exception e2) {
                AllatoriLogger.method_678(new StringBuilder().insert(0, "Error reading log file: ").append(e2.getMessage()).toString());
                System.exit(0);
                strArr2 = strArr;
                class_220Var = null;
            }
            String str = strArr2[1];
            String str2 = strArr[2];
            try {
                bufferedReader = new BufferedReader(new FileReader(str));
            } catch (FileNotFoundException e3) {
                AllatoriLogger.method_678(new StringBuilder().insert(0, "Input file not found: ").append(e3.getMessage()).toString());
                System.exit(0);
                bufferedReader = null;
            }
            try {
                bufferedReader2 = bufferedReader;
                printWriter = new PrintWriter(new BufferedWriter(new FileWriter(str2)));
            } catch (IOException e4) {
                AllatoriLogger.method_678(new StringBuilder().insert(0, "Error writing output file: ").append(e4.getMessage()).toString());
                System.exit(0);
                bufferedReader2 = bufferedReader;
            }
            class_534.method_1898(bufferedReader2, class_220Var, printWriter);
            bufferedReader.close();
            printWriter.close();
        } catch (Exception e5) {
            System.out.println(new StringBuilder().insert(0, "Error: ").append(e5.getMessage()).toString());
        }
    }
}
