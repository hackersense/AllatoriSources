package mapped;

// $VF: Compiled from ju
public class Class373 implements Class360 {
   // $VF: synthetic field
   public int field1166 = 0;
   // $VF: synthetic field
   public String field1167;
   // $VF: synthetic field
   public Class360 field1168;

   // $VF: synthetic method
   @Override
   public void method709() {
      this.field1166 = 0;// 335
      this.field1168.method709();// 507
   }// 557

   // $VF: synthetic method
   @Override
   public String method710() {
      return this.field1166++ == 0 ? this.field1167 : this.field1168.method710();// 26
   }

   // $VF: synthetic method
   public Class373(String var1, Class360 var2) {
      this.field1167 = var1;// 537
      this.field1168 = var2;// 222 403
   }// 265
}
