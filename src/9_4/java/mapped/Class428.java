package mapped;

import smardecSB.ldc;

import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Vector;

// $VF: Compiled from az
public class Class428 implements Class418 {
   // $VF: synthetic field
   public static String field1249 = "makeConcatWithConstants";
   // $VF: synthetic field
   public static Hashtable field1250 = new Hashtable();
   // $VF: synthetic field
   public Hashtable field1251;
   // $VF: synthetic field
   public String field1252;
   // $VF: synthetic field
   public static Class138 field1253 = Class138.field593;
   // $VF: synthetic field
   public Hashtable field1254;
   // $VF: synthetic field
   public Hashtable field1255;
   // $VF: synthetic field
   public Collection field1256 = new TreeSet();
   // $VF: synthetic field
   public boolean field1257 = true;
   // $VF: synthetic field
   public Class338 field1258;
   // $VF: synthetic field
   public static String field1259 = "AllatoriDecryptString";
   // $VF: synthetic field
   public static boolean field1260 = false;
   // $VF: synthetic field
   public Hashtable field1261 = new Hashtable();
   // $VF: synthetic field
   public Hashtable field1262;
   // $VF: synthetic field
   public String field1263;
   // $VF: synthetic field
   public static Vector field1264;
   // $VF: synthetic field
   public static String field1265 = "AllatoriDecryptString2";
   // $VF: synthetic field
   public static char field1266 = 'U';
   // $VF: synthetic field
   public static String field1267 = "allatori-12321-32123:";
   // $VF: synthetic field
   public Hashtable field1268;
   // $VF: synthetic field
   public Hashtable field1269;

   // $VF: synthetic method
   public void method849(Vector var1, Vector var2) {
      Class428 var3 = this;
      if (var1 == null) {// 199
         var1 = new Vector();
      }

      if (var2 == null) {// 512
         var2 = new Vector();
      }

      if (Class580.method1932().method1858()) {// 405
         Iterator var6;
         Iterator var10000 = var6 = var1.iterator();// 85

         while (var10000.hasNext()) {
            Class206 var4 = (Class206)var6.next();
            var10000 = var6;
            Class482.method1279(var4, field1259, field1266);// 16
         }
      } else {
         Iterator var7;
         Iterator var15 = var7 = var1.iterator();// 518

         while (var15.hasNext()) {
            Class206 var12 = (Class206)var7.next();
            int var9 = Class337.method549(125) + 1;// 472
            int var5 = Class337.method549(125) + 1;// 381
            var15 = var7;
            var3.field1262.put(var12.method93(), new int[]{var9, var5});// 387
            var3.method850(var12);// 380
         }

         for (Iterator var16 = var8 = var2.iterator(); var16.hasNext(); var16 = var8) {// 3
            Class206 var13 = (Class206)var8.next();
            int var10 = Class337.method549(125) + 1;// 543
            int var14 = Class337.method549(125) + 1;// 186
            int var11 = Class337.method547() <= 0.5 ? 0 : 1;// 175
            field1250.put(var13.method93(), new int[]{var10, var14, var11});// 276
            var3.method840(var13);// 167
         }
      }
   }// 452

