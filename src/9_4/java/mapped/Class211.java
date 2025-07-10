package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.Serializable;

// $VF: Compiled from he
public final class Class211 implements Cloneable, Class123, Serializable {
   // $VF: synthetic field
   public int field777;
   // $VF: synthetic field
   public int field778;
   // $VF: synthetic field
   public int field779;
   // $VF: synthetic field
   public int field780;

   // $VF: synthetic method
   public Class211(int var1, int var2, int var3, int var4) {
      this.field779 = var1;// 561
      this.field780 = var2;// 377
      this.field778 = var3;// 604
      this.field777 = var4;// 22 493
   }// 6

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1024(this);// 400
   }// 33

   // $VF: synthetic method
   public final void method85(int var1) {
      this.field777 = var1;// 279
   }// 450

   // $VF: synthetic method
   public Class211 method373() {
      try {
         return (Class211)this.clone();// 270
      } catch (CloneNotSupportedException var1) {
         return null;// 266
      }
   }

   // $VF: synthetic method
   public final void method3(DataOutputStream var1) {
      var1.writeShort(this.field779);
      var1.writeShort(this.field780);// 59
      var1.writeShort(this.field778);// 391
      var1.writeShort(this.field777);// 68 330
   }// 589

   // $VF: synthetic method
   public Class211(Class211 var1) {
      this(var1.method84(), var1.method2(), var1.method17(), var1.method30());// 141
   }// 226

   // $VF: synthetic method
   public final void method89(int var1) {
      this.field779 = var1;// 600
   }// 108

   // $VF: synthetic method
   public final int method84() {
      return this.field779;// 588
   }

   // $VF: synthetic method
   public Class211(DataInputStream var1) {
      this(var1.readUnsignedShort(), var1.readUnsignedShort(), var1.readUnsignedShort(), var1.readUnsignedShort());// 170
   }// 58

   // $VF: synthetic method
   public final int method30() {
      return this.field777;// 87
   }

   // $VF: synthetic method
   public final void method90(int var1) {
      this.field780 = var1;// 23
   }// 440

   // $VF: synthetic method
   public final int method17() {
      return this.field778;// 236
   }

   // $VF: synthetic method
   public final String method5(Class149 var1) {
      String var2 = Class523.method1510(var1.method176(this.field779, (byte)7));// 169 291
      String var3;
      Class211 var9;
      if (this.field780 != 0) {// 216
         var3 = Class523.method1510(var1.method176(this.field780, (byte)7));// 137 299
         var9 = this;
      } else {
         var3 = "<not a member>";// 253
         var9 = this;// 474
      }

      String var4;
      if (var9.field778 != 0) {
         var4 = ((Class191)var1.method171(this.field778, (byte)1)).method20();// 443
         var9 = this;
      } else {
         var4 = "<anonymous>";// 292
         var9 = this;// 72
      }

      String var6;
      String var7 = (var6 = Class523.method1516(var9.field777, true)).equals("") ? "" : var6 + " ";// 268
      return "InnerClass:" + var7 + var2 + "(\"" + var3 + "\", \"" + var4 + "\")";// 497
   }

   // $VF: synthetic method
   public final void method6(int var1) {
      this.field778 = var1;// 422
   }// 464

   // $VF: synthetic method
   public final int method2() {
      return this.field780;// 541
   }
}
