package mapped;

// $VF: Compiled from mq
public class Class356 {
   // $VF: synthetic field
   public static final int field1060 = 1024;
   // $VF: synthetic field
   public static final int field1061 = 8192;
   // $VF: synthetic field
   public static final int field1062 = 256;
   // $VF: synthetic field
   public static final int field1063 = 4096;
   // $VF: synthetic field
   public static final int field1064 = 2;
   // $VF: synthetic field
   public static final int field1065 = 128;
   // $VF: synthetic field
   public static final int field1066 = 16;
   // $VF: synthetic field
   public static final int field1067 = 8;
   // $VF: synthetic field
   public static final int field1068 = 2048;
   // $VF: synthetic field
   public static final int field1069 = 1;
   // $VF: synthetic field
   public static final int field1070 = 32;
   // $VF: synthetic field
   public static final int field1071 = 512;
   // $VF: synthetic field
   public static final int field1072 = 64;
   // $VF: synthetic field
   public static final int field1073 = 4;

   // $VF: synthetic method
   public static boolean method669(Class196 var0, int var1) {
      if (var0.method252()) {// 242
         if ((var1 & 1) == 0) {// 94
            return false;// 209
         }
      } else if (var0.method249()) {// 69
         if ((var1 & 2) == 0) {// 116
            return false;// 422
         }
      } else if (var0.method163()) {// 464
         if ((var1 & 8) == 0) {// 25
            return false;// 31
         }
      } else if ((var1 & 4) == 0) {// 115
         return false;// 223
      }

      if ((var1 & 16) > 0 && !var0.method254()) {// 248 440
         return false;// 97
      } else if ((var1 & 32) > 0 && !var0.method242()) {// 411 468
         return false;// 138
      } else if ((var1 & 64) > 0 && !var0.method238()) {// 119 285
         return false;// 32
      } else if ((var1 & 128) > 0 && !var0.method159()) {// 238 423
         return false;// 61
      } else if ((var1 & 256) > 0 && !var0.method247()) {// 220 525
         return false;// 593
      } else if ((var1 & 512) > 0 && !var0.method246()) {// 336 540
         return false;// 291
      } else if ((var1 & 1024) > 0 && !var0.method101()) {// 57 169
         return false;// 216
      } else if ((var1 & 2048) > 0 && !var0.method261()) {// 299 314
         return false;// 137
      } else {
         return (var1 & 4096) > 0 && !var0.method236() ? false : (var1 & 8192) <= 0 || var0.method161();// 50 135 253 443 474
      }
   }

   // $VF: synthetic method
   public static boolean method670(Class128[] var0, String var1) {
      Class128[] var2 = var0;
      if (var1 == null) {// 576
         return true;
      } else {
         for (int var10000 = var3 = var0.length - 1; var10000 >= 0; var10000 = --var3) {// 103
            if (var2[var3].method20().matches(var1)) {// 548
               return true;
            }
         }

         return false;// 545
      }
   }

   // $VF: synthetic method
   public static boolean method671(String[] var0, String[] var1) {
      String[] var4 = var0;

      int var2;
      for (int var10000 = var2 = var1.length - 1; var10000 >= 0; var10000 = --var2) {// 66
         boolean var3 = false;// 536
         int var5;
         var10000 = var5 = var4.length - 1;

         while (true) {
            if (var10000 < 0) {
               var8 = var3;// 471
               break;
            }

            if (var4[var5].matches(var1[var2])) {// 218
               var8 = var3 = true;// 109
               break;// 213
            }

            var10000 = --var5;// 307
         }

         if (!var8) {
            return false;
         }
      }

      return true;// 582
   }

   // $VF: synthetic method
   public static boolean method672(Class533[] var0, String var1) {
      Class533[] var2 = var0;
      if (var1 == null) {// 339
         return true;
      } else {
         for (int var10000 = var5 = var0.length - 1; var10000 >= 0; var10000 = --var5) {// 308
            try {
               if (var2[var5].method1589().matches(var1)) {// 549
                  return true;// 499
               }
            } catch (ClassCastException var4) {// 76
               throw var4;// 281
            }
         }

         return false;// 483
      }
   }

   // $VF: synthetic method
   public static int method673(String var0) {
      String var1 = var0.trim();// 310
      short var2 = 0;// 484
      if (var1.indexOf("public") >= 0) {// 409
         var2 = 1;// 389
      }

      if (var1.indexOf("protected") >= 0) {// 18
         var2 |= 2;// 513
      }

      if (var1.indexOf("package") >= 0) {// 93
         var2 |= 4;// 151
      }

      if (var1.indexOf("private") >= 0) {// 530
         var2 |= 8;// 491
      }

      if (var1.indexOf("protected+") >= 0) {// 147
         var2 |= 3;// 295
      }

      if (var1.indexOf("package+") >= 0) {// 338
         var2 |= 7;// 273
      }

      if (var1.indexOf("private+") >= 0) {// 161
         var2 |= 15;// 141
      }

      if (var2 == 0) {// 580
         var2 = 15;// 226
      }

      if (var1.indexOf("static") >= 0) {// 78
         var2 |= 16;// 418
      }

      if (var1.indexOf("final") >= 0) {// 533
         var2 |= 32;// 185
      }

      if (var1.indexOf("synchronized") >= 0) {// 406
         var2 |= 64;// 1
      }

      if (var1.indexOf("volatile") >= 0) {// 46
         var2 |= 128;// 170
      }

      if (var1.indexOf("transient") >= 0) {// 553
         var2 |= 256;// 58
      }

      if (var1.indexOf("native") >= 0) {// 190
         var2 |= 512;// 315
      }

      if (var1.indexOf("interface") >= 0) {// 465
         var2 |= 1024;// 132
      }

      if (var1.indexOf("abstract") >= 0) {// 184
         var2 |= 2048;// 534
      }

      if (var1.indexOf("strictfp") >= 0) {// 488
         var2 |= 4096;// 495
      }

      if (var1.indexOf("enum") >= 0) {// 159
         var2 |= 8192;// 493
      }

      return var2;// 377
   }

