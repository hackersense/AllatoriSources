package mapped;

import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

// $VF: Compiled from rp
public class Class337 {
   // $VF: synthetic field
   public static Class212 field941;
   // $VF: synthetic field
   public static boolean field942 = false;

   // $VF: synthetic method
   public static void method546(List var0, int var1, int var2) {
      var0.set(var1, var0.set(var2, var0.get(var1)));// 185
   }// 406

   // $VF: synthetic method
   public static double method547() {
      if (!field942) {// 52
         method551();// 10
      }

      return field941.method226();// 7
   }

   // $VF: synthetic method
   public static void method548(Object[] var0, int var1, int var2) {
      Object var4 = var0[var1];// 170
      var0[var1] = var0[var2];// 553
      var0[var2] = var4;// 58
   }// 190

   // $VF: synthetic method
   public static int method549(int var0) {
      if (!field942) {// 34
         method551();// 332
      }

      int var2;
      return (var2 = field941.method34(0, var0)) < var0 ? var2 : var2 - 1;// 20 252
   }

   // $VF: synthetic method
   public static void method550(List var0) {
      List var1 = var0;
      if (!field942) {// 498
         method551();// 484
      }

      int var2;
      int var4;
      if ((var4 = var0.size()) >= 5 && !(var0 instanceof RandomAccess)) {// 18 389
         Object[] var7 = var0.toArray();// 530

         for (int var8 = var5 = var4; var8 > 1; var8 = var5) {// 147
            method548(var7, var5 - 1, method549(var5--));// 295
         }

         ListIterator var6 = var0.listIterator();// 273

         int var3;
         for (int var9 = var3 = 0; var9 < var7.length; var9 = var3) {// 161
            var6.next();// 141
            var6.set(var7[var3++]);// 580
         }
      } else {
         for (int var10000 = var2 = var4; var10000 > 1; var10000 = var2) {// 513
            method546(var1, var2 - 1, method549(var2--));// 93
         }
      }
   }// 78

   // $VF: synthetic method
   public static void method551() {
      String var0;
      if ((var0 = Class580.method1932().method1853()) != null && var0.length() != 0) {// 132 184
         field941 = new Class214(var0.hashCode());// 495
      } else {
         field941 = new Class214(System.currentTimeMillis());// 534
      }

      field942 = true;// 493
   }// 561
}
