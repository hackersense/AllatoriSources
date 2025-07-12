package mapped;

import smardecSB.getfield;
import smardecSB.if_acmpne;
import smardecSB.ldc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collection;
import java.util.Vector;
import java.util.regex.Pattern;

// $VF: Compiled from vw
public class Class482 {
   // $VF: synthetic field
   public static Vector field1591 = new Vector();

   // $VF: synthetic method
   public static void method1272(Class206 var0) {
      Class206 var1 = var0;

      int var5;
      Class207[] var8;
      for (int var10000 = var5 = (var8 = var0.method346()).length - 1; var10000 >= 0; var10000 = --var5) {// 41 551
         Class161 var3;
         Class207 var4;
         Class178 var12;
         if ((var3 = (var4 = var8[var5]).method367()) != null && (var12 = var1.method46().method174(var3.method30())) instanceof Class185 && var4.method242()) {// 91 274 312 340 360
            if (!var4.method254()) {// 558
               Class204 var11 = new Class204(var4, var1.method46());// 501
               var11.method107();// 337
               var1.method362(var4, var11.method324());// 208
            } else {
               Class208 var2 = null;// 237

               Class208[] var6;
               int var7;
               for (int var17 = var7 = (var6 = var1.method341()).length - 1; var17 >= 0; var17 = --var7) {// 65 133
                  Class208 var9 = var6[var7];// 504
                  if ("<clinit>".equals(var9.method190())) {// 80
                     var2 = var9;// 283
                     break;// 544
                  }
               }

               Class251 var10 = new Class251();// 105
               var10.method464(Class120.method55(Class138.field586));// 183
               Class203 var16;
               Class206 var18;
               if (var2 != null) {// 205
                  var10 = (var16 = Class376.method716(var2, var1.method93(), var1.method46(), var1.method46().method402())).method42();// 64 469
                  var18 = var1;
               } else {
                  var16 = new Class203(8, Class138.field586, Class138.field582, new String[0], "<clinit>", var1.method93(), var10, var1.method46());// 349
                  var18 = var1;// 554
               }

               String var13 = ((Class191)var18.method46().method174(((Class185)var12).method2())).method20();
               Class120 var15 = new Class120(var1);// 429
               var10.method464(var15.method49(var1.method93(), var4.method190(), Class138.field593, (short)179));// 89
               var10.method483(new Class116(var1.method46(), var13));// 506
               var16.method309();// 318
               var16.method276();// 88
               Class251 var19;
               if (var2 != null) {// 306
                  var1.method360(var2, var16.method315());// 8
                  var19 = var10;
               } else {
                  var1.method365(var16.method315());// 384
                  var19 = var10;// 130
               }

               var19.method107();
               Class204 var14 = new Class204(var4, var1.method46());// 602
               var14.method107();// 363
               var1.method362(var4, var14.method324());// 509
            }
         }
      }
   }// 256

   // $VF: synthetic method
   public static String method1273(Class206 var0) {
      Class151[] var1;
      if ((var1 = var0.method200()) == null) {// 365 366
         return "Unknown Source";
      } else {
         for (int var10000 = var1.length - 1; var10000 >= 0; var10000 = --var10000) {// 263
            if (var1[var10000] instanceof Class169) {// 225
               return ((Class169)var1[var10000]).method93();// 532
            }
         }

         return "Unknown Source";// 426
      }
   }

