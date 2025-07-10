package mapped;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// $VF: Compiled from cy
public class Class600 {
   // $VF: synthetic method
   public static void method2080(BufferedReader var0, Class555 var1, PrintWriter var2) {
      BufferedReader var3 = var0;
      StringBuilder var4 = new StringBuilder();// 236
      BufferedReader var10000 = var0;// 368

      String var5;
      while ((var5 = var10000.readLine()) != null) {
         int var20 = 0;// 99
         int var6 = var5.length();// 160
         var4.setLength(0);// 40

         do {
            int var13 = -1;
            int var12 = -1;
            int var11 = -1;
            int var10 = -1;
            int var9 = -1;
            int var8 = -1;// 541
            int var7 = var20;// 550
            int var26 = var20;// 456

            while (var26 < var6 && !Character.isJavaIdentifierStart(var5.charAt(var20))) {
               var26 = ++var20;
            }

            var8 = var20;// 367
            int var27 = var20;// 82

            while (
               var27 < var6
                  && (
                     Character.isJavaIdentifierPart(var5.charAt(var20))
                        || var5.charAt(var20) == '.'
                        || var5.charAt(var20) == '-'
                        || var5.charAt(var20) == '<'
                        || var5.charAt(var20) == '>'
                  )
            ) {
               var27 = ++var20;// 279
            }

            var9 = var20;// 450
            int var28 = var20;// 386

            while (var28 < var6 && var5.charAt(var20) == ' ') {
               var28 = ++var20;
            }

            label212: {
               if (var20 < var6 && var5.charAt(var20) == '(') {// 470
                  var10 = ++var20;// 149 157
                  int var30 = var20;// 24

                  while (var30 < var6 && Character.isLetter(var5.charAt(var20))) {
                     var30 = ++var20;
                  }

                  var11 = var20;// 286
                  if (var20 < var6 && var5.charAt(var20) == ':') {// 600
                     var12 = ++var20;// 27 108
                     int var32 = var20;// 242

                     while (var32 < var6 && Character.isDigit(var5.charAt(var20))) {
                        var32 = ++var20;
                     }

                     var13 = var20;// 94
                     var31 = var9;
                     break label212;// 209
                  }
               } else if (var20 < var6 && var5.charAt(var20) == ':') {// 69
                  var12 = ++var20;// 116 422
                  int var29 = var20;// 464

                  while (var29 < var6 && Character.isDigit(var5.charAt(var20))) {
                     var29 = ++var20;
                  }

                  var13 = var20;// 25
               }

               var31 = var9;// 115
            }

            if (var31 <= var8) {
               var4.append(var5.substring(var7, var20));// 235
            } else {
               String var14 = var5.substring(var8, var9);// 223
               if (var1.method1761(var14)) {// 45
                  var4.append(var5.substring(var7, var8));// 23
                  int var34;
                  if (var13 > var12) {// 248
                     String var15 = var5.substring(var12, var13);// 97
                     int var16 = -1;// 411

                     label176: {
                        try {
                           var16 = var1.field1959.indexOf(Integer.valueOf(var15));// 138
                        } catch (NumberFormatException var19) {// 285
                           var33 = var1;// 32
                           break label176;
                        }

                        var33 = var1;
                     }

                     String var17;
                     if ((var17 = var33.method1765(var14, var16)) == null) {// 238
                        var17 = var1.method1762(var14);// 423
                     }

                     var4.append(var17);// 61
                     var34 = var11;
                  } else {
                     var4.append(var1.method1762(var14));// 220
                     var34 = var11;// 540
                  }

                  if (var34 > var10) {
                     String var23 = var5.substring(var10, var11);// 291
                     var4.append(var5.substring(var9, var10));// 57
                     if (var1.field1957.method1338(var23)) {// 169
                        var23 = var1.field1957.method1341(var23);// 216
                     }

                     var4.append(var23);// 299
                     if (var13 <= var12) {// 314
                        var4.append(var5.substring(var11, var20));// 137
                     }
                  }

                  if (var13 > var12) {// 253
                     String var24 = var5.substring(var12, var13);// 135

                     try {
                        int var25;
                        if ((var25 = var1.field1959.indexOf(Integer.valueOf(var24))) >= 0) {// 166 443
                           var24 = "" + var25;
                        }
                     } catch (NumberFormatException var18) {// 434
                     }

                     StringBuilder var35;
                     if (var11 > var10) {// 373
                        var35 = var4;// 72
                        var4.append(var5.substring(var11, var12));
                     } else {
                        var35 = var4;// 497
                        var4.append(var5.substring(var9, var12));
                     }

                     var35.append(var24);// 66
                     var4.append(var5.substring(var13, var20));// 536
                  }

                  if (var11 <= var10 && var13 <= var12) {// 218
                     var4.append(var5.substring(var9, var20));// 109
                  }
               } else if ((var14.indexOf(46) > 0 || var14.length() > 3) && var1.field1956.method1338(var14)) {// 213
                  var4.append(var5.substring(var7, var8));// 15
                  var4.append(var1.field1956.method1341(var14));// 385
                  var4.append(var5.substring(var9, var20));// 471
               } else {
                  var4.append(var5.substring(var7, var20));// 582
               }
            }
         } while (var20 < var6);// 516

         var10000 = var3;
         var2.println(method2082(var4.toString(), var1));// 95
      }
   }// 55

