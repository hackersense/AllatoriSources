package mapped;

import java.util.ArrayList;
import java.util.List;

// $VF: Compiled from uc
public class Class498 {
   // $VF: synthetic field
   public List field1652 = new ArrayList();

   // $VF: synthetic method
   public boolean method1335(int var1) {
      Integer[] var2 = new Integer[this.field1652.size()];// 295
      this.field1652.toArray(var2);// 338
      int var4 = 0;

      for (int var10000 = var4; var10000 < var2.length; var10000 = ++var4) {// 273
         if (var1 == var2[var4]) {// 161
            return true;// 141
         }
      }

      return false;// 123
   }

   // $VF: synthetic method
   public void method1336(int var1) {
      this.field1652.add(new Integer(var1));// 151
   }// 530
}
