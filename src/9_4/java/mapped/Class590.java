package mapped;

// $VF: Compiled from ja
public final class Class590 {
   // $VF: synthetic field
   public int field2362;
   // $VF: synthetic field
   public final Class342 field2363;
   // $VF: synthetic field
   public int field2364;
   // $VF: synthetic field
   public Class551[] field2365;
   // $VF: synthetic field
   public Class551[] field2366;
   // $VF: synthetic field
   public Class529 field2367;
   // $VF: synthetic field
   public Class512[] field2368;
   // $VF: synthetic field
   public final Class508 field2369;
   // $VF: synthetic field
   public Class512[] field2370;
   // $VF: synthetic field
   public int field2371;
   // $VF: synthetic field
   public String field2372;
   // $VF: synthetic field
   public Class529 field2373;
   // $VF: synthetic field
   public int field2374;
   // $VF: synthetic field
   public int field2375;
   // $VF: synthetic field
   public int field2376;

   // $VF: synthetic method
   public void method1960(Class508 var1, char[] var2) {
      Class590 var3 = this;
      byte[] var4 = var1.field1677;// 573
      int var5;
      int var10;
      int var10000 = var5 = var1.method1399((var10 = var1.method1362()) - 2);// 520

      while (true) {
         if (var10000 <= 0) {
            var18 = this;// 483
            break;
         }

         String var6 = var1.method1405(var10, var2);// 188
         if ("BootstrapMethods".equals(var6)) {// 172
            var18 = this;// 564
            this.field2362 = var1.method1399(var10 + 6);
            break;// 48
         }

         int var10002 = var1.method1391(var10 + 2);
         var5--;
         var10 += 6 + var10002;// 438
         var10000 = var5;// 502
      }

      if (var18.field2362 > 0) {
         var5 = var10 + 8;// 433
         int var15 = var1.method1391(var10 + 2) - 2;// 125
         this.field2373 = new Class529(var15);// 413
         this.field2373.method1573(var4, var5, var15);// 320
         int var12 = var5;// 365
         int var11 = 0;

         for (var10000 = var11; var10000 < var3.field2362; var10000 = var11) {// 366
            var15 = var12 - var5;// 263
            int var13 = var12 + 2;// 532
            int var7 = var1.method1399(var12);// 225
            int var8 = var1.method1399(var13);// 297
            Object var20 = var1.method1365(var7, var2);// 11
            var12 = var13 + 2;// 426
            var7 = var20.hashCode();
            var10000 = var8;// 356

            while (true) {
               var8--;
               if (var10000 <= 0) {
                  int var22 = var11;
                  long var10005 = (long)var15;
                  var11++;
                  var3.method1984(new Class551(var22, 64, var10005, var7 & 2147483647));// 360
                  break;
               }

               int var9 = var1.method1399(var12);// 522
               var12 += 2;// 41
               var7 ^= var1.method1365(var9, var2).hashCode();// 551
               var10000 = var8;
            }
         }
      }
   }// 274

   // $VF: synthetic method
   public void method1961(int var1, int var2, String var3, String var4, String var5) {
      this.method1984(new Class551(var1, var2, var3, var4, var5, 0L, method1989(var2, var3, var4, var5)));// 654
   }// 609

   // $VF: synthetic method
   public int method1962(String var1, int var2) {
      int var4 = method1969(129, var1, var2);// 1181

      for (Class551 var10000 = var5 = this.method1990(var4); var10000 != null; var10000 = var5 = var5.field1894) {// 1005 1218 1585
         if (var5.field1920 == 129 && var5.field1893 == var4 && var5.field1898 == (long)var2 && var5.field1911.equals(var1)) {// 1104 1590
            return var5.field1894;// 1067
         }
      }

      return this.method1979(new Class551(this.field2374, 129, var1, (long)var2, var4));// 1577
   }

