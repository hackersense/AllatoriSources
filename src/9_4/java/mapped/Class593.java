package mapped;

import smardecSB.ProductInformation;
import smardecSB.iconst_x;
import smardecSB.pop2;
import smardecSB.sipush;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

// $VF: Compiled from hp
public class Class593 {
   // $VF: synthetic field
   public String field2380;
   // $VF: synthetic field
   public Class338 field2381;

   // $VF: synthetic method
   public boolean method2026(Class246 var1) {
      return var1.method18() instanceof sipush// 382
             && var1.method32() != null// 210
             && var1.method32().method18() instanceof sipush
             && var1.method32().method32() != null// 576
             && var1.method32().method32().method18() instanceof sipush
             && var1.method32().method32().method32() != null// 103
             && var1.method32().method32().method32().method18() instanceof sipush
             && var1.method32().method32().method32().method32() != null// 548
             && var1.method32().method32().method32().method32().method18() instanceof pop2
             && var1.method32().method32().method32().method32().method32() != null// 545
             && var1.method32().method32().method32().method32().method32().method18() instanceof pop2;
   }

   // $VF: synthetic method
   public void method2027(String var1) {
      Class593 var2 = this;

      try {
         Vector var5;
         if (var2.method2031(var5 = var2.method2034())) {// 310 498
            throw new Class245("The jar file already contains watermark.");// 484
         } else {
            Class337.method550(var5);
            short[] var6 = var2.method2029(var1);// 389

            int var3;
            for (int var10000 = var3 = var5.size() - var6.length / 4; var10000 > 0; var10000 = var3) {// 18 409
               var3--;
               var5.remove(0);// 513
            }

            var2.method2033(var5, var6);// 93
         }
      } catch (Exception var4) {// 151
         System.out.println("############### EXCEPTION (" + ProductInformation.getVersionString() + ") ###############");// 530
         var4.printStackTrace();// 491
         System.out.println("#################################################");// 147
         throw new Class245("Watermarking error: " + var4.getMessage());// 295
      }
   }// 338

   // $VF: synthetic method
   public short[] method2028(Vector var1) {
      Class593 var2 = this;
      Vector var5 = new Vector();// 486

      int var3;
      for (int var10000 = var3 = var1.size() - 1; var10000 >= 0; var10000 = --var3) {// 117
         for (Class246 var8 = var6 = Class596.method2039((Class596)var1.get(var3)).method42().method32(); var8 != null; var8 = var6 = var6.method32()) {// 245 296 300
            if (var2.method2026(var6)) {// 404
               var5.add(((sipush)var6.method18()).method27());// 417
               var5.add(((sipush)var6.method32().method18()).method27());// 81
               var5.add(((sipush)var6.method32().method32().method18()).method27());// 401
               var5.add(((sipush)var6.method32().method32().method32().method18()).method27());// 394
            }
         }
      }

      int var4;
      for (int var9 = var4 = (var7 = new short[var5.size()]).length - 1; var9 >= 0; var9 = var4) {// 127 275
         int var10001 = var4;
         short var10002 = ((Number)var5.get(var4)).shortValue();
         var4--;
         var7[var10001] = var10002;// 355
      }

      return var7;// 496
   }

