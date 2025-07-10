package mapped;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.helpers.DefaultHandler;

// $VF: Compiled from br
public class Class445 extends DefaultHandler {
   // $VF: synthetic field
   public static final int field1327 = 3;
   // $VF: synthetic field
   public static final int field1328 = -1;
   // $VF: synthetic field
   public int field1329;
   // $VF: synthetic field
   public final Class525 field1330;
   // $VF: synthetic field
   public Class601 field1331;
   // $VF: synthetic field
   public static final int field1332 = 2;
   // $VF: synthetic field
   public boolean field1333;
   // $VF: synthetic field
   public Locator field1334;
   // $VF: synthetic field
   public boolean field1335;
   // $VF: synthetic field
   public String field1336;
   // $VF: synthetic field
   public static final int field1337 = 1;
   // $VF: synthetic field
   public String field1338;

   // $VF: synthetic method
   public void method885(Attributes var1) {
      Class445 var3 = this;
      String var6 = this.method904(var1, "name", true, null, true);// 384
      String var22 = this.method904(var1, "value", true, null, true);// 130
      String var4 = this.method904(var1, "apply2class", false, "private+ class *", true);// 301
      String var5 = this.method904(var1, "apply2method", false, "private+ *(**)", true);// 602
      if ("string-encryption".equals(var6)) {// 363
         Class580.method1932();// 509
         byte var46 = 1;
         Class445 var120;
         if ("enable".equals(var22)) {// 35
            Class580.method1932();// 233
            var46 = 1;
            var120 = this;
         } else if ("disable".equals(var22)) {// 271
            Class580.method1932();// 256
            var46 = 0;
            var120 = this;
         } else if ("maximum".equals(var22)) {// 357
            Class580.method1932();// 47
            var46 = 2;
            var120 = this;
         } else if ("maximum-with-warnings".equals(var22)) {// 182
            Class580.method1932();// 4
            var46 = 3;
            var120 = this;
         } else {
            var120 = this;// 305
            this.method898("value", "enable", "disable", "maximum");
         }

         Class601 var67;
         (var67 = var120.method910(var4, null, null, null, "apply2class")).method2089(this.method908(var5, null, "apply2method", null));// 228 346
         Class580.method1932().method1848(new Class587(var46, var67));// 334
      } else if ("member-reorder".equals(var6)) {
         Class580.method1932();// 13
         byte var45 = 1;
         Class445 var119;
         if ("enable".equals(var22)) {// 333
            Class580.method1932();// 284
            var45 = 1;
            var119 = this;
         } else if ("disable".equals(var22)) {// 255
            Class580.method1932();// 234
            var45 = 0;
            var119 = this;
         } else if ("random".equals(var22)) {// 508
            Class580.method1932();// 517
            var45 = 1;
            var119 = this;
         } else if ("alphabetical".equals(var22)) {// 214
            Class580.method1932();// 524
            var45 = 100;
            var119 = this;
         } else if ("reverse-alphabetical".equals(var22)) {// 371
            Class580.method1932();// 585
            var45 = 101;
            var119 = this;
         } else {
            var119 = this;// 563
            this.method903("value", "enable", "disable", "random", "alphabetical", "reverse-alphabetical");
         }

         Class601 var66 = var119.method910(var4, null, null, null, "apply2class");// 14
         Class580.method1932().method1862(new Class587(var45, var66));// 514
      } else if ("control-flow-obfuscation".equals(var6)) {
         byte var44 = 1;// 361
         Class445 var118;
         if ("enable".equals(var22)) {// 453
            var44 = 1;// 354
            var118 = this;
         } else if ("disable".equals(var22)) {// 224
            var44 = 0;// 494
            var118 = this;
         } else {
            var118 = this;// 174
            this.method912("value", "enable", "disable");
         }

         Class601 var65;
         (var65 = var118.method910(var4, null, null, null, "apply2class")).method2089(this.method908(var5, null, "apply2method", null));// 71 375
         Class580.method1932().method1861(new Class587(var44, var65));// 191
      } else if ("local-variables-naming".equals(var6)) {
         Class580.method1923().method1658();// 575
         byte var43 = 6;
         if (var22.contains(":")) {// 303
            Class580.method1923().method1658().method1553(var22.substring(var22.indexOf(58) + 1));// 326
            var22 = var22.substring(0, var22.indexOf(58));// 29
         }

         if ("single-name".equals(var22)) {// 457
            Class580.method1923().method1658();// 546
            var43 = 1;
         } else if ("abc".equals(var22)) {// 341
            Class580.method1923().method1658();// 51
            var43 = 2;
         } else if ("keep".equals(var22)) {// 598
            Class580.method1923().method1658();// 325
            var43 = 3;
         } else if ("remove".equals(var22)) {// 392
            Class580.method1923().method1658();// 571
            var43 = 4;
         } else if ("keep-parameters".equals(var22)) {// 44
            Class580.method1923().method1658();// 362
            var43 = 5;
         } else if ("optimize".equals(var22)) {// 476
            Class580.method1923().method1658();// 542
            var43 = 6;
         } else {
            this.method887("value", "single-name", "abc", "keep", "remove", "keep-parameters", "optimize");// 420
         }

         if ("private+ class *".equals(var4) && "private+ *(**)".equals(var5)) {// 454
            Class580.method1923().method1658().method1551(var43);// 343
         }

         Class601 var64;
         (var64 = this.method910(var4, null, null, null, "apply2class")).method2089(this.method908(var5, null, "apply2method", null));// 62 126
         Class580.method1923().method1658().method1552(new Class587(var43, var64));// 324
      } else if ("packages-naming".equals(var6)) {
         if ("abc".equals(var22)) {// 376
            Class553 var117 = Class580.method1923().method1660();// 492
            Class580.method1923().method1660();
            var117.method1735(1);
         } else if ("ABC".equals(var22)) {// 482
            Class553 var116 = Class580.method1923().method1660();// 432
            Class580.method1923().method1660();
            var116.method1735(8);
         } else if ("123".equals(var22)) {// 67
            Class553 var115 = Class580.method1923().method1660();// 155
            Class580.method1923().method1660();
            var115.method1735(6);
         } else if ("keep".equals(var22)) {// 2
            Class580.method1923().method1667(true);// 505
         } else if (var22.startsWith("custom(")) {// 421
            Class553 var114 = Class580.method1923().method1660();// 583
            Class580.method1923().method1660();
            var114.method1735(7);
            Class580.method1923().method1660().method1752(this.method896(var22));// 19
         } else {
            this.method903("value", "abc", "ABC", "123", "keep", "custom(filename.txt)");// 473
         }
      } else if ("classes-naming".equals(var6)) {
         if ("abc".equals(var22)) {// 528
            Class553 var113 = Class580.method1923().method1660();// 289
            Class580.method1923().method1660();
            var113.method1742(1);
         } else if ("ABC".equals(var22)) {// 264
            Class553 var112 = Class580.method1923().method1660();// 323
            Class580.method1923().method1660();
            var112.method1742(8);
         } else if ("compact".equals(var22)) {// 458
            Class553 var111 = Class580.method1923().method1660();// 591
            Class580.method1923().method1660();
            var111.method1742(2);
         } else if ("windows".equals(var22)) {// 572
            Class553 var110 = Class580.method1923().method1660();// 60
            Class580.method1923().method1660();
            var110.method1742(4);
         } else if ("iii".equals(var22)) {// 348
            Class553 var109 = Class580.method1923().method1660();// 150
            Class580.method1923().method1660();
            var109.method1742(5);
         } else if ("123".equals(var22)) {// 56
            Class553 var108 = Class580.method1923().method1660();// 416
            Class580.method1923().method1660();
            var108.method1742(6);
         } else if (var22.startsWith("custom(")) {// 211
            Class553 var107 = Class580.method1923().method1660();// 427
            Class580.method1923().method1660();
            var107.method1742(7);
            Class580.method1923().method1660().method1737(this.method896(var22));// 178
         } else if ("unique".equals(var22)) {
            Class580.method1923().method1660().method1751(true);// 475
         } else if ("keep-$-sign".equals(var22)) {// 100
            Class580.method1923().method1672(true);// 202
         } else {
            this.method890("value", "abc", "ABC", "compact", "windows", "iii", "123", "unique", "keep-$-sign", "custom(filename.txt)");// 128
         }
      } else if ("fields-naming".equals(var6)) {
         if ("abc".equals(var22)) {// 199
            Class553 var106 = Class580.method1923().method1660();// 512
            Class580.method1923().method1660();
            var106.method1739(1);
         } else if ("ABC".equals(var22)) {// 538
            Class553 var105 = Class580.method1923().method1660();// 92
            Class580.method1923().method1660();
            var105.method1739(8);
         } else if ("compact".equals(var22)) {// 176
            Class553 var104 = Class580.method1923().method1660();// 171
            Class580.method1923().method1660();
            var104.method1739(2);
         } else if ("keywords".equals(var22)) {// 124
            Class553 var103 = Class580.method1923().method1660();// 568
            Class580.method1923().method1660();
            var103.method1739(3);
         } else if ("iii".equals(var22)) {// 152
            Class553 var102 = Class580.method1923().method1660();// 311
            Class580.method1923().method1660();
            var102.method1739(5);
         } else if ("123".equals(var22)) {// 98
            Class553 var101 = Class580.method1923().method1660();// 407
            Class580.method1923().method1660();
            var101.method1739(6);
         } else if ("real".equals(var22)) {// 405
            Class580.method1923().method1660().method1753(true);// 85
         } else if ("unique".equals(var22)) {// 16
            Class580.method1923().method1666(true);// 121
         } else if (var22.startsWith("custom(")) {// 480
            Class553 var100 = Class580.method1923().method1660();// 518
            Class580.method1923().method1660();
            var100.method1739(7);
            Class580.method1923().method1660().method1740(this.method896(var22));// 472
         } else {
            this.method890("value", "abc", "ABC", "compact", "keywords", "iii", "123", "real", "unique", "custom(filename.txt)");// 387
         }
      } else if ("methods-naming".equals(var6)) {
         if ("abc".equals(var22)) {// 261
            Class553 var99 = Class580.method1923().method1660();// 180
            Class580.method1923().method1660();
            var99.method1749(1);
         } else if ("ABC".equals(var22)) {// 206
            Class553 var98 = Class580.method1923().method1660();// 350
            Class580.method1923().method1660();
            var98.method1749(8);
         } else if ("compact".equals(var22)) {// 156
            Class553 var97 = Class580.method1923().method1660();// 3
            Class580.method1923().method1660();
            var97.method1749(2);
         } else if ("keywords".equals(var22)) {// 543
            Class553 var96 = Class580.method1923().method1660();// 186
            Class580.method1923().method1660();
            var96.method1749(3);
         } else if ("iii".equals(var22)) {// 175
            Class553 var95 = Class580.method1923().method1660();// 276
            Class580.method1923().method1660();
            var95.method1749(5);
         } else if ("123".equals(var22)) {// 167
            Class553 var94 = Class580.method1923().method1660();// 414
            Class580.method1923().method1660();
            var94.method1749(6);
         } else if ("real".equals(var22)) {// 12
            Class580.method1923().method1660().method1741(true);// 319
         } else if ("unique".equals(var22)) {// 139
            Class580.method1923().method1678(true);// 462
         } else if (var22.startsWith("custom(")) {// 559
            Class553 var93 = Class580.method1923().method1660();// 452
            Class580.method1923().method1660();
            var93.method1749(7);
            Class580.method1923().method1660().method1734(this.method896(var22));// 187
         } else {
            this.method890("value", "abc", "ABC", "compact", "keywords", "iii", "123", "real", "unique", "custom(filename.txt)");// 254
         }
      } else if ("default-package".equals(var6)) {
         String var23;
         String var92 = var23 = this.method904(var1, "value", true, null, false);// 539

         while (var92.endsWith(".")) {// 388
            var92 = var23 = var23.substring(0, var23.length() - 1);
         }

         Class580.method1923().method1669(var23);// 120
      } else if ("force-default-package".equals(var6)) {
         if ("enable".equals(var22)) {// 479
            Class580.method1923().method1680(true);// 347
         } else if ("disable".equals(var22)) {// 298
            Class580.method1923().method1680(false);// 42
         } else {
            this.method912("value", "enable", "disable");// 529
         }
      } else if ("line-numbers".equals(var6)) {
         if ("keep".equals(var22)) {// 569
            Class408 var91 = Class580.method1923().method1675();// 445
            Class580.method1923().method1675();
            var91.method751(2);
         } else if ("remove".equals(var22)) {// 425
            Class408 var90 = Class580.method1923().method1675();// 327
            Class580.method1923().method1675();
            var90.method751(3);
         } else if ("obfuscate".equals(var22)) {// 527
            Class408 var89 = Class580.method1923().method1675();// 383
            Class580.method1923().method1675();
            var89.method751(1);
         } else {
            this.method898("value", "keep", "remove", "obfuscate");// 140
         }
      } else if ("log-file".equals(var6)) {
         if (var22.length() == 0) {// 49
            this.method899("value");// 565
         }

         if (!new File(var22).isAbsolute()) {// 173
            try {
               String var42;
               if ((var42 = new File(Class525.method1554(var3.field1330)).getCanonicalFile().getParent()) != null) {// 101 489
                  var22 = new File(var42 + File.separator + var22).getCanonicalPath();// 562
               }
            } catch (Exception var18) {// 244
               String var63;
               if ((var63 = new File(Class525.method1554(this.field1330)).getAbsoluteFile().getParent()) != null) {// 247 259
                  var22 = new File(var63 + File.separator + var22).getAbsolutePath();// 194
               }
            }
         }

         Class580.method1938().method724(var22);// 9
      } else if ("random-seed".equals(var6)) {
         Class580.method1932().method1883(var22);// 566
      } else if ("incremental-obfuscation".equals(var6)) {
         if (var22.length() == 0) {// 229
            this.method899("value");// 104
         }

         if (!new File(var22).isAbsolute()) {// 590
            try {
               String var41;
               if ((var41 = new File(Class525.method1554(var3.field1330)).getCanonicalFile().getParent()) != null) {// 430 442
                  var22 = new File(var41 + File.separator + var22).getCanonicalPath();// 344
               }
            } catch (Exception var19) {// 345
               String var62;
               if ((var62 = new File(Class525.method1554(this.field1330)).getAbsoluteFile().getParent()) != null) {// 37 449
                  var22 = new File(var62 + File.separator + var22).getAbsolutePath();// 217
               }
            }
         }

         if (!new File(var22).exists()) {// 490
            throw new Class244(this.field1330, "Cannot find file '" + var22 + "'. " + this.method905());// 577
         } else {
            Class580.method1923().method1673(var22);// 481
         }
      } else if ("string-encryption-type".equals(var6)) {
         Class580.method1932();// 75
         int var40 = 0;
         Class445 var87;
         if ("fast".equals(var22)) {// 372
            Class580.method1932();// 111
            var40 = 0;
            var87 = this;
         } else if ("strong".equals(var22)) {// 587
            Class580.method1932();// 304
            var40 = 1;
            var87 = this;
         } else {
            label737:
            if (var22.startsWith("custom(")) {// 153
               Class580.method1932();// 477
               var40 = 1000 + this.field1334.getLineNumber();

               try {
                  String var60;
                  String var10002 = var60 = var22.substring(7, var22.indexOf(44)).trim();// 584
                  String var68 = var10002.substring(0, var60.lastIndexOf(46));// 200
                  String var9 = var10002.substring(var60.lastIndexOf(46) + 1);// 84
                  String var10;
                  String var88 = var10 = var22.substring(var22.indexOf(44) + 1, var22.length() - 1).trim();// 393
                  String var69 = var88.substring(0, var10.lastIndexOf(46));// 419
                  String var11 = var88.substring(var10.lastIndexOf(46) + 1);// 230
                  Class580.method1932().method1855().put(var40, new String[]{var68, var9, var69, var11});// 515
               } catch (Exception var20) {// 112
                  var87 = this;// 395
                  this.method898("value", "fast", "strong", "custom(ClassName.methodName, ClassName2.methodName2)");
                  break label737;// 535
               }

               var87 = this;
            } else {
               var87 = this;// 293
               this.method898("value", "fast", "strong", "custom(ClassName.methodName, ClassName2.methodName2)");
            }
         }

         Class601 var61;
         (var61 = var87.method910(var4, null, null, null, "apply2class")).method2089(this.method908(var5, null, "apply2method", null));// 54 322
         Class580.method1932().method1845(new Class587(var40, var61));// 74
      } else if ("finalize".equals(var6)) {
         if ("enable".equals(var22)) {// 241
            Class580.method1932().method1863(true);// 526
         } else if ("disable".equals(var22)) {// 136
            Class580.method1932().method1863(false);// 158
         } else {
            this.method912("value", "enable", "disable");// 294
         }
      } else if ("anti-jd".equals(var6) || "extensive-flow-obfuscation".equals(var6)) {
         Class580.method1922();// 435
         byte var39 = 1;
         Class445 var86;
         if ("disable".equals(var22)) {// 96
            Class580.method1922();// 581
            var39 = 0;
            var86 = this;
         } else if ("normal".equals(var22)) {// 359
            Class580.method1922();// 408
            var39 = 1;
            var86 = this;
         } else if ("maximum".equals(var22)) {// 313
            Class580.method1922();// 277
            var39 = 2;
            var86 = this;
         } else {
            var86 = this;// 459
            this.method898("value", "disable", "normal", "maximum");
         }

         Class601 var59;
         (var59 = var86.method910(var4, null, null, null, "apply2class")).method2089(this.method908(var5, null, "apply2method", null));// 203 302
         Class580.method1922().method1916(new Class587(var39, var59));// 70
      } else if ("unique-renaming".equals(var6)) {
         Class445 var84;
         if ("enable".equals(var22)) {// 118
            Class580.method1923().method1678(true);// 379
            var84 = this;
         } else if ("disable".equals(var22)) {// 353
            Class580.method1923().method1678(false);// 189
            var84 = this;
         } else {
            var84 = this;// 447
            this.method912("value", "enable", "disable");
         }

         Class601 var38;
         (var38 = var84.method910(var4, null, null, null, "apply2class")).method2089(this.method908(var5, null, "apply2method", null));// 79 500
         Class543 var85 = Class580.method1923();// 396
         Class587 var121 = new Class587;
         byte var10003;
         Class601 var10004;
         if (Class580.method1923().method1650()) {
            var10003 = 1;
            var10004 = var38;
         } else {
            var10003 = 0;
            var10004 = var38;
         }

         var121./* $VF: Unable to resugar constructor */<init>(var10003, var10004);
         var85.method1661(var121);
      } else if ("randomize-names".equals(var6)) {
         if ("enable".equals(var22)) {// 154
            Class580.method1923().method1670(true);// 861
         } else if ("disable".equals(var22)) {// 752
            Class580.method1923().method1670(false);// 847
         } else {
            this.method912("value", "enable", "disable");// 605
         }
      } else if ("string-encryption-seed".equals(var6)) {
         if (var22.length() == 0) {// 985
            this.method886("value");// 921
         } else {
            Class580.method1932().method1874(var22.charAt(0));// 698
         }
      } else if ("string-encryption-version".equals(var6)) {
         Class445 var80;
         if ("v3".equals(var22)) {// 764
            Class569 var79 = Class580.method1932();// 821
            Class580.method1932();
            var79.method1843(0);
            var80 = this;
         } else if ("v4".equals(var22) || "v4-per-jar".equals(var22)) {// 654
            Class569 var83 = Class580.method1932();// 609
            Class580.method1932();
            var83.method1843(1);
            Class580.method1932().method1882(false);// 633
            Class580.method1932().method1884(false);// 684
            var80 = this;
         } else if ("v4-global".equals(var22)) {// 892
            Class569 var81 = Class580.method1932();// 632
            Class580.method1932();
            var81.method1843(1);
            Class580.method1932().method1882(true);// 818
            var80 = this;
         } else if ("v4-per-package".equals(var22)) {// 966
            Class569 var82 = Class580.method1932();// 949
            Class580.method1932();
            var82.method1843(1);
            Class580.method1932().method1884(true);// 968
            var80 = this;
         } else {
            var80 = this;// 670
            this.method912("value", "v3", "v4");
         }

         String var37 = var80.method904(var1, "add", false, "", true);// 691
         String var58 = this.method904(var1, "noadd", false, "", true);// 899
         Class580.method1932().method1880(var37);// 823
         Class580.method1932().method1885(var58);// 788
      } else if ("version-marker".equals(var6)) {
         if (var22.length() == 0) {// 927
            this.method886("value");// 833
         } else {
            Class580.method1923().method1660().method1746(var22);// 608
         }
      } else if ("fields-naming-prefix".equals(var6)) {
         Class580.method1923().method1660().method1743(var22);// 960
      } else if ("methods-naming-prefix".equals(var6)) {
         Class580.method1923().method1660().method1731(var22);// 914
      } else if ("classes-naming-prefix".equals(var6)) {
         Class580.method1923().method1660().method1738(var22);// 846
      } else if ("string-encryption-ignored-strings".equals(var6)) {
         if (var22.length() == 0) {// 975
            this.method899("value");// 883
         }

         if (!new File(var22).isAbsolute()) {// 881
            try {
               String var36;
               if ((var36 = new File(Class525.method1554(var3.field1330)).getCanonicalFile().getParent()) != null) {// 801 873
                  var22 = new File(var36 + File.separator + var22).getCanonicalPath();// 694
               }
            } catch (Exception var21) {// 923
               String var57;
               if ((var57 = new File(Class525.method1554(this.field1330)).getAbsoluteFile().getParent()) != null) {// 618 838
                  var22 = new File(var57 + File.separator + var22).getAbsolutePath();// 854
               }
            }
         }

         if (!new File(var22).exists()) {// 829
            throw new Class244(this.field1330, "Cannot find file '" + var22 + "'. " + this.method905());// 734
         } else {
            Class580.method1932().method1881(var22);// 675
         }
      } else if ("output-jar-comment".equals(var6)) {
         if ("disable".equals(var22) || "false".equals(var22)) {// 690
            Class580.method1932().method1868(false);// 835
         } else if (!"enable".equals(var22) && !"true".equals(var22)) {
            Class580.method1932().method1844(var22);// 974
         } else {
            Class580.method1932().method1868(true);// 682
         }
      } else if ("skip-renaming".equals(var6)) {
         if ("enable".equals(var22)) {// 649
            Class580.method1923().method1663(true);// 705
         } else if ("disable".equals(var22)) {// 697
            Class580.method1923().method1663(false);// 982
         } else {
            this.method912("value", "enable", "disable");// 613
         }
      } else if ("android-detection".equals(var6)) {
         if ("disable".equals(var22) || "false".equals(var22)) {// 768
            Class580.method1932().method1846(false);// 933
         }
      } else if ("generics".equals(var6)) {// 688
         byte var35 = 0;// 744
         Class445 var78;
         if ("remove".equals(var22)) {// 655
            var35 = 1;// 771
            var78 = this;
         } else if ("keep".equals(var22)) {// 863
            var35 = 0;// 864
            var78 = this;
         } else {
            var78 = this;// 950
            this.method912("value", "remove", "keep");
         }

         Class601 var56 = var78.method910(var4, null, null, null, "apply2class");// 671
         Class580.method1932().method1878(new Class587(var35, var56));// 727
      } else if ("inner-classes".equals(var6)) {
         byte var34 = 0;// 853
         Class445 var77;
         if ("remove".equals(var22)) {// 787
            var34 = 1;// 796
            var77 = this;
         } else if ("keep".equals(var22)) {// 782
            var34 = 0;// 870
            var77 = this;
         } else {
            var77 = this;// 676
            this.method912("value", "remove", "keep");
         }

         Class601 var55 = var77.method910(var4, null, null, null, "apply2class");// 836
         Class580.method1932().method1850(new Class587(var34, var55));// 956
      } else if ("throws-clause".equals(var6)) {
         byte var33 = 0;// 686
         Class445 var76;
         if ("remove".equals(var22)) {// 639
            var33 = 1;// 805
            var76 = this;
         } else if ("keep".equals(var22)) {// 822
            var33 = 0;// 627
            var76 = this;
         } else {
            var76 = this;// 976
            this.method912("value", "remove", "keep");
         }

         Class601 var54;
         (var54 = var76.method910(var4, null, null, null, "apply2class")).method2089(this.method908(var5, null, "apply2method", null));// 843 851
         Class580.method1932().method1875(new Class587(var33, var54));// 687
      } else if ("synthetize-fields".equals(var6)) {
         byte var32 = 1;// 666
         String var75;
         if (!"disable".equals(var22) && !"none".equals(var22)) {// 924
            if ("enable".equals(var22) || "all".equals(var22)) {// 625
               var22 = "private+";// 868
            }

            var75 = var22;// 772
         } else {
            var32 = 0;// 730
            var75 = var22 = "private+";// 845
         }

         if (var75.indexOf(32) == -1) {
            var22 = var22 + " *";
         }

         Class601 var53 = this.method910(var4, null, null, null, "apply2class");// 715

         try {
            var53.method2085(new Class549(var22, false));// 819
         } catch (Class225 var12) {// 814
            throw new Class244(this.field1330, "Invalid 'synthetize-fields' property. " + this.method905());// 920
         }

         Class580.method1939().method1476(new Class587(var32, var53));// 800
      } else if ("synthetize-methods".equals(var6)) {
         byte var31 = 1;// 896
         String var74;
         if (!"disable".equals(var22) && !"none".equals(var22)) {// 813
            if ("enable".equals(var22) || "all".equals(var22)) {// 669
               var22 = "private+";// 760
            }

            var74 = var22;// 954
         } else {
            var31 = 0;// 611
            var74 = var22 = "private+";// 702
         }

         if (var74.indexOf(40) == -1) {
            var22 = var22 + " *(**)";
         }

         Class601 var52 = this.method910(var4, null, null, null, "apply2class");// 824

         try {
            var52.method2089(new Class564(var22, false));// 928
         } catch (Class225 var13) {// 630
            throw new Class244(this.field1330, "Invalid 'synthetize-methods' property. " + this.method905());// 791
         }

         Class580.method1939().method1474(new Class587(var31, var52));// 815
      } else if ("set-fields-to-public".equals(var6)) {
         byte var30 = 1;// 747
         String var73;
         if (!"disable".equals(var22) && !"none".equals(var22)) {// 746
            if ("enable".equals(var22) || "all".equals(var22)) {// 891
               var22 = "private+";// 673
            }

            var73 = var22;// 629
         } else {
            var30 = 0;// 882
            var73 = var22 = "private+";// 826
         }

         if (var73.indexOf(32) == -1) {
            var22 = var22 + " *";
         }

         Class601 var51 = this.method910(var4, null, null, null, "apply2class");// 834

         try {
            var51.method2085(new Class549(var22, false));// 681
         } catch (Class225 var14) {// 759
            throw new Class244(this.field1330, "Invalid 'set-fields-to-public' property. " + this.method905());// 875
         }

         Class580.method1936().method1838(new Class587(var30, var51));// 900
      } else if ("set-methods-to-public".equals(var6)) {
         byte var29 = 1;// 732
         String var72;
         if (!"disable".equals(var22) && !"none".equals(var22)) {// 806
            if ("enable".equals(var22) || "all".equals(var22)) {// 947
               var22 = "private+";// 903
            }

            var72 = var22;// 907
         } else {
            var29 = 0;// 869
            var72 = var22 = "private+";// 911
         }

         if (var72.indexOf(40) == -1) {
            var22 = var22 + " *(**)";
         }

         Class601 var50 = this.method910(var4, null, null, null, "apply2class");// 909

         try {
            var50.method2089(new Class564(var22, false));// 962
         } catch (Class225 var15) {// 612
            throw new Class244(this.field1330, "Invalid 'set-methods-to-public' property. " + this.method905());// 874
         }

         Class580.method1936().method1839(new Class587(var29, var50));// 793
      } else if ("remove-calls".equals(var6)) {
         if (var22.length() < 3 || !var22.contains(".") || var22.startsWith(".") || var22.endsWith(".")) {// 757
            this.method899("value");// 726
         }

         String var28 = var22.substring(0, var22.lastIndexOf(46));// 720
         String var49 = var22.substring(var22.lastIndexOf(46) + 1);// 653
         Class601 var8;
         (var8 = this.method910(var4, null, null, null, "apply2class")).method2089(this.method908(var5, null, "apply2method", null));// 626 775
         Class580.method1937().method2023(new Class587(555, var8), var28, var49);// 643
      } else if ("remove-annotations".equals(var6)) {
         if (var22.length() < 1 || var22.startsWith(".") || var22.endsWith(".")) {// 807
            this.method899("value");// 849
         }

         Class601 var27 = this.method910(var4, null, null, null, "apply2class");// 871
         Class580.method1928().method650(new Class587(555, var27), var22);// 683
      } else if ("remove-toString".equals(var6)) {
         byte var26 = 0;// 839
         Class445 var71;
         if ("enable".equals(var22)) {// 607
            var26 = 1;// 641
            var71 = this;
         } else if ("disable".equals(var22)) {// 915
            var26 = 0;// 842
            var71 = this;
         } else {
            var71 = this;// 785
            this.method912("value", "enable", "disable");
         }

         Class601 var48 = var71.method910(var4, null, null, null, "apply2class");// 946
         Class580.method1925().method939(new Class587(var26, var48));// 745
      } else if ("keep-package-names".equals(var6)) {
         if ("enable".equals(var22)) {// 952
            Class580.method1923().method1667(true);// 616
         } else if ("disable".equals(var22)) {
            Class580.method1923().method1667(false);// 943
         } else {
            this.method912("value", "enable", "disable");// 830
         }
      } else if ("compatible-renaming".equals(var6)) {
         if ("enable".equals(var22)) {// 769
            Class580.method1923().method1656(true);// 922
         } else if ("disable".equals(var22)) {
            Class580.method1923().method1656(false);// 971
         } else {
            this.method912("value", "enable", "disable");// 859
         }
      } else if ("java6".equals(var6)) {
         if ("enable".equals(var22)) {// 926
            Class580.method1932().method1870(true);// 880
         } else if ("disable".equals(var22)) {// 857
            Class580.method1932().method1870(false);// 951
         } else {
            this.method912("value", "enable", "disable");// 645
         }
      } else if ("update-resource-names".equals(var6)) {
         if ("enable".equals(var22)) {// 707
            Class580.method1923().method1655().method1629(true);// 794
         } else if ("disable".equals(var22)) {// 831
            Class580.method1923().method1655().method1629(false);// 762
         } else {
            this.method912("value", "enable", "disable");// 624
         }
      } else if ("update-resource-contents".equals(var6)) {
         String var25 = this.method904(var1, "apply2file", false, "*", true);// 808
         if ("enable".equals(var22)) {// 648
            Class580.method1923().method1655().method1630(var25, true, "UTF-8");// 781
         } else if ("disable".equals(var22)) {// 905
            Class580.method1923().method1655().method1630(var25, false, "UTF-8");// 651
         } else if (var22.startsWith("enable:")) {// 983
            String var47 = var22.substring(7);// 678

            try {
               Charset.forName(var47);// 912
            } catch (Exception var16) {// 841
               throw new Class244(this.field1330, "Invalid encoding '" + var47 + "'. " + this.method905());// 729
            }

            Class580.method1923().method1655().method1630(var25, true, var47);// 797
         } else {
            this.method898("value", "enable", "enable:ENCODING", "disable");// 714
         }
      } else if ("com-license4j-support".equals(var6)) {
         if (var22 != null && var22.length() > 0) {// 965
            Class580.method1933().method1918(var22);// 646
         } else {
            this.method899("value");// 728
         }
      } else if ("output-jar-compression-level".equals(var6)) {
         try {
            int var24;
            if ((var24 = Integer.valueOf(var22)) >= -1 && var24 <= 9) {// 885 939
               Class580.method1938().method719(var24);// 978
            } else {
               var3.method899("value");// 614
            }
         } catch (Exception var17) {// 700
            this.method899("value");// 695
         }
      } else if ("output-jar-duplicate-name-entries".equals(var6)) {
         if ("keep".equals(var22)) {// 661
            Class580.method1938().method721(true);// 617
         } else if ("remove".equals(var22)) {// 719
            Class580.method1938().method721(false);// 938
         } else {
            this.method912("value", "remove", "keep");// 879
         }
      } else if ("test".equals(var6)) {
         byte var2 = 0;// 620
         Class445 var70;
         if ("enable".equals(var22)) {// 799
            var2 = 1;// 876
            var70 = this;
         } else if ("disable".equals(var22)) {// 964
            var2 = 0;// 886
            var70 = this;
         } else {
            var70 = this;// 887
            this.method912("value", "enable", "disable");
         }

         Class601 var7;
         (var7 = var70.method910(var4, null, null, null, "apply2class")).method2089(this.method908(var5, null, "apply2method", null));// 748 884
         Class580.method1927().method1805(new Class587(var2, var7));// 825
      } else if (!"test-string".equals(var6)) {
         throw new Class244(this.field1330, "Unknown property '" + var6 + "'. " + this.method905());// 635
      } else if (var22 != null && var22.length() > 0) {// 860
         Class580.method1927().method1802(var22);// 898
      } else {
         this.method899("value");// 615
      }
   }// 86 106 131 219 243 262 290 317 342 351 364 374 380 381 441 451 487 519 531 594 595 597 610 619 636 650 662 665 674 677 696 699 711 712 718 721 724 735 740 750 756 761 766 777 798 803 811 816 820 828 856 867 872 878 897 901 918 930 931 941 957 963