   // $VF: synthetic method
   public Class552 method1963(String var1, String var2, String var3, boolean var4) {
      int var6 = var4 ? 11 : 10;// 43
      return this.method1964(var6, var1, var2, var3);// 535
   }

   // $VF: synthetic method
   public Class551 method1964(int var1, String var2, String var3, String var4) {
      int var5 = method1989(var1, var2, var3, var4);// 408

      for (Class551 var10000 = var7 = this.method1990(var5); var10000 != null; var10000 = var7 = var7.field1894) {// 277 313 379
         if (var7.field1920 == var1 && var7.field1893 == var5 && var7.field1893.equals(var2) && var7.field1899.equals(var3) && var7.field1911.equals(var4)) {// 70 113 203 302
            return var7;// 597
         }
      }

      this.field2367.method1562(var1, this.method1988(var2).field1923, this.method2012(var3, var4));// 165 189
      return this.method1980(new Class551(this.field2364++, var1, var2, var3, var4, 0L, var5));// 447
   }

   // $VF: synthetic method
   public void method1965(int var1, int var2, int var3) {
      this.method1984(new Class551(var1, var2, (long)var3, method2011(var2, var3)));// 863
   }// 864

   // $VF: synthetic method
   public int method1966(int var1, int var2) {
      long var3 = var1 < var2 ? (long)var1 | (long)var2 << 32 : (long)var2 | (long)var1 << 32;// 1114 1295 1364
      int var5 = method2011(131, var1 + var2);// 991

      Class551 var6;
      for (Class551 var12 = var6 = this.method1990(var5); var12 != null; var12 = var6 = var6.field1894) {// 1226 1408 1629
         if (var6.field1920 == 131 && var6.field1893 == var5 && var6.field1898 == var3) {// 1046
            return var6.field1913;// 1517
         }
      }

      String var8 = this.field2366[var1].field1911;// 1030
      String var11 = this.field2366[var2].field1911;// 1264
      int var9 = this.method1998(this.field2363.method625(var8, var11));// 1130
      this.method1980(new Class551(this.field2374, 131, var3, var5)).field1913 = var9;// 1179
      return var9;// 1469
   }

   // $VF: synthetic method
   public Class512 method1967(Class483 var1) {
      Class590 var3 = this;
      if (this.field2368 == null) {// 1562
         this.field2368 = new Class512[16];// 1231
         this.field2370 = new Class512[16];// 1404
      }

      int var4 = System.identityHashCode(var1);// 1313
      Class512 var11;
      Class512 var10000 = var11 = this.field2368[var4 % this.field2368.length];// 1011

      while (var10000 != null && var11.field1695 != var1) {// 1640
         var10000 = var11 = var11.field1696;// 1576
      }

      if (var11 != null) {// 1356
         return var11;// 1348
      } else {
         if (this.field2375 > this.field2368.length * 3 / 4) {// 1386
            int var2;
            int var5;
            Class512[] var6 = new Class512[var5 = (var2 = this.field2368.length) * 2 + 1];// 1029 1378 1458

            int var7;
            for (int var15 = var7 = var2 - 1; var15 >= 0; var15 = --var7) {// 1107
               Class512 var8;
               var10000 = var8 = var3.field2368[var7];// 1251

               while (var10000 != null) {// 1098
                  int var9 = System.identityHashCode(var8.field1695) % var5;// 1153
                  Class512 var10 = var8.field1696;// 1233
                  var8.field1696 = var6[var9];// 1312
                  var10000 = var10;
                  var6[var9] = var8;// 1653
                  var8 = var10;// 1023
               }
            }

            var3.field2368 = var6;// 1212
         }

         if (var3.field2375 == var3.field2370.length) {// 1110
            Class512[] var13 = new Class512[2 * var3.field2370.length];// 1143
            System.arraycopy(var3.field2370, 0, var13, 0, var3.field2370.length);// 1597
            var3.field2370 = var13;// 1664
         }

         Class512 var12 = new Class512(var3.field2375, var1);// 1186
         int var14 = var4 % var3.field2368.length;// 1631
         var12.field1696 = var3.field2368[var14];// 1520
         var3.field2368[var14] = var12;// 1014
         var3.field2370[var3.field2375++] = var12;// 1459
         return var12;// 1074
      }
   }

