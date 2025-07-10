package mapped;

// $VF: Compiled from zb
public abstract class Class353 {
   // $VF: synthetic field
   public final int field1051;
   // $VF: synthetic field
   public Class353 field1052;

   // $VF: synthetic method
   public void method653(String var1, Object var2) {
      if (this.field1052 != null) {// 232
         this.field1052.method653(var1, var2);// 463
      }
   }// 424

   // $VF: synthetic method
   public Class353 method654() {
      return this.field1052;// 485
   }

   // $VF: synthetic method
   public void method655(String var1, String var2, String var3) {
      if (this.field1052 != null) {// 236
         this.field1052.method655(var1, var2, var3);// 142
      }
   }// 368

   // $VF: synthetic method
   public Class353 method656(String var1, String var2) {
      return this.field1052 != null ? this.field1052.method656(var1, var2) : null;// 5 279 386
   }

   // $VF: synthetic method
   public static String method657(int var0) {
      return "Unsupported api " + var0;
   }

   // $VF: synthetic method
   public Class353(int var1, Class353 var2) {
      if (var1 != 589824 && var1 != 524288 && var1 != 458752 && var1 != 393216 && var1 != 327680 && var1 != 262144 && var1 != 17432576) {// 377
         throw new IllegalArgumentException(method657(var1));// 192
      } else {
         if (var1 == 17432576) {// 272
            Class457.method984(this);// 321
         }

         this.field1051 = var1;
         this.field1052 = var2;// 146 567
      }
   }// 400

   // $VF: synthetic method
   public Class353 method658(String var1) {
      return this.field1052 != null ? this.field1052.method658(var1) : null;// 21 25 464
   }

   // $VF: synthetic method
   public void method659() {
      if (this.field1052 != null) {// 440
         this.field1052.method659();// 248
      }
   }// 411

   // $VF: synthetic method
   public Class353(int var1) {
      this(var1, null);// 58
   }// 190
}