   // $VF: synthetic method
   public void method886(String var1) {
      throw new Class244(this.field1330, "Attribute '" + var1 + "' cannot have zero length. " + this.method905());// 1440
   }

   // $VF: synthetic method
   public void method887(String var1, String var2, String var3, String var4, String var5, String var6, String var7) {
      throw new Class244(
         this.field1330,// 1077
         "Attribute '"
            + var1
            + "' should have one of the following values: '"
            + var2
            + "', '"
            + var3
            + "', '"
            + var4
            + "', '"
            + var5
            + "', '"
            + var6
            + "' or '"
            + var7
            + "'. "
            + this.method905()
      );
   }

   // $VF: synthetic method
   public void method888(String var1, String var2) {
      String var4 = var1;
      Class445 var5 = this;
      if (this.field1336.length() > 0) {// 1288
         try {
            if (var4 != null && !new File(var4).isAbsolute()) {// 1436
               var4 = new File(new StringBuilder().insert(0, var5.field1336).append(File.separator).append(var4).toString()).getCanonicalPath();// 1433
            }

            if (var2 != null && !new File(var2).isAbsolute()) {// 1253
               var2 = new File(new StringBuilder().insert(0, var5.field1336).append(File.separator).append(var2).toString()).getCanonicalPath();// 1069
            }
         } catch (Exception var3) {
            if (var4 != null && !new File(var4).isAbsolute()) {// 1105
               var4 = new File(new StringBuilder().insert(0, this.field1336).append(File.separator).append(var4).toString()).getAbsolutePath();// 1525
            }

            if (var2 != null && !new File(var2).isAbsolute()) {// 1566
               var2 = new File(new StringBuilder().insert(0, this.field1336).append(File.separator).append(var2).toString()).getAbsolutePath();// 1338
            }
         }
      }

      if (!new File(var4).exists()) {// 1491
         throw new Class244(this.field1330, "Cannot find directory '" + var4 + "'. " + this.method905());
      } else if (!new File(var4).isDirectory()) {// 1508
         throw new Class244(this.field1330, "Cannot find directory '" + var4 + "'. " + this.method905());
      } else {
         Class580.method1935().method1350(new Class583(var4, var2));// 1568
      }
   }// 1255

