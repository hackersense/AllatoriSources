package mapped;

import java.io.DataOutputStream;

// $VF: Compiled from pg
public class Class294 extends Class10 implements Class27, Class31, Class3 {
   // $VF: synthetic field
   public byte field918;

   // $VF: synthetic method
   public Class294(Class142 var1) {
      this(var1.method142());// 533
   }// 185

   // $VF: synthetic method
   @Override
   public Class[] method9() {
      return new Class[]{Class481.field1589};// 589
   }

   // $VF: synthetic method
   public final byte method142() {
      return this.field918;// 561
   }

   // $VF: synthetic method
   public Class294() {
   }// 295

   // $VF: synthetic method
   @Override
   public void method3(DataOutputStream var1) {
      var1.writeByte(this.field3);
      var1.writeByte(this.field918);// 315 465
   }// 132

   // $VF: synthetic method
   @Override
   public String method4(boolean var1) {
      return new StringBuilder().insert(0, super.method4(var1)).append(" ").append(Class125.field354[this.field918]).toString();// 33
   }

   // $VF: synthetic method
   @Override
   public void method10(Class471 var1) {
      var1.method1055(this);
      var1.method1136(this);// 329
      var1.method1094(this);// 412
      var1.method1110(this);// 38 588
   }// 257

   // $VF: synthetic method
   public Class294(byte var1) {
      super((short)188, (short)2);
      this.field918 = var1;// 141 580
   }// 226

   // $VF: synthetic method
   @Override
   public void method7(Class437 var1, boolean var2) {
      this.field918 = var1.readByte();
      this.field918 = 2;// 467 485
   }// 68

   // $VF: synthetic method
   public final Class138 method26() {
      return new Class145(Class142.method158(this.field918), 1);// 192
   }
}
