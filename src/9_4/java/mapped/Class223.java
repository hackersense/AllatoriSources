package mapped;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.zip.ZipFile;

// $VF: Compiled from l
public class Class223 implements Serializable {
   // $VF: synthetic field
   public static final Class223 field821 = new Class223();
   // $VF: synthetic field
   public String field822;
   // $VF: synthetic field
   public Class252[] field823;

   // $VF: synthetic method
   public byte[] method417(String var1, String var2) {
      Class223 var3 = this;
      DataInputStream var8 = null;// 369

      try {
         InputStream var4;
         if ((var4 = var3.method419(var1, var2)) == null) {// 382 511
            throw new IOException("Couldn't find: " + var1 + var2);// 210
         }

         var8 = new DataInputStream(var4);// 103
         byte[] var9 = new byte[var4.available()];// 548
         var8.readFully(var9);// 545
         var10 = var9;// 570
      } finally {
         if (var8 != null) {// 162
            var8.close();// 282
         }
      }

      return var10;// 339
   }

   // $VF: synthetic method
   public InputStream method418(String var1) {
      Class223 var2 = this;

      for (int var10000 = var4 = 0; var10000 < var2.field823.length; var10000 = ++var4) {// 292
         InputStream var3;
         if ((var3 = var2.field823[var4].method422(var1)) != null) {// 72
            return var3;// 268
         }
      }

      return null;// 536
   }

   // $VF: synthetic method
   public InputStream method419(String var1, String var2) {
      Class223 var3 = this;
      InputStream var5 = null;// 336

      try {
         var5 = var3.getClass().getClassLoader().getResourceAsStream(var1 + var2);// 291
      } catch (Exception var4) {
         return var5 != null ? var5 : this.method423(var1, var2).method743();// 137 216 299
      }

      return var5 != null ? var5 : this.method423(var1, var2).method743();
   }

   // $VF: synthetic method
   public static final void method420(String var0, List var1) {
      if (var0 != null) {// 399
         StringTokenizer var2 = new StringTokenizer(var0, File.pathSeparator);// 232

         while (var2.hasMoreTokens()) {// 463
            var0 = var2.nextToken();// 198
            if (new File(var0).exists()) {// 28 424
               var1.add(var0);// 588
            }
         }
      }
   }// 257

   // $VF: synthetic method
   public String method421(String var1, String var2) {
      return this.method423(var1, var2).method745();// 11
   }

   // $VF: synthetic method
   public InputStream method422(String var1) {
      return this.method419(var1.replace('.', '/'), ".class");// 411
   }

   /** @deprecated */
   // $VF: synthetic method
   public Class223() {
      this(method20());// 567
   }// 400

   // $VF: synthetic method
   public Class396 method423(String var1, String var2) {
      Class223 var3 = this;

      for (int var10000 = var5 = 0; var10000 < var3.field823.length; var10000 = ++var5) {// 107
         Class396 var4;
         if ((var4 = var3.field823[var5].method423(var1, var2)) != null) {// 110
            return var4;// 221
         }
      }

      throw new IOException("Couldn't find: " + var1 + var2);// 193
   }

   // $VF: synthetic method
   public boolean equals(Object var1) {
      return var1 instanceof Class223 ? this.field822.equals(((Class223)var1).field822) : false;// 415 555 579
   }

   // $VF: synthetic method
   public Class223(String var1) {
      this.field822 = var1;// 185 406
      ArrayList var2 = new ArrayList();// 1
      StringTokenizer var7 = new StringTokenizer(var1, System.getProperty("path.separator"));// 46

      while (var7.hasMoreTokens()) {// 170
         String var3;
         if (!(var3 = var7.nextToken()).equals("")) {// 58 553
            File var6 = new File(var3);// 190

            try {
               if (var6.exists()) {// 465
                  if (var6.isDirectory()) {// 132
                     var2.add(new Class253(var3));// 184
                  } else {
                     var2.add(new Class254(new ZipFile(var6)));// 488
                  }
               }
            } catch (IOException var5) {// 493
               System.err.println("CLASSPATH component " + var6 + ": " + var5);// 561
            }
         }
      }

      this.field823 = new Class252[var2.size()];// 6
      var2.toArray(this.field823);// 144
   }// 461

   // $VF: synthetic method
   public Class396 method424(String var1) {
      return this.method423(var1, ".class");// 81
   }

   // $VF: synthetic method
   public byte[] method425(String var1) {
      return this.method417(var1, ".class");// 573
   }

   // $VF: synthetic method
   public int hashCode() {
      return this.field822.hashCode();// 68
   }

   // $VF: synthetic method
   public static final String method20() {
      String var0 = System.getProperty("java.class.path");// 160
      String var1 = System.getProperty("sun.boot.class.path");// 40
      String var2 = System.getProperty("java.ext.dirs");// 63
      ArrayList var3 = new ArrayList();// 541
      method420(var0, var3);// 550
      method420(var1, var3);// 510
      ArrayList var6 = new ArrayList();// 456
      method420(var2, var6);// 367
      Iterator var7 = var6.iterator();// 82

      while (var7.hasNext()) {
         File var9 = new File((String)var7.next());// 83
         String[] var4;
         int var5;
         if ((var4 = var9.list(new Class586())) != null) {// 5 24
            for (int var10000 = var5 = 0; var10000 < var4.length; var10000 = var5) {// 286
               StringBuilder var10001 = new StringBuilder().insert(0, var9.getPath()).append(File.separatorChar);
               String var10002 = var4[var5];
               var5++;
               var3.add(var10001.append(var10002).toString());// 600
            }
         }
      }

      StringBuffer var8 = new StringBuffer();// 94
      Iterator var10 = var3.iterator();// 209

      label26:
      while (true) {
         Iterator var11 = var10;

         while (var11.hasNext()) {
            var8.append((String)var10.next());// 69
            if (!var10.hasNext()) {// 116
               continue label26;
            }

            var11 = var10;
            var8.append(File.pathSeparatorChar);// 422
         }

         return var8.toString().intern();// 31
      }
   }

   // $VF: synthetic method
   public String method166(String var1) {
      int var4 = var1.lastIndexOf(46);// 592
      String var3 = "";// 483
      if (var4 > 0) {// 181
         var3 = var1.substring(var4);// 433
         var1 = var1.substring(0, var4);// 125
      }

      return this.method421(var1, var3);// 320
   }

   // $VF: synthetic method
   public URL method426(String var1) {
      Class223 var2 = this;

      for (int var10000 = var4 = 0; var10000 < var2.field823.length; var10000 = ++var4) {// 270
         URL var3;
         if ((var3 = var2.field823[var4].method426(var1)) != null) {// 177
            return var3;// 266
         }
      }

      return null;// 370
   }
}
