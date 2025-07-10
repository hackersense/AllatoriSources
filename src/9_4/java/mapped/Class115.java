package mapped;

import java.io.DataOutputStream;

// $VF: Compiled from nm
public class Class115 extends Class113 {
   // $VF: synthetic method
   @Override
   public void method10(Class471 var1) {
      var1.method1116(this);
      var1.method1094(this);// 555
      var1.method1056(this);// 73
      var1.method1166(this);// 415
      var1.method1198(this);// 398 579
   }// 428

   // $VF: synthetic method
   @Override
   public void method7(Class437 var1, boolean var2) {
      Class115 var3 = this;
      super.method7(var1, (boolean)var2);
      var2 = var1.readInt();// 144
      int var4;
      this.field19 = (var4 = var1.readInt()) - var2 + 1;// 358 461
      this.field16 = (short)(13 + this.field19 * 4);// 6 192
      this.field13 = (short)(this.field16 + this.field15);// 574
      this.field17 = new int[this.field19];// 272
      this.field14 = new int[this.field19];// 321
      this.field18 = new Class246[this.field19];// 179

      for (int var10000 = var5 = var2; var10000 <= var4; var10000 = var5) {// 146
         var3.field17[var5 - var2] = var5++;// 567
      }

      for (int var8 = var6 = 0; var8 < var3.field19; var8 = var6) {// 33
         int[] var9 = var3.field14;// 0
         int var10 = var6;
         int var11 = var1.readInt();
         var6++;
         var9[var10] = var11;
      }
   }// 246

   // $VF: synthetic method
   @Override
   public void method3(DataOutputStream var1) {
      Class115 var2 = this;
      super.method3(var1);
      int var3 = this.field19 > 0 ? this.field17[0] : 0;// 58 190
      var1.writeInt(var3);// 315
      int var4 = this.field19 > 0 ? this.field17[this.field19 - 1] : 0;// 465
      int var10000 = 0;
      var1.writeInt(var4);// 132

      for (int var5 = 0; var10000 < var2.field19; var10000 = var5) {// 184
         var1.writeInt(var2.field14[var5++] = var2.method33(var2.field18[var5]));// 534
      }
   }// 495

   // $VF: synthetic method
   public Class115() {
   }// 93

   // $VF: synthetic method
   public Class115(int[] var1, Class246[] var2, Class246 var3) {
      super((short)170, var1, var2, var3);
      this.field13 = (short)(13 + this.field19 * 4);// 226 580
      this.field16 = this.field13;// 78
   }// 418
}