   // $VF: synthetic method
   public static int method1968(int var0, long var1) {
      return 2147483647 & var0 + (int)var1 + (int)(var1 >>> 32);// 1342
   }

   // $VF: synthetic method
   public static int method1969(int var0, String var1, int var2) {
      return 2147483647 & var0 + var1.hashCode() + var2;// 1317
   }

   // $VF: synthetic method
   public void method1970(int var1, int var2, String var3, String var4, int var5) {
      int var7 = method2000(var1, var3, var4, var5);// 1191
      this.method1984(new Class551(var2, var1, null, var3, var4, (long)var5, var7));// 1375
   }// 1681

   // $VF: synthetic method
   public int method1971() {
      return this.field2364;// 305
   }

   // $VF: synthetic method
   public Class552 method1972(String var1) {
      return this.method1997(20, var1);// 1505
   }

   // $VF: synthetic method
   public Class552 method1973(String var1) {
      return this.method1997(16, var1);// 935
   }

   // $VF: synthetic method
   public Class552 method1974(int var1) {
      return this.field2366[var1];// 1541
   }

   // $VF: synthetic method
   public String method1975() {
      return this.field2372;// 89
   }

   // $VF: synthetic method
   public void method1976(int var1, String var2, String var3) {
      this.method1984(new Class551(var1, 12, var2, var3, method2010(12, var2, var3)));// 720
   }// 653

   // $VF: synthetic method
   public int method1977(String var1, Class483 var2) {
      int var6 = this.method1967(var2).field1694;// 1095

      int var4;
      for (Class551 var10000 = var5 = this.method1990(var4 = method1969(130, var1, var6)); var10000 != null; var10000 = var5 = var5.field1894) {// 1077 1177 1247 1543
         if (var5.field1920 == 130 && var5.field1893 == var4 && var5.field1898 == (long)var6 && var5.field1911.equals(var1)) {// 1336 1372
            return var5.field1894;// 1680
         }
      }

      return this.method1979(new Class551(this.field2374, 130, var1, (long)var6, var4));// 1021
   }

   // $VF: synthetic method
   public Class552 method1978(String var1, String var2, String var3) {
      return this.method1964(9, var1, var2, var3);// 304
   }

   // $VF: synthetic method
   public int method1979(Class551 var1) {
      if (this.field2366 == null) {// 1557
         this.field2366 = new Class551[16];// 1335
      }

      if (this.field2374 == this.field2366.length) {// 1418
         Class551[] var3 = new Class551[2 * this.field2366.length];// 1279
         System.arraycopy(this.field2366, 0, var3, 0, this.field2366.length);// 1086
         this.field2366 = var3;// 1090
      }

      this.field2366[this.field2374++] = var1;// 1531
      return this.method1980(var1).field1894;// 1587
   }

   // $VF: synthetic method
   public Class551 method1980(Class551 var1) {
      Class590 var2 = this;
      if (this.field2371 > this.field2365.length * 3 / 4) {// 591
         int var6;
         int var9;
         Class551[] var4 = new Class551[var6 = (var9 = this.field2365.length) * 2 + 1];// 60 348 572

         int var5;
         for (int var10000 = var5 = var9 - 1; var10000 >= 0; var10000 = --var5) {// 150
            Class551 var3;
            Class551 var11 = var3 = var2.field2365[var5];// 56

            while (var11 != null) {// 416
               int var7 = var3.field1893 % var6;// 211
               Class551 var8 = var3.field1894;// 427
               var3.field1894 = var4[var7];// 178
               var11 = var8;
               var4[var7] = var3;// 262
               var3 = var8;// 475
            }
         }

         var2.field2365 = var4;// 250
      }

      var2.field2371++;// 290
      int var10 = var1.field1893 % var2.field2365.length;// 199
      var1.field1894 = var2.field2365[var10];// 512
      return var2.field2365[var10] = var1;// 538
   }

