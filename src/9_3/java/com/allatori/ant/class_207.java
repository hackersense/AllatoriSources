package com.allatori.ant;

import com.allatori.commons.Info;
import com.allatori.interfaces.unmapped.class_291;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_207 implements class_291 {
    public StringBuffer method_981(StringBuffer stringBuffer, char c, int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = i3 + 1;
            stringBuffer.append(c);
            i2 = i4;
            i3 = i4;
        }
        return stringBuffer;
    }

    public String method_980() {
        String sb = new StringBuilder().insert(0, "Obfuscation by ").append(Info.getName()).append(" ").append(Info.getVersion()).toString();
        String method_889 = Info.getWebsiteURL();
        int max = Math.max(31, Math.max(sb.length(), method_889.length())) + 4;
        StringBuffer stringBuffer = new StringBuffer("\n");
        method_981(stringBuffer, '#', max).append("\n#");
        method_981(stringBuffer, ' ', max - 2).append("#\n#");
        int i = ((max - 31) - 2) / 2;
        int i2 = ((max - i) - 31) - 2;
        method_981(stringBuffer, ' ', i).append(" ## #   #    ## ### ### ##  ###");
        method_981(stringBuffer, ' ', i2).append("#\n#");
        method_981(stringBuffer, ' ', i).append("# # #   #   # #  #  # # # #  # ");
        method_981(stringBuffer, ' ', i2).append("#\n#");
        method_981(stringBuffer, ' ', i).append("### #   #   ###  #  # # ##   # ");
        method_981(stringBuffer, ' ', i2).append("#\n#");
        method_981(stringBuffer, ' ', i).append("# # ### ### # #  #  ### # # ###");
        method_981(stringBuffer, ' ', i2).append("#\n#");
        method_981(stringBuffer, ' ', max - 2).append("#\n#");
        int length = ((max - sb.length()) - 2) / 2;
        int length2 = ((max - length) - sb.length()) - 2;
        method_981(stringBuffer, ' ', length).append(sb);
        method_981(stringBuffer, ' ', length2).append("#\n#");
        method_981(stringBuffer, ' ', max - 2).append("#\n#");
        int length3 = ((max - method_889.length()) - 2) / 2;
        int length4 = ((max - length3) - method_889.length()) - 2;
        method_981(stringBuffer, ' ', length3).append(method_889);
        method_981(stringBuffer, ' ', length4).append("#\n#");
        method_981(stringBuffer, ' ', max - 2).append("#\n");
        method_981(stringBuffer, '#', max).append("\n");
        return stringBuffer.toString();
    }

    @Override // p000.class_291
    public void method_39() {
    }

    @Override // p000.class_291
    public void method_34(class_202 class_202Var) {
        class_557 method_913;
        try {
            if (class_202Var.method_198().startsWith("com.allatori.") || (method_913 = class_202Var.method_913("main", "([Ljava/lang/String;)V")) == null) {
                return;
            }
            class_591 method_1067 = class_230.method_1067(method_913, class_202Var.method_198(), class_202Var.method_917(), class_202Var.method_917().method_502());
            class_563 class_563Var = new class_563(class_202Var);
            class_70 method_438 = method_1067.method_438();
            if (method_438 != null) {
                method_438.method_447(class_563Var.method_1990(method_980()));
                method_1067.method_2056();
                class_202Var.method_914(method_913, method_1067.method_2048());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
