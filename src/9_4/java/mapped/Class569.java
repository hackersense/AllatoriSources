package mapped;

import java.util.Hashtable;
import java.util.List;

// $VF: Compiled from ux
public class Class569 {
   // $VF: synthetic field
   public boolean field2004;
   // $VF: synthetic field
   public boolean field2005;
   // $VF: synthetic field
   public static final int field2006 = 0;
   // $VF: synthetic field
   public static final int field2007 = 1;
   // $VF: synthetic field
   public Class556 field2008;
   // $VF: synthetic field
   public static final int field2009 = 101;
   // $VF: synthetic field
   public String field2010;
   // $VF: synthetic field
   public Class556 field2011;
   // $VF: synthetic field
   public char field2012;
   // $VF: synthetic field
   public Class556 field2013;
   // $VF: synthetic field
   public static final int field2014 = 1000;
   // $VF: synthetic field
   public static final int field2015 = 1;
   // $VF: synthetic field
   public Hashtable field2016;
   // $VF: synthetic field
   public String field2017;
   // $VF: synthetic field
   public final Class580 field2018;
   // $VF: synthetic field
   public static final int field2019 = 1;
   // $VF: synthetic field
   public Class556 field2020;
   // $VF: synthetic field
   public boolean field2021;
   // $VF: synthetic field
   public String field2022;
   // $VF: synthetic field
   public static final int field2023 = 2;
   // $VF: synthetic field
   public String field2024;
   // $VF: synthetic field
   public boolean field2025;
   // $VF: synthetic field
   public static final int field2026 = 0;
   // $VF: synthetic field
   public static final int field2027 = 1;
   // $VF: synthetic field
   public static final int field2028 = 0;
   // $VF: synthetic field
   public static final int field2029 = 100;
   // $VF: synthetic field
   public static final int field2030 = 3;
   // $VF: synthetic field
   public boolean field2031;
   // $VF: synthetic field
   public boolean field2032;
   // $VF: synthetic field
   public Class556 field2033;
   // $VF: synthetic field
   public int field2034;
   // $VF: synthetic field
   public Class556 field2035;
   // $VF: synthetic field
   public static final int field2036 = 0;
   // $VF: synthetic field
   public boolean field2037;
   // $VF: synthetic field
   public Class556 field2038;
   // $VF: synthetic field
   public boolean field2039;
   // $VF: synthetic field
   public String field2040;
   // $VF: synthetic field
   public String field2041;

   // $VF: synthetic method
   public boolean method1841() {
      return this.field2031;// 1067
   }

   // $VF: synthetic method
   public boolean method1842() {
      return this.field2025;// 1614
   }

   // $VF: synthetic method
   public void method1843(int var1) {
      this.field2034 = var1;// 1101
   }// 1444

   // $VF: synthetic method
   public void method1844(String var1) {
      this.field2040 = var1;// 1406
   }// 1277

   // $VF: synthetic method
   public void method1845(Class587 var1) {
      this.field2033.method1768(var1);// 1436
   }// 1433

   // $VF: synthetic method
   public void method1846(boolean var1) {
      this.field2039 = var1;// 1543
   }// 1109

   // $VF: synthetic method
   public String method1847() {
      return this.field2010;// 1451
   }

   // $VF: synthetic method
   public void method1848(Class587 var1) {
      this.field2011.method1768(var1);// 1118
   }// 1366

   // $VF: synthetic method
   public int method1849(Class338 var1, Class206 var2, Class203 var3) {
      if (this.field2005) {// 1010
         return 0;
      } else {
         Class533[] var4;
         int var5 = (var4 = var2.method264()).length;

         int var6;
         for (int var10000 = var6 = 0; var10000 < var5; var10000 = ++var6) {// 1161
            Class533 var8 = var4[var6];
            List var9;
            if ("Lcom/allatori/annotations/StringEncryptionType;".equals(var8.method1589())// 1341
               && (var9 = var8.method1583()) != null// 1150 1528
               && var9.size() > 0
               && ((Class548)var9.get(0)).method1716() != null) {
               if ("fast".equals(((Class548)var9.get(0)).method1716().method1255())) {// 1505
                  return 0;// 1050
               }

               if ("strong".equals(((Class548)var9.get(0)).method1716().method1255())) {// 1676
                  return 1;// 1389
               }
            }
         }

         return this.field2033.method1770(var1, var2, var3);// 1058
      }
   }

