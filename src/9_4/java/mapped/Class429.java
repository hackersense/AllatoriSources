package mapped;

import smardecSB.ldc;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Vector;

// $VF: Compiled from pz
public class Class429 implements Class418 {
   // $VF: synthetic field
   public static boolean field1270 = false;
   // $VF: synthetic field
   public static String field1271 = "makeConcatWithConstants";
   // $VF: synthetic field
   public boolean field1272;
   // $VF: synthetic field
   public static Vector field1273;
   // $VF: synthetic field
   public Class338 field1274;
   // $VF: synthetic field
   public static String field1275 = "DecryptString";
   // $VF: synthetic field
   public static char field1276 = 'U';
   // $VF: synthetic field
   public static String field1277 = "DecryptString2";
   // $VF: synthetic field
   public static String field1278 = "com_allatori_string_decryptor";
   // $VF: synthetic field
   public Collection field1279;
   // $VF: synthetic field
   public static String field1280 = "allatori-12321-32123:";

   // $VF: synthetic method
   public void method844() {
   }// 756

   // $VF: synthetic method
   @Override
   public void method839(Class206 var1) {
      Class206 var15 = var1;
      Class429 var16 = this;
      int var20 = Class580.method1932().method1856(this.field1274, var1);// 58
      Class580.method1932();
      if (var20 != 0) {
         Class120 var10 = new Class120(var1);// 315
         String var13 = "com.allatori";// 132
         String var4 = "org.apache.bcel";// 184
         Class208[] var5 = var1.method341();// 488

         int var6;
         for (var20 = var6 = 0; var20 < var5.length; var20 = ++var6) {// 495
            Class208 var7;
            if ((var7 = var5[var6]).method369() != null) {// 159 493
               Class246 var2;
               Class203 var8;
               Class251 var9;
               Class246 var22 = var2 = (var9 = (var8 = Class376.method716(var7, var15.method93(), var15.method46(), var15.method46().method402())).method42())// 377 561
                  .method32();// 604

               while (var22 != null) {// 22
                  label109: {
                     if (!field1270 && var2.method18() instanceof Class262) {// 6
                        Class262 var17 = (Class262)var2.method18();// 144
                        if (field1271.equals(var17.method518(var15.method46()))) {// 461
                           Logger.warning("javac Java compiler should be run with -XDstringConcat=inline flag to encrypt all strings.");// 358
                           field1270 = true;// 192
                        }
                     } else if (var2.method18() instanceof ldc) {// 272
                        ldc var11 = (ldc)var2.method18();// 321
                        Class178 var12;
                        if ((var12 = var15.method46().method174(var11.method2())) instanceof Class185) {// 146 179
                           String var18 = ((Class191)var15.method46().method174(((Class185)var12).method2())).method20();// 567
                           if (var16.field1274.method557(var18) != null || var16.field1279.contains(var18) || Class482.method1277(var18)) {// 400
                              var22 = var2 = var2.method32();// 33
                              continue;// 0
                           }

                           int var3;
                           label83: {
                              var3 = Class580.method1932().method1849(var16.field1274, var15, var8);// 552
                              String var14;
                              if ((var14 = var15.method93()).startsWith(var13)) {// 278 603
                                 if (var14.startsWith("com.allatori.obfuscate.opt")) {// 466
                                    Class580.method1932();
                                    var3 = 0;
                                 }

                                 if (var14.startsWith("com.allatori.obfuscate.ren")) {// 467
                                    Class580.method1932();
                                    var3 = 0;
                                 }

                                 if (var14.startsWith("com.allatori.io.re")) {// 485
                                    Class580.method1932();
                                    var3 = 0;
                                    var20 = var3;
                                    break label83;
                                 }
                              } else if (var14.startsWith(var4)) {// 68
                                 Class580.method1932();// 59
                                 var3 = 0;
                              }

                              var20 = var3;// 589
                           }

                           Class580.method1932();
                           if (var20 == 1) {
                              var11.method6(var15.method46().method409(field1280 + var18));// 579
                              var9.method480(var2, var10.method47(field1278, field1277, Class138.field593, new Class138[]{Class138.field593}, (short)184));// 555
                              if (!field1273.contains(var15)) {// 73
                                 field1273.add(var15);// 415
                              }

                              var16.field1272 = true;// 398
                              var24 = var2;
                              break label109;// 428
                           }

                           Class580.method1932();
                           if (var3 >= 1000) {
                              String var19;
                              if ((var19 = Class467.method1051(var18, var3, var16.field1274.method559())).startsWith(Class467.field1527)// 87 586
                                 && !field1273.contains(var15)) {
                                 field1273.add(var15);// 399
                              }

                              var11.method6(var15.method46().method409(var19));// 232
                              var24 = var2;
                              var9.method480(var2, Class467.method1052(var10, var3));// 463
                              break label109;// 198
                           }

                           var11.method6(var15.method46().method409(var16.method861(var18)));// 424
                           var9.method480(var2, var10.method47(field1278, field1275, Class138.field593, new Class138[]{Class138.field593}, (short)184));// 28
                           var16.field1272 = true;// 588
                        }
                     }

                     var24 = var2;// 257
                  }

                  var22 = var2 = var24.method32();
               }

               var8.method309();// 455
               var15.method360(var7, var8.method315());// 148
            }
         }
      }
   }// 142

