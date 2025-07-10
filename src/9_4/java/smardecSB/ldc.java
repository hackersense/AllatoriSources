package smardecSB;

import mapped.Class1;
import mapped.Class138;
import mapped.Class16;
import mapped.Class178;
import mapped.Class181;
import mapped.Class184;
import mapped.Class185;
import mapped.Class191;
import mapped.Class221;
import mapped.Class31;
import mapped.Class437;
import mapped.Class471;
import mapped.Class481;
import mapped.Class7;

import java.io.DataOutputStream;

// $VF: Compiled from go
public class ldc extends Class1 implements Class7, Class31, Class16 {
   // $VF: synthetic method
   @Override
   public Class[] method9() {
      return Class481.field1570;// 160
   }

   // $VF: synthetic method
   @Override
   public void method7 (Class437 var1, boolean var2) {
      this.field1 = 2;
      this.field1 = var1.readUnsignedByte();// 0 240
   }// 246

   // $VF: synthetic method
   public final void method122() {
      if (this.field1 <= 255) {// 78
         this.field3 = 18;
         this.field1 = 2;// 418 533
      } else {
         this.field3 = 19;
         this.field1 = 3;// 1 406
      }
   }// 170 185

   // $VF: synthetic method
   @Override
   public final void method6(int var1) {
      super.method6(var1);
      this.method122();// 192 574
   }// 272

   // $VF: synthetic method
   public Object method522 (Class221 var1) {
      Class178 var4;
      switch ((var4 = var1.method402().method174(this.field1)).method142()) {// 466 467
         case 3:
            return new Integer(((Class181)var4).method2());// 555
         case 4:
            return new Float(((Class184)var4).method230());// 589
         case 5:
         case 6:
         default:
            throw new RuntimeException("Unknown or invalid constant type at " + this.field1);// 428
         case 7:
            while (false) {
            }

            return var4;// 415
         case 8:
            int var3 = ((Class185)var4).method2();// 68
            return ((Class191)var1.method402().method174(var3)).method20();// 59 391
      }
   }

   // $VF: synthetic method
   public ldc (int var1) {
      super((short)19, var1);
      this.method122();// 273 338
   }// 161

   // $VF: synthetic method
   @Override
   public Class138 method1 (Class221 var1) {
      switch (var1.method402().method174(this.field1).method142()) {// 198
         case 3:
            while (false) {
            }

            return Class138.field591;// 38
         case 4:
            return Class138.field575;// 329
         case 5:
         case 6:
         default:
            throw new RuntimeException("Unknown or invalid constant type at " + this.field1);// 148
         case 7:
            return Class138.field588;// 269
         case 8:
            return Class138.field593;// 28
      }
   }

   // $VF: synthetic method
   @Override
   public void method10 (Class471 var1) {
      var1.method1094(this);
      var1.method1196(this);// 470
      var1.method1136(this);// 149
      var1.method1135(this);// 157
      var1.method1231(this);// 24
      var1.method1061(this);// 286 386
   }// 600

   // $VF: synthetic method
   public ldc () {
   }// 530

   // $VF: synthetic method
   @Override
   public void method3(DataOutputStream var1) {
      var1.writeByte(this.field3);// 534
      if (this.field1 == 2) {// 488
         var1.writeByte(this.field1);// 495
      } else {
         var1.writeShort(this.field1);// 493
      }
   }// 159 377
}
