package mapped;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

// $VF: Compiled from lb
public class Class508 {
   // $VF: synthetic field
   public final int[] field1676;
   // $VF: synthetic field
   public final byte[] field1677;
   // $VF: synthetic field
   public static final int field1678 = 4;
   // $VF: synthetic field
   public static final int field1679 = 1048576;
   // $VF: synthetic field
   public final String[] field1680;
   // $VF: synthetic field
   public final int field1681;
   // $VF: synthetic field
   public static final int field1682 = 1;
   // $VF: synthetic field
   public final int field1683;
   // $VF: synthetic field
   public static final int field1684 = 256;
   // $VF: synthetic field
   @Deprecated
   public final byte[] field1685;
   // $VF: synthetic field
   public final int[] field1686;
   // $VF: synthetic field
   public static final int field1687 = 8;
   // $VF: synthetic field
   public static final int field1688 = 4096;
   // $VF: synthetic field
   public static final int field1689 = 2;
   // $VF: synthetic field
   public final Class492[] field1690;

   // $VF: synthetic method
   public Class508(InputStream var1) {
      this(method1407(var1, false));// 212
   }// 365

   // $VF: synthetic method
   public final int method1362() {
      Class508 var1 = this;
      int var4;
      int var13 = var4 = this.field1683 + 8 + this.method1399(this.field1683 + 6) * 2;// 3500
      int var5 = var4 + 2;// 3091
      int var2 = this.method1399(var13);// 3418

      while (var2-- > 0) {// 3416
         var13 = var5;
         var5 += 8;// 2821
         int var3 = var1.method1399(var13 + 6);// 2874
         int var10 = var3;// 2656

         while (true) {
            var3--;
            if (var10 <= 0) {
               break;
            }

            var5 += 6 + var1.method1391(var5 + 2);// 3536
            var10 = var3;
         }
      }

      int var6 = var5 + 2;// 2989
      int var8 = var1.method1399(var5);// 3254

      while (var8-- > 0) {// 3037
         var13 = var6;
         var6 += 8;// 2621
         var2 = var1.method1399(var13 + 6);// 3172
         int var12 = var2;// 3101

         while (true) {
            var2--;
            if (var12 <= 0) {
               break;
            }

            var6 += 6 + var1.method1391(var6 + 2);// 2648
            var12 = var2;
         }
      }

      return var6 + 2;// 3298
   }

   // $VF: synthetic method
   public final String method1363(int var1, char[] var2) {
      String var4;
      if ((var4 = this.field1680[var1]) != null) {// 3669 3737
         return var4;// 3728
      } else {
         int var5 = this.field1676[var1];// 3979
         return this.field1680[var1] = this.method1364(var5 + 2, this.method1399(var5), var2);// 3746 3906
      }
   }

   // $VF: synthetic method
   public Class508(byte[] var1) {
      this(var1, 0, var1.length);// 97
   }// 411

   // $VF: synthetic method
   public String method1364(int var1, int var2, char[] var3) {
      int var8;
      var2 = (var8 = var1) + var2;// 3870 4018
      int var4 = 0;// 3784
      byte[] var5 = this.field1677;// 3578

      while (var8 < var2) {// 4004
         byte var6;
         byte var12 = var6 = var5[var8];// 3866
         var8++;
         if ((var12 & 128) == 0) {// 3747
            int var10001 = var4;
            int var10002 = var6 & 127;
            var4++;
            var3[var10001] = (char)var10002;// 3893
         } else if ((var6 & 224) == 192) {// 3779
            int var13 = var4;
            int var15 = var6 & 31;
            var4++;
            var15 <<= 6;
            int var10003 = var5[var8] & 63;
            var8++;
            var3[var13] = (char)(var15 + var10003);// 3819
         } else {
            int var14 = var4;
            int var17 = var6 & 15;
            var4++;
            var17 <<= 12;
            int var20 = var5[var8] & 63;
            var8++;
            var17 += var20 << 6;
            var20 = var5[var8] & 63;
            var8++;
            var3[var14] = (char)(var17 + var20);// 3703
         }
      }

      return new String(var3, 0, var4);// 3614
   }

   // $VF: synthetic method
   public Object method1365(int var1, char[] var2) {
      int var8 = this.field1676[var1];// 3869
      switch (this.field1677[var8 - 1]) {// 4010
         case 3:
            while (false) {
            }

            return this.method1391(var8);// 3883
         case 4:
            return Float.intBitsToFloat(this.method1391(var8));// 3756
         case 5:
            return this.method1403(var8);// 3994
         case 6:
            return Double.longBitsToDouble(this.method1403(var8));// 3822
         case 7:
            return Class599.method2047(this.method1405(var8, var2));// 3995
         case 8:
            return this.method1405(var8, var2);// 3977
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         default:
            throw new IllegalArgumentException();// 3685
         case 15:
            int var4 = this.method1385(var8);// 3853
            int var9 = this.field1676[this.method1399(var8 + 1)];// 3840
            int var5 = this.field1676[this.method1399(var9 + 2)];// 3770
            String var6 = this.method1372(var9, var2);// 3677
            String var7 = this.method1405(var5, var2);// 3970
            String var11 = this.method1405(var5 + 2, var2);// 3989
            boolean var10 = this.field1677[var9 - 1] == 11;// 3587
            return new Class563(var4, var6, var7, var11, var10);// 3750
         case 16:
            return Class599.method2070(this.method1405(var8, var2));// 3783
         case 17:
            return this.method1408(var1, var2);// 3712
      }
   }

   // $VF: synthetic method
   public void method1366(Class513 var1, Class602 var2, int var3, boolean var4) {
      Class508 var13 = this;
      int var10002 = this.field1677[var3] & 255;// 2780 2831
      var3++;
      int var12 = var10002;
      var1.method1425(var10002, var4);// 3544
      char[] var5 = var2.field2440;// 2854

      int var6;
      for (int var15 = var6 = 0; var15 < var12; var15 = ++var6) {// 3063
         int var19;
         int var10001 = var19;
         var19 += 2;// 2729
         int var7 = var13.method1399(var10001);// 3560
         var15 = var7;// 2891

         while (true) {
            var7--;
            if (var15 <= 0) {
               break;
            }

            int var11 = var19 + 2;// 3396
            String var8 = var13.method1405(var19, var5);// 3224
            var19 = var13.method1389(var1.method1441(var6, var8, var4), var11, true, var5);// 2909 2915 3318
            var15 = var7;
         }
      }
   }// 2686

   // $VF: synthetic method
   public String[] method1367() {
      Class508 var3 = this;
      int var2;
      int var5;
      String[] var6 = new String[var2 = this.method1399(var5 = this.field1683 + 6)];// 325 392 571
      if (var2 > 0) {// 44
         char[] var4 = new char[this.field1681];// 362

         int var1;
         for (int var10000 = var1 = 0; var10000 < var2; var10000 = var1) {// 476
            int var10001 = var1;
            var5 += 2;// 542
            String var10002 = var3.method1372(var5, var4);
            var1++;
            var6[var10001] = var10002;// 231
         }
      }

      return var6;// 343
   }

   // $VF: synthetic method
   public void method1368(int var1) {
   }// 2739

   // $VF: synthetic method
   public int method1369(int var1) {
      return this.field1676[var1];// 3590
   }

   // $VF: synthetic method
   public int[] method1370(Class513 var1, Class602 var2, int var3, boolean var4) {
      Class508 var18 = this;
      char[] var5 = var2.field2440;// 2916
      int[] var22 = new int[this.method1399(var3)];// 2644 2653
      int var13 = var3 + 2;// 2913
      int[] var6 = var22;

      int var7;
      for (int var23 = var7 = 0; var23 < var6.length; var23 = ++var7) {// 2958
         int var8;
         label44:
         switch ((var8 = var18.method1391(var6[var7] = var13)) >>> 24) {// 2737 3098 3103
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            case 20:
            case 21:
            case 22:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            default:
               throw new IllegalArgumentException();// 3079
            case 16:
            case 17:
            case 18:
            case 23:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
               var14 = var13 + 3;// 2928

               while (false) {
               }

               var24 = var18;
               break;// 3001
            case 64:
            case 65:
               var14 = var13 + 3;// 3454
               int var9 = var18.method1399(var13 + 1);// 3320
               int var25 = var9;// 2803

               while (true) {
                  var9--;
                  if (var25 <= 0) {
                     var24 = var18;// 3202
                     break label44;
                  }

                  int var10 = var18.method1399(var14);// 3407
                  int var10002 = var14;// 3058
                  var14 += 6;// 3470
                  int var11 = var18.method1399(var10002 + 2);
                  var18.method1383(var10, var2.field2434);// 3340
                  var18.method1383(var10 + var11, var2.field2434);// 2835
                  var25 = var9;
               }
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
               var14 = var13 + 4;// 3191
               var24 = var18;
         }

         int var19 = var24.method1385(var14);
         if (var8 >>> 24 == 66) {// 2811
            Class573 var20 = var19 == 0 ? null : new Class573(var18.field1677, var14);// 2623
            int var15 = var14 + 1 + 2 * var19;// 2795
            int var16 = var15 + 2;// 2691
            String var21 = var18.method1405(var15, var5);// 2701
            var13 = var18.method1389(var1.method1430(var8 & -256, var20, var21, var4), var16, true, var5);// 2610 2957 3253
         } else {
            int var17 = var14 + 3 + 2 * var19;// 3521
            var13 = var18.method1389(null, var17, true, var5);// 3149 3497
         }
      }

      return var6;// 2713
   }

   // $VF: synthetic method
   public int method1371() {
      return this.field1676.length;// 2730
   }

   // $VF: synthetic method
   public String method1372(int var1, char[] var2) {
      return this.method1382(var1, var2);// 3731
   }

   // $VF: synthetic method
   public static String method1373(short var0) {
      return "Unsupported class file major version " + var0;
   }

   // $VF: synthetic method
   public short method1374(int var1) {
      byte[] var3;
      return (short)(((var3 = this.field1677)[var1] & 255) << 8 | var3[var1 + 1] & 255);// 3765 3939
   }

   // $VF: synthetic method
   public String method1375() {
      return this.method1372(this.field1683 + 2, new char[this.field1681]);// 374
   }

   // $VF: synthetic method
   public void method1376(int var1, Class483[] var2) {
      if (var2[var1] == null) {// 3243
         Class483 var5 = this.method1387(var1, var2);// 3484
         var5.field1600 = (short)(var5.field1600 | 1);
      }
   }// 3328

   // $VF: synthetic method
   public int method1377(Class602 var1, int var2) {
      Class508 var12 = this;
      int var3;
      int var10;
      int var11;
      Class602 var15;
      switch ((var10 = this.method1391(var2)) >>> 24) {// 3386 3406
         case 0:
         case 1:
         case 22:
            while (false) {
            }

            var3 = var2 + 2;// 3373
            var11 = var10 & -65536;// 3248
            var15 = var1;// 2839
            break;// 3381
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
         case 58:
         case 59:
         case 60:
         case 61:
         case 62:
         case 63:
         default:
            throw new IllegalArgumentException();// 2774
         case 16:
         case 17:
         case 18:
         case 23:
         case 66:
            var3 = var2 + 3;
            var11 = var10 & -256;// 3226
            var15 = var1;// 3019
            break;// 3377
         case 19:
         case 20:
         case 21:
            var2++;
            var11 = var10 & 0xFF000000;// 2786
            var15 = var1;// 2632
            break;// 3039
         case 64:
         case 65:
            var11 = var10 & 0xFF000000;// 2814
            var3 = var2 + 3;// 2905
            int var4 = this.method1399(var2 + 1);// 3272
            var1.field2442 = new Class483[var4];// 2649
            var1.field2438 = new Class483[var4];// 3335
            int var16 = 0;
            var1.field2439 = new int[var4];// 3120

            for (int var5 = 0; var16 < var4; var16 = var5) {// 2961
               int var6 = var12.method1399(var3);// 2900
               int var7 = var12.method1399(var3 + 2);// 2641
               int var10001 = var3;// 3285
               var3 += 6;// 2768
               int var8 = var12.method1399(var10001 + 4);
               var1.field2442[var5] = var12.method1383(var6, var1.field2434);// 3004 3036
               var1.field2438[var5] = var12.method1383(var6 + var7, var1.field2434);// 2844 3360
               var1.field2439[var5++] = var8;// 3532
            }

            var15 = var1;// 2997
            break;
         case 67:
         case 68:
         case 69:
         case 70:
            var3 = var2 + 3;
            var11 = var10 & 0xFF000000;// 3549
            var15 = var1;// 3283
            break;// 3187
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
            var3 = var2 + 4;
            var11 = var10 & -16776961;// 3023
            var15 = var1;// 2794
      }

      var15.field2444 = var11;
      int var14;
      var1.field2435 = (var14 = var12.method1385(var3)) == 0 ? null : new Class573(var12.field1677, var3);// 2855 3029 3168
      return var3 + 1 + 2 * var14;// 3140
   }

