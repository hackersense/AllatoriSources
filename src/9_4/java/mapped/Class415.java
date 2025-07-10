package mapped;

import smardecSB.aconst_null;
import smardecSB.aload_x;
import smardecSB.astore_x;
import smardecSB.bipush;
import smardecSB.dconst_x;
import smardecSB.dload_x;
import smardecSB.dstore_x;
import smardecSB.dup;
import smardecSB.fconst_x;
import smardecSB.fload_x;
import smardecSB.fstore_x;
import smardecSB.getfield;
import smardecSB.iconst_x;
import smardecSB.iload_x;
import smardecSB.istore_x;
import smardecSB.lconst_x;
import smardecSB.ldc;
import smardecSB.ldc2_w;
import smardecSB.lload_x;
import smardecSB.lstore_x;
import smardecSB.nop;
import smardecSB.pop;
import smardecSB.pop2;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Vector;

// $VF: Compiled from av
public class Class415 implements Class412 {
   // $VF: synthetic field
   public Class338 field1235;

   // $VF: synthetic method
   public static int[] method812() {
      int var0 = 0;// 326
      int var1 = 0;

      int var2;
      for (int var10000 = var2 = 0; var10000 < 32; var10000 = ++var2) {// 29
         if (Class337.method547() < 0.5) {// 328
            var0 |= 1 << var2;// 521
         } else {
            var1 |= 1 << var2;// 546
         }
      }

      return new int[]{var0, var1};// 51
   }

   // $VF: synthetic method
   public void method813(Class206 var1, Class203 var2, Class251 var3) {
      var3.method19();// 1482
      Class199[] var4;
      if ((var4 = var2.method284()) != null) {// 1186 1631
         int var5 = var2.method130().length;// 1014
         if (!var2.method254()) {// 1459
            var5++;
         }

         Class138[] var6;
         int var7 = (var6 = var2.method277()).length;

         int var8;
         for (int var10000 = var8 = 0; var10000 < var7; var10000 = ++var8) {// 1074
            Class138 var9;
            if ((var9 = var6[var8]) == Class138.field578 || var9 == Class138.field576) {// 1649
               var5++;
            }
         }

         Class199[] var28 = var4;
         var7 = var4.length;

         for (int var64 = var8 = 0; var64 < var7; var64 = ++var8) {// 993
            Class199 var34;
            if ((var34 = var28[var8]).method26() == Class138.field584// 1160
               || var34.method26() == Class138.field594
               || var34.method26() == Class138.field581
               || var34.method26() == Class138.field585) {
               var34.method266(Class138.field591);// 1036
            }
         }

         int var29;
         Class246[] var31 = new Class246[var29 = var2.method30()];// 1141 1666
         Class246[] var33 = new Class246[var29];// 992
         boolean[] var35 = new boolean[var29];// 1342
         Hashtable var10 = new Hashtable();// 1374

         Class246 var11;
         for (Class246 var65 = var11 = var3.method32(); var65 != null; var65 = var11 = var11.method32()) {// 1358 1413 1447
            if (var11.method18() instanceof Class277) {// 1075
               Class277 var12 = (Class277)var11.method18();// 1461
               int var13;
               Class277 var66;
               if (var31[var13 = var12.method2()] == null) {// 999 1427
                  if (var13 < var5) {// 1396
                     var66 = var12;
                     var31[var13] = var3.method32();// 1665
                     var33[var13] = var11;// 1078
                  } else {
                     var31[var13] = var33[var13] = var11;// 1337
                     var66 = var12;
                  }
               } else {
                  var33[var13] = var11;// 1176
                  var66 = var12;// 1347
               }

               boolean var20 = var66.method11(var1.method46()) == 2 || var12.method15(var1.method46()) == 2;
               if (var20 && var13 + 1 < var29) {// 1092
                  var35[var13] = true;// 1368
                  if (var31[var13 + 1] == null) {// 1544
                     if (var13 + 1 < var5) {// 1480
                        var31[var13 + 1] = var3.method32();// 1464
                        var33[var13 + 1] = var11;// 1205
                     } else {
                        var31[var13 + 1] = var33[var13 + 1] = var11;// 1615
                     }
                  } else {
                     var33[var13 + 1] = var11;// 1445
                  }
               }
            } else if (var11.method18() instanceof Class279) {// 1193
               Class279 var40 = (Class279)var11.method18();// 1473
               int var44;
               if (var31[var44 = var40.method2()] == null) {// 1419 1612
                  if (var44 < var5) {// 1299
                     var31[var44] = var3.method32();// 1200
                     var33[var44] = var11;// 1524
                  } else {
                     var31[var44] = var33[var44] = var11;// 1093
                  }
               } else {
                  var33[var44] = var11;// 1363
               }
            } else if (var11.method18() instanceof Class90) {// 1018
               var10.put((Class90)var11.method18(), var11);// 1490
            }
         }

         for (Class246 var67 = var11 = var3.method32(); var67 != null; var67 = var11 = var11.method32()) {// 1119 1162 1287
            if (var11.method32() != null && var11.method18() instanceof aload_x && var11.method32().method18() instanceof Class87) {// 1403
               int var41 = ((aload_x)var11.method18()).method2();// 1082
               var31[var41] = var3.method32();// 1054
               var33[var41] = var3.method37();// 1622
            }
         }

         int var42;
         for (int var68 = var42 = 0; var68 < var29; var68 = ++var42) {// 1165
            if (var31[var42] != null) {// 1435
               while (true) {
                  boolean var45 = false;// 1536
                  Class246 var21;
                  Class246 var69 = var21 = var31[var42];// 1369

                  while (true) {
                     if (var69 == null) {// 1019
                        var71 = var45;// 1450
                        break;
                     }

                     Class200[] var15;
                     if ((var15 = var21.method431()) != null) {// 1409 1438
                        Class200[] var16 = var15;
                        int var17 = var15.length;

                        int var18;
                        for (int var70 = var18 = 0; var70 < var17; var70 = ++var18) {// 1658
                           Class200 var19;
                           Class246 var63;
                           if ((var19 = var16[var18]) instanceof Class90 && (var63 = (Class246)var10.get(var19)) != null) {// 1017 1350 1471
                              if (var63.method2() < var31[var42].method2()) {// 1195
                                 var31[var42] = var63;// 1441
                                 if (var35[var42] && var42 + 1 < var29) {// 1249
                                    var31[var42 + 1] = var63;// 1066
                                 }

                                 var45 = true;// 1123
                              }

                              if (var63.method2() > var33[var42].method2()) {// 1304
                                 var33[var42] = var63;// 1580
                                 if (var35[var42] && var42 + 1 < var29) {// 1486
                                    var33[var42 + 1] = var63;// 1453
                                 }

                                 var45 = true;// 1097
                              }
                           }
                        }
                     }

                     if (var21 == var33[var42]) {// 1468
                        var71 = var45;
                        break;
                     }

                     var69 = var21 = var21.method32();// 1053
                  }

                  if (!var71) {
                     break;
                  }
               }
            }
         }

         int[] var43 = new int[var29];// 1618
         byte var46 = 1;
         int var22 = 1;// 1194

         for (int var72 = var22; var72 < var29; var72 = ++var22) {// 1145
            int var47;
            if (var35[var22] && var43[var22] == 0 && var22 + 1 < var29 && var43[var22 + 1] == 0 && !var35[var22 - 1]) {// 1038 1106 1346 1548 1601
               for (int var73 = var47 = Math.max(var22 + 2, var5); var73 < var29; var73 = ++var47) {// 1638
                  if (var35[var47]// 1540
                     && var43[var47] == 0// 1063
                     && !var35[var47 - 1]// 1169
                     && var33[var22] != null// 1672
                     && var31[var47] != null
                     && var33[var22].method2() < var31[var47].method2()
                     && var33[var22 + 1] != null// 1248
                     && var33[var22 + 1].method2() < var31[var47].method2()) {
                     var33[var22] = var33[var47];// 1476
                     var33[var22 + 1] = var33[var47];// 1129
                     var43[var47] = var22;// 1515
                     Class348.field1019 += 2;// 1583
                  }
               }
            }
         }

         int var74 = var46;

         for (int var23 = 1; var74 < var29; var74 = ++var23) {// 1091
            int var48;
            if (!var35[var23] && !var35[var23 - 1] && var43[var23] == 0) {// 1115 1462 1578
               for (int var75 = var48 = Math.max(var23 + 1, var5); var75 < var29; var75 = ++var48) {// 1474
                  if (!var35[var48]// 1056
                     && !var35[var48 - 1]// 1652
                     && var43[var48] == 0// 1068
                     && (
                        var33[var23] != null && var31[var48] != null && var33[var23].method2() < var31[var48].method2()// 1269
                           || var33[var23] == null && var31[var48] != null
                     )) {
                     var33[var23] = var33[var48];// 1310
                     var43[var48] = var23;// 1411
                     Class348.field1019++;// 1668
                  }
               }
            }
         }

         var74 = var46;

         for (int var24 = 1; var74 < var29; var74 = ++var24) {// 1624
            int var49;
            if ((var35[var24] || var35[var24 - 1]) && var43[var24] == 0) {// 1619 1635
               for (int var77 = var49 = Math.max(var24 + 2, var5); var77 < var29; var77 = ++var49) {// 1140
                  if (!var35[var49]// 1065
                     && !var35[var49 - 1]// 1678
                     && var43[var49] == 0// 1022
                     && var33[var24] != null// 1256
                     && var31[var49] != null
                     && var33[var24].method2() < var31[var49].method2()) {
                     var33[var24] = var33[var49];// 1189
                     var43[var49] = var24;// 1398
                     Class348.field1019++;// 1355
                  }
               }
            }
         }

         for (Class246 var78 = var11 = var3.method32(); var78 != null; var78 = var11 = var11.method32()) {// 1033 1373 1571
            if (var11.method18() instanceof Class277) {// 1489
               Class277 var25 = (Class277)var11.method18();// 1328
               if (var43[var25.method2()] != 0) {// 1385
                  var25.method6(var43[var25.method2()]);// 1121
               }
            } else if (var11.method18() instanceof Class279) {// 1596
               Class279 var26 = (Class279)var11.method18();// 1484
               if (var43[var26.method2()] != 0) {// 998
                  var26.method6(var43[var26.method2()]);// 1032
               }
            }
         }

         boolean[] var27 = var35;// 1306
         Arrays.fill(var35, false);// 1085

         for (Class246 var79 = var11 = var3.method32(); var79 != null; var79 = var11 = var11.method32()) {// 1112 1182 1197
            if (var11.method18() instanceof Class277) {// 1060
               Class277 var50 = (Class277)var11.method18();// 1108
               int var57;
               var27[var57 = var50.method2()] = true;// 1158
               boolean var60 = var50.method11(var1.method46()) == 2 || var50.method15(var1.method46()) == 2;// 1001 1535
               if (var60 && var57 + 1 < var29) {// 1009
                  var27[var57 + 1] = true;// 1579
               }
            } else if (var11.method18() instanceof Class279) {// 1677
               Class279 var51 = (Class279)var11.method18();// 1267
               var27[var51.method2()] = true;// 1148 1642
            }
         }

         int var52;
         for (int var80 = var52 = var5; var80 < var29; var80 = var52) {// 1407
            var43[var52] = var52++;// 1604
         }

         for (int var81 = var52 = var5; var81 < var29; var81 = ++var52) {// 1547
            int var58;
            if (!var27[var52]) {// 1377
               for (int var82 = var58 = var52 + 1; var82 < var29; var82 = var58) {// 1303
                  int var85 = var58;
                  int var86 = var43[var58] - 1;// 1422
                  var58++;
                  var43[var85] = var86;
               }
            }
         }

         for (Class246 var83 = var11 = var3.method32(); var83 != null; var83 = var11 = var11.method32()) {// 1026 1311 1443
            if (var11.method18() instanceof Class277) {// 1504
               Class277 var54;
               if ((var54 = (Class277)var11.method18()).method2() >= var5) {// 1051 1381
                  var54.method6(var43[var54.method2()]);// 1270
               }
            } else {
               Class279 var55;
               if (var11.method18() instanceof Class279 && (var55 = (Class279)var11.method18()).method2() >= var5) {// 1013 1501 1646
                  var55.method6(var43[var55.method2()]);// 1308
               }
            }
         }

         Class199[] var56 = var4;
         int var59 = var4.length;

         int var61;
         for (int var84 = var61 = 0; var84 < var59; var84 = ++var61) {// 1180
            Class199 var62;
            if ((var62 = var56[var61]).method2() < var5) {// 1617
               var62.method268(var3.method32());
               var62.method29(var3.method37());// 1223 1319
            } else {
               var2.method287(var62);// 1237
            }
         }
      }
   }// 1147

   // $VF: synthetic method
   public void method814(Class206 var1, Class203 var2, Class251 var3) {
      Class415 var11 = this;
      Class246 var19;
      Class246 var10000 = var19 = var3.method32();// 1198

      while (var10000 != null) {// 1553
         if (!var11.method831(var19.method18())) {// 1302
            var10000 = var19;
         } else if (!var11.method829(var19.method431())) {// 1325
            var10000 = var19;
         } else {
            Class221 var4 = var1.method46();// 1219
            Class10 var5 = var19.method18();// 1272
            int var6 = 0;// 1383
            Class246 var7 = null;// 1532
            Class246 var8 = null;
            Class246 var9 = var19.method32();// 1232
            int var10 = 0;// 1509

            while (true) {
               if (var9 != null) {// 1588
                  Class10 var14;
                  if (!((var14 = var9.method18()) instanceof Class51)// 1379 1426
                     && !(var14 instanceof Class33)
                     && !(var14 instanceof Class300)
                     && !(var14 instanceof Class18)
                     && !(var14 instanceof Class293)
                     && !(var14 instanceof Class277)
                     && !(var14 instanceof Class7)
                     && !(var14 instanceof Class268)
                     && !(var14 instanceof Class28)
                     && !(var14 instanceof Class294)
                     && !(var14 instanceof nop)) {
                     var10000 = var8;
                     break;// 1365
                  }

                  if (!var11.method829(var9.method431())) {// 1282
                     var10000 = var8;
                     break;
                  }

                  if (var6 == 1) {// 1362
                     Class10 var15 = var9.method18();// 1527
                     if (var11.method831(var15) && var11.method825(var5, var15, var4)) {// 1280
                        var7 = var9;// 1513
                     }
                  } else if (var6 == 2) {// 1064
                     Class10 var16 = var9.method18();// 1541
                     if (var11.method831(var16) && var11.method825(var5, var16, var4)) {// 1470
                        var10000 = var8 = var9;// 1439
                        break;// 1437
                     }
                  }

                  int var17 = var9.method18().method11(var4);// 1660
                  int var12 = var9.method18().method15(var4);// 1320
                  if (var17 != -2) {// 1625
                     if (var12 == -2) {
                        var10000 = var8;
                        break;
                     }

                     if ((var6 = var6 - var12) < 0) {// 1297 1675
                        var10000 = var8;
                        break;
                     }

                     var6 += var17;// 1493
                     var9 = var9.method32();// 1591
                     if (var10++ <= 777) {// 1171
                        continue;
                     }

                     var10000 = var8;
                     break;
                  }
               }

               var10000 = var8;// 1575
               break;
            }

            Class246 var18 = var10000 != null ? var8 : var7;
            var6 = var8 != null ? 2 : 1;// 1211
            if (var18 == null) {// 1410
               var10000 = var19;
            } else {
               Class348.field1015++;// 1316
               Class246 var20;
               Class246 var10001 = var20 = var19.method32();// 1273
               var11.method833(var20.method37(), var20);// 1016
               var11.method818(var10001.method37(), var18);// 1258

               label91: {
                  try {
                     var3.method272(var20.method37());// 1333
                  } catch (Class224 var13) {// 1294
                     var10000 = var18;// 1243
                     break label91;
                  }

                  var10000 = var18;
               }

               if (var10000.method18().method11(var4) == 1) {
                  if (var6 == 2) {// 1241
                     var10000 = var20;
                     var3.method480(var18, Class119.field82);// 1522
                  } else {
                     var3.method480(var18, Class119.field118);// 1391
                     var10000 = var20;
                  }
               } else {
                  label140: {
                     if (var18.method18().method11(var4) == 2) {// 1586
                        if (var6 == 2) {// 1006
                           var10000 = var20;
                           var3.method480(var18, Class119.field136);// 1526
                           break label140;
                        }

                        var3.method480(var18, Class119.field121);// 1159
                     }

                     var10000 = var20;// 1185
                  }
               }
            }
         }

         var10000 = var19 = var10000.method32();
      }
   }// 1639