   // $VF: synthetic method
   public static Vector<Class10> method1274(int var0) {
      Vector<Class10> var4 = new Vector<>();// 557
      String var2;
      String var10000 = var2 = Integer.toBinaryString(var0);// 34

      while (var10000.length() < 7) {// 332
         var10000 = var2 = "0" + var2;
      }

      if (var2.startsWith("0")) {// 260
         boolean var7;
         if (var7 = method1281(var4, var2.substring(1, 4))) {// 30 143
            var4.add(Opcodes.field26);// 252
            var4.add(Opcodes.field96);// 20
         }

         if (method1281(var4, var2.substring(4, 7)) && var7) {// 239
            var4.add(Opcodes.field112);// 310
         }

         return var4;// 498
      } else if (var2.endsWith("0")) {// 484
         boolean var6;
         if (var6 = method1281(var4, var2.substring(0, 3))) {// 389 409
            var4.add(Opcodes.field92);// 18
            var4.add(Opcodes.field96);// 513
         }

         if (method1281(var4, var2.substring(3, 6)) && var6) {// 151
            var4.add(Opcodes.field75);// 530
            var4.add(Opcodes.field96);// 491
            var4.add(Opcodes.field112);// 147
         }

         return var4;// 338
      } else if (var2.charAt(3) == '0') {// 273
         boolean var5;
         if (var5 = method1281(var4, var2.substring(0, 3))) {// 141 161
            var4.add(Opcodes.field92);// 580
            var4.add(Opcodes.field96);// 226
         }

         if (method1281(var4, var2.substring(4, 7)) && var5) {// 78
            var4.add(Opcodes.field112);// 418
         }

         return var4;// 533
      } else {
         method1281(var4, var2.substring(0, 3));// 406
         var4.add(Opcodes.field92);// 1
         var4.add(Opcodes.field96);// 46
         boolean var3 = method1276(var4, var2.substring(3, 5));// 170
         if (var3) {// 553
            var4.add(Opcodes.field129);// 58
            var4.add(Opcodes.field96);// 190
         }

         if (method1276(var4, var2.substring(5, 7))) {// 465
            var4.add(Opcodes.field112);// 132
         }

         if (var3) {// 184
            var4.add(Opcodes.field112);// 534
         }

         return var4;// 488
      }
   }

   // $VF: synthetic method
   public static int method1275(Class246 var0) {
      Class200[] var1;
      if ((var1 = var0.method431()) == null) {// 438 592
         return -1;
      } else {
         int var3;
         for (int var10000 = var3 = var1.length - 1; var10000 >= 0; var10000 = --var3) {// 483
            if (var1[var3] instanceof Class201) {// 181
               return ((Class201)var1[var3]).method2();// 433
            }
         }

         return -1;// 413
      }
   }

   // $VF: synthetic method
   public static boolean method1276(Vector<Class10> var0, String var1) {
      if ("00".equals(var1)) {// 68
         return false;// 59
      } else {
         if ("01".equals(var1)) {// 391
            var0.add(Opcodes.field75);// 330
         } else if ("10".equals(var1)) {// 589
            var0.add(Opcodes.field129);// 579
         } else if ("11".equals(var1)) {// 555
            var0.add(Opcodes.field26);// 73
         }

         return true;// 398
      }
   }

   // $VF: synthetic method
   public static boolean method1277(String var0) {

	   int var2;
      for (int var10000 = var2 = field1591.size() - 1; var10000 >= 0; var10000 = --var2) {// 167
         if (((Pattern)field1591.get(var2)).matcher(var0).matches()) {// 414
            return true;
         }
      }

      return false;// 12
   }