   // $VF: synthetic method
   public void method850(Class206 var1) {
      Class120 var4 = new Class120(var1);// 281
      Class221 var6 = var1.method46();// 438 592
      Class251 var10 = new Class251();// 181
      Class203 var5 = new Class203(9, Class138.field593, new Class138[]{Class138.field593}, new String[]{"arg0"}, field1277, var1.method93(), var10, var6);// 433
      var10.method451(Class120.method77(Class138.field583, 0));// 337
      var10.method484(new Class116(var6, 1));// 168
      var10.method451(Opcodes.dup);// 133
      var10.method451(Opcodes.dup_x2);// 504
      String var3 = "java.lang.RuntimeException";// 544
      var10.method451(var4.method58(var3));// 114
      var10.method451(Opcodes.dup);// 102
      var10.method451(var4.method47(var3, "<init>", Class138.field586, Class138.field582, (short)183));// 183
      var10.method451(var4.method47(var3, "getStackTrace", new Class145(new Class144("java.lang.StackTraceElement"), 1), Class138.field582, (short)182));// 64
      var10.method451(Opcodes.swap);// 249
      var10.method451(Opcodes.aaload);// 196
      var10.method451(var4.method58("java.lang.StringBuffer"));// 554
      var10.method451(Opcodes.dup);// 89
      var10.method451(var4.method47("java.lang.StringBuffer", "<init>", Class138.field586, Class138.field582, (short)183));// 599
      var10.method451(Opcodes.swap);// 88
      var10.method451(Opcodes.dup);// 8
      var10.method451(var4.method47("java.lang.StackTraceElement", "getClassName", Class138.field593, Class138.field582, (short)182));// 384
      var10.method451(Opcodes.swap);// 301
      var10.method451(var4.method47("java.lang.StackTraceElement", "getMethodName", Class138.field593, Class138.field582, (short)182));// 363
      var10.method451(Opcodes.dup_x2);// 35
      var10.method451(Opcodes.pop);// 271
      var10.method451(var4.method47("java.lang.StringBuffer", "append", Class138.field587, new Class138[]{Class138.field593}, (short)182));// 357
      var10.method451(Opcodes.swap);// 182
      var10.method451(var4.method47("java.lang.StringBuffer", "append", Class138.field587, new Class138[]{Class138.field593}, (short)182));// 122
      var10.method451(var4.method47("java.lang.StringBuffer", "toString", Class138.field593, Class138.field582, (short)182));// 346
      var10.method451(Opcodes.dup_x1);// 334
      var10.method451(var4.method47("java.lang.String", "length", Class138.field591, Class138.field582, (short)182));// 453
      var10.method451(Opcodes.swap);// 224
      var10.method451(Opcodes.isub);// 560
      var10.method451(Opcodes.dup_x1);// 71
      var10.method451(Class120.method75(Class138.field591, 3));// 191
      var10.method451(Class120.method75(Class138.field583, 2));// 441
      var10.method451(Class120.method75(Class138.field591, 4));// 575
      var10.method451(var4.method47("java.lang.String", "length", Class138.field591, Class138.field582, (short)182));// 407
      var10.method451(Opcodes.dup);// 85
      var10.method451(var4.method67(Class138.field585, (short)1));// 121
      var10.method451(Class120.method75(Class138.field583, 5));// 518
      Iterator<Class10> var11 = Class482.method1274(field1276).iterator();// 387
      Iterator<Class10> var10000 = var11;

      while (var10000.hasNext()) {
         Class10 var7 = (Class10)var11.next();
         var10000 = var11;
         var10.method451(var7);
      }

      var10.method451(Class120.method75(Class138.field591, 6));// 261
      var10.method451(Opcodes.swap);// 206
      var10.method451(Opcodes.isub);// 156
      var10.method451(Class120.method75(Class138.field591, 7));// 543
      Class90 var12 = Class120.method73((short)167, null);// 276
      var10.method439(var12);// 414
      Class246 var14 = var10.method484(new Class116(var6, 63));// 12
      var10.method451(Opcodes.dup_x2);// 139
      var10.method451(Opcodes.pop);// 559
      var10.method451(Opcodes.dup_x1);// 187
      var10.method451(Opcodes.pop);// 254
      var10.method451(Class120.method77(Class138.field591, 6));// 539
      var10.method451(Opcodes.dup_x2);// 120
      var10.method451(Opcodes.pop);// 479
      var10.method451(Class120.method77(Class138.field583, 2));// 298
      var10.method451(Class120.method77(Class138.field591, 4));// 439
      var10.method451(var4.method47("java.lang.String", "charAt", Class138.field585, new Class138[]{Class138.field591}, (short)182));// 106
      var10.method451(Opcodes.dup_x1);// 445
      var10.method451(Class120.method77(Class138.field591, 7));// 327
      var10.method451(Opcodes.dup_x1);// 383
      var10.method451(Class120.method77(Class138.field583, 0));// 140
      var10.method451(Opcodes.swap);// 49
      var10.method451(var4.method47("java.lang.String", "charAt", Class138.field585, new Class138[]{Class138.field591}, (short)182));// 173
      var10.method451(Class120.method77(Class138.field591, 6));// 101
      var10.method451(Opcodes.field112);// 562
      var10.method451(Opcodes.field112);// 244
      var10.method451(Opcodes.field27);// 259
      var10.method451(Opcodes.castore);// 194
      var10.method451(Opcodes.field112);// 163
      var10.method451(Opcodes.field112);// 243
      var10.method451(Opcodes.field89);// 229
      var10.method451(Opcodes.field27);// 590
      var10.method451(Class120.method75(Class138.field591, 6));// 309
      var10.method451(new Class286(4, -1));// 442
      var10.method451(Class120.method77(Class138.field591, 4));// 344
      Class90 var13 = Class120.method73((short)156, null);// 449
      var10.method439(var13);// 217
      var10.method451(Class120.method77(Class138.field591, 3));// 378
      var10.method451(Class120.method75(Class138.field591, 4));// 490
      Class246 var8 = var10.method451(new Class286(7, -1));// 481
      Class246 var9 = var10.method451(Class120.method77(Class138.field583, 5));// 75
      var10.method451(Class120.method77(Class138.field591, 7));// 111
      var10.method451(Opcodes.dup);// 304
      Class90 var15 = Class120.method73((short)156, var14);// 477
      var10.method439(var15);// 53
      var10.method451(Opcodes.pop2);// 584
      var10.method451(var4.method58("java.lang.String"));// 267
      var10.method451(Class120.method77(Class138.field583, 5));// 419
      var10.method451(Opcodes.swap);// 402
      var10.method451(Opcodes.dup_x1);// 112
      var10.method451(Opcodes.swap);// 43
      var10.method451(var4.method47("java.lang.String", "<init>", Class138.field586, new Class138[]{new Class145(Class138.field585, 1)}, (short)183));// 293
      var10.method451(Class120.method55(Class138.field583));// 322
      var12.method29(var9);// 74
      var13.method29(var8);// 317
      var5.method309();// 526
      var5.method276();// 136
      var1.method365(var5.method315());// 158
      var10.method107();// 90
   }// 294

