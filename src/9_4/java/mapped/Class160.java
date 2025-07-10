package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from am
public class Class160 extends Class151 {
   // $VF: synthetic field
   public Class124[] field633;
   // $VF: synthetic field
   public int field634;

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1006(this);// 240
   }// 246

   // $VF: synthetic method
   public final Class124[] method191() {
      return this.field633;// 463
   }

   // $VF: synthetic method
   public Class160(int var1, int var2, Class124[] var3, Class149 var4) {
      super((byte)5, var1, var2, var4);
      this.method192(var3);// 46 170
   }// 553

   // $VF: synthetic method
   public final void method192(Class124[] var1) {
      this.field633 = var1;
      this.field634 = var1 == null ? 0 : var1.length;// 21 31
   }// 45

   // $VF: synthetic method
   public Class160(Class160 var1) {
      this(var1.method17(), var1.method2(), var1.method191(), var1.method94());// 273
   }// 161

   // $VF: synthetic method
   public Class160(int var1, int var2, DataInputStream var3, Class149 var4) {
      Class160 var7 = this;
      this(var1, var2, (Class124[])null, var4);// 377
      this.field634 = var3.readUnsignedShort();// 604
      this.field633 = new Class124[this.field634];// 22

      for (int var8 = var6 = 0; var8 < var7.field634; var8 = var6) {// 6
         Class124[] var9 = var7.field633;// 144
         int var10001 = var6;
         Class124 var10002 = new Class124(var3, var4);
         var6++;
         var9[var10001] = var10002;
      }
   }// 358

   /** @deprecated */
   // $VF: synthetic method
   public final Class124 method193(int var1) {
      Class160 var2 = this;

      for (int var10000 = var3 = 0; var10000 < var2.field634; var10000 = ++var3) {// 368
         if (var2.field633[var3].method30() == var1) {// 99
            return var2.field633[var3];// 160
         }
      }

      return null;// 541
   }

   // $VF: synthetic method
   public final Class124 method194(int var1, int var2) {
      Class160 var3 = this;

      for (int var10000 = var6 = 0; var10000 < var3.field634; var10000 = ++var6) {// 157
         if (var3.field633[var6].method30() == var1) {// 24
            int var4;
            int var5 = (var4 = var3.field633[var6].method84()) + var3.field633[var6].method17();// 286 600
            if (var2 >= var4 && var2 < var5) {// 108
               return var3.field633[var6];// 27
            }
         }
      }

      return null;// 69
   }

   // $VF: synthetic method
   public final int method30() {
      return this.field634;// 292
   }

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      Class160 var2 = this;// 330
      int var10000 = 0;
      super.method3(var1);
      var1.writeShort(this.field634);// 589

      for (int var3 = 0; var10000 < var2.field634; var10000 = var3) {// 579
         var2.field633[var3++].method3(var1);// 555
      }
   }// 415

   // $VF: synthetic method
   @Override
   public Class151 method181(Class149 var1) {
      Class160 var3 = this;
      Class160 var2;
      (var2 = (Class160)this.clone()).field633 = new Class124[this.field634];// 216 299

      for (int var10000 = var4 = 0; var10000 < var3.field634; var10000 = var4) {// 314
         Class124[] var5 = var2.field633;// 137
         int var10001 = var4;
         Class124 var10002 = var3.field633[var4].method95();
         var4++;
         var5[var10001] = var10002;
      }

      var2.field616 = var1;// 253
      return var2;// 135
   }
}
