package mapped;

// $VF: Compiled from fb
public final class Class354 extends Class353 {
   // $VF: synthetic field
   public Class354 field1053;
   // $VF: synthetic field
   public final boolean field1054;
   // $VF: synthetic field
   public final Class354 field1055;
   // $VF: synthetic field
   public final Class529 field1056;
   // $VF: synthetic field
   public int field1057;
   // $VF: synthetic field
   public final int field1058;
   // $VF: synthetic field
   public final Class590 field1059;

   // $VF: synthetic method
   public static Class354 method660(Class590 var0, String var1, Class354 var2) {
      Class529 var4;
      (var4 = new Class529()).method1566(var0.method1991(var1)).method1566(0);// 24 149
      return new Class354(var0, true, var4, var2);// 286
   }

   // $VF: synthetic method
   @Override
   public void method653(String var1, Object var2) {
      Class354 var19 = this;
      this.field1057++;// 166
      if (this.field1054) {// 434
         this.field1056.method1566(this.field1059.method1991(var1));// 292
      }

      if (var2 instanceof String) {// 72
         this.field1056.method1574(115, this.field1059.method1991((String)var2));// 268
      } else if (var2 instanceof Byte) {// 497
         this.field1056.method1574(66, this.field1059.method1996((Byte)var2).field1923);// 66
      } else if (var2 instanceof Boolean) {// 536
         int var18 = (Boolean)var2 ? 1 : 0;// 307
         this.field1056.method1574(90, this.field1059.method1996(var18).field1923);// 218
      } else if (var2 instanceof Character) {
         this.field1056.method1574(67, this.field1059.method1996((Character)var2).field1923);// 213
      } else if (var2 instanceof Short) {// 15
         this.field1056.method1574(83, this.field1059.method1996((Short)var2).field1923);// 385
      } else if (var2 instanceof Class599) {// 471
         this.field1056.method1574(99, this.field1059.method1991(((Class599)var2).method2061()));// 270
      } else {
         if (var2 instanceof byte[]) {// 582
            byte[] var9 = (byte[])var2;// 177
            this.field1056.method1574(91, var9.length);// 266
            byte[] var3 = var9;// 235
            int var4 = var9.length;

            int var5;
            for (int var48 = var5 = 0; var48 < var4; var48 = var5) {
               byte var6 = var3[var5];
               var5++;
               var19.field1056.method1574(66, var19.field1059.method1996(var6).field1923);// 280
            }
         } else if (var2 instanceof boolean[]) {// 516
            boolean[] var10 = (boolean[])var2;// 95
            this.field1056.method1574(91, var10.length);// 227
            boolean[] var20 = var10;// 55
            int var27 = var10.length;

            int var34;
            for (int var49 = var34 = 0; var49 < var27; var49 = var34) {
               boolean var41 = var20[var34];
               Class529 var50 = var19.field1056;// 77
               Class552 var10002 = var19.field1059.method1996(var41 ? 1 : 0);
               var34++;
               var50.method1574(90, var10002.field1923);
            }
         } else if (var2 instanceof short[]) {// 129
            short[] var11 = (short[])var2;// 258
            this.field1056.method1574(91, var11.length);// 107
            short[] var21 = var11;// 437
            int var28 = var11.length;

            int var35;
            for (int var51 = var35 = 0; var51 < var28; var51 = var35) {
               short var42 = var21[var35];
               var35++;
               var19.field1056.method1574(83, var19.field1059.method1996(var42).field1923);// 110
            }
         } else if (var2 instanceof char[]) {// 444
            char[] var12 = (char[])var2;// 601
            this.field1056.method1574(91, var12.length);// 193
            char[] var22 = var12;// 251
            int var29 = var12.length;

            int var36;
            for (int var52 = var36 = 0; var52 < var29; var52 = var36) {
               char var43 = var22[var36];
               var36++;
               var19.field1056.method1574(67, var19.field1059.method1996(var43).field1923);// 486
            }
         } else if (var2 instanceof int[]) {// 300
            int[] var13 = (int[])var2;// 245
            this.field1056.method1574(91, var13.length);// 296
            int[] var23 = var13;// 404
            int var30 = var13.length;

            int var37;
            for (int var53 = var37 = 0; var53 < var30; var53 = var37) {
               int var44 = var23[var37];
               var37++;
               var19.field1056.method1574(73, var19.field1059.method1996(var44).field1923);// 417
            }
         } else if (var2 instanceof long[]) {// 401
            long[] var14 = (long[])var2;// 394
            this.field1056.method1574(91, var14.length);// 556
            long[] var24 = var14;// 316
            int var31 = var14.length;

            int var38;
            for (int var54 = var38 = 0; var54 < var31; var54 = var38) {
               long var45 = var24[var38];
               var38++;
               var19.field1056.method1574(74, var19.field1059.method1987(var45).field1923);// 207
            }
         } else if (var2 instanceof float[]) {// 127
            float[] var15 = (float[])var2;// 355
            this.field1056.method1574(91, var15.length);// 496
            float[] var25 = var15;// 369
            int var32 = var15.length;

            int var39;
            for (int var55 = var39 = 0; var55 < var32; var55 = var39) {
               float var46 = var25[var39];
               var39++;
               var19.field1056.method1574(70, var19.field1059.method2020(var46).field1923);// 215
            }
         } else if (var2 instanceof double[]) {// 382
            double[] var16 = (double[])var2;// 210
            this.field1056.method1574(91, var16.length);// 576
            double[] var26 = var16;// 103
            int var33 = var16.length;

            int var40;
            for (int var56 = var40 = 0; var56 < var33; var56 = var40) {
               double var47 = var26[var40];
               var40++;
               var19.field1056.method1574(68, var19.field1059.method1985(var47).field1923);// 548
            }
         } else {
            Class552 var17 = this.field1059.method2004(var2);// 523
            this.field1056.method1574(".s.IFJDCS".charAt(var17.field1920), var17.field1923);// 162
         }
      }
   }// 109 503

