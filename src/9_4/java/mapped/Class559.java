package mapped;

import smardecSB.ProductInformation;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Collections;
import java.util.Vector;

// $VF: Compiled from uu
public class Class559 {
   // $VF: synthetic field
   public static StringBuilder field1965 = new StringBuilder(4096);

   // $VF: synthetic method
   public static void method1778(PrintWriter var0, Class584 var1) {
      PrintWriter var3 = var0;
      var0.println(" <mapping>");// 400
      Vector var19 = new Vector(var1.field2353.method1339());// 33
      Vector var22 = new Vector(var1.field2354.method1339());// 0
      Vector var4 = new Vector(var1.field2350.method1339());// 240
      Collections.sort(var22);// 246
      Collections.sort(var4);// 552
      String var5 = "  <class old=\"";// 278
      String var6 = "\" new=\"";// 466
      String var7 = "\">";// 467
      String var8 = "\"/>";// 485
      String var9 = "<init>";// 68
      String var10 = "<clinit>";// 59
      String var11 = "   <method old=\"";// 391
      String var12 = "   <field old=\"";// 330
      String var13 = " ";// 589
      String var14 = "  </class>";// 579

      int var15;
      for (int var10000 = var15 = var19.size() - 1; var10000 >= 0; var10000 = var15) {// 73
         String var16 = (String)var19.get(var15);// 415
         var3.println(var5 + var16 + var6 + var1.field2353.method1341(var16) + var7);// 398
         String var17 = var16 + "&";// 428
         int var18;
         var10000 = var18 = method1782(var22, var17);// 586

         String var2;
         while (var10000 < var22.size() && (var2 = (String)var22.get(var18)).startsWith(var17)) {// 232 399 463
            String var20 = var2.substring(var2.indexOf("&") + 1, var2.lastIndexOf("&"));// 198
            if (!var9.equals(var20) && !var10.equals(var20)) {// 424
               String var21 = var2.substring(var2.lastIndexOf("&") + 1);// 412
               Vector var44;
               if (var1.field2348.method1338(var2)) {// 38
                  var44 = var22;
                  var3.println(var11 + var20 + var21 + var6 + var1.field2354.method1341(var2) + var1.field2348.method1341(var2) + var8);// 257
                  var1.field2348.method1337(var2);// 269
               } else {
                  var3.println(var11 + var20 + var21 + var6 + var1.field2354.method1341(var2) + var8);// 148
                  var44 = var22;// 142
               }

               var44.remove(var18);
               var10000 = var18;
            } else {
               var22.remove(var18);// 28
               var10000 = var18;
            }
         }

         var10000 = var18 = method1782(var4, var17);// 63

         while (var10000 < var4.size() && (var2 = (String)var4.get(var18)).startsWith(var17)) {// 510 541 550
            String var38 = var2.substring(var2.indexOf("&") + 1, var2.lastIndexOf("&"));// 456
            String var40 = var2.substring(var2.lastIndexOf("&") + 1);// 367
            var10000 = var18;
            var3.println(var12 + var38 + var13 + var40 + var6 + var1.field2350.method1341(var2) + var8);// 82
            var4.remove(var18);// 83
         }

         var15--;
         var3.println(var14);// 470
      }

      String var30 = "  <annotations>";// 24
      String var31 = "  </annotations>";// 286
      String var32 = "   <annotation oldClassName=\"";// 600
      String var34 = "\" oldMethodName=\"";// 108
      String var27 = "\" newMethodName=\"";// 27
      Vector var39;
      if ((var39 = new Vector(var1.field2352.method1339())).size() > 0) {// 94 209
         var3.println(var30);// 69

         int var41;
         for (int var46 = var41 = var39.size() - 1; var46 >= 0; var46 = --var41) {// 116
            String var35 = (String)var39.get(var41);// 422
            String var23 = var1.field2352.method1341(var35);// 464
            String var28 = var35.substring(var35.indexOf("&") + 1);// 25
            var5 = var35.substring(0, var35.indexOf("&"));// 31
            if (!var9.equals(var28) && !var10.equals(var28)) {// 21
               var3.println(var32 + var5 + var34 + var28 + var27 + var23 + var8);// 115
            }
         }

         var3.println(var31);// 45
      }

      String var42 = "   <source old=\"";// 248
      var3.println("  <sources>");// 468

      for (int var47 = var36 = var1.field2349.size() - 1; var47 >= 0; var47 = var36) {// 138
         Class500 var24 = (Class500)var1.field2349.get(var36);// 285
         StringBuilder var10001 = new StringBuilder().append(var42).append(var24.field1654).append(var6).append(var24.field1655);
         var36--;
         var3.println(var10001.append(var8).toString());// 119
      }

      var3.println("  </sources>");
      String var37 = "   <line l=\"";// 61
      var3.println("  <lines>");// 220 238

      for (int var48 = var25 = 0; var48 < var1.field2351.size(); var48 = var25) {// 593
         StringBuilder var49 = new StringBuilder().append(var37).append(var1.field2351.get(var25));
         var25++;
         var3.println(var49.append(var8).toString());// 336
      }

      var3.println("  </lines>");
      var3.println(" </mapping>");// 291 540
   }// 57