   // $VF: synthetic method
   public void endElement(String var1, String var2, String var3) {
      if (!"jars".equals(var3) && !"input".equals(var3) && !"classpath".equals(var3) && !"class".equals(var3)) {// 164
         if ("ignore-classes".equals(var3)) {
            this.field1333 = false;// 599
         }
      } else {
         this.field1329 = -1;// 89
      }
   }// 88 506

   // $VF: synthetic method
   public boolean method889(String var1) {
      return var1.length() > 0 && new File(var1).isDirectory();// 703 862
   }

   // $VF: synthetic method
   public Class445(Class525 var1) {
      this.field1330 = var1;
      this.field1329 = -1;// 456
      this.field1333 = false;// 367
      this.field1336 = "";// 83
      this.field1338 = "";// 5
      this.field1334 = new Class407(this);// 470
      this.field1335 = true;// 1560
   }

   // $VF: synthetic method
   public void method890(String var1, String var2, String var3, String var4, String var5, String var6, String var7, String var8, String var9, String var10) {
      throw new Class244(
         this.field1330,
         "Attribute '"
            + var1
            + "' should have one of the following values: '"
            + var2
            + "', '"
            + var3
            + "', '"
            + var4
            + "', '"
            + var5
            + "', '"
            + var6
            + "', '"
            + var7
            + "', '"
            + var8
            + "', '"
            + var9
            + "' or '"
            + var10
            + "'. "// 1120
            + this.method905()
      );
   }

