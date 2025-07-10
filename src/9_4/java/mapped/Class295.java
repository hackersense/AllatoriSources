package mapped;

import java.io.DataOutputStream;

// $VF: Compiled from lj
public class Class295 extends Class1 implements Class29, Class27, Class31 {
   // $VF: synthetic field
   public short field919;

   // $VF: synthetic method
   @Override
   public Class[] method9() {
      Class[] var2 = new Class[2 + Class481.field1588.length];// 198
      System.arraycopy(Class481.field1588, 0, var2, 0, Class481.field1588.length);// 424
      var2[Class481.field1588.length + 1] = Class481.field1589;// 588
      var2[Class481.field1588.length] = Class481.field1578;// 329
      return var2;// 412
   }

   // $VF: synthetic method
   @Override
   public String method4(boolean var1) {
      return new StringBuilder().insert(0, super.method4(var1)).append(" ").append(this.field1).append(" ").append(this.field919).toString();// 246
   }

   // $VF: synthetic method
   @Override
   public String method5(Class149 var1) {
      return new StringBuilder().insert(0, super.method5(var1)).append(" ").append(this.field919).toString();// 59
   }

   // $VF: synthetic method
   @Override
   public Class144 method8(Class221 var1) {
      Class138 var3;
      if ((var3 = this.method1(var1)) instanceof Class145) {// 148 236
         var3 = ((Class145)var3).method26();// 142
      }

      return var3 instanceof Class144 ? (Class144)var3 : null;// 368
   }

   // $VF: synthetic method
   public final short method523() {
      return this.field919;// 321
   }

   // $VF: synthetic method
   @Override
   public void method7(Class437 var1, boolean var2) {
      super.method7(var1, var2);
      this.field919 = (short)var1.readByte();// 604
      this.field1 = 4;// 22 377
   }// 6

   // $VF: synthetic method
   @Override
   public void method3(DataOutputStream var1) {
      var1.writeByte(this.field3);
      var1.writeShort(this.field1);// 465
      var1.writeByte(this.field919);// 132 315
   }// 184

   // $VF: synthetic method
   public Class295(int var1, short var2) {
      super((short)197, var1);// 580
      if (var2 < 1) {// 226
         throw new Class241("Invalid dimensions value: " + var2);// 123
      } else {
         this.field919 = var2;
         this.field1 = 4;// 418 533
      }
   }// 185

   // $VF: synthetic method
   public Class295() {
   }// 338

   // $VF: synthetic method
   @Override
   public void method10(Class471 var1) {
      var1.method1162(this);
      var1.method1055(this);// 450
      var1.method1136(this);// 386
      var1.method1135(this);// 470
      var1.method1231(this);// 149
      var1.method1174(this);// 157 279
   }// 24

   // $VF: synthetic method
   @Override
   public int method15(Class221 var1) {
      return this.field919;// 87
   }
}
