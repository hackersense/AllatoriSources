package mapped;

// $VF: Compiled from kx
public class Class368 implements Class360 {
   // $VF: synthetic field
   public static String field1155 = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ";
   // $VF: synthetic field
   public long field1156 = 0L;
   // $VF: synthetic field
   public static int field1157 = field1155.length();

   // $VF: synthetic method
   @Override
   public void method709() {
      this.field1156 = 0L;// 389
   }// 18

   // $VF: synthetic method
   @Override
   public String method710() {
      String var7 = "";// 537
      long var2 = this.field1156;// 222
      int var4 = 1;// 10
      long var5 = (long)field1157;// 7

      for (long var10000 = var2; var10000 >= var5; var10000 = var2) {// 335
         var4++;// 557
         var2 -= var5;
         var5 *= (long)field1157;// 34
      }

      for (int var9 = var8 = 0; var9 < var4; var9 = var8) {// 30
         var7 = var7 + field1155.charAt((int)(var2 % (long)field1157));// 143
         var8++;
         var2 /= (long)field1157;// 252
      }

      this.field1156++;// 239
      return var7;// 310
   }
}
