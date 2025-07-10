package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from vf
public final class Class172 extends Class151 {
   // $VF: synthetic field
   public int field656;

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      super.method3(var1);
      var1.writeShort(this.field656);// 151 530
   }// 491

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
   }// 18

   // $VF: synthetic method
   public final Class182 method215() {
      return (Class182)this.field616.method171(this.field656, (byte)7);// 418
   }

   // $VF: synthetic method
   public Class172(int var1, int var2, int var3, Class149 var4) {
      super((byte)22, var1, var2, var4);
      this.field656 = var3;// 310 498
   }// 484

   // $VF: synthetic method
   @Override
   public Class151 method181(Class149 var1) {
      return (Class172)this.clone();// 58
   }

   // $VF: synthetic method
   public final int method30() {
      return this.field656;// 338
   }

   // $VF: synthetic method
   public Class172(int var1, int var2, DataInputStream var3, Class149 var4) {
      this(var1, var2, var3.readUnsignedShort(), var4);// 143
   }// 252

   // $VF: synthetic method
   public Class172(Class172 var1) {
      this(var1.method17(), var1.method2(), var1.method30(), var1.method94());// 507
   }// 557

   // $VF: synthetic method
   public final void method89(int var1) {
      this.field656 = var1;// 580
   }// 226
}
