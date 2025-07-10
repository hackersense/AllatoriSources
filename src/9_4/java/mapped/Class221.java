package mapped;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

// $VF: Compiled from pi
public class Class221 implements Serializable {
   // $VF: synthetic field
   public static final String field808 = "%";
   // $VF: synthetic field
   public Map field809;
   // $VF: synthetic field
   public static final String field810 = "&";
   // $VF: synthetic field
   public Map field811;
   // $VF: synthetic field
   public Class178[] field812;
   // $VF: synthetic field
   public int field813;
   // $VF: synthetic field
   public static final String field814 = ":";
   // $VF: synthetic field
   public int field815 = 1024;
   // $VF: synthetic field
   public Map field816;
   // $VF: synthetic field
   public static final String field817 = "#";
   // $VF: synthetic field
   public Map field818;
   // $VF: synthetic field
   public Map field819;

   // $VF: synthetic method
   public int method390(Class144 var1) {
      return this.method404(var1.method93());// 210
   }

   // $VF: synthetic method
   public int method391(String var1, String var2, String var3) {
      Class258 var5;
      return (var5 = (Class258)this.field819.get(var1 + "&" + var2 + "&" + var3)) != null ? var5.field908 : -1;// 698 811
   }

   // $VF: synthetic method
   public int method392(String var1, String var2) {
      int var3;
      if ((var3 = this.method406(var1, var2)) != -1) {// 167
         return var3;// 414
      } else {
         this.method19();
         int var4 = this.method106(var1);// 139
         int var5 = this.method106(var2);// 319 462
         var3 = this.field813;// 559
         this.field812[this.field813++] = new Class186(var4, var5);// 452
         String var7 = var1 + "%" + var2;// 187
         if (!this.field809.containsKey(var7)) {// 595
            this.field809.put(var7, new Class258(var3));// 254
         }

         return var3;// 539
      }
   }

   // $VF: synthetic method
   public int method393(String var1) {
      Class258 var3;
      return (var3 = (Class258)this.field818.get(var1)) != null ? var3.field908 : -1;// 220 593
   }

   // $VF: synthetic method
   public Class221(Class149 var1) {
      this(var1.method172());// 24
   }// 286

   // $VF: synthetic method
   public int method394(String var1, String var2, String var3) {
      Class258 var5;
      return (var5 = (Class258)this.field819.get(var1 + ":" + var2 + ":" + var3)) != null ? var5.field908 : -1;// 197 527
   }

   // $VF: synthetic method
   public int method395(Class203 var1) {
      return this.method394(var1.method190(), var1.method20(), var1.method93());// 173
   }

   // $VF: synthetic method
   public int method396(Class145 var1) {
      return this.method153(var1.method20());// 596
   }

   // $VF: synthetic method
   public int method397(Class178 var1, Class221 var2) {
      Class178[] var7 = var2.method402().method172();// 843
      switch (var1.method142()) {// 851
         case 1:
            while (false) {
            }

            return this.method106(((Class191)var1).method20());// 828
         case 2:
         default:
            throw new RuntimeException("Unknown constant type " + var1);// 732
         case 3:
            return this.method143(((Class181)var1).method2());// 954
         case 4:
            return this.method411(((Class184)var1).method230());// 702
         case 5:
            return this.method407(((Class183)var1).method228());// 760
         case 6:
            return this.method415(((Class179)var1).method226());// 813
         case 7:
            Class182 var13 = (Class182)var1;// 625
            Class191 var17 = (Class191)var7[var13.method2()];// 868
            return this.method404(var17.method20());// 802
         case 8:
            Class185 var12 = (Class185)var1;// 696
            Class191 var16 = (Class191)var7[var12.method2()];// 666
            return this.method409(var16.method20());// 924
         case 9:
         case 10:
         case 11:
            Class187 var10 = (Class187)var1;// 630
            Class182 var14 = (Class182)var7[var10.method17()];// 791
            Class186 var18 = (Class186)var7[var10.method2()];// 765
            String var11 = ((Class191)var7[var14.method2()]).method20().replace('/', '.');// 650 815
            String var15 = ((Class191)var7[var18.method17()]).method20();// 746 747
            String var8 = ((Class191)var7[var18.method2()]).method20();// 826 882
            switch (var1.method142()) {// 891
               case 9:
                  while (false) {
                  }

                  return this.method398(var11, var15, var8);// 681
               case 10:
                  return this.method408(var11, var15, var8);// 834
               case 11:
                  return this.method410(var11, var15, var8);// 948
               default:
                  throw new RuntimeException("Unknown constant type " + var1);// 875
            }
         case 12:
            Class186 var3 = (Class186)var1;// 979
            Class191 var4 = (Class191)var7[var3.method17()];// 819
            Class191 var5 = (Class191)var7[var3.method2()];// 814
            return this.method392(var4.method20(), var5.method20());// 920
      }
   }

