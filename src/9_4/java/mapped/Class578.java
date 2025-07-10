package mapped;

import java.util.List;

// $VF: Compiled from ux
public class Class578 {
   // $VF: synthetic field
   public Class556 field2308;
   // $VF: synthetic field
   public final Class580 field2309;
   // $VF: synthetic field
   public static final int field2310 = 0;
   // $VF: synthetic field
   public static final int field2311 = 1;
   // $VF: synthetic field
   public static final int field2312 = 2;

   // $VF: synthetic method
   public void method1916(Class587 var1) {
      this.field2308.method1768(var1);// 1119
   }// 1263

   // $VF: synthetic method
   public int method1917(Class338 var1, Class206 var2, Class203 var3) {
      if (!Class580.method1932().method1858() && var3.method20().startsWith("Allatori")) {// 1192
         return 1;
      } else {
         boolean var4 = true;// 1254
         Class533[] var10000 = var3.method264();// 1347

         while (true) {
            Class533[] var5 = var10000;
            int var6 = var5.length;

            int var7;
            for (int var11 = var7 = 0; var11 < var6; var11 = ++var7) {// 1368
               Class533 var9 = var5[var7];
               List var10;
               if ("Lcom/allatori/annotations/ExtensiveFlowObfuscation;".equals(var9.method1589())// 1544
                  && (var10 = var9.method1583()) != null// 1464 1480
                  && var10.size() > 0
                  && ((Class548)var10.get(0)).method1716() != null) {
                  if ("maximum".equals(((Class548)var10.get(0)).method1716().method1255())) {// 1205
                     return 2;// 1242
                  }

                  if ("normal".equals(((Class548)var10.get(0)).method1716().method1255())) {// 1615
                     return 1;// 1648
                  }

                  if ("disable".equals(((Class548)var10.get(0)).method1716().method1255())) {// 1573
                     return 0;// 1445
                  }
               }
            }

            if (!var4) {// 1607
               if (Class580.method1932().method1852() && Class580.method1932().method1865()) {// 1403
                  return 0;
               }

               return this.field2308.method1770(var1, var2, var3);// 1082
            }

            var4 = false;// 1447
            var10000 = var2.method264();// 1431
         }
      }
   }

   // $VF: synthetic method
   public Class578(Class580 var1) {
      this.field2309 = var1;// 1083
      this.field2308 = new Class556(1);// 1461
   }
}
