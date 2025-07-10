package mapped;

import java.io.DataInput;
import java.io.DataOutputStream;

// $VF: Compiled from lk
public final class Class192 extends Class178 {
   // $VF: synthetic field
   public int field678;
   // $VF: synthetic field
   public int field679;

   // $VF: synthetic method
   public int method17() {
      return this.field678;// 278
   }

   // $VF: synthetic method
   public int method2() {
      return this.field679;// 555
   }

   // $VF: synthetic method
   public void method90(int var1) {
      this.field679 = var1;// 87
   }// 586

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
   }// 144

   // $VF: synthetic method
   public Class192(Class192 var1) {
      this(var1.method17(), var1.method2());// 338
   }// 273

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      var1.writeByte(this.field678);
      var1.writeShort(this.field678);// 33
      var1.writeShort(this.field679);// 0 400
   }// 240

   // $VF: synthetic method
   public void method6(int var1) {
      this.field678 = var1;// 59
   }// 391

   // $VF: synthetic method
   public Class192(DataInput var1) {
      this(var1.readUnsignedShort(), var1.readUnsignedShort());// 406
   }// 1

   // $VF: synthetic method
   public Class192(int var1, int var2) {
      super((byte)18);
      this.field678 = var1;// 315
      this.field679 = var2;// 190 465
   }// 132
}
