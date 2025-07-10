package mapped;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

// $VF: Compiled from ka
public final class Class599 {
   // $VF: synthetic field
   public static final Class599 field2392 = new Class599(6, "VZCBSIFJD", 6, 7);
   // $VF: synthetic field
   public static final Class599 field2393 = new Class599(2, "VZCBSIFJD", 2, 3);
   // $VF: synthetic field
   public static final Class599 field2394 = new Class599(1, "VZCBSIFJD", 1, 2);
   // $VF: synthetic field
   public static final int field2395 = 5;
   // $VF: synthetic field
   public static final int field2396 = 12;
   // $VF: synthetic field
   public static final int field2397 = 10;
   // $VF: synthetic field
   public static final int field2398 = 8;
   // $VF: synthetic field
   public static final Class599 field2399 = new Class599(5, "VZCBSIFJD", 5, 6);
   // $VF: synthetic field
   public static final Class599 field2400 = new Class599(8, "VZCBSIFJD", 8, 9);
   // $VF: synthetic field
   public final int field2401;
   // $VF: synthetic field
   public static final int field2402 = 0;
   // $VF: synthetic field
   public static final int field2403 = 4;
   // $VF: synthetic field
   public final int field2404;
   // $VF: synthetic field
   public static final Class599 field2405 = new Class599(3, "VZCBSIFJD", 3, 4);
   // $VF: synthetic field
   public static final int field2406 = 2;
   // $VF: synthetic field
   public static final int field2407 = 7;
   // $VF: synthetic field
   public static final int field2408 = 1;
   // $VF: synthetic field
   public static final int field2409 = 6;
   // $VF: synthetic field
   public static final Class599 field2410 = new Class599(0, "VZCBSIFJD", 0, 1);
   // $VF: synthetic field
   public final String field2411;
   // $VF: synthetic field
   public static final int field2412 = 9;
   // $VF: synthetic field
   public static final int field2413 = 3;
   // $VF: synthetic field
   public static final int field2414 = 11;
   // $VF: synthetic field
   public static final String field2415 = "VZCBSIFJD";
   // $VF: synthetic field
   public static final Class599 field2416 = new Class599(4, "VZCBSIFJD", 4, 5);
   // $VF: synthetic field
   public static final Class599 field2417 = new Class599(7, "VZCBSIFJD", 7, 8);
   // $VF: synthetic field
   public final int field2418;

   // $VF: synthetic method
   public boolean equals(Object var1) {
      var1 = this;
      if (this == var1) {// 964
         return true;// 886
      } else if (!(var1 instanceof Class599)) {// 887
         return false;// 884
      } else {
         this = var1;// 825
         int var11;
         Class599 var10001;
         if (this.field2404 == 12) {// 872
            var11 = 10;
            var10001 = this;
         } else {
            var11 = this.field2404;
            var10001 = this;
         }

         if (var11 != (var10001.field2404 == 12 ? 10 : this.field2404)) {
            return false;// 860
         } else {
            int var2 = this.field2418;// 723
            int var4 = this.field2401;// 615
            int var3 = this.field2418;// 798
            int var5 = this.field2401;// 635
            if (var4 - var2 != var5 - var3) {// 699
               return false;// 970
            } else {
               var2 = var2;
               var3 = var3;

               for (int var12 = var2; var12 < var4; var3++) {
                  if (var1.field2411.charAt(var2) != this.field2411.charAt(var3)) {// 679
                     return false;// 888
                  }

                  var12 = ++var2;// 972
               }

               return true;// 656
            }
         }
      }
   }

   // $VF: synthetic method
   public static String method2044(String var0) {
      return "Invalid descriptor: " + var0;
   }

   // $VF: synthetic method
   public static String method2045(Method var0) {
      StringBuilder var5;
      (var5 = new StringBuilder()).append('(');// 43 535
      Class[] var2 = var0.getParameterTypes();// 293
      int var4 = var2.length;

      int var3;
      for (int var10000 = var3 = 0; var10000 < var4; var10000 = var3) {// 54
         method2065(var2[var3++], var5);// 322
      }

      var5.append(')');// 317
      method2065(var0.getReturnType(), var5);// 241
      return var5.toString();// 526
   }

