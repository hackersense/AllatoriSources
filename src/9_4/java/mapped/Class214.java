package mapped;

import java.io.Serializable;
import java.util.Date;

// $VF: Compiled from oo
public class Class214 extends Class213 implements Serializable {
   // $VF: synthetic field
   public double[] field782;
   // $VF: synthetic field
   public int field783;
   // $VF: synthetic field
   public double field784;
   // $VF: synthetic field
   public static int field785 = 54217137;
   // $VF: synthetic field
   public double[] field786;
   // $VF: synthetic field
   public static int field787 = 899999963;
   // $VF: synthetic field
   public double field788;
   // $VF: synthetic field
   public double field789;
   // $VF: synthetic field
   public int field790;

   // $VF: synthetic method
   public Class214(Date var1) {
      this.method6((int)method381(var1) % field787);// 278 467
   }// 485

   // $VF: synthetic method
   public Class214(long var1) {
      this.method6((int)Math.abs(var1 % (long)field787));// 377 604
   }// 22

   // $VF: synthetic method
   public void method6(int var1) {
      Class214 var2 = this;
      this.field782 = new double[97];
      this.field786 = new double[97];// 87 586
      int var12 = var1 / 30082;// 463
      var1 -= 30082 * var12;// 198
      int var5 = var12 / 177 % 177 + 2;// 28
      int var13 = var12 % 177 + 2;// 588
      int var3 = var1 / 169 % 178 + 1;// 329
      int var6 = var1 % 169;// 412

      for (int var10000 = var1 = 0; var10000 < 97; var10000 = var1) {// 38
         double var8 = 0.0;// 257
         double var10 = 0.5;// 269

         int var4;
         for (int var16 = var4 = 0; var16 < 24; var16 = var4) {// 455
            int var7 = var5 * var13 % 179 * var3 % 179;// 148
            var5 = var13;// 236
            var13 = var3;// 142
            var3 = var7;// 39
            if ((var6 = (53 * var6 + 1) % 169) * var7 % 64 >= 32) {// 99 368
               var8 += var10;
            }

            var4++;// 160
            var10 *= 0.5;
         }

         var2.field782[var1++] = var8;// 63
      }

      var2.field784 = 0.021602869033813477;
      var2.field788 = 0.45623308420181274;// 510
      var2.field789 = 0.9999998211860657;// 456
      var2.field783 = 96;// 367
      var2.field790 = 32;// 82 550
   }// 5

   // $VF: synthetic method
   @Override
   public final void method378(double[] var1, int var2) {
      Class214 var5 = this;

      for (int var10000 = var6 = 0; var10000 < var2; var10000 = var6) {// 119
         double var3;
         if ((var3 = var5.field782[var5.field783] - var5.field782[var5.field790]) < 0.0) {// 32 238
            var3++;
         }

         var5.field782[var5.field783] = var3;// 423
         if (--var5.field783 < 0) {// 61
            var5.field783 = 96;
         }

         if (--var5.field790 < 0) {// 525
            var5.field790 = 96;
         }

         var5.field784 = var5.field784 - var5.field788;// 220
         if (var5.field784 < 0.0) {// 593
            var5.field784 = var5.field784 + var5.field789;
         }

         if ((var3 = var3 - var5.field784) < 0.0) {// 336 540
            var3++;
         }

         var1[var6++] = var3;// 291
      }
   }// 216

   // $VF: synthetic method
   public Class214(int var1) {
      this.method6(Math.abs(var1 % field787));// 315 465
   }// 132

   // $VF: synthetic method
   public Class214() {
      this.method6(field785);// 272 574
   }// 321

   // $VF: synthetic method
   @Override
   public final double method226() {
      double var1;
      if ((var1 = this.field782[this.field783] - this.field782[this.field790]) < 0.0) {// 27 242
         var1++;
      }

      this.field782[this.field783] = var1;// 94
      if (--this.field783 < 0) {// 209
         this.field783 = 96;
      }

      if (--this.field790 < 0) {// 69
         this.field790 = 96;
      }

      this.field784 = this.field784 - this.field788;// 116
      if (this.field784 < 0.0) {// 422
         this.field784 = this.field784 + this.field789;
      }

      if ((var1 = var1 - this.field784) < 0.0) {// 25 464
         var1++;
      }

      return var1;// 31
   }
}
