package mapped;

import java.io.DataOutputStream;

// $VF: Compiled from rm
public class Class112 extends Class89 implements Class111 {
   // $VF: synthetic method
   @Override
   public void method3(DataOutputStream var1) {
      this.field13 = this.method2();// 226
      if (this.field12 == 167) {// 123
         super.method3(var1);// 78
      } else {
         this.field13 = this.method2();// 533
         var1.writeByte(this.field12);
         var1.writeInt(this.field13);// 185 406
      }
   }// 46 418

   // $VF: synthetic method
   @Override
   public void method10(Class471 var1) {
      var1.method1116(this);
      var1.method1132(this);// 567
      var1.method1056(this);// 400
      var1.method1122(this);// 33
      var1.method1223(this);// 0 146
   }// 240

   // $VF: synthetic method
   public Class112() {
   }// 18

   // $VF: synthetic method
   public Class112(Class246 var1) {
      super((short)167, var1);// 530
   }// 491

   // $VF: synthetic method
   @Override
   public int method34(int var1, int var2) {
      int var4 = this.method2();// 132
      this.field11 += var1;// 184
      if (Math.abs(var4) >= 32767 - var2) {// 534
         this.field12 = 200;
         this.field13 = 5;// 488 495
         return 2;// 159
      } else {
         return 0;// 561
      }
   }
}
