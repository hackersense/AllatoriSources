package mapped;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

// $VF: Compiled from nv
public class Class547 {
   // $VF: synthetic field
   public TreeSet field1880 = new TreeSet();
   // $VF: synthetic field
   public Class338 field1881;
   // $VF: synthetic field
   public int[] field1882;
   // $VF: synthetic field
   public Class206 field1883;

   // $VF: synthetic method
   public void method1697(Class206 var1, Class203 var2, Class204 var3) {
      Class151[] var7 = null;// 302
      if (var1 != null) {// 203
         var7 = var1.method200();
      }

      if (var2 != null) {// 70
         var7 = var2.method200();
      }

      if (var3 != null) {// 597
         var7 = var3.method200();
      }

      int var6;
      if (var2 != null) {// 118
         Class151[] var5;
         for (int var10000 = var6 = (var5 = var2.method321()).length - 1; var10000 >= 0; var10000 = --var6) {// 353 379
            if (var5[var6] instanceof Class177) {// 189
               var2.method289(var5[var6]);// 165
            }
         }
      }

      if (var7 != null) {// 79
         int var8;
         for (int var9 = var8 = var7.length - 1; var9 >= 0; var9 = --var8) {// 500
            if (var7[var8] instanceof Class177) {// 396
               if (var1 != null) {// 364
                  var1.method262(var7[var8]);
               }

               if (var2 != null) {// 154
                  var2.method265(var7[var8]);
               }

               if (var3 != null) {// 861
                  var3.method265(var7[var8]);
               }
            }
         }
      }
   }// 958

   // $VF: synthetic method
   public void method1698(Class533[] var1, Class221 var2) {
      Class547 var3 = this;
      if (var1 != null) {// 129
         for (int var10000 = var4 = var1.length - 1; var10000 >= 0; var10000 = var4) {// 258
            var3.method1712(var1[var4--], var2);// 107
         }
      }
   }// 437

   // $VF: synthetic method
   public void method1699(List var1) {
      Class547 var2 = this;
      if (var1 != null) {// 153
         for (int var10000 = var3 = var1.size() - 1; var10000 >= 0; var10000 = var3) {// 477
            var2.method1714((Class533)var1.get(var3--));// 53
         }
      }
   }// 584

   // $VF: synthetic method
   public void method1700(int var1, Class221 var2) {
      Class547 var3 = this;
      if (var1 != -1) {// 339
         this.field1882[var1] = 1;// 308
         Class178 var4;
         if ((var4 = var2.method174(var1)) != null) {// 549 596
            int var5 = var2.method2();// 499

            for (int var10000 = ++var1; var10000 < var5 && var2.method174(var1) == null; var10000 = var1) {// 76 145
               var3.field1882[var1++] = 1;// 390
            }
         }

         if (var4 instanceof Class182) {// 188
            Class182 var12 = (Class182)var4;// 172
            var3.method1700(var12.method2(), var2);// 564
         } else if (var4 instanceof Class187) {
            Class187 var11;
            Class187 var15 = var11 = (Class187)var4;// 281
            var3.method1700(var11.method17(), var2);// 438
            var3.method1700(var15.method2(), var2);// 592
         } else if (var4 instanceof Class186) {
            Class186 var10;
            Class186 var14 = var10 = (Class186)var4;// 181
            var3.method1700(var10.method17(), var2);// 433
            var3.method1700(var14.method2(), var2);// 125
         } else if (var4 instanceof Class185) {
            Class185 var9 = (Class185)var4;// 320
            var3.method1700(var9.method2(), var2);// 478
         } else if (var4 instanceof Class192) {
            Class192 var8 = (Class192)var4;// 365
            var3.method1700(var8.method2(), var2);// 366
         } else if (var4 instanceof Class193) {
            Class193 var7 = (Class193)var4;// 225
            var3.method1700(var7.method17(), var2);// 532
         } else {
            if (var4 instanceof Class194) {
               Class194 var6 = (Class194)var4;// 426
               var3.method1700(var6.method2(), var2);// 11
            }
         }
      }
   }// 48 212 263 297 413 483 522

