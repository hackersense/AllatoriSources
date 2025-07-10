package smardecSB;

import mapped.Class1;
import mapped.Class138;
import mapped.Class16;
import mapped.Class178;
import mapped.Class179;
import mapped.Class183;
import mapped.Class221;
import mapped.Class471;
import mapped.Class7;

// $VF: Compiled from jf
public class ldc2_w extends Class1 implements Class7, Class16 {
   // $VF: synthetic method
   public ldc2_w (int var1) {
      super((short)20, var1);// 151
   }// 530

   // $VF: synthetic method
   @Override
   public Class138 method1 (Class221 var1) {
      switch (var1.method402().method174(this.field1).method142()) {// 338
         case 5:
            while (false) {
            }

            return Class138.field578;// 161
         case 6:
            return Class138.field576;// 580
         default:
            throw new RuntimeException("Unknown constant type " + this.field3);// 123
      }
   }

   // $VF: synthetic method
   public ldc2_w () {
   }// 389

   // $VF: synthetic method
   public Number method526(Class221 var1) {
      Class178 var3;
      switch ((var3 = var1.method402().method174(this.field1)).method142()) {// 1 46
         case 5:
            return new Long(((Class183)var3).method228());// 553
         case 6:
            return new Double(((Class179)var3).method226());// 190
         default:
            throw new RuntimeException("Unknown or invalid constant type at " + this.field1);// 465
      }
   }

   // $VF: synthetic method
   @Override
   public void method10 (Class471 var1) {
      var1.method1094(this);
      var1.method1196(this);// 358
      var1.method1135(this);// 192
      var1.method1231(this);// 574
      var1.method1065(this);// 272 461
   }// 321
}