   // $VF: synthetic method
   public Class552 method1981(String var1, String var2, Class563 var3, Object... var4) {
      Class552 var6 = this.method2013(var3, var4);// 977
      return this.method2017(17, var1, var2, var6.field1923);// 672
   }

   // $VF: synthetic method
   public void method1982(Class529 var1) {
      var1.method1566(this.field2364).method1573(this.field2367.field1787, 0, this.field2367.field1786);// 514
   }// 374

   // $VF: synthetic method
   public void method1983(int var1, String var2) {
      this.method1984(new Class551(var1, 1, var2, method2014(1, var2)));// 711
   }// 859

   // $VF: synthetic method
   public void method1984(Class551 var1) {
      this.field2371++;// 85
      int var3 = var1.field1893 % this.field2365.length;// 16
      var1.field1894 = this.field2365[var3];// 121
      this.field2365[var3] = var1;// 480
   }// 518

   // $VF: synthetic method
   public Class552 method1985(double var1) {
      return this.method1994(6, Double.doubleToRawLongBits(var1));// 959
   }

   // $VF: synthetic method
   public int method1986() {
      return this.field2367.field1786;// 234
   }

   // $VF: synthetic method
   public Class552 method1987(long var1) {
      return this.method1994(5, var1);// 870
   }

   // $VF: synthetic method
   public Class552 method1988(String var1) {
      return this.method1997(7, var1);// 449
   }

   // $VF: synthetic method
   public static int method1989(int var0, String var1, String var2, String var3) {
      return 2147483647 & var0 + var1.hashCode() * var2.hashCode() * var3.hashCode();// 1175
   }

   // $VF: synthetic method
   public Class551 method1990(int var1) {
      return this.field2365[var1 % this.field2365.length];// 2
   }

   // $VF: synthetic method
   public int method1991(String var1) {
      int var2 = method2014(1, var1);// 839

      for (Class551 var10000 = var4 = this.method1990(var2); var10000 != null; var10000 = var4 = var4.field1894) {// 607 641 745
         if (var4.field1920 == 1 && var4.field1893 == var2 && var4.field1911.equals(var1)) {// 779 915
            return var4.field1894;// 785
         }
      }

      this.field2367.method1568(1).method1572(var1);// 952
      return this.method1980(new Class551(this.field2364++, 1, var1, var2)).field1894;// 616
   }

   // $VF: synthetic method
   public void method1992(int var1, int var2, String var3, String var4, String var5, boolean var6) {
      int var8 = method1995(var2, (boolean)var6);// 615 798
      var6 = method2022(15, var3, var4, var5, var8);// 635
      this.method1984(new Class551(var1, 15, var3, var4, var5, (long)var8, var6));// 981
   }// 699

   // $VF: synthetic method
   public Class552 method1993(String var1) {
      return this.method1997(19, var1);// 1673
   }

   // $VF: synthetic method
   public Class552 method1994(int var1, long var2) {
      int var4 = method1968(var1, var2);// 802

      for (Class551 var10000 = var6 = this.method1990(var4); var10000 != null; var10000 = var6 = var6.field1894) {// 715 772 920
         if (var6.field1920 == var1 && var6.field1893 == var4 && var6.field1898 == var2) {// 979
            return var6;// 819
         }
      }

      int var7 = this.field2364;// 800
      this.field2367.method1568(var1).method1563(var2);// 828
      this.field2364 += 2;// 896
      return this.method1980(new Class551(var7, var1, var2, var4));// 813
   }

   // $VF: synthetic method
   public static int method1995(int var0, boolean var1) {
      return var0 > 4 && var1 ? var0 << 8 : var0;// 743 945 953
   }

