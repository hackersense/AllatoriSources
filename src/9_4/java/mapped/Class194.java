package mapped;

import java.io.DataInput;
import java.io.DataOutputStream;

// $VF: Compiled from em
public final class Class194 extends Class178 {
   // $VF: synthetic field
   public int field682;

   // $VF: synthetic method
   public Class194(int var1) {
      super((byte)16);
      this.field682 = var1;// 58 553
   }// 190

   // $VF: synthetic method
   public int method2() {
      return this.field682;// 240
   }

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      var1.writeByte(this.field665);
      var1.writeShort(this.field682);// 146 179
   }// 567

   // $VF: synthetic method
   public void method6(int var1) {
      this.field682 = var1;// 466
   }// 467

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
   }// 604

   // $VF: synthetic method
   public Class194(DataInput var1) {
      this(var1.readUnsignedShort());// 185
   }// 406

   // $VF: synthetic method
   public Class194(Class194 var1) {
      this(var1.method2());// 295
   }// 338
}
