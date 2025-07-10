package mapped;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.Vector;

// $VF: Compiled from sq
public class Class550 {
   // $VF: synthetic method
   public static String method1725(File var0, String var1) {
      StringBuffer var2 = new StringBuffer((int)var0.length());// 265
      BufferedReader var4;
      BufferedReader var10000 = var1 != null// 26
         ? (var4 = new BufferedReader(new InputStreamReader(new FileInputStream(var0), var1)))// 52
         : (var4 = new BufferedReader(new FileReader(var0)));// 7

      while ((var5 = var10000.read()) != -1) {// 335
         var10000 = var4;
         var2.append((char)var5);
      }

      var4.close();// 507
      return var2.toString();// 557
   }

   // $VF: synthetic method
   public static void method1726(File var0, File var1) {
      File var2 = var0;
      FileChannel var7 = null;// 1
      FileChannel var3 = null;

      try {
         var7 = new FileInputStream(var2).getChannel();// 170
         var3 = new FileOutputStream(var1).getChannel();// 553
         MappedByteBuffer var8 = var7.map(MapMode.READ_ONLY, 0L, var7.size());// 58
         var3.write(var8);// 190
      } finally {
         if (var7 != null) {// 465
            var7.close();
         }

         if (var3 != null) {// 132
            var3.close();
         }
      }
   }// 534

   // $VF: synthetic method
   public static void method1727(File var0, String var1, String var2) {
      BufferedWriter var4;
      (var1 != null ? (var4 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(var0), var1))) : (var4 = new BufferedWriter(new FileWriter(var0))))// 123 141 580
         .write(var2);// 78
      var4.close();// 418
   }// 533

   // $VF: synthetic method
   public static String[] method1728(File var0, String var1, boolean var2) {
      BufferedReader var3;
      if (var1 != null) {// 143
         var3 = new BufferedReader(new InputStreamReader(new FileInputStream(var0), var1));// 252
      } else {
         var3 = new BufferedReader(new FileReader(var0));// 204
      }

      Vector var4 = new Vector();// 310

      label27:
      while (true) {
         BufferedReader var9 = var3;// 498

         while ((var6 = var9.readLine()) != null) {
            if (var2) {// 484
               if (var6.length() <= 0) {// 409
                  continue label27;
               }

               var9 = var3;
               var4.add(var6);// 389
            } else {
               var4.add(var6);// 513
               var9 = var3;
            }
         }

         var3.close();// 530
         String[] var7 = new String[var4.size()];// 491
         return (String[])var4.toArray(var7);// 147
      }
   }
}
