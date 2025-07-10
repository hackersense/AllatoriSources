package mapped;

// $VF: Compiled from va
public final class Class456 extends Class455 {
   // $VF: synthetic field
   public int field1381;
   // $VF: synthetic field
   public final int field1382;
   // $VF: synthetic field
   public Class354 field1383;
   // $VF: synthetic field
   public final int field1384;
   // $VF: synthetic field
   public final Class590 field1385;
   // $VF: synthetic field
   public Class354 field1386;
   // $VF: synthetic field
   public Class354 field1387;
   // $VF: synthetic field
   public Class534 field1388;
   // $VF: synthetic field
   public Class354 field1389;

   // $VF: synthetic method
   public void method976(Class529 var1) {
      var1.method1566(this.field1384).method1566(this.field1382);// 291
      int var2 = 0;// 216
      if (this.field1381 != 0) {// 299
         var2++;// 314
      }

      if (this.field1389 != null) {// 50
         var2++;// 253
      }

      if (this.field1386 != null) {// 474
         var2++;// 443
      }

      if (this.field1383 != null) {// 434
         var2++;// 292
      }

      if (this.field1387 != null) {// 72
         var2++;// 268
      }

      if (this.field1388 != null) {// 66
         var2 += this.field1388.method1600();// 536
      }

      var1.method1566(var2);// 218
      Class534.method1608(this.field1385, 0, this.field1381, var1);// 109
      Class354.method665(this.field1385, this.field1389, this.field1386, this.field1383, this.field1387, var1);// 213
      if (this.field1388 != null) {// 266
         this.field1388.method1593(this.field1385, var1);// 235
      }
   }// 370

   // $VF: synthetic method
   @Override
   public void method972(Class534 var1) {
      var1.field1800 = this.field1388;// 5
      this.field1388 = var1;// 279
   }// 450

   // $VF: synthetic method
   @Override
   public Class353 method975(int var1, Class573 var2, String var3, boolean var4) {
      return var4// 142
         ? (this.field1383 = Class354.method666(this.field1385, var1, var2, var3, this.field1383))// 39 368
         : (this.field1387 = Class354.method666(this.field1385, var1, var2, var3, this.field1387));// 40 63
   }

   // $VF: synthetic method
   public final void method977(Class495 var1) {
      var1.method1325(this.field1388);// 258
   }// 107

   // $VF: synthetic method
   public int method978() {
      byte var2 = 6;
      int var3 = 6// 115
         + Class534.method1595(this.field1385, 0, this.field1381)// 223
         + Class354.method663(this.field1389, this.field1386, this.field1383, this.field1387);// 23 45
      if (this.field1388 != null) {// 468
         var3 += this.field1388.method1599(this.field1385);// 138
      }

      return var3;// 119
   }

   // $VF: synthetic method
   @Override
   public void method973() {
   }// 24

   // $VF: synthetic method
   @Override
   public Class353 method974(String var1, boolean var2) {
      return var2// 198
         ? (this.field1389 = Class354.method660(this.field1385, var1, this.field1389))// 28 424
         : (this.field1386 = Class354.method660(this.field1385, var1, this.field1386));// 329 412
   }

   // $VF: synthetic method
   public Class456(Class590 var1, String var2, String var3, String var4) {
      super(589824);
      this.field1385 = var1;// 391
      this.field1384 = var1.method1991(var2);// 330
      this.field1382 = var1.method1991(var3);// 59 589
      if (var4 != null) {// 579
         this.field1381 = var1.method1991(var4);// 555
      }
   }// 415
}
