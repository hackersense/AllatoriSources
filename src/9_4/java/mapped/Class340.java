package mapped;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

// $VF: Compiled from so
public class Class340 {
   // $VF: synthetic field
   public static final String field955 = "&";
   // $VF: synthetic field
   public Class393 field956;
   // $VF: synthetic field
   public Class490 field957;
   // $VF: synthetic field
   public Class554 field958;
   // $VF: synthetic field
   public Class338 field959;
   // $VF: synthetic field
   public static boolean field960 = false;
   // $VF: synthetic field
   public static Class499 field961 = new Class499();

   // $VF: synthetic method
   public static Class554 method568(Class340 var0) {
      return var0.field958;
   }

   // $VF: synthetic method
   public void method569(Class206 var1) {
      Class340 var2 = this;
      String var8 = var1.method93();// 380
      Class207[] var7 = var1.method346();// 261
      if (!Class580.method1923().method1674()) {// 180
         Class339.method567(Class490.method1312(this.field957)).method709();// 206
      }

      int var4;
      for (int var10000 = var4 = var7.length - 1; var10000 >= 0; var10000 = --var4) {// 350
         Class207 var5;
         Class207 var10 = var5 = var7[var4];// 156
         String var6 = var10.method190();// 3
         String var3 = var10.method20();// 543
         String var9;
         if ((var9 = Class339.method564(Class490.method1312(var2.field957)).method1341(var8 + "&" + var6 + "&" + var3)) == null) {// 175 186
            Class340 var11 = var2;// 276

            for (var9 = Class339.method567(Class490.method1312(var2.field957)).method710();
               var11.method579(var1, var9, var3, !var5.method163());// 167
               var9 = Class339.method567(Class490.method1312(var2.field957)).method710()// 414
            ) {
               var11 = var2;
            }

            Class339.method564(Class490.method1312(var2.field957)).method1340(var8 + "&" + var6 + "&" + var3, var9);// 12
            Class339.method566(Class490.method1312(var2.field957)).method1340(var8 + "&" + var9 + "&" + var3, "&");// 319
         }

         if (!var5.method163()) {// 462
            var2.method606(var1, var6, var9, var3);// 559
         }
      }
   }// 187

   // $VF: synthetic method
   public void method570(Class206 var1) {
      Class340 var2 = this;
      String var5 = var1.method93();// 213

      int var3;
      Class208[] var4;
      for (int var10000 = var3 = (var4 = var1.method341()).length - 1; var10000 >= 0; var10000 = --var3) {// 15 385
         Class208 var9 = var4[var3];// 471
         if (var2.method573(var5, var9) || !Class580.method1923().method1662().method964(var2.field959, var1, var9)) {// 270
            String var6 = var9.method190();// 582
            String var7 = var9.method20();// 177
            if (Class580.method1923().method1660().method1730()) {// 266
               Class375.method714(var6);
            }

            if (!Class567.method1833(Class490.method1311(var2.field957)).method1338(var5 + "&" + var6 + "&" + var7)) {// 235
               Class567.method1833(Class490.method1311(var2.field957)).method1340(var5 + "&" + var6 + "&" + var7, var6);// 280
               Class567.method1836(Class490.method1311(var2.field957)).method1340(var5 + "&" + var6 + "&" + Class409.method758(var7), "&");// 370
               if (!var9.method163()) {// 516
                  var2.method598(var1, var6, var6, var7, var1.method101(), Class409.method756(var9));// 95
               }
            } else if (!var9.method163()) {// 227
               var2.method598(
                  var1,// 55
                  var6,
                  Class567.method1833(Class490.method1311(var2.field957)).method1341(var5 + "&" + var6 + "&" + var7),
                  var7,
                  var1.method101(),
                  Class409.method756(var9)
               );
            }
         }
      }

      Class206 var11 = var1;// 221

      do {
         String var10 = var11.method190();// 601
         int var15;
         if ((var11 = var2.field959.method557(var10)) != null) {// 193 251
            Class208[] var14;
            for (int var16 = var15 = (var14 = var11.method341()).length - 1; var16 >= 0; var16 = --var15) {// 117 486
               Class208 var13 = var14[var15];// 300
               if (!var2.method573(var10, var13) && !Class580.method1923().method1662().method964(var2.field959, var1, var13)) {// 245
                  String var12 = var13.method190();// 404
                  String var8 = var13.method20();// 417
                  if (Class580.method1923().method1660().method1730()) {// 81
                     Class375.method714(var12);// 401
                  }

                  if (!Class567.method1833(Class490.method1311(var2.field957)).method1338(var10 + "&" + var12 + "&" + var8)) {// 394
                     Class567.method1833(Class490.method1311(var2.field957)).method1340(var10 + "&" + var12 + "&" + var8, var12);// 556
                     Class567.method1836(Class490.method1311(var2.field957)).method1340(var10 + "&" + var12 + "&" + Class409.method758(var8), "&");// 316
                     if (!var13.method163()) {// 207
                        var2.method598(var11, var12, var12, var8, var11.method101(), Class409.method756(var13));// 275
                     }
                  } else if (!var13.method163()) {// 127
                     var2.method598(
                        var11,// 355
                        var12,
                        Class567.method1833(Class490.method1311(var2.field957)).method1341(var10 + "&" + var12 + "&" + var8),
                        var8,
                        var11.method101(),
                        Class409.method756(var13)
                     );
                  }
               }
            }
         }
      } while (var11 != null);// 210
   }// 103

   // $VF: synthetic method
   public static Class499 method571() {
      return field961;
   }

   // $VF: synthetic method
   public void method572(Class206 var1) {
      Class340 var2 = this;
      String var8 = var1.method93();// 303

      int var4;
      Class208[] var7;
      for (int var10000 = var4 = (var7 = var1.method341()).length - 1; var10000 >= 0; var10000 = --var4) {// 29 326
         Class208 var5;
         Class208 var11 = var5 = var7[var4];// 328
         String var6 = var11.method190();// 521
         String var3 = var11.method20();// 457
         String var10;
         if (!var11.method163()) {// 341
            var10 = var2.method589(var1, var6, var3);// 51
         } else {
            var10 = Class567.method1833(Class490.method1311(var2.field957)).method1341(var8 + "&" + var6 + "&" + var3);// 325
         }

         boolean var9 = Class580.method1923().method1665(var2.field959, var1);// 392
         if (var10 == null && var9) {// 571
            var10 = Class567.method1832(Class490.method1311(var2.field957)).method1341(var6 + "&" + Class409.method758(var3));// 44
         }

         if (var10 == null) {// 362
            if (!Class580.method1923().method1650() && !var1.method244()) {// 542
               Class567.method1835(Class490.method1311(var2.field957)).method709();
            }

            String var10003;
            boolean var10004;
            Class206 var10005;
            do {
               var10 = Class567.method1835(Class490.method1311(var2.field957)).method710();// 420
               var10003 = Class409.method758(var3);
               if (!var5.method163()) {
                  var10004 = true;
                  var10005 = var1;
               } else {
                  var10004 = false;
                  var10005 = var1;
               }
            } while (var2.method577(var1, var10, var10003, var10004, var10005.method101()));// 62
         }

         Class567.method1833(Class490.method1311(var2.field957)).method1340(var8 + "&" + var6 + "&" + var3, var10);// 324
         if (var1.method244()) {// 519
            Class567.method1831(Class490.method1311(var2.field957)).method1340(var8 + "&" + var6, var10);// 376
         }

         Class567.method1836(Class490.method1311(var2.field957)).method1340(var8 + "&" + var10 + "&" + Class409.method758(var3), "&");// 492
         if (!var5.method163()) {// 482
            var2.method598(var1, var6, var10, var3, var1.method101(), Class409.method756(var5));// 432
         }

         if (Class580.method1923().method1650() && !var10.equals(var6)) {// 67
            Class567.method1832(Class490.method1311(var2.field957)).method1340(var6 + "&" + Class409.method758(var3), var10);// 155
         }
      }
   }// 505

