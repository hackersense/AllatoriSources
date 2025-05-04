package com.allatori.ant;

import com.allatori.exception.runtime.class_168;
import com.allatori.interfaces.unmapped.class_21;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.Serializable;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class class_75 implements Cloneable, Serializable {
    public int field_260;
    public final int field_261;
    public class_112[] field_262;
    public int field_263;
    public class_112[] field_264;
    public int field_265;
    public class_499 field_266;

    public class_112[] method_504() {
        return this.field_262;
    }

    public class_112[] method_500() {
        return this.field_264;
    }

    public final class_499 method_502() {
        return this.field_266;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:28:0x0069 */
    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:38:0x00a2 */
    public final void method_184(DataOutputStream dataOutputStream) {
        int i = 0;
        dataOutputStream.write(this.field_261);
        if (this.field_261 < 0 || this.field_261 > 63) {
            if (this.field_261 < 64 || this.field_261 > 127) {
                if (this.field_261 != 247) {
                    if (this.field_261 < 248 || this.field_261 > 250) {
                        if (this.field_261 != 251) {
                            if (this.field_261 >= 252 && this.field_261 <= 254) {
                                dataOutputStream.writeShort(this.field_263);
                                while (true) {
                                    int i2 = i;
                                    if (i >= this.field_260) {
                                        return;
                                    }
                                    i = i2 + 1;
                                    this.field_264[i2].method_184(dataOutputStream);
                                }
                            } else if (this.field_261 == 255) {
                                dataOutputStream.writeShort(this.field_263);
                                dataOutputStream.writeShort(this.field_260);
                                int i3 = 0;
                                int i4 = 0;
                                while (i3 < this.field_260) {
                                    int i5 = i4 + 1;
                                    this.field_264[i4].method_184(dataOutputStream);
                                    i3 = i5;
                                    i4 = i5;
                                }
                                dataOutputStream.writeShort(this.field_265);
                                while (true) {
                                    int i6 = i;
                                    if (i >= this.field_265) {
                                        return;
                                    }
                                    i = i6 + 1;
                                    this.field_262[i6].method_184(dataOutputStream);
                                }
                            } else {
                                throw new class_168(new StringBuilder().insert(0, "Invalid Stack map table tag: ").append(this.field_261).toString());
                            }
                        } else {
                            dataOutputStream.writeShort(this.field_263);
                        }
                    } else {
                        dataOutputStream.writeShort(this.field_263);
                    }
                } else {
                    dataOutputStream.writeShort(this.field_263);
                    this.field_262[0].method_184(dataOutputStream);
                }
            } else {
                this.field_262[0].method_184(dataOutputStream);
            }
        }
    }

    public void method_407(int i) {
        this.field_260 = i;
    }

    public int method_433() {
        return this.field_260;
    }

    public class_75(int i, int i2, int i3, class_112[] class_112VarArr, int i4, class_112[] class_112VarArr2, class_499 class_499Var) {
        this.field_261 = i;
        this.field_263 = i2;
        this.field_260 = i3;
        this.field_264 = class_112VarArr;
        this.field_265 = i4;
        this.field_262 = class_112VarArr2;
        this.field_266 = class_499Var;
    }

    public void method_461(int i) {
        this.field_265 = i;
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:39:0x00eb */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public class_75(DataInputStream dataInputStream, class_499 class_499Var) {
        this(dataInputStream.read(), -1, -1, null, -1, null, class_499Var);
        int i = 0;
        if (this.field_261 < 0 || this.field_261 > 63) {
            if (this.field_261 >= 64 && this.field_261 <= 127) {
                this.field_263 = this.field_261 - 64;
                this.field_265 = 1;
                this.field_262 = new class_112[1];
                this.field_262[0] = new class_112(dataInputStream, class_499Var);
                return;
            }
            if (this.field_261 == 247) {
                this.field_263 = dataInputStream.readShort();
                this.field_265 = 1;
                this.field_262 = new class_112[1];
                this.field_262[0] = new class_112(dataInputStream, class_499Var);
                return;
            }
            if (this.field_261 >= 248 && this.field_261 <= 250) {
                this.field_263 = dataInputStream.readShort();
                return;
            }
            if (this.field_261 != 251) {
                if (this.field_261 >= 252 && this.field_261 <= 254) {
                    this.field_263 = dataInputStream.readShort();
                    this.field_260 = this.field_261 - 251;
                    this.field_264 = new class_112[this.field_260];
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < this.field_260) {
                        int i4 = i3 + 1;
                        this.field_264[i3] = new class_112(dataInputStream, class_499Var);
                        i2 = i4;
                        i3 = i4;
                    }
                    return;
                }
                if (this.field_261 == 255) {
                    this.field_263 = dataInputStream.readShort();
                    this.field_260 = dataInputStream.readShort();
                    this.field_264 = new class_112[this.field_260];
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < this.field_260) {
                        int i7 = i6 + 1;
                        this.field_264[i6] = new class_112(dataInputStream, class_499Var);
                        i5 = i7;
                        i6 = i7;
                    }
                    this.field_265 = dataInputStream.readShort();
                    this.field_262 = new class_112[this.field_265];
                    while (true) {
                        int i8 = i;
                        if (i < this.field_265) {
                            i = i8 + 1;
                            this.field_262[i8] = new class_112(dataInputStream, class_499Var);
                        } else {
                            return;
                        }
                    }
                } else {
                    throw new class_168(new StringBuilder().insert(0, "Invalid frame type found while parsing stack map table: ").append(this.field_261).toString());
                }
            } else {
                this.field_263 = dataInputStream.readShort();
            }
        } else {
            this.field_263 = this.field_261 + 0;
        }
    }

    public final void method_498(class_499 class_499Var) {
        this.field_266 = class_499Var;
    }

    public int method_47() {
        return this.field_263;
    }

    public class_75 method_501() {
        try {
            return (class_75) clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public int method_183() {
        return this.field_265;
    }

    public void method_46(int i) {
        this.field_263 = i;
    }

    public void method_163(class_21 class_21Var) {
    }

    public void method_499(class_112[] class_112VarArr) {
        this.field_262 = class_112VarArr;
    }

    public void method_503(class_112[] class_112VarArr) {
        this.field_264 = class_112VarArr;
    }
}