   // $VF: synthetic method
   public static void method1278(Class206 var0) {
	   String var6 = "Ljava/lang/String;";// 169

      Class208[] var10;
      int var16;
      for (int var10000 = var16 = (var10 = var0.method341()).length - 1; var10000 >= 0; var10000 = --var16) {// 299 314
         Class208 var4;
         if ((var4 = var10[var16]).method369() != null) {// 50 137
            Class251 var5;
            Class246 var18;
            Class246 var33 = var18 = (var5 = Class376.method716(var4, var0.method93(), var0.method46(), var0.method46().method402()).method42()).method32();// 135 253 443

            while (var33 != null) {// 166
               Class246 var35;
               if (!(var18.method18() instanceof ldc)) {// 292
                  var35 = var18;
               } else {
                  ldc var7 = (ldc)var18.method18();// 373
                  if (!(var0.method46().method174(var7.method2()) instanceof Class185)) {// 72 268
                     var35 = var18;
                  } else {
                     label149: {
                        Class221 var9 = var0.method46();// 66
                        int var2 = var7.method11(var9);// 536
                        Class246 var11 = var18.method32();// 307
                        int var12 = 0;// 218

                        while (var11 != null) {// 109
                           int var13 = var11.method18().method11(var9);// 213
                           int var14 = var11.method18().method15(var9);// 15
                           if (var13 == -2) {// 385
                              break;
                           }

                           if (var14 == -2) {
                              var35 = var18;
                              break label149;
                           }

                           if ((var2 = var2 - var14) <= 0) {// 270 471
                              Class10 var15;
                              if (!((var15 = var11.method18()) instanceof Class100) && !(var15 instanceof if_acmpne)) {// 177 582
                                 break;
                              }

                              int var3;
                              do {
                                 var3 = method1275(var11);// 370
                              } while ((var11 = var11.method37()) != null && var3 == -1);// 95 516

                              String var17 = new StringBuilder()
                                 .insert(0, var0.method93())// 55
                                 .append(".")
                                 .append(var4.method190())
                                 .append("(")
                                 .append(method1273(var0))
                                 .toString();
                              if (var3 != -1) {// 77
                                 var17 = var17 + ":" + var3;
                              }

                              var17 = var17 + ")";// 288
                              Logger.warning("Comparing strings using '==' operator at " + var17);// 129
                              var35 = var18;
                              break label149;// 258
                           }

                           var2 += var13;// 110
                           var11 = var11.method32();// 221
                           if (var12++ > 33) {// 444
                              var35 = var18;
                              break label149;
                           }
                        }

                        var35 = var18;// 251
                     }
                  }
               }

               var33 = var18 = var35.method32();
            }

            Class246 var19;
            Class246 var36 = var19 = var5.method32();// 300

            while (var36 != null) {// 245
               Class246 var38;
               if (!(var19.method18() instanceof Class6) && !(var19.method18() instanceof getfield)) {// 404
                  var38 = var19;
               } else {
                  Class5 var24 = (Class5)var19.method18();// 81
                  Class221 var8 = var0.method46();// 401
                  if (!var6.equals(var24.method518(var8))) {// 394
                     var38 = var19;
                  } else {
                     label146: {
                        int var25 = var24.method11(var8);// 316
                        Class246 var21 = var19.method32();// 207
                        int var27 = 0;// 275

                        while (var21 != null) {// 127
                           int var28 = var21.method18().method11(var8);// 355
                           int var29 = var21.method18().method15(var8);// 496
                           if (var28 == -2) {// 369
                              break;
                           }

                           if (var29 == -2) {
                              var38 = var19;
                              break label146;
                           }

                           if ((var25 = var25 - var29) <= 0) {// 215 511
                              Class10 var30;
                              if (!((var30 = var21.method18()) instanceof Class100) && !(var30 instanceof if_acmpne)) {// 210 382
                                 break;
                              }

                              int var31;
                              do {
                                 var31 = method1275(var21);// 545
                              } while ((var21 = var21.method37()) != null && var31 == -1);// 523 570

                              String var22 = new StringBuilder()
                                 .insert(0, var0.method93())// 282
                                 .append(".")
                                 .append(var4.method190())
                                 .append("(")
                                 .append(method1273(var0))
                                 .toString();
                              if (var31 != -1) {// 503
                                 var22 = var22 + ":" + var31;
                              }

                              var22 = var22 + ")";// 339
                              Logger.warning("Comparing strings using '==' operator at " + var22);// 308
                              var38 = var19;
                              break label146;// 596
                           }

                           var25 += var28;// 76
                           var21 = var21.method32();// 145
                           if (var27++ > 33) {// 390
                              var38 = var19;
                              break label146;
                           }
                        }

                        var38 = var19;// 502
                     }
                  }
               }

               var36 = var19 = var38.method32();
            }
         }
      }
   }// 564

