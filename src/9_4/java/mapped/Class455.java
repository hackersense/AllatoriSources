package mapped;

// $VF: Compiled from oa
public abstract class Class455 {
   // $VF: synthetic field
   public final int field1379;
   // $VF: synthetic field
   public Class455 field1380;

   // $VF: synthetic method
   public Class455(int var1, Class455 var2) {
      if (var1 != 589824 && var1 != 524288 && var1 != 458752 && var1 != 393216 && var1 != 327680 && var1 != 262144 && var1 != 17432576) {// 493
         throw new IllegalArgumentException(method970(var1));// 461
      } else {
         if (var1 == 17432576) {// 192
            Class457.method984(this);// 574
         }

         this.field1379 = var1;
         this.field1380 = var2;// 179 321
      }
   }// 146

   // $VF: synthetic method
   public static String method970(int var0) {
      return "Unsupported api " + var0;
   }

   // $VF: synthetic method
   public Class455 method971() {
      return this.field1380;// 278
   }

   // $VF: synthetic method
   public void method972(Class534 var1) {
      if (this.field1380 != null) {// 279
         this.field1380.method972(var1);// 450
      }
   }// 470

   // $VF: synthetic method
   public void method973() {
      if (this.field1380 != null) {// 27
         this.field1380.method973();// 242
      }
   }// 209

   // $VF: synthetic method
   public Class455(int var1) {
      this(var1, null);// 170
   }// 553

   // $VF: synthetic method
   public Class353 method974(String var1, boolean var2) {
      return this.field1380 != null ? this.field1380.method974(var1, var2) : null;// 87 398 415
   }

   // $VF: synthetic method
   public Class353 method975(int var1, Class573 var2, String var3, boolean var4) {
      return this.field1380 != null ? this.field1380.method975(var1, var2, var3, var4) : null;// 63 99 160
   }
}
