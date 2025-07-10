package mapped;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

// $VF: Compiled from so
public class Class443 extends DefaultHandler {
   // $VF: synthetic field
   public String field1296;
   // $VF: synthetic field
   public String field1297;
   // $VF: synthetic field
   public String field1298;
   // $VF: synthetic field
   public String field1299;
   // $VF: synthetic field
   public String field1300;
   // $VF: synthetic field
   public String field1301;
   // $VF: synthetic field
   public String field1302;
   // $VF: synthetic field
   public String field1303;
   // $VF: synthetic field
   public String field1304;
   // $VF: synthetic field
   public String field1305;
   // $VF: synthetic field
   public String field1306;
   // $VF: synthetic field
   public Class499 field1307;
   // $VF: synthetic field
   public final Class340 field1308;
   // $VF: synthetic field
   public String field1309;
   // $VF: synthetic field
   public String field1310;
   // $VF: synthetic field
   public String field1311;
   // $VF: synthetic field
   public String field1312;

   // $VF: synthetic method
   public void method879() {
      Class443 var1 = this;

      try {
         Vector var4 = new Vector(var1.field1307.method1339());// 1404

         int var7;
         for (int var10000 = var7 = 0; var10000 < var4.size(); var10000 = ++var7) {// 1281
            String var3 = (String)var4.get(var7);// 1313
            String var12 = var1.field1307.method1341(var3);// 1011
            Class206 var5;
            if ((var5 = Class340.method580(var1.field1308).method557(var12)) != null) {// 1576 1640
               String[] var6 = var5.method130();// 1059

               int var2;
               for (int var21 = var2 = 0; var21 < var6.length; var21 = var2) {// 1356
                  String var8 = var6[var2];// 1348
                  Class499 var22 = var1.field1307;// 1271
                  StringBuilder var10001 = new StringBuilder().append(var8).append(var3.substring(var3.indexOf("&")));
                  var2++;
                  var22.method1340(var10001.toString(), var8);
               }
            }
         }

         Set var16 = var1.field1307.method1339();// 1458
         Vector var19 = new Vector(Class567.method1833(Class490.method1311(Class340.method584(var1.field1308))).method1339());// 1107

         for (String var13 : var16) {// 1098 1251
            String var17 = var1.field1307.method1341(var13);// 1153
            Iterator var18 = var19.iterator();// 1233

            while (var18.hasNext()) {
               String var14;
               if ((var14 = (String)var18.next()).startsWith(var17)) {// 1312 1653
                  String var20 = Class567.method1833(Class490.method1311(Class340.method584(var1.field1308))).method1341(var14);// 1023
                  if (var13.substring(var13.indexOf("&") + 1, var13.lastIndexOf("&")).equals(var20)) {// 1099 1456
                     String var9 = var13.substring(var13.lastIndexOf("&") + 1);// 1212
                     String var10 = var14.substring(var14.lastIndexOf("&") + 1);// 1329
                     if (var9.equals(Class409.method758(var10))) {// 1110
                        Class567.method1833(Class490.method1311(Class340.method584(var1.field1308))).method1337(var14);// 1143
                        Class567.method1836(Class490.method1311(Class340.method584(var1.field1308))).method1337(var13);// 1597
                     }
                  }
               }
            }
         }
      } catch (Exception var11) {// 1520
      }
   }// 1459

   // $VF: synthetic method
   public static void method880(Class443 var0) {
      var0.method881();
   }

   // $VF: synthetic method
   public Class443(Class340 var1) {
      this.field1308 = var1;
      this.field1307 = new Class499();// 1493
      this.field1303 = "old";// 1171
      this.field1299 = "new";// 1201
      this.field1306 = "class";// 1575
      this.field1309 = "method";// 1211
      this.field1298 = "field";// 1410
      this.field1305 = "source";// 1316
      this.field1300 = "line";// 1273
      this.field1304 = "l";// 1530
      this.field1297 = "annotation";// 1016
      this.field1311 = "oldClassName";// 1258
      this.field1302 = "oldMethodName";// 1415
      this.field1301 = "newMethodName";// 1333
      this.field1312 = " ";// 1294
   }

