package mapped;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeSet;

// $VF: Compiled from rj
public class Class205 extends Class196 implements Cloneable, Class123, Comparable {
   // $VF: synthetic field
   public String field728;
   // $VF: synthetic field
   public boolean field729;
   // $VF: synthetic field
   public int[] field730;
   // $VF: synthetic field
   public int field731;
   // $VF: synthetic field
   public int field732;
   // $VF: synthetic field
   public static char field733 = '/';
   // $VF: synthetic field
   public Class207[] field734;
   // $VF: synthetic field
   public String field735;
   // $VF: synthetic field
   public static final byte field736 = 1;
   // $VF: synthetic field
   public static boolean field737 = false;
   // $VF: synthetic field
   public int field738;
   // $VF: synthetic field
   public Class208[] field739;
   // $VF: synthetic field
   public transient Class248 field740;
   // $VF: synthetic field
   public Class128[] field741;
   // $VF: synthetic field
   public String field742;
   // $VF: synthetic field
   public String field743;
   // $VF: synthetic field
   public String[] field744;
   // $VF: synthetic field
   public Class151[] field745;
   // $VF: synthetic field
   public String field746;
   // $VF: synthetic field
   public static final byte field747 = 2;
   // $VF: synthetic field
   public byte field748;
   // $VF: synthetic field
   public int field749;
   // $VF: synthetic field
   public boolean field750;
   // $VF: synthetic field
   public static final byte field751 = 3;
   // $VF: synthetic field
   public Class149 field752;
   // $VF: synthetic field
   public boolean field753;
   // $VF: synthetic field
   public boolean field754;
   // $VF: synthetic field
   public static Class399 field755 = new Class404();

   // $VF: synthetic method
   public int compareTo(Object var1) {
      return this.method93().compareTo(((Class205)var1).method93());// 749
   }

   // $VF: synthetic method
   public final boolean method329() {
      return (this.field755 & 512) == 0;// 851
   }

   // $VF: synthetic method
   public void method330(String var1) {
      this.field743 = var1;// 195
   }// 490

   // $VF: synthetic method
   public void method331(OutputStream var1) {
      this.method3(new DataOutputStream(var1));// 365
   }// 366

   // $VF: synthetic method
   public static Class399 method224() {
      return field755;// 827
   }

   // $VF: synthetic method
   public void method332(int var1) {
      this.field738 = var1;// 489
   }// 562

   // $VF: synthetic method
   public Class205 method333() {
      return "java.lang.Object".equals(this.method93()) ? null : this.field740.method443(this.method20());// 624 648 931
   }

   // $VF: synthetic method
   public final boolean method334() {
      return (this.field755 & 32) != 0;// 822
   }