   // $VF: synthetic method
   public void method815(Class206 var1, Class203 var2, Class251 var3) {
      Class415 var10 = this;
      var3.method19();// 2312
      Class246 var9;
      Class246 var10000 = var9 = var3.method32();// 2048

      while (var10000 != null) {// 2272
         label74: {
            if (var9.method18() instanceof Class91) {// 2075
               boolean var11 = true;// 2366
               boolean var4 = true;// 2363
               Class246 var6;
               if ((var6 = ((Class91)var9.method18()).method32()).method2() >= var9.method2()) {// 2041 2112 2315
                  var11 = false;
               }

               if (var6.method2() <= var9.method2()) {// 2039
                  var4 = false;
               }

               if (!var11 && !var4) {// 2231
                  var10000 = var9;
                  break label74;
               }

               Class246 var7;
               if ((var7 = var6.method37()) == null) {// 2005 2314
                  var10000 = var9;
                  break label74;
               }

               if (!(var7.method18() instanceof Class89)) {// 2345
                  var10000 = var9;
                  break label74;
               }

               Class89 var12;
               Class246 var8 = (var12 = (Class89)var7.method18()).method32();// 2027 2328
               if (var11) {// 2047
                  if (var8.method2() >= var9.method2()) {// 2036
                     var10000 = var9;
                     break label74;
                  }

                  if (var6.method2() >= var8.method2()) {// 2129
                     var10000 = var9;
                     break label74;
                  }
               } else if (var4 && var8.method2() >= var9.method2()) {// 2128 2349
                  var10000 = var9;
                  break label74;
               }

               if (var8.method18() instanceof Class90) {// 2304
                  var10000 = var9;
                  break label74;
               }

               if (var8.method18() instanceof Class28) {// 2008
                  var10000 = var9;
                  break label74;
               }

               if (var8.method18() instanceof Class294) {// 2144
                  var10000 = var9;
                  break label74;
               }

               if (var8.method18() instanceof Class26) {// 2163
                  var10000 = var9;
                  break label74;
               }

               if (!var10.method829(var6.method37().method431())) {// 2055
                  var10000 = var9;
                  break label74;
               }

               Class348.field1046++;// 2154
               var12.method29(var8.method32());// 2115
               var3.method457(var6.method37(), var8.method18());// 2070
            }

            var10000 = var9;// 2077
         }

         var10000 = var9 = var10000.method32();
      }
   }// 2324

   // $VF: synthetic method
   public static int[] method816(int var0, int var1) {
      int var2 = var0;
      int var4 = var0;// 571
      int var3 = var0;

      for (int var10000 = var0 = 0; var10000 < var1; var10000 = ++var0) {// 44
         if ((var2 >> var0) % 2 == 0) {// 362
            if (Class337.method547() < 0.5) {// 476
               var4 |= 1 << var0;// 542
            } else {
               var3 |= 1 << var0;// 420
            }
         }
      }

      return new int[]{var4, var3};// 62
   }

   // $VF: synthetic method
   public void method817(Class206 var1, Class203 var2, Class251 var3) {
   }// 1095

   // $VF: synthetic method
   public void method818(Class246 var1, Class246 var2) {
      if (var2 != null) {// 2545
         if (var1.method431() != null) {// 2528
            Class200[] var5;
            int var4 = (var5 = var1.method431()).length;

            for (int var10000 = var7 = 0; var10000 < var4; var10000 = ++var7) {// 2427
               Class200 var6;
               if ((var6 = var5[var7]) instanceof Class199) {// 2433
                  var6.method28(var1, var2);// 2548
               }
            }
         }
      }
   }// 2488

   // $VF: synthetic method
   public void method819(Class206 var1, Class203 var2, Class251 var3) {
      Class415 var10 = this;
      Class246 var9;
      Class246 var10000 = var9 = var3.method32();// 1283

      while (var10000 != null) {// 1430
         if (!var10.method831(var9.method18())) {// 1170
            var10000 = var9;
         } else {
            int var4 = 1;// 1558
            Class246 var5;
            var10000 = var5 = var9.method32();// 1217

            while (true) {
               if (var10000 == null) {// 1196
                  var17 = var4;// 1681
                  break;
               }

               if (!var10.method831(var5.method18())) {// 1360
                  var17 = var4;
                  break;
               }

               if (!var10.method825(var5.method18(), var9.method18(), var1.method46())) {// 1429
                  var17 = var4;
                  break;// 1274
               }

               var4++;
               var5 = var5.method32();// 1315
               var10000 = var5;// 1191
            }

            if (var17 < 2) {
               var10000 = var9;
            } else {
               boolean var6 = true;// 1560
               var5 = var9.method32();// 1062
               int var7;
               int var18 = var7 = 1;

               while (true) {
                  if (var18 >= var4) {
                     var19 = var6;// 1118
                     break;
                  }

                  if (!var10.method829(var5.method431())) {// 1621
                     var19 = var6 = false;// 1428
                     break;// 1215
                  }

                  var7++;
                  var5 = var5.method32();// 1549
                  var18 = var7;// 1412
               }

               if (!var19) {
                  var10000 = var9;
               } else {
                  Class348.field1024++;// 1366
                  var5 = var9.method32();// 1010

                  for (int var20 = var7 = 1; var20 < var4; var20 = var7) {// 1047
                     var10.method818(var5, var9);// 1341

                     label70: {
                        try {
                           var3.method272(var5);// 1150
                        } catch (Class224 var8) {
                           var10000 = var9;// 1389
                           break label70;
                        }

                        var10000 = var9;
                     }

                     var10000 = var10000.method32();
                     var7++;
                     var5 = var10000;
                  }

                  for (int var23 = var7 = 1; var23 < var4; var23 = ++var7) {// 1245
                     if (var9.method18().method11(var1.method46()) == 1) {// 1616
                        var3.method480(var9, Class119.field113);// 1367
                     } else if (var9.method18().method11(var1.method46()) == 2) {// 1296
                        var3.method480(var9, Class119.field91);// 1228
                     }
                  }

                  var10000 = var9;// 1238
               }
            }
         }

         var10000 = var9 = var10000.method32();
      }
   }// 1610

   // $VF: synthetic method
   public void method820(Class206 var1, Class203 var2, Class251 var3) {
      Class415 var13 = this;
      Class246 var12;
      Class246 var10000 = var12 = var3.method32();// 2044

      while (var10000 != null) {// 2236
         if (!(var12.method18() instanceof Class28)) {// 2183
            var10000 = var12;
         } else {
            String var4 = ((Class28)var12.method18()).method8(var1.method46()).method93();// 2024
            if (!"java.lang.StringBuffer".equals(var4) && !"java.lang.StringBuilder".equals(var4)) {// 2121
               var10000 = var12;
            } else {
               String var5 = "L" + var4.replace('.', '/') + ";";// 2094
               if (var12.method32() == null) {// 2355
                  var10000 = var12;
               } else if (!(var12.method32().method18() instanceof dup)) {// 2033
                  var10000 = var12;
               } else if (var12.method32().method32() == null) {// 1995
                  var10000 = var12;
               } else if (!(var12.method32().method32().method18() instanceof Class289)) {// 2209
                  var10000 = var12;
               } else {
                  Class289 var6 = (Class289)var12.method32().method32().method18();// 2091
                  Class221 var7 = var1.method46();// 2197
                  if (!var4.equals(var6.method521(var7))) {// 2249
                     var10000 = var12;
                  } else if (!"<init>".equals(var6.method12(var7))) {// 2211
                     var10000 = var12;
                  } else if (!"()V".equals(var6.method518(var7))) {// 2261
                     var10000 = var12;
                  } else {
                     int var14 = 0;// 2226
                     Class246 var8 = null;// 1985
                     Class246 var9;
                     var10000 = var9 = var12.method32().method32().method32();// 2132

                     while (true) {
                        label111:
                        if (var10000 != null) {// 1983
                           Class10 var10;
                           if (!((var10 = var9.method18()) instanceof Class51)// 2124 2295
                              && !(var10 instanceof Class33)
                              && !(var10 instanceof Class300)
                              && !(var10 instanceof Class18)
                              && !(var10 instanceof Class293)
                              && !(var10 instanceof Class277)
                              && !(var10 instanceof Class7)
                              && !(var10 instanceof Class268)
                              && !(var10 instanceof Class28)
                              && !(var10 instanceof Class294)
                              && !(var10 instanceof nop)) {
                              var10000 = var8;
                              break;// 2051
                           }

                           if (!var13.method829(var9.method431())) {// 2341
                              var10000 = var8;
                              break;
                           }

                           if (var9.method18() instanceof Class292) {// 2069
                              Class292 var16 = (Class292)var9.method18();// 2043
                              if (var4.equals(var16.method521(var7))// 1991
                                 && "append".equals(var16.method12(var7))
                                 && ("(Ljava/lang/String;)" + var5).equals(var16.method518(var7))) {
                                 if (var14 == 1) {// 2284
                                    var10000 = var8 = var9;// 2253
                                    break;
                                 }
                                 break label111;
                              }
                           }

                           int var17 = var9.method18().method11(var7);// 2178
                           int var11 = var9.method18().method15(var7);// 2123
                           if (var17 != -2) {// 1988
                              if (var11 == -2) {
                                 var10000 = var8;
                                 break;
                              }

                              int var15;
                              if ((var15 = var14 - var11) < 0) {// 1984 2224
                                 var10000 = var8;
                                 break;
                              }

                              var14 = var15 + var17;// 2101
                              var10000 = var9 = var9.method32();// 2203
                              continue;// 2336
                           }
                        }

                        var10000 = var8;// 2263
                        break;
                     }

                     if (var10000 == null) {
                        var10000 = var12;
                     } else {
                        Class348.field1027++;// 2149
                        var3.method480(var12.method32().method32(), Class119.field78);// 2218
                        ((Class292)var8.method18()).method6(var7.method408(var4, "insert", "(ILjava/lang/String;)" + var5));// 1975
                        var10000 = var12;// 2131
                     }
                  }
               }
            }
         }

         var10000 = var12 = var10000.method32();
      }
   }// 2347

   // $VF: synthetic method
   public void method821(Class206 var1, Class203 var2, Class251 var3) {
      for (Class246 var10000 = var4 = var3.method32(); var10000 != null; var10000 = var4 = var4.method32()) {// 2068 2228 2323
         for (int var6 = var5 = 0; var6 < 1 + Class337.method549(3); var6 = var5) {// 2118
            var3.method457(var4, new bipush((byte)(Class337.method549(120) - 120)));// 2104
            var5++;
            var3.method457(var4, Class119.field40);// 2085
         }
      }
   }// 2319

   // $VF: synthetic method
   public void method822(Class206 var1, Class203 var2, Class251 var3) {
      Class415 var9 = this;
      Class246 var14;
      Class246 var10000 = var14 = var3.method32();// 740

      while (var10000 != null) {// 732
         if (!(var14.method18() instanceof aload_x)) {// 869
            var10000 = var14;
         } else if (!var9.method829(var14.method431())) {// 911
            var10000 = var14;
         } else {
            Class221 var4 = var1.method46();// 947
            int var5 = var14.method18().method11(var4);// 908
            Class246 var6 = null;// 907
            Class246 var7 = var14.method32();// 909
            int var8 = 0;// 837

            while (true) {
               if (var7 != null) {// 962
                  Class10 var11;
                  if (!((var11 = var7.method18()) instanceof Class51)// 739 793
                     && !(var11 instanceof Class33)
                     && !(var11 instanceof Class300)
                     && !(var11 instanceof Class18)
                     && !(var11 instanceof Class293)
                     && !(var11 instanceof Class280)
                     && !(var11 instanceof Class7)
                     && !(var11 instanceof Class28)
                     && !(var11 instanceof Class294)
                     && !(var11 instanceof nop)
                     && !(var11 instanceof pop)
                     && !(var11 instanceof pop2)) {
                     var10000 = var6;
                     break;// 807
                  }

                  if (!var9.method829(var7.method431())) {// 871
                     var10000 = var6;
                     break;
                  }

                  Class10 var12;
                  if (var5 == 0// 683
                     && (
                        (var12 = var7.method18()) instanceof Class280// 839 918
                           || var12 instanceof Class18
                           || var12 instanceof ldc
                           || var12 instanceof ldc2_w
                           || var12 instanceof aconst_null
                     )) {
                     var10000 = var6 = var7;// 641
                     break;// 915
                  }

                  int var13 = var7.method18().method11(var4);// 785
                  int var10 = var7.method18().method15(var4);// 946
                  if (var13 != -2) {// 745
                     if (var10 == -2) {
                        var10000 = var6;
                        break;
                     }

                     if ((var5 = var5 - var10) < 0) {// 901 952
                        var10000 = var6;
                        break;
                     }

                     var5 += var13;// 616
                     var7 = var7.method32();// 878
                     if (var8++ <= 777) {// 943
                        continue;
                     }

                     var10000 = var6;
                     break;
                  }
               }

               var10000 = var6;// 830
               break;
            }

            if (var10000 == null) {
               var10000 = var14;
            } else {
               Class348.field1025++;// 957
               var9.method833(var6, var6.method32());// 769
               var10000 = var14;// 922
               var3.method28(var6, var14.method37());
            }
         }

         var10000 = var14 = var10000.method32();// 971
      }
   }// 859

