package mapped;

import smardecSB.ProductInformation;

import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.Vector;

// $VF: Compiled from ky
public class Class522 {
   // $VF: synthetic method
   public static StringBuffer method1482(StringBuffer var0, char var1, int var2) {
      StringBuffer var3 = var0;

      for (int var10000 = var4 = 0; var10000 < var2; var10000 = var4) {// 23
         var4++;
         var3.append(var1);// 440
      }

      return var3;// 248
   }

   // $VF: synthetic method
   public static void method1483(Class338 var0) {
      method1489(var0);// 193
      method1480(var0);// 251
   }// 486

   // $VF: synthetic method
   public static Class338 method1484() {
      Class338 var0 = new Class338(method1490());// 72
      Iterator var1;
      Iterator var10000 = var1 = Class580.method1935().method1349().iterator();// 268

      while (var10000.hasNext()) {
         Class351 var2 = (Class351)var1.next();
         var10000 = var1;
         Class521.method1477(var2.field1049, var0);// 497
      }

      var10000 = var1 = Class580.method1935().method1344().iterator();// 66

      while (var10000.hasNext()) {
         Class352 var5 = (Class352)var1.next();
         var10000 = var1;
         Class521.method1477(var5.field1049, var0);// 536
      }

      var10000 = var1 = Class580.method1935().method1345().iterator();// 307

      while (var10000.hasNext()) {
         Class583 var6 = (Class583)var1.next();
         var10000 = var1;
         Class574.method1904(var6.field2346, var0, var6.field2346);// 218
      }

      return var0;// 109
   }

   // $VF: synthetic method
   public static boolean method1485(String var0) {
      return method1487(var0, false);// 138
   }

   // $VF: synthetic method
   public static void method1486(Class338 var0) {
      Iterator var3 = var0.method553();// 570

      while (var3.hasNext()) {
         Class206 var2;
         if ((var2 = (Class206)var3.next()).method84() > 50) {// 162 523
            var2.method332(50);
         }
      }
   }// 503

   // $VF: synthetic method
   public static boolean method1487(String var0, boolean var1) {
      boolean var3 = var1;
      String var4 = var0;

      try {
         Class580.method1940(var4, var3);// 423
         return true;// 61
      } catch (Exception var2) {// 525
         if (var2.getCause() == null) {// 220
            Class528.method1559("Configuration error. " + var2.getMessage());// 593
         } else {
            Class528.method1559("Error reading configuration. " + var2.getCause().getMessage());// 540
         }

         return false;// 291
      }
   }

   // $VF: synthetic method
   public static void method1488(String var0) throws RuntimeException {
      String var1 = var0;

      try {
         Class580.method1931(var1);// 137
      } catch (Exception var2) {// 50
         if (var2.getCause() == null) {// 253
            throw new RuntimeException("Configuration error. " + var2.getMessage());// 135
         } else {
            throw new RuntimeException("Error reading configuration. " + var2.getCause().getMessage(), var2.getCause());// 443
         }
      }
   }// 166

   // $VF: synthetic method
   public static void method1489(Class338 var0) {
      Class338 var2 = var0;
      Class446 var1 = new Class446();// 245
      Iterator var5;
      Iterator var10000 = var5 = Class580.method1935().method1349().iterator();// 296

      while (var10000.hasNext()) {
         Class351 var3 = (Class351)var5.next();
         var10000 = var5;
         var1.method915(var3.field1049, var3.field1050, var2);// 404
      }

      Iterator var6;
      var10000 = var6 = Class580.method1935().method1344().iterator();// 417

      while (var10000.hasNext()) {
         Class352 var8 = (Class352)var6.next();
         var10000 = var6;
         var1.method915(var8.field1049, var8.field1050, var2);// 81
      }

      if (Class580.method1935().method1346() != null) {// 394
         Vector var7;
         String[] var9 = new String[(var7 = Class580.method1935().method1344()).size()];// 316 556

         int var4;
         for (int var11 = var4 = 0; var11 < var7.size(); var11 = var4) {// 207
            int var10001 = var4;
            String var10002 = ((Class352)var7.get(var4)).field1050;
            var4++;
            var9[var10001] = var10002;// 275
         }

         var1.method921(var9, Class580.method1935().method1346());// 127
      }

      var1.method914();// 496
   }// 369

   // $VF: synthetic method
   public static Class439 method1490() {
      Vector var0 = Class580.method1941().method1906();// 471

      int var1;
      for (int var10000 = var1 = 0; var10000 < var0.size(); var10000 = ++var1) {// 270
         try {
            var0.set(var1, new File((String)var0.get(var1)).toURL());// 177
         } catch (Exception var3) {// 266
            var3.printStackTrace();// 235
         }
      }

      URL[] var4 = (URL[])var0.toArray(new URL[0]);// 370
      return new Class439(var4);// 516
   }

