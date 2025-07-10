package mapped;

import smardecSB.nop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// $VF: Compiled from wj
public class Class203 extends Class197 {
   // $VF: synthetic field
   public Class251 field709;
   // $VF: synthetic field
   public String field710;
   // $VF: synthetic field
   public boolean field711;
   // $VF: synthetic field
   public int field712;
   // $VF: synthetic field
   public List field713;
   // $VF: synthetic field
   public static Class399 field714 = new Class401();
   // $VF: synthetic field
   public boolean field715;
   // $VF: synthetic field
   public boolean field716;
   // $VF: synthetic field
   public List field717;
   // $VF: synthetic field
   public List field718;
   // $VF: synthetic field
   public Class138[] field719;
   // $VF: synthetic field
   public String[] field720;
   // $VF: synthetic field
   public int field721;
   // $VF: synthetic field
   public List[] field722;
   // $VF: synthetic field
   public List field723;
   // $VF: synthetic field
   public List field696;
   // $VF: synthetic field
   public List field724;

   // $VF: synthetic method
   public Class160 method275(Class221 var1) {
      Class199[] var4;
      int var5;
      Class124[] var6 = new Class124[var5 = (var4 = this.method284()).length];// 457 521 546

      int var3;
      for (int var10000 = var3 = 0; var10000 < var5; var10000 = var3) {// 341
         int var10001 = var3;
         Class124 var10002 = var4[var3].method269(var1);
         var3++;
         var6[var10001] = var10002;// 51
      }

      return new Class160(var1.method106("LocalVariableTable"), 2 + var6.length * 10, var6, var1.method402());// 325
   }

   // $VF: synthetic method
   public Class251 method42() {
      return this.field709;// 983
   }

   // $VF: synthetic method
   public void method276() {
      Class203 var3 = this;
      if (this.field709 != null) {// 620
         int var1 = this.method254() ? 0 : 1;// 799
         int var2;
         if (this.field719 != null) {// 876
            for (int var10000 = var2 = 0; var10000 < var3.field719.length; var10000 = var2) {// 964
               Class138 var10001 = var3.field719[var2];// 886
               var2++;
               var1 += var10001.method2();
            }
         }

         for (Class246 var7 = var6 = var3.field709.method32(); var7 != null; var7 = var6 = var6.method32()) {// 884
            Class10 var4;
            int var5;
            if (((var4 = var6.method18()) instanceof Class277 || var4 instanceof Class279 || var4 instanceof Class286)// 748 825
               && (var5 = ((Class278)var4).method2() + ((Class16)var4).method1(var3.field723).method2()) > var1) {// 723 860
               var1 = var5;// 615
            }
         }

         var3.field721 = var1;// 699
      } else {
         this.field721 = 0;// 652
      }
   }// 679 970

   // $VF: synthetic method
   public Class138[] method277() {
      return (Class138[])this.field719.clone();// 745
   }

   // $VF: synthetic method
   public void method278() {
      this.field713.clear();// 264
   }// 323

   // $VF: synthetic method
   public String[] method279() {
      String[] var2 = new String[this.field696.size()];// 584
      this.field696.toArray(var2);// 200
      return var2;// 84
   }

   // $VF: synthetic method
   public void method280() {
      this.field696.clear();// 75
   }// 372

   // $VF: synthetic method
   public Class138 method164() {
      return this.method26();// 683
   }

   // $VF: synthetic method
   public Class203 method281(String var1, Class221 var2) {
      Class208 var3 = ((Class203)this.clone()).method315();// 1582
      this = new Class203(var3, var1, this.field723);// 1400
      if (this.field723 != var2) {// 1025
         this.method59(var2);// 1007
         this.method42().method463(this.field723, var2);// 1048
      }

      return this;// 1136
   }

   // $VF: synthetic method
   public Class202[] method282() {
      Class202[] var2 = new Class202[this.field717.size()];// 529
      this.field717.toArray(var2);// 106
      return var2;// 569
   }

   // $VF: synthetic method
   public void method283(Class251 var1) {
      this.field709 = var1;// 729
   }// 776

