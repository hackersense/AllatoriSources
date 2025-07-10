package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from nh
public abstract class Class154 extends Class151 {
   // $VF: synthetic field
   public int field625;
   // $VF: synthetic field
   public boolean field626;
   // $VF: synthetic field
   public Class128[] field627;

   // $VF: synthetic method
   public boolean method101() {
      return this.field626;// 38
   }

   // $VF: synthetic method
   public Class154(byte var1, int var2, int var3, DataInputStream var4, Class149 var5, boolean var6) {
      Class154 var9 = this;
      this(var1, var2, var3, (Class128[])null, var5, var6);// 141
      this.field625 = var4.readUnsignedShort();// 580
      this.field627 = new Class128[this.field625];// 226

      for (int var10 = var8 = 0; var10 < var9.field625; var10 = var8) {// 123
         Class128[] var11 = var9.field627;// 78
         int var10001 = var8;
         Class128 var10002 = Class128.method102(var4, var5, var6);
         var8++;
         var11[var10001] = var10002;
      }
   }// 533

   // $VF: synthetic method
   public Class154(byte var1, int var2, int var3, Class128[] var4, Class149 var5, boolean var6) {
      super(var1, var2, var3, var5);
      this.method187(var4);// 534
      this.field626 = var6;// 184 488
   }// 495

   // $VF: synthetic method
   public void method186(DataOutputStream var1) {
      Class154 var2 = this;
      int var10000 = 0;
      var1.writeShort(this.field625);// 236

      for (int var3 = 0; var10000 < var2.field625; var10000 = var3) {// 142
         var2.field627[var3++].method3(var1);// 39
      }
   }// 368

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1023(this);// 192
   }// 574

   // $VF: synthetic method
   public final int method30() {
      return this.field625;// 424
   }

   // $VF: synthetic method
   public final void method187(Class128[] var1) {
      this.field627 = var1;
      this.field625 = var1 == null ? 0 : var1.length;// 0 33
   }// 240

   // $VF: synthetic method
   public Class128[] method137() {
      return this.field627;// 398
   }
}
