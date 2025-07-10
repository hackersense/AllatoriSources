package mapped;

import java.io.Serializable;
import java.util.Stack;

// $VF: Compiled from ll
public class Class255 implements Serializable {
   // $VF: synthetic field
   public Stack field858 = new Stack();

   // $VF: synthetic method
   public Class205 method333() {
      return (Class205)this.field858.peek();// 161
   }

   // $VF: synthetic method
   public Class205 method136() {
      return (Class205)this.field858.pop();// 491
   }

   // $VF: synthetic method
   public boolean method101() {
      return this.field858.empty();// 78
   }

   // $VF: synthetic method
   public void method389(Class205 var1) {
      this.field858.push(var1);// 18
   }// 513
}
