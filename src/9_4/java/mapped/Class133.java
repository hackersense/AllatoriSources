package mapped;

import smardecSB.astore_x;

// $VF: Compiled from qc
public final class Class133 extends Class131 {
   // $VF: synthetic field
   public Class576 field566;
   // $VF: synthetic field
   public int field567;
   // $VF: synthetic field
   public Class164 field568;
   // $VF: synthetic field
   public Class251 field569;

   // $VF: synthetic method
   public static int method133(Class133 var0) {
      return var0.field567;
   }

   // $VF: synthetic method
   public void method115() {
      Class133 var3 = this;

      try {
         Class221 var4 = new Class221(Class411.method790(var3.field566.method1913()).method94());// 29
         Class473 var2 = new Class473(var3, var4);// 328

         for (Class246 var6 = var3.field569.method32(); var6 != null; var6 = var6.method32()) {// 126 341 519 546
            Class10 var1;
            if ((var1 = var6.method18()) instanceof Class108) {// 51 392
               Class246 var7;
               if ((var7 = ((Class108)var1).method32()) == var3.field569.method32()) {// 44 571
                  throw new Class231(
                     "Due to JustIce's clear definition of subroutines, no JSR or JSR_W may have a top-level instruction (such as the very first instruction, which is targeted by instruction '"// 362
                        + var6
                        + "' as its target."
                  );
               }

               if (!(var7.method18() instanceof astore_x)) {// 542
                  throw new Class231(
                     "Due to JustIce's clear definition of subroutines, no JSR or JSR_W may target anything else than an ASTORE instruction. Instruction '"// 231
                        + var6
                        + "' targets '"
                        + var7
                        + "'."
                  );
               }
            }

            var6.method10(var2);
         }
      } catch (ClassNotFoundException var5) {// 482
         throw new Class242("Missing class: " + var5.toString());// 67
      }
   }// 2

   // $VF: synthetic method
   public Class133(Class576 var1, int var2) {
      this.field566 = var1;// 63
      this.field567 = var2;// 40 541
   }// 550

   // $VF: synthetic method
   @Override
   public Class581 method116() {
      Class133 var2 = this;

      try {
         if (var2.field566.method1912().equals(Class581.field2340)) {// 69
            Class208[] var9 = Class411.method790(var2.field566.method1913()).method341();// 25 464
            if (var2.field567 >= var9.length) {// 31
               throw new Class240("METHOD DOES NOT EXIST!");// 21
            } else {
               Class208 var10 = var9[var2.field567];// 223
               var2.field568 = var10.method369();// 45
               if (!var10.method261() && !var10.method246()) {// 248
                  try {
                     var2.field569 = new Class251(var10.method369().method207());// 336
                  } catch (RuntimeException var7) {// 291
                     return new Class581(2, "Bad bytecode in the code array of the Code attribute of method '" + var10 + "'.");// 57
                  }

                  var2.field569.method260(true);// 299
                  Class581 var3 = Class581.field2340;// 50

                  try {
                     var2.method19();// 135
                  } catch (Class235 var6) {// 443
                     return new Class581(2, var6.getMessage());// 166 434
                  }

                  Class133 var10000 = var2;

                  try {
                     var10000.method122();// 72
                     var2.method115();// 268
                     return var3;
                  } catch (Class230 var4) {// 66
                     return new Class581(2, var4.getMessage());// 213 536
                  } catch (ClassCastException var5) {// 218
                     return new Class581(2, "Class Cast Exception: " + var5.getMessage());// 15 109
                  }
               } else {
                  return Class581.field2340;// 97
               }
            }
         } else {
            return Class581.field2335;// 270
         }
      } catch (ClassNotFoundException var8) {// 177
         throw new Class242("Missing class: " + var8.toString());// 235
      }
   }

   // $VF: synthetic method
   public void method122() {
      if (this.field568.method207().length >= 65536) {// 183
         throw new Class232("Code array in code attribute '" + this.field568 + "' too big: must be smaller than 65536 bytes.");// 205
      } else {
         Class246 var1;
         for (Class246 var10000 = var1 = this.field569.method32(); var10000 != null; var10000 = var1 = var1.method32()) {// 4 130 301
            Class10 var3;
            if ((var3 = var1.method18()) instanceof Class11) {// 363 602
               throw new Class232("IMPDEP1 must not be in the code, it is an illegal instruction for _internal_ JVM use!");// 509
            }

            if (var3 instanceof Class322) {// 233
               throw new Class232("IMPDEP2 must not be in the code, it is an illegal instruction for _internal_ JVM use!");// 271
            }

            if (var3 instanceof Class324) {// 357
               throw new Class232("BREAKPOINT must not be in the code, it is an illegal instruction for _internal_ JVM use!");// 47
            }
         }

         Class10 var4;
         if (!((var4 = this.field569.method37().method18()) instanceof Class12)// 13 333
            && !(var4 instanceof Class279)
            && !(var4 instanceof Class89)
            && !(var4 instanceof Class87)) {
            throw new Class232(
               "Execution must not fall off the bottom of the code array. This constraint is enforced statically as some existing verifiers do - so it may be a false alarm if the last instruction is not reachable."// 508
            );
         }
      }
   }// 214