   // $VF: synthetic method
   public static String method2046(Class var0) {
      StringBuilder var2 = new StringBuilder();// 244
      method2065(var0, var2);// 247
      return var2.toString();// 259
   }

   // $VF: synthetic method
   public static Class599 method2047(String var0) {
      Class599 var10000 = new Class599;
      byte var10002;
      String var10003;
      if (var0.charAt(0) == '[') {// 210
         var10002 = 9;
         var10003 = var0;
      } else {
         var10002 = 12;
         var10003 = var0;
      }

      var10000./* $VF: Unable to resugar constructor */<init>(var10002, var10003, 0, var0.length());
      return var10000;// 382
   }

   // $VF: synthetic method
   public static String method2048(Class var0) {
      return var0.getName().replace('.', '/');// 120
   }

   // $VF: synthetic method
   public static Class599 method2049(String var0, int var1, int var2) {
      switch (var0.charAt(var1)) {// 362
         case '(':
            return new Class599(11, var0, var1, var2);// 131
         case 'B':
            while (false) {
            }

            return field2405;// 126
         case 'C':
            return field2393;// 343
         case 'D':
            return field2400;// 505
         case 'F':
            return field2392;// 432
         case 'I':
            return field2399;// 492
         case 'J':
            return field2417;// 155
         case 'L':
            return new Class599(10, var0, var1 + 1, var2 - 1);// 86
         case 'S':
            return field2416;// 519
         case 'V':
            return field2410;// 542
         case 'Z':
            return field2394;// 420
         case '[':
            return new Class599(9, var0, var1, var2);// 583
         default:
            throw new IllegalArgumentException(method2044(var0));// 289
      }
   }

   // $VF: synthetic method
   public int method2050() {
      switch (this.field2404) {// 755
         case 0:
            while (false) {
            }

            return 0;// 649
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 9:
         case 10:
         case 12:
            return 1;// 744
         case 7:
         case 8:
            return 2;// 863
         case 11:
         default:
            throw new AssertionError();// 647
      }
   }

   // $VF: synthetic method
   public static Class599 method2051(String var0) {
      return method2049(var0, method2064(var0), var0.length());// 122 305
   }

   // $VF: synthetic method
   public Class599[] method2052() {
      return method2059(this.method2061());// 413
   }

   // $VF: synthetic method
   public int method2053(int var1) {
      if (var1 != 46 && var1 != 79) {// 785
         switch (this.field2404) {// 762
            case 0:
               while (false) {
               }

               if (var1 != 172) {// 624
                  throw new UnsupportedOperationException();// 931
               } else {
                  return 177;// 648
               }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
               return var1;// 809
            case 6:
               return var1 + 2;// 841
            case 7:
               return var1 + 1;// 776
            case 8:
               return var1 + 3;// 674
            case 9:
            case 10:
            case 12:
               if (var1 != 21 && var1 != 54 && var1 != 172) {// 646
                  throw new UnsupportedOperationException();// 795
               }

               return var1 + 4;// 766
            case 11:
               throw new UnsupportedOperationException();// 939
            default:
               throw new AssertionError();// 614
         }
      } else {
         switch (this.field2404) {// 946
            case 0:
            case 11:
               throw new UnsupportedOperationException();// 645
            case 1:
            case 3:
               while (false) {
               }

               return var1 + 5;// 952
            case 2:
               return var1 + 6;// 878
            case 4:
               return var1 + 7;// 856
            case 5:
               return var1;// 957
            case 6:
               return var1 + 2;// 922
            case 7:
               return var1 + 1;// 971
            case 8:
               return var1 + 3;// 859
            case 9:
            case 10:
            case 12:
               return var1 + 4;// 857
            default:
               throw new AssertionError();// 707
         }
      }
   }

