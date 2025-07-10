package mapped;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;

// $VF: Compiled from ka
public abstract class Class138 implements Serializable {
   // $VF: synthetic field
   public static final Class142 field575 = new Class142((byte)6);
   // $VF: synthetic field
   public static final Class142 field576 = new Class142((byte)7);
   // $VF: synthetic field
   public static ThreadLocal field577 = new Class510();
   // $VF: synthetic field
   public static final Class142 field578 = new Class142((byte)11);
   // $VF: synthetic field
   public static final Class137 field579 = new Class146();
   // $VF: synthetic field
   public static final Class144 field580 = new Class144("java.lang.Throwable");
   // $VF: synthetic field
   public static final Class142 field581 = new Class142((byte)9);
   // $VF: synthetic field
   public static final Class138[] field582 = new Class138[0];
   // $VF: synthetic field
   public static final Class144 field583 = new Class144("java.lang.Object");
   // $VF: synthetic field
   public static final Class142 field584 = new Class142((byte)4);
   // $VF: synthetic field
   public static final Class142 field585 = new Class142((byte)5);
   // $VF: synthetic field
   public static final Class142 field586 = new Class142((byte)12);
   // $VF: synthetic field
   public static final Class144 field587 = new Class144("java.lang.StringBuffer");
   // $VF: synthetic field
   public static final Class144 field588 = new Class144("java.lang.Class");
   // $VF: synthetic field
   public byte field589;
   // $VF: synthetic field
   public String field590;
   // $VF: synthetic field
   public static final Class142 field591 = new Class142((byte)10);
   // $VF: synthetic field
   public static final Class138 field592 = new Class143((byte)15, "<unknown object>");
   // $VF: synthetic field
   public static final Class144 field593 = new Class144("java.lang.String");
   // $VF: synthetic field
   public static final Class142 field594 = new Class142((byte)8);

   // $VF: synthetic method
   public byte method142() {
      return this.field589;// 59
   }

   // $VF: synthetic method
   public static int method143(int var0) {
      return var0 & 3;// 133
   }

   // $VF: synthetic method
   public static int method34(int var0, int var1) {
      return var1 << 2 | var0;// 102
   }

   // $VF: synthetic method
   public static Class138[] method144(Class[] var0) {
      Class[] var1 = var0;
      Class138[] var3 = new Class138[var0.length];// 225

      int var2;
      for (int var10000 = var2 = 0; var10000 < var3.length; var10000 = var2) {// 532
         int var10001 = var2;
         Class138 var10002 = method154(var1[var2]);
         var2++;
         var3[var10001] = var10002;// 297
      }

      return var3;// 11
   }

   // $VF: synthetic method
   public int hashCode() {
      return this.field589 ^ this.field590.hashCode();// 493
   }

   // $VF: synthetic method
   public boolean equals(Object var1) {
      if (var1 instanceof Class138) {// 358
         Class138 var3 = (Class138)var1;// 192
         return this.field589 == var3.field589 && this.field590.equals(var3.field590);// 574
      } else {
         return false;// 321
      }
   }

   // $VF: synthetic method
   public static int method145(ThreadLocal var0) {
      return (Integer)var0.get();// 116
   }

   // $VF: synthetic method
   public static Class138[] method146(String var0) {
      String var2 = var0;
      ArrayList var1 = new ArrayList();// 288

      try {
         if (var2.charAt(0) != '(') {// 437
            throw new Class239("Invalid method signature: " + var2);// 110
         }

         for (int var4 = 1; var2.charAt(var4) != ')'; var4 += method145(field577)) {// 444 486 601
            var1.add(method151(var2.substring(var4)));// 193
         }
      } catch (StringIndexOutOfBoundsException var3) {
         throw new Class239("Invalid method signature: " + var2);// 245
      }

      Class138[] var5 = new Class138[var1.size()];// 404
      var1.toArray(var5);// 417
      return var5;// 81
   }

   // $VF: synthetic method
   public static int method147(int var0) {
      return var0 >> 2;// 283
   }

   // $VF: synthetic method
   public String method20() {
      return this.field590;// 246
   }

   // $VF: synthetic method
   public int method2() {
      switch (this.field589) {// 398
         case 7:
         case 11:
            while (false) {
            }

            return 2;// 586
         case 12:
            return 0;// 232
         default:
            return 1;// 198
      }
   }

   // $VF: synthetic method
   public static String method148(Class138 var0, Class138[] var1) {
      StringBuffer var5 = new StringBuffer("(");// 367
      int var4 = var1 == null ? 0 : var1.length;// 82

      int var3;
      for (int var10000 = var3 = 0; var10000 < var4; var10000 = var3) {// 83
         var5.append(var1[var3++].method20());// 5
      }

      var5.append(')');// 450
      var5.append(var0.method20());// 386
      return var5.toString();// 470
   }

