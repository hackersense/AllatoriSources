package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from hk
public final class Class152 extends Class151 {
   // $VF: synthetic field
   public int field621;
   // $VF: synthetic field
   public int[] field622;

   // $VF: synthetic method
   public Class152(int var1, int var2, DataInputStream var3, Class149 var4) {
      Class152 var7 = this;
      this(var1, var2, (int[])null, var4);// 498
      int var8 = 0;
      this.field621 = var3.readUnsignedShort();// 484
      this.field622 = new int[this.field621];// 409

      for (int var6 = 0; var8 < var7.field621; var8 = var6) {// 389
         int[] var9 = var7.field622;// 18
         int var10001 = var6;
         int var10002 = var3.readUnsignedShort();
         var6++;
         var9[var10001] = var10002;
      }
   }// 93

   // $VF: synthetic method
   public Class152(int var1, int var2, int[] var3, Class149 var4) {
      super((byte)23, var1, var2, var4);
      this.method82(this.field622);// 143 252
   }// 20

   // $VF: synthetic method
   public Class152(Class152 var1) {
      this(var1.method17(), var1.method2(), var1.method41(), var1.method94());// 557
   }// 34

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
   }// 530

   // $VF: synthetic method
   public final int[] method41() {
      return this.field622;// 78
   }

   // $VF: synthetic method
   @Override
   public Class151 method181(Class149 var1) {
      this = (Class152)this.clone();// 358
      if (this.field622 != null) {// 192
         this.field622 = new int[this.field622.length];// 574
         System.arraycopy(this.field622, 0, this.field622, 0, this.field622.length);// 272
      }

      this.field616 = var1;// 146
      return this;// 567
   }

   // $VF: synthetic method
   public final void method82(int[] var1) {
      this.field622 = var1;
      this.field621 = var1 == null ? 0 : var1.length;// 58 553
   }// 190

   // $VF: synthetic method
   public final int method30() {
      return this.field621;// 406
   }

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      Class152 var2 = this;// 295
      int var10000 = 0;
      super.method3(var1);
      var1.writeShort(this.field621);// 338

      for (int var3 = 0; var10000 < var2.field621; var10000 = var3) {// 273
         var1.writeShort(var2.field622[var3++]);// 161
      }
   }// 580
}