   // $VF: synthetic method
   public Class199[] method284() {
      Class203 var2 = this;
      int var1;
      Class199[] var4 = new Class199[var1 = this.field718.size()];// 431 563
      this.field718.toArray(var4);// 14
      int var3 = 0;

      for (int var10000 = var3; var10000 < var1; var10000 = ++var3) {// 514
         if (var4[var3].method37() == null) {// 374
            var4[var3].method268(var2.field709.method32());// 361
         }

         if (var4[var3].method32() == null) {// 354
            var4[var3].method29(var2.field709.method37());// 224
         }
      }

      if (var1 > 1) {// 174
         method307(var4, 0, var1 - 1);// 71
      }

      return var4;// 191
   }

   // $VF: synthetic method
   public void method285(boolean var1) {
      this.field716 = var1;// 716
   }// 810

   // $VF: synthetic method
   public void method286(Class221 var1) {
      Class203 var5 = this;
      if (this.field711) {// 949
         int var2;
         Class151[] var4;
         if ((var4 = Class523.method1546(var1, this.field722)) != null) {// 936 968
            for (int var6 = var2 = 0; var6 < var4.length; var6 = var2) {// 670
               var5.method262(var4[var2++]);// 691
            }
         }
      }
   }// 788

   // $VF: synthetic method
   public void method287(Class199 var1) {
      this.field718.remove(var1);// 105
   }// 183

   // $VF: synthetic method
   public void method288(String var1) {
      this.field696.add(var1);// 104
   }// 590

   // $VF: synthetic method
   public void method85(int var1) {
      this.field721 = var1;// 826
   }// 891

   // $VF: synthetic method
   public static Class399 method224() {
      return field714;// 1016
   }

   // $VF: synthetic method
   public void method289(Class151 var1) {
      this.field723.remove(var1);// 353
   }// 189

   // $VF: synthetic method
   public Class203(Class208 var1, String var2, Class221 var3) {
      Class203 var12 = this;
      int var10001 = var1.method17();// 423
      Class138 var10002 = Class138.method150(var1.method20());
      Class138[] var10003 = Class138.method146(var1.method20());
      String var10005 = var1.method190();
      Class251 var10007;
      Class221 var10008;
      if ((var1.method17() & 1280) == 0) {
         var10007 = new Class251(var1.method369().method207());
         var10008 = var3;
      } else {
         var10007 = null;
         var10008 = var3;
      }

      this(var10001, var10002, var10003, null, var10005, var2, var10007, var10008);
      Class151[] var19 = var1.method200();// 540

      int var4;
      for (int var10000 = var4 = 0; var10000 < var19.length; var10000 = ++var4) {// 291
         Class151 var5;
         if (!((var5 = var19[var4]) instanceof Class164)) {// 57 169
            if (var5 instanceof Class157) {// 207
               String[] var22 = ((Class157)var5).method130();// 275

               int var24;
               for (int var41 = var24 = 0; var41 < var22.length; var41 = var24) {// 127
                  var12.method288(var22[var24++]);// 355
               }
            } else if (var5 instanceof Class154) {// 369
               Class154 var21;
               Class128[] var23 = (var21 = (Class154)var5).method137();// 215 511

               int var26;
               for (int var40 = var26 = 0; var40 < var23.length; var40 = var26) {// 382
                  Class128 var28 = var23[var26];// 210
                  var26++;
                  var12.method263(new Class533(var28, var3, false));// 576
               }
            } else {
               var12.method262(var5);// 545
            }
         } else {
            Class164 var6 = (Class164)var5;// 216
            var12.method89(var6.method92());
            var12.method85(var6.method30());// 299 314
            Class122[] var7;
            int var8;
            if ((var7 = var6.method201()) != null) {// 50 137
               for (int var35 = var8 = 0; var35 < var7.length; var35 = var8) {// 253
                  Class122 var9;
                  int var10 = (var9 = var7[var8]).method84();// 135 474
                  Class144 var11 = null;// 443
                  if (var10 > 0) {// 166
                     String var15 = var1.method94().method176(var10, (byte)7);// 434
                     var11 = new Class144(var15);// 373
                  }

                  int var16 = var9.method2();// 268
                  Class246 var14;
                  Class203 var36;
                  if (var1.method369().method207().length == var16) {// 497 536
                     var36 = var12;// 307
                     var14 = var12.field709.method37();
                  } else {
                     var36 = var12;// 109
                     var14 = var12.field709.method468(var16).method37();// 213
                  }

                  Class246 var42 = var12.field709.method468(var9.method17());// 385
                  Class251 var46 = var12.field709;
                  int var10004 = var9.method30();
                  var8++;
                  var36.method301(var42, var14, var46.method468(var10004), var11);
               }
            }

            Class151[] var25 = var6.method200();// 177

            int var27;
            for (var10000 = var27 = 0; var10000 < var25.length; var10000 = ++var27) {// 266
               if ((var5 = var25[var27]) instanceof Class163) {// 235 280
                  Class210[] var30 = ((Class163)var5).method197();// 370

                  int var32;
                  for (int var39 = var32 = 0; var39 < var30.length; var39 = ++var32) {// 516
                     Class210 var18 = var30[var32];// 95
                     Class246 var33;
                     if ((var33 = var12.field709.method468(var18.method2())) != null) {// 55 227
                        var12.method311(var33, var18.method17());// 77
                     }
                  }
               } else if (var5 instanceof Class160) {// 258
                  Class124[] var29 = ((Class160)var5).method191();// 107
                  var10000 = 0;
                  var12.method293();// 437

                  for (int var31 = 0; var10000 < var29.length; var10000 = var31) {// 110
                     Class124 var17 = var29[var31];// 221
                     Class246 var13 = var12.field709.method468(var17.method84());// 444
                     Class246 var34 = var12.field709.method468(var17.method84() + var17.method17());// 601
                     if (null == var13) {// 251
                        var13 = var12.field709.method32();// 486
                     }

                     if (null == var34) {// 300
                        var34 = var12.field709.method37();// 245
                     }

                     String var43 = var17.method93();
                     var10002 = Class138.method151(var17.method20());
                     int var47 = var17.method30();
                     var31++;
                     var12.method295(var43, var10002, var47, var13, var34);// 404
                  }
               } else {
                  var12.method299(var5);// 394
               }
            }
         }
      }
   }// 162

