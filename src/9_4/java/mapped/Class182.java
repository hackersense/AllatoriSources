package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from xj
public final class Class182 extends Class178 implements Class180 {
   // $VF: synthetic field
   public int field669;

   // $VF: synthetic method
   public Class182(DataInputStream var1) {
      this(var1.readUnsignedShort());// 185
   }// 406

   // $VF: synthetic method
   public Class182(Class182 var1) {
      this(var1.method2());// 295
   }// 338

   // $VF: synthetic method
   public final int method2() {
      return this.field669;// 485
   }

   // $VF: synthetic method
   public String method5(Class149 var1) {
      return (String)this.method227(var1);// 38
   }

   // $VF: synthetic method
   @Override
   public Object method227(Class149 var1) {
      return ((Class191)var1.method171(this.field669, (byte)1)).method20();// 232 463
   }

   // $VF: synthetic method
   public Class182(int var1) {
      super((byte)7);
      this.field669 = var1;// 132 465
   }// 184

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      var1.writeByte(this.field665);
      var1.writeShort(this.field669);// 0 33
   }// 240

   // $VF: synthetic method
   public final void method6(int var1) {
      this.field669 = var1;// 73
   }// 415

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1025(this);// 144
   }// 461
}
