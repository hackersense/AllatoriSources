package mapped;

// $VF: Compiled from ag
public final class Class247 extends Class246 {
   // $VF: synthetic field
   public static Class247 field843 = null;
   // $VF: synthetic field
   public Class90 field844;

   // $VF: synthetic method
   @Override
   public int method34(int var1, int var2) {
      int var4 = this.field844.method34(var1, var2);// 272
      this.field837 = this.field844.field11;// 321
      return var4;// 179
   }

   // $VF: synthetic method
   public Class247(Class90 var1) {
      super(var1);
      this.field844 = var1;// 93 151
   }// 530

   // $VF: synthetic method
   public Class246 method274() {
      return this.field844.method32();// 428
   }

   // $VF: synthetic method
   @Override
   public int method2() {
      return this.field844.field11;// 561
   }

   // $VF: synthetic method
   public void method28(Class246 var1, Class246 var2) {
      this.field844.method28(var1, var2);// 391
   }// 330

   // $VF: synthetic method
   public static final Class247 method439(Class90 var0) {
      if (field843 == null) {// 580
         return new Class247(var0);// 226
      } else {
         Class247 var2 = field843;// 78
         field843 = (Class247)field843.field838;// 418
         var2.method432(var0);// 533
         return var2;// 185
      }
   }

   // $VF: synthetic method
   @Override
   public void method6(int var1) {
      this.field837 = this.field844.field11 = var1;// 144
   }// 461

   // $VF: synthetic method
   @Override
   public void method19() {
      this.field838 = field843;// 190
      field843 = this;// 315
   }// 465

   // $VF: synthetic method
   @Override
   public void method432(Class10 var1) {
      super.method432(var1);// 28
      if (!(var1 instanceof Class90)) {// 588
         throw new Class241("Assigning " + var1 + " to branch handle which is not a branch instruction");// 329
      } else {
         this.field844 = (Class90)var1;// 257
      }
   }// 269

   // $VF: synthetic method
   public void method29(Class246 var1) {
      this.field844.method29(var1);// 552
   }// 603
}