   // $VF: synthetic method
   public static void method2081(BufferedReader var0, Class555 var1, PrintWriter var2) {
      BufferedReader var3 = var0;
      Pattern var11 = Pattern.compile("(.*(?:at|Frame)\\s+)(.*)\\((.*)\\)(.*)");// 26
      Pattern var4 = Pattern.compile("(.*syslog:\\s+)(.*?)\\((.*)\\)(.*)");// 52
      Pattern var5 = Pattern.compile("(\\s*)(.*?)\\((.*)\\)(.*)");// 10
      Pattern var6 = Pattern.compile(
         "(.*?\\s+)((?:\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*\\.)+\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*):(\\d+)(\\s+.*)"// 335
      );
      Pattern var7 = Pattern.compile("(.*lock.*a\\s+)(.*?)(\\).*)");// 30
      String var9 = null;// 252
      String var10 = null;
      String var20 = null;
      String var12 = null;
      BufferedReader var10000 = var0;// 239

      String var8;
      while ((var8 = var10000.readLine()) != null) {
         boolean var14 = false;// 310
         Matcher var13;
         if ((var13 = var11.matcher(var8)).matches()) {// 409 484
            var14 = true;// 389
            var9 = var13.group(1);// 18
            if ((var10 = var13.group(2)).indexOf(40) > 0) {// 93 513
               var10 = var10.substring(0, var10.indexOf(40));// 151
            }

            var20 = var13.group(3);// 530
            var12 = var13.group(4);// 491
         }

         if (!var14 && (var13 = var4.matcher(var8)).matches()) {// 161 273 338
            var14 = true;// 141
            var9 = var13.group(1);// 580
            var10 = var13.group(2);// 226
            var20 = var13.group(3);// 123
            var12 = var13.group(4);// 78
         }

         if (!var14 && (var13 = var5.matcher(var8)).matches()) {// 1 185 406
            var14 = true;// 46
            var9 = var13.group(1);// 170
            var10 = var13.group(2);// 553
            var20 = var13.group(3);// 58
            var12 = var13.group(4);// 190
         }

         if (!var14 && (var13 = var6.matcher(var8)).matches()) {// 132 184 534
            var9 = var13.group(1);// 488
            String var15 = var13.group(2);// 495
            var20 = var13.group(3);// 159
            var12 = var13.group(4);// 493
            if (var1.field1956.method1338(var15)) {// 561
               label98: {
                  try {
                     var8 = var9 + var1.field1956.method1341(var15) + ":" + var1.field1959.indexOf(Integer.valueOf(var20)) + var12;// 604
                  } catch (Exception var19) {// 22
                     var30 = var2;// 144
                     break label98;
                  }

                  var30 = var2;
               }

               var30.println(var8);
               var10000 = var3;
               continue;// 461
            }
         }

         label91: {
            if (var14) {// 321
               if (var1.method1761(var10)) {// 179
                  boolean var27 = false;// 146
                  if (var20.startsWith("(Compiled Method)")) {// 567
                     var27 = true;// 400
                     var20 = var20.substring(17);// 33
                  }

                  int var16 = -1;// 240
                  Class555 var28;
                  if (var20.indexOf(58) >= 0) {// 246
                     String var25 = var20.substring(0, var20.indexOf(58));// 552
                     String var17 = var20.substring(var20.indexOf(58) + 1);// 603
                     if (var1.field1957.method1338(var25)) {// 278
                        var25 = var1.field1957.method1341(var25);// 466
                     }

                     try {
                        if ((var16 = var1.field1959.indexOf(Integer.valueOf(var17))) >= 0) {// 59 68
                           var17 = "" + var16;// 391
                        }
                     } catch (NumberFormatException var18) {
                     }

                     var20 = var25 + ":" + var17;// 555
                     var28 = var1;
                  } else {
                     if (var1.field1957.method1338(var20)) {// 415
                        var20 = var1.field1957.method1341(var20);// 398
                     }

                     var28 = var1;// 87
                  }

                  String var26;
                  if ((var26 = var28.method1765(var10, var16)) == null) {// 586
                     var26 = var1.method1762(var10);// 399
                  }

                  var8 = var9 + var26 + (var27 ? "(Compiled Method)" : "") + "(" + var20 + ")" + var12;// 232
                  var29 = var2;
                  break label91;// 463
               }
            } else if ((var13 = var7.matcher(var8)).matches() && var1.field1956.method1338(var13.group(2))) {// 28 424
               var8 = new StringBuilder().insert(0, var13.group(1)).append(var1.field1956.method1341(var13.group(2))).append(var13.group(3)).toString();// 588
            }

            var29 = var2;// 412
         }

         var29.println(var8);
         var10000 = var3;
      }
   }// 257

   // $VF: synthetic method
   public static String method2082(String var0, Class555 var1) {
      String var3 = var0;
      Matcher var2 = Pattern.compile("L(.*?);").matcher(var0);// 107 258

      while (var2.find()) {// 437
         String var4;
         var0 = (var4 = var2.group(1)).replace('/', '.');// 110 221
         if (var1.field1956.method1338(var0)) {// 444
            var3 = var3.replace(var4, var1.field1956.method1341(var0).replace('.', '/'));// 601
         }
      }

      return var3;// 251
   }
}
