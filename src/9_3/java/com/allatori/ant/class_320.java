package com.allatori.ant;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_320 {
    public static void method_1373(String[] strArr) {
        if (strArr.length != 1) {
            System.out.println("Verifier front-end: need exactly one argument.");
            System.exit(1);
        }
        int lastIndexOf = strArr[0].lastIndexOf(".class");
        if (lastIndexOf != -1) {
            strArr[0] = strArr[0].substring(0, lastIndexOf);
        }
        strArr[0] = strArr[0].replace('/', '.');
        try {
            Class.forName(strArr[0]);
        } catch (ClassNotFoundException e) {
            System.out.println(new StringBuilder().insert(0, "NativeVerifier: FILE NOT FOUND: '").append(strArr[0]).append("'.").toString());
            System.exit(1);
        } catch (ExceptionInInitializerError e2) {
            System.out.println(new StringBuilder().insert(0, "NativeVerifier: ExceptionInInitializerError encountered on '").append(strArr[0]).append("'.").toString());
            System.out.println(e2);
            System.exit(1);
        } catch (LinkageError e3) {
            System.out.println(new StringBuilder().insert(0, "NativeVerifier: LinkageError encountered on '").append(strArr[0]).append("'.").toString());
            System.out.println(e3);
            System.exit(1);
        } catch (Throwable th) {
            System.out.println(new StringBuilder().insert(0, "NativeVerifier: Unspecified verification error on'").append(strArr[0]).append("'.").toString());
            System.exit(1);
        }
        System.out.println(new StringBuilder().insert(0, "NativeVerifier: Class file '").append(strArr[0]).append("' seems to be okay.").toString());
        System.exit(0);
    }
}
