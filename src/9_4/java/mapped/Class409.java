package mapped;

// $VF: Compiled from so
public class Class409 {
   // $VF: synthetic method
   public static String method753(String var0) {
      return method761(var0);
   }

   // $VF: synthetic method
   public static void method754(Class196 var0) {
      var0.method256(false);
      var0.method239(false);// 1379
      var0.method258(true);// 995 1426
   }// 988

   // $VF: synthetic method
   public static Class138 method755(Class138 var0, Class499 var1) {
      Object var4 = null;// 1057
      if (var0 instanceof Class144) {// 1599
         Class144 var5;
         String var6 = (var5 = (Class144)var0).method93();// 997 1173
         String var3;
         if ((var3 = var1.method1341(var6)) != null && !var3.equals(var6)) {// 1343 1552
            var4 = new Class144(var3);// 1365
         }
      } else {
         Class145 var11;
         if (var0 instanceof Class145 && (var0 = (var11 = (Class145)var0).method26()) instanceof Class144) {// 1282 1362 1392 1527
            Class144 var10;
            String var8 = (var10 = (Class144)var0).method93();// 1280 1513
            String var9;
            if ((var9 = var1.method1341(var8)) != null && !var9.equals(var8)) {// 1064 1541
               var4 = new Class145(var9, var11.method17());// 1470
            }
         }
      }

      return (Class138)var4;// 1154
   }

   // $VF: synthetic method
   public static boolean method756(Class196 var0) {
      return method760(var0);
   }

   // $VF: synthetic method
   public static String method757(String var0) {
      return !Class580.method1923().method1671() && !Class580.method1923().method1650() ? var0 : var0.substring(0, var0.lastIndexOf(41));// 1152 1198 1457
   }

   // $VF: synthetic method
   public static String method758(String var0) {
      return method757(var0);
   }

   // $VF: synthetic method
   public static Class138 method759(Class138 var0, Class499 var1) {
      return method755(var0, var1);
   }

   // $VF: synthetic method
   public static boolean method760(Class196 var0) {
      return !var0.method252() && !var0.method249() && !var0.method163();// 1467
   }

   // $VF: synthetic method
   public static String method761(String var0) {
      int var2;
      return (var2 = var0.lastIndexOf(46)) == -1 ? "" : var0.substring(0, var2);// 1545 1563 1645
   }

   // $VF: synthetic method
   public static void method762(Class196 var0) {
      method754(var0);// 1265
   }
}