   // $VF: synthetic method
   public Class552 method1996(int var1) {
      return this.method2002(3, var1);// 960
   }

   // $VF: synthetic method
   public Class590(Class342 var1, Class508 var2) {
      Class508 var10 = var2;
      Class590 var12 = this;
      super();
      this.field2363 = var1;// 45
      this.field2369 = var2;// 23
      byte[] var11 = var2.field1677;// 97
      int var5 = var2.method1369(1) - 1;// 411
      int var4 = var2.field1683 - var5;// 468
      this.field2364 = var2.method1371();// 138
      this.field2367 = new Class529(var4);// 223
      this.field2367.method1573(var11, var5, var4);// 119 285
      this.field2365 = new Class551[this.field2364 * 2];// 525
      char[] var14 = new char[var2.method1379()];// 220
      boolean var13 = false;// 593
      int var3;
      int var17 = var3 = 1;// 336

      while (var17 < var12.field2364) {// 540
         int var6;
         byte var7;
         switch (var7 = var11[(var6 = var10.method1369(var3)) - 1]) {// 57 216 291
            case 1:
               while (false) {
               }

               var12.method1983(var3, var10.method1363(var3, var14));// 266
               var17 = var3;
               break;// 235
            case 2:
            case 13:
            case 14:
            default:
               throw new IllegalArgumentException();// 369
            case 3:
            case 4:
               var12.method1965(var3, var7, var10.method1391(var6));// 497
               var17 = var3;
               break;// 66
            case 5:
            case 6:
               var12.method2005(var3, var7, var10.method1403(var6));// 270
               var17 = var3;
               break;// 582
            case 7:
            case 8:
            case 16:
            case 19:
            case 20:
               var12.method2018(var3, var7, var10.method1405(var6, var14));// 127 275
               var17 = var3;
               break;// 355
            case 9:
            case 10:
            case 11:
               int var16 = var10.method1369(var10.method1399(var6 + 2));// 50 253
               var17 = var3;
               var12.method1961(var3, var7, var10.method1372(var6, var14), var10.method1405(var16, var14), var10.method1405(var16 + 2, var14));// 135 166 292 434
               break;// 373
            case 12:
               var12.method1976(var3, var10.method1405(var6, var14), var10.method1405(var6 + 2, var14));// 109 213 307
               var17 = var3;
               break;// 15
            case 15:
               int var9;
               int var15 = var10.method1369(var10.method1399((var9 = var10.method1369(var10.method1399(var6 + 1))) + 2));// 95 227 370 516
               var12.method1992(// 55
                  var3,
                  var10.method1385(var6),// 288
                  var10.method1372(var9, var14),// 129
                  var10.method1405(var15, var14),// 258
                  var10.method1405(var15 + 2, var14),// 107
                  var10.method1385(var9 - 1) == 11// 437
               );
               var17 = var3;
               break;// 221
            case 17:
            case 18:
               var13 = true;// 193
               int var8 = var10.method1369(var10.method1399(var6 + 2));// 251 486
               var12.method1970(var7, var3, var10.method1405(var8, var14), var10.method1405(var8 + 2, var14), var10.method1399(var6));// 117 296 404 417
               var17 = var3;
         }

         var17 = var3 = var17 + (var7 != 5 && var7 != 6 ? 1 : 2);// 382
      }

      if (var13) {// 548
         var12.method1960(var10, var14);// 545
      }
   }// 523

   // $VF: synthetic method
   public Class552 method1997(int var1, String var2) {
      int var4 = method2014(var1, var2);// 1239

      for (Class551 var10000 = var5 = this.method1990(var4); var10000 != null; var10000 = var5 = var5.field1894) {// 1039 1080 1298
         if (var5.field1920 == var1 && var5.field1893 == var4 && var5.field1911.equals(var2)) {// 1058
            return var5;// 990
         }
      }

      this.field2367.method1574(var1, this.method1991(var2));// 1570
      return this.method1980(new Class551(this.field2364++, var1, var2, var4));// 1288
   }

