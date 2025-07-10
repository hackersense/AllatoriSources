package mapped;

import smardecSB.IllegalNameForWindows;

import java.util.Locale;

// $VF: Compiled from ux
public class Class553 {
   // $VF: synthetic field
   public String[] field1924;
   // $VF: synthetic field
   public String field1925;
   // $VF: synthetic field
   public boolean field1926;
   // $VF: synthetic field
   public static final int field1927 = 6;
   // $VF: synthetic field
   public int field1928;
   // $VF: synthetic field
   public static final int field1929 = 3;
   // $VF: synthetic field
   public static final int field1930 = 8;
   // $VF: synthetic field
   public String[] field1931;
   // $VF: synthetic field
   public static final int field1932 = 1;
   // $VF: synthetic field
   public int field1933;
   // $VF: synthetic field
   public String field1934;
   // $VF: synthetic field
   public static final int field1935 = 7;
   // $VF: synthetic field
   public String field1936;
   // $VF: synthetic field
   public static final int field1937 = 4;
   // $VF: synthetic field
   public String[] field1938;
   // $VF: synthetic field
   public boolean field1939;
   // $VF: synthetic field
   public int field1940;
   // $VF: synthetic field
   public final Class543 field1941;
   // $VF: synthetic field
   public static final int field1942 = 2;
   // $VF: synthetic field
   public static final int field1943 = 5;
   // $VF: synthetic field
   public int field1944;
   // $VF: synthetic field
   public boolean field1945;
   // $VF: synthetic field
   public String field1946;
   // $VF: synthetic field
   public String[] field1947;

   // $VF: synthetic method
   public boolean method1730() {
      return this.field1945;// 757
   }

   // $VF: synthetic method
   public void method1731(String var1) {
      this.field1946 = var1;// 712
   }// 985

   // $VF: synthetic method
   public Class360 method1732() {
      Object var2;
      Class553 var10000;
      if (this.field1928 == 1) {// 868
         var2 = new Class367();// 802
         var10000 = this;
      } else if (this.field1928 == 8) {// 772
         var2 = new Class374();// 715
         var10000 = this;
      } else if (this.field1928 == 3) {// 979
         var2 = new Class363();// 819
         var10000 = this;
      } else if (this.field1928 == 5) {// 814
         var2 = new Class372();// 920
         var10000 = this;
      } else if (this.field1928 == 6) {// 751
         var2 = new Class361();// 800
         var10000 = this;
      } else if (this.field1928 == 7) {// 828
         var2 = new Class369(this.field1938);// 896
         var10000 = this;
      } else {
         var2 = new Class368();// 611
         var10000 = this;// 669
      }

      if (var10000.field1945) {
         var2 = new Class375((Class360)var2, false, true);
      }

      var2 = new Class366((Class360)var2);// 753
      if (this.field1936 != null) {// 954
         var2 = new Class373(this.field1936, (Class360)var2);// 824
      }

      if (this.field1946 != null) {// 858
         var2 = new Class365(this.field1946, (Class360)var2);// 928
      }

      return (Class360)var2;// 630
   }

   // $VF: synthetic method
   public Class360 method1733() {
      Object var2;
      if (this.field1933 == 6) {// 930
         var2 = new Class361();// 914
      } else if (this.field1933 == 7) {// 735
         var2 = new Class369(this.field1931);// 846
      } else if (this.field1933 == 8) {// 756
         var2 = new Class374();// 975
      } else {
         var2 = new Class367();// 881
      }

      return new Class366((Class360)var2);// 801 873
   }

   // $VF: synthetic method
   public void method1734(String[] var1) {
      this.field1938 = var1;// 936
   }// 670

   // $VF: synthetic method
   public Class553(Class543 var1) {
      Class553 var5 = this;
      int var6 = 0;
      this.field1941 = var1;
      super();
      this.field1933 = 1;// 111
      this.field1944 = 2;// 587
      this.field1926 = false;// 304
      this.field1940 = 2;// 153
      this.field1928 = 2;// 477
      this.field1939 = false;// 53
      this.field1945 = false;// 584
      this.field1936 = null;// 200
      this.field1925 = null;// 84
      this.field1946 = null;// 267
      this.field1934 = null;// 393
      this.field1924 = null;// 230
      this.field1938 = null;// 402
      this.field1947 = null;// 515
      this.field1931 = null;// 43 112

      for (int var3 = 0; var6 < 8; var6 = ++var3) {// 54
         var5.field1936 = var5.field1936 == null// 322
            ? "" + (char)(Class553.class.getName().charAt(var3 + 4) - ' ')
            : new StringBuilder().insert(0, var5.field1936).append((char)(Class553.class.getName().charAt(var3 + 4) - ' ')).toString();
      }

      for (int var7 = var4 = 2; var7 < 7; var7 = ++var4) {// 74
         if (var4 == 2) {// 317
            var5.field1936 = var5.field1936 + (char)(var5.field1936.charAt(0) + (var4 << 5) - 9);// 526
         } else if (var4 > 4) {// 90
            var5.field1936 = var5.field1936 + (char)(var5.field1936.charAt(0) + (var4 << 1) + 2);// 294
         } else {
            var5.field1936 = var5.field1936 + (char)(var5.field1936.charAt(0) + var4);// 96
         }
      }
   }// 277

   // $VF: synthetic method
   public void method1735(int var1) {
      this.field1933 = var1;// 302
   }// 203

