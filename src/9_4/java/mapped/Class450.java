package mapped;

// $VF: Compiled from ra
public abstract class Class450 {
   // $VF: synthetic field
   public Class450 field1353;
   // $VF: synthetic field
   public final int field1354;

   // $VF: synthetic method
   public void method940(String var1, int var2, String... var3) {
      if (this.field1353 != null) {// 25
         this.field1353.method940(var1, var2, var3);// 31
      }
   }// 115

   // $VF: synthetic method
   public void method941(String var1) {
      if (this.field1353 != null) {// 138
         this.field1353.method941(var1);// 285
      }
   }// 32

   // $VF: synthetic method
   public void method942(String var1) {
      if (this.field1353 != null) {// 555
         this.field1353.method942(var1);// 73
      }
   }// 398

   // $VF: synthetic method
   public Class450 method943() {
      return this.field1353;// 278
   }

   // $VF: synthetic method
   public void method944() {
      if (this.field1353 != null) {// 443
         this.field1353.method944();// 166
      }
   }// 292

   // $VF: synthetic method
   public void method945(String var1) {
      if (this.field1353 != null) {// 424
         this.field1353.method945(var1);// 28
      }
   }// 329

   // $VF: synthetic method
   public static String method946(int var0) {
      return "Unsupported api " + var0;
   }

   // $VF: synthetic method
   public void method947(String var1, int var2, String... var3) {
      if (this.field1353 != null) {// 470
         this.field1353.method947(var1, var2, var3);// 149
      }
   }// 24

   // $VF: synthetic method
   public Class450(int var1, Class450 var2) {
      if (var1 != 589824 && var1 != 524288 && var1 != 458752 && var1 != 393216 && var1 != 327680 && var1 != 262144 && var1 != 17432576) {// 493
         throw new IllegalArgumentException(method946(var1));// 461
      } else {
         if (var1 == 17432576) {// 192
            Class457.method984(this);// 574
         }

         this.field1354 = var1;
         this.field1353 = var2;// 179 321
      }
   }// 146

   // $VF: synthetic method
   public Class450(int var1) {
      this(var1, null);// 170
   }// 553

   // $VF: synthetic method
   public void method948(String var1, int var2, String var3) {
      if (this.field1353 != null) {// 99
         this.field1353.method948(var1, var2, var3);// 160
      }
   }// 63

   // $VF: synthetic method
   public void method949(String var1, String... var2) {
      if (this.field1353 != null) {// 57
         this.field1353.method949(var1, var2);// 169
      }
   }// 299
}