   // $VF: synthetic method
   public void method850(Class206 var1) {
      Class120 var5 = new Class120(var1);// 397
      Class221 var4 = var1.method46();// 9 163
      Class251 var9 = new Class251();// 566
      Class203 var6 = new Class203(9, Class138.field593, new Class138[]{field1253}, new String[]{"s"}, field1259, var1.method93(), var9, var4);// 531
      boolean var8 = Class337.method547() <= 0.5;// 345
      Vector var3;
      Vector var10000;
      if (var8) {// 449
         var10000 = var3 = Class482.method1274(((int[])this.field1262.get(var1.method93()))[0]);// 378
         var10000.addAll(Class482.method1274(Class337.method549(125) + 1));// 195
      } else {
         (var3 = Class482.method1274(Class337.method549(125) + 1)).addAll(Class482.method1274(((int[])this.field1262.get(var1.method93()))[0]));// 75 351
         var10000 = var3;// 111
      }

      var10000.addAll(Class482.method1274(((int[])this.field1262.get(var1.method93()))[1]));
      Iterator var10 = var3.iterator();// 587
      Iterator var16 = var10;

      while (var16.hasNext()) {
         Class10 var12 = (Class10)var10.next();
         var16 = var10;
         var9.method451(var12);
      }

      var9.method451(Class120.method77(Class138.field583, 0));// 153
      var9.method451(var5.method64(Class138.field593));// 477
      var9.method451(Opcodes.dup);// 53
      var9.method451(Class120.method75(Class138.field583, 0));// 584
      var9.method451(var5.method47("java.lang.String", "length", Class138.field591, Class138.field582, (short)182));// 200
      var9.method451(Opcodes.dup);// 84
      var9.method451(var5.method67(Class138.field585, (short)1));// 393
      var9.method451(Opcodes.swap);// 43
      var9.method484(new Class116(var4, 1));// 293
      var9.method451(Opcodes.isub);// 54
      var9.method451(Opcodes.dup_x2);// 74
      var9.method451(Class120.method75(Class138.field591, 3));// 241
      var9.method451(Class120.method75(Class138.field583, 1));// 526
      var9.method451(Class120.method75(Class138.field591, 4));// 136
      var9.method451(Opcodes.dup_x2);// 158
      if (var8) {// 90
         var9.method451(Class120.pop2);// 294
         var9.method451(Class120.method75(Class138.field591, 2));// 342
      } else {
         var9.method451(Class120.pop);// 96
         var9.method451(Class120.method75(Class138.field591, 2));// 581
         var9.method451(Class120.pop);// 359
      }

      Class90 var11 = Class120.method73((short)155, null);// 113
      Class247 var13 = var9.method439(var11);// 459
      var9.method451(Class120.method77(Class138.field583, 1));// 302
      var9.method451(Class120.method77(Class138.field583, 0));// 203
      var9.method451(Class120.method77(Class138.field591, 3));// 70
      var9.method451(Opcodes.dup_x1);// 597
      var9.method451(var5.method47("java.lang.String", "charAt", Class138.field585, new Class138[]{Class138.field591}, (short)182));// 118
      var9.method451(Class120.method77(Class138.field591, 2));// 379
      var9.method451(Opcodes.field112);// 353
      var9.method451(Opcodes.field27);// 189
      var9.method451(new Class286(3, -1));// 165
      var9.method451(Opcodes.castore);// 447
      var9.method451(Class120.method77(Class138.field591, 3));// 79
      Class90 var15 = Class120.method73((short)155, null);// 396
      var9.method439(var15);// 364
      var9.method451(Class120.method77(Class138.field583, 1));// 154
      var9.method451(Class120.method77(Class138.field583, 0));// 861
      var9.method451(Class120.method77(Class138.field591, 3));// 752
      var9.method451(Opcodes.dup_x1);// 847
      var9.method451(var5.method47("java.lang.String", "charAt", Class138.field585, new Class138[]{Class138.field591}, (short)182));// 958
      var9.method451(Class120.method77(Class138.field591, 4));// 712
      var9.method451(new Class286(3, -1));// 985
      var9.method451(Opcodes.field112);// 921
      var9.method451(Opcodes.field27);// 677
      var9.method451(Opcodes.castore);// 698
      var9.method451(Class120.method77(Class138.field591, 3));// 689
      var9.method439(Class120.method73((short)167, var13));// 764
      Class246 var14 = var9.method451(var5.method58("java.lang.String"));// 609
      var9.method451(Opcodes.dup);// 633
      var9.method451(Class120.method77(Class138.field583, 1));// 684
      var9.method451(var5.method47("java.lang.String", "<init>", Class138.field586, new Class138[]{new Class145(Class138.field585, 1)}, (short)183));// 892
      var9.method451(Class120.method55(Class138.field583));// 632
      var11.method29(var14);// 966
      var15.method29(var14);// 949
      var6.method309();// 936
      var6.method276();// 670
      var1.method365(var6.method315());// 691
      var9.method107();// 899
   }// 823