   // $VF: synthetic method
   public short[] method2029(String var1) {
      int var7;
      byte[] var10;
      int var10000 = var7 = (var10 = var1.getBytes("UTF-8")).length;// 146 179

      while (var10000 % 4 != 0) {// 400
         var10000 = ++var7;
      }

      byte[] var3 = new byte[var7];// 33
      Arrays.fill(var3, (byte)0);
      var3[0] = var10[0];// 278 603
      if (var10.length > 1) {// 466
         var3[1] = (byte)(var3[1] | var10[1] ^ var10[0]);// 467
      }

      int var4;
      for (int var26 = var4 = 2; var26 < var10.length; var26 = var4) {// 485
         int var10001 = var4;
         byte var10002 = (byte)(var3[var4] | var10[var4] ^ var10[var4 - 1] ^ var10[var4 - 2]);// 68
         var4++;
         var3[var10001] = var10002;
      }

      for (int var27 = var4 = var10.length; var27 < var7; var27 = var4) {// 59
         int var35 = var4;
         byte var40 = (byte)(var3[var4] | Class337.method549(256));// 391
         var4++;
         var3[var35] = var40;
      }

      byte[] var19 = this.field2380.getBytes();// 589

      int var5;
      for (int var28 = var5 = 0; var28 < var3.length; var28 = var5) {// 579
         int var36 = var5;
         byte var41 = (byte)(var3[var5] ^ var19[var5 % var19.length]);// 555
         var5++;
         var3[var36] = var41;
      }

      var5 = var7;// 415
      int var8;
      var10000 = var8 = (int)((double)var7 * (0.666 + Class337.method547() / 3.0)) + 113;// 398

      while (var10000 % 4 != 0) {// 428
         var10000 = ++var8;
      }

      short[] var9;
      short[] var37 = var9 = new short[var7 + var8];// 87
      byte var30 = 0;// 586
      Arrays.fill(var37, (short)0);

      for (byte var20 = 0; var30 < var9.length; var30 = var20) {
         if (var20 < var5) {// 463
            var9[var20 + 2] = (short)(var9[var20 + 2] | var3[var20] << 8 | var3[var20 + 2] & 255);
            var9[var20 + 3] = (short)(var9[var20 + 3] | var3[var20 + 1] << 8 | var3[var20 + 3] & 255);// 198 424
         } else {
            var9[var20 + 2] = (short)(var9[var20 + 2] | Class337.method549(2147483647));// 588
            var9[var20 + 3] = (short)(var9[var20 + 3] | Class337.method549(2147483647));// 329
         }

         var20 += 4;// 232
      }

      Hashtable var21 = new Hashtable();// 269
      boolean var12 = false;
      short var13 = (short)(0 | this.field2380.hashCode());// 148 455
      var21.put(new Short(var13), "");// 236
      byte var14 = 0;

      for (byte var31 = var14; var31 < var9.length; var31 = var14) {
         short var6 = (short)(Class337.method549(65536) - 32768);// 39

         for (Hashtable var32 = var21; var32.containsKey(new Short(var6)); var32 = var21) {// 368
            var6++;
         }

         var21.put(new Short(var6), "");// 99
         var9[var14] = var6;// 160
         if (var14 > 3) {// 40
            var9[var14 - 3] = var6;// 63
         }

         var14 += 4;// 142
      }

      for (int var33 = var15 = var5 + 4 * Class337.method549(20); var33 < var9.length; var33 = var15) {// 550
         int var38 = var15 + 1;// 510
         short var42 = var9[Class337.method549(var5 / 4) * 4];
         var15 += 4;
         var9[var38] = var42;
      }

      int var16 = this.field2380.hashCode();// 367
      var9[var9.length - 4] = var9[var9.length - 3] = var9[var9.length - 2] = var9[var9.length - 1] = 0;// 82
      var9[var9.length - 4] = (short)(var9[var9.length - 4] | var16);// 83
      var9[var9.length - 3] = (short)(var9[var9.length - 3] | var16 >> 16);// 5
      var9[var9.length - 2] = (short)(var9[var9.length - 2] | var9[0]);// 279
      var9[var9.length - 1] = (short)(var9[var9.length - 1] | var10.length);// 450

      byte var25;
      for (byte var34 = var25 = 0; var34 < var9.length; var34 = var25) {// 108
         short var11 = var9[var25];// 27
         short var17 = var9[var25 + 1];
         short var22 = var9[var25 + 2];
         short var24 = var9[var25 + 3];
         var9[var25] = var9[var25 + 1] = var9[var25 + 2] = var9[var25 + 3] = 0;// 242
         var9[var25] = (short)(var9[var25] | var11 ^ var17 ^ var22);
         var9[var25 + 1] = (short)(var9[var25 + 1] | var17 ^ var22 ^ var24);// 209
         var9[var25 + 2] = (short)(var9[var25 + 2] | var11 ^ var22 ^ var24);// 69
         int var39 = var25 + 3;// 94 116
         short var43 = (short)(var9[var25 + 3] | var11 ^ var17 ^ var24);
         var25 += 4;
         var9[var39] = var43;
      }

      return var9;// 464
   }

   // $VF: synthetic method
   public boolean method2030(Class200[] var1) {
      if (var1 == null) {// 177
         return true;
      } else {
         for (int var10000 = var4 = 0; var10000 < var1.length; var10000 = ++var4) {// 266
            Class200 var3;
            if (!((var3 = var1[var4]) instanceof Class201) && !(var3 instanceof Class199)) {// 235 280
               return false;// 370
            }
         }

         return true;// 95
      }
   }

   // $VF: synthetic method
   public boolean method2031(Vector var1) {
      Class593 var3 = this;

      int var2;
      for (int var10000 = var2 = var1.size() - 1; var10000 >= 0; var10000 = --var2) {// 288
         for (Class246 var5 = var4 = Class596.method2039((Class596)var1.get(var2)).method42().method32(); var5 != null; var5 = var4 = var4.method32()) {// 107 129 258
            if (var3.method2026(var4)) {// 437
               return true;// 110
            }
         }
      }

      return false;// 444
   }

