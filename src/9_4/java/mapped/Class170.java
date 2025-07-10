package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from kj
public class Class170 extends Class151 {
   // $VF: synthetic field
   public int field652;
   // $VF: synthetic field
   public int field653;

   // $VF: synthetic method
   public final void method85(int var1) {
      this.field652 = var1;// 488
   }

   // $VF: synthetic method
   public final int method84() {
      return this.field652;// 132
   }

   // $VF: synthetic method
   public Class170(int var1, int var2, int var3, int var4, Class149 var5) {
      super((byte)18, var1, var2, var5);
      this.field652 = var3;// 226
      this.field653 = var4;// 123 580
   }// 78

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      super.method3(var1);
      var1.writeShort(this.field652);// 146 567
      var1.writeShort(this.field653);// 400
   }// 33

   // $VF: synthetic method
   public Class170(int var1, int var2, DataInputStream var3, Class149 var4) {
      this(var1, var2, var3.readUnsignedShort(), var3.readUnsignedShort(), var4);// 338
   }// 273

   // $VF: synthetic method
   public final void method89(int var1) {
      this.field653 = var1;// 495
   }

   // $VF: synthetic method
   public final Class186 method214() {
      return this.field653 == 0 ? null : (Class186)this.field616.method171(this.field653, (byte)12);// 358 461
   }

   // $VF: synthetic method
   public final int method30() {
      return this.field653;// 184
   }

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1035(this);// 185
   }// 406

   // $VF: synthetic method
   @Override
   public Class151 method181(Class149 var1) {
      throw new RuntimeException("Not implemented yet!");// 170
   }

   // $VF: synthetic method
   public final Class182 method215() {
      return (Class182)this.field616.method171(this.field652, (byte)7);// 561 604
   }
}
