package smardecSB;

import mapped.Class10;
import mapped.Class138;
import mapped.Class16;
import mapped.Class18;
import mapped.Class221;
import mapped.Class241;
import mapped.Class471;

// $VF: Compiled from be
public class fconst_x extends Class10 implements Class18, Class16 {
   // $VF: synthetic field
   public float field6;

   // $VF: synthetic method
   @Override
   public Class138 method1 (Class221 var1) {
      return Class138.field575;// 132
   }

   // $VF: synthetic method
   public fconst_x (float var1) {
      super((short)11, (short)1);// 147
      fconst_x var4;
      if ((double)var1 == 0.0) {// 295
         var4 = this;// 338
         this.field3 = 11;
      } else if ((double)var1 == 1.0) {// 273
         var4 = this;// 161
         this.field3 = 12;
      } else {
         if ((double)var1 != 2.0) {// 141
            throw new Class241("FCONST can be used only for 0.0, 1.0 and 2.0: " + var1);// 123
         }

         var4 = this;// 580
         this.field3 = 13;
      }

      var4.field6 = var1;// 418
   }// 533

   // $VF: synthetic method
   public fconst_x () {
   }// 93

   // $VF: synthetic method
   @Override
   public void method10 (Class471 var1) {
      var1.method1196(this);
      var1.method1094(this);// 358
      var1.method1135(this);// 192
      var1.method1054(this);// 574
      var1.method1224(this);// 272 461
   }// 321

   // $VF: synthetic method
   @Override
   public Number method27() {
      return new Float(this.field6);// 46
   }
}
