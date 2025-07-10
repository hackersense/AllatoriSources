package mapped;

import smardecSB.ProductInformation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import java.util.zip.CRC32;
import java.util.zip.ZipException;
import java.util.zip.ZipOutputStream;

// $VF: Compiled from rq
public class Class446 {
   // $VF: synthetic field
   public final String field1339 = ".tmp";
   // $VF: synthetic field
   public HashSet field1340;
   // $VF: synthetic field
   public Class338 field1341;
   // $VF: synthetic field
   public Hashtable field1342;
   // $VF: synthetic field
   public boolean field1343;
   // $VF: synthetic field
   public Vector field1344 = new Vector();

   // $VF: synthetic method
   public void method913(Class206 var1, JarOutputStream var2, Class338 var3, String var4) {
      Class446 var13 = this;
      String var5;
      String var6 = var5 = var1.method93();// 129 258
      if (Class580.method1930().field1196 != null) {// 437
         var6 = Class580.method1930().field1196.method1341(var5);
      }

      String var9;
      if ((var9 = var3.method556(var4 + '#' + var6)) == null) {// 110 221
         var9 = "";
      }

      var5 = var9 + var5.replace('.', '/') + ".class";// 444
      JarEntry var10 = new JarEntry(var5);// 601
      this.method919(var5, var2);// 193

      try {
         var2.putNextEntry(var10);// 486
         JarOutputStream var16;
         if (var1.method84() > 50) {// 117
            Class438 var11 = new Class438(var3, Class580.method1930().field1196);// 300
            Class508 var12 = new Class508(var1.method136().method207());// 296
            Class345 var15 = new Class345(var13, 2, var11);// 404
            var16 = var2;
            var12.method1396(var15, 4);// 212
            var2.write(var15.method633());// 365
         } else {
            var16 = var2;// 263
            var2.write(var1.method136().method207());
         }

         var16.closeEntry();// 532
      } catch (Exception var7) {// 297
         var7.printStackTrace();// 11
      }
   }// 91 551

   // $VF: synthetic method
   public void method914() {
      Class446 var1 = this;

      for (int var10000 = var3 = 0; var10000 < var1.field1344.size(); var10000 = var3) {// 508
         String var2 = (String)var1.field1344.get(var3);// 517
         var3++;
         var1.method918(var2);// 214
      }
   }// 371

