package mapped;

import java.util.Iterator;
import java.util.Vector;

// $VF: Compiled from ux
public class Class598 {
   // $VF: synthetic field
   public Vector field2389;
   // $VF: synthetic field
   public final Class580 field2390;
   // $VF: synthetic field
   public boolean field2391;

   // $VF: synthetic method
   public Class598(Class580 var1) {
      this.field2390 = var1;
      this.field2389 = new Vector();// 986
      this.field2391 = false;// 1178 1224
   }

   // $VF: synthetic method
   public void method2042(Class601 var1) {
      this.field2389.add(var1);// 1521
      this.field2391 = true;// 1128
   }// 1454

   // $VF: synthetic method
   public boolean method2043(Class338 var1, Class206 var2) {
      if (!this.field2391) {// 1617
         return false;
      } else {
         Iterator var5 = this.field2389.iterator();// 1319

         while (var5.hasNext()) {
            Class601 var4;
            if ((var4 = (Class601)var5.next()).method2094(var1, var2)) {// 1223
               if (!var4.method2088()) {
                  return true;
               }

               return false;
            }
         }

         return false;// 1237
      }
   }
}
