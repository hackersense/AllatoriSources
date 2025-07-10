package mapped;

import java.io.DataOutputStream;

// $VF: Compiled from vj
public class Class114 extends Class113 {
   // $VF: synthetic method
   @Override
   public void method3(DataOutputStream var1) {
      Class114 var2 = this;// 185
      int var10000 = 0;
      super.method3(var1);
      var1.writeInt(this.field19);// 406

      for (int var3 = 0; var10000 < var2.field19; var10000 = var3) {// 1
         var1.writeInt(var2.field17[var3]);
         var1.writeInt(var2.field14[var3++] = var2.method33(var2.field18[var3]));// 46 170
      }
   }// 58

   // $VF: synthetic method
   public Class114(int[] var1, Class246[] var2, Class246 var3) {
      super((short)171, var1, var2, var3);
      this.field13 = (short)(9 + this.field19 * 8);// 147 295
      this.field16 = this.field13;// 273
   }// 161

   // $VF: synthetic method
   public Class114() {
   }// 93

   // $VF: synthetic method
   @Override
   public void method7(Class437 var1, boolean var2) {
      Class114 var5 = this;
      super.method7(var1, var2);
      this.field19 = var1.readInt();// 495
      this.field16 = (short)(9 + this.field19 * 8);// 159
      this.field13 = (short)(this.field16 + this.field15);// 488 493
      this.field17 = new int[this.field19];// 561
      this.field14 = new int[this.field19];// 377
      this.field18 = new Class246[this.field19];// 604

      for (int var6 = var4 = 0; var6 < var5.field19; var6 = var4) {// 22
         var5.field17[var4] = var1.readInt();// 6
         int[] var7 = var5.field14;// 144
         int var10001 = var4;
         int var10002 = var1.readInt();
         var4++;
         var7[var10001] = var10002;
      }
   }// 358

   // $VF: synthetic method
   @Override
   public void method10(Class471 var1) {
      var1.method1116(this);
      var1.method1094(this);// 552
      var1.method1056(this);// 603
      var1.method1166(this);// 278
      var1.method1096(this);// 246 466
   }// 467
}
