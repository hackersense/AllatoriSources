package mapped;

import smardecSB.astore_x;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// $VF: Compiled from wb
public class Class566 implements Class565 {
   // $VF: synthetic field
   public static final int field1988 = -1;
   // $VF: synthetic field
   public Set field1989;
   // $VF: synthetic field
   public Set field1990;
   // $VF: synthetic field
   public int field1991;
   // $VF: synthetic field
   public Class246 field1992;
   // $VF: synthetic field
   public final Class497 field1993;

   // $VF: synthetic method
   public void method1823() {
      if (this.field1991 == -1) {// 450
         throw new Class242("setLeavingRET() called for top-level 'subroutine' or forgot to set local variable first.");// 386
      } else {
         Iterator var1 = this.field1990.iterator();// 149
         Class246 var4 = null;// 157

         while (var1.hasNext()) {// 24
            Class246 var3;
            if ((var3 = (Class246)var1.next()).method18() instanceof Class279) {// 286 600
               if (var4 != null) {// 108
                  throw new Class233("Subroutine with more then one RET detected: '" + var4 + "' and '" + var3 + "'.");// 27
               }

               var4 = var3;// 209
            }
         }

         if (var4 == null) {// 464
            throw new Class233("Subroutine without a RET detected.");// 25
         } else if (((Class279)var4.method18()).method2() != this.field1991) {// 21
            throw new Class233("Subroutine uses '" + var4 + "' which does not match the correct local variable '" + this.field1991 + "'.");// 115
         } else {
            this.field1992 = var4;// 45
         }
      }
   }// 23

   // $VF: synthetic method
   public static int method1824(Class566 var0) {
      return var0.field1991;
   }

   // $VF: synthetic method
   @Override
   public int[] method1817() {
      HashSet var4 = new HashSet();// 601
      int[] var2 = this.method1819();// 193

      int var3;
      for (int var10000 = var3 = 0; var10000 < var2.length; var10000 = var3) {// 251
         var4.add(new Integer(var2[var3++]));// 486
      }

      this.method1829(var4, this.method1820());// 300
      int[] var7 = new int[var4.size()];// 245
      Iterator var5 = var4.iterator();// 296
      int var6 = -1;// 404

      for (Iterator var8 = var5; var8.hasNext(); var8 = var5) {// 417
         var6++;// 81
         var7[var6] = (Integer)var5.next();// 401
      }

      return var7;// 556
   }

   // $VF: synthetic method
   @Override
   public Class246[] method1822() {
      Class246[] var2 = new Class246[this.field1990.size()];// 177
      return (Class246[])this.field1990.toArray(var2);// 266
   }

   // $VF: synthetic method
   public void method1825(Class246 var1) {
      if (var1 == null || !(var1.method18() instanceof Class108)) {// 540
         throw new Class242("Expecting JsrInstruction InstructionHandle.");// 291
      } else if (this.field1991 == -1) {// 169
         throw new Class242("Set the localVariable first!");// 216
      } else if (this.field1991 != ((astore_x)((Class108)var1.method18()).method32().method18()).method2()) {// 135
         throw new Class242("Setting a wrong JsrInstruction.");// 474
      } else {
         this.field1989.add(var1);// 434
      }
   }// 292

   // $VF: synthetic method
   @Override
   public int[] method1819() {
      HashSet var4 = new HashSet();// 549
      if (this.field1992 == null && this != this.field1993.field1650) {// 499
         throw new Class242("This subroutine object must be built up completely before calculating accessed locals.");// 76
      } else {
         Iterator var2 = this.field1990.iterator();// 390

         while (var2.hasNext()) {// 573
            Class246 var6;
            if ((var6 = (Class246)var2.next()).method18() instanceof Class277 || var6.method18() instanceof Class279) {// 188 520
               int var1 = ((Class278)var6.method18()).method2();// 172
               var4.add(new Integer(var1));// 564

               try {
                  if (var6.method18() instanceof Class277 && ((Class277)var6.method18()).method1(null).method2() == 2) {// 181 433 483
                     var4.add(new Integer(var1 + 1));// 125
                  }
               } catch (RuntimeException var5) {
                  throw new Class242("Oops. BCEL did not like NULL as a ConstantPoolGen object.");// 365
               }
            }
         }

         int[] var7 = new int[var4.size()];// 297
         var2 = var4.iterator();// 426
         int var8 = -1;// 11

         for (Iterator var10000 = var2; var10000.hasNext(); var10000 = var2) {// 356
            var8++;// 522
            var7[var8] = (Integer)var2.next();// 41
         }

         return var7;// 91
      }
   }

   // $VF: synthetic method
   public Class566(Class497 var1) {
      this.field1993 = var1;
      this.field1991 = -1;// 384 400
      this.field1990 = new HashSet();
      this.field1989 = new HashSet();// 240 579
   }// 130

   // $VF: synthetic method
   public static Set method1826(Class566 var0) {
      return var0.field1989;
   }

   // $VF: synthetic method
   @Override
   public boolean method1816(Class246 var1) {
      return this.field1990.contains(var1);// 467
   }

   // $VF: synthetic method
   @Override
   public Class246 method1818() {
      if (this == this.field1993.field1650) {// 536
         throw new Class242("getLeavingRET() called on top level pseudo-subroutine.");// 307
      } else {
         return this.field1992;// 109
      }
   }

   // $VF: synthetic method
   @Override
   public Class565[] method1820() {
      Class566 var3 = this;
      HashSet var1 = new HashSet();// 337
      Iterator var2 = this.field1990.iterator();// 168

      while (var2.hasNext()) {// 237
         Class10 var5;
         if ((var5 = ((Class246)var2.next()).method18()) instanceof Class108) {// 65 133
            Class246 var4 = ((Class108)var5).method32();// 504
            var1.add(var3.field1993.method1330(var4));// 80
         }
      }

      Class565[] var6 = new Class565[var1.size()];// 114
      return (Class565[])var1.toArray(var6);// 460
   }

   // $VF: synthetic method
   public void method1827(Class246 var1) {
      if (this.field1992 != null) {// 288
         throw new Class242("All instructions must have been added before invoking setLeavingRET().");// 129
      } else {
         this.field1990.add(var1);// 107
      }
   }// 437

   // $VF: synthetic method
   public static Class246 method1828(Class566 var0) {
      return var0.field1992;// 377
   }

   // $VF: synthetic method
   public void method1829(Set var1, Class565[] var2) {
      Class566 var3 = this;

      for (int var10000 = var6 = 0; var10000 < var2.length; var10000 = ++var6) {// 215
         int[] var4 = var2[var6].method1819();// 511

         int var5;
         for (int var7 = var5 = 0; var7 < var4.length; var7 = var5) {// 382
            var1.add(new Integer(var4[var5++]));// 210
         }

         if (var2[var6].method1820().length != 0) {// 103
            var3.method1829(var1, var2[var6].method1820());// 548
         }
      }
   }// 523

   // $VF: synthetic method
   public void method1830(int var1) {
      if (this.field1991 != -1) {// 164
         throw new Class242("localVariable set twice.");// 554
      } else {
         this.field1991 = var1;// 506
      }
   }// 318

   // $VF: synthetic method
   @Override
   public Class246[] method1821() {
      if (this == this.field1993.field1650) {// 138
         throw new Class242("getLeavingRET() called on top level pseudo-subroutine.");// 285
      } else {
         Class246[] var2 = new Class246[this.field1989.size()];// 32
         return (Class246[])this.field1989.toArray(var2);// 238
      }
   }
}
