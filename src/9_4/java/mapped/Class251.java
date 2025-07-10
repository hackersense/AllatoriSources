package mapped;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// $VF: Compiled from tk
public class Class251 implements Serializable {
   // $VF: synthetic field
   public int[] field851;
   // $VF: synthetic field
   public Class246 field852 = null;
   // $VF: synthetic field
   public List field853;
   // $VF: synthetic field
   public int field854;
   // $VF: synthetic field
   public Class246 field855 = null;

   // $VF: synthetic method
   public Class246 method448(Class246 var1, Class117 var2) {
      return this.method455(var1, var2.method42());// 224
   }

   // $VF: synthetic method
   public void method449(Class199[] var1, Class246 var2, Class246 var3) {
      for (int var10000 = var7 = 0; var10000 < var1.length; var10000 = ++var7) {// 1294
         Class246 var5 = var1[var7].method37();// 1349
         Class246 var6 = var1[var7].method32();// 1243
         if (var5 == var2) {// 1241
            var1[var7].method268(var3);// 1522
         }

         if (var6 == var2) {// 1391
            var1[var7].method29(var3);// 1586
         }
      }
   }// 1551

   // $VF: synthetic method
   public Class251(Class10 var1) {
      this.field854 = 0;
      this.method451(var1);// 377 604
   }// 22

   // $VF: synthetic method
   public Class246 method450(Class246 var1, Class251 var2) {
      if (var2 == null) {// 2
         throw new Class241("Inserting null InstructionList");// 505
      } else if (var2.method101()) {// 583
         return var1;// 19
      } else {
         Class246 var3 = var1.field841;// 473
         Class246 var4 = var2.field852;
         var1.field841 = var2.field855;// 131
         var2.field855.field838 = var1;// 528
         Class251 var7;
         if ((var2.field852.field841 = var3) != null) {// 264 289
            var7 = this;
            var3.field838 = var2.field852;// 323
         } else {
            var7 = this;// 591
            this.field852 = var2.field852;
         }

         var7.field854 = var7.field854 + var2.field854;// 60
         var2.method115();// 348
         return var4;// 150
      }
   }

   // $VF: synthetic method
   public Class246 method451(Class10 var1) {
      Class246 var3 = Class246.method435(var1);// 283
      this.method268(var3);// 544
      return var3;// 114
   }

   // $VF: synthetic method
   public void method107() {
      for (Class246 var10000 = var2 = this.field855; var10000 != null; var10000 = var2 = var2.field841) {// 1326 1519
         var2.method122();
      }

      this.method115();// 1674
   }// 1139

   // $VF: synthetic method
   public Class247 method452(Class246 var1, Class90 var2) {
      Class247 var5 = Class247.method439(var2);// 113
      Class251 var3 = new Class251();// 459
      var3.method268(var5);// 302
      this.method450(var1, var3);// 203
      return var5;// 70
   }

   // $VF: synthetic method
   public Iterator method453() {
      return new Class597(this);// 1209
   }

   // $VF: synthetic method
   public void method454(Class246 var1, Class246 var2) {
      Class251 var3 = this;
      Class246 var4;
      Class246 var5;
      Class246 var13;
      if (var1 == null && var2 == null) {// 933
         var4 = this.field852;// 688
         var5 = this.field852;
         this.field852 = this.field855 = null;// 744
         var13 = var5;
      } else {
         if (var1 == null) {// 771
            var5 = this.field852;// 863
            this.field852 = var2;// 864
            var13 = var2;
         } else {
            var5 = var1.field838;// 950
            var1.field838 = var2;// 671
            var13 = var2;// 750
         }

         if (var13 == null) {
            var4 = this.field855;// 853
            this.field855 = var1;// 787
            var13 = var5;
         } else {
            var4 = var2.field841;// 782
            var2.field841 = var1;// 870
            var13 = var5;// 836
         }
      }

      var13.field841 = null;
      var4.field838 = null;// 956
      ArrayList var8 = new ArrayList();// 610

      for (Class246 var15 = var4 = var5; var15 != null; var15 = var4 = var4.field838) {// 639 686
         var4.method18().method19();
      }

      StringBuffer var11 = new StringBuffer("{ ");// 822

      for (var13 = var6 = var5; var13 != null; var13 = var6) {
         var2 = var6.field838;// 959
         var3.field854--;// 976
         if (var6.method101()) {// 843
            var8.add(var6);// 851
            var11.append(var6.method4(true) + " ");// 687
            var6.field838 = var6.field841 = null;// 696
            var13 = var2;
         } else {
            var6.method122();// 924
            var13 = var2;// 627
         }

         var6 = var13;
      }

      var11.append("}");// 625
      if (!var8.isEmpty()) {// 868
         Class246[] var7 = new Class246[var8.size()];// 802
         var8.toArray(var7);// 772
         throw new Class224(var7, var11.toString());// 715
      }
   }// 819

