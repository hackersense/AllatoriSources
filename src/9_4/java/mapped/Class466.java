package mapped;

// $VF: Compiled from tc
public class Class466 extends Class460 {
   // $VF: synthetic field
   public Class205 field1524;
   // $VF: synthetic field
   public boolean field1525 = false;
   // $VF: synthetic field
   public Class149 field1526;

   // $VF: synthetic method
   public boolean method1049() {
      return this.field1525;// 1363
   }

   // $VF: synthetic method
   public Class466(Class205 var1) {
      this.field1524 = var1;// 1193 1473
      this.field1526 = this.field1524.method94();// 1612
      new Class464(this.field1524, this).method1040();// 1419
   }// 1299

   // $VF: synthetic method
   @Override
   public void method1025(Class182 var1) {
      Class178 var3;
      if ((var3 = this.field1526.method174(var1.method2())) instanceof Class191) {// 1447 1607
         String var4 = ((Class191)var3).method20();// 1431
         if (var4.startsWith(this.field1524.method93().replace('.', '/') + "$")) {// 1574
            this.field1525 = true;// 1034
         }
      }
   }// 1162
}
