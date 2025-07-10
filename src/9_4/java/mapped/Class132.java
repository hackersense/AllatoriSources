package mapped;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Random;

// $VF: Compiled from kb
public final class Class132 extends Class131 {
   // $VF: synthetic field
   public Class576 field563;
   // $VF: synthetic field
   public static final boolean field564 = true;
   // $VF: synthetic field
   public int field565;

   // $VF: synthetic method
   public Class132(Class576 var1, int var2) {
      this.field563 = var1;// 38
      this.field565 = var2;// 257 412
   }// 269

   // $VF: synthetic method
   public void method132(Class341 var1, Class571 var2, Class480 var3, Class470 var4, Class472 var5) {
      Class132 var19 = this;
      new Random();
      Class453 var6 = new Class453(null);// 541
      var2.method1894(var3, new ArrayList(), var4, var5);// 510
      var6.method959(var2, new ArrayList());// 367

      while (!var6.method958()) {// 5
         Class571 var17 = var6.method954(0);// 108
         ArrayList var7 = var6.method957(0);// 27
         var6.method960(0);// 242
         ArrayList var8 = (ArrayList)var7.clone();// 69
         ArrayList var9;
         (var9 = (ArrayList)var7.clone()).add(var17);// 116 422
         if (!(var17.method1887().method18() instanceof Class279)) {// 25
            Class571[] var23 = var17.method1898();// 536

            int var27;
            for (int var35 = var27 = 0; var35 < var23.length; var35 = ++var27) {// 307
               Class571 var30;
               if ((var30 = var23[var27]).method1894(var17.method1889(var8), var9, var4, var5)) {// 109 218
                  var6.method959(var30, (ArrayList)var9.clone());// 213
               }
            }
         } else {
            Class279 var10 = (Class279)var17.method1887().method18();// 223
            Class140 var11 = (Class140)var17.method1889(var8).method1269().method867(var10.method2());// 45
            Class571 var12 = var1.method607(var11.method32());// 23
            Class571 var13 = null;// 97
            int var14 = 0;// 411
            int var15;
            int var33 = var15 = var8.size() - 1;

            while (true) {
               if (var33 < 0) {
                  var34 = var13;// 314
                  break;
               }

               if (var14 < 0) {// 138
                  throw new Class242("More RET than JSR in execution chain?!");// 285
               }

               if (((Class571)var8.get(var15)).method1887().method18() instanceof Class108) {// 238
                  if (var14 == 0) {// 423
                     var34 = var13 = (Class571)var8.get(var15);// 61
                     break;// 525
                  }

                  var14--;// 336
               }

               if (((Class571)var8.get(var15)).method1887().method18() instanceof Class279) {// 57
                  var14++;// 169
               }

               var33 = --var15;// 468
            }

            if (var34 == null) {
               throw new Class242("RET without a JSR before in ExecutionChain?! EC: '" + var8 + "'.");// 137
            }

            Class108 var32 = (Class108)var13.method1887().method18();// 253
            if (var12 != var1.method607(var32.method37())) {// 135
               throw new Class242(
                  "RET '" + var17.method1887() + "' info inconsistent: jump back to '" + var12 + "' or '" + var1.method607(var32.method37()) + "'?"// 474
               );
            }

            if (var12.method1894(var17.method1889(var8), var9, var4, var5)) {// 434
               var6.method959(var12, (ArrayList)var9.clone());// 292
            }
         }

         Class594[] var24 = var17.method1895();// 266

         int var28;
         for (int var36 = var28 = 0; var36 < var24.length; var36 = ++var28) {// 235
            Class571 var31;
            if ((var31 = var1.method607(var24[var28].method2037()))// 280
               .method1894(
                  new Class480(
                     var17.method1889(var8).method1269(),// 437
                     new Class484(
                        var17.method1889(var8).method1270().method1306(), var24[var28].method2036() == null ? Class138.field580 : var24[var28].method2036()
                     )
                  ),
                  new ArrayList(),
                  var4,
                  var5
               )) {
               var6.method959(var31, new ArrayList());// 110
            }
         }
      }

      Class246 var18 = var2.method1887();// 486

      do {
         if (var18.method18() instanceof Class12 && !var1.method610(var18)) {// 300
            Class571 var20;
            Class480 var21;
            Class433 var22 = (var21 = (var20 = var1.method607(var18)).method1889(new ArrayList())).method1269();// 245 296 404

            int var25;
            for (int var37 = var25 = 0; var37 < var22.method865(); var37 = ++var25) {// 417
               if (var22.method867(var25) instanceof Class136) {// 81
                  var19.method131(// 401
                     "Warning: ReturnInstruction '" + var20 + "' may leave method with an uninitialized object in the local variables array '" + var22 + "'."
                  );
               }
            }

            Class484 var26 = var21.method1270();// 316

            int var29;
            for (int var38 = var29 = 0; var38 < var26.method1295(); var38 = ++var29) {// 207
               if (var26.method1305(var29) instanceof Class136) {// 275
                  var19.method131(// 127
                     "Warning: ReturnInstruction '" + var20 + "' may leave method with an uninitialized object on the operand stack '" + var26 + "'."
                  );
               }
            }
         }
      } while ((var18 = var18.method32()) != null);// 215
   }// 382