   // $VF: synthetic method
   public Class203(int var1, Class138 var2, Class138[] var3, String[] var4, String var5, String var6, Class251 var7, Class221 var8) {
      Class203 var17 = this;
      super();
      this.field718 = new ArrayList();
      this.field713 = new ArrayList();// 159 495
      this.field717 = new ArrayList();// 493
      this.field696 = new ArrayList();// 561
      this.field723 = new ArrayList();// 377
      this.field711 = false;// 6
      this.field715 = false;// 144
      this.method90(var1);// 38
      this.method266(var2);// 257
      this.method308(var3);// 269
      this.method322(var4);// 455
      this.method131(var5);// 148
      this.method302(var6);// 236
      this.method283(var7);// 142
      this.method59(var8);// 39 412
      boolean var13 = this.method261() || this.method246();// 368
      Class246 var14 = null;// 99
      Class246 var15 = null;// 160
      if (!var13) {// 40
         var14 = var7.method32();// 63
         var15 = var7.method37();// 541
         if (!this.method254() && var6 != null) {// 456
            this.method319("this", new Class144(var6), var14, var15);// 367
         }
      }

      if (var3 != null) {// 5
         int var16 = var3.length;// 279

         for (int var18 = var10 = 0; var18 < var16; var18 = ++var10) {// 450
            if (Class138.field586 == var3[var10]) {// 386
               throw new Class241("'void' is an illegal argument type for a method");// 470
            }
         }

         if (var4 != null) {// 24
            if (var16 != var4.length) {// 286
               throw new Class241("Mismatch in argument array lengths: " + var16 + " vs. " + var4.length);// 600
            }
         } else {
            var4 = new String[var16];// 94

            for (int var19 = var11 = 0; var19 < var16; var19 = var11) {// 209
               StringBuilder var10002 = new StringBuilder().append("arg");
               int var10001 = var11;
               String var22 = var10002.append(var11).toString();
               var11++;
               var4[var10001] = var22;// 69
            }

            this.method322(var4);// 422
         }

         int var12;
         if (!var13) {// 25
            for (int var20 = var12 = 0; var20 < var16; var20 = var12) {// 31
               String var21 = var4[var12];
               Class138 var23 = var3[var12];
               var12++;
               var17.method319(var21, var23, var14, var15);// 21
            }
         }
      }
   }// 23

   // $VF: synthetic method
   public Class201[] method290() {
      Class201[] var2 = new Class201[this.field713.size()];// 56
      this.field713.toArray(var2);// 416
      return var2;// 211
   }

   // $VF: synthetic method
   public Class138 method291(int var1) {
      return this.field719[var1];// 922
   }

   // $VF: synthetic method
   public int hashCode() {
      return field714.method749(this);// 1225
   }

