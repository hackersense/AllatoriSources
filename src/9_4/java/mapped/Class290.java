package mapped;

import java.io.DataOutputStream;

// $VF: Compiled from bj
public final class Class290 extends Class288 {
   // $VF: synthetic field
   public int field917;

   // $VF: synthetic method
   @Override
   public Class[] method9() {
      Class[] var2 = new Class[4 + Class481.field1582.length];// 555
      System.arraycopy(Class481.field1582, 0, var2, 0, Class481.field1582.length);// 73
      var2[Class481.field1582.length + 3] = Class481.field1585;// 398
      var2[Class481.field1582.length + 2] = Class481.field1578;// 428
      var2[Class481.field1582.length + 1] = Class481.field1583;// 87
      var2[Class481.field1582.length] = Class481.field1576;// 586
      return var2;// 399
   }

   // $VF: synthetic method
   public int method30() {
      return this.field917;// 22
   }

   // $VF: synthetic method
   @Override
   public String method5(Class149 var1) {
      return new StringBuilder().insert(0, super.method5(var1)).append(" ").append(this.field917).toString();// 278
   }

   // $VF: synthetic method
   @Override
   public void method3(DataOutputStream var1) {
      var1.writeByte(this.field917);
      var1.writeShort(this.field1);// 465
      var1.writeByte(this.field917);// 132
      var1.writeByte(0);// 184 315
   }// 534

   // $VF: synthetic method
   @Override
   public void method7(Class437 var1, boolean var2) {
      super.method7(var1, var2);
      this.field1 = 5;// 179
      this.field917 = var1.readUnsignedByte();// 146 321
      var1.readByte();// 567
   }// 400

   // $VF: synthetic method
   @Override
   public void method10(Class471 var1) {
      var1.method1136(this);
      var1.method1135(this);// 236
      var1.method1208(this);// 142
      var1.method1094(this);// 39
      var1.method1162(this);// 368
      var1.method1231(this);// 99
      var1.method1099(this);// 160
      var1.method1058(this);// 40
      var1.method1140(this);// 63 148
   }// 541

   // $VF: synthetic method
   public Class290() {
   }// 338

   // $VF: synthetic method
   @Override
   public int method15(Class221 var1) {
      return this.field917;// 59
   }

   // $VF: synthetic method
   public Class290(int var1, int var2) {
      super((short)185, var1);
      this.field1 = 5;// 226 580
      if (var2 < 1) {// 123
         throw new Class241("Number of arguments must be > 0 " + var2);// 78
      } else {
         this.field917 = var2;// 533
      }
   }// 185
}
