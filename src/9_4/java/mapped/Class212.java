package mapped;

// $VF: Compiled from ap
public abstract class Class212 implements Cloneable {
   // $VF: synthetic field
   public Double field781;

   // $VF: synthetic method
   public int method147(int var1) {
      return this.method34(1, var1);// 488
   }

   // $VF: synthetic method
   public double method374() {
      if (this.field781 != null) {// 412
         double var7 = this.field781;// 38
         this.field781 = null;// 257
         return var7;// 269
      } else {
         double var1;
         double var3;
         double var5;
         do {
            var1 = this.method376(-1.0, 1.0);// 39
            var3 = this.method376(-1.0, 1.0);// 368
         } while ((var5 = var1 * var1 + var3 * var3) >= 1.0);// 99 160

         var5 = Math.sqrt(-2.0 * Math.log(var5) / var5);// 63
         this.field781 = new Double(var1 * var5);// 541
         return var3 * var5;// 550
      }
   }

   // $VF: synthetic method
   public boolean method101() {
      return this.method226() <= 0.5;// 240
   }

   // $VF: synthetic method
   public int method34(int var1, int var2) {
      int var4;
      if ((var4 = var1 + (int)((double)(var2 - var1) * this.method226())) > var2) {// 144 461
         var4 = var2;// 358
      }

      return var4;// 321
   }

   // $VF: synthetic method
   public Object clone() {
      return super.clone();// 31
   }

   // $VF: synthetic method
   public boolean method375(double var1) {
      return this.method226() <= var1;// 68
   }

   // $VF: synthetic method
   public double method376(double var1, double var3) {
      return var1 + (var3 - var1) * this.method226();// 398
   }

   // $VF: synthetic method
   public void method377(double[] var1) {
      this.method378(var1, var1.length);// 553
   }// 58

   // $VF: synthetic method
   public abstract double method226();

   // $VF: synthetic method
   public void method378(double[] var1, int var2) {
      Class212 var3 = this;

      for (int var10000 = var4 = 0; var10000 < var2; var10000 = var4) {// 141
         int var10001 = var4;
         double var10002 = var3.method226();
         var4++;
         var1[var10001] = var10002;// 580
      }
   }// 226

   // $VF: synthetic method
   public double method379(double var1, double var3) {
      return var3 * Math.pow(this.method226(), 1.0 / (var1 + 1.0));// 116
   }

   // $VF: synthetic method
   public double method380(double var1) {
      return this.method374() * var1;// 450
   }
}
