package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.interfaces.unmapped.class_552;
import com.allatori.interfaces.unmapped.class_555;
import com.allatori.interfaces.unmapped.class_603;
import com.allatori.interfaces.unmapped.class_93;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_324 extends class_73 {
    public class_591 field_1105;
    public class_208 field_1106;
    public PrintWriter field_1108;
    public Map field_1109 = new HashMap();
    public List field_1107 = new ArrayList();

    public void method_1379(Object obj) {
        String obj2 = obj.toString();
        if (!(obj instanceof String)) {
            if (obj instanceof Character) {
                obj2 = new StringBuilder().insert(0, "(char)0x").append(Integer.toHexString(((Character) obj).charValue())).toString();
            }
        } else {
            obj2 = '\"' + class_204.method_936(obj.toString()) + '\"';
        }
        this.field_1108.println(new StringBuilder().insert(0, "il.append(new PUSH(_cp, ").append(obj2).append("));").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_479(class_272 class_272Var) {
        String str;
        class_324 class_324Var;
        c19_ext_c337 c_19Extc337Var = (c19_ext_c337) this.field_1109.get(class_272Var);
        int method_47 = c_19Extc337Var.method_47();
        String sb = new StringBuilder().insert(0, class_272Var.method_198()).append("_").append(method_47).toString();
        if (class_272Var instanceof class_450) {
            this.field_1107.add(class_272Var);
            StringBuffer stringBuffer = new StringBuffer("new int[] { ");
            int[] method_434 = ((class_450) class_272Var).method_434();
            int i = 0;
            int i2 = 0;
            while (i < method_434.length) {
                stringBuffer.append(method_434[i2]);
                if (i2 < method_434.length - 1) {
                    stringBuffer.append(", ");
                }
                int i3 = i2 + 1;
                i = i3;
                i2 = i3;
            }
            stringBuffer.append(" }");
            this.field_1108.print(new StringBuilder().insert(0, "Select ").append(sb).append(" = new ").append(class_272Var.method_198().toUpperCase(Locale.ENGLISH)).append("(").append((Object) stringBuffer).append(", new InstructionHandle[] { ").toString());
            int i4 = 0;
            int i5 = 0;
            while (i4 < method_434.length) {
                this.field_1108.print("null");
                if (i5 < method_434.length - 1) {
                    this.field_1108.print(", ");
                }
                int i6 = i5 + 1;
                i4 = i6;
                i5 = i6;
            }
            this.field_1108.println(" }, null);");
        } else {
            int method_472 = c_19Extc337Var.method_45().method_47();
            if (method_47 > method_472) {
                str = new StringBuilder().insert(0, "ih_").append(method_472).toString();
                class_324Var = this;
            } else {
                this.field_1107.add(class_272Var);
                str = "null";
                class_324Var = this;
            }
            class_324Var.field_1108.println(new StringBuilder().insert(0, "    BranchInstruction ").append(sb).append(" = _factory.createBranchInstruction(").append("Constants.").append(class_272Var.method_198().toUpperCase(Locale.ENGLISH)).append(", ").append(str).append(");").toString());
        }
        if (!c_19Extc337Var.method_424()) {
            this.field_1108.println(new StringBuilder().insert(0, "    il.append(").append(sb).append(");").toString());
        } else {
            this.field_1108.println(new StringBuilder().insert(0, "    ih_").append(method_47).append(" = il.append(").append(sb).append(");").toString());
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_496(class_239 class_239Var) {
        short method_1904 = class_239Var.method_1904();
        String method_623 = class_239Var.method_623(this.field_1106);
        this.field_1108.println(new StringBuilder().insert(0, "il.append(_factory.createFieldAccess(\"").append(method_623).append("\", \"").append(class_239Var.method_1086(this.field_1106)).append("\", ").append(class_237.method_1081(class_239Var.method_1085(this.field_1106))).append(", ").append("Constants.").append(ASMInterface.field_1554[method_1904].toUpperCase(Locale.ENGLISH)).append("));").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_469(class_288 class_288Var) {
        this.field_1108.println(new StringBuilder().insert(0, "il.append(_factory.createReturn(").append(class_237.method_1081(class_288Var.method_32(this.field_1106))).append("));").toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: class_603 */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.class_73, p000.class_445
    public void method_476(class_603 class_603Var) {
        class_212 method_669;
        class_539 class_539Var;
        if (!(class_603Var instanceof class_418)) {
            method_669 = ((class_413) class_603Var).method_669();
            class_539Var = class_603Var;
        } else {
            method_669 = ((class_418) class_603Var).method_32(this.field_1106);
            class_539Var = class_603Var;
        }
        short method_1904 = class_539Var.method_1904();
        short s = 1;
        switch (method_1904) {
            case class_555.field_2228 /* 187 */:
                this.field_1108.println(new StringBuilder().insert(0, "il.append(_factory.createNew(\"").append(((class_392) method_669).method_464()).append("\"));").toString());
                return;
            case class_555.field_2316 /* 188 */:
            case class_555.field_2245 /* 189 */:
                break;
            case class_555.field_2265 /* 197 */:
                s = ((class_300) class_603Var).method_1304();
                break;
            default:
                throw new RuntimeException(new StringBuilder().insert(0, "Oops: ").append((int) method_1904).toString());
        }
        if (method_669 instanceof class_594) {
            method_669 = ((class_594) method_669).method_669();
        }
        this.field_1108.println(new StringBuilder().insert(0, "il.append(_factory.createNewArray(").append(class_237.method_1081(method_669)).append(", (short) ").append((int) s).append("));").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_382(class_489 class_489Var) {
        method_1379(class_489Var.method_1834(this.field_1106));
    }

    public boolean method_1380(class_539 class_539Var) {
        if (class_93.field_465[class_539Var.method_1904()] == null || (class_539Var instanceof class_552) || (class_539Var instanceof class_288)) {
            return false;
        }
        this.field_1108.println(new StringBuilder().insert(0, "il.append(InstructionConstants.").append(class_539Var.method_198().toUpperCase(Locale.ENGLISH)).append(");").toString());
        return true;
    }

    public class_324(class_591 class_591Var, PrintWriter printWriter) {
        this.field_1105 = class_591Var;
        this.field_1106 = class_591Var.method_917();
        this.field_1108 = printWriter;
    }

    @Override // p000.class_73, p000.class_445
    public void method_468(class_561 class_561Var) {
        this.field_1108.println(new StringBuilder().insert(0, "il.append(_factory.createArray").append(class_561Var.method_1904() < 79 ? "Load" : "Store").append("(").append(class_237.method_1081(class_561Var.method_32(this.field_1106))).append("));").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_310(class_605 class_605Var) {
        this.field_1108.println(new StringBuilder().insert(0, "il.append(_factory.createCheckCast(").append(class_237.method_1081(class_605Var.method_32(this.field_1106))).append("));").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_497(class_459 class_459Var) {
        short method_1904 = class_459Var.method_1904();
        String method_623 = class_459Var.method_623(this.field_1106);
        this.field_1108.println(new StringBuilder().insert(0, "il.append(_factory.createInvoke(\"").append(method_623).append("\", \"").append(class_459Var.method_1086(this.field_1106)).append("\", ").append(class_237.method_1081(class_459Var.method_1085(this.field_1106))).append(", ").append(class_237.method_1079(class_459Var.method_1388(this.field_1106))).append(", ").append("Constants.").append(ASMInterface.field_1554[method_1904].toUpperCase(Locale.ENGLISH)).append("));").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_484(class_552 class_552Var) {
        method_1379(class_552Var.method_238());
    }

    @Override // p000.class_73, p000.class_445
    public void method_366(class_447 class_447Var) {
        this.field_1108.println(new StringBuilder().insert(0, "il.append(new INSTANCEOF(_cp.addClass(").append(class_237.method_1081(class_447Var.method_32(this.field_1106))).append(")));").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_264(class_274 class_274Var) {
        method_1379(class_274Var.method_1211(this.field_1106));
    }

    public void method_1378() {
        class_324 class_324Var;
        if (this.field_1105.method_1103() || this.field_1105.method_1126()) {
            return;
        }
        class_337 method_415 = this.field_1105.method_438().method_415();
        class_337 class_337Var = method_415;
        class_337 class_337Var2 = method_415;
        while (class_337Var != null) {
            class_539 method_1038 = class_337Var2.method_1038();
            if (method_1038 instanceof class_272) {
                this.field_1109.put(method_1038, class_337Var2);
            }
            if (!class_337Var2.method_424()) {
                this.field_1108.print("    ");
                class_324Var = this;
            } else if (!(method_1038 instanceof class_272)) {
                this.field_1108.print(new StringBuilder().insert(0, "    InstructionHandle ih_").append(class_337Var2.method_47()).append(" = ").toString());
                class_324Var = this;
            } else {
                this.field_1108.println(new StringBuilder().insert(0, "    InstructionHandle ih_").append(class_337Var2.method_47()).append(";").toString());
                class_324Var = this;
            }
            if (!class_324Var.method_1380(method_1038)) {
                method_1038.method_0(this);
            }
            class_337 method_4152 = class_337Var2.method_415();
            class_337Var = method_4152;
            class_337Var2 = method_4152;
        }
        method_1381();
        method_1382();
    }

    public void method_1381() {
        for (class_272 class_272Var : this.field_1107) {
            c19_ext_c337 c_19Extc337Var = (c19_ext_c337) this.field_1109.get(class_272Var);
            String sb = new StringBuilder().insert(0, class_272Var.method_198()).append("_").append(c_19Extc337Var.method_47()).toString();
            this.field_1108.println(new StringBuilder().insert(0, "    ").append(sb).append(".setTarget(ih_").append(c_19Extc337Var.method_45().method_47()).append(");").toString());
            if (class_272Var instanceof class_450) {
                class_337[] method_446 = ((class_450) class_272Var).method_446();
                int i = 0;
                int i2 = 0;
                while (i < method_446.length) {
                    int i3 = i2 + 1;
                    this.field_1108.println(new StringBuilder().insert(0, "    ").append(sb).append(".setTarget(").append(i2).append(", ih_").append(method_446[i2].method_47()).append(");").toString());
                    i = i3;
                    i2 = i3;
                }
            }
        }
    }

    public void method_1382() {
        class_135[] method_2069 = this.field_1105.method_2069();
        int i = 0;
        int i2 = 0;
        while (i < method_2069.length) {
            class_135 class_135Var = method_2069[i2];
            String method_1081 = class_135Var.method_646() == null ? "null" : class_237.method_1081(class_135Var.method_646());
            PrintWriter printWriter = this.field_1108;
            StringBuilder append = new StringBuilder().insert(0, "    method.addExceptionHandler(ih_").append(class_135Var.method_415().method_47()).append(", ").append("ih_").append(class_135Var.method_419().method_47()).append(", ").append("ih_").append(class_135Var.method_45().method_47()).append(", ").append(method_1081);
            int i3 = i2 + 1;
            printWriter.println(append.append(");").toString());
            i = i3;
            i2 = i3;
        }
    }

    @Override // p000.class_73, p000.class_445
    public void method_362(class_398 class_398Var) {
        this.field_1108.println(new StringBuilder().insert(0, "il.append(new RET(").append(class_398Var.method_47()).append(")));").toString());
    }

    @Override // p000.class_73, p000.class_445
    public void method_492(class_508 class_508Var) {
        short method_1904 = class_508Var.method_1904();
        class_212 method_32 = class_508Var.method_32(this.field_1106);
        if (method_1904 != 132) {
            this.field_1108.println(new StringBuilder().insert(0, "il.append(_factory.create").append(method_1904 < 54 ? "Load" : "Store").append("(").append(class_237.method_1081(method_32)).append(", ").append(class_508Var.method_47()).append("));").toString());
        } else {
            this.field_1108.println(new StringBuilder().insert(0, "il.append(new IINC(").append(class_508Var.method_47()).append(", ").append(((class_67) class_508Var).method_183()).append("));").toString());
        }
    }
}
