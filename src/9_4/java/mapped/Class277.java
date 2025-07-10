package mapped;

import java.io.DataOutputStream;

// $VF: Compiled from gk
public abstract class Class277 extends Class10 implements Class16, Class278 {
   // $VF: synthetic field
   public short field910;
   // $VF: synthetic field
   public int field911 = -1;
   // $VF: synthetic field
   public short field912 = -1;

   // $VF: synthetic method
   public Class277() {
      this.field910 = -1;// 58
   }// 190

   // $VF: synthetic method
   @Override
   public void method6(int var1) {
      if (var1 >= 0 && var1 <= 65535) {// 108
         this.field911 = var1;// 94
         if (var1 >= 0 && var1 <= 3) {// 209
            this.field3 = (short)(this.field912 + var1);
            this.field4 = 1;// 69 116
         } else {
            this.field3 = this.field910;// 464
            if (this.method101()) {// 25
               this.field4 = 4;// 31
            } else {
               this.field4 = 2;// 115
            }
         }
      } else {
         throw new Class241("Illegal value: " + var1);// 27
      }
   }// 21 23 422

   // $VF: synthetic method
   @Override
   public Class138 method1(Class221 var1) {
      switch (this.field910) {// 57
         case 21:
         case 54:
            while (false) {
            }

            return Class138.field591;// 299
         case 22:
         case 55:
            return Class138.field578;// 50
         case 23:
         case 56:
            return Class138.field575;// 434
         case 24:
         case 57:
            return Class138.field576;// 474
         case 25:
         case 58:
            return Class138.field583;// 72
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
         default:
            throw new Class241("Oops: unknown case in switch" + this.field910);// 497
      }
   }

   // $VF: synthetic method
   @Override
   public void method3(DataOutputStream var1) {
      if (this.method101()) {// 321
         var1.writeByte(196);// 179
      }

      var1.writeByte(this.field3);// 567
      if (this.field4 > 1) {// 400
         if (this.method101()) {// 33
            var1.writeShort(this.field911);// 0
            return;// 240
         }

         var1.writeByte(this.field911);// 246
      }
   }// 278

   // $VF: synthetic method
   public Class277(short var1, short var2) {
      this.field910 = -1;
      this.field910 = var1;// 78
      this.field912 = var2;// 123 418
   }// 533

   // $VF: synthetic method
   @Override
   public final int method2() {
      return this.field911;// 450
   }

   // $VF: synthetic method
   @Override
   public void method7(Class437 var1, boolean var2) {
      if (var2) {// 257
         this.field911 = var1.readUnsignedShort();
         this.field4 = 4;// 269 455
      } else if ((this.field3 < 21 || this.field3 > 25) && (this.field3 < 54 || this.field3 > 58)) {
         if (this.field3 <= 45) {
            this.field911 = (this.field3 - 26) % 4;
            this.field4 = 1;// 99 160
         } else {
            this.field911 = (this.field3 - 59) % 4;
            this.field4 = 1;// 63 541
         }
      } else {
         this.field911 = var1.readUnsignedByte();
         this.field4 = 2;// 39 142
      }
   }// 40 148 368 510

   // $VF: synthetic method
   public final boolean method101() {
      return this.field911 > 255;// 530
   }

   // $VF: synthetic method
   public short method523() {
      return this.field910;// 138
   }

   // $VF: synthetic method
   public Class277(short var1, short var2, int var3) {
      super(var1, (short)2);
      this.field910 = -1;// 18
      this.field912 = var2;// 561
      this.field910 = var1;// 377
      this.method6(var3);// 493 604
   }// 22

   // $VF: synthetic method
   @Override
   public String method4(boolean var1) {
      return (this.field3 < 26 || this.field3 > 45) && (this.field3 < 59 || this.field3 > 78)// 398
         ? new StringBuilder().insert(0, super.method4(var1)).append(" ").append(this.field911).toString()// 399
         : super.method4(var1);// 87
   }
}
