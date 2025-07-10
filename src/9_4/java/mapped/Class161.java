package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from ki
public final class Class161 extends Class151 {
   // $VF: synthetic field
   public int field635;

   // $VF: synthetic method
   public Class161(int var1, int var2, DataInputStream var3, Class149 var4) {
      this(var1, var2, var3.readUnsignedShort(), var4);// 170
   }// 553

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1020(this);// 179
   }// 146

   // $VF: synthetic method
   @Override
   public Class151 method181(Class149 var1) {
      Class161 var4 = (Class161)this.clone();// 94
      var4.field616 = var1;// 209
      return var4;// 69
   }

   // $VF: synthetic method
   public Class161(Class161 var1) {
      this(var1.method17(), var1.method2(), var1.method30(), var1.method94());// 338
   }// 273

   // $VF: synthetic method
   public final int method30() {
      return this.field635;// 555
   }

   // $VF: synthetic method
   public Class161(int var1, int var2, int var3, Class149 var4) {
      super((byte)1, var1, var2, var4);
      this.field635 = var3;// 493 561
   }// 377

   // $VF: synthetic method
   public final void method89(int var1) {
      this.field635 = var1;// 232
   }// 463

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      super.method3(var1);
      var1.writeShort(this.field635);// 466 467
   }// 485
}