   // $VF: synthetic method
   public void method19() {
      Class133 var1 = this;
      int[] var6 = this.field569.method41();// 444
      int var8 = this.field568.method207().length;// 601
      Class163 var5;
      if ((var5 = this.field568.method203()) != null) {// 245 300
         Class210[] var4 = var5.method197();// 296
         Class498 var3 = new Class498();// 404

         label89:
         for (int var10000 = var10 = 0; var10000 < var4.length; var10000 = ++var10) {// 417
            int var7;
            for (int var22 = var7 = 0; var22 < var6.length; var22 = ++var7) {// 81
               int var2 = var4[var10].method2();// 394
               if (var6[var7] == var2) {// 556
                  if (var3.method1335(var2)) {// 316
                     var1.method131(
                        "LineNumberTable attribute '"// 207
                           + var1.field568.method203()
                           + "' refers to the same code offset ('"
                           + var2
                           + "') more than once which is violating the semantics [but is sometimes produced by IBM's 'jikes' compiler]."
                     );
                  } else {
                     var3.method1336(var2);// 355
                  }
                  continue label89;
               }
            }

            throw new Class235(
               "Code attribute '"// 382
                  + var1.field568
                  + "' has a LineNumberTable attribute '"
                  + var1.field568.method203()
                  + "' referring to a code offset ('"
                  + var4[var10].method2()
                  + "') that does not exist."
            );
         }
      }

      Class151[] var17 = var1.field568.method200();// 282

      int var15;
      for (int var23 = var15 = 0; var23 < var17.length; var23 = ++var15) {// 503
         Class160 var11;
         if (var17[var15] instanceof Class160 && (var11 = (Class160)var17[var15]) != null) {// 308 339 596
            Class124[] var20 = var11.method191();// 549

            int var13;
            for (int var24 = var13 = 0; var24 < var20.length; var24 = ++var13) {// 499
               int var18 = var20[var13].method84();// 76
               int var9 = var20[var13].method17();// 145
               if (!method135(var6, var18)) {// 573
                  throw new Class235(
                     "Code attribute '"// 520
                        + var1.field568
                        + "' has a LocalVariableTable attribute '"
                        + var1.field568.method204()
                        + "' referring to a code offset ('"
                        + var18
                        + "') that does not exist."
                  );
               }

               if (!method135(var6, var18 + var9) && var18 + var9 != var8) {// 188
                  throw new Class235(
                     "Code attribute '"// 172
                        + var1.field568
                        + "' has a LocalVariableTable attribute '"
                        + var1.field568.method204()
                        + "' referring to a code offset start_pc+length ('"
                        + (var18 + var9)
                        + "') that does not exist."
                  );
               }
            }
         }
      }

      Class122[] var16 = var1.field568.method201();// 212

      for (int var25 = var12 = 0; var25 < var16.length; var25 = ++var12) {// 365
         int var21 = var16[var12].method17();// 366
         int var14 = var16[var12].method2();// 263
         int var19 = var16[var12].method30();// 225
         if (var21 >= var14) {// 532
            throw new Class235(
               "Code attribute '"// 297
                  + var1.field568
                  + "' has an exception_table entry '"
                  + var16[var12]
                  + "' that has its start_pc ('"
                  + var21
                  + "') not smaller than its end_pc ('"
                  + var14
                  + "')."
            );
         }

         if (!method135(var6, var21)) {// 11
            throw new Class235(
               "Code attribute '"// 356
                  + var1.field568
                  + "' has an exception_table entry '"
                  + var16[var12]
                  + "' that has a non-existant bytecode offset as its start_pc ('"
                  + var21
                  + "')."
            );
         }

         if (!method135(var6, var14) && var14 != var8) {// 41
            throw new Class235(
               "Code attribute '"// 551
                  + var1.field568
                  + "' has an exception_table entry '"
                  + var16[var12]
                  + "' that has a non-existant bytecode offset as its end_pc ('"
                  + var21
                  + "') [that is also not equal to code_length ('"
                  + var8
                  + "')]."
            );
         }

         if (!method135(var6, var19)) {// 360
            throw new Class235(
               "Code attribute '"// 312
                  + var1.field568
                  + "' has an exception_table entry '"
                  + var16[var12]
                  + "' that has a non-existant bytecode offset as its handler_pc ('"
                  + var19
                  + "')."
            );
         }
      }
   }// 558

   // $VF: synthetic method
   public static Class576 method134(Class133 var0) {
      return var0.field566;// 463
   }

   // $VF: synthetic method
   public int method2() {
      return this.field567;// 572
   }

   // $VF: synthetic method
   public static boolean method135(int[] var0, int var1) {
      int[] var2 = var0;

      for (int var10000 = var3 = 0; var10000 < var2.length; var10000 = ++var3) {// 19
         if (var2[var3] == var1) {// 86
            return true;// 473
         }
      }

      return false;// 289
   }
}