   // $VF: synthetic method
   public void method891(File var1, String var2, boolean var3) {
      Class445 var5 = this;

      int var4;
      for (int var10000 = var4 = (var1 = var1.listFiles()).length - 1; var10000 >= 0; var10000 = --var4) {// 1004 1506
         File var6;
         if (!(var6 = var1[var4]).isDirectory() && var6.getName().matches(var2)) {// 1044 1289
            Class580.method1941().method1907(var6.getAbsolutePath());// 1142
         }

         if (var3 && var6.isDirectory()) {// 1321
            var5.method891(var6, var2, var3);// 1293
         }
      }
   }// 1227

   // $VF: synthetic method
   public void method892(String var1, String var2) {
      Pattern var14 = Pattern.compile(var2.replaceAll("\\.", "\\\\.").replaceAll("\\*", "(.*)"));// 1428 1621
      String var7 = new StringBuilder().insert(0, this.method911("allatori-tmp-nested")).append(File.separator).toString();// 1027
      File var4 = new File(var7);// 1549
      if (this.field1335) {// 1118
         this.field1335 = false;// 1366
         if (var4.exists()) {// 1500
            File[] var5;
            int var6 = (var5 = var4.listFiles()).length;// 1542

            for (int var10000 = var12 = 0; var10000 < var6; var10000 = var12) {
               File var18 = var5[var12];
               var12++;
               var18.delete();
            }
         } else {
            new File(var7).mkdirs();// 1047
         }
      }

      JarFile var16;
      Enumeration var17 = (var16 = new JarFile(var1)).entries();// 1150 1528

      while (var17.hasMoreElements()) {
         JarEntry var13;
         if (!(var13 = (JarEntry)var17.nextElement()).isDirectory() && var14.matcher(var13.getName()).matches()) {// 1050 1389 1505 1676
            String var15 = new File(var13.getName()).getName();// 1670
            byte[] var8 = new byte[262144];// 1245
            FileOutputStream var9 = new FileOutputStream(var7 + var15);// 1616
            InputStream var10;
            InputStream var19 = var10 = var16.getInputStream(var13);// 1367

            int var11;
            while ((var11 = var19.read(var8)) > 0) {// 1228
               var19 = var10;
               var9.write(var8, 0, var11);// 1423
            }

            var9.close();// 1134
            var10.close();// 1610
            Class580.method1935().method1347(new Class351(var7 + var15, var7 + var15 + ".obf", var1, var13.getName()));// 1239
         }
      }

      var16.close();// 1339
   }// 1080

