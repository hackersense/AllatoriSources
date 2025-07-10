package mapped;

import java.io.DataInputStream;

// $VF: Compiled from mh
public final class Class208 extends Class195 {
   // $VF: synthetic field
   public static Class399 field772 = new Class406();

   // $VF: synthetic method
   public boolean equals(Object var1) {
      return field772.method748(this, var1);// 394
   }

   // $VF: synthetic method
   public Class208(Class208 var1) {
      super(var1);// 534
   }// 488

   // $VF: synthetic method
   public Class208(int var1, int var2, int var3, Class151[] var4, Class149 var5) {
      super(var1, var2, var3, var4, var5);// 552
   }// 603

   // $VF: synthetic method
   public final Class164 method369() {
      Class208 var1 = this;

      for (int var10000 = var2 = 0; var10000 < var1.field691; var10000 = ++var2) {// 232
         if (var1.field684[var2] instanceof Class164) {// 463
            return (Class164)var1.field684[var2];// 198
         }
      }

      return null;// 588
   }

   // $VF: synthetic method
   public static void method221(Class399 var0) {
      field772 = var0;// 601
   }// 193

   // $VF: synthetic method
   public final Class157 method370() {
      Class208 var1 = this;

      for (int var10000 = var2 = 0; var10000 < var1.field691; var10000 = ++var2) {// 142
         if (var1.field684[var2] instanceof Class157) {// 39
            return (Class157)var1.field684[var2];// 368
         }
      }

      return null;// 40
   }

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1018(this);// 555
   }// 73

   // $VF: synthetic method
   public Class208() {
   }// 170

   // $VF: synthetic method
   public int hashCode() {
      return field772.method749(this);// 382
   }

   // $VF: synthetic method
   public final Class163 method203() {
      Class164 var2;
      return (var2 = this.method369()) == null ? null : var2.method203();// 27 69 94 242
   }

   // $VF: synthetic method
   public Class208(DataInputStream var1, Class149 var2) {
      super(var1, var2);// 358
   }// 192

   // $VF: synthetic method
   public final Class160 method204() {
      Class164 var2;
      return (var2 = this.method369()) == null ? null : var2.method204();// 5 83 279 386
   }

   // $VF: synthetic method
   public Class138 method26() {
      return Class138.method150(this.method20());// 213
   }

   // $VF: synthetic method
   public static Class399 method224() {
      return field772;// 288
   }

   // $VF: synthetic method
   public final Class208 method371(Class149 var1) {
      return (Class208)this.method233(var1);// 72
   }

   // $VF: synthetic method
   public Class138[] method277() {
      return Class138.method146(this.method20());// 235
   }
}
