package mapped;

import java.util.Arrays;

// $VF: Compiled from pb
public final class Class492 {
   // $VF: synthetic field
   public final Object[] field1638;
   // $VF: synthetic field
   public final String field1639;
   // $VF: synthetic field
   public final String field1640;
   // $VF: synthetic field
   public final Class563 field1641;

   // $VF: synthetic method
   public String method1316() {
      return this.field1640;// 246
   }

   // $VF: synthetic method
   public int hashCode() {
      return this.field1639.hashCode()// 45
         ^ Integer.rotateLeft(this.field1640.hashCode(), 8)// 23
         ^ Integer.rotateLeft(this.field1641.hashCode(), 16)// 440
         ^ Integer.rotateLeft(Arrays.hashCode(this.field1638), 24);// 248
   }

   // $VF: synthetic method
   public int method1317() {
      char var2;
      return (var2 = this.field1640.charAt(0)) != 74 && var2 != 68 ? 1 : 2;// 386 470
   }

   // $VF: synthetic method
   public int method1318() {
      return this.field1638.length;// 399
   }

   // $VF: synthetic method
   public static String method1319(String var0, String var1, String var2, String var3) {
      return var0 + " : " + var1 + " " + var2 + " " + var3;
   }

   // $VF: synthetic method
   public Object[] method1320() {
      return this.field1638;// 550
   }

   // $VF: synthetic method
   public Class563 method1321() {
      return this.field1641;// 391
   }

   // $VF: synthetic method
   public boolean equals(Object var1) {
      if (var1 == this) {// 600
         return true;// 108
      } else if (!(var1 instanceof Class492)) {// 242
         return false;// 94
      } else {
         Class492 var3 = (Class492)var1;// 69
         return this.field1639.equals(var3.field1639)// 116
            && this.field1640.equals(var3.field1640)// 422
            && this.field1641.equals(var3.field1641)// 464
            && Arrays.equals(this.field1638, var3.field1638);// 25
      }
   }

   // $VF: synthetic method
   public String method1322() {
      return this.field1639;// 272
   }

   // $VF: synthetic method
   public Object method1323(int var1) {
      return this.field1638[var1];// 455
   }

   // $VF: synthetic method
   public Class492(String var1, String var2, Class563 var3, Object... var4) {
      this.field1639 = var1;// 159
      this.field1640 = var2;// 493
      this.field1641 = var3;// 561
      this.field1638 = var4;// 377 495
   }// 604
}
