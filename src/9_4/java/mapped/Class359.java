package mapped;

// $VF: Compiled from aw
public class Class359 implements Class360 {
   // $VF: synthetic field
   public long field1134 = 0L;
   // $VF: synthetic field
   public String field1135;

   // $VF: synthetic method
   public Class359(String var1) {
      this.field1135 = var1;// 403 578
   }// 537

   // $VF: synthetic method
   @Override
   public void method709() {
      this.field1134 = 0L;// 10
   }// 7

   // $VF: synthetic method
   @Override
   public String method710() {
      return new StringBuilder().insert(0, this.field1135).append(this.field1134++).toString();// 446
   }
}