   // $VF: synthetic method
   @Override
   public void method659() {
      if (this.field1058 != -1) {// 237
         byte[] var2 = this.field1056.field1787;// 133
         var2[this.field1058] = (byte)(this.field1057 >>> 8);
         var2[this.field1058 + 1] = (byte)this.field1057;// 65 504
      }
   }// 283

   // $VF: synthetic method
   public Class354(Class590 var1, boolean var2, Class529 var3, Class354 var4) {
      super(589824);
      this.field1059 = var1;// 329
      this.field1054 = var2;// 412
      this.field1056 = var3;// 38
      this.field1058 = var3.field1786 == 0 ? -1 : var3.field1786 - 2;// 269 588
      if ((this.field1055 = var4) != null) {// 148 455
         var4.field1053 = this;// 236
      }
   }// 39

   // $VF: synthetic method
   public int method661(String var1) {
      if (var1 != null) {// 506
         this.field1059.method1991(var1);// 599
      }

      int var4 = 8;// 306

      Class354 var2;
      for (Class354 var6 = var2 = this; var6 != null; var6 = var2 = var2.field1055) {// 8 130 331
         var4 += var2.field1056.field1786;// 384
      }

      return var4;// 602
   }

   // $VF: synthetic method
   public void method662(int var1, Class529 var2) {
      int var5 = 2;// 231
      int var4 = 0;// 420
      this = this;// 454
      Class354 var6 = null;// 343

      for (Class354 var10000 = this; var10000 != null; var10000 = this = this.field1055) {// 62 324 482
         this.method659();
         var4++;// 376
         var5 += this.field1056.field1786;// 519
         var6 = this;// 492
      }

      var2.method1566(var1);// 67
      var2.method1570(var5);// 155
      var2.method1566(var4);// 2
      this = var6;// 505

      for (Class354 var9 = var6; var9 != null; var9 = this) {// 421
         var2.method1573(this.field1056.field1787, 0, this.field1056.field1786);// 583
         this = this.field1053;// 19
      }
   }// 473

   // $VF: synthetic method
   public static int method663(Class354 var0, Class354 var1, Class354 var2, Class354 var3) {
      int var5 = 0;// 563
      if (var0 != null) {// 14
         var5 += var0.method661("RuntimeVisibleAnnotations");// 374 514
      }

      if (var1 != null) {// 354
         var5 += var1.method661("RuntimeInvisibleAnnotations");// 224 494
      }

      if (var2 != null) {// 71
         var5 += var2.method661("RuntimeVisibleTypeAnnotations");// 191 375
      }

      if (var3 != null) {// 547
         var5 += var3.method661("RuntimeInvisibleTypeAnnotations");// 303 326
      }

      return var5;// 521
   }

