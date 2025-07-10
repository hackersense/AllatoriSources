package mapped;

import java.io.Serializable;
import java.util.LinkedList;

// $VF: Compiled from ij
public class Class259 implements Serializable {
   // $VF: synthetic field
   public LinkedList field909 = new LinkedList();

   // $VF: synthetic method
   public void method389(Class205 var1) {
      this.field909.addLast(var1);// 18
   }// 513

   // $VF: synthetic method
   public Class205 method136() {
      return (Class205)this.field909.removeFirst();// 491
   }

   // $VF: synthetic method
   public boolean method101() {
      return this.field909.isEmpty();// 161
   }
}
