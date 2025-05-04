package com.allatori.ant;

import com.allatori.interfaces.unmapped.class_555;

import java.io.Serializable;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public abstract class class_250 implements Serializable {
    public int field_899;

    public final boolean method_1125() {
        return (this.field_899 & 8) != 0;
    }

    public final void method_1107(boolean z) {
        method_1115(32, z);
    }

    public final boolean method_424() {
        return (this.field_899 & 2) != 0;
    }

    public final void method_1104(boolean z) {
        method_1115(class_555.field_2297, z);
    }

    public final void method_1123(boolean z) {
        method_1115(4096, z);
    }

    public final int method_47() {
        return this.field_899;
    }

    public final void method_407(int i) {
        this.field_899 = i;
    }

    public final void method_1131(boolean z) {
        method_1115(8, z);
    }

    public final void method_46(int i) {
        method_407(i);
    }

    public final int method_433() {
        return this.field_899;
    }

    public final void method_1115(int i, boolean z) {
        if ((this.field_899 & i) != 0) {
            if (!z) {
                this.field_899 ^= i;
            }
        } else {
            if (!z) {
                return;
            }
            this.field_899 |= i;
        }
    }

    public final void method_1127(boolean z) {
        method_1115(64, z);
    }

    public final boolean method_1103() {
        return (this.field_899 & 1024) != 0;
    }

    public final boolean method_1113() {
        return (this.field_899 & 2048) != 0;
    }

    public final boolean method_1117() {
        return (this.field_899 & 16) != 0;
    }

    public final boolean method_1129() {
        return (this.field_899 & 4) != 0;
    }

    public final boolean method_1108() {
        return (this.field_899 & 512) != 0;
    }

    public final boolean method_1122() {
        return (this.field_899 & 64) != 0;
    }

    public final void method_421(boolean z) {
        method_1115(8192, z);
    }

    public final void method_1105(boolean z) {
        method_1115(4, z);
    }

    public final boolean method_1121() {
        return (this.field_899 & 32) != 0;
    }

    public final boolean method_1130() {
        return (this.field_899 & 128) != 0;
    }

    public class_250(int i) {
        this.field_899 = i;
    }

    public final void method_1110(boolean z) {
        method_1115(512, z);
    }

    public final void method_1116(boolean z) {
        method_1115(256, z);
    }

    public final boolean method_1124() {
        return (this.field_899 & 1) != 0;
    }

    public final boolean method_1109() {
        return (this.field_899 & 8192) != 0;
    }

    public final boolean method_1112() {
        return (this.field_899 & 4096) != 0;
    }

    public final void method_1111(boolean z) {
        method_1115(128, z);
    }

    public class_250() {
    }

    public final boolean method_1126() {
        return (this.field_899 & 256) != 0;
    }

    public final void method_1128(boolean z) {
        method_1115(2048, z);
    }

    public final void method_1114(boolean z) {
        method_1115(2, z);
    }

    public final void method_1118(boolean z) {
        method_1115(16, z);
    }

    public final void method_1120(boolean z) {
        method_1115(1024, z);
    }

    public final boolean method_1106() {
        return (this.field_899 & class_555.field_2297) != 0;
    }

    public final void method_1119(boolean z) {
        method_1115(1, z);
    }
}
