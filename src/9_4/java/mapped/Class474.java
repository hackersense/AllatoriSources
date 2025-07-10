package mapped;

import java.io.DataOutputStream;

// $VF: Compiled from sj
public class Class474 extends Class475 {
   // $VF: synthetic field
   public Class533 field1541;

   // $VF: synthetic method
   @Override
   public Class332 method1253() {
      return new Class336(this.field1555, this.field1541.method1581(), this.field1550.method402());// 533
   }

   // $VF: synthetic method
   @Override
   public void method1254(DataOutputStream var1) {
      var1.writeByte(this.field1555);// 151
      this.field1541.method1587(var1);// 530
   }// 491

   // $VF: synthetic method
   @Override
   public String method1255() {
      throw new RuntimeException("Not implemented yet");// 273
   }

   // $VF: synthetic method
   public Class474(Class336 var1, Class221 var2, boolean var3) {
      super(64, var2);// 484
      this.field1541 = new Class533(var1.method545(), var2, var3);// 409
   }// 389

   // $VF: synthetic method
   public Class474(Class533 var1, Class221 var2) {
      super(64, var2);
      this.field1541 = var1;// 10 52
   }// 7

   // $VF: synthetic method
   public Class533 method1256() {
      return this.field1541;// 553
   }

   // $VF: synthetic method
   public Class474(int var1, Class533 var2, Class221 var3) {
      super(var1, var3);// 332
      if (var1 != 64) {// 260
         throw new RuntimeException("Only element values of type annotation can be built with this ctor");// 30
      } else {
         this.field1541 = var2;// 252
      }
   }// 20
}
