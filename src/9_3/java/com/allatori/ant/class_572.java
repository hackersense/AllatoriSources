package com.allatori.ant;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_572 extends RuntimeException {
    public String field_2337;

    public void method_221(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (this.field_2337 == null) {
            this.field_2337 = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        this.field_2337 = new StringBuilder().insert(0, str).append(this.field_2337).append(str2).toString();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.field_2337;
    }

    public class_572() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public class_572(String str) {
        super(str);
        String str2 = "INTERNAL ERROR: " + str;
        this.field_2337 = str2;
    }

    public static void method_1661(String[] strArr) {
        class_572 class_572Var = new class_572("Oops!");
        class_572Var.method_221("\nFOUND:\n\t", "\nExiting!!\n");
        throw class_572Var;
    }
}