   // $VF: synthetic method
   public static void method1779(PrintWriter var0) {
      var0.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");// 580
      var0.println(// 226
                   "<!--\n   "
                   + ProductInformation.getName()
                   + " "
                   + ProductInformation.getVersionString()
                   + "\n"
                   + "   Web: "
                   + ProductInformation.getWebsiteString()
                   + "\n\n"
                   + "   Log created: "
                   + Calendar.getInstance().getTime()
                   + "\n"
                   + "-->\n"
      );
      if (field1965.length() > 0) {// 185
         var0.println("<!--\n" + field1965 + "-->\n");// 406
      }

      var0.println(
         "<!--\n"
            + Class509.field1691
            + " classes renamed\n"
            + Class509.field1693
            + " methods renamed\n"
            + Class509.field1692
            + " fields renamed\n\n"
            + (Class348.field1034 + Class348.field1019 + Class348.field1038 + Class348.field1043)
            + " local variables optimized:\n"
            + "   "
            + Class348.field1019
            + " merged and removed\n"
            + "   "
            + Class348.field1034
            + " removed (unused)\n"
            + "   "
            + Class348.field1038
            + " removed (assigned a value but never used)\n"
            + "   "
            + Class348.field1043
            + " usage optimized\n"
            + "-->\n"
      );
      var0.println("<allatori>");// 6 553
   }// 144

   // $VF: synthetic method
   public static void method1780(PrintWriter var0) {
      var0.println("</allatori>");// 321
   }// 179

   // $VF: synthetic method
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void method1781() {
      String var0;
      if ((var0 = Class580.method1938().method722()) == null) {// 507 557
         Class528.method1558("Log file is not set.");// 34
         field1965.delete(0, field1965.length());// 332
      } else {
         PrintWriter var1 = null;// 143

         label93: {
            label94: {
               try {
                  try {
                     FileOutputStream var2 = new FileOutputStream(var0);// 20
                     PrintWriter var18 = var1 = new PrintWriter(new BufferedWriter(new OutputStreamWriter(var2, "UTF-8"), 524288));// 204
                     method1779(var18);// 239
                     method1778(var18, Class580.method1930().field1197);// 310
                     method1780(var18);// 498
                     var18.flush();// 484
                     break label93;
                  } catch (FileNotFoundException var15) {// 409
                     Class528.method1559("Cannot write log to '" + var0 + "' file.");// 389
                  } catch (Exception var16) {// 18
                     Class528.method1559("Writing log file failed with exception: " + var16.getMessage());// 513
                     break label94;
                  }
               } catch (Throwable var17) {
                  field1965.delete(0, field1965.length());

                  try {
                     var1.close();// 491
                  } catch (Exception var14) {
                     throw var17;// 338
                  }

                  throw var17;
               }

               field1965.delete(0, field1965.length());

               try {
                  var1.close();
                  return;
               } catch (Exception var12) {
                  return;
               }
            }

            field1965.delete(0, field1965.length());// 151

            try {
               var1.close();
               return;// 295
            } catch (Exception var11) {// 147
               return;
            }
         }

         field1965.delete(0, field1965.length());

         try {
            var1.close();
         } catch (Exception var13) {
         }
      }
   }// 260

   // $VF: synthetic method
   public static int method1782(Vector var0, String var1) {
      Vector var3 = var0;
      int var2 = 0;// 299
      int var4 = var0.size() - 1;// 314

      while (var2 <= var4) {// 50
         int var6 = var2 + var4 >> 1;// 253
         int var5;
         if ((var5 = ((Comparable)var3.get(var6)).compareTo(var1)) < 0) {// 135 166 474
            var2 = var6 + 1;// 434
         } else {
            if (var5 <= 0) {// 292
               return var6;// 268
            }

            var4 = var6 - 1;// 373
         }
      }

      return var2;// 66
   }
}
