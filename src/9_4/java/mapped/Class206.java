package mapped;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// $VF: Compiled from sn
public class Class206 extends Class196 implements Cloneable {
   // $VF: synthetic field
   public String field756;
   // $VF: synthetic field
   public static Class399 field757 = new Class398();
   // $VF: synthetic field
   public List field758;
   // $VF: synthetic field
   public int field759;
   // $VF: synthetic field
   public ArrayList field760;
   // $VF: synthetic field
   public int field761;
   // $VF: synthetic field
   public int field762;
   // $VF: synthetic field
   public List field763;
   // $VF: synthetic field
   public String field764;
   // $VF: synthetic field
   public List field765;
   // $VF: synthetic field
   public String field766;
   // $VF: synthetic field
   public List field767;
   // $VF: synthetic field
   public List field768;
   // $VF: synthetic field
   public Class221 field769;
   // $VF: synthetic field
   public int field770;

   // $VF: synthetic method
   public static Class399 method224() {
      return field757;// 342
   }

   // $VF: synthetic method
   public void method354(int var1) {
      this.field761 = var1;// 162
   }// 282

   // $VF: synthetic method
   public Class205 method136() {
      int[] var5 = this.method41();// 307
      Class207[] var4 = this.method346();// 218
      Class208[] var3 = this.method341();// 109
      Object var6 = null;// 213
      Class206 var9;
      if (this.field765.size() == 0) {// 15
         var9 = this;// 385
         var6 = this.method200();
      } else {
         Class151[] var1 = Class523.method1544(this.field769, this.field765);// 582
         var6 = new Class151[this.field767.size() + var1.length];// 177
         this.field767.toArray((Object[])var6);// 266
         System.arraycopy(var1, 0, var6, this.field767.size(), var1.length);// 235
         var9 = this;// 516
      }

      Class149 var8 = var9.field769.method94();
      return new Class205(this.field759, this.field770, this.field766, this.field762, this.field761, this.field692, var8, var5, var4, var3, (Class151[])var6);// 95
   }

   // $VF: synthetic method
   public void method59(Class221 var1) {
      this.field769 = var1;// 106
   }// 569

   // $VF: synthetic method
   public Class208 method355(int var1) {
      return (Class208)this.field758.get(var1);// 407
   }

   // $VF: synthetic method
   public String[] method130() {
      String[] var2 = new String[this.field768.size()];// 480 518
      this.field768.toArray(var2);// 472
      return var2;// 381
   }

   // $VF: synthetic method
   public void method288(String var1) {
      this.field756 = var1.replace('/', '.');// 150
      this.field770 = this.field769.method404(var1);// 56
   }// 416

   // $VF: synthetic method
   public void method356(Class208 var1) {
      this.field758.remove(var1);// 585
   }// 431

   // $VF: synthetic method
   public int[] method41() {
      Class206 var3 = this;
      int var1;
      int[] var2 = new int[var1 = this.field768.size()];// 206 350

      for (int var10000 = var4 = 0; var10000 < var1; var10000 = var4) {// 156
         int var10001 = var4;
         int var10002 = var3.field769.method404((String)var3.field768.get(var4));
         var4++;
         var2[var10001] = var10002;// 3
      }

      return var2;// 186
   }

   // $VF: synthetic method
   public void method357(Class207 var1) {
      this.field763.add(var1);// 105
   }// 183

   // $VF: synthetic method
   public Class151[] method200() {
      return (Class151[])this.field767.toArray(new Class151[this.field767.size()]);// 452
   }

   // $VF: synthetic method
   public void method350(Class208[] var1) {
      Class206 var2 = this;
      int var10000 = 0;
      this.field758.clear();// 128

      for (int var3 = 0; var10000 < var1.length; var10000 = var3) {// 290
         var2.method365(var1[var3++]);// 199
      }
   }// 538

   // $VF: synthetic method
   public void method263(Class533 var1) {
      this.field765.remove(var1);// 413
   }// 320

   // $VF: synthetic method
   public Class208 method358(String var1, String var2) {
      Iterator var3 = this.field758.iterator();// 35

      while (var3.hasNext()) {
         Class208 var5;
         if ((var5 = (Class208)var3.next()).method190().equals(var1) && var5.method20().equals(var2)) {// 233 271
            return var5;// 256
         }
      }

      return null;// 182
   }

   // $VF: synthetic method
   public Class533[] method264() {
      return (Class533[])this.field765.toArray(new Class533[this.field765.size()]);// 539
   }

   // $VF: synthetic method
   public void method298(String var1) {
      this.field764 = var1.replace('/', '.');// 323
      this.field759 = this.field769.method404(var1);// 458
   }// 591

