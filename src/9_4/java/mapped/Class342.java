package mapped;

// $VF: Compiled from op
public class Class342 extends Class343 {
   // $VF: synthetic field
   public int field965;
   // $VF: synthetic field
   public int field966;
   // $VF: synthetic field
   public int[] field967;
   // $VF: synthetic field
   public int field968;
   // $VF: synthetic field
   public final Class590 field969;
   // $VF: synthetic field
   public int field970;
   // $VF: synthetic field
   public int field971;
   // $VF: synthetic field
   public Class451 field972;
   // $VF: synthetic field
   public int field973;
   // $VF: synthetic field
   public Class541 field974;
   // $VF: synthetic field
   public Class529 field975;
   // $VF: synthetic field
   public final int field976;
   // $VF: synthetic field
   public Class529 field977;
   // $VF: synthetic field
   public int field978;
   // $VF: synthetic field
   public Class514 field979;
   // $VF: synthetic field
   public int field980;
   // $VF: synthetic field
   public Class529 field981;
   // $VF: synthetic field
   public int field982;
   // $VF: synthetic field
   public static final int field983 = 1;
   // $VF: synthetic field
   public static final int field984 = 2;
   // $VF: synthetic field
   public int field985;
   // $VF: synthetic field
   public int field986;
   // $VF: synthetic field
   public Class354 field987;
   // $VF: synthetic field
   public Class456 field988;
   // $VF: synthetic field
   public int field989;
   // $VF: synthetic field
   public Class529 field990;
   // $VF: synthetic field
   public Class354 field991;
   // $VF: synthetic field
   public Class456 field992;
   // $VF: synthetic field
   public Class541 field993;
   // $VF: synthetic field
   public int field994;
   // $VF: synthetic field
   public Class514 field995;
   // $VF: synthetic field
   public Class354 field996;
   // $VF: synthetic field
   public int field997;
   // $VF: synthetic field
   public Class534 field998;
   // $VF: synthetic field
   public Class354 field999;

   // $VF: synthetic method
   public Class342(int var1) {
      this(null, var1);// 296
   }// 404

   // $VF: synthetic method
   public int method613(int var1, String var2, String var3, String var4, boolean var5) {
      return this.field969.method2007(var1, var2, var3, var4, var5).field1923;// 660
   }

   // $VF: synthetic method
   public int method614(String var1) {
      return this.field969.method1972(var1).field1923;// 615
   }

   // $VF: synthetic method
   public int method615(String var1) {
      return this.field969.method1991(var1);// 651
   }

   // $VF: synthetic method
   @Override
   public final void method616(String var1, String var2, String var3) {
      this.field970 = this.field969.method1988(var1).field1923;// 509
      if (var2 != null && var3 != null) {// 35
         this.field994 = this.field969.method2012(var2, var3);// 233
      }
   }// 256

   // $VF: synthetic method
   @Override
   public final void method617(int var1, int var2, String var3, String var4, String var5, String[] var6) {
      String[] var7 = var6;
      Class342 var9 = this;
      this.field968 = var1;
      this.field973 = var2;// 356 522
      this.field986 = this.field969.method2009(var1 & 65535, var3);// 41
      if (var4 != null) {// 551
         this.field965 = this.field969.method1991(var4);// 91
      }

      this.field978 = var5 == null ? 0 : this.field969.method1988(var5).field1923;// 312
      if (var6 != null && var6.length > 0) {// 340
         this.field985 = var6.length;// 274
         int var10 = 0;
         this.field967 = new int[this.field985];// 558

         for (int var8 = 0; var10 < var9.field985; var10 = var8) {// 501
            int[] var11 = var9.field967;// 337
            int var10001 = var8;
            int var10002 = var9.field969.method1988(var7[var8]).field1923;
            var8++;
            var11[var10001] = var10002;
         }
      }

      if (var9.field980 == 1 && (var1 & 65535) >= 51) {// 237
         var9.field980 = 2;// 133
      }
   }// 504

   // $VF: synthetic method
   @Deprecated
   public int method618(int var1, String var2, String var3, String var4) {
      return this.method613(var1, var2, var3, var4, var1 == 9);// 638
   }

