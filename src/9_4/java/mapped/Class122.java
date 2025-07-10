package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.Serializable;

// $VF: Compiled from hm
public final class Class122 implements Cloneable, Class125, Class123, Serializable {
   // $VF: synthetic field
   public int field153;
   // $VF: synthetic field
   public int field154;
   // $VF: synthetic field
   public int field155;
   // $VF: synthetic field
   public int field156;

   // $VF: synthetic method
   public final int method84() {
      return this.field155;// 588
   }

   // $VF: synthetic method
   public Class122(DataInputStream var1) {
      this(var1.readUnsignedShort(), var1.readUnsignedShort(), var1.readUnsignedShort(), var1.readUnsignedShort());// 315
   }// 132

   // $VF: synthetic method
   public final void method3(DataOutputStream var1) {
      var1.writeShort(this.field154);
      var1.writeShort(this.field156);// 415
      var1.writeShort(this.field153);// 398
      var1.writeShort(this.field155);// 73 428
   }// 87

   // $VF: synthetic method
   public final void method85(int var1) {
      this.field156 = var1;// 422
   }// 464

   // $VF: synthetic method
   public final String method86(Class149 var1, boolean var2) {
      String var4;
      if (this.field155 == 0) {// 253
         var4 = "<Any exception>(0)";// 135
      } else {
         var4 = new StringBuilder()
            .insert(0, Class523.method1504(var1.method176(this.field155, (byte)7), false))// 443
            .append(var2 ? "(" + this.field155 + ")" : "")
            .toString();
      }

      return this.field154 + "\t" + this.field156 + "\t" + this.field153 + "\t" + var4;// 292
   }

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1007(this);// 278
   }// 466

   // $VF: synthetic method
   public Class122(int var1, int var2, int var3, int var4) {
      this.field154 = var1;// 358
      this.field156 = var2;// 192
      this.field153 = var3;// 574
      this.field155 = var4;// 272 461
   }// 321

   // $VF: synthetic method
   public Class122 method88() {
      try {
         return (Class122)this.clone();// 270
      } catch (CloneNotSupportedException var1) {
         return null;// 266
      }
   }

   // $VF: synthetic method
   public final void method89(int var1) {
      this.field155 = var1;// 600
   }// 108

   // $VF: synthetic method
   public final int method30() {
      return this.field153;// 541
   }

   // $VF: synthetic method
   public final void method90(int var1) {
      this.field154 = var1;// 119
   }// 32

   // $VF: synthetic method
   public final int method17() {
      return this.field154;// 279
   }

   // $VF: synthetic method
   public final void method6(int var1) {
      this.field153 = var1;// 23
   }// 440

   // $VF: synthetic method
   public final String method5(Class149 var1) {
      return this.method86(var1, true);// 66
   }

   // $VF: synthetic method
   public Class122(Class122 var1) {
      this(var1.method17(), var1.method2(), var1.method30(), var1.method84());// 418
   }// 533

   // $VF: synthetic method
   public final int method2() {
      return this.field156;// 236
   }
}
