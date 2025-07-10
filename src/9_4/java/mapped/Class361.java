package mapped;

// $VF: Compiled from vq
public class Class361 implements Class360 {
   // $VF: synthetic field
   public long field1136 = 0L;
   // $VF: synthetic field
   public static String field1137 = "0123456789";
   // $VF: synthetic field
   public static final int field1138 = 10;

   // $VF: synthetic method
   @Override
   public String method710() {
      String var7 = "";// 537
      long var2 = this.field1136;// 222
      int var4 = 1;// 10
      long var5 = 10L;// 7

      for (long var10000 = var2; var10000 >= var5; var10000 = var2) {// 335
         var4++;// 557
         var2 -= var5;
         var5 *= 10L;// 34
      }

      for (int var9 = var8 = 0; var9 < var4; var9 = var8) {// 30
         var7 = var7 + field1137.charAt((int)(var2 % 10L));// 143
         var8++;// 252
         var2 /= 10L;
      }

      this.field1136++;// 239
      return var7;// 310
   }

   // $VF: synthetic method
   @Override
   public void method709() {
      this.field1136 = 0L;// 389
   }// 18
}
