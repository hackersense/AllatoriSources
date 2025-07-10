package mapped;

import smardecSB.astore_x;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// $VF: Compiled from wb
public class Class497 {
   // $VF: synthetic field
   public static final Integer field1647 = new Integer(2);
   // $VF: synthetic field
   public static final Integer field1648 = new Integer(0);
   // $VF: synthetic field
   public Map field1649;
   // $VF: synthetic field
   public final Class565 field1650;
   // $VF: synthetic field
   public static final Integer field1651 = new Integer(1);

   // $VF: synthetic method
   public Class497(Class203 var1) {
      Class497 var13 = this;
      super();
      this.field1649 = new HashMap();// 305
      Class246[] var12 = var1.method42().method39();// 563 585
      Class202[] var8 = var1.method282();// 14
      this.field1650 = new Class566(this);// 361
      HashSet var3 = new HashSet();// 224

      int var4;
      for (int var30 = var4 = 0; var30 < var12.length; var30 = ++var4) {// 494
         Class10 var5;
         if ((var5 = var12[var4].method18()) instanceof Class108) {// 174 560
            var3.add(((Class108)var5).method32());// 71
         }
      }

      Iterator var20;
      Iterator var31 = var20 = var3.iterator();// 547

      while (var31.hasNext()) {// 303
         Class566 var22 = new Class566(var13);// 326
         Class246 var6 = (Class246)var20.next();// 29
         var22.method1830(((astore_x)var6.method18()).method2());// 328
         var31 = var20;
         var13.field1649.put(var6, var22);// 521
      }

      var13.field1649.put(var12[0], var13.field1650);// 51
      var3.add(var12[0]);// 598
      int var23 = 0;

      for (int var32 = var23; var32 < var12.length; var32 = ++var23) {// 542
         Class10 var25;
         if ((var25 = var12[var23].method18()) instanceof Class108) {// 231 420
            Class246 var7 = ((Class108)var25).method32();// 454
            ((Class566)var13.method1330(var7)).method1825(var12[var23]);// 343
         }
      }

      HashSet var24 = new HashSet();// 492
      HashMap var26 = new HashMap();// 432

      for (Class246 var27 : var3) {// 155 421
         for (int var33 = var17 = 0; var33 < var12.length; var33 = var17) {// 19
            var26.put(var12[var17++], field1648);// 86
         }

         var26.put(var27, field1651);// 131
         ArrayList var18;
         (var18 = new ArrayList()).add(var27);// 264 289
         int var2;
         if (var27 == var12[0]) {// 591
            for (int var34 = var2 = 0; var34 < var8.length; var34 = var2) {// 572
               var26.put(var8[var2].method274(), field1651);// 60
               var18.add(var8[var2++].method274());// 348
            }
         }

         for (ArrayList var35 = var18; var35.size() != 0; var35 = var18) {// 178
            Class246 var14;
            Class246[] var9 = method1334(var14 = (Class246)var18.remove(0));// 262 475

            int var10;
            for (int var36 = var10 = 0; var36 < var9.length; var36 = ++var10) {// 100
               if ((Integer)var26.get(var9[var10]) == field1648) {// 202
                  var26.put(var9[var10], field1651);// 250
                  var18.add(var9[var10]);// 128
               }
            }

            var26.put(var14, field1647);// 512
         }

         for (int var37 = var2 = 0; var37 < var12.length; var37 = ++var2) {// 176
            if (var26.get(var12[var2]) == field1647) {// 171
               ((Class566)(var27 == var12[0] ? var13.method1331() : var13.method1330(var27))).method1827(var12[var2]);// 124
               if (var24.contains(var12[var2])) {// 568
                  throw new Class233("Instruction '" + var12[var2] + "' is part of more than one subroutine (or of the top level and a subroutine).");// 152
               }

               var24.add(var12[var2]);// 407
            }
         }

         if (var27 != var12[0]) {// 121
            ((Class566)var13.method1330(var27)).method1823();// 480
         }
      }

      int var28;
      for (int var38 = var28 = 0; var38 < var8.length; var38 = ++var28) {// 261
         for (Class246 var39 = var19 = var8[var28].method32(); var39 != var8[var28].method37().method32(); var39 = var19 = var19.method32()) {// 12 180 206
            Iterator var16 = var13.field1649.values().iterator();// 350

            while (var16.hasNext()) {// 156
               Class565 var29;
               if ((var29 = (Class565)var16.next()) != var13.field1649.get(var12[0]) && var29.method1816(var19)) {// 3 186 543
                  throw new Class233(
                     "Subroutine instruction '"// 175
                        + var19
                        + "' is protected by an exception handler, '"
                        + var8[var28]
                        + "'. This is forbidden by the JustIce verifier due to its clear definition of subroutines."
                  );
               }
            }
         }
      }

      var13.method1333(var13.method1331(), new HashSet());// 539
   }// 120

