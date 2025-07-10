package mapped;

import java.io.DataInputStream;

// $VF: Compiled from ie
public class Class135 implements Class123, Class125 {
   // $VF: synthetic field
   public int field572;
   // $VF: synthetic field
   public Class128[] field573;

   // $VF: synthetic method
   public final int method2() {
      return this.field572;// 495
   }

   // $VF: synthetic method
   public Class128[] method137() {
      return this.field573;// 144
   }

   // $VF: synthetic method
   public Class135(DataInputStream var1, Class149 var2, boolean var3) {
      Class135 var4 = this;
      super();
      this.field572 = var1.readUnsignedShort();// 147 295
      this.field573 = new Class128[this.field572];// 338

      for (int var10000 = var5 = 0; var10000 < var4.field572; var10000 = var5) {// 273
         Class128[] var6 = var4.field573;// 141
         int var10001 = var5;
         Class128 var10002 = Class128.method102(var1, var2, var3);
         var5++;
         var6[var10001] = var10002;
      }
   }// 226

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
   }// 190
}