   // $VF: synthetic method
   public void method91(int var1) {
      this.field731 = var1;// 43
   }// 535

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1005(this);// 235
   }// 280

   // $VF: synthetic method
   public void method335(String var1) {
      this.method347(new File(var1));// 545
   }// 570

   // $VF: synthetic method
   public void method288(String var1) {
      this.field735 = var1;// 203
   }// 70

   // $VF: synthetic method
   public Class205[] method336() {
      Class259 var6 = new Class259();// 803
      TreeSet var2 = new TreeSet();// 620
      var6.method389(this);// 799

      while (!var6.method101()) {// 876
         Class205 var3;
         Class205 var10000 = var3 = var6.method136();// 964
         Class205 var4 = var10000.method333();// 886
         Class205[] var5 = var10000.method344();// 704
         if (var10000.method101()) {// 887
            var2.add(var3);// 884
         } else if (var4 != null) {// 825
            var6.method389(var4);// 872
         }

         for (int var8 = var7 = 0; var8 < var5.length; var8 = var7) {// 723
            var6.method389(var5[var7++]);// 615
         }
      }

      return (Class205[])var2.toArray(new Class205[var2.size()]);// 981
   }

   // $VF: synthetic method
   public Class248 method337() {
      return this.field740;// 806
   }

   // $VF: synthetic method
   public void method338(Class207[] var1) {
      this.field734 = var1;// 430
   }// 442

   // $VF: synthetic method
   public Class151[] method200() {
      return this.field745;// 318
   }

   // $VF: synthetic method
   public String method339() {
      return this.field743;// 44
   }

   // $VF: synthetic method
   public int method199() {
      return this.field749;// 167
   }

   // $VF: synthetic method
   public static final String method340(Object var0) {
      StringTokenizer var1 = new StringTokenizer(var0.toString(), "\n");// 682
      var0 = new StringBuffer();// 816
      StringTokenizer var10000 = var1;// 974

      while (var10000.hasMoreTokens()) {
         StringBuffer var10001 = var0.append("\t");// 755
         var10000 = var1;
         var10001.append(var1.nextToken()).append("\n");
      }

      return var0.toString();// 649
   }

   // $VF: synthetic method
   public void method322(String[] var1) {
      this.field744 = var1;// 587
   }// 304

   // $VF: synthetic method
   public Class208[] method341() {
      return this.field739;// 572
   }

   static {
      field737 = Boolean.getBoolean("JavaClass.debug");// 462
      String var0;
      if ((var0 = System.getProperty("file.separator")) != null) {// 187 452
         try {
            field733 = var0.charAt(0);// 254
            return;// 539
         } catch (StringIndexOutOfBoundsException var1) {
         }
      }
   }// 120

   // $VF: synthetic method
   public int method92() {
      return this.field738;// 361
   }

   // $VF: synthetic method
   public final boolean method342() {
      this.method19();// 802
      return this.field754;// 772
   }

   // $VF: synthetic method
   public Class205(
      int var1, int var2, String var3, int var4, int var5, int var6, Class149 var7, int[] var8, Class207[] var9, Class208[] var10, Class151[] var11, byte var12
   ) {
      Class205 var18 = this;
      super();
      this.field735 = "<Unknown>";// 533
      this.field748 = 1;// 534
      this.field750 = false;// 488
      this.field754 = false;// 495
      this.field753 = false;// 159
      this.field729 = true;// 455 461
      this.field740 = Class250.method445();// 59
      if (var8 == null) {// 148
         var8 = new int[0];// 236
      }

      if (var11 == null) {// 39
         var11 = new Class151[0];// 368
      }

      if (var9 == null) {// 160
         var9 = new Class207[0];// 40
      }

      if (var10 == null) {// 541
         var10 = new Class208[0];// 550
      }

      this.field738 = var1;
      this.field749 = var2;// 367
      this.field743 = var3;// 82
      this.field731 = var4;// 83
      this.field732 = var5;// 5
      this.field755 = var6;// 279
      this.field752 = var7;// 450
      this.field730 = var8;// 386
      this.field734 = var9;// 470
      this.field739 = var10;// 149
      this.field745 = var11;// 157
      this.field729 = true;// 24
      this.field748 = var12;// 286 456
      int var14;
      int var19 = var14 = 0;

      while (true) {
         if (var19 >= var11.length) {
            var20 = this;// 31
            break;
         }

         if (var11[var14] instanceof Class169) {// 27
            this.field735 = ((Class169)var11[var14]).method93();// 242
            var20 = this;
            break;// 94
         }

         var19 = ++var14;// 108
      }

      var20.field746 = var7.method176(var1, (byte)7);
      this.field746 = Class523.method1504(this.field746, false);// 21
      int var15;
      if ((var15 = this.field746.lastIndexOf(46)) < 0) {// 115
         this.field728 = "";// 45 223
         var19 = var2;
      } else {
         this.field728 = this.field746.substring(0, var15);// 440
         var19 = var2;// 97
      }

      Class205 var22;
      if (var19 > 0) {
         var22 = this;// 468
         this.field742 = var7.method176(var2, (byte)7);
         this.field742 = Class523.method1504(this.field742, false);// 285
      } else {
         var22 = this;// 32
         this.field742 = "java.lang.Object";
      }

      var22.field744 = new String[var8.length];// 423

      for (int var23 = var1 = 0; var23 < var8.length; var23 = var1) {// 61
         String var17 = var7.method176(var8[var1], (byte)7);// 525
         String[] var24 = var18.field744;// 220
         int var10001 = var1;
         String var10002 = Class523.method1504(var17, false);
         var1++;
         var24[var10001] = var10002;
      }
   }// 336

   // $VF: synthetic method
   public int method84() {
      return this.field732;// 152
   }

   // $VF: synthetic method
   public void method96(Class149 var1) {
      this.field752 = var1;// 9
   }// 243

   // $VF: synthetic method
   public Class205(
      int var1, int var2, String var3, int var4, int var5, int var6, Class149 var7, int[] var8, Class207[] var9, Class208[] var10, Class151[] var11
   ) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, (byte)1);// 66
   }// 307

   // $VF: synthetic method
   public void method82(int[] var1) {
      this.field730 = var1;// 267
   }// 393

   // $VF: synthetic method
   public String method343() {
      return this.field728;// 524
   }

   // $VF: synthetic method
   public Class205[] method344() {
      Class205 var3 = this;
      String[] var1;
      Class205[] var2 = new Class205[(var1 = this.method130()).length];// 614 725

      for (int var10000 = var4 = 0; var10000 < var1.length; var10000 = var4) {// 978
         int var10001 = var4;
         Class205 var10002 = var3.field740.method443(var1[var4]);
         var4++;
         var2[var10001] = var10002;// 700
      }

      return var2;// 941
   }

   // $VF: synthetic method
   public void method298(String var1) {
      this.field746 = var1;// 197
   }// 140

   // $VF: synthetic method
   public boolean method345(Class205 var1) {
      this = var1;
      if (!var1.method101()) {// 856
         throw new IllegalArgumentException(new StringBuilder().insert(0, var1.method93()).append(" is no interface").toString());// 830
      } else if (this.equals(var1)) {// 769
         return true;// 922
      } else {
         Class205[] var2 = this.method336();// 971

         int var3;
         for (int var6 = var3 = 0; var6 < var2.length; var6 = ++var3) {// 711
            if (var2[var3].equals(this)) {// 859
               return true;// 636
            }
         }

         return false;// 857
      }
   }

   // $VF: synthetic method
   public String method190() {
      return this.field735;// 480
   }

   // $VF: synthetic method
   public Class207[] method346() {
      return this.field734;// 457
   }

   // $VF: synthetic method
   public boolean equals(Object var1) {
      return field755.method748(this, var1);// 935
   }

   // $VF: synthetic method
   public void method85(int var1) {
      this.field749 = var1;// 847
   }// 958

   // $VF: synthetic method
   public int method30() {
      return this.field731;// 473
   }

   // $VF: synthetic method
   public String[] method130() {
      return this.field744;// 62
   }

   // $VF: synthetic method
   public int[] method41() {
      return this.field730;// 67
   }

   // $VF: synthetic method
   public void method3(DataOutputStream var1) {
      DataOutputStream var3 = var1;
      Class205 var4 = this;
      var1.writeInt(-889275714);
      var1.writeShort(this.field732);// 91
      var1.writeShort(this.field731);// 360
      this.field752.method3(var1);// 312
      var1.writeShort(this.field755);// 340
      var1.writeShort(this.field738);// 274
      var1.writeShort(this.field749);// 558
      var1.writeShort(this.field730.length);// 501 551

      int var2;
      for (int var8 = var2 = 0; var8 < var4.field730.length; var8 = var2) {// 337
         var3.writeShort(var4.field730[var2++]);// 208
      }

      var3.writeShort(var4.field734.length);// 237

      for (int var9 = var2 = 0; var9 < var4.field734.length; var9 = var2) {// 133
         var4.field734[var2++].method3(var3);// 65
      }

      var3.writeShort(var4.field739.length);// 80

      for (int var10 = var2 = 0; var10 < var4.field739.length; var10 = var2) {// 283
         var4.field739[var2++].method3(var3);// 544
      }

      if (var4.field745 != null) {// 460
         var3.writeShort(var4.field745.length);// 102

         for (int var11 = var2 = 0; var11 < var4.field745.length; var11 = var2) {// 105
            var4.field745[var2++].method3(var3);// 183
         }
      } else {
         var3.writeShort(0);// 469
      }

      var3.flush();// 349
   }// 196

   // $VF: synthetic method
   public final byte method142() {
      return this.field748;// 629
   }

   // $VF: synthetic method
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public byte[] method207() {
      Class205 var3 = this;
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();// 596
      DataOutputStream var2 = new DataOutputStream(var1);// 549

      label89: {
         try {
            try {
               var3.method3(var2);// 76
               break label89;
            } catch (IOException var12) {// 145
               var12.printStackTrace();// 390
            }
         } catch (Throwable var13) {
            try {
               var2.close();// 502
            } catch (IOException var9) {
               var9.printStackTrace();// 172
               throw var13;// 48 188
            }

            throw var13;
         }

         try {
            var2.close();
         } catch (IOException var10) {
            var10.printStackTrace();
            return var1.toByteArray();// 281
         }

         return var1.toByteArray();
      }

      try {
         var2.close();
      } catch (IOException var11) {
         var11.printStackTrace();
         return var1.toByteArray();
      }

      return var1.toByteArray();
   }

   // $VF: synthetic method
   public final void method19() {
      Class205 var3 = this;
      if (!this.field753) {// 814
         int var1;
         for (int var10000 = var1 = 0; var10000 < var3.field745.length; var10000 = ++var1) {// 920
            if (var3.field745[var1] instanceof Class162) {// 751
               Class211[] var2 = ((Class162)var3.field745[var1]).method196();// 800

               for (int var6 = var5 = 0; var6 < var2.length; var6 = ++var5) {// 828
                  boolean var4 = false;// 896
                  if (Class523.method1510(var3.field752.method176(var2[var5].method84(), (byte)7)).equals(var3.method93())) {// 669 702 813
                     var4 = true;// 760
                  }

                  if (var4) {// 954
                     var3.field754 = true;// 824
                     if (var2[var5].method17() == 0) {// 858
                        var3.field750 = true;// 928
                     }
                  }
               }
            }
         }

         var3.field753 = true;// 747
      }
   }// 746

   // $VF: synthetic method
   public void method347(File var1) {
      Class205 var3 = this;
      String var2;
      if ((var2 = var1.getParent()) != null) {// 117 300
         new File(var2).mkdirs();// 245 296
      }

      DataOutputStream var7 = null;// 417

      try {
         var7 = new DataOutputStream(new FileOutputStream(var1));// 401
         var3.method3(var7);// 394
      } finally {
         if (var7 != null) {// 316
            var7.close();// 207
         }
      }
   }// 275

   // $VF: synthetic method
   public Class205 method136() {
      Class205 var1 = this;
      this = null;// 933

      try {
         this = (Class205)var1.clone();// 744
         this.field752 = var1.field752.method94();
         this.field730 = (int[])var1.field730.clone();// 655 771
         this.field744 = (String[])var1.field744.clone();// 863
         this.field734 = new Class207[var1.field734.length];// 864

         int var2;
         for (int var10000 = var2 = 0; var10000 < var1.field734.length; var10000 = var2) {// 647
            Class207[] var7 = this.field734;// 950
            int var10001 = var2;
            Class207 var10002 = var1.field734[var2].method368(this.field752);
            var2++;
            var7[var10001] = var10002;
         }

         this.field739 = new Class208[var1.field739.length];// 727

         for (int var8 = var2 = 0; var8 < var1.field739.length; var8 = var2) {// 750
            Class208[] var9 = this.field739;// 853
            int var11 = var2;
            Class208 var13 = var1.field739[var2].method371(this.field752);
            var2++;
            var9[var11] = var13;
         }

         this.field745 = new Class151[var1.field745.length];// 796
         var2 = 0;// 782

         while (var2 < var1.field745.length) {
            Class151[] var10 = this.field745;// 870
            int var12 = var2;
            Class151 var14 = var1.field745[var2].method181(this.field752);
            var2++;
            var10[var12] = var14;
         }
      } catch (CloneNotSupportedException var3) {// 676
      }

      return this;// 956
   }

   // $VF: synthetic method
   public String method93() {
      return this.field746;// 13
   }

   // $VF: synthetic method
   public void method348(Class248 var1) {
      this.field740 = var1;// 962
   }// 612

   // $VF: synthetic method
   public Class208 method349(Method var1) {
      Class205 var3 = this;

      int var2;
      for (int var10000 = var2 = 0; var10000 < var3.field739.length; var10000 = ++var2) {// 262
         Class208 var4 = var3.field739[var2];// 475
         if (var1.getName().equals(var4.method190()) && var1.getModifiers() == var4.method2() && Class138.method149(var1).equals(var4.method20())) {// 100
            return var4;// 250
         }
      }

      return null;// 199
   }

   // $VF: synthetic method
   public Class149 method94() {
      return this.field752;// 375
   }

   // $VF: synthetic method
   public void method350(Class208[] var1) {
      this.field739 = var1;// 526
   }// 136

   // $VF: synthetic method
   public static final void method302(String var0) {
      if (field737) {// 77
         System.out.println(var0);// 288
      }
   }// 258

   // $VF: synthetic method
   public Class205[] method351() {
      ArrayList var2 = new ArrayList();// 797

      for (Class205 var10000 = this = this.method333(); var10000 != null; var10000 = this) {// 776
         var2.add(this);// 714
         this = this.method333();// 674
      }

      return (Class205[])var2.toArray(new Class205[var2.size()]);// 965
   }

   // $VF: synthetic method
   public static void method221(Class399 var0) {
      field755 = var0;// 644
   }// 953

   // $VF: synthetic method
   public final boolean method352(Class205 var1) {
      this = var1;
      if (this.equals(var1)) {// 775
         return true;// 643
      } else {
         Class205[] var2 = this.method351();// 807

         int var3;
         for (int var6 = var3 = 0; var6 < var2.length; var6 = ++var3) {// 849
            if (var2[var3].equals(this)) {// 871
               return true;// 683
            }
         }

         return this.method101() ? this.method345(this) : false;// 607 641 842
      }
   }

   // $VF: synthetic method
   public void method89(int var1) {
      this.field732 = var1;// 581
   }// 359

   // $VF: synthetic method
   public String method20() {
      return this.field742;// 206
   }

   // $VF: synthetic method
   public final boolean method353() {
      this.method19();// 924
      return this.field750;// 730
   }

   // $VF: synthetic method
   public Class128[] method137() {
      if (this.field729) {// 331
         Class151[] var4 = this.method200();// 130
         ArrayList var2 = new ArrayList();// 301

         int var3;
         for (int var10000 = var3 = 0; var10000 < var4.length; var10000 = ++var3) {// 602
            Class151 var6;
            if ((var6 = var4[var3]) instanceof Class154) {// 363 509
               Class154 var7 = (Class154)var6;// 35

               int var5;
               for (int var8 = var5 = 0; var8 < var7.method137().length; var8 = var5) {// 233
                  var2.add(var7.method137()[var5++]);// 271
               }
            }
         }

         this.field741 = (Class128[])var2.toArray(new Class128[var2.size()]);// 47
         this.field729 = false;// 182
      }

      return this.field741;// 122
   }

   // $VF: synthetic method
   public void method206(Class151[] var1) {
      this.field745 = var1;// 529
   }// 106

   // $VF: synthetic method
   public void method131(String var1) {
      this.field742 = var1;// 447
   }// 79

   // $VF: synthetic method
   public int hashCode() {
      return field755.method749(this);// 672
   }
}
