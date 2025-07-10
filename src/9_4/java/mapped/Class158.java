package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from vh
public class Class158 extends Class151 {
   // $VF: synthetic field
   public Class332 field630;

   // $VF: synthetic method
   public final Class332 method188() {
      return this.field630;// 73
   }

   // $VF: synthetic method
   @Override
   public Class151 method181(Class149 var1) {
      throw new RuntimeException("Not implemented yet!");// 586
   }

   // $VF: synthetic method
   public Class158(int var1, int var2, Class332 var3, Class149 var4) {
      super((byte)16, var1, var2, var4);
      this.method189(var3);// 22 604
   }// 6

   // $VF: synthetic method
   @Override
   public void method3(DataOutputStream var1) {
      super.method3(var1);
      this.field630.method527(var1);// 198 424
   }// 28

   // $VF: synthetic method
   public Class158(int var1, int var2, DataInputStream var3, Class149 var4) {
      this(var1, var2, (Class332)null, var4);// 533
      this.field630 = Class332.method533(var3, var4);// 406
   }// 1

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
   }// 0

   // $VF: synthetic method
   public final void method189(Class332 var1) {
      this.field630 = var1;// 485
   }// 68
}