   // $VF: synthetic method
   public Class122[] method201() {
      Class203 var3 = this;
      int var1;
      Class122[] var2 = new Class122[var1 = this.field717.size()];// 49 451

      try {
         int var6 = 0;// 173

         while (var6 < var1) {
            Class202 var4 = (Class202)var3.field717.get(var6);// 448
            int var10001 = var6;
            Class122 var10002 = var4.method271(var3.field723);
            var6++;
            var2[var10001] = var10002;// 101
         }
      } catch (ArrayIndexOutOfBoundsException var5) {// 562
      }

      return var2;// 247
   }

   // $VF: synthetic method
   public List method292(int var1) {
      this.method297();// 1081
      return this.field711 && var1 <= this.field719.length ? this.field722[var1] : null;// 1442 1494
   }

   // $VF: synthetic method
   public void method293() {
      this.field718.clear();// 164
   }// 554

   // $VF: synthetic method
   public void method294(Class595 var1) {
      if (this.field724 != null) {// 1367
         this.field724.remove(var1);// 1296
      }
   }// 1423

   // $VF: synthetic method
   public Class199 method295(String var1, Class138 var2, int var3, Class246 var4, Class246 var5) {
      if (var2.method142() != 16) {// 48 281
         int var6 = var2.method2();// 438
         if (var3 + var6 > this.field721) {// 592
            this.field721 = var3 + var6;// 483
         }

         Class199 var8 = new Class199(var3, var1, var2, var4, var5);// 433
         if ((var3 = this.field718.indexOf(var8)) >= 0) {// 413
            this.field718.set(var3, var8);// 320
            return var8;// 478
         } else {
            this.field718.add(var8);// 212
            return var8;// 366
         }
      } else {
         throw new IllegalArgumentException("Can not use " + var2 + " as type for local variable");// 225
      }
   }

   // $VF: synthetic method
   public void method296(Class202 var1) {
      this.field717.remove(var1);// 462
   }// 559

   // $VF: synthetic method
   public void method89(int var1) {
      this.field712 = var1;// 732
   }// 806

   // $VF: synthetic method
   public void method297() {
      Class203 var2 = this;
      if (!this.field715) {// 1004
         Class151[] var6 = this.method200();// 1044
         Class165 var5 = null;// 1142
         Class165 var3 = null;// 1321

         int var4;
         for (int var10000 = var4 = 0; var10000 < var6.length; var10000 = ++var4) {// 1293
            Class151 var10;
            if ((var10 = var6[var4]) instanceof Class165) {// 1227 1326
               if (!var2.field711) {// 1188
                  var2.field722 = new List[var2.field719.length];// 1455

                  int var1;
                  for (int var13 = var1 = 0; var13 < var2.field719.length; var13 = var1) {// 1674
                     List[] var14 = var2.field722;// 1139
                     int var10001 = var1;
                     ArrayList var10002 = new ArrayList();
                     var1++;
                     var14[var10001] = var10002;
                  }
               }

               var2.field711 = true;// 1637
               Class165 var12;
               if ((var12 = (Class165)var10) instanceof Class167) {// 1246 1376
                  var5 = var12;// 1401
               } else {
                  var3 = var12;// 1265
               }

               for (int var15 = var11 = 0; var15 < var2.field719.length; var15 = ++var11) {// 1183
                  try {
                     Class135 var7 = var12.method210()[var11];// 1539
                     List var8 = var2.method305(var7.method137());// 1457
                     var2.field722[var11].addAll(var8);// 1553
                  } catch (Exception var9) {// 1152
                  }
               }
            }
         }

         if (var5 != null) {// 1272
            var2.method265(var5);// 1383
         }

         if (var3 != null) {// 1532
            var2.method265(var3);// 1232
         }

         var2.field715 = true;// 1509
      }
   }// 1506 1588

   // $VF: synthetic method
   public static void method221(Class399 var0) {
      field714 = var0;// 1522
   }// 1262

   // $VF: synthetic method
   public int method84() {
      return this.field712;// 903
   }

   // $VF: synthetic method
   public void method298(String var1) {
      this.field696.remove(var1);// 37
   }// 217

   // $VF: synthetic method
   public String method190() {
      return this.field710;// 874
   }

   // $VF: synthetic method
   public void method299(Class151 var1) {
      this.field723.add(var1);// 113
   }// 459

