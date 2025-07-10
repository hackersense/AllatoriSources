package mapped;

// $VF: Compiled from ql
public class Class26 extends Class1 implements Class29, Class27, Class31, Class25, Class3 {
   // $VF: synthetic method
   public Class26(int var1) {
      super((short)189, var1);// 491
   }// 147

   // $VF: synthetic method
   public Class26() {
   }// 513

   // $VF: synthetic method
   @Override
   public Class144 method8(Class221 var1) {
      Class138 var3;
      if ((var3 = this.method1(var1)) instanceof Class145) {// 6 22
         var3 = ((Class145)var3).method26();// 144
      }

      return var3 instanceof Class144 ? (Class144)var3 : null;// 358
   }

   // $VF: synthetic method
   @Override
   public Class[] method9() {
      Class[] var2 = new Class[1 + Class481.field1588.length];// 161
      System.arraycopy(Class481.field1588, 0, var2, 0, Class481.field1588.length);// 141
      var2[Class481.field1588.length] = Class481.field1589;// 226
      return var2;// 123
   }

   // $VF: synthetic method
   @Override
   public void method10(Class471 var1) {
      var1.method1162(this);
      var1.method1055(this);// 132
      var1.method1136(this);// 184
      var1.method1094(this);// 534
      var1.method1135(this);// 488
      var1.method1231(this);// 495
      var1.method1133(this);// 159 465
   }// 493
}