   // $VF: synthetic method
   public void method893(String var1, String var2) {
      String var9 = var1;
      Class445 var12 = this;
      if (this.field1336.length() > 0) {// 710
         try {
            if (var9 != null && !new File(var9).isAbsolute()) {// 767
               var9 = new File(new StringBuilder().insert(0, var12.field1336).append(File.separator).append(var9).toString()).getCanonicalPath();// 980
            }

            if (var2 != null && !new File(var2).isAbsolute()) {// 733
               var2 = new File(new StringBuilder().insert(0, var12.field1336).append(File.separator).append(var2).toString()).getCanonicalPath();// 792
            }
         } catch (Exception var8) {// 778
            if (var9 != null && !new File(var9).isAbsolute()) {// 640
               var9 = new File(new StringBuilder().insert(0, this.field1336).append(File.separator).append(var9).toString()).getAbsolutePath();// 940
            }

            if (var2 != null && !new File(var2).isAbsolute()) {// 606
               var2 = new File(new StringBuilder().insert(0, this.field1336).append(File.separator).append(var2).toString()).getAbsolutePath();// 780
            }
         }
      }

      if (var9 != null && var9.indexOf("*") != -1) {// 895
         String var4 = ".";// 685
         String var10;
         if ((var10 = var9).indexOf(File.separator) >= 0 || var10.indexOf(47) >= 0) {// 657 973
            int var3 = var10.lastIndexOf(File.separator);// 621
            if (var10.lastIndexOf(47) > var3) {// 709
               var3 = var10.lastIndexOf(47);
            }

            var4 = var10.substring(0, var3);// 893
            var10 = var10.substring(var3 + 1);// 917
         }

         File var13;
         if (!(var13 = new File(var4)).isDirectory()) {// 717 925
            throw new Class244(this.field1330, "Cannot find directory '" + var4 + "'. " + this.method905());// 783
         } else {
            Pattern var11 = Pattern.compile(var10.replaceAll("\\.", "\\\\.").replaceAll("\\*", "(.*)"));// 786 840 934

            for (int var18 = var14 = (var15 = var13.listFiles()).length - 1; var18 >= 0; var18 = --var14) {// 889 969
               File var5;
               Matcher var6;
               if (!(var5 = var15[var14]).isDirectory() && (var6 = var11.matcher(var5.getName())).matches()) {// 658 1199 1276 1292
                  String var17 = var6.group(1);// 1284
                  String var16 = var5.getAbsolutePath();// 994
                  String var7 = null;// 1209
                  if (var2 != null) {// 1682
                     var7 = var2.replaceFirst("\\*", var17);
                  }

                  Class580.method1935().method1348(new Class352(var16, var7));// 1135
               }
            }
         }
      } else if (!new File(var9).exists()) {// 790
         throw new Class244(this.field1330, "Cannot find file '" + var9 + "'. " + this.method905());
      } else {
         Class580.method1935().method1348(new Class352(var9, var2));// 942
      }
   }// 812 1483