   // $VF: synthetic method
   public static void method1279(Class206 var0, String var1, char var2) {
      Class120 var6 = new Class120(var0);// 182
      Class221 var5 = var0.method46();// 4 122
      Class251 var12 = new Class251();// 346
      Class203 var13 = new Class203(9, Class138.field593, new Class138[]{Class138.field593}, new String[]{"s"}, var1, var0.method93(), var12, var5);// 228
      int var7 = var5.method404("java.lang.String");// 219
      int var8 = var5.method404("[C");// 13
      int var9 = var5.method106("StackMap");// 333
      Class149 var10 = var5.method402();// 284
      Class218 var11 = new Class218(
         27,// 255
         4,
         new Class219[]{
            new Class219((byte)7, var7, var10), new Class219((byte)7, var8, var10), new Class219((byte)1, 0, var10), new Class219((byte)1, 0, var10)
         },
         0,
         new Class219[0],
         var10
      );
      Class218 var16 = new Class218(
         58,// 431
         4,
         new Class219[]{
            new Class219((byte)7, var7, var10), new Class219((byte)7, var8, var10), new Class219((byte)1, 0, var10), new Class219((byte)1, 0, var10)
         },
         0,
         new Class219[0],
         var10
      );
      Class150 var17 = new Class150(var9, 30, new Class218[]{var11, var16}, var10);// 224
      var13.method299(var17);// 494
      var12.method451(Class120.method77(Class138.field583, 0));// 174
      var12.method451(var6.method47("java.lang.String", "length", Class138.field591, Class138.field582, (short)182));// 71
      var12.method451(var6.method67(Class138.field585, (short)1));// 375
      var12.method484(new Class116(var5, 1));// 441
      var12.method451(Opcodes.dup);// 575
      var12.method451(Opcodes.pop2);// 547
      var12.method451(Class120.method75(Class138.field583, 1));// 326
      var12.method484(new Class116(var5, var2));// 29
      var12.method484(new Class116(var5, 1));// 521
      var12.method451(Opcodes.dup);// 457
      var12.method451(Opcodes.pop2);// 546
      var12.method451(Class120.method75(Class138.field591, 2));// 51
      var12.method451(Class120.method77(Class138.field583, 1));// 598
      var12.method451(Opcodes.field126);// 325
      var12.method484(new Class116(var5, 1));// 392
      var12.method484(new Class116(var5, 1));// 44
      var12.method451(Opcodes.dup);// 362
      var12.method451(Opcodes.pop2);// 476
      var12.method451(Opcodes.isub);// 231
      var12.method451(Class120.method75(Class138.field591, 3));// 420
      Class90 var14 = Class120.method73((short)167, null);// 454
      var12.method439(var14);// 343
      Class246 var18 = var12.method451(Class120.method77(Class138.field583, 1));// 62
      var12.method451(Class120.method77(Class138.field591, 3));// 126
      var12.method451(Class120.method77(Class138.field583, 0));// 324
      var12.method451(Class120.method77(Class138.field591, 3));// 519
      var12.method451(var6.method47("java.lang.String", "charAt", Class138.field585, new Class138[]{Class138.field591}, (short)182));// 376
      var12.method451(Class120.method77(Class138.field591, 2));// 492
      var12.method451(Opcodes.field112);// 482
      var12.method451(Opcodes.field27);// 432
      var12.method484(new Class116(var5, 1));// 155
      var12.method451(Opcodes.dup);// 2
      var12.method451(Opcodes.pop2);// 505
      var12.method451(Opcodes.castore);// 583
      var12.method451(Class120.method77(Class138.field591, 2));// 19
      var12.method451(Class120.method77(Class138.field591, 3));// 86
      var12.method451(Opcodes.field112);// 473
      var12.method451(Opcodes.field27);// 131
      var12.method451(Class120.method75(Class138.field591, 2));// 528
      var12.method451(Class120.method77(Class138.field591, 2));// 289
      var12.method484(new Class116(var5, 63));// 264
      var12.method484(new Class116(var5, 1));// 458
      var12.method451(Opcodes.dup);// 591
      var12.method451(Opcodes.pop2);// 572
      var12.method451(Opcodes.field89);// 348
      var12.method451(Opcodes.field27);// 150
      var12.method451(Class120.method75(Class138.field591, 2));// 56
      var12.method451(new Class286(3, -1));// 416
      Class246 var15 = var12.method451(Class120.method77(Class138.field591, 3));// 211
      var12.method439(Class120.method73((short)156, var18));// 178 427
      var12.method451(var6.method58("java.lang.String"));// 262
      var12.method451(Opcodes.dup);// 475
      var12.method451(Class120.method77(Class138.field583, 1));// 100
      var12.method451(var6.method47("java.lang.String", "<init>", Class138.field586, new Class138[]{new Class145(Class138.field585, 1)}, (short)183));// 202
      var12.method451(Class120.method55(Class138.field583));// 250
      var14.method29(var15);// 128
      var13.method309();// 290
      var13.method276();// 199
      var0.method365(var13.method315());// 512
      var12.method107();// 538
   }// 92

   // $VF: synthetic method
   public static void method1280() {
      field1591 = new Vector();// 311
      if (Class580.method1932().method1871() != null) {// 98
         BufferedReader var0;
         try {
            for (String var1 = (var0 = new BufferedReader(new FileReader(Class580.method1932().method1871()))).readLine(); var1 != null; var1 = var0.readLine()) {// 16 85 206 405
               if (var1.length() > 0) {// 121
                  if (var1.startsWith("regex:")) {// 480
                     var1 = var1.substring(6);// 518
                  } else {
                     var1 = var1.replaceAll("\\.", "\\\\.").replaceAll("\\*", ".*");// 381 387
                  }

                  field1591.add(Pattern.compile(var1, 32));// 261
               }
            }
         } catch (Exception var2) {// 156
            var2.printStackTrace();// 3
         }
      }
   }// 186

