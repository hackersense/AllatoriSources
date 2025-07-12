package com.allatori;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import mapped.Class516;
import mapped.Class522;
import mapped.Logger;
import mapped.Class555;
import mapped.Class600;

// $VF: Compiled from lt
public class StackTrace2 {
   // $VF: synthetic method
   public static void main(String[] var0) {
      String[] var2 = var0;
      System.out.println(Class522.funnyASCII());// 26

      try {
         if (var2.length != 3) {// 10
            method1495();// 7
            System.exit(0);// 335
         }

         Class555 var1 = null;// 557
         String var10 = var2[0];// 34

         String[] var10000;
         label43: {
            try {
               var1 = Class516.method1464(new InputStreamReader(new FileInputStream(var10), "UTF-8"));// 30
            } catch (FileNotFoundException var7) {// 143
               Logger.error("Log file not found: " + var7.getMessage());// 252
               System.exit(0);// 20
               var10000 = var2;
               break label43;// 498
            } catch (Exception var8) {// 204
               Logger.error("Error reading log file: " + var8.getMessage());// 239
               System.exit(0);// 310
               var10000 = var2;// 409
               break label43;
            }

            var10000 = var2;
         }

         String var11 = var10000[1];
         String var4 = var2[2];// 389
         BufferedReader var3 = null;// 18

         try {
            var3 = new BufferedReader(new FileReader(var11));// 93
         } catch (FileNotFoundException var5) {// 151
            Logger.error("Input file not found: " + var5.getMessage());// 530
            System.exit(0);// 491
         }

         PrintWriter var12 = null;// 295

         label38: {
            try {
               var12 = new PrintWriter(new BufferedWriter(new FileWriter(var4)));// 273
            } catch (IOException var6) {// 161
               Logger.error("Error writing output file: " + var6.getMessage());// 141
               System.exit(0);// 580
               var13 = var3;// 123
               break label38;
            }

            var13 = var3;
         }

         Class600.method2080(var13, var1, var12);
         var3.close();// 78
         var12.close();// 418
      } catch (Exception var9) {// 533
         System.out.println("Error: " + var9.getMessage());// 185
      }
   }// 1 406

   // $VF: synthetic method
   public static void method1495() {
      System.out.println("Restore Stack Trace Utility");// 493
      System.out.println("Usage:");// 561
      System.out.println("com.allatori.StackTrace2 <log file> <input file> <output file>");// 6
   }// 144

   // $VF: synthetic method
   public static String restoreStackTrace(File var0, String var1) {
      Class555 var4 = Class516.method1464(new InputStreamReader(new FileInputStream(var0), "UTF-8"));// 553
      BufferedReader var6 = new BufferedReader(new StringReader(var1));// 58
      StringWriter var5 = new StringWriter();// 190
      PrintWriter var2 = new PrintWriter(var5);// 315
      Class600.method2080(var6, var4, var2);// 465
      var6.close();// 132
      var2.close();// 184
      return var5.toString();// 534
   }
}
