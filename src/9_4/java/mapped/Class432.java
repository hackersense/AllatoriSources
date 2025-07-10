package mapped;

// $VF: Compiled from lr
public class Class432 implements Class418 {
   // $VF: synthetic field
   public Class338 field1283;

   // $VF: synthetic method
   @Override
   public void method839(Class206 var1) {
      Class206 var10 = var1;
      Class432 var11 = this;
      if (Class580.method1932().method1873(this.field1283, var1)) {// 34
         this.method862(var1, null, null);// 332

         Class208[] var4;
         int var6;
         for (int var32 = var6 = (var4 = var1.method341()).length - 1; var32 >= 0; var32 = --var6) {// 30 143
            Class208 var2;
            int var3;
            Class151[] var5;
            if ((var5 = (var2 = var4[var6]).method200()) != null) {// 20 204 252
               for (int var33 = var3 = var5.length - 1; var33 >= 0; var33 = --var3) {// 239
                  if (var5[var3] instanceof Class173) {// 310
                     Class203 var7 = Class376.method716(var2, var10.method93(), var10.method46(), var10.method46().method402());// 498
                     var11.method862(null, var7, null);// 484
                     var10.method360(var2, var7.method315());// 409
                  }
               }
            }
         }

         for (int var34 = var6 = (var18 = var10.method346()).length - 1; var34 >= 0; var34 = --var6) {// 147 491
            Class207 var12;
            int var15;
            Class151[] var21;
            if ((var21 = (var12 = var18[var6]).method200()) != null) {// 273 295 338
               for (int var35 = var15 = var21.length - 1; var35 >= 0; var35 = --var15) {// 161
                  if (var21[var15] instanceof Class173) {// 141
                     Class204 var27 = new Class204(var12, var10.method46());// 580
                     var11.method862(null, null, var27);// 226
                     var10.method362(var12, var27.method324());// 123
                  }
               }
            }
         }
      }

      if (Class580.method1932().method1860(var11.field1283, var10)) {// 46
         var11.method840(var10);// 170
      }

      Class208[] var19;
      int var25;
      for (int var36 = var25 = (var19 = var10.method341()).length - 1; var36 >= 0; var36 = --var25) {// 190 315
         Class208 var13 = var19[var25];// 465
         int var16;
         Class151[] var22;
         if (Class580.method1932().method1859(var11.field1283, var10, var13) && (var22 = var13.method200()) != null) {// 132 184 534
            for (int var37 = var16 = var22.length - 1; var37 >= 0; var37 = --var16) {// 488
               if (var22[var16] instanceof Class157) {// 495
                  Class203 var28 = Class376.method716(var13, var10.method93(), var10.method46(), var10.method46().method402());// 159
                  var28.method280();// 493
                  var10.method360(var13, var28.method315());// 561
                  break;// 377
               }
            }
         }
      }

      for (int var38 = var25 = (var19 = var10.method341()).length - 1; var38 >= 0; var38 = --var25) {// 272 321
         Class208 var14 = var19[var25];// 179
         int var23;
         var38 = var23 = Class580.method1923().method1658().method1549(var11.field1283, var10, var14);// 146
         Class580.method1923().method1658();// 567
         if (var38 != 3) {
            Class580.method1923().method1658();
            Class151[] var17;
            if (var23 != 5 && (var17 = var14.method200()) != null) {// 33 400
               boolean var29 = false;// 0
               int var8;
               var38 = var8 = var17.length - 1;

               while (true) {
                  if (var38 < 0) {
                     var41 = var29;// 467
                     break;
                  }

                  if (var17[var8] instanceof Class167) {// 246
                     var41 = var29 = true;// 552
                     break;// 603
                  }

                  var38 = --var8;// 240
               }

               if (!var41) {
                  for (int var42 = var8 = var17.length - 1; var42 >= 0; var42 = --var8) {// 68
                     if (var17[var8] instanceof Class171) {// 59
                        Class203 var9 = Class376.method716(var14, var10.method93(), var10.method46(), var10.method46().method402());// 391
                        var9.method265(var17[var8]);// 330
                        var10.method360(var14, var9.method315());// 589
                        break;// 579
                     }
                  }
               }
            }
         }
      }
   }// 87

   // $VF: synthetic method
   public void method840(Class206 var1) {
      Class151[] var4 = null;// 550
      if (var1 != null) {// 510
         var4 = var1.method200();
      }

      if (var4 != null) {// 456
         int var3;
         for (int var10000 = var3 = var4.length - 1; var10000 >= 0; var10000 = --var3) {// 367
            if (var4[var3] instanceof Class162 || var4[var3] instanceof Class170) {// 82
               var1.method262(var4[var3]);// 83
            }
         }
      }
   }// 5

   // $VF: synthetic method
   @Override
   public void method838() {
   }// 232

   // $VF: synthetic method
   public void method862(Class206 var1, Class203 var2, Class204 var3) {
      Class151[] var6 = null;// 424
      if (var1 != null && var2 == null && var3 == null) {// 28
         var6 = var1.method200();
      }

      if (var2 != null) {// 588
         var6 = var2.method200();
      }

      if (var3 != null) {// 329
         var6 = var3.method200();
      }

      if (var6 != null) {// 412
         int var5;
         for (int var10000 = var5 = var6.length - 1; var10000 >= 0; var10000 = --var5) {// 38
            if (var6[var5] instanceof Class173) {// 257
               if (var2 != null) {// 269
                  var2.method265(var6[var5]);// 455
               } else if (var3 != null) {// 148
                  var3.method265(var6[var5]);// 236
               } else {
                  var1.method262(var6[var5]);// 39
               }
            }
         }
      }
   }// 40

   // $VF: synthetic method
   public Class432(Class338 var1) {
      this.field1283 = var1;// 7 10
   }// 335
}
