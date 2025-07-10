package mapped;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

// $VF: Compiled from wq
public class Class393 {
   // $VF: synthetic field
   public static final String field1199 = "-=404=-";
   // $VF: synthetic field
   public Class338 field1200;
   // $VF: synthetic field
   public static final Vector field1201 = new Vector();
   // $VF: synthetic field
   public static final Set field1202 = new Class216();
   // $VF: synthetic field
   public Vector field1203;
   // $VF: synthetic field
   public Hashtable field1204 = new Hashtable();
   // $VF: synthetic field
   public Hashtable field1205;
   // $VF: synthetic field
   public Set field1206 = new TreeSet();

   // $VF: synthetic method
   public Class393(Class338 var1) {
      this.field1205 = new Hashtable();// 498
      this.field1200 = var1;// 18 389
   }// 513

   // $VF: synthetic method
   public Set method725(Class206 var1) {
      TreeSet var3 = new TreeSet();// 87
      this.method737(var3, var1.method93());// 586
      return var3;// 399
   }

   // $VF: synthetic method
   public Set method726(Set var1, Set var2) {
      TreeSet var3 = new TreeSet();// 227
      Set var4 = var1.size() < var2.size() ? var1 : var2;// 55
      Set var5 = var1.size() < var2.size() ? var2 : var1;// 77

      for (Object var6 : var4) {// 129 288
         if (var5.contains(var6)) {// 258
            var3.add(var6);// 107
         }
      }

      return var3;// 110
   }

   // $VF: synthetic method
   public void method727(String var1, Class206 var2) {
      if (this.field1200.method557(var1) != null) {// 377
         Vector var4;
         if ((var4 = (Vector)this.field1204.get(var1)) == null) {// 22 604
            var4 = new Vector();
         }

         var4.add(var2);// 6
         this.field1204.put(var1, var4);// 144
      }
   }// 358

   // $VF: synthetic method
   public boolean method728(Class208 var1) {
      return !var1.method163() && !var1.method254();// 555
   }

   // $VF: synthetic method
   public boolean method729(String var1, String var2, String var3) {
      return this.field1206.contains(var1 + "&" + var2 + "&" + var3);// 273
   }

   // $VF: synthetic method
   public void method730() {
      Class393 var3 = this;
      Hashtable var4 = new Hashtable();// 125

      int var2;
      for (int var10000 = var2 = 0; var10000 < var3.field1203.size(); var10000 = ++var2) {// 413
         Class206 var6 = (Class206)var3.field1203.get(var2);// 320
         var4.put(var6, "");// 478
         Vector var7 = var3.method731(var6.method93());// 212
         int var1 = 0;

         for (int var8 = var1; var8 < var7.size(); var8 = ++var1) {// 365
            Class206 var5 = (Class206)var7.get(var1);// 366
            if (var4.containsKey(var5)) {// 263
               Class528.method1559("Incorrect classes order");// 225
            }
         }
      }
   }// 426

   // $VF: synthetic method
   public Vector method731(String var1) {
      Vector var3;
      return (var3 = (Vector)this.field1204.get(var1)) != null ? var3 : field1201;// 491 530
   }

   // $VF: synthetic method
   public void method732(Class206 var1) {
      Class393 var2 = this;
      Set var5 = this.method742(var1);// 321
      Set var4;
      Set var3 = this.method733(var4 = this.method725(var1));// 146 179
      Iterator var6;
      Iterator var7 = var6 = this.method726(var5, var3).iterator();// 400 567

      while (var7.hasNext()) {
         Set var8 = var2.field1206;// 33
         StringBuilder var10 = new StringBuilder().insert(0, var1.method93()).append("&");
         var7 = var6;
         var8.add(var10.append(var6.next()).toString());
      }

      var2.method736(var4, var3);// 0
   }// 240

   // $VF: synthetic method
   public Set method733(Set var1) {
      Class393 var2 = this;
      if (var1.contains("-=404=-")) {// 386
         return field1202;// 470
      } else {
         TreeSet var5 = new TreeSet();// 157

         for (String var4 : var1) {// 24 286
            if (var2.field1200.method557(var4) == null) {// 600
               try {
                  for (int var16 = (var14 = Class.forName(var4, false, var2.field1200.method559()).getDeclaredMethods()).length - 1; var16 >= 0; var16--) {// 27 94 242
                     Method var7 = var14[var16];// 209
                     if (var2.method740(var7)) {// 69
                        var5.add(var7.getName() + "&" + Class138.method149(var7));// 116
                     }
                  }
               } catch (ClassNotFoundException var8) {// 464
               } catch (NoClassDefFoundError var9) {// 25
                  String var12;
                  if ((var12 = var9.getMessage()).length() > 0) {// 21 115
                     String var13 = var12.replace('/', '.');// 223
                     if (!var2.field1205.containsKey(var13)) {// 45
                        var2.field1205.put(var13, "");// 23
                        Class528.method1558("Class '" + var13 + "' cannot be found.");// 440
                     }
                  }
               } catch (VerifyError var10) {// 411
                  Class528.method1558("Cannot read class. Possible JVM compile and runtime versions mismatch: " + var10.getMessage());// 468
               }
            } else {
               int var11;
               if (Class580.method1924().method2043(var2.field1200, var2.field1200.method557(var4))) {// 285
                  Class208[] var3;
                  for (int var10000 = var11 = (var3 = var2.field1200.method557(var4).method341()).length - 1; var10000 >= 0; var10000 = --var11) {// 32 119
                     Class208 var6;
                     if (!(var6 = var3[var11]).method163() && !var6.method254()) {// 238 423
                        var5.add(new StringBuilder().insert(0, var6.method190()).append("&").append(var6.method20()).toString());// 61
                     }
                  }
               }
            }
         }

         return var5;// 336
      }
   }

