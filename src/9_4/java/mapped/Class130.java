package mapped;

import java.util.HashMap;
import java.util.HashSet;

// $VF: Compiled from tc
public final class Class130 extends Class131 implements Class125 {
   // $VF: synthetic field
   public Class485[] field559;
   // $VF: synthetic field
   public Class576 field560;

   // $VF: synthetic method
   public void method107() {
      Class130 var1 = this;

      try {
         Class205 var3 = Class411.method790(var1.field560.method1913());// 1365
         new Class464(var3, new Class459(var1, var3, null)).method1040();// 1282 1392
      } catch (ClassNotFoundException var2) {// 1527
         throw new Class242("Missing class: " + var2.toString());// 1513
      }
   }// 1064

   // $VF: synthetic method
   public static boolean method108(String var0, boolean var1) {
      if (method109(var0)) {// 1086
         return true;// 1090
      } else {
         return var1 ? var0.equals("<init>") || var0.equals("<clinit>") : var0.equals("<init>");// 1300 1340 1587
      }
   }

   // $VF: synthetic method
   public static boolean method109(String var0) {
      String var1 = var0;
      if (!Character.isJavaIdentifierStart(var0.charAt(0))) {// 1271
         return false;// 1647
      } else {
         for (int var10000 = var2 = 1; var10000 < var1.length(); var10000 = ++var2) {// 1029
            if (!Character.isJavaIdentifierPart(var1.charAt(var2))) {// 1458
               return false;// 1107
            }
         }

         return true;// 1153
      }
   }

   // $VF: synthetic method
   public Class485 method110(int var1) {
      if (this.method129() != Class581.field2340) {// 412
         return null;// 38
      } else if (var1 >= 0 && var1 < this.field559.length) {// 269
         return this.field559[var1];// 236
      } else {
         throw new Class242("Method number out of range.");// 455
      }
   }

   // $VF: synthetic method
   public static boolean method111(String var0) {
      return var0.startsWith("<") ? false : method109(var0);// 1049 1143 1597
   }

   // $VF: synthetic method
   public static boolean method112(String var0) {
      return method114(var0);
   }

   // $VF: synthetic method
   public static boolean method113(String var0) {
      return method119(var0);
   }

   // $VF: synthetic method
   public static boolean method114(String var0) {
      return method120(var0);// 1358
   }

   // $VF: synthetic method
   public void method115() {
      Class130 var1 = this;

      try {
         Class205 var3 = Class411.method790(var1.field560.method1913());// 356
         new Class462(var1, var3, null);// 522
      } catch (ClassNotFoundException var2) {// 551
         throw new Class242("Missing class: " + var2.toString());// 360
      }
   }// 312

   // $VF: synthetic method
   @Override
   public Class581 method116() {
      Class130 var2 = this;

      try {
         if (var2.field560.method1910().equals(Class581.field2340)) {// 94 242
            var2.field559 = new Class485[Class411.method790(var2.field560.method1913()).method341().length];// 422
            Class581 var6 = Class581.field2340;// 25

            try {
               var2.method115();// 21
               var2.method107();// 115
               var2.method122();// 223
               var2.method19();// 45
               return var6;// 97
            } catch (Class235 var4) {// 440
               return new Class581(2, var4.getMessage());// 248 411
            }
         } else {
            return Class581.field2335;// 138
         }
      } catch (ClassNotFoundException var5) {// 32
         throw new Class242("Missing class: " + var5.toString());// 423
      }
   }

   // $VF: synthetic method
   public static Class485[] method117(Class130 var0) {
      return var0.field559;
   }

   // $VF: synthetic method
   public Class130(Class576 var1) {
      this.field560 = var1;// 73 415
   }// 398

   // $VF: synthetic method
   public static String method118(Class123 var0) {
      return method121(var0);
   }

   // $VF: synthetic method
   public static final boolean method119(String var0) {
      return true;// 1214
   }

