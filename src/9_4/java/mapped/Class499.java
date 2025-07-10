package mapped;

import java.util.Hashtable;
import java.util.Set;

// $VF: Compiled from py
public class Class499 {
   // $VF: synthetic field
   public Hashtable field1653 = new Hashtable();

   // $VF: synthetic method
   public void method1337(String var1) {
      this.field1653.remove(var1);// 260
   }// 30

   // $VF: synthetic method
   public boolean method1338(String var1) {
      return this.field1653.containsKey(var1);// 507
   }

   // $VF: synthetic method
   public Set method1339() {
      return this.field1653.keySet();// 20
   }

   // $VF: synthetic method
   public void method1340(String var1, String var2) {
      this.field1653.put(var1, var2);// 265
   }// 446

   // $VF: synthetic method
   public String method1341(String var1) {
      return (String)this.field1653.get(var1);// 52
   }

   // $VF: synthetic method
   public int method1342() {
      return this.field1653.size();// 498
   }
}