   // $VF: synthetic method
   public void method894(String var1, String var2, String var3, String var4, String var5, String var6, String var7, String var8) {
      throw new Class244(
         this.field1330,// 1598
         "Attribute '"
            + var1
            + "' should have one of the following values: '"
            + var2
            + "', '"
            + var3
            + "', '"
            + var4
            + "', '"
            + var5
            + "', '"
            + var6
            + "', '"
            + var7
            + "' or '"
            + var8
            + "'. "
            + this.method905()
      );
   }

   // $VF: synthetic method
   public void method895(String var1, String var2, String var3, String var4, String var5, String var6, String var7, String var8, String var9) {
      throw new Class244(
         this.field1330,
         "Attribute '"// 1405
            + var1
            + "' should have one of the following values: '"
            + var2
            + "', '"
            + var3
            + "', '"
            + var4
            + "', '"
            + var5
            + "', '"
            + var6
            + "', '"
            + var7
            + "', '"
            + var8
            + "' or '"
            + var9
            + "'. "
            + this.method905()
      );
   }

   // $VF: synthetic method
   public String[] method896(String var1) {
      Class445 var9 = this;
      String var8 = var1.substring(7, var1.length() - 1);// 1015
      File var2;
      if (!(var2 = new File(var8)).isAbsolute()) {// 1188 1519
         try {
            String var3;
            if ((var3 = new File(Class525.method1554(var9.field1330)).getCanonicalFile().getParent()) != null) {// 1139 1674
               var8 = new File(var3 + File.separator + var8).getCanonicalPath();// 1382
            }
         } catch (Exception var6) {// 1637
            String var4;
            if ((var4 = new File(Class525.method1554(this.field1330)).getAbsoluteFile().getParent()) != null) {// 1246 1376
               var8 = new File(var4 + File.separator + var8).getAbsolutePath();// 1401
            }
         }

         var2 = new File(var8);// 1265
      }

      if (!var2.exists()) {// 1645
         throw new Class244(this.field1330, "Cannot find file '" + var8 + "'. " + this.method905());// 1545
      } else {
         String[] var10;
         try {
            var10 = Class550.method1728(var2, "UTF-8", true);// 1354
         } catch (Exception var5) {// 1510
            throw new Class244(this.field1330, new StringBuilder().insert(0, var5.getMessage()).append(" ").append(this.method905()).toString());
         }

         if (var10 != null && var10.length != 0) {// 1198 1457 1553
            return var10;// 1302
         } else {
            throw new Class244(this.field1330, "File '" + var8 + "' is empty. " + this.method905());// 1152
         }
      }
   }

   // $VF: synthetic method
   public void method897(String var1) {
      String var4 = var1;
      Class445 var5 = this;
      if (Class580.method1935().method1344().size() == 0) {// 1217
         throw new Class244(this.field1330, "Cannot find parent jar. " + this.method905());
      } else {
         Class352 var2 = (Class352)Class580.method1935().method1344().lastElement();// 1196
         if (var1.startsWith("/")) {// 1360
            var4 = var1.substring(1);
         }

         try {
            var5.method892(var2.field1049, var4);// 1274
         } catch (Exception var3) {// 1315
            throw new Class244(this.field1330, new StringBuilder().insert(0, var3.getMessage()).append(" ").append(this.method905()).toString());// 1191
         }
      }
   }// 1375

   // $VF: synthetic method
   public void method898(String var1, String var2, String var3, String var4) {
      throw new Class244(
         this.field1330,
         "Attribute '" + var1 + "' should have one of the following values: '" + var2 + "', '" + var3 + "' or '" + var4 + "'. " + this.method905()// 1546
      );
   }

   // $VF: synthetic method
   public void method899(String var1) {
      throw new Class244(this.field1330, "Invalid '" + var1 + "' attribute. " + this.method905());// 1390
   }

   // $VF: synthetic method
   public String method900(String var1, String var2, String var3) {
      String var5;
      if ((var5 = var1) == null) {// 987 1181
         if (!Class356.method675(var2)) {// 1218
            this.method899("access");// 1585
         }

         var5 = var2 + var3;// 1104
      }

      return var5;// 1654
   }

   // $VF: synthetic method
   public void method901(String var1, String var2, String var3, String var4, String var5) {
      throw new Class244(
         this.field1330,
         "Attribute '"
            + var1
            + "' should have one of the following values: '"
            + var2
            + "', '"
            + var3
            + "', '"
            + var4
            + "' or '"// 1332
            + var5
            + "'. "
            + this.method905()
      );
   }

