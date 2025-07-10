package mapped;

// $VF: Compiled from or
public class Class430 implements Class418 {
   // $VF: synthetic field
   public Class338 field1281;

   // $VF: synthetic method
   public Class430(Class338 var1) {
      this.field1281 = var1;// 26 134
   }// 52

   // $VF: synthetic method
   @Override
   public void method838() {
   }// 498

   // $VF: synthetic method
   @Override
   public void method839(Class206 var1) {
      Class430 var5 = this;

      try {
         int var2;
         Class206 var4;
         if ((var4 = var5.field1281.method557("com.license4j.HardwareID")) != null && (var2 = var4.method46().method152("resources/d.bfi")) != -1) {// 34 332 507 557
            ((Class191)var4.method46().method174(var2)).method131(Class580.method1933().method1920());// 260
            return;// 20
         }
      } catch (Exception var3) {// 143
         var3.printStackTrace();// 252
      }
   }// 204
}
