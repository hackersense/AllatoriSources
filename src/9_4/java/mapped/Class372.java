package mapped;

// $VF: Compiled from ox
public class Class372 implements Class360 {
   // $VF: synthetic field
   public static String field1163 = "IiiIiIiiII";
   // $VF: synthetic field
   public long field1164 = 0L;
   // $VF: synthetic field
   public static int field1165 = 10;

   // $VF: synthetic method
   @Override
   public String method710() {
      String var4;
      String var10000 = var4 = Long.toBinaryString(this.field1164++);// 34

      while (var10000.length() < field1165) {// 332
         var10000 = var4 = '0' + var4;
      }

      StringBuilder var2 = new StringBuilder(var4.length());// 260

      int var3;
      for (int var5 = var3 = 0; var5 < var4.length(); var5 = ++var3) {// 30
         if (var3 % 2 == 0) {// 143
            var2.append((char)(var4.charAt(var3) == '0' ? 'i' : 'I'));// 252
         } else {
            var2.insert(0, (char)(var4.charAt(var3) == '0' ? 'i' : 'I'));// 204
         }
      }

      return var2.toString();// 239
   }

   // $VF: synthetic method
   public static void method711(int var0) {
      if (var0 > field1165) {// 537
         field1165 = var0;
      }
   }// 222

   // $VF: synthetic method
   @Override
   public void method709() {
      this.field1164 = 0L;// 409
   }// 389

   // $VF: synthetic method
   public static void method712(String var0) {
      field1163 = var0;// 7
   }// 335

   // $VF: synthetic method
   public static String method713() {
      return field1163;// 134
   }
}
