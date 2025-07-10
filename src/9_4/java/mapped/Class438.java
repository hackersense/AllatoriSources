package mapped;

import java.net.URL;
import java.net.URLClassLoader;

// $VF: Compiled from hz
public class Class438 extends URLClassLoader {
   // $VF: synthetic field
   public Class499 field1286;
   // $VF: synthetic field
   public Class338 field1287;

   // $VF: synthetic method
   public Class438(Class338 var1, Class499 var2) {
      super(new URL[0], var1.method559());// 52
      this.field1287 = var1;
      this.field1286 = var2;// 7 10
   }// 335

   // $VF: synthetic method
   public Class method874(String var1) {
      Class206 var10001 = this.field1287.method557(var1);// 310
      byte[] var3 = var10001.method136().method207();// 498
      return this.defineClass(var10001.method93(), var3, 0, var3.length);// 484
   }

   // $VF: synthetic method
   public Class findClass(String var1) {
      String var3 = var1;
      Class438 var4 = this;

      try {
         if (var4.field1286.method1338(var3)) {// 332
            var3 = var4.field1286.method1341(var3);
         }

         if (var4.field1287.method557(var3) != null) {// 260
            return var4.method874(var3);
         }
      } catch (Exception var2) {
      }

      return super.findClass(var3);// 252
   }
}