   // $VF: synthetic method
   public void method840(Class206 var1) {
      Class120 var5 = new Class120(var1);// 854
      Class221 var4 = var1.method46();// 844 852
      Class251 var13 = new Class251();// 734
      Class203 var6 = new Class203(9, Class138.field593, new Class138[]{field1253}, new String[]{"arg0"}, field1265, var1.method93(), var13, var4);// 675
      var13.method451(var5.method58("java.lang.StringBuffer"));// 816
      var13.method451(Opcodes.dup);// 974
      String var3 = "java.lang.RuntimeException";// 649
      var13.method451(var5.method58(var3));// 705
      var13.method451(Opcodes.dup);// 697
      var13.method451(var5.method47(var3, "<init>", Class138.field586, Class138.field582, (short)183));// 982
      var13.method451(var5.method47(var3, "getStackTrace", new Class145(new Class144("java.lang.StackTraceElement"), 1), Class138.field582, (short)182));// 722
      var13.method484(new Class116(var4, 1));// 613
      var13.method451(Opcodes.aaload);// 867
      var13.method451(Opcodes.dup_x2);// 933
      boolean var16 = ((int[])field1250.get(var1.method93()))[2] == 0;// 744
      boolean var8 = Class337.method547() > 0.5;// 655
      Class251 var10000;
      if (var8) {// 771
         var13.method451(// 863
            var5.method47("java.lang.StackTraceElement", var16 ? "getClassName" : "getMethodName", Class138.field593, Class138.field582, (short)182)
         );
         var10000 = var13;
      } else {
         var13.method451(// 647
            var5.method47("java.lang.StackTraceElement", var16 ? "getMethodName" : "getClassName", Class138.field593, Class138.field582, (short)182)
         );
         var10000 = var13;// 950
      }

      var10000.method451(var5.method47("java.lang.StringBuffer", "<init>", Class138.field586, new Class138[]{Class138.field593}, (short)183));
      var13.method451(Opcodes.swap);// 727
      if (var8) {// 853
         var13.method451(// 787
            var5.method47("java.lang.StackTraceElement", var16 ? "getMethodName" : "getClassName", Class138.field593, Class138.field582, (short)182)
         );
         var13.method451(var5.method47("java.lang.StringBuffer", "append", Class138.field587, new Class138[]{Class138.field593}, (short)182));// 796
         var10000 = var13;
      } else {
         var13.method451(// 870
            var5.method47("java.lang.StackTraceElement", var16 ? "getClassName" : "getMethodName", Class138.field593, Class138.field582, (short)182)
         );
         var13.method451(Opcodes.field78);// 929
         var13.method451(Opcodes.swap);// 676
         var13.method451(var5.method47("java.lang.StringBuffer", "insert", Class138.field587, new Class138[]{Class138.field591, Class138.field593}, (short)182));// 836
         var10000 = var13;// 610
      }

      var10000.method451(var5.method47("java.lang.StringBuffer", "toString", Class138.field593, Class138.field582, (short)182));
      var13.method451(Opcodes.dup);// 639
      var13.method451(var5.method47("java.lang.String", "length", Class138.field591, Class138.field582, (short)182));// 822
      var13.method484(new Class116(var4, 1));// 627
      var13.method451(Opcodes.isub);// 959
      var8 = Class337.method547() <= 0.5;// 851
      Vector var17;
      Vector var25;
      if (var8) {// 687
         var25 = var17 = Class482.method1274(((int[])field1250.get(var1.method93()))[0]);// 924
         var25.addAll(Class482.method1274(Class337.method549(125) + 1));// 730
      } else {
         (var17 = Class482.method1274(Class337.method549(125) + 1)).addAll(Class482.method1274(((int[])field1250.get(var1.method93()))[0]));// 772 802
         var25 = var17;// 979
      }

      var25.addAll(Class482.method1274(((int[])field1250.get(var1.method93()))[1]));
      var13.method451(Opcodes.field144);// 819
      var13.method451(Opcodes.field138);// 814
      var13.method451(Opcodes.pop);// 920
      Iterator var14 = var17.iterator();// 751
      Iterator var26 = var14;

      while (var26.hasNext()) {
         Class10 var18 = (Class10)var14.next();
         var26 = var14;
         var13.method451(var18);
      }

      var13.method451(Class120.method77(Class138.field583, 0));// 828
      var13.method451(var5.method64(Class138.field593));// 896
      var13.method451(Opcodes.dup);// 813
      var13.method451(Class120.method75(Class138.field583, 0));// 611
      var13.method451(var5.method47("java.lang.String", "length", Class138.field591, Class138.field582, (short)182));// 702
      var13.method451(Opcodes.dup);// 760
      var13.method451(var5.method67(Class138.field585, (short)1));// 954
      var13.method451(Opcodes.swap);// 858
      var13.method484(new Class116(var4, 1));// 630
      var13.method451(Opcodes.isub);// 791
      var13.method451(Opcodes.dup_x2);// 815
      var13.method451(Class120.method75(Class138.field591, 1));// 747
      var13.method451(Class120.method75(Class138.field583, 3));// 746
      var13.method451(Class120.method75(Class138.field591, 7));// 882
      if (var8) {// 891
         var13.method451(Opcodes.dup_x2);// 673
         var13.method451(Opcodes.pop2);// 948
         var13.method451(Class120.method75(Class138.field591, 4));// 629
         var10000 = var13;
      } else {
         var13.method451(Opcodes.dup_x2);// 736
         var13.method451(Opcodes.pop);// 681
         var13.method451(Class120.method75(Class138.field591, 4));// 759
         var13.method451(Opcodes.pop);// 875
         var10000 = var13;// 740
      }

      var10000.method451(Opcodes.swap);
      var13.method451(Opcodes.pop);// 732
      var13.method451(Opcodes.swap);// 806
      var13.method451(Opcodes.dup);// 911
      var13.method451(Class120.method75(Class138.field591, 2));// 947
      var13.method451(Class120.method75(Class138.field591, 5));// 903
      var13.method451(Opcodes.swap);// 907
      var13.method451(Class120.method75(Class138.field583, 6));// 909
      Class90 var15 = Class120.method73((short)167, null);// 612
      var13.method439(var15);// 874
      Class246 var19 = var13.method451(Class120.method77(Class138.field583, 3));// 739
      var13.method451(Class120.method77(Class138.field591, 4));// 793
      var13.method451(Class120.method77(Class138.field583, 0));// 820
      var13.method451(Class120.method77(Class138.field591, 1));// 757
      var13.method451(Opcodes.dup_x2);// 726
      var13.method451(var5.method47("java.lang.String", "charAt", Class138.field585, new Class138[]{Class138.field591}, (short)182));// 720
      var13.method451(Class120.method77(Class138.field583, 6));// 653
      var13.method451(new Class286(1, -1));// 626
      var13.method451(Class120.method77(Class138.field591, 2));// 775
      var13.method451(var5.method47("java.lang.String", "charAt", Class138.field585, new Class138[]{Class138.field591}, (short)182));// 643
      var13.method451(Opcodes.field112);// 724
      var13.method451(Opcodes.field112);// 807
      var13.method451(Opcodes.field27);// 849
      var13.method451(Opcodes.castore);// 871
      var13.method451(Class120.method77(Class138.field591, 1));// 918
      Class90 var21 = Class120.method73((short)156, null);// 839
      var13.method439(var21);// 607
      Class90 var23 = Class120.method73((short)167, null);// 641
      var13.method439(var23);// 915
      Class246 var9 = var13.method451(Class120.method77(Class138.field583, 3));// 842
      var13.method451(Class120.method77(Class138.field591, 7));// 785
      var13.method451(Class120.method77(Class138.field583, 0));// 946
      var13.method451(Class120.method77(Class138.field591, 1));// 745
      var13.method451(Opcodes.dup_x2);// 901
      var13.method451(var5.method47("java.lang.String", "charAt", Class138.field585, new Class138[]{Class138.field591}, (short)182));// 952
      var13.method451(Class120.method77(Class138.field583, 6));// 616
      var13.method451(Class120.method77(Class138.field591, 2));// 878
      var13.method451(var5.method47("java.lang.String", "charAt", Class138.field585, new Class138[]{Class138.field591}, (short)182));// 943
      var13.method451(Opcodes.field112);// 856
      var13.method451(new Class286(2, -1));// 830
      var13.method451(Opcodes.field112);// 957
      var13.method451(Opcodes.field27);// 769
      var13.method451(new Class286(1, -1));// 922
      var13.method451(Opcodes.castore);// 718
      var13.method451(Class120.method77(Class138.field591, 2));// 711
      Class90 var10 = Class120.method73((short)156, null);// 859
      var13.method439(var10);// 636
      var13.method451(Class120.method77(Class138.field591, 5));// 926
      var13.method451(Class120.method75(Class138.field591, 2));// 880
      Class246 var11 = var13.method451(Class120.method77(Class138.field591, 1));// 951
      Class247 var20 = var13.method439(Class120.method73((short)156, var19));// 645 693
      Class246 var12 = var13.method451(var5.method58("java.lang.String"));// 794
      var13.method451(Opcodes.dup);// 831
      var13.method451(Class120.method77(Class138.field583, 3));// 762
      var13.method451(var5.method47("java.lang.String", "<init>", Class138.field586, new Class138[]{new Class145(Class138.field585, 1)}, (short)183));// 784
      var13.method451(Class120.method55(Class138.field583));// 624
      var15.method29(var20);// 931
      var21.method29(var9);// 808
      var23.method29(var12);// 648
      var10.method29(var11);// 781
      var6.method309();// 651
      var6.method276();// 983
      var1.method365(var6.method315());// 678
      var13.method107();// 809
   }// 912