   // $VF: synthetic method
   public boolean method823(Class251 var1, Class246 var2, Class246 var3) {
      int var4 = ((Class277)var2.method18()).method2();// 2499

      for (Class246 var10000 = var6 = var1.method32(); var10000 != null; var10000 = var6 = var6.method32()) {// 2392 2472 2586
         Class10 var5;
         if ((var5 = var6.method18()) instanceof Class277 && ((Class277)var5).method2() == var4 && var6 != var2 && var6 != var3) {// 2409 2438 2482 2513
            return false;// 2507
         }
      }

      return true;// 2485
   }

   // $VF: synthetic method
   public void method824(Class224 var1, Class246 var2) {
      Class246[] var6 = var1.method39();// 2466

      int var3;
      for (int var10000 = var3 = 0; var10000 < var6.length; var10000 = ++var3) {// 2558
         Class200[] var4;
         int var5;
         if ((var4 = var6[var3].method431()) != null) {// 2385 2471
            for (int var7 = var5 = 0; var7 < var4.length; var7 = var5) {// 2480
               Class200 var8 = var4[var5];// 2495
               var5++;
               var8.method28(var6[var3], var2);
            }
         }
      }
   }// 2538

   // $VF: synthetic method
   public boolean method825(Class10 var1, Class10 var2, Class221 var3) {
      if (var1 instanceof Class18 && var2 instanceof Class18) {// 1654
         if (((Class18)var1).method1(var3) == ((Class18)var2).method1(var3) && ((Class18)var1).method27().equals(((Class18)var2).method27())) {// 1590
            return true;// 1225
         }
      } else {
         if (var1 instanceof aconst_null && var2 instanceof aconst_null) {// 1005
            return true;// 1452
         }

         if (var1 instanceof ldc && var2 instanceof ldc) {// 1577
            if (((ldc)var1).method2() == ((ldc)var2).method2()) {// 1634
               return true;// 1518
            }
         } else if (var1 instanceof ldc2_w && var2 instanceof ldc2_w) {// 1546
            if (((ldc2_w)var1).method2() == ((ldc2_w)var2).method2()) {// 1286
               return true;// 1002
            }
         } else if (var1 instanceof Class6 && var2 instanceof Class6 && ((Class6)var1).method2() == ((Class6)var2).method2()) {// 1132 1332
            return true;// 1488
         }
      }

      return false;// 1589
   }

   // $VF: synthetic method
   public void method826(Class206 var1, Class203 var2, Class251 var3) {
      if (var1.method84() <= 50) {// 180
         Class246 var7 = null;// 350
         Class246 var8 = null;
         Class246 var6;
         Class246 var10000 = var6 = var3.method32();// 156

         while (true) {
            if (var10000 == null) {// 3
               var10000 = var7;// 388
               break;
            }

            if (!(var6.method18() instanceof Class112) && !(var6.method18() instanceof Class12)) {// 186
               var10000 = var8;
            } else if (var6.method32() == null) {// 175
               var10000 = var8;
            } else {
               label48: {
                  if (var6.method18() instanceof Class112) {// 276
                     Class112 var5;
                     if ((var5 = (Class112)var6.method18()).method32() == null) {// 167 414
                        var10000 = var8;
                        break label48;
                     }

                     if (Math.abs(var6.method2() - var5.method32().method2()) > 32000) {// 12
                        var10000 = var8;
                        break label48;
                     }
                  }

                  if (var7 == null) {// 139
                     var7 = var6;// 462
                     var10000 = var8;
                  } else {
                     var8 = var6;// 452
                     var10000 = var6;// 254
                  }
               }
            }

            if (var10000 != null) {
               var10000 = var7;
               break;
            }

            var10000 = var6 = var6.method32();// 594
         }

         if (var10000 != null) {
            var3.method480(var7, Class119.field40);// 120
            Class348.field1032++;// 487
            if (var8 != null) {// 479
               var3.method480(var8, Class119.field78);// 347
            }
         }
      }
   }// 529

   // $VF: synthetic method
   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void method827(Class206 var1, Class203 var2, Class251 var3) {
      Class415 var11 = this;
      Class246 var10;
      Class246 var10000 = var10 = var3.method32();// 425

      while (var10000 != null) {// 327
         if (!(var10.method18() instanceof Class271)) {// 383
            var10000 = var10;
         } else if (var10.method32() == null) {// 197
            var10000 = var10;
         } else if (!(var10.method32().method18() instanceof Class280)) {// 140
            var10000 = var10;
         } else {
            Class246 var12 = var10;// 451
            Class246 var4 = var10.method32();// 49
            Class271 var5 = (Class271)var10.method18();// 565
            Class280 var6 = (Class280)var4.method18();// 173
            if (var5.method2() != var6.method2()) {// 448
               var10000 = var10;
            } else if (!var11.method829(var4.method431())) {// 101
               var10000 = var10;
            } else if (!var11.method829(var10.method431())) {// 489
               var10000 = var10;
            } else {
               Class246 var13;
               if ((var13 = var4.method32()) == null) {// 244 562
                  var10000 = var10;
               } else {
                  label84: {
                     label60:
                     if (var11.method823(var3, var10, var4)) {// 194
                        Class348.field1021++;// 397
                        var11.method833(var4, var13);
                        var11.method833(var10, var13);// 566
                        var11.method818(var4, var13);// 531
                        var11.method818(var10, var13);// 229 243

                        label56: {
                           try {
                              var3.method272(var12);// 590
                           } catch (Class224 var9) {
                              try {
                                 var14 = var3;// 344
                                 break label56;
                              } catch (Class224 var8) {
                                 boolean var10001 = false;
                                 break label60;
                              }
                           }

                           var14 = var3;
                        }

                        try {
                           var14.method272(var4);
                        } catch (Class224 var7) {
                           boolean var16 = false;
                           break label60;
                        }

                        var10000 = var13;// 259
                        break label84;// 449
                     }

                     var10000 = var13;// 378
                  }
               }
            }
         }

         var10000 = var10 = var10000.method32();
      }
   }// 490

   // $VF: synthetic method
   public void method794(Class206 var1, Class203 var2, Class251 var3) {
      Class415 var8 = this;
      Class246 var7;
      Class246 var10000 = var7 = var3.method32();// 951

      while (var10000 != null) {// 693
         if (!(var7.method18() instanceof aload_x)) {// 963
            var10000 = var7;
         } else if (var7.method32() == null) {// 707
            var10000 = var7;
         } else if (var7.method32().method32() == null) {// 794
            var10000 = var7;
         } else if (var7.method32().method32().method32() == null) {// 831
            var10000 = var7;
         } else if (!(var7.method32().method18() instanceof getfield)) {// 762
            var10000 = var7;
         } else if (!(var7.method32().method32().method18() instanceof aload_x)) {// 784
            var10000 = var7;
         } else if (!(var7.method32().method32().method32().method18() instanceof getfield)) {// 624
            var10000 = var7;
         } else if (((aload_x)var7.method18()).method2() != ((aload_x)var7.method32().method32().method18()).method2()) {// 931
            var10000 = var7;
         } else if (var7.method32().method18().method11(var1.method46()) != 1) {// 648
            var10000 = var7;
         } else {
            boolean var4 = true;// 651
            Class246 var5 = var7.method32();// 983
            int var6;
            int var10 = var6 = 1;

            while (true) {
               if (var10 >= 4) {
                  var11 = var4;// 674
                  break;
               }

               if (!var8.method829(var5.method431())) {// 809
                  var11 = var4 = false;// 912
                  break;// 841
               }

               var6++;
               var5 = var5.method32();// 776
               var10 = var6;// 678
            }

            if (!var11) {
               var10000 = var7;
            } else {
               Class348.field1029++;// 714
               var10000 = var7;
               var8.method833(var7.method32().method32(), var7.method32().method32().method32());// 761
               var3.method28(var7.method32(), var7.method32().method32());// 965
               var3.method480(var7.method32().method32(), Class119.field109);// 646
            }
         }

         var10000 = var7 = var10000.method32();// 728
      }
   }// 865

   // $VF: synthetic method
   public void method796(Class206 var1, Class203 var2, Class251 var3, boolean var4) {
      Class415 var11 = this;
      Class246 var17;
      Class246 var10000 = var17 = var3.method32();// 647

      while (var10000 != null) {// 950
         if (!(var17.method18() instanceof aload_x)) {// 727
            var10000 = var17;
         } else {
            int var5 = ((aload_x)var17.method18()).method2();// 750
            if (!var4 && !var11.method829(var17.method431())) {// 853
               var10000 = var17;
            } else {
               Class221 var6 = var1.method46();// 787
               int var7 = var17.method18().method11(var6);// 782
               Vector var8;
               (var8 = new Vector()).add(var17);// 870 929
               Class246 var9 = var17.method32();// 676
               int var10 = 0;// 836

               while (true) {
                  if (var9 != null) {// 956
                     Class10 var13;
                     if (!((var13 = var9.method18()) instanceof Class51)// 639 686
                        && !(var13 instanceof Class33)
                        && !(var13 instanceof Class300)
                        && !(var13 instanceof Class18)
                        && !(var13 instanceof Class293)
                        && !(var13 instanceof Class277)
                        && !(var13 instanceof Class7)
                        && !(var13 instanceof Class268)
                        && !(var13 instanceof Class28)
                        && !(var13 instanceof Class294)
                        && !(var13 instanceof nop)) {
                        var20 = var8;
                        break;// 666
                     }

                     if (!var11.method829(var9.method431())) {// 730
                        var20 = var8;
                        break;
                     }

                     label125: {
                        if (var7 == 0 && var9.method18() instanceof aload_x) {// 845
                           if (!var4) {// 625
                              var10000 = var9;
                              var8.add(var9);// 868
                              break label125;
                           }

                           if (((aload_x)var9.method18()).method2() == var5) {// 802
                              var8.add(var9);// 772
                           }
                        }

                        var10000 = var9;// 979
                     }

                     if (var10000.method18() instanceof astore_x) {
                        if (var4 && ((astore_x)var9.method18()).method2() == var5) {// 819
                           var20 = var8;
                           break;// 814
                        }

                        if (!var4) {// 920
                           var20 = var8;
                           break;// 751
                        }
                     }

                     int var14 = var9.method18().method11(var6);// 896
                     int var12 = var9.method18().method15(var6);// 813
                     if (var14 != -2) {// 611
                        if (var12 == -2) {
                           var20 = var8;
                           break;
                        }

                        if ((var7 = var7 - var12) < 0) {// 669 702
                           var20 = var8;
                           break;
                        }

                        var7 += var14;// 760
                        var9 = var9.method32();// 753
                        if (var10++ <= 777) {// 954
                           continue;
                        }

                        var20 = var8;
                        break;
                     }
                  }

                  var20 = var8;// 858
                  break;
               }

               if (var20.size() < 2) {
                  var10000 = var17;
               } else {
                  if (var8.size() > 1) {// 928
                     Class348.field1022++;
                  }

                  if (var8.size() > 2) {// 630
                     Class348.field1044++;
                  }

                  int var15;
                  int var16;
                  if (var4) {// 765
                     for (int var22 = var15 = var8.size() - 1; var22 >= 1; var22 = var15) {// 815
                        var11.method833((Class246)var8.get(var15), ((Class246)var8.get(var15)).method32());// 650
                        Class246 var10001 = (Class246)var8.get(var15);
                        var15--;
                        var3.method28(var10001, (Class246)var8.get(0));// 747
                     }
                  } else {
                     for (int var23 = var16 = var8.size() - 1; var23 >= 1; var23 = var16) {// 826
                        var11.method833((Class246)var8.get(var16), ((Class246)var8.get(var16)).method32());// 891
                        Class246 var25 = (Class246)var8.get(var16);
                        Object var10002 = var8.get(0);
                        var16--;
                        var3.method28(var25, ((Class246)var10002).method37());// 673
                     }
                  }

                  var10000 = var17;// 736
               }
            }
         }

         var10000 = var17 = var10000.method32();
      }
   }// 759

   // $VF: synthetic method
   public void method795(Class206 var1, Class203 var2, Class251 var3) {
      Class348.field1045++;// 1247
      Class199[] var15;
      if ((var15 = var2.method284()) != null) {// 1372 1598
         if (var15.length != 0) {// 1088
            boolean[] var4 = new boolean[var2.method30()];// 1405 1680
            int var5 = var2.method130().length;// 1543
            if (!var2.method254()) {// 1109
               var5++;
            }

            Class138[] var10;
            int var7 = (var10 = var2.method277()).length;

            int var8;
            for (int var10000 = var8 = 0; var10000 < var7; var10000 = ++var8) {// 1021
               Class138 var9;
               if ((var9 = var10[var8]) == Class138.field578 || var9 == Class138.field576) {// 1120
                  var5++;
               }
            }

            Class199[] var11 = var15;
            var7 = var15.length;

            for (int var27 = var8 = 0; var27 < var7; var27 = ++var8) {// 1334
               Class199 var24;
               if ((var24 = var11[var8]).method26() == Class138.field584// 1344
                  || var24.method26() == Class138.field594
                  || var24.method26() == Class138.field581
                  || var24.method26() == Class138.field585) {
                  var24.method266(Class138.field591);// 1440
               }
            }

            for (Class246 var28 = var12 = var3.method32(); var28 != null; var28 = var12 = var12.method32()) {// 1207 1406 1421
               if (var12.method18() instanceof Class277) {// 1478
                  Class277 var18 = (Class277)var12.method18();// 1127
                  var4[var18.method2()] = true;// 1146
               }
            }

            Class199[] var19 = var15;
            var8 = var15.length;

            int var25;
            for (int var29 = var25 = 0; var29 < var8; var29 = ++var25) {// 1295
               Class199 var13;
               if ((var13 = var19[var25]).method2() >= var5 && !var4[var13.method2()]) {// 1114 1364
                  var2.method287(var13);// 991
                  Class348.field1034++;// 1629
               }
            }

            var3.method19();// 1425
            Class199[] var20 = var15;
            var8 = var15.length;

            for (int var30 = var25 = 0; var30 < var8; var30 = ++var25) {// 1408
               Class199 var14;
               if ((var14 = var20[var25]).method37() != null && var14.method32() != null && var14.method37().method2() > var14.method32().method2()) {// 1424
                  Class246 var16 = var14.method37();// 1030
                  var14.method268(var14.method32());// 1264
                  var14.method29(var16);// 1130
               }
            }
         }
      }
   }// 1187