   // $VF: synthetic method
   public Class246 method455(Class246 var1, Class251 var2) {
      if (var2 == null) {// 110
         throw new Class241("Appending null InstructionList");// 221
      } else if (var2.method101()) {// 601
         return var1;// 193
      } else {
         Class246 var3 = var1.field838;// 486
         Class246 var4 = var2.field852;
         var1.field838 = var2.field852;// 117
         var2.field852.field841 = var1;// 300
         Class251 var7;
         if ((var2.field855.field838 = var3) != null) {// 245 296
            var7 = this;
            var3.field841 = var2.field855;// 404
         } else {
            var7 = this;// 81
            this.field855 = var2.field855;
         }

         var7.field854 = var7.field854 + var2.field854;// 394
         var2.method115();// 556
         return var4;// 316
      }
   }

   // $VF: synthetic method
   public Class251(Class117 var1) {
      this.field854 = 0;
      this.method470(var1.method42());// 278 603
   }// 466

   // $VF: synthetic method
   public void method456(Class246 var1, Class246 var2) {
      Class246 var4;
      for (Class246 var10000 = var4 = this.field852; var10000 != null; var10000 = var4 = var4.field838) {// 1282
         Class10 var7;
         if ((var7 = var4.method18()) instanceof Class90) {// 1362 1527
            Class90 var8;
            if ((var8 = (Class90)var7).method32() == var1) {// 1064 1280 1513
               var8.method29(var2);// 1541
            }

            if (var8 instanceof Class113) {// 1439
               Class246[] var5 = ((Class113)var8).method39();// 1437

               int var6;
               for (int var9 = var6 = 0; var9 < var5.length; var9 = ++var6) {// 1154
                  if (var5[var6] == var1) {// 1156
                     ((Class113)var8).method38(var6, var2);// 1660
                  }
               }
            }
         }
      }
   }// 1591

   // $VF: synthetic method
   public Class246 method457(Class246 var1, Class10 var2) {
      return this.method450(var1, new Class251(var2));// 515
   }

   // $VF: synthetic method
   public Class246 method458(Class10 var1, Class117 var2) {
      return this.method459(var1, var2.method42());// 346
   }

   // $VF: synthetic method
   public Class246 method459(Class10 var1, Class251 var2) {
      Class246 var4;
      if ((var4 = this.method475(var1)) == null) {// 545
         throw new Class241("Instruction " + var1 + " is not contained in this list.");// 570
      } else {
         return this.method455(var4, var2);// 162
      }
   }

   // $VF: synthetic method
   public Class251() {
      this.field854 = 0;// 132
   }// 184

   // $VF: synthetic method
   public void method460(Class246 var1, Class246 var2) {
      this.method454(var1.field841, var2.field838);// 732
   }// 806

   // $VF: synthetic method
   public static Class246 method461(Class246[] var0, int[] var1, int var2, int var3) {
      int var4 = 0;// 329
      var2--;

      int var10000;
      do {
         int var7 = (var4 + var2) / 2;// 269
         int var6;
         if ((var6 = var1[var7]) == var3) {// 148 455
            return var0[var7];// 236
         }

         if (var3 < var6) {// 142
            var2 = var7 - 1;// 39
            var10000 = var4;
         } else {
            var10000 = var4 = var7 + 1;// 99
         }
      } while (var10000 <= var2);// 40

      return null;// 63
   }

