package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.Serializable;

// $VF: Compiled from ji
public final class Class210 implements Cloneable, Class123, Serializable {
   // $VF: synthetic field
   public int field775;
   // $VF: synthetic field
   public int field776;

   // $VF: synthetic method
   public final int method17() {
      return this.field775;// 485
   }

   // $VF: synthetic method
   public final int method2() {
      return this.field776;// 73
   }

   // $VF: synthetic method
   public Class210(DataInputStream var1) {
      this(var1.readUnsignedShort(), var1.readUnsignedShort());// 185
   }// 406

   // $VF: synthetic method
   public final void method3(DataOutputStream var1) {
      var1.writeShort(this.field776);
      var1.writeShort(this.field775);// 0 33
   }// 240

   // $VF: synthetic method
   public Class210(Class210 var1) {
      this(var1.method2(), var1.method17());// 338
   }// 273

   // $VF: synthetic method
   public final void method90(int var1) {
      this.field775 = var1;// 463
   }// 198

   // $VF: synthetic method
   public Class210 method270() {
      try {
         return (Class210)this.clone();// 82
      } catch (CloneNotSupportedException var1) {
         return null;// 279
      }
   }

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1010(this);// 144
   }// 461

   // $VF: synthetic method
   public final void method6(int var1) {
      this.field776 = var1;// 257
   }// 269

   // $VF: synthetic method
   public Class210(int var1, int var2) {
      this.field776 = var1;// 465
      this.field775 = var2;// 132 315
   }// 184
}