   // $VF: synthetic method
   public static int method2054(String var0) {
      String var2 = var0;
      int var4 = 1;// 834
      int var5 = 1;// 681
      char var3;
      char var10000 = var3 = var0.charAt(var5);// 759

      while (var10000 != ')') {// 742
         String var8;
         if (var3 != 'J' && var3 != 'D') {// 900
            for (String var9 = var2; var9.charAt(var5) == '['; var5++) {// 869
               var9 = var2;// 911
            }

            var10000 = var2.charAt(var5);// 903
            var5++;
            if (var10000 == 'L') {
               int var1 = var2.indexOf(59, var5);// 907
               var5 = Math.max(var5, var1 + 1);// 909
            }

            var4++;// 962
            var8 = var2;// 874
         } else {
            var5++;// 740
            var8 = var2;// 732
            var4 += 2;
         }

         var10000 = var3 = var8.charAt(var5);
      }

      if ((var3 = var2.charAt(var5 + 1)) == 'V') {// 793 820
         return var4 << 2;// 757
      } else {
         int var6 = var3 != 'J' && var3 != 'D' ? 1 : 2;// 720
         return var4 << 2 | var6;// 653
      }
   }

   // $VF: synthetic method
   public static String method2055(Constructor var0) {
      StringBuilder var1;
      (var1 = new StringBuilder()).append('(');// 309 590
      Class[] var2 = var0.getParameterTypes();// 430
      int var4 = var2.length;

      for (int var10000 = var5 = 0; var10000 < var4; var10000 = var5) {// 442
         method2065(var2[var5++], var1);// 344
      }

      return var1.append(")V").toString();// 449
   }

   // $VF: synthetic method
   public void method2056(StringBuilder var1) {
      if (this.field2404 == 10) {// 359
         var1.append(this.field2411, this.field2418 - 1, this.field2401 + 1);// 408
      } else if (this.field2404 == 12) {// 313
         var1.append('L').append(this.field2411, this.field2418, this.field2401).append(';');// 277
      } else {
         var1.append(this.field2411, this.field2418, this.field2401);// 459
      }
   }// 203

   // $VF: synthetic method
   public static String method2057(Class599 var0, Class599... var1) {
      StringBuilder var5;
      (var5 = new StringBuilder()).append('(');// 111 587
      Class599[] var6 = var1;
      int var4 = var1.length;

      int var3;
      for (int var10000 = var3 = 0; var10000 < var4; var10000 = var3) {// 304
         var6[var3++].method2056(var5);// 153
      }

      var5.append(')');// 53
      var0.method2056(var5);// 584
      return var5.toString();// 200
   }

   // $VF: synthetic method
   public static int method2058(String var0) {
      String var2 = var0;
      int var1 = 0;// 851
      int var4 = 1;// 696

      for (String var10000 = var0; var10000.charAt(var4) != ')'; var10000 = var2) {// 924
         for (String var5 = var2; var5.charAt(var4) == '['; var4++) {// 730
            var5 = var2;// 845
         }

         char var6 = var2.charAt(var4);// 868
         var4++;
         if (var6 == 'L') {
            int var3 = var2.indexOf(59, var4);// 772
            var4 = Math.max(var4, var3 + 1);// 715
         }

         var1++;// 819
      }

      return var1;// 920
   }

   // $VF: synthetic method
   public Class599(int var1, String var2, int var3, int var4) {
      this.field2404 = var1;// 115
      this.field2411 = var2;// 223
      this.field2418 = var3;// 45
      this.field2401 = var4;// 21 23
   }// 440

