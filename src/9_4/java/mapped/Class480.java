package mapped;

// $VF: Compiled from tb
public class Class480 {
   // $VF: synthetic field
   public Class433 field1562;
   // $VF: synthetic field
   public Class484 field1563;
   // $VF: synthetic field
   public static Class136 field1564;

   // $VF: synthetic method
   public Object clone() {
      return new Class480(this.field1562.method863(), this.field1563.method1297());// 493 561
   }

   // $VF: synthetic method
   public Class433 method1269() {
      return this.field1562;// 567
   }

   // $VF: synthetic method
   public Class480(Class433 var1, Class484 var2) {
      this.field1562 = var1;// 315
      this.field1563 = var2;// 190 465
   }// 132

   // $VF: synthetic method
   public Class484 method1270() {
      return this.field1563;// 603
   }

   // $VF: synthetic method
   public boolean equals(Object var1) {
      if (!(var1 instanceof Class480)) {// 555
         return false;// 73
      } else {
         Class480 var3 = (Class480)var1;// 398
         return this.field1563.equals(var3.field1563) && this.field1562.equals(var3.field1562);// 428
      }
   }

   // $VF: synthetic method
   public Class480 method1271() {
      return (Class480)this.clone();// 358
   }

   // $VF: synthetic method
   public Class480(int var1, int var2) {
      this.field1562 = new Class433(var1);// 533
      this.field1563 = new Class484(var2);// 185 406
   }// 1

   // $VF: synthetic method
   public int hashCode() {
      return this.field1563.hashCode() ^ this.field1562.hashCode();// 68
   }
}
