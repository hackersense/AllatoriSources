package mapped;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// $VF: Compiled from o
public class Class458 {
   // $VF: synthetic field
   public String field1489;
   // $VF: synthetic field
   public static final int field1490 = 256;
   // $VF: synthetic field
   public static final int field1491 = 32767;
   // $VF: synthetic field
   public static final Map field1492 = new HashMap();
   // $VF: synthetic field
   public Class246[] field1493;
   // $VF: synthetic field
   public Class251 field1494;

   // $VF: synthetic method
   public final Iterator method985(String var1, Class246 var2) {
      return this.method996(var1, var2, null);// 596
   }

   // $VF: synthetic method
   public final Iterator method986(String var1) {
      return this.method996(var1, this.field1494.method32(), null);// 215
   }

   static {
      field1492.put(// 544
         "arithmeticinstruction",
         "(irem|lrem|iand|ior|ineg|isub|lneg|fneg|fmul|ldiv|fadd|lxor|frem|idiv|land|ixor|ishr|fsub|lshl|fdiv|iadd|lor|dmul|lsub|ishl|imul|lmul|lushr|dneg|iushr|lshr|ddiv|drem|dadd|ladd|dsub)"
      );
      field1492.put("invokeinstruction", "(invokevirtual|invokeinterface|invokestatic|invokespecial)");// 105
      field1492.put(// 183
         "arrayinstruction", "(baload|aastore|saload|caload|fastore|lastore|iaload|castore|iastore|aaload|bastore|sastore|faload|laload|daload|dastore)"
      );
      field1492.put("gotoinstruction", "(goto|goto_w)");// 249
      field1492.put("conversioninstruction", "(d2l|l2d|i2s|d2i|l2i|i2b|l2f|d2f|f2i|i2d|i2l|f2d|i2c|f2l|i2f)");// 349
      field1492.put("localvariableinstruction", "(fstore|iinc|lload|dstore|dload|iload|aload|astore|istore|fload|lstore)");// 164
      field1492.put("loadinstruction", "(fload|dload|lload|iload|aload)");// 429
      field1492.put("fieldinstruction", "(getfield|putstatic|getstatic|putfield)");// 89
      field1492.put(// 506
         "cpinstruction",
         "(ldc2_w|invokeinterface|multianewarray|putstatic|instanceof|getstatic|checkcast|getfield|invokespecial|ldc_w|invokestatic|invokevirtual|putfield|ldc|new|anewarray)"
      );
      field1492.put("stackinstruction", "(dup2|swap|dup2_x2|pop|pop2|dup|dup2_x1|dup_x2|dup_x1)");// 306
      field1492.put(// 8
         "branchinstruction",
         "(ifle|if_acmpne|if_icmpeq|if_acmpeq|ifnonnull|goto_w|iflt|ifnull|if_icmpne|tableswitch|if_icmple|ifeq|if_icmplt|jsr_w|if_icmpgt|ifgt|jsr|goto|ifne|ifge|lookupswitch|if_icmpge)"
      );
      field1492.put("returninstruction", "(lreturn|ireturn|freturn|dreturn|areturn|return)");// 301
      field1492.put("storeinstruction", "(istore|fstore|dstore|astore|lstore)");// 602
      field1492.put("select", "(tableswitch|lookupswitch)");// 363
      field1492.put(// 509
         "ifinstruction", "(ifeq|ifgt|if_icmpne|if_icmpeq|ifge|ifnull|ifne|if_icmple|if_icmpge|if_acmpeq|if_icmplt|if_acmpne|ifnonnull|iflt|if_icmpgt|ifle)"
      );
      field1492.put("jsrinstruction", "(jsr|jsr_w)");// 256
      field1492.put("variablelengthinstruction", "(tableswitch|jsr|goto|lookupswitch)");// 357
      field1492.put("unconditionalbranch", "(goto|jsr|jsr_w|athrow|goto_w)");// 47
      field1492.put("constantpushinstruction", "(dconst|bipush|sipush|fconst|iconst|lconst)");// 182
      field1492.put(// 4
         "typedinstruction",
         "(imul|lsub|aload|fload|lor|new|aaload|fcmpg|iand|iaload|lrem|idiv|d2l|isub|dcmpg|dastore|ret|f2d|f2i|drem|iinc|i2c|checkcast|frem|lreturn|astore|lushr|daload|dneg|fastore|istore|lshl|ldiv|lstore|areturn|ishr|ldc_w|invokeinterface|aastore|lxor|ishl|l2d|i2f|return|faload|sipush|iushr|caload|instanceof|invokespecial|putfield|fmul|ireturn|laload|d2f|lneg|ixor|i2l|fdiv|lastore|multianewarray|i2b|getstatic|i2d|putstatic|fcmpl|saload|ladd|irem|dload|jsr_w|dconst|dcmpl|fsub|freturn|ldc|aconst_null|castore|lmul|ldc2_w|dadd|iconst|f2l|ddiv|dstore|land|jsr|anewarray|dmul|bipush|dsub|sastore|d2i|i2s|lshr|iadd|l2i|lload|bastore|fstore|fneg|iload|fadd|baload|fconst|ior|ineg|dreturn|l2f|lconst|getfield|invokevirtual|invokestatic|iastore)"
      );
      field1492.put("popinstruction", "(fstore|dstore|pop|pop2|astore|putstatic|istore|lstore)");// 228
      field1492.put("allocationinstruction", "(multianewarray|new|anewarray|newarray)");// 334
      field1492.put(// 219
         "indexedinstruction",
         "(lload|lstore|fload|ldc2_w|invokeinterface|multianewarray|astore|dload|putstatic|instanceof|getstatic|checkcast|getfield|invokespecial|dstore|istore|iinc|ldc_w|ret|fstore|invokestatic|iload|putfield|invokevirtual|ldc|new|aload|anewarray)"
      );
      field1492.put(// 255
         "pushinstruction", "(dup|lload|dup2|bipush|fload|ldc2_w|sipush|lconst|fconst|dload|getstatic|ldc_w|aconst_null|dconst|iload|ldc|iconst|aload)"
      );
      field1492.put(// 214
         "stackproducer",
         "(imul|lsub|aload|fload|lor|new|aaload|fcmpg|iand|iaload|lrem|idiv|d2l|isub|dcmpg|dup|f2d|f2i|drem|i2c|checkcast|frem|lushr|daload|dneg|lshl|ldiv|ishr|ldc_w|invokeinterface|lxor|ishl|l2d|i2f|faload|sipush|iushr|caload|instanceof|invokespecial|fmul|laload|d2f|lneg|ixor|i2l|fdiv|getstatic|i2b|swap|i2d|dup2|fcmpl|saload|ladd|irem|dload|jsr_w|dconst|dcmpl|fsub|ldc|arraylength|aconst_null|tableswitch|lmul|ldc2_w|iconst|dadd|f2l|ddiv|land|jsr|anewarray|dmul|bipush|dsub|d2i|newarray|i2s|lshr|iadd|lload|l2i|fneg|iload|fadd|baload|fconst|lookupswitch|ior|ineg|lconst|l2f|getfield|invokevirtual|invokestatic)"
      );
      field1492.put(// 431
         "stackconsumer",
         "(imul|lsub|lor|iflt|fcmpg|if_icmpgt|iand|ifeq|if_icmplt|lrem|ifnonnull|idiv|d2l|isub|dcmpg|dastore|if_icmpeq|f2d|f2i|drem|i2c|checkcast|frem|lreturn|astore|lushr|pop2|monitorexit|dneg|fastore|istore|lshl|ldiv|lstore|areturn|if_icmpge|ishr|monitorenter|invokeinterface|aastore|lxor|ishl|l2d|i2f|return|iushr|instanceof|invokespecial|fmul|ireturn|d2f|lneg|ixor|pop|i2l|ifnull|fdiv|lastore|i2b|if_acmpeq|ifge|swap|i2d|putstatic|fcmpl|ladd|irem|dcmpl|fsub|freturn|ifgt|castore|lmul|dadd|f2l|ddiv|dstore|land|if_icmpne|if_acmpne|dmul|dsub|sastore|ifle|d2i|i2s|lshr|iadd|l2i|bastore|fstore|fneg|fadd|ior|ineg|ifne|dreturn|l2f|if_icmple|getfield|invokevirtual|invokestatic|iastore)"
      );
      field1492.put(// 374
         "exceptionthrower",
         "(irem|lrem|laload|putstatic|baload|dastore|areturn|getstatic|ldiv|anewarray|iastore|castore|idiv|saload|lastore|fastore|putfield|lreturn|caload|getfield|return|aastore|freturn|newarray|instanceof|multianewarray|athrow|faload|iaload|aaload|dreturn|monitorenter|checkcast|bastore|arraylength|new|invokevirtual|sastore|ldc_w|ireturn|invokespecial|monitorexit|invokeinterface|ldc|invokestatic|daload)"
      );
      field1492.put(// 224
         "loadclass",
         "(multianewarray|invokeinterface|instanceof|invokespecial|putfield|checkcast|putstatic|invokevirtual|new|getstatic|invokestatic|getfield|anewarray)"
      );
      field1492.put(// 71
         "instructiontargeter",
         "(ifle|if_acmpne|if_icmpeq|if_acmpeq|ifnonnull|goto_w|iflt|ifnull|if_icmpne|tableswitch|if_icmple|ifeq|if_icmplt|jsr_w|if_icmpgt|ifgt|jsr|goto|ifne|ifge|lookupswitch|if_icmpge)"
      );
      field1492.put("if_icmp", "(if_icmpne|if_icmpeq|if_icmple|if_icmpge|if_icmplt|if_icmpgt)");// 547
      field1492.put("if_acmp", "(if_acmpeq|if_acmpne)");// 303
      field1492.put("if", "(ifeq|ifne|iflt|ifge|ifgt|ifle)");// 326
      field1492.put("iconst", method989((short)3, (short)8, (short)2));// 328
      field1492.put("lconst", new String(new char[]{'(', method997((short)9), '|', method997((short)10), ')'}));// 521
      field1492.put("dconst", new String(new char[]{'(', method997((short)14), '|', method997((short)15), ')'}));// 341
      field1492.put("fconst", new String(new char[]{'(', method997((short)11), '|', method997((short)12), ')'}));// 325
      field1492.put("iload", method989((short)26, (short)29, (short)21));// 44
      field1492.put("dload", method989((short)38, (short)41, (short)24));// 362
      field1492.put("fload", method989((short)34, (short)37, (short)23));// 476
      field1492.put("aload", method989((short)42, (short)45, (short)25));// 542
      field1492.put("istore", method989((short)59, (short)62, (short)54));// 231
      field1492.put("dstore", method989((short)71, (short)74, (short)57));// 420
      field1492.put("fstore", method989((short)67, (short)70, (short)56));// 454
      field1492.put("astore", method989((short)75, (short)78, (short)58));// 343

      for (String var1 : field1492.keySet()) {// 126 324
         String var2;
         if ((var2 = (String)field1492.get(var1)).charAt(1) < 32767) {// 376 492 519
            field1492.put(var1, method994(var2));// 482
         }
      }

      StringBuffer var3 = new StringBuffer("(");// 2

      short var4;
      for (short var10000 = var4 = 0; var10000 < 256; var10000 = ++var4) {// 505
         if (Class125.field327[var4] != -1) {// 421
            var3.append(method997(var4));// 86
            if (var4 < 255) {// 473
               var3.append('|');// 131
            }
         }
      }

      var3.append(')');// 323
      field1492.put("instruction", var3.toString());// 458
   }// 591