   // $VF: synthetic method
   public String method1378(int var1, char[] var2) {
      return this.method1382(var1, var2);// 3611
   }

   // $VF: synthetic method
   public int method1379() {
      return this.field1681;// 3844
   }

   // $VF: synthetic method
   public int method1380(Class343 var1, Class602 var2, int var3) {
      Class508 var5 = this;
      char[] var4 = var2.field2440;// 1336
      var2.field2446 = this.method1399(var3);// 1109 1543
      var2.field2443 = this.method1405(var3 + 2, var4);// 1021
      int var10002 = var3 + 4;
      int var25 = var3 + 6;// 1307
      var2.field2437 = this.method1405(var10002, var4);// 1120
      int var6 = 0;// 1020
      int var7 = 0;// 1207
      String[] var8 = null;// 1127
      boolean var9 = false;// 1390
      int var10 = 0;// 1277
      int var11 = 0;// 1295
      int var12 = 0;// 1114
      int var13 = 0;// 1629
      int var14 = 0;// 1046
      int var15 = 0;// 1425
      int var16 = 0;// 1424
      int var17 = 0;// 1264
      int var18 = 0;// 1179
      Class534 var19 = null;// 1498
      int var26 = var25 + 2;// 1592
      int var20 = this.method1399(var25);// 1151
      int var10000 = var20;// 1214

      while (true) {
         var20--;
         if (var10000 <= 0) {
            String var10004;
            String[] var10005;
            if (var10 == 0) {// 1631
               var10004 = null;
               var10005 = var8;
            } else {
               var10004 = var5.method1363(var10, var4);
               var10005 = var8;
            }

            Class513 var28;
            if ((var28 = var1.method628(var2.field2446, var2.field2443, var2.field2437, var10004, var10005)) == null) {// 1014 1597 1664
               return var26;// 1459
            }

            if (var28 instanceof Class514) {// 1036
               Class514 var29;
               Class514 var55 = var29 = (Class514)var28;// 1641
               Class508 var70;
               boolean var10003;
               if ((var2.field2446 & 131072) != 0) {
                  var10003 = true;
                  var70 = var5;
               } else {
                  var10003 = false;
                  var70 = var5;
               }

               if (var55.method1452(var5, var9, var10003, var70.method1399(var3 + 4), var10, var7)) {// 1342 1495
                  var29.method1449(var3, var26 - var3);// 1290
                  return var26;// 1031
               }
            }

            if (var18 != 0 && (var2.field2448 & 2) == 0) {// 1083
               int var30 = var5.method1385(var18);// 1374
               int var37 = var18 + 1;// 1413
               var10000 = var30;// 1358

               while (true) {
                  var30--;
                  if (var10000 <= 0) {
                     break;
                  }

                  String var63 = var5.method1405(var37, var4);// 1427
                  int var69 = var37;
                  var37 += 4;
                  var28.method1435(var63, var5.method1399(var69 + 2));// 999 1461
                  var10000 = var30;// 1396
               }
            }

            if (var17 != 0) {// 1175
               Class353 var31 = var28.method1434();// 1345
               var5.method1402(var31, var17, null, var4);// 1176
               if (var31 != null) {// 1254
                  var31.method659();// 1347
               }
            }

            if (var11 != 0) {// 1464
               int var32 = var5.method1399(var11);// 1205
               int var38 = var11 + 2;// 1242
               var10000 = var32;// 1615

               while (true) {
                  var32--;
                  if (var10000 <= 0) {
                     break;
                  }

                  int var39 = var38 + 2;// 1445
                  String var48 = var5.method1405(var38, var4);// 1573
                  var38 = var5.method1389(var28.method1433(var48, true), var39, true, var4);// 1193 1323 1473
                  var10000 = var32;
               }
            }

            if (var12 != 0) {// 1096
               int var33 = var5.method1399(var12);// 1363
               int var40 = var12 + 2;// 1042
               var10000 = var33;// 1018

               while (true) {
                  var33--;
                  if (var10000 <= 0) {
                     break;
                  }

                  int var41 = var40 + 2;// 1447
                  String var49 = var5.method1405(var40, var4);// 1607
                  var40 = var5.method1389(var28.method1433(var49, false), var41, true, var4);// 1034 1353 1574
                  var10000 = var33;
               }
            }

            if (var15 != 0) {// 1622
               int var34 = var5.method1399(var15);// 1661
               int var42 = var15 + 2;// 1119
               var10000 = var34;// 1263

               while (true) {
                  var34--;
                  if (var10000 <= 0) {
                     break;
                  }

                  int var43;
                  var10002 = var43 = var5.method1377(var2, var42);// 1079
                  var42 = var43 + 2;// 1164
                  String var50 = var5.method1405(var10002, var4);// 1435
                  var42 = var5.method1389(var28.method1442(var2.field2444, var2.field2435, var50, true), var42, true, var4);// 1019 1369 1536
                  var10000 = var34;
               }
            }

            if (var16 != 0) {// 1370
               int var35 = var5.method1399(var16);// 1304
               int var45 = var16 + 2;// 1580
               var10000 = var35;// 1486

               while (true) {
                  var35--;
                  if (var10000 <= 0) {
                     break;
                  }

                  int var46;
                  var10002 = var46 = var5.method1377(var2, var45);// 1097
                  var45 = var46 + 2;// 1116
                  String var51 = var5.method1405(var10002, var4);// 1052
                  var45 = var5.method1389(var28.method1442(var2.field2444, var2.field2435, var51, false), var45, true, var4);// 1053 1468 1667
                  var10000 = var35;
               }
            }

            if (var13 != 0) {// 1194
               var5.method1366(var28, var2, var13, true);// 1045
            }

            if (var14 != 0) {// 1416
               var5.method1366(var28, var2, var14, false);// 1145
            }

            Class534 var61 = var19;// 1601

            while (var61 != null) {
               Class534 var36 = var19.field1800;// 1638
               var19.field1800 = null;// 1540
               var61 = var36;
               var28.method1431(var19);// 1063
               var19 = var36;// 1169
            }

            if (var6 != 0) {// 1476
               var28.method1421();
               var5.method1398(var28, var2, var6);// 1515
            }

            var28.method1418();// 1514
            return var26;// 1414
         }

         int var22;
         label178: {
            String var21 = var5.method1405(var26, var4);// 1124
            int var27 = var26 + 6;// 1608
            var22 = var5.method1391(var26 + 2);// 1070
            if ("Code".equals(var21)) {// 1335
               if ((var2.field2448 & 1) == 0) {// 1216
                  var6 = var27;// 1418
                  var10000 = var27;
                  break label178;
               }
            } else if ("Exceptions".equals(var21)) {// 1086
               var7 = var27;// 1090
               var8 = new String[var5.method1399(var27)];// 1516
               int var23 = var27 + 2;// 1531

               int var24;
               for (int var53 = var24 = 0; var53 < var8.length; var53 = ++var24) {// 1587
                  String var64 = var5.method1372(var23, var4);
                  var23 += 2;// 1556
                  var8[var24] = var64;// 1300
               }
            } else {
               if ("Signature".equals(var21)) {// 1340
                  var10 = var5.method1399(var27);// 1388
                  var10000 = var27;
                  break label178;
               }

               if ("Deprecated".equals(var21)) {// 1507
                  var10000 = var27;
                  var2.field2446 |= 131072;// 1352
                  break label178;
               }

               if ("RuntimeVisibleAnnotations".equals(var21)) {// 1117
                  var11 = var27;// 1499
                  var10000 = var27;
                  break label178;
               }

               if ("RuntimeVisibleTypeAnnotations".equals(var21)) {// 1651
                  var15 = var27;// 1628
                  var10000 = var27;
                  break label178;
               }

               if ("AnnotationDefault".equals(var21)) {// 1630
                  var17 = var27;// 1562
                  var10000 = var27;
                  break label178;
               }

               if ("Synthetic".equals(var21)) {// 1231
                  var9 = true;// 1404
                  var10000 = var27;
                  var2.field2446 |= 4096;// 1281
                  break label178;
               }

               if ("RuntimeInvisibleAnnotations".equals(var21)) {// 1313
                  var12 = var27;// 1011
                  var10000 = var27;
                  break label178;
               }

               if ("RuntimeInvisibleTypeAnnotations".equals(var21)) {// 1640
                  var16 = var27;// 1576
                  var10000 = var27;
                  break label178;
               }

               if ("RuntimeVisibleParameterAnnotations".equals(var21)) {// 1059
                  var13 = var27;// 1356
                  var10000 = var27;
                  break label178;
               }

               if ("RuntimeInvisibleParameterAnnotations".equals(var21)) {// 1348
                  var14 = var27;// 1271
                  var10000 = var27;
                  break label178;
               }

               if ("MethodParameters".equals(var21)) {// 1647
                  var18 = var27;// 1386
                  var10000 = var27;
                  break label178;
               }

               Class534 var54 = var5.method1392(var2.field2445, var21, var27, var22, var4, -1, null);// 1029 1458
               var54.field1800 = var19;// 1023
               var19 = var54;// 1099
            }

            var10000 = var27;// 1212
         }

         var26 = var10000 + var22;
         var10000 = var20;
      }
   }

   // $VF: synthetic method
   public Class508(byte[] var1, int var2, int var3) {
      this(var1, var2, true);// 540
   }// 291