   // $VF: synthetic method
   public void method300(Class138 var1) {
      this.method266(var1);// 643
   }// 724

   // $VF: synthetic method
   public String[] method130() {
      return (String[])this.field720.clone();// 693
   }

   // $VF: synthetic method
   public Class202 method301(Class246 var1, Class246 var2, Class246 var3, Class144 var4) {
      if (var1 != null && var2 != null && var3 != null) {// 206
         Class202 var6 = new Class202(var1, var2, var3, var4);// 3
         this.field717.add(var6);// 543
         return var6;// 186
      } else {
         throw new Class241("Exception handler target is null instruction");// 350
      }
   }

   // $VF: synthetic method
   public void method302(String var1) {
      this.field710 = var1;// 726
   }// 720

   // $VF: synthetic method
   public void method303() {
      this.field717.clear();// 388
   }// 120

   // $VF: synthetic method
   public void method304(int var1, String var2) {
      this.field720[var1] = var2;// 831
   }// 762

   // $VF: synthetic method
   public List method305(Class128[] var1) {
      Class203 var3 = this;
      ArrayList var2 = new ArrayList();// 988

      for (int var10000 = var4 = 0; var10000 < var1.length; var10000 = var4) {// 1089
         Class128 var10003 = var1[var4];
         Class221 var10004 = var3.method46();
         var4++;
         var2.add(new Class533(var10003, var10004, false));// 1057
      }

      return var2;// 997
   }

   // $VF: synthetic method
   public void method306(int var1, Class533 var2) {
      this.method297();// 1362
      if (!this.field711) {// 1527
         this.field722 = new List[this.field719.length];// 1513
         this.field711 = true;// 1064
      }

      List var4;
      if ((var4 = this.field722[var1]) != null) {// 1439 1470
         var4.add(var2);// 1154
      } else {
         ArrayList var5;
         (var5 = new ArrayList()).add(var2);// 1297 1625
         this.field722[var1] = var5;// 1675
      }
   }// 1156 1591

   // $VF: synthetic method
   public static final void method307(Class199[] var0, int var1, int var2) {
      Class199[] var4 = var0;
      int var3 = var1;// 306
      int var7 = var2;
      int var5 = var0[(var1 + var2) / 2].method2();// 8

      do {
         for (Class199[] var10000 = var4; var10000[var3].method2() < var5; var3++) {// 130
            var10000 = var4;// 301
         }

         for (int var8 = var5; var8 < var4[var7].method2(); var7--) {// 363
            var8 = var5;// 509
         }

         if (var3 <= var7) {// 233
            Class199 var6 = var4[var3];// 271
            var4[var3] = var4[var7];// 256
            var3++;// 47
            var4[var7] = var6;// 357
            var7--;// 182
         }
      } while (var3 <= var7);// 122

      if (var1 < var7) {// 305
         method307(var4, var1, var7);// 346
      }

      if (var3 < var2) {// 334
         method307(var4, var3, var2);// 219
      }
   }// 333

   // $VF: synthetic method
   public void method308(Class138[] var1) {
      this.field719 = var1;// 915
   }// 842

   // $VF: synthetic method
   public void method309() {
      if (this.field709 != null) {// 885
         this.field712 = method316(this.field723, this.field709, this.method282());// 614
         if (this.field712 == 0 && this.field717 != null && this.field717.size() > 0) {// 978
            this.field712 = 1;// 700
            return;
         }
      } else {
         this.field712 = 0;// 941
      }
   }// 661

   // $VF: synthetic method
   public Class157 method310(Class221 var1) {
      Class203 var2 = this;
      int var4;
      int[] var3 = new int[var4 = this.field696.size()];// 43 395

      try {
         int var6 = 0;// 293

         while (var6 < var4) {
            int var10001 = var6;
            int var10002 = var1.method404((String)var2.field696.get(var6));
            var6++;
            var3[var10001] = var10002;// 54
         }
      } catch (ArrayIndexOutOfBoundsException var5) {// 74
      }

      return new Class157(var1.method106("Exceptions"), 2 + 2 * var4, var3, var1.method402());// 241
   }

   // $VF: synthetic method
   @Override
   public String method93() {
      return Class138.method148(this.field724, this.field719);// 761
   }

   // $VF: synthetic method
   public Class201 method311(Class246 var1, int var2) {
      Class201 var4 = new Class201(var1, var2);// 324
      this.field713.add(var4);// 519
      return var4;// 376
   }

