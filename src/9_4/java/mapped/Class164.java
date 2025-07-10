package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from eo
public final class Class164 extends Class151 {
   // $VF: synthetic field
   public int field640;
   // $VF: synthetic field
   public int field641;
   // $VF: synthetic field
   public Class151[] field642;
   // $VF: synthetic field
   public Class122[] field643;
   // $VF: synthetic field
   public int field644;
   // $VF: synthetic field
   public byte[] field645;
   // $VF: synthetic field
   public int field646;
   // $VF: synthetic field
   public int field647;

   // $VF: synthetic method
   public final int method199() {
      Class164 var1 = this;
      int var3 = 0;// 275

      int var2;
      for (int var10000 = var2 = 0; var10000 < var1.field646; var10000 = var2) {// 127
         int var10001 = var1.field642[var2].field618;// 355
         var2++;
         var3 += var10001 + 6;
      }

      return var3 + var1.method84();// 369
   }

   // $VF: synthetic method
   public final String method4(boolean var1) {
      Class164 var3 = this;
      StringBuffer var2;
      (var2 = new StringBuffer(100))// 360
         .append("Code(max_stack = ")// 312
         .append(this.field647)
         .append(", max_locals = ")
         .append(this.field644)
         .append(", code_length = ")
         .append(this.field640)
         .append(")\n")
         .append(Class523.method1541(this.field645, this.field645, 0, -1, var1));
      if (this.field641 > 0) {// 558
         var2.append("\nException handler(s) = \n").append("From\tTo\tHandler\tType\n");// 501
         int var4 = 0;// 337

         for (int var10000 = var4; var10000 < var3.field641; var10000 = var4) {
            StringBuffer var6 = var2.append(var3.field643[var4].method86(var3.field645, var1));// 208
            var4++;
            var6.append("\n");
         }
      }

      if (var3.field646 > 0) {// 133
         var2.append("\nAttribute(s) = \n");// 65
         int var5 = 0;// 504

         for (int var7 = var5; var7 < var3.field646; var7 = var5) {
            StringBuffer var8 = var2.append(var3.field642[var5].toString());// 80
            var5++;
            var8.append("\n");
         }
      }

      return var2.toString();// 114
   }

   // $VF: synthetic method
   public Class164(int var1, int var2, DataInputStream var3, Class149 var4) {
      DataInputStream var5 = var3;
      Class164 var8 = this;
      this(var1, var2, var3.readUnsignedShort(), var3.readUnsignedShort(), (byte[])null, (Class122[])null, (Class151[])null, var4);// 6
      this.field640 = var3.readInt();
      this.field645 = new byte[this.field640];// 358
      var3.readFully(this.field645);// 192
      this.field641 = var3.readUnsignedShort();// 179
      this.field643 = new Class122[this.field641];// 146 461

      for (int var9 = var1 = 0; var9 < var8.field641; var9 = var1) {// 567
         Class122[] var10 = var8.field643;// 400
         int var10001 = var1;
         Class122 var10002 = new Class122(var5);
         var1++;
         var10[var10001] = var10002;
      }

      var8.field646 = var5.readUnsignedShort();// 552
      var8.field642 = new Class151[var8.field646];// 603

      for (int var11 = var1 = 0; var11 < var8.field646; var11 = var1) {// 278
         Class151[] var12 = var8.field642;// 466
         int var13 = var1;
         Class151 var14 = Class151.method182(var5, var4);
         var1++;
         var12[var13] = var14;
      }

      var8.field618 = var2;// 330
   }// 589

   // $VF: synthetic method
   public final Class151[] method200() {
      return this.field642;// 440
   }

