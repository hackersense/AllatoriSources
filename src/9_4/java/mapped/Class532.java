package mapped;

// $VF: Compiled from db
public final class Class532 {
   // $VF: synthetic field
   public final Class483 field1789;
   // $VF: synthetic field
   public Class532 field1790;
   // $VF: synthetic field
   public final String field1791;
   // $VF: synthetic field
   public final int field1792;
   // $VF: synthetic field
   public final Class483 field1793;
   // $VF: synthetic field
   public final Class483 field1794;

   // $VF: synthetic method
   public static void method1576(Class532 var0, Class529 var1) {
      var1.method1566(method1579(var0));// 137
      var0 = var0;// 50

      for (Class532 var10000 = var0; var10000 != null; var10000 = var0) {// 253
         var1.method1566(var0.field1794.field1618).method1566(var0.field1793.field1618).method1566(var0.field1789.field1618).method1566(var0.field1792);// 135 166 434 443 474
         var0 = var0.field1790;// 292
      }
   }// 72

   // $VF: synthetic method
   public Class532(Class483 var1, Class483 var2, Class483 var3, int var4, String var5) {
      this.field1794 = var1;// 603
      this.field1793 = var2;// 278
      this.field1789 = var3;// 466
      this.field1792 = var4;// 467
      this.field1791 = var5;// 485 552
   }// 68

   // $VF: synthetic method
   public static int method1577(Class532 var0) {
      return 2 + 8 * method1579(var0);// 525
   }

   // $VF: synthetic method
   public static Class532 method1578(Class532 var0, Class483 var1, Class483 var2) {
      if (var0 == null) {// 269
         return null;// 455
      } else {
         var0.field1790 = method1578(var0.field1790, var1, var2);// 236
         int var6 = var0.field1794.field1618;// 39
         int var4 = var0.field1793.field1618;// 368
         int var5 = var1.field1618;// 99
         int var3 = var2 == null ? 2147483647 : var2.field1618;// 160
         if (var5 >= var4 || var3 <= var6) {// 63
            return var0;// 541
         } else if (var5 <= var6) {// 510
            return var3 >= var4 ? var0.field1790 : new Class532(var0, var2, var0.field1793);// 82 279 456
         } else if (var3 >= var4) {// 386
            return new Class532(var0, var0.field1794, var1);// 149
         } else {
            var0.field1790 = new Class532(var0, var2, var0.field1793);// 600
            return new Class532(var0, var0.field1794, var1);// 108
         }
      }
   }

   // $VF: synthetic method
   public static int method1579(Class532 var0) {
      int var1 = 0;// 21

      for (Class532 var10000 = var0 = var0; var10000 != null; var0 = var0.field1790) {// 23 115 223
         var10000 = var0.field1790;
         var1++;// 45
      }

      return var1;// 248
   }

   // $VF: synthetic method
   public Class532(Class532 var1, Class483 var2, Class483 var3) {
      this(var2, var3, var1.field1789, var1.field1792, var1.field1791);
      this.field1790 = var1.field1790;// 87 428
   }// 586
}