   // $VF: synthetic method
   public int method398(String var1, String var2, String var3) {
      int var4;
      if ((var4 = this.method391(var1, var2, var3)) != -1) {// 899
         return var4;// 823
      } else {
         this.method19();
         int var5 = this.method404(var1);// 927
         int var6 = this.method392(var2, var3);// 833 897
         var4 = this.field813;// 902
         this.field812[this.field813++] = new Class190(var5, var6);// 608
         String var8 = var1 + "&" + var2 + "&" + var3;// 721
         if (!this.field819.containsKey(var8)) {// 960
            this.field819.put(var8, new Class258(var4));// 930
         }

         return var4;// 735
      }
   }

   // $VF: synthetic method
   public int method399(String var1, String var2, String var3) {
      Class258 var5;
      return (var5 = (Class258)this.field819.get(var1 + "#" + var2 + "#" + var3)) != null ? var5.field908 : -1;// 402 419
   }

   // $VF: synthetic method
   public int method400(Class203 var1) {
      return this.method410(var1.method190(), var1.method20(), var1.method93());// 500
   }

   // $VF: synthetic method
   public int method401(Class203 var1) {
      return this.method399(var1.method190(), var1.method20(), var1.method93());// 535
   }

   // $VF: synthetic method
   public Class149 method402() {
      return new Class149(this.field812);// 649
   }

   // $VF: synthetic method
   public int method403(long var1) {
      Class221 var3 = this;

      for (int var10000 = var4 = 1; var10000 < var3.field813; var10000 = ++var4) {// 441
         if (var3.field812[var4] instanceof Class183 && ((Class183)var3.field812[var4]).method228() == var1) {// 303 547 575
            return var4;// 326
         }
      }

      return -1;// 457
   }

   // $VF: synthetic method
   public int method404(String var1) {
      return this.method153(var1.replace((char)46, (char)47));// 556
   }

   // $VF: synthetic method
   public Class178 method174(int var1) {
      return this.field812[var1];// 694
   }

   // $VF: synthetic method
   public int method405(String var1) {
      Class258 var3;
      return (var3 = (Class258)this.field816.get(var1.replace((char)46, (char)47))) != null ? var3.field908 : -1;// 280 370
   }

   // $VF: synthetic method
   public void method19() {
      if (this.field813 + 3 >= this.field815) {// 21
         Class178[] var2 = this.field812;// 115
         this.field815 *= 2;// 223
         this.field812 = new Class178[this.field815];// 45
         System.arraycopy(var2, 0, this.field812, 0, this.field813);// 23
      }
   }// 248