   // $VF: synthetic method
   public String method851(Class206 var1) {
      if (Class580.method1932().method1864()) {// 19
         String var4;
         if ((var4 = var1.method93()).indexOf(46) > 0) {// 86 473
            return var4.substring(0, var4.lastIndexOf(46));// 131
         } else {
            String var5 = "";
            return "";// 264 289
         }
      } else if (var1.method93().startsWith(this.field1252)) {// 458
         return "SPRINGBOOT";// 591
      } else if (Class580.method1932().method1842()) {// 60
         return "GLOBAL";// 348
      } else if (!this.field1258.method558(var1)) {// 56
         return this.field1258.method561(var1);
      } else {
         String var3;
         if ((var3 = var1.method93()).indexOf(36) > 0) {// 211 416
            var3 = var3.substring(0, var3.indexOf(36));
         }

         return var3;// 427
      }
   }

   // $VF: synthetic method
   public Class428(Class338 var1) {
      this.field1251 = new Hashtable();// 239
      this.field1254 = new Hashtable();// 310
      this.field1255 = new Hashtable();// 498
      this.field1268 = new Hashtable();// 484
      this.field1269 = new Hashtable();// 409
      this.field1262 = new Hashtable();// 18
      this.field1263 = ".R";// 532
      this.field1252 = "org.springframework.boot.";// 297
      this.field1258 = var1;// 123 226
      field1266 = Class580.method1932().method1877();// 78
      field1264 = new Vector();// 418
      field1250 = new Hashtable();// 533
      Class482.method1280();// 185
      this.field1256.add("");// 406
      this.method844();// 1
   }// 46

   // $VF: synthetic method
   @Override
   public void method838() {
   }// 209

   // $VF: synthetic method
   public boolean method852(Boolean var1) {
      return var1 == null ? false : var1;// 100 202
   }

   // $VF: synthetic method
   public boolean method853() {
      return this.field1257;// 422
   }

   // $VF: synthetic method
   public void method854(Vector var1) {
      Vector var7 = var1;
      Class428 var8 = this;
      if (var1.size() != 0) {// 224
         String var2 = this.method851((Class206)var1.get(0));// 560
         int var5 = this.field1261.get(var2) == null ? 0 : ((Vector)this.field1261.get(var2)).size() / 8;// 174
         if (var5 == 0) {// 71
            var5 = 1;
         }

         if ((var5 = var1.size() / var5) == 0) {// 191 375
            var5 = 1;
         }

         Vector var3;
         Vector var4;
         Class428 var11;
         label110: {
            var4 = new Vector();// 575
            var3 = new Vector();// 547
            if (var1.size() < var5 + 1) {// 303
               if (var1.size() == 1) {// 326
                  if (this.method852((Boolean)this.field1268.get(var2))) {// 29
                     var4.add(var1.get(0));
                  }

                  if (this.method852((Boolean)this.field1269.get(var2))) {// 328
                     var11 = this;
                     var3.add(var1.get(0));
                     break label110;
                  }
               } else if (var1.size() == 2) {// 521
                  if (this.method852((Boolean)this.field1268.get(var2))) {// 457
                     var4.add(var1.get(0));
                  }

                  if (this.method852((Boolean)this.field1269.get(var2))) {// 546
                     var3.add(var1.get(0));
                  }

                  if (this.method852((Boolean)this.field1268.get(var2))) {// 341
                     var4.add(var1.get(1));
                  }

                  if (this.method852((Boolean)this.field1269.get(var2))) {// 51
                     var11 = this;
                     var3.add(var1.get(1));
                     break label110;
                  }
               } else if (var1.size() == 3) {// 598
                  if (this.method852((Boolean)this.field1268.get(var2))) {// 325
                     var4.add(var1.get(0));
                  }

                  if (this.method852((Boolean)this.field1269.get(var2))) {// 392
                     var3.add(var1.get(0));
                  }

                  if (this.method852((Boolean)this.field1268.get(var2))) {// 571
                     var4.add(var1.get(1));
                  }

                  if (this.method852((Boolean)this.field1269.get(var2))) {// 44
                     var11 = this;
                     var3.add(var1.get(2));
                     break label110;
                  }
               } else {
                  if (this.method852((Boolean)this.field1268.get(var2))) {// 476
                     var4.add(var1.get(0));
                  }

                  if (this.method852((Boolean)this.field1269.get(var2))) {// 542
                     var3.add(var1.get(1));
                  }

                  if (this.method852((Boolean)this.field1268.get(var2))) {// 231
                     var4.add(var1.get(2));
                  }

                  if (this.method852((Boolean)this.field1269.get(var2))) {// 420
                     var11 = this;
                     var3.add(var1.get(3));
                     break label110;
                  }
               }
            } else {
               int var6;
               int var12 = var6 = 0;

               while (var12 < var7.size()) {
                  int var13;
                  if (var8.method852((Boolean)var8.field1268.get(var2))) {// 126
                     var13 = var6;
                     var4.add(var7.get(var6));
                  } else {
                     if (var8.method852((Boolean)var8.field1269.get(var2))) {// 324
                        var3.add(var7.get(var6));
                     }

                     var13 = var6;// 519
                  }

                  if ((var6 = var13 + var5) >= var7.size()) {// 376
                     var11 = var8;
                     break label110;
                  }

                  int var14;
                  if (var8.method852((Boolean)var8.field1269.get(var2))) {// 492
                     var14 = var6;
                     var3.add(var7.get(var6));
                  } else {
                     if (var8.method852((Boolean)var8.field1268.get(var2))) {// 482
                        var4.add(var7.get(var6));
                     }

                     var14 = var6;// 62
                  }

                  var12 = var6 = var14 + var5;
               }
            }

            var11 = var8;// 155
         }

         var11.field1254.put(var2, var4);
         var8.field1255.put(var2, var3);// 2
      }
   }// 505

