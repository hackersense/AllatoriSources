package mapped;

import java.io.DataOutputStream;

// $VF: Compiled from yn
public abstract class Class113 extends Class90 implements Class111, Class3 {
   // $VF: synthetic field
   public int[] field14;
   // $VF: synthetic field
   public int field15 = 0;
   // $VF: synthetic field
   public int field16;
   // $VF: synthetic field
   public int[] field17;
   // $VF: synthetic field
   public Class246[] field18;
   // $VF: synthetic field
   public int field19;

   // $VF: synthetic method
   @Override
   public void method7(Class437 var1, boolean var2) {
      Class437 var3 = var1;
      Class113 var4 = this;
      int var6 = 0;
      this.field15 = (4 - var1.method873() % 4) % 4;// 412

      for (int var5 = 0; var6 < var4.field15; var6 = var5) {// 38
         var5++;
         var3.readByte();// 257
      }

      var4.field13 = var3.readInt();// 148
   }// 236

   // $VF: synthetic method
   public void method38(int var1, Class246 var2) {
      method35(this.field18[var1], var2, this);// 94
      this.field18[var1] = var2;// 209
   }// 69

   // $VF: synthetic method
   public Class246[] method39() {
      return this.field18;// 300
   }

   // $VF: synthetic method
   public int[] method40() {
      return this.field14;// 110
   }

   // $VF: synthetic method
   @Override
   public void method3(DataOutputStream var1) {
      DataOutputStream var3 = var1;
      Class113 var4 = this;
      int var5 = 0;
      var1.writeByte(this.field19);// 415

      for (int var2 = 0; var5 < var4.field15; var5 = var2) {// 398
         var2++;
         var3.writeByte(0);// 428
      }

      var4.field13 = var4.method2();// 586
      var3.writeInt(var4.field13);// 399
   }// 232

   // $VF: synthetic method
   public Class113(short var1, int[] var2, Class246[] var3, Class246 var4) {
      Class246[] var5 = var3;
      Class113 var7 = this;
      int var8 = 0;
      super(var1, var4);
      this.field15 = 0;// 295
      this.field18 = var3;// 132 465

      for (int var6 = 0; var8 < var5.length; var8 = var6) {// 184
         method35(null, var5[var6++], var7);// 534
      }

      if ((var7.field19 = (var7.field17 = var2).length) != var5.length) {// 159 495
         throw new Class241("Match and target array have not the same length");// 493
      } else {
         var7.field14 = new int[var7.field19];// 377
      }
   }// 604

   // $VF: synthetic method
   @Override
   public void method28(Class246 var1, Class246 var2) {
      Class113 var4 = this;
      boolean var3 = false;// 223
      if (this.field19 == var1) {// 45
         var3 = true;// 23
         this.method29(var2);// 440
      }

      for (int var10000 = var5 = 0; var10000 < var4.field18.length; var10000 = ++var5) {// 97
         if (var4.field18[var5] == var1) {// 411
            var3 = true;// 468
            var4.method38(var5, var2);// 138
         }
      }

      if (!var3) {// 32
         throw new Class241("Not targeting " + var1);// 238
      }
   }// 61

   // $VF: synthetic method
   @Override
   public int method34(int var1, int var2) {
      this.field18 += var1;// 246
      short var4 = this.field13;// 552
      this.field15 = (4 - (this.field18 + 1) % 4) % 4;// 466
      this.field13 = (short)(this.field16 + this.field15);// 467
      return this.field13 - var4;// 485
   }

   // $VF: synthetic method
   @Override
   public void method19() {
      Class113 var1 = this;
      int var10000 = 0;
      super.method19();// 385

      for (int var2 = 0; var10000 < var1.field18.length; var10000 = var2) {// 471
         var1.field18[var2++].method430(var1);// 270
      }
   }// 177

   // $VF: synthetic method
   public Object clone() {
      Class113 var2;
      (var2 = (Class113)super.clone()).field17 = (int[])this.field17.clone();// 292 373
      var2.field14 = (int[])this.field14.clone();// 72
      var2.field18 = (Class246[])this.field18.clone();// 268
      return var2;// 497
   }

   // $VF: synthetic method
   public int[] method41() {
      return this.field17;// 227
   }

   // $VF: synthetic method
   public Class113() {
   }// 78

   // $VF: synthetic method
   @Override
   public boolean method31(Class246 var1) {
      Class113 var2 = this;
      if (this.field19 == var1) {// 57
         return true;// 169
      } else {
         for (int var10000 = var3 = 0; var10000 < var2.field18.length; var10000 = ++var3) {// 299
            if (var2.field18[var3] == var1) {// 314
               return true;// 137
            }
         }

         return false;// 135
      }
   }

   // $VF: synthetic method
   @Override
   public String method4(boolean var1) {
      Class113 var6 = this;
      StringBuffer var2 = new StringBuffer(super.method4(var1));// 63
      int var5;
      if (var1) {// 541
         for (int var7 = var5 = 0; var7 < var6.field19; var7 = var5) {// 550
            String var3 = "null";// 510
            if (var6.field18[var5] != null) {// 456
               var3 = var6.field18[var5].method18().toString();// 367
            }

            StringBuffer var8 = var2.append("(").append(var6.field17[var5]).append(", ").append(var3).append(" = {").append(var6.field14[var5]);// 83
            var5++;
            var8.append("})");
         }
      } else {
         var2.append(" ...");// 386
      }

      return var2.toString();// 149
   }
}
