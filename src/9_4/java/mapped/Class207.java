package mapped;

import java.io.DataInputStream;

// $VF: Compiled from jn
public final class Class207 extends Class195 {
   // $VF: synthetic field
   public static Class399 field771 = new Class400();

   // $VF: synthetic method
   public Class207(Class207 var1) {
      super(var1);// 46
   }// 170

   // $VF: synthetic method
   public boolean equals(Object var1) {
      return field771.method748(this, var1);// 220
   }

   // $VF: synthetic method
   public static Class399 method224() {
      return field771;// 25
   }

   // $VF: synthetic method
   public Class207(int var1, int var2, int var3, Class151[] var4, Class149 var5) {
      super(var1, var2, var3, var4, var5);// 574
   }// 272

   // $VF: synthetic method
   public static void method221(Class399 var0) {
      field771 = var0;// 248
   }// 97

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1009(this);// 603
   }// 278

   // $VF: synthetic method
   public Class138 method26() {
      return Class138.method150(this.method20());// 27
   }

   // $VF: synthetic method
   public Class207(DataInputStream var1, Class149 var2) {
      super(var1, var2);// 488
   }// 495

   // $VF: synthetic method
   public final Class161 method367() {
      Class207 var1 = this;

      for (int var10000 = var2 = 0; var10000 < var1.field691; var10000 = ++var2) {// 330
         if (var1.field684[var2].method142() == 1) {// 589
            return (Class161)var1.field684[var2];// 579
         }
      }

      return null;// 415
   }

   // $VF: synthetic method
   public int hashCode() {
      return field771.method749(this);// 50
   }

   // $VF: synthetic method
   public final Class207 method368(Class149 var1) {
      return (Class207)this.method233(var1);// 386
   }
}
