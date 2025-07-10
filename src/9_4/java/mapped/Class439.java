package mapped;

import java.io.DataInputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Vector;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

// $VF: Compiled from xs
public class Class439 extends URLClassLoader {
   // $VF: synthetic field
   public Class338 field1288;

   // $VF: synthetic method
   public Class439(URL[] var1) {
      super(var1, Class439.class.getClassLoader());// 557
   }// 34

   // $VF: synthetic method
   public byte[] method875(JarFile var1, ZipEntry var2) {
      byte[] var4 = new byte[(int)var2.getSize()];// 144
      DataInputStream var5;
      (var5 = new DataInputStream(var1.getInputStream(var2))).readFully(var4, 0, var4.length);// 358 461
      var5.close();// 192
      return var4;// 574
   }

   // $VF: synthetic method
   public void method876(Class338 var1) {
      this.field1288 = var1;// 30
   }// 143

   // $VF: synthetic method
   public Class method874(String var1) {
      Class439 var2 = this;

      try {
         String var5 = var1.replace('.', '/').concat(".class");// 226
         Vector var7 = Class580.method1935().method1344();// 123

         int var4;
         for (int var10000 = var4 = 0; var10000 < var7.size(); var10000 = ++var4) {// 78
            Class352 var15 = (Class352)var7.get(var4);// 418
            JarFile var16 = new JarFile(var15.field1049);// 533

            Class var3;
            try {
               ZipEntry var6;
               if ((var6 = var16.getEntry(var5)) == null) {// 1 406
                  continue;
               }

               byte[] var17 = var2.method875(var16, var6);// 46

               try {
                  var3 = var2.defineClass(var1, var17, 0, var17.length);// 553
               } catch (IncompatibleClassChangeError var12) {// 58
                  Class528.method1559("IncompatibleClassChangeError for class " + var1);// 190
                  throw var12;// 315
               }
            } finally {
               if (var16 != null) {// 534
                  var16.close();
               }
            }

            return var3;// 488
         }

         throw new Exception();// 159
      } catch (Exception var14) {// 493
         throw var14;// 561
      }
   }

   // $VF: synthetic method
   public Class findClass(String var1) {
      String var6 = var1;
      Class439 var7 = this;

      try {
         try {
            if (var7.field1288.method557(var6) != null) {// 484
               return var7.method874(var6);// 409
            }
         } catch (Exception var4) {// 389
         }

         return var7.findClass(var6);// 18
      } catch (ClassNotFoundException var5) {
         try {
            return var7.method874(var6);// 530
         } catch (Exception var3) {
            throw var5;// 147
         }
      }
   }
}