   // $VF: synthetic method
   public boolean method573(String var1, Class208 var2) {
      return var2.method246() || this.field956.method729(var1, var2.method190(), var2.method20())// 570
         ? true// 523
         : "<init>".equals(var2.method190())// 162
            || "<clinit>".equals(var2.method190())
            || "main".equals(var2.method190()) && "([Ljava/lang/String;)V".equals(var2.method20());
   }

   // $VF: synthetic method
   public void method574(Class475 var1, Class221 var2) {
      Class340 var3 = this;
      if (var1 instanceof Class474) {// 1239
         this.method576(((Class474)var1).method1256(), var2);// 1039
      } else {
         int var5;
         if (var1 instanceof Class478) {
            Class478 var4;
            for (int var10000 = var5 = (var8 = (var4 = (Class478)var1).method1267()).size() - 1; var10000 >= 0; var10000 = var5) {// 990 1058 1339
               Object var10001 = var8.get(var5);
               var5--;
               var3.method574((Class475)var10001, var2);// 1080
            }
         } else {
            if (var1 instanceof Class477) {// 1210
               return;// 1570
            }

            if (var1 instanceof Class476) {
               Class476 var11;
               String var9 = (var11 = (Class476)var1).method1264();// 1288 1436
               String var12 = null;// 1433
               if (var9.startsWith("L") && var9.endsWith(";")) {// 1253
                  String var6;
                  var12 = var6 = var9.substring(1, var9.length() - 1).replace('/', '.');// 1069 1105 1137
                  String var7;
                  if ((var7 = Class505.method1355(Class490.method1314(this.field957)).method1341(var6)) != null) {// 1525 1566
                     var7 = "L" + var7.replace('.', '/') + ";";// 1338
                     var11.method1262(var2.method106(var7));// 1465
                  }
               }

               if (var12 != null) {// 1508
                  String var13 = var11.method1261();// 1568
                  String var15 = var12 + "&" + var13 + "&" + var9;// 1255
                  if (Class339.method564(Class490.method1312(this.field957)).method1338(var15)) {// 1266
                     String var10 = Class339.method564(Class490.method1312(this.field957)).method1341(var15);// 1101
                     var11.method1263(var2.method106(var10));// 1444
                     return;// 1614
                  }
               }
            } else if (var1 instanceof Class479) {
            }
         }
      }
   }// 1298 1679

   // $VF: synthetic method
   public void method575(Class206 var1) {
      Class340 var2 = this;
      if (this.method599(var1) || !Class580.method1923().method1662().method968(this.field959, var1)) {// 470
         String var7 = var1.method93();// 149
         boolean var4 = false;// 157
         if (Class505.method1355(Class490.method1314(this.field957)).method1338(var7)// 24
            && !var7.equals(Class505.method1355(Class490.method1314(this.field957)).method1341(var7))) {
            var4 = true;// 286
         }

         if (!var4) {// 600
            Class505.method1355(Class490.method1314(this.field957)).method1340(var7, var7);// 108
            Class505.method1356(Class490.method1314(this.field957)).method1340(var7, var7);// 27
            String var6 = Class409.method753(var7);// 21 23 31 45 69 94 115 116 209 223 242 248 285 411 422 440 464
            String var8;
            if (Class580.method1923().method1657()// 119
               && (var8 = Class504.method1353(Class490.method1313(this.field957)).method1341(var6)) != null// 32 238
               && !var8.equals(var6)) {
               if (field961.method1341(var8) == null) {// 423
                  Logger.warning("Package '" + var8 + "' should be un-renamed.");// 61
               }

               field961.method1340(var8, var6);// 525
            }

            Class504.method1353(Class490.method1313(this.field957)).method1340(var6, var6);// 336
            Class504.method1354(Class490.method1313(this.field957)).method1340(var6, "&");// 540

            for (String var10 = var6; var10.lastIndexOf(46) > 0; var10 = var6) {// 291
               var6 = var6.substring(0, var6.lastIndexOf(46));// 57
               if (Class580.method1923().method1657()// 169
                  && (var8 = Class504.method1353(Class490.method1313(var2.field957)).method1341(var6)) != null// 216 299
                  && !var8.equals(var6)) {
                  if (field961.method1341(var8) == null) {// 314
                     Logger.warning("Package '" + var8 + "' should be un-renamed.");// 137
                  }

                  field961.method1340(var8, var6);// 50
               }

               Class504.method1353(Class490.method1313(var2.field957)).method1340(var6, var6);// 474
               Class504.method1354(Class490.method1313(var2.field957)).method1340(var6, "&");// 443
            }
         } else {
            String var5 = Class409.method753(var7);
            String var3 = Class409.method753(Class505.method1355(Class490.method1314(this.field957)).method1341(var7));
            if (!Class580.method1923().method1659() || !var3.equals(Class580.method1923().method1677())) {
               if (new StringTokenizer(var5, ".").countTokens() == new StringTokenizer(var3, ".").countTokens()) {
                  Class504.method1353(Class490.method1313(this.field957)).method1340(var5, var3);
                  Class504.method1354(Class490.method1313(this.field957)).method1340(var3, "&");
                  String var10000 = var5;

                  while (var10000.lastIndexOf(46) > 0) {
                     var5 = var5.substring(0, var5.lastIndexOf(46));
                     var3 = var3.substring(0, var3.lastIndexOf(46));
                     Class499 var10002 = Class504.method1353(Class490.method1313(var2.field957));
                     var10000 = var5;
                     var10002.method1340(var5, var3);
                     Class504.method1354(Class490.method1313(var2.field957)).method1340(var3, "&");
                  }
               }
            }
         }
      }
   }// 434

   // $VF: synthetic method
   public void method576(Class533 var1, Class221 var2) {
      Class340 var3;
      String var4;
      Class533 var10000;
      label31: {
         var3 = this;
         String var7 = var1.method1589();// 1428
         var4 = null;// 1215
         if (var7.startsWith("L") && var7.endsWith(";")) {// 1027
            String var5;
            var4 = var5 = var7.substring(1, var7.length() - 1).replace('/', '.');// 1118 1549 1673
            String var6;
            if ((var6 = Class505.method1355(Class490.method1314(this.field957)).method1341(var5)) != null) {// 1366 1500
               var6 = "L" + var6.replace('.', '/') + ";";// 1542
               var10000 = var1;// 1010
               var1.method1585(var2.method106(var6));
               break label31;// 1047
            }

            var4 = Class505.method1356(Class490.method1314(this.field957)).method1341(var4);// 1161
         }

         var10000 = var1;// 1505
      }

      List var12;
      int var14;
      for (int var15 = var14 = (var12 = var10000.method1583()).size() - 1; var15 >= 0; var15 = var14) {// 1050
         Class548 var11 = (Class548)var12.get(var14);// 1676
         if (var4 != null) {// 1389
            String var8 = var11.method1720();// 1670
            String var9 = var4 + "&" + var8;// 1492
            if (Class567.method1831(Class490.method1311(var3.field957)).method1338(var9)) {// 1245
               String var10 = Class567.method1831(Class490.method1311(var3.field957)).method1341(var9);// 1616
               var11.method1721(var2.method106(var10));// 1367
            }
         }

         var14--;
         var3.method574(var11.method1716(), var2);// 1423
      }
   }// 1134

