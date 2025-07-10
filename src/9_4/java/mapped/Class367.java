package mapped;

// $VF: Compiled from ku
public class Class367 implements Class360 {
   // $VF: synthetic field
   public static final int field1152 = 26;
   // $VF: synthetic field
   public static String field1153 = "abcdefghijklmnopqrstuvwxyz";
   // $VF: synthetic field
   public long field1154 = 0L;

   // $VF: synthetic method
   @Override
   public void method709() {
      this.field1154 = 0L;// 389
   }// 18

   // $VF: synthetic method
   @Override
   public String method710() {
      String var7 = "";// 537
      long var2 = this.field1154;// 222
      int var4 = 1;// 10
      long var5 = 26L;// 7

      for (long var10000 = var2; var10000 >= var5; var10000 = var2) {// 335
         var4++;// 557
         var2 -= var5;
         var5 *= 26L;// 34
      }

      for (int var9 = var8 = 0; var9 < var4; var9 = var8) {// 30
         var7 = var7 + field1153.charAt((int)(var2 % 26L));// 143
         var8++;// 252
         var2 /= 26L;
      }

      this.field1154++;// 239
      return var7;// 310
   }
}
