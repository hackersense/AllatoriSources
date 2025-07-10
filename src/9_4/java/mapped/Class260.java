package mapped;

import java.io.DataOutputStream;

// $VF: Compiled from hh
public class Class260 extends Class89 {
   // $VF: synthetic method
   @Override
   public void method10(Class471 var1) {
      var1.method1132(this);
      var1.method1056(this);// 144
      var1.method1122(this);// 461
      var1.method1176(this);// 6 358
   }// 192

   // $VF: synthetic method
   @Override
   public void method7(Class437 var1, boolean var2) {
      this.field13 = var1.readInt();
      this.field13 = 5;// 190 315
   }// 465

   // $VF: synthetic method
   public Class260() {
   }// 513

   // $VF: synthetic method
   public Class260(Class246 var1) {
      super((short)200, var1);
      this.field13 = 5;// 147 491
   }// 295

   // $VF: synthetic method
   @Override
   public void method3(DataOutputStream var1) {
      this.field13 = this.method2();// 78
      var1.writeByte(this.field12);// 418
      var1.writeInt(this.field13);// 533
   }// 185
}