   // $VF: synthetic method
   public Class429(Class338 var1) {
      super();
      Class429 var3 = this;
      this.field1272 = false;// 204
      this.field1279 = new TreeSet();// 239
      this.field1274 = var1;// 93 151
      field1276 = Class580.method1932().method1877();// 530
      field1273 = new Vector();// 491
      Class482.method1280();// 147
      this.field1279.add("");// 295
      Iterator var2 = var1.method553();// 338

      label29:
      while (true) {
         for (Iterator var10000 = var2; var10000.hasNext(); var10000 = var2) {
            Class206 var5 = (Class206)var2.next();// 273
            if (!Class580.method1924().method2043(var1, var5)) {// 161
               int var4;
               int var6 = var4 = Class580.method1932().method1856(var1, var5);// 141
               Class580.method1932();// 580
               if (var6 == 1) {
                  Class482.method1282(var5, var3.field1279);// 226
               } else {
                  Class580.method1932();
                  if (var4 == 2) {// 123
                     Class482.method1272(var5);// 78
                  } else {
                     Class580.method1932();
                     if (var4 == 3) {// 418
                        Class482.method1272(var5);// 533
                        Class482.method1278(var5);// 185
                     }
                  }
               }
               continue label29;
            }
         }

         return;// 46
      }
   }

