package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from gi
public final class Class153 extends Class151 {
   // $VF: synthetic field
   public int field623;
   // $VF: synthetic field
   public Class217[] field624;

   // $VF: synthetic method
   @Override
   public Class151 method181(Class149 var1) {
      Class153 var3 = this;
      Class153 var2;
      (var2 = (Class153)this.clone()).field624 = new Class217[this.field623];// 40 63

      for (int var10000 = var4 = 0; var10000 < var3.field623; var10000 = var4) {// 541
         Class217[] var5 = var2.field624;// 550
         int var10001 = var4;
         Class217 var10002 = var3.field624[var4].method386();
         var4++;
         var5[var10001] = var10002;
      }

      var2.field616 = var1;// 456
      return var2;// 367
   }

   // $VF: synthetic method
   public final int method30() {
      return this.field623;// 209
   }

   // $VF: synthetic method
   public final void method184(Class217[] var1) {
      this.field624 = var1;
      this.field623 = var1 == null ? 0 : var1.length;// 398 415
   }// 428

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      Class153 var2 = this;// 567
      int var10000 = 0;
      super.method3(var1);
      var1.writeShort(this.field623);// 400

      for (int var3 = 0; var10000 < var2.field623; var10000 = var3) {// 33
         var2.field624[var3++].method3(var1);// 0
      }
   }// 246

   // $VF: synthetic method
   public final Class217[] method185() {
      return this.field624;// 68
   }

   // $VF: synthetic method
   public Class153(int var1, int var2, DataInputStream var3, Class149 var4) {
      Class153 var7 = this;
      this(var1, var2, (Class217[])null, var4);// 159
      this.field623 = var3.readUnsignedShort();// 493
      this.field624 = new Class217[this.field623];// 561

      for (int var8 = var6 = 0; var8 < var7.field623; var8 = var6) {// 377
         Class217[] var9 = var7.field624;// 604
         int var10001 = var6;
         Class217 var10002 = new Class217(var3, var4);
         var6++;
         var9[var10001] = var10002;
      }
   }// 6

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
   }// 108

   // $VF: synthetic method
   public Class153(int var1, int var2, Class217[] var3, Class149 var4) {
      super((byte)19, var1, var2, var4);
      this.method184(var3);// 185 406
   }// 1
}
