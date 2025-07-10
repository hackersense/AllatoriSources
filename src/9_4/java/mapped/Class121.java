package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.Serializable;

// $VF: Compiled from ih
public class Class121 implements Serializable, Cloneable {
   // $VF: synthetic field
   public int[] field151;
   // $VF: synthetic field
   public int field152;

   // $VF: synthetic method
   public final void method3(DataOutputStream var1) {
      var1.writeShort(this.field152);
      var1.writeShort(this.field151.length);// 146 567
      int[] var4 = this.field151;
      int var3 = this.field151.length;

      for (int var10000 = var5 = 0; var10000 < var3; var10000 = var5) {// 400
         var1.writeShort(var4[var5++]);// 33
      }
   }// 240

   // $VF: synthetic method
   public Class121(DataInputStream var1) {
      Class121 var3 = this;
      super();
      this.field152 = var1.readUnsignedShort();// 78
      int var2;
      this.field151 = new int[var2 = var1.readUnsignedShort()];// 123 406 533

      for (int var10000 = var4 = 0; var10000 < var2; var10000 = var4) {// 1
         int[] var5 = var3.field151;// 46
         int var10001 = var4;
         int var10002 = var1.readUnsignedShort();
         var4++;
         var5[var10001] = var10002;
      }
   }// 553

   // $VF: synthetic method
   public void method82(int[] var1) {
      this.field151 = var1;// 22
   }// 6

   // $VF: synthetic method
   public int[] method41() {
      return this.field151;// 493
   }

   // $VF: synthetic method
   public Class121 method83() {
      try {
         return (Class121)this.clone();// 485
      } catch (CloneNotSupportedException var1) {
         return null;// 391
      }
   }

   // $VF: synthetic method
   public Class121() {
   }// 491

   // $VF: synthetic method
   public void method6(int var1) {
      this.field152 = var1;// 534
   }// 488

   // $VF: synthetic method
   public int method2() {
      return this.field152;// 315
   }
}
