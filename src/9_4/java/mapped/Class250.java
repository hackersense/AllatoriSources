package mapped;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

// $VF: Compiled from gd
public class Class250 implements Class248 {
   // $VF: synthetic field
   public static Map field847 = new HashMap();
   // $VF: synthetic field
   public Class223 field848 = null;
   // $VF: synthetic field
   public Map field849 = new HashMap();
   // $VF: synthetic field
   public static final String field850 = Class223.method20();

   // $VF: synthetic method
   @Override
   public void method19() {
      this.field849.clear();// 50
   }// 253

   // $VF: synthetic method
   @Override
   public Class205 method441(Class var1) {
      String var2 = var1.getName();// 108
      Class205 var5;
      if ((var5 = this.method440(var2)) != null) {// 27 242
         return var5;// 94
      } else {
         String var6 = var2;// 69
         int var4;
         if ((var4 = var2.lastIndexOf(46)) > 0) {// 116 422
            var6 = var2.substring(var4 + 1);// 464
         }

         return this.method446(var1.getResourceAsStream(var6 + ".class"), var2);// 31
      }
   }

   // $VF: synthetic method
   public static Class250 method445() {
      return method447(Class223.field821);// 465
   }

   // $VF: synthetic method
   public Class205 method446(InputStream var1, String var2) {
      InputStream var5 = var1;
      Class250 var6 = this;

      try {
         if (var5 != null) {// 440
            Class205 var3 = new Class410(var5, var2).method765();// 97 248
            var6.method389(var3);// 411
            return var3;// 468
         }
      } catch (IOException var4) {// 285
         throw new ClassNotFoundException("Exception while looking for class " + var2 + ": " + var4.toString());// 119
      }

      throw new ClassNotFoundException("SyntheticRepository could not load " + var2);// 423
   }

   // $VF: synthetic method
   public static Class250 method447(Class223 var0) {
      Class250 var2;
      if ((var2 = (Class250)field847.get(var0)) == null) {// 159 495
         var2 = new Class250(var0);// 493
         field847.put(var0, var2);// 561
      }

      return var2;// 604
   }

   // $VF: synthetic method
   @Override
   public void method442(Class205 var1) {
      this.field849.remove(var1.method93());// 246
   }// 552

   // $VF: synthetic method
   @Override
   public Class223 method444() {
      return this.field848;// 291
   }

   // $VF: synthetic method
   @Override
   public void method389(Class205 var1) {
      this.field849.put(var1.method93(), new SoftReference(var1));// 272
      var1.method348(this);// 321
   }// 179

   // $VF: synthetic method
   @Override
   public Class205 method443(String var1) {
      Class250 var6 = this;
      if (var1 != null && !var1.equals("")) {// 412
         String var5 = var1.replace('/', '.');// 269
         Class205 var2;
         if ((var2 = this.method440(var5)) != null) {// 148 455
            return var2;// 236
         } else {
            try {
               return var6.method446(var6.field848.method422(var5), var5);// 368
            } catch (IOException var3) {// 99
               throw new ClassNotFoundException("Exception while looking for class " + var5 + ": " + var3.toString());// 160
            }
         }
      } else {
         throw new IllegalArgumentException("Invalid class name " + var1);// 38
      }
   }

   // $VF: synthetic method
   public Class250(Class223 var1) {
      this.field848 = var1;// 46 170
   }// 553

   // $VF: synthetic method
   @Override
   public Class205 method440(String var1) {
      SoftReference var3;
      return (var3 = (SoftReference)this.field849.get(var1)) == null ? null : (Class205)var3.get();// 59 330 391 579
   }
}
