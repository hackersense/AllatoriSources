package mapped;

// $VF: Compiled from xk
public final class Class142 extends Class138 {
   // $VF: synthetic method
   @Override
   public boolean equals(Object var1) {
      return var1 instanceof Class142 ? ((Class142)var1).field589 == this.field589 : false;// 574
   }

   // $VF: synthetic method
   public static final Class142 method158(byte var0) {
      switch (var0) {// 273
         case 4:

            return field584;// 226
         case 5:
            return field585;// 406
         case 6:
            return field575;// 465
         case 7:
            return field576;// 190
         case 8:
            return field594;// 78
         case 9:
            return field581;// 533
         case 10:
            return field591;// 46
         case 11:
            return field578;// 553
         case 12:
            return field586;// 141
         default:
            throw new Class241("Invalid type: " + var0);// 184
      }
   }

   // $VF: synthetic method
   @Override
   public int hashCode() {
      return this.field589;// 604
   }

   // $VF: synthetic method
   public Class142(byte var1) {
      super(var1, Class125.field204[var1]);// 513
      if (var1 < 4 || var1 > 12) {// 93
         throw new Class241("Invalid type: " + var1);// 151
      }
   }// 491
}