   // $VF: synthetic method
   public static final String method987(String var0) {
      String var1 = var0;
      if ((var0 = (String)field1492.get(var0)) != null) {// 38 412
         return var0;// 257
      } else {
         for (short var10000 = var3 = 0; var10000 < 256; var10000 = ++var3) {// 455
            if (var1.equals(Class125.field386[var3])) {// 148
               return "" + method997(var3);// 236
            }
         }

         throw new RuntimeException("Instruction unknown: " + var1);// 368
      }
   }

   // $VF: synthetic method
   public Class246[] method988(int var1, int var2) {
      Class246[] var4 = new Class246[var2];// 285
      System.arraycopy(this.field1493, var1, var4, 0, var2);// 119
      return var4;// 32
   }

   // $VF: synthetic method
   public static String method989(short var0, short var1, short var2) {
      StringBuffer var3 = new StringBuffer("(");// 150

      for (short var10000 = var0 = var0; var10000 <= var1; var10000 = ++var0) {// 56
         var3.append(method997(var0));// 416
         var3.append('|');// 211
      }

      var3.append(method997(var2));// 178
      var3.append(")");// 262
      return var3.toString();// 475
   }

   // $VF: synthetic method
   public final void method990() {
      Class458 var3 = this;
      int var1;
      char[] var2 = new char[var1 = this.field1494.method17()];// 59 391
      this.field1493 = this.field1494.method39();// 589

      for (int var10000 = var4 = 0; var10000 < var1; var10000 = var4) {// 555
         int var10001 = var4;
         char var10002 = method997(var3.field1493[var4].method18().method22());
         var4++;
         var2[var10001] = var10002;// 73
      }

      var3.field1489 = new String(var2);// 398
   }// 428

