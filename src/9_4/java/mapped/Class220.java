package mapped;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

// $VF: Compiled from uh
public class Class220 implements Serializable {
   // $VF: synthetic field
   public Map field807 = new HashMap();

   // $VF: synthetic method
   public Class205[] method351() {
      Collection var1;
      Class205[] var3 = new Class205[(var1 = this.field807.values()).size()];// 58 190
      var1.toArray(var3);// 315
      return var3;// 465
   }

   // $VF: synthetic method
   public boolean method101() {
      return this.field807.isEmpty();// 406
   }

   // $VF: synthetic method
   public String[] method130() {
      return (String[])this.field807.keySet().toArray(new String[this.field807.keySet().size()]);// 495
   }

   // $VF: synthetic method
   public void method389(Class205 var1) {
      this.field807.remove(var1.method93());// 123
   }// 78

   // $VF: synthetic method
   public boolean method352(Class205 var1) {
      boolean var3 = false;// 530
      if (!this.field807.containsKey(var1.method93())) {// 491
         var3 = true;// 147
         this.field807.put(var1.method93(), var1);// 295
      }

      return var3;// 273
   }
}