   // $VF: synthetic method
   public static int method664(String var0, Class354[] var1, int var2) {
      String var3 = var0;
      int var6 = 7 + 2 * var2;// 120

      int var4;
      for (int var10000 = var4 = 0; var10000 < var2; var10000 = var4) {// 487
         Class354 var5 = var1[var4];// 479
         var10000 = var6 + (var5 == null ? 0 : var5.method661(var3) - 8);// 298 347
         var4++;
         var6 = var10000;
      }

      return var6;// 439
   }

   // $VF: synthetic method
   @Override
   public Class353 method656(String var1, String var2) {
      this.field1057++;// 483
      if (this.field1054) {// 181
         this.field1056.method1566(this.field1059.method1991(var1));// 433
      }

      this.field1056.method1574(64, this.field1059.method1991(var2)).method1566(0);// 320
      return new Class354(this.field1059, true, this.field1056, null);// 478
   }

   // $VF: synthetic method
   public static void method665(Class590 var0, Class354 var1, Class354 var2, Class354 var3, Class354 var4, Class529 var5) {
      if (var1 != null) {// 171
         var1.method662(var0.method1991("RuntimeVisibleAnnotations"), var5);// 124 568
      }

      if (var2 != null) {// 311
         var2.method662(var0.method1991("RuntimeInvisibleAnnotations"), var5);// 98 407
      }

      if (var3 != null) {// 85
         var3.method662(var0.method1991("RuntimeVisibleTypeAnnotations"), var5);// 16 121
      }

      if (var4 != null) {// 518
         var4.method662(var0.method1991("RuntimeInvisibleTypeAnnotations"), var5);// 381 472
      }
   }// 380

   // $VF: synthetic method
   @Override
   public void method655(String var1, String var2, String var3) {
      this.field1057++;// 76
      if (this.field1054) {// 145
         this.field1056.method1566(this.field1059.method1991(var1));// 390
      }

      this.field1056.method1574(101, this.field1059.method1991(var2)).method1566(this.field1059.method1991(var3));// 188 502 520
   }// 172

   // $VF: synthetic method
   public static Class354 method666(Class590 var0, int var1, Class573 var2, String var3, Class354 var4) {
      Class529 var6 = new Class529();// 61
      Class536.method1624(var1, var6);// 220
      Class573.method1901(var2, var6);// 593
      var6.method1566(var0.method1991(var3)).method1566(0);// 540
      return new Class354(var0, true, var6, var4);// 291
   }

   // $VF: synthetic method
   @Override
   public Class353 method658(String var1) {
      this.field1057++;// 297
      if (this.field1054) {// 426
         this.field1056.method1566(this.field1059.method1991(var1));// 11
      }

      this.field1056.method1574(91, 0);// 274
      return new Class354(this.field1059, false, this.field1056, null);// 558
   }

   // $VF: synthetic method
   public static void method667(int var0, Class354[] var1, int var2, Class529 var3) {
      int var4 = 1 + 2 * var2;// 194

      int var5;
      for (int var10000 = var5 = 0; var10000 < var2; var10000 = var5) {// 397
         Class354 var8 = var1[var5];// 163
         var10000 = var4 + (var8 == null ? 0 : var8.method661(null) - 8);// 9 243
         var5++;
         var4 = var10000;
      }

      var3.method1566(var0);// 531
      var3.method1570(var4);// 229
      var3.method1568(var2);// 104
      var5 = 0;

      for (int var14 = var5; var14 < var2; var14 = ++var5) {// 590
         Class354 var9 = var1[var5];// 309
         Class354 var11 = null;// 430
         int var7 = 0;// 442

         for (Class354 var15 = var9; var15 != null; var15 = var9 = var9.field1055) {// 344 378 449
            var7++;// 37
            var9.method659();
            var11 = var9;// 217
         }

         var3.method1566(var7);// 490
         Class354 var10 = var11;// 577

         for (Class354 var16 = var11; var16 != null; var16 = var10) {// 481
            var3.method1573(var10.field1056.field1787, 0, var10.field1056.field1786);// 351
            var10 = var10.field1053;// 372
         }
      }
   }// 304
}