   // $VF: synthetic method
   public static Class599[] method2059(String var0) {
      String var2 = var0;
      Class599[] var1 = new Class599[method2058(var0)];// 91 522
      int var6 = 1;// 312
      int var3 = 0;// 274

      for (String var10000 = var0; var10000.charAt(var6) != ')'; var10000 = var2) {// 558
         int var4 = var6;// 501

         for (String var7 = var2; var7.charAt(var6) == '['; var6++) {// 337
            var7 = var2;// 208
         }

         char var8 = var2.charAt(var6);// 237
         var6++;
         if (var8 == 'L') {
            int var5 = var2.indexOf(59, var6);// 65
            var6 = Math.max(var6, var5 + 1);// 504
         }

         var1[var3++] = method2049(var2, var4, var6);// 283 544
      }

      return var1;// 460
   }

   // $VF: synthetic method
   public int method2060() {
      Class599 var1 = this;
      int var2 = 1;// 838

      for (Class599 var10000 = this; var10000.field2411.charAt(var1.field2418 + var2) == '['; var2++) {// 854
         var10000 = var1;// 844
      }

      return var2;// 829
   }

   // $VF: synthetic method
   public String method2061() {
      if (this.field2404 == 10) {// 569
         return this.field2411.substring(this.field2418 - 1, this.field2401 + 1);// 445
      } else {
         return this.field2404 == 12// 425
            ? method2071(this.field2411.substring(this.field2418, this.field2401))// 327
            : this.field2411.substring(this.field2418, this.field2401);// 383
      }
   }

   // $VF: synthetic method
   public static Class599 method2062(Class var0) {
      if (var0.isPrimitive()) {// 137
         if (var0 == int.class) {// 50
            return field2399;// 253
         } else if (var0 == void.class) {// 135
            return field2410;// 474
         } else if (var0 == boolean.class) {// 443
            return field2394;// 166
         } else if (var0 == byte.class) {// 434
            return field2405;// 292
         } else if (var0 == char.class) {// 373
            return field2393;// 72
         } else if (var0 == short.class) {// 268
            return field2416;// 497
         } else if (var0 == double.class) {// 66
            return field2400;// 536
         } else if (var0 == float.class) {// 307
            return field2392;// 218
         } else if (var0 == long.class) {// 109
            return field2417;// 213
         } else {
            throw new AssertionError();// 385
         }
      } else {
         return method2076(method2046(var0));// 582
      }
   }

   // $VF: synthetic method
   public static Class599 method2063(Method var0) {
      return method2076(method2045(var0));// 251
   }

   // $VF: synthetic method
   public static int method2064(String var0) {
      String var1 = var0;
      int var3 = 1;// 361

      label28:
      while (true) {
         String var10000 = var1;// 354

         while (var10000.charAt(var3) != ')') {
            for (String var4 = var1; var4.charAt(var3) == '['; var3++) {// 224
               var4 = var1;// 494
            }

            char var5 = var1.charAt(var3);// 174
            var3++;
            if (var5 != 'L') {
               continue label28;
            }

            var10000 = var1;// 375
            int var2 = var1.indexOf(59, var3);
            var3 = Math.max(var3, var2 + 1);// 191
         }

         return var3 + 1;// 547
      }
   }

   // $VF: synthetic method
   public static void method2065(Class var0, StringBuilder var1) {
      for (Class var10000 = var0 = var0; var10000.isArray(); var10000 = var0) {// 79 500
         var1.append('[');// 396
         var0 = var0.getComponentType();// 364
      }

      if (var0.isPrimitive()) {// 861
         char var3;
         StringBuilder var5;
         if (var0 == int.class) {// 847
            var3 = 'I';// 958
            var5 = var1;
         } else if (var0 == void.class) {// 605
            var3 = 'V';// 712
            var5 = var1;
         } else if (var0 == boolean.class) {// 985
            var3 = 'Z';// 921
            var5 = var1;
         } else if (var0 == byte.class) {// 677
            var3 = 'B';// 698
            var5 = var1;
         } else if (var0 == char.class) {// 689
            var3 = 'C';// 811
            var5 = var1;
         } else if (var0 == short.class) {// 764
            var3 = 'S';// 821
            var5 = var1;
         } else if (var0 == double.class) {// 654
            var3 = 'D';// 609
            var5 = var1;
         } else if (var0 == float.class) {// 633
            var3 = 'F';// 684
            var5 = var1;
         } else {
            if (var0 != long.class) {// 892
               throw new AssertionError();// 966
            }

            var3 = 'J';// 632
            var5 = var1;
         }

         var5.append(var3);// 968
      } else {
         var1.append('L').append(method2048(var0)).append(';');// 670
      }
   }// 899 936

