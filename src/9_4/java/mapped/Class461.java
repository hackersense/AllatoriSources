package mapped;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Locale;

// $VF: Compiled from fn
public class Class461 extends Class460 {
   // $VF: synthetic field
   public static final int field1497 = 1;
   // $VF: synthetic field
   public Class221 field1498;
   // $VF: synthetic field
   public PrintWriter field1499;
   // $VF: synthetic field
   public static final int field1500 = 0;
   // $VF: synthetic field
   public Class205 field1501;
   // $VF: synthetic field
   public static final int field1502 = -1;

   // $VF: synthetic method
   public static String method1036(int var0) {
      return method1041(var0, -1);// 314
   }

   // $VF: synthetic method
   public static String method1037(String var0) {
      byte var2;
      Class138 var3;
      if ((var2 = (var3 = Class138.method151(var0)).method142()) <= 12) {// 81 404 417
         return "Type." + Class125.field354[var2].toUpperCase(Locale.ENGLISH);// 401
      } else if (var3.toString().equals("java.lang.String")) {// 394
         return "Type.STRING";// 556
      } else if (var3.toString().equals("java.lang.Object")) {// 316
         return "Type.OBJECT";// 207
      } else if (var3.toString().equals("java.lang.StringBuffer")) {// 275
         return "Type.STRINGBUFFER";// 127
      } else if (var3 instanceof Class145) {// 355
         Class145 var4 = (Class145)var3;// 496
         return "new ArrayType(" + method1042(var4.method26()) + ", " + var4.method17() + ")";// 369
      } else {
         return "new ObjectType(\"" + Class523.method1509(var0, false) + "\")";// 382
      }
   }

   // $VF: synthetic method
   public void method1038() {
      this.method1005(this.field1501);// 159
      this.field1499.flush();// 493
   }// 561

   // $VF: synthetic method
   @Override
   public void method1005(Class205 var1) {
      Class461 var2 = this;
      String var6 = var1.method93();// 6
      String var3 = var1.method20();// 144
      String var4 = var1.method343();// 461
      String var5 = Class523.method1543(var1.method130(), false, true);// 358
      if (!"".equals(var4)) {// 192
         var6 = var6.substring(var4.length() + 1);// 574
         this.field1499.println("package " + var4 + ";");// 272
         this.field1499.println();// 321
      }

      this.field1499.println("import org.apache.bcel.generic.*;");// 146
      this.field1499.println("import org.apache.bcel.classfile.*;");// 567
      this.field1499.println("import org.apache.bcel.*;");// 400
      this.field1499.println("import java.io.*;");// 33
      this.field1499.println();// 0
      this.field1499.println("public class " + var6 + "Creator implements Constants {");// 240
      this.field1499.println("  private InstructionFactory _factory;");// 246
      this.field1499.println("  private ConstantPoolGen    _cp;");// 552
      this.field1499.println("  private ClassGen           _cg;");// 603
      this.field1499.println();// 278
      this.field1499.println("  public " + var6 + "Creator() {");// 466
      this.field1499// 467
         .println(
            "    _cg = new ClassGen(\""
               + ("".equals(var4) ? var6 : var4 + "." + var6)
               + "\", \""
               + var3
               + "\", "
               + "\""
               + var1.method190()
               + "\", "
               + method1041(var1.method17(), 0)
               + ", "
               + "new String[] { "
               + var5
               + " });"
         );
      this.field1499.println();// 330
      this.field1499.println("    _cp = _cg.getConstantPool();");// 589
      this.field1499.println("    _factory = new InstructionFactory(_cg, _cp);");// 579
      this.field1499.println("  }");// 555
      this.field1499.println();// 73
      this.method1040();// 415
      Class207[] var7;
      if ((var7 = var1.method346()).length > 0) {// 398 428
         int var10000 = 0;
         this.field1499.println("  private void createFields() {");// 87
         this.field1499.println("    FieldGen field;");// 586

         for (int var9 = 0; var10000 < var7.length; var10000 = var9) {// 399
            var7[var9++].method87(var2);// 232
         }

         var2.field1499.println("  }");// 198
         var2.field1499.println();// 424
      }

      Class208[] var10 = var1.method341();// 588

      for (int var11 = var8 = 0; var11 < var10.length; var11 = var8) {// 329
         var2.field1499.println("  private void createMethod_" + var8 + "() {");
         var10[var8].method87(var2);// 38 412
         var8++;
         var2.field1499.println("  }");// 257
         var2.field1499.println();// 269
      }

      var2.method1039();// 148
      var2.field1499.println("}");// 236
   }// 142

