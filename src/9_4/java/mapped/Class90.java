package mapped;

import java.io.DataOutputStream;

// $VF: Compiled from sl
public abstract class Class90 extends Class10 implements Class200 {
   // $VF: synthetic field
   public int field11;
   // $VF: synthetic field
   public Class246 field12;
   // $VF: synthetic field
   public int field13;

   // $VF: synthetic method
   @Override
   public void method28(Class246 var1, Class246 var2) {
      if (this.field12 == var1) {// 15
         this.method29(var2);// 385
      } else {
         throw new Class241("Not targeting " + var1 + ", but " + this.field12);// 270
      }
   }// 471

   // $VF: synthetic method
   @Override
   public void method7(Class437 var1, boolean var2) {
      this.field13 = 3;
      this.field13 = var1.readShort();// 25 464
   }// 31

   // $VF: synthetic method
   public void method29(Class246 var1) {
      method35(this.field12, var1, this);
      this.field12 = var1;// 57 169
   }// 216

   // $VF: synthetic method
   public final int method30() {
      return this.field13;// 248
   }

   // $VF: synthetic method
   @Override
   public boolean method31(Class246 var1) {
      return this.field12 == var1;// 227
   }

   // $VF: synthetic method
   public Class246 method32() {
      return this.field12;// 238
   }

   // $VF: synthetic method
   @Override
   public void method3(DataOutputStream var1) {
      var1.writeByte(this.field12);// 465
      this.field13 = this.method2();// 132
      if (Math.abs(this.field13) >= 32767) {// 184
         throw new Class241("Branch target offset too large for short");// 534
      } else {
         var1.writeShort(this.field13);// 495
      }
   }// 159

   // $VF: synthetic method
   public int method33(Class246 var1) {
      if (var1 == null) {// 461
         throw new Class241("Target of " + super.method4(true) + " is invalid null handle");// 358
      } else {
         int var3;
         if ((var3 = var1.method2()) < 0) {// 272 321
            throw new Class241("Invalid branch target position offset for " + super.method4(true) + ":" + var3 + ":" + var1);// 179
         } else {
            return var3 - this.field11;// 400
         }
      }
   }

   // $VF: synthetic method
   public int method34(int var1, int var2) {
      this.field11 += var1;// 586
      return 0;// 399
   }

   // $VF: synthetic method
   public int method2() {
      return this.method33(this.field12);// 466
   }

   // $VF: synthetic method
   public Class90() {
   }// 273

   // $VF: synthetic method
   @Override
   public void method19() {
      this.method29(null);
      this.field13 = -1;// 221
      this.field11 = -1;// 110 444
   }// 601

   // $VF: synthetic method
   public Class90(short var1, Class246 var2) {
      super(var1, (short)3);
      this.method29(var2);// 185 533
   }// 406

   // $VF: synthetic method
   public static final void method35(Class246 var0, Class246 var1, Class200 var2) {
      if (var0 != null) {// 443
         var0.method430(var2);// 166
      }

      if (var1 != null) {// 292
         var1.method438(var2);// 373
      }
   }// 268

   // $VF: synthetic method
   @Override
   public String method4(boolean var1) {
      String var2 = super.method4(var1);// 39
      String var4 = "null";// 368
      if (var1) {// 99
         if (this.field12 != null) {// 160
            if (this.field12.method18() == this) {// 40
               var4 = "<points to itself>";// 63
            } else if (this.field12.method18() == null) {// 541
               var4 = "<null instruction!!!?>";// 550
            } else {
               var4 = this.field12.method18().method4(false);// 456
            }
         }
      } else if (this.field12 != null) {// 5
         this.field13 = this.method2();// 279
         var4 = "" + (this.field13 + this.field11);// 450
      }

      return var2 + " -> " + var4;// 149
   }
}