   // $VF: synthetic method
   public void startElement(String var1, String var2, String var3, Attributes var4) {
      Class445 var33 = this;
      if (!"config".equals(var3)) {// 97
         if (!"keep-names".equals(var3)) {
            if ("ignore-classes".equals(var3)) {
               this.field1333 = true;// 138
            } else if ("jars".equals(var3) || "input".equals(var3)) {
               this.field1329 = 1;
               this.field1336 = this.method904(var4, "basedir", false, "", true);// 32 119
               this.field1336 = this.method911(this.field1336);// 238
               if (!"".equals(this.field1336) && !this.method889(this.field1336)) {// 423
                  throw new Class244(this.field1330, "Invalid base directory '" + this.field1336 + "'. " + this.method905());// 61
               } else {
                  if ((var1 = this.method904(var4, "single-jar", false, null, true)) != null && !new File(var1).isAbsolute()) {// 220 525
                     try {
                        var1 = new File(new StringBuilder().insert(0, var33.field1336).append(File.separator).append(var1).toString()).getCanonicalPath();// 336
                     } catch (Exception var11) {// 540
                        var1 = new File(new StringBuilder().insert(0, this.field1336).append(File.separator).append(var1).toString()).getAbsolutePath();// 291
                     }
                  }

                  Class580.method1935().method1343(var1);// 169
               }
            } else if ("jar".equals(var3) && this.field1329 == 1) {
               var1 = this.method904(var4, "in", true, "", true);// 299
               var2 = this.method904(var4, "out", !Class580.method1929().method1696(), "", true);// 314
               this.method893(var1, var2);// 137
            } else if ("nested".equals(var3) && this.field1329 == 1) {
               this.method897(this.method904(var4, "in", true, "", true));// 135 253
            } else if ("dir".equals(var3) && this.field1329 == 1) {
               var1 = this.method904(var4, "in", true, "", true);// 443
               var2 = this.method904(var4, "out", !Class580.method1929().method1696(), "", true);// 166
               this.method888(var1, var2);// 434
            } else {
               if ("jar".equals(var3) && this.field1329 == 2) {
                  String[] var30 = this.method904(var4, "name", true, "", true).split(File.pathSeparator);// 72 373

                  int var38;
                  for (int var54 = var38 = 0; var54 < var30.length; var54 = var38) {// 268
                     var33.method906(var30[var38++]);// 497
                  }
               } else if ("classpath".equals(var3)) {// 66
                  this.field1329 = 2;
                  this.field1338 = this.method904(var4, "basedir", false, "", true);// 307 536
                  this.field1338 = this.method911(this.field1338);// 218
                  if (!"".equals(this.field1338) && !this.method889(this.field1338)) {// 109
                     throw new Class244(this.field1330, "Invalid base directory '" + this.field1338 + "'. " + this.method905());// 213
                  }
               } else {
                  if ("class".equals(var3)) {// 15
                     this.field1329 = 3;
                     var1 = this.method904(var4, "template", false, null, true);// 471
                     var2 = this.method904(var4, "access", false, null, true);// 270 385
                     String var37 = this.method904(var4, "ignore", false, null, true);// 582
                     String var42 = this.method904(var4, "stop", false, null, true);// 177
                     this.field1331 = this.method910(var1, var2, var37, var42, "template");// 266
                     if (!this.field1333) {// 235
                        Class580.method1923().method1662().method969(this.field1331);// 280
                        return;
                     }

                     Class580.method1924().method2042(this.field1331);// 516
                     return;// 95
                  }

                  if ("field".equals(var3)) {
                     var1 = this.method904(var4, "template", false, null, true);// 227
                     var2 = this.method904(var4, "access", false, null, true);// 55
                     String var36 = this.method904(var4, "stop", false, null, true);// 77
                     Class549 var41 = this.method907(var1, var2, var36);// 288
                     if (this.field1329 == 3) {// 129
                        if (this.field1331 == null) {// 258
                           throw new Class244(this.field1330, "Error in configuration. " + this.method905());// 107
                        }

                        this.field1331.method2085(var41);// 437
                        return;// 110
                     }

                     Class580.method1923().method1662().method962(var41);// 221
                     return;// 601
                  }

                  if ("method".equals(var3)) {
                     var1 = this.method904(var4, "template", false, null, true);// 193
                     var2 = this.method904(var4, "access", false, null, true);// 251
                     String var5 = this.method904(var4, "parameters", false, null, true);// 486
                     String var6 = this.method904(var4, "stop", false, null, true);// 117
                     Class564 var7 = this.method908(var1, var2, "template", var6);// 300
                     if (this.field1329 == 3) {// 245
                        if (this.field1331 == null) {// 296
                           throw new Class244(this.field1330, "Error in configuration. " + this.method905());// 404
                        }

                        this.field1331.method2089(var7);// 417
                        if ("keep".equals(var5)) {// 81
                           Class601 var8;
                           (var8 = this.field1331.method2095()).method2089(var7);// 394 401
                           Class524 var52 = Class580.method1923().method1658();// 556
                           Class580.method1923().method1658();
                           var52.method1552(new Class587(5, var8));
                           return;// 316
                        }
                     } else {
                        Class580.method1923().method1662().method967(var7);// 275
                        if ("keep".equals(var5)) {// 127
                           try {
                              Class601 var45;
                              (var45 = new Class601("class *", false, false)).method2089(var7);// 369 496
                              Class524 var53 = Class580.method1923().method1658();// 215
                              Class580.method1923().method1658();
                              var53.method1552(new Class587(5, var45));
                              return;// 382
                           } catch (Class225 var10) {// 511
                              return;// 103
                           }
                        }
                     }
                  } else {
                     if (!"watermark".equals(var3)) {
                        if ("property".equals(var3)) {
                           this.method885(var4);// 499
                           return;// 76
                        }

                        if ("trial".equals(var3)) {
                           var1 = this.method904(var4, "class", true, null, true);// 145
                           var2 = this.method904(var4, "method", true, null, true);// 390
                           Class580.method1921().method933(var1);// 573
                           Class580.method1921().method936(var2);// 520
                           Class601 var40 = this.method910(this.method904(var4, "add2class", false, "private+ class *", true), null, null, null, "add2class");// 172 188
                           Class580.method1921().method932(new Class587(1, var40));// 564
                           Class564 var48 = this.method908(this.method904(var4, "add2method", false, "private+ <init>(**)", true), null, "add2method", null);// 48 281
                           var40.method2089(var48);// 438
                           String var51 = this.method904(var4, "passthis", false, "no", true);// 483
                           if (!"yes".equals(var51) && !"true".equals(var51)) {// 181
                              Class580.method1921().method931(false);// 413
                              return;// 320
                           }

                           Class580.method1921().method931(true);// 433
                           return;
                        }

                        if ("expiry".equals(var3)) {
                           var1 = this.method904(var4, "date", true, null, true);// 478
                           Matcher var26;
                           if (!(var26 = Pattern.compile("(\\d{4}).(\\d{2}).(\\d{2})").matcher(var1)).matches()) {// 365 366
                              throw new Class244(this.field1330, "Date format is yyyy-mm-dd. " + this.method905());// 263
                           }

                           try {
                              Calendar var34 = Calendar.getInstance();// 532
                              int var39 = Integer.parseInt(var26.group(1));// 297
                              int var43 = Integer.parseInt(var26.group(2));// 426
                              int var46 = Integer.parseInt(var26.group(3));// 11
                              if (var43 > 12 || var46 > 31) {// 356
                                 throw new Exception();
                              }

                              var34.set(var39, var43 - 1, var46, 0, 0, 0);// 522
                              Date var9 = var34.getTime();// 41
                              Class580.method1926().method1649(var9);// 551
                              SimpleDateFormat var17 = new SimpleDateFormat("MMMMM dd, yyyy");// 91
                              Class528.method1557("Expiry date set to " + var17.format(var9));// 360
                           } catch (Exception var12) {// 312
                              throw new Class244(this.field1330, "Date format is yyyy-mm-dd. " + this.method905());
                           }

                           String var35 = this.method904(var4, "string", true, null, true);// 274 340 501
                           Class580.method1926().method1644(var35);// 337
                           Class601 var44 = this.method910(this.method904(var4, "add2class", false, "private+ class *", true), null, null, null, "add2class");// 168 237
                           Class580.method1926().method1647(new Class587(1, var44));// 133
                           String var47 = this.method904(var4, "add2method", false, "no input value", true);// 65
                           if ("no input value".equals(var47)) {// 504
                              Class564 var50 = this.method908("private+ <init>(**)", null, "add2method", null);// 80
                              var44.method2089(var50);
                              var44.method2089(this.method908("public static void main(**)", null, "add2method", null));// 114 283 544
                              return;// 460
                           }

                           Class564 var49 = this.method908(var47, null, "add2method", null);// 102
                           var44.method2089(var49);// 105
                           return;// 205
                        }

                        throw new Class244(this.field1330, "Unknown tag '" + var3 + "'. " + this.method905());// 64
                     }

                     var1 = this.method904(var4, "key", true, null, false);// 548
                     if ("".equals(var1)) {// 545
                        this.method886("key");// 570
                     }

                     Class580.method1929().method1694(var1);// 523
                     if (!Class580.method1929().method1696()) {// 162
                        var2 = this.method904(var4, "value", true, null, false);// 282
                        if ("".equals(var2)) {// 503
                           this.method886("value");// 339
                        }

                        Class580.method1929().method1693(var2);// 308
                        return;// 549
                     }
                  }
               }
            }
         }
      }
   }// 50 216 249 285 292 411 468 474

   // $VF: synthetic method
   public void method902(String var1, String var2) {
      throw new Class244(this.field1330, "Either '" + var1 + "' or '" + var2 + "' attribute should be defined. " + this.method905());// 1207
   }