   // $VF: synthetic method
   public Class533[] method359(Class151[] var1) {
      Class206 var3 = this;
      ArrayList var6 = new ArrayList();// 248

      int var5;
      for (int var10000 = var5 = 0; var10000 < var1.length; var10000 = ++var5) {// 97
         Class151 var4;
         if ((var4 = var1[var5]) instanceof Class155) {// 138 468
            Class128[] var9 = ((Class155)var4).method137();// 32 119

            int var10;
            for (int var13 = var10 = 0; var13 < var9.length; var13 = var10) {// 238
               Class128 var11 = var9[var10];// 61
               Class221 var14 = var3.method46();
               var10++;
               var6.add(new Class533(var11, var14, false));// 525
            }
         } else if (var4 instanceof Class156) {// 291
            Class128[] var8 = ((Class156)var4).method137();// 169 216

            int var2;
            for (int var12 = var2 = 0; var12 < var8.length; var12 = var2) {// 299
               Class128 var7 = var8[var2];// 137
               Class221 var10004 = var3.method46();
               var2++;
               var6.add(new Class533(var7, var10004, false));// 50
            }
         }
      }

      return (Class533[])var6.toArray(new Class533[var6.size()]);// 166
   }

   // $VF: synthetic method
   public void method360(Class208 var1, Class208 var2) {
      if (var2 == null) {// 354
         throw new Class241("Replacement method must not be null");// 224
      } else {
         int var4;
         if ((var4 = this.field758.indexOf(var1)) < 0) {// 174 560
            this.field758.add(var2);// 71
         } else {
            this.field758.set(var4, var2);// 191
         }
      }
   }// 375 575

   // $VF: synthetic method
   public String method190() {
      return this.field756;// 505
   }

   // $VF: synthetic method
   public void method100(Class207 var1) {
      this.field763.remove(var1);// 126
   }// 324

   // $VF: synthetic method
   public void method361(Class355 var1) {
      if (this.field760 == null) {// 344
         this.field760 = new ArrayList();// 345
      }

      this.field760.add(var1);// 37
   }// 217

   // $VF: synthetic method
   public void method267(Class533 var1) {
      this.field765.add(var1);// 483
   }// 181

   // $VF: synthetic method
   public void method362(Class207 var1, Class207 var2) {
      if (var2 == null) {// 457
         throw new Class241("Replacement method must not be null");// 546
      } else {
         int var4;
         if ((var4 = this.field763.indexOf(var1)) < 0) {// 51 598
            this.field763.add(var2);// 325
         } else {
            this.field763.set(var4, var2);// 571
         }
      }
   }// 362 392

   // $VF: synthetic method
   public String method93() {
      return this.field764;// 482
   }

   // $VF: synthetic method
   public void method19() {
      Class206 var1 = this;
      Iterator var2;
      if (this.field760 != null) {// 84
         for (Iterator var10000 = var2 = this.field760.iterator(); var10000.hasNext(); var10000 = var2) {// 267
            ((Class355)var2.next()).method668(var1);// 393
         }
      }
   }// 402

   // $VF: synthetic method
   public static void method221(Class399 var0) {
      field757 = var0;// 113
   }// 459

   // $VF: synthetic method
   public String method20() {
      return this.field766;// 473
   }

   // $VF: synthetic method
   public void method262(Class151 var1) {
      this.field767.remove(var1);// 333
   }// 284

   // $VF: synthetic method
   public int method199() {
      return this.field761;// 76
   }

   // $VF: synthetic method
   public Class206(String var1, String var2, String var3, int var4, String[] var5) {
      this(var1, var2, var3, var4, var5, new Class221());// 412
   }// 257

   // $VF: synthetic method
   public void method363(Class355 var1) {
      if (this.field760 != null) {// 351
         this.field760.remove(var1);// 75
      }
   }// 111

   // $VF: synthetic method
   public boolean method364(Class207 var1) {
      return this.field763.contains(var1);// 249
   }

   // $VF: synthetic method
   public void method332(int var1) {
      this.field762 = var1;// 382
   }// 210

   // $VF: synthetic method
   public void method302(String var1) {
      this.field768.remove(var1);// 296
   }// 404

   // $VF: synthetic method
   public boolean equals(Object var1) {
      return field757.method748(this, var1);// 79
   }