   // $VF: synthetic method
   public Class164(Class164 var1) {
      this(var1.method17(), var1.method2(), var1.method92(), var1.method30(), var1.method207(), var1.method201(), var1.method200(), var1.method94());// 190
   }// 465

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1015(this);// 550
   }// 510

   // $VF: synthetic method
   @Override
   public Class151 method181(Class149 var1) {
      Class164 var2 = this;
      this = (Class164)this.clone();// 88
      if (this.field645 != null) {// 306
         this.field645 = new byte[this.field645.length];// 8
         System.arraycopy(this.field645, 0, this.field645, 0, this.field645.length);// 331
      }

      this.field645 = var1;
      this.field643 = new Class122[this.field641];// 130 301

      int var3;
      for (int var10000 = var3 = 0; var10000 < var2.field641; var10000 = var3) {// 602
         Class122[] var6 = this.field643;// 363
         int var10001 = var3;
         Class122 var10002 = var2.field643[var3].method88();
         var3++;
         var6[var10001] = var10002;
      }

      this.field642 = new Class151[var2.field646];// 35

      for (int var7 = var3 = 0; var7 < var2.field646; var7 = var3) {// 233
         Class151[] var8 = this.field642;// 271
         int var9 = var3;
         Class151 var10 = var2.field642[var3].method181(var1);
         var3++;
         var8[var9] = var10;
      }

      return this;// 357
   }

   // $VF: synthetic method
   public final Class122[] method201() {
      return this.field643;// 385
   }

   // $VF: synthetic method
   public final int method92() {
      return this.field647;// 258
   }

   // $VF: synthetic method
   public final void method202(byte[] var1) {
      this.field645 = var1;
      this.field640 = var1 == null ? 0 : var1.length;// 76 499
   }// 145

   // $VF: synthetic method
   public Class163 method203() {
      Class164 var1 = this;

      for (int var10000 = var2 = 0; var10000 < var1.field646; var10000 = ++var2) {// 32
         if (var1.field642[var2] instanceof Class163) {// 238
            return (Class163)var1.field642[var2];// 423
         }
      }

      return null;// 220
   }

   // $VF: synthetic method
   public Class164(int var1, int var2, int var3, int var4, byte[] var5, Class122[] var6, Class151[] var7, Class149 var8) {
      super((byte)2, var1, var2, var8);
      this.field647 = var3;// 329
      this.field644 = var4;// 412
      this.method202(var5);// 38
      this.method205(var6);// 257
      this.method206(var7);// 269 588
   }// 455

   // $VF: synthetic method
   public final int method84() {
      return 8 + this.field640 + 2 + 8 * this.field641 + 2;// 486
   }

   // $VF: synthetic method
   public final int method30() {
      return this.field644;// 370
   }

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      DataOutputStream var3 = var1;
      Class164 var4 = this;// 149
      int var6 = 0;
      super.method3(var1);
      var1.writeShort(this.field647);
      var1.writeShort(this.field644);// 24
      var1.writeInt(this.field640);// 286
      var1.write(this.field645, 0, this.field640);// 157 600
      var1.writeShort(this.field641);// 108

      for (int var2 = 0; var6 < var4.field641; var6 = var2) {// 27
         var4.field643[var2++].method3(var3);// 242
      }

      var3.writeShort(var4.field646);// 209

      int var5;
      for (int var7 = var5 = 0; var7 < var4.field646; var7 = var5) {// 69
         var4.field642[var5++].method3(var3);// 116
      }
   }// 464

   // $VF: synthetic method
   public final void method85(int var1) {
      this.field647 = var1;// 532
   }// 297

   // $VF: synthetic method
   public Class160 method204() {
      Class164 var1 = this;

      for (int var10000 = var2 = 0; var10000 < var1.field646; var10000 = ++var2) {// 299
         if (var1.field642[var2] instanceof Class160) {// 314
            return (Class160)var1.field642[var2];// 137
         }
      }

      return null;// 135
   }

   // $VF: synthetic method
   public final void method205(Class122[] var1) {
      this.field643 = var1;
      this.field641 = var1 == null ? 0 : var1.length;// 48 564
   }// 281

   // $VF: synthetic method
   public final void method89(int var1) {
      this.field644 = var1;// 413
   }// 320

   // $VF: synthetic method
   public final void method206(Class151[] var1) {
      this.field642 = var1;
      this.field646 = var1 == null ? 0 : var1.length;// 545 570
      this.field618 = this.method199();// 523
   }// 162

   // $VF: synthetic method
   public final byte[] method207() {
      return this.field645;// 268
   }
}