   // $VF: synthetic method
   public void method903(String var1, String var2, String var3, String var4, String var5, String var6) {
      throw new Class244(
         this.field1330,
         "Attribute '"
            + var1
            + "' should have one of the following values: '"
            + var2
            + "', '"
            + var3
            + "', '"
            + var4
            + "', '"// 1663
            + var5
            + "' or '"
            + var6
            + "'. "
            + this.method905()
      );
   }

   // $VF: synthetic method
   public Class445(Class525 var1, Class491 var2) {
      this(var1);// 160
   }

   // $VF: synthetic method
   public String method904(Attributes var1, String var2, boolean var3, String var4, boolean var5) {
      String var9;
      if ((var9 = var1.getValue(var2)) == null && var3) {// 679 972
         throw new Class244(this.field1330, "Missing '" + var2 + "' attribute. " + this.method905());// 888
      } else if (var9 == null) {// 623
         return var4;
      } else {
         while (var9.contains("${System.getProperty(")) {// 656
            if ((var3 = var9.indexOf("${System.getProperty(")) >= 0) {// 774 877
               int var13;
               if ((var13 = var9.indexOf(")}", var3)) < var3) {// 716 810
                  throw new Class244(this.field1330, "Invalid '" + var2 + "' attribute. " + this.method905());// 945
               }

               String var6;
               String var7;
               if ((var7 = System.getProperty(var6 = var9.substring(var3 + 21, var13))) == null) {// 644 743 953
                  throw new Class244(this.field1330, "Missing system property '" + var6 + "'. " + this.method905());// 667
               }

               var9 = new StringBuilder().insert(0, var9.substring(0, var3)).append(var7).append(var9.substring(var13 + 2)).toString();// 701
            }
         }

         while (var9.contains("${System.getenv(")) {// 913
            if ((var3 = var9.indexOf("${System.getenv(")) >= 0) {// 713 832
               int var14;
               if ((var14 = var9.indexOf(")}", var3)) < var3) {// 773 955
                  throw new Class244(this.field1330, "Invalid '" + var2 + "' attribute. " + this.method905());// 758
               }

               String var15;
               String var16;
               if ((var16 = System.getenv(var15 = var9.substring(var3 + 16, var14))) == null) {// 664 935 944
                  throw new Class244(this.field1330, "Missing environment variable '" + var15 + "'. " + this.method905());// 663
               }

               var9 = new StringBuilder().insert(0, var9.substring(0, var3)).append(var16).append(var9.substring(var14 + 2)).toString();// 706
            }
         }

         return var5 ? var9.trim() : var9;// 894
      }
   }

   // $VF: synthetic method
   public String method905() {
      return "[Line: " + this.field1334.getLineNumber() + "]";// 668
   }

   // $VF: synthetic method
   public void method906(String var1) {
      String var11;
      label52: {
         var6 = var1;
         Class445 var8 = this;
         label51:
         if (this.field1338.length() > 0 && !new File(var1).isAbsolute()) {// 1444
            try {
               var6 = new File(new StringBuilder().insert(0, var8.field1338).append(File.separator).append(var6).toString()).getCanonicalPath();// 1399
            } catch (Exception var5) {// 1614
               var6 = new File(new StringBuilder().insert(0, this.field1338).append(File.separator).append(var6).toString()).getAbsolutePath();// 1259
               break label51;
            }

            var11 = var6;
            break label52;// 1679
         }

         var11 = var6;// 1593
      }

      while (var11.endsWith(File.separator)) {
         var11 = var6 = var6.substring(0, var6.length() - File.separator.length());
      }

      if (var6.indexOf(42) == -1) {// 1582
         Class580.method1941().method1907(var6);// 1400
      } else {
         String var2 = ".";// 1048
         String var4 = var6;// 1084
         if (var6.indexOf(File.separator) >= 0 || var6.indexOf(47) >= 0) {// 1229
            int var3 = var6.lastIndexOf(File.separator);// 1538
            if (var6.lastIndexOf(47) > var3) {// 1028
               var3 = var6.lastIndexOf(47);
            }

            var2 = var6.substring(0, var3);// 1643
            var4 = var6.substring(var3 + 1);// 1564
         }

         boolean var9 = false;// 1561
         if (var2.endsWith("**")) {// 1081
            var2 = var2.substring(0, var2.length() - 2);// 1494
            var9 = true;// 1442
         }

         File var7;
         if (!(var7 = new File(var2)).isDirectory()) {// 1138 1432
            throw new Class244(this.field1330, "Cannot find directory '" + var2 + "'. " + this.method905());// 1496
         } else {
            var4 = var4.replaceAll("\\.", "\\\\.").replaceAll("\\*", ".*");// 1208 1222
            this.method891(var7, var4, var9);// 1397
         }
      }
   }// 1025 1330

   // $VF: synthetic method
   public Class549 method907(String var1, String var2, String var3) {
      Class445 var4 = this;
      this.method909(var1, var2);// 1154
      boolean var6 = false;// 1156
      if ("yes".equals(var3) || "true".equals(var3)) {// 1660
         var6 = true;// 1320
      }

      try {
         return new Class549(var4.method900(var1, var2, " *"), var6);// 1297
      } catch (Class225 var5) {
         if (var1 != null) {// 1493
            this.method899("template");// 1591
         } else {
            this.method899("access");// 1201
         }

         return null;// 1211
      }
   }

   // $VF: synthetic method
   public Class564 method908(String var1, String var2, String var3, String var4) {
      Class445 var5 = this;
      this.method909(var1, var2);// 1016
      boolean var7 = false;// 1258
      if ("yes".equals(var4) || "true".equals(var4)) {// 1415
         var7 = true;// 1333
      }

      try {
         return new Class564(var5.method900(var1, var2, " *(**)"), var7);// 1349
      } catch (Class225 var6) {
         if (var1 != null) {// 1241
            this.method899(var3);// 1522
         } else {
            this.method899("access");// 1391
         }

         return null;// 1006
      }
   }

   // $VF: synthetic method
   public void method909(String var1, String var2) {
      if (var1 == null && var2 == null) {// 1230
         this.method902("template", "access");// 1185
      }
   }// 1040

   // $VF: synthetic method
   public Class601 method910(String var1, String var2, String var3, String var4, String var5) {
      Class445 var11 = this;
      this.method909(var1, var2);// 1383
      boolean var6 = false;// 1532
      boolean var7 = false;// 1232
      if (var3 != null) {// 1509
         if ("yes".equals(var3) || "true".equals(var3)) {// 1588
            var6 = true;// 995
         } else if ("keep-if-members-match".equals(var3)) {// 1379
            var7 = true;// 1426
         } else if (!"no".equals(var3) && !"false".equals(var3)) {// 988
            this.method903("ignore", "true", "false", "yes", "no", "keep-if-members-match");// 1024
         }
      }

      boolean var10 = false;// 1173
      if ("yes".equals(var4) || "true".equals(var4)) {// 997
         var10 = true;// 1552
      }

      try {
         return new Class601(var11.method900(var1, var2, " class *"), var6, var10, var7);// 1365
      } catch (Class225 var8) {
         if (var1 != null) {// 1282
            this.method899(var5);// 1362
         } else {
            this.method899("access");// 1280
         }

         return null;// 1064
      }
   }

   // $VF: synthetic method
   public String method911(String var1) {
      Class445 var2 = this;
      if ("".equals(var1) || !new File(var1).isAbsolute()) {// 637
         try {
            String var5;
            if ((var5 = new File(Class525.method1554(var2.field1330)).getCanonicalFile().getParent()) != null) {// 642 961
               return new File(var5 + File.separator + var1).getCanonicalPath();// 622
            }
         } catch (Exception var3) {// 659
            String var4;
            if ((var4 = new File(Class525.method1554(this.field1330)).getAbsoluteFile().getParent()) != null) {// 628 904
               return new File(var4 + File.separator + var1).getAbsolutePath();// 804
            }
         }
      }

      return var1;// 817
   }

   // $VF: synthetic method
   public void setDocumentLocator(Locator var1) {
      if (var1 != null) {// 223
         this.field1334 = var1;// 45
      }
   }// 23

   // $VF: synthetic method
   public void method912(String var1, String var2, String var3) {
      throw new Class244(
         this.field1330, "Attribute '" + var1 + "' should have one of the following values: '" + var2 + "' or '" + var3 + "'. " + this.method905()// 1452
      );
   }
}