   // $VF: synthetic method
   public int hashCode() {
      Class599 var2 = this;
      int var1 = 13 * (this.field2404 == 12 ? 10 : this.field2404);// 701
      if (this.field2404 >= 9) {// 638
         int var4 = this.field2418;
         int var3 = this.field2401;

         for (int var5 = var4; var5 < var3; var5 = var4) {// 741
            char var10002 = var2.field2411.charAt(var4);
            var4++;
            var1 = 17 * (var1 + var10002);// 913
         }
      }

      return var1;// 955
   }

   // $VF: synthetic method
   public Class599 method2066() {
      int var2 = this.method2060();// 394
      return method2049(this.field2411, this.field2418 + var2, this.field2401);// 556
   }

   // $VF: synthetic method
   public static Class599 method2067(Class599 var0, Class599... var1) {
      return method2076(method2057(var0, var1));// 172
   }

   // $VF: synthetic method
   public int method2068() {
      return this.field2404 == 12 ? 10 : this.field2404;// 756
   }

   // $VF: synthetic method
   public int method2069() {
      return method2054(this.method2061());// 928
   }

   // $VF: synthetic method
   public static Class599 method2070(String var0) {
      return new Class599(11, var0, 0, var0.length());// 308
   }

   // $VF: synthetic method
   public static String method2071(String var0) {
      return "L" + var0 + ";";
   }

   // $VF: synthetic method
   public Class599 method2072() {
      return method2051(this.method2061());// 363
   }

   // $VF: synthetic method
   public String method2073() {
      switch (this.field2404) {// 475
         case 0:
            while (false) {
            }

            return "void";// 202
         case 1:
            return "boolean";// 128
         case 2:
            return "char";// 199
         case 3:
            return "byte";// 538
         case 4:
            return "short";// 176
         case 5:
            return "int";// 124
         case 6:
            return "float";// 152
         case 7:
            return "long";// 98
         case 8:
            return "double";// 405
         case 9:
            StringBuilder var3 = new StringBuilder(this.method2066().method2073());// 16

            int var2;
            for (int var10000 = var2 = this.method2060(); var10000 > 0; var10000 = var2) {// 121
               var2--;
               var3.append("[]");// 480
            }

            return var3.toString();// 472
         case 10:
         case 12:
            return this.field2411.substring(this.field2418, this.field2401).replace('/', '.');// 380
         case 11:
         default:
            throw new AssertionError();// 180
      }
   }

   // $VF: synthetic method
   public static Class599 method2074(Method var0) {
      return method2062(var0.getReturnType());// 508
   }

   // $VF: synthetic method
   public static Class599[] method2075(Method var0) {
      Class[] var1;
      Class599[] var2 = new Class599[(var1 = var0.getParameterTypes()).length];// 164 554

      for (int var10000 = var4 = var1.length - 1; var10000 >= 0; var10000 = var4) {// 429
         int var10001 = var4;
         Class599 var10002 = method2062(var1[var4]);
         var4--;
         var2[var10001] = var10002;// 89
      }

      return var2;// 599
   }

   // $VF: synthetic method
   public static Class599 method2076(String var0) {
      return method2049(var0, 0, var0.length());// 220
   }

   // $VF: synthetic method
   public int method2077() {
      return method2058(this.method2061());// 836
   }

   // $VF: synthetic method
   public static Class599 method2078(Constructor var0) {
      return method2076(method2055(var0));// 288
   }

   // $VF: synthetic method
   public String method2079() {
      return this.field2411.substring(this.field2418, this.field2401);// 319
   }
}
