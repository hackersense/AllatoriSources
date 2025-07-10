package smardecSB;

import mapped.Class10;
import mapped.Class138;
import mapped.Class18;
import mapped.Class221;
import mapped.Class437;
import mapped.Class471;

import java.io.DataOutputStream;

// $VF: Compiled from fl
public class bipush extends Class10 implements Class18 {
   // $VF: synthetic field
   public byte field9;

   // $VF: synthetic method
   @Override
   public Class138 method1 (Class221 var1) {
      return Class138.field594;// 33
   }

   // $VF: synthetic method
   @Override
   public Number method27() {
      return new Integer(this.field9);// 574
   }

   // $VF: synthetic method
   public bipush () {
   }// 147

   // $VF: synthetic method
   public bipush (byte var1) {
      super((short)16, (short)2);
      this.field9 = var1;// 226 580
   }// 123

   // $VF: synthetic method
   @Override
   public void method7 (Class437 var1, boolean var2) {
      this.field9 = 2;
      this.field9 = var1.readByte();// 6 22
   }// 144

   // $VF: synthetic method
   @Override
   public void method10 (Class471 var1) {
      var1.method1196(this);
      var1.method1094(this);// 589
      var1.method1135(this);// 579
      var1.method1054(this);// 555
      var1.method1147(this);// 73 330
   }// 415

   // $VF: synthetic method
   @Override
   public String method4(boolean var1) {
      return new StringBuilder().insert(0, super.method4(var1)).append(" ").append(this.field9).toString();// 534
   }

   // $VF: synthetic method
   @Override
   public void method3(DataOutputStream var1) {
      super.method3(var1);
      var1.writeByte(this.field9);// 46 170
   }// 553
}