   // $VF: synthetic method
   public void method1381(Class343 var1, Class534[] var2, int var3) {
      Class508 var30 = this;
      Class602 var4 = new Class602();// 202
      var4.field2445 = var2;
      var4.field2448 = var3;// 128
      var4.field2440 = new char[this.field1681];// 250 290
      char[] var5 = var4.field2440;// 538
      int var6 = this.field1683;// 92
      int var7 = this.method1399(this.field1683);// 176
      String var8 = this.method1372(var6 + 2, var5);// 171
      String var9 = this.method1372(var6 + 4, var5);// 124
      String[] var10000 = new String[this.method1399(var6 + 6)];// 568
      var6 += 8;// 152
      String[] var10 = var10000;

      int var11;
      for (int var71 = var11 = 0; var71 < var10.length; var71 = ++var11) {// 311
         String var10002 = var30.method1372(var6, var5);
         var6 += 2;// 407
         var10[var11] = var10002;// 98
      }

      var11 = 0;// 518
      int var12 = 0;// 381
      String var13 = null;// 380
      String var14 = null;// 180
      String var15 = null;// 350
      int var16 = 0;// 3
      int var17 = 0;// 186
      int var18 = 0;// 276
      int var19 = 0;// 414
      int var20 = 0;// 319
      int var21 = 0;// 462
      String var22 = null;// 452
      String var23 = null;// 595
      int var24 = 0;// 594
      int var25 = 0;// 388
      int var26 = 0;// 487
      Class534 var27 = null;// 298

      int var28;
      int var29;
      for (int var72 = var29 = var30.method1399((var28 = var30.method1362()) - 2); var72 > 0; var72 = var29) {// 439 529
         String var33 = var30.method1405(var28, var5);// 569
         int var54 = var28 + 6;// 425
         int var31 = var30.method1391(var28 + 2);// 445
         int var73;
         if ("SourceFile".equals(var33)) {// 383
            var14 = var30.method1405(var54, var5);// 197
            var73 = var54;
         } else if ("InnerClasses".equals(var33)) {// 140
            var11 = var54;// 451
            var73 = var54;
         } else if ("EnclosingMethod".equals(var33)) {// 49
            var12 = var54;// 565
            var73 = var54;
         } else if ("NestHost".equals(var33)) {// 173
            var23 = var30.method1372(var54, var5);// 448
            var73 = var54;
         } else if ("NestMembers".equals(var33)) {// 101
            var24 = var54;// 489
            var73 = var54;
         } else if ("PermittedSubclasses".equals(var33)) {// 562
            var25 = var54;// 244
            var73 = var54;
         } else if ("Signature".equals(var33)) {// 247
            var13 = var30.method1405(var54, var5);// 259
            var73 = var54;
         } else if ("RuntimeVisibleAnnotations".equals(var33)) {// 194
            var16 = var54;// 397
            var73 = var54;
         } else if ("RuntimeVisibleTypeAnnotations".equals(var33)) {// 163
            var18 = var54;// 9
            var73 = var54;
         } else if ("Deprecated".equals(var33)) {// 243
            var7 |= 131072;// 566
            var73 = var54;
         } else if ("Synthetic".equals(var33)) {// 531
            var7 |= 4096;// 229
            var73 = var54;
         } else if ("SourceDebugExtension".equals(var33)) {// 104
            if (var31 > var30.field1677.length - var54) {// 590
               throw new IllegalArgumentException();// 309
            }

            var15 = var30.method1364(var54, var31, new char[var31]);// 344 442
            var73 = var54;
         } else if ("RuntimeInvisibleAnnotations".equals(var33)) {// 345
            var17 = var54;// 449
            var73 = var54;
         } else if ("RuntimeInvisibleTypeAnnotations".equals(var33)) {// 37
            var19 = var54;// 217
            var73 = var54;
         } else if ("Record".equals(var33)) {// 378
            var26 = var54;// 195
            var7 |= 65536;// 490
            var73 = var54;
         } else if ("Module".equals(var33)) {// 577
            var20 = var54;// 481
            var73 = var54;
         } else if ("ModuleMainClass".equals(var33)) {// 351
            var22 = var30.method1372(var54, var5);// 75
            var73 = var54;
         } else if ("ModulePackages".equals(var33)) {// 372
            var21 = var54;// 111
            var73 = var54;
         } else {
            if (!"BootstrapMethods".equals(var33)) {// 587
               Class534 var74 = var30.method1392(var2, var33, var54, var31, var5, -1, null);// 153 477
               var74.field1800 = var27;// 230
               var27 = var74;// 402
            }

            var73 = var54;// 112
         }

         var29--;
         var28 = var73 + var31;
      }

      var1.method617(var30.method1391(var30.field1676[1] - 7), var7, var8, var13, var9, var10);// 54 322
      if ((var3 & 2) == 0 && (var14 != null || var15 != null)) {// 241
         var1.method638(var14, var15);// 136
      }

      if (var20 != 0) {// 342
         var30.method1397(var1, var4, var20, var21, var22);// 435
      }

      if (var23 != null) {// 313
         var1.method640(var23);// 277
      }

      if (var12 != 0) {// 203
         String var55 = var30.method1372(var12, var5);// 70
         int var34;
         String var66 = (var34 = var30.method1399(var12 + 2)) == 0 ? null : var30.method1405(var30.field1676[var34], var5);// 118 597
         String var32 = var34 == 0 ? null : var30.method1405(var30.field1676[var34] + 2, var5);// 379
         var1.method616(var55, var66, var32);// 353
      }

      if (var16 != 0) {// 79
         var29 = var30.method1399(var16);// 500
         int var35 = var16 + 2;// 396
         int var75 = var29;// 364

         while (true) {
            var29--;
            if (var75 <= 0) {
               break;
            }

            int var36 = var35 + 2;// 752
            String var67 = var30.method1405(var35, var5);// 861
            var35 = var30.method1389(var1.method635(var67, true), var36, true, var5);// 605 712 958
            var75 = var29;
         }
      }

      if (var17 != 0) {// 821
         var29 = var30.method1399(var17);// 654
         int var37 = var17 + 2;// 609
         int var76 = var29;// 633

         while (true) {
            var29--;
            if (var76 <= 0) {
               break;
            }

            int var38 = var37 + 2;// 632
            String var68 = var30.method1405(var37, var5);// 892
            var37 = var30.method1389(var1.method635(var68, false), var38, true, var5);// 949 966 968
            var76 = var29;
         }
      }

      if (var18 != 0) {// 927
         var29 = var30.method1399(var18);// 833
         int var39 = var18 + 2;// 902
         int var77 = var29;// 608

         while (true) {
            var29--;
            if (var77 <= 0) {
               break;
            }

            int var40;
            int var92 = var40 = var30.method1377(var4, var39);// 960
            int var41 = var40 + 2;// 735
            String var69 = var30.method1405(var92, var5);// 914
            var39 = var30.method1389(var1.method624(var4.field2444, var4.field2435, var69, true), var41, true, var5);// 756 883 975
            var77 = var29;
         }
      }

      if (var19 != 0) {// 829
         var29 = var30.method1399(var19);// 734
         int var42 = var19 + 2;// 675
         int var78 = var29;// 665

         while (true) {
            var29--;
            if (var78 <= 0) {
               break;
            }

            int var43;
            int var93 = var43 = var30.method1377(var4, var42);// 835
            int var44 = var43 + 2;// 816
            String var70 = var30.method1405(var93, var5);// 682
            var42 = var30.method1389(var1.method624(var4.field2444, var4.field2435, var70, false), var44, true, var5);// 649 755 777
            var78 = var29;
         }
      }

      Class534 var79 = var27;// 771

      while (var79 != null) {
         Class534 var60 = var27.field1800;// 864
         var27.field1800 = null;// 647
         var79 = var60;
         var1.method627(var27);// 950
         var27 = var60;// 671
      }

      if (var24 != 0) {// 787
         var29 = var30.method1399(var24);// 796
         int var45 = var24 + 2;// 782
         int var80 = var29;// 870

         while (true) {
            var29--;
            if (var80 <= 0) {
               break;
            }

            int var94 = var45;
            var45 += 2;
            var1.method631(var30.method1372(var94, var5));// 929
            var80 = var29;// 676
         }
      }

      if (var25 != 0) {// 639
         var29 = var30.method1399(var25);// 805
         int var46 = var25 + 2;// 822
         int var81 = var29;// 627

         while (true) {
            var29--;
            if (var81 <= 0) {
               break;
            }

            int var95 = var46;
            var46 += 2;
            var1.method623(var30.method1372(var95, var5));// 959 976
            var81 = var29;// 843
         }
      }

      if (var11 != 0) {// 924
         var29 = var30.method1399(var11);// 730
         int var47 = var11 + 2;// 845
         int var82 = var29;// 625

         while (true) {
            var29--;
            if (var82 <= 0) {
               break;
            }

            String var86 = var30.method1372(var47, var5);// 802
            String var96 = var30.method1372(var47 + 2, var5);// 772
            String var10003 = var30.method1405(var47 + 4, var5);// 715
            int var10005 = var47;
            var47 += 8;
            var1.method619(var86, var96, var10003, var30.method1399(var10005 + 6));// 868 979
            var82 = var29;// 819
         }
      }

      if (var26 != 0) {// 828
         int var53 = var26 + 2;// 813
         var29 = var30.method1399(var26);// 896
         int var83 = var29;// 611

         while (true) {
            var29--;
            if (var83 <= 0) {
               break;
            }

            var53 = var30.method1386(var1, var4, var53);// 702
            var83 = var29;
         }
      }

      int var50 = var6 + 2;// 858
      var29 = var30.method1399(var6);// 824
      int var84 = var29;// 928

      while (true) {
         var29--;
         if (var84 <= 0) {
            var6 = var50 + 2;// 815
            int var48 = var30.method1399(var50);// 765
            int var85 = var48;// 650

            while (true) {
               var48--;
               if (var85 <= 0) {
                  var1.method646();// 891
                  return;// 673
               }

               var6 = var30.method1380(var1, var4, var6);// 747
               var85 = var48;
            }
         }

         var50 = var30.method1409(var1, var4, var50);// 630
         var84 = var29;
      }
   }

   // $VF: synthetic method
   public String method1382(int var1, char[] var2) {
      return this.method1405(this.field1676[this.method1399(var1)], var2);// 3901
   }

   // $VF: synthetic method
   public Class483 method1383(int var1, Class483[] var2) {
      Class483 var5 = this.method1387(var1, var2);// 3491
      var5.field1600 = (short)(var5.field1600 & -2);// 2645
      return var5;// 2609
   }

   // $VF: synthetic method
   public int[] method1384(int var1) {
      Class508 var2 = this;
      char[] var10 = new char[var1];// 3025

      int var4;
      for (int var10000 = var4 = this.method1399((var8 = this.method1362()) - 2); var10000 > 0; var10000 = var4) {// 2896 3062
         String var3 = var2.method1405(var8, var10);// 3506
         int var9 = var8 + 6;// 2987
         int var5 = var2.method1391(var8 + 2);// 2799
         if ("BootstrapMethods".equals(var3)) {// 2670
            int[] var11 = new int[var2.method1399(var9)];// 3503
            int var6 = var9 + 2;// 3453

            int var7;
            for (var10000 = var7 = 0; var10000 < var11.length; var10000 = var7) {// 3447
               var10000 = var11[var7] = var6;// 3080
               int var10002 = var2.method1399(var6 + 2) * 2;// 2606
               var7++;
               var6 = var10000 + 4 + var10002;// 2966
            }

            return var11;// 3365
         }

         var4--;
         var8 = var9 + var5;// 2615
      }

      throw new IllegalArgumentException();// 2857
   }

   // $VF: synthetic method
   public int method1385(int var1) {
      return this.field1677[var1] & 0xFF;// 3768
   }

   // $VF: synthetic method
   public int method1386(Class343 var1, Class602 var2, int var3) {
      Class508 var25 = this;
      char[] var4 = var2.field2440;// 877
      String var5 = this.method1405(var3, var4);// 716 810
      int var10002 = var3 + 2;// 945
      int var18 = var3 + 4;// 743
      String var6 = this.method1405(var10002, var4);
      String var7 = null;// 913
      int var8 = 0;// 713
      int var9 = 0;// 773
      int var10 = 0;// 935
      int var11 = 0;// 944
      Class534 var12 = null;// 770
      int var19 = var18 + 2;// 894
      int var13 = this.method1399(var18);// 731
      int var41 = var13;// 749

      while (true) {
         var13--;
         if (var41 <= 0) {
            Class455 var26;
            if ((var26 = var1.method643(var5, var6, var7)) == null) {// 640 778 792
               return var19;// 940
            } else {
               if (var8 != 0) {// 866
                  int var27 = var25.method1399(var8);// 895
                  int var16 = var8 + 2;// 790
                  var41 = var27;// 942

                  while (true) {
                     var27--;
                     if (var41 <= 0) {
                        break;
                     }

                     int var32 = var16 + 2;// 685
                     String var21 = var25.method1405(var16, var4);// 906
                     var16 = var25.method1389(var26.method974(var21, true), var32, true, var4);// 621 657 916
                     var41 = var27;
                  }
               }

               if (var9 != 0) {// 783
                  int var28 = var25.method1399(var9);// 786
                  int var33 = var9 + 2;// 934
                  var41 = var28;// 840

                  while (true) {
                     var28--;
                     if (var41 <= 0) {
                        break;
                     }

                     int var34 = var33 + 2;// 889
                     String var22 = var25.method1405(var33, var4);// 969
                     var33 = var25.method1389(var26.method974(var22, false), var34, true, var4);// 1199 1276 1292
                     var41 = var28;
                  }
               }

               if (var10 != 0) {// 1430
                  int var29 = var25.method1399(var10);// 1483
                  int var35 = var10 + 2;// 1170
                  var41 = var29;// 1558

                  while (true) {
                     var29--;
                     if (var41 <= 0) {
                        break;
                     }

                     int var36;
                     var10002 = var36 = var25.method1377(var2, var35);// 1196
                     var35 = var36 + 2;// 1274
                     String var23 = var25.method1405(var10002, var4);// 1429
                     var35 = var25.method1389(var26.method975(var2.field2444, var2.field2435, var23, true), var35, true, var4);// 1191 1375 1681
                     var41 = var29;
                  }
               }

               if (var11 != 0) {// 1366
                  int var30 = var25.method1399(var11);// 1500
                  int var38 = var11 + 2;// 1542
                  var41 = var30;// 1010

                  while (true) {
                     var30--;
                     if (var41 <= 0) {
                        break;
                     }

                     int var39;
                     var10002 = var39 = var25.method1377(var2, var38);// 1161
                     var38 = var39 + 2;// 1150
                     String var24 = var25.method1405(var10002, var4);// 1528
                     var38 = var25.method1389(var26.method975(var2.field2444, var2.field2435, var24, false), var38, true, var4);// 1050 1389 1676
                     var41 = var30;
                  }
               }

               Class534 var48 = var12;// 1623

               while (var48 != null) {
                  Class534 var31 = var12.field1800;// 1039
                  var12.field1800 = null;// 1298
                  var48 = var31;
                  var26.method972(var12);// 1058
                  var12 = var31;// 990
               }

               var26.method973();// 1570
               return var19;// 1288
            }
         }

         String var14 = var25.method1405(var19, var4);// 631
         int var20 = var19 + 6;// 703
         int var15 = var25.method1391(var19 + 2);// 862
         if ("Signature".equals(var14)) {// 848
            var7 = var25.method1405(var20, var4);// 660
            var41 = var20;
         } else if ("RuntimeVisibleAnnotations".equals(var14)) {// 668
            var8 = var20;// 977
            var41 = var20;
         } else if ("RuntimeVisibleTypeAnnotations".equals(var14)) {// 672
            var10 = var20;// 754
            var41 = var20;
         } else if ("RuntimeInvisibleAnnotations".equals(var14)) {// 637
            var9 = var20;// 932
            var41 = var20;
         } else if ("RuntimeInvisibleTypeAnnotations".equals(var14)) {// 961
            var11 = var20;// 642
            var41 = var20;
         } else {
            Class534 var43 = var25.method1392(var2.field2445, var14, var20, var15, var4, -1, null);// 628 659
            var43.field1800 = var12;// 737
            var12 = var43;// 710
            var41 = var20;// 767
         }

         var19 = var41 + var15;
         var41 = var13;
      }
   }