   // $VF: synthetic method
   public boolean method577(Class206 var1, String var2, String var3, boolean var4, boolean var5) {
      Class340 var6 = this;
      if (var5) {// 100
         Class206 var8 = var1;// 128

         do {
            String var7 = var8.method190();// 199
            if ((var8 = var6.field959.method557(var7)) != null// 512 538
               && Class567.method1836(Class490.method1311(var6.field957))// 92
                  .method1338(new StringBuilder().insert(0, var8.method93()).append("&").append(var2).append("&").append(var3).toString())) {
               return true;// 176
            }
         } while (var8 != null);// 568
      }

      if (Class567.method1836(Class490.method1311(var6.field957))// 98
         .method1338(new StringBuilder().insert(0, var1.method93()).append("&").append(var2).append("&").append(var3).toString())) {
         return true;// 407
      } else if (!var4) {// 405
         return false;
      } else {
         int var10;
         for (int var10000 = var10 = (var9 = var6.field956.method731(var1.method93())).size() - 1; var10000 >= 0; var10000 = --var10) {// 16 85
            if (var6.method577((Class206)var9.get(var10), var2, var3, var4, var5)) {// 121
               return true;// 480
            }
         }

         return false;// 518
      }
   }

   // $VF: synthetic method
   public void method578(Class206 var1) {
      Class206 var7 = var1;
      Class340 var8 = this;
      if (Class505.method1358(Class490.method1314(this.field957)).method1338(var1.method93()) || Class580.method1923().method1654()) {// 447
         Class409.method762(var1);// 79
      }

      if (Class580.method1932().method1841()// 500
         && !var1.method261()// 396
         && !var1.method101()
         && !var1.method244()
         && !var1.method161()
         && this.field956.method731(var1.method93()).isEmpty()) {
         var1.method235(true);// 847
      }

      String var2 = Class505.method1355(Class490.method1314(this.field957)).method1341(var1.method93());// 985
      if (!var1.method93().equals(var2)) {// 921
         var1.method298(var2);// 677
         Class509.field1691++;// 698
      }

      this.field958.method1757(var1);// 811
      String[] var9;
      int var5 = (var9 = var1.method130()).length;// 654 821

      int var4;
      for (int var10 = var4 = 0; var10 < var5; var10 = ++var4) {// 609
         String var3 = var9[var4];// 633
         String var6;
         if ((var6 = Class505.method1355(Class490.method1314(var8.field957)).method1341(var3)) != null) {// 684 892
            var7.method302(var3);
            var7.method131(var6);// 632 818
            var7.method46().method404(var6);// 966
         } else {
            var7.method302(var3);// 968
            var7.method131(var3);// 936
         }
      }

      var8.method587(var7.method264(), var7.method46());// 823
   }// 788

   // $VF: synthetic method
   public boolean method579(Class206 var1, String var2, String var3, boolean var4) {
      Class340 var8 = this;
      if (Class339.method566(Class490.method1312(this.field957))// 594
         .method1338(new StringBuilder().insert(0, var1.method93()).append("&").append(var2).append("&").append(var3).toString())) {
         return true;// 539
      } else if (!var4) {// 388
         return false;
      } else {
         int var5;
         for (int var9 = var5 = (var7 = this.field956.method731(var1.method93())).size() - 1; var9 >= 0; var9 = --var5) {// 120 487
            if (var8.method579((Class206)var7.get(var5), var2, var3, var4)) {// 479
               return true;// 347
            }
         }

         return false;// 298
      }
   }

   // $VF: synthetic method
   public static Class338 method580(Class340 var0) {
      return var0.field959;
   }

   // $VF: synthetic method
   public void method581(Class206 var1) {
      Class340 var5 = this;
      String var6 = var1.method93();// 76

      Class207[] var3;
      int var4;
      for (int var10000 = var4 = (var3 = var1.method346()).length - 1; var10000 >= 0; var10000 = --var4) {// 145 390
         Class207 var9 = var3[var4];// 573
         if (!Class580.method1923().method1662().method966(var5.field959, var1, var9)) {// 520
            String var2 = var9.method190();// 502
            String var7 = var9.method20();// 188
            if (Class580.method1923().method1660().method1754()) {// 172
               Class375.method712(var2);
            }

            if (!Class339.method564(Class490.method1312(var5.field957)).method1338(var6 + "&" + var2 + "&" + var7)) {// 564
               Class339.method564(Class490.method1312(var5.field957)).method1340(var6 + "&" + var2 + "&" + var7, var2);// 48
               Class339.method566(Class490.method1312(var5.field957)).method1340(var6 + "&" + var2 + "&" + var7, "&");// 281
               if (!var9.method163()) {// 438
                  var5.method606(var1, var2, var2, var7);// 592
               }
            } else if (!var9.method163()) {// 483
               var5.method606(var1, var2, Class339.method564(Class490.method1312(var5.field957)).method1341(var6 + "&" + var2 + "&" + var7), var7);// 181
            }
         }
      }

      Class206 var13 = var1;// 212

      do {
         String var10 = var13.method190();// 366
         int var15;
         if ((var13 = var5.field959.method557(var10)) != null) {// 225 263
            Class207[] var11;
            for (int var16 = var15 = (var11 = var13.method346()).length - 1; var16 >= 0; var16 = --var15) {// 297 532
               Class207 var14 = var11[var15];// 426
               if (!Class580.method1923().method1662().method966(var5.field959, var1, var14)) {// 11
                  String var12 = var14.method190();// 356
                  String var8 = var14.method20();// 522
                  if (Class580.method1923().method1660().method1754()) {// 41
                     Class375.method712(var12);// 551
                  }

                  if (!Class339.method564(Class490.method1312(var5.field957)).method1338(var10 + "&" + var12 + "&" + var8)) {// 91
                     Class339.method564(Class490.method1312(var5.field957)).method1340(var10 + "&" + var12 + "&" + var8, var12);// 360
                     Class339.method566(Class490.method1312(var5.field957)).method1340(var10 + "&" + var12 + "&" + var8, "&");// 312
                     if (!var14.method163()) {// 340
                        var5.method606(var13, var12, var12, var8);// 274
                     }
                  } else if (!var14.method163()) {// 558
                     var5.method606(var13, var12, Class339.method564(Class490.method1312(var5.field957)).method1341(var10 + "&" + var12 + "&" + var8), var8);// 501
                  }
               }
            }
         }
      } while (var13 != null);// 237
   }// 65

