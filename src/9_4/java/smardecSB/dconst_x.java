package smardecSB;

import mapped.Class10;
import mapped.Class138;
import mapped.Class16;
import mapped.Class18;
import mapped.Class221;
import mapped.Class241;
import mapped.Class471;

// $VF: Compiled from jg
public class dconst_x extends Class10 implements Class18, Class16 {
   // $VF: synthetic field
   public double field8;

   // $VF: synthetic method
   @Override
   public Number method27() {
      return new Double(this.field8);// 406
   }

   // $VF: synthetic method
   public dconst_x () {
   }// 93

   // $VF: synthetic method
   public dconst_x (double var1) {
      super((short)14, (short)1);// 147
      dconst_x var10000;
      if (var1 == 0.0) {// 295
         var10000 = this;// 338
         this.field3 = 14;
      } else {
         if (var1 != 1.0) {// 273
            throw new Class241("DCONST can be used only for 0.0 and 1.0: " + var1);// 580
         }

         var10000 = this;// 161
         this.field3 = 15;
      }

      var10000.field8 = var1;// 123
   }// 78

   // $VF: synthetic method
   @Override
   public Class138 method1 (Class221 var1) {
      return Class138.field576;// 315
   }

   // $VF: synthetic method
   @Override
   public void method10 (Class471 var1) {
      var1.method1196(this);
      var1.method1094(this);// 144
      var1.method1135(this);// 461
      var1.method1054(this);// 358
      var1.method1228(this);// 6 192
   }// 574
}