   // $VF: synthetic method
   public static String funnyASCII () {
      String var0 = " ## #   #    ## ### ### ##  ###";// 534
      String var1 = "# # #   #   # #  #  # # # #  # ";// 488
      String var2 = "### #   #   ###  #  # # ##   # ";// 495
      String var3 = "# # ### ### # #  #  ### # # ###";// 159
      String var4 = "Protecting Java applications since 2006";// 493
      String var5 = ProductInformation.getName() + " " + ProductInformation.getVersionString();// 561
      String var6 = ProductInformation.getWebsiteString();// 377
      int var7 = Math.max(31, Math.max(var5.length(), Math.max(var6.length(), 39)));// 22
      var7 += 4;// 6
      StringBuffer var8;
      method1482(var8 = new StringBuffer("\n"), '#', var7).append("\n#");// 144 461
      method1482(var8, ' ', var7 - 2).append("#\n#");// 358
      int var9 = (var7 - 31 - 2) / 2;// 192
      int var10 = var7 - var9 - 31 - 2;// 574
      if (var9 > var10) {// 272
         var10++;// 179
         var9--;// 321
      }

      method1482(var8, ' ', var9).append(var0);// 567
      method1482(var8, ' ', var10).append("#\n#");// 400
      method1482(var8, ' ', var9).append(var1);// 33
      method1482(var8, ' ', var10).append("#\n#");// 0
      method1482(var8, ' ', var9).append(var2);// 240
      method1482(var8, ' ', var10).append("#\n#");// 246
      method1482(var8, ' ', var9).append(var3);// 552
      method1482(var8, ' ', var10).append("#\n#");// 603
      var9 = (var7 - 39 - 2) / 2;// 466
      var10 = var7 - var9 - 39 - 2;// 467
      if (var9 > var10) {// 485
         var10++;// 59
         var9--;// 68
      }

      method1482(var8, ' ', var7 - 2).append("#\n#");// 330
      method1482(var8, ' ', var9).append(var4);// 589
      method1482(var8, ' ', var10).append("#\n#");// 579
      var1 = "                                  ";// 398
      var2 = "          DEMO VERSION!           ";// 428
      var3 = "     NOT FOR COMMERCIAL USE!      ";// 87
      var4 = "                                  ";// 586
      String var11 = "Demo version adds System.out's and";// 399
      String var12 = "gives 'ALLATORI_DEMO' name to some";// 232
      String var13 = "        fields and methods        ";// 463
      var9 = (var7 - 34 - 2) / 2;// 424
      var10 = var7 - var9 - 34 - 2;// 28
      if (var9 > var10) {// 588
         var10++;// 412
         var9--;// 329
      }

      method1482(var8, ' ', var9).append(var1);// 269
      method1482(var8, ' ', var10).append("#\n#");// 455
      method1482(var8, ' ', var9).append(var2);// 148
      method1482(var8, ' ', var10).append("#\n#");// 236
      method1482(var8, ' ', var7 - 2).append("#\n#");// 142
      method1482(var8, ' ', var9).append(var3);// 39
      method1482(var8, ' ', var10).append("#\n#");// 368
      method1482(var8, ' ', var9).append(var4);// 99
      method1482(var8, ' ', var10).append("#\n#");// 160
      method1482(var8, ' ', var9).append(var11);// 40
      method1482(var8, ' ', var10).append("#\n#");// 63
      method1482(var8, ' ', var9).append(var12);// 541
      method1482(var8, ' ', var10).append("#\n#");// 550
      method1482(var8, ' ', var9).append(var13);// 510
      method1482(var8, ' ', var10).append("#\n#");// 456
      method1482(var8, ' ', var7 - 2).append("#\n#");// 82
      var9 = (var7 - var5.length() - 2) / 2;// 5
      var10 = var7 - var9 - var5.length() - 2;// 279
      if (var9 > var10) {// 450
         var10++;// 470
         var9--;// 386
      }

      method1482(var8, ' ', var9).append(var5);// 157
      method1482(var8, ' ', var10).append("#\n#");// 24
      method1482(var8, ' ', var7 - 2).append("#\n#");// 286
      var9 = (var7 - var6.length() - 2) / 2;// 108
      var10 = var7 - var9 - var6.length() - 2;// 27
      if (var9 > var10) {// 242
         var10++;// 209
         var9--;// 94
      }

      method1482(var8, ' ', var9).append(var6);// 116
      method1482(var8, ' ', var10).append("#\n#");// 422
      method1482(var8, ' ', var7 - 2).append("#\n");// 464
      method1482(var8, '#', var7).append("\n");// 25
      return var8.toString();// 31
   }

   // $VF: synthetic method
   public static void method1480(Class338 var0) {
      Class338 var2 = var0;
      Class517 var1 = new Class517();// 382
      Iterator var4;
      Iterator var10000 = var4 = Class580.method1935().method1345().iterator();// 210

      while (var10000.hasNext()) {
         Class583 var3 = (Class583)var4.next();
         var10000 = var4;
         var1.method1469(var3.field2346, var3.field2347, var2);// 576
      }
   }// 103

   // $VF: synthetic method
   public static void method1492(Class338 var0) {
      new Class593(var0, Class580.method1929().method1692()).method2027(Class580.method1929().method1695());// 77 288
   }// 129

   // $VF: synthetic method
   public static String method1493(Class338 var0) {
      return new Class593(var0, Class580.method1929().method1692()).method2035();// 110 437
   }
}