   // $VF: synthetic method
   @Override
   public void method1018(Class208 var1) {
      Class203 var5;
      Class203 var10000 = var5 = new Class203(var1, this.field1501.method93(), this.field1498);// 97
      Class138 var3 = var10000.method164();// 411
      Class138[] var4 = var10000.method277();// 468
      this.field1499.println("    InstructionList il = new InstructionList();");// 138
      this.field1499// 285
         .println(
            "    MethodGen method = new MethodGen("
               + method1041(var1.method17(), 1)
               + ", "
               + method1042(var3)
               + ", "
               + method1043(var4)
               + ", "
               + "new String[] { "
               + Class523.method1543(var5.method130(), false, true)
               + " }, \""
               + var1.method190()
               + "\", \""
               + this.field1501.method93()
               + "\", il, _cp);"
         );
      this.field1499.println();// 61
      new Class468(var5, this.field1499).method1067();// 220 525
      this.field1499.println("    method.setMaxStack();");// 593
      this.field1499.println("    method.setMaxLocals();");// 336
      this.field1499.println("    _cg.addMethod(method.getMethod());");// 540
      this.field1499.println("    il.dispose();");// 291
   }// 57

   // $VF: synthetic method
   public void method1039() {
      String var2 = this.field1501.method93();// 157
      this.field1499.println("  public static void main(String[] args) throws Exception {");// 24
      this.field1499.println("    " + var2 + "Creator creator = new " + var2 + "Creator();");// 286
      this.field1499.println("    creator.create(new FileOutputStream(\"" + var2 + ".class\"));");// 600
      this.field1499.println("  }");// 108
   }// 27

   // $VF: synthetic method
   public void method1040() {
      Class461 var2 = this;
      this.field1499.println("  public void create(OutputStream out) throws IOException {");// 160
      if (this.field1501.method346().length > 0) {// 40 63
         this.field1499.println("    createFields();");// 541
      }

      Class208[] var1 = this.field1501.method341();// 510

      for (int var10000 = var3 = 0; var10000 < var1.length; var10000 = var3) {// 456
         PrintWriter var4 = var2.field1499;// 367
         StringBuilder var10001 = new StringBuilder().append("    createMethod_").append(var3);
         var3++;
         var4.println(var10001.append("();").toString());
      }

      var2.field1499.println("    _cg.getJavaClass().dump(out);");// 83
      var2.field1499.println("  }");// 5
      var2.field1499.println();// 279
   }// 450

   // $VF: synthetic method
   @Override
   public void method1009(Class207 var1) {
      this.field1499.println();// 69
      this.field1499// 116
         .println("    field = new FieldGen(" + method1036(var1.method17()) + ", " + method1037(var1.method20()) + ", \"" + var1.method190() + "\", _cp);");
      Class161 var3;
      if ((var3 = var1.method367()) != null) {// 25 464
         String var4 = var3.toString();// 31
         this.field1499.println("    field.setInitValue(" + var4 + ")");// 21
      }

      this.field1499.println("    _cg.addField(field.getField());");// 223
   }// 45

   // $VF: synthetic method
   public static String method1041(int var0, int var1) {
      int var2 = var0;
      if (var0 == 0) {// 474
         return "0";// 443
      } else {
         StringBuffer var4 = new StringBuffer();// 434
         int var3 = 0;

         for (int var10000 = var0 = 1; var10000 <= 16384; var10000 = var0) {// 292
            label39: {
               if ((var2 & var0) != 0) {// 373
                  if (var0 == 32 && var1 == 0) {// 72
                     var10000 = var0;
                     var4.append("ACC_SUPER | ");// 268
                     break label39;// 497
                  }

                  if (var0 == 64 && var1 == 1) {
                     var10000 = var0;
                     var4.append("ACC_BRIDGE | ");// 66
                     break label39;// 536
                  }

                  if (var0 == 128 && var1 == 1) {
                     var10000 = var0;
                     var4.append("ACC_VARARGS | ");// 307
                     break label39;// 218
                  }

                  var4.append("ACC_").append(Class125.field344[var3].toUpperCase(Locale.ENGLISH)).append(" | ");// 109
               }

               var10000 = var0;// 270
            }

            var3++;
            var0 = var10000 << 1;
         }

         String var6 = var4.toString();// 177
         return var6.substring(0, var6.length() - 3);// 266
      }
   }

   // $VF: synthetic method
   public static String method1042(Class138 var0) {
      return method1037(var0.method20());// 486
   }

   // $VF: synthetic method
   public static String method1043(Class138[] var0) {
      Class138[] var1 = var0;
      if (var0.length == 0) {// 95
         return "Type.NO_ARGS";// 227
      } else {
         StringBuffer var3 = new StringBuffer();// 77

         int var2;
         for (int var10000 = var2 = 0; var10000 < var1.length; var10000 = ++var2) {// 288
            var3.append(method1042(var1[var2]));// 129
            if (var2 < var1.length - 1) {// 258
               var3.append(", ");// 107
            }
         }

         return "new Type[] { " + var3.toString() + " }";// 221
      }
   }

   // $VF: synthetic method
   public Class461(Class205 var1, OutputStream var2) {
      this.field1501 = var1;// 58 553
      this.field1499 = new PrintWriter(var2);
      this.field1498 = new Class221(this.field1501.method94());// 190 315
   }// 465

   // $VF: synthetic method
   public static void main(String[] var0) {
      String var2;
      Class205 var3;
      if ((var3 = Class411.method790(var2 = var0[0])) == null) {// 282 503
         var3 = new Class410(var2).method765();// 339
      }

      new Class461(var3, System.out).method1038();// 549 596
   }// 499
}
