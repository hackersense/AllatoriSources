package mapped;

// $VF: Compiled from gb
public final class Class541 extends Class540 {
   // $VF: synthetic field
   public final int field1839;
   // $VF: synthetic field
   public int field1840;
   // $VF: synthetic field
   public Class534 field1841;
   // $VF: synthetic field
   public final Class590 field1842;
   // $VF: synthetic field
   public Class354 field1843;
   // $VF: synthetic field
   public final int field1844;
   // $VF: synthetic field
   public Class354 field1845;
   // $VF: synthetic field
   public int field1846;
   // $VF: synthetic field
   public Class354 field1847;
   // $VF: synthetic field
   public final int field1848;
   // $VF: synthetic field
   public Class354 field1849;

   // $VF: synthetic method
   public int method1640() {
      byte var2 = 8;// 166
      if (this.field1846 != 0) {// 292
         var2 += 8;
         this.field1842.method1991("ConstantValue");// 72
      }

      int var3 = var2// 66
         + Class534.method1595(this.field1842, this.field1848, this.field1840)
         + Class354.method663(this.field1845, this.field1847, this.field1849, this.field1843);// 307 536
      if (this.field1841 != null) {// 385
         var3 += this.field1841.method1599(this.field1842);// 471
      }

      return var3;// 582
   }

   // $VF: synthetic method
   public final void method1641(Class495 var1) {
      var1.method1325(this.field1841);// 181
   }// 433

   // $VF: synthetic method
   @Override
   public Class353 method1634(String var1, boolean var2) {
      return var2// 286
         ? (this.field1845 = Class354.method660(this.field1842, var1, this.field1845))// 108 600
         : (this.field1847 = Class354.method660(this.field1842, var1, this.field1847));// 94 242
   }

   // $VF: synthetic method
   public void method1642(Class529 var1) {
      boolean var2 = this.field1842.method2001() < 49;// 77
      int var4 = var2 ? 4096 : 0;// 129
      var1.method1566(this.field1848 & ~var4).method1566(this.field1839).method1566(this.field1844);// 258
      int var5 = 0;// 110
      if (this.field1846 != 0) {// 221
         var5++;// 444
      }

      if ((this.field1848 & 4096) != 0 && var2) {// 193
         var5++;// 251
      }

      if (this.field1840 != 0) {// 117
         var5++;// 300
      }

      if ((this.field1848 & 131072) != 0) {// 296
         var5++;// 404
      }

      if (this.field1845 != null) {// 81
         var5++;// 401
      }

      if (this.field1847 != null) {// 556
         var5++;// 316
      }

      if (this.field1849 != null) {// 275
         var5++;// 127
      }

      if (this.field1843 != null) {// 496
         var5++;// 369
      }

      if (this.field1841 != null) {// 511
         var5 += this.field1841.method1600();// 382
      }

      var1.method1566(var5);// 576
      if (this.field1846 != 0) {// 545
         var1.method1566(this.field1842.method1991("ConstantValue")).method1570(2).method1566(this.field1846);// 162 282 523 570
      }

      Class534.method1608(this.field1842, this.field1848, this.field1840, var1);// 339
      Class354.method665(this.field1842, this.field1845, this.field1847, this.field1849, this.field1843, var1);// 308
      if (this.field1841 != null) {// 573
         this.field1841.method1593(this.field1842, var1);// 520
      }
   }// 188

   // $VF: synthetic method
   @Override
   public void method1636(Class534 var1) {
      var1.field1800 = this.field1841;// 32
      this.field1841 = var1;// 238
   }// 423

   // $VF: synthetic method
   public Class541(Class590 var1, int var2, String var3, String var4, String var5, Object var6) {
      super(589824);
      this.field1842 = var1;// 160
      this.field1848 = var2;// 40
      this.field1839 = var1.method1991(var3);// 63
      this.field1844 = var1.method1991(var4);// 99 541
      if (var5 != null) {// 550
         this.field1840 = var1.method1991(var5);// 510
      }

      if (var6 != null) {// 367
         this.field1846 = var1.method2004(var6).field1923;// 82
      }
   }// 5

   // $VF: synthetic method
   @Override
   public Class353 method1638(int var1, Class573 var2, String var3, boolean var4) {
      return var4// 31
         ? (this.field1849 = Class354.method666(this.field1842, var1, var2, var3, this.field1849))// 21 115
         : (this.field1843 = Class354.method666(this.field1842, var1, var2, var3, this.field1843));// 23 440
   }

   // $VF: synthetic method
   @Override
   public void method1639() {
   }// 336
}