   // $VF: synthetic method
   @Override
   public final void method619(String var1, String var2, String var3, int var4) {
      if (this.field975 == null) {// 476
         this.field975 = new Class529();// 542
      }

      Class552 var6;
      if ((var6 = this.field969.method1988(var1)).field1913 == 0) {// 376 519
         this.field982++;// 492
         this.field975.method1566(var6.field1923);// 482
         this.field975.method1566(var2 == null ? 0 : this.field969.method1988(var2).field1923);// 432
         this.field975.method1566(var3 == null ? 0 : this.field969.method1991(var3));// 67
         this.field975.method1566(var4);// 155
         var6.field1913 = this.field982;// 2
      }
   }// 19

   // $VF: synthetic method
   public ClassLoader method620() {
      return this.getClass().getClassLoader();// 1561
   }

   // $VF: synthetic method
   public int method621(String var1) {
      return this.field969.method1993(var1).field1923;// 876
   }

   // $VF: synthetic method
   public final void method622(int var1) {
      if ((var1 & 2) != 0) {// 1050
         this.field980 = 4;// 1676
      } else if ((var1 & 1) != 0) {// 1389
         this.field980 = 1;// 1670
      } else {
         this.field980 = 0;// 1245
      }
   }// 1367

   // $VF: synthetic method
   @Override
   public final void method623(String var1) {
      if (this.field977 == null) {// 457
         this.field977 = new Class529();// 546
      }

      this.field989++;// 51
      this.field977.method1566(this.field969.method1988(var1).field1923);// 598
   }// 325

   // $VF: synthetic method
   @Override
   public final Class353 method624(int var1, Class573 var2, String var3, boolean var4) {
      return var4// 508
         ? (this.field999 = Class354.method666(this.field969, var1, var2, var3, this.field999))// 214 517
         : (this.field987 = Class354.method666(this.field969, var1, var2, var3, this.field987));// 431 585
   }

   // $VF: synthetic method
   public String method625(String var1, String var2) {
      ClassLoader var4 = this.method620();// 1433

      try {
         var8 = Class.forName(var1.replace('/', '.'), false, var4);// 1137
      } catch (ClassNotFoundException var7) {// 1105
         throw new TypeNotPresentException(var1, var7);// 1525
      }

      String var10000 = var2;

      Class var5;
      try {
         var5 = Class.forName(var10000.replace('/', '.'), false, var4);// 1268
      } catch (ClassNotFoundException var6) {// 1491
         throw new TypeNotPresentException(var2, var6);
      }

      if (var8.isAssignableFrom(var5)) {// 1255 1508 1568
         return var1;// 1266
      } else if (var5.isAssignableFrom(var8)) {// 1444
         return var2;// 1035
      } else if (!var8.isInterface() && !var5.isInterface()) {// 1614
         while (!(var9 = var8.getSuperclass()).isAssignableFrom(var5)) {// 1400 1582
         }

         return var9.getName().replace('.', '/');// 1025
      } else {
         return "java/lang/Object";// 1259
      }
   }

   // $VF: synthetic method
   public int method626(Object var1) {
      return this.field969.method2004(var1).field1923;// 645
   }

   // $VF: synthetic method
   @Override
   public final void method627(Class534 var1) {
      var1.field1800 = this.field998;// 224
      this.field998 = var1;// 494
   }// 560

   // $VF: synthetic method
   @Override
   public final Class513 method628(int var1, String var2, String var3, String var4, String[] var5) {
      Class514 var7 = new Class514(this.field969, var1, var2, var3, var4, var5, this.field980);// 85
      Class342 var9;
      if (this.field995 == null) {// 121
         var9 = this;// 480
         this.field995 = var7;
      } else {
         var9 = this;// 472
         this.field979.field1758 = var7;
      }

      return var9.field979 = var7;// 387
   }

   // $VF: synthetic method
   public int method629(String var1, String var2, String var3, boolean var4) {
      return this.field969.method1963(var1, var2, var3, var4).field1923;// 1196
   }

   // $VF: synthetic method
   public Class534[] method630() {
      Class495 var1;
      (var1 = new Class495()).method1325(this.field998);// 807 849

      for (Class541 var10000 = var3 = this.field993; var10000 != null; var10000 = var3 = (Class541)var3.field1848) {// 683 839 871 918
         var3.method1641(var1);
      }

      for (Class514 var6 = var4 = this.field995; var6 != null; var6 = var4 = (Class514)var4.field1758) {// 641 779 842 915
         var4.method1457(var1);
      }

      for (Class456 var7 = var5 = this.field992; var7 != null; var7 = var5 = (Class456)var5.field1389) {// 745 901 946 952
         var5.method977(var1);
      }

      return var1.method1328();// 878
   }