   // $VF: synthetic method
   public void method582(Class206 var1) {
      Class340 var2 = this;

      Class208[] var5;
      int var6;
      for (int var10000 = var6 = (var5 = var1.method341()).length - 1; var10000 >= 0; var10000 = var6) {// 833 902
         Class208 var4;
         Class203 var10 = Class376.method716(var4 = var5[var6], var1.method93(), var1.method46(), var1.method46().method402());// 608 721
         var2.method590(var1, var10);// 960
         var2.field958.method1756(var1.method93(), var10);// 930
         String var3 = Class567.method1833(Class490.method1311(var2.field957))// 914
            .method1341(new StringBuilder().insert(0, var1.method93()).append("&").append(var4.method190()).append("&").append(var4.method20()).toString());
         if (!var10.method20().equals(var3)) {// 735
            var10.method131(var3);// 846
            Class509.field1693++;// 756
         }

         boolean var11 = false;// 881

         Class138[] var7;
         int var8;
         for (int var14 = var8 = (var7 = var10.method277()).length - 1; var14 >= 0; var14 = --var8) {// 738 801
            Class138 var9;
            if ((var9 = Class409.method759(var7[var8], Class505.method1355(Class490.method1314(var2.field957)))) != null) {// 694 873
               var10.method317(var8, var9);// 923
               var11 = true;// 618
            }
         }

         Class138 var13;
         if ((var13 = Class409.method759(var10.method164(), Class505.method1355(Class490.method1314(var2.field957)))) != null) {// 844 852
            var10.method300(var13);// 829
            var11 = true;// 734
         }

         if (var11) {// 665
            Class567.method1834(Class490.method1311(var2.field957)).method1340(var4.method20(), var10.method93());// 690
         }

         if (Class580.method1936().method1837(var2.field959, var1, var4)// 619
            || !var4.method163() && (Class505.method1358(Class490.method1314(var2.field957)).method1338(var1.method93()) || Class580.method1923().method1654())
            )
          {
            Class409.method762(var10);// 816
         }

         var2.method587(var10.method264(), var1.method46());// 974

         for (int var15 = var12 = var10.method277().length - 1; var15 >= 0; var15 = var12) {// 755
            List var10001 = var10.method292(var12);
            var12--;
            var2.method603(var10001, var1.method46());// 777
         }

         var6--;
         var1.method360(var4, var10.method315());// 649
      }
   }// 697

   // $VF: synthetic method
   public Class340(Class338 var1) {
      Class340 var2 = this;
      super();
      this.field957 = new Class490(this, null);// 33
      this.field958 = new Class554();// 0
      this.field959 = var1;// 552 603
      Class340 var10000;
      if (Class580.method1923().method1657()) {// 278
         try {
            Class443.method880(new Class443(var2, null));// 467
         } catch (Exception var3) {// 485
            throw new RuntimeException(var3);// 68
         }

         var10000 = this;
      } else {
         var10000 = this;// 330
      }

      var10000.field956 = new Class393(var1);
   }// 589

   // $VF: synthetic method
   public void method583(Class206 var1) {
      Class340 var2 = this;

      Class207[] var4;
      int var8;
      for (int var10000 = var8 = (var4 = var1.method346()).length - 1; var10000 >= 0; var10000 = --var8) {// 715 772
         Class207 var9 = var4[var8];// 979
         String var5 = Class339.method564(Class490.method1312(var2.field957))// 819
            .method1341(new StringBuilder().insert(0, var1.method93()).append("&").append(var9.method190()).append("&").append(var9.method20()).toString());
         Class138 var6 = Class409.method759(var9.method26(), Class505.method1355(Class490.method1314(var2.field957)));// 814
         boolean var7;
         if (!(var7 = Class580.method1936().method1840(var2.field959, var1, var9))// 751 920
            && !var9.method163()
            && (Class505.method1358(Class490.method1314(var2.field957)).method1338(var1.method93()) || Class580.method1923().method1654())) {
            var7 = true;// 800
         }

         if (!var5.equals(var9.method190()) || var6 != null || var7 || var9.method137().length > 0) {// 828
            Class204 var3 = new Class204(var9, var1.method46());// 896
            if (!var5.equals(var9.method190())) {// 813
               var3.method131(var5);// 611
               Class509.field1692++;// 702
            }

            if (var6 != null) {// 760
               var3.method266(var6);// 753
               Class339.method565(Class490.method1312(var2.field957)).method1340(var9.method20(), var3.method93());// 954
            }

            if (var7) {// 858
               Class409.method762(var3);// 928
            }

            var2.method587(var3.method264(), var1.method46());// 630
            var1.method362(var9, var3.method324());// 791
         }
      }
   }// 650

   // $VF: synthetic method
   public static Class490 method584(Class340 var0) {
      return var0.field957;
   }

   // $VF: synthetic method
   public void method585() {
      Class340 var2 = this;
      Class504.method1353(Class490.method1313(this.field957)).method1340("", "");// 544
      Iterator var1;
      Iterator var10000 = var1 = this.field956.method739().iterator();// 114

      while (var10000.hasNext()) {
         Class206 var3 = (Class206)var1.next();// 460
         if (Class580.method1924().method2043(var2.field959, var3)) {// 102
            var10000 = var1;
         } else {
            var2.method601(var3);
            var2.method572(var3);// 105 183
            var2.method569(var3);// 205
            var10000 = var1;
         }
      }

      if (Class580.method1923().method1676()) {// 469
         var2.method602();// 249
      }
   }// 196

   // $VF: synthetic method
   public String method586(String var1) {
      Class340 var2 = this;
      String var6;
      if ((var6 = Class504.method1353(Class490.method1313(this.field957)).method1341(var1)) != null) {// 4 182
         return var6;
      } else if (Class580.method1923().method1652()) {// 122
         String var7 = var1;// 305
         Class499 var10002 = Class504.method1353(Class490.method1313(this.field957));// 346
         String var10000 = var1;
         var10002.method1340(var1, var1);
         Class504.method1354(Class490.method1313(this.field957)).method1340(var1, "&");// 228

         while (var10000.lastIndexOf(46) > 0) {// 334
            var7 = var7.substring(0, var7.lastIndexOf(46));// 219
            var10002 = Class504.method1353(Class490.method1313(var2.field957));// 13
            var10000 = var7;
            var10002.method1340(var7, var7);
            Class504.method1354(Class490.method1313(var2.field957)).method1340(var7, "&");// 333
         }

         return Class504.method1353(Class490.method1313(var2.field957)).method1341(var1);// 191 375
      } else {
         StringTokenizer var5 = new StringTokenizer(var1, ".");// 234
         String var8 = "";// 508

         label40:
         while (true) {
            StringTokenizer var10 = var5;// 517

            while (var10.hasMoreTokens()) {
               if (var8.length() > 0) {// 214
                  var8 = var8 + ".";
               }

               var8 = var8 + var5.nextToken();// 524
               if (Class504.method1353(Class490.method1313(var2.field957)).method1338(var8)) {// 371
                  continue label40;
               }

               Class504.method1352(Class490.method1313(var2.field957)).method709();
               String var3 = Class409.method753(var8);// 431 563
               if ((var3 = Class504.method1353(Class490.method1313(var2.field957)).method1341(var3)).length() > 0) {// 14 514
                  var3 = var3 + ".";// 374
               }

               String var4;
               do {
                  var4 = var3 + Class504.method1352(Class490.method1313(var2.field957)).method710();// 453
               } while (Class504.method1354(Class490.method1313(var2.field957)).method1338(var4));// 354

               var10 = var5;
               Class504.method1353(Class490.method1313(var2.field957)).method1340(var8, var4);// 224
               Class504.method1354(Class490.method1313(var2.field957)).method1340(var4, "&");// 494
            }

            return Class504.method1353(Class490.method1313(var2.field957)).method1341(var1);
         }
      }
   }