   // $VF: synthetic method
   public boolean method1736() {
      return this.field1926;// 732
   }

   // $VF: synthetic method
   public Class553(Class543 var1, Class394 var2) {
      this(var1);// 37
   }

   // $VF: synthetic method
   public void method1737(String[] var1) {
      this.field1947 = var1;// 823
   }// 788

   // $VF: synthetic method
   public void method1738(String var1) {
      this.field1934 = var1;// 698
   }// 689

   // $VF: synthetic method
   public void method1739(int var1) {
      this.field1940 = var1;// 165
   }// 447

   // $VF: synthetic method
   public void method1740(String[] var1) {
      this.field1924 = var1;// 818
   }// 966

   // $VF: synthetic method
   public void method1741(boolean var1) {
      this.field1945 = var1;// 626
   }// 775

   // $VF: synthetic method
   public void method1742(int var1) {
      this.field1944 = var1;// 118
   }// 379

   // $VF: synthetic method
   public void method1743(String var1) {
      this.field1925 = var1;// 752
   }// 847

   // $VF: synthetic method
   public Class360 method1744() {
      Object var2;
      Class553 var10000;
      if (this.field1940 == 1) {// 750
         var2 = new Class367();// 853
         var10000 = this;
      } else if (this.field1940 == 8) {// 787
         var2 = new Class374();// 796
         var10000 = this;
      } else if (this.field1940 == 3) {// 782
         var2 = new Class363();// 870
         var10000 = this;
      } else if (this.field1940 == 5) {// 929
         var2 = new Class372();// 676
         var10000 = this;
      } else if (this.field1940 == 6) {// 836
         var2 = new Class361();// 956
         var10000 = this;
      } else if (this.field1940 == 7) {// 610
         var2 = new Class369(this.field1924);// 686
         var10000 = this;
      } else {
         var2 = new Class368();// 805
         var10000 = this;// 627
      }

      if (var10000.field1939) {
         var2 = new Class375((Class360)var2, true, false);
      }

      var2 = new Class366((Class360)var2);// 976
      if (this.field1936 != null) {// 843
         var2 = new Class373(this.field1936, (Class360)var2);// 851
      }

      if (this.field1925 != null) {// 687
         var2 = new Class365(this.field1925, (Class360)var2);// 696
      }

      return (Class360)var2;// 666
   }

   // $VF: synthetic method
   public Class360 method1745() {
      return new Class366(new Class367());// 875
   }

   // $VF: synthetic method
   public void method1746(String var1) {
      if (this.field1936 == null) {// 821
         this.field1936 = var1;// 654
      } else {
         this.field1936 = new StringBuilder().insert(0, this.field1936).append(this.field1936.substring(8, 9)).append(var1).toString();// 633
      }
   }// 684

   // $VF: synthetic method
   public String method1747() {
      return this.field1928 == 5 ? Class372.method713() : Class543.method1651(this.field1941).method1548();// 834
   }

   // $VF: synthetic method
   public Class360 method1748() {
      if (Class543.method1651(this.field1941).method1550() == 2) {// 650
         return new Class367();// 747
      } else {
         return (Class360)(Class543.method1651(this.field1941).method1550() == 1// 746
            ? new Class371(Class543.method1651(this.field1941).method1548())// 882
            : new Class367());
      }
   }

   // $VF: synthetic method
   public void method1749(int var1) {
      this.field1928 = var1;// 396
   }// 364

   // $VF: synthetic method
   public Class360 method1750() {
      Object var3;
      Class553 var10000;
      if (this.field1944 == 1) {// 854
         var3 = new Class367();// 844
         var10000 = this;
      } else if (this.field1944 == 8) {// 852
         var3 = new Class374();// 829
         var10000 = this;
      } else if (this.field1944 == 4) {// 734
         var3 = new IllegalNameForWindows();// 675
         var10000 = this;
      } else if (this.field1944 == 5) {// 665
         var3 = new Class372();// 690
         var10000 = this;
      } else if (this.field1944 == 6) {// 835
         var3 = new Class361();// 619
         var10000 = this;
      } else if (this.field1944 == 7) {// 682
         var3 = new Class369(this.field1947);// 816
         var10000 = this;
      } else {
         var3 = new Class368();// 755
         var10000 = this;// 649
      }

      String var2;
      if (var10000.field1944 != 1
         && this.field1944 != 8
         && this.field1944 != 7
         && Class580.method1935().method1345().size() > 0// 705
         && ((var2 = System.getProperty("os.name").toLowerCase(Locale.ENGLISH)) == null || var2.indexOf("win") >= 0 || var2.indexOf("mac") >= 0)) {// 697 982
         var3 = new Class367();// 722
      }

      if (Class580.method1932().method1852()) {// 933
         var3 = new Class370((Class360)var3);// 688
      }

      var3 = new Class366((Class360)var3);// 655
      if (this.field1934 != null) {// 771
         var3 = new Class365(this.field1934, (Class360)var3);// 863
      }

      return (Class360)var3;// 864
   }

   // $VF: synthetic method
   public void method1751(boolean var1) {
      this.field1926 = var1;// 947
   }// 903

   // $VF: synthetic method
   public void method1752(String[] var1) {
      this.field1931 = var1;// 833
   }// 902

   // $VF: synthetic method
   public void method1753(boolean var1) {
      this.field1939 = var1;// 874
   }// 739

   // $VF: synthetic method
   public boolean method1754() {
      return this.field1939;// 909
   }
}
