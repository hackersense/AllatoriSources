package mapped;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// $VF: Compiled from yc
public class Class496 {
   // $VF: synthetic field
   public Map field1646;

   // $VF: synthetic method
   public Class594[] method1329(Class246 var1) {
      Set var4;
      if ((var4 = (Set)this.field1646.get(var1)) == null) {// 159 495
         return new Class594[0];// 493
      } else {
         Class594[] var2 = new Class594[var4.size()];// 377
         return (Class594[])var4.toArray(var2);// 604
      }
   }

   // $VF: synthetic method
   public Class496(Class203 var1) {
      Class496 var8 = this;
      super();// 161
      this.field1646 = new HashMap();// 141
      Class202[] var7 = var1.method282();// 580

      int var2;
      for (int var9 = var2 = 0; var9 < var7.length; var9 = ++var2) {// 226
         Class594 var4 = new Class594(var7[var2].method138(), var7[var2].method274());// 123

         Class246 var3;
         for (Class246 var10 = var3 = var7[var2].method32(); var10 != var7[var2].method37().method32(); var10 = var3) {
            Object var5;
            if ((var5 = (Set)var8.field1646.get(var3)) == null) {// 185 533
               var5 = new HashSet();// 406
               var8.field1646.put(var3, var5);// 1
            }

            var5.add(var4);// 170
            var3 = var3.method32();// 78
         }
      }
   }// 190
}
