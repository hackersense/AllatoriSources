package mapped;

import java.io.DataOutputStream;

// $VF: Compiled from wi
public class Class548 {
   // $VF: synthetic field
   public Class475 field1884;
   // $VF: synthetic field
   public Class221 field1885;
   // $VF: synthetic field
   public int field1886;

   // $VF: synthetic method
   public Class548(String var1, Class475 var2, Class221 var3) {
      this.field1886 = var3.method106(var1);// 315
      this.field1884 = var2;// 465
      this.field1885 = var3;// 132 190
   }// 184

   // $VF: synthetic method
   public final Class475 method1716() {
      return this.field1884;// 246
   }

   // $VF: synthetic method
   public Class544 method1717() {
      Class332 var2 = this.field1884.method1253();// 161
      return new Class544(this.field1886, var2, this.field1885.method402());// 141
   }

   // $VF: synthetic method
   public void method1718(DataOutputStream var1) {
      var1.writeShort(this.field1886);// 159
      this.field1884.method1254(var1);// 493
   }// 561

   // $VF: synthetic method
   public int method1719() {
      return this.field1886;// 6
   }

   // $VF: synthetic method
   public Class548(Class544 var1, Class221 var2, boolean var3) {
      this.field1885 = var2;// 507 557
      Class548 var6;
      if (var3) {// 239
         var6 = this;// 498
         this.field1886 = var2.method106(var1.method1681());
      } else {
         var6 = this;// 18
         this.field1886 = var1.method1683();
      }

      var6.field1884 = Class475.method1260(var1.method1684(), var2, var3);// 93
   }// 151

   // $VF: synthetic method
   public final String method1720() {
      return ((Class191)this.field1885.method174(this.field1886)).method20();// 567
   }

   // $VF: synthetic method
   public void method1721(int var1) {
      this.field1886 = var1;// 192
   }// 574

   // $VF: synthetic method
   public Class548(int var1, Class475 var2, Class221 var3) {
      this.field1886 = var1;// 185
      this.field1884 = var2;// 406
      this.field1885 = var3;// 1 533
   }// 46
}
