package mapped;

// $VF: Compiled from za
public final class Class573 {
   // $VF: synthetic field
   public static final int field2295 = 0;
   // $VF: synthetic field
   public final int field2296;
   // $VF: synthetic field
   public static final int field2297 = 2;
   // $VF: synthetic field
   public static final int field2298 = 1;
   // $VF: synthetic field
   public static final int field2299 = 3;
   // $VF: synthetic field
   public final byte[] field2300;

   // $VF: synthetic method
   public int method1899(int var1) {
      return this.field2300[this.field2296 + 2 * var1 + 1];// 68
   }

   // $VF: synthetic method
   public Class573(byte[] var1, int var2) {
      this.field2300 = var1;// 22
      this.field2296 = var2;// 6 604
   }// 144

   // $VF: synthetic method
   public int method1900(int var1) {
      return this.field2300[this.field2296 + 2 * var1 + 2];// 586
   }

   // $VF: synthetic method
   public static void method1901(Class573 var0, Class529 var1) {
      if (var0 == null) {// 434
         var1.method1568(0);// 292
      } else {
         int var3 = var0.field2300[var0.field2296] * 2 + 1;// 72
         var1.method1573(var0.field2300, var0.field2296, var3);// 268
      }
   }// 66

   // $VF: synthetic method
   public static Class573 method1902(String var0) {
      String var1 = var0;
      if (var0 != null && var0.length() != 0) {// 269
         int var4 = var0.length();// 236
         Class529 var2;
         (var2 = new Class529(var4)).method1568(0);// 39 142
         int var3 = 0;// 368

         while (var3 < var4) {// 99
            char var6;
            int var10000 = var6 = var1.charAt(var3);// 160
            var3++;
            if (var10000 == 91) {// 40
               var2.method1569(0, 0);// 63
            } else if (var6 != '.') {// 541
               if (var6 != '*') {// 510
                  if (var6 < '0' || var6 > '9') {// 367
                     throw new IllegalArgumentException();// 27
                  }

                  int var5 = var6 - '0';// 82
                  var10000 = var3;// 83

                  while (true) {
                     Class529 var10;
                     if (var10000 < var4) {
                        char var7;
                        char var9 = var7 = var1.charAt(var3);// 5
                        var3++;
                        if (var9 >= '0' && var7 <= '9') {// 279
                           var5 = var5 * 10 + var7 - 48;// 450
                           var10000 = var3;
                           continue;
                        }

                        if (var7 != ';') {// 386
                           throw new IllegalArgumentException();// 157
                        }

                        var10 = var2;
                     } else {
                        var10 = var2;// 600
                     }

                     var10.method1569(3, var5);
                     break;// 108
                  }
               } else {
                  var2.method1569(2, 0);// 456
               }
            } else {
               var2.method1569(1, 0);// 550
            }
         }

         var2.field1787[0] = (byte)(var2.field1786 / 2);// 209
         return new Class573(var2.field1787, 0);// 69
      } else {
         return null;// 455
      }
   }

   // $VF: synthetic method
   public int method1903() {
      return this.field2300[this.field2296];// 567
   }
}
