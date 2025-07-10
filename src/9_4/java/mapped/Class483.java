package mapped;

// $VF: Compiled from nb
public class Class483 {
   // $VF: synthetic field
   public short field1592;
   // $VF: synthetic field
   public static final int field1593 = 268435455;
   // $VF: synthetic field
   public Class535 field1594;
   // $VF: synthetic field
   public Object field1595;
   // $VF: synthetic field
   public Class483 field1596;
   // $VF: synthetic field
   public static final int field1597 = 2;
   // $VF: synthetic field
   public int[] field1598;
   // $VF: synthetic field
   public Class357 field1599;
   // $VF: synthetic field
   public short field1600;
   // $VF: synthetic field
   public static final int field1601 = 4;
   // $VF: synthetic field
   public static final int field1602 = 4;
   // $VF: synthetic field
   public static final int field1603 = 16;
   // $VF: synthetic field
   public static final int field1604 = 128;
   // $VF: synthetic field
   public static final int field1605 = 32;
   // $VF: synthetic field
   public short field1606;
   // $VF: synthetic field
   public short field1607;
   // $VF: synthetic field
   public static final int field1608 = 268435456;
   // $VF: synthetic field
   public static final int field1609 = -268435456;
   // $VF: synthetic field
   public static final Class483 field1610 = new Class483();
   // $VF: synthetic field
   public static final int field1611 = 64;
   // $VF: synthetic field
   public static final int field1612 = 8;
   // $VF: synthetic field
   public static final int field1613 = 6;
   // $VF: synthetic field
   public int[] field1614;
   // $VF: synthetic field
   public static final int field1615 = 1;
   // $VF: synthetic field
   public short field1616;
   // $VF: synthetic field
   public short field1617;
   // $VF: synthetic field
   public int field1618;
   // $VF: synthetic field
   public Class483 field1619;
   // $VF: synthetic field
   public static final int field1620 = 805306368;
   // $VF: synthetic field
   public static final int field1621 = 536870912;

   // $VF: synthetic method
   public int method1283() {
      if ((this.field1600 & 4) == 0) {// 133
         throw new IllegalStateException("Label offset position has not been resolved yet");// 65
      } else {
         return this.field1618;// 80
      }
   }

   // $VF: synthetic method
   public void method1284(int var1, int var2, int var3) {
      if (this.field1598 == null) {// 178
         this.field1598 = new int[6];// 262
      }

      int var6;
      if ((var6 = this.field1598[0]) + 2 >= this.field1598.length) {// 100 202
         int[] var5 = new int[this.field1598.length + 6];// 250
         System.arraycopy(this.field1598, 0, var5, 0, this.field1598.length);// 128
         this.field1598 = var5;// 290
      }

      int var10003 = ++var6;
      var6++;
      this.field1598[var10003] = var1;// 512
      this.field1598[var6] = var2 | var3;// 538
      this.field1598[0] = var6;// 92
   }// 176

   // $VF: synthetic method
   public final void method1285(Class529 var1) {
      if ((this.field1600 & 4) == 0) {// 421
         this.method1284(0, 805306368, var1.field1786);// 583
      }

      var1.method1566(this.field1618);// 86
   }// 473

   // $VF: synthetic method
   public final void method1286(Class529 var1, int var2, boolean var3) {
      if ((this.field1600 & 4) == 0) {// 51
         if (var3) {// 598
            this.method1284(var2, 536870912, var1.field1786);// 325
            var1.method1570(-1);// 392
         } else {
            this.method1284(var2, 268435456, var1.field1786);// 44
            var1.method1566(-1);// 362
         }
      } else if (var3) {// 231
         var1.method1570(this.field1618 - var2);// 420
      } else {
         var1.method1566(this.field1618 - var2);// 343
      }
   }// 324

   // $VF: synthetic method
   public final void method1287(Class483 var1) {
      Class483 var4 = field1610;// 241
      Class483 var3;
      Class483 var10000 = var3 = this;// 526
      this.field1596 = field1610;// 136

      while (var10000 != field1610) {// 158
         var10000 = this = var3;// 294
         Class483 var7 = var3.field1596;// 342
         var3.field1596 = var4;// 435
         var4 = var3;// 96
         if ((var10000.field1600 & 64) != 0 && this.field1606 != var1.field1606) {// 277
            this.field1594 = new Class535(this.field1616, var1.field1594.field1803, this.field1594);// 459
         }

         var10000 = var3 = this.method1292(var7);// 396
      }

      var10000 = var4;// 752

      while (var10000 != field1610) {
         this = var4.field1596;// 847
         var4.field1596 = null;// 958
         var10000 = var4 = this;// 605
      }
   }// 985