   // $VF: synthetic method
   public static String method674(String var0) {
      return var0.startsWith("regex:") ? var0.substring(6) : var0.replaceAll("\\.", "\\\\.").replaceAll("\\*", ".*");// 149 157 470
   }

   // $VF: synthetic method
   public static boolean method675(String var0) {
      if (var0.equals("public")) {// 466
         return true;
      } else if (var0.equals("protected")) {// 467
         return true;
      } else if (var0.equals("package")) {// 485
         return true;
      } else if (var0.equals("private")) {// 68
         return true;
      } else if (var0.equals("protected+")) {// 59
         return true;
      } else {
         return var0.equals("package+") ? true : var0.equals("private+");// 330 391
      }
   }

   // $VF: synthetic method
   public static boolean method676(Class138[] var0, String var1) {
      Class138[] var2 = var0;
      StringBuffer var4 = new StringBuffer("");// 280

      int var3;
      for (int var10000 = var3 = var0.length - 1; var10000 >= 0; var10000 = var3) {// 370
         StringBuilder var10002 = new StringBuilder().append(var2[var3].toString());
         var3--;
         var4.insert(0, var10002.append(",").toString());// 516
      }

      if (var4.length() > 0) {// 95
         var4.deleteCharAt(var4.length() - 1);
      }

      return var4.toString().matches(var1);// 227
   }

   // $VF: synthetic method
   public static String method677(String var0) {
      return var0 == null ? ".*" : method674(var0.trim().replaceAll("\\$", "\\\\\\$"));// 232 399 463 586
   }

   // $VF: synthetic method
   public static boolean method678(String var0) {
      if (var0.indexOf("public") >= 0) {// 144
         return true;
      } else if (var0.indexOf("protected") >= 0) {// 461
         return true;
      } else if (var0.indexOf("package") >= 0) {// 358
         return true;
      } else if (var0.indexOf("private") >= 0) {// 192
         return true;
      } else if (var0.indexOf("static") >= 0) {// 574
         return true;
      } else if (var0.indexOf("final") >= 0) {// 272
         return true;
      } else if (var0.indexOf("synchronized") >= 0) {// 321
         return true;
      } else if (var0.indexOf("volatile") >= 0) {// 179
         return true;
      } else if (var0.indexOf("transient") >= 0) {// 146
         return true;
      } else if (var0.indexOf("native") >= 0) {// 567
         return true;
      } else if (var0.indexOf("interface") >= 0) {// 400
         return true;
      } else if (var0.indexOf("abstract") >= 0) {// 33
         return true;
      } else {
         return var0.indexOf("strictfp") >= 0 ? true : var0.indexOf("enum") >= 0;// 0 240
      }
   }

   // $VF: synthetic method
   public static String method679(String var0) {
      return method677(var0);// 99
   }

   // $VF: synthetic method
   public static boolean method680(String var0) {
      return var0.charAt(0) == '@';// 415
   }

   // $VF: synthetic method
   public static String method681(String var0) {
      return var0.replaceAll("\\s+", "")// 5 541
         .replaceAll("\\[", "\\\\[")// 550
         .replaceAll("]", "\\\\]")// 510
         .replaceAll("\\.", "\\\\.")// 456
         .replaceAll("\\*\\*", "%@#")// 367
         .replaceAll("\\*", "[^,]*")// 82
         .replaceAll("\\%\\@\\#", ".*");// 83
   }

   // $VF: synthetic method
   public static boolean method682(Class338 var0, String var1, String var2) {
      Class338 var3 = var0;
      if (var1 == null) {// 107
         return false;
      } else if (var1.matches(var2)) {// 437
         return true;
      } else {
         Class206 var4;
         if ((var4 = var0.method557(var1)) != null) {// 110 221
            int var11;
            for (int var12 = var11 = (var9 = var4.method130()).length - 1; var12 >= 0; var12 = --var11) {// 444 601
               if (method682(var3, var9[var11], var2)) {// 193
                  return true;
               }
            }

            return method682(var3, var4.method190(), var2);// 251
         } else {
            try {
               Class[] var5;
               for (int var10000 = var10 = (var5 = (var8 = Class.forName(var1, false, var3.method559())).getInterfaces()).length - 1;// 245 300
                  var10000 >= 0;
                  var10000 = --var10// 296
               ) {
                  if (method682(var3, var5[var10].getName(), var2)) {// 404
                     return true;
                  }
               }

               return var8.getSuperclass() != null ? method682(var3, var8.getSuperclass().getName(), var2) : false;// 81 394 417
            } catch (ClassNotFoundException var6) {// 556
               return true;// 316
            } catch (SecurityException var7) {// 207
               Class528.method1559("Cannot read class: " + var1);// 275
               throw var7;// 127
            }
         }
      }
   }

   // $VF: synthetic method
   public static String[] method683(String var0) {
      if (var0 == null) {// 329
         return new String[0];
      } else {
         String[] var1;
         if ((var1 = var0.split("\\s*,\\s*")) == null) {// 38 412
            return new String[0];
         } else {
            for (int var10000 = var3 = var1.length - 1; var10000 >= 0; var10000 = var3) {// 257
               var1[var3] = var1[var3].replaceAll("\\$", "\\\\\\$");// 269
               int var10001 = var3;
               String var10002 = method674(var1[var3]);// 455
               var3--;
               var1[var10001] = var10002;
            }

            return var1;// 236
         }
      }
   }
}
