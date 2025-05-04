package com.allatori.ant;

import com.allatori.interfaces.ASMInterface;
import com.allatori.exception.runtime.class_151;
import com.allatori.interfaces.unmapped.class_396;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_36 {
    public static final int field_61 = 32767;
    public static final Map field_65 = new HashMap();
    public static final int field_66 = 256;
    public class_337[] field_62;
    public String field_63;
    public class_70 field_64;

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:6:0x0025 */
    public static final String method_176(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = lowerCase.charAt(i2);
            if (Character.isLetterOrDigit(charAt)) {
                StringBuffer stringBuffer2 = new StringBuffer();
                while (true) {
                    char c = charAt;
                    if ((!Character.isLetterOrDigit(charAt) && c != '_') || i2 >= length) {
                        break;
                    }
                    i2++;
                    stringBuffer2.append(c);
                    if (i2 >= length) {
                        break;
                    }
                    charAt = lowerCase.charAt(i2);
                }
                i2--;
                stringBuffer.append(method_168(stringBuffer2.toString()));
            } else if (!Character.isWhitespace(charAt)) {
                stringBuffer.append(charAt);
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        return stringBuffer.toString();
    }

    public class_337[] method_166(int i, int i2) {
        class_337[] class_337VarArr = new class_337[i2];
        System.arraycopy(this.field_62, i, class_337VarArr, 0, i2);
        return class_337VarArr;
    }

    public final void method_173() {
        int method_433 = this.field_64.method_433();
        char[] cArr = new char[method_433];
        this.field_62 = this.field_64.method_446();
        int i = 0;
        int i2 = 0;
        while (i < method_433) {
            int i3 = i2 + 1;
            cArr[i2] = method_170(this.field_62[i2].method_1038().method_1904());
            i = i3;
            i2 = i3;
        }
        this.field_63 = new String(cArr);
    }

    public static final String method_168(String str) {
        String str2 = (String) field_65.get(str);
        if (str2 == null) {
            short s = 0;
            short s2 = 0;
            while (s < 256) {
                if (!str.equals(ASMInterface.field_1554[s2])) {
                    short s3 = (short) (s2 + 1);
                    s = s3;
                    s2 = s3;
                } else {
                    return new StringBuilder().insert(0, "").append(method_170(s2)).toString();
                }
            }
            throw new RuntimeException(new StringBuilder().insert(0, "Instruction unknown: ").append(str).toString());
        }
        return str2;
    }

    public static final String method_175(String str) {
        return method_167(str, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        field_65.put("arithmeticinstruction", "(irem|lrem|iand|ior|ineg|isub|lneg|fneg|fmul|ldiv|fadd|lxor|frem|idiv|land|ixor|ishr|fsub|lshl|fdiv|iadd|lor|dmul|lsub|ishl|imul|lmul|lushr|dneg|iushr|lshr|ddiv|drem|dadd|ladd|dsub)");
        field_65.put("invokeinstruction", "(invokevirtual|invokeinterface|invokestatic|invokespecial)");
        field_65.put("arrayinstruction", "(baload|aastore|saload|caload|fastore|lastore|iaload|castore|iastore|aaload|bastore|sastore|faload|laload|daload|dastore)");
        field_65.put("gotoinstruction", "(goto|goto_w)");
        field_65.put("conversioninstruction", "(d2l|l2d|i2s|d2i|l2i|i2b|l2f|d2f|f2i|i2d|i2l|f2d|i2c|f2l|i2f)");
        field_65.put("localvariableinstruction", "(fstore|iinc|lload|dstore|dload|iload|aload|astore|istore|fload|lstore)");
        field_65.put("loadinstruction", "(fload|dload|lload|iload|aload)");
        field_65.put("fieldinstruction", "(getfield|putstatic|getstatic|putfield)");
        field_65.put("cpinstruction", "(ldc2_w|invokeinterface|multianewarray|putstatic|instanceof|getstatic|checkcast|getfield|invokespecial|ldc_w|invokestatic|invokevirtual|putfield|ldc|new|anewarray)");
        field_65.put("stackinstruction", "(dup2|swap|dup2_x2|pop|pop2|dup|dup2_x1|dup_x2|dup_x1)");
        field_65.put("branchinstruction", "(ifle|if_acmpne|if_icmpeq|if_acmpeq|ifnonnull|goto_w|iflt|ifnull|if_icmpne|tableswitch|if_icmple|ifeq|if_icmplt|jsr_w|if_icmpgt|ifgt|jsr|goto|ifne|ifge|lookupswitch|if_icmpge)");
        field_65.put("returninstruction", "(lreturn|ireturn|freturn|dreturn|areturn|return)");
        field_65.put("storeinstruction", "(istore|fstore|dstore|astore|lstore)");
        field_65.put("select", "(tableswitch|lookupswitch)");
        field_65.put("ifinstruction", "(ifeq|ifgt|if_icmpne|if_icmpeq|ifge|ifnull|ifne|if_icmple|if_icmpge|if_acmpeq|if_icmplt|if_acmpne|ifnonnull|iflt|if_icmpgt|ifle)");
        field_65.put("jsrinstruction", "(jsr|jsr_w)");
        field_65.put("variablelengthinstruction", "(tableswitch|jsr|goto|lookupswitch)");
        field_65.put("unconditionalbranch", "(goto|jsr|jsr_w|athrow|goto_w)");
        field_65.put("constantpushinstruction", "(dconst|bipush|sipush|fconst|iconst|lconst)");
        field_65.put("typedinstruction", "(imul|lsub|aload|fload|lor|new|aaload|fcmpg|iand|iaload|lrem|idiv|d2l|isub|dcmpg|dastore|ret|f2d|f2i|drem|iinc|i2c|checkcast|frem|lreturn|astore|lushr|daload|dneg|fastore|istore|lshl|ldiv|lstore|areturn|ishr|ldc_w|invokeinterface|aastore|lxor|ishl|l2d|i2f|return|faload|sipush|iushr|caload|instanceof|invokespecial|putfield|fmul|ireturn|laload|d2f|lneg|ixor|i2l|fdiv|lastore|multianewarray|i2b|getstatic|i2d|putstatic|fcmpl|saload|ladd|irem|dload|jsr_w|dconst|dcmpl|fsub|freturn|ldc|aconst_null|castore|lmul|ldc2_w|dadd|iconst|f2l|ddiv|dstore|land|jsr|anewarray|dmul|bipush|dsub|sastore|d2i|i2s|lshr|iadd|l2i|lload|bastore|fstore|fneg|iload|fadd|baload|fconst|ior|ineg|dreturn|l2f|lconst|getfield|invokevirtual|invokestatic|iastore)");
        field_65.put("popinstruction", "(fstore|dstore|pop|pop2|astore|putstatic|istore|lstore)");
        field_65.put("allocationinstruction", "(multianewarray|new|anewarray|newarray)");
        field_65.put("indexedinstruction", "(lload|lstore|fload|ldc2_w|invokeinterface|multianewarray|astore|dload|putstatic|instanceof|getstatic|checkcast|getfield|invokespecial|dstore|istore|iinc|ldc_w|ret|fstore|invokestatic|iload|putfield|invokevirtual|ldc|new|aload|anewarray)");
        field_65.put("pushinstruction", "(dup|lload|dup2|bipush|fload|ldc2_w|sipush|lconst|fconst|dload|getstatic|ldc_w|aconst_null|dconst|iload|ldc|iconst|aload)");
        field_65.put("stackproducer", "(imul|lsub|aload|fload|lor|new|aaload|fcmpg|iand|iaload|lrem|idiv|d2l|isub|dcmpg|dup|f2d|f2i|drem|i2c|checkcast|frem|lushr|daload|dneg|lshl|ldiv|ishr|ldc_w|invokeinterface|lxor|ishl|l2d|i2f|faload|sipush|iushr|caload|instanceof|invokespecial|fmul|laload|d2f|lneg|ixor|i2l|fdiv|getstatic|i2b|swap|i2d|dup2|fcmpl|saload|ladd|irem|dload|jsr_w|dconst|dcmpl|fsub|ldc|arraylength|aconst_null|tableswitch|lmul|ldc2_w|iconst|dadd|f2l|ddiv|land|jsr|anewarray|dmul|bipush|dsub|d2i|newarray|i2s|lshr|iadd|lload|l2i|fneg|iload|fadd|baload|fconst|lookupswitch|ior|ineg|lconst|l2f|getfield|invokevirtual|invokestatic)");
        field_65.put("stackconsumer", "(imul|lsub|lor|iflt|fcmpg|if_icmpgt|iand|ifeq|if_icmplt|lrem|ifnonnull|idiv|d2l|isub|dcmpg|dastore|if_icmpeq|f2d|f2i|drem|i2c|checkcast|frem|lreturn|astore|lushr|pop2|monitorexit|dneg|fastore|istore|lshl|ldiv|lstore|areturn|if_icmpge|ishr|monitorenter|invokeinterface|aastore|lxor|ishl|l2d|i2f|return|iushr|instanceof|invokespecial|fmul|ireturn|d2f|lneg|ixor|pop|i2l|ifnull|fdiv|lastore|i2b|if_acmpeq|ifge|swap|i2d|putstatic|fcmpl|ladd|irem|dcmpl|fsub|freturn|ifgt|castore|lmul|dadd|f2l|ddiv|dstore|land|if_icmpne|if_acmpne|dmul|dsub|sastore|ifle|d2i|i2s|lshr|iadd|l2i|bastore|fstore|fneg|fadd|ior|ineg|ifne|dreturn|l2f|if_icmple|getfield|invokevirtual|invokestatic|iastore)");
        field_65.put("exceptionthrower", "(irem|lrem|laload|putstatic|baload|dastore|areturn|getstatic|ldiv|anewarray|iastore|castore|idiv|saload|lastore|fastore|putfield|lreturn|caload|getfield|return|aastore|freturn|newarray|instanceof|multianewarray|athrow|faload|iaload|aaload|dreturn|monitorenter|checkcast|bastore|arraylength|new|invokevirtual|sastore|ldc_w|ireturn|invokespecial|monitorexit|invokeinterface|ldc|invokestatic|daload)");
        field_65.put("loadclass", "(multianewarray|invokeinterface|instanceof|invokespecial|putfield|checkcast|putstatic|invokevirtual|new|getstatic|invokestatic|getfield|anewarray)");
        field_65.put("instructiontargeter", "(ifle|if_acmpne|if_icmpeq|if_acmpeq|ifnonnull|goto_w|iflt|ifnull|if_icmpne|tableswitch|if_icmple|ifeq|if_icmplt|jsr_w|if_icmpgt|ifgt|jsr|goto|ifne|ifge|lookupswitch|if_icmpge)");
        field_65.put("if_icmp", "(if_icmpne|if_icmpeq|if_icmple|if_icmpge|if_icmplt|if_icmpgt)");
        field_65.put("if_acmp", "(if_acmpeq|if_acmpne)");
        field_65.put("if", "(ifeq|ifne|iflt|ifge|ifgt|ifle)");
        field_65.put("iconst", method_172((short) 3, (short) 8, (short) 2));
        field_65.put("lconst", new String(new char[]{'(', method_170((short) 9), '|', method_170((short) 10), ')'}));
        field_65.put("dconst", new String(new char[]{'(', method_170((short) 14), '|', method_170((short) 15), ')'}));
        field_65.put("fconst", new String(new char[]{'(', method_170((short) 11), '|', method_170((short) 12), ')'}));
        field_65.put("iload", method_172((short) 26, (short) 29, (short) 21));
        field_65.put("dload", method_172((short) 38, (short) 41, (short) 24));
        field_65.put("fload", method_172((short) 34, (short) 37, (short) 23));
        field_65.put("aload", method_172((short) 42, (short) 45, (short) 25));
        field_65.put("istore", method_172((short) 59, (short) 62, (short) 54));
        field_65.put("dstore", method_172((short) 71, (short) 74, (short) 57));
        field_65.put("fstore", method_172((short) 67, (short) 70, (short) 56));
        field_65.put("astore", method_172((short) 75, (short) 78, (short) 58));
        for (String str : field_65.keySet()) {
            String str2 = (String) field_65.get(str);
            if (str2.charAt(1) < '\u7fff') {
                field_65.put(str, method_176(str2));
            }
        }
        StringBuffer stringBuffer = new StringBuffer("(");
        short s = 0;
        short s2 = 0;
        while (s < 256) {
            if (ASMInterface.field_1582[s2] != -1) {
                stringBuffer.append(method_170(s2));
                if (s2 < 255) {
                    stringBuffer.append('|');
                }
            }
            short s3 = (short) (s2 + 1);
            s = s3;
            s2 = s3;
        }
        stringBuffer.append(')');
        field_65.put("instruction", stringBuffer.toString());
    }

    public final Iterator method_171(String str, class_337 class_337Var, class_396 class_396Var) {
        int i;
        int i2;
        String method_176 = method_176(str);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= this.field_62.length) {
                i = -1;
                i2 = -1;
                break;
            }
            if (this.field_62[i4] == class_337Var) {
                i = i4;
                i2 = i4;
                break;
            }
            int i5 = i4 + 1;
            i3 = i5;
            i4 = i5;
        }
        if (i != -1) {
            Pattern compile = Pattern.compile(method_176);
            ArrayList arrayList = new ArrayList();
            Matcher matcher = compile.matcher(this.field_63);
            int i6 = i2;
            int i7 = i2;
            while (i6 < this.field_63.length() && matcher.find(i7)) {
                int start = matcher.start();
                int end = matcher.end();
                class_337[] method_166 = method_166(start, (end - start) + 1);
                if (class_396Var == null || class_396Var.method_1559(method_166)) {
                    arrayList.add(method_166);
                }
                i6 = end;
                i7 = end;
            }
            return arrayList.iterator();
        }
        throw new class_151(new StringBuilder().insert(0, "Instruction handle ").append(class_337Var).append(" not found in instruction list.").toString());
    }

    public final class_70 method_164() {
        return this.field_64;
    }

    public final Iterator method_174(String str) {
        return method_171(str, this.field_64.method_415(), null);
    }

    public final Iterator method_169(String str, class_337 class_337Var) {
        return method_171(str, class_337Var, null);
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0008 */
    public static final String method_167(String str, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i >= str.length()) {
                return stringBuffer.toString();
            }
            char charAt = str.charAt(i2);
            if (charAt < '\u7fff') {
                stringBuffer.append(charAt);
            } else if (!z) {
                stringBuffer.append(charAt - '\u7fff');
            } else {
                stringBuffer.append(ASMInterface.field_1554[charAt - '\u7fff']);
            }
            i = i2 + 1;
        }
    }

    public final Iterator method_165(String str, class_396 class_396Var) {
        return method_171(str, this.field_64.method_415(), class_396Var);
    }

    public class_36(class_70 class_70Var) {
        this.field_64 = class_70Var;
        method_173();
    }

    public static String method_172(short s, short s2, short s3) {
        StringBuffer stringBuffer = new StringBuffer("(");
        short s4 = s;
        short s5 = s;
        while (s4 <= s2) {
            stringBuffer.append(method_170(s5));
            stringBuffer.append('|');
            short s6 = (short) (s5 + 1);
            s4 = s6;
            s5 = s6;
        }
        stringBuffer.append(method_170(s3));
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    public static final char method_170(short s) {
        return (char) (s + Short.MAX_VALUE);
    }
}