   // $VF: synthetic method
   public Class483 method1387(int var1, Class483[] var2) {
      if (var2[var1] == null) {// 3422
         var2[var1] = new Class483();// 3413
      }

      return var2[var1];// 2906
   }

   // $VF: synthetic method
   public int method1388() {
      return this.method1399(this.field1683);// 234
   }

   // $VF: synthetic method
   public int method1389(Class353 var1, int var2, boolean var3, char[] var4) {
      Class508 var8 = this;
      int var7 = var2 + 2;// 2824 2875
      int var5 = this.method1399(var2);// 3134
      if (var3) {// 3145
         int var10 = var5;// 3344

         while (true) {
            var5--;
            if (var10 <= 0) {
               break;
            }

            String var9 = var8.method1405(var7, var4);// 2598
            var7 = var8.method1402(var1, var7 + 2, var9, var4);// 2721 3060
            var10 = var5;
         }
      } else {
         int var11 = var5;// 3084

         while (true) {
            var5--;
            if (var11 <= 0) {
               break;
            }

            var7 = var8.method1402(var1, var7, null, var4);// 2771 3400
            var11 = var5;
         }
      }

      if (var1 != null) {// 3296
         var1.method659();// 2988
      }

      return var7;// 2924
   }

   // $VF: synthetic method
   public byte[] method1390(int var1, int var2) {
      byte[] var4 = new byte[var2];// 3645
      System.arraycopy(this.field1677, var1, var4, 0, var2);// 3846
      return var4;// 3593
   }

   // $VF: synthetic method
   public int method1391(int var1) {
      byte[] var3;
      return ((var3 = this.field1677)[var1] & 0xFF) << 24 | (var3[var1 + 1] & 0xFF) << 16 | (var3[var1 + 2] & 0xFF) << 8 | var3[var1 + 3] & 0xFF;// 3638 3889
   }

   // $VF: synthetic method
   public Class534 method1392(Class534[] var1, String var2, int var3, int var4, char[] var5, int var6, Class483[] var7) {
      Class534[] var12;
      int var8 = (var12 = var1).length;

      for (int var10000 = var11 = 0; var10000 < var8; var10000 = ++var11) {// 3011
         Class534 var10;
         if ((var10 = var12[var11]).field1801.equals(var2)) {// 3095
            return var10.method1603(this, var3, var4, var5, var6, var7);// 3094
         }
      }

      return new Class534(var2).method1603(this, var3, var4, null, -1, null);// 3016
   }

   // $VF: synthetic method
   public int method1393(int var1, Object[] var2, int var3, char[] var4, Class483[] var5) {
      int var11 = this.field1677[var1] & 255;// 2759 2877
      var1++;
      switch (var11) {// 3087
         case 0:
            while (false) {
            }

            var2[var3] = Class572.field2219;// 2950
            byte var20;
            return var20;// 2680
         case 1:
            var2[var3] = Class572.field2130;// 2788
            byte var19;
            return var19;// 3306
         case 2:
            var2[var3] = Class572.field2253;// 3219
            byte var18;
            return var18;// 3372
         case 3:
            var2[var3] = Class572.field2286;// 3190
            byte var17;
            return var17;// 2602
         case 4:
            var2[var3] = Class572.field2145;// 2816
            byte var16;
            return var16;// 3392
         case 5:
            var2[var3] = Class572.field2190;// 3050
            byte var15;
            return var15;// 3439
         case 6:
            var2[var3] = Class572.field2128;// 3251
            byte var14;
            return var14;// 2740
         case 7:
            byte var13;
            String var12 = this.method1372(var13, var4);
            int var9 = var13 + 2;
            var2[var3] = var12;// 2995
            return var9;// 2657 2884
         case 8:
            byte var6;
            Class483 var10002 = this.method1383(this.method1399(var6), var5);
            int var8 = var6 + 2;
            var2[var3] = var10002;// 2946
            return var8;// 3414 3479
         default:
            throw new IllegalArgumentException();// 2671
      }
   }

   // $VF: synthetic method
   public int method1394(int[] var1, int var2) {
      return var1 != null && var2 < var1.length && this.method1385(var1[var2]) >= 67 ? this.method1399(var1[var2] + 1) : -1;// 2842 2936 3311 3459
   }

   // $VF: synthetic method
   public static int method1395(InputStream var0) {
      int var2;
      return (var2 = var0.available()) < 256 ? 4096 : Math.min(var2, 1048576);// 35 233 256 384
   }

   // $VF: synthetic method
   public void method1396(Class343 var1, int var2) {
      this.method1381(var1, new Class534[0], var2);// 86
   }// 473

   // $VF: synthetic method
   public void method1397(Class343 var1, Class602 var2, int var3, int var4, String var5) {
      Class508 var19 = this;
      char[] var18 = var2.field2440;// 739
      String var6 = this.method1406(var3, var18);// 726 757
      int var7 = this.method1399(var3 + 2);// 720
      int var10001 = var3 + 4;// 653
      int var11 = var3 + 6;// 626
      String var8 = this.method1405(var10001, var18);
      Class450 var17;
      if ((var17 = var1.method641(var6, var7, var8)) != null) {// 643 775
         if (var5 != null) {// 683
            var17.method942(var5);// 918
         }

         if (var4 != 0) {// 915
            int var24 = this.method1399(var4);// 842
            int var29 = var4 + 2;// 779
            int var43 = var24;// 785

            while (true) {
               var24--;
               if (var43 <= 0) {
                  break;
               }

               int var10002 = var29;
               var29 += 2;
               var17.method945(var19.method1378(var10002, var18));// 946
               var43 = var24;// 745
            }
         }

         int var12 = var11 + 2;// 856
         int var25 = var19.method1399(var11);// 943
         int var44 = var25;// 830

         while (true) {
            var25--;
            if (var44 <= 0) {
               int var13 = var12 + 2;// 857
               int var31 = var19.method1399(var12);// 880
               var44 = var31;// 951

               while (true) {
                  var31--;
                  if (var44 <= 0) {
                     int var14 = var13 + 2;// 841
                     var4 = var19.method1399(var13);// 912
                     var44 = var4;// 729

                     while (true) {
                        var4--;
                        if (var44 <= 0) {
                           int var15 = var14 + 2;// 941
                           var7 = var19.method1399(var14);// 695
                           var44 = var7;// 662

                           while (true) {
                              var7--;
                              if (var44 <= 0) {
                                 int var16 = var15 + 2;// 803
                                 int var28 = var19.method1399(var15);// 879
                                 var44 = var28;// 620

                                 while (true) {
                                    var28--;
                                    if (var44 <= 0) {
                                       var17.method944();// 615
                                       return;// 798
                                    }

                                    var8 = var19.method1372(var16, var18);// 876
                                    var10001 = var16;// 964
                                    var16 += 4;// 886
                                    int var42 = var19.method1399(var10001 + 2);
                                    String[] var33 = new String[var42];// 704

                                    for (int var51 = var4 = 0; var51 < var42; var51 = ++var4) {// 887
                                       String var64 = var19.method1372(var16, var18);
                                       var16 += 2;// 748
                                       var33[var4] = var64;// 884
                                    }

                                    var17.method949(var8, var33);// 872
                                    var44 = var28;
                                 }
                              }

                              int var63 = var15;
                              var15 += 2;
                              var17.method941(var19.method1372(var63, var18));// 661
                              var44 = var7;// 617
                           }
                        }

                        String var36 = var19.method1378(var14, var18);// 797
                        int var27 = var19.method1399(var14 + 2);// 674
                        var10001 = var14;// 714
                        var14 += 6;// 761
                        int var39 = var19.method1399(var10001 + 4);
                        String[] var41 = null;// 965
                        if (var39 != 0) {// 646
                           var41 = new String[var39];// 795

                           for (int var48 = var32 = 0; var48 < var39; var48 = ++var32) {// 728
                              String var62 = var19.method1406(var14, var18);
                              var14 += 2;// 865
                              var41[var32] = var62;// 766
                           }
                        }

                        var17.method940(var36, var27, var41);// 614
                        var44 = var4;
                     }
                  }

                  String var21 = var19.method1378(var13, var18);// 963
                  var7 = var19.method1399(var13 + 2);// 707
                  var10001 = var13;// 794
                  var13 += 6;// 831
                  int var26 = var19.method1399(var10001 + 4);
                  String[] var38 = null;// 762
                  if (var26 != 0) {// 784
                     var38 = new String[var26];// 624

                     int var9;
                     for (int var46 = var9 = 0; var46 < var26; var46 = ++var9) {// 931
                        String var61 = var19.method1406(var13, var18);
                        var13 += 2;// 648
                        var38[var9] = var61;// 808
                     }
                  }

                  var17.method947(var21, var7, var38);// 651
                  var44 = var31;
               }
            }

            var6 = var19.method1406(var12, var18);// 769
            var4 = var19.method1399(var12 + 2);// 922
            var10001 = var12 + 4;// 718
            var12 += 6;
            String var34 = var19.method1405(var10001, var18);
            var44 = var25;// 971
            var17.method948(var6, var4, var34);// 711
         }
      }
   }// 724

