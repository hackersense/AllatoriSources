package mapped;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

// $VF: Compiled from dr
public class Class521 {
   // $VF: synthetic method
   public static void method1477(String var0, Class338 var1) {
      String var2 = var0;
      JarFile var4;
      Enumeration var3 = (var4 = new JarFile(var0)).entries();// 10 52

      while (var3.hasMoreElements()) {
         JarEntry var6;
         if (!(var6 = (JarEntry)var3.nextElement()).isDirectory() && var6.getName().endsWith(".class")) {// 7 335
            try {
               var1.method562(method1478(var4.getInputStream(var6), var6.getName()), var2, var6.getName());// 557
            } catch (Exception var5) {
               if (!var6.getName().endsWith("module-info.class")) {// 332
                  Class528.method1559("Cannot parse class " + var6.getName());// 260
               }
            }
         }
      }

      var4.close();// 20
   }// 204

   // $VF: synthetic method
   public static Class206 method1478(InputStream var0, String var1) {
      Class206 var4 = new Class206(new Class410(var0, var1).method765());// 498
      var0.close();// 484
      return var4;// 409
   }
}
