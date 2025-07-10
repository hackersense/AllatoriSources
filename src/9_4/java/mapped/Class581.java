package mapped;

// $VF: Compiled from jj
public class Class581 {
   // $VF: synthetic field
   public static final int field2334 = 2;
   // $VF: synthetic field
   public static final Class581 field2335 = new Class581(0, "Not yet verified.");
   // $VF: synthetic field
   public static final String field2336 = "Passed verification.";
   // $VF: synthetic field
   public int field2337;
   // $VF: synthetic field
   public static final int field2338 = 1;
   // $VF: synthetic field
   public static final int field2339 = 0;
   // $VF: synthetic field
   public static final Class581 field2340 = new Class581(1, "Passed verification.");
   // $VF: synthetic field
   public static final String field2341 = "Not yet verified.";
   // $VF: synthetic field
   public String field2342;

   // $VF: synthetic method
   public Class581(int var1, String var2) {
      this.field2337 = var1;// 465
      this.field2342 = var2;// 132 315
   }// 184

   // $VF: synthetic method
   public int method1942() {
      return this.field2337;// 493
   }

   // $VF: synthetic method
   public int hashCode() {
      return this.field2337 ^ this.field2342.hashCode();// 179
   }

   // $VF: synthetic method
   public String method1943() {
      return this.field2342;// 144
   }

   // $VF: synthetic method
   public boolean equals(Object var1) {
      Class581 var3;
      return !(var1 instanceof Class581) ? false : (var3 = (Class581)var1).field2337 == this.field2337 && var3.field2342.equals(this.field2342);// 466 467 552 603
   }
}
