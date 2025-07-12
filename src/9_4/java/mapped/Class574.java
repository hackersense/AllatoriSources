package mapped;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

// $VF: Compiled from zz
public class Class574 {
   // $VF: synthetic method
   public static void method1904(String var0, Class338 var1, String var2) {
      File[] var5 = new File(var0).listFiles();// 10 52

      int var4;
      for (int var10000 = var4 = 0; var10000 < var5.length; var10000 = ++var4) {// 7
         File var7;
         if ((var7 = var5[var4]).isDirectory()) {// 335 507
            method1904(var7.getPath(), var1, var2);
         }

         if (var7.getName().endsWith(".class")) {// 557
            try {
               var1.method552(method1905(new BufferedInputStream(new FileInputStream(var7)), var7.getName()), var2);// 332
            } catch (Exception var6) {
               if (!var7.getName().endsWith("module-info.class")) {// 30
                  Logger.error("Cannot parse class " + var7.getName());// 143
               }
            }
         }
      }
   }// 239

   // $VF: synthetic method
   public static Class206 method1905(InputStream var0, String var1) {
      Class206 var4 = new Class206(new Class410(var0, var1).method765());// 484
      var0.close();// 409
      return var4;// 389
   }
}
