package smardecSB;

import mapped.Class10;
import mapped.Class138;
import mapped.Class16;
import mapped.Class18;
import mapped.Class221;
import mapped.Class241;
import mapped.Class471;

// $VF: Compiled from ak
public class iconst_x extends Class10 implements Class18, Class16 {
   // $VF: synthetic field
   public int field7;

   // $VF: synthetic method
   public iconst_x (int var1) {
      super((short)3, (short)1);// 147
      if (var1 >= -1 && var1 <= 5) {// 295
         this.field3 = (short)(3 + var1);// 338
         this.field7 = var1;// 161 273 580
      } else {
         throw new Class241("ICONST can be used only for value between -1 and 5: " + var1);
      }
   }

   // $VF: synthetic method
   @Override
   public Number method27() {
      return new Integer(this.field7);// 533
   }

   // $VF: synthetic method
   @Override
   public Class138 method1 (Class221 var1) {
      return Class138.field591;// 58
   }

   // $VF: synthetic method
   public iconst_x () {
   }// 93

   // $VF: synthetic method
   @Override
   public void method10 (Class471 var1) {
      var1.method1196(this);
      var1.method1094(this);// 22
      var1.method1135(this);// 6
      var1.method1054(this);// 144
      var1.method1098(this);// 461 604
   }// 358
}