   // $VF: synthetic method
   public Class206 method860() {
      Class206 var2 = new Class206(field1278, "java.lang.Object", "", 33, new String[0]);// 21
      if (Class580.method1932().method1858()) {// 115
         Class482.method1279(var2, field1275, field1276);// 223
         return var2;
      } else {
         this.method840(var2);// 23
         this.method850(var2);// 440
         return var2;// 97
      }
   }

   // $VF: synthetic method
   public void method840(Class206 var1) {
      Class120 var4 = new Class120(var1);// 285
      Class221 var3 = var1.method46();// 32 119
      Class251 var9 = new Class251();// 423
      Class203 var5 = new Class203(9, Class138.field593, new Class138[]{Class138.field593}, new String[]{"s"}, field1275, var1.method93(), var9, var3);// 61
      var9.method451(var4.method58("java.lang.String"));// 593
      var9.method451(Opcodes.dup);// 336
      var9.method451(Class120.method77(Class138.field583, 0));// 216
      var9.method451(var4.method47("java.lang.String", "length", Class138.field591, Class138.field582, (short)182));// 299
      var9.method451(var4.method67(Class138.field585, (short)1));// 314
      var9.method484(new Class116(var3, 1));// 50
      var9.method451(Opcodes.dup);// 253
      var9.method451(Opcodes.pop2);// 135
      Iterator var6 = Class482.method1274(field1276).iterator();// 166
      Iterator var10000 = var6;

      while (var10000.hasNext()) {
         Class10 var7 = (Class10)var6.next();
         var10000 = var6;
         var9.method451(var7);
      }

      var9.method451(Opcodes.swap);// 292
      var9.method451(Opcodes.dup);// 373
      var9.method451(Opcodes.field126);// 72
      var9.method484(new Class116(var3, 1));// 268
      var9.method451(Opcodes.isub);// 497
      var9.method451(Opcodes.dup_x2);// 66
      var9.method451(Class120.method75(Class138.field591, 3));// 536
      var9.method451(Class120.method75(Class138.field583, 1));// 307
      var9.method451(Class120.method75(Class138.field591, 2));// 218
      Class90 var11 = Class120.method73((short)155, null);// 582
      Class247 var12 = var9.method439(var11);// 177
      var9.method451(Class120.method77(Class138.field583, 1));// 266
      var9.method451(Class120.method77(Class138.field591, 3));// 235
      var9.method451(Class120.method77(Class138.field583, 0));// 280
      var9.method451(Class120.method77(Class138.field591, 3));// 370
      var9.method451(var4.method47("java.lang.String", "charAt", Class138.field585, new Class138[]{Class138.field591}, (short)182));// 516
      var9.method451(Class120.method77(Class138.field591, 2));// 95
      var9.method451(Opcodes.field112);// 227
      var9.method451(Opcodes.field27);// 55
      var9.method451(Opcodes.swap);// 288
      var9.method451(Opcodes.dup_x1);// 129
      var9.method451(Class120.method77(Class138.field591, 2));// 258
      var9.method451(Opcodes.field112);// 437
      var9.method451(Opcodes.field27);// 110
      var9.method484(new Class116(var3, 63));// 221
      var9.method451(Opcodes.field89);// 444
      var9.method451(Opcodes.field27);// 601
      var9.method451(Class120.method75(Class138.field591, 2));// 193
      var9.method451(Opcodes.castore);// 486
      var9.method451(new Class286(3, -1));// 117
      var9.method451(Class120.method77(Class138.field591, 3));// 300
      Class90 var8 = Class120.method73((short)155, null);// 404
      var9.method439(var8);// 417
      var9.method451(Class120.method77(Class138.field583, 1));// 81
      var9.method451(Class120.method77(Class138.field591, 3));// 401
      var9.method451(Class120.method77(Class138.field583, 0));// 394
      var9.method451(Class120.method77(Class138.field591, 3));// 556
      var9.method451(var4.method47("java.lang.String", "charAt", Class138.field585, new Class138[]{Class138.field591}, (short)182));// 316
      var9.method451(Class120.method77(Class138.field591, 2));// 207
      var9.method451(Opcodes.field112);// 275
      var9.method451(Opcodes.field27);// 127
      var9.method451(Opcodes.swap);// 496
      var9.method451(Opcodes.dup_x1);// 369
      var9.method451(Class120.method77(Class138.field591, 2));// 215
      var9.method451(Opcodes.field112);// 382
      var9.method451(Opcodes.field27);// 210
      var9.method484(new Class116(var3, 63));// 576
      var9.method451(Opcodes.field89);// 103
      var9.method451(Opcodes.field27);// 548
      var9.method451(Class120.method75(Class138.field591, 2));// 545
      var9.method451(Opcodes.castore);// 523
      var9.method451(new Class286(3, -1));// 162
      var9.method451(Class120.method77(Class138.field591, 3));// 282
      var9.method439(Class120.method73((short)167, var12));// 503
      Class246 var10 = var9.method451(Class120.method77(Class138.field583, 1));// 596
      var9.method451(var4.method47("java.lang.String", "<init>", Class138.field586, new Class138[]{new Class145(Class138.field585, 1)}, (short)183));// 549
      var9.method451(Class120.method55(Class138.field583));// 499
      var11.method29(var10);// 145
      var8.method29(var10);// 390
      var5.method309();// 573
      var5.method276();// 520
      var1.method365(var5.method315());// 502
      var9.method107();// 188
   }// 172