   // $VF: synthetic method
   public Class206(Class205 var1) {
      Class206 var2 = this;
      super();
      this.field759 = -1;
      this.field770 = -1;
      this.field762 = 45;
      this.field761 = 3;
      this.field763 = new ArrayList();
      this.field758 = new ArrayList();
      this.field767 = new ArrayList();
      this.field768 = new ArrayList();
      this.field765 = new ArrayList();
      this.field759 = var1.method92();// 99
      this.field770 = var1.method199();// 160
      this.field764 = var1.method93();// 40
      this.field756 = var1.method20();// 63
      this.field766 = var1.method190();// 541
      this.field692 = var1.method17();// 550
      this.field769 = new Class221(var1.method94());// 510
      this.field762 = var1.method30();// 456
      this.field761 = var1.method84();// 367
      Class151[] var6;
      Class533[] var3 = this.method359(var6 = var1.method200());// 5 82 368
      Class208[] var12 = var1.method341();// 279
      Class207[] var4 = var1.method346();// 450
      String[] var5 = var1.method130();// 386

      for (int var13 = var7 = 0; var13 < var5.length; var13 = var7) {// 470
         var2.method131(var5[var7++]);// 149
      }

      for (int var14 = var8 = 0; var14 < var6.length; var14 = ++var8) {// 24
         if (!(var6[var8] instanceof Class154)) {// 286
            var2.method265(var6[var8]);// 600
         }
      }

      for (int var15 = var9 = 0; var15 < var3.length; var15 = var9) {// 27
         var2.method267(var3[var9++]);// 242
      }

      for (int var16 = var10 = 0; var16 < var12.length; var16 = var10) {// 209
         var2.method365(var12[var10++]);// 69
      }

      for (int var17 = var11 = 0; var17 < var4.length; var17 = var11) {// 422
         var2.method357(var4[var11++]);// 464
      }
   }// 31

   // $VF: synthetic method
   public void method91(int var1) {
      this.field770 = var1;// 173
      this.field756 = this.field769.method402().method176(var1, (byte)7).replace('/', '.');// 448
   }// 489

   // $VF: synthetic method
   public Class206(String var1, String var2, String var3, int var4, String[] var5, Class221 var6) {
      Class206 var9 = this;
      super();
      this.field759 = -1;// 78
      this.field770 = -1;
      this.field762 = 45;// 418
      this.field761 = 3;
      this.field763 = new ArrayList();
      this.field758 = new ArrayList();// 1 406
      this.field767 = new ArrayList();// 46
      this.field768 = new ArrayList();// 170
      this.field765 = new ArrayList();// 553
      this.field764 = var1;// 0
      this.field756 = var2;// 240
      this.field766 = var3;// 246
      this.field692 = var4;// 552
      this.field769 = var6;// 33 603
      if (var3 != null) {// 466
         this.method265(new Class169(var6.method106("SourceFile"), 2, var6.method106(var3), var6.method402()));// 467
      }

      this.field759 = var6.method404(var1);
      this.field770 = var6.method404(var2);// 59 391
      int var8;
      if (var5 != null) {// 330
         for (int var10 = var8 = 0; var10 < var5.length; var10 = var8) {// 589
            var9.method131(var5[var8++]);// 579
         }
      }
   }// 415

   // $VF: synthetic method
   public int hashCode() {
      return field757.method749(this);// 985
   }

   // $VF: synthetic method
   public int method92() {
      return this.field770;// 259
   }

   // $VF: synthetic method
   public int method84() {
      return this.field762;// 207
   }

   // $VF: synthetic method
   public int method30() {
      return this.field759;// 243
   }

   // $VF: synthetic method
   public Class207[] method346() {
      return (Class207[])this.field763.toArray(new Class207[this.field763.size()]);// 12
   }

   // $VF: synthetic method
   public Object clone() {
      Class206 var1 = this;

      try {
         return var1.clone();// 535
      } catch (CloneNotSupportedException var2) {// 293
         System.err.println(var2);// 54
         return null;// 322
      }
   }

   // $VF: synthetic method
   public void method98(Class208 var1, int var2) {
      this.field758.set(var2, var1);// 124
   }// 568

   // $VF: synthetic method
   public void method131(String var1) {
      this.field768.add(var1);// 221
   }// 444

   // $VF: synthetic method
   public void method85(int var1) {
      Class251 var3;
      (var3 = new Class251()).method451(Opcodes.field101);// 274 558
      var3.method451(new Class289(this.field769.method408(this.field756, "<init>", "()V")));// 501
      var3.method451(Opcodes.field66);// 337
      Class203 var4 = new Class203(var1, Class138.field586, Class138.field582, null, "<init>", this.field764, var3, this.field769);// 208
      var4.method89(1);
      this.method365(var4.method315());// 133
   }// 65

   // $VF: synthetic method
   public Class221 method46() {
      return this.field769;// 347
   }

   // $VF: synthetic method
   public void method365(Class208 var1) {
      this.field758.add(var1);// 297
   }// 426

   // $VF: synthetic method
   public void method265(Class151 var1) {
      this.field767.add(var1);// 48
   }// 281

   // $VF: synthetic method
   public void method89(int var1) {
      this.field759 = var1;// 527
      this.field764 = this.field769.method402().method176(var1, (byte)7).replace('/', '.');// 383
   }// 140

   // $VF: synthetic method
   public Class208[] method341() {
      return (Class208[])this.field758.toArray(new Class208[this.field758.size()]);// 262
   }

   // $VF: synthetic method
   public Class207 method366(String var1) {
      Iterator var4 = this.field763.iterator();// 506

      while (var4.hasNext()) {
         Class207 var3;
         if ((var3 = (Class207)var4.next()).method190().equals(var1)) {// 318 599
            return var3;// 88
         }
      }

      return null;// 331
   }
}
