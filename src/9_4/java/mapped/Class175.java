package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from qm
public final class Class175 extends Class151 {
   // $VF: synthetic field
   public byte[] field660;

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      super.method3(var1);
      if (this.field618 > 0) {// 59 391
         var1.write(this.field660, 0, this.field618);// 330
      }
   }// 579

   // $VF: synthetic method
   public final void method202(byte[] var1) {
      this.field660 = var1;// 329
   }// 412

   // $VF: synthetic method
   public Class175(Class175 var1) {
      this(var1.method17(), var1.method2(), var1.method207(), var1.method94());// 338
   }// 273

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1028(this);// 33
   }// 0

   // $VF: synthetic method
   public Class175(int var1, int var2, byte[] var3, Class149 var4) {
      super((byte)8, var1, var2, var4);
      this.field660 = var3;// 1 406
   }// 46

   // $VF: synthetic method
   public Class175(int var1, int var2, DataInputStream var3, Class149 var4) {
      this(var1, var2, (byte[])null, var4);// 493
      if (var2 > 0) {// 377 561
         this.field660 = new byte[var2];
         var3.readFully(this.field660);// 604
         System.err.println("Deprecated attribute with length > 0");// 22
      }
   }// 144

   // $VF: synthetic method
   public final byte[] method207() {
      return this.field660;// 586
   }

   // $VF: synthetic method
   @Override
   public Class151 method181(Class149 var1) {
      this = (Class175)this.clone();// 550
      if (this.field660 != null) {// 510
         this.field660 = new byte[this.field660.length];// 456
         System.arraycopy(this.field660, 0, this.field660, 0, this.field660.length);// 367
      }

      this.field616 = var1;// 83
      return this;// 5
   }
}
