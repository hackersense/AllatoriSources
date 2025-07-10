package mapped;

import java.io.DataOutputStream;

// $VF: Compiled from bn
public class Class110 extends Class108 implements Class111 {
   // $VF: synthetic method
   public Class110(Class246 var1) {
      super((short)168, var1);// 530
   }// 491

   // $VF: synthetic method
   @Override
   public void method10(Class471 var1) {
      var1.method1094(this);
      var1.method1116(this);// 321
      var1.method1056(this);// 179
      var1.method1218(this);// 146
      var1.method1120(this);// 272 567
   }// 400

   // $VF: synthetic method
   public Class110() {
   }// 18

   // $VF: synthetic method
   @Override
   public void method3(DataOutputStream var1) {
      this.field13 = this.method2();// 226
      if (this.field12 == 168) {// 123
         super.method3(var1);// 78
      } else {
         this.field13 = this.method2();// 533
         var1.writeByte(this.field12);
         var1.writeInt(this.field13);// 185 406
      }
   }// 46 418

   // $VF: synthetic method
   @Override
   public int method34(int var1, int var2) {
      int var4 = this.method2();// 190
      this.field11 += var1;// 315
      if (Math.abs(var4) >= 32767 - var2) {// 465
         this.field12 = 201;
         this.field13 = 5;// 132 184
         return 2;// 534
      } else {
         return 0;// 495
      }
   }
}
