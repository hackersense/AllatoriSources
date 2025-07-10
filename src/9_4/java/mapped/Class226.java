package mapped;

// $VF: Compiled from xc
public abstract class Class226 extends RuntimeException {
   // $VF: synthetic field
   public String field825;

   // $VF: synthetic method
   public void method427(String var1, String var2) {
      String var3 = var2;
      if (var1 == null) {// 553
         var1 = "";// 58
      }

      if (this.field825 == null) {// 315
         this.field825 = "";// 465
      }

      if (var2 == null) {// 184
         var3 = "";// 534
      }

      this.field825 = var1 + this.field825 + var3;// 495
   }// 159

   // $VF: synthetic method
   public String getMessage() {
      return this.field825;// 6
   }

   // $VF: synthetic method
   public Class226(String var1) {
      super(var1);
      this.field825 = var1;// 226 580
   }// 123

   // $VF: synthetic method
   public Class226() {
   }// 295
}
