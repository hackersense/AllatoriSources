package mapped;

// $VF: Compiled from cz
public class Class528 {
   // $VF: synthetic field
   public static boolean field1785 = false;

   // $VF: synthetic method
   public static void method1556(boolean var0) {
      field1785 = var0;// 134
   }// 26

   // $VF: synthetic method
   public static void method1557(String var0) {
      if (!field1785) {// 332
         System.out.println("[INFO] " + var0);// 260
      }
   }// 30

   // $VF: synthetic method
   public static void method1558(String var0) {
      if (!field1785) {// 20
         Class559.field1965.append("[WARNING] " + var0 + "\n");// 204
         System.out.println("[WARNING] " + var0);// 239
      }
   }// 310

   // $VF: synthetic method
   public static void method1559(String var0) {
      Class559.field1965.append("[ERROR] " + var0 + "\n");// 409
      System.out.println("[ERROR] " + var0);// 389
   }// 18

   // $VF: synthetic method
   public static boolean method1560() {
      return field1785;// 537
   }

   // $VF: synthetic method
   public static void method1561(String var0) {
      if (!field1785) {// 7
         System.out.println("[DEBUG] " + var0);// 335
      }
   }// 507
}
