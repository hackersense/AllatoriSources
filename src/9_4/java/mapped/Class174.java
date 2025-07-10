package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from ri
public class Class174 extends Class151 {
   // $VF: synthetic field
   public int field658;
   // $VF: synthetic field
   public Class124[] field659;

   // $VF: synthetic method
   public final Class124[] method191() {
      return this.field659;// 0
   }

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      Class174 var2 = this;// 272
      int var10000 = 0;
      super.method3(var1);
      var1.writeShort(this.field658);// 321

      for (int var3 = 0; var10000 < var2.field658; var10000 = var3) {// 179
         var2.field659[var3++].method3(var1);// 146
      }
   }// 567

   // $VF: synthetic method
   @Override
   public Class151 method181(Class149 var1) {
      Class174 var3 = this;
      Class174 var2;
      (var2 = (Class174)this.clone()).field659 = new Class124[this.field658];// 142 368

      for (int var10000 = var4 = 0; var10000 < var3.field658; var10000 = var4) {// 99
         Class124[] var5 = var2.field659;// 160
         int var10001 = var4;
         Class124 var10002 = var3.field659[var4].method95();
         var4++;
         var5[var10001] = var10002;
      }

      var2.field616 = var1;// 63
      return var2;// 541
   }

   // $VF: synthetic method
   public final void method192(Class124[] var1) {
      this.field659 = var1;
      this.field658 = var1 == null ? 0 : var1.length;// 579 589
   }// 73

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1002(this);// 144
   }// 461

   // $VF: synthetic method
   public final Class124 method193(int var1) {
      Class174 var2 = this;

      for (int var10000 = var3 = 0; var10000 < var2.field658; var10000 = ++var3) {// 603
         if (var2.field659[var3].method30() == var1) {// 278
            return var2.field659[var3];// 466
         }
      }

      return null;// 485
   }

   // $VF: synthetic method
   public Class174(Class174 var1) {
      this(var1.method17(), var1.method2(), var1.method191(), var1.method94());// 533
   }// 406

   // $VF: synthetic method
   public final int method30() {
      return this.field658;// 456
   }

   // $VF: synthetic method
   public Class174(int var1, int var2, Class124[] var3, Class149 var4) {
      super((byte)17, var1, var2, var4);
      this.method192(var3);// 190 315
   }// 465

   // $VF: synthetic method
   public Class174(int var1, int var2, DataInputStream var3, Class149 var4) {
      Class174 var7 = this;
      this(var1, var2, (Class124[])null, var4);// 534
      this.field658 = var3.readUnsignedShort();// 495
      this.field659 = new Class124[this.field658];// 159

      for (int var8 = var6 = 0; var8 < var7.field658; var8 = var6) {// 561
         Class124[] var9 = var7.field659;// 377
         int var10001 = var6;
         Class124 var10002 = new Class124(var3, var4);
         var6++;
         var9[var10001] = var10002;
      }
   }// 604
}
