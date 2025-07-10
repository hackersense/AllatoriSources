package mapped;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// $VF: Compiled from fe
public class Class576 {
   // $VF: synthetic field
   public final String field2303;
   // $VF: synthetic field
   public Class130 field2304;
   // $VF: synthetic field
   public Map field2305 = new HashMap();
   // $VF: synthetic field
   public Map field2306 = new HashMap();
   // $VF: synthetic field
   public Class134 field2307;

   // $VF: synthetic method
   public static void main(String[] var0) {
      String[] var1 = var0;
      System.out.println("JustIce by Enver Haase, (C) 2001-2002.\n<http://bcel.sourceforge.net>\n<http://jakarta.apache.org/bcel>\n");// 536

      int var5;
      for (int var10000 = var5 = 0; var10000 < var1.length; var10000 = ++var5) {// 218
         try {
            int var2;
            if (var1[var5].endsWith(".class") && (var2 = var1[var5].lastIndexOf(".class")) != -1) {// 15 213 385
               var1[var5] = var1[var5].substring(0, var2);// 471
            }

            var1[var5] = var1[var5].replace('/', '.');// 177
            System.out.println("Now verifying: " + var1[var5] + "\n");// 266
            Class576 var9;
            Class576 var14 = var9 = Class545.method1689(var1[var5]);// 235
            Class581 var3 = var14.method1910();// 370
            System.out.println("Pass 1:\n" + var3);// 516
            var3 = var14.method1912();// 95
            System.out.println("Pass 2:\n" + var3);// 227
            if (var3 == Class581.field2340) {// 55
               Class205 var4 = Class411.method790(var1[var5]);// 77

               for (int var15 = var7 = 0; var15 < var4.method341().length; var15 = var7) {// 288
                  var3 = var9.method1909(var7);// 129
                  System.out.println("Pass 3a, method number " + var7 + " ['" + var4.method341()[var7] + "']:\n" + var3);// 258
                  var3 = var9.method1911(var7);// 437
                  PrintStream var16 = System.out;// 110
                  StringBuilder var10001 = new StringBuilder()
                     .append("Pass 3b, method number ")
                     .append(var7)
                     .append(" ['")
                     .append(var4.method341()[var7])
                     .append("']:\n");
                  var7++;
                  var16.println(var10001.append(var3).toString());
               }
            }

            System.out.println("Warnings:");// 193
            String[] var13;
            if ((var13 = var9.method1908()).length == 0) {// 251 486
               System.out.println("<none>");// 117
            }

            for (int var17 = var8 = 0; var17 < var13.length; var17 = var8) {// 245
               System.out.println(var13[var8++]);// 296
            }

            System.out.println("\n");// 417
            var9.method1914();// 401
            Class411.method789();// 394
            System.gc();// 556
         } catch (ClassNotFoundException var6) {// 316
            var6.printStackTrace();// 207
         }
      }
   }// 355

   // $VF: synthetic method
   public String[] method1908() {
      Class576 var2 = this;
      ArrayList var5 = new ArrayList();// 600
      if (this.field2307 != null) {// 108
         String[] var7 = this.field2307.method130();// 27

         int var3;
         for (int var10000 = var3 = 0; var10000 < var7.length; var10000 = var3) {// 242
            StringBuilder var10001 = new StringBuilder().append("Pass 1: ");
            String var10002 = var7[var3];
            var3++;
            var5.add(var10001.append(var10002).toString());// 94
         }
      }

      if (this.field2304 != null) {// 116
         String[] var8 = this.field2304.method130();// 422

         int var13;
         for (int var17 = var13 = 0; var17 < var8.length; var17 = var13) {// 464
            StringBuilder var23 = new StringBuilder().append("Pass 2: ");
            String var27 = var8[var13];
            var13++;
            var5.add(var23.append(var27).toString());// 25
         }
      }

      for (Class133 var18 : this.field2305.values()) {// 115
         String[] var4 = var18.method130();// 23
         int var1 = var18.method2();// 440

         int var6;
         for (int var19 = var6 = 0; var19 < var4.length; var19 = var6) {// 248
            StringBuilder var24 = new StringBuilder()
               .append("Pass 3a, method ")
               .append(var1)
               .append(" ('")
               .append(Class411.method790(var2.field2303).method341()[var1])
               .append("'): ");
            String var28 = var4[var6];
            var6++;
            var5.add(var24.append(var28).toString());// 97
         }
      }

      for (Class132 var20 : var2.field2306.values()) {// 119
         String[] var11 = var20.method130();// 423
         int var16 = var20.method2();// 61

         for (int var21 = var10 = 0; var21 < var11.length; var21 = var10) {// 525
            StringBuilder var25 = new StringBuilder()
               .append("Pass 3b, method ")
               .append(var16)
               .append(" ('")
               .append(Class411.method790(var2.field2303).method341()[var16])
               .append("'): ");
            String var29 = var11[var10];
            var10++;
            var5.add(var25.append(var29).toString());// 220
         }
      }

      String[] var15 = new String[var5.size()];// 57

      int var12;
      for (int var22 = var12 = 0; var22 < var5.size(); var22 = var12) {// 169
         int var26 = var12;
         String var30 = (String)var5.get(var12);
         var12++;
         var15[var26] = var30;// 216
      }

      return var15;// 314
   }

   // $VF: synthetic method
   public Class581 method1909(int var1) {
      String var2 = Integer.toString(var1);// 321
      Class133 var4 = (Class133)this.field2305.get(var2);// 146
      if (this.field2305.get(var2) == null) {// 567
         var4 = new Class133(this, var1);// 400
         this.field2305.put(var2, var4);// 33
      }

      return var4.method129();// 240
   }

   // $VF: synthetic method
   public Class576(String var1) {
      this.field2303 = var1;// 232 463
      this.method1914();// 198
   }// 424

   // $VF: synthetic method
   public Class581 method1910() {
      if (this.field2307 == null) {// 132
         this.field2307 = new Class134(this);// 184
      }

      return this.field2307.method129();// 488
   }

   // $VF: synthetic method
   public Class581 method1911(int var1) {
      String var2 = Integer.toString(var1);// 467
      Class132 var4 = (Class132)this.field2306.get(var2);// 68
      if (this.field2306.get(var2) == null) {// 59
         var4 = new Class132(this, var1);// 391
         this.field2306.put(var2, var4);// 330
      }

      return var4.method129();// 579
   }

   // $VF: synthetic method
   public Class581 method1912() {
      if (this.field2304 == null) {// 604
         this.field2304 = new Class130(this);// 22
      }

      return this.field2304.method129();// 144
   }

   // $VF: synthetic method
   public final String method1913() {
      return this.field2303;// 142
   }

   // $VF: synthetic method
   public void method1914() {
      this.field2307 = null;
      this.field2304 = null;// 82 367
      this.field2305.clear();// 83
      this.field2306.clear();// 5
   }// 279
}
