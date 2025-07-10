package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from al
public final class Class157 extends Class151 {
   // $VF: synthetic field
   public int[] field628;
   // $VF: synthetic field
   public int field629;

   // $VF: synthetic method
   public final String[] method130() {
      Class157 var2 = this;
      String[] var1 = new String[this.field629];// 63

      for (int var10000 = var3 = 0; var10000 < var2.field629; var10000 = var3) {// 541
         int var10001 = var3;
         String var10002 = var2.field616.method176(var2.field628[var3], (byte)7).replace('/', '.');
         var3++;
         var1[var10001] = var10002;// 550
      }

      return var1;// 367
   }

   // $VF: synthetic method
   public final void method82(int[] var1) {
      this.field628 = var1;
      this.field629 = var1 == null ? 0 : var1.length;// 24 157
   }// 286

   // $VF: synthetic method
   @Override
   public Class151 method181(Class149 var1) {
      this = (Class157)this.clone();// 119
      if (this.field628 != null) {// 32
         this.field628 = new int[this.field628.length];// 238
         System.arraycopy(this.field628, 0, this.field628, 0, this.field628.length);// 423
      }

      this.field616 = var1;// 220
      return this;// 593
   }

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      Class157 var2 = this;// 555
      int var10000 = 0;
      super.method3(var1);
      var1.writeShort(this.field629);// 73

      for (int var3 = 0; var10000 < var2.field629; var10000 = var3) {// 415
         var1.writeShort(var2.field628[var3++]);// 398
      }
   }// 87

   // $VF: synthetic method
   public Class157(int var1, int var2, int[] var3, Class149 var4) {
      super((byte)3, var1, var2, var4);
      this.method82(var3);// 58 190
   }// 315

   // $VF: synthetic method
   public Class157(Class157 var1) {
      this(var1.method17(), var1.method2(), var1.method41(), var1.method94());// 580
   }// 226

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1031(this);// 603
   }// 278

   // $VF: synthetic method
   public final int[] method41() {
      return this.field628;// 28
   }

   // $VF: synthetic method
   public Class157(int var1, int var2, DataInputStream var3, Class149 var4) {
      Class157 var7 = this;
      this(var1, var2, (int[])null, var4);// 6
      int var8 = 0;
      this.field629 = var3.readUnsignedShort();// 144
      this.field628 = new int[this.field629];// 461

      for (int var6 = 0; var8 < var7.field629; var8 = var6) {// 358
         int[] var9 = var7.field628;// 192
         int var10001 = var6;
         int var10002 = var3.readUnsignedShort();
         var6++;
         var9[var10001] = var10002;
      }
   }// 272

   // $VF: synthetic method
   public final int method30() {
      return this.field629;// 148
   }
}