   // $VF: synthetic method
   public void method828(Class200[] var1, Class246 var2, Class246 var3) {
      if (var1 != null) {// 2494
         for (int var10000 = var5 = 0; var10000 < var1.length; var10000 = var5) {// 2420
            Class200 var6 = var1[var5];// 2448
            var5++;
            var6.method28(var2, var3);
         }
      }
   }// 2404

   // $VF: synthetic method
   public void method797(Class206 var1, Class203 var2, Class251 var3) {
      Class415 var6 = this;
      Class246 var5;
      Class246 var10000 = var5 = var3.method32();// 2307

      while (var10000 != null) {// 2160
         if (!(var5.method18() instanceof Class89)) {// 2076
            var10000 = var5;
         } else if (!var6.method829(var5.method431())) {// 2346
            var10000 = var5;
         } else {
            label29: {
               Class246 var4;
               Class89 var7;
               if ((var4 = (var7 = (Class89)var5.method18()).method32()) != null) {// 2066 2188 2266
                  if (var4.method32() == null) {
                     var10000 = var5;
                     break label29;
                  }

                  if (!(var4.method18() instanceof Class280)) {// 2235
                     var10000 = var5;
                     break label29;
                  }

                  var7.method29(var4.method32());// 2096
                  var3.method481(var7, var4.method18().method18());// 2052
                  Class348.field1046++;// 1998
               }

               var10000 = var5;// 2059
            }
         }

         var10000 = var5 = var10000.method32();
      }
   }// 2367

   // $VF: synthetic method
   public void method798(Class206 var1, Class203 var2, Class251 var3) {
      Class415 var6 = this;
      Class199[] var14;
      if ((var14 = var2.method284()) != null) {// 1151 1592
         if (var14.length != 0) {// 1214
            boolean[] var4 = new boolean[var2.method30()];// 1070 1124
            int var5 = var2.method130().length;// 1608
            if (!var2.method254()) {// 1613
               var5++;
            }

            Class138[] var11;
            int var7 = (var11 = var2.method277()).length;

            int var8;
            for (int var10000 = var8 = 0; var10000 < var7; var10000 = ++var8) {// 1557
               Class138 var9;
               if ((var9 = var11[var8]) == Class138.field578 || var9 == Class138.field576) {// 1335
                  var5++;
               }
            }

            Class246 var12;
            Class246 var24 = var12 = var3.method32();// 1279

            while (var24 != null) {// 1086
               if (var12.method18() instanceof Class280) {// 1090
                  Class280 var16 = (Class280)var12.method18();// 1516
                  var24 = var12;
                  var4[var16.method2()] = true;// 1531
               } else {
                  if (var12.method18() instanceof Class279) {// 1587
                     Class279 var17 = (Class279)var12.method18();// 1300
                     var4[var17.method2()] = true;// 1556
                  }

                  var24 = var12;// 1340
               }

               var24 = var12 = var24.method32();
            }

            Class246 var13;
            var24 = var13 = var3.method32();// 1352

            while (var24 != null) {// 1117
               if (var13.method18() instanceof Class271) {// 1499
                  Class271 var18 = (Class271)var13.method18();// 1651
                  if (!var4[var18.method2()] && var18.method2() >= var5) {// 1628
                     if (var18 instanceof astore_x || var18 instanceof istore_x || var18 instanceof fstore_x) {// 1630
                        var13.method432(Class119.field40);// 1562
                     } else if (var18 instanceof lstore_x || var18 instanceof dstore_x) {// 1231
                        var13.method432(Class119.field107);// 1404
                     }
                  }
               } else if (var13.method18() instanceof Class286) {// 1011
                  Class286 var19 = (Class286)var13.method18();// 1640
                  if (!var4[var19.method2()] && var19.method2() >= var5) {// 1576
                     Class246 var21 = var13;// 1059
                     var13 = var13.method32();// 1356
                     if (var6.method829(var21.method431())) {// 1348
                        try {
                           var3.method272(var21);// 1647
                        } catch (Class224 var10) {// 1386
                           var24 = var13;
                           continue;// 1029
                        }

                        var24 = var13;
                        continue;// 1378
                     }

                     var21.method432(Class119.field39);// 1458
                     var24 = var13;
                     continue;// 1251
                  }
               }

               var24 = var13 = var13.method32();// 1233
            }

            Class199[] var20 = var14;
            var8 = var14.length;

            int var23;
            for (int var27 = var23 = 0; var27 < var8; var27 = ++var23) {// 1023
               Class199 var15;
               if ((var15 = var20[var23]).method2() >= var5 && !var4[var15.method2()]) {// 1099 1456
                  var2.method287(var15);// 1212
                  Class348.field1038++;// 1329
               }
            }
         }
      }
   }// 1597

   // $VF: synthetic method
   public void method799(Class206 var1, Class203 var2, Class251 var3) {
      Class246 var11;
      Class246 var10000 = var11 = var3.method32();// 2082

      while (var10000 != null) {// 2028
         if (!(var11.method18() instanceof Class113)) {// 2280
            var10000 = var11;
         } else {
            label82: {
               Class246[] var4;
               Class113 var12;
               if ((var4 = (var12 = (Class113)var11.method18()).method39()) != null) {// 2213 2223 2309
                  if (var4.length == 0) {
                     var10000 = var11;
                     break label82;
                  }

                  Class246 var5 = null;// 2006
                  Class246 var6 = null;// 2064
                  Class246[] var13;
                  int var7 = (var13 = var4).length;

                  int var8;
                  for (int var17 = var8 = 0; var17 < var7; var17 = ++var8) {// 2009
                     Class246 var10;
                     if ((var10 = var13[var8]) != null// 2032
                        && var5 == null
                        && !(var10.method18() instanceof Class90)
                        && !(var10.method18() instanceof Class28)
                        && var10 != var12.method32()) {
                        var5 = var10;// 2194
                     }

                     if (var10 != null// 2325
                        && var10.method37() != null
                        && (var10.method37().method18() instanceof Class112 || var10.method37().method18() instanceof Class12)) {
                        var6 = var10.method37();// 2369
                     }
                  }

                  if (var5 != null && var6 != null) {// 2265
                     var3.method19();// 1999
                     if (Math.abs(var5.method2() - var6.method2()) > 32000) {// 2331
                        var6 = null;// 2350
                     }
                  }

                  if (var5 != null && var6 != null) {// 2252
                     Class348.field1033++;// 2107
                     Class90 var15 = Class120.method73((short)154, null);// 2037
                     var3.method469(var5, var15);// 2337
                     Class246 var16 = var3.method480(var5, new iconst_x(0));// 2227
                     var15.method29(var3.method469(var6, new Class112(var16)));// 2074
                     var10000 = var11;
                     break label82;// 2029
                  }

                  if (var5 != null) {
                     Class348.field1033++;// 2352
                     Class246 var14 = var3.method480(var5, new iconst_x(0));// 2330
                     var3.method469(var14, new Class104(var14));// 2019
                  }
               }

               var10000 = var11;// 2340
            }
         }

         var10000 = var11 = var10000.method32();
      }
   }// 2169

   // $VF: synthetic method
   public boolean method829(Class200[] var1) {
      if (var1 == null) {// 2444
         return true;
      } else {
         for (int var10000 = var4 = 0; var10000 < var1.length; var10000 = ++var4) {// 2493
            Class200 var3;
            if (!((var3 = var1[var4]) instanceof Class201) && !(var3 instanceof Class199)) {// 2417 2431
               return false;// 2553
            }
         }

         return true;// 2515
      }
   }

   // $VF: synthetic method
   public void method800(Class206 var1, Class203 var2, Class251 var3) {
      Class415 var13 = this;
      Class246 var8;
      Class246 var10000 = var8 = var3.method32();// 1714

      while (var10000 != null) {// 1743
         if (!(var8.method18() instanceof Class286)) {// 1896
            var10000 = var8;
         } else if (!var13.method829(var8.method431())) {// 1944
            var10000 = var8;
         } else {
            Class286 var14 = (Class286)var8.method18();// 1955
            int var4 = 0;// 1800
            boolean var5 = false;// 1872
            Class246 var6 = var8.method37();// 1856

            label143:
            while (true) {
               for (Class246 var19 = var6; var19 != null && var4 < 3; var4++) {// 1732
                  if (!var13.method829(var6.method431())) {// 1734
                     var20 = var5;
                     break label143;
                  }

                  if (var6.method18() instanceof Class90) {// 1703
                     var20 = var5;
                     break label143;
                  }

                  if (var6.method18() instanceof Class277 && ((Class277)var6.method18()).method2() == var14.method2()) {// 1718 1781
                     var20 = var5;
                     break label143;
                  }

                  if (var6.method18() instanceof Class33) {// 1859
                     var20 = var5 = true;// 1950
                     break label143;// 1710
                  }

                  if ((var6 = var6.method37()) == null) {// 1760 1770
                     continue label143;
                  }

                  var19 = var6;
               }

               var20 = var5;// 1810
               break;
            }

            if (var20) {
               Class246 var12 = var8.method32();// 1958
               var10000 = var12;
               var13.method833(var12.method37(), var12);// 1844
               var3.method28(var12.method37(), var6.method37());// 1922
               Class348.field1028++;// 1729
               Class348.field1016++;// 1753
            } else {
               label157: {
                  int var7 = 0;// 1802
                  if (var4 < 3) {// 1689
                     var5 = false;// 1967
                     var6 = var8.method32();// 1685

                     label117:
                     while (true) {
                        for (Class246 var21 = var6; var21 != null && var7 < 3; var7++) {// 1797
                           if (!var13.method829(var6.method431())) {// 1924
                              var22 = var5;
                              break label117;
                           }

                           if (var6.method18() instanceof Class90) {// 1902
                              var22 = var5;
                              break label117;
                           }

                           if (var6.method18() instanceof Class277 && ((Class277)var6.method18()).method2() == var14.method2()) {// 1793 1879
                              var22 = var5;
                              break label117;
                           }

                           if (var7 > 0 && var6.method18() instanceof Class33) {// 1964
                              var22 = var5 = true;// 1853
                              break label117;// 2109
                           }

                           if ((var6 = var6.method32()) == null) {// 2116 2338
                              continue label117;
                           }

                           var21 = var6;
                        }

                        var22 = var5;// 2058
                        break;
                     }

                     if (var22) {
                        var13.method833(var8, var8.method32());// 2222
                        var3.method28(var8, var6.method37());// 2234
                        Class348.field1028++;// 2045
                        Class348.field1016++;// 2097
                        var10000 = var6;
                        break label157;// 2321
                     }
                  }

                  if (var4 == 0 && var7 == 0) {// 2326
                     var10000 = var8;
                  } else {
                     Class348.field1028++;// 2078
                     var13.method833(var8, var8.method32());// 2100
                     if (var4 > 3) {// 2214
                        var4 = 3;
                     }

                     if (var7 > 3) {// 2285
                        var7 = 3;
                     }

                     if (var4 == 3) {// 2207
                        Class246 var9 = var8.method32();// 2219
                        Class246 var10002 = var9.method37();
                        var10000 = var9;
                        var3.method28(var10002, var9.method37().method37().method37().method37().method37());// 2127
                     } else if (var7 == 3) {// 1972
                        var10000 = var8;
                        var3.method28(var8, var8.method32().method32().method32());// 2081
                     } else if (var4 == 2) {// 2108
                        Class246 var10 = var8.method32();// 2333
                        Class246 var24 = var10.method37();
                        var10000 = var10;
                        var3.method28(var24, var10.method37().method37().method37().method37());// 2305
                     } else if (var7 == 2) {// 2147
                        var10000 = var8;
                        var3.method28(var8, var8.method32().method32());// 2351
                     } else if (var4 == 1) {// 2238
                        Class246 var11 = var8.method32();// 2159
                        Class246 var25 = var11.method37();
                        var10000 = var11;
                        var3.method28(var25, var11.method37().method37().method37());// 2220
                     } else {
                        if (var7 == 1) {// 2088
                           var3.method28(var8, var8.method32());// 2344
                        }

                        var10000 = var8;// 2021
                     }
                  }
               }
            }
         }

         var10000 = var8 = var10000.method32();
      }
   }// 2177

   // $VF: synthetic method
   public static int[] method830(int var0) {
      int var3 = var0;
      int var1 = 0;// 453
      int var2 = 0;

      for (int var10000 = var0 = 0; var10000 < 32; var10000 = ++var0) {// 354
         if ((var3 >> var0) % 2 == 1) {// 224
            if (Class337.method547() < 0.5) {// 494
               var1 |= 1 << var0;// 560
            } else {
               var2 |= 1 << var0;// 71
            }
         }
      }

      return new int[]{var1, var2};// 441
   }

