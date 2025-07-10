package mapped;

// $VF: Compiled from ze
public class Class140 extends Class138 {
   // $VF: synthetic field
   public static final Class140 field596 = new Class140();
   // $VF: synthetic field
   public Class246 field597;

   // $VF: synthetic method
   @Override
   public int hashCode() {
      return this.field597 == null ? 0 : this.field597.hashCode();// 1 170 406
   }

   // $VF: synthetic method
   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof Class140)) {// 534
         return false;// 488
      } else {
         Class140 var3 = (Class140)var1;// 159
         return this.field597 != null && var3.field597 != null ? var3.field597.equals(this.field597) : var3.field597 == this.field597;// 493 561 604
      }
   }

   // $VF: synthetic method
   public Class140(Class246 var1) {
      super((byte)16, "<return address targeting " + var1 + ">");
      this.field597 = var1;// 141 580
   }// 226

   // $VF: synthetic method
   public Class246 method32() {
      return this.field597;// 272
   }

   // $VF: synthetic method
   public Class140() {
      super((byte)16, "<return address>");// 151
   }// 530
}
