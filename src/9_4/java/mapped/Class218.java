package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from nd
public final class Class218 implements Cloneable {
   // $VF: synthetic field
   public Class149 field798;
   // $VF: synthetic field
   public Class219[] field799;
   // $VF: synthetic field
   public Class219[] field800;
   // $VF: synthetic field
   public int field801;
   // $VF: synthetic field
   public int field802;
   // $VF: synthetic field
   public int field803;

   // $VF: synthetic method
   public void method89(int var1) {
      this.field802 = var1;// 422
   }// 464

   // $VF: synthetic method
   public Class218(int var1, int var2, Class219[] var3, int var4, Class219[] var5, Class149 var6) {
      this.field801 = var1;// 534
      this.field803 = var2;// 488
      this.field800 = var3;// 495
      this.field802 = var4;// 159
      this.field799 = var5;// 493
      this.field798 = var6;// 184 561
   }// 377

   // $VF: synthetic method
   public Class219[] method382() {
      return this.field799;// 285
   }

   // $VF: synthetic method
   public void method384(Class219[] var1) {
      this.field799 = var1;// 248
   }// 97

   // $VF: synthetic method
   public final Class149 method94() {
      return this.field798;// 307
   }

   // $VF: synthetic method
   public void method90(int var1) {
      this.field803 = var1;// 367
   }// 82

   // $VF: synthetic method
   public Class219[] method383() {
      return this.field800;// 242
   }

   // $VF: synthetic method
   public final void method3(DataOutputStream var1) {
      Class218 var2 = this;
      int var10000 = 0;
      var1.writeShort(this.field801);
      var1.writeShort(this.field803);// 179 321

      for (int var3 = 0; var10000 < var2.field803; var10000 = var3) {// 146
         var2.field800[var3++].method3(var1);// 567
      }

      var1.writeShort(var2.field802);// 33

      for (int var5 = var4 = 0; var5 < var2.field802; var5 = var4) {// 0
         var2.field799[var4++].method3(var1);// 240
      }
   }// 552

   // $VF: synthetic method
   public Class218 method387() {
      try {
         return (Class218)this.clone();// 336
      } catch (CloneNotSupportedException var1) {
         return null;// 57
      }
   }

   // $VF: synthetic method
   public void method87(Class463 var1) {
      var1.method1030(this);// 434
   }// 292

   // $VF: synthetic method
   public int method30() {
      return this.field801;// 63
   }

   // $VF: synthetic method
   public final void method96(Class149 var1) {
      this.field798 = var1;// 582
   }// 177

   // $VF: synthetic method
   public int method17() {
      return this.field802;// 115
   }

   // $VF: synthetic method
   public int method2() {
      return this.field803;// 450
   }

   // $VF: synthetic method
   public void method385(Class219[] var1) {
      this.field800 = var1;// 24
   }// 286

   // $VF: synthetic method
   public Class218(DataInputStream var1, Class149 var2) {
      Class218 var3 = this;
      this(var1.readShort(), var1.readShort(), null, -1, null, var2);
      this.field800 = new Class219[this.field803];// 78 123

      for (int var10000 = var4 = 0; var10000 < var3.field803; var10000 = var4) {// 418
         Class219[] var6 = var3.field800;// 533
         int var10001 = var4;
         Class219 var10002 = new Class219(var1, var2);
         var4++;
         var6[var10001] = var10002;
      }

      var3.field802 = var1.readShort();// 406
      var3.field799 = new Class219[var3.field802];// 1

      for (int var7 = var5 = 0; var7 < var3.field802; var7 = var5) {// 46
         Class219[] var8 = var3.field799;// 170
         int var9 = var5;
         Class219 var10 = new Class219(var1, var2);
         var5++;
         var8[var9] = var10;
      }
   }// 58

   // $VF: synthetic method
   public void method6(int var1) {
      this.field801 = var1;// 39
   }// 368
}