   // $VF: synthetic method
   public Class565 method1330(Class246 var1) {
      Class565 var3;
      if ((var3 = (Class565)this.field1649.get(var1)) == null) {// 345 442
         throw new Class242("Subroutine requested for an InstructionHandle that is not a leader of a subroutine.");// 449
      } else if (var3 == this.field1650) {// 378
         throw new Class242("TOPLEVEL special subroutine requested; use getTopLevel().");// 195
      } else {
         return var3;// 481
      }
   }

   // $VF: synthetic method
   public Class565 method1331() {
      return this.field1650;// 359
   }

   // $VF: synthetic method
   public Class565 method1332(Class246 var1) {
      Iterator var4 = this.field1649.values().iterator();// 419

      while (var4.hasNext()) {// 230
         Class565 var3;
         if ((var3 = (Class565)var4.next()).method1816(var1)) {// 402 515
            return var3;// 112
         }
      }

      System.err.println("DEBUG: Please verify '" + var1 + "' lies in dead code.");// 535
      return null;// 293
   }

   // $VF: synthetic method
   public void method1333(Class565 var1, Set var2) {
      Class497 var8 = this;
      Class565[] var7 = var1.method1820();// 383

      int var3;
      for (int var9 = var3 = 0; var9 < var7.length; var9 = var3) {// 140
         int var4 = ((Class279)var7[var3].method1818().method18()).method2();// 451
         if (!var2.add(new Integer(var4))) {// 565
            Class566 var5 = (Class566)var7[var3];// 448
            throw new Class233(
               "Subroutine with local variable '"// 101
                  + Class566.method1824(var5)
                  + "', JSRs '"
                  + Class566.method1826(var5)
                  + "', RET '"
                  + Class566.method1828(var5)
                  + "' is called by a subroutine which uses the same local variable index as itself; maybe even a recursive call? JustIce's clean definition of a subroutine forbids both."
            );
         }

         var8.method1333(var7[var3], var2);// 244
         var3++;
         var2.remove(new Integer(var4));// 259
      }
   }// 397

   // $VF: synthetic method
   public static Class246[] method1334(Class246 var0) {
      Class246[] var4 = new Class246[0];// 597
      Class246[] var2 = new Class246[1];// 118
      Class246[] var3 = new Class246[2];// 379
      Class10 var6;
      if ((var6 = var0.method18()) instanceof Class279) {// 189 447
         return var4;// 79
      } else if (var6 instanceof Class12) {// 154
         return var4;// 861
      } else if (var6 instanceof Class87) {// 712
         return var4;// 985
      } else if (var6 instanceof Class108) {// 689
         var2[0] = var0.method32();// 811
         return var2;// 764
      } else if (var6 instanceof Class89) {// 609
         var2[0] = ((Class89)var6).method32();// 633
         return var2;// 684
      } else if (var6 instanceof Class90) {// 818
         if (var6 instanceof Class113) {// 966
            Class246[] var5;
            (var5 = new Class246[(var4 = ((Class113)var6).method39()).length + 1])[0] = ((Class113)var6).method32();// 670 691 936
            System.arraycopy(var4, 0, var5, 1, var4.length);// 899
            return var5;// 823
         } else {
            var3[0] = var0.method32();
            var3[1] = ((Class90)var6).method32();// 833 927
            return var3;// 902
         }
      } else {
         var2[0] = var0.method32();// 914
         return var2;// 735
      }
   }
}