   // $VF: synthetic method
   public static final String method991(String var0, boolean var1) {
      String var2 = var0;
      StringBuffer var5 = new StringBuffer();// 568

      int var4;
      for (int var10000 = var4 = 0; var10000 < var2.length(); var10000 = ++var4) {// 152
         char var3;
         if ((var3 = var2.charAt(var4)) >= 32767) {// 98 311
            if (var1) {// 407
               var5.append(Class125.field386[var3 - 32767]);// 405
            } else {
               var5.append(var3 - 32767);// 16
            }
         } else {
            var5.append(var3);// 518
         }
      }

      return var5.toString();// 387
   }

   // $VF: synthetic method
   public static final String method992(String var0) {
      return method991(var0, true);// 538
   }

   // $VF: synthetic method
   public Class458(Class251 var1) {
      this.field1494 = var1;// 0 33
      this.method990();// 240
   }// 246

   // $VF: synthetic method
   public final Iterator method993(String var1, Class537 var2) {
      return this.method996(var1, this.field1494.method32(), var2);// 592
   }

   // $VF: synthetic method
   public static final String method994(String var0) {
      String var5 = var0.toLowerCase(Locale.ENGLISH);// 386
      StringBuffer var4 = new StringBuffer();// 470
      int var3 = var0.length();// 149

      int var2;
      for (int var10000 = var2 = 0; var10000 < var3; var10000 = ++var2) {// 157
         char var7;
         if (!Character.isLetterOrDigit(var7 = var5.charAt(var2))) {// 24 286
            if (!Character.isWhitespace(var7)) {// 31
               var4.append(var7);// 21
            }
         } else {
            StringBuffer var6 = new StringBuffer();// 600

            for (char var8 = var7; (Character.isLetterOrDigit(var8) || var7 == '_') && var2 < var3; var8 = var7 = var5.charAt(var2)) {// 94 108
               var2++;
               var6.append(var7);// 27
               if (var2 >= var3) {// 242
                  break;
               }
            }

            var2--;// 464
            var4.append(method987(var6.toString()));// 25
         }
      }

      return var4.toString();// 45
   }