   // $VF: synthetic method
   public boolean method462(Class10 var1) {
      return this.method435(var1) != null;// 905
   }

   // $VF: synthetic method
   public int method17() {
      return this.field854;// 1272
   }

   // $VF: synthetic method
   public int method2() {
      return this.field854;// 1426
   }

   // $VF: synthetic method
   public void method463(Class221 var1, Class221 var2) {
      Class246 var4;
      for (Class246 var10000 = var4 = this.field852; var10000 != null; var10000 = var4 = var4.field838) {// 1561
         Class10 var6 = var4.field840;// 1081
         if (var4.field840 instanceof Class1) {// 1494
            Class1 var7 = (Class1)var6;// 1442
            Class178 var5 = var1.method174(var7.method2());// 1633
            var7.method6(var2.method397(var5, var1));// 1126
         }
      }
   }// 1496

   // $VF: synthetic method
   public void method115() {
      this.field852 = this.field855 = null;// 1397
      this.field854 = 0;// 1330
   }// 1659

   // $VF: synthetic method
   public String method4(boolean var1) {
      StringBuffer var2 = new StringBuffer();// 786

      for (Class246 var10000 = var4 = this.field852; var10000 != null; var10000 = var4) {
         var2.append(var4.method4(var1)).append("\n");// 840
         var4 = var4.field838;// 934
      }

      return var2.toString();// 969
   }

   // $VF: synthetic method
   public Class246 method464(Class10 var1) {
      Class246 var3 = Class246.method435(var1);// 42
      this.method29(var3);// 439
      return var3;// 529
   }

   // $VF: synthetic method
   public Class246 method465(Class10 var1, Class10 var2) {
      return this.method459(var1, new Class251(var2));// 363
   }

   // $VF: synthetic method
   public static Class246 method466(Class251 var0) {
      return var0.field852;// 185
   }

   // $VF: synthetic method
   public void method28(Class246 var1, Class246 var2) {
      this.method478(var1, var1, var2);// 835
   }// 619

   // $VF: synthetic method
   public void method467(Class10 var1, Class10 var2) {
      Class246 var3;
      if ((var3 = this.method435(var1)) == null) {// 793
         throw new Class241("Instruction " + var1 + " is not contained in this list.");// 820
      } else {
         Class246 var5;
         if ((var5 = this.method475(var2)) == null) {// 726
            throw new Class241("Instruction " + var2 + " is not contained in this list.");// 720
         } else {
            this.method460(var3, var5);// 626
         }
      }
   }// 775

   // $VF: synthetic method
   public Class246 method468(int var1) {
      return method461(this.method39(), this.field851, this.field854, var1);// 149 157
   }

   // $VF: synthetic method
   public Class246 method37() {
      return this.field855;// 1457
   }

   // $VF: synthetic method
   public Class251(Class90 var1) {
      this.field854 = 0;
      this.method439(var1);// 272 321
   }// 179

   // $VF: synthetic method
   public Class247 method469(Class246 var1, Class90 var2) {
      Class247 var5 = Class247.method439(var2);// 362
      Class251 var3 = new Class251();// 476
      var3.method268(var5);// 542
      this.method455(var1, var3);// 231
      return var5;// 420
   }

   // $VF: synthetic method
   public void method272(Class246 var1) {
      this.method454(var1.field841, var1.field838);// 669
   }// 760

   // $VF: synthetic method
   public Class246 method470(Class251 var1) {
      if (var1 == null) {// 520
         throw new Class241("Appending null InstructionList");// 502
      } else if (var1.method101()) {// 172
         return null;// 564
      } else if (this.method101()) {// 281
         this.field852 = var1.field852;
         this.field855 = var1.field855;// 592
         this.field854 = var1.field854;// 483
         var1.method115();// 181 438
         return this.field852;// 433
      } else {
         return this.method455(this.field855, var1);// 413
      }
   }

