package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from yk
public final class Class163 extends Class151 {
   // $VF: synthetic field
   public Class210[] field638;
   // $VF: synthetic field
   public int field639;

   // $VF: synthetic method
   public int method147(int var1) {
      Class163 var3 = this;
      int var7 = 0;// 422
      int var6;
      if ((var6 = this.field639 - 1) < 0) {// 464
         return -1;// 25
      } else {
         int var4 = -1;// 21
         int var5 = -1;

         do {
            int var8 = (var7 + var6) / 2;// 23
            int var2;
            if ((var2 = var3.field638[var8].method2()) == var1) {// 248 440
               return var3.field638[var8].method17();// 97
            }

            int var10000;
            if (var1 < var2) {// 411
               var6 = var8 - 1;// 468
               var10000 = var2;
            } else {
               var7 = var8 + 1;// 285
               var10000 = var2;// 525
            }

            if (var10000 < var1 && var2 > var5) {
               var5 = var2;// 220
               var4 = var8;// 593
            }
         } while (var7 <= var6);// 540

         return var4 < 0 ? -1 : var3.field638[var4].method17();// 137 216 299
      }
   }

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      Class163 var2 = this;// 589
      int var10000 = 0;
      super.method3(var1);
      var1.writeShort(this.field639);// 579

      for (int var3 = 0; var10000 < var2.field639; var10000 = var3) {// 555
         var2.field638[var3++].method3(var1);// 73
      }
   }// 398

   // $VF: synthetic method
   public final Class210[] method197() {
      return this.field638;// 198
   }

   // $VF: synthetic method
   public Class163(Class163 var1) {
      this(var1.method17(), var1.method2(), var1.method197(), var1.method94());// 161
   }// 141

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1021(this);// 246
   }// 552

   // $VF: synthetic method
   public Class163(int var1, int var2, Class210[] var3, Class149 var4) {
      super((byte)4, var1, var2, var4);
      this.method198(var3);// 170 553
   }// 58

   // $VF: synthetic method
   public Class163(int var1, int var2, DataInputStream var3, Class149 var4) {
      Class163 var7 = this;
      this(var1, var2, (Class210[])null, var4);// 604
      this.field639 = var3.readUnsignedShort();// 22
      this.field638 = new Class210[this.field639];// 6

      for (int var8 = var6 = 0; var8 < var7.field639; var8 = var6) {// 144
         Class210[] var9 = var7.field638;// 461
         int var10001 = var6;
         Class210 var10002 = new Class210(var3);
         var6++;
         var9[var10001] = var10002;
      }
   }// 192

   // $VF: synthetic method
   public final int method30() {
      return this.field639;// 15
   }

   // $VF: synthetic method
   public final void method198(Class210[] var1) {
      this.field638 = var1;
      this.field639 = var1 == null ? 0 : var1.length;// 269 455
   }// 148

   // $VF: synthetic method
   @Override
   public Class151 method181(Class149 var1) {
      Class163 var3 = this;
      Class163 var2;
      (var2 = (Class163)this.clone()).field638 = new Class210[this.field639];// 292 373

      for (int var10000 = var4 = 0; var10000 < var3.field639; var10000 = var4) {// 72
         Class210[] var5 = var2.field638;// 268
         int var10001 = var4;
         Class210 var10002 = var3.field638[var4].method270();
         var4++;
         var5[var10001] = var10002;
      }

      var2.field616 = var1;// 66
      return var2;// 536
   }
}