   // $VF: synthetic method
   public String method855(String var1, String var2) {
      char[] var3 = new char[var1.length()];// 254
      char var4 = (char)((int[])this.field1262.get(var2))[0];// 594
      char var8 = (char)((int[])this.field1262.get(var2))[1];// 539

      for (int var10000 = var6 = var3.length - 1; var10000 >= 0; var10000 = var6) {// 388
         int var10001 = var6;
         char var10002 = (char)(var1.charAt(var6) ^ var4);
         var6--;// 487
         var3[var10001] = var10002;// 120
         if (var6 < 0) {// 479
            break;
         }

         var10001 = var6;
         var10002 = (char)(var1.charAt(var6) ^ var8);
         var6--;
         var3[var10001] = var10002;// 347
      }

      return new String(var3);// 42
   }

   // $VF: synthetic method
   public static String method856(String var0, String var1, String var2, String var3) {
      String var11 = var0;
      boolean var4 = ((int[])field1250.get(var3))[2] == 0;// 569
      String var13 = var4 ? var1 + var2 : var2 + var1;// 445
      int var10 = var13.length() - 1;// 425
      int var9 = var13.length() - 1;// 327
      char[] var5 = new char[var0.length()];// 383
      char var6 = (char)((int[])field1250.get(var3))[0];// 197
      char var12 = (char)((int[])field1250.get(var3))[1];// 140

      int var7;
      for (int var15 = var7 = var5.length - 1; var15 >= 0; var15 = --var7) {// 451
         int var10001 = var7;
         char var10002 = (char)(var11.charAt(var7) ^ var6 ^ var13.charAt(var9));
         var7--;// 565
         var5[var10001] = var10002;// 49
         if (var7 < 0) {// 173
            break;
         }

         var10002 = (char)(var11.charAt(var7) ^ var12 ^ var13.charAt(var9));
         var9--;// 101
         var5[var7] = var10002;// 448
         if (var9 < 0) {// 489
            var9 = var10;
         }
      }

      return new String(var5);// 244
   }

   // $VF: synthetic method
   public boolean method857(Class206 var1) {
      return Class580.method1932().method1864()// 356
         ? !var1.method163()// 522
            && !var1.method244()
            && !var1.method161()
            && !var1.method101()
            && !var1.method237()
            && !var1.method93().contains("$")
            && !var1.method93().endsWith(this.field1263)
         : var1.method252()// 41
            && !var1.method244()
            && !var1.method161()
            && !var1.method101()
            && !var1.method237()
            && !var1.method93().contains("$")
            && !var1.method93().endsWith(this.field1263);
   }