   // $VF: synthetic method
   public void method122() {
      Class251 var1 = this;
      Iterator var2;
      if (this.field853 != null) {// 1020
         for (Iterator var10000 = var2 = this.field853.iterator(); var10000.hasNext(); var10000 = var2) {// 1421
            ((Class519)var2.next()).method1472(var1);// 1207
         }
      }
   }// 1146

   // $VF: synthetic method
   public Class247 method471(Class90 var1) {
      Class247 var3 = Class247.method439(var1);// 49
      this.method29(var3);// 565
      return var3;// 173
   }

   // $VF: synthetic method
   public Class246 method472(Class10 var1, Class251 var2) {
      Class246 var4;
      if ((var4 = this.method435(var1)) == null) {// 462
         throw new Class241("Instruction " + var1 + " is not contained in this list.");// 559
      } else {
         return this.method450(var4, var2);// 187
      }
   }

   // $VF: synthetic method
   public boolean method101() {
      return this.field852 == null;// 589
   }

   // $VF: synthetic method
   public int[] method41() {
      return this.field851;// 1228
   }

   // $VF: synthetic method
   public Class246 method473(Class251 var1) {
      if (this.method101()) {// 128
         this.method470(var1);// 290
         return this.field852;// 199
      } else {
         return this.method450(this.field852, var1);// 538
      }
   }

   // $VF: synthetic method
   public void method474(Class519 var1) {
      if (this.field853 == null) {// 1235
         this.field853 = new ArrayList();// 1291
      }

      this.field853.add(var1);// 1077
   }// 1177

   // $VF: synthetic method
   public Class246 method475(Class10 var1) {
      for (Class246 var10000 = var3 = this.field855; var10000 != null; var10000 = var3 = var3.field841) {// 922
         if (var3.field840 == var1) {// 718
            return var3;// 971
         }
      }

      return null;// 636
   }

   // $VF: synthetic method
   public Class251 method42() {
      HashMap var7 = new HashMap();// 1298
      Class251 var6 = new Class251();// 1058
      Class246 var9;
      Class246 var10000 = var9 = this.field852;

      while (var10000 != null) {
         Class10 var4 = var9.field840;// 1288
         Class10 var5;
         if ((var5 = var9.field840.method18()) instanceof Class90) {// 1436 1463
            var7.put(var9, var6.method439((Class90)var5));// 1433
            var10000 = var9;
         } else {
            var7.put(var9, var6.method451(var5));// 1069
            var10000 = var9;// 1570
         }

         var10000 = var9 = var10000.field838;
      }

      Class246 var10 = this.field852;// 1338
      Class246 var14 = var6.field852;// 1465

      for (Class246 var18 = var10; var18 != null; var18 = var10) {// 1268
         Class10 var15 = var10.field840;// 1491
         Class10 var2 = var14.field840;// 1508
         if (var15 instanceof Class90) {// 1568
            Class90 var1 = (Class90)var15;// 1255
            Class90 var12 = (Class90)var2;// 1266
            Class246 var8 = var1.method32();// 1101
            var12.method29((Class246)var7.get(var8));// 1035
            if (var1 instanceof Class113) {// 1399
               Class246[] var11 = ((Class113)var1).method39();// 1614
               Class246[] var13 = ((Class113)var12).method39();// 1259

               for (int var19 = var16 = 0; var19 < var11.length; var19 = var16) {// 1679
                  int var10001 = var16;
                  Class246 var10002 = (Class246)var7.get(var11[var16]);
                  var16++;
                  var13[var10001] = var10002;// 1593
               }
            }
         }

         var10 = var10.field838;// 1007
         var14 = var14.field838;// 1048
      }

      return var6;// 1136
   }