   // $VF: synthetic method
   public void method312(Class595 var1) {
      if (this.field724 == null) {// 1528
         this.field724 = new ArrayList();// 1150
      }

      this.field724.add(var1);// 1050
   }// 1676

   // $VF: synthetic method
   public String method105(int var1) {
      return this.field720[var1];// 808
   }

   // $VF: synthetic method
   public void method313() {
      Class203 var1 = this;
      Iterator var2;
      if (this.field724 != null) {// 1058
         for (Iterator var10000 = var2 = this.field724.iterator(); var10000.hasNext(); var10000 = var2) {// 990
            ((Class595)var2.next()).method2038(var1);// 1339
         }
      }
   }// 1570

   // $VF: synthetic method
   public void method314(Class221 var1) {
      Class203 var5 = this;
      int var2;
      Class151[] var4;
      if ((var4 = Class523.method1544(var1, this.field722)) != null) {// 654 821
         for (int var6 = var2 = 0; var6 < var4.length; var6 = var2) {// 609
            var5.method262(var4[var2++]);// 633
         }
      }
   }// 632

   // $VF: synthetic method
   public boolean equals(Object var1) {
      return field714.method748(this, var1);// 1639
   }

   // $VF: synthetic method
   public void method107() {
      this.field723.clear();// 154
   }// 861

   // $VF: synthetic method
   public Class208 method315() {
      Class203 var1 = this;
      String var11 = this.method93();// 735
      int var12 = this.field723.method106(this.field721);// 846
      int var18 = this.field723.method106(var11);// 756
      byte[] var10 = null;// 881
      if (this.field709 != null) {// 738
         var10 = this.field709.method207();// 801
      }

      Class163 var4 = null;// 694
      Class160 var5 = null;// 923
      if (this.field718.size() > 0 && !this.field716) {// 854
         this.method299(var5 = this.method275(this.field723));// 844
      }

      if (this.field713.size() > 0 && !this.field716) {// 829
         this.method299(var4 = this.method320(this.field723));// 734
      }

      Class151[] var6 = this.method321();// 665
      int var7 = 0;// 619

      int var8;
      for (int var10000 = var8 = 0; var10000 < var6.length; var10000 = var8) {// 682
         int var10001 = var6[var8].method2();// 816
         var8++;
         var7 += var10001 + 6;
      }

      Class122[] var17;
      int var9 = (var17 = this.method201()).length * 8;// 755 777
      Class164 var3 = null;// 649
      if (this.field709 != null && !this.method261() && !this.method246()) {// 705
         Class151[] var14 = this.method200();// 982

         int var2;
         for (int var19 = var2 = 0; var19 < var14.length; var19 = ++var2) {// 722
            Class151 var13;
            if ((var13 = var14[var2]) instanceof Class164) {// 613 867
               var1.method265(var13);// 768
            }
         }

         var3 = new Class164(
            var1.field723.method106("Code"),// 744
            8 + var10.length + 2 + var9 + 2 + var7,
            var1.field712,
            var1.field721,
            var10,
            var17,
            var6,
            var1.field723.method402()
         );
         var1.method262(var3);// 864
      }

      var1.method314(var1.field723);
      var1.method286(var1.field723);// 671
      Class157 var15 = null;// 727
      if (var1.field696.size() > 0) {// 750 950
         var1.method262(var15 = var1.method310(var1.field723));// 853
      }

      Class208 var16 = new Class208(var1.field724, var12, var18, var1.method200(), var1.field723.method402());// 782
      if (var5 != null) {// 676
         var1.method289(var5);// 836
      }

      if (var4 != null) {// 610
         var1.method289(var4);// 686
      }

      if (var3 != null) {// 805
         var1.method265(var3);// 822
      }

      if (var15 != null) {// 959
         var1.method265(var15);// 976
      }

      return var16;// 851
   }

