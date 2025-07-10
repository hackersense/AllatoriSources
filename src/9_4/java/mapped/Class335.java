package mapped;

import java.io.DataOutputStream;

// $VF: Compiled from qk
public class Class335 extends Class332 {
   // $VF: synthetic field
   public int field938;
   // $VF: synthetic field
   public int field939;

   // $VF: synthetic method
   public String method544() {
      return ((Class191)this.field939.method171(this.field938, (byte)1)).method20();// 147 338
   }

   // $VF: synthetic method
   public int method538() {
      return this.field938;// 190
   }

   // $VF: synthetic method
   @Override
   public String method530() {
      return ((Class191)this.field939.method171(this.field939, (byte)1)).method20();// 389 513
   }

   // $VF: synthetic method
   public String method542() {
      return ((Class191)this.field939.method171(this.field939, (byte)1)).method20();// 78 226
   }

   // $VF: synthetic method
   public int method528() {
      return this.field939;// 1
   }

   // $VF: synthetic method
   @Override
   public void method527(DataOutputStream var1) {
      var1.writeByte(this.field934);
      var1.writeShort(this.field938);// 204
      var1.writeShort(this.field939);// 20 239
   }// 310

   // $VF: synthetic method
   public Class335(int var1, int var2, int var3, Class149 var4) {
      super(var1, var4);// 7
      if (var1 != 101) {// 335
         throw new RuntimeException("Only element values of type enum can be built with this ctor");// 507
      } else {
         this.field938 = var2;
         this.field939 = var3;// 34 332
      }
   }// 260
}
