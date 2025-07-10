package mapped;

import java.io.DataOutputStream;

// $VF: Compiled from zj
public class Class477 extends Class475 {
   // $VF: synthetic field
   public int field1559;

   // $VF: synthetic method
   public int method1266() {
      return this.field1559;// 170
   }

   // $VF: synthetic method
   @Override
   public void method1254(DataOutputStream var1) {
      var1.writeByte(this.field1555);
      var1.writeShort(this.field1559);// 179 321
   }// 146

   // $VF: synthetic method
   @Override
   public Class332 method1253() {
      return new Class334(this.field1555, this.field1559, this.field1559.method402());// 93
   }

   // $VF: synthetic method
   public Class477(int var1, Class221 var2) {
      super(99, var2);
      this.field1559 = var1;// 34 332
   }// 260

   // $VF: synthetic method
   @Override
   public String method1255() {
      return this.method1264();// 461
   }

   // $VF: synthetic method
   public Class477(Class334 var1, Class221 var2, boolean var3) {
      super(99, var2);// 338
      if (var3) {// 273
         this.field1559 = var2.method106(var1.method542());// 580
      } else {
         this.field1559 = var1.method528();// 418
      }
   }// 185 226

   // $VF: synthetic method
   public Class477(Class144 var1, Class221 var2) {
      super(99, var2);
      this.field1559 = var2.method106(var1.method20());// 20 239
   }// 310

   // $VF: synthetic method
   public String method1264() {
      return ((Class191)this.method1257().method174(this.field1559)).method20();// 488 495
   }

   // $VF: synthetic method
   public void method1263(int var1) {
      this.field1559 = var1;// 315
   }// 465
}