   // $VF: synthetic method
   public void startElement(String var1, String var2, String var3, Attributes var4) {
      if (this.field1306.equals(var3)) {// 1230
         this.field1296 = var4.getValue(this.field1303);
         this.field1310 = var4.getValue(this.field1299);// 1040 1185
         if (Class340.method592()) {// 1639
            String var13 = Class409.method753(this.field1310);// 1512
            if (Class340.method571().method1338(var13)) {// 987
               this.field1310 = Class340.method571().method1341(var13) + this.field1310.substring(var13.length());// 1181
            }
         }

         Class505.method1355(Class490.method1314(Class340.method584(this.field1308))).method1340(this.field1296, this.field1310);// 1585
         Class505.method1356(Class490.method1314(Class340.method584(this.field1308))).method1340(this.field1310, this.field1296);// 1104
         this.method884();// 1554
      } else {
         if (this.field1309.equals(var3)) {
            String var8 = var4.getValue(this.field1303);// 1590
            var2 = var4.getValue(this.field1299);// 1067
            String var5 = var8.substring(0, var8.indexOf("("));// 1225
            String var6 = var8.substring(var8.indexOf("("));// 1005
            Class567.method1833(Class490.method1311(Class340.method584(this.field1308)))// 1452
               .method1340(new StringBuilder().insert(0, this.field1296).append("&").append(var5).append("&").append(var6).toString(), var2);
            String var7 = new StringBuilder().insert(0, this.field1296).append("&").append(var2).append("&").append(Class409.method758(var6)).toString();// 1577
            if (Class567.method1836(Class490.method1311(Class340.method584(this.field1308))).method1338(var7)) {// 1634
               this.field1307.method1340(var7, this.field1296);// 1518
            }

            Class567.method1836(Class490.method1311(Class340.method584(this.field1308))).method1340(var7, "&");// 1546
            if (Class580.method1923().method1650() && !var2.equals(var5)) {// 1286
               Class567.method1832(Class490.method1311(Class340.method584(this.field1308))).method1340(var5 + "&" + Class409.method758(var6), var2);// 1002
               return;// 1132
            }
         } else {
            if (this.field1298.equals(var3)) {
               String var12 = var4.getValue(this.field1303);// 1332
               var2 = var4.getValue(this.field1299);// 1488
               String var20 = var12.substring(0, var12.indexOf(this.field1312));// 1144
               String var21 = var12.substring(var12.indexOf(this.field1312) + 1);// 1589
               Class339.method564(Class490.method1312(Class340.method584(this.field1308)))// 1663
                  .method1340(new StringBuilder().insert(0, this.field1296).append("&").append(var20).append("&").append(var21).toString(), var2);
               Class339.method566(Class490.method1312(Class340.method584(this.field1308)))// 1235
                  .method1340(new StringBuilder().insert(0, this.field1296).append("&").append(var2).append("&").append(var21).toString(), "&");
               return;// 1291
            }

            if (this.field1305.equals(var3)) {
               String var11 = var4.getValue(this.field1303);// 1095
               var2 = var4.getValue(this.field1299);// 1077
               Class340.method568(this.field1308).method1759(var11, var2);// 1177
               return;// 1247
            }

            if (this.field1300.equals(var3)) {
               Integer var10 = Integer.valueOf(var4.getValue(this.field1304));// 1372
               Class340.method568(this.field1308).method1758().add(var10);// 1598
               return;// 1088
            }

            if (this.field1297.equals(var3)) {
               String var9 = var4.getValue(this.field1311);// 1336
               var2 = var4.getValue(this.field1302);// 1680
               String var19 = var4.getValue(this.field1301);// 1405
               Class567.method1831(Class490.method1311(Class340.method584(this.field1308))).method1340(var9 + "&" + var2, var19);// 1543
            }
         }
      }
   }// 1021 1654

