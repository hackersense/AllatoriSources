package mapped;

import java.io.DataInput;
import java.io.DataOutputStream;

// $VF: Compiled from jh
public class Class171 extends Class151 {
   // $VF: synthetic field
   public Class209[] field654;
   // $VF: synthetic field
   public static final Class209[] field655 = new Class209[0];

   // $VF: synthetic method
   @Override
   public void method3(DataOutputStream var1) {
      super.method3(var1);
      var1.writeByte(this.field654.length);// 192 358
      Class209[] var4 = this.field654;
      int var3 = this.field654.length;

      for (int var10000 = var5 = 0; var10000 < var3; var10000 = var5) {// 574
         var4[var5++].method3(var1);// 272
      }
   }// 179

   // $VF: synthetic method
   @Override
   public Class151 method181(Class149 var1) {
      Class171 var3 = this;
      Class171 var2;
      (var2 = (Class171)this.clone()).field654 = new Class209[this.field654.length];// 315 465

      for (int var10000 = var4 = 0; var10000 < var3.field654.length; var10000 = var4) {// 184
         Class209[] var5 = var2.field654;
         int var10001 = var4;
         Class209 var10002 = var3.field654[var4].method372();
         var4++;
         var5[var10001] = var10002;
      }

      var2.method96(var1);// 534
      return var2;// 488
   }

   // $VF: synthetic method
   public Class171(int var1, int var2, DataInput var3, Class149 var4) {
      Class171 var8 = this;
      super((byte)21, var1, var2, var4);
      this.field654 = field655;// 338
      this.field654 = new Class209[var1 = var3.readUnsignedByte()];// 141 226 580

      for (int var9 = var6 = 0; var9 < var1; var9 = var6) {// 123
         Class209[] var10 = var8.field654;// 78
         int var10001 = var6;
         Class209 var10002 = new Class209(var3);
         var6++;
         var10[var10001] = var10002;
      }
   }// 533

   // $VF: synthetic method
   public Class209[] method216() {
      return this.field654;// 400
   }

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
   }// 170

   // $VF: synthetic method
   public void method217(Class209[] var1) {
      this.field654 = var1 != null ? var1 : field655;// 467
   }// 485
}
