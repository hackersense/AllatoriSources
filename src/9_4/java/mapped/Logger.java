package mapped;

// $VF: Compiled from cz
public class Logger {
   // $VF: synthetic field
   public static boolean silent = false;

   // $VF: synthetic method
   public static void setSilent (boolean var0) {
      silent = var0;// 134
   }// 26

   // $VF: synthetic method
   public static void info (String var0) {
      if (!silent) {// 332
         System.out.println("[INFO] " + var0);// 260
      }
   }// 30

   // $VF: synthetic method
   public static void warning (String var0) {
      if (!silent) {// 20
         Class559.field1965.append("[WARNING] " + var0 + "\n");// 204
         System.out.println("[WARNING] " + var0);// 239
      }
   }// 310

   // $VF: synthetic method
   public static void error (String var0) {
      Class559.field1965.append("[ERROR] " + var0 + "\n");// 409
      System.out.println("[ERROR] " + var0);// 389
   }// 18

   // $VF: synthetic method
   public static boolean isSilent () {
      return silent;// 537
   }

   /**
    * Nobody calls it?
    */
   // $VF: synthetic method
   public static void debug (String var0) {
      if (!silent) {// 7
         System.out.println("[DEBUG] " + var0);// 335
      }
   }// 507
}
