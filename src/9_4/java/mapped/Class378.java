package mapped;

import java.util.Comparator;

// $VF: Compiled from fr
public class Class378 implements Comparator {
   // $VF: synthetic field
   public final Class424 field1179;
   // $VF: synthetic field
   public final int field1180;

   // $VF: synthetic method
   // $VF: bridge method
   public int compare(Object var1, Object var2) {
      return this.method717((Class208)var1, (Class208)var2);
   }

   // $VF: synthetic method
   public int method717(Class208 var1, Class208 var2) {
      int var5 = this.field1180;// 466
      Class580.method1932();
      return var5 == 100 ? var2.method190().compareTo(var1.method190()) : var1.method190().compareTo(var2.method190());// 68 467
   }

   // $VF: synthetic method
   public Class378(Class424 var1, int var2) {
      this.field1179 = var1;
      this.field1180 = var2;// 278
   }
}