   // $VF: synthetic method
   @Override
   public Class581 method116() {
      Class132 var2 = this;
      if (!this.field563.method1909(this.field565).equals(Class581.field2340)) {// 596
         return Class581.field2335;// 549
      } else {
         Class205 var10;
         try {
            var10 = Class411.method790(var2.field563.method1913());// 502
         } catch (ClassNotFoundException var11) {// 188
            throw new Class242("Missing class: " + var11.toString());// 564
         }

         Class221 var14 = new Class221(var10.method94());// 438
         Class470 var8;
         (var8 = new Class470()).method1243(var14);// 181 483
         Class472 var4 = new Class472();// 125
         var4.method1243(var14);// 413
         Class208[] var5 = var10.method341();// 478

         try {
            Class203 var15 = new Class203(var5[var2.field565], var2.field563.method1913(), var14);// 263
            var8.method1247(var15);// 532
            if (!var15.method261() && !var15.method246()) {// 11
               Class341 var16;
               Class480 var17;
               Class203 var10000;
               label70: {
                  var16 = new Class341(var15);// 522
                  var17 = new Class480(var15.method30(), var15.method84());// 91
                  if (!var15.method254()) {// 360
                     if (var15.method20().equals("<init>")) {// 312
                        Class480.field1564 = new Class136(new Class144(var10.method93()));// 340
                        var10000 = var15;
                        var17.method1269().method869(0, Class480.field1564);// 274
                        break label70;// 558
                     }

                     Class480.field1564 = null;// 337
                     var17.method1269().method869(0, new Class144(var10.method93()));// 208
                  }

                  var10000 = var15;// 133
               }

               Class138[] var3 = var10000.method277();
               int var9 = 0;// 65

               int var1;
               for (int var18 = var1 = 0; var18 < var3.length; var18 = ++var1) {// 504
                  if (var3[var1] == Class138.field581 || var3[var1] == Class138.field594 || var3[var1] == Class138.field585 || var3[var1] == Class138.field584) {// 80
                     var3[var1] = Class138.field591;// 283
                  }

                  var17.method1269().method869(var9 + var1 + (var15.method254() ? 0 : 1), var3[var1]);// 114
                  if (var3[var1].method2() == 2) {// 460
                     var17.method1269().method869(++var9 + var1 + (var15.method254() ? 0 : 1), Class138.field592);// 102 105
                  }
               }

               var2.method132(var16, var16.method607(var15.method42().method32()), var17, var8, var4);// 64
            }
         } catch (Class226 var12) {// 349
            var12.method427("Constraint violated in method '" + var5[this.field565] + "':\n", "");// 196
            return new Class581(2, var12.getMessage());// 164
         } catch (RuntimeException var13) {// 429
            StringWriter var6 = new StringWriter();// 599
            PrintWriter var7 = new PrintWriter(var6);// 318
            var13.printStackTrace(var7);// 88
            throw new Class242(
               "Some RuntimeException occured while verify()ing class '"// 8
                  + var10.method93()
                  + "', method '"
                  + var5[this.field565]
                  + "'. Original RuntimeException's stack trace:\n---\n"
                  + var6
                  + "---\n"
            );
         }

         return Class581.field2340;// 384
      }
   }

   // $VF: synthetic method
   public int method2() {
      return this.field565;// 509
   }
}