   // $VF: synthetic method
   public static String method149(Method var0) {
      StringBuffer var4 = new StringBuffer("(");// 91
      Class[] var2 = var0.getParameterTypes();// 360

      int var3;
      for (int var10000 = var3 = 0; var10000 < var2.length; var10000 = var3) {// 312
         Class var10001 = var2[var3];
         var3++;
         var4.append(method154(var10001).method20());// 340
      }

      var4.append(")");// 558
      var4.append(method154(var0.getReturnType()).method20());// 501
      return var4.toString();// 337
   }

   // $VF: synthetic method
   public static Class138 method150(String var0) {
      try {
         return method151(var0.substring(var0.lastIndexOf(41) + 1));// 385 471
      } catch (StringIndexOutOfBoundsException var1) {
         throw new Class239("Invalid method signature: " + var0);// 582
      }
   }

   // $VF: synthetic method
   public static final Class138 method151(String var0) {
      byte var4;
      if ((var4 = Class523.method1523(var0)) <= 12) {// 138 285
         method155(field577, 1);// 32
         return Class142.method158(var4);// 238
      } else if (var4 != 13) {// 423
         int var6;
         if ((var6 = var0.indexOf(59)) < 0) {// 50 137
            throw new Class239("Invalid signature: " + var0);// 253
         } else {
            method155(field577, var6 + 1);// 443
            return new Class144(var0.substring(1, var6).replace('/', '.'));// 166
         }
      } else {
         int var5 = 0;// 61

         while (var0.charAt(++var5) == '[') {// 220 593
         }

         Class138 var2 = method151(var0.substring(var5));// 540
         int var3 = method145(field577) + var5;// 169
         method155(field577, var3);// 216
         return new Class145(var2, var5);// 299
      }
   }

   // $VF: synthetic method
   public static int method152(String var0) {
      return method143(method106(var0.substring(var0.lastIndexOf(41) + 1)));// 508 517
   }

   // $VF: synthetic method
   public static int method153(String var0) {
      String var3 = var0;
      int var1 = 0;// 64

      try {
         if (var3.charAt(0) != '(') {// 349
            throw new Class239("Invalid method signature: " + var3);// 196
         } else {
            int var2 = 1;// 554

            while (var3.charAt(var2) != ')') {// 429
               int var5 = method106(var3.substring(var2));// 89
               var1 += method143(var5);// 506
               var2 += method147(var5);// 599
            }

            return var1;// 331
         }
      } catch (StringIndexOutOfBoundsException var4) {// 88
         throw new Class239("Invalid method signature: " + var3, var4);// 306
      }
   }

   // $VF: synthetic method
   public String toString() {
      return !this.equals(field579) && this.field589 < 15 ? Class523.method1509(this.field590, false) : this.field590;// 455
   }

   // $VF: synthetic method
   public static int method106(String var0) {
      byte var3;
      if ((var3 = Class523.method1523(var0)) <= 12) {// 363 602
         return method34(Class142.method158(var3).method2(), 1);// 509
      } else if (var3 != 13) {// 35
         int var5;
         if ((var5 = var0.indexOf(59)) < 0) {// 305 346
            throw new Class239("Invalid signature: " + var0);// 228
         } else {
            return method34(1, var5 + 1);// 219
         }
      } else {
         int var4 = 0;// 233

         while (var0.charAt(++var4) == '[') {// 256 357
         }

         int var2 = method147(method106(var0.substring(var4)));// 182
         return method34(1, var4 + var2);// 4
      }
   }

   // $VF: synthetic method
   public static Class138 method154(Class var0) {
      if (var0 == null) {// 496
         throw new IllegalArgumentException("Class must not be null");// 369
      } else if (var0.isArray()) {// 576
         return method151(var0.getName());// 103
      } else if (var0.isPrimitive()) {// 548
         if (var0 == int.class) {// 545
            return field591;// 570
         } else if (var0 == void.class) {// 523
            return field586;// 162
         } else if (var0 == double.class) {// 282
            return field576;// 503
         } else if (var0 == float.class) {// 339
            return field575;// 308
         } else if (var0 == boolean.class) {// 596
            return field584;// 549
         } else if (var0 == byte.class) {// 499
            return field594;// 76
         } else if (var0 == short.class) {// 145
            return field581;// 390
         } else if (var0 == byte.class) {// 573
            return field594;// 520
         } else if (var0 == long.class) {// 502
            return field578;// 188
         } else if (var0 == char.class) {// 172
            return field585;// 564
         } else {
            throw new IllegalStateException("Ooops, what primitive type is " + var0);// 281
         }
      } else {
         return new Class144(var0.getName());// 483
      }
   }

   // $VF: synthetic method
   public static void method155(ThreadLocal var0, int var1) {
      var0.set(new Integer(var1));// 21
   }// 115

   // $VF: synthetic method
   public Class138(byte var1, String var2) {
      this.field589 = var1;// 190
      this.field590 = var2;// 58 315
   }// 465
}