   // $VF: synthetic method
   public final Class251 method995() {
      return this.field1494;// 11
   }

   // $VF: synthetic method
   public final Iterator method996(String var1, Class246 var2, Class537 var3) {
      Class458 var5 = this;
      var1 = method994(var1);// 266
      int var4 = -1;// 235
      int var8;
      int var10000 = var8 = 0;

      while (true) {
         if (var10000 >= var5.field1493.length) {
            var10000 = var4;// 77
            break;
         }

         if (var5.field1493[var8] == var2) {// 370
            var10000 = var4 = var8;// 516
            break;// 95
         }

         var10000 = ++var8;// 280
      }

      if (var10000 == -1) {
         throw new Class241("Instruction handle " + var2 + " not found in instruction list.");// 288
      } else {
         Pattern var9 = Pattern.compile(var1);// 107
         ArrayList var13 = new ArrayList();// 437
         Matcher var14 = var9.matcher(var5.field1489);// 110
         var10000 = var4;// 221

         while (var10000 < var5.field1489.length() && var14.find(var4)) {
            int var10 = var14.start();// 444
            int var6;
            int var7 = (var6 = var14.end()) - var10 + 1;// 193 601
            Class246[] var11 = var5.method988(var10, var7);// 251
            if (var3 == null || var3.method1627(var11)) {// 486
               var13.add(var11);// 117
            }

            var10000 = var4 = var6;// 245
         }

         return var13.iterator();// 404
      }
   }

   // $VF: synthetic method
   public static final char method997(short var0) {
      return (char)(var0 + 32767);// 212
   }
}
