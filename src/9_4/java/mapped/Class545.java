package mapped;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

// $VF: Compiled from ml
public class Class545 {
   // $VF: synthetic field
   public static Map field1874 = new HashMap();
   // $VF: synthetic field
   public static List field1875 = new Vector();

   // $VF: synthetic method
   public static void method1686(Class487 var0) {
      field1875.remove(var0);// 586
   }// 399

   // $VF: synthetic method
   public static void method1687(String var0) {
      String var1 = var0;

      for (Iterator var10000 = var2 = field1875.iterator(); var10000.hasNext(); var10000 = var2) {// 144 461
         ((Class487)var2.next()).method1310(var1);// 192 358
      }
   }// 272

   // $VF: synthetic method
   public static Class576[] method1688() {
      Class576[] var0 = new Class576[field1874.values().size()];// 603
      return (Class576[])field1874.values().toArray(var0);// 278
   }

   // $VF: synthetic method
   public static Class576 method1689(String var0) {
      Class576 var2;
      if ((var2 = (Class576)field1874.get(var0)) == null) {// 190 315
         var2 = new Class576(var0);// 465
         field1874.put(var0, var2);// 132
         method1687(var0);// 184
      }

      return var2;// 488
   }

   // $VF: synthetic method
   public static void method1690(Class487 var0) {
      field1875.add(var0);// 589
   }// 579
}
