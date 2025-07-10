package mapped;

// $VF: Compiled from ib
public class Class136 extends Class137 implements Class125 {
   // $VF: synthetic field
   public Class144 field574;

   // $VF: synthetic method
   public Class144 method138() {
      return this.field574;// 226
   }

   // $VF: synthetic method
   public Class136(Class144 var1) {
      super((byte)15, "<UNINITIALIZED OBJECT OF TYPE '" + var1.method93() + "'>");
      this.field574 = var1;// 491 530
   }// 147

   // $VF: synthetic method
   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof Class136) ? false : this.field574.equals(((Class136)var1).field574);// 132 465 534
   }

   // $VF: synthetic method
   @Override
   public int hashCode() {
      return this.field574.hashCode();// 185
   }
}
