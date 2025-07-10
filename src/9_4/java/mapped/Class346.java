package mapped;

import java.util.Iterator;
import java.util.Vector;

// $VF: Compiled from ux
public class Class346 {
   // $VF: synthetic field
   public Vector field1006;
   // $VF: synthetic field
   public final Class580 field1007;
   // $VF: synthetic field
   public boolean field1008;

   // $VF: synthetic method
   public Class346(Class580 var1) {
      this.field1007 = var1;
      this.field1008 = false;// 1112 1642
      this.field1006 = new Vector();// 1148
   }

   // $VF: synthetic method
   public void method650(Class587 var1, String var2) {
      this.field1008 = true;
      String var4 = var2.replaceAll("\\.", "\\\\.").replaceAll("\\*", ".*");// 1043 1407 1604
      this.field1006.add(new Class442(this, var1, var4));// 1547
   }// 1377

   // $VF: synthetic method
   public boolean method651(Class338 var1, Class206 var2, String var3) {
      if (var1 != null && var2 != null && var3 != null) {// 1381
         if (this.field1006.size() == 0) {// 1051
            return false;
         } else {
            Iterator var6 = this.field1006.iterator();// 1270

            while (var6.hasNext()) {
               Class442 var5;
               if ((var5 = (Class442)var6.next()).field1295.field2356.method2094(var1, var2) && var3.matches(var5.field1293)) {// 1646
                  return true;// 1501
               }
            }

            return false;// 1013
         }
      } else {
         return false;
      }
   }

   // $VF: synthetic method
   public boolean method652() {
      return this.field1008;// 1102
   }
}