   // $VF: synthetic method
   public void method801(Class206 var1, Class203 var2, Class251 var3) {
      Class199[] var4;
      if ((var4 = var2.method284()) != null) {// 1220 1632
         if (var4.length != 0) {// 1072
            int var18;
            if ((var18 = var2.method30()) >= 4) {// 996 1487
               int var5 = var2.method130().length;// 1252
               if (!var2.method254()) {// 1327
                  var5++;
               }

               Class138[] var16;
               int var6 = (var16 = var2.method277()).length;

               int var7;
               for (int var10000 = var7 = 0; var10000 < var6; var10000 = ++var7) {// 1322
                  Class138 var11;
                  if ((var11 = var16[var7]) == Class138.field578 || var11 == Class138.field576) {// 1155
                     var5++;
                  }
               }

               if (var5 < 4) {// 1305
                  int[] var17 = new int[var18];// 1460
                  boolean[] var20 = new boolean[var18];// 1606

                  for (Class246 var26 = var21 = var3.method32(); var26 != null; var26 = var21 = var21.method32()) {// 1206 1572 1650
                     if (var21.method18() instanceof Class280 || var21.method18() instanceof Class271) {// 1240
                        Class277 var12 = (Class277)var21.method18();// 1094
                        int var9;
                        var17[var9 = var12.method2()]++;// 1131
                        if ((var12.method11(var1.method46()) == 2 || var12.method15(var1.method46()) == 2) && var9 + 1 < var18) {// 1351 1626
                           var20[var9] = true;
                           var20[var9 + 1] = true;// 1113 1584
                        }
                     }
                  }

                  for (int var27 = var13 = 0; var27 < var17.length; var27 = var13) {// 1331
                     int var10001 = var13;
                     int var10002 = var17[var13] << 16 | var13;
                     var13++;
                     var17[var10001] = var10002;
                  }

                  Arrays.sort(var17, 4, var18);// 1537

                  for (int var28 = var14 = var5; var28 < 4; var28 = ++var14) {// 1174
                     if (!var20[var14]) {// 1166
                        int var23 = var17[var14] >> 16;// 1037

                        for (int var29 = var15 = var18 - 1; var29 >= 4; var29 = --var15) {// 1417
                           var5 = var17[var15] & 65535;// 1594
                           int var10 = var17[var15] >> 16;// 1472
                           if (var5 > 3 && !var20[var5] && var10 > var23) {// 1497
                              Class348.field1043++;// 1657
                              var17[var15] = 0;// 1420
                              Class246 var22;
                              Class246 var30 = var22 = var3.method32();// 1485

                              while (var30 != null) {// 1318
                                 label86: {
                                    if (var22.method18() instanceof Class277) {// 1172
                                       Class277 var24;
                                       if ((var24 = (Class277)var22.method18()).method2() == var14) {// 1041 1309
                                          var24.method6(var5);// 989
                                       } else if (var24.method2() == var5) {// 1961
                                          var24.method6(var14);// 1858
                                       }
                                    } else if (var22.method18() instanceof Class279) {// 1706
                                       Class279 var25;
                                       if ((var25 = (Class279)var22.method18()).method2() == var14) {// 1848 1886
                                          var31 = var22;
                                          var25.method6(var5);// 1683
                                          break label86;
                                       }

                                       if (var25.method2() == var5) {// 1728
                                          var25.method6(var14);// 1782
                                       }
                                    }

                                    var31 = var22;// 1840
                                 }

                                 var30 = var22 = var31.method32();
                              }
                              break;
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }// 1932

   // $VF: synthetic method
   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void method802(Class206 var1, Class203 var2, Class251 var3) {
      Class415 var12 = this;
      Class246 var11;
      Class246 var10000 = var11 = var3.method32();// 372

      while (var10000 != null) {// 111
         if (!(var11.method18() instanceof Class271)) {// 304
            var10000 = var11;
         } else if (var11.method32() == null) {// 153
            var10000 = var11;
         } else if (!(var11.method32().method18() instanceof Class280)) {// 477
            var10000 = var11;
         } else {
            Class246 var13 = var11;// 53
            Class246 var4 = var11.method32();// 584
            Class271 var5 = (Class271)var11.method18();// 200
            Class280 var6 = (Class280)var4.method18();// 84
            if (var5.method2() != var6.method2()) {// 267
               var10000 = var11;
            } else if (!var12.method829(var4.method431())) {// 393
               var10000 = var11;
            } else if (!var12.method829(var11.method431())) {// 419
               var10000 = var11;
            } else {
               Class246 var14;
               if ((var14 = var4.method32()) == null) {// 230 402
                  var10000 = var11;
               } else {
                  label74:
                  if (var12.method823(var3, var11, var4)) {// 395
                     Class348.field1021++;// 43
                     var12.method833(var4, var14);
                     var12.method833(var11, var14);// 322
                     var12.method818(var4, var14);// 74
                     var12.method818(var11, var14);// 54 317

                     label71: {
                        label70: {
                           label69: {
                              try {
                                 var3.method272(var13);// 526
                              } catch (Class224 var10) {
                                 try {
                                    var17 = var3;// 294
                                    break label69;
                                 } catch (Class224 var9) {
                                    boolean var10001 = false;
                                    break label70;
                                 }
                              }

                              var17 = var3;
                           }

                           try {
                              var17.method272(var4);
                              break label71;
                           } catch (Class224 var8) {
                              boolean var18 = false;
                           }
                        }

                        var10000 = var14;// 112 342
                        break label74;// 96
                     }

                     var10000 = var14;
                  } else {
                     label111: {
                        Class348.field1042++;// 581
                        Class415 var15;
                        if (!(var5 instanceof astore_x) && !(var5 instanceof fstore_x) && !(var5 instanceof istore_x)) {// 359
                           if (var5 instanceof dstore_x || var5 instanceof lstore_x) {// 313
                              var3.method457(var11, Class119.field91);// 277
                           }

                           var15 = var12;// 302
                        } else {
                           var3.method457(var11, Class119.field113);// 408
                           var15 = var12;
                        }

                        var15.method833(var4, var14);
                        var12.method818(var4, var11);// 203

                        try {
                           var3.method272(var4);// 597
                        } catch (Class224 var7) {
                           var10000 = var14;// 165
                           break label111;
                        }

                        var10000 = var14;
                     }
                  }
               }
            }
         }

         var10000 = var11 = var10000.method32();
      }
   }// 79

   // $VF: synthetic method
   public boolean method831(Class10 var1) {
      return var1 instanceof Class18 || var1 instanceof aconst_null || var1 instanceof ldc || var1 instanceof ldc2_w;// 1218
   }

   // $VF: synthetic method
   public void method803(Class206 var1, Class203 var2, Class251 var3) {
      Class415 var12 = this;
      Class246 var11;
      Class246 var10000 = var11 = var3.method32();// 617

      while (var10000 != null) {// 719
         if (!(var11.method18() instanceof Class280)) {// 919
            var10000 = var11;
         } else if (var11.method32() == null) {// 879
            var10000 = var11;
         } else {
            Class246 var13;
            if ((var13 = var11.method32()).method32() == null) {// 620 803
               var10000 = var11;
            } else {
               Class246 var4;
               if ((var4 = var13.method32()).method32() == null) {// 799 876
                  var10000 = var11;
               } else {
                  Class246 var5;
                  if ((var5 = var4.method32()).method32() == null) {// 886 964
                     var10000 = var11;
                  } else {
                     Class246 var6;
                     if ((var6 = var5.method32()).method32() == null) {// 704 887
                        var10000 = var11;
                     } else {
                        Class246 var7 = var6.method32();// 884
                        if (!(var13.method18() instanceof Class271)) {// 748
                           var10000 = var11;
                        } else if (!(var4.method18() instanceof Class280)) {// 825
                           var10000 = var11;
                        } else if (!(var5.method18() instanceof Class271)) {// 872
                           var10000 = var11;
                        } else if (!(var6.method18() instanceof Class280)) {// 860
                           var10000 = var11;
                        } else if (!(var7.method18() instanceof Class271)) {// 898
                           var10000 = var11;
                        } else if (((Class280)var11.method18()).method2() != ((Class271)var5.method18()).method2()) {// 723
                           var10000 = var11;
                        } else if (((Class271)var13.method18()).method2() != ((Class280)var6.method18()).method2()) {// 615
                           var10000 = var11;
                        } else if (((Class280)var4.method18()).method2() != ((Class271)var7.method18()).method2()) {// 798
                           var10000 = var11;
                        } else {
                           boolean var14 = true;// 981
                           var5 = var11.method32();// 699
                           int var8;
                           int var17 = var8 = 1;

                           while (true) {
                              if (var17 >= 6) {
                                 var18 = var14;// 656
                                 break;
                              }

                              if (!var12.method829(var5.method431())) {// 652
                                 boolean var15;
                                 var18 = var15 = false;// 972
                                 break;// 679
                              }

                              var8++;
                              var5 = var5.method32();// 623
                              var17 = var8;// 970
                           }

                           if (!var18) {
                              var10000 = var11;
                           } else {
                              label124: {
                                 Class348.field1014++;// 877
                                 var12.method833(var13, var11);
                                 var12.method818(var13, var11);// 716 810

                                 label93: {
                                    try {
                                       var3.method272(var13);// 743
                                    } catch (Class224 var10) {// 644
                                       var19 = var12;// 701
                                       break label93;
                                    }

                                    var19 = var12;
                                 }

                                 var19.method833(var6, var7);
                                 var12.method818(var6, var7);// 638

                                 try {
                                    var3.method272(var6);// 913
                                 } catch (Class224 var9) {// 832
                                    var10000 = var11;// 773
                                    break label124;
                                 }

                                 var10000 = var11;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         var10000 = var11 = var10000.method32();
      }
   }// 935

   // $VF: synthetic method
   public void method804(Class206 var1, Class203 var2, Class251 var3) {
      Class199[] var4;
      if ((var4 = var2.method284()) != null) {// 1780 1846
         if (var4.length != 0) {// 1697
            int var21;
            if ((var21 = var2.method30()) >= 2) {// 1807 1940
               int[] var5 = new int[var21];// 1716
               boolean[] var6 = new boolean[var21];// 1947
               Class138[] var7 = new Class138[var21];// 1837
               int var8 = 0;// 1854
               if (!var2.method254()) {// 1759
                  var7[0] = Class138.field583;// 1868
                  var8 = 1;// 1779
               }

               int var9 = var2.method130().length;// 1722
               if (!var2.method254()) {// 1900
                  var9++;
               }

               Class138[] var18;
               int var10 = (var18 = var2.method277()).length;

               for (int var10000 = var13 = 0; var10000 < var10; var10000 = ++var13) {// 1912
                  Class138 var12 = var18[var13];
                  var7[var8++] = var12;// 1704 1913
                  if (var12 == Class138.field578 || var12 == Class138.field576) {// 1766
                     int var10001 = var8 - 1;
                     boolean var37 = var6[var8] = true;
                     var9++;// 1901
                     var6[var10001] = var37;// 1755
                     var7[var8++] = var12;// 1788 1931
                  }
               }

               for (Class246 var29 = var19 = var3.method32(); var29 != null; var29 = var19 = var19.method32()) {// 1726 1777 1935
                  if (var19.method18() instanceof Class280 || var19.method18() instanceof Class271) {// 1778
                     Class277 var25 = (Class277)var19.method18();// 1936
                     int var14;
                     var5[var14 = var25.method2()]++;// 1698 1942
                     if (var7[var14] == null) {// 1741
                        var7[var14] = var25.method1(var1.method46());
                     }

                     if ((var25.method11(var1.method46()) == 2 || var25.method15(var1.method46()) == 2) && var14 + 1 < var21) {// 1916
                        var6[var14] = true;
                        var6[var14 + 1] = true;// 1869 1905
                     }
                  }
               }

               for (int var30 = var10 = 0; var30 < var5.length; var30 = var10) {// 1773
                  int var36 = var10;
                  int var38 = var5[var10] << 16 | var10;
                  var10++;
                  var5[var36] = var38;
               }

               Arrays.sort(var5);// 1826
               boolean var27 = false;// 1897

               for (int var31 = var15 = 0; var31 < var9 && !var27; var31 = ++var15) {// 1795 1796 1865
                  int var28;
                  if (var7[var15] != null) {// 1876
                     for (int var32 = var28 = var21 - 1; var32 >= 0; var32 = --var28) {// 1850
                        int var17;
                        if ((var17 = var5[var28] & 65535) > var15 && !var6[var15] && !var6[var17] && var7[var17] != null) {// 1684 1909
                           Class348.field1018++;// 1904
                           Class246 var20;
                           Class246 var33 = var20 = var3.method32();// 1758

                           while (var33 != null) {// 1861
                              label98: {
                                 if (var20.method18() instanceof Class277) {// 1752
                                    Class277 var22;
                                    if ((var22 = (Class277)var20.method18()).method2() == var15) {// 1750 1943
                                       var22.method6(var17);// 1709
                                    } else if (var22.method2() == var17) {// 1878
                                       var22.method6(var15);// 1966
                                    }
                                 } else if (var20.method18() instanceof Class279) {// 1761
                                    Class279 var23;
                                    if ((var23 = (Class279)var20.method18()).method2() == var15) {// 1712 1762
                                       var34 = var20;
                                       var23.method6(var17);// 1941
                                       break label98;
                                    }

                                    if (var23.method2() == var17) {// 1687
                                       var23.method6(var15);// 1877
                                    }
                                 }

                                 var34 = var20;// 1720
                              }

                              var33 = var20 = var34.method32();
                           }

                           Class246 var24 = var3.method32();// 1789
                           if (var17 < var9) {// 1816
                              var3.method457(// 1918
                                 var3.method457(
                                    var3.method457(var3.method457(var24, Class120.method75(var7[var15], var17)), Class120.method75(var7[var17], var15)),// 1822
                                    Class120.method77(var7[var17], var17)// 1820
                                 ),
                                 Class120.method77(var7[var15], var15)// 1911
                              );
                           } else {
                              var3.method457(var3.method457(var24, Class120.method75(var7[var15], var17)), Class120.method77(var7[var15], var15));// 1749 1843
                           }

                           var27 = true;// 1804
                           break;// 1959
                        }
                     }
                  }
               }

               if (var27) {// 1827
                  var15++;// 1956
               }
            }
         }
      }
   }// 1724

   // $VF: synthetic method
   public void method805(Class206 var1, Class203 var2, Class251 var3) {
      Class415 var7 = this;
      Class246 var13;
      Class246 var10000 = var13 = var3.method32();// 770

      while (var10000 != null) {// 708
         if (!(var13.method18() instanceof Class280)) {// 894
            var10000 = var13;
         } else if (var13.method32() == null) {// 749
            var10000 = var13;
         } else if (!(var13.method32().method18() instanceof Class280)) {// 634
            var10000 = var13;
         } else {
            Class246 var14 = var13;// 703
            Class280 var4 = (Class280)var13.method18();// 850
            int var5 = var4.method2();// 692
            int var6 = 1;// 848

            for (Class246 var20 = var10 = var13.method32();// 660
               var20 != null && var10.method18() instanceof Class280 && ((Class280)var10.method18()).method2() == var5;// 672
               var10 = var20
            ) {
               var20 = var10.method32();// 637
               var6++;// 754
            }

            if (var6 == 1) {// 961
               var10000 = var13;
            } else if (var10 == null) {// 622 642
               var10000 = var13;
            } else {
               boolean var15 = true;// 904
               Class246 var11 = var13.method32();// 804
               int var8;
               int var21 = var8 = 1;

               while (true) {
                  if (var21 >= var6) {
                     var22 = var15;// 763
                     break;
                  }

                  if (!var7.method829(var11.method431())) {// 984
                     var22 = var15 = false;// 817
                     break;// 910
                  }

                  var8++;
                  var11 = var11.method32();// 737
                  var21 = var8;// 890
               }

               if (!var22) {
                  var10000 = var13;
               } else {
                  Class348.field1026++;// 767
                  if (var6 > 2) {// 980
                     Class348.field1031++;
                  }

                  Class246 var12 = var13.method32();// 778

                  for (int var23 = var8 = 1; var23 < var6; var23 = var8) {// 640
                     var7.method818(var12, var14);// 606

                     label114: {
                        try {
                           var3.method272(var12);// 789
                        } catch (Class224 var9) {
                           var10000 = var14;// 942
                           break label114;
                        }

                        var10000 = var14;
                     }

                     var10000 = var10000.method32();
                     var8++;
                     var12 = var10000;
                  }

                  if (!(var4 instanceof aload_x) && !(var4 instanceof fload_x) && !(var4 instanceof iload_x)) {// 685
                     if (var4 instanceof dload_x || var4 instanceof lload_x) {// 969
                        for (int var27 = var8 = 1; var27 < var6; var27 = var8) {// 889
                           var8++;
                           var3.method480(var14, Class119.field91);// 658
                        }
                     }
                  } else {
                     var8 = 1;// 916

                     label101:
                     while (true) {
                        int var26 = var8;// 657

                        while (true) {
                           if (var26 >= var6) {
                              break label101;
                           }

                           if (var6 - var8 > 2) {// 621
                              var8 += 2;
                              var3.method480(var14, Class119.field91);// 709
                           }

                           if (var6 - var8 == 2) {// 680
                              var8++;
                              var3.method480(var14, Class119.field118);// 855
                           }

                           if (var6 - var8 != 1) {// 783
                              break;
                           }

                           var8++;
                           var3.method480(var14, Class119.field113);// 786
                           var26 = var8;// 934
                        }
                     }
                  }

                  var10000 = var13;// 1199
               }
            }
         }

         var10000 = var13 = var10000.method32();
      }
   }// 994

   // $VF: synthetic method
   public void method806(Class206 var1, Class203 var2, Class251 var3) {
      Class415 var4 = this;
      var3.method19();
      Class246 var16 = null;// 2102 2148
      Class246 var15;
      Class246 var10000 = var15 = var3.method32();// 2357

      while (var10000 != null) {// 2186
         if (var15.method18() instanceof Class91) {// 2018
            var16 = var15;
         }

         if (!(var15.method18() instanceof Class112)) {// 2137
            var10000 = var15;
         } else {
            label183: {
               Class112 var6 = (Class112)var15.method18();// 2015 2060
               if (var15.method32() != null) {// 2135
                  if (var6.method32() == null) {
                     var10000 = var15;
                     break label183;
                  }

                  if (var15.method32() == var6.method32()) {// 2056
                     var10000 = var15;
                     break label183;
                  }

                  if (var15.method32().method32() == var6.method32()) {// 1980
                     var10000 = var15;
                     break label183;
                  }

                  if (var15.method2() > var6.method32().method2()) {// 2016
                     var10000 = var15;
                     break label183;
                  }

                  Class91 var17 = null;// 1990
                  Class246 var7;
                  if ((var7 = var15.method32()).method431() == null) {// 2073 2360
                     var10000 = var15;
                     break label183;
                  }

                  Class200[] var8;
                  int var9 = (var8 = var7.method431()).length;

                  int var10;
                  for (int var24 = var10 = 0; var24 < var9; var24 = ++var10) {// 2298
                     Class200 var11;
                     if ((var11 = var8[var10]) instanceof Class91) {// 2156
                        var17 = (Class91)var11;
                     }
                  }

                  if (var16 == null) {// 2136
                     var10000 = var15;
                     break label183;
                  }

                  if (var16.method18() != var17) {// 2308
                     var10000 = var15;
                     break label183;
                  }

                  if (var16.method32() != null) {// 2143
                     if (var16.method32().method32() == null) {
                        var10000 = var15;
                        break label183;
                     }

                     label157:
                     if (var16.method32() != var15) {// 2282
                        if (var16.method32().method32() == var15) {
                           var10000 = var15;
                           break label183;
                        }

                        Class246 var18 = var16;// 2221
                        boolean var19 = true;// 2014
                        var10000 = var16;// 1994

                        while (true) {
                           if (var10000 != null) {
                              if (!var19) {// 2320
                                 var27 = var19;
                                 break;
                              }

                              if (var18 != var7) {// 2095
                                 if (!var4.method829(var18.method431())) {// 2300
                                    var27 = var19 = false;// 2212
                                    break;// 2011
                                 }

                                 var10000 = var18 = var18.method32();// 2083
                                 continue;// 2187
                              }

                              Class200[] var21;
                              int var23 = (var21 = var7.method431()).length;

                              int var5;
                              for (int var26 = var5 = 0; var26 < var23; var26 = ++var5) {// 1993
                                 Class200 var12;
                                 if (!((var12 = var21[var5]) instanceof Class201) && !(var12 instanceof Class199) && var12 != var17) {// 2260 2270
                                    var19 = false;// 2294
                                    break;// 2250
                                 }
                              }
                           }

                           var27 = var19;// 2311
                           break;
                        }

                        if (!var27) {
                           var10000 = var15;
                           break label183;
                        }

                        Class10 var22;
                        if ((!((var22 = var7.method18()) instanceof Class280) || !var22.equals(var16.method32().method18()))// 2022 2332
                           && (!var4.method831(var22) || !var4.method825(var22, var16.method32().method18(), var1.method46()))) {
                           if (!(var22 instanceof Class28)) {
                              break label157;
                           }

                           if (!var22.equals(var16.method32().method18())) {
                              var10000 = var15;
                              break label183;// 2030
                           }
                        }

                        if (var22.method11(var1.method46()) != 1) {// 2208
                           var10000 = var15;
                           break label183;
                        }

                        if (var17.method15(var1.method46()) != 1) {// 2302
                           var10000 = var15;
                           break label183;
                        }

                        Class348.field1035++;// 2023
                        var3.method457(var16, var22.method18());// 2277
                        var3.method457(var16, Class119.field109);// 2289
                        var4.method833(var16.method32(), var16.method32().method32());
                        var4.method818(var16.method32(), var16.method32().method32());// 2046 2103

                        label111: {
                           try {
                              var3.method272(var16.method32());// 1997
                           } catch (Class224 var13) {// 2202
                              var28 = var17;// 2286
                              break label111;
                           }

                           var28 = var17;
                        }

                        var28.method29(var7.method32());
                        var4.method833(var7, var7.method32());
                        var4.method818(var7, var7.method32());// 2003 2193

                        try {
                           var3.method272(var7);// 2035
                        } catch (Class224 var14) {// 2339
                           break label157;
                        }

                        var10000 = var15;
                        break label183;// 2130
                     }
                  }
               }

               var10000 = var15;// 2062
            }
         }

         var10000 = var15 = var10000.method32();
      }
   }// 2146

   // $VF: synthetic method
   public void method808(Class206 var1, Class203 var2, Class251 var3) {
      Class415 var17 = this;
      Class246 var14;
      Class246 var10000 = var14 = var3.method32();// 921

      while (var10000 != null) {// 677
         if (!(var14.method18() instanceof pop) && !(var14.method18() instanceof pop2)) {// 689
            var10000 = var14;
         } else if (!var17.method829(var14.method431())) {// 811
            var10000 = var14;
         } else {
            boolean var4 = var14.method18() instanceof pop;// 764
            Class221 var5 = var1.method46();// 821
            int var6 = 0;// 654
            int var7 = 0;// 609
            Class246 var8 = null;// 633
            Class246 var9 = var14.method32();// 684

            while (true) {
               if (var9 != null) {// 892
                  Class10 var10;
                  if (!((var10 = var9.method18()) instanceof Class51)// 818 966
                     && !(var10 instanceof Class33)
                     && !(var10 instanceof Class300)
                     && !(var10 instanceof Class18)
                     && !(var10 instanceof Class293)
                     && !(var10 instanceof Class277)
                     && !(var10 instanceof Class7)
                     && !(var10 instanceof Class268)
                     && !(var10 instanceof Class28)
                     && !(var10 instanceof Class294)
                     && !(var10 instanceof nop)) {
                     var21 = var7;
                     break;// 927
                  }

                  if (!var17.method829(var9.method431())) {// 902
                     var21 = var7;
                     break;
                  }

                  int var20 = var9.method18().method11(var5);// 608
                  int var11 = var9.method18().method15(var5);// 721
                  if (var20 != -2) {// 960
                     if (var11 == -2) {
                        var21 = var7;
                        break;
                     }

                     if ((var6 = var6 - var11) < 0) {// 914 930
                        var21 = var7;
                        break;
                     }

                     if ((var6 = var6 + var20) == 0) {// 735 846
                        var8 = var9;// 756
                        if (var4 && var9.method18() instanceof pop) {// 975
                           var21 = var7;
                           break;
                        }
                     }

                     var7++;// 881
                     var9 = var9.method32();// 738
                     if (var7 <= 777) {// 801
                        continue;
                     }

                     var21 = var7;
                     break;
                  }
               }

               var21 = var7;// 694
               break;
            }

            if (var21 == 0) {
               var10000 = var14;
            } else if (var8 == null) {// 923
               var10000 = var14;
            } else {
               label80:
               if (var4 && var8.method18() instanceof pop) {// 838
                  Class348.field1037++;// 854
                  Class246 var16 = var14.method32();// 844
                  var17.method828(var16.method37().method431(), var16.method37(), var16);// 852

                  label76: {
                     try {
                        var3.method272(var16.method37());// 734
                     } catch (Class224 var13) {// 675
                        var23 = var3;
                        var17.method824(var13, var16);// 665
                        break label76;
                     }

                     var23 = var3;
                  }

                  var23.method480(var8, Class119.field107);// 835
                  var8 = var8.method32();// 619
                  var17.method828(var8.method37().method431(), var8.method37(), var8);// 682

                  try {
                     var3.method272(var8.method37());// 974
                  } catch (Class224 var12) {// 755
                     var10000 = var16;
                     var17.method824(var12, var8);// 777
                     break label80;// 705
                  }

                  var10000 = var16;
               } else {
                  Class348.field1030++;// 697
                  Class246 var15 = var14.method32();// 982
                  var10000 = var15;
                  var3.method28(var15.method37(), var8);// 722
               }
            }
         }

         var10000 = var14 = var10000.method32();// 768
      }
   }// 688

   // $VF: synthetic method
   public void method809(Class206 var1, Class203 var2, Class251 var3) {
      Class415 var9 = this;
      Class246 var4;
      Class246 var10000 = var4 = var3.method32();// 2364

      while (var10000 != null) {// 2365
         if (!(var4.method18() instanceof Class288)) {// 2247
            var10000 = var4;
         } else {
            Class288 var5 = (Class288)var4.method18();// 2353
            if (!Class580.method1937().method2025(var9.field1235, var1, var2, var5.method521(var1.method46()), var5.method12(var1.method46()))) {// 2242
               var10000 = var4;
            } else {
               label240: {
                  Class221 var6;
                  Class246 var8;
                  label222: {
                     var6 = var1.method46();// 2138
                     int var7 = var5.method11(var6);// 2185
                     var8 = null;// 2196
                     if (var7 > 0) {// 2000
                        if (var4.method32() != null// 2190
                            && (var4.method32().method18() instanceof pop || var4.method32().method18() instanceof pop2)// 2161
                            && var4.method32().method18().method15(var6) == var7) {// 2025
                           var8 = var4.method32();// 2248
                        }

                        if (var8 == null) {// 2354
                           var8 = var4;// 2181
                           if (Class138.field591.equals(var5.method14(var1.method46()))// 2262
                              || Class138.field581.equals(var5.method14(var1.method46()))
                              || Class138.field594.equals(var5.method14(var1.method46()))
                              || Class138.field584.equals(var5.method14(var1.method46()))
                              || Class138.field585.equals(var5.method14(var1.method46()))) {
                              var3.method480(var4, new iconst_x(0));// 2237
                           } else if (Class138.field578.equals(var5.method14(var1.method46()))) {// 2317
                              var3.method480(var4, new lconst_x(0L));// 2166
                           } else if (Class138.field575.equals(var5.method14(var1.method46()))) {// 1976
                              var3.method480(var4, new fconst_x(0.0F));// 2084
                           } else if (Class138.field576.equals(var5.method14(var1.method46()))) {// 2290
                              var3.method480(var4, new dconst_x(0.0));// 2269
                           } else if (var5.method14(var1.method46()) instanceof Class145) {// 2297
                              var3.method480(var4, new aconst_null());// 2061
                           } else {
                              if (!(var5.method14(var1.method46()) instanceof Class144)) {// 2310
                                 Class528.method1558(
                                    "[remove-calls] Cannot remove call ("// 2090
                                       + var5.method521(var6)
                                       + "."
                                       + var5.method12(var6)
                                       + ") in "
                                       + var1.method93()
                                       + "."
                                       + var2.method20()
                                       + " - return value is used"
                                 );
                                 var10000 = var4;
                                 break label240;// 2157
                              }

                              var3.method480(var4, new aconst_null());// 2291
                           }

                           Class528.method1558(
                              "[remove-calls] return value of "// 2151
                                 + var5.method521(var6)
                                 + "."
                                 + var5.method12(var6)
                                 + " in "
                                 + var1.method93()
                                 + "."
                                 + var2.method20()
                                 + " was replaced with null (0)"
                           );
                           var37 = var5;
                           break label222;// 2155
                        }
                     } else {
                        var8 = var4;// 2162
                     }

                     var37 = var5;// 2445
                  }

                  int var25 = var37.method15(var6);
                  Class246 var20;
                  var10000 = var20 = var4;// 2476

                  while (true) {
                     if (var10000.method37() == null) {// 2376
                        var39 = var25;// 2375
                        break;
                     }

                     if (var25 == 0) {// 2412
                        var39 = var25;
                        break;
                     }

                     var20 = var20.method37();// 2410
                     var25 -= var20.method18().method11(var6) - var20.method18().method15(var6);// 2498
                     var10000 = var20;
                  }

                  if (var39 != 0) {
                     Class528.method1558(
                        "[remove-calls] Cannot remove call ("// 2567
                           + var5.method521(var6)
                           + "."
                           + var5.method12(var6)
                           + ") in "
                           + var1.method93()
                           + "."
                           + var2.method20()
                           + " - parameters not found"
                     );
                     var10000 = var4;
                  } else {
                     Class246 var10 = var20;// 2436
                     Class246 var21 = var20;// 2429
                     int var11 = 0;// 2405

                     label193:
                     while (true) {
                        for (Class246 var40 = var21; var40 != var8 && var21.method32() != null; var11++) {// 2572
                           var21 = var21.method32();// 2540
                           if (var9.method829(var21.method431())) {// 2500
                              continue label193;
                           }

                           var40 = var21;// 2414
                        }

                        if (var11 == 1) {// 2377
                           boolean var12 = false;// 2503
                           Class200[] var13;
                           if ((var13 = var8.method431()) != null) {// 2490 2585
                              Class200[] var14 = var13;
                              int var15 = var13.length;

                              int var16;
                              for (int var41 = var16 = 0; var41 < var15; var41 = ++var16) {// 2546
                                 Class200 var17;
                                 if (!((var17 = var14[var16]) instanceof Class201) && !(var17 instanceof Class199) && var17 instanceof Class202) {// 2559 2588
                                    var12 = true;// 2525
                                 }
                              }
                           }

                           if (var12 && var20 != var8) {// 2583
                              var8.method432(Class119.field39);// 2460
                              var8 = var8.method37();// 2441
                              var11 = 0;// 2452
                           }
                        }

                        if (var11 > 0) {// 2419
                           Class528.method1558(
                              "[remove-calls] Cannot remove call ("// 2421
                                 + var5.method521(var6)
                                 + "."
                                 + var5.method12(var6)
                                 + ") in "
                                 + var1.method93()
                                 + "."
                                 + var2.method20()
                                 + " - targeters inside block"
                           );
                           var10000 = var4;
                        } else {
                           Class246 var27;
                           if ((var27 = var8.method32()) == null) {// 2422 2425
                              Class528.method1558(
                                 "[remove-calls] Cannot remove call ("// 2447
                                    + var5.method521(var6)
                                    + "."
                                    + var5.method12(var6)
                                    + ") in "
                                    + var1.method93()
                                    + "."
                                    + var2.method20()
                                    + " - unexpected end of block"
                              );
                              var10000 = var4;
                           } else {
                              Class200[] var28;
                              if ((var28 = var20.method431()) != null) {// 2505 2522
                                 Class200[] var29 = var28;
                                 int var32 = var28.length;

                                 int var34;
                                 for (int var42 = var34 = 0; var42 < var32; var42 = ++var34) {// 2455
                                    Class200 var35;
                                    if (!((var35 = var29[var34]) instanceof Class201) && !(var35 instanceof Class199)) {// 2408
                                       var35.method28(var10, var27);// 2473
                                    }
                                 }
                              }

                              Class246 var22 = var27;// 2506

                              do {
                                 var22 = var22.method37();// 2373
                                 var9.method833(var22, var27);
                                 var9.method818(var22, var27);// 2394 2541
                              } while (var22 != var10 && var22.method37() != null);// 2379

                              boolean var30 = false;// 2449
                              Class246 var23;
                              var10000 = var23 = var8;// 2424

                              while (true) {
                                 if (var10000 == var10) {// 2378
                                    var44 = var30;// 2516
                                    break;
                                 }

                                 if (var23.method18() instanceof Class91) {// 2451
                                    var30 = true;// 2486
                                    var10 = var23.method32();// 2413
                                    var44 = var30;
                                    break;// 2577
                                 }

                                 var10000 = var23 = var23.method37();// 2387
                              }

                              label147:
                              if (!var44) {
                                 try {
                                    var3.method460(var10, var8);// 2584
                                 } catch (Class224 var19) {// 2415
                                    var10000 = var27;
                                    break label147;// 2489
                                 }

                                 var10000 = var27;
                              } else {
                                 label238: {
                                    var25 = var8.method18().method15(var6);// 2565

                                    for (Class246 var46 = var24 = var10; var46 != var8; var46 = var24 = var24.method32()) {// 2478 2504 2534
                                       var25 -= var24.method18().method11(var6) - var24.method18().method15(var6);// 2569
                                    }

                                    int var33;
                                    for (int var47 = var33 = 0; var47 < var25; var47 = var33) {// 2491
                                       var33++;
                                       var3.method480(var8, new pop());// 2407
                                    }

                                    try {
                                       var3.method460(var10, var8);// 2477
                                    } catch (Class224 var18) {// 2381
                                       var10000 = var27;// 2426
                                       break label238;
                                    }

                                    var10000 = var27;
                                 }
                              }

                              var10000 = var10000.method37() != null ? var27.method37() : var27;// 2389 2502
                           }
                        }
                        break;
                     }
                  }
               }
            }
         }

         var10000 = var4 = var10000.method32();
      }
   }// 2475

   // $VF: synthetic method
   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void method832(Class206 var1, Class203 var2, Class251 var3, int var4, int var5, int var6) {
      Class415 var9 = this;
      int var48 = 0;// 470
      int var7 = 0;
      int var8 = 0;
      Class246 var39;
      Class246 var10000 = var39 = var3.method32();// 149

      while (var10000 != null && (var48 < var4 || var7 < var5 || var8 < var6)) {// 157
         if (!var9.method829(var39.method431())) {// 286
            var10000 = var39;
         } else if (var39.method18() == Class119.field78) {// 108
            if (var48 >= var4) {// 27
               var10000 = var39;
            } else {
               Class246 var10;
               Class246 var11;
               int var12;
               Class415 var70;
               if ((var12 = Class337.method549(5)) == 0) {// 94 209
                  var11 = var3.method480(var39, Class119.field89);// 69
                  var3.method480(var39, Class119.field116);// 116
                  var10 = var3.method480(var39, Class119.field129);// 422
                  var70 = var9;
               } else if (var12 == 1) {// 464
                  var11 = var3.method480(var39, Class119.field133);// 25
                  var3.method480(var39, Class119.field129);// 31
                  var10 = var3.method480(var39, Class119.field26);// 21
                  var70 = var9;
               } else if (var12 == 2) {// 115
                  var11 = var3.method480(var39, Class119.field133);// 223
                  var3.method480(var39, Class119.field26);// 45
                  var10 = var3.method480(var39, Class119.field116);// 23
                  var70 = var9;
               } else if (var12 == 3) {// 440
                  var11 = var3.method480(var39, Class119.field89);// 248
                  var3.method480(var39, Class119.field92);// 97
                  var10 = var3.method480(var39, Class119.field26);// 411
                  var70 = var9;
               } else {
                  var11 = var3.method480(var39, Class119.field112);// 138
                  var3.method480(var39, Class119.field26);// 285
                  var10 = var3.method480(var39, Class119.field26);// 119
                  var70 = var9;// 238
               }

               var70.method833(var39, var10);

               label363: {
                  label362: {
                     label361: {
                        label360: {
                           try {
                              var9.method818(var39, var11);// 61
                           } catch (Class241 var38) {
                              try {
                                 var71 = var3;// 540
                                 break label360;
                              } catch (Class224 var37) {
                                 boolean var10001 = false;
                                 break label361;
                              }
                           }

                           var71 = var3;
                        }

                        try {
                           var71.method272(var39);
                           break label362;
                        } catch (Class224 var36) {
                           boolean var90 = false;
                        }
                     }

                     var10000 = var11;// 57
                     break label363;
                  }

                  var10000 = var11;
               }

               Class246 var40 = var10000;
               var10000 = var40;// 169
               var48++;
            }
         } else if (var39.method18() == Class119.field75) {// 216
            if (var48 >= var4) {// 299
               var10000 = var39;
            } else if (var39.method32() != null// 314
               && var39.method32().method32() != null
               && var39.method32().method18() == Class119.field113
               && var39.method32().method32().method18() == Class119.field107) {
               var10000 = var39;
            } else {
               Class246 var49;
               Class246 var56;
               int var63;
               Class415 var73;
               if ((var63 = Class337.method549(7)) == 0) {// 166 443
                  var56 = var3.method480(var39, Class119.field89);// 434
                  var3.method480(var39, Class119.field116);// 292
                  var49 = var3.method480(var39, Class119.field26);// 373
                  var73 = var9;
               } else if (var63 == 1) {// 72
                  var56 = var3.method480(var39, Class119.field133);// 268
                  var3.method480(var39, Class119.field75);// 497
                  var49 = var3.method480(var39, Class119.field26);// 66
                  var73 = var9;
               } else if (var63 == 2) {// 536
                  var56 = var3.method480(var39, Class119.field133);// 307
                  var3.method480(var39, Class119.field129);// 218
                  var49 = var3.method480(var39, Class119.field116);// 109
                  var73 = var9;
               } else if (var63 == 3) {// 213
                  var56 = var3.method480(var39, Class119.field112);// 15
                  var3.method480(var39, Class119.field26);// 385
                  var49 = var3.method480(var39, Class119.field129);// 471
                  var73 = var9;
               } else if (var63 != 4 && var63 != 5) {// 270
                  var56 = var3.method480(var39, Class119.field112);// 235
                  var3.method480(var39, Class119.field116);// 280
                  var49 = var3.method480(var39, Class119.field92);// 370
                  var73 = var9;// 95
               } else {
                  var56 = var3.method480(var39, Class119.field104);// 582
                  var49 = var3.method480(var39, Class119.field52);// 177
                  var73 = var9;
               }

               var73.method833(var39, var49);

               label327: {
                  label326: {
                     label325: {
                        label324: {
                           try {
                              var9.method818(var39, var56);// 55
                           } catch (Class241 var35) {
                              try {
                                 var74 = var3;// 107
                                 break label324;
                              } catch (Class224 var34) {
                                 boolean var91 = false;
                                 break label325;
                              }
                           }

                           var74 = var3;
                        }

                        try {
                           var74.method272(var39);
                           break label326;
                        } catch (Class224 var33) {
                           boolean var92 = false;
                        }
                     }

                     var10000 = var56;// 110
                     break label327;
                  }

                  var10000 = var56;
               }

               Class246 var41 = var10000;
               var10000 = var41;// 221
               var48++;
            }
         } else if (var39.method18() == Class119.field129) {// 444
            if (var7 >= var5) {// 601
               var10000 = var39;
            } else {
               Class246 var50;
               Class246 var57;
               int var64;
               Class415 var76;
               if ((var64 = Class337.method549(3)) == 0) {// 251 486
                  var57 = var3.method480(var39, Class119.field133);// 117
                  var3.method480(var39, Class119.field75);// 300
                  var50 = var3.method480(var39, Class119.field116);// 245
                  var76 = var9;
               } else if (var64 == 1) {// 296
                  var57 = var3.method480(var39, Class119.field104);// 404
                  var50 = var3.method448(var39, new Class116(var1.method46(), -2));// 417
                  var76 = var9;
               } else {
                  var57 = var3.method480(var39, Class119.field112);// 401
                  var3.method480(var39, Class119.field26);// 394
                  var50 = var3.method480(var39, Class119.field75);// 556
                  var76 = var9;// 207
               }

               var76.method833(var39, var50);

               label310: {
                  label309: {
                     label308: {
                        label307: {
                           try {
                              var9.method818(var39, var57);// 127
                           } catch (Class241 var32) {
                              try {
                                 var77 = var3;// 511
                                 break label307;
                              } catch (Class224 var31) {
                                 boolean var93 = false;
                                 break label308;
                              }
                           }

                           var77 = var3;
                        }

                        try {
                           var77.method272(var39);
                           break label309;
                        } catch (Class224 var30) {
                           boolean var94 = false;
                        }
                     }

                     var10000 = var57;// 210
                     break label310;
                  }

                  var10000 = var57;
               }

               Class246 var42 = var10000;
               var10000 = var42;// 576
               var7++;
            }
         } else if (var39.method18() == Class119.field26) {// 103
            if (var7 >= var5) {// 548
               var10000 = var39;
            } else {
               Class246 var58 = var3.method480(var39, Class119.field104);// 162
               Class246 var51 = var3.method448(var39, new Class116(var1.method46(), -3));// 282
               var9.method833(var39, var51);// 339

               label293: {
                  label292: {
                     label291: {
                        label290: {
                           try {
                              var9.method818(var39, var58);// 596
                           } catch (Class241 var29) {
                              try {
                                 var79 = var3;// 390
                                 break label290;
                              } catch (Class224 var28) {
                                 boolean var95 = false;
                                 break label291;
                              }
                           }

                           var79 = var3;
                        }

                        try {
                           var79.method272(var39);
                           break label292;
                        } catch (Class224 var27) {
                           boolean var96 = false;
                        }
                     }

                     var10000 = var58;// 520
                     break label293;
                  }

                  var10000 = var58;
               }

               Class246 var43 = var10000;
               var10000 = var43;// 502
               var7++;
            }
         } else if (var39.method18() == Class119.field92) {// 188
            if (var7 >= var5) {// 172
               var10000 = var39;
            } else {
               Class246 var59 = var3.method480(var39, Class119.field104);// 438
               Class246 var52 = var3.method448(var39, new Class116(var1.method46(), -4));// 592
               var9.method833(var39, var52);// 181

               label276: {
                  label275: {
                     label274: {
                        label273: {
                           try {
                              var9.method818(var39, var59);// 125
                           } catch (Class241 var26) {
                              try {
                                 var81 = var3;// 365
                                 break label273;
                              } catch (Class224 var25) {
                                 boolean var97 = false;
                                 break label274;
                              }
                           }

                           var81 = var3;
                        }

                        try {
                           var81.method272(var39);
                           break label275;
                        } catch (Class224 var24) {
                           boolean var98 = false;
                        }
                     }

                     var10000 = var59;// 263
                     break label276;
                  }

                  var10000 = var59;
               }

               Class246 var44 = var10000;
               var10000 = var44;// 225
               var7++;
            }
         } else if (var39.method18() == Class119.field116) {// 297
            if (var7 >= var5) {// 426
               var10000 = var39;
            } else {
               Class246 var60 = var3.method480(var39, Class119.field104);// 41
               Class246 var53 = var3.method448(var39, new Class116(var1.method46(), -5));// 551
               var9.method833(var39, var53);// 360

               label259: {
                  label258: {
                     label257: {
                        label256: {
                           try {
                              var9.method818(var39, var60);// 340
                           } catch (Class241 var23) {
                              try {
                                 var83 = var3;// 208
                                 break label256;
                              } catch (Class224 var22) {
                                 boolean var99 = false;
                                 break label257;
                              }
                           }

                           var83 = var3;
                        }

                        try {
                           var83.method272(var39);
                           break label258;
                        } catch (Class224 var21) {
                           boolean var100 = false;
                        }
                     }

                     var10000 = var60;// 237
                     break label259;
                  }

                  var10000 = var60;
               }

               Class246 var45 = var10000;
               var10000 = var45;// 133
               var7++;
            }
         } else if (var39.method18() == Class119.field52) {// 65
            if (var7 >= var5) {// 504
               var10000 = var39;
            } else {
               Class246 var61 = var3.method480(var39, Class119.field133);// 114
               var3.method480(var39, Class119.field129);// 460
               Class246 var54 = var3.method448(var39, new Class116(var1.method46(), -4));// 102
               var9.method833(var39, var54);// 183

               label242: {
                  label241: {
                     label240: {
                        label239: {
                           try {
                              var9.method818(var39, var61);// 64
                           } catch (Class241 var20) {
                              try {
                                 var85 = var3;// 164
                                 break label239;
                              } catch (Class224 var19) {
                                 boolean var101 = false;
                                 break label240;
                              }
                           }

                           var85 = var3;
                        }

                        try {
                           var85.method272(var39);
                           break label241;
                        } catch (Class224 var18) {
                           boolean var102 = false;
                        }
                     }

                     var10000 = var61;// 429
                     break label242;
                  }

                  var10000 = var61;
               }

               Class246 var46 = var10000;
               var10000 = var46;// 89
               var7++;
            }
         } else {
            label392: {
               if (var39.method18() instanceof Class18) {// 506
                  if (var8 >= var6) {// 599
                     var10000 = var39;
                     break label392;
                  }

                  Class221 var55 = var1.method46();// 318
                  Class18 var62;
                  if ((var62 = (Class18)var39.method18()).method1(var55) == Class138.field594 || var62.method1(var55) == Class138.field581) {// 88 306
                     int var65 = 7;// 8
                     if (var62.method1(var55) == Class138.field581) {// 331
                        var65 = 15;
                     }

                     int var13;
                     int[] var87 = method816(var13 = var62.method27().intValue(), var65);// 130 384
                     var65 = var87[0];// 301
                     int var14 = var87[1];// 602
                     if ((var65 & var14) != var13) {// 363
                        var10000 = var39;
                     } else {
                        Class246 var68 = var3.method480(var39, Class119.field89);// 35
                        var3.method448(var39, new Class116(var1.method46(), var65));// 233
                        Class246 var67 = var3.method448(var39, new Class116(var1.method46(), var14));// 271
                        var9.method833(var39, var67);// 256

                        label213: {
                           label212: {
                              label211: {
                                 label210: {
                                    try {
                                       var9.method818(var39, var68);// 47
                                    } catch (Class241 var17) {
                                       try {
                                          var88 = var3;// 346
                                          break label210;
                                       } catch (Class224 var16) {
                                          boolean var103 = false;
                                          break label211;
                                       }
                                    }

                                    var88 = var3;
                                 }

                                 try {
                                    var88.method272(var39);
                                    break label212;
                                 } catch (Class224 var15) {
                                    boolean var104 = false;
                                 }
                              }

                              var10000 = var68;// 334
                              break label213;
                           }

                           var10000 = var68;
                        }

                        Class246 var47 = var10000;
                        var10000 = var47;// 219
                        var8++;
                     }
                     break label392;
                  }

                  if (var62.method1(var55) == Class138.field585) {// 13
                     var10000 = var39;
                     break label392;// 255
                  }

                  if (var62.method1(var55) == Class138.field591) {
                  }
               }

               var10000 = var39;// 371
            }
         }

         var10000 = var39 = var10000.method32();
      }

      Class348.field1039 += var48;// 431
      Class348.field1017 += var7;// 563
      Class348.field1041 += var8;// 14
   }// 514

   // $VF: synthetic method
   public void method810(Class206 var1, Class203 var2, Class251 var3) {
      Class415 var7 = this;
      var3.method19();// 2175
      Class246 var6;
      Class246 var10000 = var6 = var3.method32();// 2017

      while (var10000 != null) {// 2013
         label109: {
            if (var6.method18() instanceof Class89) {// 2361
               Class246 var8;
               if ((var8 = ((Class89)var6.method18()).method32()) == null) {// 2007 2199
                  var10000 = var6;
                  break label109;
               }

               if (var8 == var6) {// 2165
                  var10000 = var6;
                  break label109;
               }

               if (!(var8.method18() instanceof Class89) && !(var8.method18() instanceof Class12)) {// 2303
                  var10000 = var6;
                  break label109;
               }

               if (var8.method18() instanceof Class89) {// 2210
                  int var4 = 0;// 2172

                  for (Class246 var11 = var8; var11 != null && var8.method18() instanceof Class89 && var4 < 100; var11 = var8) {// 2153 2191
                     Class10 var12 = var8.method18();// 2267
                     var4++;
                     var8 = ((Class89)var12).method32();
                  }

                  if (var4 == 100) {// 2274
                     var10000 = var6;
                     break label109;
                  }
               }

               if (var8 == null) {// 2087
                  var10000 = var6;
                  break label109;
               }

               if (var8.method18() instanceof Class12) {// 2258
                  Class348.field1040++;// 2283
                  var3.method480(var6, var8.method18());// 2245
                  var6 = var6.method32();// 2067
                  var7.method828(var6.method37().method431(), var6.method37(), var6);// 2065

                  try {
                     var3.method272(var6.method37());// 2198
                  } catch (Class224 var5) {// 2098
                     var7.method824(var5, var6);// 2189
                  }
               } else {
                  if (Math.abs(var6.method2() - var8.method2()) > 32000) {// 2313
                     var10000 = var6;
                     break label109;
                  }

                  Class348.field1020++;// 2216
                  ((Class89)var6.method18()).method29(var8);// 2334
               }
            } else if (var6.method18() instanceof Class91) {// 2205
               Class246 var9;
               if ((var9 = ((Class91)var6.method18()).method32()) == null) {// 2275 2348
                  var10000 = var6;
                  break label109;
               }

               if (!(var9.method18() instanceof Class89)) {// 2306
                  var10000 = var6;
                  break label109;
               }

               int var10 = 0;// 2229

               for (Class246 var14 = var9; var14 != null && var9.method18() instanceof Class89 && var10 < 100; var14 = var9) {// 1981 2004
                  Class10 var15 = var9.method18();// 2125
                  var10++;
                  var9 = ((Class89)var15).method32();
               }

               if (var10 == 100) {// 2063
                  var10000 = var6;
                  break label109;
               }

               if (var9 == null) {// 2259
                  var10000 = var6;
                  break label109;
               }

               if (Math.abs(var6.method2() - var9.method2()) > 32000) {// 2117
                  var10000 = var6;
                  break label109;
               }

               Class348.field1036++;// 2358
               ((Class91)var6.method18()).method29(var9);// 2329
            }

            var10000 = var6;// 2158
         }

         var10000 = var6 = var10000.method32();
      }
   }// 2182

   // $VF: synthetic method
   public Class415(Class338 var1) {
      this.field1235 = var1;// 161 273
   }// 141

   // $VF: synthetic method
   public void method807(Class206 var1, Class203 var2, Class251 var3, boolean var4) {
      Class415 var12 = this;
      Class246 var20;
      Class246 var10000 = var20 = var3.method32();// 1058

      while (var10000 != null) {// 990
         if (!(var20.method18() instanceof Class280)) {// 1080
            var10000 = var20;
         } else if (!var12.method829(var20.method431())) {// 1210
            var10000 = var20;
         } else {
            Class221 var5 = var1.method46();// 1570
            int var6 = ((Class280)var20.method18()).method2();// 1463
            int var7 = 0;// 1436
            Class246 var8 = null;// 1433
            Class246 var9 = null;
            Class246 var10 = var20.method32();// 1253
            int var11 = 0;// 1069

            while (true) {
               if (var10 != null) {// 1137
                  Class10 var15;
                  if (!((var15 = var10.method18()) instanceof Class51)// 1338 1566
                     && !(var15 instanceof Class33)
                     && !(var15 instanceof Class300)
                     && !(var15 instanceof Class18)
                     && !(var15 instanceof Class293)
                     && !(var15 instanceof Class277)
                     && !(var15 instanceof Class7)
                     && !(var15 instanceof Class268)
                     && !(var15 instanceof Class28)
                     && !(var15 instanceof Class294)
                     && !(var15 instanceof nop)) {
                     var10000 = var9;
                     break;// 1035
                  }

                  if ((var15 instanceof Class271 || var15 instanceof Class286) && ((Class277)var15).method2() == var6) {// 1399 1614
                     var10000 = var9;
                     break;
                  }

                  if (!var12.method829(var10.method431())) {// 1679
                     var10000 = var9;
                     break;
                  }

                  if (var7 == 1) {// 1593
                     Class10 var16;
                     if ((var16 = var10.method18()) instanceof Class280 && ((Class280)var16).method2() == var6) {// 1400 1582
                        var8 = var10;// 1025
                     }
                  } else {
                     Class10 var17;
                     if (var7 == 2 && (var17 = var10.method18()) instanceof Class280 && ((Class280)var17).method2() == var6) {// 1007 1048 1084
                        var10000 = var9 = var10;// 1136
                        break;// 1229
                     }
                  }

                  int var18 = var10.method18().method11(var5);// 1643
                  int var13 = var10.method18().method15(var5);// 1564
                  if (var18 != -2) {// 1451
                     if (var13 == -2) {
                        var10000 = var9;
                        break;
                     }

                     if ((var7 = var7 - var13) < 0) {// 1149 1561
                        var10000 = var9;
                        break;
                     }

                     var7 += var18;// 1081
                     var10 = var10.method32();// 1494
                     if (var11++ <= 777) {// 1442
                        continue;
                     }

                     var10000 = var9;
                     break;
                  }
               }

               var10000 = var9;// 1126
               break;
            }

            Class246 var19 = var10000 != null ? var9 : var8;
            var7 = var9 != null ? 2 : 1;// 1138
            if (var19 == null) {// 1432
               var10000 = var20;
            } else {
               label175: {
                  if (!var4) {// 1496
                     var10 = var20.method32();// 1222
                     boolean var25 = false;// 1208
                     var10000 = var10;// 1087

                     while (true) {
                        if (var10000 != null && var10 != var19) {
                           if (var10.method18() instanceof Class280 && ((Class280)var10.method18()).method2() == var6) {// 1397
                              var10000 = var10 = var10.method32();// 1004
                              continue;// 1506
                           }

                           var30 = var25 = true;// 1330
                           break;// 1659
                        }

                        var30 = var25;// 1289
                        break;
                     }

                     if (!var30) {
                        var10000 = var20;
                        break label175;
                     }
                  }

                  Class348.field1023++;// 1142
                  Class246 var21;
                  Class246 var10001 = var21 = var20.method32();// 1321
                  var12.method833(var21.method37(), var21);// 1671
                  var12.method818(var10001.method37(), var19);// 1227

                  label109: {
                     try {
                        var3.method272(var21.method37());// 1523
                     } catch (Class224 var14) {// 1015
                        var10000 = var19;// 1519
                        break label109;
                     }

                     var10000 = var19;
                  }

                  if (var10000.method18().method11(var5) == 1) {
                     if (var7 == 2) {// 1455
                        var10000 = var21;
                        var3.method480(var19, Class119.field82);// 1674
                     } else {
                        var3.method480(var19, Class119.field118);// 1382
                        var10000 = var21;
                     }
                  } else {
                     label176: {
                        if (var19.method18().method11(var5) == 2) {// 1637
                           if (var7 == 2) {// 1376
                              var10000 = var21;
                              var3.method480(var19, Class119.field136);// 1246
                              break label176;
                           }

                           var3.method480(var19, Class119.field121);// 1395
                        }

                        var10000 = var21;// 1645
                     }
                  }
               }
            }
         }

         var10000 = var20 = var10000.method32();
      }
   }// 1563

   // $VF: synthetic method
   @Override
   public void method793(Class206 var1) {
      Class415 var2 = this;
      Class208[] var6 = var1.method341();// 123

      int var5;
      for (int var10000 = var5 = 0; var10000 < var6.length; var10000 = ++var5) {// 78
         Class208 var4;
         if ((var4 = var6[var5]).method369() != null) {// 418 533
            Class203 var3 = Class376.method716(var4, var1.method93(), var1.method46(), var1.method46().method402());// 185
            if (!Class580.method1932().method1876(var2.field1235, var1, var3)) {// 406
               if (Class580.method1937().method2024()) {// 1
                  Class251 var8 = var3.method42();// 46
                  var8.method19();// 170
                  var2.method809(var1, var3, var8);// 553
                  var3.method309();// 58
                  var3.method276();// 190
                  var1.method360(var4, var3.method315());// 315
               }
            } else {
               Class251 var9;
               (var9 = var3.method42()).method19();// 488 534
               if (Class580.method1937().method2024()) {// 159
                  var2.method809(var1, var3, var9);
               }

               int var7;
               var10000 = var7 = Class580.method1922().method1917(var2.field1235, var1, var3);// 561
               Class580.method1922();// 358
               if (var10000 != 0 && !var4.method190().startsWith("Allatori")) {
                  var2.method826(var1, var3, var9);// 192
               }

               var2.method820(var1, var3, var9);
               var2.method797(var1, var3, var9);// 179
               var2.method827(var1, var3, var9);// 567
               var2.method803(var1, var3, var9);// 400
               var2.method808(var1, var3, var9);// 33
               var2.method806(var1, var3, var9);// 0
               var2.method796(var1, var3, var9, true);// 240
               var2.method796(var1, var3, var9, false);// 246
               var2.method822(var1, var3, var9);// 552
               var2.method807(var1, var3, var9, false);// 603
               var2.method794(var1, var3, var9);// 278
               var2.method805(var1, var3, var9);// 466
               var2.method807(var1, var3, var9, true);// 467
               var2.method814(var1, var3, var9);// 68
               var2.method814(var1, var3, var9);// 59
               var2.method817(var1, var3, var9);// 330
               var2.method819(var1, var3, var9);// 579
               var2.method802(var1, var3, var9);// 555
               var2.method800(var1, var3, var9);// 73
               var2.method810(var1, var3, var9);// 415
               var2.method795(var1, var3, var9);// 428
               var2.method798(var1, var3, var9);// 87
               var2.method813(var1, var3, var9);// 232
               var2.method801(var1, var3, var9);// 321 463
               Class580.method1922();
               if (var7 != 0) {// 198
                  var2.method804(var1, var3, var9);// 424
               }

               var2.method799(var1, var3, var9);// 588
               Class580.method1922();
               if (var7 == 1) {// 412
                  var2.method832(var1, var3, var9, 20, 16, 16);// 38
               } else {
                  Class580.method1922();
                  if (var7 == 2) {// 257
                     var2.method832(var1, var3, var9, 64, 32, 32);// 269
                  } else if (Class580.method1932().method1852() && Class580.method1932().method1865()) {// 455
                     var2.method832(var1, var3, var9, 8, 4, 4);// 148
                  }
               }

               if (Class580.method1927().method1803(var2.field1235, var1, var4)) {// 39
                  var2.method821(var1, var3, var9);// 368
               }

               var3.method309();// 160
               var3.method276();// 40
               var1.method360(var4, var3.method315());// 63
            }
         }
      }
   }// 550

   // $VF: synthetic method
   public void method833(Class246 var1, Class246 var2) {
      if (var2 != null) {// 2552
         if (var1.method431() != null) {// 2467
            if (var2.method431() != null) {// 2383
               Class200[] var5;
               int var4 = (var5 = var2.method431()).length;

               for (int var10000 = var7 = 0; var10000 < var4; var10000 = ++var7) {// 2592
                  Class200 var6;
                  if ((var6 = var5[var7]) instanceof Class201) {// 2535
                     return;// 2544
                  }
               }
            }

            Class200[] var10;
            int var9 = (var10 = var1.method431()).length;

            for (int var12 = var8 = 0; var12 < var9; var12 = ++var8) {// 2418
               Class200 var11;
               if ((var11 = var10[var8]) instanceof Class201) {// 2459
                  var11.method28(var1, var2);// 2526
               }
            }
         }
      }
   }// 2497

   // $VF: synthetic method
   public void method811(Class206 var1, Class203 var2, Class251 var3) {
   }// 1717
}