   // $VF: synthetic method
   public int method1998(String var1) {
      int var2 = method2014(128, var1);// 1415

      for (Class551 var10000 = var4 = this.method1990(var2); var10000 != null; var10000 = var4 = var4.field1894) {// 1294 1333 1522
         if (var4.field1920 == 128 && var4.field1893 == var2 && var4.field1911.equals(var1)) {// 1349
            return var4.field1894;// 1243
         }
      }

      return this.method1979(new Class551(this.field2374, 128, var1, var2));// 1391
   }

   // $VF: synthetic method
   public Class483 method1999(int var1) {
      return this.field2370[(int)this.field2366[var1].field1898].field1695;// 1591
   }

   // $VF: synthetic method
   public static int method2000(int var0, String var1, String var2, int var3) {
      return 2147483647 & var0 + var1.hashCode() * var2.hashCode() * (var3 + 1);// 1396
   }

   // $VF: synthetic method
   public int method2001() {
      return this.field2376;// 205
   }

   // $VF: synthetic method
   public Class552 method2002(int var1, int var2) {
      int var4 = method2011(var1, var2);// 690

      for (Class551 var10000 = var5 = this.method1990(var4); var10000 != null; var10000 = var5 = var5.field1894) {// 619 755 835
         if (var5.field1920 == var1 && var5.field1893 == var4 && var5.field1898 == (long)var2) {// 682
            return var5;// 816
         }
      }

      this.field2367.method1568(var1).method1570(var2);// 649
      return this.method1980(new Class551(this.field2364++, var1, (long)var2, var4));// 705
   }

   // $VF: synthetic method
   public Class552 method2003(int var1, int var2, int var3) {
      byte[] var4 = this.field2373.field1787;// 1198

      for (Class551 var10000 = var9 = this.method1990(var3); var10000 != null; var10000 = var9 = var9.field1894) {// 1089 1152 1553
         if (var9.field1920 == 64 && var9.field1893 == var3) {// 1302
            int var6 = (int)var9.field1898;// 1325
            boolean var7 = true;// 1219
            int var8;
            int var11 = var8 = 0;

            while (true) {
               if (var11 >= var2) {
                  var12 = var7;// 1588
                  break;
               }

               if (var4[var1 + var8] != var4[var6 + var8]) {// 1272
                  var12 = var7 = false;// 1383
                  break;// 1532
               }

               var11 = ++var8;// 1467
            }

            if (var12) {
               this.field2373.field1786 = var1;// 995
               return var9;// 1379
            }
         }
      }

      return this.method1980(new Class551(this.field2362++, 64, (long)var1, var3));// 1057
   }

   // $VF: synthetic method
   public Class552 method2004(Object var1) {
      if (var1 instanceof Integer) {// 414
         return this.method1996((Integer)var1);// 12
      } else if (var1 instanceof Byte) {// 319
         return this.method1996(((Byte)var1).intValue());// 139
      } else if (var1 instanceof Character) {// 462
         return this.method1996((Character)var1);// 559
      } else if (var1 instanceof Short) {// 452
         return this.method1996(((Short)var1).intValue());// 187
      } else if (var1 instanceof Boolean) {// 595
         return this.method1996((Boolean)var1 ? 1 : 0);// 254
      } else if (var1 instanceof Float) {// 594
         return this.method2020((Float)var1);// 539
      } else if (var1 instanceof Long) {// 388
         return this.method1987((Long)var1);// 120
      } else if (var1 instanceof Double) {// 487
         return this.method1985((Double)var1);// 479
      } else if (var1 instanceof String) {// 347
         return this.method2015((String)var1);// 298
      } else if (var1 instanceof Class599) {// 42
         int var3;
         Class599 var7;
         if ((var3 = (var7 = (Class599)var1).method2068()) == 10) {// 106 439 529
            return this.method1988(var7.method2079());// 569
         } else {
            return var3 == 11 ? this.method1973(var7.method2061()) : this.method1988(var7.method2061());// 425 445 527
         }
      } else if (var1 instanceof Class563) {// 197
         Class563 var6 = (Class563)var1;// 140
         return this.method2007(var6.method1810(), var6.method1808(), var6.method1809(), var6.method1811(), var6.method1806());// 49 101 173 448 451 565
      } else if (var1 instanceof Class492) {// 489
         Class492 var2 = (Class492)var1;// 562
         return this.method1981(var2.method1322(), var2.method1316(), var2.method1321(), var2.method1320());// 194 244 247 259 397
      } else {
         throw new IllegalArgumentException(method2008(String.valueOf(var1)));// 9
      }
   }

