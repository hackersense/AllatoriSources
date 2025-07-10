package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from cf
public abstract class Class165 extends Class151 {
   // $VF: synthetic field
   public int field648;
   // $VF: synthetic field
   public Class135[] field649;

   // $VF: synthetic method
   public Class165(byte var1, int var2, int var3, Class135[] var4, Class149 var5) {
      super(var1, var2, var3, var5);
      this.method209(var4);// 184 534
   }// 488

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      super.method3(var1);
      this.method186(var1);// 38 412
   }// 257

   // $VF: synthetic method
   public Class165(byte var1, int var2, int var3, DataInputStream var4, Class149 var5, boolean var6) {
      Class165 var9 = this;
      this(var1, var2, var3, (Class135[])null, var5);// 161
      this.field648 = var4.readUnsignedByte();// 580
      this.field649 = new Class135[this.field648];// 226

      for (int var10 = var8 = 0; var10 < var9.field648; var10 = var8) {// 123
         Class135[] var11 = var9.field649;// 78
         int var10001 = var8;
         Class135 var10002 = new Class135(var4, var5, var6);
         var8++;
         var11[var10001] = var10002;
      }
   }// 533

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
   }// 192

   // $VF: synthetic method
   public final Class135[] method208() {
      return this.field649;// 59
   }

   // $VF: synthetic method
   public final int method30() {
      return this.field648;// 424
   }

   // $VF: synthetic method
   public final void method209(Class135[] var1) {
      this.field649 = var1;
      this.field648 = var1 == null ? 0 : var1.length;// 0 33
   }// 552

   // $VF: synthetic method
   public Class135[] method210() {
      return this.field649;// 398
   }

   // $VF: synthetic method
   public void method186(DataOutputStream var1) {
      Class165 var3 = this;
      if (this.field649 != null) {// 148
         var1.writeByte(this.field649.length);// 236

         int var2;
         for (int var10000 = var2 = 0; var10000 < var3.field649.length; var10000 = ++var2) {// 142
            Class128[] var5 = var3.field649[var2].method137();// 39
            var1.writeShort(var5.length);// 368

            int var4;
            for (int var6 = var4 = 0; var6 < var5.length; var6 = var4) {// 99
               var5[var4++].method3(var1);// 160
            }
         }
      }
   }// 550
}