   // $VF: synthetic method
   public Class221(Class178[] var1) {
      Class221 var2 = this;
      super();
      this.field815 = 1024;// 185 358
      this.field812 = new Class178[this.field815];
      this.field813 = 1;
      this.field818 = new HashMap();
      this.field816 = new HashMap();
      this.field811 = new HashMap();
      this.field809 = new HashMap();
      this.field819 = new HashMap();
      if (var1.length > this.field815) {// 192
         this.field815 = var1.length;// 574
         this.field812 = new Class178[this.field815];// 272
      }

      System.arraycopy(var1, 0, this.field812, 0, var1.length);// 179
      if (var1.length > 0) {// 146
         this.field813 = var1.length;// 567
      }

      for (int var10000 = var9 = 1; var10000 < var2.field813; var10000 = ++var9) {// 33
         Class178 var7;
         if ((var7 = var2.field812[var9]) instanceof Class185) {// 0 240
            Class185 var3 = (Class185)var7;// 246
            String var5 = ((Class191)var2.field812[var3.method2()]).method20();// 552 603
            if (!var2.field818.containsKey(var5)) {// 278
               var2.field818.put(var5, new Class258(var9));// 466
            }
         } else if (var7 instanceof Class182) {// 485
            Class182 var10 = (Class182)var7;// 68
            String var18 = ((Class191)var2.field812[var10.method2()]).method20();// 59 391
            if (!var2.field816.containsKey(var18)) {// 330
               var2.field816.put(var18, new Class258(var9));// 589
            }
         } else if (var7 instanceof Class186) {// 555
            Class186 var11 = (Class186)var7;// 73
            Class191 var4 = (Class191)var2.field812[var11.method17()];// 415
            Class191 var19 = (Class191)var2.field812[var11.method2()];// 398
            String var6 = new StringBuilder().insert(0, var4.method20()).append("%").append(var19.method20()).toString();// 428
            if (!var2.field809.containsKey(var6)) {// 87
               var2.field809.put(var6, new Class258(var9));// 586
            }
         } else if (var7 instanceof Class191) {// 232
            Class191 var12;
            String var15 = (var12 = (Class191)var7).method20();// 198 463
            if (!var2.field811.containsKey(var15)) {// 424
               var2.field811.put(var15, new Class258(var9));// 28
            }
         } else if (var7 instanceof Class187) {// 329
            Class187 var13 = (Class187)var7;// 412
            Class182 var16 = (Class182)var2.field812[var13.method17()];// 38
            Class186 var20 = (Class186)var2.field812[var13.method2()];// 257
            String var14 = ((Class191)var2.field812[var16.method2()]).method20().replace('/', '.');// 269 455
            String var17 = ((Class191)var2.field812[var20.method17()]).method20();// 148 236
            String var21 = ((Class191)var2.field812[var20.method2()]).method20();// 39 142
            String var22 = ":";// 368
            if (var7 instanceof Class189) {// 99
               var22 = "#";// 160
            } else if (var7 instanceof Class190) {// 40
               var22 = "&";// 63
            }

            String var8 = var14 + var22 + var17 + var22 + var21;// 550
            if (!var2.field819.containsKey(var8)) {// 510
               var2.field819.put(var8, new Class258(var9));// 456
            }
         }
      }
   }// 5

   // $VF: synthetic method
   public int method406(String var1, String var2) {
      Class258 var4;
      return (var4 = (Class258)this.field809.get(var1 + "%" + var2)) != null ? var4.field908 : -1;// 480 518
   }

   // $VF: synthetic method
   public int method407(long var1) {
      int var4;
      if ((var4 = this.method403(var1)) != -1) {// 231
         return var4;// 420
      } else {
         this.method19();// 343
         int var5 = this.field813;// 62
         this.field812[this.field813] = new Class183(var1);// 126
         this.field813 += 2;// 324
         return var5;// 519
      }
   }

   // $VF: synthetic method
   public int method408(String var1, String var2, String var3) {
      int var4;
      if ((var4 = this.method394(var1, var2, var3)) != -1) {// 229
         return var4;// 104
      } else {
         this.method19();
         int var6 = this.method392(var2, var3);// 430
         int var5 = this.method404(var1);// 309 442
         var4 = this.field813;// 344
         this.field812[this.field813++] = new Class188(var5, var6);// 345
         String var8 = var1 + ":" + var2 + ":" + var3;// 449
         if (!this.field819.containsKey(var8)) {// 37
            this.field819.put(var8, new Class258(var4));// 217
         }

         return var4;// 195
      }
   }

   // $VF: synthetic method
   public int method409(String var1) {
      int var4;
      if ((var4 = this.method393(var1)) != -1) {// 135
         return var4;// 474
      } else {
         int var3 = this.method106(var1);// 166
         this.method19();// 434
         Class185 var6 = new Class185(var3);// 292
         int var5 = this.field813;// 373
         this.field812[this.field813++] = var6;// 72
         if (!this.field818.containsKey(var1)) {// 268
            this.field818.put(var1, new Class258(var5));// 497
         }

         return var5;// 536
      }
   }

   // $VF: synthetic method
   public Class221() {
      this.field812 = new Class178[this.field815];// 209 406
      this.field813 = 1;// 1
      this.field818 = new HashMap();
      this.field816 = new HashMap();// 109 411
      this.field811 = new HashMap();// 602
      this.field809 = new HashMap();// 171
      this.field819 = new HashMap();// 487
   }// 69

   // $VF: synthetic method
   public int method410(String var1, String var2, String var3) {
      int var4;
      if ((var4 = this.method399(var1, var2, var3)) != -1) {// 359
         return var4;// 408
      } else {
         this.method19();
         int var5 = this.method404(var1);// 113
         int var6 = this.method392(var2, var3);// 277 459
         var4 = this.field813;// 302
         this.field812[this.field813++] = new Class189(var5, var6);// 203
         String var8 = var1 + "#" + var2 + "#" + var3;// 70
         if (!this.field819.containsKey(var8)) {// 597
            this.field819.put(var8, new Class258(var4));// 118
         }

         return var4;// 353
      }
   }