   // $VF: synthetic method
   public void method2005(int var1, int var2, long var3) {
      this.method1984(new Class551(var1, var2, var3, method1968(var2, var3)));// 765
   }// 815

   // $VF: synthetic method
   public void method2006(Class529 var1) {
      if (this.field2373 != null) {// 325
         var1.method1566(this.method1991("BootstrapMethods"))// 392 571
            .method1570(this.field2373.field1786 + 2)// 44
            .method1566(this.field2362)// 362
            .method1573(this.field2373.field1787, 0, this.field2373.field1786);// 476
      }
   }// 231

   // $VF: synthetic method
   public Class552 method2007(int var1, String var2, String var3, String var4, boolean var5) {
      int var6 = method1995(var1, var5);// 678 809
      int var7 = method2022(15, var2, var3, var4, var6);// 729

      for (Class551 var10000 = var9 = this.method1990(var7); var10000 != null; var10000 = var9 = var9.field1894) {// 776 797 865
         if (var9.field1920 == 15// 674
            && var9.field1893 == var7
            && var9.field1898 == (long)var6
            && var9.field1893.equals(var2)// 965
            && var9.field1899.equals(var3)// 646
            && var9.field1911.equals(var4)) {// 795
            return var9;// 728
         }
      }

      Class590 var10;
      if (var1 <= 4) {// 885
         var10 = this;// 614
         this.field2367.method1567(15, var1, this.method1978(var2, var3, var4).field1923);
      } else {
         var10 = this;
         this.field2367.method1567(15, var1, this.method1963(var2, var3, var4, var5).field1923);// 700 978
      }

      return var10.method1980(new Class551(this.field2364++, 15, var2, var3, var4, (long)var6, var7));// 941
   }

   // $VF: synthetic method
   public static String method2008(String var0) {
      return "value " + var0;
   }

   // $VF: synthetic method
   public int method2009(int var1, String var2) {
      this.field2376 = var1;
      this.field2372 = var2;// 509
      return this.method1988(var2).field1923;// 35 363
   }

   // $VF: synthetic method
   public static int method2010(int var0, String var1, String var2) {
      return 2147483647 & var0 + var1.hashCode() * var2.hashCode();// 1358
   }

   // $VF: synthetic method
   public static int method2011(int var0, int var1) {
      return 2147483647 & var0 + var1;// 1495
   }

   // $VF: synthetic method
   public int method2012(String var1, String var2) {
      int var4 = method2010(12, var1, var2);// 681 736

      for (Class551 var10000 = var5 = this.method1990(var4); var10000 != null; var10000 = var5 = var5.field1894) {// 759 875 911
         if (var5.field1920 == 12 && var5.field1893 == var4 && var5.field1899.equals(var1) && var5.field1911.equals(var2)) {// 732 740 742
            return var5.field1894;// 806
         }
      }

      this.field2367.method1562(12, this.method1991(var1), this.method1991(var2));// 903
      return this.method1980(new Class551(this.field2364++, 12, var1, var2, var4)).field1894;// 908
   }

