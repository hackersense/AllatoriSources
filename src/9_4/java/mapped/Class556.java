package mapped;

import java.util.Vector;

// $VF: Compiled from qz
public class Class556 {
   // $VF: synthetic field
   public Vector field1960 = new Vector();
   // $VF: synthetic field
   public int field1961;

   // $VF: synthetic method
   public int method1766(Class338 var1, Class206 var2) {
      return this.method1770(var1, var2, (Class203)null);// 252
   }

   // $VF: synthetic method
   public Class556(int var1) {
      this.field1961 = var1;// 7 335
   }// 507

   // $VF: synthetic method
   public int method1767(Class338 var1, Class206 var2, Class208 var3) {
      Class556 var5 = this;

      int var4;
      for (int var10000 = var4 = 0; var10000 < var5.field1960.size(); var10000 = ++var4) {// 147
         Class587 var6;
         if ((var6 = (Class587)var5.field1960.get(var4)).field2356.method2094(var1, var2)) {// 295 338
            if (var3 == null) {// 273
               return var6.field2357;
            }

            if (var6.field2356.method2087(var3)) {// 161
               return var6.field2357;
            }
         }
      }

      return var5.field1961;// 226
   }

   // $VF: synthetic method
   public void method1768(Class587 var1) {
      this.field1960.add(var1);// 332
   }// 260

   // $VF: synthetic method
   public int method1769(Class338 var1, Class206 var2, Class207 var3) {
      Class556 var5 = this;

      int var4;
      for (int var10000 = var4 = 0; var10000 < var5.field1960.size(); var10000 = ++var4) {// 533
         Class587 var6;
         if ((var6 = (Class587)var5.field1960.get(var4)).field2356.method2094(var1, var2)) {// 185 406
            if (var3 == null) {// 1
               return var6.field2357;
            }

            if (var6.field2356.method2083(var1, var3)) {// 46
               return var6.field2357;
            }
         }
      }

      return var5.field1961;// 58
   }

   // $VF: synthetic method
   public int method1770(Class338 var1, Class206 var2, Class203 var3) {
      Class556 var5 = this;

      int var4;
      for (int var10000 = var4 = 0; var10000 < var5.field1960.size(); var10000 = ++var4) {// 310
         Class587 var6;
         if ((var6 = (Class587)var5.field1960.get(var4)).field2356.method2094(var1, var2)) {// 484 498
            if (var3 == null) {// 409
               return var6.field2357;
            }

            if (var6.field2356.method2093(var3)) {// 389
               return var6.field2357;
            }
         }
      }

      return var5.field1961;// 93
   }

   // $VF: synthetic method
   public int method1771() {
      return this.field1960.size();// 132
   }
}
