package mapped;

import java.io.DataOutputStream;

// $VF: Compiled from ci
public class Class286 extends Class277 {
   // $VF: synthetic field
   public boolean field915;
   // $VF: synthetic field
   public int field916;

   // $VF: synthetic method
   public final int method30() {
      return this.field916;// 368
   }

   // $VF: synthetic method
   @Override
   public void method7(Class437 var1, boolean var2) {
      if (this.field915 = var2) {// 246 552
         this.field916 = 6;
         this.field911 = var1.readUnsignedShort();// 278
         this.field916 = var1.readShort();// 466 603
      } else {
         this.field916 = 3;
         this.field911 = var1.readUnsignedByte();// 68 485
         this.field916 = var1.readByte();// 59
      }
   }// 330 467

   // $VF: synthetic method
   public Class286(int var1, int var2) {
      this.field915 = 132;// 123
      this.field916 = 3;// 78
      this.method6(var1);// 418
      this.method90(var2);// 226 533
   }// 185

   // $VF: synthetic method
   @Override
   public String method4(boolean var1) {
      return new StringBuilder().insert(0, super.method4(var1)).append(" ").append(this.field916).toString();// 428
   }

   // $VF: synthetic method
   @Override
   public final void method6(int var1) {
      if (var1 < 0) {// 28
         throw new Class241("Negative index value: " + var1);// 588
      } else {
         this.field911 = var1;// 412
         this.method122();// 38
      }
   }// 257

   // $VF: synthetic method
   public final void method122() {
      this.field915 = this.field911 > 255 || Math.abs(this.field916) > 127;// 461
      if (this.field915) {// 358
         this.field916 = 6;// 192
      } else {
         this.field916 = 3;// 272
      }
   }// 179 574

   // $VF: synthetic method
   @Override
   public void method10(Class471 var1) {
      var1.method1064(this);
      var1.method1211(this);// 422 464
   }// 25

   // $VF: synthetic method
   public final void method90(int var1) {
      this.field916 = var1;// 456
      this.method122();// 367
   }// 82

   // $VF: synthetic method
   @Override
   public void method3(DataOutputStream var1) {
      if (this.field915) {// 315
         var1.writeByte(196);// 465
      }

      var1.writeByte(this.field915);// 184
      if (this.field915) {// 534
         var1.writeShort(this.field911);
         var1.writeShort(this.field916);// 488 495
      } else {
         var1.writeByte(this.field911);// 493
         var1.writeByte(this.field916);// 561
      }
   }// 159 604

   // $VF: synthetic method
   public Class286() {
   }// 491

   // $VF: synthetic method
   @Override
   public Class138 method1(Class221 var1) {
      return Class138.field591;// 470
   }
}