   // $VF: synthetic method
   public void method915(String var1, String var2, Class338 var3) {
      Class446 var13 = this;
      this.field1341 = var3;// 513
      this.field1342 = new Hashtable();// 93
      byte[] var4 = new byte[262144];// 151
      String var5 = "";// 491
      JarFile var6 = new JarFile(var1);// 147
      JarOutputStream var7 = new JarOutputStream(new FileOutputStream(var2 + ".tmp"));// 295
      HashSet var8 = new HashSet();// 226
      if (Class580.method1938().method720()) {// 123
         try {
            Field var9;
            if ((var9 = ZipOutputStream.class.getDeclaredField("names")) != null) {// 418 533
               var9.setAccessible(true);
               var8 = (HashSet)var9.get(var7);// 185 406
            }
         } catch (RuntimeException var23) {// 46
            if (var23.getClass().getName().endsWith("InaccessibleObjectException")) {// 170
               Class528.method1558(
                  "Use '--add-opens java.base/java.util.zip=ALL-UNNAMED' Java launcher option to keep output jar duplicate entries https://allatori.com/doc.html#property-output-jar-duplicate-name-entries"// 553
               );
            }
         } catch (Exception var24) {// 190
         }
      }

      if (Class580.method1938().method723() != -1) {// 184
         var7.setLevel(Class580.method1938().method723());
      }

      Vector var30 = new Vector();// 534
      Enumeration var10 = var6.entries();// 488

      while (true) {
         Enumeration var10000 = var10;

         JarEntry var11;
         InputStream var31;
         JarEntry var32;
         while (true) {
            if (!var10000.hasMoreElements()) {
               var13.method924(var30, var7, var3, var1);
               var13.method924(var3.method563(), var7, var3, var1);// 135 253
               var6.close();// 443
               if (Class580.method1932().method1872() && !Class580.method1932().method1858()) {// 166
                  var13.method917(var7);// 434
               }

               var7.finish();// 292
               var7.close();// 373
               var13.method922(var2 + ".tmp", var2);// 268
               return;// 497
            }

            if ((var11 = (JarEntry)var10.nextElement()).isDirectory()) {// 159 495
               var10000 = var10;
            } else {
               String var12;
               if (var11.getName().endsWith(".class") && (var12 = var3.method555(var1 + '#' + var11.getName())) != null) {// 272 321 493
                  var5 = var3.method556(var1 + '#' + var12);// 146
                  Class206 var25;
                  if ((var25 = var3.method557(var12)) != null && !Class580.method1924().method2043(var3, var25)) {// 400 567
                     var10000 = var10;
                     var30.add(var25);// 33
                     continue;// 0
                  }
               }

               if (var11.getName().equals("META-INF/INDEX.LIST")) {// 603
                  var10000 = var10;
                  var13.field1344.add(var2);// 278
               } else {
                  var31 = var6.getInputStream(var11);// 485
                  String var26 = var11.getName();// 59
                  if (Class580.method1923().method1655().method1631()) {// 391
                     if (var5 == null && var1.endsWith(".war")) {// 330
                        var5 = "WEB-INF/classes/";
                     }

                     if (var11.getName().startsWith("BOOT-INF/classes/")) {// 589
                        var5 = "BOOT-INF/classes/";
                     }

                     if (var11.getName().startsWith("WEB-INF/classes/")) {// 579
                        var5 = "WEB-INF/classes/";
                     }

                     var26 = Class416.method834(var5, var11.getName());// 555
                  }

                  Class206 var14;
                  if (Class580.method1933().method1919()// 415
                     && "com/license4j/resources/d.bfi".equals(var11.getName())// 398
                     && (var14 = var3.method557("com.license4j.HardwareID")) != null) {// 87 428
                     String var27;
                     if ((var27 = var14.method93()).indexOf(46) > 0) {// 399 586
                        String var28 = var27.substring(0, var27.lastIndexOf(46) + 1).replace('.', '/');// 232 463
                        var26 = var28 + Class580.method1933().method1920();// 198
                     } else {
                        var26 = Class580.method1933().method1920();// 28
                     }
                  }

                  var32 = new JarEntry(var26);// 257
                  if (!var26.endsWith(".jar")) {// 269
                     break;
                  }

                  boolean var15 = false;// 455
                  Iterator var29 = Class580.method1935().method1349().iterator();// 148

                  while (true) {
                     if (!var29.hasNext()) {
                        var39 = var15;// 223
                        break;
                     }

                     Class351 var16;
                     if ((var16 = (Class351)var29.next()).field1048.equals(var1) && var16.field1047.equals(var11.getName())) {// 236
                        if (var11.getMethod() == 0) {// 39
                           var32.setMethod(0);
                        }

                        File var34 = new File(var16.field1050);// 99
                        var32.setSize(var34.length());// 160
                        FileInputStream var17 = new FileInputStream(var34);// 63
                        CRC32 var18 = new CRC32();// 367
                        FileInputStream var37 = var17;// 83

                        int var19;
                        while ((var19 = var37.read(var4)) > 0) {
                           var37 = var17;
                           var18.update(var4, 0, var19);// 5
                        }

                        var32.setCrc(var18.getValue());// 450
                        var17.close();// 386
                        var17 = new FileInputStream(var34);// 470
                        var13.method919(var32.getName(), var7);// 157

                        try {
                           var7.putNextEntry(var32);// 286
                           if (Class580.method1938().method720()) {// 600
                              var8.clear();// 108
                           }

                           FileInputStream var38 = var17;// 27

                           while ((var19 = var38.read(var4)) > 0) {
                              var38 = var17;
                              var7.write(var4, 0, var19);// 242
                           }

                           var17.close();// 94
                           var7.closeEntry();// 209
                        } catch (ZipException var21) {// 69
                           if (!var21.getMessage().contains("duplicate")) {// 116
                              throw var21;
                           }
                        }

                        var39 = var15 = true;// 464
                        break;// 25
                     }
                  }

                  if (!var39 && var11.getMethod() == 0) {
                     var32.setMethod(0);
                     var32.setSize(var11.getSize());// 23
                     var32.setCrc(var11.getCrc());// 45 440
                  }

                  if (!var15) {// 411
                     break;
                  }

                  var10000 = var10;
               }
            }
         }

         var13.method919(var32.getName(), var7);// 138

         try {
            var7.putNextEntry(var32);// 119
            if (Class580.method1938().method720()) {// 238
               var8.clear();// 423
            }

            boolean var10001 = Class580.method1923().method1655().method1632(var11.getName());// 525
            InputStream var40 = var31;
            JarOutputStream var41;
            if (var10001) {
               Class416.method837(var31, var7, Class580.method1923().method1655().method1633(var11.getName()));// 220
               var41 = var7;
            } else {
               int var33;
               while ((var33 = var40.read(var4)) > 0) {// 540
                  var40 = var31;
                  var7.write(var4, 0, var33);// 291
               }

               var41 = var7;// 169
            }

            var41.closeEntry();
         } catch (ZipException var22) {// 216
            if (!var22.getMessage().contains("duplicate")) {// 299
               throw var22;
            }
         }
      }
   }

