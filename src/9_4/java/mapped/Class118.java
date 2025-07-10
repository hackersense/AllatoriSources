package mapped;

// $VF: Compiled from tn
public final class Class118 implements Class117 {
   // $VF: synthetic field
   public Class113 field21;
   // $VF: synthetic field
   public int[] field22;
   // $VF: synthetic field
   public int field23;
   // $VF: synthetic field
   public Class246[] field24;

   // $VF: synthetic method
   public final void method43(int var1, int var2) {
      Class118 var4 = this;
      int var3 = var1;// 555
      int var7 = var2;
      int var6 = this.field22[(var1 + var2) / 2];// 73

      do {
         for (Class118 var10000 = var4; var10000.field22[var3] < var6; var3++) {// 428
            var10000 = var4;// 87
         }

         for (int var9 = var6; var9 < var4.field22[var7]; var7--) {// 399
            var9 = var6;// 232
         }

         if (var3 <= var7) {// 198
            int var5 = var4.field22[var3];// 424
            var4.field22[var3] = var4.field22[var7];// 28
            var4.field22[var7] = var5;// 588
            Class246 var8 = var4.field24[var3];// 329
            var4.field24[var3] = var4.field24[var7];// 412
            var3++;// 257
            var4.field24[var7] = var8;// 38
            var7--;// 269
         }
      } while (var3 <= var7);// 148

      if (var1 < var7) {// 236
         var4.method43(var1, var7);// 142
      }

      if (var3 < var2) {// 368
         var4.method43(var3, var2);// 99
      }
   }// 40

   // $VF: synthetic method
   public Class118(int[] var1, Class246[] var2, Class246 var3) {
      this(var1, var2, var3, 1);// 159
   }// 493

   // $VF: synthetic method
   @Override
   public final Class251 method42() {
      return new Class251((Class90)this.field21);// 286
   }

   // $VF: synthetic method
   public Class118(int[] var1, Class246[] var2, Class246 var3, int var4) {
      this.field22 = (int[])var1.clone();// 78 418
      this.field24 = (Class246[])var2.clone();// 533
      if ((this.field23 = var1.length) < 2) {// 185
         this.field21 = new Class115(var1, var2, var3);// 406
      } else {
         this.method43(0, this.field23 - 1);
         if (this.method44(var4)) {// 46 170
            this.method38(var4, var3);// 553
            this.field21 = new Class115(this.field22, this.field24, var3);// 58
         } else {
            this.field21 = new Class114(this.field22, this.field24, var3);// 315
         }
      }
   }// 1 184 190

   // $VF: synthetic method
   public final boolean method44(int var1) {
      Class118 var2 = this;

      for (int var10000 = var3 = 1; var10000 < var2.field23; var10000 = ++var3) {// 82
         if (var2.field22[var3] - var2.field22[var3 - 1] > var1) {// 83
            return false;// 5
         }
      }

      return true;// 386
   }

   // $VF: synthetic method
   public final void method38(int var1, Class246 var2) {
      Class118 var12 = this;
      int var10;
      int[] var4 = new int[var10 = this.field23 + this.field23 * var1];// 6 22
      Class246[] var11 = new Class246[var10];// 144
      int var3 = 1;// 461
      int var13 = 1;
      var4[0] = this.field22[0];// 358
      var11[0] = this.field24[0];// 192

      for (int var5 = 1; var13 < var12.field23; var13 = ++var5) {// 574
         int var6 = var12.field22[var5 - 1];// 272
         int var7 = var12.field22[var5] - var6;// 321

         int var8;
         for (int var14 = var8 = 1; var14 < var7; var14 = ++var8) {// 179
            int var10001 = var3;
            var4[var3] = var6 + var8;// 146
            var3++;// 400
            var11[var10001] = var2;// 567
         }

         var4[var3] = var12.field22[var5];// 0
         int var15 = var3;
         Class246 var10002 = var12.field24[var5];
         var3++;// 246
         var11[var15] = var10002;// 240
      }

      var12.field22 = new int[var3];// 603
      var12.field24 = new Class246[var3];// 278
      System.arraycopy(var4, 0, var12.field22, 0, var3);// 466
      System.arraycopy(var11, 0, var12.field24, 0, var3);// 467
   }// 485

   // $VF: synthetic method
   public final Class10 method18() {
      return this.field21;// 94
   }
}