   // $VF: synthetic method
   public void method587(Class533[] var1, Class221 var2) {
      Class340 var3 = this;
      if (var1 != null) {// 1217
         for (int var10000 = var4 = var1.length - 1; var10000 >= 0; var10000 = var4) {// 1196
            var3.method576(var1[var4--], var2);// 1360
         }
      }
   }// 1429

   // $VF: synthetic method
   public void method588() {
      this.field956.method741();// 73
      this.method591();// 428
      this.method585();// 586
      this.method596();// 399
      this.method593();// 232
      this.method604();// 424
      Class580.method1930().field1197 = new Class584(// 28
         Class505.method1355(Class490.method1314(this.field957)),
         Class567.method1833(Class490.method1311(this.field957)),
         Class339.method564(Class490.method1312(this.field957)),
         this.field958.method1755(),
         this.field958.method1758(),
         this.field958.method1760(),
         Class567.method1831(Class490.method1311(this.field957))
      );
      Class580.method1930().field1196 = Class505.method1356(Class490.method1314(this.field957));// 455
      Class580.method1930().field1198 = Class504.method1353(Class490.method1313(this.field957));// 148
   }// 236

   // $VF: synthetic method
   public String method589(Class206 var1, String var2, String var3) {
      Class340 var4 = this;
      String var6;
      if ((// 86
            var6 = Class567.method1833(Class490.method1311(this.field957))// 19
               .method1341(new StringBuilder().insert(0, var1.method93()).append("&").append(var2).append("&").append(var3).toString())
         )
         != null) {
         return var6;
      } else {
         int var5;
         for (int var10000 = var5 = (var8 = this.field956.method731(var1.method93())).size() - 1; var10000 >= 0; var10000 = --var5) {// 131 473
            String var7;
            if ((var7 = var4.method589((Class206)var8.get(var5), var2, var3)) != null) {// 528
               return var7;// 289
            }
         }

         return null;// 264
      }
   }

   // $VF: synthetic method
   public void method590(Class206 var1, Class203 var2) {
      Class340 var3 = this;
      int var13;
      int var10000 = var13 = Class580.method1923().method1658().method1547(this.field959, var1, var2);// 613
      Class580.method1923().method1658();// 867
      if (var10000 == 4) {
         var2.method293();// 768
      } else {
         Class580.method1923().method1658();
         boolean var8 = var13 == 3;// 744
         Class199[] var4 = var2.method284();// 655
         int var5 = var2.method130().length;// 771
         if (!var2.method254()) {// 863
            var5++;
         }

         Class138[] var6;
         int var7 = (var6 = var2.method277()).length;

         for (int var17 = var11 = 0; var17 < var7; var17 = ++var11) {// 864
            Class138 var9;
            if ((var9 = var6[var11]) == Class138.field578 || var9 == Class138.field576) {// 647
               var5++;// 950
            }
         }

         Class452.method953(Class490.method1315(this.field957)).method709();// 727
         Class367 var14 = null;// 750
         if (Class580.method1932().method1852()) {// 853
            var14 = new Class367();
         }

         for (int var18 = var7 = var4.length - 1; var18 >= 0; var18 = --var7) {// 787
            Class199 var12;
            Class138 var16;
            if ((var16 = Class409.method759((var12 = var4[var7]).method26(), Class505.method1355(Class490.method1314(var3.field957)))) != null) {// 782 796 870
               var12.method266(var16);// 929
            }

            try {
               if (var2.method292(var12.method2()) != null) {// 836
                  continue;
               }
            } catch (ArrayIndexOutOfBoundsException var10) {
            }

            Class580.method1923().method1658();
            if (var13 == 5) {// 805
               if (var12.method2() >= var5) {// 822
                  var12.method131(Class580.method1932().method1852() ? var14.method710() : Class580.method1923().method1660().method1747());// 627
               }
            } else {
               Class580.method1923().method1658();
               if (var13 == 6) {// 959
                  if (var12.method2() < var5) {// 976
                     var12.method131(Class580.method1932().method1852() ? var14.method710() : Class580.method1923().method1660().method1747());// 843
                  } else {
                     var12.method131(Class580.method1932().method1852() ? var14.method710() : Class580.method1923().method1660().method1747());// 687
                  }
               } else {
                  Class580.method1923().method1658();
                  if (var13 == 1) {// 696
                     var12.method131(Class580.method1923().method1660().method1747());// 666
                  } else if (!var8) {// 924
                     var12.method131(Class452.method953(Class490.method1315(var3.field957)).method710());// 730
                  }
               }
            }
         }
      }
   }// 625 933

   // $VF: synthetic method
   public void method591() {
      Class340 var2 = this;
      Class375.method715();// 99
      Iterator var1;
      Iterator var10000 = var1 = this.field956.method739().iterator();// 160

      while (var10000.hasNext()) {
         Class206 var3 = (Class206)var1.next();// 40
         if (Class580.method1924().method2043(var2.field959, var3)) {// 63
            var10000 = var1;
         } else {
            var2.method575(var3);
            var2.method570(var3);// 541 550
            var2.method581(var3);// 510
            var10000 = var1;
         }
      }

      if (!field960 && field961.method1342() > 0) {// 367
         field960 = true;// 82
         throw new Class243();// 83
      }
   }// 279

   // $VF: synthetic method
   public static boolean method592() {
      return field960;// 204
   }

   // $VF: synthetic method
   public void method593() {
      Class340 var2 = this;
      Iterator var5 = this.field956.method739().iterator();// 826

      label38:
      while (true) {
         for (Iterator var10000 = var5; var10000.hasNext(); var10000 = var5) {
            Class206 var6 = (Class206)var5.next();// 891
            if (!Class580.method1924().method2043(var2.field959, var6)) {// 673
               var2.method600(var6);
               Class221 var3 = var6.method46();// 629
               var2.method595(var6.method200(), var3);// 834 948

               int var1;
               Class208[] var4;
               for (int var9 = var1 = (var4 = var6.method341()).length - 1; var9 >= 0; var9 = var1) {// 681 736
                  Class208 var10001 = var4[var1];
                  var1--;
                  var2.method595(var10001.method200(), var3);// 759
               }

               for (int var10 = var7 = (var8 = var6.method346()).length - 1; var10 >= 0; var10 = var7) {// 742 875
                  Class207 var11 = var8[var7];
                  var7--;
                  var2.method595(var11.method200(), var3);// 900
               }
               continue label38;
            }
         }

         return;// 732
      }
   }

