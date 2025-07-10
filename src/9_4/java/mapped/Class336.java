package mapped;

import java.io.DataOutputStream;

// $VF: Compiled from pj
public class Class336 extends Class332 {
   // $VF: synthetic field
   public Class128 field940;

   // $VF: synthetic method
   public Class336(int var1, Class128 var2, Class149 var3) {
      super(var1, var3);// 26
      if (var1 != 64) {// 52
         throw new RuntimeException("Only element values of type annotation can be built with this ctor");// 10
      } else {
         this.field940 = var2;// 335
      }
   }// 507

   // $VF: synthetic method
   @Override
   public String method530() {
      StringBuffer var10000 = new StringBuffer();
      var10000.append(this.field940.toString());// 310
      return var10000.toString();// 498
   }

   // $VF: synthetic method
   @Override
   public void method527(DataOutputStream var1) {
      var1.writeByte(this.field934);// 260
      this.field940.method3(var1);// 30
   }// 143

   // $VF: synthetic method
   public Class128 method545() {
      return this.field940;// 147
   }
}
