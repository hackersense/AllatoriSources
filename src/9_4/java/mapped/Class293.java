package mapped;

// $VF: Compiled from dm
public abstract class Class293 extends Class1 implements Class29 {
   // $VF: synthetic method
   @Override
   public Class144 method8(Class221 var1) {
      return this.method525(var1);// 368
   }

   // $VF: synthetic method
   public Class293(short var1, int var2) {
      super(var1, var2);// 161
   }// 141

   // $VF: synthetic method
   public String method518(Class221 var1) {
      Class149 var5;
      Class187 var3 = (Class187)(var5 = var1.method402()).method174(this.field1);// 185 533
      Class186 var4 = (Class186)var5.method174(var3.method2());// 406
      return ((Class191)var5.method174(var4.method2())).method20();// 1
   }

   // $VF: synthetic method
   public Class137 method524(Class221 var1) {
      Class149 var4;
      Class187 var2 = (Class187)(var4 = var1.method402()).method174(this.field1);// 232 463
      String var5;
      if ((var5 = var4.method176(var2.method17(), (byte)7)).startsWith("[")) {// 28 198
         return (Class145)Class138.method151(var5);// 588
      } else {
         String var6 = var5.replace('/', '.');// 412
         return new Class144(var6);// 38
      }
   }

   // $VF: synthetic method
   public Class293() {
   }// 151

   /** @deprecated */
   // $VF: synthetic method
   public Class144 method525(Class221 var1) {
      return new Class144(this.method521(var1));// 59
   }

   // $VF: synthetic method
   public String method520(Class221 var1) {
      Class149 var5;
      Class187 var3 = (Class187)(var5 = var1.method402()).method174(this.field1);// 132 465
      Class186 var4 = (Class186)var5.method174(var3.method2());// 184
      return ((Class191)var5.method174(var4.method17())).method20();// 534
   }

   /** @deprecated */
   // $VF: synthetic method
   public String method521(Class221 var1) {
      Class149 var4;
      Class187 var2 = (Class187)(var4 = var1.method402()).method174(this.field1);// 272 574
      String var5;
      return (var5 = var4.method176(var2.method17(), (byte)7)).startsWith("[") ? "java.lang.Object" : var5.replace('/', '.');// 0 146 321 400
   }
}
