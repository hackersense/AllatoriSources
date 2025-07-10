package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from dn
public final class Class169 extends Class151 {
   // $VF: synthetic field
   public int field651;

   // $VF: synthetic method
   public Class169(int var1, int var2, DataInputStream var3, Class149 var4) {
      this(var1, var2, var3.readUnsignedShort(), var4);// 553
   }// 58

   // $VF: synthetic method
   public final String method93() {
      return ((Class191)this.field616.method171(this.field651, (byte)1)).method20();// 39 99
   }

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1013(this);// 246
   }// 552

   // $VF: synthetic method
   @Override
   public Class151 method181(Class149 var1) {
      return (Class169)this.clone();// 149
   }

   // $VF: synthetic method
   public final void method89(int var1) {
      this.field651 = var1;// 412
   }// 38

   // $VF: synthetic method
   public Class169(Class169 var1) {
      this(var1.method17(), var1.method2(), var1.method30(), var1.method94());// 273
   }// 161

   // $VF: synthetic method
   public final int method30() {
      return this.field651;// 399
   }

   // $VF: synthetic method
   public Class169(int var1, int var2, int var3, Class149 var4) {
      super((byte)0, var1, var2, var4);
      this.field651 = var3;// 358 461
   }// 192

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      super.method3(var1);
      var1.writeShort(this.field651);// 579 589
   }// 555
}