   // $VF: synthetic method
   public static boolean method1281(Vector var0, String var1) {
      if ("000".equals(var1)) {// 377
         return false;// 604
      } else {
         if ("001".equals(var1)) {// 22
            var0.add(Opcodes.field75);// 6
         } else if ("010".equals(var1)) {// 144
            var0.add(Opcodes.field129);// 461
         } else if ("011".equals(var1)) {// 358
            var0.add(Opcodes.field26);// 192
         } else if ("100".equals(var1)) {// 574
            var0.add(Opcodes.field92);// 272
         } else if ("101".equals(var1)) {// 321
            var0.add(Opcodes.field116);// 179
         } else if ("110".equals(var1)) {// 146
            var0.add(Opcodes.field26);// 567
            var0.add(Opcodes.field116);// 400
            var0.add(Opcodes.field112);// 33
         } else if ("111".equals(var1)) {// 0
            var0.add(Opcodes.field129);// 240
            var0.add(Opcodes.field116);// 246
            var0.add(Opcodes.field112);// 552
         }

         return true;// 278
      }
   }

   // $VF: synthetic method
   public static void method1282(Class206 var0, Collection var1) {
      Class206 var2 = var0;

      int var15;
      for (int var10000 = var15 = (var16 = var0.method346()).length - 1; var10000 >= 0; var10000 = --var15) {// 198 424
         Class207 var4;
         Class161 var5;
         Class178 var6;
         if ((var5 = (var4 = var16[var15]).method367()) != null && (var6 = var2.method46().method174(var5.method30())) instanceof Class185) {// 28 38 329 412 588
            String var7 = ((Class191)var2.method46().method174(((Class185)var6).method2())).method20();// 257
            var1.add(var7);// 269
         }
      }

      int var21;
      for (int var30 = var21 = (var29 = var2.method341()).length - 1; var30 >= 0; var30 = --var21) {// 39 142
         Class208 var22;
         if ((var22 = var29[var21]).method369() != null) {// 99 368
            Class246 var17;
            Class251 var23;
            Class246 var31 = var17 = (var23 = Class376.method716(var22, var2.method93(), var2.method46(), var2.method46().method402()).method42()).method32();// 40 160

            while (var31 != null) {
               label122: {
                  if (var17.method18() instanceof Class267 || var17.method18() instanceof Class287) {// 510
                     if (var17.method37() == null) {// 456
                        var32 = var17;
                        break label122;
                     }

                     Class246 var8;
                     if ((var8 = var17.method37()).method18() instanceof ldc) {// 82 367
                        ldc var9 = (ldc)var8.method18();// 83
                        Class178 var10;
                        if ((var10 = var2.method46().method174(var9.method2())) instanceof Class185) {// 5 279
                           String var11 = ((Class191)var2.method46().method174(((Class185)var10).method2())).method20();// 450
                           var1.add(var11);// 386
                        }
                     }
                  }

                  var32 = var17;// 541
               }

               var31 = var17 = var32.method32();
            }

            Class246 var18;
            Class246 var33 = var18 = var23.method32();// 600

            while (var33 != null) {// 108
               Class246 var34;
               if (!(var18.method18() instanceof ldc)) {// 242
                  var34 = var18;
               } else {
                  ldc var24 = (ldc)var18.method18();// 94
                  Class178 var25;
                  if (!((var25 = var2.method46().method174(var24.method2())) instanceof Class185)) {// 69 209
                     var34 = var18;
                  } else {
                     Class221 var26 = var2.method46();// 422
                     int var27 = var24.method11(var26);// 464
                     Class246 var12 = var18.method32();// 25
                     int var13 = 0;// 31

                     while (true) {
                        if (var12 != null) {// 21
                           int var14 = var12.method18().method11(var26);// 115
                           int var3 = var12.method18().method15(var26);// 223
                           if (var14 != -2) {// 45
                              if (var3 == -2) {
                                 var34 = var18;
                                 break;
                              }

                              if ((var27 = var27 - var3) > 0) {// 23 440
                                 var27 += var14;// 32
                                 var12 = var12.method32();// 238
                                 if (var13++ > 33) {// 423
                                    var34 = var18;
                                    break;
                                 }
                                 continue;
                              }

                              Class10 var19;
                              if ((var19 = var12.method18()) instanceof Class100 || var19 instanceof if_acmpne) {// 97 248
                                 String var20 = ((Class191)var2.method46().method174(((Class185)var25).method2())).method20();// 411
                                 var34 = var18;
                                 var1.add(var20);// 468
                                 break;// 138
                              }
                           }
                        }

                        var34 = var18;// 220
                        break;
                     }
                  }
               }

               var33 = var18 = var34.method32();
            }
         }
      }
   }// 540
}
