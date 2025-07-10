package mapped;

import java.util.StringTokenizer;

// $VF: Compiled from jk
public abstract class Class288 extends Class293 implements Class31, Class16, Class25, Class3 {
   // $VF: synthetic method
   @Override
   public Class138 method1(Class221 var1) {
      return this.method14(var1);// 485
   }

   // $VF: synthetic method
   public Class138 method14(Class221 var1) {
      return Class138.method150(this.method518(var1));// 399
   }

   // $VF: synthetic method
   public Class288() {
   }// 151

   // $VF: synthetic method
   public String method12(Class221 var1) {
      return this.method520(var1);// 555
   }

   // $VF: synthetic method
   public Class138[] method519(Class221 var1) {
      return Class138.method146(this.method518(var1));// 329
   }

   // $VF: synthetic method
   public Class288(short var1, int var2) {
      super(var1, var2);// 161
   }// 141

   // $VF: synthetic method
   @Override
   public int method11(Class221 var1) {
      return this.method14(var1).method2();// 240
   }

   // $VF: synthetic method
   @Override
   public String method5(Class149 var1) {
      Class178 var2 = var1.method174(this.field1);// 185
      StringTokenizer var4 = new StringTokenizer(var1.method178(var2));// 406
      return new StringBuilder()
         .insert(0, Class125.field386[this.field3])// 1
         .append(" ")
         .append(var4.nextToken().replace('.', '/'))
         .append(var4.nextToken())
         .toString();
   }

   // $VF: synthetic method
   @Override
   public int method15(Class221 var1) {
      Class138[] var6 = Class138.method146(this.method518(var1));// 488 495
      int var5;
      Class138[] var10000;
      if (this.field3 == 184) {// 493
         var5 = 0;// 561
         var10000 = var6;
      } else {
         var5 = 1;// 604
         var10000 = var6;// 6
      }

      int var4 = var10000.length;

      int var3;
      for (int var7 = var3 = 0; var7 < var4; var7 = var3) {// 144
         Class138 var10001 = var6[var3];// 461
         var3++;
         var5 += var10001.method2();
      }

      return var5;// 192
   }
}
