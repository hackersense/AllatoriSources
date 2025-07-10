package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from sf
public class Class168 extends Class151 {
   // $VF: synthetic field
   public Class121[] field650;

   // $VF: synthetic method
   public Class168(int var1, int var2, DataInputStream var3, Class149 var4) {
      Class168 var8 = this;
      this(var1, var2, (Class121[])null, var4);// 295
      this.field650 = new Class121[var1 = var3.readUnsignedShort()];// 161 273

      for (int var9 = var6 = 0; var9 < var1; var9 = var6) {// 141
         Class121[] var10 = var8.field650;// 580
         int var10001 = var6;
         Class121 var10002 = new Class121(var3);
         var6++;
         var10[var10001] = var10002;
      }
   }// 123

   // $VF: synthetic method
   public final void method211(Class121[] var1) {
      this.field650 = var1;// 46
   }// 170

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      super.method3(var1);
      var1.writeShort(this.field650.length);// 146 321
      Class121[] var4 = this.field650;
      int var3 = this.field650.length;

      for (int var10000 = var5 = 0; var10000 < var3; var10000 = var5) {// 567
         var4[var5++].method3(var1);// 400
      }
   }// 0

   // $VF: synthetic method
   // $VF: bridge method
   @Override
   public Class151 method181(Class149 var1) {
      return this.method213(var1);// 484
   }

   // $VF: synthetic method
   public final Class121[] method212() {
      return this.field650;// 533
   }

   // $VF: synthetic method
   public Class168 method213(Class149 var1) {
      Class168 var3 = this;
      Class168 var2;
      (var2 = (Class168)this.clone()).field650 = new Class121[this.field650.length];// 184 534

      for (int var10000 = var4 = 0; var10000 < var3.field650.length; var10000 = var4) {// 495
         Class121[] var5 = var2.field650;// 159
         int var10001 = var4;
         Class121 var10002 = var3.field650[var4].method83();
         var4++;
         var5[var10001] = var10002;
      }

      var2.field616 = var1;// 561
      return var2;// 377
   }

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
   }// 315

   // $VF: synthetic method
   public Class168(int var1, int var2, Class121[] var3, Class149 var4) {
      super((byte)20, var1, var2, var4);
      this.field650 = var3;// 93 151
   }// 530
}