   // $VF: synthetic method
   public String method2032(short[] var1) {
      for (byte var10000 = var7 = 0; var10000 < var1.length; var10000 = var7) {
         short var4 = var1[var7];// 308
         short var3 = var1[var7 + 1];// 596
         short var5 = var1[var7 + 2];// 549
         short var6 = var1[var7 + 3];// 499
         var1[var7] = var1[var7 + 1] = var1[var7 + 2] = var1[var7 + 3] = 0;// 76
         var1[var7] = (short)(var1[var7] | var4 ^ var5 ^ var6);
         short[] var26;
         if (var1[var7] % 2 == 0) {// 390 520
            var26 = var1;// 502
            var1[var7 + 1] = (short)(var1[var7 + 1] | var4 ^ var3 ^ var6);
         } else {
            var26 = var1;// 172
            var1[var7 + 1] = (short)(var1[var7 + 1] | var3 ^ var5 ^ var1[var7]);
         }

         short[] var27;
         if (var26[var7 + 1] % 4 == 0) {// 48
            var27 = var1;// 281
            var1[var7 + 2] = (short)(var1[var7 + 2] | var4 ^ var3 ^ var5);
         } else if (var1[var7 + 1] % 4 == 1) {// 438
            var27 = var1;// 592
            var1[var7 + 2] = (short)(var1[var7 + 2] | var4 ^ var1[var7] ^ var1[var7 + 1]);
         } else if (var1[var7 + 1] % 4 == 2) {// 483
            var27 = var1;// 181
            var1[var7 + 2] = (short)(var1[var7 + 2] | var5 ^ var6 ^ var1[var7 + 1]);
         } else {
            var27 = var1;// 125
            var1[var7 + 2] = (short)(var1[var7 + 2] | var3 ^ var6 ^ var1[var7]);
         }

         if (var27[var7 + 2] % 7 == 0) {// 320
            var1[var7 + 3] = (short)(var1[var7 + 3] | var3 ^ var5 ^ var6);// 478
         } else if (var1[var7 + 2] % 7 == 1) {// 212
            var1[var7 + 3] = (short)(var1[var7 + 3] | var6 ^ var1[var7] ^ var1[var7 + 1]);// 365
         } else if (var1[var7 + 2] % 7 == 2) {// 366
            var1[var7 + 3] = (short)(var1[var7 + 3] | var5 ^ var1[var7] ^ var1[var7 + 2]);// 263
         } else if (var1[var7 + 2] % 7 == 3) {// 225
            var1[var7 + 3] = (short)(var1[var7 + 3] | var3 ^ var1[var7 + 1] ^ var1[var7 + 2]);// 532
         } else if (var1[var7 + 2] % 7 == 4) {// 297
            var1[var7 + 3] = (short)(var1[var7 + 3] | var4 ^ var3 ^ var1[var7]);// 426
         } else if (var1[var7 + 2] % 7 == 5) {// 11
            var1[var7 + 3] = (short)(var1[var7 + 3] | var4 ^ var5 ^ var1[var7 + 1]);// 356
         } else {
            var1[var7 + 3] = (short)(var1[var7 + 3] | var4 ^ var6 ^ var1[var7 + 2]);// 41
         }

         var7 += 4;// 339
      }

      int var8 = this.field2380.hashCode();// 360
      int var17 = 0;// 312
      int var12 = 0;
      var17 = (short)(var17 | var8);// 340
      var12 = (short)(var12 | var8 >> 16);// 274
      byte var24 = -1;// 558
      Hashtable var25 = new Hashtable();// 501

      for (byte var28 = var9 = 0; var28 < var1.length; var28 = var9) {
         var25.put(new Short(var1[var9]), new Integer(var9));// 208
         if (var1[var9] == var17 && var1[var9 + 1] == var12) {// 168
            if (var24 != -1) {// 237
               throw new Exception();// 504
            }

            var24 = var9;// 133
         }

         var9 += 4;// 337
      }

      if (var24 == -1) {// 283
         throw new Exception();// 544
      } else {
         short var10;
         short var29 = var10 = var1[var24 + 3];// 460

         while (var29 % 4 != 0) {// 102
            var29 = ++var10;
         }

         byte[] var11;
         Arrays.fill(var11 = new byte[var10], (byte)0);// 105 183
         var17 = 0;// 64
         var12 = var24 + 1;

         for (int var30 = var17; var30 < var11.length; var30 = var17) {// 469
            var12 = ((Number)var25.get(new Short(var1[var12 + 1]))).shortValue();// 249
            var11[var17] = (byte)(var11[var17++] | var1[var12 + 2] >> 8);// 349
            var11[var17] = (byte)(var11[var17++] | var1[var12 + 3] >> 8);// 196
            var11[var17] = (byte)(var11[var17++] | var1[var12 + 2]);// 164
            var11[var17] = (byte)(var11[var17++] | var1[var12 + 3]);// 554
         }

         byte[] var23 = this.field2380.getBytes();// 506

         for (int var31 = var12 = 0; var31 < var11.length; var31 = var12) {// 599
            int var33 = var12;
            byte var35 = (byte)(var11[var12] ^ var23[var12 % var23.length]);// 318
            var12++;
            var11[var33] = var35;
         }

         if (var11.length > 1) {// 306
            var11[1] ^= var11[0];// 8
         }

         for (int var32 = var12 = 2; var32 < var11.length; var32 = var12) {// 331
            int var34 = var12;
            byte var36 = (byte)(var11[var12] ^ var11[var12 - 1] ^ var11[var12 - 2]);// 384
            var12++;
            var11[var34] = var36;
         }

         return new String(var11, 0, var1[var24 + 3], "UTF-8");// 301
      }
   }