   // $VF: synthetic method
   public void method268(Class246 var1) {
      Class251 var4;
      if (this.method101()) {// 11
         this.field852 = this.field855 = var1;// 356
         var1.field838 = var1.field841 = null;// 522
         var4 = this;
      } else {
         var4 = this;// 551
         this.field855.field838 = var1;
         var1.field841 = this.field855;// 91
         var1.field838 = null;// 360
         this.field855 = var1;// 312
      }

      var4.field854++;// 274
   }// 558

   // $VF: synthetic method
   public Class246 method476(Class246 var1, Class117 var2) {
      return this.method450(var1, var2.method42());// 136
   }

   // $VF: synthetic method
   public void method477(Class202[] var1, Class246 var2, Class246 var3) {
      for (int var10000 = var5 = 0; var10000 < var1.length; var10000 = ++var5) {// 1554
         if (var1[var5].method32() == var2) {// 1654
            var1[var5].method29(var3);// 1590
         }

         if (var1[var5].method37() == var2) {// 1225
            var1[var5].method272(var3);// 1005
         }

         if (var1[var5].method274() == var2) {// 1577
            var1[var5].method268(var3);// 1634
         }
      }
   }// 1286

   // $VF: synthetic method
   public void method478(Class246 var1, Class246 var2, Class246 var3) {
      Class246 var6 = var2;
      if (var1 != null && var2 != null) {// 605
         if (var3 != var1 && var3 != var2) {// 921
            Class246 var4;
            for (Class246 var10 = var4 = var1; var10 != var6.field838; var10 = var4 = var4.field838) {// 811
               if (var4 == null) {// 764
                  throw new Class241("Invalid range: From " + var1 + " to " + var6);// 821
               }

               if (var4 == var3) {// 654
                  throw new Class241("Invalid range: From " + var1 + " to " + var6 + " contains target " + var3);// 609
               }
            }

            var4 = var1.field841;// 818
            Class246 var5 = var6.field838;
            Class246 var11;
            if (var4 != null) {// 966
               var11 = var4.field838 = var5;// 949
            } else {
               this.field852 = var5;// 936
               var11 = var5;// 691
            }

            if (var11 != null) {
               var11 = var1;
               var5.field841 = var4;// 899
            } else {
               this.field855 = var4;// 788
               var11 = var1;// 927
            }

            var11.field841 = var6.field838 = null;
            if (var3 == null) {// 902
               if (this.field852 != null) {// 608
                  this.field852.field841 = var6;// 721
               }

               var6.field838 = this.field852;// 930
               this.field852 = var1;// 914
            } else {
               var5 = var3.field838;// 846
               var3.field838 = var1;// 756
               var1.field841 = var3;// 975
               var6.field838 = var5;// 883
               if (var5 != null) {// 881
                  var5.field841 = var6;// 738
               } else {
                  this.field855 = var6;// 873
               }
            }
         } else {
            throw new Class241("Invalid range: From " + var1 + " to " + var2 + " contains target " + var3);// 677
         }
      } else {
         throw new Class241("Invalid null handle: From " + var1 + " to " + var2);// 712
      }
   }// 618 735 801

   // $VF: synthetic method
   public Class10[] method479() {
      Class437 var4 = new Class437(this.method207());// 940
      ArrayList var2 = new ArrayList();// 606

      try {
         while (var4.available() > 0) {// 789
            var2.add(Class10.method25(var4));// 866
         }
      } catch (IOException var3) {// 790
         throw new Class241(var3.toString());// 942
      }

      return (Class10[])var2.toArray(new Class10[var2.size()]);// 906
   }

   // $VF: synthetic method
   public Class246 method480(Class246 var1, Class10 var2) {
      return this.method455(var1, new Class251(var2));// 29
   }

   // $VF: synthetic method
   public void method29(Class246 var1) {
      Class251 var4;
      if (this.method101()) {// 85
         this.field852 = this.field855 = var1;// 16
         var1.field838 = var1.field841 = null;// 121
         var4 = this;
      } else {
         var4 = this;// 518
         this.field852.field841 = var1;
         var1.field838 = this.field852;// 472
         var1.field841 = null;// 381
         this.field852 = var1;// 387
      }

      var4.field854++;// 261
   }// 180

