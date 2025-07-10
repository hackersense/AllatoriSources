package mapped;

// $VF: Compiled from wt
public class Class427 implements Class418 {
   // $VF: synthetic field
   public Class338 field1248;

   // $VF: synthetic method
   @Override
   public void method838() {
   }// 151

   // $VF: synthetic method
   public Class427(Class338 var1) {
      this.field1248 = var1;// 26 52
   }// 10

   // $VF: synthetic method
   @Override
   public void method839(Class206 var1) {
      Class427 var2 = this;

      try {
         int var3;
         Class207[] var4;
         for (int var10000 = var3 = (var4 = var1.method346()).length - 1; var10000 >= 0; var10000 = --var3) {// 34 557
            Class207 var7 = var4[var3];// 332
            if (Class580.method1939().method1473(var2.field1248, var1, var7)) {// 260
               var7.method240(true);// 30
            }
         }

         for (int var8 = (var9 = var1.method341()).length - 1; var8 >= 0; var8--) {// 20 252
            Class208 var5 = var9[var8];// 204
            if (Class580.method1939().method1475(var2.field1248, var1, var5)) {// 239
               var5.method240(true);// 310
            }
         }
      } catch (Exception var6) {// 484
         var6.printStackTrace();// 409
      }
   }// 18
}