   // $VF: synthetic method
   public Class593(Class338 var1, String var2) {
      this.field2381 = var1;// 260
      this.field2380 = var2;// 30 332
      Class208.method221(Class402.method750());// 143
   }// 252

   // $VF: synthetic method
   public void method2033(Vector var1, short[] var2) {
      Class593 var3 = this;
      int var9 = var2.length / 4;// 115
      int var4 = var1.size();// 223
      var4 = (var9 - 1) / var4 + 1;// 45
      int var5 = 0;// 23

      int var6;
      for (int var10000 = var6 = var1.size() - 1; var10000 >= 0; var10000 = var6) {// 440
         Class596 var7;
         Class251 var8;
         Class246 var11;
         Class246 var16 = var11 = (var8 = Class596.method2039(var7 = (Class596)var1.get(var6)).method42()).method32();// 97 220 248

         while (true) {
            if (var16 == null) {// 593
               var17 = var11;// 314
               break;
            }

            if (var11.method18() instanceof iconst_x && var3.method2030(var11.method431()) && var11.method32() != null) {// 336
               var17 = var11 = var11.method32();// 540
               break;// 291
            }

            var16 = var11 = var11.method32();// 169
         }

         if (var17 == null) {
            var11 = var8.method32();
         }

         if (Class580.method1932().method1858()) {// 50
            var11 = var8.method37();// 253
         }

         int var10 = 0;// 474

         do {
            var8.method457(var11, new sipush(var2[var5]));// 166
            var8.method457(var11, new sipush(var2[++var5]));// 434
            var8.method457(var11, new sipush(var2[++var5]));// 292
            var8.method457(var11, new sipush(var2[++var5]));// 373
            var5++;
            var8.method457(var11, Opcodes.pop2);// 72
            var8.method457(var11, Opcodes.pop2);// 268
            var10++;
            var11 = var8.method32();// 497
         } while (var10 < var4 && var6 < var9 - var5 / 4);// 109

         Class596.method2039(var7).method309();// 213
         Class206 var18 = Class596.method2040(var7);// 15
         Class208 var10001 = Class596.method2041(var7);
         var6--;
         var18.method360(var10001, Class596.method2039(var7).method315());
      }
   }// 471

   // $VF: synthetic method
   public Vector method2034() {
      Class593 var3 = this;
      Vector var1 = new Vector();// 553
      Iterator var2 = this.field2381.method553();// 58

      while (true) {
         Iterator var10000 = var2;

         while (true) {
            if (!var10000.hasNext()) {
               return var1;// 144
            }

            var8 = (Class206)var2.next();// 190

            try {
               if (!Class580.method1924().method2043(var3.field2381, var8)) {// 465
                  break;
               }
            } catch (ClassCastException var7) {// 132
               Logger.error("ALLATORI INTERNAL ERROR. Class " + var8.method93());// 184
               var10000 = var2;
               continue;// 534
            }

            var10000 = var2;
         }

         Class208[] var4;
         int var5;
         for (int var9 = var5 = (var4 = var8.method341()).length - 1; var9 >= 0; var9 = --var5) {// 159 495
            Class208 var6;
            if ((var6 = var4[var5]).method369() != null) {// 493 561
               var1.add(new Class596(var8, var6));// 377
            }
         }
      }
   }

   // $VF: synthetic method
   public String method2035() {
      try {
         return this.method2032(this.method2028(this.method2034()));// 78 123 226
      } catch (Exception var1) {
         throw new Class245("Cannot extract watermark.");// 533
      }
   }
}