   // $VF: synthetic method
   public static int method316(Class221 var0, Class251 var1, Class202[] var2) {
      Class221 var11 = var0;
      Class558 var4 = new Class558();// 733

      int var3;
      for (int var18 = var3 = 0; var18 < var2.length; var18 = ++var3) {// 780
         Class246 var5;
         if ((var5 = var2[var3].method274()) != null) {// 789 866
            var4.method1776(var5, 1);// 895
         }
      }

      var3 = 0;// 812
      int var15 = 0;
      Class246 var10 = var1.method32();// 906

      while (var10 != null) {// 685
         Class10 var12 = var10.method18();// 973
         short var6 = var12.method22();
         int var7 = var12.method11(var11) - var12.method15(var11);// 657 916
         if ((var3 += var7) > var15) {// 621 709
            var15 = var3;// 893
         }

         Class246 var19;
         if (var12 instanceof Class90) {// 855
            Class90 var16 = (Class90)var12;// 717
            Class558 var21;
            if (var12 instanceof Class113) {// 925
               Class246[] var13 = ((Class113)var16).method39();// 786 934

               int var8;
               for (int var20 = var8 = 0; var20 < var13.length; var20 = var8) {// 840
                  var4.method1776(var13[var8++], var3);// 937
               }

               var10 = null;// 658
               var21 = var4;
            } else {
               if (!(var16 instanceof Class91)) {// 1276
                  if (var6 == 168 || var6 == 201) {// 1284
                     var4.method1776(var10.method32(), var3 - 1);// 994
                  }

                  var10 = null;// 1682
               }

               var21 = var4;// 1483
            }

            var21.method1776(var16.method32(), var3);
            var19 = var10;
         } else {
            if (var6 == 191 || var6 == 169 || var6 >= 172 && var6 <= 177) {// 1217
               var10 = null;// 1360
            }

            var19 = var10;// 1191
         }

         if (var19 != null) {
            var10 = var10.method32();// 1375
         }

         Class506 var17;
         if (var10 == null && (var17 = var4.method1775()) != null) {// 1062 1412 1560
            var10 = var17.field1671;// 1621
            var3 = var17.field1670;// 1428
         }
      }

      return var15;// 1673
   }

   // $VF: synthetic method
   public int method30() {
      return this.field721;// 834
   }

   // $VF: synthetic method
   public void method317(int var1, Class138 var2) {
      this.field719[var1] = var2;// 943
   }// 856

   // $VF: synthetic method
   public void method115() {
      Class203 var3 = this;
      Class246 var2;
      if (this.field709 != null) {// 772
         for (Class246 var10000 = var2 = this.field709.method32(); var10000 != null; var10000 = var2) {
            label44: {
               Class246 var1;
               var1 = var2.field838;// 920
               label43:
               if (var2.field838 != null && var2.method18() instanceof nop) {// 751
                  try {
                     var3.field709.method272(var2);// 828
                  } catch (Class224 var7) {// 896
                     Class246[] var8 = var7.method39();// 813
                     int var4;
                     int var9 = var4 = 0;

                     while (true) {
                        if (var9 >= var8.length) {
                           break label43;
                        }

                        Class200[] var5 = var8[var4].method431();// 702

                        int var6;
                        for (int var10 = var6 = 0; var10 < var5.length; var10 = var6) {// 669
                           Class200 var11 = var5[var6];// 760
                           var6++;
                           var11.method28(var8[var4], var1);
                        }

                        var9 = ++var4;// 611
                     }
                  }

                  var10000 = var1;
                  break label44;// 824
               }

               var10000 = var1;// 814
            }

            var2 = var10000;
         }
      }
   }// 791

   // $VF: synthetic method
   public void method318(Class201 var1) {
      this.field713.remove(var1);// 421
   }// 583

   // $VF: synthetic method
   public Class199 method319(String var1, Class138 var2, Class246 var3, Class246 var4) {
      return this.method295(var1, var2, this.field721, var3, var4);// 133
   }

   // $VF: synthetic method
   public Class163 method320(Class221 var1) {
      Class203 var3 = this;
      int var4;
      Class210[] var6 = new Class210[var4 = this.field713.size()];// 128 290

      try {
         int var2 = 0;// 512

         while (var2 < var4) {
            int var10001 = var2;
            Class210 var10002 = ((Class201)var3.field713.get(var2)).method270();
            var2++;
            var6[var10001] = var10002;// 538
         }
      } catch (ArrayIndexOutOfBoundsException var5) {// 176
      }

      return new Class163(var1.method106("LineNumberTable"), 2 + var6.length * 4, var6, var1.method402());// 124
   }

   // $VF: synthetic method
   public Class151[] method321() {
      Class151[] var2 = new Class151[this.field723.size()];// 921
      this.field723.toArray(var2);// 677
      return var2;// 698
   }

   // $VF: synthetic method
   public void method322(String[] var1) {
      this.field720 = var1;// 636
   }// 926
}