   // $VF: synthetic method
   public void method881() {
      XMLReader var10000 = SAXParserFactory.newInstance().newSAXParser().getXMLReader();// 1241 1522
      var10000.setContentHandler(this);// 1262
      var10000.parse(new InputSource(new InputStreamReader(new FileInputStream(Class580.method1923().method1653()), "UTF-8")));// 1586
      this.method882();// 1006
      this.method879();// 1526
   }// 1551

   // $VF: synthetic method
   public Class443(Class340 var1, Class518 var2) {
      this(var1);// 1625
   }

   // $VF: synthetic method
   public void method882() {
      Class443 var3 = this;

      for (String var10000 : Class339.method564(Class490.method1312(Class340.method584(this.field1308))).method1339()) {// 1408 1424
         String var2;
         String var4 = var3.method883(// 1130
            var2 = var10000.substring(var10000.lastIndexOf("&") + 1), Class505.method1355(Class490.method1314(Class340.method584(var3.field1308)))// 1264
         );
         if (!var2.equals(var4)) {// 1179
            Class339.method565(Class490.method1312(Class340.method584(var3.field1308))).method1340(var2, var4);// 1469
         }
      }

      for (String var8 : Class567.method1833(Class490.method1311(Class340.method584(var3.field1308))).method1339()) {// 1387 1498
         String var7;
         String var5 = var3.method883(// 1214
            var7 = var8.substring(var8.lastIndexOf("&") + 1), Class505.method1355(Class490.method1314(Class340.method584(var3.field1308)))// 1592
         );
         if (!var7.equals(var5)) {// 1620
            Class567.method1834(Class490.method1311(Class340.method584(var3.field1308))).method1340(var7, var5);// 1124
         }
      }
   }// 1608

   // $VF: synthetic method
   public String method883(String var1, Class499 var2) {
      String var6 = "";// 1335

      while (var1.length() > 0) {// 1216
         int var4 = var1.indexOf(76);// 1418
         int var5 = var1.indexOf(59);// 1279
         if (var4 != -1 && var5 != -1 && var4 < var5) {// 1086
            String var7 = var1.substring(var4 + 1, var5).replace('/', '.');// 1090 1516
            if (var2.method1341(var7) != null) {// 1531
               var7 = var2.method1341(var7);// 1587
            }

            String var8 = var7.replace('.', '/');// 1300
            var6 = var6 + var1.substring(0, var4 + 1) + var8 + ";";// 1556
            var1 = var1.substring(var5 + 1);// 1511
         } else {
            var6 = var6 + var1;// 1388
            var1 = "";// 1507
         }
      }

      return var6;// 1499
   }

   // $VF: synthetic method
   public void method884() {
      Class443 var2 = this;
      String var1 = Class409.method753(this.field1296);// 1334
      String var5 = Class409.method753(this.field1310);// 1344
      if (!Class580.method1923().method1659() || !Class580.method1923().method1677().equals(var5)) {// 1440
         int var4 = 0;// 1421

         int var3;
         for (int var10000 = var3 = var1.length() - 1; var10000 > 0; var10000 = --var3) {// 1207
            if (var1.charAt(var3) == '.') {// 1478
               var4++;
            }
         }

         for (int var7 = var3 = var5.length() - 1; var7 > 0; var7 = --var3) {// 1127
            if (var5.charAt(var3) == '.') {// 1146
               var4--;
            }
         }

         if (var4 == 0) {// 1390
            Class504.method1353(Class490.method1313(Class340.method584(this.field1308))).method1340(var1, var5);// 1277
            Class504.method1354(Class490.method1313(Class340.method584(this.field1308))).method1340(var5, "&");// 1257
            String var8 = var1;// 1295

            while (var8.lastIndexOf(46) > 0) {
               var1 = var1.substring(0, var1.lastIndexOf(46));// 1364
               var5 = var5.substring(0, var5.lastIndexOf(46));// 1114
               Class499 var10002 = Class504.method1353(Class490.method1313(Class340.method584(var2.field1308)));// 991
               var8 = var1;
               var10002.method1340(var1, var5);
               Class504.method1354(Class490.method1313(Class340.method584(var2.field1308))).method1340(var5, "&");// 1629
            }
         }
      }
   }// 1046 1555
}
