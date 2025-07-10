package mapped;

// $VF: Compiled from yb
public class Class534 {
   // $VF: synthetic field
   public Class529 field1799;
   // $VF: synthetic field
   public Class534 field1800;
   // $VF: synthetic field
   public final String field1801;

   // $VF: synthetic method
   public final void method1593(Class590 var1, Class529 var2) {
      Object var4 = null;// 457
      this.method1604(var1, (byte[])var4, 0, -1, -1, var2);// 51 341 546 598
   }// 325

   // $VF: synthetic method
   public Class534(String var1) {
      this.field1801 = var1;// 184 534
   }// 488

   // $VF: synthetic method
   public static Class534 method1594(Class534 var0, Class508 var1, int var2, int var3, char[] var4, int var5, Class483[] var6) {
      return var0.method1603(var1, var2, var3, var4, var5, var6);// 411
   }

   // $VF: synthetic method
   public static int method1595(Class590 var0, int var1, int var2) {
      byte var4 = 0;// 255
      if ((var1 & 4096) != 0 && var0.method2001() < 49) {// 508 517
         var4 += 6;
         var0.method1991("Synthetic");// 524
      }

      if (var2 != 0) {// 431
         var4 += 8;
         var0.method1991("Signature");// 14
      }

      if ((var1 & 131072) != 0) {// 453
         var4 += 6;
         var0.method1991("Deprecated");// 224
      }

      return var4;// 174
   }

   // $VF: synthetic method
   public Class529 method1596(Class342 var1, byte[] var2, int var3, int var4, int var5) {
      return this.field1799;// 127
   }

   // $VF: synthetic method
   public Class529 method1597(Class342 var1, byte[] var2, int var3, int var4, int var5) {
      if (this.field1799 == null) {// 266
         this.field1799 = this.method1596(var1, var2, var3, var4, var5);// 235
      }

      return this.field1799;// 370
   }

   // $VF: synthetic method
   public static byte[] method1598(Class534 var0, Class342 var1, byte[] var2, int var3, int var4, int var5) {
      Class529 var8;
      Class529 var10 = var8 = var0.method1597(var1, var2, var3, var4, var5);// 172
      byte[] var7 = new byte[var10.field1786];// 564
      System.arraycopy(var10.field1787, 0, var7, 0, var8.field1786);// 48
      return var7;// 281
   }

   // $VF: synthetic method
   public final int method1599(Class590 var1) {
      Object var3 = null;// 558
      return this.method1602(var1, (byte[])var3, 0, -1, -1);// 168 208 337 501
   }

   // $VF: synthetic method
   public final int method1600() {
      int var1 = 0;// 478

      for (Class534 var10000 = this = this; var10000 != null; this = this.field1800) {// 212 263 365
         var10000 = this.field1800;
         var1++;// 366
      }

      return var1;// 532
   }

   // $VF: synthetic method
   public boolean method1601() {
      return true;// 574
   }

   // $VF: synthetic method
   public final int method1602(Class590 var1, byte[] var2, int var3, int var4, int var5) {
      Class342 var6 = var1.field2363;// 8
      int var7 = 0;// 331

      for (Class534 var10000 = this = this; var10000 != null; var10000 = this) {// 130 384
         var1.method1991(this.field1801);// 301
         var7 += 6 + this.method1597(var6, var2, var3, var4, var5).field1786;// 602
         this = this.field1800;// 363
      }

      return var7;// 35
   }

   // $VF: synthetic method
   public Class534 method1603(Class508 var1, int var2, int var3, char[] var4, int var5, Class483[] var6) {
      this = new Class534(this.field1801);// 550
      this.field1799 = new Class529(var1.method1390(var2, var3));// 510
      return this;// 456
   }

   // $VF: synthetic method
   public final void method1604(Class590 var1, byte[] var2, int var3, int var4, int var5, Class529 var6) {
      Class342 var7 = var1.field2363;// 473

      for (Class534 var10000 = this = this; var10000 != null; var10000 = this) {// 131 528
         Class529 var9 = this.method1597(var7, var2, var3, var4, var5);// 264 289
         var6.method1566(var1.method1991(this.field1801)).method1570(var9.field1786);// 458
         var6.method1573(var9.field1787, 0, var9.field1786);// 591
         this = this.field1800;// 572
      }
   }// 348

   // $VF: synthetic method
   public static Class483 method1605(Class508 var0, int var1, Class483[] var2) {
      return var0.method1387(var1, var2);// 299
   }

   // $VF: synthetic method
   @Deprecated
   public Class483[] method1606() {
      return new Class483[0];// 589
   }

   // $VF: synthetic method
   public boolean method1607() {
      return false;// 240
   }

   // $VF: synthetic method
   public static void method1608(Class590 var0, int var1, int var2, Class529 var3) {
      if ((var1 & 4096) != 0 && var0.method2001() < 49) {// 171 176
         var3.method1566(var0.method1991("Synthetic")).method1570(0);// 124
      }

      if (var2 != 0) {// 152
         var3.method1566(var0.method1991("Signature")).method1570(2).method1566(var2);// 98 311 405 407
      }

      if ((var1 & 131072) != 0) {// 16
         var3.method1566(var0.method1991("Deprecated")).method1570(0);// 121
      }
   }// 518
}