   // $VF: synthetic method
   @Override
   public void method839(Class206 var1) {
      Class206 var22 = var1;
      Class428 var23 = this;
      boolean var20 = false;// 58
      Iterator var16 = this.field1261.values().iterator();// 190

      boolean var34;
      while (true) {
         if (var16.hasNext()) {
            if (!((Vector)var16.next()).contains(var22)) {// 315
               continue;
            }

            var34 = var20 = true;// 465
            break;// 132
         }

         var34 = var20;// 534
         break;
      }

      if (var34) {
         Class120 var29 = new Class120(var22);// 495
         byte var4 = 2;
         String[] var33 = new String[2];// 493 561
         int var5;
         if (((Vector)this.field1254.get(this.method851(var22))).size() > 0) {// 377
            for (int var35 = var5 = 0; var35 < var4; var35 = var5) {// 604
               int var10001 = var5;
               String var10002 = ((Class206)((Vector)var23.field1254.get(var23.method851(var22)))
                     .get(Class337.method549(((Vector)var23.field1254.get(var23.method851(var22))).size())))
                  .method93();
               var5++;
               var33[var10001] = var10002;// 22
            }
         }

         var5 = 0;// 6
         String[] var6 = new String[var4];// 461
         int var7;
         if (((Vector)var23.field1255.get(var23.method851(var22))).size() > 0) {// 358
            for (int var36 = var7 = 0; var36 < var4; var36 = var7) {// 192
               int var41 = var7;
               String var42 = ((Class206)((Vector)var23.field1255.get(var23.method851(var22)))
                     .get(Class337.method549(((Vector)var23.field1255.get(var23.method851(var22))).size())))
                  .method93();
               var7++;
               var6[var41] = var42;// 574
            }
         }

         var7 = 0;// 272
         String var8 = "com.allatori";// 179
         String var9 = "org.apache.bcel";// 146
         Class208[] var10;
         int var11 = (var10 = var22.method341()).length;

         int var12;
         for (var34 = var12 = 0; var34 < var11; var34 = ++var12) {// 400
            Class208 var13;
            if ((var13 = var10[var12]).method369() != null) {// 33
               Class246 var3;
               Class203 var14;
               Class251 var15;
               Class246 var38 = var3 = (var15 = (var14 = Class376.method716(var13, var22.method93(), var22.method46(), var22.method46().method402()))// 0
                     .method42())// 240
                  .method32();// 246

               while (var38 != null) {// 552
                  label155: {
                     if (!field1260 && var3.method18() instanceof Class262) {// 603
                        Class262 var30 = (Class262)var3.method18();// 278
                        if (field1249.equals(var30.method518(var22.method46()))) {// 466
                           Logger.warning("javac Java compiler should be run with -XDstringConcat=inline flag to encrypt all strings.");// 467
                           field1260 = true;// 485
                        }
                     } else if (var3.method18() instanceof ldc) {// 59
                        ldc var17 = (ldc)var3.method18();// 391
                        Class178 var18;
                        if ((var18 = var22.method46().method174(var17.method2())) instanceof Class185) {// 330 589
                           String var31 = ((Class191)var22.method46().method174(((Class185)var18).method2())).method20();// 579
                           if (var23.field1258.method557(var31) != null || var23.field1256.contains(var31) || Class482.method1277(var31)) {// 555
                              var38 = var3 = var3.method32();// 73
                              continue;// 415
                           }

                           int var19;
                           label106: {
                              var19 = Class580.method1932().method1849(var23.field1258, var22, var14);// 87
                              String var2;
                              if ((var2 = var22.method93()).startsWith(var8)) {// 399 586
                                 if (var2.startsWith("com.allatori.obfuscate.opt")) {// 232
                                    Class580.method1932();
                                    var19 = 0;
                                 }

                                 if (var2.startsWith("com.allatori.obfuscate.ren")) {// 463
                                    Class580.method1932();
                                    var19 = 0;
                                 }

                                 if (var2.startsWith("com.allatori.io.re")) {// 198
                                    Class580.method1932();
                                    var19 = 0;
                                    var34 = var19;
                                    break label106;
                                 }
                              } else if (var2.startsWith(var9)) {// 424
                                 Class580.method1932();// 28
                                 var19 = 0;
                              }

                              var34 = var19;// 412
                           }

                           Class580.method1932();
                           if (var34 == 1) {
                              String var24 = var6[var7];// 38
                              var17.method6(var22.method46().method409(field1267 + var24 + field1267 + var31));// 257
                              String var10004 = field1265;
                              Class144 var10005 = Class138.field593;
                              Class138[] var10006 = new Class138[]{field1253};
                              var7++;
                              var15.method480(var3, var29.method47(var24, var10004, var10005, var10006, (short)184));// 269
                              if (var7 >= var4) {// 148
                                 var7 = 0;
                              }

                              if (!field1264.contains(var22)) {// 236
                                 field1264.add(var22);// 142
                              }
                           } else {
                              Class580.method1932();
                              if (var19 >= 1000) {// 39
                                 String var26;
                                 if ((var26 = Class467.method1051(var31, var19, var23.field1258.method559())).startsWith(Class467.field1527)// 99 368
                                    && !field1264.contains(var22)) {
                                    field1264.add(var22);// 160
                                 }

                                 var17.method6(var22.method46().method409(var26));// 40
                                 var40 = var3;
                                 var15.method480(var3, Class467.method1052(var29, var19));// 63
                                 break label155;// 541
                              }

                              String var25 = var33[var5];// 550
                              var17.method6(var22.method46().method409(var23.method855(var31, var25)));// 510
                              String var43 = field1259;
                              Class144 var44 = Class138.field593;
                              Class138[] var45 = new Class138[]{field1253};
                              var5++;
                              var15.method480(var3, var29.method47(var25, var43, var44, var45, (short)184));// 456
                              if (var5 >= var4) {// 82
                                 var5 = 0;
                              }
                           }
                        }
                     }

                     var40 = var3;// 450
                  }

                  var38 = var3 = var40.method32();
               }

               var14.method309();// 470

               try {
                  var22.method360(var13, var14.method315());// 157
               } catch (Exception var21) {// 24
                  Logger.error("Error processing " + var22.method93() + "." + var14.method20() + " " + var21.getMessage());// 286
               }
            }
         }
      }
   }// 27