   // $VF: synthetic method
   @Override
   public final void method631(String var1) {
      if (this.field990 == null) {// 191
         this.field990 = new Class529();// 441
      }

      this.field971++;// 547
      this.field990.method1566(this.field969.method1988(var1).field1923);// 303
   }// 326

   // $VF: synthetic method
   public int method632(String var1, String var2, Class563 var3, Object... var4) {
      return this.field969.method2019(var1, var2, var3, var4).field1923;// 916
   }

   // $VF: synthetic method
   public byte[] method633() {
      Class342 var1 = this;
      int var10 = 24 + 2 * this.field985;// 539
      int var9 = 0;// 388

      Class541 var3;
      for (Class541 var10000 = var3 = this.field993; var10000 != null; var10000 = var3 = (Class541)var3.field1848) {// 120 298 487
         int var10001 = var3.method1640();// 347
         var9++;// 479
         var10 += var10001;
      }

      int var4 = 0;// 439

      Class514 var5;
      for (Class514 var22 = var5 = this.field995; var22 != null; var22 = var5 = (Class514)var5.field1758) {// 106 425 529
         int var28 = var5.method1460();// 445
         var4++;// 569
         var10 += var28;
      }

      int var6 = 0;// 197
      if (this.field975 != null) {// 140
         var6++;// 451
         var10 += 8 + this.field975.field1786;// 49
         this.field969.method1991("InnerClasses");// 565
      }

      if (this.field970 != 0) {// 448
         var10 += 10;// 489
         var6++;// 101
         this.field969.method1991("EnclosingMethod");// 562
      }

      if ((this.field973 & 4096) != 0 && (this.field968 & 65535) < 49) {// 247
         var10 += 6;// 194
         var6++;// 259
         this.field969.method1991("Synthetic");// 397
      }

      if (this.field965 != 0) {// 9
         var10 += 8;// 566
         var6++;// 243
         this.field969.method1991("Signature");// 531
      }

      if (this.field966 != 0) {// 104
         var10 += 8;// 309
         var6++;// 590
         this.field969.method1991("SourceFile");// 430
      }

      if (this.field981 != null) {// 344
         var6++;// 345
         var10 += 6 + this.field981.field1786;// 449
         this.field969.method1991("SourceDebugExtension");// 37
      }

      if ((this.field973 & 131072) != 0) {// 378
         var10 += 6;// 490
         var6++;// 195
         this.field969.method1991("Deprecated");// 577
      }

      if (this.field991 != null) {// 351
         var6++;// 75
         var10 += this.field991.method661("RuntimeVisibleAnnotations");// 111 372
      }

      if (this.field996 != null) {// 153
         var6++;// 477
         var10 += this.field996.method661("RuntimeInvisibleAnnotations");// 53 584
      }

      if (this.field999 != null) {// 267
         var6++;// 393
         var10 += this.field999.method661("RuntimeVisibleTypeAnnotations");// 230 419
      }

      if (this.field987 != null) {// 112
         var6++;// 395
         var10 += this.field987.method661("RuntimeInvisibleTypeAnnotations");// 43 535
      }

      if (this.field969.method2021() > 0) {// 322
         var6++;// 74
         var10 += this.field969.method2021();// 317
      }

      if (this.field972 != null) {// 526
         var6 += this.field972.method950();// 136
         var10 += this.field972.method951();// 158
      }

      if (this.field997 != 0) {// 294
         var10 += 8;// 435
         var6++;// 342
         this.field969.method1991("NestHost");// 96
      }

      if (this.field990 != null) {// 359
         var6++;// 408
         var10 += 8 + this.field990.field1786;// 313
         this.field969.method1991("NestMembers");// 277
      }

      if (this.field977 != null) {// 459
         var6++;// 302
         var10 += 8 + this.field977.field1786;// 203
         this.field969.method1991("PermittedSubclasses");// 70
      }

      int var7 = 0;// 118
      int var8 = 0;// 379
      if ((this.field973 & 65536) != 0 || this.field992 != null) {// 353
         Class456 var2;
         for (Class456 var23 = var2 = this.field992; var23 != null; var23 = var2 = (Class456)var2.field1389) {// 165 189 500
            int var29 = var2.method978();// 79
            var7++;// 447
            var8 += var29;
         }

         var6++;// 364
         var10 += 8 + var8;// 154
         this.field969.method1991("Record");// 861
      }

      if (this.field998 != null) {// 847
         var6 += this.field998.method1600();// 958
         var10 += this.field998.method1599(this.field969);// 605
      }

      int var11 = var10 + this.field969.method1986();// 677
      int var13;
      if ((var13 = this.field969.method1971()) > 65535) {// 689 698
         throw new Class237(this.field969.method1975(), var13);// 811
      } else {
         Class529 var12;
         (var12 = new Class529(var11)).method1570(-889275714).method1570(this.field968);// 633 684
         this.field969.method1982(var12);// 892
         var13 = (this.field968 & 65535) < 49 ? 4096 : 0;// 632
         var12.method1566(this.field973 & ~var13).method1566(this.field986).method1566(this.field978);// 818
         var12.method1566(this.field985);// 966
         var13 = 0;// 949

         for (int var24 = var13; var24 < var1.field985; var24 = var13) {
            var12.method1566(var1.field967[var13++]);// 968
         }

         var12.method1566(var9);// 670
         var3 = var1.field993;// 691

         for (Class541 var25 = var3; var25 != null; var25 = var3 = (Class541)var3.field1848) {// 788 823 899
            var3.method1642(var12);
         }

         var12.method1566(var4);// 927
         boolean var16 = false;// 833
         boolean var21 = false;// 902
         var5 = var1.field995;// 608

         for (Class514 var26 = var5; var26 != null; var26 = var5 = (Class514)var5.field1758) {// 721 735 914
            var16 |= var5.method1445();// 960
            var21 |= var5.method1448();// 930
            var5.method1450(var12);
         }

         var12.method1566(var6);// 975
         if (var1.field975 != null) {// 883
            var12.method1566(var1.field969.method1991("InnerClasses"))// 738 881
               .method1570(var1.field975.field1786 + 2)// 801
               .method1566(var1.field982)// 873
               .method1573(var1.field975.field1787, 0, var1.field975.field1786);// 694
         }

         if (var1.field970 != 0) {// 618
            var12.method1566(var1.field969.method1991("EnclosingMethod")).method1570(4).method1566(var1.field970).method1566(var1.field994);// 829 838 844 852 854
         }

         if ((var1.field973 & 4096) != 0 && (var1.field968 & 65535) < 49) {// 675
            var12.method1566(var1.field969.method1991("Synthetic")).method1570(0);// 665
         }

         if (var1.field965 != 0) {// 835
            var12.method1566(var1.field969.method1991("Signature")).method1570(2).method1566(var1.field965);// 619 682 816 974
         }

         if (var1.field966 != 0) {// 777
            var12.method1566(var1.field969.method1991("SourceFile")).method1570(2).method1566(var1.field966);// 649 697 705 982
         }

         if (var1.field981 != null) {// 613
            int var18 = var1.field981.field1786;// 867
            var12.method1566(var1.field969.method1991("SourceDebugExtension")).method1570(var18).method1573(var1.field981.field1787, 0, var18);// 688 744 768 933
         }

         if ((var1.field973 & 131072) != 0) {// 771
            var12.method1566(var1.field969.method1991("Deprecated")).method1570(0);// 863
         }

         Class354.method665(var1.field969, var1.field991, var1.field996, var1.field999, var1.field987, var12);// 647
         var1.field969.method2006(var12);// 796
         if (var1.field972 != null) {// 782
            var1.field972.method952(var12);// 870
         }

         if (var1.field997 != 0) {// 676
            var12.method1566(var1.field969.method1991("NestHost")).method1570(2).method1566(var1.field997);// 610 686 836 956
         }

         if (var1.field990 != null) {// 805
            var12.method1566(var1.field969.method1991("NestMembers"))// 627 822
               .method1570(var1.field990.field1786 + 2)// 959
               .method1566(var1.field971)// 976
               .method1573(var1.field990.field1787, 0, var1.field990.field1786);// 843
         }

         if (var1.field977 != null) {// 687
            var12.method1566(var1.field969.method1991("PermittedSubclasses"))// 666 696
               .method1570(var1.field977.field1786 + 2)// 924
               .method1566(var1.field989)// 730
               .method1573(var1.field977.field1787, 0, var1.field977.field1786);// 845
         }

         if ((var1.field973 & 65536) != 0 || var1.field992 != null) {// 868
            var12.method1566(var1.field969.method1991("Record")).method1570(var8 + 2).method1566(var7);// 715 772 802 979
            Class456 var19 = var1.field992;// 819

            for (Class456 var27 = var19; var27 != null; var27 = var19 = (Class456)var19.field1389) {// 751 814 920
               var19.method976(var12);
            }
         }

         if (var1.field998 != null) {// 896
            var1.field998.method1593(var1.field969, var12);// 813
         }

         return var21 ? var1.method645(var12.field1787, var16) : var12.field1787;// 753 760 824
      }
   }