   // $VF: synthetic method
   public void method1398(Class513 var1, Class602 var2, int var3) {
      Class508 var4 = this;
      byte[] var5 = this.field1677;// 1361
      char[] var6 = var2.field2440;// 1624
      int var7 = this.method1399(var3);// 1275 1619
      int var8 = this.method1399(var3 + 2);// 1635
      int var38 = var3 + 8;// 1140
      int var9 = this.method1391(var3 + 4);// 1446
      if (var9 > this.field1677.length - var38) {// 1065
         throw new IllegalArgumentException();// 1678
      } else {
         int var10 = var38;// 1189
         int var11 = var38 + var9;// 1398
         Class483[] var12 = var2.field2434 = new Class483[var9 + 1];// 1355

         label454:
         while (var38 < var11) {// 1184
            int var13 = var38 - var10;// 1122
            switch (var5[var38] & 0xFF) {// 1100 1125
               case 0:
               case 1:
               case 2:
               case 3:
               case 4:
               case 5:
               case 6:
               case 7:
               case 8:
               case 9:
               case 10:
               case 11:
               case 12:
               case 13:
               case 14:
               case 15:
               case 26:
               case 27:
               case 28:
               case 29:
               case 30:
               case 31:
               case 32:
               case 33:
               case 34:
               case 35:
               case 36:
               case 37:
               case 38:
               case 39:
               case 40:
               case 41:
               case 42:
               case 43:
               case 44:
               case 45:
               case 46:
               case 47:
               case 48:
               case 49:
               case 50:
               case 51:
               case 52:
               case 53:
               case 59:
               case 60:
               case 61:
               case 62:
               case 63:
               case 64:
               case 65:
               case 66:
               case 67:
               case 68:
               case 69:
               case 70:
               case 71:
               case 72:
               case 73:
               case 74:
               case 75:
               case 76:
               case 77:
               case 78:
               case 79:
               case 80:
               case 81:
               case 82:
               case 83:
               case 84:
               case 85:
               case 86:
               case 87:
               case 88:
               case 89:
               case 90:
               case 91:
               case 92:
               case 93:
               case 94:
               case 95:
               case 96:
               case 97:
               case 98:
               case 99:
               case 100:
               case 101:
               case 102:
               case 103:
               case 104:
               case 105:
               case 106:
               case 107:
               case 108:
               case 109:
               case 110:
               case 111:
               case 112:
               case 113:
               case 114:
               case 115:
               case 116:
               case 117:
               case 118:
               case 119:
               case 120:
               case 121:
               case 122:
               case 123:
               case 124:
               case 125:
               case 126:
               case 127:
               case 128:
               case 129:
               case 130:
               case 131:
               case 133:
               case 134:
               case 135:
               case 136:
               case 137:
               case 138:
               case 139:
               case 140:
               case 141:
               case 142:
               case 143:
               case 144:
               case 145:
               case 146:
               case 147:
               case 148:
               case 149:
               case 150:
               case 151:
               case 152:
               case 172:
               case 173:
               case 174:
               case 175:
               case 176:
               case 177:
               case 190:
               case 191:
               case 194:
               case 195:
                  var38++;// 1824

                  while (false) {
                  }
                  break;
               case 16:
               case 18:
               case 21:
               case 22:
               case 23:
               case 24:
               case 25:
               case 54:
               case 55:
               case 56:
               case 57:
               case 58:
               case 169:
               case 188:
                  var38 += 2;// 1937
                  break;// 1717
               case 17:
               case 19:
               case 20:
               case 132:
               case 178:
               case 179:
               case 180:
               case 181:
               case 182:
               case 183:
               case 184:
               case 187:
               case 189:
               case 192:
               case 193:
                  var38 += 3;// 1868
                  break;// 1779
               case 153:
               case 154:
               case 155:
               case 156:
               case 157:
               case 158:
               case 159:
               case 160:
               case 161:
               case 162:
               case 163:
               case 164:
               case 165:
               case 166:
               case 167:
               case 168:
               case 198:
               case 199:
                  short var167 = var4.method1374(var38 + 1);
                  var38 += 3;
                  var4.method1383(var13 + var167, var12);// 1785
                  break;// 1786
               case 170:
                  int var40 = var38 + (4 - (var13 & 3));// 1798
                  var4.method1383(var13 + var4.method1391(var40), var12);// 1965
                  int var10001 = var4.method1391(var40 + 8) - var4.method1391(var40 + 4);// 1756
                  var38 = var40 + 12;
                  int var15 = var10001 + 1;
                  int var130 = var15;// 1787

                  while (true) {
                     var15--;
                     if (var130 <= 0) {
                        continue label454;
                     }

                     int var166 = var4.method1391(var38);
                     var38 += 4;
                     var4.method1383(var13 + var166, var12);// 1888
                     var130 = var15;// 1857
                  }
               case 171:
                  int var39 = var38 + (4 - (var13 & 3));// 1969
                  var4.method1383(var13 + var4.method1391(var39), var12);// 1692
                  var38 = var39 + 8;
                  int var16 = var4.method1391(var39 + 4);// 1799
                  int var10000 = var16;// 1705

                  while (true) {
                     var16--;
                     if (var10000 <= 0) {
                        continue label454;
                     }

                     int var165 = var4.method1391(var38 + 4);
                     var38 += 8;
                     var4.method1383(var13 + var165, var12);// 1742
                     var10000 = var16;// 1849
                  }
               case 185:
               case 186:
                  var38 += 5;// 1725
                  break;// 1722
               case 196:
                  switch (var5[var38 + 1] & 0xFF) {// 1733
                     case 21:
                     case 22:
                     case 23:
                     case 24:
                     case 25:
                     case 54:
                     case 55:
                     case 56:
                     case 57:
                     case 58:
                     case 169:
                        var38 += 4;// 1839

                        while (true) {
                           if (true) {
                              continue label454;
                           }
                        }
                     case 132:
                        var38 += 6;// 1832
                        continue;// 1882
                     default:
                        throw new IllegalArgumentException();// 1767
                  }
               case 197:
                  var38 += 4;// 1912
                  break;// 1704
               case 200:
               case 201:
               case 220:
                  int var163 = var4.method1391(var38 + 1);
                  var38 += 5;
                  var4.method1383(var13 + var163, var12);// 1815
                  break;// 1774
               case 202:
               case 203:
               case 204:
               case 205:
               case 206:
               case 207:
               case 208:
               case 209:
               case 210:
               case 211:
               case 212:
               case 213:
               case 214:
               case 215:
               case 216:
               case 217:
               case 218:
               case 219:
                  int var10002 = var4.method1399(var38 + 1);
                  var38 += 3;
                  var4.method1383(var13 + var10002, var12);// 1754
                  break;// 1791
               default:
                  throw new IllegalArgumentException();// 1766
            }
         }

         int var41 = var38 + 2;// 1686
         int var54 = var4.method1399(var38);// 1833
         int var131 = var54;// 1726

         while (true) {
            var54--;
            if (var131 <= 0) {
               int var56 = 0;// 1809
               int var58 = 0;// 1702
               boolean var60 = true;// 1826
               int var61 = 0;// 1897
               var54 = 0;// 1865
               int[] var18 = null;// 1684
               int[] var19 = null;// 1805
               Class534 var20 = null;// 1952
               int var42 = var41 + 2;// 1861
               int var21 = var4.method1399(var41);// 1758
               var131 = var21;// 1752

               while (true) {
                  var21--;
                  if (var131 <= 0) {
                     boolean var67 = (var2.field2448 & 8) != 0;// 2141
                     if (var56 != 0) {// 2045
                        var2.field2432 = -1;
                        var2.field2447 = 0;// 2057
                        var2.field2430 = 0;// 2326
                        var2.field2431 = 0;// 2078
                        var2.field2433 = new Object[var8];// 2020 2100
                        var2.field2441 = 0;
                        var2.field2436 = new Object[var7];// 2214 2285
                        if (var67) {// 2207
                           var4.method1400(var2);// 2219
                        }

                        int var68;
                        for (int var137 = var68 = var56; var137 < var58 - 2; var137 = ++var68) {// 2238
                           int var71;
                           if (var5[var68] == 8 && (var71 = var4.method1399(var68 + 1)) >= 0 && var71 < var9 && (var5[var10 + var71] & 255) == 187) {// 2088 2159 2220
                              var4.method1383(var71, var12);// 2021
                           }
                        }
                     }

                     if (var67 && (var2.field2448 & 256) != 0) {// 2175
                        var1.method1416(-1, var8, null, 0, null);// 2371
                     }

                     int var69 = 0;// 2153
                     int var72 = var4.method1394(var18, 0);// 2293
                     int var74 = 0;// 2283
                     int var76 = var4.method1394(var19, 0);// 2065 2067 2274
                     boolean var78 = false;// 2098
                     var3 = (var2.field2448 & 256) == 0 ? 33 : 0;// 2334
                     int var44 = var10;// 2205

                     while (var44 < var11) {// 2348
                        var21 = var44 - var10;// 2275
                        var4.method1368(var21);// 2306
                        Class483 var28;
                        if ((var28 = var12[var21]) != null) {// 1981 2125
                           var28.method1290(var1, (var2.field2448 & 2) == 0);// 2362
                        }

                        for (int var138 = var56;// 2358
                           var138 != 0 && (var2.field2432 == var21 || var2.field2432 == -1);
                           var138 = var56 < var58 ? (var56 = var4.method1410(var56, var60, var67, var2)) : (var56 = 0)// 1990 2215 2298 2360
                        ) {
                           if (var2.field2432 != -1) {// 2232
                              if (var60 && !var67) {// 2182
                                 var1.method1416(var2.field2447, var2.field2431, var2.field2433, var2.field2441, var2.field2436);// 2357
                              } else {
                                 var1.method1416(-1, var2.field2430, var2.field2433, var2.field2441, var2.field2436);// 2140
                              }

                              var78 = false;// 1980
                           }
                        }

                        if (var78) {// 2079
                           if ((var2.field2448 & 8) != 0) {// 2071
                              var1.method1416(256, 0, null, 0, null);// 2221
                           }

                           var78 = false;// 1994
                        }

                        int var29;
                        int[] var139;
                        switch (var29 = var5[var44] & 0xFF) {// 2260 2270
                           case 0:
                           case 1:
                           case 2:
                           case 3:
                           case 4:
                           case 5:
                           case 6:
                           case 7:
                           case 8:
                           case 9:
                           case 10:
                           case 11:
                           case 12:
                           case 13:
                           case 14:
                           case 15:
                           case 46:
                           case 47:
                           case 48:
                           case 49:
                           case 50:
                           case 51:
                           case 52:
                           case 53:
                           case 79:
                           case 80:
                           case 81:
                           case 82:
                           case 83:
                           case 84:
                           case 85:
                           case 86:
                           case 87:
                           case 88:
                           case 89:
                           case 90:
                           case 91:
                           case 92:
                           case 93:
                           case 94:
                           case 95:
                           case 96:
                           case 97:
                           case 98:
                           case 99:
                           case 100:
                           case 101:
                           case 102:
                           case 103:
                           case 104:
                           case 105:
                           case 106:
                           case 107:
                           case 108:
                           case 109:
                           case 110:
                           case 111:
                           case 112:
                           case 113:
                           case 114:
                           case 115:
                           case 116:
                           case 117:
                           case 118:
                           case 119:
                           case 120:
                           case 121:
                           case 122:
                           case 123:
                           case 124:
                           case 125:
                           case 126:
                           case 127:
                           case 128:
                           case 129:
                           case 130:
                           case 131:
                           case 133:
                           case 134:
                           case 135:
                           case 136:
                           case 137:
                           case 138:
                           case 139:
                           case 140:
                           case 141:
                           case 142:
                           case 143:
                           case 144:
                           case 145:
                           case 146:
                           case 147:
                           case 148:
                           case 149:
                           case 150:
                           case 151:
                           case 152:
                           case 172:
                           case 173:
                           case 174:
                           case 175:
                           case 176:
                           case 177:
                           case 190:
                           case 191:
                           case 194:
                           case 195:
                              while (false) {
                              }

                              var44++;
                              var1.method1427(var29);// 1989
                              var139 = var18;// 2280
                              break;// 2309
                           case 16:
                           case 188:
                              int var191 = var44 + 1;
                              var44 += 2;
                              var1.method1419(var29, var5[var191]);// 2560
                              var139 = var18;// 2539
                              break;// 2419
                           case 17:
                              int var190 = var44;
                              var44 += 3;
                              var1.method1419(var29, var4.method1374(var190 + 1));// 2402
                              var139 = var18;// 2590
                              break;// 2521
                           case 18:
                              int var179 = var5[var44 + 1] & 255;
                              var44 += 2;
                              var1.method1414(var4.method1365(var179, var6));// 2422
                              var139 = var18;// 2425
                              break;// 2447
                           case 19:
                           case 20:
                              int var178 = var4.method1399(var44 + 1);
                              var44 += 3;
                              var1.method1414(var4.method1365(var178, var6));// 2440
                              var139 = var18;// 2575
                              break;// 2505
                           case 21:
                           case 22:
                           case 23:
                           case 24:
                           case 25:
                           case 54:
                           case 55:
                           case 56:
                           case 57:
                           case 58:
                           case 169:
                              byte var177 = var5[var44 + 1];
                              var44 += 2;
                              var1.method1422(var29, var177 & 255);// 2492
                              var139 = var18;// 2583
                              break;// 2460
                           case 26:
                           case 27:
                           case 28:
                           case 29:
                           case 30:
                           case 31:
                           case 32:
                           case 33:
                           case 34:
                           case 35:
                           case 36:
                           case 37:
                           case 38:
                           case 39:
                           case 40:
                           case 41:
                           case 42:
                           case 43:
                           case 44:
                           case 45:
                              var29 -= 26;// 2337
                              var139 = var18;
                              int var176 = 21 + (var29 >> 2);
                              var44++;// 2074
                              var1.method1422(var176, var29 & 3);// 2227
                              break;// 2029
                           case 59:
                           case 60:
                           case 61:
                           case 62:
                           case 63:
                           case 64:
                           case 65:
                           case 66:
                           case 67:
                           case 68:
                           case 69:
                           case 70:
                           case 71:
                           case 72:
                           case 73:
                           case 74:
                           case 75:
                           case 76:
                           case 77:
                           case 78:
                              var29 -= 59;// 2164
                              var139 = var18;
                              int var175 = 54 + (var29 >> 2);
                              var44++;// 2033
                              var1.method1422(var175, var29 & 3);// 2355
                              break;// 2206
                           case 132:
                              int var161 = var5[var44 + 1] & 255;
                              int var189 = var44 + 2;
                              var44 += 3;
                              var1.method1423(var161, var5[var189]);// 2478
                              var139 = var18;// 2534
                              break;// 2457
                           case 153:
                           case 154:
                           case 155:
                           case 156:
                           case 157:
                           case 158:
                           case 159:
                           case 160:
                           case 161:
                           case 162:
                           case 163:
                           case 164:
                           case 165:
                           case 166:
                           case 167:
                           case 168:
                           case 198:
                           case 199:
                              int var188 = var21 + var4.method1374(var44 + 1);// 2230
                              var44 += 3;
                              var1.method1428(var29, var12[var188]);// 2122
                              var139 = var18;// 2170
                              break;// 2279
                           case 170:
                              int var46 = var44 + (4 - (var21 & 3));// 2093
                              Class483 var96 = var12[var21 + var4.method1391(var46)];// 2241
                              int var107 = var4.method1391(var46 + 4);// 2151
                              var44 = var46 + 12;// 2155
                              int var115 = var4.method1391(var46 + 8);// 2042
                              Class483[] var121 = new Class483[var115 - var107 + 1];// 2254

                              int var126;
                              for (int var144 = var126 = 0; var144 < var121.length; var144 = ++var126) {// 2162
                                 Class483 var174 = var12[var21 + var4.method1391(var44)];
                                 var44 += 4;// 2401
                                 var121[var126] = var174;// 2519
                              }

                              var1.method1415(var107, var115, var96, var121);// 2476
                              var139 = var18;
                              break;// 2376
                           case 171:
                              int var45 = var44 + (4 - (var21 & 3));// 2375
                              Class483 var95 = var12[var21 + var4.method1391(var45)];// 2537
                              var44 = var45 + 8;// 2399
                              int var106 = var4.method1391(var45 + 4);// 2374
                              int[] var114 = new int[var106];// 2436
                              Class483[] var120 = new Class483[var106];// 2423

                              int var125;
                              for (int var143 = var125 = 0; var143 < var106; var143 = ++var125) {// 2429
                                 var114[var125] = var4.method1391(var44);// 2405
                                 Class483 var173 = var12[var21 + var4.method1391(var44 + 4)];// 2572
                                 var44 += 8;// 2540
                                 var120[var125] = var173;
                              }

                              var1.method1413(var95, var114, var120);// 2414
                              var139 = var18;
                              break;// 2511
                           case 178:
                           case 179:
                           case 180:
                           case 181:
                           case 182:
                           case 183:
                           case 184:
                           case 185:
                              int var94 = var4.field1676[var4.method1399(var44 + 1)];// 2394
                              int var105 = var4.field1676[var4.method1399(var94 + 2)];// 2541
                              String var113 = var4.method1372(var94, var6);// 2379
                              String var119 = var4.method1405(var105, var6);// 2395
                              String var124 = var4.method1405(var105 + 2, var6);// 2520
                              if (var29 < 182) {// 2449
                                 var131 = var29;
                                 var1.method1444(var29, var113, var119, var124);// 2424
                              } else {
                                 boolean var128 = var5[var94 - 1] == 11;// 2451
                                 var131 = var29;
                                 var1.method1429(var29, var113, var119, var124, var128);// 2413
                              }

                              if (var131 == 185) {// 2372
                                 var139 = var18;// 2387
                                 var44 += 5;
                              } else {
                                 var44 += 3;// 2461
                                 var139 = var18;
                              }
                              break;
                           case 186:
                              int var93 = var4.field1676[var4.method1399(var44 + 1)];// 2489 2551
                              int var104;
                              String var32 = var4.method1405(var104 = var4.field1676[var4.method1399(var93 + 2)], var6);// 2443 2524
                              String var33 = var4.method1405(var104 + 2, var6);// 2462
                              int var34;
                              Class563 var35 = (Class563)var4.method1365(var4.method1399(var34 = var4.field1686[var4.method1399(var93)]), var6);// 2508 2564
                              Object[] var140 = new Object[var4.method1399(var34 + 2)];// 2396 2533
                              var34 += 4;// 2568
                              Object[] var36 = var140;

                              int var37;
                              for (int var141 = var37 = 0; var141 < var36.length; var141 = ++var37) {// 2573
                                 Object var172 = var4.method1365(var4.method1399(var34), var6);// 2468
                                 var34 += 2;// 2437
                                 var36[var37] = var172;// 2496
                              }

                              var44 += 5;
                              var1.method1432(var32, var33, var35, var36);// 2501
                              var139 = var18;// 2439
                              break;// 2542
                           case 187:
                           case 189:
                           case 192:
                           case 193:
                              int var187 = var44 + 1;
                              var44 += 3;
                              var1.method1411(var29, var4.method1372(var187, var6));// 2578
                              var139 = var18;// 2388
                              break;// 2565
                           case 196:
                              if ((var29 = var5[var44 + 1] & 255) == 132) {// 2237 2317
                                 var139 = var18;
                                 int var171 = var4.method1399(var44 + 2);// 1976
                                 int var10004 = var44;
                                 var44 += 6;
                                 var1.method1423(var171, var4.method1374(var10004 + 4));// 2166
                              } else {
                                 int var186 = var44;
                                 var44 += 4;
                                 var1.method1422(var29, var4.method1399(var186 + 2));// 2269
                                 var139 = var18;// 2297
                              }
                              break;
                           case 197:
                              String var158 = var4.method1372(var44 + 1, var6);// 2428
                              byte var170 = var5[var44 + 3];
                              var44 += 4;
                              var1.method1420(var158, var170 & 255);// 2407
                              var139 = var18;// 2479
                              break;// 2477
                           case 200:
                           case 201:
                              int var157 = var29 - var3;
                              int var10003 = var21 + var4.method1391(var44 + 1);// 2341
                              var44 += 5;
                              var1.method1428(var157, var12[var10003]);// 2051
                              var139 = var18;// 2069
                              break;// 2043
                           case 202:
                           case 203:
                           case 204:
                           case 205:
                           case 206:
                           case 207:
                           case 208:
                           case 209:
                           case 210:
                           case 211:
                           case 212:
                           case 213:
                           case 214:
                           case 215:
                           case 216:
                           case 217:
                           case 218:
                           case 219:
                              var29 = var29 < 218 ? var29 - 49 : var29 - 20;// 2068 2118 2228
                              Class483 var30 = var12[var21 + var4.method1399(var44 + 1)];// 2104
                              if (var29 != 167 && var29 != 168) {// 2085
                                 var29 = var29 < 167 ? (var29 + 1 ^ 1) - 1 : var29 ^ 1;// 2364
                                 Class483 var31 = var4.method1383(var21 + 3, var12);// 2365
                                 var1.method1428(var29, var31);
                                 var1.method1428(200, var30);// 2247 2288
                                 var78 = true;// 2184
                              } else {
                                 var1.method1428(var29 + 33, var30);// 2323
                              }

                              var44 += 3;// 2185
                              var139 = var18;
                              break;// 2196
                           case 220:
                              Class483 var169 = var12[var21 + var4.method1391(var44 + 1)];// 2248
                              var44 += 5;
                              var1.method1428(200, var169);// 2025
                              var78 = true;// 2152
                              var139 = var18;// 2040
                              break;// 2276
                           default:
                              throw new AssertionError();// 2576
                        }

                        while (var139 != null && var69 < var18.length && var72 <= var21) {// 2389
                           if (var72 == var21) {// 2453
                              int var97;
                              int var180 = var97 = var4.method1377(var2, var18[var69]);// 2464 2475
                              var97 += 2;// 2493
                              String var108 = var4.method1405(var180, var6);// 2444
                              var4.method1389(var1.method1440(var2.field2444, var2.field2435, var108, true), var97, true, var6);// 2417 2553
                           }

                           var72 = var4.method1394(var18, ++var69);// 2438 2513
                           var139 = var18;
                        }

                        for (int[] var145 = var19; var145 != null && var74 < var19.length && var76 <= var21; var145 = var19) {// 2446
                           if (var76 == var21) {// 2530
                              int var99;
                              int var181 = var99 = var4.method1377(var2, var19[var74]);// 2420 2494
                              var99 += 2;// 2557
                              String var109 = var4.method1405(var181, var6);// 2556
                              var4.method1389(var1.method1440(var2.field2444, var2.field2435, var109, false), var99, true, var6);// 2467 2552
                           }

                           var76 = var4.method1394(var19, ++var74);// 2393 2497
                        }
                     }

                     if (var12[var9] != null) {// 2528
                        var1.method1424(var12[var9]);// 2427
                     }

                     if (var61 != 0 && (var2.field2448 & 2) == 0) {// 2563
                        int[] var63 = null;// 2466
                        if (var54 != 0) {// 2558
                           var63 = new int[var4.method1399(var54) * 3];// 2385
                           int var47 = var54 + 2;// 2471

                           int var79;
                           for (int var146 = var79 = var63.length; var146 > 0; var146 = var79) {// 2474 2480 2495
                              int var192 = --var79;
                              int var194 = var47 + 6;
                              var79--;
                              var63[var192] = var194;// 2538
                              int var182 = var79;// 2536
                              var192 = var4.method1399(var47 + 8);
                              var79--;
                              var63[var182] = var192;
                              var182 = var4.method1399(var47);
                              var47 += 10;
                              var63[var79] = var182;// 2570
                           }
                        }

                        int var82 = var4.method1399(var61);// 2430
                        int var48 = var61 + 2;// 2529
                        var131 = var82;// 2484

                        while (true) {
                           var82--;
                           if (var131 <= 0) {
                              break;
                           }

                           int var90;
                           int var101;
                           String var110;
                           String var116;
                           int var122;
                           String var127;
                           label300: {
                              var90 = var4.method1399(var48);// 2458
                              var101 = var4.method1399(var48 + 2);// 2432
                              var110 = var4.method1405(var48 + 4, var6);// 2454
                              var116 = var4.method1405(var48 + 6, var6);// 2555
                              int var162 = var48;// 2532
                              var48 += 10;// 2398
                              var122 = var4.method1399(var162 + 8);
                              var127 = null;// 2554
                              byte var129;
                              if (var63 != null) {// 2589
                                 for (byte var148 = var129 = 0; var148 < var63.length; var148 = var129) {
                                    if (var63[var129] == var90 && var63[var129 + 1] == var122) {// 2566
                                       var127 = var4.method1405(var63[var129 + 2], var6);// 2510
                                       var149 = var1;
                                       break label300;// 2543
                                    }

                                    var129 += 3;// 2450
                                 }
                              }

                              var149 = var1;// 2790
                           }

                           var149.method1438(var110, var116, var127, var12[var90], var12[var90 + var101], var122);
                           var131 = var82;
                        }
                     }

                     if (var18 != null) {// 3258
                        int[] var64 = var18;
                        int var83 = var18.length;

                        int var91;
                        for (int var150 = var91 = 0; var150 < var83; var150 = ++var91) {// 2660
                           int var102;
                           int var111;
                           if ((var111 = var4.method1385(var102 = var64[var91])) == 64 || var111 == 65) {// 2852 3242
                              int var49;
                              int var184 = var49 = var4.method1377(var2, var102);// 3234
                              int var50 = var49 + 2;// 3528
                              String var117 = var4.method1405(var184, var6);// 3458
                              var4.method1389(// 2954
                                 var1.method1437(var2.field2444, var2.field2435, var2.field2442, var2.field2438, var2.field2439, var117, true),// 3032
                                 var50,
                                 true,
                                 var6
                              );
                           }
                        }
                     }

                     if (var19 != null) {// 3006
                        int[] var65 = var19;
                        int var84 = var19.length;

                        int var92;
                        for (int var151 = var92 = 0; var151 < var84; var151 = ++var92) {// 3379
                           int var103;
                           int var112;
                           if ((var112 = var4.method1385(var103 = var65[var92])) == 64 || var112 == 65) {// 2847 3047
                              int var51;
                              int var185 = var51 = var4.method1377(var2, var103);// 2932
                              int var52 = var51 + 2;// 2783
                              String var118 = var4.method1405(var185, var6);// 3436
                              var4.method1389(// 2651
                                 var1.method1437(var2.field2444, var2.field2435, var2.field2442, var2.field2438, var2.field2439, var118, false),// 3409
                                 var52,
                                 true,
                                 var6
                              );
                           }
                        }
                     }

                     Class534 var152 = var20;// 3049

                     while (var152 != null) {
                        Class534 var66 = var20.field1800;// 3005
                        var20.field1800 = null;// 3125
                        var152 = var66;
                        var1.method1431(var20);// 3520
                        var20 = var66;// 2897
                     }

                     var1.method1412(var7, var8);// 3015
                     return;// 3236
                  }

                  int var23;
                  label424: {
                     String var22 = var4.method1405(var42, var6);// 1943
                     int var43 = var42 + 6;// 1878
                     var23 = var4.method1391(var42 + 2);// 1709
                     if ("LocalVariableTable".equals(var22)) {// 1966
                        if ((var2.field2448 & 2) == 0) {// 1761
                           var61 = var43;// 1712
                           int var24 = var43 + 2;// 1877 1941
                           int var25 = var4.method1399(var43);// 1687
                           var131 = var25;// 1960

                           while (true) {
                              var25--;
                              if (var131 <= 0) {
                                 break;
                              }

                              int var26;
                              var4.method1376(var26 = var4.method1399(var24), var12);// 1720 1730
                              int var27 = var4.method1399(var24 + 2);// 1851
                              var24 += 10;
                              var4.method1376(var26 + var27, var12);// 1789
                              var131 = var25;// 1803
                           }
                        }
                     } else {
                        if ("LocalVariableTypeTable".equals(var22)) {// 1918
                           var54 = var43;// 1822
                           var131 = var43;
                           break label424;
                        }

                        if ("LineNumberTable".equals(var22)) {// 1970
                           if ((var2.field2448 & 2) == 0) {// 1749
                              int var70 = var43 + 2;// 1867 1959
                              int var73 = var4.method1399(var43);// 1804
                              var131 = var73;// 1928

                              while (true) {
                                 var73--;
                                 if (var131 <= 0) {
                                    break;
                                 }

                                 int var75 = var4.method1399(var70);// 1914
                                 int var168 = var70;// 1764
                                 var70 += 4;// 1757
                                 int var77 = var4.method1399(var168 + 2);
                                 var4.method1376(var75, var12);// 1796
                                 var12[var75].method1291(var77);// 1746
                                 var131 = var73;
                              }
                           }
                        } else {
                           if ("RuntimeVisibleTypeAnnotations".equals(var22)) {// 1893
                              var18 = var4.method1370(var1, var2, var43, true);// 1724 1835
                              var131 = var43;
                              break label424;
                           }

                           if ("RuntimeInvisibleTypeAnnotations".equals(var22)) {// 1896
                              var19 = var4.method1370(var1, var2, var43, false);// 1944 1955
                              var131 = var43;
                              break label424;
                           }

                           if ("StackMapTable".equals(var22)) {// 1872
                              if ((var2.field2448 & 4) == 0) {// 1856
                                 var56 = var43 + 2;// 1732
                                 var58 = var43 + var23;// 1734
                                 var131 = var43;
                                 break label424;
                              }
                           } else if ("StackMap".equals(var22)) {// 1810
                              if ((var2.field2448 & 4) == 0) {// 1958
                                 var56 = var43 + 2;// 1844
                                 var58 = var43 + var23;// 1922
                                 var60 = false;// 1729
                                 var131 = var43;
                                 break label424;
                              }
                           } else {
                              Class534 var136 = var4.method1392(var2.field2445, var22, var43, var23, var6, var3, var12);// 1685 1967
                              var136.field1800 = var20;// 2109
                              var20 = var136;// 2002
                           }
                        }
                     }

                     var131 = var43;// 2338
                  }

                  var42 = var131 + var23;
                  var131 = var21;
               }
            }

            Class483 var14 = var4.method1383(var4.method1399(var41), var12);// 1777
            Class483 var57 = var4.method1383(var4.method1399(var41 + 2), var12);// 1778
            Class483 var59 = var4.method1383(var4.method1399(var41 + 4), var12);// 1936
            int var154 = var4.field1676[var4.method1399(var41 + 6)];// 1942
            var41 += 8;
            String var17 = var4.method1405(var154, var6);
            var131 = var54;// 1698
            var1.method1436(var14, var57, var59, var17);// 1741
         }
      }
   }

