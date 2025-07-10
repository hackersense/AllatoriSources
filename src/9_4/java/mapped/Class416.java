package mapped;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

// $VF: Compiled from mv
public class Class416 {
   // $VF: synthetic method
   public static String method834(String var0, String var1) {
      String var3 = var0;
      if (var0 == null) {// 537
         var3 = "";
      }

      String var10000;
      if (var3.length() > 0) {// 222
         if (!var1.startsWith(var3)) {// 265
            return var1;// 26
         }

         var10000 = var1 = var1.substring(var3.length());// 446
      } else {
         var10000 = var1;// 335
      }

      String[] var4;
      String[] var16 = var4 = var10000.split("/");
      var0 = var16[var16.length - 1];// 557
      String var2 = "";// 34
      if (var0.contains(".")) {// 332
         var2 = var0.substring(var0.indexOf(46));// 260
         var0 = var0.substring(0, var0.indexOf(46));// 30
      }

      String var5 = "";// 252

      int var6;
      for (int var17 = var6 = 0; var17 < var4.length - 1; var17 = var6) {// 20
         StringBuilder var18 = new StringBuilder().append(var5).append(var4[var6]);
         var6++;
         var5 = var18.append('.').toString();
      }

      String var13 = var5 + var0;// 204
      if (Class580.method1930().field1197.field2353.method1338(var13)) {// 239
         return var3 + Class580.method1930().field1197.field2353.method1341(var13).replace('.', '/') + var2;// 310
      } else {
         while (var0.contains("_")) {// 484
            var2 = new StringBuilder().insert(0, var0.substring(var0.lastIndexOf(95))).append(var2).toString();// 409
            var0 = var0.substring(0, var0.lastIndexOf(95));// 389
            String var14 = var5 + var0;// 18
            if (Class580.method1930().field1197.field2353.method1338(var14)) {// 513
               return var3 + Class580.method1930().field1197.field2353.method1341(var14).replace('.', '/') + var2;// 93
            }
         }

         for (int var19 = var8 = var4.length - 2; var19 >= 0; var19 = --var8) {// 295
            var2 = "";// 338

            for (int var20 = var11 = 0; var20 < var8; var20 = var11) {// 273
               StringBuilder var21 = new StringBuilder().append(var2).append(var4[var11]);
               var11++;
               var2 = var21.append('.').toString();
            }

            var2 = var2 + var4[var8];// 161
            if (Class580.method1930().field1198.method1338(var2) && !var2.equals(Class580.method1930().field1198.method1341(var2))) {// 580
               var5 = var3 + Class580.method1930().field1198.method1341(var2).replace('.', '/');// 226

               for (int var22 = var6 = var8 + 1; var22 <= var4.length - 1; var22 = var6) {// 123
                  StringBuilder var23 = new StringBuilder().append(var5).append('/');
                  String var10001 = var4[var6];
                  var6++;
                  var5 = var23.append(var10001).toString();
               }

               return var5;// 78
            }
         }

         return var3 + var1;// 406
      }
   }

   // $VF: synthetic method
   public static void method835(Reader var0, Writer var1) {
      Reader var3 = var0;
      StringBuffer var2 = new StringBuffer();// 488

      while ((var4 = var3.read()) >= 0) {// 159 493
         char var5 = (char)var4;// 377
         if (var2.length() == 0) {// 22
            if (Character.isJavaIdentifierStart(var5)) {// 6
               var2.append(var5);// 144
            } else {
               var1.write(var5);// 358
            }
         } else if (!Character.isJavaIdentifierPart(var5) && var5 != '.' && var5 != '-') {// 574
            method836(var1, var2.toString());
            var2.setLength(0);// 146
            var1.write(var5);// 179 567
         } else {
            var2.append(var5);// 272
         }
      }

      method836(var1, var2.toString());// 0 192 240 321
   }

   // $VF: synthetic method
   public static void method836(Writer var0, String var1) {
      String var3;
      if ((var3 = Class580.method1930().field1197.field2353.method1341(var1)) != null) {// 278 466
         var0.write(var3);// 467
      } else {
         var0.write(var1);// 68
      }
   }// 59

   // $VF: synthetic method
   public static void method837(InputStream var0, OutputStream var1, String var2) {
      BufferedReader var3 = new BufferedReader(new InputStreamReader(var0, var2));// 553
      BufferedWriter var5 = new BufferedWriter(new OutputStreamWriter(var1, var2));// 58
      method835(var3, var5);// 190
      var5.flush();// 315
      var1.flush();// 465
   }// 132
}
