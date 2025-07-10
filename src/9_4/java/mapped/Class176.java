package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from le
public final class Class176 extends Class151 {
   // $VF: synthetic field
   public byte[] field661;

   // $VF: synthetic method
   public Class176(int var1, int var2, byte[] var3, Class149 var4) {
      super((byte)7, var1, var2, var4);
      this.field661 = var3;// 190 315
   }// 465

   // $VF: synthetic method
   public Class176(int var1, int var2, DataInputStream var3, Class149 var4) {
      this(var1, var2, (byte[])null, var4);// 144
      if (var2 > 0) {// 358 461
         this.field661 = new byte[var2];
         var3.readFully(this.field661);// 192
         System.err.println("Synthetic attribute with length > 0");// 574
      }
   }// 321

   // $VF: synthetic method
   public final byte[] method207() {
      return this.field661;// 28
   }

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1004(this);// 278
   }// 466

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      super.method3(var1);
      if (this.field618 > 0) {// 73 415
         var1.write(this.field661, 0, this.field618);// 398
      }
   }// 87

   // $VF: synthetic method
   @Override
   public Class151 method181(Class149 var1) {
      this = (Class176)this.clone();// 470
      if (this.field661 != null) {// 149
         this.field661 = new byte[this.field661.length];// 157
         System.arraycopy(this.field661, 0, this.field661, 0, this.field661.length);// 24
      }

      this.field616 = var1;// 600
      return this;// 108
   }

   // $VF: synthetic method
   public final void method202(byte[] var1) {
      this.field661 = var1;// 148
   }// 236

   // $VF: synthetic method
   public Class176(Class176 var1) {
      this(var1.method17(), var1.method2(), var1.method207(), var1.method94());// 580
   }// 226
}
