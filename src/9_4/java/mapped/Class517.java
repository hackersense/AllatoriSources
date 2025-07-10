package mapped;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashSet;
import java.util.Vector;

// $VF: Compiled from ts
public class Class517 {
   // $VF: synthetic field
   public Class338 field1759;
   // $VF: synthetic field
   public String field1760;
   // $VF: synthetic field
   public HashSet field1761 = new HashSet();
   // $VF: synthetic field
   public boolean field1762 = false;

   // $VF: synthetic method
   public void method1465(File var1, Class338 var2, String var3) {
      Class517 var6 = this;
      File[] var13 = var1.listFiles();// 278

      int var4;
      for (int var10000 = var4 = 0; var10000 < var13.length; var10000 = ++var4) {// 466
         File var5;
         if ((var5 = var13[var4]).isDirectory()) {// 467 485
            String var9;
            if ((var9 = var3 + "." + var5.getName()).startsWith(".")) {// 59 68
               var9 = var9.substring(1);
            }

            var6.method1465(var5, var2, var9);// 391
         } else if (var5.getName().endsWith(".class")) {// 579
            String var10 = var5.getName();// 555
            String var11 = var10.substring(0, var10.length() - 6);// 73
            if (var3.length() > 0) {// 415
               var11 = var3 + "." + var11;// 398
            }

            Class206 var7;
            if ((var7 = var2.method557(var11)) != null && !Class580.method1924().method2043(var2, var7)) {// 87 428
               var5.delete();// 586
               String var8 = var7.method93();// 399
               var8 = new StringBuilder().append(var8.replace('.', '/')).append(".class").toString();// 232
               var6.method1468(var7, new File(new StringBuilder().append(var6.field1760).append("/").append(var8).toString()));// 463
            }
         }
      }

      Vector var14 = var2.method563();// 412

      int var15;
      for (int var19 = var15 = 0; var19 < var14.size(); var19 = var15) {// 38
         Class206 var12;
         String var16 = (var12 = (Class206)var14.get(var15)).method93();// 257 269
         var16 = new StringBuilder().append(var16.replace('.', '/')).append(".class").toString();// 455
         StringBuilder var10004 = new StringBuilder().append(var6.field1760).append("/").append(var16);
         var15++;
         var6.method1468(var12, new File(var10004.toString()));// 148
      }
   }// 39

   // $VF: synthetic method
   public static boolean method1466(Class517 var0, boolean var1) {
      return var0.field1762 = var1;
   }

   // $VF: synthetic method
   public static boolean method1467(Class517 var0) {
      return var0.field1762;
   }

   // $VF: synthetic method
   public void method1468(Class206 var1, File var2) {
      var2.getParentFile().mkdirs();// 510 550
      BufferedOutputStream var7 = new BufferedOutputStream(new FileOutputStream(var2));// 456
      BufferedOutputStream var10000;
      if (var1.method84() > 50) {// 367
         Class438 var5 = new Class438(this.field1759, Class580.method1930().field1196);// 82
         Class508 var4 = new Class508(var1.method136().method207());// 5
         Class344 var6 = new Class344(this, 2, var5);// 279
         var10000 = var7;
         var4.method1396(var6, 4);// 135
         var7.write(var6.method633());// 474
      } else {
         var10000 = var7;// 166
         var7.write(var1.method136().method207());
      }

      var10000.close();// 292
   }// 373

   // $VF: synthetic method
   public void method1469(String var1, String var2, Class338 var3) {
      this.field1759 = var3;
      this.field1760 = var2;// 30 143
      if (var1.equals(var2)) {// 252
         this.method1465(new File(var1), var3, "");// 20
      } else {
         this.method1470(new File(var1), new File(var2), var3, "");// 239
      }
   }// 310

   // $VF: synthetic method
   public void method1470(File var1, File var2, Class338 var3, String var4) {
      Class517 var6 = this;
      File[] var12 = var1.listFiles();// 409

      int var5;
      for (int var10000 = var5 = 0; var10000 < var12.length; var10000 = ++var5) {// 389
         File var10;
         if ((var10 = var12[var5]).isDirectory()) {// 18 513
            String var7;
            if ((var7 = var4 + "." + var10.getName()).startsWith(".")) {// 93 151
               var7 = var7.substring(1);
            }

            var6.method1470(var10, new File(new StringBuilder().append(var2.getPath()).append("/").append(var10.getName()).toString()), var3, var7);// 530
         } else if (var10.getName().endsWith(".class")) {// 295
            String var14 = var10.getName();// 338
            var14 = var14.substring(0, var14.length() - 6);// 273
            if (var4.length() > 0) {// 161
               var14 = var4 + "." + var14;// 141
            }

            Class206 var8;
            if ((var8 = var3.method557(var14)) != null && !Class580.method1924().method2043(var3, var8)) {// 226 580
               String var9 = var8.method93();// 123
               var9 = new StringBuilder().append(var9.replace('.', '/')).append(".class").toString();// 78
               var6.method1468(var8, new File(new StringBuilder().append(var6.field1760).append("/").append(var9).toString()));// 418
            } else {
               if (var8 == null) {// 185
                  Class528.method1558("File " + var10.getPath() + " is copied with no modifications, as it is not in its package.");// 170
               }

               new File(var2.getPath()).mkdirs();// 58
               Class550.method1726(var10, new File(new StringBuilder().append(var2.getPath()).append("/").append(var10.getName()).toString()));// 190
            }
         } else {
            String var16 = new StringBuilder().append(var2.getPath()).append("/").append(var10.getName()).toString();// 132
            if (Class580.method1923().method1655().method1631()) {// 184
               if ((var16 = new StringBuilder()
                     .append(var6.field1760)// 534
                     .append("/")
                     .append(Class416.method834("", new StringBuilder().append(var4.replace('.', '/')).append('/').append(var10.getName()).toString()))
                     .toString())
                  .contains("/")) {// 488
                  new File(var16.substring(0, var16.lastIndexOf(47))).mkdirs();// 495
               }
            } else {
               new File(var2.getPath()).mkdirs();// 493
            }

            if (Class580.method1923().method1655().method1632(var10.getName())) {// 377
               FileInputStream var18 = new FileInputStream(var10);// 604
               FileOutputStream var22 = new FileOutputStream(new File(var16));// 22
               Class416.method837(var18, var22, Class580.method1923().method1655().method1633(var10.getName()));// 6
               var18.close();// 144
               var22.close();// 461
            } else {
               Class550.method1726(var10, new File(var16));// 192
            }
         }
      }

      Vector var13 = var3.method563();// 179

      for (int var23 = var11 = 0; var23 < var13.size(); var23 = var11) {// 146
         Class206 var17;
         String var19 = (var17 = (Class206)var13.get(var11)).method93();// 400 567
         var19 = new StringBuilder().append(var19.replace('.', '/')).append(".class").toString();// 33
         StringBuilder var10004 = new StringBuilder().append(var6.field1760).append("/").append(var19);
         var11++;
         var6.method1468(var17, new File(var10004.toString()));// 0
      }
   }// 246

   // $VF: synthetic method
   public static HashSet method1471(Class517 var0) {
      return var0.field1761;// 507
   }
}