   // $VF: synthetic method
   public void method1850(Class587 var1) {
      this.field2013.method1768(var1);// 1262
   }// 1391

   // $VF: synthetic method
   public void method1851(boolean var1) {
      this.field2021 = var1;// 1177
   }// 1247

   // $VF: synthetic method
   public boolean method1852() {
      return this.field2021;// 1235
   }

   // $VF: synthetic method
   public String method1853() {
      return this.field2041;// 987
   }

   // $VF: synthetic method
   public void method1854(boolean var1) {
      this.field2005 = var1;// 1488
   }// 1144

   // $VF: synthetic method
   public Hashtable method1855() {
      return this.field2016;// 1210
   }

   // $VF: synthetic method
   public int method1856(Class338 var1, Class206 var2) {
      if (!this.field2037 && var2.method93().startsWith(this.field2022)) {// 937
         return 0;
      } else {
         Class533[] var6;
         int var4 = (var6 = var2.method264()).length;

         int var5;
         for (int var10000 = var5 = 0; var10000 < var4; var10000 = ++var5) {// 889
            Class533 var7 = var6[var5];
            List var8;
            if ("Lcom/allatori/annotations/StringEncryption;".equals(var7.method1589())// 658
               && (var8 = var7.method1583()) != null// 1276 1292
               && var8.size() > 0
               && ((Class548)var8.get(0)).method1716() != null) {
               if ("enable".equals(((Class548)var8.get(0)).method1716().method1255())) {// 1199
                  return 1;// 1284
               }

               if ("disable".equals(((Class548)var8.get(0)).method1716().method1255())) {// 994
                  return 0;// 1209
               }

               if ("maximum".equals(((Class548)var8.get(0)).method1716().method1255())) {// 1682
                  return 2;// 1135
               }

               if ("maximum-with-warnings".equals(((Class548)var8.get(0)).method1716().method1255())) {// 1627
                  return 3;// 1283
               }
            }
         }

         return this.field2011.method1766(var1, var2);// 1215
      }
   }

   // $VF: synthetic method
   public int method1857(Class338 var1, Class206 var2) {
      return this.field2038.method1766(var1, var2);// 1637
   }

   // $VF: synthetic method
   public boolean method1858() {
      return this.field2005;// 1286
   }

   // $VF: synthetic method
   public Class569(Class580 var1) {
      this.field2018 = var1;
      this.field2016 = new Hashtable();// 692
      this.field2011 = new Class556(1);// 660
      this.field2033 = new Class556(0);// 977
      this.field2038 = new Class556(1);// 622
      this.field2020 = new Class556(1);// 628
      this.field2008 = new Class556(0);// 904
      this.field2013 = new Class556(0);// 804
      this.field2035 = new Class556(0);// 890
      this.field2041 = null;// 984
      this.field2031 = false;// 817
      this.field2005 = false;// 967
      this.field2021 = false;// 710
      this.field2039 = true;// 767
      this.field2032 = true;// 733
      this.field2040 = null;// 792
      this.field2012 = '\uffff';// 640
      this.field2034 = 1;// 866
      this.field2025 = false;// 812
      this.field2037 = false;// 906
      this.field2010 = "";// 893
      this.field2024 = "";// 917
      this.field2004 = false;// 925
      this.field2022 = "org.springframework.boot.";// 708 786
   }

   // $VF: synthetic method
   public boolean method1859(Class338 var1, Class206 var2, Class208 var3) {
      return var1 == null ? false : this.field2035.method1767(var1, var2, var3) > 0;// 1526 1551
   }

   // $VF: synthetic method
   public boolean method1860(Class338 var1, Class206 var2) {
      return var1 == null ? false : this.field2013.method1766(var1, var2) > 0;// 1294 1349
   }

   // $VF: synthetic method
   public void method1861(Class587 var1) {
      this.field2020.method1768(var1);// 1591
   }// 1171

   // $VF: synthetic method
   public void method1862(Class587 var1) {
      this.field2038.method1768(var1);// 1455
   }// 1674

   // $VF: synthetic method
   public void method1863(boolean var1) {
      this.field2031 = var1;// 1577
   }// 1634

