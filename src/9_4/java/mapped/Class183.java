package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from fj
public final class Class183 extends Class178 implements Class180 {
   // $VF: synthetic field
   public long field670;

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      var1.writeByte(this.field665);
      var1.writeLong(this.field670);// 33 400
   }// 0

   // $VF: synthetic method
   public final long method228() {
      return this.field670;// 467
   }

   // $VF: synthetic method
   public Class183(long var1) {
      super((byte)5);
      this.field670 = var1;// 295 338
   }// 273

   // $VF: synthetic method
   public final void method229(long var1) {
      this.field670 = var1;// 555
   }// 73

   // $VF: synthetic method
   public Class183(Class183 var1) {
      this(var1.method228());// 418
   }// 533

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1026(this);// 6
   }// 144

   // $VF: synthetic method
   @Override
   public Object method227(Class149 var1) {
      return new Long(this.field670);// 412
   }

   // $VF: synthetic method
   public Class183(DataInputStream var1) {
      this(var1.readLong());// 465
   }// 132
}