   // $VF: synthetic method
   public String method594(String var1) {
      String var10 = var1;
      Class340 var11 = this;
      int var2;
      if (var1.contains(">.")) {// 1025
         for (int var20 = var2 = 0; var20 < var10.length(); var20 = ++var2) {// 1007
            if (var10.charAt(var2) == 'L') {// 1048
               int var3;
               int var4 = var3 = var2 + 1;// 1084 1136
               int var5 = 0;// 1229
               int var6;
               var20 = var6 = var3;

               while (true) {
                  if (var20 >= var10.length()) {
                     var22 = var10;// 1494
                     break;
                  }

                  if (var10.charAt(var6) == '<') {// 1028
                     var5++;
                  }

                  if (var10.charAt(var6) == '>') {// 1643
                     var5--;
                  }

                  if (var10.charAt(var6) == ';' && var5 == 0) {// 1564
                     var4 = var6;// 1451
                     var22 = var10;
                     break;// 1149
                  }

                  var20 = ++var6;// 1538
               }

               String var16;
               if ((var16 = var22.substring(var3, var4)).indexOf(46) > 0) {// 1442
                  String var7;
                  String var23 = var7 = var16;// 1633

                  while (var23.contains(">")) {// 1126
                     int var8 = var7.indexOf(62);// 1138
                     int var9 = var7.lastIndexOf(60, var8);// 1432
                     var23 = var7 = new StringBuilder().insert(0, var7.substring(0, var9)).append(var7.substring(var8 + 1)).toString();// 1496
                  }

                  var7 = var7.replace('.', '$').replace('/', '.');// 1208
                  String var19;
                  if ((var19 = Class505.method1355(Class490.method1314(var11.field957)).method1341(var7)) != null && !var19.equals(var7)) {// 1087 1397
                     var10 = new StringBuilder()
                        .insert(0, var10.substring(0, var3))// 1330
                        .append(var19.replace('.', '/'))
                        .append(var10.substring(var3 + var16.length()))
                        .toString();
                  }
               }
            }
         }
      }

      for (int var24 = var2 = var10.length() - 1; var24 >= 0; var24 = --var2) {// 1044
         if (var10.charAt(var2) == 'L') {// 1142
            int var13 = var10.indexOf(59, var2);// 1321
            int var14 = var10.indexOf(60, var2);// 1293
            if (var13 == -1) {// 1671
               var13 = var14;
            }

            if (var14 != -1 && var14 < var13) {// 1227
               var13 = var14;
            }

            if (var13 > var2) {// 1326
               String var15 = var10.substring(var2 + 1, var13).replace('/', '.');// 1015 1523
               String var17;
               if ((var17 = Class505.method1355(Class490.method1314(var11.field957)).method1341(var15)) != null && !var17.equals(var15)) {// 1188 1519
                  var10 = new StringBuilder()
                     .insert(0, var10.substring(0, var2 + 1))// 1455
                     .append(var17.replace('.', '/'))
                     .append(var10.substring(var2 + var15.length() + 1))
                     .toString();
               }
            }
         }
      }

      return var10;// 1376
   }

   // $VF: synthetic method
   public void method595(Class151[] var1, Class221 var2) {
      Class340 var3 = this;

      int var4;
      for (int var10000 = var4 = var1.length - 1; var10000 >= 0; var10000 = --var4) {// 642
         Class151 var11;
         if ((var11 = var1[var4]) instanceof Class164) {// 622 659
            Class164 var14 = (Class164)var11;// 628
            var3.method595(var14.method200(), var2);// 904
         } else if (!(var11 instanceof Class161) && !(var11 instanceof Class175) && !(var11 instanceof Class157)) {// 804 890 984
            if (var11 instanceof Class162) {// 817
               Class162 var13;
               Class211[] var18;
               if ((var18 = (var13 = (Class162)var11).method196()).length > 0) {// 710 737 967
                  Class149 var21 = var2.method402();// 763

                  int var23;
                  for (int var26 = var23 = var18.length - 1; var26 >= 0; var26 = --var23) {// 767
                     Class211 var24 = var18[var23];// 980
                     if (!var21.method176(var24.method84(), (byte)7).contains("$")) {// 733 792
                        var24.method6(0);// 778
                     }
                  }
               }
            } else if (!(var11 instanceof Class163) && !(var11 instanceof Class160) && !(var11 instanceof Class159)) {// 780 789 866
               if (var11 instanceof Class173) {// 895
                  Class173 var12;
                  Class173 var25 = var12 = (Class173)var11;// 790
                  String var17 = var25.method93();// 942
                  String var20 = var3.method594(var17);// 812
                  var25.method89(var2.method106(var20));// 906
               } else if (!(var11 instanceof Class169) && !(var11 instanceof Class150) && !(var11 instanceof Class176)) {// 685 916 973
                  if (var11 instanceof Class170) {// 657
                     Class170 var5;
                     if ((var5 = (Class170)var11).method30() != 0) {// 621 709
                        Class149 var6 = var2.method402();// 893
                        String var7 = var5.method215().method5(var6).replace('/', '.');// 680 917
                        String var8;
                        if ((var8 = Class505.method1356(Class490.method1314(var3.field957)).method1341(var7)) != null) {// 717 925
                           var7 = var8;// 783
                        }

                        Class186 var9;
                        if ((var9 = var5.method214()) != null) {// 786 934
                           String var10 = var9.method5(var6);// 840
                           String var15 = var9.method232(var6);// 937
                           var7 = Class567.method1833(Class490.method1311(var3.field957)).method1341(var7 + "&" + var10 + "&" + var15);// 969
                           var8 = Class567.method1834(Class490.method1311(var3.field957)).method1341(var15);// 889
                           if (var7 != null && !var7.equals(var10) || var8 != null) {// 658
                              if (var7 == null) {// 1276
                                 var7 = var10;
                              }

                              if (var8 == null) {// 1292
                                 var8 = var15;
                              }

                              int var16 = var2.method392(var7, var8);// 1199
                              var5.method89(var16);// 1284
                           }
                        }
                     }
                  } else if (!(var11 instanceof Class172) && !(var11 instanceof Class152) && var11 instanceof Class177) {// 1135 1627 1682
                  }
               }
            }
         }
      }
   }// 1483

   // $VF: synthetic method
   public void method596() {
      Class340 var1 = this;
      Iterator var3;
      Iterator var10000 = var3 = this.field956.method739().iterator();// 294

      while (var10000.hasNext()) {
         Class206 var2 = (Class206)var3.next();// 342
         if (Class580.method1924().method2043(var1.field959, var2)) {// 435
            var10000 = var3;
         } else {
            var1.method583(var2);// 96
            var1.method582(var2);// 581
            var10000 = var3;
         }
      }
   }// 313

   // $VF: synthetic method
   public String method597(String var1) {
      if (!var1.contains("$")) {// 393
         return Class505.method1355(Class490.method1314(this.field957)).method1341(var1);
      } else {
         String var4;
         if ((var4 = Class505.method1355(Class490.method1314(this.field957)).method1341(var1)) == null) {// 230 419
            return this.method597(var1.substring(0, var1.lastIndexOf(36)));// 112
         } else {
            int var3;
            if ((var3 = var4.lastIndexOf(46)) != -1) {// 43 535
               var4 = var4.substring(var3 + 1);
            }

            if ((var3 = var4.lastIndexOf(36)) != -1) {// 54 293
               var4 = var4.substring(var3 + 1);
            }

            return var4.charAt(0) >= '0' && var4.charAt(0) <= '9'// 322
               ? new StringBuilder().insert(0, this.method597(var1.substring(0, var1.lastIndexOf(36)))).append('$').append('0').append(var4).toString()// 74
               : new StringBuilder().insert(0, this.method597(var1.substring(0, var1.lastIndexOf(36)))).append('$').append(var4).toString();// 241
         }
      }
   }

