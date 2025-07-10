package com.allatori.wtk;

import com.allatori.Obfuscate;
import com.sun.kvem.environment.Obfuscator;
import java.io.File;
import java.io.IOException;
import java.util.StringTokenizer;
import mapped.Class528;
import mapped.Class550;
import mapped.Class580;

// $VF: Compiled from ee
public class WTKObfuscator implements Obfuscator {
   // $VF: synthetic field
   public String field2449 = "allatori.xml";

   // $VF: synthetic method
   public void run(File var1, String var2, String var3, String var4, String var5, String var6, String var7) {
      String var12;
      if (!var5.endsWith("/") && !var5.endsWith("\\")) {// 34 332
         var12 = var5 + "/" + this.field2449;// 143
      } else {
         var12 = var5 + this.field2449;// 260
      }

      File var13;
      File var10000;
      if ((var13 = new File(var12)).exists() && !var13.canWrite()) {// 20 204
         Class528.method1557("Using the existing configuration file.");// 239
         var10000 = var13;
      } else {
         String var9 = this.method2096(var1, var2, var3, var4, var5, var6, var7);// 498

         try {
            Class550.method1727(var13, "UTF-8", var9);// 409
         } catch (Exception var11) {// 389
            var11.printStackTrace();// 18
            throw new IOException();// 513
         }

         var10000 = var13;
      }

      try {
         Class580.method1931(var10000.getPath());// 491
         Obfuscate.method1479();// 147
         Class580.method1934();// 295
      } catch (Exception var10) {// 338
         var10.printStackTrace();// 273
         throw new IOException();// 161
      }
   }// 141

   // $VF: synthetic method
   public String method2096(File var1, String var2, String var3, String var4, String var5, String var6, String var7) {
      StringBuffer var8;
      (var8 = new StringBuffer()).append("<config>\n");// 78 418
      var8.append("    <jars>\n");// 533
      var8.append("        <jar in=\"" + var4 + "\" out=\"" + var1.getPath() + "\"/>\n");// 185
      var8.append("    </jars>\n\n");// 406
      var8.append("    <classpath>\n");// 1
      StringTokenizer var9 = new StringTokenizer(var6, System.getProperty("path.separator"));// 46
      StringTokenizer var10000 = var9;// 170

      while (var10000.hasMoreTokens()) {
         var10000 = var9;// 553
         var3 = var9.nextToken();
         var8.append("        <jar name=\"" + var3 + "\"/>\n");// 58
      }

      var8.append("    </classpath>\n\n");// 315
      var8.append("    <keep-names>\n");// 465
      var8.append("        <class template=\"class * extends javax.microedition.midlet.MIDlet\"/>\n");// 132
      var8.append("    </keep-names>\n\n");// 184
      var8.append("    <property name=\"line-numbers\" value=\"remove\"/>\n");// 534
      var8.append("    <property name=\"string-encryption\" value=\"disable\"/>\n");// 488
      var8.append("    <property name=\"member-reorder\" value=\"enable\"/>\n");// 495
      var8.append("    <property name=\"control-flow-obfuscation\" value=\"enable\"/>\n");// 159
      var8.append("    <property name=\"local-variables-naming\" value=\"remove\"/>\n");// 493
      var8.append("</config>\n");// 561
      return var8.toString();// 377
   }

   // $VF: synthetic method
   public void createScriptFile(File var1, File var2) {
   }// 335
}
