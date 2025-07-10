package mapped;

import smardecSB.aconst_null;
import smardecSB.bipush;
import smardecSB.dload_x;
import smardecSB.iconst_x;
import smardecSB.lload_x;
import smardecSB.sipush;

// $VF: Compiled from cx
public class Class420 implements Class418 {
   // $VF: synthetic field
   public Class338 field1238;

   // $VF: synthetic method
   @Override
   public void method838() {
   }// 552

   // $VF: synthetic method
   @Override
   public void method839(Class206 var1) {
      Class420 var2 = this;

      try {
         Class208[] var12 = var1.method341();// 557
         int var4 = var12.length;

         for (int var5 = 0; var5 < var4; var5++) {// 34
            Class208 var6;
            if ((var6 = var12[var5]).method369() != null) {// 332
               Class203 var7 = Class376.method716(var6, var1.method93(), var1.method46(), var1.method46().method402());// 260
               if (Class580.method1932().method1876(var2.field1238, var1, var7)) {// 30
                  int var8;
                  int var10000 = var8 = Class580.method1922().method1917(var2.field1238, var1, var7);// 143
                  Class580.method1922();// 252
                  if (var10000 != 0) {
                     Class251 var9;
                     Class246 var14 = (var9 = var7.method42()).method32();// 20 204
                     boolean var11 = false;// 239
                     Class246 var16 = var14;// 310

                     while (var16 != null) {
                        if (!(var14.method18() instanceof Class294) && !(var14.method18() instanceof Class26)) {// 498
                           label121: {
                              label120:
                              if (var14.method18() instanceof Class28) {// 151
                                 if (var11) {
                                    Class580.method1922();
                                    if (var8 != 2) {
                                       break label120;
                                    }
                                 }

                                 if (var14.method37() == null) {// 491
                                    var17 = var14;
                                    break label121;
                                 }

                                 if (!var2.method843(var14.method431())) {// 147
                                    var17 = var14;
                                    break label121;
                                 }

                                 if (!var2.method843(var14.method37().method431())) {// 295
                                    var17 = var14;
                                    break label121;
                                 }

                                 if (!(var14.method37().method18() instanceof iconst_x) && !(var14.method37().method18() instanceof aconst_null)) {// 338
                                    var17 = var14;
                                    break label121;// 273
                                 }

                                 Class10 var3 = var14.method37().method18();// 161
                                 var9.method480(var9.method480(var9.method480(var14, var3), Class119.field113), Class119.field107);// 141 226 580
                                 var11 = true;// 123
                              }

                              var17 = var14;// 533
                           }

                           label104: {
                              label103:
                              if (var17.method18() instanceof Class28) {
                                 if (var11) {
                                    Class580.method1922();
                                    if (var8 != 2) {
                                       break label103;
                                    }
                                 }

                                 if (var14.method37() == null) {// 406
                                    var10000 = var8;
                                    break label104;
                                 }

                                 if (!var2.method843(var14.method431())) {// 1
                                    var10000 = var8;
                                    break label104;
                                 }

                                 if (!var2.method843(var14.method37().method431())) {// 46
                                    var10000 = var8;
                                    break label104;
                                 }

                                 if (!(var14.method37().method18() instanceof Class280)) {// 170
                                    var10000 = var8;
                                    break label104;
                                 }

                                 Class280 var15;
                                 if (!((var15 = (Class280)var14.method37().method18()) instanceof lload_x)) {// 190 553
                                    if (var15 instanceof dload_x) {
                                       var10000 = var8;
                                       break label104;
                                    }

                                    var9.method480(var9.method480(var9.method480(var14, var15.method18()), Class119.field113), Class119.field107);// 132 315 465
                                    var11 = true;// 184
                                 }
                              }

                              var10000 = var8;// 495
                           }

                           Class580.method1922();
                           if (var10000 != 2
                              || !(var14.method18() instanceof bipush) && !(var14.method18() instanceof sipush) && !(var14.method18() instanceof iconst_x)) {// 159
                              var16 = var14 = var14.method32();// 192
                           } else {
                              var9.method480(var9.method480(var9.method448(var14, new Class116(var1.method46(), 1)), Class119.field113), Class119.field107);// 22 377 604
                              var14 = var14.method32().method32().method32().method32();// 6
                              var16 = var14;
                           }
                        } else {
                           var9.method480(var9.method480(var9.method448(var14, new Class116(var1.method46(), 1)), Class119.field113), Class119.field107);// 389 409 484
                           var14 = var14.method32().method32().method32().method32();// 18
                           var16 = var14;
                        }
                     }

                     var7.method309();// 272
                     var7.method276();// 321
                     var1.method360(var6, var7.method315());// 179
                  }
               }
            }
         }
      } catch (Exception var13) {// 567
         var13.printStackTrace();// 400
      }
   }// 0

   // $VF: synthetic method
   public boolean method843(Class200[] var1) {
      if (var1 == null) {// 466
         return true;
      } else {
         for (int var10000 = var4 = 0; var10000 < var1.length; var10000 = ++var4) {// 467
            Class200 var3;
            if (!((var3 = var1[var4]) instanceof Class201) && !(var3 instanceof Class199)) {// 68 485
               return false;// 59
            }
         }

         return true;// 330
      }
   }

   // $VF: synthetic method
   public Class420(Class338 var1) {
      this.field1238 = var1;// 26 52
   }// 10
}