   // $VF: synthetic method
   public static boolean method120(String var0) {
      String var1 = var0;
      if (var0.length() == 0) {// 1649
         return false;// 1502
      } else if (!Character.isJavaIdentifierStart(var0.charAt(0))) {// 1036
         return false;// 1641
      } else {
         for (int var10000 = var2 = 1; var10000 < var1.length(); var10000 = ++var2) {// 1141
            if (!Character.isJavaIdentifierPart(var1.charAt(var2))) {// 992
               return false;// 1342
            }
         }

         return true;// 1290
      }
   }

   // $VF: synthetic method
   public static String method121(Class123 var0) {
      return new Class465(var0).toString();// 1661
   }

   // $VF: synthetic method
   public void method122() {
      Class130 var2 = this;

      try {
         HashSet var4 = new HashSet();// 166
         Class205 var6 = Class411.method790(var2.field560.method1913());// 434
         int var3 = -1;// 292

         while (var3 != 0) {// 72
            if ((var3 = var6.method199()) == 0) {// 66 268
               if (var6 != Class411.method790(Class138.field583.method93())) {// 536
                  throw new Class235("Superclass of '" + var6.method93() + "' missing but not " + Class138.field583.method93() + " itself!");// 307
               }
            } else {
               String var1 = var6.method20();// 15
               if (!var4.add(var1)) {// 385
                  throw new Class235("Circular superclass hierarchy detected.");// 471
               }

               if (Class545.method1689(var1).method1910() != Class581.field2340) {// 177 235 582
                  throw new Class235("Could not load in ancestor class '" + var1 + "'.");// 280
               }

               if ((var6 = Class411.method790(var1)).method242()) {// 227 516
                  throw new Class235("Ancestor class '" + var1 + "' has the FINAL access modifier and must therefore not be subclassed.");// 55
               }
            }
         }
      } catch (ClassNotFoundException var5) {// 107
         throw new Class242("Missing class: " + var5.toString());// 110
      }
   }// 444

   // $VF: synthetic method
   public static boolean method123(String var0) {
      return method111(var0);
   }

   // $VF: synthetic method
   public static boolean method124(String var0) {
      return method108(var0, false);// 1231
   }

   // $VF: synthetic method
   public static boolean method125(String var0, boolean var1) {
      return method108(var0, var1);
   }

   // $VF: synthetic method
   public void method19() {
      Class130 var5 = this;

      try {
         HashMap var1 = new HashMap();// 316
         Class205 var2 = Class411.method790(var5.field560.method1913());// 207

         for (int var6 = -1; var6 != 0; var2 = Class411.method790(var2.method20())) {// 127 355 564
            var6 = var2.method199();// 496
            Class208[] var4 = var2.method341();// 215

            for (int var10000 = var8 = 0; var10000 < var4.length; var10000 = ++var8) {// 511
               String var3 = new StringBuilder().insert(0, var4[var8].method190()).append(var4[var8].method20()).toString();// 382
               if (var1.containsKey(var3)) {// 576
                  if (var4[var8].method242()) {// 103
                     if (!var4[var8].method163()) {// 548
                        throw new Class235(
                           "Method '"// 545
                              + var3
                              + "' in class '"
                              + var1.get(var3)
                              + "' overrides the final (not-overridable) definition in class '"
                              + var2.method93()
                              + "'."
                        );
                     }

                     var5.method131(// 162
                        "Method '"
                           + var3
                           + "' in class '"
                           + var1.get(var3)
                           + "' overrides the final (not-overridable) definition in class '"
                           + var2.method93()
                           + "'. This is okay, as the original definition was private; however this constraint leverage was introduced by JLS 8.4.6 (not vmspec2) and the behaviour of the Sun verifiers."
                     );
                  } else if (!var4[var8].method254()) {// 308
                     var1.put(var3, var2.method93());// 596
                  }
               } else if (!var4[var8].method254()) {// 390
                  var1.put(var3, var2.method93());// 573
               }
            }
         }
      } catch (ClassNotFoundException var7) {// 438
         throw new Class242("Missing class: " + var7.toString());// 483
      }
   }// 125

   // $VF: synthetic method
   public static boolean method126(String var0) {
      return method124(var0);
   }

   // $VF: synthetic method
   public static boolean method127(String var0) {
      return method120(var0);
   }

   // $VF: synthetic method
   public static Class576 method128(Class130 var0) {
      return var0.field560;// 400
   }
}
