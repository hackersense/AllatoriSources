package smardecSB;

import mapped.Class10;
import mapped.Class138;
import mapped.Class16;
import mapped.Class18;
import mapped.Class221;
import mapped.Class241;
import mapped.Class471;

// $VF: Compiled from wd
public class lconst_x extends Class10 implements Class18, Class16 {
   // $VF: synthetic field
   public long field5;

   // $VF: synthetic method
   public lconst_x () {
   }// 93

   // $VF: synthetic method
   public lconst_x (long var1) {
      super((short)9, (short)1);// 147
      lconst_x var10000;
      if (var1 == 0L) {// 295
         var10000 = this;// 338
         this.field3 = 9;
      } else {
         if (var1 != 1L) {// 273
            throw new Class241("LCONST can be used only for 0 and 1: " + var1);// 580
         }

         var10000 = this;// 161
         this.field3 = 10;
      }

      var10000.field5 = var1;// 123
   }// 78

   // $VF: synthetic method
   @Override
   public Class138 method1 (Class221 var1) {
      return Class138.field578;// 315
   }

   // $VF: synthetic method
   @Override
   public Number method27() {
      return new Long(this.field5);// 406
   }

   // $VF: synthetic method
   @Override
   public void method10 (Class471 var1) {
      var1.method1196(this);
      var1.method1094(this);// 144
      var1.method1135(this);// 461
      var1.method1054(this);// 358
      var1.method1230(this);// 6 192
   }// 574
}
