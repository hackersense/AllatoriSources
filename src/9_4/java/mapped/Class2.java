package mapped;

// $VF: Compiled from zg
public class Class2 extends Class1 implements Class29, Class31, Class3, Class25 {
   // $VF: synthetic method
   @Override
   public Class144 method8(Class221 var1) {
      Class138 var3;
      if ((var3 = this.method1(var1)) instanceof Class145) {// 58 190
         var3 = ((Class145)var3).method26();// 315
      }

      return var3 instanceof Class144 ? (Class144)var3 : null;// 132
   }

   // $VF: synthetic method
   public Class2(int var1) {
      super((short)192, var1);// 338
   }// 273

   // $VF: synthetic method
   public Class2() {
   }// 513

   // $VF: synthetic method
   @Override
   public Class[] method9() {
      Class[] var2 = new Class[1 + Class481.field1588.length];// 78
      System.arraycopy(Class481.field1588, 0, var2, 0, Class481.field1588.length);// 418
      var2[Class481.field1588.length] = Class481.field1581;// 185
      return var2;// 406
   }

   // $VF: synthetic method
   @Override
   public void method10(Class471 var1) {
      var1.method1162(this);
      var1.method1136(this);// 358
      var1.method1094(this);// 192
      var1.method1208(this);// 574
      var1.method1135(this);// 272
      var1.method1231(this);// 321
      var1.method1060(this);// 179 461
   }// 146
}
