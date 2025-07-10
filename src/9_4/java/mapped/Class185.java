package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from of
public final class Class185 extends Class178 implements Class180 {
   // $VF: synthetic field
   public int field672;

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1017(this);// 6
   }// 144

   // $VF: synthetic method
   public String method5(Class149 var1) {
      return (String)this.method227(var1);// 39
   }

   // $VF: synthetic method
   public Class185(DataInputStream var1) {
      this(var1.readUnsignedShort());// 185
   }// 406

   // $VF: synthetic method
   public final void method6(int var1) {
      this.field672 = var1;// 555
   }// 73

   // $VF: synthetic method
   public final int method2() {
      return this.field672;// 467
   }

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      var1.writeByte(this.field665);
      var1.writeShort(this.field672);// 33 400
   }// 0

   // $VF: synthetic method
   public Class185(Class185 var1) {
      this(var1.method2());// 295
   }// 338

   // $VF: synthetic method
   public Class185(int var1) {
      super((byte)8);
      this.field672 = var1;// 315 465
   }// 132

   // $VF: synthetic method
   @Override
   public Object method227(Class149 var1) {
      return ((Class191)var1.method171(this.field672, (byte)1)).method20();// 38 412
   }
}
