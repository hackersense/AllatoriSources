package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.commons.ASMStuffs;
import com.allatori.interfaces.unmapped.class_555;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_173 {
    public static final int field_711 = 2;
    public static final int field_717 = 1048576;
    public static final int field_718 = 1;
    public static final int field_719 = 256;
    public static final int field_722 = 4;
    public static final int field_723 = 8;
    public static final int field_725 = 4096;
    public final String[] field_712;
    public final byte[] field_713;
    public final int field_714;
    public final int field_715;
    public final class_470[] field_716;

    @Deprecated
    public final byte[] field_720;
    public final int[] field_721;
    public final int[] field_724;

    public static String method_798(String str) {
        return new StringBuilder().insert(0, str).append(".class").toString();
    }

    public static String method_818(short s) {
        return new StringBuilder().insert(0, "Unsupported class file major version ").append((int) s).toString();
    }

    public static int method_796(InputStream inputStream) {
        int available = inputStream.available();
        if (available < 256) {
            return 4096;
        }
        return Math.min(available, 1048576);
    }

    public String[] method_834() {
        int i = this.field_715 + 6;
        int method_811 = method_811(i);
        String[] strArr = new String[method_811];
        if (method_811 > 0) {
            char[] cArr = new char[this.field_714];
            int i2 = 0;
            int i3 = 0;
            while (i2 < method_811) {
                i += 2;
                int i4 = i3 + 1;
                strArr[i3] = method_840(i, cArr);
                i2 = i4;
                i3 = i4;
            }
        }
        return strArr;
    }

    public int method_800() {
        return method_811(this.field_715);
    }

    public String method_816() {
        return method_840(this.field_715 + 4, new char[this.field_714]);
    }

    public class_173(byte[] bArr, int i, boolean z) {
        int i2;
        this.field_713 = bArr;
        this.field_720 = bArr;
        if (!z || method_831(i + 6) <= 68) {
            int method_811 = method_811(i + 8);
            this.field_721 = new int[method_811];
            this.field_712 = new String[method_811];
            int i3 = i + 10;
            int i4 = 1;
            boolean z2 = false;
            boolean z3 = false;
            int i5 = 0;
            int i6 = 1;
            while (i4 < method_811) {
                int i7 = i6 + 1;
                this.field_721[i6] = i3 + 1;
                switch (bArr[i3]) {
                    case 1:
                        int method_8112 = method_811(i3 + 1) + 3;
                        if (method_8112 <= i5) {
                            i2 = method_8112;
                            break;
                        } else {
                            i2 = method_8112;
                            i5 = method_8112;
                            break;
                        }
                    case 2:
                    case class_555.field_2278 /* 13 */:
                    case class_555.field_2199 /* 14 */:
                    default:
                        throw new IllegalArgumentException();
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        i2 = 5;
                        break;
                    case 5:
                    case 6:
                        i2 = 9;
                        i7++;
                        break;
                    case 7:
                    case 8:
                    case 16:
                    case 19:
                    case 20:
                        i2 = 3;
                        break;
                    case 15:
                        i2 = 4;
                        break;
                    case 17:
                        i2 = 5;
                        z2 = true;
                        z3 = true;
                        break;
                    case 18:
                        i2 = 5;
                        z3 = true;
                        break;
                }
                i3 += i2;
                i4 = i7;
                i6 = i7;
            }
            this.field_714 = i5;
            this.field_715 = i3;
            this.field_716 = z2 ? new class_470[method_811] : null;
            this.field_724 = z3 ? method_815(i5) : null;
            return;
        }
        throw new IllegalArgumentException(method_818(method_831(i + 6)));
    }

    public class_173(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public class_173(byte[] bArr, int i, int i2) {
        this(bArr, i, true);
    }

    public String method_802() {
        return method_840(this.field_715 + 2, new char[this.field_714]);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    public static byte[] method_837(InputStream inputStream, boolean z) {
        int i = 0;
        if (inputStream != null) {
            int method_796 = method_796(inputStream);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[method_796];
                    InputStream inputStream2 = inputStream;
                    while (true) {
                        int read = inputStream2.read(bArr, 0, method_796);
                        if (read == -1) {
                            break;
                        }
                        i++;
                        byteArrayOutputStream.write(bArr, 0, read);
                        inputStream2 = inputStream;
                    }
                    byteArrayOutputStream.flush();
                    if (i != 1) {
                        bArr = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        if (z) {
                            inputStream.close();
                        }
                    } else {
                        byteArrayOutputStream.close();
                    }
                    return bArr;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                    }
                    throw th;
                }
            } finally {
                if (z) {
                    inputStream.close();
                }
            }
        }
        throw new IOException("Class not found");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void method_841(class_354 class_354Var, int i) {
        method_805(class_354Var, new class_187[0], i);
    }

    public class_173(String str) {
        this(method_837(ClassLoader.getSystemResourceAsStream(method_798(str.replace('.', '/'))), true));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:102:0x0341 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:107:0x037c */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:130:0x044f */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:134:0x046c */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:138:0x0487 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:92:0x02ce */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:97:0x0316 */
    /* JADX DEBUG: Move duplicate insns, count: 3 to block B:2:0x004a */
    public void method_805(class_354 class_354Var, class_187[] class_187VarArr, int i) {
        int i2;
        class_187 class_187Var;
        int i3;
        int i4;
        int i5;
        int i6;
        class_84 class_84Var = new class_84();
        class_84Var.field_345 = class_187VarArr;
        class_84Var.field_342 = i;
        class_84Var.field_354 = new char[this.field_714];
        char[] cArr = class_84Var.field_354;
        int i7 = this.field_715;
        int method_811 = method_811(i7);
        String method_840 = method_840(i7 + 2, cArr);
        String method_8402 = method_840(i7 + 4, cArr);
        String[] strArr = new String[method_811(i7 + 6)];
        int i8 = i7 + 8;
        int i9 = 0;
        while (true) {
            int i10 = i9;
            i2 = i8;
            if (i9 >= strArr.length) {
                break;
            }
            i8 = i2 + 2;
            strArr[i10] = method_840(i2, cArr);
            i9 = i10 + 1;
        }
        int i11 = 0;
        int i12 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        String str4 = null;
        String str5 = null;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        class_187 class_187Var2 = null;
        int method_812 = method_812();
        int method_8112 = method_811(method_812 - 2);
        int i22 = method_8112;
        int i23 = method_8112;
        int i24 = method_812;
        while (i22 > 0) {
            String method_844 = method_844(i24, cArr);
            int i25 = i24 + 6;
            int method_836 = method_836(i24 + 2);
            if ("SourceFile".equals(method_844)) {
                str2 = method_844(i25, cArr);
                i3 = i25;
                class_187Var = class_187Var2;
                i4 = i21;
                i5 = i20;
                i6 = i19;
            } else if ("InnerClasses".equals(method_844)) {
                i3 = i25;
                class_187Var = class_187Var2;
                i4 = i21;
                i5 = i20;
                i6 = i19;
                i11 = i25;
            } else if ("EnclosingMethod".equals(method_844)) {
                i3 = i25;
                class_187Var = class_187Var2;
                i4 = i21;
                i5 = i20;
                i6 = i19;
                i12 = i25;
            } else if ("NestHost".equals(method_844)) {
                str5 = method_840(i25, cArr);
                i3 = i25;
                class_187Var = class_187Var2;
                i4 = i21;
                i5 = i20;
                i6 = i19;
            } else if ("NestMembers".equals(method_844)) {
                i3 = i25;
                class_187Var = class_187Var2;
                i4 = i21;
                i5 = i20;
                i6 = i25;
            } else if ("PermittedSubclasses".equals(method_844)) {
                i3 = i25;
                class_187Var = class_187Var2;
                i4 = i21;
                i5 = i25;
                i6 = i19;
            } else if ("Signature".equals(method_844)) {
                str = method_844(i25, cArr);
                i3 = i25;
                class_187Var = class_187Var2;
                i4 = i21;
                i5 = i20;
                i6 = i19;
            } else if ("RuntimeVisibleAnnotations".equals(method_844)) {
                i3 = i25;
                class_187Var = class_187Var2;
                i4 = i21;
                i5 = i20;
                i6 = i19;
                i13 = i25;
            } else if ("RuntimeVisibleTypeAnnotations".equals(method_844)) {
                i3 = i25;
                class_187Var = class_187Var2;
                i4 = i21;
                i5 = i20;
                i6 = i19;
                i15 = i25;
            } else if ("Deprecated".equals(method_844)) {
                method_811 |= class_555.field_2095;
                i3 = i25;
                class_187Var = class_187Var2;
                i4 = i21;
                i5 = i20;
                i6 = i19;
            } else if ("Synthetic".equals(method_844)) {
                method_811 |= 4096;
                i3 = i25;
                class_187Var = class_187Var2;
                i4 = i21;
                i5 = i20;
                i6 = i19;
            } else if ("SourceDebugExtension".equals(method_844)) {
                if (method_836 > this.field_713.length - i25) {
                    throw new IllegalArgumentException();
                }
                str3 = method_822(i25, method_836, new char[method_836]);
                i3 = i25;
                class_187Var = class_187Var2;
                i4 = i21;
                i5 = i20;
                i6 = i19;
            } else if ("RuntimeInvisibleAnnotations".equals(method_844)) {
                i3 = i25;
                class_187Var = class_187Var2;
                i4 = i21;
                i5 = i20;
                i6 = i19;
                i14 = i25;
            } else if ("RuntimeInvisibleTypeAnnotations".equals(method_844)) {
                i3 = i25;
                class_187Var = class_187Var2;
                i4 = i21;
                i5 = i20;
                i6 = i19;
                i16 = i25;
            } else if ("Record".equals(method_844)) {
                method_811 |= 65536;
                i3 = i25;
                class_187Var = class_187Var2;
                i4 = i25;
                i5 = i20;
                i6 = i19;
            } else if ("Module".equals(method_844)) {
                i3 = i25;
                class_187Var = class_187Var2;
                i4 = i21;
                i5 = i20;
                i6 = i19;
                i17 = i25;
            } else if ("ModuleMainClass".equals(method_844)) {
                str4 = method_840(i25, cArr);
                i3 = i25;
                class_187Var = class_187Var2;
                i4 = i21;
                i5 = i20;
                i6 = i19;
            } else if ("ModulePackages".equals(method_844)) {
                i3 = i25;
                class_187Var = class_187Var2;
                i4 = i21;
                i5 = i20;
                i6 = i19;
                i18 = i25;
            } else {
                if ("BootstrapMethods".equals(method_844)) {
                    class_187Var = class_187Var2;
                } else {
                    class_187Var = method_806(class_187VarArr, method_844, i25, method_836, cArr, -1, null);
                    class_187Var.field_739 = class_187Var2;
                }
                i3 = i25;
                i4 = i21;
                i5 = i20;
                i6 = i19;
            }
            int i26 = i23 - 1;
            i24 = method_836 + i3;
            i22 = i26;
            i23 = i26;
            class_187Var2 = class_187Var;
            i21 = i4;
            i20 = i5;
            i19 = i6;
        }
        class_354Var.method_1444(method_836(this.field_721[1] - 7), method_811, method_840, str, method_8402, strArr);
        if ((i & 2) == 0 && (str2 != null || str3 != null)) {
            class_354Var.method_1439(str2, str3);
        }
        if (i17 != 0) {
            method_838(class_354Var, class_84Var, i17, i18, str4);
        }
        if (str5 != null) {
            class_354Var.method_1446(str5);
        }
        if (i12 != 0) {
            String method_8403 = method_840(i12, cArr);
            int method_8113 = method_811(i12 + 2);
            class_354Var.method_1442(method_8403, method_8113 == 0 ? null : method_844(this.field_721[method_8113], cArr), method_8113 == 0 ? null : method_844(this.field_721[method_8113] + 2, cArr));
        }
        if (i13 != 0) {
            int method_8114 = method_811(i13);
            int i27 = i13 + 2;
            while (true) {
                int i28 = method_8114;
                method_8114--;
                if (i28 <= 0) {
                    break;
                } else {
                    i27 = method_842(class_354Var.method_1453(method_844(i27, cArr), true), i27 + 2, true, cArr);
                }
            }
        }
        if (i14 != 0) {
            int method_8115 = method_811(i14);
            int i29 = i14 + 2;
            while (true) {
                int i30 = method_8115;
                method_8115--;
                if (i30 <= 0) {
                    break;
                } else {
                    i29 = method_842(class_354Var.method_1453(method_844(i29, cArr), false), i29 + 2, true, cArr);
                }
            }
        }
        if (i15 != 0) {
            int method_8116 = method_811(i15);
            int i31 = i15 + 2;
            while (true) {
                int i32 = method_8116;
                method_8116--;
                if (i32 <= 0) {
                    break;
                }
                int method_799 = method_799(class_84Var, i31);
                i31 = method_842(class_354Var.method_1448(class_84Var.field_357, class_84Var.field_350, method_844(method_799, cArr), true), method_799 + 2, true, cArr);
            }
        }
        if (i16 != 0) {
            int method_8117 = method_811(i16);
            int i33 = i16 + 2;
            while (true) {
                int i34 = method_8117;
                method_8117--;
                if (i34 <= 0) {
                    break;
                }
                int method_7992 = method_799(class_84Var, i33);
                i33 = method_842(class_354Var.method_1448(class_84Var.field_357, class_84Var.field_350, method_844(method_7992, cArr), false), method_7992 + 2, true, cArr);
            }
        }
        class_187 class_187Var3 = class_187Var2;
        class_187 class_187Var4 = class_187Var2;
        while (class_187Var3 != null) {
            class_187 class_187Var5 = class_187Var4.field_739;
            class_187Var4.field_739 = null;
            class_354Var.method_1450(class_187Var4);
            class_187Var3 = class_187Var5;
            class_187Var4 = class_187Var5;
        }
        if (i19 != 0) {
            int method_8118 = method_811(i19);
            int i35 = i19 + 2;
            int i36 = method_8118;
            int i37 = method_8118;
            while (true) {
                int i38 = i37 - 1;
                if (i36 <= 0) {
                    break;
                }
                class_354Var.method_1443(method_840(i35, cArr));
                i36 = i38;
                i37 = i38;
                i35 += 2;
            }
        }
        if (i20 != 0) {
            int method_8119 = method_811(i20);
            int i39 = i20 + 2;
            int i40 = method_8119;
            int i41 = method_8119;
            while (true) {
                int i42 = i41 - 1;
                if (i40 <= 0) {
                    break;
                }
                class_354Var.method_1437(method_840(i39, cArr));
                i40 = i42;
                i41 = i42;
                i39 += 2;
            }
        }
        if (i11 != 0) {
            int method_81110 = method_811(i11);
            int i43 = i11 + 2;
            int i44 = method_81110;
            int i45 = method_81110;
            while (true) {
                int i46 = i45 - 1;
                if (i44 <= 0) {
                    break;
                }
                class_354Var.method_1438(method_840(i43, cArr), method_840(i43 + 2, cArr), method_844(i43 + 4, cArr), method_811(i43 + 6));
                i44 = i46;
                i45 = i46;
                i43 += 8;
            }
        }
        if (i21 != 0) {
            int i47 = i21 + 2;
            int method_81111 = method_811(i21);
            while (true) {
                int i48 = method_81111;
                method_81111--;
                if (i48 <= 0) {
                    break;
                } else {
                    i47 = method_807(class_354Var, class_84Var, i47);
                }
            }
        }
        int i49 = i2 + 2;
        int method_81112 = method_811(i2);
        while (true) {
            int i50 = method_81112;
            method_81112--;
            if (i50 <= 0) {
                break;
            } else {
                i49 = method_801(class_354Var, class_84Var, i49);
            }
        }
        int i51 = i49 + 2;
        int method_81113 = method_811(i49);
        while (true) {
            int i52 = method_81113;
            method_81113--;
            if (i52 <= 0) {
                class_354Var.method_1451();
                return;
            }
            i51 = method_797(class_354Var, class_84Var, i51);
        }
    }

    public class_173(InputStream inputStream) {
        this(method_837(inputStream, false));
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:27:0x00c3 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:32:0x00ea */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:37:0x0111 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:42:0x0148 */
    public int method_807(class_354 class_354Var, class_84 class_84Var, int i) {
        class_187 method_806;
        int i2;
        int i3;
        int i4;
        int i5;
        char[] cArr = class_84Var.field_354;
        String method_844 = method_844(i, cArr);
        int i6 = i + 4;
        String method_8442 = method_844(i + 2, cArr);
        String str = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        class_187 class_187Var = null;
        int i11 = i6 + 2;
        int method_811 = method_811(i6);
        int i12 = method_811;
        int i13 = method_811;
        while (true) {
            int i14 = i13 - 1;
            if (i12 <= 0) {
                break;
            }
            String method_8443 = method_844(i11, cArr);
            int i15 = i11 + 6;
            int method_836 = method_836(i11 + 2);
            if (!"Signature".equals(method_8443)) {
                if ("RuntimeVisibleAnnotations".equals(method_8443)) {
                    i2 = i15;
                    method_806 = class_187Var;
                    i3 = i10;
                    i4 = i9;
                    i5 = i8;
                    i7 = i15;
                } else if ("RuntimeVisibleTypeAnnotations".equals(method_8443)) {
                    i2 = i15;
                    method_806 = class_187Var;
                    i3 = i10;
                    i4 = i15;
                    i5 = i8;
                } else if ("RuntimeInvisibleAnnotations".equals(method_8443)) {
                    i2 = i15;
                    method_806 = class_187Var;
                    i3 = i10;
                    i4 = i9;
                    i5 = i15;
                } else if ("RuntimeInvisibleTypeAnnotations".equals(method_8443)) {
                    i2 = i15;
                    method_806 = class_187Var;
                    i3 = i15;
                    i4 = i9;
                    i5 = i8;
                } else {
                    method_806 = method_806(class_84Var.field_345, method_8443, i15, method_836, cArr, -1, null);
                    method_806.field_739 = class_187Var;
                    i2 = i15;
                    i3 = i10;
                    i4 = i9;
                    i5 = i8;
                }
            } else {
                str = method_844(i15, cArr);
                i2 = i15;
                method_806 = class_187Var;
                i3 = i10;
                i4 = i9;
                i5 = i8;
            }
            i11 = i2 + method_836;
            i12 = i14;
            i13 = i14;
            class_187Var = method_806;
            i10 = i3;
            i9 = i4;
            i8 = i5;
        }
        class_61 method_1452 = class_354Var.method_1452(method_844, method_8442, str);
        if (method_1452 != null) {
            if (i7 != 0) {
                int method_8112 = method_811(i7);
                int i16 = i7 + 2;
                while (true) {
                    int i17 = method_8112;
                    method_8112--;
                    if (i17 <= 0) {
                        break;
                    }
                    i16 = method_842(method_1452.method_239(method_844(i16, cArr), true), i16 + 2, true, cArr);
                }
            }
            if (i8 != 0) {
                int method_8113 = method_811(i8);
                int i18 = i8 + 2;
                while (true) {
                    int i19 = method_8113;
                    method_8113--;
                    if (i19 <= 0) {
                        break;
                    }
                    i18 = method_842(method_1452.method_239(method_844(i18, cArr), false), i18 + 2, true, cArr);
                }
            }
            if (i9 != 0) {
                int method_8114 = method_811(i9);
                int i20 = i9 + 2;
                while (true) {
                    int i21 = method_8114;
                    method_8114--;
                    if (i21 <= 0) {
                        break;
                    }
                    int method_799 = method_799(class_84Var, i20);
                    i20 = method_842(method_1452.method_243(class_84Var.field_357, class_84Var.field_350, method_844(method_799, cArr), true), method_799 + 2, true, cArr);
                }
            }
            if (i10 != 0) {
                int method_8115 = method_811(i10);
                int i22 = i10 + 2;
                while (true) {
                    int i23 = method_8115;
                    method_8115--;
                    if (i23 <= 0) {
                        break;
                    }
                    int method_7992 = method_799(class_84Var, i22);
                    i22 = method_842(method_1452.method_243(class_84Var.field_357, class_84Var.field_350, method_844(method_7992, cArr), false), method_7992 + 2, true, cArr);
                }
            }
            class_187 class_187Var2 = class_187Var;
            class_187 class_187Var3 = class_187Var;
            while (class_187Var2 != null) {
                class_187 class_187Var4 = class_187Var3.field_739;
                class_187Var3.field_739 = null;
                method_1452.method_242(class_187Var3);
                class_187Var2 = class_187Var4;
                class_187Var3 = class_187Var4;
            }
            method_1452.method_241();
        }
        return i11;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:9:0x002e */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:13:0x0047 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:39:0x00ff */
    /* JADX DEBUG: Move duplicate insns, count: 3 to block B:35:0x00e6 */
    public void method_838(class_354 class_354Var, class_84 class_84Var, int i, int i2, String str) {
        int i3;
        char[] cArr = class_84Var.field_354;
        int i4 = i + 6;
        class_497 method_1440 = class_354Var.method_1440(method_820(i, cArr), method_811(i + 2), method_844(i + 4, cArr));
        if (method_1440 != null) {
            if (str != null) {
                method_1440.method_649(str);
            }
            if (i2 != 0) {
                int method_811 = method_811(i2);
                int i5 = i2 + 2;
                int i6 = method_811;
                while (true) {
                    method_811--;
                    if (i6 <= 0) {
                        break;
                    }
                    method_1440.method_654(method_819(i5, cArr));
                    i6 = method_811;
                    i5 += 2;
                }
            }
            int i7 = i4 + 2;
            int method_8112 = method_811(i4);
            while (true) {
                int i8 = method_8112;
                method_8112--;
                if (i8 <= 0) {
                    break;
                }
                String method_820 = method_820(i7, cArr);
                int method_8113 = method_811(i7 + 2);
                int i9 = i7 + 4;
                i7 += 6;
                method_1440.method_658(method_820, method_8113, method_844(i9, cArr));
            }
            int i10 = i7 + 2;
            int method_8114 = method_811(i7);
            int i11 = method_8114;
            int i12 = method_8114;
            int i13 = i10;
            while (true) {
                int i14 = i12 - 1;
                if (i11 <= 0) {
                    break;
                }
                String method_819 = method_819(i13, cArr);
                int method_8115 = method_811(i13 + 2);
                int i15 = i13 + 6;
                int method_8116 = method_811(i13 + 4);
                String[] strArr = null;
                if (method_8116 != 0) {
                    strArr = new String[method_8116];
                    int i16 = 0;
                    int i17 = 0;
                    while (i16 < method_8116) {
                        String method_8202 = method_820(i15, cArr);
                        i15 += 2;
                        strArr[i17] = method_8202;
                        int i18 = i17 + 1;
                        i16 = i18;
                        i17 = i18;
                    }
                }
                method_1440.method_653(method_819, method_8115, strArr);
                i11 = i14;
                i12 = i14;
                i13 = i15;
            }
            int method_8117 = method_811(i13);
            int i19 = method_8117;
            int i20 = method_8117;
            int i21 = i13 + 2;
            while (true) {
                int i22 = i20 - 1;
                if (i19 <= 0) {
                    break;
                }
                String method_8192 = method_819(i21, cArr);
                int method_8118 = method_811(i21 + 2);
                int i23 = i21 + 6;
                int method_8119 = method_811(i21 + 4);
                String[] strArr2 = null;
                if (method_8119 != 0) {
                    strArr2 = new String[method_8119];
                    int i24 = 0;
                    int i25 = 0;
                    while (i24 < method_8119) {
                        String method_8203 = method_820(i23, cArr);
                        i23 += 2;
                        strArr2[i25] = method_8203;
                        int i26 = i25 + 1;
                        i24 = i26;
                        i25 = i26;
                    }
                }
                method_1440.method_651(method_8192, method_8118, strArr2);
                i19 = i22;
                i20 = i22;
                i21 = i23;
            }
            int i27 = i21 + 2;
            int method_81110 = method_811(i21);
            while (true) {
                int i28 = method_81110;
                i3 = i27;
                method_81110--;
                if (i28 <= 0) {
                    break;
                }
                i27 = i3 + 2;
                method_1440.method_652(method_840(i3, cArr));
            }
            int i29 = i3 + 2;
            int method_81111 = method_811(i3);
            while (true) {
                int i30 = method_81111;
                method_81111--;
                if (i30 <= 0) {
                    method_1440.method_657();
                    return;
                }
                String method_840 = method_840(i29, cArr);
                int method_81112 = method_811(i29 + 2);
                String[] strArr3 = new String[method_81112];
                int i31 = 0;
                int i32 = 0;
                i29 += 4;
                while (i31 < method_81112) {
                    String method_8402 = method_840(i29, cArr);
                    i29 += 2;
                    strArr3[i32] = method_8402;
                    int i33 = i32 + 1;
                    i31 = i33;
                    i32 = i33;
                }
                method_1440.method_655(method_840, strArr3);
            }
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:40:0x0122 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:45:0x014b */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:50:0x0174 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:55:0x01ab */
    public int method_801(class_354 class_354Var, class_84 class_84Var, int i) {
        class_187 method_806;
        int i2;
        int i3;
        int i4;
        int i5;
        char[] cArr = class_84Var.field_354;
        int method_811 = method_811(i);
        String method_844 = method_844(i + 2, cArr);
        int i6 = i + 6;
        String method_8442 = method_844(i + 4, cArr);
        Object obj = null;
        String str = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        class_187 class_187Var = null;
        int i11 = i6 + 2;
        int method_8112 = method_811(i6);
        int i12 = method_8112;
        int i13 = method_8112;
        while (true) {
            int i14 = i13 - 1;
            if (i12 <= 0) {
                break;
            }
            String method_8443 = method_844(i11, cArr);
            int i15 = i11 + 6;
            int method_836 = method_836(i11 + 2);
            if (!"ConstantValue".equals(method_8443)) {
                if (!"Signature".equals(method_8443)) {
                    if ("Deprecated".equals(method_8443)) {
                        method_811 |= class_555.field_2095;
                        i2 = i15;
                        method_806 = class_187Var;
                        i3 = i10;
                        i4 = i9;
                        i5 = i8;
                    } else if ("Synthetic".equals(method_8443)) {
                        method_811 |= 4096;
                        i2 = i15;
                        method_806 = class_187Var;
                        i3 = i10;
                        i4 = i9;
                        i5 = i8;
                    } else if ("RuntimeVisibleAnnotations".equals(method_8443)) {
                        i2 = i15;
                        method_806 = class_187Var;
                        i3 = i10;
                        i4 = i9;
                        i5 = i8;
                        i7 = i15;
                    } else if ("RuntimeVisibleTypeAnnotations".equals(method_8443)) {
                        i2 = i15;
                        method_806 = class_187Var;
                        i3 = i10;
                        i4 = i15;
                        i5 = i8;
                    } else if ("RuntimeInvisibleAnnotations".equals(method_8443)) {
                        i2 = i15;
                        method_806 = class_187Var;
                        i3 = i10;
                        i4 = i9;
                        i5 = i15;
                    } else if ("RuntimeInvisibleTypeAnnotations".equals(method_8443)) {
                        i2 = i15;
                        method_806 = class_187Var;
                        i3 = i15;
                        i4 = i9;
                        i5 = i8;
                    } else {
                        method_806 = method_806(class_84Var.field_345, method_8443, i15, method_836, cArr, -1, null);
                        method_806.field_739 = class_187Var;
                        i2 = i15;
                        i3 = i10;
                        i4 = i9;
                        i5 = i8;
                    }
                } else {
                    str = method_844(i15, cArr);
                    i2 = i15;
                    method_806 = class_187Var;
                    i3 = i10;
                    i4 = i9;
                    i5 = i8;
                }
            } else {
                int method_8113 = method_811(i15);
                obj = method_8113 == 0 ? null : method_825(method_8113, cArr);
                i2 = i15;
                method_806 = class_187Var;
                i3 = i10;
                i4 = i9;
                i5 = i8;
            }
            i11 = i2 + method_836;
            i12 = i14;
            i13 = i14;
            class_187Var = method_806;
            i10 = i3;
            i9 = i4;
            i8 = i5;
        }
        class_153 method_1445 = class_354Var.method_1445(method_811, method_844, method_8442, str, obj);
        if (method_1445 != null) {
            if (i7 != 0) {
                int method_8114 = method_811(i7);
                int i16 = i7 + 2;
                while (true) {
                    int i17 = method_8114;
                    method_8114--;
                    if (i17 <= 0) {
                        break;
                    }
                    i16 = method_842(method_1445.method_760(method_844(i16, cArr), true), i16 + 2, true, cArr);
                }
            }
            if (i8 != 0) {
                int method_8115 = method_811(i8);
                int i18 = i8 + 2;
                while (true) {
                    int i19 = method_8115;
                    method_8115--;
                    if (i19 <= 0) {
                        break;
                    }
                    i18 = method_842(method_1445.method_760(method_844(i18, cArr), false), i18 + 2, true, cArr);
                }
            }
            if (i9 != 0) {
                int method_8116 = method_811(i9);
                int i20 = i9 + 2;
                while (true) {
                    int i21 = method_8116;
                    method_8116--;
                    if (i21 <= 0) {
                        break;
                    }
                    int method_799 = method_799(class_84Var, i20);
                    i20 = method_842(method_1445.method_764(class_84Var.field_357, class_84Var.field_350, method_844(method_799, cArr), true), method_799 + 2, true, cArr);
                }
            }
            if (i10 != 0) {
                int method_8117 = method_811(i10);
                int i22 = i10 + 2;
                while (true) {
                    int i23 = method_8117;
                    method_8117--;
                    if (i23 <= 0) {
                        break;
                    }
                    int method_7992 = method_799(class_84Var, i22);
                    i22 = method_842(method_1445.method_764(class_84Var.field_357, class_84Var.field_350, method_844(method_7992, cArr), false), method_7992 + 2, true, cArr);
                }
            }
            class_187 class_187Var2 = class_187Var;
            class_187 class_187Var3 = class_187Var;
            while (class_187Var2 != null) {
                class_187 class_187Var4 = class_187Var3.field_739;
                class_187Var3.field_739 = null;
                method_1445.method_763(class_187Var3);
                class_187Var2 = class_187Var4;
                class_187Var3 = class_187Var4;
            }
            method_1445.method_765();
        }
        return i11;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:251:0x097a */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:192:0x0631 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:197:0x0686 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:219:0x0802 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:244:0x095f */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:24:0x00d0 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:29:0x0102 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:37:0x0137 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:48:0x01ca */
    public void method_824(class_265 class_265Var, class_84 class_84Var, int i) {
        boolean z;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int method_811;
        class_187 method_806;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int[] iArr2;
        int[] iArr3;
        int i9;
        int i10;
        byte[] bArr = this.field_713;
        char[] cArr = class_84Var.field_354;
        int method_8112 = method_811(i);
        int method_8113 = method_811(i + 2);
        int i11 = i + 8;
        int method_836 = method_836(i + 4);
        if (method_836 <= this.field_713.length - i11) {
            int i12 = i11 + method_836;
            class_243[] class_243VarArr = new class_243[method_836 + 1];
            class_84Var.field_349 = class_243VarArr;
            int i13 = i11;
            while (i13 < i12) {
                int i14 = i13 - i11;
                switch (bArr[i13] & ASMInterface.field_1291) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case class_555.field_2278 /* 13 */:
                    case class_555.field_2199 /* 14 */:
                    case 15:
                    case 26:
                    case ASMStuffs.field_157 /* 27 */:
                    case ASMStuffs.field_156 /* 28 */:
                    case ASMStuffs.field_160 /* 29 */:
                    case ASMStuffs.field_162 /* 30 */:
                    case ASMStuffs.field_84 /* 31 */:
                    case 32:
                    case 33:
                    case ASMStuffs.field_138 /* 34 */:
                    case ASMStuffs.field_122 /* 35 */:
                    case ASMStuffs.field_80 /* 36 */:
                    case ASMStuffs.field_170 /* 37 */:
                    case ASMStuffs.field_163 /* 38 */:
                    case ASMStuffs.field_87 /* 39 */:
                    case ASMStuffs.field_104 /* 40 */:
                    case ASMStuffs.field_149 /* 41 */:
                    case ASMStuffs.field_147 /* 42 */:
                    case ASMStuffs.field_161 /* 43 */:
                    case ASMStuffs.field_167 /* 44 */:
                    case ASMStuffs.field_175 /* 45 */:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case ASMStuffs.field_86 /* 76 */:
                    case ASMStuffs.field_126 /* 77 */:
                    case ASMStuffs.field_111 /* 78 */:
                    case class_555.field_2159 /* 79 */:
                    case class_555.field_2255 /* 80 */:
                    case class_555.field_2096 /* 81 */:
                    case class_555.field_2288 /* 82 */:
                    case 83:
                    case class_555.field_2183 /* 84 */:
                    case class_555.field_2313 /* 85 */:
                    case class_555.field_2226 /* 86 */:
                    case class_555.field_2192 /* 87 */:
                    case class_555.field_2274 /* 88 */:
                    case class_555.field_2188 /* 89 */:
                    case 90:
                    case 91:
                    case class_555.field_2090 /* 92 */:
                    case class_555.field_2280 /* 93 */:
                    case class_555.field_2242 /* 94 */:
                    case class_555.field_2209 /* 95 */:
                    case class_555.field_2194 /* 96 */:
                    case class_555.field_2181 /* 97 */:
                    case class_555.field_2203 /* 98 */:
                    case 99:
                    case 100:
                    case 101:
                    case class_555.field_2081 /* 102 */:
                    case class_555.field_2198 /* 103 */:
                    case class_555.field_2146 /* 104 */:
                    case class_555.field_2153 /* 105 */:
                    case class_555.field_2233 /* 106 */:
                    case class_555.field_2212 /* 107 */:
                    case class_555.field_2250 /* 108 */:
                    case class_555.field_2082 /* 109 */:
                    case class_555.field_2151 /* 110 */:
                    case class_555.field_2177 /* 111 */:
                    case class_555.field_2317 /* 112 */:
                    case class_555.field_2204 /* 113 */:
                    case class_555.field_2213 /* 114 */:
                    case 115:
                    case class_555.field_2230 /* 116 */:
                    case class_555.field_2296 /* 117 */:
                    case class_555.field_2294 /* 118 */:
                    case class_555.field_2139 /* 119 */:
                    case class_555.field_2152 /* 120 */:
                    case class_555.field_2263 /* 121 */:
                    case class_555.field_2107 /* 122 */:
                    case class_555.field_2084 /* 123 */:
                    case class_555.field_2195 /* 124 */:
                    case class_555.field_2126 /* 125 */:
                    case class_555.field_2236 /* 126 */:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                    case 131:
                    case class_555.field_2256 /* 133 */:
                    case class_555.field_2133 /* 134 */:
                    case class_555.field_2093 /* 135 */:
                    case class_555.field_2120 /* 136 */:
                    case class_555.field_2234 /* 137 */:
                    case class_555.field_2286 /* 138 */:
                    case class_555.field_2201 /* 139 */:
                    case class_555.field_2248 /* 140 */:
                    case class_555.field_2113 /* 141 */:
                    case class_555.field_2079 /* 142 */:
                    case class_555.field_2268 /* 143 */:
                    case class_555.field_2129 /* 144 */:
                    case class_555.field_2098 /* 145 */:
                    case class_555.field_2172 /* 146 */:
                    case class_555.field_2275 /* 147 */:
                    case class_555.field_2137 /* 148 */:
                    case class_555.field_2220 /* 149 */:
                    case class_555.field_2301 /* 150 */:
                    case class_555.field_2206 /* 151 */:
                    case class_555.field_2117 /* 152 */:
                    case class_555.field_2132 /* 172 */:
                    case class_555.field_2196 /* 173 */:
                    case class_555.field_2135 /* 174 */:
                    case class_555.field_2221 /* 175 */:
                    case class_555.field_2161 /* 176 */:
                    case class_555.field_2150 /* 177 */:
                    case class_555.field_2249 /* 190 */:
                    case class_555.field_2262 /* 191 */:
                    case class_555.field_2165 /* 194 */:
                    case class_555.field_2282 /* 195 */:
                        i13++;
                        continue;
                    case 16:
                    case 18:
                    case 21:
                    case 22:
                    case 23:
                    case class_555.field_2101 /* 24 */:
                    case class_555.field_2318 /* 25 */:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case class_555.field_2174 /* 169 */:
                    case class_555.field_2316 /* 188 */:
                        i13 += 2;
                        continue;
                    case 17:
                    case 19:
                    case 20:
                    case class_555.field_2267 /* 132 */:
                    case class_555.field_2078 /* 178 */:
                    case class_555.field_2141 /* 179 */:
                    case class_555.field_2211 /* 180 */:
                    case class_555.field_2186 /* 181 */:
                    case class_555.field_2147 /* 182 */:
                    case class_555.field_2238 /* 183 */:
                    case class_555.field_2314 /* 184 */:
                    case class_555.field_2228 /* 187 */:
                    case class_555.field_2245 /* 189 */:
                    case class_555.field_2303 /* 192 */:
                    case class_555.field_2197 /* 193 */:
                        i13 += 3;
                        continue;
                    case class_555.field_2304 /* 153 */:
                    case class_555.field_2215 /* 154 */:
                    case class_555.field_2244 /* 155 */:
                    case class_555.field_2077 /* 156 */:
                    case class_555.field_2251 /* 157 */:
                    case class_555.field_2179 /* 158 */:
                    case class_555.field_2287 /* 159 */:
                    case class_555.field_2273 /* 160 */:
                    case class_555.field_2099 /* 161 */:
                    case class_555.field_2097 /* 162 */:
                    case class_555.field_2130 /* 163 */:
                    case class_555.field_2227 /* 164 */:
                    case class_555.field_2136 /* 165 */:
                    case class_555.field_2243 /* 166 */:
                    case class_555.field_2270 /* 167 */:
                    case class_555.field_2293 /* 168 */:
                    case class_555.field_2182 /* 198 */:
                    case class_555.field_2102 /* 199 */:
                        method_804(i14 + method_831(i13 + 1), class_243VarArr);
                        i13 += 3;
                        continue;
                    case class_555.field_2148 /* 170 */:
                        int i15 = i13 + (4 - (i14 & 3));
                        method_804(method_836(i15) + i14, class_243VarArr);
                        i10 = i15 + 12;
                        int method_8362 = (method_836(i15 + 8) - method_836(i15 + 4)) + 1;
                        while (true) {
                            int i16 = method_8362;
                            method_8362--;
                            if (i16 <= 0) {
                                break;
                            } else {
                                int method_8363 = method_836(i10);
                                i10 += 4;
                                method_804(method_8363 + i14, class_243VarArr);
                            }
                        }
                    case class_555.field_2131 /* 171 */:
                        int i17 = i13 + (4 - (i14 & 3));
                        method_804(method_836(i17) + i14, class_243VarArr);
                        i10 = i17 + 8;
                        int method_8364 = method_836(i17 + 4);
                        while (true) {
                            int i18 = method_8364;
                            method_8364--;
                            if (i18 <= 0) {
                                break;
                            } else {
                                int method_8365 = method_836(i10 + 4);
                                i10 += 8;
                                method_804(method_8365 + i14, class_243VarArr);
                            }
                        }
                    case class_555.field_2144 /* 185 */:
                    case class_555.field_2178 /* 186 */:
                        i13 += 5;
                        continue;
                    case ASMStuffs.field_79 /* 196 */:
                        switch (bArr[i13 + 1] & ASMInterface.field_1291) {
                            case 21:
                            case 22:
                            case 23:
                            case class_555.field_2101 /* 24 */:
                            case class_555.field_2318 /* 25 */:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                            case class_555.field_2174 /* 169 */:
                                i13 += 4;
                                break;
                            case class_555.field_2267 /* 132 */:
                                i13 += 6;
                                continue;
                            default:
                                throw new IllegalArgumentException();
                        }
                    case class_555.field_2265 /* 197 */:
                        i13 += 4;
                        continue;
                    case ASMStuffs.field_150 /* 200 */:
                    case ASMStuffs.field_153 /* 201 */:
                    case ASMStuffs.field_130 /* 220 */:
                        method_804(i14 + method_836(i13 + 1), class_243VarArr);
                        i13 += 5;
                        continue;
                    case ASMStuffs.field_131 /* 202 */:
                    case ASMStuffs.field_83 /* 203 */:
                    case ASMStuffs.field_173 /* 204 */:
                    case ASMStuffs.field_133 /* 205 */:
                    case ASMStuffs.field_143 /* 206 */:
                    case ASMStuffs.field_152 /* 207 */:
                    case ASMStuffs.field_166 /* 208 */:
                    case ASMStuffs.field_164 /* 209 */:
                    case ASMStuffs.field_95 /* 210 */:
                    case ASMStuffs.field_116 /* 211 */:
                    case ASMStuffs.field_81 /* 212 */:
                    case ASMStuffs.field_125 /* 213 */:
                    case ASMStuffs.field_169 /* 214 */:
                    case ASMStuffs.field_121 /* 215 */:
                    case ASMStuffs.field_105 /* 216 */:
                    case ASMStuffs.field_97 /* 217 */:
                    case ASMStuffs.field_171 /* 218 */:
                    case ASMStuffs.field_120 /* 219 */:
                        method_804(i14 + method_811(i13 + 1), class_243VarArr);
                        i13 += 3;
                        continue;
                    default:
                        throw new IllegalArgumentException();
                }
                i13 = i10;
            }
            int i19 = i13 + 2;
            int method_8114 = method_811(i13);
            while (true) {
                int i20 = method_8114;
                method_8114--;
                if (i20 <= 0) {
                    int i21 = 0;
                    int i22 = 0;
                    boolean z3 = true;
                    int i23 = 0;
                    int i24 = 0;
                    int[] iArr4 = null;
                    int[] iArr5 = null;
                    class_187 class_187Var = null;
                    int i25 = i19 + 2;
                    int method_8115 = method_811(i19);
                    int i26 = method_8115;
                    int i27 = method_8115;
                    int i28 = i25;
                    while (true) {
                        int i29 = i27 - 1;
                        if (i26 <= 0) {
                            boolean z4 = (class_84Var.field_342 & 8) != 0;
                            if (i21 != 0) {
                                class_84Var.field_346 = -1;
                                class_84Var.field_340 = 0;
                                class_84Var.field_347 = 0;
                                class_84Var.field_343 = 0;
                                class_84Var.field_352 = new Object[method_8113];
                                class_84Var.field_353 = 0;
                                class_84Var.field_341 = new Object[method_8112];
                                if (z4) {
                                    method_828(class_84Var);
                                }
                                int i30 = i21;
                                int i31 = i21;
                                while (i30 < i22 - 2) {
                                    if (bArr[i31] == 8 && (method_811 = method_811(i31 + 1)) >= 0 && method_811 < method_836 && (bArr[i11 + method_811] & ASMInterface.field_1291) == 187) {
                                        method_804(method_811, class_243VarArr);
                                    }
                                    int i32 = i31 + 1;
                                    i30 = i32;
                                    i31 = i32;
                                }
                            }
                            if (z4 && (class_84Var.field_342 & 256) != 0) {
                                class_265Var.method_1172(-1, method_8113, null, 0, null);
                            }
                            int method_843 = method_843(iArr4, 0);
                            int method_8432 = method_843(iArr5, 0);
                            boolean z5 = false;
                            int i33 = (class_84Var.field_342 & 256) == 0 ? 33 : 0;
                            int i34 = method_8432;
                            int i35 = 0;
                            int i36 = method_843;
                            int i37 = 0;
                            int i38 = i21;
                            for (int i39 = i11; i39 < i12; i39 = i2) {
                                int i40 = i39 - i11;
                                method_826(i40);
                                class_243 class_243Var = class_243VarArr[i40];
                                if (class_243Var != null) {
                                    class_243Var.method_1093(class_265Var, (class_84Var.field_342 & 2) == 0);
                                }
                                int i41 = i38;
                                boolean z6 = z5;
                                int i42 = i38;
                                while (i41 != 0 && (class_84Var.field_346 == i40 || class_84Var.field_346 == -1)) {
                                    if (class_84Var.field_346 != -1) {
                                        if (z3 && !z4) {
                                            class_265Var.method_1172(class_84Var.field_340, class_84Var.field_343, class_84Var.field_352, class_84Var.field_353, class_84Var.field_341);
                                        } else {
                                            class_265Var.method_1172(-1, class_84Var.field_347, class_84Var.field_352, class_84Var.field_353, class_84Var.field_341);
                                        }
                                        z6 = false;
                                    }
                                    if (i42 < i22) {
                                        int method_808 = method_808(i42, z3, z4, class_84Var);
                                        i41 = method_808;
                                        i42 = method_808;
                                    } else {
                                        i41 = 0;
                                        i42 = 0;
                                    }
                                }
                                if (z6) {
                                    if ((class_84Var.field_342 & 8) != 0) {
                                        class_265Var.method_1172(256, 0, null, 0, null);
                                    }
                                    z = false;
                                } else {
                                    z = z6;
                                }
                                int i43 = bArr[i39] & ASMInterface.field_1291;
                                switch (i43) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case class_555.field_2278 /* 13 */:
                                    case class_555.field_2199 /* 14 */:
                                    case 15:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case class_555.field_2159 /* 79 */:
                                    case class_555.field_2255 /* 80 */:
                                    case class_555.field_2096 /* 81 */:
                                    case class_555.field_2288 /* 82 */:
                                    case 83:
                                    case class_555.field_2183 /* 84 */:
                                    case class_555.field_2313 /* 85 */:
                                    case class_555.field_2226 /* 86 */:
                                    case class_555.field_2192 /* 87 */:
                                    case class_555.field_2274 /* 88 */:
                                    case class_555.field_2188 /* 89 */:
                                    case 90:
                                    case 91:
                                    case class_555.field_2090 /* 92 */:
                                    case class_555.field_2280 /* 93 */:
                                    case class_555.field_2242 /* 94 */:
                                    case class_555.field_2209 /* 95 */:
                                    case class_555.field_2194 /* 96 */:
                                    case class_555.field_2181 /* 97 */:
                                    case class_555.field_2203 /* 98 */:
                                    case 99:
                                    case 100:
                                    case 101:
                                    case class_555.field_2081 /* 102 */:
                                    case class_555.field_2198 /* 103 */:
                                    case class_555.field_2146 /* 104 */:
                                    case class_555.field_2153 /* 105 */:
                                    case class_555.field_2233 /* 106 */:
                                    case class_555.field_2212 /* 107 */:
                                    case class_555.field_2250 /* 108 */:
                                    case class_555.field_2082 /* 109 */:
                                    case class_555.field_2151 /* 110 */:
                                    case class_555.field_2177 /* 111 */:
                                    case class_555.field_2317 /* 112 */:
                                    case class_555.field_2204 /* 113 */:
                                    case class_555.field_2213 /* 114 */:
                                    case 115:
                                    case class_555.field_2230 /* 116 */:
                                    case class_555.field_2296 /* 117 */:
                                    case class_555.field_2294 /* 118 */:
                                    case class_555.field_2139 /* 119 */:
                                    case class_555.field_2152 /* 120 */:
                                    case class_555.field_2263 /* 121 */:
                                    case class_555.field_2107 /* 122 */:
                                    case class_555.field_2084 /* 123 */:
                                    case class_555.field_2195 /* 124 */:
                                    case class_555.field_2126 /* 125 */:
                                    case class_555.field_2236 /* 126 */:
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case class_555.field_2256 /* 133 */:
                                    case class_555.field_2133 /* 134 */:
                                    case class_555.field_2093 /* 135 */:
                                    case class_555.field_2120 /* 136 */:
                                    case class_555.field_2234 /* 137 */:
                                    case class_555.field_2286 /* 138 */:
                                    case class_555.field_2201 /* 139 */:
                                    case class_555.field_2248 /* 140 */:
                                    case class_555.field_2113 /* 141 */:
                                    case class_555.field_2079 /* 142 */:
                                    case class_555.field_2268 /* 143 */:
                                    case class_555.field_2129 /* 144 */:
                                    case class_555.field_2098 /* 145 */:
                                    case class_555.field_2172 /* 146 */:
                                    case class_555.field_2275 /* 147 */:
                                    case class_555.field_2137 /* 148 */:
                                    case class_555.field_2220 /* 149 */:
                                    case class_555.field_2301 /* 150 */:
                                    case class_555.field_2206 /* 151 */:
                                    case class_555.field_2117 /* 152 */:
                                    case class_555.field_2132 /* 172 */:
                                    case class_555.field_2196 /* 173 */:
                                    case class_555.field_2135 /* 174 */:
                                    case class_555.field_2221 /* 175 */:
                                    case class_555.field_2161 /* 176 */:
                                    case class_555.field_2150 /* 177 */:
                                    case class_555.field_2249 /* 190 */:
                                    case class_555.field_2262 /* 191 */:
                                    case class_555.field_2165 /* 194 */:
                                    case class_555.field_2282 /* 195 */:
                                        i2 = i39 + 1;
                                        class_265Var.method_1180(i43);
                                        iArr = iArr4;
                                        z5 = z;
                                        i3 = i36;
                                        i4 = i37;
                                        break;
                                    case 16:
                                    case class_555.field_2316 /* 188 */:
                                        i2 = i39 + 2;
                                        class_265Var.method_1158(i43, bArr[i39 + 1]);
                                        iArr = iArr4;
                                        z5 = z;
                                        i3 = i36;
                                        i4 = i37;
                                        break;
                                    case 17:
                                        i2 = i39 + 3;
                                        class_265Var.method_1158(i43, method_831(i39 + 1));
                                        iArr = iArr4;
                                        z5 = z;
                                        i3 = i36;
                                        i4 = i37;
                                        break;
                                    case 18:
                                        i2 = i39 + 2;
                                        class_265Var.method_1173(method_825(bArr[i39 + 1] & ASMInterface.field_1291, cArr));
                                        iArr = iArr4;
                                        z5 = z;
                                        i3 = i36;
                                        i4 = i37;
                                        break;
                                    case 19:
                                    case 20:
                                        i2 = i39 + 3;
                                        class_265Var.method_1173(method_825(method_811(i39 + 1), cArr));
                                        iArr = iArr4;
                                        z5 = z;
                                        i3 = i36;
                                        i4 = i37;
                                        break;
                                    case 21:
                                    case 22:
                                    case 23:
                                    case class_555.field_2101 /* 24 */:
                                    case class_555.field_2318 /* 25 */:
                                    case 54:
                                    case 55:
                                    case 56:
                                    case 57:
                                    case 58:
                                    case class_555.field_2174 /* 169 */:
                                        i2 = i39 + 2;
                                        class_265Var.method_1166(i43, bArr[i39 + 1] & ASMInterface.field_1291);
                                        iArr = iArr4;
                                        z5 = z;
                                        i3 = i36;
                                        i4 = i37;
                                        break;
                                    case 26:
                                    case ASMStuffs.field_157 /* 27 */:
                                    case ASMStuffs.field_156 /* 28 */:
                                    case ASMStuffs.field_160 /* 29 */:
                                    case ASMStuffs.field_162 /* 30 */:
                                    case ASMStuffs.field_84 /* 31 */:
                                    case 32:
                                    case 33:
                                    case ASMStuffs.field_138 /* 34 */:
                                    case ASMStuffs.field_122 /* 35 */:
                                    case ASMStuffs.field_80 /* 36 */:
                                    case ASMStuffs.field_170 /* 37 */:
                                    case ASMStuffs.field_163 /* 38 */:
                                    case ASMStuffs.field_87 /* 39 */:
                                    case ASMStuffs.field_104 /* 40 */:
                                    case ASMStuffs.field_149 /* 41 */:
                                    case ASMStuffs.field_147 /* 42 */:
                                    case ASMStuffs.field_161 /* 43 */:
                                    case ASMStuffs.field_167 /* 44 */:
                                    case ASMStuffs.field_175 /* 45 */:
                                        int i44 = i43 - 26;
                                        i2 = i39 + 1;
                                        class_265Var.method_1166((i44 >> 2) + 21, i44 & 3);
                                        iArr = iArr4;
                                        z5 = z;
                                        i3 = i36;
                                        i4 = i37;
                                        break;
                                    case 59:
                                    case 60:
                                    case 61:
                                    case 62:
                                    case 63:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case 68:
                                    case 69:
                                    case 70:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case 74:
                                    case 75:
                                    case ASMStuffs.field_86 /* 76 */:
                                    case ASMStuffs.field_126 /* 77 */:
                                    case ASMStuffs.field_111 /* 78 */:
                                        int i45 = i43 - 59;
                                        i2 = i39 + 1;
                                        class_265Var.method_1166((i45 >> 2) + 54, i45 & 3);
                                        iArr = iArr4;
                                        z5 = z;
                                        i3 = i36;
                                        i4 = i37;
                                        break;
                                    case class_555.field_2267 /* 132 */:
                                        i2 = i39 + 3;
                                        class_265Var.method_1178(bArr[i39 + 1] & ASMInterface.field_1291, bArr[i39 + 2]);
                                        iArr = iArr4;
                                        z5 = z;
                                        i3 = i36;
                                        i4 = i37;
                                        break;
                                    case class_555.field_2304 /* 153 */:
                                    case class_555.field_2215 /* 154 */:
                                    case class_555.field_2244 /* 155 */:
                                    case class_555.field_2077 /* 156 */:
                                    case class_555.field_2251 /* 157 */:
                                    case class_555.field_2179 /* 158 */:
                                    case class_555.field_2287 /* 159 */:
                                    case class_555.field_2273 /* 160 */:
                                    case class_555.field_2099 /* 161 */:
                                    case class_555.field_2097 /* 162 */:
                                    case class_555.field_2130 /* 163 */:
                                    case class_555.field_2227 /* 164 */:
                                    case class_555.field_2136 /* 165 */:
                                    case class_555.field_2243 /* 166 */:
                                    case class_555.field_2270 /* 167 */:
                                    case class_555.field_2293 /* 168 */:
                                    case class_555.field_2182 /* 198 */:
                                    case class_555.field_2102 /* 199 */:
                                        i2 = i39 + 3;
                                        class_265Var.method_1148(i43, class_243VarArr[method_831(i39 + 1) + i40]);
                                        iArr = iArr4;
                                        z5 = z;
                                        i3 = i36;
                                        i4 = i37;
                                        break;
                                    case class_555.field_2148 /* 170 */:
                                        int i46 = (4 - (i40 & 3)) + i39;
                                        class_243 class_243Var2 = class_243VarArr[method_836(i46) + i40];
                                        int method_8366 = method_836(i46 + 4);
                                        i2 = i46 + 12;
                                        int method_8367 = method_836(i46 + 8);
                                        class_243[] class_243VarArr2 = new class_243[(method_8367 - method_8366) + 1];
                                        int i47 = 0;
                                        while (true) {
                                            int i48 = i47;
                                            if (i47 >= class_243VarArr2.length) {
                                                class_265Var.method_1161(method_8366, method_8367, class_243Var2, class_243VarArr2);
                                                iArr = iArr4;
                                                z5 = z;
                                                i3 = i36;
                                                i4 = i37;
                                                break;
                                            } else {
                                                class_243 class_243Var3 = class_243VarArr[method_836(i2) + i40];
                                                i2 += 4;
                                                class_243VarArr2[i48] = class_243Var3;
                                                i47 = i48 + 1;
                                            }
                                        }
                                    case class_555.field_2131 /* 171 */:
                                        int i49 = (4 - (i40 & 3)) + i39;
                                        class_243 class_243Var4 = class_243VarArr[method_836(i49) + i40];
                                        i2 = i49 + 8;
                                        int method_8368 = method_836(i49 + 4);
                                        int[] iArr6 = new int[method_8368];
                                        class_243[] class_243VarArr3 = new class_243[method_8368];
                                        int i50 = 0;
                                        while (true) {
                                            int i51 = i50;
                                            if (i50 < method_8368) {
                                                iArr6[i51] = method_836(i2);
                                                class_243 class_243Var5 = class_243VarArr[method_836(i2 + 4) + i40];
                                                i2 += 8;
                                                class_243VarArr3[i51] = class_243Var5;
                                                i50 = i51 + 1;
                                            } else {
                                                class_265Var.method_1154(class_243Var4, iArr6, class_243VarArr3);
                                                iArr = iArr4;
                                                z5 = z;
                                                i3 = i36;
                                                i4 = i37;
                                                break;
                                            }
                                        }
                                    case class_555.field_2078 /* 178 */:
                                    case class_555.field_2141 /* 179 */:
                                    case class_555.field_2211 /* 180 */:
                                    case class_555.field_2186 /* 181 */:
                                    case class_555.field_2147 /* 182 */:
                                    case class_555.field_2238 /* 183 */:
                                    case class_555.field_2314 /* 184 */:
                                    case class_555.field_2144 /* 185 */:
                                        int i52 = this.field_721[method_811(i39 + 1)];
                                        int i53 = this.field_721[method_811(i52 + 2)];
                                        String method_840 = method_840(i52, cArr);
                                        String method_844 = method_844(i53, cArr);
                                        String method_8442 = method_844(i53 + 2, cArr);
                                        if (i43 >= 182) {
                                            class_265Var.method_1156(i43, method_840, method_844, method_8442, bArr[i52 + (-1)] == 11);
                                        } else {
                                            class_265Var.method_1167(i43, method_840, method_844, method_8442);
                                        }
                                        if (i43 == 185) {
                                            i2 = i39 + 5;
                                            iArr = iArr4;
                                            z5 = z;
                                            i3 = i36;
                                            i4 = i37;
                                            break;
                                        } else {
                                            i2 = i39 + 3;
                                            iArr = iArr4;
                                            z5 = z;
                                            i3 = i36;
                                            i4 = i37;
                                            break;
                                        }
                                    case class_555.field_2178 /* 186 */:
                                        int i54 = this.field_721[method_811(i39 + 1)];
                                        int i55 = this.field_721[method_811(i54 + 2)];
                                        String method_8443 = method_844(i55, cArr);
                                        String method_8444 = method_844(i55 + 2, cArr);
                                        int i56 = this.field_724[method_811(i54)];
                                        class_350 class_350Var = (class_350) method_825(method_811(i56), cArr);
                                        Object[] objArr = new Object[method_811(i56 + 2)];
                                        int i57 = i56 + 4;
                                        int i58 = 0;
                                        while (true) {
                                            int i59 = i58;
                                            if (i58 >= objArr.length) {
                                                i2 = i39 + 5;
                                                class_265Var.method_1164(method_8443, method_8444, class_350Var, objArr);
                                                iArr = iArr4;
                                                z5 = z;
                                                i3 = i36;
                                                i4 = i37;
                                                break;
                                            } else {
                                                Object method_825 = method_825(method_811(i57), cArr);
                                                i57 += 2;
                                                objArr[i59] = method_825;
                                                i58 = i59 + 1;
                                            }
                                        }
                                    case class_555.field_2228 /* 187 */:
                                    case class_555.field_2245 /* 189 */:
                                    case class_555.field_2303 /* 192 */:
                                    case class_555.field_2197 /* 193 */:
                                        i2 = i39 + 3;
                                        class_265Var.method_1165(i43, method_840(i39 + 1, cArr));
                                        iArr = iArr4;
                                        z5 = z;
                                        i3 = i36;
                                        i4 = i37;
                                        break;
                                    case ASMStuffs.field_79 /* 196 */:
                                        int i60 = bArr[i39 + 1] & ASMInterface.field_1291;
                                        if (i60 != 132) {
                                            i2 = i39 + 4;
                                            class_265Var.method_1166(i60, method_811(i39 + 2));
                                            iArr = iArr4;
                                            z5 = z;
                                            i3 = i36;
                                            i4 = i37;
                                            break;
                                        } else {
                                            i2 = i39 + 6;
                                            class_265Var.method_1178(method_811(i39 + 2), method_831(i39 + 4));
                                            iArr = iArr4;
                                            z5 = z;
                                            i3 = i36;
                                            i4 = i37;
                                            break;
                                        }
                                    case class_555.field_2265 /* 197 */:
                                        i2 = i39 + 4;
                                        class_265Var.method_1181(method_840(i39 + 1, cArr), bArr[i39 + 3] & ASMInterface.field_1291);
                                        iArr = iArr4;
                                        z5 = z;
                                        i3 = i36;
                                        i4 = i37;
                                        break;
                                    case ASMStuffs.field_150 /* 200 */:
                                    case ASMStuffs.field_153 /* 201 */:
                                        i2 = i39 + 5;
                                        class_265Var.method_1148(i43 - i33, class_243VarArr[method_836(i39 + 1) + i40]);
                                        iArr = iArr4;
                                        z5 = z;
                                        i3 = i36;
                                        i4 = i37;
                                        break;
                                    case ASMStuffs.field_131 /* 202 */:
                                    case ASMStuffs.field_83 /* 203 */:
                                    case ASMStuffs.field_173 /* 204 */:
                                    case ASMStuffs.field_133 /* 205 */:
                                    case ASMStuffs.field_143 /* 206 */:
                                    case ASMStuffs.field_152 /* 207 */:
                                    case ASMStuffs.field_166 /* 208 */:
                                    case ASMStuffs.field_164 /* 209 */:
                                    case ASMStuffs.field_95 /* 210 */:
                                    case ASMStuffs.field_116 /* 211 */:
                                    case ASMStuffs.field_81 /* 212 */:
                                    case ASMStuffs.field_125 /* 213 */:
                                    case ASMStuffs.field_169 /* 214 */:
                                    case ASMStuffs.field_121 /* 215 */:
                                    case ASMStuffs.field_105 /* 216 */:
                                    case ASMStuffs.field_97 /* 217 */:
                                    case ASMStuffs.field_171 /* 218 */:
                                    case ASMStuffs.field_120 /* 219 */:
                                        int i61 = i43 >= 218 ? i43 - 20 : i43 - 49;
                                        class_243 class_243Var6 = class_243VarArr[method_811(i39 + 1) + i40];
                                        if (i61 == 167 || i61 == 168) {
                                            class_265Var.method_1148(i61 + 33, class_243Var6);
                                        } else {
                                            z = true;
                                            class_265Var.method_1148(i61 < 167 ? ((i61 + 1) ^ 1) - 1 : i61 ^ 1, method_804(i40 + 3, class_243VarArr));
                                            class_265Var.method_1148(ASMStuffs.field_150, class_243Var6);
                                        }
                                        i2 = i39 + 3;
                                        iArr = iArr4;
                                        z5 = z;
                                        i3 = i36;
                                        i4 = i37;
                                        break;
                                    case ASMStuffs.field_130 /* 220 */:
                                        i2 = i39 + 5;
                                        class_265Var.method_1148(ASMStuffs.field_150, class_243VarArr[method_836(i39 + 1) + i40]);
                                        iArr = iArr4;
                                        z5 = true;
                                        i3 = i36;
                                        i4 = i37;
                                        break;
                                    default:
                                        throw new AssertionError();
                                }
                                while (iArr != null && i4 < iArr4.length && i3 <= i40) {
                                    if (i3 == i40) {
                                        int method_799 = method_799(class_84Var, iArr4[i4]);
                                        method_842(class_265Var.method_1160(class_84Var.field_357, class_84Var.field_350, method_844(method_799, cArr), true), method_799 + 2, true, cArr);
                                    }
                                    int i62 = i4 + 1;
                                    iArr = iArr4;
                                    i3 = method_843(iArr4, i62);
                                    i4 = i62;
                                }
                                int i63 = i34;
                                int i64 = i35;
                                for (int[] iArr7 = iArr5; iArr7 != null && i64 < iArr5.length && i63 <= i40; iArr7 = iArr5) {
                                    if (i63 == i40) {
                                        int method_7992 = method_799(class_84Var, iArr5[i64]);
                                        method_842(class_265Var.method_1160(class_84Var.field_357, class_84Var.field_350, method_844(method_7992, cArr), false), method_7992 + 2, true, cArr);
                                    }
                                    i64++;
                                    i63 = method_843(iArr5, i64);
                                }
                                i34 = i63;
                                i35 = i64;
                                i36 = i3;
                                i37 = i4;
                                i38 = i42;
                            }
                            if (class_243VarArr[method_836] != null) {
                                class_265Var.method_1169(class_243VarArr[method_836]);
                            }
                            if (i23 != 0 && (class_84Var.field_342 & 2) == 0) {
                                int[] iArr8 = null;
                                if (i24 != 0) {
                                    iArr8 = new int[method_811(i24) * 3];
                                    int i65 = i24 + 2;
                                    int length = iArr8.length;
                                    int i66 = length;
                                    int i67 = length;
                                    while (i66 > 0) {
                                        int i68 = i67 - 1;
                                        int i69 = i68 - 1;
                                        iArr8[i68] = i65 + 6;
                                        int i70 = i69 - 1;
                                        iArr8[i69] = method_811(i65 + 8);
                                        int method_8116 = method_811(i65);
                                        i65 += 10;
                                        iArr8[i70] = method_8116;
                                        i66 = i70;
                                        i67 = i70;
                                    }
                                }
                                int method_8117 = method_811(i23);
                                int i71 = method_8117;
                                int i72 = method_8117;
                                int i73 = i23 + 2;
                                while (true) {
                                    int i74 = i72 - 1;
                                    if (i71 > 0) {
                                        int method_8118 = method_811(i73);
                                        int method_8119 = method_811(i73 + 2);
                                        String method_8445 = method_844(i73 + 4, cArr);
                                        String method_8446 = method_844(i73 + 6, cArr);
                                        int i75 = i73 + 10;
                                        int method_81110 = method_811(i73 + 8);
                                        String str = null;
                                        if (iArr8 != null) {
                                            int i76 = 0;
                                            while (true) {
                                                int i77 = i76;
                                                if (i76 >= iArr8.length) {
                                                    break;
                                                }
                                                if (iArr8[i77] == method_8118 && iArr8[i77 + 1] == method_81110) {
                                                    str = method_844(iArr8[i77 + 2], cArr);
                                                } else {
                                                    i76 = i77 + 3;
                                                }
                                            }
                                        }
                                        class_265Var.method_1152(method_8445, method_8446, str, class_243VarArr[method_8118], class_243VarArr[method_8118 + method_8119], method_81110);
                                        i71 = i74;
                                        i72 = i74;
                                        i73 = i75;
                                    }
                                }
                            }
                            if (iArr4 != null) {
                                int length2 = iArr4.length;
                                int i78 = 0;
                                int i79 = 0;
                                while (i78 < length2) {
                                    int i80 = iArr4[i79];
                                    int method_823 = method_823(i80);
                                    if (method_823 == 64 || method_823 == 65) {
                                        int method_7993 = method_799(class_84Var, i80);
                                        method_842(class_265Var.method_1155(class_84Var.field_357, class_84Var.field_350, class_84Var.field_358, class_84Var.field_351, class_84Var.field_344, method_844(method_7993, cArr), true), method_7993 + 2, true, cArr);
                                    }
                                    int i81 = i79 + 1;
                                    i78 = i81;
                                    i79 = i81;
                                }
                            }
                            if (iArr5 != null) {
                                int length3 = iArr5.length;
                                int i82 = 0;
                                int i83 = 0;
                                while (i82 < length3) {
                                    int i84 = iArr5[i83];
                                    int method_8232 = method_823(i84);
                                    if (method_8232 == 64 || method_8232 == 65) {
                                        int method_7994 = method_799(class_84Var, i84);
                                        method_842(class_265Var.method_1155(class_84Var.field_357, class_84Var.field_350, class_84Var.field_358, class_84Var.field_351, class_84Var.field_344, method_844(method_7994, cArr), false), method_7994 + 2, true, cArr);
                                    }
                                    int i85 = i83 + 1;
                                    i82 = i85;
                                    i83 = i85;
                                }
                            }
                            class_187 class_187Var2 = class_187Var;
                            class_187 class_187Var3 = class_187Var;
                            while (class_187Var2 != null) {
                                class_187 class_187Var4 = class_187Var3.field_739;
                                class_187Var3.field_739 = null;
                                class_265Var.method_1150(class_187Var3);
                                class_187Var2 = class_187Var4;
                                class_187Var3 = class_187Var4;
                            }
                            class_265Var.method_1162(method_8112, method_8113);
                            return;
                        }
                        String method_8447 = method_844(i28, cArr);
                        int i86 = i28 + 6;
                        int method_8369 = method_836(i28 + 2);
                        if (!"LocalVariableTable".equals(method_8447)) {
                            if ("LocalVariableTypeTable".equals(method_8447)) {
                                i8 = i86;
                                method_806 = class_187Var;
                                iArr2 = iArr5;
                                iArr3 = iArr4;
                                i5 = i23;
                                z2 = z3;
                                i7 = i22;
                                i6 = i21;
                                i9 = i86;
                            } else {
                                if ("LineNumberTable".equals(method_8447)) {
                                    if ((class_84Var.field_342 & 2) == 0) {
                                        int i87 = i86 + 2;
                                        int method_81111 = method_811(i86);
                                        int i88 = method_81111;
                                        int i89 = method_81111;
                                        while (true) {
                                            int i90 = i89 - 1;
                                            if (i88 > 0) {
                                                int method_81112 = method_811(i87);
                                                int method_81113 = method_811(i87 + 2);
                                                method_813(method_81112, class_243VarArr);
                                                class_243VarArr[method_81112].method_1095(method_81113);
                                                i88 = i90;
                                                i89 = i90;
                                                i87 += 4;
                                            }
                                        }
                                    }
                                } else if ("RuntimeVisibleTypeAnnotations".equals(method_8447)) {
                                    iArr3 = method_832(class_265Var, class_84Var, i86, true);
                                    i8 = i86;
                                    method_806 = class_187Var;
                                    iArr2 = iArr5;
                                    i5 = i23;
                                    z2 = z3;
                                    i7 = i22;
                                    i6 = i21;
                                    i9 = i24;
                                } else if (!"RuntimeInvisibleTypeAnnotations".equals(method_8447)) {
                                    if ("StackMapTable".equals(method_8447)) {
                                        if ((class_84Var.field_342 & 4) == 0) {
                                            i6 = i86 + 2;
                                            i7 = i86 + method_8369;
                                            i8 = i86;
                                            method_806 = class_187Var;
                                            iArr2 = iArr5;
                                            iArr3 = iArr4;
                                            i5 = i23;
                                            z2 = z3;
                                            i9 = i24;
                                        }
                                    } else if (!"StackMap".equals(method_8447)) {
                                        method_806 = method_806(class_84Var.field_345, method_8447, i86, method_8369, cArr, i, class_243VarArr);
                                        method_806.field_739 = class_187Var;
                                        i5 = i23;
                                    } else if ((class_84Var.field_342 & 4) == 0) {
                                        i6 = i86 + 2;
                                        i7 = i86 + method_8369;
                                        z2 = false;
                                        i8 = i86;
                                        method_806 = class_187Var;
                                        iArr2 = iArr5;
                                        iArr3 = iArr4;
                                        i5 = i23;
                                        i9 = i24;
                                    }
                                    i8 = i86;
                                    iArr2 = iArr5;
                                    iArr3 = iArr4;
                                    z2 = z3;
                                    i7 = i22;
                                    i6 = i21;
                                    i9 = i24;
                                } else {
                                    iArr2 = method_832(class_265Var, class_84Var, i86, false);
                                    i8 = i86;
                                    method_806 = class_187Var;
                                    iArr3 = iArr4;
                                    i5 = i23;
                                    z2 = z3;
                                    i7 = i22;
                                    i6 = i21;
                                    i9 = i24;
                                }
                                method_806 = class_187Var;
                                i5 = i23;
                                i8 = i86;
                                iArr2 = iArr5;
                                iArr3 = iArr4;
                                z2 = z3;
                                i7 = i22;
                                i6 = i21;
                                i9 = i24;
                            }
                            i28 = method_8369 + i8;
                            i26 = i29;
                            i27 = i29;
                            class_187Var = method_806;
                            iArr5 = iArr2;
                            iArr4 = iArr3;
                            i23 = i5;
                            z3 = z2;
                            i22 = i7;
                            i21 = i6;
                            i24 = i9;
                        } else {
                            if ((class_84Var.field_342 & 2) == 0) {
                                int i91 = i86 + 2;
                                int method_81114 = method_811(i86);
                                while (true) {
                                    int i92 = method_81114;
                                    method_81114--;
                                    if (i92 > 0) {
                                        int method_81115 = method_811(i91);
                                        method_813(method_81115, class_243VarArr);
                                        int method_81116 = method_811(i91 + 2);
                                        i91 += 10;
                                        method_813(method_81115 + method_81116, class_243VarArr);
                                    } else {
                                        method_806 = class_187Var;
                                        i5 = i86;
                                        i8 = i86;
                                        iArr2 = iArr5;
                                        iArr3 = iArr4;
                                        z2 = z3;
                                        i7 = i22;
                                        i6 = i21;
                                        i9 = i24;
                                        i28 = method_8369 + i8;
                                        i26 = i29;
                                        i27 = i29;
                                        class_187Var = method_806;
                                        iArr5 = iArr2;
                                        iArr4 = iArr3;
                                        i23 = i5;
                                        z3 = z2;
                                        i22 = i7;
                                        i21 = i6;
                                        i24 = i9;
                                    }
                                }
                            }
                            method_806 = class_187Var;
                            i5 = i23;
                            i8 = i86;
                            iArr2 = iArr5;
                            iArr3 = iArr4;
                            z2 = z3;
                            i7 = i22;
                            i6 = i21;
                            i9 = i24;
                            i28 = method_8369 + i8;
                            i26 = i29;
                            i27 = i29;
                            class_187Var = method_806;
                            iArr5 = iArr2;
                            iArr4 = iArr3;
                            i23 = i5;
                            z3 = z2;
                            i22 = i7;
                            i21 = i6;
                            i24 = i9;
                        }
                    }
                } else {
                    class_243 method_804 = method_804(method_811(i19), class_243VarArr);
                    class_243 method_8042 = method_804(method_811(i19 + 2), class_243VarArr);
                    class_243 method_8043 = method_804(method_811(i19 + 4), class_243VarArr);
                    int i93 = this.field_721[method_811(i19 + 6)];
                    i19 += 8;
                    class_265Var.method_1170(method_804, method_8042, method_8043, method_844(i93, cArr));
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:74:0x0247 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:15:0x00a4 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:83:0x0283 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:88:0x02ac */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:93:0x02d5 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:98:0x030e */
    public int method_797(class_354 class_354Var, class_84 class_84Var, int i) {
        boolean z;
        class_173 class_173Var;
        class_187 method_806;
        String[] strArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        char[] cArr = class_84Var.field_354;
        class_84Var.field_356 = method_811(i);
        class_84Var.field_355 = method_844(i + 2, cArr);
        int i8 = i + 6;
        class_84Var.field_348 = method_844(i + 4, cArr);
        int i9 = 0;
        int i10 = 0;
        String[] strArr2 = null;
        boolean z2 = false;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        class_187 class_187Var = null;
        int i20 = i8 + 2;
        int method_811 = method_811(i8);
        int i21 = method_811;
        int i22 = method_811;
        while (true) {
            int i23 = i22 - 1;
            if (i21 <= 0) {
                break;
            }
            String method_844 = method_844(i20, cArr);
            int i24 = i20 + 6;
            int method_836 = method_836(i20 + 2);
            if ("Code".equals(method_844)) {
                if ((class_84Var.field_342 & 1) == 0) {
                    i2 = i24;
                    i3 = i19;
                    i4 = i18;
                    i5 = i17;
                    i6 = i16;
                    i7 = i15;
                    i9 = i24;
                } else {
                    method_806 = class_187Var;
                    strArr = strArr2;
                    i2 = i24;
                    class_187Var = method_806;
                    i3 = i19;
                    i4 = i18;
                    i5 = i17;
                    i6 = i16;
                    i7 = i15;
                    strArr2 = strArr;
                }
            } else {
                if ("Exceptions".equals(method_844)) {
                    strArr = new String[method_811(i24)];
                    int i25 = i24 + 2;
                    int i26 = 0;
                    while (true) {
                        int i27 = i26;
                        if (i26 >= strArr.length) {
                            break;
                        }
                        String method_840 = method_840(i25, cArr);
                        i25 += 2;
                        strArr[i27] = method_840;
                        i26 = i27 + 1;
                    }
                    method_806 = class_187Var;
                    i10 = i24;
                } else if ("Signature".equals(method_844)) {
                    i2 = i24;
                    i3 = i19;
                    i4 = i18;
                    i5 = i17;
                    i6 = i16;
                    i7 = i15;
                    i11 = method_811(i24);
                } else if ("Deprecated".equals(method_844)) {
                    class_84Var.field_356 |= class_555.field_2095;
                    i2 = i24;
                    i3 = i19;
                    i4 = i18;
                    i5 = i17;
                    i6 = i16;
                    i7 = i15;
                } else if ("RuntimeVisibleAnnotations".equals(method_844)) {
                    i2 = i24;
                    i3 = i19;
                    i4 = i18;
                    i5 = i17;
                    i6 = i16;
                    i7 = i15;
                    i12 = i24;
                } else if ("RuntimeVisibleTypeAnnotations".equals(method_844)) {
                    i2 = i24;
                    i3 = i19;
                    i4 = i18;
                    i5 = i17;
                    i6 = i24;
                    i7 = i15;
                } else if ("AnnotationDefault".equals(method_844)) {
                    i2 = i24;
                    i3 = i19;
                    i4 = i24;
                    i5 = i17;
                    i6 = i16;
                    i7 = i15;
                } else if (!"Synthetic".equals(method_844)) {
                    if ("RuntimeInvisibleAnnotations".equals(method_844)) {
                        i2 = i24;
                        i3 = i19;
                        i4 = i18;
                        i5 = i17;
                        i6 = i16;
                        i7 = i15;
                        i13 = i24;
                    } else if ("RuntimeInvisibleTypeAnnotations".equals(method_844)) {
                        i2 = i24;
                        i3 = i19;
                        i4 = i18;
                        i5 = i24;
                        i6 = i16;
                        i7 = i15;
                    } else if ("RuntimeVisibleParameterAnnotations".equals(method_844)) {
                        i2 = i24;
                        i3 = i19;
                        i4 = i18;
                        i5 = i17;
                        i6 = i16;
                        i7 = i15;
                        i14 = i24;
                    } else if ("RuntimeInvisibleParameterAnnotations".equals(method_844)) {
                        i2 = i24;
                        i3 = i19;
                        i4 = i18;
                        i5 = i17;
                        i6 = i16;
                        i7 = i24;
                    } else if ("MethodParameters".equals(method_844)) {
                        i2 = i24;
                        i3 = i24;
                        i4 = i18;
                        i5 = i17;
                        i6 = i16;
                        i7 = i15;
                    } else {
                        method_806 = method_806(class_84Var.field_345, method_844, i24, method_836, cArr, -1, null);
                        method_806.field_739 = class_187Var;
                        strArr = strArr2;
                    }
                } else {
                    class_84Var.field_356 |= 4096;
                    i2 = i24;
                    i3 = i19;
                    i4 = i18;
                    i5 = i17;
                    i6 = i16;
                    i7 = i15;
                    z2 = true;
                }
                i2 = i24;
                class_187Var = method_806;
                i3 = i19;
                i4 = i18;
                i5 = i17;
                i6 = i16;
                i7 = i15;
                strArr2 = strArr;
            }
            i20 = method_836 + i2;
            i21 = i23;
            i22 = i23;
            i19 = i3;
            i18 = i4;
            i17 = i5;
            i16 = i6;
            i15 = i7;
        }
        class_265 method_1447 = class_354Var.method_1447(class_84Var.field_356, class_84Var.field_355, class_84Var.field_348, i11 == 0 ? null : method_830(i11, cArr), strArr2);
        if (method_1447 == null) {
            return i20;
        }
        if (method_1447 instanceof class_469) {
            class_469 class_469Var = (class_469) method_1447;
            if ((class_84Var.field_356 & class_555.field_2095) != 0) {
                z = true;
                class_173Var = this;
            } else {
                z = false;
                class_173Var = this;
            }
            if (class_469Var.method_1773(this, z2, z, class_173Var.method_811(i + 4), i11, i10)) {
                class_469Var.method_1769(i, i20 - i);
                return i20;
            }
        }
        if (i19 != 0 && (class_84Var.field_342 & 2) == 0) {
            int method_823 = method_823(i19);
            int i28 = i19 + 1;
            int i29 = method_823;
            while (true) {
                method_823--;
                if (i29 <= 0) {
                    break;
                }
                method_1447.method_1163(method_844(i28, cArr), method_811(i28 + 2));
                i29 = method_823;
                i28 += 4;
            }
        }
        if (i18 != 0) {
            class_610 method_1157 = method_1447.method_1157();
            method_817(method_1157, i18, null, cArr);
            if (method_1157 != null) {
                method_1157.method_1022();
            }
        }
        if (i12 != 0) {
            int method_8112 = method_811(i12);
            int i30 = i12 + 2;
            while (true) {
                int i31 = method_8112;
                method_8112--;
                if (i31 <= 0) {
                    break;
                }
                i30 = method_842(method_1447.method_1151(method_844(i30, cArr), true), i30 + 2, true, cArr);
            }
        }
        if (i13 != 0) {
            int method_8113 = method_811(i13);
            int i32 = i13 + 2;
            while (true) {
                int i33 = method_8113;
                method_8113--;
                if (i33 <= 0) {
                    break;
                }
                i32 = method_842(method_1447.method_1151(method_844(i32, cArr), false), i32 + 2, true, cArr);
            }
        }
        if (i16 != 0) {
            int method_8114 = method_811(i16);
            int i34 = i16 + 2;
            while (true) {
                int i35 = method_8114;
                method_8114--;
                if (i35 <= 0) {
                    break;
                }
                int method_799 = method_799(class_84Var, i34);
                i34 = method_842(method_1447.method_1174(class_84Var.field_357, class_84Var.field_350, method_844(method_799, cArr), true), method_799 + 2, true, cArr);
            }
        }
        if (i17 != 0) {
            int method_8115 = method_811(i17);
            int i36 = i17 + 2;
            while (true) {
                int i37 = method_8115;
                method_8115--;
                if (i37 <= 0) {
                    break;
                }
                int method_7992 = method_799(class_84Var, i36);
                i36 = method_842(method_1447.method_1174(class_84Var.field_357, class_84Var.field_350, method_844(method_7992, cArr), false), method_7992 + 2, true, cArr);
            }
        }
        if (i14 != 0) {
            method_821(method_1447, class_84Var, i14, true);
        }
        if (i15 != 0) {
            method_821(method_1447, class_84Var, i15, false);
        }
        class_187 class_187Var2 = class_187Var;
        class_187 class_187Var3 = class_187Var;
        while (class_187Var2 != null) {
            class_187 class_187Var4 = class_187Var3.field_739;
            class_187Var3.field_739 = null;
            method_1447.method_1150(class_187Var3);
            class_187Var2 = class_187Var4;
            class_187Var3 = class_187Var4;
        }
        if (i9 != 0) {
            method_1447.method_1171();
            method_824(method_1447, class_84Var, i9);
        }
        method_1447.method_1159();
        return i20;
    }

    public String method_840(int i, char[] cArr) {
        return method_809(i, cArr);
    }

    public int method_814() {
        return this.field_721.length;
    }

    public int method_811(int i) {
        byte[] bArr = this.field_713;
        return (bArr[i + 1] & ASMInterface.field_1291) | ((bArr[i] & ASMInterface.field_1291) << 8);
    }

    public void method_826(int i) {
    }

    public long method_829(int i) {
        return (method_836(i) << 32) | (method_836(i + 4) & 4294967295L);
    }

    public final String method_830(int i, char[] cArr) {
        String str = this.field_712[i];
        if (str == null) {
            int i2 = this.field_721[i];
            String[] strArr = this.field_712;
            String method_822 = method_822(i2 + 2, method_811(i2), cArr);
            strArr[i] = method_822;
            return method_822;
        }
        return str;
    }

    public int method_810() {
        return this.field_714;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:12:0x001d */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:4:0x000a */
    public int method_842(class_610 class_610Var, int i, boolean z, char[] cArr) {
        int i2 = i + 2;
        int method_811 = method_811(i);
        if (!z) {
            while (true) {
                int i3 = method_811;
                method_811--;
                if (i3 <= 0) {
                    break;
                }
                i2 = method_817(class_610Var, i2, null, cArr);
            }
        } else {
            while (true) {
                int i4 = method_811;
                method_811--;
                if (i4 <= 0) {
                    break;
                }
                i2 = method_817(class_610Var, i2 + 2, method_844(i2, cArr), cArr);
            }
        }
        if (class_610Var != null) {
            class_610Var.method_1022();
        }
        return i2;
    }

    public String method_822(int i, int i2, char[] cArr) {
        int i3 = i + i2;
        byte[] bArr = this.field_713;
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            i++;
            if ((b & 128) != 0) {
                if ((b & 224) == 192) {
                    int i5 = bArr[i] & 63;
                    i++;
                    cArr[i4] = (char) (((b & 31) << 6) + i5);
                    i4++;
                } else {
                    int i6 = i + 1;
                    i = i6 + 1;
                    cArr[i4] = (char) (((b & 15) << 12) + ((bArr[i] & 63) << 6) + (bArr[i6] & 63));
                    i4++;
                }
            } else {
                cArr[i4] = (char) (b & Byte.MAX_VALUE);
                i4++;
            }
        }
        return new String(cArr, 0, i4);
    }

    public String method_819(int i, char[] cArr) {
        return method_809(i, cArr);
    }

    public Object method_825(int i, char[] cArr) {
        int i2 = this.field_721[i];
        switch (this.field_713[i2 - 1]) {
            case 3:
                return Integer.valueOf(method_836(i2));
            case 4:
                return Float.valueOf(Float.intBitsToFloat(method_836(i2)));
            case 5:
                return Long.valueOf(method_829(i2));
            case 6:
                return Double.valueOf(Double.longBitsToDouble(method_829(i2)));
            case 7:
                return class_279.method_1240(method_844(i2, cArr));
            case 8:
                return method_844(i2, cArr);
            case 9:
            case 10:
            case 11:
            case 12:
            case class_555.field_2278 /* 13 */:
            case class_555.field_2199 /* 14 */:
            default:
                throw new IllegalArgumentException();
            case 15:
                int method_823 = method_823(i2);
                int i3 = this.field_721[method_811(i2 + 1)];
                int i4 = this.field_721[method_811(i3 + 2)];
                return new class_350(method_823, method_840(i3, cArr), method_844(i4, cArr), method_844(i4 + 2, cArr), this.field_713[i3 + (-1)] == 11);
            case 16:
                return class_279.method_1244(method_844(i2, cArr));
            case 17:
                return method_827(i, cArr);
        }
    }

    public void method_821(class_265 class_265Var, class_84 class_84Var, int i, boolean z) {
        int i2 = this.field_713[i] & ASMInterface.field_1291;
        int i3 = i + 1;
        class_265Var.method_1177(i2, z);
        char[] cArr = class_84Var.field_354;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int method_811 = method_811(i3);
            int i6 = method_811;
            int i7 = method_811;
            i3 += 2;
            while (true) {
                int i8 = i7 - 1;
                if (i6 > 0) {
                    i3 = method_842(class_265Var.method_1176(i5, method_844(i3, cArr), z), i3 + 2, true, cArr);
                    i6 = i8;
                    i7 = i8;
                }
            }
            int i9 = i5 + 1;
            i4 = i9;
            i5 = i9;
        }
    }

    public int[] method_832(class_265 class_265Var, class_84 class_84Var, int i, boolean z) {
        int i2;
        class_173 class_173Var;
        int method_842;
        char[] cArr = class_84Var.field_354;
        int[] iArr = new int[method_811(i)];
        int i3 = 0;
        int i4 = 0;
        int i5 = i + 2;
        while (i3 < iArr.length) {
            iArr[i4] = i5;
            int method_836 = method_836(i5);
            switch (method_836 >>> 24) {
                case 16:
                case 17:
                case 18:
                case 23:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                    i2 = i5 + 3;
                    class_173Var = this;
                    break;
                case 64:
                case 65:
                    i2 = i5 + 3;
                    int method_811 = method_811(i5 + 1);
                    int i6 = method_811;
                    int i7 = method_811;
                    while (true) {
                        int i8 = i7 - 1;
                        if (i6 <= 0) {
                            class_173Var = this;
                            break;
                        } else {
                            int method_8112 = method_811(i2);
                            int i9 = i2 + 6;
                            int method_8113 = method_811(i2 + 2);
                            method_804(method_8112, class_84Var.field_349);
                            method_804(method_8112 + method_8113, class_84Var.field_349);
                            i6 = i8;
                            i7 = i8;
                            i2 = i9;
                        }
                    }
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                    i2 = i5 + 4;
                    class_173Var = this;
                    break;
                default:
                    throw new IllegalArgumentException();
            }
            int method_823 = class_173Var.method_823(i2);
            if ((method_836 >>> 24) != 66) {
                method_842 = method_842(null, (method_823 * 2) + 3 + i2, true, cArr);
            } else {
                class_91 class_91Var = method_823 == 0 ? null : new class_91(this.field_713, i2);
                int i10 = i2 + (method_823 * 2) + 1;
                method_842 = method_842(class_265Var.method_1179(method_836 & (-256), class_91Var, method_844(i10, cArr), z), i10 + 2, true, cArr);
            }
            int i11 = i4 + 1;
            i3 = i11;
            i4 = i11;
            i5 = method_842;
        }
        return iArr;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:18:0x005d */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:24:0x0074 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:30:0x008e */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r9.field_347 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void method_828(class_84 class_84Var) {
        int i;
        int i2 = 1;
        String str = class_84Var.field_348;
        Object[] objArr = class_84Var.field_352;
        int i3 = 0;
        if ((class_84Var.field_356 & 8) == 0) {
            if ("<init>".equals(class_84Var.field_355)) {
                objArr[0] = class_555.field_2176;
                i3 = 1;
            } else {
                objArr[0] = method_840(this.field_715 + 2, class_84Var.field_354);
                i3 = 1;
            }
        }
        int i4 = i3;
        while (true) {
            int i5 = i2 + 1;
            switch (str.charAt(i2)) {
                case 'B':
                case 'C':
                case 'I':
                case 'S':
                case 'Z':
                    objArr[i4] = class_555.field_2295;
                    i2 = i5;
                    i4++;
                    break;
                case 'D':
                    objArr[i4] = class_555.field_2247;
                    i2 = i5;
                    i4++;
                    break;
                case 'F':
                    objArr[i4] = class_555.field_2116;
                    i2 = i5;
                    i4++;
                    break;
                case 'J':
                    objArr[i4] = class_555.field_2308;
                    i2 = i5;
                    i4++;
                    break;
                case ASMStuffs.field_86 /* 76 */:
                    while (true) {
                        int i6 = i5;
                        if (str.charAt(i6) == ';') {
                            String substring = str.substring(i2 + 1, i6);
                            i2 = i6 + 1;
                            objArr[i4] = substring;
                            i4++;
                            break;
                        } else {
                            i5 = i6 + 1;
                        }
                    }
                case '[':
                    while (str.charAt(i5) == '[') {
                        i5++;
                    }
                    if (str.charAt(i5) == 'L') {
                        i = i5 + 1;
                        while (str.charAt(i) != ';') {
                            i++;
                        }
                    } else {
                        i = i5;
                    }
                    int i7 = i + 1;
                    objArr[i4] = str.substring(i2, i7);
                    i2 = i7;
                    i4++;
                    break;
            }
        }
    }

    public int method_808(int i, boolean z, boolean z2, class_84 class_84Var) {
        class_84 class_84Var2;
        int i2;
        int i3;
        class_84 class_84Var3;
        char[] cArr = class_84Var.field_354;
        class_243[] class_243VarArr = class_84Var.field_349;
        if (!z) {
            class_84Var.field_346 = -1;
            class_84Var2 = class_84Var;
            i2 = 255;
            i3 = i;
        } else {
            i3 = i + 1;
            class_84Var2 = class_84Var;
            i2 = this.field_713[i] & ASMInterface.field_1291;
        }
        class_84Var2.field_343 = 0;
        if (i2 >= 64) {
            if (i2 < 128) {
                i2 -= 64;
                i3 = method_833(i3, class_84Var.field_341, 0, cArr, class_243VarArr);
                class_84Var.field_340 = 4;
                class_84Var.field_353 = 1;
                class_84Var3 = class_84Var;
            } else {
                if (i2 < 247) {
                    throw new IllegalArgumentException();
                }
                int i4 = i3 + 2;
                int method_811 = method_811(i3);
                if (i2 != 247) {
                    if (i2 >= 248 && i2 < 251) {
                        class_84Var.field_340 = 2;
                        class_84Var.field_343 = 251 - i2;
                        class_84Var.field_347 -= class_84Var.field_343;
                        class_84Var.field_353 = 0;
                        class_84Var3 = class_84Var;
                        i2 = method_811;
                        i3 = i4;
                    } else if (i2 == 251) {
                        class_84Var.field_340 = 3;
                        class_84Var.field_353 = 0;
                        class_84Var3 = class_84Var;
                        i2 = method_811;
                        i3 = i4;
                    } else if (i2 < 255) {
                        int i5 = i2 - 251;
                        int i6 = i5;
                        int i7 = i5;
                        int i8 = z2 ? class_84Var.field_347 : 0;
                        i3 = i4;
                        while (i6 > 0) {
                            int i9 = i7 - 1;
                            i3 = method_833(i3, class_84Var.field_352, i8, cArr, class_243VarArr);
                            i8++;
                            i6 = i9;
                            i7 = i9;
                        }
                        class_84Var.field_340 = 1;
                        class_84Var.field_343 = i2 - 251;
                        class_84Var.field_347 += class_84Var.field_343;
                        class_84Var.field_353 = 0;
                        class_84Var3 = class_84Var;
                        i2 = method_811;
                    } else {
                        int method_8112 = method_811(i4);
                        int i10 = i4 + 2;
                        class_84Var.field_340 = 0;
                        class_84Var.field_343 = method_8112;
                        class_84Var.field_347 = method_8112;
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < method_8112) {
                            int i13 = i12 + 1;
                            i10 = method_833(i10, class_84Var.field_352, i12, cArr, class_243VarArr);
                            i11 = i13;
                            i12 = i13;
                        }
                        int method_8113 = method_811(i10);
                        i3 = i10 + 2;
                        class_84Var.field_353 = method_8113;
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < method_8113) {
                            int i16 = i15 + 1;
                            i3 = method_833(i3, class_84Var.field_341, i15, cArr, class_243VarArr);
                            i14 = i16;
                            i15 = i16;
                        }
                        class_84Var3 = class_84Var;
                        i2 = method_811;
                    }
                } else {
                    i3 = method_833(i4, class_84Var.field_341, 0, cArr, class_243VarArr);
                    class_84Var.field_340 = 4;
                    class_84Var.field_353 = 1;
                    class_84Var3 = class_84Var;
                    i2 = method_811;
                }
            }
        } else {
            class_84Var.field_340 = 3;
            class_84Var.field_353 = 0;
            class_84Var3 = class_84Var;
        }
        class_84Var3.field_346 += i2 + 1;
        method_804(class_84Var.field_346, class_243VarArr);
        return i3;
    }

    public short method_831(int i) {
        byte[] bArr = this.field_713;
        return (short) ((bArr[i + 1] & ASMInterface.field_1291) | ((bArr[i] & ASMInterface.field_1291) << 8));
    }

    public void method_813(int i, class_243[] class_243VarArr) {
        if (class_243VarArr[i] == null) {
            class_243 method_803 = method_803(i, class_243VarArr);
            method_803.field_895 = (short) (method_803.field_895 | 1);
        }
    }

    public int method_839(int i) {
        return this.field_721[i];
    }

    public String method_844(int i, char[] cArr) {
        int method_811 = method_811(i);
        if (i == 0 || method_811 == 0) {
            return null;
        }
        return method_830(method_811, cArr);
    }

    public class_243 method_804(int i, class_243[] class_243VarArr) {
        class_243 method_803 = method_803(i, class_243VarArr);
        method_803.field_895 = (short) (method_803.field_895 & (-2));
        return method_803;
    }

    public String method_809(int i, char[] cArr) {
        return method_844(this.field_721[method_811(i)], cArr);
    }

    public int method_817(class_610 class_610Var, int i, String str, char[] cArr) {
        Object obj;
        if (class_610Var != null) {
            int i2 = i + 1;
            switch (this.field_713[i] & ASMInterface.field_1291) {
                case 64:
                    return method_842(class_610Var.method_1016(str, method_844(i2, cArr)), i2 + 2, true, cArr);
                case 66:
                    int i3 = i2 + 2;
                    class_610Var.method_1024(str, Byte.valueOf((byte) method_836(this.field_721[method_811(i2)])));
                    return i3;
                case 67:
                    int i4 = i2 + 2;
                    class_610Var.method_1024(str, Character.valueOf((char) method_836(this.field_721[method_811(i2)])));
                    return i4;
                case 68:
                case 70:
                case 73:
                case 74:
                    int i5 = i2 + 2;
                    class_610Var.method_1024(str, method_825(method_811(i2), cArr));
                    return i5;
                case 83:
                    int i6 = i2 + 2;
                    class_610Var.method_1024(str, Short.valueOf((short) method_836(this.field_721[method_811(i2)])));
                    return i6;
                case 90:
                    if (method_836(this.field_721[method_811(i2)]) == 0) {
                        obj = Boolean.FALSE;
                    } else {
                        obj = Boolean.TRUE;
                    }
                    class_610Var.method_1024(str, obj);
                    return i2 + 2;
                case 91:
                    int i7 = i2 + 2;
                    int method_811 = method_811(i2);
                    if (method_811 == 0) {
                        return method_842(class_610Var.method_1023(str), i7 - 2, false, cArr);
                    }
                    switch (this.field_713[i7] & ASMInterface.field_1291) {
                        case 66:
                            byte[] bArr = new byte[method_811];
                            int i8 = 0;
                            int i9 = 0;
                            while (i8 < method_811) {
                                byte method_836 = (byte) method_836(this.field_721[method_811(i7 + 1)]);
                                i7 += 3;
                                bArr[i9] = method_836;
                                int i10 = i9 + 1;
                                i8 = i10;
                                i9 = i10;
                            }
                            class_610Var.method_1024(str, bArr);
                            return i7;
                        case 67:
                            char[] cArr2 = new char[method_811];
                            int i11 = 0;
                            int i12 = 0;
                            while (i11 < method_811) {
                                char method_8362 = (char) method_836(this.field_721[method_811(i7 + 1)]);
                                i7 += 3;
                                cArr2[i12] = method_8362;
                                int i13 = i12 + 1;
                                i11 = i13;
                                i12 = i13;
                            }
                            class_610Var.method_1024(str, cArr2);
                            return i7;
                        case 68:
                            double[] dArr = new double[method_811];
                            int i14 = 0;
                            int i15 = 0;
                            while (i14 < method_811) {
                                double longBitsToDouble = Double.longBitsToDouble(method_829(this.field_721[method_811(i7 + 1)]));
                                i7 += 3;
                                dArr[i15] = longBitsToDouble;
                                int i16 = i15 + 1;
                                i14 = i16;
                                i15 = i16;
                            }
                            class_610Var.method_1024(str, dArr);
                            return i7;
                        case 70:
                            float[] fArr = new float[method_811];
                            int i17 = 0;
                            int i18 = 0;
                            while (i17 < method_811) {
                                float intBitsToFloat = Float.intBitsToFloat(method_836(this.field_721[method_811(i7 + 1)]));
                                i7 += 3;
                                fArr[i18] = intBitsToFloat;
                                int i19 = i18 + 1;
                                i17 = i19;
                                i18 = i19;
                            }
                            class_610Var.method_1024(str, fArr);
                            return i7;
                        case 73:
                            int[] iArr = new int[method_811];
                            int i20 = 0;
                            int i21 = 0;
                            while (i20 < method_811) {
                                int method_8363 = method_836(this.field_721[method_811(i7 + 1)]);
                                i7 += 3;
                                iArr[i21] = method_8363;
                                int i22 = i21 + 1;
                                i20 = i22;
                                i21 = i22;
                            }
                            class_610Var.method_1024(str, iArr);
                            return i7;
                        case 74:
                            long[] jArr = new long[method_811];
                            int i23 = 0;
                            int i24 = 0;
                            while (i23 < method_811) {
                                long method_829 = method_829(this.field_721[method_811(i7 + 1)]);
                                i7 += 3;
                                jArr[i24] = method_829;
                                int i25 = i24 + 1;
                                i23 = i25;
                                i24 = i25;
                            }
                            class_610Var.method_1024(str, jArr);
                            return i7;
                        case 83:
                            short[] sArr = new short[method_811];
                            int i26 = 0;
                            int i27 = 0;
                            while (i26 < method_811) {
                                short method_8364 = (short) method_836(this.field_721[method_811(i7 + 1)]);
                                i7 += 3;
                                sArr[i27] = method_8364;
                                int i28 = i27 + 1;
                                i26 = i28;
                                i27 = i28;
                            }
                            class_610Var.method_1024(str, sArr);
                            return i7;
                        case 90:
                            boolean[] zArr = new boolean[method_811];
                            int i29 = 0;
                            int i30 = 0;
                            int i31 = i7;
                            while (i29 < method_811) {
                                zArr[i30] = method_836(this.field_721[method_811(i31 + 1)]) != 0;
                                int i32 = i30 + 1;
                                i31 += 3;
                                i29 = i32;
                                i30 = i32;
                            }
                            class_610Var.method_1024(str, zArr);
                            return i31;
                        default:
                            return method_842(class_610Var.method_1023(str), i7 - 2, false, cArr);
                    }
                case 99:
                    int i33 = i2 + 2;
                    class_610Var.method_1024(str, class_279.method_1229(method_844(i2, cArr)));
                    return i33;
                case 101:
                    int i34 = i2 + 4;
                    class_610Var.method_1015(str, method_844(i2, cArr), method_844(i2 + 2, cArr));
                    return i34;
                case 115:
                    int i35 = i2 + 2;
                    class_610Var.method_1024(str, method_844(i2, cArr));
                    return i35;
                default:
                    throw new IllegalArgumentException();
            }
        }
        switch (this.field_713[i] & ASMInterface.field_1291) {
            case 64:
                return method_842(null, i + 3, true, cArr);
            case 91:
                return method_842(null, i + 1, false, cArr);
            case 101:
                return i + 5;
            default:
                return i + 3;
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:6:0x002f */
    public int[] method_815(int i) {
        char[] cArr = new char[i];
        int method_812 = method_812();
        int method_811 = method_811(method_812 - 2);
        int i2 = method_811;
        int i3 = method_811;
        while (i2 > 0) {
            String method_844 = method_844(method_812, cArr);
            int i4 = method_812 + 6;
            int method_836 = method_836(method_812 + 2);
            if (!"BootstrapMethods".equals(method_844)) {
                int i5 = i3 - 1;
                method_812 = method_836 + i4;
                i2 = i5;
                i3 = i5;
            } else {
                int[] iArr = new int[method_811(i4)];
                int i6 = i4 + 2;
                int i7 = 0;
                while (true) {
                    int i8 = i7;
                    if (i7 < iArr.length) {
                        iArr[i8] = i6;
                        i7 = i8 + 1;
                        i6 += (method_811(i6 + 2) * 2) + 4;
                    } else {
                        return iArr;
                    }
                }
            }
        }
        throw new IllegalArgumentException();
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:10:0x003b */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:2:0x0016 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:13:0x0049 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:5:0x0024 */
    public final int method_812() {
        int i;
        int method_811 = this.field_715 + 8 + (method_811(this.field_715 + 6) * 2);
        int i2 = method_811 + 2;
        int method_8112 = method_811(method_811);
        while (true) {
            i = i2;
            int i3 = method_8112 - 1;
            if (method_8112 <= 0) {
                break;
            }
            i2 = i + 8;
            int method_8113 = method_811(i + 6);
            while (true) {
                int i4 = method_8113;
                method_8113--;
                if (i4 > 0) {
                    i2 += method_836(i2 + 2) + 6;
                }
            }
            method_8112 = i3;
        }
        int i5 = i + 2;
        int method_8114 = method_811(i);
        while (true) {
            int i6 = i5;
            int i7 = method_8114 - 1;
            if (method_8114 <= 0) {
                return i6 + 2;
            }
            i5 = i6 + 8;
            int method_8115 = method_811(i6 + 6);
            while (true) {
                int i8 = method_8115;
                method_8115--;
                if (i8 > 0) {
                    i5 += method_836(i5 + 2) + 6;
                }
            }
            method_8114 = i7;
        }
    }

    public int method_799(class_84 class_84Var, int i) {
        int i2;
        int i3;
        class_84 class_84Var2;
        int method_836 = method_836(i);
        switch (method_836 >>> 24) {
            case 0:
            case 1:
            case 22:
                i2 = i + 2;
                i3 = (-65536) & method_836;
                class_84Var2 = class_84Var;
                break;
            case 16:
            case 17:
            case 18:
            case 23:
            case 66:
                i2 = i + 3;
                i3 = method_836 & (-256);
                class_84Var2 = class_84Var;
                break;
            case 19:
            case 20:
            case 21:
                i2 = i + 1;
                i3 = (-16777216) & method_836;
                class_84Var2 = class_84Var;
                break;
            case 64:
            case 65:
                i3 = (-16777216) & method_836;
                i2 = i + 3;
                int method_811 = method_811(i + 1);
                class_84Var.field_358 = new class_243[method_811];
                class_84Var.field_351 = new class_243[method_811];
                class_84Var.field_344 = new int[method_811];
                int i4 = 0;
                int i5 = 0;
                while (i4 < method_811) {
                    int method_8112 = method_811(i2);
                    int method_8113 = method_811(i2 + 2);
                    int i6 = i2 + 6;
                    int method_8114 = method_811(i2 + 4);
                    class_84Var.field_358[i5] = method_804(method_8112, class_84Var.field_349);
                    class_84Var.field_351[i5] = method_804(method_8112 + method_8113, class_84Var.field_349);
                    int i7 = i5 + 1;
                    class_84Var.field_344[i5] = method_8114;
                    i4 = i7;
                    i5 = i7;
                    i2 = i6;
                }
                class_84Var2 = class_84Var;
                break;
            case 67:
            case 68:
            case 69:
            case 70:
                i2 = i + 3;
                i3 = (-16777216) & method_836;
                class_84Var2 = class_84Var;
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                i2 = i + 4;
                i3 = (-16776961) & method_836;
                class_84Var2 = class_84Var;
                break;
            default:
                throw new IllegalArgumentException();
        }
        class_84Var2.field_357 = i3;
        int method_823 = method_823(i2);
        class_84Var.field_350 = method_823 == 0 ? null : new class_91(this.field_713, i2);
        return i2 + 1 + (method_823 * 2);
    }

    public int method_836(int i) {
        byte[] bArr = this.field_713;
        return (bArr[i + 3] & ASMInterface.field_1291) | ((bArr[i] & ASMInterface.field_1291) << 24) | ((bArr[i + 1] & ASMInterface.field_1291) << 16) | ((bArr[i + 2] & ASMInterface.field_1291) << 8);
    }

    public int method_843(int[] iArr, int i) {
        if (iArr == null || i >= iArr.length || method_823(iArr[i]) < 67) {
            return -1;
        }
        return method_811(iArr[i] + 1);
    }

    public int method_833(int i, Object[] objArr, int i2, char[] cArr, class_243[] class_243VarArr) {
        int i3 = i + 1;
        switch (this.field_713[i] & ASMInterface.field_1291) {
            case 0:
                objArr[i2] = class_555.field_2073;
                return i3;
            case 1:
                objArr[i2] = class_555.field_2295;
                return i3;
            case 2:
                objArr[i2] = class_555.field_2116;
                return i3;
            case 3:
                objArr[i2] = class_555.field_2247;
                return i3;
            case 4:
                objArr[i2] = class_555.field_2308;
                return i3;
            case 5:
                objArr[i2] = class_555.field_2202;
                return i3;
            case 6:
                objArr[i2] = class_555.field_2176;
                return i3;
            case 7:
                String method_840 = method_840(i3, cArr);
                int i4 = i3 + 2;
                objArr[i2] = method_840;
                return i4;
            case 8:
                class_243 method_804 = method_804(method_811(i3), class_243VarArr);
                int i5 = i3 + 2;
                objArr[i2] = method_804;
                return i5;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:6:0x003e */
    public class_470 method_827(int i, char[] cArr) {
        class_470 class_470Var = this.field_716[i];
        if (class_470Var != null) {
            return class_470Var;
        }
        int i2 = this.field_721[i];
        int i3 = this.field_721[method_811(i2 + 2)];
        String method_844 = method_844(i3, cArr);
        String method_8442 = method_844(i3 + 2, cArr);
        int i4 = this.field_724[method_811(i2)];
        class_350 class_350Var = (class_350) method_825(method_811(i4), cArr);
        Object[] objArr = new Object[method_811(i4 + 2)];
        int i5 = i4 + 4;
        int i6 = 0;
        while (true) {
            int i7 = i6;
            if (i6 < objArr.length) {
                Object method_825 = method_825(method_811(i5), cArr);
                i5 += 2;
                objArr[i7] = method_825;
                i6 = i7 + 1;
            } else {
                class_470[] class_470VarArr = this.field_716;
                class_470 class_470Var2 = new class_470(method_844, method_8442, class_350Var, objArr);
                class_470VarArr[i] = class_470Var2;
                return class_470Var2;
            }
        }
    }

    public class_187 method_806(class_187[] class_187VarArr, String str, int i, int i2, char[] cArr, int i3, class_243[] class_243VarArr) {
        int length = class_187VarArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            class_187 class_187Var = class_187VarArr[i5];
            if (class_187Var.field_740.equals(str)) {
                return class_187Var.method_882(this, i, i2, cArr, i3, class_243VarArr);
            }
            int i6 = i5 + 1;
            i4 = i6;
            i5 = i6;
        }
        return new class_187(str).method_882(this, i, i2, null, -1, null);
    }

    public String method_820(int i, char[] cArr) {
        return method_809(i, cArr);
    }

    public int method_823(int i) {
        return this.field_713[i] & ASMInterface.field_1291;
    }

    public byte[] method_835(int i, int i2) {
        byte[] bArr = new byte[i2];
        System.arraycopy(this.field_713, i, bArr, 0, i2);
        return bArr;
    }

    public class_243 method_803(int i, class_243[] class_243VarArr) {
        if (class_243VarArr[i] == null) {
            class_243VarArr[i] = new class_243();
        }
        return class_243VarArr[i];
    }
}
