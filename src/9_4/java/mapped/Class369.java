package mapped;

// $VF: Compiled from wp
public class Class369 implements Class360 {
   // $VF: synthetic field
   public long field1158 = 0L;
   // $VF: synthetic field
   public int field1159;
   // $VF: synthetic field
   public String[] field1160;

   // $VF: synthetic method
   public Class369(String[] var1) {
      this.field1160 = var1;// 537
      this.field1159 = var1.length;// 222 403
   }// 265

   // $VF: synthetic method
   @Override
   public String method710() {
      Class369 var1 = this;
      String var7 = "";// 26
      long var2 = this.field1158;// 52
      int var4 = 1;// 7
      long var5 = (long)this.field1159;// 335

      for (long var10000 = var2; var10000 >= var5; var10000 = var2) {// 507
         var4++;// 34
         var2 -= var5;
         var5 *= (long)var1.field1159;// 332
      }

      for (int var9 = var8 = 0; var9 < var4; var9 = var8) {// 143
         var7 = var7 + var1.field1160[(int)(var2 % (long)var1.field1159)];// 252
         var8++;
         var2 /= (long)var1.field1159;// 20
      }

      var1.field1158++;// 310
      return var7;// 498
   }

   // $VF: synthetic method
   @Override
   public void method709() {
      this.field1158 = 0L;// 18
   }// 513
}
