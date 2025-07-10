package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from kl
public final class Class150 extends Class151 implements Class123 {
   // $VF: synthetic field
   public int field614;
   // $VF: synthetic field
   public Class218[] field615;

   // $VF: synthetic method
   public Class150(int var1, int var2, Class218[] var3, Class149 var4) {
      super((byte)11, var1, var2, var4);
      this.method179(var3);// 185 533
   }// 406

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      Class150 var2 = this;// 146
      int var10000 = 0;
      super.method3(var1);
      var1.writeShort(this.field614);// 567

      for (int var3 = 0; var10000 < var2.field614; var10000 = var3) {// 400
         var2.field615[var3++].method3(var1);// 33
      }
   }// 240

   // $VF: synthetic method
   public Class150(int var1, int var2, DataInputStream var3, Class149 var4) {
      Class150 var7 = this;
      this(var1, var2, (Class218[])null, var4);// 495
      this.field614 = var3.readUnsignedShort();// 159
      this.field615 = new Class218[this.field614];// 493

      for (int var8 = var6 = 0; var8 < var7.field614; var8 = var6) {// 561
         Class218[] var9 = var7.field615;// 377
         int var10001 = var6;
         Class218 var10002 = new Class218(var3, var4);
         var6++;
         var9[var10001] = var10002;
      }
   }// 22

   // $VF: synthetic method
   public final int method30() {
      return this.field614;// 94
   }

   // $VF: synthetic method
   public final void method179(Class218[] var1) {
      this.field615 = var1;
      this.field614 = var1 == null ? 0 : var1.length;// 73 415
   }// 398

   // $VF: synthetic method
   public final Class218[] method180() {
      return this.field615;// 485
   }

   // $VF: synthetic method
   @Override
   public Class151 method181(Class149 var1) {
      Class150 var3 = this;
      Class150 var2;
      (var2 = (Class150)this.clone()).field615 = new Class218[this.field614];// 40 160

      for (int var10000 = var4 = 0; var10000 < var3.field614; var10000 = var4) {// 63
         Class218[] var5 = var2.field615;// 541
         int var10001 = var4;
         Class218 var10002 = var3.field615[var4].method387();
         var4++;
         var5[var10001] = var10002;
      }

      var2.field616 = var1;// 510
      return var2;// 456
   }

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1003(this);// 286
   }// 600
}
