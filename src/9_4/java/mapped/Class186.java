package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from oi
public final class Class186 extends Class178 {
   // $VF: synthetic field
   public int field673;
   // $VF: synthetic field
   public int field674;

   // $VF: synthetic method
   public final int method17() {
      return this.field674;// 330
   }

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      var1.writeByte(this.field673);
      var1.writeShort(this.field674);// 552
      var1.writeShort(this.field673);// 246 603
   }// 278

   // $VF: synthetic method
   public Class186(Class186 var1) {
      this(var1.method17(), var1.method2());// 273
   }// 161

   // $VF: synthetic method
   public Class186(DataInputStream var1) {
      this(var1.readUnsignedShort(), var1.readUnsignedShort());// 1
   }// 46

   // $VF: synthetic method
   public final String method232(Class149 var1) {
      return var1.method177(this.method2(), (byte)1);// 455
   }

   // $VF: synthetic method
   public Class186(int var1, int var2) {
      super((byte)12);
      this.field674 = var1;// 534
      this.field673 = var2;// 184 488
   }// 495

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1012(this);// 192
   }// 574

   // $VF: synthetic method
   public final void method90(int var1) {
      this.field674 = var1;// 40
   }// 63

   // $VF: synthetic method
   public final int method2() {
      return this.field673;// 28
   }

   // $VF: synthetic method
   public final void method6(int var1) {
      this.field673 = var1;// 83
   }// 5

   // $VF: synthetic method
   public final String method5(Class149 var1) {
      return var1.method177(this.method17(), (byte)1);// 428
   }
}
