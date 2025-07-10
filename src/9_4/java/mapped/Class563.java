package mapped;

// $VF: Compiled from rb
public final class Class563 {
   // $VF: synthetic field
   public final String field1977;
   // $VF: synthetic field
   public final String field1978;
   // $VF: synthetic field
   public final int field1979;
   // $VF: synthetic field
   public final boolean field1980;
   // $VF: synthetic field
   public final String field1981;

   // $VF: synthetic method
   public boolean method1806() {
      return this.field1980;// 209
   }

   // $VF: synthetic method
   public static String method1807(String var0, String var1, String var2, int var3, String var4) {
      return var0 + "." + var1 + var2 + " (" + var3 + var4 + ")";
   }

   // $VF: synthetic method
   public int hashCode() {
      return this.field1979 + (this.field1980 ? 64 : 0) + this.field1978.hashCode() * this.field1981.hashCode() * this.field1977.hashCode();// 61 238 423
   }

   // $VF: synthetic method
   public String method1808() {
      return this.field1978;// 39
   }

   // $VF: synthetic method
   @Deprecated
   public Class563(int var1, String var2, String var3, String var4) {
      this(var1, var2, var3, var4, var1 == 9);// 461
   }// 358

   // $VF: synthetic method
   public String method1809() {
      return this.field1981;// 456
   }

   // $VF: synthetic method
   public Class563(int var1, String var2, String var3, String var4, boolean var5) {
      this.field1979 = var1;// 330
      this.field1978 = var2;// 589
      this.field1981 = var3;// 579
      this.field1977 = var4;// 555
      this.field1980 = var5;// 73 391
   }// 415

   // $VF: synthetic method
   public boolean equals(Object var1) {
      if (var1 == this) {// 25
         return true;// 31
      } else if (!(var1 instanceof Class563)) {// 115
         return false;// 223
      } else {
         Class563 var3 = (Class563)var1;// 23
         return this.field1979 == var3.field1979// 440
            && this.field1980 == var3.field1980
            && this.field1978.equals(var3.field1978)// 97
            && this.field1981.equals(var3.field1981)// 411
            && this.field1977.equals(var3.field1977);// 468
      }
   }

   // $VF: synthetic method
   public int method1810() {
      return this.field1979;// 588
   }

   // $VF: synthetic method
   public String method1811() {
      return this.field1977;// 149
   }
}