   // $VF: synthetic method
   public void method598(Class206 var1, String var2, String var3, String var4, boolean var5, boolean var6) {
      Class340 var7 = this;
      if (var5) {// 569
         Class206 var10 = var1;// 327

         do {
            String var8 = var10.method190();// 383
            if ((var10 = var7.field959.method557(var8)) != null) {// 140 197
               Class567.method1833(Class490.method1311(var7.field957))// 451
                  .method1340(new StringBuilder().insert(0, var10.method93()).append("&").append(var2).append("&").append(var4).toString(), var3);
               if (var10.method244()) {// 49
                  Class567.method1831(Class490.method1311(var7.field957))// 565
                     .method1340(new StringBuilder().insert(0, var10.method93()).append("&").append(var2).toString(), var3);
               }

               Class567.method1836(Class490.method1311(var7.field957))// 173
                  .method1340(
                     new StringBuilder().insert(0, var10.method93()).append("&").append(var3).append("&").append(Class409.method758(var4)).toString(), "&"
                  );
            }
         } while (var10 != null);// 101
      }

      int var12;
      for (int var10000 = var12 = (var11 = var7.field956.method731(var1.method93())).size() - 1; var10000 >= 0; var10000 = var12) {// 244 562
         Class206 var9 = (Class206)var11.get(var12);// 247
         Class340 var13;
         if (var6 && Class580.method1923().method1659() && !Class409.method753(var1.method93()).equals(Class409.method753(var9.method93()))) {// 259
            var13 = var7;// 194
            Class567.method1836(Class490.method1311(var7.field957))
               .method1340(new StringBuilder().insert(0, var9.method93()).append("&").append(var3).append("&").append(Class409.method758(var4)).toString(), "&");
         } else {
            Class567.method1833(Class490.method1311(var7.field957))// 163
               .method1340(new StringBuilder().insert(0, var9.method93()).append("&").append(var2).append("&").append(var4).toString(), var3);
            if (var9.method244()) {// 9
               Class567.method1831(Class490.method1311(var7.field957))// 243
                  .method1340(new StringBuilder().insert(0, var9.method93()).append("&").append(var2).toString(), var3);
            }

            var13 = var7;// 566
            Class567.method1836(Class490.method1311(var7.field957))
               .method1340(new StringBuilder().insert(0, var9.method93()).append("&").append(var3).append("&").append(Class409.method758(var4)).toString(), "&");
         }

         var12--;
         var13.method598(var9, var2, var3, var4, var5, var6);// 229
      }
   }// 590

   // $VF: synthetic method
   public boolean method599(Class206 var1) {
      for (int var10000 = var3 = (var4 = var1.method341()).length - 1; var10000 >= 0; var10000 = --var3) {// 72 268
         if (var4[var3].method246()) {// 497
            return true;// 66
         }
      }

      return false;// 536
   }

   // $VF: synthetic method
   public void method600(Class206 var1) {
      Class340 var2 = this;

      int var6;
      Class221 var7;
      for (int var10000 = var6 = (var7 = var1.method46()).method2() - 1; var10000 >= 0; var10000 = --var6) {// 911 947
         Class178 var4;
         if (!((var4 = var7.method174(var6)) instanceof Class182)) {// 903 908
            if (var4 instanceof Class187) {// 837
               Class149 var33 = var7.method402();// 962
               Class187 var27;
               String var20 = (var27 = (Class187)var4).method5(var33);// 739 874
               String var39;
               if ((var39 = Class505.method1356(Class490.method1314(var2.field957)).method1341(var20)) != null) {// 757 820
                  var20 = var39;// 726
               }

               Class186 var60 = (Class186)var7.method174(var27.method2());// 720
               String var43 = var60.method5(var33);// 653
               String var47 = var60.method232(var33);// 626
               String var49 = null;// 643
               String var51 = null;
               String var61;
               if (!(var27 instanceof Class188) && !(var27 instanceof Class189)) {// 724
                  if (var27 instanceof Class190) {// 871
                     var49 = Class339.method564(Class490.method1312(var2.field957)).method1341(var20 + "&" + var43 + "&" + var47);// 683
                     var51 = Class339.method565(Class490.method1312(var2.field957)).method1341(var47);// 918
                  }

                  var61 = var49;// 641
               } else {
                  var49 = Class567.method1833(Class490.method1311(var2.field957)).method1341(var20 + "&" + var43 + "&" + var47);// 807
                  var51 = Class567.method1834(Class490.method1311(var2.field957)).method1341(var47);// 849
                  var61 = var49;
               }

               if (var61 != null && !var49.equals(var43) || var51 != null) {
                  if (var49 == null) {// 915
                     var49 = var43;
                  }

                  if (var51 == null) {// 842
                     var51 = var47;
                  }

                  int var53 = var7.method392(var49, var51);// 779
                  var27.method6(var53);// 785
               }
            } else if (!(var4 instanceof Class191) && !(var4 instanceof Class194) && var4 instanceof Class192) {// 745 878 952
               Class192 var5 = (Class192)var4;// 943
               Class149 var3 = var7.method402();// 856
               Class186 var19;
               Class186 var57 = var19 = (Class186)var7.method174(var5.method2());// 830
               String var8 = var57.method232(var3);// 957
               String var9 = var57.method5(var3);// 769
               if (var8.contains(")L")) {// 718
                  var8 = var8.substring(var8.lastIndexOf(")L") + 2, var8.length() - 1).replace('/', '.');// 971
                  if (Class505.method1355(Class490.method1314(var2.field957)).method1341(var8) != null) {// 711 859
                     String var11 = null;// 926
                     if (var1.method200() != null) {// 880
                        Class151[] var12;
                        int var13 = (var12 = var1.method200()).length;

                        int var14;
                        for (int var58 = var14 = 0; var58 < var13; var58 = ++var14) {// 857
                           Class151 var15;
                           int[] var54;
                           if ((var15 = var12[var14]) instanceof Class168 && (var54 = ((Class168)var15).method212()[var5.method17()].method41()) != null) {// 645 693 951 963
                              int[] var55;
                              int var16 = (var55 = var54).length;

                              int var17;
                              for (int var59 = var17 = 0; var59 < var16; var59 = ++var17) {// 707
                                 int var18;
                                 if (var7.method174(var18 = var55[var17]) instanceof Class194) {// 794
                                    Class194 var56 = (Class194)var7.method174(var18);// 831
                                    var11 = ((Class191)var7.method174(var56.method2())).method20();// 762
                                    break;// 784
                                 }
                              }
                           }
                        }
                     }

                     String var48;
                     if (var11 != null && (var48 = Class567.method1833(Class490.method1311(var2.field957)).method1341(var8 + "&" + var9 + "&" + var11)) != null// 651 678 983
                        )
                      {
                        var19.method90(var7.method106(var48));// 809
                     }
                  }
               }

               String var10 = var19.method232(var3);// 797
               String var46 = var2.method594(var10);// 674
               if (!var10.equals(var46)) {// 714
                  var19.method6(var7.method106(var46));// 761
               }
            }
         }
      }

      for (int var62 = var6 = var7.method2() - 1; var62 >= 0; var62 = --var6) {// 795
         Class178 var32;
         if ((var32 = var7.method174(var6)) instanceof Class182) {// 728 766
            Class149 var36 = var7.method402();// 865
            Class182 var31;
            String var26 = ((String)(var31 = (Class182)var32).method227(var36)).replace('/', '.');// 614 725 885
            boolean var41 = false;// 978
            int var42;
            var62 = var42 = 0;// 661

            while (var62 < var26.length() && var26.charAt(var42) == '[') {// 617
               var62 = ++var42;// 719
            }

            if (var42 > 0 && var26.endsWith(";") && var26.charAt(var42) == 'L') {// 938
               var26 = var26.substring(var42 + 1, var26.length() - 1);// 803
               var41 = true;// 620
            }

            String var44;
            if ((var44 = Class505.method1355(Class490.method1314(var2.field957)).method1341(var26)) != null) {// 876 964
               var44 = var44.replace('.', '/');// 886
               if (var41) {// 884
                  var44 = "[L" + var44 + ";";// 748

                  for (int var67 = var42; var67 > 1; var67 = var42) {// 825 860
                     StringBuilder var68 = new StringBuilder().append("[");// 872
                     var42--;
                     var44 = var68.append(var44).toString();
                  }
               }

               var31.method6(var7.method106(var44));// 798
               Map var50;
               Object var52;
               if ((var52 = (var50 = var7.field816).get(var26.replace('.', '/'))) != null) {// 615 699 970 981
                  var50.put(var44, var52);
               }
            }
         } else if (!(var32 instanceof Class187)) {// 972
            if (!(var32 instanceof Class191)) {// 679
               if (var32 instanceof Class194) {// 848
                  Class194 var35 = (Class194)var32;// 660
                  Class191 var30 = (Class191)var7.method174(var35.method2());// 668
                  var30.method131(var2.method594(var30.method20()));// 977
               }
            } else {
               Class191 var34;
               String var28 = (var34 = (Class191)var32).method20();// 623 888
               String var21;
               if ((var21 = Class505.method1355(Class490.method1314(var2.field957)).method1341(var28)) != null) {// 656 827
                  var34.method131(var21);// 877
               } else {
                  int var40;
                  var62 = var40 = 0;// 810

                  while (var62 < var28.length() && var28.charAt(var40) == '[') {// 945
                     var62 = ++var40;// 743
                  }

                  if (var40 > 0 && var28.endsWith(";") && var28.charAt(var40) == 'L') {// 644
                     var28 = var28.substring(var40 + 1, var28.length() - 1).replace('/', '.');// 638 701
                     String var22;
                     if ((var22 = Class505.method1355(Class490.method1314(var2.field957)).method1341(var28)) != null) {// 741 913
                        String var25 = "[L" + var22.replace('.', '/') + ";";// 832

                        for (int var64 = var40; var64 > 1; var64 = var40) {// 713 773
                           StringBuilder var65 = new StringBuilder().append("[");// 955
                           var40--;
                           var25 = var65.append(var25).toString();
                        }

                        var34.method131(var25);// 935
                        continue;// 664
                     }
                  }

                  if (var28.startsWith("L") && var28.endsWith(";")) {// 731
                     var28 = var28.substring(1, var28.length() - 1).replace('/', '.');// 749 894
                     String var23;
                     if ((var23 = Class505.method1355(Class490.method1314(var2.field957)).method1341(var28)) != null) {// 631 634
                        String var24 = "L" + var23.replace('.', '/') + ";";// 862
                        var34.method131(var24);// 703
                     }
                  }
               }
            }
         }
      }
   }// 637

