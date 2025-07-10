package mapped;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// $VF: Compiled from fi
/** @deprecated */
public class Class222 implements Serializable {
   // $VF: synthetic field
   public List field820 = new ArrayList();

   // $VF: synthetic method
   public Class205 method416(int var1) {
      return (Class205)this.field820.get(var1);// 338
   }

   // $VF: synthetic method
   public void method6(int var1) {
      this.field820.remove(var1);// 226
   }// 123

   // $VF: synthetic method
   public void method389(Class205 var1) {
      this.field820.add(var1);// 151
   }// 530

   // $VF: synthetic method
   public Class205[] method351() {
      Class205[] var2 = new Class205[this.field820.size()];// 185
      this.field820.toArray(var2);// 406
      return var2;// 1
   }
}
