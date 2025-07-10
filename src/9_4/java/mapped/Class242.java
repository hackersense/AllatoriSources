package mapped;

// $VF: Compiled from im
public final class Class242 extends RuntimeException {
   // $VF: synthetic field
   public String field834;

   // $VF: synthetic method
   public Class242() {
   }// 409

   // $VF: synthetic method
   public String getMessage() {
      return this.field834;// 184
   }

   // $VF: synthetic method
   public Class242(String var1) {
      String var3;
      super(var3 = "INTERNAL ERROR: " + var1);
      this.field834 = var3;// 491 530
   }// 147

   // $VF: synthetic method
   public void method427(String var1, String var2) {
      String var3 = var2;
      if (var1 == null) {// 226
         var1 = "";// 123
      }

      if (this.field834 == null) {// 418
         this.field834 = "";// 533
      }

      if (var2 == null) {// 406
         var3 = "";// 1
      }

      this.field834 = var1 + this.field834 + var3;// 170
   }// 553

   // $VF: synthetic method
   public static void main(String[] var0) {
      Class242 var10000 = new Class242("Oops!");// 377
      var10000.method427("\nFOUND:\n\t", "\nExiting!!\n");// 604
      throw var10000;// 22
   }
}