   // $VF: synthetic method
   @Override
   public void method838() {
      if (this.field1272) {// 99
         this.field1274.method560(this.method860());// 160
      }
   }// 40

   // $VF: synthetic method
   public static String method855(String var0, String var1) {
      String var3 = var0;
      int var5 = var1.length() - 1;// 149
      int var7 = var1.length() - 1;// 157
      char[] var4 = new char[var0.length()];// 286
      char var2 = field1276;// 600

      int var6;
      for (int var8 = var6 = var4.length - 1; var8 >= 0; var8 = --var6) {// 108
         var4[var6] = (char)(var3.charAt(var6) ^ var2 ^ var1.charAt(var7));// 27
         char var9 = (char)(var2 ^ var6 ^ var1.charAt(var7));// 242
         var7--;// 209
         var2 = (char)(var9 & '?');// 94
         if (var7 < 0) {// 69
            var7 = var5;
         }
      }

      return new String(var4);// 422
   }

   // $VF: synthetic method
   public String method861(String var1) {
      char[] var2 = new char[var1.length()];// 550
      char var5 = field1276;// 510

      int var4;
      for (int var10000 = var4 = var2.length - 1; var10000 >= 0; var10000 = var4) {// 456
         var2[var4] = (char)(var1.charAt(var4) ^ var5);// 367
	      char var7 = (char)(var5 ^ var4);// 82
         var4--;
         var5 = (char)(var7 & '?');// 83
      }

      return new String(var2);// 279
   }
}