   // $VF: synthetic method
   public int method1399(int var1) {
      byte[] var3;
      return ((var3 = this.field1677)[var1] & 0xFF) << 8 | var3[var1 + 1] & 0xFF;// 3774 3805
   }

   // $VF: synthetic method
   public void method1400(Class602 var1) {
      String var7 = var1.field2437;// 2829
      Object[] var4 = var1.field2433;// 2633
      int var3 = 0;// 3175
      if ((var1.field2446 & 8) == 0) {// 2754
         if ("<init>".equals(var1.field2443)) {// 2685
            var4[var3++] = Class572.field2128;// 3401
         } else {
            var4[var3++] = this.method1372(this.field1683 + 2, var1.field2440);// 2965
         }
      }

      int var5 = 1;// 3514

      while (true) {
         int var6 = var5;// 3255
         char var10000 = var7.charAt(var5);// 3240
         var5++;
         switch (var10000) {
            case 'B':
            case 'C':
            case 'I':
            case 'S':
            case 'Z':
               while (false) {
               }

               var4[var3++] = Class572.field2130;// 3184
               break;// 3463
            case 'D':
               var4[var3++] = Class572.field2286;// 3370
               break;// 3257
            case 'E':
            case 'G':
            case 'H':
            case 'K':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            default:
               var1.field2430 = var3;// 3342
               return;// 2761
            case 'F':
               var4[var3++] = Class572.field2253;// 3472
               break;// 3192
            case 'J':
               var4[var3++] = Class572.field2145;// 3354
               break;// 3153
            case 'L':
               for (String var10 = var7; var10.charAt(var5) != ';'; var5++) {// 2971
                  var10 = var7;// 2948
               }

               int var13 = var3++;
               String var10002 = var7.substring(var6 + 1, var5);// 3092
               var5++;
               var4[var13] = var10002;// 2993
               break;// 3163
            case '[':
               for (String var8 = var7; var8.charAt(var5) == '['; var5++) {// 3090
                  var8 = var7;// 2981
               }

               if (var7.charAt(var5) == 'L') {// 2756
                  String var9 = var7;// 3476
                  var5++;// 3511

                  while (var9.charAt(var5) != ';') {
                     var9 = var7;// 3448
                     var5++;
                  }
               }

               int var12 = var3;
               var5++;
               var3++;
               var4[var12] = var7.substring(var6, var5);// 3385 3393
         }
      }
   }

