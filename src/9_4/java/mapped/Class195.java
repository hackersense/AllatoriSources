package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;

// $VF: Compiled from dm
public abstract class Class195 extends Class196 implements Cloneable, Class123 {
   // $VF: synthetic field
   public int field683;
   // $VF: synthetic field
   public Class151[] field684;
   // $VF: synthetic field
   public Class149 field685;
   // $VF: synthetic field
   public boolean field686;
   // $VF: synthetic field
   public Class128[] field687;
   // $VF: synthetic field
   public boolean field688;
   // $VF: synthetic field
   public String field689 = null;
   // $VF: synthetic field
   public int field690;
   // $VF: synthetic field
   public int field691;

   // $VF: synthetic method
   public final Class151[] method200() {
      return this.field684;// 269
   }

   // $VF: synthetic method
   public Class128[] method137() {
      this.method19();// 210
      return this.field687;// 576
   }

   // $VF: synthetic method
   public void method19() {
      if (this.field686) {// 221
         Class151[] var4 = this.method200();// 193
         ArrayList var2 = new ArrayList();// 251

         int var3;
         for (int var10000 = var3 = 0; var10000 < var4.length; var10000 = ++var3) {// 486
            Class151 var6;
            if ((var6 = var4[var3]) instanceof Class154) {// 245 300
               Class154 var7 = (Class154)var6;// 404

               int var5;
               for (int var8 = var5 = 0; var8 < var7.method137().length; var8 = var5) {// 417
                  var2.add(var7.method137()[var5++]);// 401
               }
            }
         }

         this.field687 = (Class128[])var2.toArray(new Class128[var2.size()]);// 275
         this.field686 = false;// 355
      }
   }// 369

   // $VF: synthetic method
   public final void method3(DataOutputStream var1) {
      DataOutputStream var3 = var1;
      Class195 var4 = this;
      int var5 = 0;
      var1.writeShort(this.field692);
      var1.writeShort(this.field690);// 87
      var1.writeShort(this.field683);// 586
      var1.writeShort(this.field691);// 399 428

      for (int var2 = 0; var5 < var4.field691; var5 = var2) {// 232
         var4.field684[var2++].method3(var3);// 463
      }
   }// 424

   // $VF: synthetic method
   public final Class149 method94() {
      return this.field685;// 83
   }

   // $VF: synthetic method
   public final void method85(int var1) {
      this.field690 = var1;// 223
   }// 45

   // $VF: synthetic method
   public Class195(DataInputStream var1, Class149 var2) {
      DataInputStream var4 = var1;
      Class195 var5 = this;
      this(var1.readUnsignedShort(), var1.readUnsignedShort(), var1.readUnsignedShort(), null, var2);
      this.field691 = var1.readUnsignedShort();// 6 604
      this.field684 = new Class151[this.field691];// 144

      int var3;
      for (int var6 = var3 = 0; var6 < var5.field691; var6 = var3) {// 461
         Class151[] var7 = var5.field684;// 358
         int var10001 = var3;
         Class151 var10002 = Class151.method182(var4, var2);
         var3++;
         var7[var10001] = var10002;
      }
   }// 574

   // $VF: synthetic method
   public Class195(Class195 var1) {
      this(var1.method17(), var1.method84(), var1.method30(), var1.method200(), var1.method94());// 58
   }// 315

   // $VF: synthetic method
   public final void method206(Class151[] var1) {
      this.field684 = var1;
      this.field691 = var1 == null ? 0 : var1.length;// 40 160
   }// 63

   // $VF: synthetic method
   public Class195 method233(Class149 var1) {
      Class195 var5 = this;
      this = null;// 213

      Class195 var10000;
      label24: {
         try {
            this = (Class195)var5.clone();// 471
         } catch (CloneNotSupportedException var3) {// 270
            var10000 = this;// 177
            break label24;
         }

         var10000 = this;
      }

      var10000.field685 = this.field685;
      this.field684 = new Class151[this.field691];// 266

      int var2;
      for (int var6 = var2 = 0; var6 < var5.field691; var6 = var2) {// 280
         Class151[] var7 = this.field684;// 370
         int var10001 = var2;
         Class151 var10002 = var5.field684[var2].method181(var5.field685);
         var2++;
         var7[var10001] = var10002;
      }

      return this;// 95
   }

   // $VF: synthetic method
   public final String method190() {
      return ((Class191)this.field685.method171(this.field690, (byte)1)).method20();// 137 314
   }

   // $VF: synthetic method
   public final int method84() {
      return this.field690;// 69
   }

   // $VF: synthetic method
   public final String method93() {
      Class195 var2 = this;
      if (!this.field688) {// 188
         boolean var1 = false;// 564
         int var3 = 0;

         for (boolean var10000 = var1; !var10000 && var3 < var2.field691; var10000 = var1) {
            if (var2.field684[var3] instanceof Class173) {// 438
               var2.field689 = ((Class173)var2.field684[var3]).method93();// 483
               var1 = true;// 433
            }

            var3++;// 48
         }

         var2.field688 = true;// 320
      }

      return var2.field689;// 212
   }

   // $VF: synthetic method
   public void method234(Class128 var1) {
      this.method19();// 523
      Class128[] var3;
      int var4;
      Class128[] var10000 = var3 = new Class128[(var4 = this.field687.length) + 1];// 162 282
      System.arraycopy(this.field687, 0, var3, 0, var4);// 503
      var10000[var4] = var1;// 339
      this.field687 = var10000;// 308
   }// 596

   // $VF: synthetic method
   public final void method89(int var1) {
      this.field683 = var1;// 220
   }// 593

   // $VF: synthetic method
   public final void method96(Class149 var1) {
      this.field685 = var1;// 24
   }// 286

   // $VF: synthetic method
   public Class195(int var1, int var2, int var3, Class151[] var4, Class149 var5) {
      this.field688 = false;
      this.field686 = true;
      this.field692 = var1;// 603
      this.field690 = var2;// 278
      this.field683 = var3;// 466
      this.field685 = var5;// 467
      this.method206(var4);// 485 552
   }// 68

   // $VF: synthetic method
   public final String method20() {
      return ((Class191)this.field685.method171(this.field683, (byte)1)).method20();// 72 373
   }

   // $VF: synthetic method
   public final int method30() {
      return this.field683;// 138
   }

   // $VF: synthetic method
   public Class195() {
      this.field688 = false;// 273
      this.field686 = true;// 78 226
   }// 418
}