   // $VF: synthetic method
   public void method1701(Class151[] var1, Class221 var2, boolean var3, boolean var4) {
      Class547 var6 = this;

      int var5;
      for (int var10000 = var5 = var1.length - 1; var10000 >= 0; var10000 = --var5) {// 59
         Class151 var16;
         Class151 var67 = var16 = var1[var5];// 391
         var67.method96(var2.method402());// 330
         if (!(var67 instanceof Class177)// 415
            && !(var16 instanceof Class156)
            && (!var3 || !(var16 instanceof Class173))
            && (!var4 || !(var16 instanceof Class162) && !(var16 instanceof Class170))) {
            var6.method1700(var16.method17(), var2);// 87
         }

         if (var16 instanceof Class164) {// 586
            Class164 var31 = (Class164)var16;// 399
            var6.method1701(var31.method200(), var2, var3, var4);// 232

            Class122[] var39;
            int var48;
            for (int var81 = var48 = (var39 = var31.method201()).length - 1; var81 >= 0; var81 = var48) {// 198 463
               Class122 var85 = var39[var48];
               var48--;
               var6.method1700(var85.method84(), var2);// 424
            }
         } else if (var16 instanceof Class161) {// 28
            Class161 var30 = (Class161)var16;// 588
            var6.method1700(var30.method30(), var2);// 329
         } else if (!(var16 instanceof Class175)) {// 412
            int var47;
            if (var16 instanceof Class157) {// 38
               Class157 var29;
               int[] var38;
               for (int var80 = var47 = (var38 = (var29 = (Class157)var16).method41()).length - 1; var80 >= 0; var80 = var47) {// 257 269 455
                  var6.method1700(var38[var47--], var2);// 148
               }
            } else if (var16 instanceof Class162) {// 236
               if (!var4) {// 142
                  Class162 var28;
                  Class211[] var37;
                  for (int var79 = var47 = (var37 = (var28 = (Class162)var16).method196()).length - 1; var79 >= 0; var79 = var47) {// 39 99 368
                     var6.method1700(var37[var47].method17(), var2);
                     var6.method1700(var37[var47].method84(), var2);// 40
                     Class211 var84 = var37[var47];// 63 160
                     var47--;
                     var6.method1700(var84.method2(), var2);
                  }
               }
            } else if (!(var16 instanceof Class163)) {// 510
               if (var16 instanceof Class160) {// 456
                  Class160 var27;
                  Class124[] var36;
                  for (int var78 = var47 = (var36 = (var27 = (Class160)var16).method191()).length - 1; var78 >= 0; var78 = var47) {// 82 83 367
                     var6.method1700(var36[var47].method92(), var2);
                     Class124 var83 = var36[var47];// 5 279
                     var47--;
                     var6.method1700(var83.method2(), var2);
                  }
               } else if (var16 instanceof Class159) {// 386
                  Class159 var26;
                  Class159 var82 = var26 = (Class159)var16;// 470
                  var6.method1700(var26.method30(), var2);// 149
                  var6.method1700(var82.method84(), var2);// 157
               } else if (var16 instanceof Class173) {// 24
                  if (!var3) {// 286
                     Class173 var25 = (Class173)var16;// 600
                     var6.method1700(var25.method30(), var2);// 108
                  }
               } else if (var16 instanceof Class169) {// 242
                  Class169 var24 = (Class169)var16;// 94
                  var6.method1700(var24.method30(), var2);// 209
               } else if (var16 instanceof Class150) {// 69
                  Class150 var23;
                  Class218[] var35;
                  for (int var75 = var47 = (var35 = (var23 = (Class150)var16).method180()).length - 1; var75 >= 0; var75 = --var47) {// 116 422 464
                     Class218 var51;
                     Class219[] var54;
                     int var57;
                     for (int var76 = var57 = (var54 = (var51 = var35[var47]).method383()).length - 1; var76 >= 0; var76 = --var57) {// 21 25 31
                        Class219 var61;
                        if ((var61 = var54[var57]).method142() == 7) {// 115 223
                           var6.method1700(var61.method2(), var2);// 45
                        }
                     }

                     int var62;
                     for (int var77 = var62 = (var58 = var51.method382()).length - 1; var77 >= 0; var77 = --var62) {// 248 440
                        Class219 var65;
                        if ((var65 = var58[var62]).method142() == 7) {// 97 411
                           var6.method1700(var65.method2(), var2);// 468
                        }
                     }
                  }
               } else if (!(var16 instanceof Class176)) {// 119
                  if (var16 instanceof Class170) {// 32
                     if (!var4) {// 238
                        Class170 var22 = (Class170)var16;// 423
                        var6.method1700(var22.method84(), var2);// 61
                        if (var22.method30() != 0) {// 525
                           var6.method1700(var22.method30(), var2);// 220
                        }
                     }
                  } else if (var16 instanceof Class158) {// 336
                     Class158 var21;
                     Class475 var43 = Class475.method1260((var21 = (Class158)var16).method188(), var2, false);// 57 291 540
                     var6.method1713(var43, var2);// 169
                  } else if (var16 instanceof Class168) {// 216
                     Class168 var20;
                     Class121[] var34;
                     var47 = (var34 = (var20 = (Class168)var16).method212()).length;// 299

                     int var50;
                     for (int var73 = var50 = 0; var73 < var47; var73 = ++var50) {// 314
                        Class121 var53 = var34[var50];
                        var6.method1700(var53.method2(), var2);// 137
                        int[] var56;
                        int var60 = (var56 = var53.method41()).length;

                        int var64;
                        for (int var74 = var64 = 0; var74 < var60; var74 = var64) {// 50
                           int var10001 = var56[var64];
                           int var86 = var56[var64];
                           var64++;
                           var6.method1700(var10001, var2);// 253
                        }
                     }
                  } else if (!(var16 instanceof Class153)) {// 443
                     if (var16 instanceof Class172) {// 109
                        Class172 var19 = (Class172)var16;// 213
                        var6.method1700(var19.method30(), var2);// 15
                     } else if (var16 instanceof Class152) {// 385
                        Class152 var18;
                        int[] var33;
                        for (int var72 = var47 = (var33 = (var18 = (Class152)var16).method41()).length - 1; var72 >= 0; var72 = var47) {// 270 471 582
                           var6.method1700(var33[var47--], var2);// 177
                        }
                     } else if (var16 instanceof Class171) {// 266
                        Class171 var17;
                        Class209[] var32;
                        var47 = (var32 = (var17 = (Class171)var16).method216()).length;// 235

                        int var49;
                        for (int var71 = var49 = 0; var71 < var47; var71 = var49) {// 280
                           Class209 var52 = var32[var49];
                           var49++;
                           var6.method1700(var52.method17(), var2);// 370
                        }
                     } else if (var16 instanceof Class177) {// 516
                     }
                  } else {
                     Class153 var7;
                     Class217[] var8;
                     var47 = (var8 = (var7 = (Class153)var16).method185()).length;// 166

                     int var10;
                     for (int var68 = var10 = 0; var68 < var47; var68 = ++var10) {// 434
                        Class217 var11;
                        if ((var11 = var8[var10]).method383() != null) {// 292
                           Class219[] var12;
                           int var13 = (var12 = var11.method383()).length;

                           int var14;
                           for (int var69 = var14 = 0; var69 < var13; var69 = ++var14) {// 373
                              Class219 var15;
                              if ((var15 = var12[var14]).method142() == 7) {// 72
                                 var6.method1700(var15.method2(), var2);// 268
                              }
                           }
                        }

                        if (var11.method382() != null) {// 497
                           Class219[] var55;
                           int var59 = (var55 = var11.method382()).length;

                           int var63;
                           for (int var70 = var63 = 0; var70 < var59; var70 = ++var63) {// 66
                              Class219 var66;
                              if ((var66 = var55[var63]).method142() == 7) {// 536
                                 var6.method1700(var66.method2(), var2);// 307
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }// 55

   // $VF: synthetic method
   public void method1702(Class203 var1, Class221 var2) {
      Class547 var8 = this;
      Class251 var6;
      if ((var6 = var1.method42()) != null) {// 146 567
         int var4;
         for (int var10 = var4 = (var7 = var6.method39()).length - 1; var10 >= 0; var10 = --var4) {// 33 400
            Class10 var3;
            if ((var3 = var7[var4].method18()) instanceof Class1) {// 0 240 246
               Class1 var9 = (Class1)var3;// 552
               var8.method1700(var9.method2(), var2);// 603
            }
         }
      }
   }// 467

   // $VF: synthetic method
   public void method1703(Class203 var1) {
      Class547 var7 = this;
      Class251 var5;
      if ((var5 = var1.method42()) != null) {// 231 420
         int var2;
         for (int var9 = var2 = (var6 = var5.method39()).length - 1; var9 >= 0; var9 = --var2) {// 343 454
            Class10 var3;
            if ((var3 = var6[var2].method18()) instanceof Class1) {// 62 126 324
               Class1 var8 = (Class1)var3;// 519
               var8.method6(var7.field1882[var8.method2()]);// 376
            }
         }
      }
   }// 432

   // $VF: synthetic method
   public void method1704(Class151[] var1, Class149 var2) {
      Class547 var3 = this;

      int var7;
      for (int var10000 = var7 = var1.length - 1; var10000 >= 0; var10000 = --var7) {// 2
         Class151 var4;
         Class151 var67 = var4 = var1[var7];// 505
         var67.method96(var2);// 583
         if (!(var67 instanceof Class160)) {// 19
            var4.method90(var3.field1882[var4.method17()]);// 86
         }

         if (var4 instanceof Class164) {// 473
            Class164 var39 = (Class164)var4;// 528
            var3.method1704(var39.method200(), var2);// 289

            Class122[] var48;
            for (int var83 = var24 = (var48 = var39.method201()).length - 1; var83 >= 0; var83 = --var24) {// 323 458
               int var52;
               if ((var52 = var48[var24].method84()) != 0) {// 572 591
                  var48[var24].method89(var3.field1882[var52]);// 60
               }
            }
         } else if (var4 instanceof Class161) {// 150
            Class161 var38 = (Class161)var4;// 56
            var38.method89(var3.field1882[var38.method30()]);// 416
         } else if (!(var4 instanceof Class175)) {// 211
            if (var4 instanceof Class157) {// 427
               Class157 var37;
               int[] var47;
               for (int var82 = var23 = (var47 = (var37 = (Class157)var4).method41()).length - 1; var82 >= 0; var82 = var23) {// 100 262 475
                  int var89 = var23;// 202
                  int var95 = var3.field1882[var47[var23]];
                  var23--;
                  var47[var89] = var95;
               }

               var37.method82(var47);// 250
            } else {
               int var22;
               if (var4 instanceof Class162) {// 128
                  Class162 var36;
                  Class211[] var46;
                  for (int var80 = var22 = (var46 = (var36 = (Class162)var4).method196()).length - 1; var80 >= 0; var80 = var22) {// 199 290 512
                     var46[var22].method6(var3.field1882[var46[var22].method17()]);
                     var46[var22].method89(var3.field1882[var46[var22].method84()]);// 92
                     Class211 var81 = var46[var22];// 176 538
                     int[] var88 = var3.field1882;
                     int var94 = var46[var22].method2();
                     var22--;
                     var81.method90(var88[var94]);
                  }
               } else if (!(var4 instanceof Class163)) {// 124
                  if (var4 instanceof Class160) {// 568
                     try {
                        Class160 var35;
                        Class124[] var45;
                        int var21 = (var45 = (var35 = (Class160)var4).method191()).length - 1;// 98 311 407

                        while (var21 >= 0) {
                           var45[var21].method91(var3.field1882[var45[var21].method92()]);
                           Class124 var79 = var45[var21];// 85 405
                           int[] var87 = var3.field1882;
                           int var93 = var45[var21].method2();
                           var21--;
                           var79.method90(var87[var93]);
                        }
                     } catch (ArrayIndexOutOfBoundsException var14) {// 121
                     }
                  } else if (var4 instanceof Class159) {// 472
                     Class159 var34 = (Class159)var4;// 381
                     var34.method89(var3.field1882[var34.method30()]);// 387
                     var34.method85(var3.field1882[var34.method84()]);// 380
                  } else if (var4 instanceof Class173) {// 261
                     Class173 var33 = (Class173)var4;// 180
                     var33.method89(var3.field1882[var33.method30()]);// 206
                  } else if (var4 instanceof Class169) {// 350
                     Class169 var32 = (Class169)var4;// 156
                     var32.method89(var3.field1882[var32.method30()]);// 3
                  } else {
                     int var20;
                     if (var4 instanceof Class150) {// 543
                        Class150 var31;
                        Class218[] var44;
                        for (int var76 = var20 = (var44 = (var31 = (Class150)var4).method180()).length - 1; var76 >= 0; var76 = --var20) {// 175 186 276
                           Class218 var51;
                           Class219[] var55;
                           int var58;
                           for (int var77 = var58 = (var55 = (var51 = var44[var20]).method383()).length - 1; var77 >= 0; var77 = --var58) {// 12 167 414
                              Class219 var62;
                              if ((var62 = var55[var58]).method142() == 7) {// 139 319
                                 var62.method6(var3.field1882[var62.method2()]);// 462
                              }
                           }

                           int var63;
                           for (int var78 = var63 = (var59 = var51.method382()).length - 1; var78 >= 0; var78 = --var63) {// 187 452
                              Class219 var65;
                              if ((var65 = var59[var63]).method142() == 7) {// 254 595
                                 var65.method6(var3.field1882[var65.method2()]);// 594
                              }
                           }
                        }
                     } else if (!(var4 instanceof Class176)) {// 120
                        if (var4 instanceof Class170) {// 487
                           Class170 var30 = (Class170)var4;// 479
                           var30.method85(var3.field1882[var30.method84()]);// 347
                           if (var30.method30() != 0) {// 298
                              var30.method89(var3.field1882[var30.method30()]);// 42
                           }
                        } else if (var4 instanceof Class158) {// 439
                           Class158 var29;
                           Class158 var75 = var29 = (Class158)var4;// 529
                           Class332 var43 = var75.method188();// 106
                           Class475 var19 = Class475.method1260(var43, new Class221(var2), false);// 569
                           var3.method1707(var19);// 445
                           var75.method189(var19.method1253());// 425
                        } else if (var4 instanceof Class168) {// 327
                           Class168 var28;
                           Class121[] var42;
                           int var18 = (var42 = (var28 = (Class168)var4).method212()).length;// 527

                           int var50;
                           for (int var73 = var50 = 0; var73 < var18; var73 = var50) {// 383
                              Class121 var54 = var42[var50];
                              var54.method6(var3.field1882[var54.method2()]);// 197

                              int[] var57;
                              int var61;
                              for (int var74 = var61 = (var57 = new int[var54.method41().length]).length - 1; var74 >= 0; var74 = var61) {// 140 451
                                 int[] var85 = var3.field1882;
                                 int[] var10003 = var54.method41();
                                 int var86 = var61;
                                 int var92 = var85[var10003[var61]];
                                 var61--;
                                 var57[var86] = var92;// 49
                              }

                              var50++;
                              var54.method82(var57);// 565
                           }
                        } else if (!(var4 instanceof Class153)) {// 448
                           if (var4 instanceof Class172) {// 566
                              Class172 var27 = (Class172)var4;// 531
                              var27.method89(var3.field1882[var27.method30()]);// 229
                           } else {
                              int var17;
                              if (var4 instanceof Class152) {// 104
                                 Class152 var26;
                                 int[] var41;
                                 for (int var72 = var17 = (var41 = (var26 = (Class152)var4).method41()).length - 1; var72 >= 0; var72 = var17) {// 309 430 590
                                    int var84 = var17;// 442
                                    int var90 = var3.field1882[var41[var17]];
                                    var17--;
                                    var41[var84] = var90;
                                 }
                              } else if (var4 instanceof Class171) {// 344
                                 Class171 var25;
                                 Class209[] var40;
                                 int var16 = (var40 = (var25 = (Class171)var4).method216()).length;// 345

                                 int var49;
                                 for (int var71 = var49 = 0; var71 < var16; var71 = var49) {// 449
                                    Class209 var53 = var40[var49];
                                    int[] var10001 = var3.field1882;// 37
                                    int var10002 = var53.method17();
                                    var49++;
                                    var53.method90(var10001[var10002]);
                                 }
                              } else if (var4 instanceof Class177) {// 217
                              }
                           }
                        } else {
                           Class153 var5;
                           Class217[] var6;
                           int var15 = (var6 = (var5 = (Class153)var4).method185()).length;// 101

                           int var8;
                           for (int var68 = var8 = 0; var68 < var15; var68 = ++var8) {// 489
                              Class217 var9;
                              if ((var9 = var6[var8]).method383() != null) {// 562
                                 Class219[] var10;
                                 int var11 = (var10 = var9.method383()).length;

                                 int var12;
                                 for (int var69 = var12 = 0; var69 < var11; var69 = ++var12) {// 244
                                    Class219 var13;
                                    if ((var13 = var10[var12]).method142() == 7) {// 247
                                       var13.method6(var3.field1882[var13.method2()]);// 259
                                    }
                                 }
                              }

                              if (var9.method382() != null) {// 194
                                 Class219[] var56;
                                 int var60 = (var56 = var9.method382()).length;

                                 int var64;
                                 for (int var70 = var64 = 0; var70 < var60; var70 = ++var64) {// 397
                                    Class219 var66;
                                    if ((var66 = var56[var64]).method142() == 7) {// 163
                                       var66.method6(var3.field1882[var66.method2()]);// 9
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }// 490

   // $VF: synthetic method
   public void method1705(List var1, Class221 var2) {
      Class547 var3 = this;
      if (var1 != null) {// 444
         for (int var10000 = var4 = var1.size() - 1; var10000 >= 0; var10000 = var4) {// 601
            Object var10001 = var1.get(var4);
            var4--;
            var3.method1712((Class533)var10001, var2);// 193
         }
      }
   }// 251

   // $VF: synthetic method
   public void method1706(Class206 var1, Class197 var2) {
      Class547 var3 = this;
      Class533[] var6 = null;// 985
      if (var1 != null) {// 921
         var6 = var1.method264();
      }

      if (var2 != null) {// 677
         var6 = var2.method264();
      }

      int var4;
      for (int var10000 = var4 = 0; var10000 < var6.length; var10000 = ++var4) {// 698
         Class533 var5 = var6[var4];// 689
         if (var3.field1880.contains(var5.method1591())) {// 811
            if (var1 != null) {// 764
               var1.method263(var5);
            }

            if (var2 != null) {// 821
               var2.method267(var5);
            }
         }
      }
   }// 633

   // $VF: synthetic method
   public void method1707(Class475 var1) {
      Class547 var2 = this;
      if (var1 instanceof Class474) {// 293
         this.method1714(((Class474)var1).method1256());// 54
      } else {
         int var3;
         if (var1 instanceof Class478) {
            List var4;
            for (int var10000 = var3 = (var4 = (var5 = (Class478)var1).method1267()).size() - 1; var10000 >= 0; var10000 = var3) {// 74 241 317
               var2.method1707((Class475)var4.get(var3--));// 526
            }
         } else {
            if (var1 instanceof Class477) {// 136
               Class477 var8 = (Class477)var1;// 158
               var8.method1263(this.field1882[var8.method1266()]);// 90
               return;// 294
            }

            if (var1 instanceof Class476) {
               Class476 var7 = (Class476)var1;// 342
               var7.method1262(this.field1882[var7.method1266()]);// 435
               var7.method1263(this.field1882[var7.method1265()]);// 96
               return;// 581
            }

            if (var1 instanceof Class479) {
               Class479 var6 = (Class479)var1;// 359
               var6.method1263(this.field1882[var6.method1265()]);// 408
            }
         }
      }
   }// 277 322

   // $VF: synthetic method
   public void method1708(Class206 var1) {
      Class547 var3 = this;
      Class221 var8 = var1.method46();// 360
      int var11 = var8.method2();// 312
      int var4 = 0;// 274

      int var5;
      for (int var38 = var5 = this.field1882.length - 1; var38 >= 0; var38 = var5) {// 558
         var4 += var3.field1882[var5--];// 501
      }

      Class178[] var27 = new Class178[var4];// 208
      int var6 = 0;// 168

      int var7;
      for (int var39 = var7 = 0; var39 < var11; var39 = ++var7) {// 237
         Class178 var2 = var8.method174(var7);// 133
         if (var3.field1882[var7] == 1) {// 65
            if (var2 != null) {// 504
               var2 = var2.method222();
            }

            var27[var6] = var2;// 80
            var3.field1882[var7] = var6++;// 283
         }
      }

      for (int var40 = var7 = 0; var40 < var4; var40 = ++var7) {// 102
         Class178 var22;
         if ((var22 = var27[var7]) instanceof Class182) {// 105 183
            Class182 var12 = (Class182)var22;// 205
            var12.method6(var3.field1882[var12.method2()]);// 64
         } else if (var22 instanceof Class187) {// 469
            Class187 var13 = (Class187)var22;// 249
            var13.method90(var3.field1882[var13.method17()]);// 349
            var13.method6(var3.field1882[var13.method2()]);// 196
         } else if (var22 instanceof Class186) {// 164
            Class186 var14 = (Class186)var22;// 554
            var14.method90(var3.field1882[var14.method17()]);// 429
            var14.method6(var3.field1882[var14.method2()]);// 89
         } else if (var22 instanceof Class185) {// 506
            Class185 var15 = (Class185)var22;// 599
            var15.method6(var3.field1882[var15.method2()]);// 318
         } else if (var22 instanceof Class192) {// 88
            Class192 var16 = (Class192)var22;// 306
            var16.method90(var3.field1882[var16.method2()]);// 8
         } else if (var22 instanceof Class193) {// 331
            Class193 var17 = (Class193)var22;// 384
            var17.method90(var3.field1882[var17.method17()]);// 130
         } else if (var22 instanceof Class194) {// 301
            Class194 var18 = (Class194)var22;// 602
            var18.method6(var3.field1882[var18.method2()]);// 363
         }
      }

      Class221 var34;
      Class149 var23 = (var34 = new Class221(var27)).method402();// 256 271
      var1.method59(var34);
      var1.method89(var3.field1882[var1.method30()]);// 47
      var1.method91(var3.field1882[var1.method92()]);// 182 357
      Class151[] var19;
      var4 = (var19 = var1.method200()).length;// 122 305

      for (int var41 = var5 = 0; var41 < var4; var41 = var5) {// 346
         var1.method262(var19[var5++]);// 228
      }

      var3.method1704(var19, var23);// 334

      for (int var42 = var5 = 0; var42 < var4; var42 = var5) {// 219
         var1.method265(var19[var5++]);// 13
      }

      var3.method1697(var1, null, null);
      var3.method1706(var1, null);// 284 333
      var3.method1715(var1.method264());// 255

      for (int var43 = var20 = (var30 = var1.method341()).length - 1; var43 >= 0; var43 = var20) {// 508 517
         Class208 var25;
         boolean var31 = (var25 = var30[var20]).method204() == null;// 214 524
         Class203 var9 = Class376.method716(var25, var1.method93(), var34, var8.method402());// 371
         var3.method1703(var9);
         var3.method1704(var9.method200(), var23);// 431 585
         var3.method1704(new Class151[]{var9.method275(var34)}, var23);// 563
         var3.method1704(var9.method321(), var23);
         var3.method1697(null, var9, null);// 514
         var3.method1706(null, var9);// 374
         var3.method1715(var9.method264());// 14 361

         int var10;
         for (int var44 = var10 = var9.method277().length - 1; var44 >= 0; var44 = var10) {// 453
            var3.method1699(var9.method292(var10--));// 354
         }

         label86: {
            if (!var31) {// 224
               var43 = Class580.method1923().method1658().method1547(var3.field1881, var1, var9);
               Class580.method1923().method1658();
               if (var43 != 4) {
                  break label86;
               }
            }

            var9.method293();// 494
         }

         Class208 var36 = var9.method315();// 560
         var36.method85(var3.field1882[var25.method84()]);
         var36.method89(var3.field1882[var25.method30()]);// 71 174
         var1.method98(var36, var20--);// 441
      }

      for (int var46 = var4 = (var21 = var1.method346()).length - 1; var46 >= 0; var46 = var4) {// 303 326
         Class207 var32 = var21[var4];// 29
         Class204 var35 = new Class204(var32, var8);// 328
         var35.method59(var34);
         var3.method1704(var35.method200(), var23);
         var3.method1697(null, null, var35);// 546
         var3.method1706(null, var35);// 341 457
         var3.method1715(var35.method264());// 51 521
         Class207 var37 = var35.method324();// 598
         var37.method85(var3.field1882[var32.method84()]);// 325
         int var10003 = var3.field1882[var32.method30()];// 392
         var4--;
         var37.method89(var10003);
         var1.method362(var32, var37);// 571
      }
   }// 362

   // $VF: synthetic method
   public void method1709(Class206 var1) {
      Class547 var2 = this;
      Class221 var8 = var1.method46();// 18
      int var5 = var8.method2();// 513
      this.field1882 = new int[var5];
      Arrays.fill(this.field1882, 0);// 151
      this.method1700(0, var8);// 530
      this.method1700(var1.method30(), var8);// 93 491
      this.method1700(var1.method92(), var8);// 147

      int var4;
      for (int var10000 = var4 = (var12 = var1.method41()).length - 1; var10000 >= 0; var10000 = var4) {// 295 338
         var2.method1700(var12[var4--], var8);// 273
      }

      var2.method1701(var1.method200(), var8, false, false);// 161
      var2.method1698(var1.method264(), var8);// 141

      for (int var18 = var5 = (var11 = var1.method341()).length - 1; var18 >= 0; var18 = --var5) {// 123 226
         Class208 var3;
         Class208 var22 = var3 = var11[var5];// 78
         var2.method1700(var3.method84(), var8);
         var2.method1700(var3.method30(), var8);// 533
         var2.method1701(var3.method200(), var8, false, false);// 185
         Class203 var6;
         var2.method1702(var6 = Class376.method716(var22, var1.method93(), var8, var8.method402()), var8);// 1 406 418
         var2.method1698(var6.method264(), var8);// 46

         int var7;
         for (int var19 = var7 = var6.method277().length - 1; var19 >= 0; var19 = var7) {// 170
            var2.method1705(var6.method292(var7--), var8);// 553
         }
      }

      int var9;
      for (int var20 = var9 = (var14 = var1.method346()).length - 1; var20 >= 0; var20 = var9) {// 315 465
         Class207 var15;
         Class207 var24 = var15 = var14[var9];// 132
         var2.method1700(var15.method84(), var8);
         var2.method1700(var15.method30(), var8);// 184 534
         var2.method1701(var24.method200(), var8, false, false);// 488
         Class204 var10001 = new Class204(var15, var8);// 159
         var9--;
         var2.method1698(var10001.method264(), var8);
      }

      for (int var21 = var9 = var8.method2() - 1; var21 >= 0; var21 = --var9) {// 604
         Class178 var16;
         if ((var16 = var8.method174(var9)) instanceof Class191) {// 6 22
            Class191 var17 = (Class191)var16;// 144
            if ("".equals(var17.method20())) {// 461
               var2.method1700(var9, var8);// 358
            }
         }
      }
   }// 272

   // $VF: synthetic method
   public boolean method1710(Class533 var1) {
      if (var1.method1589().startsWith("Lcom/allatori/annotations/")) {// 632
         this.field1880.add(var1.method1591());// 818
         return true;// 966
      } else {
         String var3;
         if (Class580.method1928().method652() && (var3 = var1.method1589()).length() > 2 && var3.charAt(0) == 'L' && var3.charAt(var3.length() - 1) == ';') {// 788 897 927
            String var4 = var3.substring(1, var3.length() - 1).replace('/', '.');// 833 902
            if (Class580.method1928().method651(this.field1881, this.field1883, var4)) {// 608
               this.field1880.add(var1.method1591());// 721
               return true;// 960
            }

            String var5 = Class580.method1930().field1196.method1341(var4);// 914
            if (Class580.method1928().method651(this.field1881, this.field1883, var5)) {// 735
               this.field1880.add(var1.method1591());// 846
               return true;// 756
            }
         }

         return false;// 801
      }
   }

   // $VF: synthetic method
   public Class547(Class338 var1) {
      this.field1881 = var1;// 30 260
   }// 143

   // $VF: synthetic method
   public void method1711(Class206 var1) {
      Class206 var10003 = this.field1883 = var1;
      this.field1880.clear();// 239
      this.method1709(var10003);// 310
      this.method1708(var1);// 204 498
   }// 484

   // $VF: synthetic method
   public void method1712(Class533 var1, Class221 var2) {
      Class547 var7 = this;
      if (!this.method1710(var1)) {// 300
         this.method1700(var1.method1591(), var2);// 245

         int var3;
         for (int var8 = var3 = (var6 = var1.method1583()).size() - 1; var8 >= 0; var8 = var3) {// 296 404
            Class548 var4;
            Class548 var10001 = var4 = (Class548)var6.get(var3);// 417
            var7.method1700(var4.method1719(), var2);// 81
            var3--;
            var7.method1713(var10001.method1716(), var2);// 401
         }
      }
   }// 556

   // $VF: synthetic method
   public void method1713(Class475 var1, Class221 var2) {
      Class547 var6 = this;
      if (var1 instanceof Class474) {// 275
         this.method1712(((Class474)var1).method1256(), var2);// 127
      } else {
         int var3;
         if (var1 instanceof Class478) {
            List var4;
            for (int var7 = var3 = (var4 = ((Class478)var1).method1267()).size() - 1; var7 >= 0; var7 = var3) {// 215 369 496
               Object var10001 = var4.get(var3);
               var3--;
               var6.method1713((Class475)var10001, var2);// 511
            }
         } else {
            if (var1 instanceof Class477) {// 382
               this.method1700(((Class477)var1).method1266(), var2);// 210
               return;// 576
            }

            if (var1 instanceof Class476) {
               this.method1700(((Class476)var1).method1266(), var2);// 103
               this.method1700(((Class476)var1).method1265(), var2);// 548
               return;// 545
            }

            if (var1 instanceof Class479) {
               this.method1700(((Class479)var1).method1265(), var2);// 570
            }
         }
      }
   }// 162 355

   // $VF: synthetic method
   public void method1714(Class533 var1) {
      Class547 var2 = this;
      var1.method1585(this.field1882[var1.method1591()]);// 267

      for (int var10000 = var4 = (var5 = var1.method1583()).size() - 1; var10000 >= 0; var10000 = var4) {// 393 419
         Class548 var3;
         Class548 var6 = var3 = (Class548)var5.get(var4);// 230
         int var10003 = var2.field1882[var3.method1719()];
         var4--;
         var6.method1721(var10003);
         var2.method1707(var6.method1716());// 515
      }
   }// 395

   // $VF: synthetic method
   public void method1715(Class533[] var1) {
      Class547 var2 = this;
      if (var1 != null) {// 351
         for (int var10000 = var3 = var1.length - 1; var10000 >= 0; var10000 = var3) {// 75
            var2.method1714(var1[var3--]);// 372
         }
      }
   }// 111
}
