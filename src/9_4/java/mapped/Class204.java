package mapped;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// $VF: Compiled from re
public class Class204 extends Class197 {
   // $VF: synthetic field
   public static Class399 field725 = new Class403();
   // $VF: synthetic field
   public Object field726 = null;
   // $VF: synthetic field
   public List field727;

   // $VF: synthetic method
   public int hashCode() {
      return field725.method749(this);// 514
   }

   // $VF: synthetic method
   public void method21(short var1) {
      this.method300(Class138.field581);// 149
      if (var1 != 0) {// 157
         this.field726 = new Integer(var1);// 24
      }
   }// 600

   // $VF: synthetic method
   public void method323(Class577 var1) {
      if (this.field727 != null) {// 592
         this.field727.remove(var1);// 483
      }
   }// 433

   // $VF: synthetic method
   public int method30() {
      switch (this.field727.method142()) {// 81
         case 4:
         case 5:
         case 8:
         case 9:
         case 10:
            while (false) {
            }

            return this.field725.method143((Integer)this.field726);// 275
         case 6:
            return this.field725.method411((Float)this.field726);// 355
         case 7:
            return this.field725.method415((Double)this.field726);// 369
         case 11:
            return this.field725.method407((Long)this.field726);// 511
         case 12:
         case 13:
         default:
            throw new RuntimeException("Oops: Unhandled : " + this.field727.method142());// 103
         case 14:
            return this.field725.method409((String)this.field726);// 210
      }
   }

   // $VF: synthetic method
   public Class207 method324() {
      String var4 = this.method93();// 280
      int var2 = this.field725.method106(this.field693);// 370
      int var5 = this.field725.method106(var4);// 516
      if (this.field726 != null) {// 95
         this.method300(this.field727);// 227
         int var3 = this.method30();// 55
         this.method262(new Class161(this.field725.method106("ConstantValue"), 2, var3, this.field725.method402()));// 77
      }

      this.method314(this.field725);// 258
      return new Class207(this.field727, var2, var5, this.method200(), this.field725.method402());// 107
   }

   // $VF: synthetic method
   public void method300(Class138 var1) {
      if (this.field727 == null) {// 268
         throw new Class241("You haven't defined the type of the field yet");// 497
      } else if (!this.field727.equals(var1)) {// 109
         throw new Class241("Types are not compatible: " + this.field727 + " vs. " + var1);// 213
      }
   }// 385

   // $VF: synthetic method
   public boolean equals(Object var1) {
      return field725.method748(this, var1);// 255
   }

   // $VF: synthetic method
   public String method190() {
      return this.field726 != null ? this.field726.toString() : null;// 91 312 551
   }

   // $VF: synthetic method
   public void method325(char var1) {
      this.method300(Class138.field585);// 94
      if (var1 != 0) {// 209
         this.field726 = new Integer(var1);// 69
      }
   }// 422

   // $VF: synthetic method
   public void method229(long var1) {
      this.method300(Class138.field578);// 99
      if (var1 != 0L) {// 160
         this.field726 = new Long(var1);// 40
      }
   }// 541

   // $VF: synthetic method
   public void method107() {
      this.field726 = null;// 166
   }// 434

   // $VF: synthetic method
   public void method85(int var1) {
      this.method300(Class138.field591);// 367
      if (var1 != 0) {// 82
         this.field726 = new Integer(var1);// 83
      }
   }// 279

   // $VF: synthetic method
   public void method225(double var1) {
      this.method300(Class138.field576);// 169
      if (var1 != 0.0) {// 216
         this.field726 = new Double(var1);// 299
      }
   }// 137

   // $VF: synthetic method
   public Class204(int var1, Class138 var2, String var3, Class221 var4) {
      this.method90(var1);// 6
      this.method266(var2);// 144
      this.method131(var3);// 461
      this.method59(var4);// 22 358
   }// 192

   // $VF: synthetic method
   public void method326(Class577 var1) {
      if (this.field727 == null) {// 390
         this.field727 = new ArrayList();// 573
      }

      this.field727.add(var1);// 502
   }// 188

   // $VF: synthetic method
   public void method115() {
      Class204 var1 = this;
      Iterator var2;
      if (this.field727 != null) {// 263
         for (Iterator var10000 = var2 = this.field727.iterator(); var10000.hasNext(); var10000 = var2) {// 225
            ((Class577)var2.next()).method1915(var1);// 532
         }
      }
   }// 11

   // $VF: synthetic method
   public void method89(int var1) {
      Class149 var3;
      this.field726 = ((Class180)(var3 = this.field725.method402()).method174(var1)).method227(var3);// 232 399 586
   }// 463

   // $VF: synthetic method
   public static void method221(Class399 var0) {
      field725 = var0;// 47
   }// 182

   // $VF: synthetic method
   @Override
   public String method93() {
      return this.field727.method20();// 282
   }

   // $VF: synthetic method
   public void method285(boolean var1) {
      this.method300(Class138.field584);// 411
      if (var1) {// 468
         this.field726 = new Integer(1);// 138
      }
   }// 119

   // $VF: synthetic method
   public void method231(float var1) {
      this.method300(Class138.field575);// 61
      if ((double)var1 != 0.0) {// 525
         this.field726 = new Float(var1);// 220
      }
   }// 336

   // $VF: synthetic method
   public Class204 method327(Class221 var1) {
      Class204 var4 = (Class204)this.clone();// 506
      var4.method59(var1);// 599
      return var4;// 318
   }

   // $VF: synthetic method
   public void method328(byte var1) {
      this.method300(Class138.field594);// 21
      if (var1 != 0) {// 115
         this.field726 = new Integer(var1);// 223
      }
   }// 23

   // $VF: synthetic method
   public static Class399 method224() {
      return field725;// 602
   }

   // $VF: synthetic method
   public Class204(Class207 var1, Class221 var2) {
      Class204 var9 = this;
      this(var1.method17(), Class138.method151(var1.method20()), var1.method190(), var2);// 240
      Class151[] var8 = var1.method200();// 246

      int var3;
      for (int var10 = var3 = 0; var10 < var8.length; var10 = ++var3) {// 552
         if (var8[var3] instanceof Class161) {// 603
            var9.method89(((Class161)var8[var3]).method30());// 278
         } else if (var8[var3] instanceof Class154) {// 466
            Class128[] var4 = ((Class154)var8[var3]).method137();// 467 485

            int var5;
            for (int var11 = var5 = 0; var11 < var4.length; var11 = var5) {// 68
               Class128 var6 = var4[var5];// 59
               var5++;
               var9.method263(new Class533(var6, var2, false));// 391
            }
         } else {
            var9.method262(var8[var3]);// 579
         }
      }
   }// 415

   // $VF: synthetic method
   public void method302(String var1) {
      this.method300(new Class144("java.lang.String"));// 257
      if (var1 != null) {// 269
         this.field726 = var1;// 455
      }
   }// 236

   // $VF: synthetic method
   public void method314(Class221 var1) {
      Class204 var5 = this;
      int var2;
      Class151[] var4;
      if ((var4 = Class523.method1544(var1, this.field694)) != null) {// 193 601
         for (int var6 = var2 = 0; var6 < var4.length; var6 = var2) {// 251
            var5.method262(var4[var2++]);// 486
         }
      }
   }// 245
}