   // $VF: synthetic method
   public void method844() {
      Class428 var2 = this;
      Iterator var5 = this.field1258.method553();// 21

      label135:
      while (true) {
         for (Iterator var10000 = var5; var10000.hasNext(); var10000 = var5) {
            Class206 var7 = (Class206)var5.next();// 115
            if (!Class580.method1924().method2043(var2.field1258, var7)) {// 223
               int var4;
               int var24 = var4 = Class580.method1932().method1856(var2.field1258, var7);// 45
               Class580.method1932();// 23
               if (var24 == 1) {
                  Class482.method1282(var7, var2.field1256);// 440
               } else {
                  Class580.method1932();
                  if (var4 == 2) {// 248
                     Class482.method1272(var7);// 97
                  } else {
                     Class580.method1932();
                     if (var4 == 3) {// 411
                        Class482.method1272(var7);// 468
                        Class482.method1278(var7);// 138
                     }
                  }
               }

               boolean var3 = false;// 119
               if (var2.method859(var7)) {// 32
                  Vector var1;
                  if ((var1 = (Vector)var2.field1261.get(var2.method851(var7))) == null) {// 238 423
                     var1 = new Vector();// 61
                     var2.field1261.put(var2.method851(var7), var1);// 525
                     if (var2.field1251.get(var2.method851(var7)) == null) {// 220
                        Vector var6 = new Vector();// 593
                        if (var2.field1258.method558(var7) && !var7.method244() && !var7.method101()) {// 336
                           var6.add(var7);// 540
                           var3 = true;// 291
                        }

                        var2.field1251.put(var2.method851(var7), var6);// 169
                     }
                  }

                  if (!var2.field1258.method558(var7) || !var7.method244() && !var7.method101()) {// 137
                     var1.add(var7);// 50
                  }
               }

               if (!var3 && var2.method857(var7)) {// 135
                  Vector var11;
                  if ((var11 = (Vector)var2.field1251.get(var2.method851(var7))) == null) {// 443 474
                     var11 = new Vector();// 166
                     var2.field1251.put(var2.method851(var7), var11);// 434
                  }

                  var11.add(var7);// 373
               }
               continue label135;
            }
         }

         Iterator var25 = var5 = var2.field1251.values().iterator();// 66

         while (var25.hasNext()) {
            Vector var8 = (Vector)var5.next();
            var25 = var5;
            var2.method858(var8);// 536
         }

         Vector var23 = new Vector();// 218
         Iterator var9 = var2.field1251.values().iterator();// 109

         while (var9.hasNext()) {
            Vector var20;
            if ((var20 = (Vector)var9.next()).size() > var23.size()) {// 213
               var23 = var20;// 15
            }
         }

         if (var23.size() == 0) {// 385
            var2.field1257 = false;// 471
            return;// 270
         }

         String var10 = var2.method851((Class206)var23.get(0));// 177
         HashSet var21;
         (var21 = new HashSet()).addAll(var2.field1251.keySet());// 235 280

         for (String var12 : var21) {// 370
            if (((Vector)var2.field1251.get(var12)).size() == 0) {// 516
               if (var2.method852((Boolean)var2.field1268.get(var12))) {// 95
                  var2.field1268.put(var10, true);
               }

               if (var2.method852((Boolean)var2.field1269.get(var12))) {// 227
                  var2.field1269.put(var10, true);
               }
            }
         }

         Iterator var17;
         var25 = var17 = var2.field1251.values().iterator();// 129

         while (var25.hasNext()) {
            Vector var13 = (Vector)var17.next();
            var25 = var17;
            var2.method854(var13);// 258
         }

         var21.clear();
         var21.addAll(var2.field1254.keySet());// 110 437
         var21.addAll(var2.field1255.keySet());// 221
         var17 = var21.iterator();// 444

         for (Iterator var27 = var17; var27.hasNext(); var27 = var17) {
            String var14 = (String)var17.next();
            var2.method849((Vector)var2.field1254.get(var14), (Vector)var2.field1255.get(var14));// 601
         }

         var21.clear();
         var21.addAll(var2.field1251.keySet());// 251 486

         for (String var15 : var21) {// 117
            if (((Vector)var2.field1251.get(var15)).size() == 0) {// 300
               var2.field1251.put(var15, var23);// 245
               var2.field1254.put(var15, var2.field1254.get(var10));// 296
               var2.field1255.put(var15, var2.field1255.get(var10));// 404
            }
         }

         return;// 401
      }
   }

