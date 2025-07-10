package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

// $VF: Compiled from yb
public abstract class Class151 implements Cloneable, Class123, Serializable {
   // $VF: synthetic field
   public Class149 field616;
   // $VF: synthetic field
   public static Map field617 = new HashMap();
   // $VF: synthetic field
   public int field618;
   // $VF: synthetic field
   public byte field619;
   // $VF: synthetic field
   public int field620;

   // $VF: synthetic method
   public abstract Class151 method181(Class149 var1);

   // $VF: synthetic method
   public final int method17() {
      return this.field620;// 573
   }

   // $VF: synthetic method
   public final void method96(Class149 var1) {
      this.field616 = var1;// 41
   }// 551

   // $VF: synthetic method
   public final void method90(int var1) {
      this.field620 = var1;// 339
   }// 308

   // $VF: synthetic method
   public Class151(byte var1, int var2, int var3, Class149 var4) {
      this.field619 = var1;// 132
      this.field620 = var2;// 184
      this.field618 = var3;// 534
      this.field616 = var4;// 465 488
   }// 495

   // $VF: synthetic method
   public static void method131(String var0) {
      field617.remove(var0);// 412
   }// 38

   // $VF: synthetic method
   public final byte method142() {
      return this.field619;// 592
   }

   // $VF: synthetic method
   public final Class149 method94() {
      return this.field616;// 365
   }

   // $VF: synthetic method
   public static final Class151 method182(DataInputStream var0, Class149 var1) {
      byte var5 = -1;// 5
      int var7;
      String var4 = ((Class191)var1.method171(var7 = var0.readUnsignedShort(), (byte)1)).method20();// 149 386 450
      int var2 = var0.readInt();// 24
      byte var6;
      byte var10000 = var6 = 0;

      while (true) {
         if (var10000 >= 24) {
            var10000 = var5;// 25
            break;
         }

         if (var4.equals(Class125.field523[var6])) {// 242
            var10000 = var6;// 209
            break;// 69
         }

         var10000 = ++var6;// 108
      }

      switch (var10000) {
         case -1:
            while (false) {
            }

            Class530 var8;
            return (Class151)((var8 = (Class530)field617.get(var4)) != null ? var8.method1575(var7, var2, var0, var1) : new Class177(var7, var2, var0, var1));// 23 97 115 223
         case 0:
            return new Class169(var7, var2, var0, var1);// 285
         case 1:
            return new Class161(var7, var2, var0, var1);// 468
         case 2:
            return new Class164(var7, var2, var0, var1);// 32
         case 3:
            return new Class157(var7, var2, var0, var1);// 423
         case 4:
            return new Class163(var7, var2, var0, var1);// 525
         case 5:
            return new Class160(var7, var2, var0, var1);// 593
         case 6:
            return new Class162(var7, var2, var0, var1);// 291
         case 7:
            return new Class176(var7, var2, var0, var1);// 169
         case 8:
            return new Class175(var7, var2, var0, var1);// 299
         case 9:
            return new Class159(var7, var2, var0, var1);// 137
         case 10:
            return new Class173(var7, var2, var0, var1);// 253
         case 11:
            return new Class150(var7, var2, var0, var1);// 474
         case 12:
            return new Class155(var7, var2, var0, var1);// 166
         case 13:
            return new Class156(var7, var2, var0, var1);// 373
         case 14:
            return new Class167(var7, var2, var0, var1);// 497
         case 15:
            return new Class166(var7, var2, var0, var1);// 307
         case 16:
            return new Class158(var7, var2, var0, var1);// 213
         case 17:
            return new Class177(var7, var2, var0, var1);// 471
         case 18:
            return new Class170(var7, var2, var0, var1);// 266
         case 19:
            return new Class177(var7, var2, var0, var1);// 280
         case 20:
            return new Class168(var7, var2, var0, var1);// 95
         case 21:
            return new Class171(var7, var2, var0, var1);// 77
         case 22:
            return new Class172(var7, var2, var0, var1);// 129
         case 23:
            return new Class152(var7, var2, var0, var1);// 107
         default:
            throw new IllegalStateException("Ooops! default case reached.");// 110
      }
   }

   // $VF: synthetic method
   public Object clone() {
      Class151 var1 = this;
      Object var4 = null;// 168

      try {
         return var1.clone();// 65 114
      } catch (CloneNotSupportedException var3) {// 80
         var3.printStackTrace();// 544
         return var4;// 460
      }
   }

   // $VF: synthetic method
   public final void method6(int var1) {
      this.field618 = var1;// 576
   }// 103

   // $VF: synthetic method
   public String method20() {
      return ((Class191)this.field616.method171(this.field620, (byte)1)).method20();// 245 404
   }

   // $VF: synthetic method
   public static void method183(String var0, Class530 var1) {
      field617.put(var0, var1);// 428
   }// 87

   // $VF: synthetic method
   @Override
   public abstract void method87(Class463 var1);

   // $VF: synthetic method
   public void method3(DataOutputStream var1) {
      var1.writeShort(this.field620);
      var1.writeInt(this.field618);// 240 246
   }// 552

   // $VF: synthetic method
   public final int method2() {
      return this.field618;// 275
   }
}
