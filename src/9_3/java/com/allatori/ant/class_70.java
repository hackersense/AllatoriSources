package com.allatori.ant;

import com.allatori.exception.FinalExceptionProxy;
import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.ASMInterface;
import com.allatori.interfaces.unmapped.class_181;
import com.allatori.interfaces.unmapped.class_417;
import com.allatori.interfaces.unmapped.class_555;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_70 implements Serializable {
    public List field_253;
    public int[] field_255;
    public class_337 field_254 = null;
    public class_337 field_252 = null;
    public int field_251 = 0;

    public class_337 method_408(class_337 class_337Var, class_417 class_417Var) {
        return method_445(class_337Var, class_417Var.method_438());
    }

    public class_337 method_428(class_539 class_539Var, class_70 class_70Var) {
        class_337 method_432 = method_432(class_539Var);
        if (method_432 == null) {
            throw new class_151(new StringBuilder().insert(0, "Instruction ").append(class_539Var).append(" is not contained in this list.").toString());
        }
        return method_445(method_432, class_70Var);
    }

    public class_70(class_272 class_272Var) {
        method_413(class_272Var);
    }

    public class_337 method_427(class_539 class_539Var, class_539 class_539Var2) {
        return method_452(class_539Var, new class_70(class_539Var2));
    }

    public class_337 method_422(class_337 class_337Var, class_417 class_417Var) {
        return method_442(class_337Var, class_417Var.method_438());
    }

    public c19_ext_c337 method_439(class_337 class_337Var, class_272 class_272Var) {
        c19_ext_c337 method_44 = c19_ext_c337.method_44(class_272Var);
        class_70 class_70Var = new class_70();
        class_70Var.method_51(method_44);
        method_442(class_337Var, class_70Var);
        return method_44;
    }

    public class_337 method_430(class_539 class_539Var, class_417 class_417Var) {
        return method_452(class_539Var, class_417Var.method_438());
    }

    public class_337 method_437(class_539 class_539Var, class_539 class_539Var2) {
        return method_428(class_539Var, new class_70(class_539Var2));
    }

    public static class_337 method_418(class_337[] class_337VarArr, int[] iArr, int i, int i2) {
        int i3;
        int i4;
        int i5 = 0;
        int i6 = i - 1;
        while (true) {
            int i7 = (i5 + i6) / 2;
            int i8 = iArr[i7];
            if (i8 != i2) {
                if (i2 >= i8) {
                    int i9 = i7 + 1;
                    i3 = i9;
                    i4 = i9;
                } else {
                    i6 = i7 - 1;
                    i3 = i5;
                    i4 = i5;
                }
                if (i3 > i6) {
                    return null;
                }
                i5 = i4;
            } else {
                return class_337VarArr[i7];
            }
        }
    }

    public class_337 method_447(class_70 class_70Var) {
        if (!method_424()) {
            return method_445(this.field_254, class_70Var);
        }
        method_436(class_70Var);
        return this.field_254;
    }

    public void method_435(class_337 class_337Var) {
        if (!method_424()) {
            this.field_254.c337 = class_337Var;
            class_337Var.field_1117 = this.field_254;
            class_337Var.c337 = null;
            this.field_254 = class_337Var;
        } else {
            this.field_252 = class_337Var;
            this.field_254 = class_337Var;
            class_337Var.c337 = null;
            class_337Var.field_1117 = null;
        }
        this.field_251++;
    }

    public boolean method_424() {
        return this.field_254 == null;
    }

    public class_70() {
    }

    public void method_51(class_337 class_337Var) {
        if (method_424()) {
            this.field_252 = class_337Var;
            this.field_254 = class_337Var;
            class_337Var.c337 = null;
            class_337Var.field_1117 = null;
        } else {
            this.field_252.field_1117 = class_337Var;
            class_337Var.c337 = this.field_252;
            class_337Var.field_1117 = null;
            this.field_252 = class_337Var;
        }
        this.field_251++;
    }

    public class_337 method_453(class_417 class_417Var) {
        return method_447(class_417Var.method_438());
    }

    public class_337 method_414(class_539 class_539Var, class_417 class_417Var) {
        return method_428(class_539Var, class_417Var.method_438());
    }

    public class_337 method_444(class_539 class_539Var) {
        class_337 method_444 = class_337.method_444(class_539Var);
        method_435(method_444);
        return method_444;
    }

    public class_337 method_436(class_70 class_70Var) {
        if (class_70Var != null) {
            if (class_70Var.method_424()) {
                return null;
            }
            if (method_424()) {
                this.field_254 = class_70Var.field_254;
                this.field_252 = class_70Var.field_252;
                this.field_251 = class_70Var.field_251;
                class_70Var.method_401();
                return this.field_254;
            }
            return method_442(this.field_252, class_70Var);
        }
        throw new class_151("Appending null InstructionList");
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:7:0x0033 */
    public class_70(byte[] bArr) throws IOException {
        class_337 method_409;
        class_346 class_346Var = new class_346(bArr);
        class_337[] class_337VarArr = new class_337[bArr.length];
        int[] iArr = new int[bArr.length];
        int i = 0;
        while (class_346Var.available() > 0) {
            int method_1408 = class_346Var.method_1408();
            iArr[i] = method_1408;
            class_539 method_1903 = class_539.method_1903(class_346Var);
            if (method_1903 instanceof class_272) {
                method_409 = method_413((class_272) method_1903);
            } else {
                method_409 = method_409(method_1903);
            }
            method_409.method_46(method_1408);
            class_337VarArr[i] = method_409;
            i++;
        }
        this.field_255 = new int[i];
        System.arraycopy(iArr, 0, this.field_255, 0, i);
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            if (class_337VarArr[i3] instanceof c19_ext_c337) {
                class_272 class_272Var = (class_272) class_337VarArr[i3].field_1120;
                class_337 method_418 = method_418(class_337VarArr, iArr, i, class_272Var.field_941 + class_272Var.method_47());
                if (method_418 != null) {
                    class_272Var.method_51(method_418);
                    if (class_272Var instanceof class_450) {
                        class_450 class_450Var = (class_450) class_272Var;
                        int[] method_1715 = class_450Var.method_1715();
                        int i4 = 0;
                        int i5 = 0;
                        while (i4 < method_1715.length) {
                            class_337 method_4182 = method_418(class_337VarArr, iArr, i, class_272Var.field_941 + method_1715[i5]);
                            if (method_4182 == null) {
                                throw new class_151(new StringBuilder().insert(0, "Couldn't find target for switch: ").append(class_272Var).toString());
                            }
                            int i6 = i5 + 1;
                            class_450Var.method_1039(i5, method_4182);
                            i4 = i6;
                            i5 = i6;
                        }
                    } else {
                        continue;
                    }
                } else {
                    throw new class_151(new StringBuilder().insert(0, "Couldn't find target for branch: ").append(class_272Var).toString());
                }
            }
            int i7 = i3 + 1;
            i2 = i7;
            i3 = i7;
        }
    }

    public c19_ext_c337 method_44(class_272 class_272Var) {
        c19_ext_c337 method_44 = c19_ext_c337.method_44(class_272Var);
        method_435(method_44);
        return method_44;
    }

    public class_337 method_442(class_337 class_337Var, class_70 class_70Var) {
        if (class_70Var == null) {
            throw new class_151("Appending null InstructionList");
        }
        if (!class_70Var.method_424()) {
            class_337 class_337Var2 = class_337Var.field_1117;
            class_337 class_337Var3 = class_70Var.field_254;
            class_337Var.field_1117 = class_70Var.field_254;
            class_70Var.field_254.c337 = class_337Var;
            class_70Var.field_252.field_1117 = class_337Var2;
            if (class_337Var2 != null) {
                class_337Var2.c337 = class_70Var.field_252;
            } else {
                this.field_252 = class_70Var.field_252;
            }
            this.field_251 += class_70Var.field_251;
            class_70Var.method_401();
            return class_337Var3;
        }
        return class_337Var;
    }

    public c19_ext_c337 method_448(class_337 class_337Var, class_272 class_272Var) {
        c19_ext_c337 method_44 = c19_ext_c337.method_44(class_272Var);
        class_70 class_70Var = new class_70();
        class_70Var.method_51(method_44);
        method_445(class_337Var, class_70Var);
        return method_44;
    }

    public class_337 method_417(int i) {
        return method_418(method_446(), this.field_255, this.field_251, i);
    }

    public static class_337 method_416(class_70 class_70Var) {
        return class_70Var.field_254;
    }

    public class_337 method_412(class_337 class_337Var, class_539 class_539Var) {
        return method_442(class_337Var, new class_70(class_539Var));
    }

    public c19_ext_c337 method_413(class_272 class_272Var) {
        c19_ext_c337 method_44 = c19_ext_c337.method_44(class_272Var);
        method_51(method_44);
        return method_44;
    }

    public class_337 method_452(class_539 class_539Var, class_70 class_70Var) {
        class_337 method_443 = method_443(class_539Var);
        if (method_443 == null) {
            throw new class_151(new StringBuilder().insert(0, "Instruction ").append(class_539Var).append(" is not contained in this list.").toString());
        }
        return method_442(method_443, class_70Var);
    }

    public class_337 method_409(class_539 class_539Var) {
        class_337 method_444 = class_337.method_444(class_539Var);
        method_51(method_444);
        return method_444;
    }

    public class_337 method_449(class_337 class_337Var, class_539 class_539Var) {
        return method_445(class_337Var, new class_70(class_539Var));
    }

    public class_70(class_417 class_417Var) {
        method_436(class_417Var.method_438());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public class_337 method_445(class_337 class_337Var, class_70 class_70Var) {
        if (class_70Var == null) {
            throw new class_151("Inserting null InstructionList");
        }
        if (class_70Var.method_424()) {
            return class_337Var;
        }
        class_337 class_337Var2 = class_337Var.c337;
        class_337 class_337Var3 = class_70Var.field_254;
        class_337Var.c337 = class_70Var.field_252;
        class_70Var.field_252.field_1117 = class_337Var;
        class_70Var.field_254.c337 = class_337Var2;
        if (class_337Var2 != null) {
            class_337Var2.field_1117 = class_70Var.field_254;
        } else {
            this.field_254 = class_70Var.field_254;
        }
        this.field_251 += class_70Var.field_251;
        class_70Var.method_401();
        return class_337Var3;
    }

    public class_337 method_410(class_417 class_417Var) {
        return method_436(class_417Var.method_438());
    }

    public class_70(class_539 class_539Var) {
        method_409(class_539Var);
    }

    public boolean method_426(class_539 class_539Var) {
        return method_432(class_539Var) != null;
    }

    public class_337 method_443(class_539 class_539Var) {
        class_337 class_337Var = this.field_252;
        class_337 class_337Var2 = class_337Var;
        class_337 class_337Var3 = class_337Var;
        while (class_337Var2 != null) {
            if (class_337Var3.field_1120 != class_539Var) {
                class_337 class_337Var4 = class_337Var3.c337;
                class_337Var2 = class_337Var4;
                class_337Var3 = class_337Var4;
            } else {
                return class_337Var3;
            }
        }
        return null;
    }

    public void method_421(boolean z) {
        class_539 class_539Var;
        int[] iArr = new int[this.field_251];
        if (z) {
            class_337 class_337Var = this.field_254;
            class_337 class_337Var2 = class_337Var;
            class_337 class_337Var3 = class_337Var;
            while (class_337Var2 != null) {
                class_539 class_539Var2 = class_337Var3.field_1120;
                if (class_539Var2 instanceof class_272) {
                    class_539 class_539Var3 = ((class_272) class_539Var2).getF940().field_1120;
                    if (!method_426(class_539Var3)) {
                        throw new class_151(new StringBuilder().insert(0, "Branch target of ").append(ASMInterface.field_1554[class_539Var2.field_2014]).append(":").append(class_539Var3).append(" not in instruction list").toString());
                    }
                    if (class_539Var2 instanceof class_450) {
                        class_337[] method_446 = ((class_450) class_539Var2).method_446();
                        int i = 0;
                        int i2 = 0;
                        class_539Var = class_539Var3;
                        while (i < method_446.length) {
                            class_539Var = method_446[i2].field_1120;
                            if (!method_426(class_539Var)) {
                                throw new class_151(new StringBuilder().insert(0, "Branch target of ").append(ASMInterface.field_1554[class_539Var2.field_2014]).append(":").append(class_539Var).append(" not in instruction list").toString());
                            }
                            int i3 = i2 + 1;
                            i = i3;
                            i2 = i3;
                        }
                    } else {
                        class_539Var = class_539Var3;
                    }
                    if (!(class_337Var3 instanceof c19_ext_c337)) {
                        throw new class_151(new StringBuilder().insert(0, "Branch instruction ").append(ASMInterface.field_1554[class_539Var2.field_2014]).append(":").append(class_539Var).append(" not contained in BranchHandle.").toString());
                    }
                }
                class_337 class_337Var4 = class_337Var3.field_1117;
                class_337Var2 = class_337Var4;
                class_337Var3 = class_337Var4;
            }
        }
        class_337 class_337Var5 = this.field_254;
        class_337 class_337Var6 = class_337Var5;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        class_337 class_337Var7 = class_337Var5;
        while (class_337Var6 != null) {
            class_539 class_539Var4 = class_337Var7.field_1120;
            class_337Var7.method_46(i6);
            int i7 = i5 + 1;
            iArr[i5] = i6;
            switch (class_539Var4.method_1904()) {
                case class_555.field_2270 /* 167 */:
                case class_555.field_2293 /* 168 */:
                    i4 += 2;
                    break;
                case class_555.field_2148 /* 170 */:
                case class_555.field_2131 /* 171 */:
                    i4 += 3;
                    break;
            }
            i6 += class_539Var4.method_433();
            class_337 class_337Var8 = class_337Var7.field_1117;
            class_337Var6 = class_337Var8;
            i5 = i7;
            class_337Var7 = class_337Var8;
        }
        class_337 class_337Var9 = this.field_254;
        class_337 class_337Var10 = class_337Var9;
        int i8 = 0;
        class_337 class_337Var11 = class_337Var9;
        while (class_337Var10 != null) {
            i8 += class_337Var11.method_49(i8, i4);
            class_337 class_337Var12 = class_337Var11.field_1117;
            class_337Var10 = class_337Var12;
            class_337Var11 = class_337Var12;
        }
        class_337 class_337Var13 = this.field_254;
        class_337 class_337Var14 = class_337Var13;
        int i9 = 0;
        int i10 = 0;
        class_337 class_337Var15 = class_337Var13;
        while (class_337Var14 != null) {
            class_539 class_539Var5 = class_337Var15.field_1120;
            class_337Var15.method_46(i10);
            iArr[i9] = i10;
            i10 += class_539Var5.method_433();
            class_337 class_337Var16 = class_337Var15.field_1117;
            class_337Var14 = class_337Var16;
            i9++;
            class_337Var15 = class_337Var16;
        }
        this.field_255 = new int[i9];
        System.arraycopy(iArr, 0, this.field_255, 0, i9);
    }

    public void method_450(class_337 class_337Var, class_337 class_337Var2) throws FinalExceptionProxy {
        method_454(class_337Var.c337, class_337Var2.field_1117);
    }

    public void method_459(class_539 class_539Var, class_539 class_539Var2) {
        class_337 method_432 = method_432(class_539Var);
        if (method_432 == null) {
            throw new class_151(new StringBuilder().insert(0, "Instruction ").append(class_539Var).append(" is not contained in this list.").toString());
        }
        class_337 method_443 = method_443(class_539Var2);
        if (method_443 != null) {
            method_450(method_432, method_443);
            return;
        }
        throw new class_151(new StringBuilder().insert(0, "Instruction ").append(class_539Var2).append(" is not contained in this list.").toString());
    }

    public void method_48(class_539 class_539Var) {
        class_337 method_432 = method_432(class_539Var);
        if (method_432 == null) {
            throw new class_151(new StringBuilder().insert(0, "Instruction ").append(class_539Var).append(" is not contained in this list.").toString());
        }
        method_420(method_432);
    }

    public String method_406(boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        class_337 class_337Var = this.field_254;
        class_337 class_337Var2 = class_337Var;
        class_337 class_337Var3 = class_337Var;
        while (class_337Var2 != null) {
            stringBuffer.append(class_337Var3.method_406(z)).append("\n");
            class_337 class_337Var4 = class_337Var3.field_1117;
            class_337Var2 = class_337Var4;
            class_337Var3 = class_337Var4;
        }
        return stringBuffer.toString();
    }

    public void method_411() {
        method_421(false);
    }

    public class_337 method_432(class_539 class_539Var) {
        class_337 class_337Var = this.field_254;
        class_337 class_337Var2 = class_337Var;
        class_337 class_337Var3 = class_337Var;
        while (class_337Var2 != null) {
            if (class_337Var3.field_1120 != class_539Var) {
                class_337 class_337Var4 = class_337Var3.field_1117;
                class_337Var2 = class_337Var4;
                class_337Var3 = class_337Var4;
            } else {
                return class_337Var3;
            }
        }
        return null;
    }

    public void method_420(class_337 class_337Var) {
        method_454(class_337Var.c337, class_337Var.field_1117);
    }

    public boolean method_423(class_337 class_337Var) {
        if (class_337Var == null) {
            return false;
        }
        class_337 class_337Var2 = this.field_254;
        class_337 class_337Var3 = class_337Var2;
        class_337 class_337Var4 = class_337Var2;
        while (class_337Var3 != null) {
            if (class_337Var4 == class_337Var) {
                return true;
            }
            class_337 class_337Var5 = class_337Var4.field_1117;
            class_337Var3 = class_337Var5;
            class_337Var4 = class_337Var5;
        }
        return false;
    }

    public byte[] method_429() {
        method_411();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        for (class_337 class_337Var = this.field_254; class_337Var != null; class_337Var = class_337Var.field_1117) {
            class_337Var.field_1120.method_184(dataOutputStream);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public void method_454(class_337 class_337Var, class_337 class_337Var2) throws FinalExceptionProxy {
        class_337 class_337Var3;
        class_337 class_337Var4;
        class_337 class_337Var5;
        class_337 class_337Var6;
        class_337 class_337Var7;
        if (class_337Var == null && class_337Var2 == null) {
            class_337 class_337Var8 = this.field_254;
            this.field_252 = null;
            this.field_254 = null;
            class_337Var6 = class_337Var8;
            class_337Var5 = class_337Var8;
            class_337Var7 = class_337Var8;
        } else {
            if (class_337Var != null) {
                class_337Var3 = class_337Var.field_1117;
                class_337Var.field_1117 = class_337Var2;
                class_337Var4 = class_337Var2;
            } else {
                class_337Var3 = this.field_254;
                this.field_254 = class_337Var2;
                class_337Var4 = class_337Var2;
            }
            if (class_337Var4 == null) {
                class_337Var5 = this.field_252;
                this.field_252 = class_337Var;
                class_337Var6 = class_337Var3;
                class_337Var7 = class_337Var3;
            } else {
                class_337Var5 = class_337Var2.c337;
                class_337Var2.c337 = class_337Var;
                class_337Var6 = class_337Var3;
                class_337Var7 = class_337Var3;
            }
        }
        class_337Var6.c337 = null;
        class_337Var5.field_1117 = null;
        ArrayList arrayList = new ArrayList();
        class_337 class_337Var9 = class_337Var7;
        class_337 class_337Var10 = class_337Var7;
        while (class_337Var9 != null) {
            class_337Var10.method_1038().method_97();
            class_337 class_337Var11 = class_337Var10.field_1117;
            class_337Var9 = class_337Var11;
            class_337Var10 = class_337Var11;
        }
        StringBuffer stringBuffer = new StringBuffer("{ ");
        class_337 class_337Var12 = class_337Var7;
        class_337 class_337Var13 = class_337Var7;
        while (class_337Var12 != null) {
            class_337 class_337Var14 = class_337Var13.field_1117;
            this.field_251--;
            if (class_337Var13.method_424()) {
                arrayList.add(class_337Var13);
                stringBuffer.append(class_337Var13.method_406(true) + " ");
                class_337Var13.c337 = null;
                class_337Var13.field_1117 = null;
            } else {
                class_337Var13.method_401();
            }
            class_337Var12 = class_337Var14;
            class_337Var13 = class_337Var14;
        }
        stringBuffer.append("}");
        if (arrayList.isEmpty()) {
            return;
        }
        class_337[] class_337VarArr = new class_337[arrayList.size()];
        arrayList.toArray(class_337VarArr);
        throw new FinalExceptionProxy(class_337VarArr, stringBuffer.toString());
    }

    public class_539[] method_425() {
        class_346 class_346Var = new class_346(method_429());
        ArrayList arrayList = new ArrayList();
        try {
            while (class_346Var.available() > 0) {
                arrayList.add(class_539.method_1903(class_346Var));
            }
        } catch (IOException e) {
            throw new class_151(e.toString());
        }
        return (class_539[]) arrayList.toArray(new class_539[arrayList.size()]);
    }

    public void method_52(class_337 class_337Var, class_337 class_337Var2) {
        method_431(class_337Var, class_337Var, class_337Var2);
    }

    public void method_431(class_337 class_337Var, class_337 class_337Var2, class_337 class_337Var3) {
        class_337 class_337Var4;
        class_337 class_337Var5;
        if (class_337Var != null && class_337Var2 != null) {
            if (class_337Var3 != class_337Var && class_337Var3 != class_337Var2) {
                class_337 class_337Var6 = class_337Var;
                class_337 class_337Var7 = class_337Var;
                while (class_337Var6 != class_337Var2.field_1117) {
                    if (class_337Var7 == null) {
                        throw new class_151(new StringBuilder().insert(0, "Invalid range: From ").append(class_337Var).append(" to ").append(class_337Var2).toString());
                    }
                    if (class_337Var7 != class_337Var3) {
                        class_337 class_337Var8 = class_337Var7.field_1117;
                        class_337Var6 = class_337Var8;
                        class_337Var7 = class_337Var8;
                    } else {
                        throw new class_151(new StringBuilder().insert(0, "Invalid range: From ").append(class_337Var).append(" to ").append(class_337Var2).append(" contains target ").append(class_337Var3).toString());
                    }
                }
                class_337 class_337Var9 = class_337Var.c337;
                class_337 class_337Var10 = class_337Var2.field_1117;
                if (class_337Var9 == null) {
                    this.field_254 = class_337Var10;
                    class_337Var4 = class_337Var10;
                } else {
                    class_337Var9.field_1117 = class_337Var10;
                    class_337Var4 = class_337Var10;
                }
                if (class_337Var4 == null) {
                    this.field_252 = class_337Var9;
                    class_337Var5 = class_337Var;
                } else {
                    class_337Var10.c337 = class_337Var9;
                    class_337Var5 = class_337Var;
                }
                class_337Var2.field_1117 = null;
                class_337Var5.c337 = null;
                if (class_337Var3 != null) {
                    class_337 class_337Var11 = class_337Var3.field_1117;
                    class_337Var3.field_1117 = class_337Var;
                    class_337Var.c337 = class_337Var3;
                    class_337Var2.field_1117 = class_337Var11;
                    if (class_337Var11 == null) {
                        this.field_252 = class_337Var2;
                        return;
                    } else {
                        class_337Var11.c337 = class_337Var2;
                        return;
                    }
                }
                if (this.field_254 != null) {
                    this.field_254.c337 = class_337Var2;
                }
                class_337Var2.field_1117 = this.field_254;
                this.field_254 = class_337Var;
                return;
            }
            throw new class_151(new StringBuilder().insert(0, "Invalid range: From ").append(class_337Var).append(" to ").append(class_337Var2).append(" contains target ").append(class_337Var3).toString());
        }
        throw new class_151(new StringBuilder().insert(0, "Invalid null handle: From ").append(class_337Var).append(" to ").append(class_337Var2).toString());
    }

    public void method_401() {
        this.field_252 = null;
        this.field_254 = null;
        this.field_251 = 0;
    }

    public int method_47() {
        return this.field_251;
    }

    public void method_441(class_181 class_181Var) {
        if (this.field_253 == null) {
            return;
        }
        this.field_253.remove(class_181Var);
    }

    public int[] method_434() {
        return this.field_255;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0003 */
    public void method_451(class_139[] class_139VarArr, class_337 class_337Var, class_337 class_337Var2) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i >= class_139VarArr.length) {
                return;
            }
            class_337 method_415 = class_139VarArr[i2].method_415();
            class_337 method_419 = class_139VarArr[i2].method_419();
            if (method_415 == class_337Var) {
                class_139VarArr[i2].method_435(class_337Var2);
            }
            if (method_419 == class_337Var) {
                class_139VarArr[i2].method_51(class_337Var2);
            }
            i = i2 + 1;
        }
    }

    public void method_50() {
        class_337 class_337Var = this.field_252;
        class_337 class_337Var2 = class_337Var;
        class_337 class_337Var3 = class_337Var;
        while (class_337Var2 != null) {
            class_337Var3.method_401();
            class_337 class_337Var4 = class_337Var3.c337;
            class_337Var2 = class_337Var4;
            class_337Var3 = class_337Var4;
        }
        method_401();
    }

    public Iterator method_456() {
        return new class_439(this);
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:4:0x000b */
    public void method_97() {
        if (this.field_253 == null) {
            return;
        }
        Iterator it = this.field_253.iterator();
        while (it.hasNext()) {
            ((class_181) it.next()).method_866(this);
        }
    }

    public class_337 method_415() {
        return this.field_254;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:11:0x0027 */
    public void method_458(class_337 class_337Var, class_337 class_337Var2) {
        class_337 class_337Var3 = this.field_254;
        class_337 class_337Var4 = class_337Var3;
        class_337 class_337Var5 = class_337Var3;
        while (class_337Var4 != null) {
            class_539 method_1038 = class_337Var5.method_1038();
            if (method_1038 instanceof class_272) {
                class_272 class_272Var = (class_272) method_1038;
                if (class_272Var.getF940() == class_337Var) {
                    class_272Var.method_51(class_337Var2);
                }
                if (class_272Var instanceof class_450) {
                    class_337[] method_446 = ((class_450) class_272Var).method_446();
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        if (i < method_446.length) {
                            if (method_446[i2] == class_337Var) {
                                ((class_450) class_272Var).method_1039(i2, class_337Var2);
                            }
                            i = i2 + 1;
                        }
                    }
                }
            }
            class_337 class_337Var6 = class_337Var5.field_1117;
            class_337Var4 = class_337Var6;
            class_337Var5 = class_337Var6;
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0003 */
    public void method_455(class_135[] class_135VarArr, class_337 class_337Var, class_337 class_337Var2) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i >= class_135VarArr.length) {
                return;
            }
            if (class_135VarArr[i2].method_415() == class_337Var) {
                class_135VarArr[i2].method_435(class_337Var2);
            }
            if (class_135VarArr[i2].method_419() == class_337Var) {
                class_135VarArr[i2].method_51(class_337Var2);
            }
            if (class_135VarArr[i2].method_45() == class_337Var) {
                class_135VarArr[i2].method_420(class_337Var2);
            }
            i = i2 + 1;
        }
    }

    public int method_433() {
        return this.field_251;
    }

    public void method_457(class_181 class_181Var) {
        if (this.field_253 == null) {
            this.field_253 = new ArrayList();
        }
        this.field_253.add(class_181Var);
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0009 */
    public class_337[] method_446() {
        class_337[] class_337VarArr = new class_337[this.field_251];
        class_337 class_337Var = this.field_254;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i < this.field_251) {
                i = i2 + 1;
                class_337VarArr[i2] = class_337Var;
                class_337Var = class_337Var.field_1117;
            } else {
                return class_337VarArr;
            }
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:6:0x0024 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:15:0x0067 */
    public class_70 method_438() {
        HashMap hashMap = new HashMap();
        class_70 class_70Var = new class_70();
        class_337 class_337Var = this.field_254;
        class_337 class_337Var2 = class_337Var;
        class_337 class_337Var3 = class_337Var;
        while (class_337Var2 != null) {
            class_539 method_1038 = class_337Var3.field_1120.method_1038();
            if (method_1038 instanceof class_272) {
                hashMap.put(class_337Var3, class_70Var.method_413((class_272) method_1038));
            } else {
                hashMap.put(class_337Var3, class_70Var.method_409(method_1038));
            }
            class_337 class_337Var4 = class_337Var3.field_1117;
            class_337Var2 = class_337Var4;
            class_337Var3 = class_337Var4;
        }
        class_337 class_337Var5 = this.field_254;
        class_337 class_337Var6 = class_337Var5;
        class_337 class_337Var7 = class_70Var.field_254;
        class_337 class_337Var8 = class_337Var5;
        while (class_337Var6 != null) {
            class_539 class_539Var = class_337Var8.field_1120;
            class_539 class_539Var2 = class_337Var7.field_1120;
            if (class_539Var instanceof class_272) {
                class_272 class_272Var = (class_272) class_539Var;
                class_272 class_272Var2 = (class_272) class_539Var2;
                class_272Var2.method_51((class_337) hashMap.get(class_272Var.getF940()));
                if (class_272Var instanceof class_450) {
                    class_337[] method_446 = ((class_450) class_272Var).method_446();
                    class_337[] method_4462 = ((class_450) class_272Var2).method_446();
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        if (i < method_446.length) {
                            i = i2 + 1;
                            method_4462[i2] = (class_337) hashMap.get(method_446[i2]);
                        }
                    }
                }
            }
            class_337 class_337Var9 = class_337Var8.field_1117;
            class_337Var6 = class_337Var9;
            class_337Var7 = class_337Var7.field_1117;
            class_337Var8 = class_337Var9;
        }
        return class_70Var;
    }

    public class_337 method_419() {
        return this.field_252;
    }

    public void method_440(class_208 class_208Var, class_208 class_208Var2) {
        class_337 class_337Var = this.field_254;
        class_337 class_337Var2 = class_337Var;
        class_337 class_337Var3 = class_337Var;
        while (class_337Var2 != null) {
            class_539 class_539Var = class_337Var3.field_1120;
            if (class_539Var instanceof class_418) {
                class_418 class_418Var = (class_418) class_539Var;
                class_418Var.method_46(class_208Var2.method_1006(class_208Var.method_982(class_418Var.method_47()), class_208Var));
            }
            class_337 class_337Var4 = class_337Var3.field_1117;
            class_337Var2 = class_337Var4;
            class_337Var3 = class_337Var4;
        }
    }
}
