package mapped;

import java.util.ArrayList;
import java.util.List;

// $VF: Compiled from ab
public abstract class Class131 {
   // $VF: synthetic field
   public Class581 field561;
   // $VF: synthetic field
   public List field562 = new ArrayList();

   // $VF: synthetic method
   public Class581 method129() {
      if (this.field561 == null) {// 561
         this.field561 = this.method116();// 377
      }

      return this.field561;// 22
   }

   // $VF: synthetic method
   public abstract Class581 method116();

   // $VF: synthetic method
   public String[] method130() {
      this.method129();// 555
      return (String[])this.field562.toArray(new String[this.field562.size()]);// 73
   }

   // $VF: synthetic method
   public void method131(String var1) {
      this.field562.add(var1);// 552
   }// 603

   // $VF: synthetic method
   public Class131() {
      this.field561 = null;// 185 226
   }
}
