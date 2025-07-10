package mapped;

import java.io.DataInput;
import java.io.DataOutputStream;

// $VF: Compiled from fg
public final class Class193 extends Class178 {
   // $VF: synthetic field
   public int field680;
   // $VF: synthetic field
   public int field681;

   // $VF: synthetic method
   public Class193(Class193 var1) {
      this(var1.method2(), var1.method17());// 338
   }// 273

   // $VF: synthetic method
   public int method17() {
      return this.field681;// 579
   }

   // $VF: synthetic method
   public int method2() {
      return this.field680;// 603
   }

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
   }// 6

   // $VF: synthetic method
   public void method90(int var1) {
      this.field681 = var1;// 428
   }// 87

   // $VF: synthetic method
   public Class193(DataInput var1) {
      this(var1.readUnsignedByte(), var1.readUnsignedShort());// 406
   }// 1

   // $VF: synthetic method
   public Class193(int var1, int var2) {
      super((byte)15);
      this.field680 = var1;// 190
      this.field681 = var2;// 58 315
   }// 465

   // $VF: synthetic method
   public void method6(int var1) {
      this.field680 = var1;// 68
   }// 59

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      var1.writeByte(this.field680);
      var1.writeByte(this.field680);// 400
      var1.writeShort(this.field681);// 33 567
   }// 0
}
