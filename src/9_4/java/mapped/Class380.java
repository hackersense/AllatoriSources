package mapped;

import java.util.Comparator;

// $VF: Compiled from fr
public class Class380 implements Comparator {
   // $VF: synthetic field
   public final Class424 field1182;
   // $VF: synthetic field
   public final int field1183;

   // $VF: synthetic method
   public int method718(Class207 var1, Class207 var2) {
      int var5 = this.field1183;// 488
      Class580.method1932();
      return var5 == 100 ? var2.method190().compareTo(var1.method190()) : var1.method190().compareTo(var2.method190());// 493 495
   }

   // $VF: synthetic method
   // $VF: bridge method
   public int compare(Object var1, Object var2) {
      return this.method718((Class207)var1, (Class207)var2);
   }

   // $VF: synthetic method
   public Class380(Class424 var1, int var2) {
      this.field1182 = var1;
      this.field1183 = var2;// 534
   }
}
