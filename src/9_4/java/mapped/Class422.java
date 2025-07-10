package mapped;

// $VF: Compiled from wv
public class Class422 implements Class418 {
   // $VF: synthetic field
   public Class338 field1241;

   // $VF: synthetic method
   @Override
   public void method838() {
   }// 409

   // $VF: synthetic method
   @Override
   public void method839(Class206 var1) {
      if (Class580.method1925().method938(this.field1241, var1)) {// 335
         String var6 = "toString";// 507
         String var5 = "()Ljava/lang/String;";// 557

         int var3;
         Class208[] var4;
         for (int var10000 = var3 = (var4 = var1.method341()).length - 1; var10000 >= 0; var10000 = --var3) {// 34 332
            Class208 var7 = var4[var3];// 260
            if (var6.equals(var7.method190()) && var5.equals(var7.method20())) {// 30
               var1.method356(var7);// 143
               return;// 252
            }
         }
      }
   }// 310

   // $VF: synthetic method
   public Class422(Class338 var1) {
      this.field1241 = var1;// 26 134
   }// 52
}