   // $VF: synthetic method
   public void method601(Class206 var1) {
      Class340 var2 = this;
      String var6 = var1.method93();// 429
      if (!Class505.method1355(Class490.method1314(this.field957)).method1338(var6)) {// 89
         String var4 = Class409.method753(var6);// 506
         String var3 = this.method586(var4);// 599
         if (Class580.method1923().method1659() && (!var4.equals(var3) || Class580.method1923().method1654())) {// 318
            var3 = Class580.method1923().method1677();// 88
            Class505.method1358(Class490.method1314(this.field957)).method1340(var6, "&");// 306
         }

         if (var3.length() > 0) {// 331
            var3 = var3 + ".";
         }

         if (!Class580.method1923().method1660().method1736()) {// 130
            Class505.method1357(Class490.method1314(this.field957)).method709();
         }

         do {
            var5 = var3 + Class505.method1357(Class490.method1314(var2.field957)).method710();// 602
         } while (Class505.method1356(Class490.method1314(var2.field957)).method1338(var5) || var2.field959.method557(var5) != null);// 509

         Class505.method1355(Class490.method1314(var2.field957)).method1340(var6, var5);// 35
         Class505.method1356(Class490.method1314(var2.field957)).method1340(var5, var6);// 233
      }
   }// 256

   // $VF: synthetic method
   public void method602() {
      Class340 var2 = this;

      for (String var5 : Class505.method1355(Class490.method1314(this.field957)).method1339()) {// 75 351
         String var3 = Class505.method1355(Class490.method1314(var2.field957)).method1341(var5);// 372
         String var1 = var2.method597(var5);// 111
         if (!var3.equals(var1)) {// 587
            Class505.method1355(Class490.method1314(var2.field957)).method1340(var5, var1);// 304
            Class505.method1356(Class490.method1314(var2.field957)).method1337(var3);// 153
            Class505.method1356(Class490.method1314(var2.field957)).method1340(var1, var5);// 477
         }
      }
   }// 200

   // $VF: synthetic method
   public void method603(List var1, Class221 var2) {
      Class340 var3 = this;
      if (var1 != null) {// 1191
         for (int var10000 = var4 = var1.size() - 1; var10000 >= 0; var10000 = var4) {// 1375
            Object var10001 = var1.get(var4);
            var4--;
            var3.method576((Class533)var10001, var2);// 1681
         }
      }
   }// 1600

   // $VF: synthetic method
   public void method604() {
      Class340 var1 = this;
      Iterator var3;
      Iterator var10000 = var3 = this.field956.method739().iterator();// 459

      while (var10000.hasNext()) {
         Class206 var2 = (Class206)var3.next();// 302
         if (Class580.method1924().method2043(var1.field959, var2)) {// 203
            var10000 = var3;
         } else {
            var1.method578(var2);// 118
            var10000 = var3;
         }
      }
   }// 353

   // $VF: synthetic method
   public boolean method605(Class206 var1, String var2, String var3, boolean var4) {
      Class340 var8 = this;
      if (Class567.method1836(Class490.method1311(this.field957))// 572
         .method1338(new StringBuilder().insert(0, var1.method93()).append("&").append(var2).append("&").append(var3).toString())) {
         return true;// 60
      } else if (!var4) {// 348
         return false;
      } else {
         int var5;
         for (int var9 = var5 = (var7 = this.field956.method731(var1.method93())).size() - 1; var9 >= 0; var9 = --var5) {// 56 150
            if (var8.method605((Class206)var7.get(var5), var2, var3, var4)) {// 416
               return true;// 211
            }
         }

         return false;// 427
      }
   }

   // $VF: synthetic method
   public void method606(Class206 var1, String var2, String var3, String var4) {
      Class340 var6 = this;

      int var5;
      for (int var10000 = var5 = (var8 = this.field956.method731(var1.method93())).size() - 1; var10000 >= 0; var10000 = var5) {// 344 442
         Class206 var7;
         Class206 var10001 = var7 = (Class206)var8.get(var5);// 345
         Class339.method564(Class490.method1312(var6.field957))
            .method1340(new StringBuilder().insert(0, var7.method93()).append("&").append(var2).append("&").append(var4).toString(), var3);
         Class339.method566(Class490.method1312(var6.field957))// 37
            .method1340(new StringBuilder().insert(0, var7.method93()).append("&").append(var3).append("&").append(var4).toString(), "&");
         var5--;
         var6.method606(var10001, var2, var3, var4);// 217 449
      }
   }// 195
}