   // $VF: synthetic method
   public int method634(String var1) {
      return this.field969.method1973(var1).field1923;// 695
   }

   // $VF: synthetic method
   public Class342(Class508 var1, int var2) {
      super(589824);
      this.field976 = var2;// 596
      this.field969 = var1 == null ? new Class590(this) : new Class590(this, var1);// 308 549
      this.method622(var2);// 499
   }// 76

   // $VF: synthetic method
   @Override
   public final Class353 method635(String var1, boolean var2) {
      return var2// 4
         ? (this.field991 = Class354.method660(this.field969, var1, this.field991))// 122 305
         : (this.field996 = Class354.method660(this.field969, var1, this.field996));// 228 334
   }

   // $VF: synthetic method
   public boolean method636(int var1) {
      return (this.field976 & var1) == var1;// 181
   }

   // $VF: synthetic method
   public int method637(String var1, String var2, String var3) {
      return this.field969.method1978(var1, var2, var3).field1923;// 889
   }

   // $VF: synthetic method
   @Override
   public final void method638(String var1, String var2) {
      if (var1 != null) {// 114
         this.field966 = this.field969.method1991(var1);// 460
      }

      if (var2 != null) {// 105
         this.field981 = new Class529().method1564(var2, 0, 2147483647);// 183
      }
   }// 64

