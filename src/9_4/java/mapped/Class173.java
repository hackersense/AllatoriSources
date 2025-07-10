package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from de
public final class Class173 extends Class151 {
   // $VF: synthetic field
   public int field657;

   // $VF: synthetic method
   public static final void method218(Class435 var0, StringBuffer var1) {
      Class435 var2 = var0;
      int var6;
      if ((var6 = var0.read()) == -1) {// 23
         throw new RuntimeException("Illegal signature: " + var0.method871() + " no ident, reaching EOF");// 440
      } else if (!method44(var6)) {// 468
         StringBuffer var9 = new StringBuffer();// 138
         int var4 = 1;// 285

         for (int var10000 = var6; Character.isJavaIdentifierPart((char)var10000); var10000 = var6) {// 119
            var4++;// 238
            var9.append((char)var6);// 32
            var6 = var2.read();// 423
         }

         if (var6 == 58) {// 525
            var2.skip(17L);// 220
            var1.append(var9);// 593
            int var8 = var2.read();// 336
            var2.method870();// 540
         } else {
            int var5;
            for (int var10 = var5 = 0; var10 < var4; var10 = var5) {// 169
               var5++;
               var2.method870();// 216
            }
         }
      } else {
         StringBuffer var3 = new StringBuffer();// 253
         int var7 = var0.read();// 135

         do {
            var3.append((char)var7);// 443
            var7 = var2.read();// 166
         } while (var7 != -1 && (Character.isJavaIdentifierPart((char)var7) || var7 == 47));// 292

         var1.append(var3.toString().replace('/', '.'));// 373
         if (var7 != -1) {// 268
            var2.method870();// 497
         }
      }
   }// 57 137 536

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1032(this);// 179
   }// 146

   // $VF: synthetic method
   public final int method30() {
      return this.field657;// 555
   }

   // $VF: synthetic method
   public static final boolean method126(String var0) {
      return var0.startsWith("L") && var0.endsWith(">;");// 576
   }

   // $VF: synthetic method
   public static boolean method44(int var0) {
      return var0 == 84 || var0 == 76;// 25
   }

   // $VF: synthetic method
   public Class173(int var1, int var2, int var3, Class149 var4) {
      super((byte)10, var1, var2, var4);
      this.field657 = var3;// 159 493
   }// 561

   // $VF: synthetic method
   public static final void method219(Class435 var0, StringBuffer var1) {
      Class435 var2 = var0;
      method218(var0, var1);// 15
      int var3;
      Class435 var6;
      if ((var3 = var0.read()) != 60 && var3 != 40) {// 385 471
         var6 = var0;// 437
         var0.method870();
      } else {
         var1.append((char)var3);// 582
         method219(var0, var1);// 177

         for (Class435 var10000 = var0; (var4 = var10000.read()) != 62 && var4 != 41; var10000 = var2) {// 266
            if (var4 == -1) {// 235
               throw new RuntimeException("Illegal signature: " + var2.method871() + " reaching EOF");// 280
            }

            var1.append(", ");// 227
            var2.method870();
            method219(var2, var1);// 55 77
         }

         var1.append((char)var4);// 258
         var6 = var2;
      }

      int var5;
      if (method44(var5 = var6.read())) {// 221 444
         var2.method870();
         method219(var2, var1);// 193 601
      } else if (var5 == 41) {
         var2.method870();// 486
      } else if (var5 != 59) {// 300
         throw new RuntimeException("Illegal signature: " + var2.method871() + " read " + (char)var5);// 245
      }
   }// 117 251 404

   // $VF: synthetic method
   public final String method93() {
      return ((Class191)this.field616.method171(this.field657, (byte)1)).method20();// 38 269
   }

   // $VF: synthetic method
   public Class173(int var1, int var2, DataInputStream var3, Class149 var4) {
      this(var1, var2, var3.readUnsignedShort(), var4);// 170
   }// 553

   // $VF: synthetic method
   public static String method166(String var0) {
      StringBuffer var2 = new StringBuffer();// 556
      method219(new Class435(var0), var2);// 316
      return var2.toString();// 207
   }

   // $VF: synthetic method
   @Override
   public Class151 method181(Class149 var1) {
      return (Class173)this.clone();// 573
   }

   // $VF: synthetic method
   public static final boolean method127(String var0) {
      return var0.startsWith("<") && var0.indexOf(58) > 0;// 369
   }

   // $VF: synthetic method
   public final void method89(int var1) {
      this.field657 = var1;// 232
   }// 463

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      super.method3(var1);
      var1.writeShort(this.field657);// 466 467
   }// 485

   // $VF: synthetic method
   public Class173(Class173 var1) {
      this(var1.method17(), var1.method2(), var1.method30(), var1.method94());// 338
   }// 273
}
