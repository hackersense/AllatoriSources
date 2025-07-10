package mapped;

// $VF: Compiled from ub
public class Class529 {
   // $VF: synthetic field
   public int field1786;
   // $VF: synthetic field
   public byte[] field1787;

   // $VF: synthetic method
   public final Class529 method1562(int var1, int var2, int var3) {
      int var5;
      if ((var5 = this.field1786) + 5 > this.field1787.length) {// 109 213
         this.method1565(5);// 15
      }

      int var10007 = var5;// 270
      byte var10008 = (byte)var1;
      var5++;
      this.field1787[var10007] = var10008;// 471
      int var10006 = var5;// 582
      var10007 = var2 >>> 8;
      var5++;
      this.field1787[var10006] = (byte)var10007;
      int var10005 = var5;// 177
      byte var13 = (byte)var2;
      var5++;
      this.field1787[var10005] = var13;
      int var10004 = var5;// 266
      var10005 = var3 >>> 8;
      var5++;
      this.field1787[var10004] = (byte)var10005;
      int var10003 = var5;// 235
      byte var11 = (byte)var3;
      var5++;
      this.field1787[var10003] = var11;
      this.field1786 = var5;// 280
      return this;// 370
   }

   // $VF: synthetic method
   public Class529(byte[] var1) {
      this.field1787 = var1;// 184
      this.field1786 = var1.length;// 132 534
   }// 488

   // $VF: synthetic method
   public Class529 method1563(long var1) {
      int var3 = this.field1786;// 437
      if (this.field1786 + 8 > this.field1787.length) {// 110
         this.method1565(8);// 221
      }

      byte[] var4 = this.field1787;// 601
      int var6 = (int)(var1 >>> 32);// 193
      int var10010 = var3;
      int var10011 = var6 >>> 24;
      var3++;
      var4[var10010] = (byte)var10011;// 251
      int var10009 = var3;// 486
      var10010 = var6 >>> 16;
      var3++;
      var4[var10009] = (byte)var10010;
      int var10008 = var3;// 117
      var10009 = var6 >>> 8;
      var3++;
      var4[var10008] = (byte)var10009;
      int var10007 = var3;// 300
      byte var20 = (byte)var6;
      var3++;
      var4[var10007] = var20;
      int var7 = (int)var1;// 245
      int var10006 = var3;// 296
      var10007 = var7 >>> 24;
      var3++;
      var4[var10006] = (byte)var10007;
      int var10005 = var3;// 404
      var10006 = var7 >>> 16;
      var3++;
      var4[var10005] = (byte)var10006;
      int var10004 = var3;// 417
      var10005 = var7 >>> 8;
      var3++;
      var4[var10004] = (byte)var10005;
      int var10003 = var3;// 81
      byte var16 = (byte)var7;
      var3++;
      var4[var10003] = var16;
      this.field1786 = var3;// 401
      return this;// 394
   }

   // $VF: synthetic method
   public final Class529 method1564(String var1, int var2, int var3) {
      Class529 var7 = this;
      int var4 = var1.length();// 297
      int var5 = var2;// 426

      int var6;
      for (int var10000 = var6 = var2; var10000 < var4; var10000 = ++var6) {// 11
         char var8;
         if ((var8 = var1.charAt(var6)) >= 1 && var8 <= 127) {// 356 522
            var5++;// 41
         } else if (var8 <= 2047) {// 551
            var5 += 2;// 91
         } else {
            var5 += 3;// 312
         }
      }

      if (var5 > var3) {// 558
         throw new IllegalArgumentException("UTF8 string too large");// 501
      } else {
         if ((var6 = this.field1786 - var2 - 2) >= 0) {// 168 237
            this.field1787[var6] = (byte)(var5 >>> 8);// 133
            this.field1787[var6 + 1] = (byte)var5;// 65
         }

         if (this.field1786 + var5 - var2 > this.field1787.length) {// 80
            this.method1565(var5 - var2);// 283
         }

         int var9 = this.field1786;// 114

         for (int var16 = var2 = var2; var16 < var4; var16 = ++var2) {// 460
            char var14;
            if ((var14 = var1.charAt(var2)) >= 1 && var14 <= 127) {// 102 105
               int var18 = var9;
               byte var20 = (byte)var14;
               var9++;
               var7.field1787[var18] = var20;// 183
            } else if (var14 <= 2047) {// 205
               var7.field1787[var9++] = (byte)(192 | var14 >> 6 & 31);// 64
               var7.field1787[var9++] = (byte)(128 | var14 & '?');// 469
            } else {
               var7.field1787[var9++] = (byte)(224 | var14 >> '\f' & 15);// 349
               var7.field1787[var9++] = (byte)(128 | var14 >> 6 & 63);// 196
               var7.field1787[var9++] = (byte)(128 | var14 & '?');// 164
            }
         }

         var7.field1786 = var9;// 89
         return var7;// 506
      }
   }

   // $VF: synthetic method
   public void method1565(int var1) {
      if (this.field1786 > this.field1787.length) {// 234
         throw new AssertionError("Internal error");// 508
      } else {
         int var2 = 2 * this.field1787.length;// 214
         int var4 = this.field1786 + var1;// 524
         byte[] var5;
         byte[] var10001 = var5 = new byte[var2 > var4 ? var2 : var4];// 371
         System.arraycopy(this.field1787, 0, var5, 0, this.field1786);// 585
         this.field1787 = var10001;// 431
      }
   }// 563

