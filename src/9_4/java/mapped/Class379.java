package mapped;

import java.util.Comparator;

// $VF: Compiled from wq
public class Class379 implements Comparator {
   // $VF: synthetic field
   public final Class393 field1181;

   // $VF: synthetic method
   public int compare(Object var1, Object var2) {
      boolean var3 = ((Class206)var1).method101();// 576
      boolean var4 = ((Class206)var2).method101();// 103
      if (var3 == var4) {// 548
         return 0;
      } else {
         return var3 ? -1 : 1;// 545 570
      }
   }

   // $VF: synthetic method
   public Class379(Class393 var1) {
      this.field1181 = var1;// 210
   }
}