   // $VF: synthetic method
   public Class552 method2013(Class563 var1, Object... var2) {
      Class590 var11 = this;
      Class529 var3 = this.field2373;// 1136
      if (this.field2373 == null) {// 1229
         var3 = this.field2373 = new Class529();// 1538
      }

      int var4;
      int[] var5 = new int[var4 = var2.length];// 1081 1494

      int var6;
      for (int var18 = var6 = 0; var18 < var4; var18 = var6) {// 1442
         int var10001 = var6;
         int var10002 = var11.method2004(var2[var6]).field1923;
         var6++;
         var5[var10001] = var10002;// 1633
      }

      var6 = var3.field1786;
      var3.method1566(var11.method2007(var1.method1810(), var1.method1808(), var1.method1809(), var1.method1811(), var1.method1806()).field1923);// 1004 1087 1208 1234 1330 1397 1506 1659
      var3.method1566(var4);// 1142
      int var7 = 0;// 1321

      for (int var19 = var7; var19 < var4; var19 = var7) {
         var3.method1566(var5[var7++]);// 1293
      }

      var7 = var3.field1786 - var6;// 1523
      int var9 = var1.hashCode();// 1015
      Object[] var12 = var2;
      int var13 = var2.length;

      for (int var21 = var4 = 0; var21 < var13; var21 = var4) {// 1188
         var5 = (int[])var12[var4];
         var4++;
         var9 ^= var5.hashCode();// 1519
      }

      int var10 = var9 & 2147483647;// 1674
      return var11.method2003(var6, var7, var10);// 1637
   }

   // $VF: synthetic method
   public static int method2014(int var0, String var1) {
      return 2147483647 & var0 + var1.hashCode();// 1031
   }

   // $VF: synthetic method
   public Class552 method2015(String var1) {
      return this.method1997(8, var1);// 670
   }

   // $VF: synthetic method
   public Class508 method2016() {
      return this.field2369;// 504
   }

   // $VF: synthetic method
   public Class552 method2017(int var1, String var2, String var3, int var4) {
      int var5 = method2000(var1, var2, var3, var4);// 621

      for (Class551 var10000 = var7 = this.method1990(var5); var10000 != null; var10000 = var7 = var7.field1894) {// 709 893 934
         if (var7.field1920 == var1 && var7.field1893 == var5 && var7.field1898 == (long)var4 && var7.field1899.equals(var2) && var7.field1911.equals(var3)) {// 717 917 925
            return var7;// 783
         }
      }

      this.field2367.method1562(var1, var4, this.method2012(var2, var3));// 937
      return this.method1980(new Class551(this.field2364++, var1, null, var2, var3, (long)var4, var5));// 969
   }

   // $VF: synthetic method
   public void method2018(int var1, int var2, String var3) {
      this.method1984(new Class551(var1, var2, var3, method2014(var2, var3)));// 1568
   }// 1255

   // $VF: synthetic method
   public Class552 method2019(String var1, String var2, Class563 var3, Object... var4) {
      Class552 var6 = this.method2013(var3, var4);// 980
      return this.method2017(18, var1, var2, var6.field1923);// 733
   }

   // $VF: synthetic method
   public Class552 method2020(float var1) {
      return this.method2002(4, Float.floatToRawIntBits(var1));// 873
   }

   // $VF: synthetic method
   public int method2021() {
      if (this.field2373 != null) {// 375
         this.method1991("BootstrapMethods");// 191
         return 8 + this.field2373.field1786;// 441
      } else {
         return 0;// 547
      }
   }

   // $VF: synthetic method
   public static int method2022(int var0, String var1, String var2, String var3, int var4) {
      return 2147483647 & var0 + var1.hashCode() * var2.hashCode() * var3.hashCode() * var4;// 1464
   }

   // $VF: synthetic method
   public Class590(Class342 var1) {
      this.field2363 = var1;// 286
      this.field2369 = null;// 600
      this.field2365 = new Class551[256];// 24 108
      this.field2364 = 1;// 27
      this.field2367 = new Class529();// 242
   }// 94
}
