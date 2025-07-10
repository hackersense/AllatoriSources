package mapped;

import java.util.Vector;

// $VF: Compiled from ux
public class Class454 {
   // $VF: synthetic field
   public Vector field1376;
   // $VF: synthetic field
   public final Class543 field1377;
   // $VF: synthetic field
   public Class601 field1378;

   // $VF: synthetic method
   public Class454(Class543 var1, Class394 var2) {
      this(var1);// 234
   }

   // $VF: synthetic method
   public boolean method961(Class338 var1, Class206 var2, Class208 var3) {
      return var3.method190().startsWith("Allatori") || this.method963(var1, var2);// 562
   }

   // $VF: synthetic method
   public void method962(Class549 var1) {
      this.field1378.method2085(var1);// 546
   }// 341

   // $VF: synthetic method
   public boolean method963(Class338 var1, Class206 var2) {
      return var1.method563().contains(var2);// 383
   }

   // $VF: synthetic method
   public Class454(Class543 var1) {
      Class454 var4 = this;
      this.field1377 = var1;// 524
      super();
      this.field1376 = new Vector();// 508

      try {
         var4.field1378 = new Class601("class *", true, false);// 585
         Class601 var10002 = new Class601("class * extends java.lang.Enum", true, false);// 514
         var10002.method2089(new Class564("values(**)", false));// 453
         var10002.method2089(new Class564("valueOf(**)", false));// 354
         var4.method969(var10002);// 224
         var4.method969(new Class601("interface *.package-info", false, false));// 71 174
      } catch (Class225 var2) {// 191
         var2.printStackTrace();// 441
      }
   }// 547 575

   // $VF: synthetic method
   public boolean method964(Class338 var1, Class206 var2, Class208 var3) {
      Class454 var6 = this;
      if (this.method961(var1, var2, var3)) {// 3
         return true;
      } else if (Class543.method1664(this.field1377)) {// 543
         return false;
      } else {
         Class128[] var4 = var3.method137();// 175

         int var5;
         for (int var10000 = var5 = 0; var10000 < var4.length; var10000 = ++var5) {// 276
            Class128 var7 = var4[var5];// 167
            if ("Lcom/allatori/annotations/Rename;".equals(var7.method20())) {// 414
               return true;// 12
            }

            if ("Lcom/allatori/annotations/DoNotRename;".equals(var7.method20())) {// 559
               return false;// 452
            }
         }

         for (int var10 = var5 = 0; var10 < var6.field1376.size(); var10 = ++var5) {// 388
            Class601 var8;
            if ((var8 = (Class601)var6.field1376.get(var5)).method2092() && var8.method2094(var1, var2) && var8.method2087(var3)) {// 120 479 487
               return false;// 347
            }

            if (var8.method2088() && var8.method2094(var1, var2)) {// 298
               return true;
            }
         }

         return !var6.field1378.method2092() || !var6.field1378.method2087(var3);// 439 529
      }
   }

   // $VF: synthetic method
   public boolean method965(Class338 var1, Class206 var2, Class207 var3) {
      return this.method963(var1, var2);// 565
   }

   // $VF: synthetic method
   public boolean method966(Class338 var1, Class206 var2, Class207 var3) {
      Class454 var6 = this;
      if (this.method965(var1, var2, var3)) {// 100
         return true;
      } else if (Class543.method1664(this.field1377)) {// 202
         return false;
      } else {
         Class128[] var4 = var3.method137();// 128

         int var5;
         for (int var10000 = var5 = 0; var10000 < var4.length; var10000 = ++var5) {// 290
            Class128 var7 = var4[var5];// 199
            if ("Lcom/allatori/annotations/Rename;".equals(var7.method20())) {// 512
               return true;// 538
            }

            if ("Lcom/allatori/annotations/DoNotRename;".equals(var7.method20())) {// 124
               return false;// 568
            }
         }

         for (int var10 = var5 = 0; var10 < var6.field1376.size(); var10 = ++var5) {// 85
            Class601 var8;
            if ((var8 = (Class601)var6.field1376.get(var5)).method2091() && var8.method2094(var1, var2) && var8.method2083(var1, var3)) {// 16 121 480
               return false;// 518
            }

            if (var8.method2088() && var8.method2094(var1, var2)) {// 472
               return true;
            }
         }

         return !var6.field1378.method2091() || !var6.field1378.method2083(var1, var3);// 380 387
      }
   }

   // $VF: synthetic method
   public void method967(Class564 var1) {
      this.field1378.method2089(var1);// 325
   }// 392

   // $VF: synthetic method
   public boolean method968(Class338 var1, Class206 var2) {
      Class454 var3 = this;
      if (this.method963(var1, var2)) {// 476
         return true;
      } else if (Class543.method1664(this.field1377)) {// 542
         return false;
      } else {
         Class533[] var5 = var2.method264();// 420

         int var4;
         for (int var10000 = var4 = 0; var10000 < var5.length; var10000 = ++var4) {// 454
            Class533 var8 = var5[var4];// 343
            if ("Lcom/allatori/annotations/Rename;".equals(var8.method1589())) {// 62
               return true;// 126
            }

            if ("Lcom/allatori/annotations/DoNotRename;".equals(var8.method1589())) {// 492
               return false;// 482
            }
         }

         for (int var15 = var4 = 0; var15 < var3.field1376.size(); var15 = ++var4) {// 421
            Class601 var9;
            if ((!(var9 = (Class601)var3.field1376.get(var4)).method2086() || var9.method2088()) && var9.method2094(var1, var2)) {// 19 86 583
               if (var9.method2088()) {// 473
                  return true;
               }

               if (!var9.method2090()) {// 131
                  return false;
               }

               int var6;
               for (int var16 = var6 = (var11 = var2.method346()).length - 1; var16 >= 0; var16 = --var6) {// 264 289
                  Class207 var7 = var11[var6];// 323
                  if (!Class580.method1923().method1662().method966(var1, var2, var7)) {// 458
                     return false;
                  }
               }

               int var14;
               for (int var17 = var14 = (var13 = var2.method341()).length - 1; var17 >= 0; var17 = --var14) {// 60 572
                  Class208 var12 = var13[var14];// 348
                  if (!Class580.method1923().method1662().method964(var1, var2, var12)) {// 150
                     return false;
                  }
               }
            }
         }

         return true;// 427
      }
   }

   // $VF: synthetic method
   public void method969(Class601 var1) {
      this.field1376.add(var1);// 29
   }// 328
}
