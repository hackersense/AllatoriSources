package mapped;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

// $VF: Compiled from fr
public class Class424 implements Class418 {
   // $VF: synthetic field
   public Vector field1243;
   // $VF: synthetic field
   public Vector field1244;
   // $VF: synthetic field
   public Class338 field1245;

   // $VF: synthetic method
   public void method845(Class206 var1, int var2) {
      Class580.method1932();
      if (var2 == 1) {// 192
         Class208[] var4;
         for (int var10000 = var6 = (var4 = var1.method341()).length - 1; var10000 >= 0; var10000 = var6) {// 272 574
            var1.method356(var4[var6--]);// 321
         }

         List var11 = Arrays.asList(var4);// 179
         Class337.method550(var11);// 146

         int var5;
         for (int var12 = var5 = var11.size() - 1; var12 >= 0; var12 = var5) {// 567
            var1.method365(var4[var5--]);// 400
         }
      } else {
         Class580.method1932();
         if (var2 >= 100) {// 33
            Class208[] var9;
            for (int var13 = var7 = (var9 = var1.method341()).length - 1; var13 >= 0; var13 = var7) {// 0 240
               var1.method356(var9[var7--]);// 246
            }

            List var8 = Arrays.asList(var9);// 552
            Collections.sort(var8, new Class378(this, var2));// 603

            int var10;
            for (int var14 = var10 = var8.size() - 1; var14 >= 0; var14 = var10) {// 330
               var1.method365(var9[var10--]);// 589
            }
         }
      }
   }// 555

   // $VF: synthetic method
   @Override
   public void method838() {
      Class424 var2 = this;
      Iterator var1;
      Iterator var10000 = var1 = this.field1243.iterator();// 151

      while (var10000.hasNext()) {
         Class206 var3 = (Class206)var1.next();
         var10000 = var1;
         Class580.method1932();
         var2.method846(var3, 100);
         Class580.method1932();// 491
         var2.method845(var3, 100);// 530
      }

      var10000 = var1 = var2.field1244.iterator();// 295

      while (var10000.hasNext()) {
         Class206 var4 = (Class206)var1.next();
         var10000 = var1;
         Class580.method1932();
         var2.method846(var4, 101);
         Class580.method1932();// 273
         var2.method845(var4, 101);// 338
      }

      var2.field1244 = var2.field1243 = null;// 141 580
   }// 226

   // $VF: synthetic method
   @Override
   public void method839(Class206 var1) {
      int var3;
      int var10000 = var3 = Class580.method1932().method1857(this.field1245, var1);// 252
      Class580.method1932();// 20
      if (var10000 == 100) {
         this.field1243.add(var1);// 204
      } else {
         Class580.method1932();
         if (var3 == 101) {
            this.field1244.add(var1);// 310
         } else {
            this.method846(var1, var3);
            this.method845(var1, var3);// 409 484
         }
      }
   }// 18 239 498

   // $VF: synthetic method
   public Class424(Class338 var1) {
      this.field1245 = var1;// 507 557
      this.field1243 = new Vector();
      this.field1244 = new Vector();// 34 332
   }// 260

   // $VF: synthetic method
   public void method846(Class206 var1, int var2) {
      Class580.method1932();
      if (var2 == 1) {// 418
         Class207[] var4;
         for (int var10000 = var6 = (var4 = var1.method346()).length - 1; var10000 >= 0; var10000 = var6) {// 185 533
            var1.method100(var4[var6--]);// 406
         }

         List var7;
         List var12 = var7 = Arrays.asList(var4);// 1
         Class337.method550(var12);// 46

         int var5;
         for (int var13 = var5 = var12.size() - 1; var13 >= 0; var13 = var5) {// 170
            var1.method357((Class207)var7.get(var5--));// 553
         }
      } else {
         Class580.method1932();
         if (var2 >= 100) {// 58
            Class207[] var10;
            for (int var14 = var8 = (var10 = var1.method346()).length - 1; var14 >= 0; var14 = var8) {// 190 315
               var1.method100(var10[var8--]);// 465
            }

            List var9 = Arrays.asList(var10);// 132
            Collections.sort(var9, new Class380(this, var2));// 184

            int var11;
            for (int var15 = var11 = var9.size() - 1; var15 >= 0; var15 = var11) {// 604
               var1.method357((Class207)var9.get(var11--));// 22
            }
         }
      }
   }// 144
}
