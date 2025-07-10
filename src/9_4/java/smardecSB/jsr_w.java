package smardecSB;

import mapped.Class108;
import mapped.Class246;
import mapped.Class437;
import mapped.Class471;

import java.io.DataOutputStream;

// $VF: Compiled from zd
public class jsr_w extends Class108 {
   // $VF: synthetic method
   public jsr_w (Class246 var1) {
      super((short)201, var1);
      this.field13 = 5;// 147 491
   }// 295

   // $VF: synthetic method
   @Override
   public void method3(DataOutputStream var1) {
      this.field13 = this.method2();// 78
      var1.writeByte(this.field12);// 418
      var1.writeInt(this.field13);// 533
   }// 185

   // $VF: synthetic method
   @Override
   public void method7 (Class437 var1, boolean var2) {
      this.field13 = var1.readInt();
      this.field13 = 5;// 190 315
   }// 465

   // $VF: synthetic method
   public jsr_w () {
   }// 513

   // $VF: synthetic method
   @Override
   public void method10 (Class471 var1) {
      var1.method1094(this);
      var1.method1056(this);// 144
      var1.method1218(this);// 461
      var1.method1210(this);// 6 358
   }// 192
}
