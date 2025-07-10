package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from xd
public final class Class181 extends Class178 implements Class180 {
   // $VF: synthetic field
   public int field668;

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      var1.writeByte(this.field665);
      var1.writeInt(this.field668);// 33 400
   }// 0

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1019(this);// 6
   }// 144

   // $VF: synthetic method
   public Class181(int var1) {
      super((byte)3);
      this.field668 = var1;// 295 338
   }// 273

   // $VF: synthetic method
   public Class181(DataInputStream var1) {
      this(var1.readInt());// 465
   }// 132

   // $VF: synthetic method
   public Class181(Class181 var1) {
      this(var1.method2());// 418
   }// 533

   // $VF: synthetic method
   public final int method2() {
      return this.field668;// 467
   }

   // $VF: synthetic method
   @Override
   public Object method227(Class149 var1) {
      return new Integer(this.field668);// 412
   }

   // $VF: synthetic method
   public final void method6(int var1) {
      this.field668 = var1;// 555
   }// 73
}