   // $VF: synthetic method
   public Class529 method1566(int var1) {
      int var3;
      if ((var3 = this.field1786) + 2 > this.field1787.length) {// 257 269
         this.method1565(2);// 455
      }

      int var10004 = var3;// 142
      int var10005 = var1 >>> 8;
      var3++;
      this.field1787[var10004] = (byte)var10005;// 236
      int var10003 = var3;// 39
      byte var6 = (byte)var1;
      var3++;
      this.field1787[var10003] = var6;
      this.field1786 = var3;// 368
      return this;// 99
   }

   // $VF: synthetic method
   public Class529(int var1) {
      this.field1787 = new byte[var1];// 1 406
   }// 46

   // $VF: synthetic method
   public final Class529 method1567(int var1, int var2, int var3) {
      int var5;
      if ((var5 = this.field1786) + 4 > this.field1787.length) {// 45 223
         this.method1565(4);// 23
      }

      int var10006 = var5;// 97
      byte var10007 = (byte)var1;
      var5++;
      this.field1787[var10006] = var10007;// 248
      int var10005 = var5;// 411
      byte var12 = (byte)var2;
      var5++;
      this.field1787[var10005] = var12;
      int var10004 = var5;// 468
      var10005 = var3 >>> 8;
      var5++;
      this.field1787[var10004] = (byte)var10005;
      int var10003 = var5;// 138
      byte var10 = (byte)var3;
      var5++;
      this.field1787[var10003] = var10;
      this.field1786 = var5;// 285
      return this;// 119
   }

   // $VF: synthetic method
   public Class529() {
      this.field1787 = new byte[64];// 141 161
   }// 580

   // $VF: synthetic method
   public Class529 method1568(int var1) {
      int var3;
      if ((var3 = this.field1786) + 1 > this.field1787.length) {// 400 567
         this.method1565(1);// 33
      }

      int var10003 = var3;
      byte var10004 = (byte)var1;
      var3++;
      this.field1787[var10003] = var10004;// 240
      this.field1786 = var3;// 246
      return this;// 552
   }

   // $VF: synthetic method
   public final Class529 method1569(int var1, int var2) {
      int var4;
      if ((var4 = this.field1786) + 2 > this.field1787.length) {// 555 579
         this.method1565(2);// 73
      }

      int var10004 = var4;// 428
      byte var10005 = (byte)var1;
      var4++;
      this.field1787[var10004] = var10005;// 398
      int var10003 = var4;// 87
      byte var7 = (byte)var2;
      var4++;
      this.field1787[var10003] = var7;
      this.field1786 = var4;// 586
      return this;// 399
   }

   // $VF: synthetic method
   public Class529 method1570(int var1) {
      int var3;
      if ((var3 = this.field1786) + 4 > this.field1787.length) {// 57 291
         this.method1565(4);// 169
      }

      int var10006 = var3;// 314
      int var10007 = var1 >>> 24;
      var3++;
      this.field1787[var10006] = (byte)var10007;// 299
      int var10005 = var3;// 137
      var10006 = var1 >>> 16;
      var3++;
      this.field1787[var10005] = (byte)var10006;
      int var10004 = var3;// 50
      var10005 = var1 >>> 8;
      var3++;
      this.field1787[var10004] = (byte)var10005;
      int var10003 = var3;// 253
      byte var8 = (byte)var1;
      var3++;
      this.field1787[var10003] = var8;
      this.field1786 = var3;// 135
      return this;// 474
   }

   // $VF: synthetic method
   public int method1571() {
      return this.field1786;// 6
   }

   // $VF: synthetic method
   public Class529 method1572(String var1) {
      int var2;
      if ((var2 = var1.length()) > 65535) {// 210 576
         throw new IllegalArgumentException("UTF8 string too large");// 103
      } else {
         int var7;
         if ((var7 = this.field1786) + 2 + var2 > this.field1787.length) {// 545 570
            this.method1565(2 + var2);// 523
         }

         byte[] var4 = this.field1787;// 282
         int var10002 = var7;// 549
         int var10003 = var2 >>> 8;
         var7++;
         this.field1787[var10002] = (byte)var10003;
         int var10001 = var7;// 499
         byte var11 = (byte)var2;
         var7++;
         this.field1787[var10001] = var11;

         int var5;
         for (int var10000 = var5 = 0; var10000 < var2; var10000 = ++var5) {// 76 188 502
            char var6;
            if ((var6 = var1.charAt(var5)) < 1 || var6 > 127) {// 145 390
               this.field1786 = var7;
               return this.method1564(var1, var5, 65535);
            }

            var10001 = var7;
            var11 = (byte)var6;
            var7++;
            var4[var10001] = var11;// 573
         }

         this.field1786 = var7;// 48
         return this;// 281
      }
   }

   // $VF: synthetic method
   public Class529 method1573(byte[] var1, int var2, int var3) {
      if (this.field1786 + var3 > this.field1787.length) {// 271
         this.method1565(var3);// 256
      }

      if (var1 != null) {// 47
         System.arraycopy(var1, var2, this.field1787, this.field1786, var3);// 182
      }

      this.field1786 += var3;// 122
      return this;// 305
   }

   // $VF: synthetic method
   public final Class529 method1574(int var1, int var2) {
      int var4;
      if ((var4 = this.field1786) + 3 > this.field1787.length) {// 279 450
         this.method1565(3);// 386
      }

      int var10005 = var4;// 157
      byte var10006 = (byte)var1;
      var4++;
      this.field1787[var10005] = var10006;// 149
      int var10004 = var4;// 24
      var10005 = var2 >>> 8;
      var4++;
      this.field1787[var10004] = (byte)var10005;
      int var10003 = var4;// 286
      byte var8 = (byte)var2;
      var4++;
      this.field1787[var10003] = var8;
      this.field1786 = var4;// 600
      return this;// 108
   }
}
