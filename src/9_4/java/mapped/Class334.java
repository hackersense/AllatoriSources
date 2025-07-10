package mapped;

import java.io.DataOutputStream;

// $VF: Compiled from og
public class Class334 extends Class332 {
   // $VF: synthetic field
   public int field937;

   // $VF: synthetic method
   public Class334(int var1, int var2, Class149 var3) {
      super(var1, var3);
      this.field937 = var2;// 7 10
   }// 335

   // $VF: synthetic method
   public int method528() {
      return this.field937;// 332
   }

   // $VF: synthetic method
   public String method542() {
      return ((Class191)this.field937.method171(this.field937, (byte)1)).method20();// 20 239
   }

   // $VF: synthetic method
   @Override
   public void method527(DataOutputStream var1) {
      var1.writeByte(this.field934);
      var1.writeShort(this.field937);// 147 295
   }// 338

   // $VF: synthetic method
   @Override
   public String method530() {
      return ((Class191)this.field937.method171(this.field937, (byte)1)).method20();// 389 513
   }
}
