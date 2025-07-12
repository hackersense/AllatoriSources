package com.allatori;

import mapped.Class338;
import smardecSB.ProductInformation;
import mapped.Class522;
import mapped.Logger;
import mapped.Class580;

// $VF: Compiled from nt
public class Watermark extends Class522 {
   // $VF: synthetic method
   public static void main(String[] args) {
      System.out.println(funnyASCII());// 222
      if (args.length != 2) {// 265
         method1481();// 446
         System.exit(0);// 134
      }

      boolean doExtract = false;// 52
      String[] var10000;
      if ("-add".equals(args[0])) {// 10
         doExtract = false;// 7
         var10000 = args;
      } else if ("-extract".equals(args[0])) {// 335
         doExtract = true;// 507
         var10000 = args;
      } else {
         method1481();// 34
         System.exit(0);// 332
         var10000 = args;// 30
      }

      if (!method1487(var10000[1], doExtract)) {
         System.exit(-1);
      }

      try {
         Class338 var4 = Obfuscate.method1484();// 252
         if (Class580.method1929().method1696()) {// 20
            if (Class580.method1929().method1692() == null) {// 204
               Logger.error("Configuration error. Watermark key is not set.");// 239
               System.exit(0);// 310
            }

            System.out.println("Extracted watermark: \"" + method1493(var4) + "\"");// 484
         } else {
            if (Class580.method1929().method1692() == null) {// 389
               Logger.error("Configuration error. Watermark key is not set.");// 18
               System.exit(0);// 513
            }

            if (Class580.method1929().method1695() == null) {// 151
               Logger.error("Configuration error. Watermark value is not set.");// 530
               System.exit(0);// 491
            }

            method1492(var4);// 295
            method1483(var4);// 338
         }
      } catch (Exception var2) {// 161
         Logger.error(var2.getMessage());// 141
      }

      Class580.method1934();// 226
   }// 123

   // $VF: synthetic method
   public static void method1481() {
      System.out.println(
              ProductInformation.getName() + " " + ProductInformation.getVersionString());// 533
      System.out.println("Usage:");// 185
      System.out.println("com.allatori.Watermark -add <config file>");// 170
      System.out.println("or");// 553
      System.out.println("com.allatori.Watermark -extract <config file>");// 465
   }// 132
}
