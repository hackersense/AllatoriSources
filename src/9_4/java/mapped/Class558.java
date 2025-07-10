package mapped;

import java.util.Hashtable;
import java.util.Stack;

// $VF: Compiled from wj
public final class Class558 {
   // $VF: synthetic field
   public Hashtable field1963;
   // $VF: synthetic field
   public Stack field1964 = new Stack();

   // $VF: synthetic method
   public final Class506 method1774(Class246 var1, int var2) {
      Class506 var4 = new Class506(var1, var2);// 932
      this.field1963.put(var1, var4);// 961
      return var4;// 642
   }

   // $VF: synthetic method
   public Class558() {
      this.field1963 = new Hashtable();// 664 944
   }

   // $VF: synthetic method
   public Class506 method1775() {
      return !this.field1964.empty() ? (Class506)this.field1964.pop() : null;// 668 692 850
   }

   // $VF: synthetic method
   public void method1776(Class246 var1, int var2) {
      if (!this.method1777(var1)) {// 708
         this.field1964.push(this.method1774(var1, var2));// 749
      }
   }// 634 731

   // $VF: synthetic method
   public final boolean method1777(Class246 var1) {
      return this.field1963.get(var1) != null;// 804
   }
}
