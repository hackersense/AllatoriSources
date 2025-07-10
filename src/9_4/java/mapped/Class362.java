package mapped;

// $VF: Compiled from es
public class Class362 implements Class360 {
   // $VF: synthetic field
   public String[] field1139;
   // $VF: synthetic field
   public Class368 field1140 = new Class368();
   // $VF: synthetic field
   public int field1141 = 0;

   // $VF: synthetic method
   @Override
   public String method710() {
      return this.field1141 < this.field1139.length ? this.field1139[this.field1141++] : this.field1140.method710();// 10 26 134
   }

   // $VF: synthetic method
   public Class362(String[] var1) {
      this.field1139 = var1;// 403 537
   }// 222

   // $VF: synthetic method
   @Override
   public void method709() {
      this.field1141 = 0;// 557
      this.field1140.method709();// 34
   }// 332
}