   // $VF: synthetic method
   public int method639(String var1, String var2) {
      return this.field969.method2012(var1, var2);// 1428
   }

   // $VF: synthetic method
   @Override
   public final void method640(String var1) {
      this.field997 = this.field969.method1988(var1).field1923;// 331
   }// 384

   // $VF: synthetic method
   @Override
   public final Class450 method641(String var1, int var2, String var3) {
      return this.field972 = new Class451(this.field969, this.field969.method1993(var1).field1923, var2, var3 == null ? 0 : this.field969.method1991(var3));// 89 164 599
   }

   // $VF: synthetic method
   public int method642(String var1, String var2, Class563 var3, Object... var4) {
      return this.field969.method1981(var1, var2, var3, var4).field1923;// 737
   }

   // $VF: synthetic method
   @Override
   public final Class455 method643(String var1, String var2, String var3) {
      Class456 var5 = new Class456(this.field969, var1, var2, var3);// 289
      Class342 var7;
      if (this.field992 == null) {// 323
         var7 = this;// 458
         this.field992 = var5;
      } else {
         var7 = this;// 572
         this.field988.field1389 = var5;
      }

      return var7.field988 = var5;// 348
   }

   // $VF: synthetic method
   @Override
   public final Class540 method644(int var1, String var2, String var3, String var4, Object var5) {
      Class541 var7 = new Class541(this.field969, var1, var2, var3, var4, var5);// 202
      Class342 var9;
      if (this.field993 == null) {// 128
         var9 = this;// 290
         this.field993 = var7;
      } else {
         var9 = this;// 512
         this.field974.field1848 = var7;
      }

      return var9.field974 = var7;// 92
   }

   // $VF: synthetic method
   public byte[] method645(byte[] var1, boolean var2) {
      Class534[] var4 = this.method630();// 629
      this.field993 = null;// 834
      this.field974 = null;// 736
      this.field995 = null;// 681
      this.field979 = null;// 759
      this.field991 = null;// 875
      this.field996 = null;// 742
      this.field999 = null;// 900
      this.field987 = null;// 740
      this.field972 = null;// 732
      this.field997 = 0;// 806
      this.field971 = 0;// 869
      this.field990 = null;// 911
      this.field989 = 0;// 947
      this.field977 = null;// 903
      this.field992 = null;// 908
      this.field988 = null;// 907
      this.field998 = null;// 909
      this.field980 = var2 ? 3 : 0;// 837
      new Class508(var1, 0, false).method1381(this, var4, (var2 ? 8 : 0) | 256);// 612 793 962
      return this.method633();// 820
   }

   // $VF: synthetic method
   @Override
   public final void method646() {
   }// 156

   // $VF: synthetic method
   public int method647(String var1) {
      return this.field969.method1988(var1).field1923;// 965
   }
}
