package mapped;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// $VF: Compiled from hc
public class Class570 implements Class571 {
   // $VF: synthetic field
   public Class246 field2042;
   // $VF: synthetic field
   public int field2043;
   // $VF: synthetic field
   public final Class341 field2044;
   // $VF: synthetic field
   public Map field2045;
   // $VF: synthetic field
   public Map field2046;
   // $VF: synthetic field
   public ArrayList field2047;

   // $VF: synthetic method
   @Override
   public void method1886(int var1) {
      this.field2043 = var1;// 555
   }// 73

   // $VF: synthetic method
   @Override
   public Class246 method1887() {
      return this.field2042;// 592
   }

   // $VF: synthetic method
   @Override
   public Class480 method1888() {
      this = this.method1892();// 510
      Class480 var1;
      if ((var1 = (Class480)this.field2046.get(this)) == null) {// 83 367
         throw new Class242("inFrame not set! This:\n" + this + "\nInFrames: '" + this.field2046 + "'.");// 5
      } else {
         return var1.method1271();// 450
      }
   }

   // $VF: synthetic method
   @Override
   public Class480 method1889(ArrayList var1) {
      this.field2047 = var1;// 329
      Class570 var2 = this.method1892();// 269
      Class480 var4;
      if ((var4 = (Class480)this.field2045.get(var2)) == null) {// 142 148
         throw new Class242("outFrame not set! This:\n" + this + "\nExecutionChain: " + this.method1897() + "\nOutFrames: '" + this.field2045 + "'.");// 39
      } else {
         return var4.method1271();// 99
      }
   }

   // $VF: synthetic method
   public Class570(Class341 var1, Class246 var2) {
      this.field2044 = var1;
      this.field2047 = null;// 400 574
      if (var2 == null) {// 33
         throw new Class242("Cannot instantiate InstructionContextImpl from NULL.");// 0
      } else {
         this.field2042 = var2;// 552
         this.field2046 = new HashMap();// 603
         this.field2045 = new HashMap();// 278
      }
   }// 466

   // $VF: synthetic method
   public void method1890(Class233 var1) {
      String var3 = "Execution flow:\n";// 520
      var1.method427("", var3 + this.method1897());// 502
   }// 188

   // $VF: synthetic method
   public boolean method1891(Class480 var1) {
      Class480 var6;
      Class480 var10000 = var6 = (Class480)this.field2046.get(this.method1892());// 486
      Class484 var3 = var10000.method1270().method1297();// 117
      Class433 var4 = var10000.method1269().method863();// 300

      try {
         var6.method1270().method1298(var1.method1270());// 296
         var6.method1269().method868(var1.method1269());// 404
      } catch (Class233 var5) {// 81
         this.method1890(var5);// 401
         throw var5;// 394
      }

      return !var3.equals(var6.method1270()) || !var4.equals(var6.method1269());// 316 556
   }

   // $VF: synthetic method
   public Class570 method1892() {
      Class570 var1 = this;
      int var5 = this.field2047.size();// 225
      int var2 = 0;// 532

      for (int var10000 = --var5; var10000 >= 0; var10000 = --var5) {// 426
         Class570 var3;
         Class10 var4;
         if ((var4 = (var3 = (Class570)var1.field2047.get(var5)).method1887().method18()) instanceof Class279) {// 11 356 522
            var2++;// 41
         }

         if (var4 instanceof Class108) {// 91
            if (--var2 == -1) {// 312 360
               return var3;// 340
            }
         }
      }

      return null;// 337
   }