   // $VF: synthetic method
   public void method858(Vector var1) {
      Vector var15 = var1;
      if (var1.size() != 0) {// 312
         String var6;
         if ((var6 = Class580.method1932().method1847()).length() > 0) {// 274 558
            String[] var4 = var6.split(";");// 501

            int var3;
            for (int var29 = var3 = var1.size() - 1; var29 >= 0; var29 = --var3) {// 337
               Class206 var5 = (Class206)var15.get(var3);// 208

               int var2;
               for (int var30 = var2 = var4.length - 1; var30 >= 0; var30 = --var2) {// 168
                  if (var4[var2].length() > 0 && !var5.method93().startsWith(var4[var2])) {// 237
                     var15.removeElement(var5);// 133
                  }
               }
            }
         }

         String var21;
         if ((var21 = Class580.method1932().method1879()).length() > 0) {// 80 283
            String[] var19 = var21.split(";");// 544

            int var23;
            for (int var31 = var23 = var15.size() - 1; var31 >= 0; var31 = --var23) {// 114
               Class206 var17 = (Class206)var15.get(var23);// 460

               for (int var32 = var25 = var19.length - 1; var32 >= 0; var32 = --var25) {// 102
                  if (var19[var25].length() > 0 && var17.method93().startsWith(var19[var25])) {// 105
                     var15.removeElement(var17);// 183
                  }
               }
            }
         }

         Class206 var20 = null;// 249
         Class206 var24 = null;// 349
         Class206 var18 = null;// 196
         var6 = "<clinit>";// 554
         var21 = "()V";// 429
         String var7 = "java.";// 89
         int var8;
         int var33 = var8 = var15.size() - 1;

         while (true) {
            if (var33 < 0) {
               var36 = var15;// 228
               break;
            }

            if (var15.size() == 1) {// 318
               var36 = var15;
               break;
            }

            Class206 var9 = (Class206)var15.get(var8);// 88
            boolean var10 = true;// 306
            if (var9.method358(var6, var21) != null) {// 8
               var10 = false;// 331
            }

            boolean var11 = true;// 130
            boolean var34;
            if (!var9.method190().startsWith(var7)) {// 301
               var11 = false;// 602
               var34 = var10;
            } else {
               String[] var12;
               int var13 = (var12 = var9.method130()).length;
               int var14;
               var34 = var14 = 0;

               while (true) {
                  if (var34 >= var13) {
                     var34 = var10;// 182
                     break;
                  }

                  if (!var12[var14].startsWith(var7)) {// 35
                     var11 = false;// 233
                     var34 = var10;
                     break;// 271
                  }

                  var34 = ++var14;// 509
               }
            }

            if (var34 && var20 == null) {
               var20 = var9;
            }

            if (var11 && var24 == null) {// 4
               var24 = var9;
            }

            if (var10 && var11 && var18 == null) {// 122
               var18 = var9;
            }

            if (!var10 || !var11) {// 305
               var15.remove(var9);
            }

            var33 = --var8;// 599
         }

         label95: {
            if (var36.size() == 1) {
               if (var18 != null) {// 334
                  var37 = this;
                  var15.clear();
                  var15.add(var18);// 13 219
                  break label95;// 333
               }

               if (var24 != null) {
                  var37 = this;
                  var15.clear();
                  var15.add(var24);// 255 284
                  break label95;// 234
               }

               if (var20 != null) {
                  var15.clear();
                  var15.add(var20);// 508 517
               }
            }

            var37 = this;// 431
         }

         Class206 var27;
         if ((var27 = var37.field1258.method557("com.allatori.ant.ObfuscatorTask")) != null) {// 563
            var15.removeElement(var27);
         }

         Class206 var28;
         if ((var28 = this.field1258.method557("com.allatori.wtk.WTKObfuscator")) != null) {// 14 514
            var15.removeElement(var28);
         }
      }
   }// 361

   // $VF: synthetic method
   public boolean method859(Class206 var1) {
      Class428 var2 = this;
      int var10000 = Class580.method1932().method1856(this.field1258, var1);// 316
      Class580.method1932();
      if (var10000 == 0) {
         return false;
      } else {
         String var11 = this.method851(var1);// 207
         boolean var10 = false;// 275
         String var4 = "com.allatori";// 355
         String var5 = "org.apache.bcel";// 496
         Class208[] var6;
         int var7 = (var6 = var1.method341()).length;

         int var8;
         for (var10000 = var8 = 0; var10000 < var7; var10000 = ++var8) {// 215
            Class208 var9;
            if ((var9 = var6[var8]).method369() != null) {// 511
               Class246 var3;
               Class203 var18;
               Class246 var20 = var3 = (var18 = Class376.method716(var9, var1.method93(), var1.method46(), var1.method46().method402())).method42().method32();// 210 382 576

               while (var20 != null) {// 103
                  if (var3.method18() instanceof ldc) {// 548
                     ldc var13 = (ldc)var3.method18();// 545
                     Class178 var14;
                     if ((var14 = var1.method46().method174(var13.method2())) instanceof Class185) {// 523 570
                        String var15 = ((Class191)var1.method46().method174(((Class185)var14).method2())).method20();// 162
                        if (var2.field1258.method557(var15) != null || var2.field1256.contains(var15) || Class482.method1277(var15)) {// 282
                           var20 = var3 = var3.method32();// 503
                           continue;// 339
                        }

                        label58: {
                           int var16 = Class580.method1932().method1849(var2.field1258, var1, var18);// 549
                           String var12;
                           if ((var12 = var1.method93()).startsWith(var4)) {// 76 499
                              if (var12.startsWith("com.allatori.obfuscate.opt")) {// 145
                                 Class580.method1932();
                                 var16 = 0;
                              }

                              if (var12.startsWith("com.allatori.obfuscate.ren")) {// 390
                                 Class580.method1932();
                                 var16 = 0;
                              }

                              if (var12.startsWith("com.allatori.io.re")) {// 573
                                 Class580.method1932();
                                 byte var17 = 0;
                                 var10000 = var17;
                                 break label58;
                              }
                           } else if (var12.startsWith(var5)) {// 520
                              Class580.method1932();// 502
                              var16 = 0;
                           }

                           var10000 = var16;// 564
                        }

                        Class580.method1932();
                        if (var10000 == 1) {
                           var10 = true;// 48
                           var2.field1269.put(var11, true);// 281
                           if (var2.method852((Boolean)var2.field1268.get(var11))) {// 438
                              return true;
                           }
                        } else {
                           var10 = true;// 483
                           var2.field1268.put(var11, true);// 181
                           if (var2.method852((Boolean)var2.field1269.get(var11))) {// 433
                              return true;
                           }
                        }
                     }
                  }

                  var20 = var3 = var3.method32();// 478
               }
            }
         }

         return var10;// 366
      }
   }
}
