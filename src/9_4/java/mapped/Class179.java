package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from wh
public final class Class179 extends Class178 implements Class180 {
   // $VF: synthetic field
   public double field667;

   // $VF: synthetic method
   public final void method225(double var1) {
      this.field667 = var1;// 555
   }// 73

   // $VF: synthetic method
   public Class179(DataInputStream var1) {
      this(var1.readDouble());// 465
   }// 132

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      var1.writeByte(this.field665);
      var1.writeDouble(this.field667);// 33 400
   }// 0

   // $VF: synthetic method
   public Class179(Class179 var1) {
      this(var1.method226());// 418
   }// 533

   // $VF: synthetic method
   public final double method226() {
      return this.field667;// 467
   }

   // $VF: synthetic method
   @Override
   public Object method227(Class149 var1) {
      return new Double(this.field667);// 412
   }

   // $VF: synthetic method
   public Class179(double var1) {
      super((byte)6);
      this.field667 = var1;// 295 338
   }// 273

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1008(this);// 6
   }// 144
}