   // $VF: synthetic method
   public Class246[] method1893() {
      Class246[] var4 = new Class246[0];// 64
      Class246[] var2 = new Class246[1];// 469
      Class246[] var6 = new Class246[2];// 249
      Class10 var9;
      if (!((var9 = this.method1887().method18()) instanceof Class279)) {// 196 554
         if (var9 instanceof Class12) {// 256
            return var4;// 357
         } else if (var9 instanceof Class87) {// 305
            return var4;// 346
         } else if (var9 instanceof Class108) {// 13
            var2[0] = ((Class108)var9).method32();// 333
            return var2;// 284
         } else if (var9 instanceof Class89) {// 508
            var2[0] = ((Class89)var9).method32();// 517
            return var2;// 214
         } else if (var9 instanceof Class90) {// 585
            if (var9 instanceof Class113) {// 431
               Class246[] var10;
               Class246[] var11;
               (var10 = new Class246[(var11 = ((Class113)var9).method39()).length + 1])[0] = ((Class113)var9).method32();// 361 374 514
               System.arraycopy(var11, 0, var10, 1, var11.length);// 453
               return var10;// 354
            } else {
               var6[0] = this.method1887().method32();
               var6[1] = ((Class90)var9).method32();// 174 560
               return var6;// 71
            }
         } else {
            var2[0] = this.method1887().method32();// 547
            return var2;// 303
         }
      } else {
         Class565 var5;
         if ((var5 = Class341.method609(this.field2044).method1332(this.method1887())) == null) {// 89 429
            throw new Class242("Asking for successors of a RET in dead code?!");// 506
         } else {
            Class246[] var3;
            Class246[] var7 = new Class246[(var3 = var5.method1821()).length];// 130 384

            int var8;
            for (int var10000 = var8 = 0; var10000 < var3.length; var10000 = var8) {// 301
               int var10001 = var8;
               Class246 var10002 = var3[var8].method32();
               var8++;
               var7[var10001] = var10002;// 602
            }

            return var7;// 509
         }
      }
   }

   // $VF: synthetic method
   @Override
   public boolean method1894(Class480 var1, ArrayList var2, Class470 var3, Class472 var4) {
      Class570 var9 = this;
      this.field2047 = (ArrayList)var2.clone();// 115
      if (this.method1892() == null && Class341.method609(this.field2044).method1332(this.method1887()) != Class341.method609(this.field2044).method1331()) {// 23
         throw new Class242("Huh?! Am I '" + this + "' part of a subroutine or not?");// 440
      } else if (this.method1892() != null// 97
         && Class341.method609(this.field2044).method1332(this.method1887()) == Class341.method609(this.field2044).method1331()) {
         throw new Class242("Huh?! Am I '" + this + "' part of a subroutine or not?");// 411
      } else {
         Class480 var7;
         Class480 var10;
         if ((var7 = (Class480)this.field2046.get(this.method1892())) == null) {// 119 285
            this.field2046.put(this.method1892(), var1);// 32
            var10 = var1;// 238
         } else {
            if (var7.equals(var1)) {// 525
               return false;// 220
            }

            if (!this.method1891(var1)) {// 336
               return false;// 540
            }

            var10 = var7;// 137
         }

         var1 = var10.method1271();

         try {
            var3.method1240(var1);// 166
            var9.method1887().method10(var3);// 434
         } catch (Class233 var5) {// 373
            var5.method427("", "\nInstructionHandle: " + this.method1887() + "\n");
            var5.method427("", "\nExecution Frame:\n" + var1);
            this.method1890(var5);// 72 497
            throw var5;// 66
         }

         var4.method1240(var1);// 15 268 536
         this.method1887().method10(var4);// 385
         this.field2045.put(this.method1892(), var1);// 270
         return true;
      }
   }

   // $VF: synthetic method
   @Override
   public Class594[] method1895() {
      return Class341.method612(this.field2044).method1329(this.method1887());// 399
   }

   // $VF: synthetic method
   @Override
   public int method1896() {
      return this.field2043;// 59
   }

   // $VF: synthetic method
   public String method1897() {
      Class570 var1 = this;
      String var3 = this.toString();// 570

      int var2;
      for (int var4 = var2 = this.field2047.size() - 1; var4 >= 0; var4 = var2) {// 523
         StringBuilder var5 = new StringBuilder().append(var1.field2047.get(var2)).append("\n");// 162
         var2--;
         var3 = var5.append(var3).toString();
      }

      return var3;// 503
   }

   // $VF: synthetic method
   @Override
   public Class571[] method1898() {
      return this.field2044.method611(this.method1893());// 65
   }
}