   // $VF: synthetic method
   public boolean method1864() {
      return this.field2037;// 1048
   }

   // $VF: synthetic method
   public boolean method1865() {
      return this.field2039;// 1088
   }

   // $VF: synthetic method
   public int method1866() {
      return this.field2034;// 1508
   }

   // $VF: synthetic method
   public String method1867() {
      return this.field2040;// 1478
   }

   // $VF: synthetic method
   public void method1868(boolean var1) {
      this.field2032 = var1;// 1555
   }// 1020

   // $VF: synthetic method
   public boolean method1869() {
      return this.field2004;// 1364
   }

   // $VF: synthetic method
   public void method1870(boolean var1) {
      this.field2004 = var1;// 1226
   }// 1046

   // $VF: synthetic method
   public String method1871() {
      return this.field2017;// 1659
   }

   // $VF: synthetic method
   public boolean method1872() {
      return this.field2032;// 1307
   }

   // $VF: synthetic method
   public boolean method1873(Class338 var1, Class206 var2) {
      return var1 == null ? false : this.field2008.method1766(var1, var2) > 0;// 1211 1410
   }

   // $VF: synthetic method
   public void method1874(char var1) {
      this.field2012 = var1;// 1338
   }// 1465

   // $VF: synthetic method
   public void method1875(Class587 var1) {
      this.field2035.method1768(var1);// 1185
   }// 1040

   // $VF: synthetic method
   public boolean method1876(Class338 var1, Class206 var2, Class203 var3) {
      if (var3.method20().startsWith("Allatori")) {// 1645
         return !Class580.method1932().method1858();
      } else {
         Class533[] var4;
         int var5 = (var4 = var3.method264()).length;

         int var6;
         for (int var10000 = var6 = 0; var10000 < var5; var10000 = ++var6) {// 1539
            Class533 var7 = var4[var6];
            List var9;
            if ("Lcom/allatori/annotations/ControlFlowObfuscation;".equals(var7.method1589())// 1354
               && (var9 = var7.method1583()) != null// 1457 1510
               && var9.size() > 0
               && ((Class548)var9.get(0)).method1716() != null) {
               if ("enable".equals(((Class548)var9.get(0)).method1716().method1255())) {// 1198
                  return true;// 1553
               }

               if ("disable".equals(((Class548)var9.get(0)).method1716().method1255())) {// 1152
                  return false;// 1302
               }
            }
         }

         var5 = (var4 = var2.method264()).length;

         for (int var15 = var6 = 0; var15 < var5; var15 = ++var6) {// 1024
            Class533 var14 = var4[var6];
            List var10;
            if ("Lcom/allatori/annotations/ControlFlowObfuscation;".equals(var14.method1589())// 1057
               && (var10 = var14.method1583()) != null// 1173 1599
               && var10.size() > 0
               && ((Class548)var10.get(0)).method1716() != null) {
               if ("enable".equals(((Class548)var10.get(0)).method1716().method1255())) {// 997
                  return true;// 1552
               }

               if ("disable".equals(((Class548)var10.get(0)).method1716().method1255())) {// 1343
                  return false;// 1365
               }
            }
         }

         return this.field2020.method1770(var1, var2, var3) > 0;// 1625
      }
   }

   // $VF: synthetic method
   public char method1877() {
      return this.field2012;// 1137
   }

   // $VF: synthetic method
   public void method1878(Class587 var1) {
      this.field2008.method1768(var1);// 1016
   }// 1258

   // $VF: synthetic method
   public String method1879() {
      return this.field2024;// 1138
   }

   // $VF: synthetic method
   public void method1880(String var1) {
      this.field2010 = var1;// 1494
   }// 1442

   // $VF: synthetic method
   public void method1881(String var1) {
      this.field2017 = var1;// 1289
   }// 1044

   // $VF: synthetic method
   public void method1882(boolean var1) {
      this.field2025 = var1;// 1582
   }// 1400

   // $VF: synthetic method
   public void method1883(String var1) {
      this.field2041 = var1;// 1104
   }// 1554

   // $VF: synthetic method
   public void method1884(boolean var1) {
      this.field2037 = var1;// 1538
   }// 1028

   // $VF: synthetic method
   public void method1885(String var1) {
      this.field2024 = var1;// 1208
   }// 1087
}
