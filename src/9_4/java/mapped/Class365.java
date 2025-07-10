package mapped;

// $VF: Compiled from ot
public class Class365 implements Class360 {
   // $VF: synthetic field
   public Class360 field1144;
   // $VF: synthetic field
   public String field1145;

   // $VF: synthetic method
   public Class365(String var1, Class360 var2) {
      this.field1144 = var2;// 403
      this.field1145 = var1;// 537 578
   }// 222

   // $VF: synthetic method
   @Override
   public String method710() {
      return new StringBuilder().insert(0, this.field1145).append(this.field1144.method710()).toString();// 134
   }

   // $VF: synthetic method
   @Override
   public void method709() {
      this.field1144.method709();// 7
   }// 335
}
