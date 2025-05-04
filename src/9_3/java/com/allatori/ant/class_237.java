package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Locale;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_237 extends class_164 {
    public static final int field_842 = 0;
    public static final int field_843 = -1;
    public static final int field_844 = 1;
    public PrintWriter field_845;
    public class_440 field_846;
    public class_208 field_847;

    public class_237(class_440 class_440Var, OutputStream outputStream) {
        this.field_846 = class_440Var;
        this.field_845 = new PrintWriter(outputStream);
        this.field_847 = new class_208(this.field_846.method_502());
    }

    public void method_1076() {
        this.field_845.println("  public void create(OutputStream out) throws IOException {");
        if (this.field_846.method_898().length > 0) {
            this.field_845.println("    createFields();");
        }
        class_557[] method_904 = this.field_846.method_904();
        int i = 0;
        int i2 = 0;
        while (i < method_904.length) {
            int i3 = i2 + 1;
            this.field_845.println(new StringBuilder().insert(0, "    createMethod_").append(i2).append("();").toString());
            i = i3;
            i2 = i3;
        }
        this.field_845.println("    _cg.getJavaClass().dump(out);");
        this.field_845.println("  }");
        this.field_845.println();
    }

    public static void method_1080(String[] strArr) {
        String str = strArr[0];
        class_440 method_1810 = class_474.method_1810(str);
        if (method_1810 == null) {
            method_1810 = new class_543(str).method_1909();
        }
        new class_237(method_1810, System.out).method_1075();
    }

    @Override // p000.class_164, p000.class_21
    public void method_85(class_440 class_440Var) {
        String method_546 = class_440Var.method_546();
        String method_1631 = class_440Var.method_1631();
        String method_1626 = class_440Var.method_1626();
        String method_977 = class_204.method_977(class_440Var.method_643(), false, true);
        if (!"".equals(method_1626)) {
            method_546 = method_546.substring(method_1626.length() + 1);
            this.field_845.println(new StringBuilder().insert(0, "package ").append(method_1626).append(";").toString());
            this.field_845.println();
        }
        this.field_845.println("import org.apache.bcel.generic.*;");
        this.field_845.println("import org.apache.bcel.classfile.*;");
        this.field_845.println("import org.apache.bcel.*;");
        this.field_845.println("import java.io.*;");
        this.field_845.println();
        this.field_845.println(new StringBuilder().insert(0, "public class ").append(method_546).append("Creator implements Constants {").toString());
        this.field_845.println("  private InstructionFactory _factory;");
        this.field_845.println("  private ConstantPoolGen    _cp;");
        this.field_845.println("  private ClassGen           _cg;");
        this.field_845.println();
        this.field_845.println(new StringBuilder().insert(0, "  public ").append(method_546).append("Creator() {").toString());
        PrintWriter printWriter = this.field_845;
        StringBuilder insert = new StringBuilder().insert(0, "    _cg = new ClassGen(\"");
        if (!"".equals(method_1626)) {
            method_546 = new StringBuilder().insert(0, method_1626).append(".").append(method_546).toString();
        }
        printWriter.println(insert.append(method_546).append("\", \"").append(method_1631).append("\", ").append("\"").append(class_440Var.method_198()).append("\", ").append(method_1082(class_440Var.method_433(), 0)).append(", ").append("new String[] { ").append(method_977).append(" });").toString());
        this.field_845.println();
        this.field_845.println("    _cp = _cg.getConstantPool();");
        this.field_845.println("    _factory = new InstructionFactory(_cg, _cp);");
        this.field_845.println("  }");
        this.field_845.println();
        method_1076();
        class_261[] method_898 = class_440Var.method_898();
        if (method_898.length > 0) {
            this.field_845.println("  private void createFields() {");
            this.field_845.println("    FieldGen field;");
            int i = 0;
            int i2 = 0;
            while (i < method_898.length) {
                int i3 = i2 + 1;
                method_898[i2].method_163(this);
                i = i3;
                i2 = i3;
            }
            this.field_845.println("  }");
            this.field_845.println();
        }
        class_557[] method_904 = class_440Var.method_904();
        int i4 = 0;
        int i5 = 0;
        while (i4 < method_904.length) {
            this.field_845.println(new StringBuilder().insert(0, "  private void createMethod_").append(i5).append("() {").toString());
            method_904[i5].method_163(this);
            int i6 = i5 + 1;
            this.field_845.println("  }");
            this.field_845.println();
            i4 = i6;
            i5 = i6;
        }
        method_1078();
        this.field_845.println("}");
    }

    public static String method_1079(class_212[] class_212VarArr) {
        if (class_212VarArr.length != 0) {
            StringBuffer stringBuffer = new StringBuffer();
            int i = 0;
            int i2 = 0;
            while (i < class_212VarArr.length) {
                stringBuffer.append(method_1081(class_212VarArr[i2]));
                if (i2 < class_212VarArr.length - 1) {
                    stringBuffer.append(", ");
                }
                int i3 = i2 + 1;
                i = i3;
                i2 = i3;
            }
            return new StringBuilder().insert(0, "new Type[] { ").append(stringBuffer.toString()).append(" }").toString();
        }
        return "Type.NO_ARGS";
    }

    public static String method_1081(class_212 class_212Var) {
        return method_1083(class_212Var.method_198());
    }

    public static String method_1077(int i) {
        return method_1082(i, -1);
    }

    public void method_1075() {
        method_85(this.field_846);
        this.field_845.flush();
    }

    @Override // p000.class_164, p000.class_21
    public void method_62(class_557 class_557Var) {
        class_591 class_591Var = new class_591(class_557Var, this.field_846.method_546(), this.field_847);
        class_212 method_2057 = class_591Var.method_2057();
        class_212[] method_1964 = class_591Var.method_1964();
        this.field_845.println("    InstructionList il = new InstructionList();");
        this.field_845.println(new StringBuilder().insert(0, "    MethodGen method = new MethodGen(").append(method_1082(class_557Var.method_433(), 1)).append(", ").append(method_1081(method_2057)).append(", ").append(method_1079(method_1964)).append(", ").append("new String[] { ").append(class_204.method_977(class_591Var.method_643(), false, true)).append(" }, \"").append(class_557Var.method_464()).append("\", \"").append(this.field_846.method_546()).append("\", il, _cp);").toString());
        this.field_845.println();
        new class_324(class_591Var, this.field_845).method_1378();
        this.field_845.println("    method.setMaxStack();");
        this.field_845.println("    method.setMaxLocals();");
        this.field_845.println("    _cg.addMethod(method.getMethod());");
        this.field_845.println("    il.dispose();");
    }

    public static String method_1083(String str) {
        class_212 method_1034 = class_212.method_1034(str);
        byte method_619 = method_1034.method_619();
        if (method_619 <= 12) {
            return new StringBuilder().insert(0, "Type.").append(ASMInterface.field_1384[method_619].toUpperCase(Locale.ENGLISH)).toString();
        }
        if (!method_1034.toString().equals("java.lang.String")) {
            if (!method_1034.toString().equals("java.lang.Object")) {
                if (method_1034.toString().equals("java.lang.StringBuffer")) {
                    return "Type.STRINGBUFFER";
                }
                if (!(method_1034 instanceof class_594)) {
                    return new StringBuilder().insert(0, "new ObjectType(\"").append(class_204.method_962(str, false)).append("\")").toString();
                }
                class_594 class_594Var = (class_594) method_1034;
                return new StringBuilder().insert(0, "new ArrayType(").append(method_1081(class_594Var.method_669())).append(", ").append(class_594Var.method_433()).append(")").toString();
            }
            return "Type.OBJECT";
        }
        return "Type.STRING";
    }

    @Override // p000.class_164, p000.class_21
    public void method_71(class_261 class_261Var) {
        this.field_845.println();
        this.field_845.println(new StringBuilder().insert(0, "    field = new FieldGen(").append(method_1077(class_261Var.method_433())).append(", ").append(method_1083(class_261Var.method_546())).append(", \"").append(class_261Var.method_464()).append("\", _cp);").toString());
        class_257 method_1146 = class_261Var.method_1146();
        if (method_1146 != null) {
            this.field_845.println(new StringBuilder().insert(0, "    field.setInitValue(").append(method_1146.toString()).append(")").toString());
        }
        this.field_845.println("    _cg.addField(field.getField());");
    }

    public static String method_1082(int i, int i2) {
        if (i != 0) {
            StringBuffer stringBuffer = new StringBuffer();
            int i3 = 1;
            int i4 = 0;
            int i5 = 1;
            while (i3 <= 16384) {
                if ((i & i5) != 0) {
                    if (i5 == 32 && i2 == 0) {
                        stringBuffer.append("ACC_SUPER | ");
                    } else if (i5 == 64 && i2 == 1) {
                        stringBuffer.append("ACC_BRIDGE | ");
                    } else if (i5 != 128 || i2 != 1) {
                        stringBuffer.append("ACC_").append(ASMInterface.field_1313[i4].toUpperCase(Locale.ENGLISH)).append(" | ");
                    } else {
                        stringBuffer.append("ACC_VARARGS | ");
                    }
                }
                i4++;
                int i6 = i5 << 1;
                i3 = i6;
                i5 = i6;
            }
            return stringBuffer.toString().substring(0, r0.length() - 3);
        }
        return "0";
    }

    public void method_1078() {
        String method_546 = this.field_846.method_546();
        this.field_845.println("  public static void main(String[] args) throws Exception {");
        this.field_845.println(new StringBuilder().insert(0, "    ").append(method_546).append("Creator creator = new ").append(method_546).append("Creator();").toString());
        this.field_845.println(new StringBuilder().insert(0, "    creator.create(new FileOutputStream(\"").append(method_546).append(".class\"));").toString());
        this.field_845.println("  }");
    }
}