   // $VF: synthetic method
   public boolean method31(Class246 var1) {
      if (var1 == null) {// 693
         return false;// 645
      } else {
         for (Class246 var10000 = var3 = this.field852; var10000 != null; var10000 = var3 = var3.field838) {// 707
            if (var3 == var1) {// 794
               return true;// 831
            }
         }

         return false;// 624
      }
   }

   // $VF: synthetic method
   public void method260(boolean var1) {
      Class251 var16 = this;
      byte var7 = 0;// 766
      int var4 = 0;
      int var3 = 0;// 865
      int var5 = 0;
      int[] var6 = new int[this.field854];// 939
      Class246 var12;
      if (var1) {// 725
         for (Class246 var21 = var12 = this.field852; var21 != null; var21 = var12 = var12.field838) {// 978
            Class10 var2 = var12.field840;// 700
            if (var12.field840 instanceof Class90) {// 695
               Class10 var8 = ((Class90)var2).method32().field840;// 941
               if (!var16.method462(var8)) {// 662
                  throw new Class241("Branch target of " + Class125.field386[var2.field3] + ":" + var8 + " not in instruction list");// 661
               }

               if (var2 instanceof Class113) {// 919
                  Class246[] var9 = ((Class113)var2).method39();// 879

                  int var10;
                  for (int var22 = var10 = 0; var22 < var9.length; var22 = ++var10) {// 803
                     var8 = var9[var10].field840;// 620
                     if (!var16.method462(var8)) {// 799
                        throw new Class241("Branch target of " + Class125.field386[var2.field3] + ":" + var8 + " not in instruction list");// 876
                     }
                  }
               }

               if (!(var12 instanceof Class247)) {// 748
                  throw new Class241("Branch instruction " + Class125.field386[var2.field3] + ":" + var8 + " not contained in BranchHandle.");// 825
               }
            }
         }
      }

      for (Class246 var23 = var13 = var16.field852; var23 != null; var23 = var13 = var13.field838) {// 970
         Class10 var17 = var13.field840;// 652
         var13.method6(var3);// 972
         var6[var5++] = var3;// 679
         int var24;
         switch (var17.method22()) {// 774
            case 167:
            case 168:
               var7 += 2;// 945

               while (false) {
               }

               var24 = var3;
               break;// 743
            case 170:
            case 171:
               var7 += 3;// 667
            case 169:
            default:
               var24 = var3;// 741
         }

         var3 = var24 + var17.method17();
      }

      for (Class246 var25 = var14 = var16.field852; var25 != null; var25 = var14 = var14.field838) {// 758
         var4 += var14.method34(var4, var7);// 935
      }

      var5 = 0;
      var3 = 0;// 770

      for (Class246 var26 = var15 = var16.field852; var26 != null; var26 = var15 = var15.field838) {// 708 731
         Class10 var18 = var15.field840;
         var15.method6(var3);// 894
         var6[var5++] = var3;// 749
         var3 += var18.method17();// 634
      }

      var16.field851 = new int[var5];// 862
      System.arraycopy(var6, 0, var16.field851, 0, var5);// 703
   }// 850

   // $VF: synthetic method
   public Class246 method481(Class10 var1, Class10 var2) {
      return this.method472(var1, new Class251(var2));// 566
   }

   // $VF: synthetic method
   public void method432(Class10 var1) {
      Class246 var3;
      if ((var3 = this.method435(var1)) == null) {// 747
         throw new Class241("Instruction " + var1 + " is not contained in this list.");// 746
      } else {
         this.method272(var3);// 826
      }
   }// 891

   // $VF: synthetic method
   public Class246 method482(Class10 var1, Class117 var2) {
      return this.method472(var1, var2.method42());// 217
   }