   // $VF: synthetic method
   public static String method1401(String var0) {
      return var0 + ".class";
   }

   // $VF: synthetic method
   public int method1402(Class353 var1, int var2, String var3, char[] var4) {
      Class508 var24 = this;
      if (var1 == null) {// 2640
         switch (this.field1677[var2] & 0xFF) {// 2764 2860
            case 64:
               while (false) {
               }

               return this.method1389(null, var2 + 3, true, var4);// 3061
            case 91:
               return this.method1389(null, var2 + 1, false, var4);// 2695
            case 101:
               return var2 + 5;// 2732
            default:
               return var2 + 3;// 2848
         }
      } else {
         int var33 = this.field1677[var2] & 255;// 3371
         var2++;
         switch (var33) {
            case 64:
               while (false) {
               }

               byte var62;
               return this.method1389(var1.method656(var3, this.method1405(var62, var4)), var62 + 2, true, var4);// 2614 2985 3399 3403
            case 65:
            case 69:
            case 71:
            case 72:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 100:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            default:
               throw new IllegalArgumentException();// 2715
            case 66:
               byte var61;
               int var51 = this.method1391(this.field1676[this.method1399(var61)]);// 3364
               int var23 = var61 + 2;
               var1.method653(var3, (byte)var51);// 3201
               return var23;// 2812 3443
            case 67:
               byte var60;
               int var50 = this.method1391(this.field1676[this.method1399(var60)]);// 3565
               int var22 = var60 + 2;
               var1.method653(var3, (char)var50);// 3322
               return var22;// 2862 3437
            case 68:
            case 70:
            case 73:
            case 74:
               byte var59;
               int var53 = this.method1399(var59);// 3138
               int var21 = var59 + 2;
               var1.method653(var3, this.method1365(var53, var4));// 2939
               return var21;// 2763 3044
            case 83:
               byte var58;
               int var49 = this.method1391(this.field1676[this.method1399(var58)]);// 2597
               int var20 = var58 + 2;
               var1.method653(var3, (short)var49);// 2823
               return var20;// 2634 3543
            case 90:
               byte var57;
               var1.method653(var3, this.method1391(this.field1676[this.method1399(var57)]) == 0 ? Boolean.FALSE : Boolean.TRUE);// 2722 3173 3338 3347
               return var57 + 2;// 2716 3329
            case 91:
               byte var56;
               int var19 = var56 + 2;// 3229
               int var5 = this.method1399(var56);// 2853
               if (var5 == 0) {// 3247
                  return this.method1389(var1.method658(var3), var19 - 2, false, var4);// 3182 3235
               } else {
                  switch (this.field1677[var19] & 0xFF) {// 2661
                     case 66:
                        while (false) {
                        }

                        byte[] var25 = new byte[var5];// 3141

                        int var26;
                        for (int var41 = var26 = 0; var41 < var5; var41 = ++var26) {// 2596
                           byte var48 = (byte)var24.method1391(var24.field1676[var24.method1399(var19 + 1)]);
                           var19 += 3;// 3186
                           var25[var26] = var48;// 2818
                        }

                        var1.method653(var3, var25);// 3289
                        return var19;// 3369
                     case 67:
                        char[] var28 = new char[var5];// 2709

                        int var29;
                        for (int var40 = var29 = 0; var40 < var5; var40 = ++var29) {// 3180
                           char var47 = (char)var24.method1391(var24.field1676[var24.method1399(var19 + 1)]);
                           var19 += 3;// 3042
                           var28[var29] = var47;// 3345
                        }

                        var1.method653(var3, var28);// 2859
                        return var19;// 3397
                     case 68:
                        double[] var32 = new double[var5];// 2620

                        int var6;
                        for (int var39 = var6 = 0; var39 < var5; var39 = ++var6) {// 3223
                           double var46 = Double.longBitsToDouble(var24.method1403(var24.field1676[var24.method1399(var19 + 1)]));// 3292 3446
                           var19 += 3;// 2806
                           var32[var6] = var46;// 2984
                        }

                        var1.method653(var3, var32);// 2810
                        return var19;// 3215
                     case 69:
                     case 71:
                     case 72:
                     case 75:
                     case 76:
                     case 77:
                     case 78:
                     case 79:
                     case 80:
                     case 81:
                     case 82:
                     case 84:
                     case 85:
                     case 86:
                     case 87:
                     case 88:
                     case 89:
                     default:
                        return this.method1389(var1.method658(var3), var19 - 2, false, var4);// 2676 2813 2878 3194
                     case 70:
                        float[] var31 = new float[var5];// 3169

                        int var13;
                        for (int var38 = var13 = 0; var38 < var5; var38 = ++var13) {// 2725
                           float var45 = Float.intBitsToFloat(var24.method1391(var24.field1676[var24.method1399(var19 + 1)]));// 2728 3324
                           var19 += 3;// 3362
                           var31[var13] = var45;// 2684
                        }

                        var1.method653(var3, var31);// 3482
                        return var19;// 2871
                     case 73:
                        int[] var10 = new int[var5];// 3317

                        int var30;
                        for (int var37 = var30 = 0; var37 < var5; var37 = ++var30) {// 2600
                           int var44 = var24.method1391(var24.field1676[var24.method1399(var19 + 1)]);
                           var19 += 3;// 3325
                           var10[var30] = var44;// 3231
                        }

                        var1.method653(var3, var10);// 2841
                        return var19;// 2593
                     case 74:
                        long[] var11 = new long[var5];// 3208

                        int var12;
                        for (int var36 = var12 = 0; var36 < var5; var36 = ++var12) {// 3352
                           long var43 = var24.method1403(var24.field1676[var24.method1399(var19 + 1)]);
                           var19 += 3;// 3002
                           var11[var12] = var43;// 2762
                        }

                        var1.method653(var3, var11);// 3035
                        return var19;// 3535
                     case 83:
                        short[] var27 = new short[var5];// 3275

                        int var9;
                        for (int var35 = var9 = 0; var35 < var5; var35 = ++var9) {// 2940
                           short var42 = (short)var24.method1391(var24.field1676[var24.method1399(var19 + 1)]);
                           var19 += 3;// 2947
                           var27[var9] = var42;// 2838
                        }

                        var1.method653(var3, var27);// 2752
                        return var19;// 3456
                     case 90:
                        boolean[] var7 = new boolean[var5];// 3321

                        int var8;
                        for (int var34 = var8 = 0; var34 < var5; var19 += 3) {// 3142
                           var7[var8] = var24.method1391(var24.field1676[var24.method1399(var19 + 1)]) != 0;// 2733
                           var34 = ++var8;// 2992
                        }

                        var1.method653(var3, var7);// 3075
                        return var19;// 3147
                  }
               }
            case 99:
               byte var55;
               int var18 = var55 + 2;
               var1.method653(var3, Class599.method2076(this.method1405(var55, var4)));// 3105
               return var18;// 3110 3196
            case 101:
               byte var54;
               String var10002 = this.method1405(var54, var4);// 3417
               int var10004 = var54 + 2;
               int var17 = var54 + 4;
               var1.method655(var3, var10002, this.method1405(var10004, var4));// 2773 3041
               return var17;// 2647 2750
            case 115:
               byte var14;
               int var16 = var14 + 2;
               var1.method653(var3, this.method1405(var14, var4));// 3530
               return var16;// 2797 3055
         }
      }
   }

   // $VF: synthetic method
   public long method1403(int var1) {
      long var2 = (long)this.method1391(var1);// 3967
      long var4 = (long)this.method1391(var1 + 4) & 4294967295L;// 3751
      return var2 << 32 | var4;// 3632
   }

   // $VF: synthetic method
   public String method1404() {
      return this.method1372(this.field1683 + 4, new char[this.field1681]);// 575
   }

   // $VF: synthetic method
   public Class508(String var1) {
      this(method1407(ClassLoader.getSystemResourceAsStream(method1401(var1.replace('.', '/'))), true));// 41 91 551
   }// 360

   // $VF: synthetic method
   public String method1405(int var1, char[] var2) {
      int var4 = this.method1399(var1);// 3831
      return var1 != 0 && var4 != 0 ? this.method1363(var4, var2) : null;// 3631 3857 3944
   }

