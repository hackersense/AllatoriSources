package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from gm
public final class Class162 extends Class151 {
   // $VF: synthetic field
   public Class211[] field636;
   // $VF: synthetic field
   public int field637;

   // $VF: synthetic method
   public Class162(int var1, int var2, Class211[] var3, Class149 var4) {
      super((byte)6, var1, var2, var4);
      this.method195(var3);// 170 553
   }// 58

   // $VF: synthetic method
   @Override
   public Class151 method181(Class149 var1) {
      Class162 var3 = this;
      Class162 var2;
      (var2 = (Class162)this.clone()).field636 = new Class211[this.field637];// 149 470

      for (int var10000 = var4 = 0; var10000 < var3.field637; var10000 = var4) {// 157
         Class211[] var5 = var2.field636;// 24
         int var10001 = var4;
         Class211 var10002 = var3.field636[var4].method373();
         var4++;
         var5[var10001] = var10002;
      }

      var2.field616 = var1;// 600
      return var2;// 108
   }

   // $VF: synthetic method
   public Class162(int var1, int var2, DataInputStream var3, Class149 var4) {
      Class162 var7 = this;
      this(var1, var2, (Class211[])null, var4);// 22
      this.field637 = var3.readUnsignedShort();// 6
      this.field636 = new Class211[this.field637];// 144

      for (int var8 = var6 = 0; var8 < var7.field637; var8 = var6) {// 461
         Class211[] var9 = var7.field636;// 358
         int var10001 = var6;
         Class211 var10002 = new Class211(var3);
         var6++;
         var9[var10001] = var10002;
      }
   }// 574

   // $VF: synthetic method
   public final void method195(Class211[] var1) {
      this.field636 = var1;
      this.field637 = var1 == null ? 0 : var1.length;// 148 455
   }// 236

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1022(this);// 552
   }// 603

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      Class162 var2 = this;// 579
      int var10000 = 0;
      super.method3(var1);
      var1.writeShort(this.field637);// 555

      for (int var3 = 0; var10000 < var2.field637; var10000 = var3) {// 73
         var2.field636[var3++].method3(var1);// 415
      }
   }// 428

   // $VF: synthetic method
   public final Class211[] method196() {
      return this.field636;// 424
   }

   // $VF: synthetic method
   public Class162(Class162 var1) {
      this(var1.method17(), var1.method2(), var1.method196(), var1.method94());// 161
   }// 141
}
