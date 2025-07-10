package mapped;

import java.util.HashSet;
import java.util.Vector;

// $VF: Compiled from no
public class Class554 {
   // $VF: synthetic field
   public Class499 field1948;
   // $VF: synthetic field
   public Vector field1949;
   // $VF: synthetic field
   public Vector field1950;
   // $VF: synthetic field
   public Class499 field1951;
   // $VF: synthetic field
   public String field1952;
   // $VF: synthetic field
   public String field1953;
   // $VF: synthetic field
   public Class360 field1954 = Class580.method1923().method1660().method1745();
   // $VF: synthetic field
   public HashSet field1955;

   // $VF: synthetic method
   public Vector method1755() {
      return this.field1950;// 278
   }

   // $VF: synthetic method
   public void method1756(String var1, Class203 var2) {
      Class554 var3 = this;
      int var10000 = Class580.method1923().method1675().method752();// 132
      Class580.method1923().method1675();
      if (var10000 != 2) {
         var10000 = Class580.method1923().method1675().method752();// 534
         Class580.method1923().method1675();
         if (var10000 == 3) {
            var2.method278();// 488
         } else {
            var10000 = Class580.method1923().method1675().method752();
            Class580.method1923().method1675();
            if (var10000 == 1) {
               Class201[] var8 = var2.method290();// 159
               int var4 = 2147483647;// 493
               int var5 = -2147483648;

               int var6;
               for (int var16 = var6 = var8.length - 1; var16 >= 0; var16 = var6) {// 561
                  Class201 var7;
                  int var13;
                  if ((var13 = (var7 = var8[var6]).method2()) < var4) {// 22 377 604
                     var4 = var13;
                  }

                  if (var13 > var5) {// 6
                     var5 = var13;
                  }

                  if (var13 > var3.field1949.size() - 1) {// 144
                     int var9 = var3.field1949.size();// 461
                     int var10 = var13 - var9 + 200;// 358
                     Vector var11 = new Vector(var10);// 192

                     int var12;
                     for (int var17 = var12 = 0; var17 < var10; var17 = var12) {// 574
                        var11.add(new Integer(var9 + var12++));// 272
                     }

                     Class337.method550(var11);// 321
                     var3.field1949.addAll(var11);// 179
                  }

                  Object var10001 = var3.field1949.get(var13);
                  var6--;
                  var7.method6((Integer)var10001);// 567
               }

               if (var4 < 2147483647) {// 33
                  var3.field1951// 0
                     .method1340(
                        var1 + "&" + var2.method20() + "&" + var2.method93(),
                        new StringBuilder().insert(0, var3.field1953).append(var4).append(var3.field1952).append(var5).toString()
                     );
               }
            }
         }
      }
   }// 184 246 495

   // $VF: synthetic method
   public void method1757(Class206 var1) {
      Class554 var2 = this;
      int var10000 = Class580.method1923().method1675().method752();// 204
      Class580.method1923().method1675();
      if (var10000 != 2) {
         var10000 = Class580.method1923().method1675().method752();// 310
         Class580.method1923().method1675();
         int var3;
         if (var10000 == 3) {
            Class151[] var7;
            for (int var13 = var3 = (var7 = var1.method200()).length - 1; var13 >= 0; var13 = --var3) {// 484 498
               Class151 var4;
               if ((var4 = var7[var3]) instanceof Class169) {// 389 409
                  var1.method262(var4);// 18
                  return;// 513
               }
            }
         } else {
            var10000 = Class580.method1923().method1675().method752();// 530
            Class580.method1923().method1675();
            if (var10000 == 1) {
               Class151[] var11;
               for (int var15 = var3 = (var11 = var1.method200()).length - 1; var15 >= 0; var15 = --var3) {// 147 491
                  Class151 var10;
                  if ((var10 = var11[var3]) instanceof Class169) {// 295 338
                     Class169 var5;
                     String var6 = (var5 = (Class169)var10).method93();// 161 273
                     String var8;
                     if ((var8 = this.field1948.method1341(var6)) == null) {// 141 580
                        do {
                           var8 = var2.field1954.method710();// 123
                        } while (var2.field1955.contains(var8));// 78

                        var2.field1950.add(new Class500(var6, var8));// 418
                        var2.field1948.method1340(var6, var8);// 533
                        var2.field1955.add(var8);// 185
                     }

                     var5.method89(var1.method46().method106(var8));// 1
                     return;// 46
                  }
               }
            }
         }
      }
   }// 190 239

   // $VF: synthetic method
   public Class554() {
      this.field1950 = new Vector();// 335
      this.field1948 = new Class499();// 507
      this.field1955 = new HashSet();// 557
      this.field1949 = new Vector();// 34
      this.field1951 = new Class499();// 332
      this.field1953 = "\" s=\"";// 30
      this.field1952 = "\" e=\"";// 10 143
   }

   // $VF: synthetic method
   public Vector method1758() {
      return this.field1949;// 68
   }

   // $VF: synthetic method
   public void method1759(String var1, String var2) {
      this.field1950.add(new Class500(var1, var2));// 415
      this.field1948.method1340(var1, var2);// 398
      this.field1955.add(var2);// 428
   }// 87

   // $VF: synthetic method
   public Class499 method1760() {
      return this.field1951;// 589
   }
}