   // $VF: synthetic method
   public void method734(Class206 var1) {
      Class393 var3 = this;
      this.method727(var1.method190(), var1);// 184

      String[] var2;
      for (int var10000 = var4 = (var2 = var1.method130()).length - 1; var10000 >= 0; var10000 = var4) {// 488 534
         var3.method727(var2[var4--], var1);// 495
      }
   }// 159

   // $VF: synthetic method
   public void method735() {
      Class393 var1 = this;
      Vector var3 = new Vector();// 300
      Iterator var2;
      Iterator var10000 = var2 = this.field1200.method553();// 245

      while (var10000.hasNext()) {
         var10000 = var2;
         var3.add(var2.next());
      }

      Collections.sort(var3, new Class377(this));// 404
      this.field1203 = new Vector();// 275

      for (Class206 var4 : var3) {// 127 355
         if (var1.method731(var4.method93()).size() == 0) {// 496
            var1.method738(var4);// 369
         }
      }

      Collections.sort(var1.field1203, new Class379(var1));// 382
      var1.method730();// 339
   }// 308

   // $VF: synthetic method
   public void method736(Set var1, Set var2) {
      Class393 var3 = this;
      Iterator var7 = var1.iterator();// 109

      label39:
      while (true) {
         for (Iterator var10000 = var7; var10000.hasNext(); var10000 = var7) {
            String var5 = (String)var7.next();// 213
            if (!"-=404=-".equals(var5)) {// 15
               Class206 var6;
               if ((var6 = var3.field1200.method557(var5)) != null && var6.method101()) {// 385 471
                  Iterator var4;
                  var10000 = var4 = var3.method726(var3.method742(var6), var2).iterator();// 177 270 582

                  while (var10000.hasNext()) {
                     Set var9 = var3.field1206;// 266
                     StringBuilder var10002 = new StringBuilder().insert(0, var6.method93()).append("&");
                     var10000 = var4;
                     var9.add(var10002.append(var4.next()).toString());
                  }
               }
               continue label39;
            }
         }

         return;// 370
      }
   }

   // $VF: synthetic method
   public void method737(Set var1, String var2) {
      Class393 var4 = this;
      var1.add(var2);// 424
      Class206 var3 = this.field1200.method557(var2);// 28
      if (var3 != null) {// 588
         this.method737(var1, var3.method190());// 329

         int var5;
         for (int var10000 = var5 = (var7 = var3.method130()).length - 1; var10000 >= 0; var10000 = var5) {// 38 412
            var4.method737(var1, var7[var5--]);// 257
         }
      } else {
         try {
            Class var8;
            if ((var8 = Class.forName(var2, false, var4.field1200.method559())).getSuperclass() != null) {// 148 236
               var4.method737(var1, var8.getSuperclass().getName());// 142
            }

            Class[] var10;
            int var9 = (var10 = var8.getInterfaces()).length - 1;// 39 368

            while (var9 >= 0) {
               var4.method737(var1, var10[var9--].getName());// 99
            }
         } catch (Exception var6) {// 63
            var1.add("-=404=-");// 541
            if (!var4.field1205.containsKey(var2)) {// 550
               var4.field1205.put(var2, "");// 510
               Class528.method1558("Class '" + var2 + "' cannot be found.");// 456
            }
         }
      }
   }// 5

   // $VF: synthetic method
   public void method738(Class206 var1) {
      Class393 var2 = this;
      this.field1203.remove(var1);// 499
      this.field1203.add(0, var1);
      String var4 = var1.method190();// 76 390
      Class206 var5 = this.field1200.method557(var4);// 573
      if (var5 != null) {// 520
         this.method738(var5);// 502
      }

      for (int var10000 = var6 = (var7 = var1.method130()).length - 1; var10000 >= 0; var10000 = --var6) {// 172 564
         Class206 var3;
         if ((var3 = var2.field1200.method557(var7[var6])) != null) {// 48 281
            var2.method738(var3);// 438
         }
      }
   }// 483

   // $VF: synthetic method
   public Vector method739() {
      return this.field1203;// 226
   }

   // $VF: synthetic method
   public boolean method740(Method var1) {
      return !Modifier.isPrivate(var1.getModifiers()) && !Modifier.isStatic(var1.getModifiers());// 373
   }

   // $VF: synthetic method
   public void method741() {
      Class393 var2 = this;
      Iterator var1;
      Iterator var10000 = var1 = this.field1200.method553();// 533

      while (var10000.hasNext()) {
         Class206 var3 = (Class206)var1.next();// 185
         var10000 = var1;
         var2.method734(var3);
         var2.method732(var3);// 1 406
      }

      if (var2.field1205.size() > 0) {// 170
         Class528.method1558(
            "Some classes weren't found. It may result in weaker obfuscation. Add needed jars to the 'classpath' element of the configuration file."// 553
         );
      }

      var2.method735();// 58
   }// 190

   // $VF: synthetic method
   public Set method742(Class206 var1) {
      Class393 var2 = this;
      TreeSet var4 = new TreeSet();// 603

      int var3;
      for (int var10000 = var3 = (var6 = var1.method341()).length - 1; var10000 >= 0; var10000 = --var3) {// 278 466
         Class208 var5 = var6[var3];// 467
         if (var2.method728(var5)) {// 485
            var4.add(var5.method190() + "&" + var5.method20());// 68
         }
      }

      return var4;// 391
   }
}