   // $VF: synthetic method
   public String method916(JarFile var1, JarEntry var2) {
      JarFile var5 = var1;

      try {
         InputStream var6 = var5.getInputStream(var2);// 218
         Class206 var3 = new Class206(new Class410(var6, var2.getName()).method765());// 109
         var6.close();// 213
         return var2.getName().substring(0, var2.getName().length() - var3.method93().length() - 6);// 15
      } catch (Exception var4) {// 385
         return "";// 471
      }
   }

   // $VF: synthetic method
   public void method917(JarOutputStream var1) {
      if (Class580.method1932().method1867() == null) {// 544
         var1.setComment("Obfuscation by " + ProductInformation.getName() + " " + ProductInformation.getWebsiteString());// 114
      } else {
         var1.setComment(Class580.method1932().method1867());// 102
      }
   }// 105

   // $VF: synthetic method
   public void method918(String var1) {
      String var3 = var1;

      try {
         File var4 = new File(var3);// 14
         Runtime.getRuntime().exec("jar -i " + var4.getName(), null, var4.getParentFile());// 514
      } catch (Exception var2) {// 374
      }
   }// 361 453

   // $VF: synthetic method
   public void method919(String var1, JarOutputStream var2) {
      Class446 var3 = this;
      String var4 = "";// 340

      label18:
      while (true) {
         String var10000 = var1;// 274

         while (var10000.indexOf(47) > 0) {
            var4 = var4 + var1.substring(0, var1.indexOf(47) + 1);// 558
            var1 = var1.substring(var1.indexOf(47) + 1);// 501
            if (var3.field1342.containsKey(var4)) {// 337
               continue label18;
            }

            var10000 = var1;
            var3.field1342.put(var4, ".tmp");// 208
            var2.putNextEntry(new JarEntry(var4));// 168
            var2.closeEntry();// 237
         }

         return;// 504
      }
   }

   // $VF: synthetic method
   public static HashSet method920(Class446 var0) {
      return var0.field1340;
   }

   // $VF: synthetic method
   public Class446() {
      this.field1340 = new HashSet();// 227
      this.field1343 = false;// 55
   }

   // $VF: synthetic method
   public void method921(String[] var1, String var2) {
      byte[] var9 = new byte[262144];// 318
      JarOutputStream var4 = new JarOutputStream(new FileOutputStream(var2 + ".tmp"));// 306
      if (Class580.method1938().method723() != -1) {// 8
         var4.setLevel(Class580.method1938().method723());
      }

      Hashtable var5 = new Hashtable();// 331

      int var6;
      for (int var10000 = var6 = 0; var10000 < var1.length; var10000 = var6) {// 384
         JarFile var7;
         Enumeration var8;
         Enumeration var14 = var8 = (var7 = new JarFile(var1[var6])).entries();// 130 301

         while (var14.hasMoreElements()) {
            JarEntry var11 = (JarEntry)var8.nextElement();// 602
            if (var5.containsKey(var11.getName())) {// 363
               var14 = var8;
            } else {
               var5.put(var11.getName(), "");// 509
               InputStream var10 = var7.getInputStream(var11);// 35
               JarEntry var12 = new JarEntry(var11.getName());// 233
               var4.putNextEntry(var12);// 271
               InputStream var15 = var10;// 357

               while ((var13 = var15.read(var9)) > 0) {
                  var15 = var10;
                  var4.write(var9, 0, var13);// 47
               }

               var4.closeEntry();// 182
               var14 = var8;
            }
         }

         var6++;
         var7.close();// 122
      }

      if (Class580.method1932().method1872() && !Class580.method1932().method1858()) {// 346
         this.method917(var4);// 228
      }

      var4.finish();// 334
      var4.close();// 219
      this.method922(var2 + ".tmp", var2);// 333
   }// 284

   // $VF: synthetic method
   public void method922(String var1, String var2) {
      File var4 = new File(var1);// 64
      File var3;
      if ((var3 = new File(var2)).exists() && !var3.delete()) {// 249 469
         Class528.method1558("Cannot delete '" + var3.getPath() + "'");// 349
      }

      if (!var4.renameTo(var3)) {// 196
         Class528.method1558("Cannot rename '" + var4.getPath() + "' to '" + var3.getPath() + "'");// 164
         Class528.method1558("Resulting file is '" + var4.getPath() + "'");// 554
      }
   }// 89

   // $VF: synthetic method
   public static boolean method923(Class446 var0) {
      return var0.field1343;
   }

   // $VF: synthetic method
   public void method924(Vector var1, JarOutputStream var2, Class338 var3, String var4) {
      Class446 var5 = this;

      for (int var10000 = var6 = var1.size() - 1; var10000 >= 0; var10000 = var6) {// 235
         Class206 var10001 = (Class206)var1.get(var6);
         var6--;
         var5.method913(var10001, var2, var3, var4);// 280
      }
   }// 370

   // $VF: synthetic method
   public static boolean method925(Class446 var0, boolean var1) {
      return var0.field1343 = var1;// 239
   }
}
