package mapped;

import java.util.Vector;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

// $VF: Compiled from gx
public class Class444 extends DefaultHandler {
   // $VF: synthetic field
   public String field1313;
   // $VF: synthetic field
   public String field1314;
   // $VF: synthetic field
   public String field1315;
   // $VF: synthetic field
   public String field1316 = "old";
   // $VF: synthetic field
   public String field1317 = "new";
   // $VF: synthetic field
   public String field1318;
   // $VF: synthetic field
   public String field1319;
   // $VF: synthetic field
   public String field1320 = "class";
   // $VF: synthetic field
   public Class555 field1321;
   // $VF: synthetic field
   public String field1322;
   // $VF: synthetic field
   public String field1323;
   // $VF: synthetic field
   public String field1324 = "method";
   // $VF: synthetic field
   public String field1325;
   // $VF: synthetic field
   public String field1326;

   // $VF: synthetic method
   public void startElement(String var1, String var2, String var3, Attributes var4) {
      if (this.field1320.equals(var3)) {// 418
         String var11 = var4.getValue(this.field1316);// 533
         var2 = var4.getValue(this.field1317);// 185
         this.field1321.field1956.method1340(var2, var11);// 406
         this.field1323 = var11 + ".";
         this.field1315 = var2 + ".";// 1 46
         this.field1321// 170
            .method1764(
               new StringBuilder().insert(0, this.field1315).append(this.field1326).toString(),
               new StringBuilder().insert(0, this.field1323).append(this.field1326).toString()
            );
         this.field1321// 553
            .method1764(
               new StringBuilder().insert(0, this.field1315).append(this.field1314).toString(),
               new StringBuilder().insert(0, this.field1323).append(this.field1314).toString()
            );
      } else if (this.field1324.equals(var3)) {
         String var10 = var4.getValue(this.field1316);// 190
         var2 = var4.getValue(this.field1317);// 315
         String var5 = var10.substring(0, var10.indexOf(40));// 465
         if (var4.getValue(this.field1325) != null && var4.getValue(this.field1319) != null) {// 132
            int var6 = Integer.valueOf(var4.getValue(this.field1325));
            int var7 = Integer.valueOf(var4.getValue(this.field1319));// 184 534
            this.field1321// 488
               .method1763(
                  new StringBuilder().insert(0, this.field1315).append(var2).toString(),
                  new StringBuilder().insert(0, this.field1323).append(var5).toString(),
                  var6,
                  var7
               );
         } else {
            this.field1321// 159
               .method1764(
                  new StringBuilder().insert(0, this.field1315).append(var2).toString(), new StringBuilder().insert(0, this.field1323).append(var5).toString()
               );
         }
      } else if (this.field1318.equals(var3)) {
         String var9 = var4.getValue(this.field1316);// 561
         var2 = var4.getValue(this.field1317);// 377
         this.field1321.field1957.method1340(var2, var9);// 604
      } else {
         if (this.field1313.equals(var3)) {
            Integer var8 = Integer.valueOf(var4.getValue(this.field1322));// 6
            this.field1321.field1959.add(var8);// 144
         }
      }
   }// 22 58 358 493 495

   // $VF: synthetic method
   public Class444(Class555 var1) {
      this.field1318 = "source";// 18
      this.field1313 = "line";// 513
      this.field1322 = "l";// 93
      this.field1326 = "<init>";// 151
      this.field1314 = "<clinit>";// 530
      this.field1325 = "s";// 491
      this.field1319 = "e";// 147
      this.field1321 = var1;// 273 338
      var1.field1956 = new Class499();// 161
      var1.field1957 = new Class499();// 141
      var1.field1959 = new Vector();// 580
   }// 226
}
