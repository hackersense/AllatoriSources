package smardecSB;

import mapped.Class10;
import mapped.Class138;
import mapped.Class18;
import mapped.Class221;
import mapped.Class437;
import mapped.Class471;

import java.io.DataOutputStream;

// $VF: Compiled from fd
public class sipush extends Class10 implements Class18 {
   // $VF: synthetic field
   public short field10;

   // $VF: synthetic method
   @Override
   public Class138 method1 (Class221 var1) {
      return Class138.field581;// 567
   }

   // $VF: synthetic method
   @Override
   public Number method27() {
      return new Integer(this.field10);// 358
   }

   // $VF: synthetic method
   @Override
   public void method3(DataOutputStream var1) {
      super.method3(var1);
      var1.writeShort(this.field10);// 1 406
   }// 46

   // $VF: synthetic method
   @Override
   public void method7 (Class437 var1, boolean var2) {
      this.field4 = 3;
      this.field10 = var1.readShort();// 377 604
   }// 22

   // $VF: synthetic method
   @Override
   public void method10 (Class471 var1) {
      var1.method1196(this);
      var1.method1094(this);// 391
      var1.method1135(this);// 330
      var1.method1054(this);// 589
      var1.method1189(this);// 59 579
   }// 555

   // $VF: synthetic method
   public sipush () {
   }// 147

   // $VF: synthetic method
   @Override
   public String method4(boolean var1) {
      return new StringBuilder().insert(0, super.method4(var1)).append(" ").append(this.field10).toString();// 132
   }

   // $VF: synthetic method
   public sipush (short var1) {
      super((short)17, (short)3);
      this.field10 = var1;// 141 161
   }// 580
}
