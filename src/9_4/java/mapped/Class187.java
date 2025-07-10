package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from eh
public abstract class Class187 extends Class178 {
   // $VF: synthetic field
   public int field675;
   // $VF: synthetic field
   public int field676;

   // $VF: synthetic method
   public final int method17() {
      return this.field676;// 240
   }

   // $VF: synthetic method
   public final void method90(int var1) {
      this.field676 = var1;// 415
   }// 398

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      var1.writeByte(this.field675);
      var1.writeShort(this.field676);// 574
      var1.writeShort(this.field675);// 192 272
   }// 321

   // $VF: synthetic method
   public Class187(byte var1, int var2, int var3) {
      super(var1);
      this.field676 = var2;// 488
      this.field675 = var3;// 495 534
   }// 159

   // $VF: synthetic method
   public String method5(Class149 var1) {
      return var1.method177(this.field676, (byte)7);// 198
   }

   // $VF: synthetic method
   public Class187(Class187 var1) {
      this(var1.method142(), var1.method17(), var1.method2());// 273
   }// 161

   // $VF: synthetic method
   public final void method6(int var1) {
      this.field675 = var1;// 269
   }// 455

   // $VF: synthetic method
   public final int method2() {
      return this.field675;// 68
   }

   // $VF: synthetic method
   public Class187(byte var1, DataInputStream var2) {
      this(var1, var2.readUnsignedShort(), var2.readUnsignedShort());// 46
   }// 170
}
