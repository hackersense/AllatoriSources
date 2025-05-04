package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_417;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_215 implements class_417 {
    public class_337[] field_815;
    public int field_816;
    public int[] field_817;
    public class_450 field_818;

    public class_215(int[] iArr, class_337[] class_337VarArr, class_337 class_337Var, int i) {
        this.field_817 = (int[]) iArr.clone();
        this.field_815 = (class_337[]) class_337VarArr.clone();
        int length = iArr.length;
        this.field_816 = length;
        if (length >= 2) {
            method_1040(0, this.field_816 - 1);
            if (method_462(i)) {
                method_1039(i, class_337Var);
                this.field_818 = new class_117(this.field_817, this.field_815, class_337Var);
                return;
            } else {
                this.field_818 = new class_427(this.field_817, this.field_815, class_337Var);
                return;
            }
        }
        this.field_818 = new class_117(iArr, class_337VarArr, class_337Var);
    }

    public final void method_1039(int i, class_337 class_337Var) {
        int i2 = this.field_816 + (this.field_816 * i);
        int[] iArr = new int[i2];
        class_337[] class_337VarArr = new class_337[i2];
        iArr[0] = this.field_817[0];
        class_337VarArr[0] = this.field_815[0];
        int i3 = 1;
        int i4 = 1;
        int i5 = 1;
        while (i3 < this.field_816) {
            int i6 = this.field_817[i4 - 1];
            int i7 = this.field_817[i4] - i6;
            int i8 = 1;
            int i9 = 1;
            int i10 = i5;
            while (i8 < i7) {
                iArr[i10] = i6 + i9;
                class_337VarArr[i10] = class_337Var;
                int i11 = i9 + 1;
                i8 = i11;
                i9 = i11;
                i10++;
            }
            iArr[i10] = this.field_817[i4];
            i5 = i10 + 1;
            class_337VarArr[i10] = this.field_815[i4];
            int i12 = i4 + 1;
            i3 = i12;
            i4 = i12;
        }
        this.field_817 = new int[i5];
        this.field_815 = new class_337[i5];
        System.arraycopy(iArr, 0, this.field_817, 0, i5);
        System.arraycopy(class_337VarArr, 0, this.field_815, 0, i5);
    }

    public final class_539 method_1038() {
        return this.field_818;
    }

    public final boolean method_462(int i) {
        int i2 = 1;
        int i3 = 1;
        while (i2 < this.field_816) {
            if (this.field_817[i3] - this.field_817[i3 - 1] > i) {
                return false;
            }
            int i4 = i3 + 1;
            i2 = i4;
            i3 = i4;
        }
        return true;
    }

    public class_215(int[] iArr, class_337[] class_337VarArr, class_337 class_337Var) {
        this(iArr, class_337VarArr, class_337Var, 1);
    }

    @Override // p000.class_417
    public final class_70 method_438() {
        return new class_70((class_272) this.field_818);
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x000b */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:7:0x0016 */
    public final void method_1040(int i, int i2) {
        int i3 = this.field_817[(i + i2) / 2];
        int i4 = i;
        int i5 = i2;
        do {
            while (this.field_817[i4] < i3) {
                i4++;
            }
            while (i3 < this.field_817[i5]) {
                i5--;
            }
            if (i4 <= i5) {
                int i6 = this.field_817[i4];
                this.field_817[i4] = this.field_817[i5];
                this.field_817[i5] = i6;
                class_337 class_337Var = this.field_815[i4];
                this.field_815[i4] = this.field_815[i5];
                i4++;
                this.field_815[i5] = class_337Var;
                i5--;
            }
        } while (i4 <= i5);
        if (i < i5) {
            method_1040(i, i5);
        }
        if (i4 >= i2) {
            return;
        }
        method_1040(i4, i2);
    }
}
