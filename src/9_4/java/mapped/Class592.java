package mapped;

import java.util.Iterator;
import java.util.Vector;

// $VF: Compiled from ux
public class Class592 {
   // $VF: synthetic field
   public Vector field2377;
   // $VF: synthetic field
   public boolean field2378;
   // $VF: synthetic field
   public final Class580 field2379;

   // $VF: synthetic method
   public void method2023(Class587 var1, String var2, String var3) {
      this.field2378 = true;
      var2 = var2.replaceAll("\\.", "\\\\.").replaceAll("\\*", ".*");// 1310 1411 1668
      String var5 = var3.replaceAll("\\.", "\\\\.").replaceAll("\\*", ".*");// 1275 1609
      this.field2377.add(new Class489(this, var1, var2, var5));// 1569
   }// 1361

   // $VF: synthetic method
   public boolean method2024() {
      return this.field2378;// 1635
   }

   // $VF: synthetic method
   public boolean method2025(Class338 var1, Class206 var2, Class203 var3, String var4, String var5) {
      String var8 = var5;
      if (var1 != null && var4 != null && var5 != null) {// 1678
         if (var5.startsWith(Class428.field1259)) {// 1022
            return false;
         } else if ("<init>".equals(var5)) {// 1260
            return false;
         } else if ("<clinit>".equals(var5)) {// 1256
            return false;
         } else if (this.field2377.size() == 0) {// 1189
            return false;
         } else {
            Iterator var6 = this.field2377.iterator();// 1398

            while (var6.hasNext()) {
               Class489 var7;
               if ((var7 = (Class489)var6.next()).field1631.field2356.method2094(var1, var2)// 1355
                  && var7.field1631.field2356.method2093(var3)
                  && var4.matches(var7.field1628)// 1184
                  && var8.matches(var7.field1629)) {
                  return true;// 1122
               }
            }

            return false;// 1373
         }
      } else {
         return false;
      }
   }

   // $VF: synthetic method
   public Class592(Class580 var1) {
      this.field2379 = var1;
      this.field2378 = false;// 1068 1449
      this.field2377 = new Vector();// 1380
   }
}
