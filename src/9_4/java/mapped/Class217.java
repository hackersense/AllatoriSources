package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.Serializable;

// $VF: Compiled from vm
public final class Class217 implements Cloneable, Serializable {
   // $VF: synthetic field
   public Class149 field791;
   // $VF: synthetic field
   public final int field792;
   // $VF: synthetic field
   public int field793;
   // $VF: synthetic field
   public Class219[] field794;
   // $VF: synthetic field
   public int field795;
   // $VF: synthetic field
   public Class219[] field796;
   // $VF: synthetic field
   public int field797;

   // $VF: synthetic method
   public Class217(int var1, int var2, int var3, Class219[] var4, int var5, Class219[] var6, Class149 var7) {
      this.field792 = var1;// 579
      this.field797 = var2;// 555
      this.field793 = var3;// 73
      this.field796 = var4;// 415
      this.field795 = var5;// 398
      this.field794 = var6;// 428
      this.field791 = var7;// 87 589
   }// 586

   // $VF: synthetic method
   public Class219[] method382() {
      return this.field794;// 355
   }

   // $VF: synthetic method
   public Class219[] method383() {
      return this.field796;// 221
   }

   // $VF: synthetic method
   public void method384(Class219[] var1) {
      this.field796 = var1;// 129
   }// 258

   // $VF: synthetic method
   public int method30() {
      return this.field795;// 404
   }

   // $VF: synthetic method
   public void method89(int var1) {
      this.field795 = var1;// 486
   }// 117

   // $VF: synthetic method
   public void method90(int var1) {
      this.field793 = var1;// 266
   }// 235

   // $VF: synthetic method
   public void method385(Class219[] var1) {
      this.field794 = var1;// 556
   }// 316

   // $VF: synthetic method
   public final Class149 method94() {
      return this.field791;// 438
   }

   // $VF: synthetic method
   public final void method3(DataOutputStream var1) {
      DataOutputStream var3 = var1;
      Class217 var4 = this;
      var1.write(this.field792);// 38
      if (this.field792 < 0 || this.field792 > 63) {// 257
         if (this.field792 >= 64 && this.field792 <= 127) {
            this.field794[0].method3(var1);// 148
         } else if (this.field792 == 247) {
            var1.writeShort(this.field797);// 142
            this.field794[0].method3(var1);// 39
         } else if (this.field792 >= 248 && this.field792 <= 250) {
            var1.writeShort(this.field797);// 99
         } else if (this.field792 == 251) {
            var1.writeShort(this.field797);// 40
         } else {
            if (this.field792 >= 252 && this.field792 <= 254) {
               int var9 = 0;
               var1.writeShort(this.field797);// 541

               for (int var6 = 0; var9 < var4.field793; var9 = var6) {// 550
                  var4.field796[var6++].method3(var3);// 510
               }
            } else {
               if (this.field792 != 255) {// 367
                  throw new Class239("Invalid Stack map table tag: " + this.field792);// 600
               }

               int var7 = 0;
               var1.writeShort(this.field797);
               var1.writeShort(this.field793);// 82 83

               for (int var2 = 0; var7 < var4.field793; var7 = var2) {// 5
                  var4.field796[var2++].method3(var3);// 279
               }

               var3.writeShort(var4.field795);// 386

               int var5;
               for (int var8 = var5 = 0; var8 < var4.field795; var8 = var5) {// 470
                  var4.field794[var5++].method3(var3);// 149
               }
            }
         }
      }
   }// 27 63 160 236 368 455

   // $VF: synthetic method
   public void method6(int var1) {
      this.field797 = var1;// 307
   }// 218

   // $VF: synthetic method
   public void method87(Class463 var1) {
   }// 520

   // $VF: synthetic method
   public int method17() {
      return this.field797;// 385
   }

   // $VF: synthetic method
   public Class217(DataInputStream var1, Class149 var2) {
      DataInputStream var4 = var1;
      Class217 var5 = this;
      this(var1.read(), -1, null, -1, -1, null, var2);
      if (this.field792 >= 0 && this.field792 <= 63) {// 46 406
         this.field797 = this.field792 - 0;// 170
      } else if (this.field792 >= 64 && this.field792 <= 127) {
         this.field797 = this.field792 - 64;
         this.field795 = 1;// 190
         this.field794 = new Class219[1];// 58 315
         this.field794[0] = new Class219(var1, var2);// 465
      } else if (this.field792 == 247) {
         this.field797 = var1.readShort();
         this.field795 = 1;// 534
         this.field794 = new Class219[1];// 184 488
         this.field794[0] = new Class219(var1, var2);// 495
      } else if (this.field792 >= 248 && this.field792 <= 250) {
         this.field797 = var1.readShort();// 493
      } else if (this.field792 == 251) {
         this.field797 = var1.readShort();// 377
      } else {
         if (this.field792 >= 252 && this.field792 <= 254) {
            this.field797 = var1.readShort();// 22
            this.field793 = this.field792 - 251;// 6
            this.field796 = new Class219[this.field793];// 144

            int var7;
            for (int var12 = var7 = 0; var12 < var5.field793; var12 = var7) {// 461
               Class219[] var13 = var5.field796;// 358
               int var15 = var7;
               Class219 var17 = new Class219(var4, var2);
               var7++;
               var13[var15] = var17;
            }
         } else {
            if (this.field792 != 255) {// 574
               throw new Class239("Invalid frame type found while parsing stack map table: " + this.field792);// 466
            }

            this.field797 = var1.readShort();
            this.field793 = var1.readShort();// 272 321
            this.field796 = new Class219[this.field793];// 179

            int var3;
            for (int var8 = var3 = 0; var8 < var5.field793; var8 = var3) {// 146
               Class219[] var9 = var5.field796;// 567
               int var10001 = var3;
               Class219 var10002 = new Class219(var4, var2);
               var3++;
               var9[var10001] = var10002;
            }

            var5.field795 = var4.readShort();// 33
            var5.field794 = new Class219[var5.field795];// 0

            for (int var10 = var3 = 0; var10 < var5.field795; var10 = var3) {// 240
               Class219[] var11 = var5.field794;// 246
               int var14 = var3;
               Class219 var16 = new Class219(var4, var2);
               var3++;
               var11[var14] = var16;
            }
         }
      }
   }// 132 159 485 553 561 604

   // $VF: synthetic method
   public final void method96(Class149 var1) {
      this.field791 = var1;// 478
   }// 212

   // $VF: synthetic method
   public Class217 method386() {
      try {
         return (Class217)this.clone();// 548
      } catch (CloneNotSupportedException var1) {
         return null;// 523
      }
   }

   // $VF: synthetic method
   public int method2() {
      return this.field793;// 95
   }
}