   // $VF: synthetic method
   public int method2() {
      return this.field813;// 933
   }

   // $VF: synthetic method
   public int method152(String var1) {
      Class258 var3;
      return (var3 = (Class258)this.field811.get(var1)) != null ? var3.field908 : -1;// 4 122
   }

   // $VF: synthetic method
   public int method143(int var1) {
      int var3;
      if ((var3 = this.method147(var1)) != -1) {// 11
         return var3;// 356
      } else {
         this.method19();// 41
         int var4 = this.field813;// 551
         this.field812[this.field813++] = new Class181(var1);// 91
         return var4;// 360
      }
   }

   // $VF: synthetic method
   public int method153(String var1) {
      int var4;
      if ((var4 = this.method405(var1)) != -1) {// 288
         return var4;// 129
      } else {
         this.method19();// 107
         Class182 var3 = new Class182(this.method106(var1));// 437
         int var5 = this.field813;// 110
         this.field812[this.field813++] = var3;// 221
         if (!this.field816.containsKey(var1)) {// 444
            this.field816.put(var1, new Class258(var5));// 601
         }

         return var5;// 251
      }
   }

   // $VF: synthetic method
   public int method411(float var1) {
      int var3;
      if ((var3 = this.method412(var1)) != -1) {// 599
         return var3;// 318
      } else {
         this.method19();// 306
         int var4 = this.field813;// 8
         this.field812[this.field813++] = new Class184(var1);// 331
         return var4;// 384
      }
   }

   // $VF: synthetic method
   public int method412(float var1) {
      Class221 var2 = this;
      int var4 = Float.floatToIntBits(var1);// 65

      for (int var10000 = var3 = 1; var10000 < var2.field813; var10000 = ++var3) {// 504
         if (var2.field812[var3] instanceof Class184 && Float.floatToIntBits(((Class184)var2.field812[var3]).method230()) == var4) {// 80 283 544
            return var3;// 114
         }
      }

      return -1;// 183
   }

   // $VF: synthetic method
   public Class149 method94() {
      Class178[] var2 = new Class178[this.field813];// 950
      System.arraycopy(this.field812, 0, var2, 0, this.field813);// 671
      return new Class149(var2);// 727
   }

   // $VF: synthetic method
   public int method106(String var1) {
      int var3;
      if ((var3 = this.method152(var1)) != -1) {// 517
         return var3;// 214
      } else {
         this.method19();// 371
         int var4 = this.field813;// 585
         this.field812[this.field813++] = new Class191(var1);// 431
         if (!this.field811.containsKey(var1)) {// 563
            this.field811.put(var1, new Class258(var4));// 14
         }

         return var4;// 374
      }
   }

   // $VF: synthetic method
   public int method413(double var1) {
      Class221 var3 = this;
      long var5 = Double.doubleToLongBits(var1);// 19

      for (int var10000 = var4 = 1; var10000 < var3.field813; var10000 = ++var4) {// 86
         if (var3.field812[var4] instanceof Class179 && Double.doubleToLongBits(((Class179)var3.field812[var4]).method226()) == var5) {// 131 473 528
            return var4;// 289
         }
      }

      return -1;// 591
   }

   // $VF: synthetic method
   public int method414(Class203 var1) {
      return this.method408(var1.method190(), var1.method20(), var1.method93());// 75
   }

   // $VF: synthetic method
   public void method173(int var1, Class178 var2) {
      this.field812[var1] = var2;// 690
   }// 835

   // $VF: synthetic method
   public int method147(int var1) {
      Class221 var2 = this;

      for (int var10000 = var3 = 1; var10000 < var2.field813; var10000 = ++var3) {// 564
         if (var2.field812[var3] instanceof Class181 && ((Class181)var2.field812[var3]).method2() == var1) {// 48 281 438
            return var3;// 592
         }
      }

      return -1;// 125
   }

   // $VF: synthetic method
   public int method415(double var1) {
      int var4;
      if ((var4 = this.method413(var1)) != -1) {// 100
         return var4;// 202
      } else {
         this.method19();// 128
         int var5 = this.field813;// 290
         this.field812[this.field813] = new Class179(var1);// 199
         this.field813 += 2;// 512
         return var5;// 538
      }
   }
}