   // $VF: synthetic method
   public Class251(byte[] var1) {
      Class251 var2 = this;
      super();
      this.field852 = null;// 1
      this.field855 = null;
      this.field854 = 0;// 46 69
      Class437 var6 = new Class437(var1);// 116
      Class246[] var5 = new Class246[var1.length];// 422
      int[] var14 = new int[var1.length];// 464
      int var4 = 0;// 25

      try {
         while (var6.available() > 0) {// 45
            int var3 = var6.method873();
            var14[var4] = var3;// 248 440
            Object var7;
            Class10 var12;
            ((var12 = Class10.method25(var6)) instanceof Class90 ? (var7 = var2.method439((Class90)var12)) : (var7 = var2.method451(var12))).method6(var3);// 32 119 138 423 525
            var5[var4++] = (Class246)var7;// 220 593
         }
      } catch (IOException var11) {// 540
         throw new Class241(var11.toString());// 291
      }

      var2.field851 = new int[var4];// 169
      int var10000 = 0;
      System.arraycopy(var14, 0, var2.field851, 0, var4);// 216

      for (int var15 = 0; var10000 < var4; var10000 = ++var15) {// 50
         if (var5[var15] instanceof Class247) {// 253
            Class90 var13 = (Class90)var5[var15].field840;// 135
            int var18 = var13.field11 + var13.method30();// 474
            Class246 var16;
            if ((var16 = method461(var5, var14, var4, var18)) == null) {// 292 434
               throw new Class241("Couldn't find target for branch: " + var13);// 373
            }

            var13.method29(var16);// 268
            if (var13 instanceof Class113) {// 66
               Class113 var8;
               int[] var9 = (var8 = (Class113)var13).method40();// 307 536

               int var10;
               for (int var20 = var10 = 0; var20 < var9.length; var20 = var10) {// 218
                  var18 = var13.field11 + var9[var10];// 109
                  Class246 var17;
                  if ((var17 = method461(var5, var14, var4, var18)) == null) {// 15 213
                     throw new Class241("Couldn't find target for switch: " + var13);// 385
                  }

                  var8.method38(var10++, var17);// 270
               }
            }
         }
      }
   }// 280

   // $VF: synthetic method
   public Class246 method483(Class117 var1) {
      return this.method473(var1.method42());// 304
   }

   // $VF: synthetic method
   public Class246 method484(Class117 var1) {
      return this.method470(var1.method42());// 214
   }

   // $VF: synthetic method
   public Class246 method32() {
      return this.field852;// 1265
   }

   // $VF: synthetic method
   public void method19() {
      this.method260(false);// 912
   }// 841

   // $VF: synthetic method
   public Class246 method435(Class10 var1) {
      for (Class246 var10000 = var3 = this.field852; var10000 != null; var10000 = var3 = var3.field838) {// 641
         if (var3.field840 == var1) {// 915
            return var3;// 842
         }
      }

      return null;// 946
   }

   // $VF: synthetic method
   public Class246[] method39() {
      Class251 var3 = this;
      Class246[] var1 = new Class246[this.field854];// 1500
      Class246 var2 = this.field852;// 1542

      for (int var10000 = var4 = 0; var10000 < var3.field854; var10000 = var4) {// 1010
         var1[var4++] = var2;// 1047
         var2 = var2.field838;// 1161
      }

      return var1;// 1528
   }

   // $VF: synthetic method
   public Class247 method439(Class90 var1) {
      Class247 var3 = Class247.method439(var1);// 164
      this.method268(var3);// 554
      return var3;// 429
   }

   // $VF: synthetic method
   public byte[] method207() {
      Class251 var3 = this;
      this.method19();// 642
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();// 622
      DataOutputStream var2 = new DataOutputStream(var1);// 659

      try {
         for (Class246 var5 = var3.field852; var5 != null; var5 = var5.field838) {// 804 904
            var5.field840.method3(var2);// 890
         }
      } catch (IOException var4) {// 817
         System.err.println(var4);// 910
         return null;// 967
      }

      return var1.toByteArray();// 710
   }

   // $VF: synthetic method
   public void method485(Class519 var1) {
      if (this.field853 != null) {// 1680
         this.field853.remove(var1);// 1405
      }
   }// 1109
}