   // $VF: synthetic method
   public static String method1288(int var0) {
      return "L" + var0;
   }

   // $VF: synthetic method
   public final Class483 method1289() {
      return this.field1599 == null ? this : this.field1599.field1077;// 89
   }

   // $VF: synthetic method
   public final void method1290(Class513 var1, boolean var2) {
      Class483 var5 = this;
      var1.method1424(this);// 371
      if (var2 && (this.field1600 & 128) != 0) {// 585
         var1.method1426(this.field1607 & '\uffff', this);// 431
         int var4;
         if (this.field1614 != null) {// 563
            for (int var6 = var4 = 1; var6 <= var5.field1614[0]; var6 = var4) {// 14
               var1.method1426(var5.field1614[var4++], var5);// 514
            }
         }
      }
   }// 354

   // $VF: synthetic method
   public final void method1291(int var1) {
      if ((this.field1600 & 128) == 0) {// 509
         this.field1600 = (short)(this.field1600 | 128);
         this.field1607 = (short)var1;// 35 233
      } else {
         if (this.field1614 == null) {// 256
            this.field1614 = new int[4];// 357
         }

         int var2;
         if ((var2 = ++this.field1614[0]) >= this.field1614.length) {// 4 182
            int[] var4 = new int[this.field1614.length + 4];// 122
            System.arraycopy(this.field1614, 0, var4, 0, this.field1614.length);// 305
            this.field1614 = var4;// 346
         }

         this.field1614[var2] = var1;// 334
      }
   }// 13

   // $VF: synthetic method
   public Class483 method1292(Class483 var1) {
      Class483 var2 = this;
      var1 = var1;// 892

      for (Class535 var10000 = var4 = this.field1594; var10000 != null; var10000 = var4 = var4.field1804) {// 632 818 927
         boolean var3 = (var2.field1600 & 16) != 0 && var4 == var2.field1594.field1804;// 968
         if (!var3 && var4.field1803.field1596 == null) {// 670
            var4.field1803.field1596 = var1;// 823
            var1 = var4.field1803;// 788
         }
      }

      return var1;// 902
   }

   // $VF: synthetic method
   public final void method1293(short var1) {
      Class483 var4;
      (var4 = this).field1596 = field1610;// 345 449

      while (var4 != field1610) {// 37
         Class483 var3 = var4;// 378
         var4 = var4.field1596;// 195
         var3.field1596 = null;// 490
         if (var3.field1606 == 0) {// 75
            var3.field1606 = var1;
            var4 = var3.method1292(var4);// 111 372
         }
      }
   }// 153

   // $VF: synthetic method
   public final boolean method1294(byte[] var1, Class529 var2, int var3) {
      Class483 var9 = this;
      this.field1600 = (short)(this.field1600 | 4);
      this.field1618 = var3;// 156 350
      if (this.field1598 == null) {// 3
         return false;// 543
      } else {
         boolean var4 = false;// 175

         int var5;
         for (int var10000 = var5 = this.field1598[0]; var10000 > 0; var10000 = var5) {
            int var6 = var9.field1598[var5 - 1];// 167
            int var7 = var9.field1598[var5];// 414
            int var8 = var3 - var6;// 12
            int var11 = var7 & 268435455;// 319
            if ((var7 & -268435456) == 268435456) {// 139
               if (var8 < -32768 || var8 > 32767) {// 462
                  int var10;
                  if ((var10 = var1[var6] & 255) < 198) {// 254 594
                     var1[var6] = (byte)(var10 + 49);// 388
                  } else {
                     var1[var6] = (byte)(var10 + 20);// 479
                  }

                  var4 = true;// 298
               }

               int var10002 = var11;
               int var10003 = var8 >>> 8;
               var11++;
               var1[var10002] = (byte)var10003;// 439
               var1[var11] = (byte)var8;// 529
            } else if ((var7 & -268435456) == 536870912) {// 106
               int var10004 = var11;
               int var10005 = var8 >>> 24;
               var11++;
               var1[var10004] = (byte)var10005;// 569
               int var19 = var11;// 445
               var10004 = var8 >>> 16;
               var11++;
               var1[var19] = (byte)var10004;
               int var17 = var11;// 425
               var19 = var8 >>> 8;
               var11++;
               var1[var17] = (byte)var19;
               var1[var11] = (byte)var8;// 327
            } else {
               int var18 = var11;
               int var21 = var3 >>> 8;
               var11++;
               var2.field1787[var18] = (byte)var21;// 383
               var2.field1787[var11] = (byte)var3;// 197
            }

            var5 -= 2;// 276
         }

         return var4;// 49
      }
   }
}