   // $VF: synthetic method
   public Class508(byte[] var1, int var2, boolean var3) {
      Class508 var11 = this;
      super();
      this.field1677 = var1;// 434
      this.field1685 = var1;// 166 292
      if (var3 && this.method1374(var2 + 6) > 69) {// 268
         throw new IllegalArgumentException(method1373(this.method1374(var2 + 6)));// 66 497
      } else {
         this.field1676 = new int[var3 = this.method1399(var2 + 8)];// 109 213
         this.field1680 = new String[var3];// 15
         int var4 = 1;// 177
         int var10 = var2 + 10;// 266
         int var5 = 0;// 235
         boolean var6 = false;// 280
         boolean var7 = false;// 370

         for (int var13 = var4; var13 < var3; var13 = var4) {// 95
            int var10002 = var4;
            int var10003 = var10 + 1;
            var4++;
            var11.field1676[var10002] = var10003;// 227
            int var8;
            switch (var1[var10]) {// 77
               case 1:
                  while (false) {
                  }

                  if ((var8 = 3 + var11.method1399(var10 + 1)) > var5) {// 207 275
                     var5 = var8;// 369
                     var13 = var10;
                  } else {
                     var13 = var10;// 596
                  }
                  break;
               case 2:
               case 13:
               case 14:
               default:
                  throw new IllegalArgumentException();// 339
               case 3:
               case 4:
               case 9:
               case 10:
               case 11:
               case 12:
                  var8 = 5;// 221
                  var13 = var10;
                  break;// 444
               case 5:
               case 6:
                  var4++;
                  var8 = 9;// 401
                  var13 = var10;// 394
                  break;// 556
               case 7:
               case 8:
               case 16:
               case 19:
               case 20:
                  var8 = 3;// 162
                  var13 = var10;
                  break;// 282
               case 15:
                  var8 = 4;// 210
                  var13 = var10;
                  break;// 576
               case 17:
                  var8 = 5;// 193
                  var6 = true;// 251
                  var7 = true;// 486
                  var13 = var10;
                  break;// 117
               case 18:
                  var8 = 5;// 245
                  var6 = true;// 296
                  var13 = var10;
            }

            var10 = var13 + var8;
         }

         var11.field1681 = var5;
         var11.field1683 = var10;// 145
         var11.field1690 = var7 ? new Class492[var3] : null;// 499 520
         var11.field1686 = var6 ? var11.method1384(var5) : null;// 172 564
      }
   }// 48

   // $VF: synthetic method
   public String method1406(int var1, char[] var2) {
      return this.method1382(var1, var2);// 3786
   }

   // $VF: synthetic method
   public static byte[] method1407(InputStream var0, boolean var1) {
      InputStream var4 = var0;
      if (var0 == null) {// 80
         throw new IOException("Class not found");// 283
      } else {
         int var2 = method1395(var0);// 114

         try {
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();

            label129: {
               try {
                  byte[] var14 = new byte[var2];// 102
                  int var6 = 0;// 183
                  InputStream var17 = var4;// 205

                  int var5;
                  while ((var5 = var17.read(var14, 0, var2)) != -1) {
                     var17 = var4;
                     var6++;
                     var3.write(var14, 0, var5);// 64
                  }

                  var3.flush();// 349
                  if (var6 == 1) {// 196
                     var16 = var14;
                     break label129;
                  }

                  var15 = var3.toByteArray();
               } catch (Throwable var12) {
                  try {
                     var3.close();
                  } catch (Throwable var11) {
                     throw var12;// 460
                  }

                  throw var12;
               }

               var3.close();// 89
               return var15;// 429
            }

            var3.close();
         } finally {
            if (var1) {// 506
               var4.close();// 599
            }
         }

         return var16;// 164
      }
   }

   // $VF: synthetic method
   public Class492 method1408(int var1, char[] var2) {
      Class508 var3 = this;
      Class492 var9;
      if ((var9 = this.field1690[var1]) != null) {// 3630 3842
         return var9;// 3810
      } else {
         int var10 = this.field1676[var1];// 3704
         int var4;
         String var5 = this.method1405(var4 = this.field1676[this.method1399(var10 + 2)], var2);// 3907 3998
         String var13 = this.method1405(var4 + 2, var2);// 3697
         int var11;
         Class563 var6 = (Class563)this.method1365(this.method1399(var11 = this.field1686[this.method1399(var10)]), var2);// 3773 3816
         Object[] var10000 = new Object[this.method1399(var11 + 2)];// 3988
         int var12 = var11 + 4;// 3681
         Object[] var7 = var10000;

         int var8;
         for (int var14 = var8 = 0; var14 < var7.length; var14 = ++var8) {// 3961
            Object var10002 = var3.method1365(var3.method1399(var12), var2);
            var12 += 2;// 3828
            var7[var8] = var10002;// 3905
         }

         return var3.field1690[var1] = new Class492(var5, var13, var6, var7);// 3671
      }
   }

   // $VF: synthetic method
   public int method1409(Class343 var1, Class602 var2, int var3) {
      Class508 var27 = this;
      char[] var4 = var2.field2440;// 1491
      int var5 = this.method1399(var3);// 1255 1266
      String var6 = this.method1405(var3 + 2, var4);// 1101
      int var10002 = var3 + 4;// 1444
      int var20 = var3 + 6;// 1035
      String var7 = this.method1405(var10002, var4);
      Object var8 = null;// 1593
      String var9 = null;// 1400
      int var10 = 0;// 1007
      int var11 = 0;// 1084
      int var12 = 0;// 1229
      int var13 = 0;// 1028
      Class534 var14 = null;// 1451
      int var21 = var20 + 2;// 1081
      int var15 = this.method1399(var20);// 1561
      int var44 = var15;// 1494

      while (true) {
         var15--;
         if (var44 <= 0) {
            Class540 var28;
            if ((var28 = var1.method644(var5, var6, var7, var9, var8)) == null) {// 1354 1539 1563
               return var21;// 1510
            } else {
               if (var10 != 0) {// 1152
                  int var29 = var27.method1399(var10);// 1302
                  int var34 = var10 + 2;// 1325
                  var44 = var29;// 1219

                  while (true) {
                     var29--;
                     if (var44 <= 0) {
                        break;
                     }

                     int var35 = var34 + 2;// 1383
                     String var23 = var27.method1405(var34, var4);// 1272
                     var34 = var27.method1389(var28.method1634(var23, true), var35, true, var4);// 1232 1509 1588
                     var44 = var29;
                  }
               }

               if (var11 != 0) {// 1599
                  int var30 = var27.method1399(var11);// 1173
                  int var36 = var11 + 2;// 997
                  var44 = var30;// 1552

                  while (true) {
                     var30--;
                     if (var44 <= 0) {
                        break;
                     }

                     int var37 = var36 + 2;// 1392
                     String var24 = var27.method1405(var36, var4);// 1365
                     var36 = var27.method1389(var28.method1634(var24, false), var37, true, var4);// 1280 1362 1527
                     var44 = var30;
                  }
               }

               if (var12 != 0) {// 1156
                  int var31 = var27.method1399(var12);// 1660
                  int var38 = var12 + 2;// 1320
                  var44 = var31;// 1625

                  while (true) {
                     var31--;
                     if (var44 <= 0) {
                        break;
                     }

                     int var39;
                     var10002 = var39 = var27.method1377(var2, var38);// 1675
                     var38 = var39 + 2;// 1171
                     String var25 = var27.method1405(var10002, var4);// 1591
                     var38 = var27.method1389(var28.method1638(var2.field2444, var2.field2435, var25, true), var38, true, var4);// 1211 1410 1575
                     var44 = var31;
                  }
               }

               if (var13 != 0) {// 1522
                  int var32 = var27.method1399(var13);// 1262
                  int var41 = var13 + 2;// 1391
                  var44 = var32;// 1586

                  while (true) {
                     var32--;
                     if (var44 <= 0) {
                        break;
                     }

                     int var42;
                     var10002 = var42 = var27.method1377(var2, var41);// 1526
                     var41 = var42 + 2;// 1602
                     String var26 = var27.method1405(var10002, var4);// 1159
                     var41 = var27.method1389(var28.method1638(var2.field2444, var2.field2435, var26, false), var41, true, var4);// 1040 1185 1639
                     var44 = var32;
                  }
               }

               Class534 var51 = var14;// 1005

               while (var51 != null) {
                  Class534 var33 = var14.field1800;// 1577
                  var14.field1800 = null;// 1634
                  var51 = var33;
                  var28.method1636(var14);// 1518
                  var14 = var33;// 1546
               }

               var28.method1639();// 1332
               return var21;// 1488
            }
         }

         String var16 = var27.method1405(var21, var4);// 1633
         int var22 = var21 + 6;// 1138
         int var17 = var27.method1391(var21 + 2);// 1126
         if ("ConstantValue".equals(var16)) {// 1222
            int var18;
            var8 = (var18 = var27.method1399(var22)) == 0 ? null : var27.method1365(var18, var4);// 1087 1208
            var44 = var22;
         } else if ("Signature".equals(var16)) {// 1397
            var9 = var27.method1405(var22, var4);// 1330
            var44 = var22;
         } else if ("Deprecated".equals(var16)) {// 1659
            var5 |= 131072;// 1234
            var44 = var22;
         } else if ("Synthetic".equals(var16)) {// 1004
            var5 |= 4096;// 1506
            var44 = var22;
         } else if ("RuntimeVisibleAnnotations".equals(var16)) {// 1289
            var10 = var22;// 1044
            var44 = var22;
         } else if ("RuntimeVisibleTypeAnnotations".equals(var16)) {// 1142
            var12 = var22;// 1321
            var44 = var22;
         } else if ("RuntimeInvisibleAnnotations".equals(var16)) {// 1293
            var11 = var22;// 1671
            var44 = var22;
         } else if ("RuntimeInvisibleTypeAnnotations".equals(var16)) {// 1227
            var13 = var22;// 1326
            var44 = var22;
         } else {
            Class534 var46 = var27.method1392(var2.field2445, var16, var22, var17, var4, -1, null);// 1015 1188
            var46.field1800 = var14;// 1246
            var14 = var46;// 1401
            var44 = var22;// 1265
         }

         var21 = var44 + var17;
         var44 = var15;
      }
   }

   // $VF: synthetic method
   public int method1410(int var1, boolean var2, boolean var3, Class602 var4) {
      Class602 var10 = var4;
      Class508 var15 = this;
      var1 = var1;// 2599
      char[] var5 = var4.field2440;// 3200
      Class483[] var6 = var4.field2434;// 2637
      Class602 var19;
      if (var2) {// 2952
         var19 = var4;
         int var10001 = this.field1677[var1] & 255;// 3264
         var1++;
         var2 = var10001;
      } else {
         var2 = 255;// 2873
         var19 = var4;// 3171
         var4.field2432 = -1;
      }

      var19.field2431 = 0;// 3074
      int var7;
      if (var2 < 64) {// 3425
         var7 = var2;// 3310
         var19 = var4;
         var4.field2447 = 3;
         var4.field2441 = 0;// 2650 2890
      } else if (var2 < 128) {// 2631
         var7 = var2 - 64;// 2611
         var19 = var4;
         var1 = this.method1393(var1, var4.field2436, 0, var5, var6);// 3158 3268
         var4.field2447 = 4;
         var4.field2441 = 1;// 2975 3189
      } else {
         if (var2 < 247) {// 2893
            throw new IllegalArgumentException();// 2999
         }

         int var25 = var1;
         var1 += 2;// 2698
         var7 = this.method1399(var25);// 2652
         if (var2 == 247) {// 3477
            var19 = var4;
            var1 = this.method1393(var1, var4.field2436, 0, var5, var6);// 2903 3556
            var4.field2447 = 4;
            var4.field2441 = 1;// 2746 3273
         } else if (var2 >= 248 && var2 < 251) {// 3286
            var19 = var4;
            var4.field2447 = 2;
            var4.field2431 = 251 - var2;// 2817
            var4.field2430 = var4.field2430 - var4.field2431;// 3411
            var4.field2441 = 0;// 2828 2933
         } else if (var2 == 251) {// 2825
            var19 = var4;
            var4.field2447 = 3;
            var4.field2441 = 0;// 2791 2879
         } else if (var2 < 255) {// 3076
            int var8 = var3 ? var4.field2430 : 0;// 3518

            int var9;
            for (int var21 = var9 = var2 - 251; var21 > 0; var21 = var9) {// 3478
               var9--;
               int var22 = var15.method1393(var1, var10.field2433, var8, var5, var6);// 2967 3086
               var8++;
               var1 = var22;
            }

            var19 = var10;// 3156
            var10.field2447 = 1;
            var10.field2431 = var2 - 251;// 3051
            var10.field2430 = var10.field2430 + var10.field2431;// 3188
            var10.field2441 = 0;// 3424
         } else {
            int var16 = this.method1399(var1);// 3380
            int var23 = 0;// 3048
            var1 += 2;
            var4.field2447 = 0;
            var4.field2431 = var16;// 2901
            var4.field2430 = var16;// 3031 3033

            for (int var17 = 0; var23 < var16; var23 = var17) {// 3510
               var1 = var15.method1393(var1, var10.field2433, var17++, var5, var6);// 3065 3469
            }

            int var18 = var15.method1399(var1);// 2809
            int var24 = 0;// 3302
            var1 += 2;
            var10.field2441 = var18;// 2753

            for (int var14 = 0; var24 < var18; var24 = var14) {// 3389
               var1 = var15.method1393(var1, var10.field2436, var14++, var5, var6);// 2926 3166
            }

            var19 = var10;// 3089
         }
      }

      var19.field2432 += var7 + 1;
      var15.method1383(var10.field2432, var6);// 3165
      return var1;// 3351
   }
}
