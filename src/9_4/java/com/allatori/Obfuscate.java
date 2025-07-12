package com.allatori;

import java.io.File;
import mapped.Class338;
import smardecSB.ProductInformation;
import mapped.Class522;
import mapped.Logger;
import mapped.Class559;
import mapped.Class580;
import mapped.Class588;

// $VF: Compiled from zy
public class Obfuscate extends Class522 {
   public static void run(File var0) {
      method1488(var0.getPath());// 418
      method1479();// 533
      Class580.method1934();// 185
   }// 406

   public static void main(String[] args) {
      String[] _args;
	   // 332
	   if (args.length > 1 && "-silent".equals(args[1])) {// 52
         Logger.setSilent(true);// 10
	   } else {
         System.out.println(funnyASCII());// 335
	   }
	   _args = args;

	   if (_args.length != 1 && !Logger.isSilent()) {
         showUsage();// 260
         System.exit(0);// 30
      }

      if (!method1485(args[0])) {// 252
         System.exit(-1);
      }

      try {
         method1479();// 204
      } catch (Exception var2) {// 239
         Logger.error(var2.getMessage());// 310
         System.out.println("############### EXCEPTION (" + ProductInformation.getVersionString() + ") ###############");// 498
         var2.printStackTrace();// 484
         System.out.println("#################################################");// 409
         System.exit(-1);// 389
      }

      Class580.method1934();// 513
   }// 530

   public static void method1479() {
      Class338 var0;
      method1480(var0 = method1484());// 170 553
      if (Class580.method1929().method1692() != null && Class580.method1929().method1695() != null) {// 58
         method1492(var0);// 190
      }

      if (Class580.method1932().method1869()) {// 315
         method1486(var0);// 465
      }

      method1483(var0);// 132
      Logger.info("Obfuscation completed. Writing log file...");// 184
      Class559.method1781();// 534
   }// 488

   // $VF: synthetic method
   public static void method1480(Class338 var0) {
      new Class588(var0).method1950();// 493 561
   }// 377

   // $VF: synthetic method
   public static void showUsage () {
      System.out.println(
              ProductInformation.getName() + " " + ProductInformation.getVersionString());// 295
      System.out.println("Usage:");// 338
      System.out.println("com.allatori.Obfuscate <config file>");// 580
   }// 226
}
