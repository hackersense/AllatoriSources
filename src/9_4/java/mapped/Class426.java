package mapped;

import java.util.Iterator;
import java.util.Vector;

// $VF: Compiled from yp
public class Class426 implements Class418 {
   // $VF: synthetic field
   public Class338 field1247;

   // $VF: synthetic method
   public Class426(Class338 var1) {
      this.field1247 = var1;// 7 335
   }// 507

   // $VF: synthetic method
   @Override
   public void method839(Class206 var1) {
      String var7;
      if ((var7 = Class580.method1927().method1804()) != null) {// 260 332
         Class206 var6;
         if ((var6 = this.field1247.method557(var7)) != null) {// 30 143
            Vector var3 = new Vector();// 20
            Iterator var4 = this.field1247.method553();// 239
            String var8 = var7 + "$";// 310

            while (var4.hasNext()) {// 498
               Class206 var5;
               if ((var5 = (Class206)var4.next()).method93().startsWith(var8)) {// 409 484
                  Class211 var9 = new Class211(var6.method46().method404(var5.method93()), 0, 0, 0);// 389
                  var3.add(var9);// 18
               }
            }

            var6.method265(// 530
               new Class162(
                  var6.method46().method106("InnerClasses"), var3.size() * 8 + 2, (Class211[])var3.toArray(new Class211[0]), var6.method46().method402()
               )
            );
         }
      }
   }// 338

   // $VF: synthetic method
   @Override
   public void method838() {
   }// 141
}
